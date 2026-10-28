package v00;

import android.os.Parcel;
import android.os.Parcelable;
import h20.C16744u2;
import p537ux.C35332g;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: v00.w */
/* JADX INFO: loaded from: classes6.dex */
public final class C35495w extends AbstractC35497y {
    public static final Parcelable.Creator<C35495w> CREATOR = new C35332g(24);

    /* JADX INFO: renamed from: w */
    public final C16744u2 f151082w;

    public C35495w(C16744u2 intentConfiguration) {
        AbstractC22676k.m65750j(intentConfiguration, "intentConfiguration");
        this.f151082w = intentConfiguration;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35495w) && AbstractC22676k.m65745e(this.f151082w, ((C35495w) obj).f151082w);
    }

    public final int hashCode() {
        return this.f151082w.hashCode();
    }

    public final String toString() {
        return "WithPaymentMethod(intentConfiguration=" + this.f151082w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        this.f151082w.writeToParcel(dest, i13);
    }
}
