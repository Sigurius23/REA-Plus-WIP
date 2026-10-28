package v00;

import android.os.Parcel;
import android.os.Parcelable;
import h20.C16744u2;
import p537ux.C35332g;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: v00.v */
/* JADX INFO: loaded from: classes6.dex */
public final class C35494v extends AbstractC35497y {
    public static final Parcelable.Creator<C35494v> CREATOR = new C35332g(23);

    /* JADX INFO: renamed from: w */
    public final C16744u2 f151081w;

    public C35494v(C16744u2 intentConfiguration) {
        AbstractC22676k.m65750j(intentConfiguration, "intentConfiguration");
        this.f151081w = intentConfiguration;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35494v) && AbstractC22676k.m65745e(this.f151081w, ((C35494v) obj).f151081w);
    }

    public final int hashCode() {
        return this.f151081w.hashCode();
    }

    public final String toString() {
        return "WithConfirmationToken(intentConfiguration=" + this.f151081w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        this.f151081w.writeToParcel(dest, i13);
    }
}
