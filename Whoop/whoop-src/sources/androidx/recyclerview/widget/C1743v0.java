package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: androidx.recyclerview.widget.v0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1743v0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6890a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f6890a) {
            case 0:
                C1747w0 c1747w0 = new C1747w0();
                c1747w0.f6909w = parcel.readInt();
                c1747w0.f6910x = parcel.readInt();
                c1747w0.f6911y = parcel.readInt() == 1;
                return c1747w0;
            case 1:
                C1741u2 c1741u2 = new C1741u2();
                c1741u2.f6883w = parcel.readInt();
                c1741u2.f6884x = parcel.readInt();
                c1741u2.f6886z = parcel.readInt() == 1;
                int i13 = parcel.readInt();
                if (i13 > 0) {
                    int[] iArr = new int[i13];
                    c1741u2.f6885y = iArr;
                    parcel.readIntArray(iArr);
                }
                return c1741u2;
            default:
                C1745v2 c1745v2 = new C1745v2();
                c1745v2.f6901w = parcel.readInt();
                c1745v2.f6902x = parcel.readInt();
                int i14 = parcel.readInt();
                c1745v2.f6903y = i14;
                if (i14 > 0) {
                    int[] iArr2 = new int[i14];
                    c1745v2.f6904z = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i15 = parcel.readInt();
                c1745v2.f6895E = i15;
                if (i15 > 0) {
                    int[] iArr3 = new int[i15];
                    c1745v2.f6896F = iArr3;
                    parcel.readIntArray(iArr3);
                }
                c1745v2.f6898H = parcel.readInt() == 1;
                c1745v2.f6899I = parcel.readInt() == 1;
                c1745v2.f6900J = parcel.readInt() == 1;
                c1745v2.f6897G = parcel.readArrayList(C1741u2.class.getClassLoader());
                return c1745v2;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        switch (this.f6890a) {
            case 0:
                return new C1747w0[i13];
            case 1:
                return new C1741u2[i13];
            default:
                return new C1745v2[i13];
        }
    }
}
