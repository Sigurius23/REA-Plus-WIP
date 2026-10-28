package p102dy;

import android.os.Parcel;
import android.os.Parcelable;
import p088dc.AbstractC11895b;
import p096dq.C12280x;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: dy.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C12436e implements InterfaceC12437f {
    public static final Parcelable.Creator<C12436e> CREATOR = new C12280x(16);

    /* JADX INFO: renamed from: w */
    public final String f42369w;

    public C12436e(String token) {
        AbstractC22676k.m65750j(token, "token");
        this.f42369w = token;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C12436e) && AbstractC22676k.m65745e(this.f42369w, ((C12436e) obj).f42369w);
    }

    public final int hashCode() {
        return this.f42369w.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("Success(token=", this.f42369w, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f42369w);
    }
}
