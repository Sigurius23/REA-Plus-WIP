package q00;

import android.os.Parcel;
import android.os.Parcelable;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: q00.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C29725l implements InterfaceC29729n {
    public static final Parcelable.Creator<C29725l> CREATOR = new C29723k(1);

    /* JADX INFO: renamed from: w */
    public final String f121571w;

    public C29725l(String str) {
        this.f121571w = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29725l) && AbstractC22676k.m65745e(this.f121571w, ((C29725l) obj).f121571w);
    }

    public final int hashCode() {
        String str = this.f121571w;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("BankAccount(bankIconCode=", this.f121571w, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f121571w);
    }
}
