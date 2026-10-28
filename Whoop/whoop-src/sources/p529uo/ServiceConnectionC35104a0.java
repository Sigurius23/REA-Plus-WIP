package p529uo;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: uo.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC35104a0 implements ServiceConnection {

    /* JADX INFO: renamed from: w */
    public final int f148957w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC35107c f148958x;

    public ServiceConnectionC35104a0(AbstractC35107c abstractC35107c, int i13) {
        this.f148958x = abstractC35107c;
        this.f148957w = i13;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AbstractC35107c abstractC35107c = this.f148958x;
        if (iBinder == null) {
            abstractC35107c.m111065r();
            return;
        }
        synchronized (abstractC35107c.f148968g) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                abstractC35107c.f148969h = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof C35134v)) ? new C35134v(iBinder) : (C35134v) iInterfaceQueryLocalInterface;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        AbstractC35107c abstractC35107c2 = this.f148958x;
        int i13 = this.f148957w;
        abstractC35107c2.getClass();
        C35108c0 c35108c0 = new C35108c0(abstractC35107c2, 0, null);
        HandlerC35137y handlerC35137y = abstractC35107c2.f148966e;
        handlerC35137y.sendMessage(handlerC35137y.obtainMessage(7, i13, -1, c35108c0));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC35107c abstractC35107c = this.f148958x;
        synchronized (abstractC35107c.f148968g) {
            abstractC35107c.f148969h = null;
        }
        AbstractC35107c abstractC35107c2 = this.f148958x;
        int i13 = this.f148957w;
        HandlerC35137y handlerC35137y = abstractC35107c2.f148966e;
        handlerC35137y.sendMessage(handlerC35137y.obtainMessage(6, i13, 1));
    }
}
