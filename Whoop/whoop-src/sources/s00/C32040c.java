package s00;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29912j0;

/* JADX INFO: renamed from: s00.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C32040c implements Parcelable {
    public static final Parcelable.Creator<C32040c> CREATOR = new C29912j0(18);

    /* JADX INFO: renamed from: w */
    public final AbstractC32044g f132914w;

    public C32040c(AbstractC32044g verificationState) {
        AbstractC22676k.m65750j(verificationState, "verificationState");
        this.f132914w = verificationState;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C32040c) && AbstractC22676k.m65745e(this.f132914w, ((C32040c) obj).f132914w);
    }

    public final int hashCode() {
        return this.f132914w.hashCode();
    }

    public final String toString() {
        return "LinkInlineState(verificationState=" + this.f132914w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f132914w, i13);
    }
}
