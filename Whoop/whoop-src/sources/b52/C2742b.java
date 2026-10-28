package b52;

import a13.C0148f;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import ao1.C1874i;
import b83.C2807c;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import com.whoop.connectivityDataPackets.PersistentStrapPacketDatabase;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.puffin.network.BatteryPackApi;
import com.whoop.puffin.sync.C9820c;
import com.whoop.puffin.sync.C9821d;
import d52.C11719a;
import e52.C12741a;
import f52.C14103a;
import f52.C14105c;
import f52.C14106d;
import f52.InterfaceC14108f;
import g52.C15495a;
import ge3.AbstractC15751g;
import gt0.InterfaceC16183e;
import iy1.InterfaceC21030c;
import j93.InterfaceC21461d;
import java.nio.file.Path;
import java.time.Clock;
import java.util.HashSet;
import java.util.List;
import js0.AbstractC21909c;
import l83.C23454a0;
import nd1.InterfaceC26584j;
import ou0.InterfaceC28370a;
import ou0.InterfaceC28374e;
import p007a6.InterfaceC0422g;
import p031b9.AbstractC2875y;
import p098dt.AbstractC12350b;
import p218ic.AbstractC18377p0;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pf.AbstractC29125c;
import pg3.C29224y0;
import pk0.InterfaceC29333c;
import qf3.C30330b;
import qt0.InterfaceC30585a;
import rf3.C31362a;
import rf3.C31365d;
import tf3.C33768a;
import tr2.InterfaceC34116n;
import uf3.C34911a;
import us0.InterfaceC35205a;
import us0.InterfaceC35209e;
import v82.C35799a;
import vf3.C35953c;
import vk0.InterfaceC36076b;
import wf3.C37247a;
import x42.C37964a;
import x42.C37965b;
import x42.C37966c;
import x42.C37968e;
import x42.InterfaceC37967d;
import xf3.C38266c;
import y42.C39228j;

/* JADX INFO: renamed from: b52.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"Lb52/b;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "Lv82/a;", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "puffin_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C2742b implements InterfaceC26584j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C35799a> dependencies = AbstractC2875y.m8308u();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C34911a m7724A() {
        return AbstractC15751g.m44431K(AbstractC12350b.m34570S("kt-serialization-puffin"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C37964a m7725B(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C37964a c37964a = new C37964a((C39228j) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C39228j.class), null), (InterfaceC16183e) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC16183e.class), null), new C14103a(), null, 8, null);
        c37964a.m121589d((InterfaceC2994c0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null));
        return c37964a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C15495a m7726C(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C15495a((AbstractC21909c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC21909c.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (AbstractC18377p0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC18377p0.class), new C35953c("workManagerInstance")), InterfaceC34116n.INSTANCE.m107848a("PuffinScanScheduler"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C12741a m7727D(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC0422g interfaceC0422g = (InterfaceC0422g) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC0422g.class), null);
        C39228j c39228j = (C39228j) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C39228j.class), null);
        Clock clockSystemUTC = Clock.systemUTC();
        AbstractC22676k.m65749i(clockSystemUTC, "systemUTC(...)");
        C12741a c12741a = new C12741a(interfaceC0422g, c39228j, clockSystemUTC, InterfaceC34116n.INSTANCE.m107848a("PuffinStore"));
        c12741a.m35669i((InterfaceC2994c0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null));
        return c12741a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C37968e m7728E(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C37968e c37968e = new C37968e((C39228j) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C39228j.class), null), (C15495a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C15495a.class), null), (AbstractC21909c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC21909c.class), null), InterfaceC34116n.INSTANCE.m107848a("PuffinOneTimeReconnectionTrigger"));
        c37968e.m121611d((InterfaceC2994c0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null));
        return c37968e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C37966c m7729F(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37966c((C39228j) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C39228j.class), null), (InterfaceC16183e) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC16183e.class), null), AbstractC3006f0.m8708b(AbstractC3050q0.f12077a.plus(AbstractC3006f0.m8710d())), (AbstractC18377p0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC18377p0.class), new C35953c("workManagerInstance")), InterfaceC34116n.INSTANCE.m107848a("PuffinFwUpdateMonitor"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C9820c m7730G(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C9820c(null, (InterfaceC14108f) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14108f.class), null), (AbstractC18377p0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC18377p0.class), new C35953c("workManagerInstance")), (C37965b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C37965b.class), null), null, 17, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C37965b m7731H(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C37965b((InterfaceC21030c) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21030c.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final InterfaceC14108f m7732I(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C9821d(null, null, (InterfaceC28370a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC28370a.class), null), (InterfaceC28374e) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC28374e.class), null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final InterfaceC28370a m7733J(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return ((PersistentStrapPacketDatabase) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PersistentStrapPacketDatabase.class), null)).mo19636e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final InterfaceC28374e m7734K(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return ((PersistentStrapPacketDatabase) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PersistentStrapPacketDatabase.class), null)).mo19637f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C14105c m7735L(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        AbstractC21909c abstractC21909c = (AbstractC21909c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC21909c.class), null);
        Path path = AbstractC29125c.m88532i(factory).getCacheDir().toPath();
        AbstractC22676k.m65749i(path, "toPath(...)");
        return new C14105c(null, abstractC21909c, path, null, (InterfaceC28370a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC28370a.class), null), (InterfaceC28374e) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC28374e.class), null), 5242000, (C37965b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C37965b.class), null), null, 265, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C14106d m7736M(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C14106d((C14105c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C14105c.class), null), (BatteryPackApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(BatteryPackApi.class), null), null, null, (C37965b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C37965b.class), null), null, 44, null);
    }

    /* JADX INFO: renamed from: t */
    private static final C23454a0 m7756t(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        HashSet hashSet = module.f141343a;
        C1874i c1874i = new C1874i(18);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(C39228j.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass, null, c1874i, 1)), false);
        C1874i c1874i2 = new C1874i(29);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(C11719a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass2, null, c1874i2, 2)), false);
        C2741a c2741a = new C2741a(0);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C37966c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass3, null, c2741a, 2)), false);
        C2741a c2741a2 = new C2741a(1);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(C9820c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass4, null, c2741a2, 2)), false);
        C2741a c2741a3 = new C2741a(2);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(C37965b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass5, null, c2741a3, 2)), false);
        C1874i c1874i3 = new C1874i(19);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(InterfaceC14108f.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass6, null, c1874i3, 2)), false);
        C1874i c1874i4 = new C1874i(20);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(InterfaceC28370a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass7, null, c1874i4, 2)), false);
        C1874i c1874i5 = new C1874i(21);
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(InterfaceC28374e.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass8, null, c1874i5, 2)), false);
        C1874i c1874i6 = new C1874i(22);
        InterfaceC21461d orCreateKotlinClass9 = c22673i0.getOrCreateKotlinClass(C14105c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass9, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass9, null, c1874i6, 2)), false);
        C1874i c1874i7 = new C1874i(23);
        InterfaceC21461d orCreateKotlinClass10 = c22673i0.getOrCreateKotlinClass(C14106d.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass10, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass10, null, c1874i7, 2)), false);
        C1874i c1874i8 = new C1874i(24);
        InterfaceC21461d orCreateKotlinClass11 = c22673i0.getOrCreateKotlinClass(BatteryPackApi.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass11, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass11, null, c1874i8, 2)), false);
        C1874i c1874i9 = new C1874i(25);
        InterfaceC21461d orCreateKotlinClass12 = c22673i0.getOrCreateKotlinClass(C37964a.class);
        C30330b c30330b = new C30330b(c35953c, orCreateKotlinClass12, null, c1874i9, 1);
        String strM60669Y = AbstractC21598x.m60669Y(orCreateKotlinClass12, null, c35953c);
        C31365d c31365d = new C31365d(c30330b);
        module.m106774b(strM60669Y, c31365d, false);
        hashSet.add(c31365d);
        C1874i c1874i10 = new C1874i(26);
        InterfaceC21461d orCreateKotlinClass13 = c22673i0.getOrCreateKotlinClass(C15495a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass13, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass13, null, c1874i10, 2)), false);
        C1874i c1874i11 = new C1874i(27);
        InterfaceC21461d orCreateKotlinClass14 = c22673i0.getOrCreateKotlinClass(C12741a.class);
        C30330b c30330b2 = new C30330b(c35953c, orCreateKotlinClass14, null, c1874i11, 1);
        String strM60669Y2 = AbstractC21598x.m60669Y(orCreateKotlinClass14, null, c35953c);
        C31365d c31365d2 = new C31365d(c30330b2);
        module.m106774b(strM60669Y2, c31365d2, false);
        hashSet.add(c31365d2);
        C1874i c1874i12 = new C1874i(28);
        InterfaceC21461d orCreateKotlinClass15 = c22673i0.getOrCreateKotlinClass(C37968e.class);
        C30330b c30330b3 = new C30330b(c35953c, orCreateKotlinClass15, null, c1874i12, 1);
        String strM60669Y3 = AbstractC21598x.m60669Y(orCreateKotlinClass15, null, c35953c);
        C31365d c31365d3 = new C31365d(c30330b3);
        module.m106774b(strM60669Y3, c31365d3, false);
        hashSet.add(c31365d3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C39228j m7757u(C38266c single, C34911a it) throws C2807c {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("PuffinManager");
        Context contextM88532i = AbstractC29125c.m88532i(single);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C39228j(interfaceC34116nM107848a, contextM88532i, (BluetoothAdapter) single.m122602a(null, c22673i0.getOrCreateKotlinClass(BluetoothAdapter.class), null), (C11719a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C11719a.class), null), AbstractC3006f0.m8708b(AbstractC3050q0.f12077a.plus(AbstractC3006f0.m8710d())), (InterfaceC35209e) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC35209e.class), null), (InterfaceC36076b) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC36076b.class), new C35953c("puffinBleExecutor")), (InterfaceC37967d) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC37967d.class), null), (InterfaceC30585a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC30585a.class), null), (InterfaceC0422g) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC0422g.class), null), (InterfaceC35205a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC35205a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C11719a m7758v(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C0148f c0148f = new C0148f(8);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C11719a((InterfaceC29333c) factory.m122602a(c0148f, c22673i0.getOrCreateKotlinClass(InterfaceC29333c.class), null), (InterfaceC29333c) factory.m122602a(new C0148f(9), c22673i0.getOrCreateKotlinClass(InterfaceC29333c.class), null), (InterfaceC29333c) factory.m122602a(new C0148f(10), c22673i0.getOrCreateKotlinClass(InterfaceC29333c.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C34911a m7759w() {
        return AbstractC15751g.m44431K("PuffinCommandResponseParser");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C34911a m7760x() {
        return AbstractC15751g.m44431K("PuffinDataPacketParser");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C34911a m7761y() {
        return AbstractC15751g.m44431K("PuffinEventPacketParser");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final BatteryPackApi m7762z(C38266c c38266c, C34911a c34911a) {
        return (BatteryPackApi) ((C29224y0) c38266c.m122602a(new C0148f(11), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29224y0.class), AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "featureFlaggableDefaultRetrofit"))).m88733b(BatteryPackApi.class);
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m7756t(c33768a);
        return c33768a;
    }

    @Override // nd1.InterfaceC26584j
    public List<C35799a> getDependencies() {
        return this.dependencies;
    }

    @Override // nd1.InterfaceC26584j
    public /* bridge */ Object getKey() {
        return super.getKey();
    }
}
