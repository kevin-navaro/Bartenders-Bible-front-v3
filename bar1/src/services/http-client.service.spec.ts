import { TestBed } from '@angular/core/testing';

import { HttpClientService } from './http-client.service';

describe('HttpServiceService', () => {
  let service: HttpClientService<any>;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(HttpClientService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
