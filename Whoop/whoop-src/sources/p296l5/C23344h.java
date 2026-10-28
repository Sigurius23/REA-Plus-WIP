package p296l5;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import ih0.AbstractC18489d0;
import p266jz.C22060h;

/* JADX INFO: renamed from: l5.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C23344h extends View.BaseSavedState {
    public static final Parcelable.Creator<C23344h> CREATOR = new C22060h(21);

    /* JADX INFO: renamed from: w */
    public int f92555w;

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("HorizontalScrollView.SavedState{");
        sb4.append(Integer.toHexString(System.identityHashCode(this)));
        sb4.append(" scrollPosition=");
        return AbstractC18489d0.m53371l(sb4, this.f92555w, "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        super.writeToParcel(parcel, i13);
        parcel.writeInt(this.f92555w);
    }
}
