package p530up;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.HashMap;
import p072cp.InterfaceC10934a;
import p375op.AbstractC28076h;
import p508ty.C34249c;
import p529uo.AbstractC35135w;
import p558vp.C36258b;
import p558vp.C36261e;

/* JADX INFO: renamed from: up.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C35146b {

    /* JADX INFO: renamed from: a */
    public final C36261e f149130a;

    /* JADX INFO: renamed from: b */
    public C34249c f149131b;

    public C35146b(C36261e c36261e) {
        new HashMap();
        new HashMap();
        AbstractC35135w.m111094f(c36261e);
        this.f149130a = c36261e;
    }

    /* JADX INFO: renamed from: a */
    public final CameraPosition m111146a() {
        try {
            C36261e c36261e = this.f149130a;
            Parcel parcelM57321j0 = c36261e.m57321j0(c36261e.m57322k0(), 1);
            CameraPosition cameraPosition = (CameraPosition) AbstractC28076h.m84849a(parcelM57321j0, CameraPosition.CREATOR);
            parcelM57321j0.recycle();
            return cameraPosition;
        } catch (RemoteException e5) {
            throw new RuntimeRemoteException(e5);
        }
    }

    /* JADX INFO: renamed from: b */
    public final C34249c m111147b() {
        C36258b c36258b;
        try {
            if (this.f149131b == null) {
                C36261e c36261e = this.f149130a;
                Parcel parcelM57321j0 = c36261e.m57321j0(c36261e.m57322k0(), 25);
                IBinder strongBinder = parcelM57321j0.readStrongBinder();
                if (strongBinder == null) {
                    c36258b = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    c36258b = iInterfaceQueryLocalInterface instanceof C36258b ? (C36258b) iInterfaceQueryLocalInterface : new C36258b(strongBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate", 3);
                }
                parcelM57321j0.recycle();
                this.f149131b = new C34249c(c36258b, 9);
            }
            return this.f149131b;
        } catch (RemoteException e5) {
            throw new RuntimeRemoteException(e5);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m111148c(C35145a c35145a) {
        try {
            C36261e c36261e = this.f149130a;
            InterfaceC10934a interfaceC10934a = c35145a.f149129a;
            Parcel parcelM57322k0 = c36261e.m57322k0();
            AbstractC28076h.m84852d(parcelM57322k0, interfaceC10934a);
            c36261e.m57323l0(parcelM57322k0, 4);
        } catch (RemoteException e5) {
            throw new RuntimeRemoteException(e5);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m111149d() {
        try {
            C36261e c36261e = this.f149130a;
            c36261e.m57323l0(c36261e.m57322k0(), 8);
        } catch (RemoteException e5) {
            throw new RuntimeRemoteException(e5);
        }
    }
}
