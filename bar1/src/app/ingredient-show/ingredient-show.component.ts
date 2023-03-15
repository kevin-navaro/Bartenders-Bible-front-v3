import {Component, Input} from '@angular/core';
import { Ingredients} from "../../models/ingredient";

@Component({
  selector: 'app-ingredient-show',
  templateUrl: './ingredient-show.component.html',
  styleUrls: ['./ingredient-show.component.scss']
})
export class IngredientShowComponent {

  @Input()
  ingredient: Ingredients|undefined;
}
