import { KeycloakService } from 'keycloak-angular';
import { environment } from '../environments/environment';

export function initializer(keycloak: KeycloakService): () => Promise<any> {
  return (): Promise<any> => {
    return new Promise(async (resolve, reject) => {
      try {
        await keycloak.init({
          config: {
            url: environment.keycloak.issuer,
            realm: environment.keycloak.realm,
            clientId: environment.keycloak.clientId,
          },
          // If set to false you cannot get any information about the user example the username
          // If you use keycloakService.getUsername() you get this error
          // User not logged in or user profile was not loaded.
          loadUserProfileAtStartUp: true,
          initOptions: {
            // This is an action we specified on keycloak load
            // We have two options : 'login-required' | 'check-sso'
            // If is set to 'login-required' this means your browser will do a full redirect to keycloak
            // If is set to 'check-sso' instead this action will be performed in a hidden iframe
            // Then you will need to add the silentCheckSsoRedirectUri and create a html file
            /*
            <html>
              <body>
                <script>
                  parent.postMessage(location.href, location.origin);
                </script>
              </body>
            </html>
            */
            onLoad: 'login-required',
            checkLoginIframe: true,
            // silentCheckSsoRedirectUri: window.location.origin + '/assets/silent-check-sso.html',
          },
          // By default the keycloak-angular library add Authorization: Bearer TOKEN to all http request
          // Then to exclude a list of URLs that should not have the authorization header we need to add
          bearerExcludedUrls: ['/assets'],
        });

        resolve(resolve);
      } catch (error) {
        reject(error);
      }
    });
  };
}
