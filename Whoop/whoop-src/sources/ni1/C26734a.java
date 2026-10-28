package ni1;

import b82.InterfaceC2804a;
import ci2.InterfaceC4733b;
import f82.InterfaceC14252c;
import g82.InterfaceC15574a;
import j93.InterfaceC21461d;
import java.util.List;
import l83.C23454a0;
import mi1.C25574c;
import mi1.C25575d;
import mi1.C25577f;
import mi1.InterfaceC25572a;
import mi1.InterfaceC25576e;
import nd1.InterfaceC26584j;
import nf0.C26658a;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import qf3.C30330b;
import rf3.C31362a;
import rf3.C31365d;
import tf3.C33768a;
import tr2.InterfaceC34116n;
import uf3.C34911a;
import vf3.C35953c;
import wf3.C37247a;
import xf3.C38266c;

/* JADX INFO: renamed from: ni1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lni1/a;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "hapticsStrapService_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C26734a implements InterfaceC26584j {
    /* JADX INFO: renamed from: d */
    private static final C23454a0 m79603d(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C26658a c26658a = new C26658a(24);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(InterfaceC25572a.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass, null, c26658a, 1)), false);
        C26658a c26658a2 = new C26658a(25);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(C25575d.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass2, null, c26658a2, 2)), false);
        C26658a c26658a3 = new C26658a(26);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(InterfaceC25576e.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass3, null, c26658a3, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final InterfaceC25572a m79604e(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C25574c(InterfaceC34116n.INSTANCE.m107848a("HapticsStrapService"), (InterfaceC4733b) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC4733b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C25575d m79605f(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C25575d(null, (InterfaceC25572a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC25572a.class), null), (InterfaceC2804a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2804a.class), null), (InterfaceC4733b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4733b.class), null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final InterfaceC25576e m79606g(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C25577f(null, (InterfaceC4733b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4733b.class), null), (InterfaceC14252c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14252c.class), null), (InterfaceC25572a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC25572a.class), null), (InterfaceC15574a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC15574a.class), null), 1, null);
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m79603d(c33768a);
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
