package rh0;

import c93.InterfaceC4339a;
import com.whoop.aiinsights.domain.AiInsightsApi;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.json.AbstractC6728b;
import f91.C14283a;
import fi0.InterfaceC14515a;
import ge3.AbstractC15751g;
import j93.InterfaceC21461d;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import nd1.InterfaceC26584j;
import org.koin.core.error.DefinitionParameterException;
import p031b9.AbstractC2875y;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pg3.AbstractC29199m;
import pg3.C29222x0;
import ph0.C29234b;
import qf3.C30330b;
import qh0.C30365b;
import rb0.C31189f;
import rf3.C31362a;
import rf3.C31365d;
import sh0.C32501c;
import sr2.AbstractC32943y;
import tf3.C33768a;
import tr2.InterfaceC34116n;
import u82.AbstractC34645f;
import ud3.C34826l0;
import uf3.C34911a;
import uh0.C34965c;
import v82.C35799a;
import vf3.C35953c;
import vh0.C36041b;
import vh0.C36043d;
import wb3.AbstractC37056f;
import wf3.C37247a;
import wh0.C37298a;
import wm0.C37378a;
import xf3.C38266c;

/* JADX INFO: renamed from: rh0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m65681d2 = {"Lrh0/b;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "ai-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31438b implements InterfaceC26584j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC26584j> dependencies = AbstractC37056f.m118959K(new C14283a(), new C35799a());

    /* JADX INFO: renamed from: j */
    private static final C23454a0 m96761j(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C31189f c31189f = new C31189f(21);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(AiInsightsApi.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass, null, c31189f, 1)), false);
        C31189f c31189f2 = new C31189f(22);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(C32501c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass2, null, c31189f2, 2)), false);
        C31189f c31189f3 = new C31189f(23);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C37298a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass3, null, c31189f3, 2)), false);
        C31189f c31189f4 = new C31189f(24);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(C36043d.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass4, null, c31189f4, 2)), false);
        C31189f c31189f5 = new C31189f(25);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(C36041b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass5, null, c31189f5, 2)), false);
        C31189f c31189f6 = new C31189f(26);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(C34965c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass6, null, c31189f6, 2)), false);
        C31189f c31189f7 = new C31189f(27);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(C30365b.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass7, null, c31189f7, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final AiInsightsApi m96762k(C38266c c38266c, C34911a c34911a) {
        C35953c c35953cM73387t = AbstractC25012a.m73387t(c38266c, "$this$single", c34911a, "it", "generic-models-mapping");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        AbstractC29199m abstractC29199mM109482a = AbstractC34645f.m109482a(AbstractC6728b.m20380e(c38266c, (Map) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(Map.class), c35953cM73387t), null, null, null, null, 30, null));
        C29222x0 c29222x0 = new C29222x0();
        c29222x0.m88729c(((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null)).getApiBaseUrl());
        c29222x0.m88728b(abstractC29199mM109482a);
        return (AiInsightsApi) AbstractC2875y.m8293f(c29222x0, (C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), new C35953c("defaultOkHttpClient")), AiInsightsApi.class, "create(...)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C32501c m96763l(C38266c factory, C34911a params) throws DefinitionParameterException {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        AiInsightsApi aiInsightsApi = (AiInsightsApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AiInsightsApi.class), null);
        InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("AiInsightsInteractor");
        FeatureFlagChecker featureFlagChecker = (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null);
        C37378a c37378a = (C37378a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C37378a.class), null);
        Object objM110111b = params.m110111b(c22673i0.getOrCreateKotlinClass(C29234b.class));
        if (objM110111b != null) {
            return new C32501c(aiInsightsApi, interfaceC34116nM107848a, featureFlagChecker, c37378a, (C29234b) objM110111b);
        }
        throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, C29234b.class, new StringBuilder("No value found for type '"), '\''));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C37298a m96764m(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C37298a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C36043d m96765n(C38266c factory, C34911a params) throws DefinitionParameterException {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C37298a c37298a = (C37298a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C37298a.class), null);
        Object objM110111b = params.m110111b(c22673i0.getOrCreateKotlinClass(C29234b.class));
        if (objM110111b != null) {
            return new C36043d(c37298a, (C29234b) objM110111b);
        }
        throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, C29234b.class, new StringBuilder("No value found for type '"), '\''));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C36041b m96766o(C38266c viewModel, C34911a params) throws DefinitionParameterException {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(params, "params");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = params.m110111b(c22673i0.getOrCreateKotlinClass(C29234b.class));
        if (objM110111b == null) {
            throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, C29234b.class, new StringBuilder("No value found for type '"), '\''));
        }
        final C29234b c29234b = (C29234b) objM110111b;
        final int i13 = 0;
        final int i14 = 1;
        return new C36041b(null, (C32501c) viewModel.m122602a(new InterfaceC4339a() { // from class: rh0.a
            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return C31438b.m96767p(c29234b);
                    default:
                        return C31438b.m96768q(c29234b);
                }
            }
        }, c22673i0.getOrCreateKotlinClass(C32501c.class), null), (C36043d) viewModel.m122602a(new InterfaceC4339a() { // from class: rh0.a
            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return C31438b.m96767p(c29234b);
                    default:
                        return C31438b.m96768q(c29234b);
                }
            }
        }, c22673i0.getOrCreateKotlinClass(C36043d.class), null), i14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C34911a m96767p(C29234b c29234b) {
        return AbstractC15751g.m44431K(c29234b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C34911a m96768q(C29234b c29234b) {
        return AbstractC15751g.m44431K(c29234b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C34965c m96769r(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C34965c(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C30365b m96770s(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C30365b((InterfaceC14515a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m96761j(c33768a);
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
