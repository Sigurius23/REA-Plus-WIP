package to;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.InterfaceC4973d;
import com.google.android.gms.common.api.Status;
import java.util.Map;
import p031b9.AbstractC2875y;
import p529uo.AbstractC35135w;
import pg3.C29203o;

/* JADX INFO: renamed from: to.k0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C33982k0 extends AbstractC33988n0 {

    /* JADX INFO: renamed from: b */
    public final AbstractC33967d f142453b;

    public C33982k0(int i13, AbstractC33967d abstractC33967d) {
        super(i13);
        AbstractC35135w.m111095g(abstractC33967d, "Null methods are not runnable.");
        this.f142453b = abstractC33967d;
    }

    @Override // to.AbstractC33988n0
    /* JADX INFO: renamed from: a */
    public final void mo107451a(Status status) {
        try {
            this.f142453b.m107424d0(status);
        } catch (IllegalStateException e5) {
            Log.w("ApiCallRunner", "Exception reporting failure", e5);
        }
    }

    @Override // to.AbstractC33988n0
    /* JADX INFO: renamed from: b */
    public final void mo107452b(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        try {
            this.f142453b.m107424d0(new Status(10, AbstractC2875y.m8304q(new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length()), simpleName, ": ", localizedMessage), null, null));
        } catch (IllegalStateException e5) {
            Log.w("ApiCallRunner", "Exception reporting failure", e5);
        }
    }

    @Override // to.AbstractC33988n0
    /* JADX INFO: renamed from: c */
    public final void mo107453c(C29203o c29203o, boolean z4) {
        Boolean boolValueOf = Boolean.valueOf(z4);
        Map map = (Map) c29203o.f118198w;
        AbstractC33967d abstractC33967d = this.f142453b;
        map.put(abstractC33967d, boolValueOf);
        abstractC33967d.m15601W(new C33998s0(c29203o, abstractC33967d));
    }

    @Override // to.AbstractC33988n0
    /* JADX INFO: renamed from: d */
    public final void mo107454d(C34003v c34003v) throws DeadObjectException {
        try {
            AbstractC33967d abstractC33967d = this.f142453b;
            InterfaceC4973d interfaceC4973d = c34003v.f142495g;
            abstractC33967d.getClass();
            try {
                abstractC33967d.mo97692c0(interfaceC4973d);
            } catch (DeadObjectException e5) {
                abstractC33967d.m107424d0(new Status(8, e5.getLocalizedMessage(), null, null));
                throw e5;
            } catch (RemoteException e13) {
                abstractC33967d.m107424d0(new Status(8, e13.getLocalizedMessage(), null, null));
            }
        } catch (RuntimeException e14) {
            mo107452b(e14);
        }
    }
}
