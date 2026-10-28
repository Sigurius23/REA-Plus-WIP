package io.sentry.android.replay;

import android.bluetooth.BluetoothDevice;
import io.sentry.InterfaceC20259b1;
import io.sentry.InterfaceC20320e4;
import java.util.ArrayList;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: io.sentry.android.replay.m */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C20214m implements InterfaceC20320e4 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f75937w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C22669g0 f75938x;

    public /* synthetic */ C20214m(C22669g0 c22669g0, int i13) {
        this.f75937w = i13;
        this.f75938x = c22669g0;
    }

    /* JADX INFO: renamed from: a */
    public void m56140a(BluetoothDevice bluetoothDevice, int i13) {
        AbstractC22676k.m65750j(bluetoothDevice, "<unused var>");
        this.f75938x.f89336w = Integer.valueOf(i13);
    }

    @Override // io.sentry.InterfaceC20320e4
    /* JADX INFO: renamed from: h */
    public void mo11182h(InterfaceC20259b1 it) {
        int i13 = this.f75937w;
        C22669g0 c22669g0 = this.f75938x;
        switch (i13) {
            case 0:
                int i14 = ReplayIntegration.f75787R;
                AbstractC22676k.m65750j(it, "it");
                String strMo56179A = it.mo56179A();
                c22669g0.f89336w = strMo56179A != null ? AbstractC39414r.m125860F0('.', strMo56179A, strMo56179A) : null;
                break;
            default:
                AbstractC22676k.m65750j(it, "scope");
                c22669g0.f89336w = new ArrayList(it.mo56211v());
                break;
        }
    }
}
