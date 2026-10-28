package e10;

import android.os.Parcel;
import android.os.Parcelable;
import h20.C16744u2;
import p031b9.AbstractC2875y;
import p096dq.C12280x;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;
import x30.AbstractC37926s0;
import y00.AbstractC38963t7;
import y00.AbstractC38970u5;
import y00.C38915o4;
import y00.EnumC38828f4;

/* JADX INFO: renamed from: e10.u0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12574u0 implements InterfaceC12576v0 {
    public static final Parcelable.Creator<C12574u0> CREATOR = new C12280x(22);

    /* JADX INFO: renamed from: E */
    public final String f42939E;

    /* JADX INFO: renamed from: w */
    public final C38915o4 f42940w;

    /* JADX INFO: renamed from: x */
    public final AbstractC38970u5 f42941x;

    /* JADX INFO: renamed from: y */
    public final boolean f42942y;

    /* JADX INFO: renamed from: z */
    public final String f42943z;

    public /* synthetic */ C12574u0(C38915o4 c38915o4, AbstractC38970u5 abstractC38970u5, int i13) {
        this(c38915o4, abstractC38970u5, (i13 & 4) == 0, null, null);
    }

    /* JADX INFO: renamed from: b */
    public static C12574u0 m35256b(C12574u0 c12574u0, AbstractC38970u5 abstractC38970u5) {
        C38915o4 paymentMethod = c12574u0.f42940w;
        boolean z4 = c12574u0.f42942y;
        String str = c12574u0.f42943z;
        String str2 = c12574u0.f42939E;
        c12574u0.getClass();
        AbstractC22676k.m65750j(paymentMethod, "paymentMethod");
        return new C12574u0(paymentMethod, abstractC38970u5, z4, str, str2);
    }

    @Override // e10.InterfaceC12576v0
    /* JADX INFO: renamed from: V */
    public final boolean mo35253V() {
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
        if (!(obj instanceof C12574u0)) {
            return false;
        }
        C12574u0 c12574u0 = (C12574u0) obj;
        return AbstractC22676k.m65745e(this.f42940w, c12574u0.f42940w) && AbstractC22676k.m65745e(this.f42941x, c12574u0.f42941x) && this.f42942y == c12574u0.f42942y && AbstractC22676k.m65745e(this.f42943z, c12574u0.f42943z) && AbstractC22676k.m65745e(this.f42939E, c12574u0.f42939E);
    }

    @Override // e10.InterfaceC12576v0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final C12574u0 mo35254Z(C16744u2 intentConfiguration) {
        AbstractC22676k.m65750j(intentConfiguration, "intentConfiguration");
        EnumC38828f4 enumC38828f4 = this.f42940w.f167511E;
        return m35256b(this, AbstractC37926s0.m121459K(this.f42941x, enumC38828f4 != null ? enumC38828f4.f167132w : null, intentConfiguration));
    }

    public final int hashCode() {
        int iHashCode = this.f42940w.hashCode() * 31;
        AbstractC38970u5 abstractC38970u5 = this.f42941x;
        int iM8289b = AbstractC2875y.m8289b((iHashCode + (abstractC38970u5 == null ? 0 : abstractC38970u5.hashCode())) * 31, 31, this.f42942y);
        String str = this.f42943z;
        int iHashCode2 = (iM8289b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f42939E;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // e10.InterfaceC12576v0
    /* JADX INFO: renamed from: n */
    public final AbstractC38970u5 mo35255n() {
        return this.f42941x;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Saved(paymentMethod=");
        sb4.append(this.f42940w);
        sb4.append(", optionsParams=");
        sb4.append(this.f42941x);
        sb4.append(", originatedFromWallet=");
        AbstractC38963t7.m124391u(sb4, this.f42942y, ", hCaptchaToken=", this.f42943z, ", attestationToken=");
        return AbstractC25012a.m73376i(this.f42939E, ")", sb4);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f42940w, i13);
        dest.writeParcelable(this.f42941x, i13);
        dest.writeInt(this.f42942y ? 1 : 0);
        dest.writeString(this.f42943z);
        dest.writeString(this.f42939E);
    }

    public C12574u0(C38915o4 paymentMethod, AbstractC38970u5 abstractC38970u5, boolean z4, String str, String str2) {
        AbstractC22676k.m65750j(paymentMethod, "paymentMethod");
        this.f42940w = paymentMethod;
        this.f42941x = abstractC38970u5;
        this.f42942y = z4;
        this.f42943z = str;
        this.f42939E = str2;
    }
}
