package a10;

import android.os.Parcel;
import android.os.Parcelable;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.C38793c;

/* JADX INFO: renamed from: a10.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C0121i extends AbstractC0122j {
    public static final Parcelable.Creator<C0121i> CREATOR = new C0113a(6);

    /* JADX INFO: renamed from: E */
    public final C38793c f374E;

    /* JADX INFO: renamed from: F */
    public final String f375F;

    /* JADX INFO: renamed from: x */
    public final C38793c f376x;

    /* JADX INFO: renamed from: y */
    public final String f377y;

    /* JADX INFO: renamed from: z */
    public final String f378z;

    public C0121i(C38793c c38793c, String str, String str2, C38793c c38793c2, String str3) {
        super(EnumC0120h.VisaCheckout);
        this.f376x = c38793c;
        this.f377y = str;
        this.f378z = str2;
        this.f374E = c38793c2;
        this.f375F = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0121i)) {
            return false;
        }
        C0121i c0121i = (C0121i) obj;
        return AbstractC22676k.m65745e(this.f376x, c0121i.f376x) && AbstractC22676k.m65745e(this.f377y, c0121i.f377y) && AbstractC22676k.m65745e(this.f378z, c0121i.f378z) && AbstractC22676k.m65745e(this.f374E, c0121i.f374E) && AbstractC22676k.m65745e(this.f375F, c0121i.f375F);
    }

    public final int hashCode() {
        C38793c c38793c = this.f376x;
        int iHashCode = (c38793c == null ? 0 : c38793c.hashCode()) * 31;
        String str = this.f377y;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f378z;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C38793c c38793c2 = this.f374E;
        int iHashCode4 = (iHashCode3 + (c38793c2 == null ? 0 : c38793c2.hashCode())) * 31;
        String str3 = this.f375F;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("VisaCheckoutWallet(billingAddress=");
        sb4.append(this.f376x);
        sb4.append(", email=");
        sb4.append(this.f377y);
        sb4.append(", name=");
        sb4.append(this.f378z);
        sb4.append(", shippingAddress=");
        sb4.append(this.f374E);
        sb4.append(", dynamicLast4=");
        return AbstractC25012a.m73376i(this.f375F, ")", sb4);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        C38793c c38793c = this.f376x;
        if (c38793c == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38793c.writeToParcel(dest, i13);
        }
        dest.writeString(this.f377y);
        dest.writeString(this.f378z);
        C38793c c38793c2 = this.f374E;
        if (c38793c2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38793c2.writeToParcel(dest, i13);
        }
        dest.writeString(this.f375F);
    }
}
