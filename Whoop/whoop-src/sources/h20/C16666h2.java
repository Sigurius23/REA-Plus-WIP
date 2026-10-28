package h20;

import android.os.Parcel;
import android.os.Parcelable;
import c13.AbstractC3855a;
import java.util.List;
import m83.C25271y;
import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h20.h2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16666h2 implements Parcelable {
    public static final Parcelable.Creator<C16666h2> CREATOR = new C16654f2(0);

    /* JADX INFO: renamed from: E */
    public final String f64092E;

    /* JADX INFO: renamed from: F */
    public final EnumC16648e2 f64093F;

    /* JADX INFO: renamed from: G */
    public final List f64094G;

    /* JADX INFO: renamed from: w */
    public final EnumC16660g2 f64095w;

    /* JADX INFO: renamed from: x */
    public final String f64096x;

    /* JADX INFO: renamed from: y */
    public final String f64097y;

    /* JADX INFO: renamed from: z */
    public final Long f64098z;

    public C16666h2(EnumC16660g2 environment, String countryCode, String str, Long l7, String str2, EnumC16648e2 buttonType, List additionalEnabledNetworks) {
        AbstractC22676k.m65750j(environment, "environment");
        AbstractC22676k.m65750j(countryCode, "countryCode");
        AbstractC22676k.m65750j(buttonType, "buttonType");
        AbstractC22676k.m65750j(additionalEnabledNetworks, "additionalEnabledNetworks");
        this.f64095w = environment;
        this.f64096x = countryCode;
        this.f64097y = str;
        this.f64098z = l7;
        this.f64092E = str2;
        this.f64093F = buttonType;
        this.f64094G = additionalEnabledNetworks;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16666h2)) {
            return false;
        }
        C16666h2 c16666h2 = (C16666h2) obj;
        return this.f64095w == c16666h2.f64095w && AbstractC22676k.m65745e(this.f64096x, c16666h2.f64096x) && AbstractC22676k.m65745e(this.f64097y, c16666h2.f64097y) && AbstractC22676k.m65745e(this.f64098z, c16666h2.f64098z) && AbstractC22676k.m65745e(this.f64092E, c16666h2.f64092E) && this.f64093F == c16666h2.f64093F && AbstractC22676k.m65745e(this.f64094G, c16666h2.f64094G);
    }

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.f64095w.hashCode() * 31, 31, this.f64096x);
        String str = this.f64097y;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        Long l7 = this.f64098z;
        int iHashCode2 = (iHashCode + (l7 == null ? 0 : l7.hashCode())) * 31;
        String str2 = this.f64092E;
        return this.f64094G.hashCode() + ((this.f64093F.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("GooglePayConfiguration(environment=");
        sb4.append(this.f64095w);
        sb4.append(", countryCode=");
        sb4.append(this.f64096x);
        sb4.append(", currencyCode=");
        sb4.append(this.f64097y);
        sb4.append(", amount=");
        sb4.append(this.f64098z);
        sb4.append(", label=");
        sb4.append(this.f64092E);
        sb4.append(", buttonType=");
        sb4.append(this.f64093F);
        sb4.append(", additionalEnabledNetworks=");
        return AbstractC3855a.m11829m(sb4, this.f64094G, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f64095w.name());
        dest.writeString(this.f64096x);
        dest.writeString(this.f64097y);
        Long l7 = this.f64098z;
        if (l7 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l7.longValue());
        }
        dest.writeString(this.f64092E);
        dest.writeString(this.f64093F.name());
        dest.writeStringList(this.f64094G);
    }

    public /* synthetic */ C16666h2(EnumC16660g2 enumC16660g2, String str, String str2, Long l7, String str3, EnumC16648e2 enumC16648e2) {
        this(enumC16660g2, str, str2, l7, str3, enumC16648e2, C25271y.f99162w);
    }
}
