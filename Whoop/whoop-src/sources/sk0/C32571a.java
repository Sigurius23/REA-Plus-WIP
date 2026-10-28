package sk0;

import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.os.Build;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import e93.AbstractC12889b;
import j93.InterfaceC21461d;
import java.util.List;
import l83.C23454a0;
import nd1.InterfaceC26584j;
import oj0.InterfaceC27978a;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p249jc.AbstractC21598x;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pj0.InterfaceC29294b;
import qf3.C30330b;
import re1.C31314a;
import rf3.C31365d;
import rk0.C31491a;
import tf3.C33768a;
import tk0.C33875a;
import tk0.C33876b;
import tk0.C33881g;
import tr2.InterfaceC34116n;
import uf3.C34911a;
import vf3.C35953c;
import wf3.C37247a;
import xf3.C38266c;

/* JADX INFO: renamed from: sk0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lsk0/a;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "whoop-ble-transport_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32571a implements InterfaceC26584j {
    /* JADX INFO: renamed from: c */
    private static final C23454a0 m101623c(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C31314a c31314a = new C31314a(13);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(InterfaceC27978a.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass, null, c31314a, 1)), false);
        C31314a c31314a2 = new C31314a(14);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(InterfaceC29294b.class);
        AbstractC11895b.m31980C(new C30330b(c35953c, orCreateKotlinClass2, null, c31314a2, 1), module, AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final InterfaceC27978a m101624d(C38266c c38266c, C34911a c34911a) {
        Context contextM8292e = AbstractC2875y.m8292e(c38266c, "$this$single", c34911a, "it", c38266c);
        InterfaceC34116n.Companion companion = InterfaceC34116n.INSTANCE;
        C33876b c33876b = new C33876b(companion.m107848a("NordicPlatformScanner"));
        BluetoothManager bluetoothManager = (BluetoothManager) contextM8292e.getSystemService(BluetoothManager.class);
        return new C33881g(c33876b, new C33875a(contextM8292e, bluetoothManager != null ? bluetoothManager.getAdapter() : null, Build.VERSION.SDK_INT), companion.m107848a("WhoopBleScanner"), AbstractC3006f0.m8708b(AbstractC12889b.m36254T(AbstractC3006f0.m8710d(), AbstractC3050q0.f12077a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final InterfaceC29294b m101625e(C38266c c38266c, C34911a c34911a) {
        Context contextM8292e = AbstractC2875y.m8292e(c38266c, "$this$single", c34911a, "it", c38266c);
        BluetoothManager bluetoothManager = (BluetoothManager) contextM8292e.getSystemService(BluetoothManager.class);
        return new C31491a(contextM8292e, bluetoothManager != null ? bluetoothManager.getAdapter() : null, Build.VERSION.SDK_INT, InterfaceC34116n.INSTANCE.m107848a("BleTransport"));
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m101623c(c33768a);
        return c33768a;
    }

    @Override // nd1.InterfaceC26584j
    public /* bridge */ List<InterfaceC26584j> getDependencies() {
        return super.getDependencies();
    }

    @Override // nd1.InterfaceC26584j
    public /* bridge */ Object getKey() {
        return super.getKey();
    }
}
