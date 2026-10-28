package com.stripe.android.uicore.address;

import com.whoop.android.R;
import dx2.C12430a;
import e40.C12693g;
import ge3.AbstractC15751g;
import java.lang.annotation.Annotation;
import kotlinx.serialization.internal.EnumsKt;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import q83.AbstractC30060g;
import t83.InterfaceC33616a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\"\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0013\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#¨\u0006$"}, m65681d2 = {"Lcom/stripe/android/uicore/address/NameType;", "", "", "stringResId", "<init>", "(Ljava/lang/String;II)V", "I", "getStringResId", "()I", "Companion", "e40/g", "Area", "Cedex", "City", "Country", "County", "Department", "District", "DoSi", "Eircode", "Emirate", "Island", "Neighborhood", "Oblast", "Parish", "Pin", "PostTown", "Postal", "Perfecture", "Province", "State", "Suburb", "SuburbOrCity", "Townload", "VillageTownship", "Zip", "stripe-ui-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC37144i
public enum NameType {
    Area(R.string.stripe_address_label_hk_area),
    Cedex(R.string.stripe_address_label_cedex),
    City(R.string.stripe_address_label_city),
    Country(R.string.stripe_address_label_country_or_region),
    County(R.string.stripe_address_label_county),
    Department(R.string.stripe_address_label_department),
    District(R.string.stripe_address_label_district),
    DoSi(R.string.stripe_address_label_kr_do_si),
    Eircode(R.string.stripe_address_label_ie_eircode),
    Emirate(R.string.stripe_address_label_ae_emirate),
    Island(R.string.stripe_address_label_island),
    Neighborhood(R.string.stripe_address_label_neighborhood),
    Oblast(R.string.stripe_address_label_oblast),
    Parish(R.string.stripe_address_label_bb_jm_parish),
    Pin(R.string.stripe_address_label_in_pin),
    PostTown(R.string.stripe_address_label_post_town),
    Postal(R.string.stripe_address_label_postal_code),
    Perfecture(R.string.stripe_address_label_jp_prefecture),
    Province(R.string.stripe_address_label_province),
    State(R.string.stripe_address_label_state),
    Suburb(R.string.stripe_address_label_suburb),
    SuburbOrCity(R.string.stripe_address_label_au_suburb_or_city),
    Townload(R.string.stripe_address_label_ie_townland),
    VillageTownship(R.string.stripe_address_label_village_township),
    Zip(R.string.stripe_address_label_zip_code);

    private final int stringResId;
    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    public static final C12693g Companion = new C12693g();
    private static final InterfaceC23462h $cachedSerializer$delegate = AbstractC30060g.m92087G(EnumC23463i.f92934x, new C12430a(18));

    NameType(int i13) {
        this.stringResId = i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.stripe.android.uicore.address.NameType", values(), new String[]{"area", "cedex", "city", "country", "county", "department", "district", "do_si", "eircode", "emirate", "island", "neighborhood", "oblast", "parish", "pin", "post_town", "postal", "prefecture", "province", "state", "suburb", "suburb_or_city", "townland", "village_township", "zip"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}, null);
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final int getStringResId() {
        return this.stringResId;
    }
}
