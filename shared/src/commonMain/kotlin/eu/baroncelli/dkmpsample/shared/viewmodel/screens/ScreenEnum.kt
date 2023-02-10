package eu.baroncelli.dkmpsample.shared.viewmodel.screens

import eu.baroncelli.dkmpsample.shared.viewmodel.Navigation
import eu.baroncelli.dkmpsample.shared.viewmodel.ScreenIdentifier
import eu.baroncelli.dkmpsample.shared.viewmodel.StateManager
import eu.baroncelli.dkmpsample.shared.viewmodel.screens.countrieslist.initCountriesList
import eu.baroncelli.dkmpsample.shared.viewmodel.screens.countrydetail.initCountryDetail
import eu.baroncelli.dkmpsample.shared.viewmodel.screens.level3screen.initLevel3Screen


// DEFINITION OF ALL SCREENS IN THE APP

enum class Screen(
    val asString: String,
    val navigationLevel : Int = 1,
    val initSettings: StateManager.(ScreenIdentifier) -> ScreenInitSettings,
) {
    CountriesList("countrieslist", 1, { initCountriesList(it.params()) }),
    CountryDetail("country", 2, { initCountryDetail(it.params()) }),
    Level3Screen("level3", 3, { initLevel3Screen(it.params()) })
}