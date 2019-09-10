import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { TestComponent } from './test-component/test-component.component';

@NgModule({
  declarations: [
    AppComponent,
    TestComponent
  ],
  imports: [
    BrowserModule,
    //TODO: Do something here
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
