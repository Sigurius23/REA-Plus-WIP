package s40;

import android.os.Parcel;
import android.os.Parcelable;
import d13.AbstractC11478a;
import java.util.Iterator;
import java.util.List;
import jh3.AbstractC21702c;
import m83.C25271y;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29912j0;
import y00.EnumC38853i;

/* JADX INFO: renamed from: s40.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C32161k implements Parcelable {
    public static final Parcelable.Creator<C32161k> CREATOR = new C29912j0(24);

    /* JADX INFO: renamed from: E */
    public final List f133221E;

    /* JADX INFO: renamed from: F */
    public final List f133222F;

    /* JADX INFO: renamed from: G */
    public final boolean f133223G;

    /* JADX INFO: renamed from: H */
    public final boolean f133224H;

    /* JADX INFO: renamed from: w */
    public final boolean f133225w;

    /* JADX INFO: renamed from: x */
    public final boolean f133226x;

    /* JADX INFO: renamed from: y */
    public final EnumC38853i f133227y;

    /* JADX INFO: renamed from: z */
    public final EnumC38853i f133228z;

    public C32161k(boolean z4, boolean z13, EnumC38853i brand, EnumC38853i enumC38853i, List list, List list2, boolean z14, boolean z15) {
        AbstractC22676k.m65750j(brand, "brand");
        this.f133225w = z4;
        this.f133226x = z13;
        this.f133227y = brand;
        this.f133228z = enumC38853i;
        this.f133221E = list;
        this.f133222F = list2;
        this.f133223G = z14;
        this.f133224H = z15;
    }

    /* JADX INFO: renamed from: b */
    public static C32161k m100107b(C32161k c32161k, boolean z4, EnumC38853i enumC38853i, EnumC38853i enumC38853i2, List list, List list2, boolean z13, boolean z14, int i13) {
        if ((i13 & 1) != 0) {
            z4 = c32161k.f133225w;
        }
        boolean z15 = z4;
        boolean z16 = c32161k.f133226x;
        if ((i13 & 4) != 0) {
            enumC38853i = c32161k.f133227y;
        }
        EnumC38853i brand = enumC38853i;
        if ((i13 & 8) != 0) {
            enumC38853i2 = c32161k.f133228z;
        }
        EnumC38853i enumC38853i3 = enumC38853i2;
        if ((i13 & 16) != 0) {
            list = c32161k.f133221E;
        }
        List possibleBrands = list;
        if ((i13 & 32) != 0) {
            list2 = c32161k.f133222F;
        }
        List merchantPreferredNetworks = list2;
        if ((i13 & 64) != 0) {
            z13 = c32161k.f133223G;
        }
        boolean z17 = z13;
        boolean z18 = (i13 & 128) != 0 ? c32161k.f133224H : z14;
        c32161k.getClass();
        AbstractC22676k.m65750j(brand, "brand");
        AbstractC22676k.m65750j(possibleBrands, "possibleBrands");
        AbstractC22676k.m65750j(merchantPreferredNetworks, "merchantPreferredNetworks");
        return new C32161k(z15, z16, brand, enumC38853i3, possibleBrands, merchantPreferredNetworks, z17, z18);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32161k)) {
            return false;
        }
        C32161k c32161k = (C32161k) obj;
        return this.f133225w == c32161k.f133225w && this.f133226x == c32161k.f133226x && this.f133227y == c32161k.f133227y && this.f133228z == c32161k.f133228z && AbstractC22676k.m65745e(this.f133221E, c32161k.f133221E) && AbstractC22676k.m65745e(this.f133222F, c32161k.f133222F) && this.f133223G == c32161k.f133223G && this.f133224H == c32161k.f133224H;
    }

    public final int hashCode() {
        int iHashCode = (this.f133227y.hashCode() + AbstractC2875y.m8289b(Boolean.hashCode(this.f133225w) * 31, 31, this.f133226x)) * 31;
        EnumC38853i enumC38853i = this.f133228z;
        return Boolean.hashCode(this.f133224H) + AbstractC2875y.m8289b(AbstractC11895b.m31983b(AbstractC11895b.m31983b((iHashCode + (enumC38853i == null ? 0 : enumC38853i.hashCode())) * 31, 31, this.f133221E), 31, this.f133222F), 31, this.f133223G);
    }

    public final String toString() {
        StringBuilder sbM32002u = AbstractC11895b.m32002u("State(isCbcEligible=", ", isLoading=", ", brand=", this.f133225w, this.f133226x);
        sbM32002u.append(this.f133227y);
        sbM32002u.append(", userSelectedBrand=");
        sbM32002u.append(this.f133228z);
        sbM32002u.append(", possibleBrands=");
        AbstractC21702c.m61148s(sbM32002u, this.f133221E, ", merchantPreferredNetworks=", this.f133222F, ", shouldShowCvc=");
        return AbstractC36095b.m114682j(sbM32002u, this.f133223G, ", shouldShowErrorIcon=", this.f133224H, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(this.f133225w ? 1 : 0);
        dest.writeInt(this.f133226x ? 1 : 0);
        dest.writeString(this.f133227y.name());
        EnumC38853i enumC38853i = this.f133228z;
        if (enumC38853i == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumC38853i.name());
        }
        Iterator itM30863o = AbstractC11478a.m30863o(this.f133221E, dest);
        while (itM30863o.hasNext()) {
            dest.writeString(((EnumC38853i) itM30863o.next()).name());
        }
        Iterator itM30863o2 = AbstractC11478a.m30863o(this.f133222F, dest);
        while (itM30863o2.hasNext()) {
            dest.writeString(((EnumC38853i) itM30863o2.next()).name());
        }
        dest.writeInt(this.f133223G ? 1 : 0);
        dest.writeInt(this.f133224H ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C32161k() {
        EnumC38853i enumC38853i = EnumC38853i.Unknown;
        C25271y c25271y = C25271y.f99162w;
        this(false, false, enumC38853i, null, c25271y, c25271y, false, false);
    }
}
