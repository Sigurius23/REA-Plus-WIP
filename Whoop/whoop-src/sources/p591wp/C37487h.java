package p591wp;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import p072cp.BinderC10935b;
import p375op.AbstractC28076h;
import p375op.C28069a;
import p375op.InterfaceC28071c;
import p529uo.AbstractC35135w;

/* JADX INFO: renamed from: wp.h */
/* JADX INFO: loaded from: classes6.dex */
public class C37487h {

    /* JADX INFO: renamed from: a */
    public final InterfaceC28071c f160331a;

    public C37487h(InterfaceC28071c interfaceC28071c) {
        AbstractC35135w.m111094f(interfaceC28071c);
        this.f160331a = interfaceC28071c;
    }

    /* JADX INFO: renamed from: a */
    public final LatLng m120172a() {
        try {
            C28069a c28069a = (C28069a) this.f160331a;
            Parcel parcelM57321j0 = c28069a.m57321j0(c28069a.m57322k0(), 4);
            LatLng latLng = (LatLng) AbstractC28076h.m84849a(parcelM57321j0, LatLng.CREATOR);
            parcelM57321j0.recycle();
            return latLng;
        } catch (RemoteException e5) {
            throw new RuntimeRemoteException(e5);
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m120173b() {
        try {
            C28069a c28069a = (C28069a) this.f160331a;
            Parcel parcelM57321j0 = c28069a.m57321j0(c28069a.m57322k0(), 13);
            int i13 = AbstractC28076h.f113570a;
            boolean z4 = parcelM57321j0.readInt() != 0;
            parcelM57321j0.recycle();
            return z4;
        } catch (RemoteException e5) {
            throw new RuntimeRemoteException(e5);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m120174c(Object obj) {
        try {
            InterfaceC28071c interfaceC28071c = this.f160331a;
            BinderC10935b binderC10935b = new BinderC10935b(obj);
            C28069a c28069a = (C28069a) interfaceC28071c;
            Parcel parcelM57322k0 = c28069a.m57322k0();
            AbstractC28076h.m84852d(parcelM57322k0, binderC10935b);
            c28069a.m57323l0(parcelM57322k0, 29);
        } catch (RemoteException e5) {
            throw new RuntimeRemoteException(e5);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m120175d() {
        try {
            C28069a c28069a = (C28069a) this.f160331a;
            c28069a.m57323l0(c28069a.m57322k0(), 11);
        } catch (RemoteException e5) {
            throw new RuntimeRemoteException(e5);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C37487h)) {
            return false;
        }
        try {
            InterfaceC28071c interfaceC28071c = this.f160331a;
            InterfaceC28071c interfaceC28071c2 = ((C37487h) obj).f160331a;
            C28069a c28069a = (C28069a) interfaceC28071c;
            Parcel parcelM57322k0 = c28069a.m57322k0();
            AbstractC28076h.m84852d(parcelM57322k0, interfaceC28071c2);
            Parcel parcelM57321j0 = c28069a.m57321j0(parcelM57322k0, 16);
            boolean z4 = parcelM57321j0.readInt() != 0;
            parcelM57321j0.recycle();
            return z4;
        } catch (RemoteException e5) {
            throw new RuntimeRemoteException(e5);
        }
    }

    public final int hashCode() {
        try {
            C28069a c28069a = (C28069a) this.f160331a;
            Parcel parcelM57321j0 = c28069a.m57321j0(c28069a.m57322k0(), 17);
            int i13 = parcelM57321j0.readInt();
            parcelM57321j0.recycle();
            return i13;
        } catch (RemoteException e5) {
            throw new RuntimeRemoteException(e5);
        }
    }
}
