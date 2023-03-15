import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SeaAndSunComponent } from './sea-and-sun.component';

describe('SeaAndSunComponent', () => {
  let component: SeaAndSunComponent;
  let fixture: ComponentFixture<SeaAndSunComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SeaAndSunComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SeaAndSunComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
