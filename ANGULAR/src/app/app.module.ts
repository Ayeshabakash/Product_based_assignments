import { Component, NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule, Routes } from '@angular/router';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponentComponent } from './home-component/home-component.component';
import { AboutComponentComponent } from './about-component/about-component.component';
import { ContactComponentComponent } from './contact-component/contact-component.component';
// Import missing components here, if any

const ROUTES: Routes = [
  { path: 'home', component: HomeComponentComponent },
  { path: 'contact', component: ContactComponentComponent },
  { path: 'about', component: AboutComponentComponent },
];

@NgModule({
  declarations: [
    AppComponent,
    HomeComponentComponent,
    AboutComponentComponent,
    ContactComponentComponent,
  
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    RouterModule.forRoot(ROUTES),
  ],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}

