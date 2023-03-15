import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { CocktailShowComponent } from './cocktail-show/cocktail-show.component';
import { IngredientShowComponent } from './ingredient-show/ingredient-show.component';
import { LoginComponent } from './login/login.component';
import { FooterComponent } from './footer/footer.component';
import { FormsModule, ReactiveFormsModule } from "@angular/forms";
import { HttpClientModule } from "@angular/common/http";
import { HomeComponent } from './home/home.component';
import { ContactComponent } from './contact/contact.component';
import { MentionsLegalesComponent } from "./mentions-legales/mentions-legales.component";
import { CocktailsDetailsComponent } from "./cocktails-details/cocktails-details.component";
import { QuiSommesNousComponent } from "./qui-sommes-nous/qui-sommes-nous.component";
import { CommunauteComponent } from "./communaute/communaute.component";
import { MojitoComponent } from './mojito/mojito.component';
import { CubaLibreComponent } from './cuba-libre/cuba-libre.component';
import { GinTonicComponent } from './gin-tonic/gin-tonic.component';
import { SexOnTheBeachSoftComponent } from './sex-on-the-beach-soft/sex-on-the-beach-soft.component';
import { SeaAndSunComponent } from './sea-and-sun/sea-and-sun.component';
import { FunColaComponent } from './fun-cola/fun-cola.component';
import { FavorisComponent } from './favoris/favoris.component';
import { MesNotesComponent } from './mes-notes/mes-notes.component';
import { MesRecettesComponent } from './mes-recettes/mes-recettes.component';
import { InfosPersosComponent } from './infos-persos/infos-persos.component';


@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    CocktailShowComponent,
    IngredientShowComponent,
    LoginComponent,
    FooterComponent,
    HomeComponent,
    ContactComponent,
    MentionsLegalesComponent,
    CocktailsDetailsComponent,
    QuiSommesNousComponent,
    CommunauteComponent,
    MojitoComponent,
    CubaLibreComponent,
    GinTonicComponent,
    SexOnTheBeachSoftComponent,
    SeaAndSunComponent,
    FunColaComponent,
    FavorisComponent,
    MesNotesComponent,
    MesRecettesComponent,
    InfosPersosComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule,
  ],
  providers: [
    {
      provide: 'urlApi',
      useValue: 'http://localhost:8080/api/'
    }
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
