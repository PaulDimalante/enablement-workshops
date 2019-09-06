import { Component, OnInit } from '@angular/core';
import { TestService } from '../test-service.service';

@Component({
  selector: 'app-test-component',
  templateUrl: './test-component.component.html',
  styleUrls: ['./test-component.component.css']
})
export class TestComponent implements OnInit {

  constructor(private testService: TestService) { }

  ngOnInit() {
    this.testService.doSomething();
  }

}
