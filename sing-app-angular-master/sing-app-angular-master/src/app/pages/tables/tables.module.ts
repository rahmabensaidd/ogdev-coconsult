import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { AlertModule, TooltipModule } from 'ngx-bootstrap';
import { ButtonsModule, BsDropdownModule, PaginationModule  } from 'ngx-bootstrap';
import { NgxDatatableModule } from '@swimlane/ngx-datatable';
import { AgGridModule } from 'ag-grid-angular';
import { WidgetModule } from '../../layout/widget/widget.module';
import { UtilsModule } from '../../layout/utils/utils.module';
import { JqSparklineModule } from '../../components/sparkline/sparkline.module';
import { TablesBasicComponent } from './basic/tables-basic.component';
import { TablesDynamicComponent } from './dynamic/tables-dynamic.component';
import { SearchPipe } from './dynamic/pipes/search-pipe';

export const routes: Routes = [
  {path: '', redirectTo: 'basic', pathMatch: 'full'},
  {path: 'basic', component: TablesBasicComponent},
  {path: 'dynamic', component: TablesDynamicComponent},
];

@NgModule({
  declarations: [
    // Components / Directives/ Pipes
    TablesBasicComponent,
    TablesDynamicComponent,
    SearchPipe
  ],
  imports: [
    CommonModule,
    JqSparklineModule,
    FormsModule,
    AlertModule.forRoot(),
    TooltipModule.forRoot(),
    ButtonsModule.forRoot(),
    BsDropdownModule.forRoot(),
    PaginationModule.forRoot(),
    WidgetModule,
    UtilsModule,
    AgGridModule,
    NgxDatatableModule,
    RouterModule.forChild(routes)
  ],
  schemas:  [ CUSTOM_ELEMENTS_SCHEMA ]
})
export class TablesModule {
  static routes = routes;
}
