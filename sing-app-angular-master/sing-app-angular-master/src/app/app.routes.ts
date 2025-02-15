import { Routes } from '@angular/router';
import { ErrorComponent } from './pages/error/error.component';
import {AppGuard} from './app.guard';

import {AllTemplatefrontComponent} from './FrontOffice/all-templatefront/all-templatefront.component';
import {LoadingCompComponent} from './FrontOffice/loading-comp/loading-comp.component';
export const ROUTES: Routes = [
  {
    path: 'front',
    component: AllTemplatefrontComponent,
    children: [
      { path: '', component: LoadingCompComponent }
    ]
  },
  {
   path: '', redirectTo: 'app', pathMatch: 'full'
  },
  {
    path: 'app', canActivate: [AppGuard],   loadChildren: () => import('./layout/layout.module').then(m => m.LayoutModule)
  },
  {
    path: 'login', loadChildren: () => import('./pages/login/login.module').then(m => m.LoginModule)
  },
  {
    path: 'register', loadChildren: () => import('./pages/register/register.module').then(m => m.RegisterModule)
  },
  {
    path: 'error', component: ErrorComponent
  },
  {
    path: '**',    component: ErrorComponent
  }
];
