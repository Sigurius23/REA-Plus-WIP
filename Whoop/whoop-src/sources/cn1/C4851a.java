package cn1;

import ad3.AbstractC0757c;
import al0.C0972g;
import bn1.C3498a;
import c72.C4283a;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.whoop.design.json.TextResourceDeserializer;
import com.whoop.design.util.TextResource;
import com.whoop.homecustomization.domain.HomeCustomizationApi;
import dn1.C12218b;
import en1.C13367d;
import fi0.InterfaceC14515a;
import ge3.AbstractC15751g;
import hn1.C17517c;
import ih0.AbstractC18489d0;
import in1.C18721a;
import in1.C18723c;
import j02.InterfaceC21159o0;
import j93.InterfaceC21461d;
import java.util.List;
import jn1.C21804c;
import kn1.C22598a;
import l83.C23454a0;
import nd1.C26583i;
import nd1.InterfaceC26584j;
import org.koin.core.error.DefinitionParameterException;
import p031b9.AbstractC2875y;
import p098dt.AbstractC12350b;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pg3.C29222x0;
import qf3.C30330b;
import rf3.C31362a;
import rf3.C31365d;
import sr2.AbstractC32943y;
import tf3.C33768a;
import tr2.InterfaceC34116n;
import u82.AbstractC34650k;
import u82.C34643d;
import u82.C34644e;
import ud3.C34826l0;
import uf3.C34911a;
import v82.C35799a;
import vf3.C35953c;
import wb3.AbstractC37056f;
import wf3.C37247a;
import xf3.C38266c;

/* JADX INFO: renamed from: cn1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m65681d2 = {"Lcn1/a;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "home-customization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C4851a implements InterfaceC26584j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC26584j> dependencies = AbstractC37056f.m118959K(new C26583i(), new C35799a());

    /* JADX INFO: renamed from: k */
    private static final C23454a0 m15479k(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C4283a c4283a = new C4283a(13);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(HomeCustomizationApi.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass, null, c4283a, 1)), false);
        C4283a c4283a2 = new C4283a(14);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(C18723c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass2, null, c4283a2, 2)), false);
        C4283a c4283a3 = new C4283a(15);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C12218b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass3, null, c4283a3, 2)), false);
        C4283a c4283a4 = new C4283a(16);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(C18721a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass4, null, c4283a4, 2)), false);
        C4283a c4283a5 = new C4283a(17);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(C17517c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass5, null, c4283a5, 2)), false);
        C4283a c4283a6 = new C4283a(18);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(C3498a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass6, null, c4283a6, 1)), false);
        C4283a c4283a7 = new C4283a(19);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(C13367d.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass7, null, c4283a7, 2)), false);
        C4283a c4283a8 = new C4283a(20);
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(C22598a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass8, null, c4283a8, 2)), false);
        C4283a c4283a9 = new C4283a(21);
        InterfaceC21461d orCreateKotlinClass9 = c22673i0.getOrCreateKotlinClass(C21804c.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass9, null, c4283a9, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass9, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final HomeCustomizationApi m15480l(C38266c c38266c, C34911a c34911a) {
        Gson gsonCreate = AbstractC18489d0.m53366g(c38266c, "$this$single", c34911a, "it").setFieldNamingStrategy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).registerTypeAdapter(TextResource.class, new TextResourceDeserializer()).create();
        AbstractC0757c abstractC0757cM109496c = AbstractC34650k.m109496c();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C34644e c34644e = (C34644e) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34644e.class), null);
        AbstractC22676k.m65747g(gsonCreate);
        C34643d c34643dM109481a = c34644e.m109481a(gsonCreate, abstractC0757cM109496c, AbstractC12350b.m34570S("kt-serialization-home-customization"));
        C29222x0 c29222x0 = new C29222x0();
        return (HomeCustomizationApi) AbstractC2875y.m8293f(c29222x0, (C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), AbstractC2875y.m8312y((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null), c29222x0, c34643dM109481a, "defaultOkHttpClient")), HomeCustomizationApi.class, "create(...)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C18723c m15481m(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C18723c((C12218b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C12218b.class), null), (C18721a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C18721a.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C12218b m15482n(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C12218b((HomeCustomizationApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(HomeCustomizationApi.class), null), (C3498a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C3498a.class), null), InterfaceC34116n.INSTANCE.m107848a("CustomizeOverviewDomainInteractor"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C18721a m15483o(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C18721a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C17517c m15484p(C38266c factory, C34911a params) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        C0972g c0972g = new C0972g(params, 8);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C17517c((InterfaceC21159o0) factory.m122602a(c0972g, c22673i0.getOrCreateKotlinClass(InterfaceC21159o0.class), null), (C3498a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C3498a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C34911a m15485q(C34911a c34911a) throws DefinitionParameterException {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = c34911a.m110111b(c22673i0.getOrCreateKotlinClass(Object.class));
        if (objM110111b != null) {
            return AbstractC15751g.m44431K(objM110111b);
        }
        throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, Object.class, new StringBuilder("No value found for type '"), '\''));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C3498a m15486r(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C3498a((InterfaceC14515a) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C13367d m15487s(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C13367d((HomeCustomizationApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(HomeCustomizationApi.class), null), InterfaceC34116n.INSTANCE.m107848a("HomeCustomizationInteractor"), (C3498a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C3498a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C22598a m15488t(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C22598a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C21804c m15489u(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C21804c((C13367d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C13367d.class), null), (C22598a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C22598a.class), null), null, 4, null);
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m15479k(c33768a);
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
