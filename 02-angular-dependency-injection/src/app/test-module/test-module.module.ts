import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { TestComponent } from '../test-component/test-component.component';

@NgModule({
  declarations: [], //TODO: Do something here
  imports: [
    CommonModule
  ],
  exports: [TestComponent]
})
export class TestModule { }
