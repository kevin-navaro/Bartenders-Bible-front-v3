import {Component, Input} from '@angular/core';
import {Recipes} from "../../models/recipes";

@Component({
  selector: 'app-cocktail-show',
  templateUrl: './cocktail-show.component.html',
  styleUrls: ['./cocktail-show.component.scss']
})
export class CocktailShowComponent {

  @Input()
  recipe: Recipes|undefined;

}
