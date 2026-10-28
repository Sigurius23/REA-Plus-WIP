package nr;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C1312k0;
import p002a0.C0021f1;
import p544v5.AbstractC35701b;

/* JADX INFO: renamed from: nr.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C27067a extends AbstractC35701b {
    public static final Parcelable.Creator<C27067a> CREATOR = new C1312k0(6);

    /* JADX INFO: renamed from: y */
    public final C0021f1 f108200y;

    public C27067a(Parcelable parcelable) {
        super(parcelable);
        this.f108200y = new C0021f1(0);
    }

    public final String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f108200y + "}";
    }

    @Override // p544v5.AbstractC35701b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        super.writeToParcel(parcel, i13);
        C0021f1 c0021f1 = this.f108200y;
        int i14 = c0021f1.f50y;
        parcel.writeInt(i14);
        String[] strArr = new String[i14];
        Bundle[] bundleArr = new Bundle[i14];
        for (int i15 = 0; i15 < i14; i15++) {
            strArr[i15] = (String) c0021f1.m38g(i15);
            bundleArr[i15] = (Bundle) c0021f1.m42k(i15);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public C27067a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i13 = parcel.readInt();
        String[] strArr = new String[i13];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[i13];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f108200y = new C0021f1(i13);
        for (int i14 = 0; i14 < i13; i14++) {
            this.f108200y.put(strArr[i14], bundleArr[i14]);
        }
    }
}
