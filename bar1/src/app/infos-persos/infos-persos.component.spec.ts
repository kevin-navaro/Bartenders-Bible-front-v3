import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InfosPersosComponent } from './infos-persos.component';

describe('InfosPersosComponent', () => {
  let component: InfosPersosComponent;
  let fixture: ComponentFixture<InfosPersosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ InfosPersosComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(InfosPersosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
