package com.whoop.profile.view.edit;

import com.whoop.profile.presentation.edit.EditProfileViewState;
import java.util.List;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m65681d2 = {"Lcom/whoop/profile/view/edit/CountryStateSheetState;", "", "countries", "", "Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;", "selectedCountry", "selectedState", "Lcom/whoop/profile/presentation/edit/EditProfileViewState$State;", "<init>", "(Ljava/util/List;Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;Lcom/whoop/profile/presentation/edit/EditProfileViewState$State;)V", "getCountries", "()Ljava/util/List;", "getSelectedCountry", "()Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;", "getSelectedState", "()Lcom/whoop/profile/presentation/edit/EditProfileViewState$State;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class CountryStateSheetState {
    public static final int $stable = 8;
    private final List<EditProfileViewState.Country> countries;
    private final EditProfileViewState.Country selectedCountry;
    private final EditProfileViewState.State selectedState;

    public CountryStateSheetState() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CountryStateSheetState copy$default(CountryStateSheetState countryStateSheetState, List list, EditProfileViewState.Country country, EditProfileViewState.State state, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = countryStateSheetState.countries;
        }
        if ((i13 & 2) != 0) {
            country = countryStateSheetState.selectedCountry;
        }
        if ((i13 & 4) != 0) {
            state = countryStateSheetState.selectedState;
        }
        return countryStateSheetState.copy(list, country, state);
    }

    public final List<EditProfileViewState.Country> component1() {
        return this.countries;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final EditProfileViewState.Country getSelectedCountry() {
        return this.selectedCountry;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final EditProfileViewState.State getSelectedState() {
        return this.selectedState;
    }

    public final CountryStateSheetState copy(List<EditProfileViewState.Country> countries, EditProfileViewState.Country selectedCountry, EditProfileViewState.State selectedState) {
        AbstractC22676k.m65750j(countries, "countries");
        return new CountryStateSheetState(countries, selectedCountry, selectedState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CountryStateSheetState)) {
            return false;
        }
        CountryStateSheetState countryStateSheetState = (CountryStateSheetState) other;
        return AbstractC22676k.m65745e(this.countries, countryStateSheetState.countries) && AbstractC22676k.m65745e(this.selectedCountry, countryStateSheetState.selectedCountry) && AbstractC22676k.m65745e(this.selectedState, countryStateSheetState.selectedState);
    }

    public final List<EditProfileViewState.Country> getCountries() {
        return this.countries;
    }

    public final EditProfileViewState.Country getSelectedCountry() {
        return this.selectedCountry;
    }

    public final EditProfileViewState.State getSelectedState() {
        return this.selectedState;
    }

    public int hashCode() {
        int iHashCode = this.countries.hashCode() * 31;
        EditProfileViewState.Country country = this.selectedCountry;
        int iHashCode2 = (iHashCode + (country == null ? 0 : country.hashCode())) * 31;
        EditProfileViewState.State state = this.selectedState;
        return iHashCode2 + (state != null ? state.hashCode() : 0);
    }

    public String toString() {
        return "CountryStateSheetState(countries=" + this.countries + ", selectedCountry=" + this.selectedCountry + ", selectedState=" + this.selectedState + ")";
    }

    public CountryStateSheetState(List<EditProfileViewState.Country> countries, EditProfileViewState.Country country, EditProfileViewState.State state) {
        AbstractC22676k.m65750j(countries, "countries");
        this.countries = countries;
        this.selectedCountry = country;
        this.selectedState = state;
    }

    public /* synthetic */ CountryStateSheetState(List list, EditProfileViewState.Country country, EditProfileViewState.State state, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C25271y.f99162w : list, (i13 & 2) != 0 ? null : country, (i13 & 4) != 0 ? null : state);
    }
}
