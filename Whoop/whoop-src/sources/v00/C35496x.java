package v00;

import android.os.Parcel;
import android.os.Parcelable;
import h20.C16744u2;
import p537ux.C35332g;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: v00.x */
/* JADX INFO: loaded from: classes6.dex */
public final class C35496x extends AbstractC35497y {
    public static final Parcelable.Creator<C35496x> CREATOR = new C35332g(25);

    /* JADX INFO: renamed from: w */
    public final C16744u2 f151083w;

    public C35496x(C16744u2 intentConfiguration) {
        AbstractC22676k.m65750j(intentConfiguration, "intentConfiguration");
        this.f151083w = intentConfiguration;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35496x) && AbstractC22676k.m65745e(this.f151083w, ((C35496x) obj).f151083w);
    }

    public final int hashCode() {
        return this.f151083w.hashCode();
    }

    public final String toString() {
        return "WithSharedPaymentToken(intentConfiguration=" + this.f151083w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        this.f151083w.writeToParcel(dest, i13);
    }
}
