import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CubaLibreComponent } from './cuba-libre.component';

describe('CubaLibreComponent', () => {
  let component: CubaLibreComponent;
  let fixture: ComponentFixture<CubaLibreComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CubaLibreComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CubaLibreComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
