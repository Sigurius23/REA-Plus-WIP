package rm0;

import bc3.InterfaceC2994c0;
import iy1.InterfaceC21030c;
import j93.InterfaceC21461d;
import java.util.List;
import l83.C23454a0;
import nd1.InterfaceC26584j;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import qf3.C30330b;
import tf3.C33768a;
import uf3.C34911a;
import vf3.C35953c;
import vm0.C36144b;
import vm0.C36146d;
import wf3.C37247a;
import xf3.C38266c;

/* JADX INFO: renamed from: rm0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lrm0/d;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "cache_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31586d implements InterfaceC26584j {
    /* JADX INFO: renamed from: b */
    private static final C23454a0 m97369b(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C31583a c31583a = new C31583a(20);
        InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(C36146d.class);
        C35953c c35953c = C37247a.f159360e;
        module.f141343a.add(AbstractC25012a.m73383p(new C30330b(c35953c, orCreateKotlinClass, null, c31583a, 1), module, AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), false));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C36146d m97370c(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C36146d((InterfaceC21030c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21030c.class), null), ((C36144b) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C36144b.class), null)).getStream(), (InterfaceC2994c0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null));
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m97369b(c33768a);
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
