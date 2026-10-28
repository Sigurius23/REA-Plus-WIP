package ui1;

import fi0.InterfaceC14515a;
import j93.InterfaceC21461d;
import java.util.List;
import l83.C23454a0;
import nd1.InterfaceC26584j;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import pi1.C29254d;
import qf3.C30330b;
import tf3.C33768a;
import uc2.C34761a;
import uf3.C34911a;
import vf3.C35953c;
import wf3.C37247a;
import xf3.C38266c;

/* JADX INFO: renamed from: ui1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lui1/b;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "kennel_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35019b implements InterfaceC26584j {
    /* JADX INFO: renamed from: b */
    private static final C23454a0 m110681b(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C34761a c34761a = new C34761a(20);
        InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29254d.class);
        C35953c c35953c = C37247a.f159360e;
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass, null, c34761a, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C29254d m110682c(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C29254d((InterfaceC14515a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m110681b(c33768a);
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
