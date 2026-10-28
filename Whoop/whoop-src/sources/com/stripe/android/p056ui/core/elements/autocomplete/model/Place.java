package com.stripe.android.p056ui.core.elements.autocomplete.model;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0003'()B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\u0017\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R(\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0016¨\u0006*"}, m65681d2 = {"Lcom/stripe/android/ui/core/elements/autocomplete/model/Place;", "", "", "Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;", "addressComponents", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$payments_ui_core_release", "(Lcom/stripe/android/ui/core/elements/autocomplete/model/Place;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/stripe/android/ui/core/elements/autocomplete/model/Place;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getAddressComponents", "getAddressComponents$annotations", "()V", "Companion", "z30/e", "$serializer", "com/stripe/android/ui/core/elements/autocomplete/model/b", "payments-ui-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class Place {
    public static final int $stable = 8;
    private final List<AddressComponent> addressComponents;
    public static final C5675b Companion = new C5675b();
    private static final InterfaceC37138c[] $childSerializers = {new ArrayListSerializer(AddressComponent$$serializer.INSTANCE)};

    public /* synthetic */ Place(int i13, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, Place$$serializer.INSTANCE.getDescriptor());
        }
        this.addressComponents = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Place copy$default(Place place, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = place.addressComponents;
        }
        return place.copy(list);
    }

    @InterfaceC37143h("address_components")
    public static /* synthetic */ void getAddressComponents$annotations() {
    }

    public final List<AddressComponent> component1() {
        return this.addressComponents;
    }

    public final Place copy(List<AddressComponent> addressComponents) {
        return new Place(addressComponents);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Place) && AbstractC22676k.m65745e(this.addressComponents, ((Place) other).addressComponents);
    }

    public final List<AddressComponent> getAddressComponents() {
        return this.addressComponents;
    }

    public int hashCode() {
        List<AddressComponent> list = this.addressComponents;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return AbstractC33745d.m106654m("Place(addressComponents=", ")", this.addressComponents);
    }

    public Place(List<AddressComponent> list) {
        this.addressComponents = list;
    }
}
