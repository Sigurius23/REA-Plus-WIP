package p599wz;

import android.os.Parcel;
import android.os.Parcelable;
import p319m4.AbstractC25012a;
import p597wx.C37677f;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38794c0;

/* JADX INFO: renamed from: wz.s0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C37754s0 extends AbstractC37760u0 {
    public static final Parcelable.Creator<C37754s0> CREATOR = new C37677f(21);

    /* JADX INFO: renamed from: x */
    public final AbstractC38794c0 f161721x;

    /* JADX INFO: renamed from: y */
    public final String f161722y;

    /* JADX INFO: renamed from: z */
    public final String f161723z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37754s0(AbstractC38794c0 details, String str, String str2) {
        super(details);
        AbstractC22676k.m65750j(details, "details");
        this.f161721x = details;
        this.f161722y = str;
        this.f161723z = str2;
    }

    /* JADX INFO: renamed from: i */
    public static C37754s0 m121161i(C37754s0 c37754s0, AbstractC38794c0 details, String str, int i13) {
        if ((i13 & 1) != 0) {
            details = c37754s0.f161721x;
        }
        String str2 = c37754s0.f161722y;
        if ((i13 & 4) != 0) {
            str = c37754s0.f161723z;
        }
        AbstractC22676k.m65750j(details, "details");
        return new C37754s0(details, str2, str);
    }

    @Override // p599wz.AbstractC37760u0
    /* JADX INFO: renamed from: b */
    public final String mo121162b() {
        return this.f161723z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37754s0)) {
            return false;
        }
        C37754s0 c37754s0 = (C37754s0) obj;
        return AbstractC22676k.m65745e(this.f161721x, c37754s0.f161721x) && AbstractC22676k.m65745e(this.f161722y, c37754s0.f161722y) && AbstractC22676k.m65745e(this.f161723z, c37754s0.f161723z);
    }

    @Override // p599wz.AbstractC37760u0
    /* JADX INFO: renamed from: f */
    public final String mo121163f() {
        return this.f161722y;
    }

    @Override // p599wz.AbstractC37760u0
    /* JADX INFO: renamed from: h */
    public final AbstractC38794c0 mo121164h() {
        return this.f161721x;
    }

    public final int hashCode() {
        int iHashCode = this.f161721x.hashCode() * 31;
        String str = this.f161722y;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f161723z;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("ConsumerPaymentDetails(details=");
        sb4.append(this.f161721x);
        sb4.append(", collectedCvc=");
        sb4.append(this.f161722y);
        sb4.append(", billingPhone=");
        return AbstractC25012a.m73376i(this.f161723z, ")", sb4);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f161721x, i13);
        dest.writeString(this.f161722y);
        dest.writeString(this.f161723z);
    }
}
