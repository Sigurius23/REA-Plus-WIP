package p098dt;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import p002a0.C0016e;

/* JADX INFO: renamed from: dt.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C12354f extends BroadcastReceiver {

    /* JADX INFO: renamed from: b */
    public static final AtomicReference f41515b = new AtomicReference();

    /* JADX INFO: renamed from: a */
    public final Context f41516a;

    public C12354f(Context context) {
        this.f41516a = context;
    }

    /* JADX INFO: renamed from: a */
    public static void m34607a(Context context) {
        AtomicReference atomicReference = f41515b;
        if (atomicReference.get() == null) {
            C12354f c12354f = new C12354f(context);
            while (!atomicReference.compareAndSet(null, c12354f)) {
                if (atomicReference.get() != null) {
                    return;
                }
            }
            context.registerReceiver(c12354f, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (C12355g.f41517j) {
            try {
                Iterator it = ((C0016e) C12355g.f41518k.values()).iterator();
                while (it.hasNext()) {
                    ((C12355g) it.next()).m34612d();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f41516a.unregisterReceiver(this);
    }
}
