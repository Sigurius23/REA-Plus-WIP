package rj0;

import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import e93.AbstractC12889b;
import ft0.InterfaceC14767c;
import hc3.C17171d;
import ik0.C18601b;
import ik0.InterfaceC18603d;
import j93.InterfaceC21461d;
import java.time.Clock;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import nd1.InterfaceC26584j;
import oj0.InterfaceC27978a;
import p088dc.AbstractC11895b;
import p249jc.AbstractC21598x;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pj0.InterfaceC29294b;
import qf3.C30330b;
import qj0.C30419a;
import qj0.InterfaceC30423e;
import re1.C31314a;
import rf3.C31362a;
import rf3.C31365d;
import tf3.C33768a;
import tr2.InterfaceC34116n;
import uf3.C34911a;
import uj0.C35036a;
import ut0.InterfaceC35230b;
import vf3.C35953c;
import wf3.C37247a;
import xf3.C38266c;

/* JADX INFO: renamed from: rj0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lrj0/a;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "whoop-ble_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31486a implements InterfaceC26584j {
    /* JADX INFO: renamed from: d */
    private static final C23454a0 m96978d(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C31314a c31314a = new C31314a(2);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(InterfaceC18603d.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass, null, c31314a, 1)), false);
        C31314a c31314a2 = new C31314a(3);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(InterfaceC30423e.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass2, null, c31314a2, 2)), false);
        C31314a c31314a3 = new C31314a(4);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(InterfaceC14767c.class);
        AbstractC11895b.m31980C(new C30330b(c35953c, orCreateKotlinClass3, null, c31314a3, 1), module, AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final InterfaceC18603d m96979e(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C18601b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final InterfaceC30423e m96980f(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC29294b interfaceC29294b = (InterfaceC29294b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC29294b.class), null);
        InterfaceC35230b interfaceC35230b = (InterfaceC35230b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC35230b.class), null);
        Map map = (Map) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(Map.class), new C35953c("protocolHandshakeMap"));
        Clock clockSystemUTC = Clock.systemUTC();
        AbstractC22676k.m65749i(clockSystemUTC, "systemUTC(...)");
        return new C30419a(interfaceC29294b, interfaceC35230b, map, clockSystemUTC, InterfaceC34116n.INSTANCE.m107848a("WhoopBleSession"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final InterfaceC14767c m96981g(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC18603d interfaceC18603d = (InterfaceC18603d) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18603d.class), null);
        InterfaceC27978a interfaceC27978a = (InterfaceC27978a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC27978a.class), null);
        InterfaceC30423e interfaceC30423e = (InterfaceC30423e) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC30423e.class), null);
        C17171d c17171dM8708b = AbstractC3006f0.m8708b(AbstractC12889b.m36254T(AbstractC3006f0.m8710d(), AbstractC3050q0.f12077a));
        Clock clockSystemUTC = Clock.systemUTC();
        AbstractC22676k.m65749i(clockSystemUTC, "systemUTC(...)");
        return new C35036a(interfaceC18603d, interfaceC27978a, interfaceC30423e, c17171dM8708b, clockSystemUTC, null, null, 96, null);
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m96978d(c33768a);
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
