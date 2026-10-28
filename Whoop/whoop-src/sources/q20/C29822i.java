package q20;

import android.os.Parcel;
import android.os.Parcelable;
import p000.AbstractC11266d;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;
import pn.C29367a;
import y00.C38977v3;

/* JADX INFO: renamed from: q20.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C29822i extends AbstractC29840y {
    public static final Parcelable.Creator<C29822i> CREATOR = new C29367a(25);

    /* JADX INFO: renamed from: E */
    public final int f121898E;

    /* JADX INFO: renamed from: F */
    public final String f121899F;

    /* JADX INFO: renamed from: G */
    public final String f121900G;

    /* JADX INFO: renamed from: x */
    public final String f121901x;

    /* JADX INFO: renamed from: y */
    public final C38977v3 f121902y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC41211c f121903z;

    public C29822i(String type, C38977v3 c38977v3, InterfaceC41211c label, int i13, String str, String str2) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(label, "label");
        this.f121901x = type;
        this.f121902y = c38977v3;
        this.f121903z = label;
        this.f121898E = i13;
        this.f121899F = str;
        this.f121900G = str2;
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
        if (!(obj instanceof C29822i)) {
            return false;
        }
        C29822i c29822i = (C29822i) obj;
        return AbstractC22676k.m65745e(this.f121901x, c29822i.f121901x) && AbstractC22676k.m65745e(this.f121902y, c29822i.f121902y) && AbstractC22676k.m65745e(this.f121903z, c29822i.f121903z) && this.f121898E == c29822i.f121898E && AbstractC22676k.m65745e(this.f121899F, c29822i.f121899F) && AbstractC22676k.m65745e(this.f121900G, c29822i.f121900G);
    }

    @Override // q20.AbstractC29840y
    /* JADX INFO: renamed from: f */
    public final InterfaceC41211c mo91324f(String merchantName, boolean z4) {
        AbstractC22676k.m65750j(merchantName, "merchantName");
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.f121901x.hashCode() * 31;
        C38977v3 c38977v3 = this.f121902y;
        int iM30448b = AbstractC11266d.m30448b(this.f121898E, (this.f121903z.hashCode() + ((iHashCode + (c38977v3 == null ? 0 : c38977v3.hashCode())) * 31)) * 31, 31);
        String str = this.f121899F;
        int iHashCode2 = (iM30448b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f121900G;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("ExternalPaymentMethod(type=");
        sb4.append(this.f121901x);
        sb4.append(", billingDetails=");
        sb4.append(this.f121902y);
        sb4.append(", label=");
        sb4.append(this.f121903z);
        sb4.append(", iconResource=");
        sb4.append(this.f121898E);
        sb4.append(", lightThemeIconUrl=");
        return AbstractC11266d.m30464r(sb4, this.f121899F, ", darkThemeIconUrl=", this.f121900G, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f121901x);
        dest.writeParcelable(this.f121902y, i13);
        dest.writeParcelable(this.f121903z, i13);
        dest.writeInt(this.f121898E);
        dest.writeString(this.f121899F);
        dest.writeString(this.f121900G);
    }
}
