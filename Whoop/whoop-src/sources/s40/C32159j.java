package s40;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29912j0;

/* JADX INFO: renamed from: s40.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C32159j extends View.BaseSavedState implements Parcelable {
    public static final Parcelable.Creator<C32159j> CREATOR = new C29912j0(23);

    /* JADX INFO: renamed from: w */
    public final Parcelable f133218w;

    /* JADX INFO: renamed from: x */
    public final C32161k f133219x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32159j(Parcelable parcelable, C32161k state) {
        super(parcelable);
        AbstractC22676k.m65750j(state, "state");
        this.f133218w = parcelable;
        this.f133219x = state;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32159j)) {
            return false;
        }
        C32159j c32159j = (C32159j) obj;
        return AbstractC22676k.m65745e(this.f133218w, c32159j.f133218w) && AbstractC22676k.m65745e(this.f133219x, c32159j.f133219x);
    }

    public final int hashCode() {
        Parcelable parcelable = this.f133218w;
        return this.f133219x.hashCode() + ((parcelable == null ? 0 : parcelable.hashCode()) * 31);
    }

    public final String toString() {
        return "SavedState(superSavedState=" + this.f133218w + ", state=" + this.f133219x + ")";
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f133218w, i13);
        this.f133219x.writeToParcel(dest, i13);
    }
}
