package p474s;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import q30.C29912j0;

/* JADX INFO: renamed from: s.j0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C31969j0 extends View.BaseSavedState {
    public static final Parcelable.Creator<C31969j0> CREATOR = new C29912j0(17);

    /* JADX INFO: renamed from: w */
    public boolean f132728w;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        super.writeToParcel(parcel, i13);
        parcel.writeByte(this.f132728w ? (byte) 1 : (byte) 0);
    }
}
