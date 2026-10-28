package p504tq;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import p319m4.AbstractC25012a;
import p486sp.C32854e;

/* JADX INFO: renamed from: tq.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C34079a extends View.BaseSavedState {
    public static final Parcelable.Creator<C34079a> CREATOR = new C32854e(11);

    /* JADX INFO: renamed from: w */
    public int f142916w;

    public final String toString() {
        String str;
        StringBuilder sb4 = new StringBuilder("MaterialCheckBox.SavedState{");
        sb4.append(Integer.toHexString(System.identityHashCode(this)));
        sb4.append(" CheckedState=");
        int i13 = this.f142916w;
        if (i13 != 1) {
            str = i13 != 2 ? "unchecked" : "indeterminate";
        } else {
            str = "checked";
        }
        return AbstractC25012a.m73376i(str, "}", sb4);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        super.writeToParcel(parcel, i13);
        parcel.writeValue(Integer.valueOf(this.f142916w));
    }
}
