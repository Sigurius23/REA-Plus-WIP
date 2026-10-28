package p190hc;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.C1312k0;

/* JADX INFO: renamed from: hc.m */
/* JADX INFO: loaded from: classes5.dex */
public final class C17150m extends View.BaseSavedState {
    public static final Parcelable.Creator<C17150m> CREATOR = new C1312k0(4);

    /* JADX INFO: renamed from: w */
    public int f65833w;

    /* JADX INFO: renamed from: x */
    public int f65834x;

    /* JADX INFO: renamed from: y */
    public Parcelable f65835y;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        super.writeToParcel(parcel, i13);
        parcel.writeInt(this.f65833w);
        parcel.writeInt(this.f65834x);
        parcel.writeParcelable(this.f65835y, i13);
    }
}
