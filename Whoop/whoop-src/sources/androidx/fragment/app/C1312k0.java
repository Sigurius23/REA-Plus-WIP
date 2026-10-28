package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.textfield.C5049h0;
import cr.C11063a;
import lr.C24692d;
import nr.C27067a;
import p144fc.C14354j;
import p190hc.C17150m;
import p404pq.C29456d;
import p413q4.C29961f;
import p434qq.C30542b;
import p474s.C32003r2;
import p544v5.AbstractC35701b;

/* JADX INFO: renamed from: androidx.fragment.app.k0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1312k0 implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5662a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f5662a) {
            case 0:
                return new C1316l0(parcel, null);
            case 1:
                return new C5049h0(parcel, null);
            case 2:
                return new C11063a(parcel, null);
            case 3:
                return new C14354j(parcel, null);
            case 4:
                C17150m c17150m = new C17150m(parcel, null);
                c17150m.f65833w = parcel.readInt();
                c17150m.f65834x = parcel.readInt();
                c17150m.f65835y = parcel.readParcelable(null);
                return c17150m;
            case 5:
                return new C24692d(parcel, (ClassLoader) null);
            case 6:
                return new C27067a(parcel, null);
            case 7:
                return new C29456d(parcel, (ClassLoader) null);
            case 8:
                return new C29961f(parcel, null);
            case 9:
                return new C30542b(parcel, null);
            case 10:
                return new C32003r2(parcel, null);
            default:
                if (parcel.readParcelable(null) == null) {
                    return AbstractC35701b.f151899x;
                }
                throw new IllegalStateException("superState must be null");
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        switch (this.f5662a) {
            case 0:
                return new C1316l0[i13];
            case 1:
                return new C5049h0[i13];
            case 2:
                return new C11063a[i13];
            case 3:
                return new C14354j[i13];
            case 4:
                return new C17150m[i13];
            case 5:
                return new C24692d[i13];
            case 6:
                return new C27067a[i13];
            case 7:
                return new C29456d[i13];
            case 8:
                return new C29961f[i13];
            case 9:
                return new C30542b[i13];
            case 10:
                return new C32003r2[i13];
            default:
                return new AbstractC35701b[i13];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f5662a) {
            case 0:
                return new C1316l0(parcel, classLoader);
            case 1:
                return new C5049h0(parcel, classLoader);
            case 2:
                return new C11063a(parcel, classLoader);
            case 3:
                return new C14354j(parcel, classLoader);
            case 4:
                C17150m c17150m = new C17150m(parcel, classLoader);
                c17150m.f65833w = parcel.readInt();
                c17150m.f65834x = parcel.readInt();
                c17150m.f65835y = parcel.readParcelable(classLoader);
                return c17150m;
            case 5:
                return new C24692d(parcel, classLoader);
            case 6:
                return new C27067a(parcel, classLoader);
            case 7:
                return new C29456d(parcel, classLoader);
            case 8:
                return new C29961f(parcel, classLoader);
            case 9:
                return new C30542b(parcel, classLoader);
            case 10:
                return new C32003r2(parcel, classLoader);
            default:
                if (parcel.readParcelable(classLoader) == null) {
                    return AbstractC35701b.f151899x;
                }
                throw new IllegalStateException("superState must be null");
        }
    }
}
