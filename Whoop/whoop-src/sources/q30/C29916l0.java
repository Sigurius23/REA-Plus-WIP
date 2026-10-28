package q30;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;
import t30.C33517s;

/* JADX INFO: renamed from: q30.l0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C29916l0 extends AbstractC29918m0 {
    public static final Parcelable.Creator<C29916l0> CREATOR = new C29912j0(1);

    /* JADX INFO: renamed from: w */
    public final C33517s f122207w;

    public C29916l0(C33517s challengeViewArgs) {
        AbstractC22676k.m65750j(challengeViewArgs, "challengeViewArgs");
        this.f122207w = challengeViewArgs;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29916l0) && AbstractC22676k.m65745e(this.f122207w, ((C29916l0) obj).f122207w);
    }

    public final int hashCode() {
        return this.f122207w.hashCode();
    }

    public final String toString() {
        return "Start(challengeViewArgs=" + this.f122207w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        this.f122207w.writeToParcel(dest, i13);
    }
}
