package v00;

import android.os.Parcel;
import android.os.Parcelable;
import p088dc.AbstractC11895b;
import p537ux.C35332g;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: v00.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C35488r extends AbstractC35455a0 {
    public static final Parcelable.Creator<C35488r> CREATOR = new C35332g(20);

    /* JADX INFO: renamed from: w */
    public final String f151068w;

    public C35488r(String id4) {
        AbstractC22676k.m65750j(id4, "id");
        this.f151068w = id4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35488r) && AbstractC22676k.m65745e(this.f151068w, ((C35488r) obj).f151068w);
    }

    public final int hashCode() {
        return this.f151068w.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("CheckoutSession(id=", this.f151068w, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f151068w);
    }
}
