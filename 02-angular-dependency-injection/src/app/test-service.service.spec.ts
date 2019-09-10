import { TestBed, async } from '@angular/core/testing';

import { TestService } from './test-service.service';

describe('TestService', () => {
  let service: TestService;
  
  beforeEach(() => { TestBed.configureTestingModule({})
    service = TestBed.get(TestService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
