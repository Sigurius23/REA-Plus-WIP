package q30;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: q30.k0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C29914k0 extends AbstractC29918m0 {
    public static final Parcelable.Creator<C29914k0> CREATOR = new C29912j0(0);

    /* JADX INFO: renamed from: w */
    public final AbstractC29894a0 f122201w;

    public C29914k0(AbstractC29894a0 challengeResult) {
        AbstractC22676k.m65750j(challengeResult, "challengeResult");
        this.f122201w = challengeResult;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29914k0) && AbstractC22676k.m65745e(this.f122201w, ((C29914k0) obj).f122201w);
    }

    public final int hashCode() {
        return this.f122201w.hashCode();
    }

    public final String toString() {
        return "End(challengeResult=" + this.f122201w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f122201w, i13);
    }
}
