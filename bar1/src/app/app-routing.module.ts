import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {HomeComponent} from "./home/home.component";
import {ContactComponent} from "./contact/contact.component";
import {MentionsLegalesComponent} from "./mentions-legales/mentions-legales.component";
import {CocktailShowComponent} from "./cocktail-show/cocktail-show.component";
import {CocktailsDetailsComponent} from "./cocktails-details/cocktails-details.component";
import {IngredientShowComponent} from "./ingredient-show/ingredient-show.component";
import {LoginComponent} from "./login/login.component";
import {QuiSommesNousComponent} from "./qui-sommes-nous/qui-sommes-nous.component";
import {CommunauteComponent} from "./communaute/communaute.component";
import {MojitoComponent} from "./mojito/mojito.component";
import {CubaLibreComponent} from "./cuba-libre/cuba-libre.component";
import {GinTonicComponent} from "./gin-tonic/gin-tonic.component";
import {SexOnTheBeachSoftComponent} from "./sex-on-the-beach-soft/sex-on-the-beach-soft.component";
import {SeaAndSunComponent} from "./sea-and-sun/sea-and-sun.component";
import {FunColaComponent} from "./fun-cola/fun-cola.component";
import {InfosPersosComponent} from "./infos-persos/infos-persos.component";
import {MesRecettesComponent} from "./mes-recettes/mes-recettes.component";
import {MesNotesComponent} from "./mes-notes/mes-notes.component";
import {FavorisComponent} from "./favoris/favoris.component";

const routes: Routes = [
  { path: 'home', component: HomeComponent },
  { path: 'contact', component: ContactComponent },
  { path: 'mentions_legales', component: MentionsLegalesComponent },
  { path: 'cocktail_show', component: CocktailShowComponent },
  { path: 'cocktail_show/:details', component: CocktailsDetailsComponent },
  { path: 'ingredient_show', component: IngredientShowComponent},
  { path: 'login', component: LoginComponent},
  { path: 'qui_sommes_nous', component: QuiSommesNousComponent},
  { path: 'communaute', component: CommunauteComponent},
  { path: 'mojito', component: MojitoComponent},
  { path: 'cuba_libre', component: CubaLibreComponent},
  { path: 'gin_tonic', component: GinTonicComponent},
  { path: 'sex_on_the_beach_soft', component: SexOnTheBeachSoftComponent},
  { path: 'sea_and_sun', component: SeaAndSunComponent},
  { path: 'fun_cola', component: FunColaComponent},
  { path: 'infos_persos', component: InfosPersosComponent},
  { path: 'mes_recettes', component: MesRecettesComponent},
  { path: 'mes_notes', component: MesNotesComponent},
  { path: 'favoris', component: FavorisComponent},
  { path: '**', component: HomeComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
