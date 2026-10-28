package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.q2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38931q2 implements InterfaceC38949s2 {
    public static final Parcelable.Creator<C38931q2> CREATOR = new C38992x0(28);

    /* JADX INFO: renamed from: w */
    public final String f167599w;

    /* JADX INFO: renamed from: x */
    public final String f167600x;

    public C38931q2(String str, String last4) {
        AbstractC22676k.m65750j(last4, "last4");
        this.f167599w = str;
        this.f167600x = last4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38931q2)) {
            return false;
        }
        C38931q2 c38931q2 = (C38931q2) obj;
        return AbstractC22676k.m65745e(this.f167599w, c38931q2.f167599w) && AbstractC22676k.m65745e(this.f167600x, c38931q2.f167600x);
    }

    @Override // y00.InterfaceC38949s2
    public final String getLast4() {
        return this.f167600x;
    }

    public final int hashCode() {
        String str = this.f167599w;
        return this.f167600x.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return AbstractC2875y.m8300m("BankAccount(bankName=", this.f167599w, ", last4=", this.f167600x, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167599w);
        dest.writeString(this.f167600x);
    }
}
