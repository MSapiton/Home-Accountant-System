import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import {FormsModule} from "@angular/forms";
import {MavenService} from "./app.service";


@NgModule({

  declarations: [
   AppComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
  ],
  providers: [
    MavenService

  ],
  bootstrap: [
    AppComponent
  ],

})
export class AppModule {

}
