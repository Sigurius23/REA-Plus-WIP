package y30;

import android.text.SpannableString;
import android.text.style.StyleSpan;
import b20.C2326f;
import b20.EnumC2323c;
import b20.EnumC2324d;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.model.AddressComponent;
import com.google.android.libraries.places.api.model.AddressComponents;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FetchPlaceResponse;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.squareup.wire.AbstractC5583n;
import com.stripe.android.core.exception.StripeException;
import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p000.AbstractC11266d;
import p479s4.AbstractC32123d;
import p505ts.AbstractC34132o;
import p550vd.AbstractC35903f;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import wb3.AbstractC37056f;
import z30.C40039b;
import z30.C40040c;
import z30.C40041d;

/* JADX INFO: renamed from: y30.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C39188c implements InterfaceC39190e {

    /* JADX INFO: renamed from: a */
    public final PlacesClient f168441a;

    /* JADX INFO: renamed from: b */
    public final C2326f f168442b;

    /* JADX INFO: renamed from: c */
    public final AutocompleteSessionToken f168443c;

    public C39188c(PlacesClient client, C2326f c2326f) {
        AbstractC22676k.m65750j(client, "client");
        this.f168441a = client;
        this.f168442b = c2326f;
        this.f168443c = AutocompleteSessionToken.newInstance();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // y30.InterfaceC39190e
    /* JADX INFO: renamed from: a */
    public final Object mo124820a(String str, InterfaceC30057d interfaceC30057d) {
        C39186a c39186a;
        C39188c c39188c;
        ArrayList arrayList;
        List listAsList;
        if (interfaceC30057d instanceof C39186a) {
            c39186a = (C39186a) interfaceC30057d;
            int i13 = c39186a.f168435z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c39186a.f168435z = i13 - Integer.MIN_VALUE;
            } else {
                c39186a = new C39186a(this, (AbstractC32269c) interfaceC30057d);
            }
        } else {
            c39186a = new C39186a(this, (AbstractC32269c) interfaceC30057d);
        }
        Object objM16789o = c39186a.f168433x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c39186a.f168435z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM16789o);
            try {
                Task taskFetchPlace = this.f168441a.fetchPlace(FetchPlaceRequest.newInstance(str, AbstractC37056f.m118958J(Place.Field.ADDRESS_COMPONENTS)));
                AbstractC22676k.m65749i(taskFetchPlace, "fetchPlace(...)");
                c39186a.f168432w = this;
                c39186a.f168435z = 1;
                objM16789o = AbstractC5583n.m16789o(taskFetchPlace, c39186a);
                if (objM16789o == enumC31071a) {
                    return enumC31071a;
                }
                c39188c = this;
            } catch (Exception e5) {
                e = e5;
                c39188c = this;
                C2326f c2326f = c39188c.f168442b;
                EnumC2323c enumC2323c = EnumC2323c.PLACES_FETCH_PLACE_ERROR;
                int i15 = StripeException.f22154E;
                AbstractC35903f.m113990H(c2326f, enumC2323c, AbstractC32123d.m100024d(e), null, 4);
                return AbstractC34132o.m107888l(new Exception(AbstractC11266d.m30461o("Could not fetch place: ", e.getMessage())));
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c39188c = c39186a.f168432w;
            try {
                AbstractC34132o.m107864I(objM16789o);
            } catch (Exception e13) {
                e = e13;
                C2326f c2326f2 = c39188c.f168442b;
                EnumC2323c enumC2323c2 = EnumC2323c.PLACES_FETCH_PLACE_ERROR;
                int i16 = StripeException.f22154E;
                AbstractC35903f.m113990H(c2326f2, enumC2323c2, AbstractC32123d.m100024d(e), null, 4);
                return AbstractC34132o.m107888l(new Exception(AbstractC11266d.m30461o("Could not fetch place: ", e.getMessage())));
            }
        }
        AbstractC35903f.m113990H(c39188c.f168442b, EnumC2324d.PLACES_FETCH_PLACE_SUCCESS, null, null, 6);
        AddressComponents addressComponents = ((FetchPlaceResponse) objM16789o).getPlace().getAddressComponents();
        if (addressComponents == null || (listAsList = addressComponents.asList()) == null) {
            arrayList = null;
        } else {
            List<AddressComponent> list = listAsList;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            for (AddressComponent addressComponent : list) {
                String shortName = addressComponent.getShortName();
                String name = addressComponent.getName();
                AbstractC22676k.m65749i(name, "getName(...)");
                List types = addressComponent.getTypes();
                AbstractC22676k.m65749i(types, "getTypes(...)");
                arrayList.add(new com.stripe.android.p056ui.core.elements.autocomplete.model.AddressComponent(shortName, name, types));
            }
        }
        return new C40040c(new com.stripe.android.p056ui.core.elements.autocomplete.model.Place(arrayList));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // y30.InterfaceC39190e
    /* JADX INFO: renamed from: b */
    public final Object mo124821b(String str, String str2, int i13, InterfaceC30057d interfaceC30057d) {
        C39187b c39187b;
        C39188c c39188c;
        if (interfaceC30057d instanceof C39187b) {
            c39187b = (C39187b) interfaceC30057d;
            int i14 = c39187b.f168436E;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c39187b.f168436E = i14 - Integer.MIN_VALUE;
            } else {
                c39187b = new C39187b(this, (AbstractC32269c) interfaceC30057d);
            }
        } else {
            c39187b = new C39187b(this, (AbstractC32269c) interfaceC30057d);
        }
        Object objM16789o = c39187b.f168439y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = c39187b.f168436E;
        if (i15 == 0) {
            AbstractC34132o.m107864I(objM16789o);
            try {
                Task taskFindAutocompletePredictions = this.f168441a.findAutocompletePredictions(FindAutocompletePredictionsRequest.builder().setSessionToken(this.f168443c).setQuery(str).setCountries(AbstractC37056f.m118958J(str2)).setTypesFilter(AbstractC37056f.m118958J("address")).build());
                AbstractC22676k.m65749i(taskFindAutocompletePredictions, "findAutocompletePredictions(...)");
                c39187b.f168437w = this;
                c39187b.f168438x = i13;
                c39187b.f168436E = 1;
                objM16789o = AbstractC5583n.m16789o(taskFindAutocompletePredictions, c39187b);
                if (objM16789o == enumC31071a) {
                    return enumC31071a;
                }
                c39188c = this;
            } catch (Exception e5) {
                e = e5;
                c39188c = this;
                C2326f c2326f = c39188c.f168442b;
                EnumC2323c enumC2323c = EnumC2323c.PLACES_FIND_AUTOCOMPLETE_ERROR;
                int i16 = StripeException.f22154E;
                AbstractC35903f.m113990H(c2326f, enumC2323c, AbstractC32123d.m100024d(e), null, 4);
                return AbstractC34132o.m107888l(new Exception(AbstractC11266d.m30461o("Could not find autocomplete predictions: ", e.getMessage())));
            }
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i13 = c39187b.f168438x;
            c39188c = c39187b.f168437w;
            try {
                AbstractC34132o.m107864I(objM16789o);
            } catch (Exception e13) {
                e = e13;
                C2326f c2326f2 = c39188c.f168442b;
                EnumC2323c enumC2323c2 = EnumC2323c.PLACES_FIND_AUTOCOMPLETE_ERROR;
                int i17 = StripeException.f22154E;
                AbstractC35903f.m113990H(c2326f2, enumC2323c2, AbstractC32123d.m100024d(e), null, 4);
                return AbstractC34132o.m107888l(new Exception(AbstractC11266d.m30461o("Could not find autocomplete predictions: ", e.getMessage())));
            }
        }
        AbstractC35903f.m113990H(c39188c.f168442b, EnumC2324d.PLACES_FIND_AUTOCOMPLETE_SUCCESS, null, null, 6);
        List autocompletePredictions = ((FindAutocompletePredictionsResponse) objM16789o).getAutocompletePredictions();
        AbstractC22676k.m65749i(autocompletePredictions, "getAutocompletePredictions(...)");
        List<AutocompletePrediction> list = autocompletePredictions;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (AutocompletePrediction autocompletePrediction : list) {
            SpannableString primaryText = autocompletePrediction.getPrimaryText(new StyleSpan(1));
            AbstractC22676k.m65749i(primaryText, "getPrimaryText(...)");
            SpannableString secondaryText = autocompletePrediction.getSecondaryText(new StyleSpan(1));
            AbstractC22676k.m65749i(secondaryText, "getSecondaryText(...)");
            String placeId = autocompletePrediction.getPlaceId();
            AbstractC22676k.m65749i(placeId, "getPlaceId(...)");
            arrayList.add(new C40039b(primaryText, secondaryText, placeId));
        }
        return new C40041d(AbstractC25265s.m74156w1(arrayList, i13));
    }
}
