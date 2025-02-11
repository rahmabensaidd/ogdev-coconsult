import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {AppComponent} from "./app.component";
import {AllTemplateBackComponent} from "./BackOffice/all-template-back/all-template-back.component";
import {AdmindashboardComponent} from "./BackOffice/admindashboard/admindashboard.component";
import {AllTemplatefrontComponent} from "./FrontOffice/all-templatefront/all-templatefront.component";
import {LoadingCompComponent} from "./FrontOffice/loading-comp/loading-comp.component";

const routes: Routes = [


  {path:"admin",component:AllTemplateBackComponent,
    children: [
      { path: '', component: AdmindashboardComponent }]},
  {path:"",component:AllTemplatefrontComponent,
    children: [
      {path:"",component: LoadingCompComponent}]}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
