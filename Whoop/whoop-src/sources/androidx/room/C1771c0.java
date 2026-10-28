package androidx.room;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;
import bc3.InterfaceC2994c0;
import dc3.EnumC11916a;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import java.util.concurrent.atomic.AtomicBoolean;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.room.c0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1771c0 {

    /* JADX INFO: renamed from: a */
    public final String f6980a;

    /* JADX INFO: renamed from: b */
    public final C1835v f6981b;

    /* JADX INFO: renamed from: c */
    public final Context f6982c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2994c0 f6983d;

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f6984e;

    /* JADX INFO: renamed from: f */
    public int f6985f;

    /* JADX INFO: renamed from: g */
    public InterfaceC1820q f6986g;

    /* JADX INFO: renamed from: h */
    public final C13096w1 f6987h;

    /* JADX INFO: renamed from: i */
    public final C1763a0 f6988i;

    /* JADX INFO: renamed from: j */
    public final BinderC1847z f6989j;

    /* JADX INFO: renamed from: k */
    public final ServiceConnectionC1767b0 f6990k;

    public C1771c0(Context context, String name, C1835v c1835v) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(name, "name");
        this.f6980a = name;
        this.f6981b = c1835v;
        this.f6982c = context.getApplicationContext();
        this.f6983d = c1835v.f7187a.getCoroutineScope();
        this.f6984e = new AtomicBoolean(true);
        this.f6987h = AbstractC13091v.m36591a(0, 0, EnumC11916a.f38982w);
        this.f6988i = new C1763a0(this, c1835v.f7188b);
        this.f6989j = new BinderC1847z(this);
        this.f6990k = new ServiceConnectionC1767b0(this, 0);
    }

    /* JADX INFO: renamed from: a */
    public final C1844y m5364a(String[] resolvedTableNames) {
        AbstractC22676k.m65750j(resolvedTableNames, "resolvedTableNames");
        return new C1844y(0, this.f6987h, resolvedTableNames);
    }

    /* JADX INFO: renamed from: b */
    public final void m5365b(Intent serviceIntent) {
        AbstractC22676k.m65750j(serviceIntent, "serviceIntent");
        if (this.f6984e.compareAndSet(true, false)) {
            this.f6982c.bindService(serviceIntent, this.f6990k, 1);
            C1763a0 observer = this.f6988i;
            AbstractC22676k.m65750j(observer, "observer");
            this.f6981b.m5454a(observer);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m5366c() {
        if (this.f6984e.compareAndSet(false, true)) {
            this.f6981b.m5456c(this.f6988i);
            try {
                InterfaceC1820q interfaceC1820q = this.f6986g;
                if (interfaceC1820q != null) {
                    interfaceC1820q.mo5414f0(this.f6989j, this.f6985f);
                }
            } catch (RemoteException e5) {
                Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e5);
            }
            this.f6982c.unbindService(this.f6990k);
        }
    }
}
