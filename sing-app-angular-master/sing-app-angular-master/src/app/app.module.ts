import {APP_INITIALIZER, NgModule} from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { RouterModule, PreloadAllModules } from '@angular/router';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {ToastrModule} from 'ngx-toastr';

import { ROUTES } from './app.routes';
import { AppComponent } from './app.component';
import { AppConfig } from './app.config';
import { ErrorComponent } from './pages/error/error.component';
import {AppInterceptor} from './app.interceptor';
import {LoginService} from './pages/login/login.service';
import {AppGuard} from './app.guard';
import { AllTemplatefrontComponent } from './FrontOffice/all-templatefront/all-templatefront.component';
import { FooterFrontComponent } from './FrontOffice/footer-front/footer-front.component';
import { HeaderFrontComponent } from './FrontOffice/header-front/header-front.component';
import { LoadingCompComponent } from './FrontOffice/loading-comp/loading-comp.component';
import {KeycloakAngularModule , KeycloakService} from 'keycloak-angular' ;
import {initializer} from '../utils/app-init';

const APP_PROVIDERS = [
  AppConfig,
  LoginService,
  AppGuard,
  {
    provide: APP_INITIALIZER,
    useFactory: initializer,
    deps: [KeycloakService],
    multi: true
  },
  {
    provide: HTTP_INTERCEPTORS,
    useClass: AppInterceptor,
    multi: true
  }
];

@NgModule({
  bootstrap: [ AppComponent ],
  declarations: [
    AppComponent,
    ErrorComponent,
    AllTemplatefrontComponent,
    FooterFrontComponent,
    HeaderFrontComponent,
    LoadingCompComponent
  ],
  imports: [
    BrowserModule,
    RouterModule,
    BrowserAnimationsModule,
    FormsModule,
    HttpClientModule,
    ToastrModule.forRoot(),
    RouterModule.forRoot(ROUTES, {
    useHash: true,
    preloadingStrategy: PreloadAllModules,
    relativeLinkResolution: 'legacy' }),
      KeycloakAngularModule
  ],
  providers: [
    APP_PROVIDERS,
    {
      provide: HTTP_INTERCEPTORS, useClass: AppInterceptor, multi: true
    }

  ]
})
export class AppModule {}
