package un0;

import ao0.C1865a;
import bo0.C3504b;
import bo0.C3506d;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.service.network.AuthServiceApiV2;
import dj0.C12066b;
import fi0.InterfaceC14515a;
import j02.InterfaceC21151k0;
import j93.InterfaceC21461d;
import java.util.List;
import l83.C23454a0;
import nd1.C26583i;
import nd1.InterfaceC26584j;
import or2.C28156e;
import org.koin.core.error.DefinitionParameterException;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p706eo0.C13377h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import qf3.C30330b;
import rf3.C31362a;
import tf3.C33768a;
import tn0.C33958b;
import uc2.C34761a;
import uf3.C34911a;
import vf3.C35953c;
import vn0.C36194d;
import vn0.C36195e;
import wb3.AbstractC37056f;
import wf3.C37247a;
import wn0.C37411b;
import wn0.C37413d;
import xf3.C38266c;
import xn0.C38473a;
import xn0.C38476d;
import y92.C39352a;
import yn0.C39669a;
import zn0.C40904b;

/* JADX INFO: renamed from: un0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"Lun0/b;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "Lnd1/i;", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "change-password_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35094b implements InterfaceC26584j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C26583i> dependencies = AbstractC37056f.m118958J(new C26583i());

    /* JADX INFO: renamed from: l */
    private static final C23454a0 m110986l(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C34761a c34761a = new C34761a(21);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(C33958b.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass, null, c34761a, 2)), false);
        C34761a c34761a2 = new C34761a(24);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(C36195e.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass2, null, c34761a2, 2)), false);
        C34761a c34761a3 = new C34761a(25);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C36194d.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass3, null, c34761a3, 2)), false);
        C34761a c34761a4 = new C34761a(26);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(C1865a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass4, null, c34761a4, 2)), false);
        C34761a c34761a5 = new C34761a(27);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(C40904b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass5, null, c34761a5, 2)), false);
        C34761a c34761a6 = new C34761a(28);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(C37411b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass6, null, c34761a6, 2)), false);
        C34761a c34761a7 = new C34761a(29);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(C37413d.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass7, null, c34761a7, 2)), false);
        C35093a c35093a = new C35093a(0);
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(C38476d.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass8, null, c35093a, 2)), false);
        C35093a c35093a2 = new C35093a(1);
        InterfaceC21461d orCreateKotlinClass9 = c22673i0.getOrCreateKotlinClass(C38473a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass9, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass9, null, c35093a2, 2)), false);
        C34761a c34761a8 = new C34761a(22);
        InterfaceC21461d orCreateKotlinClass10 = c22673i0.getOrCreateKotlinClass(InterfaceC21151k0.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass10, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass10, null, c34761a8, 2)), false);
        C34761a c34761a9 = new C34761a(23);
        InterfaceC21461d orCreateKotlinClass11 = c22673i0.getOrCreateKotlinClass(C3504b.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass11, null, c34761a9, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass11, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C33958b m110987m(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C33958b((InterfaceC14515a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C36195e m110988n(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C36195e(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C3504b m110989o(C38266c viewModel, C34911a params) throws DefinitionParameterException {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(params, "params");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = params.m110111b(c22673i0.getOrCreateKotlinClass(C13377h.class));
        if (objM110111b == null) {
            throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, C13377h.class, new StringBuilder("No value found for type '"), '\''));
        }
        C13377h c13377h = (C13377h) objM110111b;
        return new C3504b(c13377h, (C38473a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C38473a.class), null), new C3506d(c13377h, (FeatureFlagChecker) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (C36195e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C36195e.class), null)), null, null, 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C36194d m110990p(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C36194d((C12066b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C12066b.class), null), (C28156e) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C28156e.class), null), (C39352a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C39352a.class), null), (C37411b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C37411b.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), null, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C1865a m110991q(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C1865a((C36195e) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C36195e.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C40904b m110992r(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C40904b((C36194d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C36194d.class), null), (C1865a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C1865a.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C37411b m110993s(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C37411b((AuthServiceApiV2) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AuthServiceApiV2.class), null), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    public static final C37413d m110994t(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C37413d((AuthServiceApiV2) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AuthServiceApiV2.class), null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C38476d m110995u(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C38476d((AuthServiceApiV2) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AuthServiceApiV2.class), null), null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C38473a m110996v(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C38473a((C37413d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C37413d.class), null), (C37411b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C37411b.class), null), (C38476d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C38476d.class), null), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final InterfaceC21151k0 m110997w(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C39669a(null, null, null, 7, null);
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m110986l(c33768a);
        return c33768a;
    }

    @Override // nd1.InterfaceC26584j
    public List<C26583i> getDependencies() {
        return this.dependencies;
    }

    @Override // nd1.InterfaceC26584j
    public /* bridge */ Object getKey() {
        return super.getKey();
    }
}
