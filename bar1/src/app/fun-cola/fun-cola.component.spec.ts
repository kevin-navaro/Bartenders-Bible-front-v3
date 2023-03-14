import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FunColaComponent } from './fun-cola.component';

describe('FunColaComponent', () => {
  let component: FunColaComponent;
  let fixture: ComponentFixture<FunColaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FunColaComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FunColaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
