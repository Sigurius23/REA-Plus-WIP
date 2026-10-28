package com.stripe.android.core.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import v00.C35467g0;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\bB/\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u0018J$\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b%\u0010\u001fJ\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u0018¨\u00062"}, m65681d2 = {"Lcom/stripe/android/core/model/Country;", "Landroid/os/Parcelable;", "Lcom/stripe/android/core/model/CountryCode;", "code", "", "name", "<init>", "(Lcom/stripe/android/core/model/CountryCode;Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/stripe/android/core/model/CountryCode;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$stripe_core_release", "(Lcom/stripe/android/core/model/Country;Lzc3/c;Lyc3/g;)V", "write$Self", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/stripe/android/core/model/CountryCode;", "component2", "copy", "(Lcom/stripe/android/core/model/CountryCode;Ljava/lang/String;)Lcom/stripe/android/core/model/Country;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/stripe/android/core/model/CountryCode;", "getCode", "Ljava/lang/String;", "getName", "Companion", "$serializer", "com/stripe/android/core/model/a", "stripe-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class Country implements Parcelable {
    private final CountryCode code;
    private final String name;
    public static final C5596a Companion = new C5596a();
    public static final Parcelable.Creator<Country> CREATOR = new C35467g0(9);

    public /* synthetic */ Country(int i13, CountryCode countryCode, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, Country$$serializer.INSTANCE.getDescriptor());
        }
        this.code = countryCode;
        this.name = str;
    }

    public static /* synthetic */ Country copy$default(Country country, CountryCode countryCode, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            countryCode = country.code;
        }
        if ((i13 & 2) != 0) {
            str = country.name;
        }
        return country.copy(countryCode, str);
    }

    public static final /* synthetic */ void write$Self$stripe_core_release(Country self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, CountryCode$$serializer.INSTANCE, self.code);
        output.encodeStringElement(serialDesc, 1, self.name);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CountryCode getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final Country copy(CountryCode code, String name) {
        AbstractC22676k.m65750j(code, "code");
        AbstractC22676k.m65750j(name, "name");
        return new Country(code, name);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Country)) {
            return false;
        }
        Country country = (Country) other;
        return AbstractC22676k.m65745e(this.code, country.code) && AbstractC22676k.m65745e(this.name, country.name);
    }

    public final CountryCode getCode() {
        return this.code;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode() + (this.code.hashCode() * 31);
    }

    public String toString() {
        return this.name;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        this.code.writeToParcel(dest, flags);
        dest.writeString(this.name);
    }

    public Country(CountryCode code, String name) {
        AbstractC22676k.m65750j(code, "code");
        AbstractC22676k.m65750j(name, "name");
        this.code = code;
        this.name = name;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Country(String code, String name) {
        this(C5597b.m16833a(code), name);
        AbstractC22676k.m65750j(code, "code");
        AbstractC22676k.m65750j(name, "name");
        CountryCode.Companion.getClass();
    }
}
