package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import p103e.AbstractBinderC12474a;
import p103e.InterfaceC12475b;
import p532ur.C35176e;
import p559vr.C36298h;
import p559vr.C36299i;
import p623xr.C38605a;
import p623xr.C38606b;
import p715kotlin.jvm.internal.AbstractC22676k;
import sr.C32895c;

/* JADX INFO: renamed from: androidx.room.b0 */
/* JADX INFO: loaded from: classes5.dex */
public final class ServiceConnectionC1767b0 implements ServiceConnection {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f6962w;

    /* JADX INFO: renamed from: x */
    public Object f6963x;

    public /* synthetic */ ServiceConnectionC1767b0() {
        this.f6962w = 1;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName name, IBinder service) {
        InterfaceC1820q interfaceC1820q;
        IInterface iInterfaceQueryLocalInterface;
        switch (this.f6962w) {
            case 0:
                AbstractC22676k.m65750j(name, "name");
                AbstractC22676k.m65750j(service, "service");
                C1771c0 c1771c0 = (C1771c0) this.f6963x;
                int i13 = BinderC1775d0.f6998g;
                IInterface iInterfaceQueryLocalInterface2 = service.queryLocalInterface(InterfaceC1820q.f7162c);
                if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof InterfaceC1820q)) {
                    C1817p c1817p = new C1817p();
                    c1817p.f7141f = service;
                    interfaceC1820q = c1817p;
                } else {
                    interfaceC1820q = (InterfaceC1820q) iInterfaceQueryLocalInterface2;
                }
                c1771c0.f6986g = interfaceC1820q;
                try {
                    c1771c0.f6985f = interfaceC1820q.mo5413H(c1771c0.f6989j, c1771c0.f6980a);
                    return;
                } catch (RemoteException e5) {
                    Log.w("ROOM", "Cannot register multi-instance invalidation callback", e5);
                    return;
                }
            case 1:
                if (((Context) this.f6963x) == null) {
                    throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
                }
                int i14 = AbstractBinderC12474a.f42575f;
                if (service != null && (iInterfaceQueryLocalInterface = service.queryLocalInterface(InterfaceC12475b.f42576d)) != null && (iInterfaceQueryLocalInterface instanceof InterfaceC12475b)) {
                }
                AbstractC22676k.m65750j(name, "componentName");
                return;
            case 2:
                C36299i c36299i = (C36299i) this.f6963x;
                c36299i.f155543b.m31831q("ServiceConnectionImpl.onServiceConnected(%s)", name);
                c36299i.m116021a().post(new C35176e(this, service));
                return;
            default:
                C38606b c38606b = (C38606b) this.f6963x;
                c38606b.f166095b.m123818b("ServiceConnectionImpl.onServiceConnected(%s)", name);
                c38606b.m123803a().post(new C32895c(this, service));
                return;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName name) {
        switch (this.f6962w) {
            case 0:
                AbstractC22676k.m65750j(name, "name");
                ((C1771c0) this.f6963x).f6986g = null;
                break;
            case 1:
                AbstractC22676k.m65750j(name, "name");
                break;
            case 2:
                C36299i c36299i = (C36299i) this.f6963x;
                c36299i.f155543b.m31831q("ServiceConnectionImpl.onServiceDisconnected(%s)", name);
                c36299i.m116021a().post(new C36298h(this, 1));
                break;
            default:
                C38606b c38606b = (C38606b) this.f6963x;
                c38606b.f166095b.m123818b("ServiceConnectionImpl.onServiceDisconnected(%s)", name);
                c38606b.m123803a().post(new C38605a(this, 0));
                break;
        }
    }

    public /* synthetic */ ServiceConnectionC1767b0(Object obj, int i13) {
        this.f6962w = i13;
        this.f6963x = obj;
    }
}
