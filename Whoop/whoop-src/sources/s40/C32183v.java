package s40;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29912j0;

/* JADX INFO: renamed from: s40.v */
/* JADX INFO: loaded from: classes6.dex */
public final class C32183v extends View.BaseSavedState implements Parcelable {
    public static final Parcelable.Creator<C32183v> CREATOR = new C29912j0(25);

    /* JADX INFO: renamed from: w */
    public final Parcelable f133292w;

    /* JADX INFO: renamed from: x */
    public final boolean f133293x;

    public C32183v(Parcelable parcelable, boolean z4) {
        super(parcelable);
        this.f133292w = parcelable;
        this.f133293x = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32183v)) {
            return false;
        }
        C32183v c32183v = (C32183v) obj;
        return AbstractC22676k.m65745e(this.f133292w, c32183v.f133292w) && this.f133293x == c32183v.f133293x;
    }

    public final int hashCode() {
        Parcelable parcelable = this.f133292w;
        return Boolean.hashCode(this.f133293x) + ((parcelable == null ? 0 : parcelable.hashCode()) * 31);
    }

    public final String toString() {
        return "SavedState(superSavedState=" + this.f133292w + ", isCbcEligible=" + this.f133293x + ")";
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f133292w, i13);
        dest.writeInt(this.f133293x ? 1 : 0);
    }
}
