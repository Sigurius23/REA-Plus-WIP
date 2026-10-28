package p558vp;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.GoogleMapOptions;
import p072cp.BinderC10935b;
import p229ip.AbstractC20790a;
import p375op.AbstractBinderC28078j;
import p375op.AbstractC28076h;
import p375op.C28077i;
import p375op.InterfaceC28079k;

/* JADX INFO: renamed from: vp.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C36260d extends AbstractC20790a {
    /* JADX INFO: renamed from: m0 */
    public final C36257a m115716m0() {
        C36257a c36257a;
        Parcel parcelM57321j0 = m57321j0(m57322k0(), 4);
        IBinder strongBinder = parcelM57321j0.readStrongBinder();
        if (strongBinder == null) {
            c36257a = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            c36257a = iInterfaceQueryLocalInterface instanceof C36257a ? (C36257a) iInterfaceQueryLocalInterface : new C36257a(strongBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate", 3);
        }
        parcelM57321j0.recycle();
        return c36257a;
    }

    /* JADX INFO: renamed from: n0 */
    public final C36262f m115717n0(BinderC10935b binderC10935b, GoogleMapOptions googleMapOptions) {
        C36262f c36262f;
        Parcel parcelM57322k0 = m57322k0();
        AbstractC28076h.m84852d(parcelM57322k0, binderC10935b);
        AbstractC28076h.m84851c(parcelM57322k0, googleMapOptions);
        Parcel parcelM57321j0 = m57321j0(parcelM57322k0, 3);
        IBinder strongBinder = parcelM57321j0.readStrongBinder();
        if (strongBinder == null) {
            c36262f = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            c36262f = iInterfaceQueryLocalInterface instanceof C36262f ? (C36262f) iInterfaceQueryLocalInterface : new C36262f(strongBinder, "com.google.android.gms.maps.internal.IMapViewDelegate", 3);
        }
        parcelM57321j0.recycle();
        return c36262f;
    }

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC28079k m115718o0() {
        InterfaceC28079k c28077i;
        Parcel parcelM57321j0 = m57321j0(m57322k0(), 5);
        IBinder strongBinder = parcelM57321j0.readStrongBinder();
        int i13 = AbstractBinderC28078j.f113571g;
        if (strongBinder == null) {
            c28077i = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            c28077i = iInterfaceQueryLocalInterface instanceof InterfaceC28079k ? (InterfaceC28079k) iInterfaceQueryLocalInterface : new C28077i(strongBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate", 3);
        }
        parcelM57321j0.recycle();
        return c28077i;
    }
}
