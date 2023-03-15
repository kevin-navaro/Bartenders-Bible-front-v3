import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GinTonicComponent } from './gin-tonic.component';

describe('GinTonicComponent', () => {
  let component: GinTonicComponent;
  let fixture: ComponentFixture<GinTonicComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GinTonicComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(GinTonicComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
