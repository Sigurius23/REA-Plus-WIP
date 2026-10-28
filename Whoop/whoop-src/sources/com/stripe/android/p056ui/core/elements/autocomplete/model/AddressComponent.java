package com.stripe.android.p056ui.core.elements.autocomplete.model;

import c13.AbstractC3855a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import z30.EnumC40042e;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000234B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB?\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J6\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ\u0010\u0010$\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u00192\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u001dR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010)\u0012\u0004\b.\u0010,\u001a\u0004\b-\u0010\u001dR&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010/\u0012\u0004\b1\u0010,\u001a\u0004\b0\u0010 ¨\u00065"}, m65681d2 = {"Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;", "", "", "shortName", "longName", "", "types", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$payments_ui_core_release", "(Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;Lzc3/c;Lyc3/g;)V", "write$Self", "Lz30/e;", "type", "", "contains", "(Lz30/e;)Z", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getShortName", "getShortName$annotations", "()V", "getLongName", "getLongName$annotations", "Ljava/util/List;", "getTypes", "getTypes$annotations", "Companion", "$serializer", "com/stripe/android/ui/core/elements/autocomplete/model/a", "payments-ui-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AddressComponent {
    public static final int $stable = 8;
    private final String longName;
    private final String shortName;
    private final List<String> types;
    public static final C5674a Companion = new C5674a();
    private static final InterfaceC37138c[] $childSerializers = {null, null, new ArrayListSerializer(StringSerializer.INSTANCE)};

    public /* synthetic */ AddressComponent(int i13, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, AddressComponent$$serializer.INSTANCE.getDescriptor());
        }
        this.shortName = str;
        this.longName = str2;
        this.types = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddressComponent copy$default(AddressComponent addressComponent, String str, String str2, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = addressComponent.shortName;
        }
        if ((i13 & 2) != 0) {
            str2 = addressComponent.longName;
        }
        if ((i13 & 4) != 0) {
            list = addressComponent.types;
        }
        return addressComponent.copy(str, str2, list);
    }

    @InterfaceC37143h("long_name")
    public static /* synthetic */ void getLongName$annotations() {
    }

    @InterfaceC37143h("short_name")
    public static /* synthetic */ void getShortName$annotations() {
    }

    @InterfaceC37143h("types")
    public static /* synthetic */ void getTypes$annotations() {
    }

    public static final /* synthetic */ void write$Self$payments_ui_core_release(AddressComponent self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC37138c[] interfaceC37138cArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.shortName);
        output.encodeStringElement(serialDesc, 1, self.longName);
        output.encodeSerializableElement(serialDesc, 2, interfaceC37138cArr[2], self.types);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getShortName() {
        return this.shortName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLongName() {
        return this.longName;
    }

    public final List<String> component3() {
        return this.types;
    }

    public final boolean contains(EnumC40042e type) {
        AbstractC22676k.m65750j(type, "type");
        return this.types.contains(type.f172766w);
    }

    public final AddressComponent copy(String shortName, String longName, List<String> types) {
        AbstractC22676k.m65750j(longName, "longName");
        AbstractC22676k.m65750j(types, "types");
        return new AddressComponent(shortName, longName, types);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressComponent)) {
            return false;
        }
        AddressComponent addressComponent = (AddressComponent) other;
        return AbstractC22676k.m65745e(this.shortName, addressComponent.shortName) && AbstractC22676k.m65745e(this.longName, addressComponent.longName) && AbstractC22676k.m65745e(this.types, addressComponent.types);
    }

    public final String getLongName() {
        return this.longName;
    }

    public final String getShortName() {
        return this.shortName;
    }

    public final List<String> getTypes() {
        return this.types;
    }

    public int hashCode() {
        String str = this.shortName;
        return this.types.hashCode() + AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.longName);
    }

    public String toString() {
        String str = this.shortName;
        String str2 = this.longName;
        return AbstractC3855a.m11829m(AbstractC11895b.m32001t("AddressComponent(shortName=", str, ", longName=", str2, ", types="), this.types, ")");
    }

    public AddressComponent(String str, String longName, List<String> types) {
        AbstractC22676k.m65750j(longName, "longName");
        AbstractC22676k.m65750j(types, "types");
        this.shortName = str;
        this.longName = longName;
        this.types = types;
    }
}
