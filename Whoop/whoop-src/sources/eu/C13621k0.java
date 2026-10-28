package eu;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import c93.InterfaceC4339a;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.Iterator;
import java.util.List;
import p208i2.AbstractC17918w0;
import p375op.AbstractBinderC28074f;
import p375op.AbstractC28076h;
import p375op.C28073e;
import p375op.InterfaceC28075g;
import p529uo.AbstractC35135w;
import p530up.C35146b;
import p558vp.C36261e;
import p591wp.C37482c;
import p591wp.C37491l;
import p591wp.C37492m;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: eu.k0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C13621k0 extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C37482c f48243E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C13635v f48244w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ List f48245x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f48246y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C37482c f48247z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13621k0(C13635v c13635v, List list, long j7, C37482c c37482c, C37482c c37482c2) {
        super(0);
        this.f48244w = c13635v;
        this.f48245x = list;
        this.f48246y = j7;
        this.f48247z = c37482c;
        this.f48243E = c37482c2;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        InterfaceC28075g c28073e;
        C35146b c35146b = this.f48244w.f48320E;
        if (c35146b == null) {
            throw new IllegalStateException("Error adding Polyline");
        }
        C37492m c37492m = new C37492m();
        List list = this.f48245x;
        AbstractC35135w.m111095g(list, "points must not be null.");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c37492m.f160365w.add((LatLng) it.next());
        }
        c37492m.f160359G = false;
        c37492m.f160367y = AbstractC17918w0.m51506H(this.f48246y);
        c37492m.f160361I = this.f48247z;
        c37492m.f160358F = false;
        c37492m.f160362J = 0;
        c37492m.f160363K = null;
        c37492m.f160360H = this.f48243E;
        c37492m.f160357E = true;
        c37492m.f160366x = 10.0f;
        c37492m.f160368z = 0.0f;
        try {
            C36261e c36261e = c35146b.f149130a;
            Parcel parcelM57322k0 = c36261e.m57322k0();
            AbstractC28076h.m84851c(parcelM57322k0, c37492m);
            Parcel parcelM57321j0 = c36261e.m57321j0(parcelM57322k0, 9);
            IBinder strongBinder = parcelM57321j0.readStrongBinder();
            int i13 = AbstractBinderC28074f.f113569g;
            if (strongBinder == null) {
                c28073e = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                c28073e = iInterfaceQueryLocalInterface instanceof InterfaceC28075g ? (InterfaceC28075g) iInterfaceQueryLocalInterface : new C28073e(strongBinder, "com.google.android.gms.maps.model.internal.IPolylineDelegate", 3);
            }
            parcelM57321j0.recycle();
            C37491l c37491l = new C37491l(c28073e);
            c37491l.m120176a(null);
            return new C13627n0(c37491l);
        } catch (RemoteException e5) {
            throw new RuntimeRemoteException(e5);
        }
    }
}
