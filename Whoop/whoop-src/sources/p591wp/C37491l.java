package p591wp;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import p072cp.BinderC10935b;
import p375op.AbstractC28076h;
import p375op.C28073e;
import p375op.InterfaceC28075g;
import p529uo.AbstractC35135w;

/* JADX INFO: renamed from: wp.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C37491l {

    /* JADX INFO: renamed from: a */
    public final InterfaceC28075g f160356a;

    public C37491l(InterfaceC28075g interfaceC28075g) {
        AbstractC35135w.m111094f(interfaceC28075g);
        this.f160356a = interfaceC28075g;
    }

    /* JADX INFO: renamed from: a */
    public final void m120176a(Object obj) {
        try {
            InterfaceC28075g interfaceC28075g = this.f160356a;
            BinderC10935b binderC10935b = new BinderC10935b(obj);
            C28073e c28073e = (C28073e) interfaceC28075g;
            Parcel parcelM57322k0 = c28073e.m57322k0();
            AbstractC28076h.m84852d(parcelM57322k0, binderC10935b);
            c28073e.m57323l0(parcelM57322k0, 27);
        } catch (RemoteException e5) {
            throw new RuntimeRemoteException(e5);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C37491l)) {
            return false;
        }
        try {
            InterfaceC28075g interfaceC28075g = this.f160356a;
            InterfaceC28075g interfaceC28075g2 = ((C37491l) obj).f160356a;
            C28073e c28073e = (C28073e) interfaceC28075g;
            Parcel parcelM57322k0 = c28073e.m57322k0();
            AbstractC28076h.m84852d(parcelM57322k0, interfaceC28075g2);
            Parcel parcelM57321j0 = c28073e.m57321j0(parcelM57322k0, 15);
            boolean z4 = parcelM57321j0.readInt() != 0;
            parcelM57321j0.recycle();
            return z4;
        } catch (RemoteException e5) {
            throw new RuntimeRemoteException(e5);
        }
    }

    public final int hashCode() {
        try {
            C28073e c28073e = (C28073e) this.f160356a;
            Parcel parcelM57321j0 = c28073e.m57321j0(c28073e.m57322k0(), 16);
            int i13 = parcelM57321j0.readInt();
            parcelM57321j0.recycle();
            return i13;
        } catch (RemoteException e5) {
            throw new RuntimeRemoteException(e5);
        }
    }
}
