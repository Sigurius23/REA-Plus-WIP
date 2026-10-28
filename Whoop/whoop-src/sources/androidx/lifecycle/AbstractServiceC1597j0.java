package androidx.lifecycle;

import a33.C0352d;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.lifecycle.j0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractServiceC1597j0 extends Service implements InterfaceC1585g0 {

    /* JADX INFO: renamed from: w */
    public final C0352d f6262w = new C0352d(this);

    @Override // androidx.lifecycle.InterfaceC1585g0
    public final AbstractC1638x getLifecycle() {
        return (C1593i0) this.f6262w.f1237x;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        AbstractC22676k.m65750j(intent, "intent");
        C0352d c0352d = this.f6262w;
        c0352d.getClass();
        c0352d.m917D(EnumC1632v.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        C0352d c0352d = this.f6262w;
        c0352d.getClass();
        c0352d.m917D(EnumC1632v.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        C0352d c0352d = this.f6262w;
        c0352d.getClass();
        c0352d.m917D(EnumC1632v.ON_STOP);
        c0352d.m917D(EnumC1632v.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i13) {
        C0352d c0352d = this.f6262w;
        c0352d.getClass();
        c0352d.m917D(EnumC1632v.ON_START);
        super.onStart(intent, i13);
    }
}
