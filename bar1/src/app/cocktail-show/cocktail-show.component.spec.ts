import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CocktailShowComponent } from './cocktail-show.component';

describe('CocktailShowComponent', () => {
  let component: CocktailShowComponent;
  let fixture: ComponentFixture<CocktailShowComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CocktailShowComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CocktailShowComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
