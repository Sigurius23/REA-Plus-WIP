package v00;

import android.os.Parcel;
import android.os.Parcelable;
import p088dc.AbstractC11895b;
import p537ux.C35332g;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: v00.z */
/* JADX INFO: loaded from: classes6.dex */
public final class C35498z extends AbstractC35455a0 {
    public static final Parcelable.Creator<C35498z> CREATOR = new C35332g(26);

    /* JADX INFO: renamed from: w */
    public final String f151084w;

    public C35498z(String clientSecret) {
        AbstractC22676k.m65750j(clientSecret, "clientSecret");
        this.f151084w = clientSecret;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35498z) && AbstractC22676k.m65745e(this.f151084w, ((C35498z) obj).f151084w);
    }

    public final int hashCode() {
        return this.f151084w.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("IntentFirst(clientSecret=", this.f151084w, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f151084w);
    }
}
