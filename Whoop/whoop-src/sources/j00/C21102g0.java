package j00;

import android.os.Parcel;
import android.os.Parcelable;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: j00.g0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C21102g0 extends AbstractC21106i0 {
    public static final Parcelable.Creator<C21102g0> CREATOR = new C21100f0(0);

    /* JADX INFO: renamed from: w */
    public final String f80011w;

    public C21102g0(String email) {
        AbstractC22676k.m65750j(email, "email");
        this.f80011w = email;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C21102g0) && AbstractC22676k.m65745e(this.f80011w, ((C21102g0) obj).f80011w);
    }

    public final int hashCode() {
        return this.f80011w.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("SignIn(email=", this.f80011w, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f80011w);
    }
}
