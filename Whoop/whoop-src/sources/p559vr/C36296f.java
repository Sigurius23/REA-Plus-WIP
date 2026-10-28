package p559vr;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.Iterator;
import p073cq.C11040i;
import p623xr.AbstractRunnableC38625u;
import p623xr.C38606b;

/* JADX INFO: renamed from: vr.f */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C36296f implements IBinder.DeathRecipient {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f155534a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f155535b;

    public /* synthetic */ C36296f(Object obj, int i13) {
        this.f155534a = i13;
        this.f155535b = obj;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        switch (this.f155534a) {
            case 0:
                C36299i c36299i = (C36299i) this.f155535b;
                c36299i.f155543b.m31831q("reportBinderDeath", new Object[0]);
                if (c36299i.f155550i.get() != null) {
                    throw new ClassCastException();
                }
                c36299i.f155543b.m31831q("%s : Binder has died.", c36299i.f155544c);
                for (AbstractRunnableC36295e abstractRunnableC36295e : c36299i.f155545d) {
                    RemoteException remoteException = new RemoteException(String.valueOf(c36299i.f155544c).concat(" : Binder has died."));
                    C11040i c11040i = abstractRunnableC36295e.f155533w;
                    if (c11040i != null) {
                        c11040i.m29688c(remoteException);
                    }
                }
                c36299i.f155545d.clear();
                synchronized (c36299i.f155547f) {
                    c36299i.m116022c();
                    break;
                }
                return;
            default:
                C38606b c38606b = (C38606b) this.f155535b;
                c38606b.f166095b.m123818b("reportBinderDeath", new Object[0]);
                if (c38606b.f166103j.get() != null) {
                    throw new ClassCastException();
                }
                c38606b.f166095b.m123818b("%s : Binder has died.", c38606b.f166096c);
                Iterator it = c38606b.f166097d.iterator();
                while (it.hasNext()) {
                    ((AbstractRunnableC38625u) it.next()).mo103294a(new RemoteException(String.valueOf(c38606b.f166096c).concat(" : Binder has died.")));
                }
                c38606b.f166097d.clear();
                synchronized (c38606b.f166099f) {
                    c38606b.m123805d();
                    break;
                }
                return;
        }
    }
}
