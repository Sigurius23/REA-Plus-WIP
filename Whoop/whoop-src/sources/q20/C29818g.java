package q20;

import android.os.Parcel;
import android.os.Parcelable;
import p319m4.AbstractC25012a;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;
import pn.C29367a;
import y00.C38977v3;

/* JADX INFO: renamed from: q20.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C29818g extends AbstractC29840y {
    public static final Parcelable.Creator<C29818g> CREATOR = new C29367a(24);

    /* JADX INFO: renamed from: E */
    public final String f121886E;

    /* JADX INFO: renamed from: F */
    public final String f121887F;

    /* JADX INFO: renamed from: x */
    public final String f121888x;

    /* JADX INFO: renamed from: y */
    public final C38977v3 f121889y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC41211c f121890z;

    public C29818g(String id4, C38977v3 c38977v3, InterfaceC41211c label, String str, String str2) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(label, "label");
        this.f121888x = id4;
        this.f121889y = c38977v3;
        this.f121890z = label;
        this.f121886E = str;
        this.f121887F = str2;
    }

    @Override // q20.AbstractC29840y
    /* JADX INFO: renamed from: b */
    public final boolean mo91323b() {
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29818g)) {
            return false;
        }
        C29818g c29818g = (C29818g) obj;
        return AbstractC22676k.m65745e(this.f121888x, c29818g.f121888x) && AbstractC22676k.m65745e(this.f121889y, c29818g.f121889y) && AbstractC22676k.m65745e(this.f121890z, c29818g.f121890z) && AbstractC22676k.m65745e(this.f121886E, c29818g.f121886E) && AbstractC22676k.m65745e(this.f121887F, c29818g.f121887F);
    }

    @Override // q20.AbstractC29840y
    /* JADX INFO: renamed from: f */
    public final InterfaceC41211c mo91324f(String merchantName, boolean z4) {
        AbstractC22676k.m65750j(merchantName, "merchantName");
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.f121888x.hashCode() * 31;
        C38977v3 c38977v3 = this.f121889y;
        int iHashCode2 = (this.f121890z.hashCode() + ((iHashCode + (c38977v3 == null ? 0 : c38977v3.hashCode())) * 31)) * 31;
        String str = this.f121886E;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f121887F;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("CustomPaymentMethod(id=");
        sb4.append(this.f121888x);
        sb4.append(", billingDetails=");
        sb4.append(this.f121889y);
        sb4.append(", label=");
        sb4.append(this.f121890z);
        sb4.append(", lightThemeIconUrl=");
        sb4.append(this.f121886E);
        sb4.append(", darkThemeIconUrl=");
        return AbstractC25012a.m73376i(this.f121887F, ")", sb4);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f121888x);
        dest.writeParcelable(this.f121889y, i13);
        dest.writeParcelable(this.f121890z, i13);
        dest.writeString(this.f121886E);
        dest.writeString(this.f121887F);
    }
}
