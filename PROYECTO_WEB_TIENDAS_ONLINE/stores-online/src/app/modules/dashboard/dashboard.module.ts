import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { DashboardRoutingModule } from './dashboard-routing.module';
import { RouterModule, Routes } from '@angular/router';
import { DashboardComponent } from '../../components/dashboard/dashboard.component';
import { MatToolbarModule } from '@angular/material/toolbar';
import {MatSidenavModule} from '@angular/material/sidenav';
import {MatIconModule} from '@angular/material/icon';
import {MatExpansionModule} from '@angular/material/expansion';


const routes : Routes = [
  {
    path:'',
    component: DashboardComponent
  }
]

@NgModule({
  declarations: [
    DashboardComponent
  ],
  imports: [
    MatExpansionModule,
    MatIconModule,
    MatSidenavModule,
    MatToolbarModule,
    CommonModule,
    DashboardRoutingModule,
    RouterModule.forChild(routes)
  ]
})
export class DashboardModule { }
