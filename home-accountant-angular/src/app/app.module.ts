import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import {FormsModule} from "@angular/forms";
import {MavenService} from "./app.service";
/*import {MavenModule} from "./maven/maven.module";*/



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
