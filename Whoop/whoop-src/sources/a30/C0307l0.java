package a30;

import a10.C0113a;
import android.os.Parcel;
import android.os.Parcelable;
import j00.EnumC21096d0;
import p599wz.C37718g0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a30.l0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C0307l0 implements InterfaceC0310m0 {
    public static final Parcelable.Creator<C0307l0> CREATOR = new C0113a(12);

    /* JADX INFO: renamed from: w */
    public final C37718g0 f1058w;

    /* JADX INFO: renamed from: x */
    public final EnumC0304k0 f1059x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC0301j0 f1060y;

    /* JADX INFO: renamed from: z */
    public final EnumC21096d0 f1061z;

    public C0307l0(C37718g0 configuration, EnumC0304k0 loginState, InterfaceC0301j0 signupModeResult) {
        AbstractC22676k.m65750j(configuration, "configuration");
        AbstractC22676k.m65750j(loginState, "loginState");
        AbstractC22676k.m65750j(signupModeResult, "signupModeResult");
        this.f1058w = configuration;
        this.f1059x = loginState;
        this.f1060y = signupModeResult;
        this.f1061z = signupModeResult.mo823g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0307l0)) {
            return false;
        }
        C0307l0 c0307l0 = (C0307l0) obj;
        return AbstractC22676k.m65745e(this.f1058w, c0307l0.f1058w) && this.f1059x == c0307l0.f1059x && AbstractC22676k.m65745e(this.f1060y, c0307l0.f1060y);
    }

    public final int hashCode() {
        return this.f1060y.hashCode() + ((this.f1059x.hashCode() + (this.f1058w.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LinkState(configuration=" + this.f1058w + ", loginState=" + this.f1059x + ", signupModeResult=" + this.f1060y + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        this.f1058w.writeToParcel(dest, i13);
        dest.writeString(this.f1059x.name());
        dest.writeParcelable(this.f1060y, i13);
    }
}
