package nr1;

import j93.InterfaceC21461d;
import java.util.List;
import l83.C23454a0;
import mr1.C25916f;
import mr1.C25921k;
import mr1.C25923m;
import nd1.C26583i;
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
import tf3.C33768a;
import u02.C34387c;
import uf3.C34911a;
import v82.C35799a;
import vf3.C35953c;
import wb3.AbstractC37056f;
import wf3.C37247a;
import xf3.C38266c;

/* JADX INFO: renamed from: nr1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m65681d2 = {"Lnr1/a;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "internal-tooling_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27078a implements InterfaceC26584j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC26584j> dependencies = AbstractC37056f.m118959K(new C26583i(), new C35799a());

    /* JADX INFO: renamed from: d */
    private static final C23454a0 m81439d(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C26658a c26658a = new C26658a(27);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(C25916f.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass, null, c26658a, 2)), false);
        C26658a c26658a2 = new C26658a(28);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(C25923m.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass2, null, c26658a2, 2)), false);
        C26658a c26658a3 = new C26658a(29);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C25921k.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass3, null, c26658a3, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C25916f m81440e(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C25916f((C34387c) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C34387c.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C25923m m81441f(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C25923m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C25921k m81442g(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C25921k((C25916f) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C25916f.class), null), (C25923m) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C25923m.class), null), null, 4, null);
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m81439d(c33768a);
        return c33768a;
    }

    @Override // nd1.InterfaceC26584j
    public List<InterfaceC26584j> getDependencies() {
        return this.dependencies;
    }

    @Override // nd1.InterfaceC26584j
    public /* bridge */ Object getKey() {
        return super.getKey();
    }
}
