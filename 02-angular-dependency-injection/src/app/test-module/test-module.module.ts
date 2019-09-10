import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { TestComponent } from '../test-component/test-component.component';
import { TestService } from '../test-service.service';

@NgModule({
  declarations: [TestComponent], 
  providers: [{provide: TestService, useClass: TestService}],
  imports: [
    CommonModule
  ],
  exports: [TestComponent]
})
export class TestModule { }
