package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.r0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38938r0 extends AbstractC38956t0 {
    public static final Parcelable.Creator<C38938r0> CREATOR = new C38873k(25);

    /* JADX INFO: renamed from: w */
    public final C38813e f167622w;

    public C38938r0(C38813e bankAccount) {
        AbstractC22676k.m65750j(bankAccount, "bankAccount");
        this.f167622w = bankAccount;
    }

    @Override // y00.AbstractC38956t0
    /* JADX INFO: renamed from: b */
    public final EnumC38852h8 mo124369b() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C38938r0) && AbstractC22676k.m65745e(this.f167622w, ((C38938r0) obj).f167622w);
    }

    public final int hashCode() {
        return this.f167622w.hashCode();
    }

    public final String toString() {
        return "CustomerBankAccount(bankAccount=" + this.f167622w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f167622w, i13);
    }
}
