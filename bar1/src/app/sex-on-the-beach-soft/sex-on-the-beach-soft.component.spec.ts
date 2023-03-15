import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SexOnTheBeachSoftComponent } from './sex-on-the-beach-soft.component';

describe('SexOnTheBeachSoftComponent', () => {
  let component: SexOnTheBeachSoftComponent;
  let fixture: ComponentFixture<SexOnTheBeachSoftComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SexOnTheBeachSoftComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SexOnTheBeachSoftComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
