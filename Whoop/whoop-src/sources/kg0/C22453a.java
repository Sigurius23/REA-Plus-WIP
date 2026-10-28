package kg0;

import ad3.AbstractC0757c;
import al0.C0972g;
import ao1.C1873h;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.json.AbstractC6728b;
import com.whoop.design.json.AbstractC6730d;
import fi0.InterfaceC14515a;
import ge3.AbstractC15751g;
import ih0.AbstractC18489d0;
import j02.InterfaceC21159o0;
import j93.InterfaceC21461d;
import java.util.List;
import java.util.Map;
import jg0.C21666a;
import kf1.C22440a;
import l83.C23454a0;
import lg0.C24031d;
import lg0.C24034g;
import lg0.InterfaceC24033f;
import m83.AbstractC25260n;
import m83.C25272z;
import nd1.C26583i;
import nd1.InterfaceC26584j;
import ng0.C26679a;
import ng0.C26681c;
import nm0.InterfaceC26834e;
import og0.C27916b;
import org.koin.core.error.DefinitionParameterException;
import p098dt.AbstractC12350b;
import p114eb.AbstractC12939a0;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pg0.C29161a;
import qf3.C30330b;
import rf3.C31362a;
import tf3.C33768a;
import tr2.InterfaceC34116n;
import u02.C34387c;
import u82.C34642c;
import u82.InterfaceC34640a;
import uf3.C34911a;
import v82.C35799a;
import vf3.C35953c;
import wb3.AbstractC37056f;
import wf3.C37247a;
import xf3.C38266c;

/* JADX INFO: renamed from: kg0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m65681d2 = {"Lkg0/a;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "b", "advanced-labs-management_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22453a implements InterfaceC26584j {

    /* JADX INFO: renamed from: c */
    public static final int f87888c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC26584j> dependencies = AbstractC37056f.m118959K(new C26583i(), new C35799a());

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C34911a m64803A(C34911a c34911a) throws DefinitionParameterException {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = c34911a.m110111b(c22673i0.getOrCreateKotlinClass(Object.class));
        if (objM110111b != null) {
            return AbstractC15751g.m44431K(objM110111b);
        }
        throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, Object.class, new StringBuilder("No value found for type '"), '\''));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C26679a m64804B(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C26679a((C21666a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C21666a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final InterfaceC24033f m64805C(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C24034g((C34387c) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C34387c.class), null), null, InterfaceC34116n.INSTANCE.m107848a("AdvancedManagementLabsRepository"), 2, null);
    }

    /* JADX INFO: renamed from: o */
    private static final C23454a0 m64820o(C33768a c33768a) {
        C35953c c35953cM73386s = AbstractC25012a.m73386s(c33768a, "$this$module", "advance-labs-management-mapping");
        C22440a c22440a = new C22440a(5);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Map.class);
        C35953c c35953c = C37247a.f159360e;
        C35953c c35953cM73385r = AbstractC25012a.m73385r(new C30330b(c35953c, orCreateKotlinClass, c35953cM73386s, c22440a, 2), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass, c35953cM73386s, c35953c), false, "ADVANCED_LABS_MANAGEMENT_GSON");
        C22440a c22440a2 = new C22440a(8);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(Gson.class);
        C35953c c35953cM53379t = AbstractC18489d0.m53379t(new C30330b(c35953c, orCreateKotlinClass2, c35953cM73385r, c22440a2, 1), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass2, c35953cM73385r, c35953c), false, "ADVANCED_LABS_MANAGEMENT_JSON");
        C22440a c22440a3 = new C22440a(9);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(AbstractC0757c.class);
        C35953c c35953cM53379t2 = AbstractC18489d0.m53379t(new C30330b(c35953c, orCreateKotlinClass3, c35953cM53379t, c22440a3, 1), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass3, c35953cM53379t, c35953c), false, "ADVANCED_LABS_MANAGEMENT_BFF_CACHE_DESERIALIZER");
        C22440a c22440a4 = new C22440a(10);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(InterfaceC34640a.class);
        C35953c c35953cM73385r2 = AbstractC25012a.m73385r(new C30330b(c35953c, orCreateKotlinClass4, c35953cM53379t2, c22440a4, 2), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass4, c35953cM53379t2, c35953c), false, "ADVANCED_LABS_MANAGEMENT_CACHED_API_SOURCE");
        C22440a c22440a5 = new C22440a(11);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(InterfaceC26834e.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, c35953cM73385r2, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass5, c35953cM73385r2, c22440a5, 2)), false);
        C22440a c22440a6 = new C22440a(12);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(C24031d.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass6, null, c22440a6, 2)), false);
        C22440a c22440a7 = new C22440a(13);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(C29161a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass7, null, c22440a7, 2)), false);
        C22440a c22440a8 = new C22440a(2);
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(C26681c.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass8, null, c22440a8, 2)), false);
        C22440a c22440a9 = new C22440a(3);
        InterfaceC21461d orCreateKotlinClass9 = c22673i0.getOrCreateKotlinClass(C26679a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass9, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass9, null, c22440a9, 2)), false);
        C22440a c22440a10 = new C22440a(4);
        InterfaceC21461d orCreateKotlinClass10 = c22673i0.getOrCreateKotlinClass(InterfaceC24033f.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass10, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass10, null, c22440a10, 2)), false);
        C22440a c22440a11 = new C22440a(6);
        InterfaceC21461d orCreateKotlinClass11 = c22673i0.getOrCreateKotlinClass(C21666a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass11, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass11, null, c22440a11, 2)), false);
        C22440a c22440a12 = new C22440a(7);
        InterfaceC21461d orCreateKotlinClass12 = c22673i0.getOrCreateKotlinClass(C27916b.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass12, null, c22440a12, 2), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass12, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final Map m64821p(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return C25272z.f99163w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final Gson m64822q(C38266c c38266c, C34911a c34911a) {
        Gson gsonCreate = AbstractC6730d.m20388f(new GsonBuilder(), (Map) c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Map.class), AbstractC25012a.m73387t(c38266c, "$this$single", c34911a, "it", "advance-labs-management-mapping")), null, 2, null).create();
        AbstractC22676k.m65749i(gsonCreate, "create(...)");
        return gsonCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C21666a m64823r(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C21666a((InterfaceC14515a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C27916b m64824s(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C27916b((C24031d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C24031d.class), null), (C29161a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C29161a.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final AbstractC0757c m64825t(C38266c c38266c, C34911a c34911a) {
        return AbstractC6728b.m20380e(c38266c, (Map) c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Map.class), AbstractC25012a.m73387t(c38266c, "$this$single", c34911a, "it", "advance-labs-management-mapping")), null, null, null, null, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final InterfaceC34640a m64826u(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C35953c c35953c = new C35953c("ADVANCED_LABS_MANAGEMENT_JSON");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C34642c((AbstractC0757c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC0757c.class), c35953c), (Gson) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(Gson.class), new C35953c("ADVANCED_LABS_MANAGEMENT_GSON")), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), AbstractC12350b.m34570S("kt-serialization-advanced-labs-management"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final InterfaceC26834e m64827v(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return (InterfaceC26834e) factory.m122602a(new C1873h(factory, 19), AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC26834e.class), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C34911a m64828w(C38266c c38266c) {
        return new C34911a(AbstractC25260n.m74055Z0(new Object[]{c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC34640a.class), new C35953c("ADVANCED_LABS_MANAGEMENT_BFF_CACHE_DESERIALIZER"))}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C24031d m64829x(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C24031d((InterfaceC26834e) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC26834e.class), new C35953c("ADVANCED_LABS_MANAGEMENT_CACHED_API_SOURCE")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y */
    public static final C29161a m64830y(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C29161a(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C26681c m64831z(C38266c factory, C34911a params) throws DefinitionParameterException {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        C0972g c0972g = new C0972g(params, 20);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21159o0 interfaceC21159o0 = (InterfaceC21159o0) factory.m122602a(c0972g, c22673i0.getOrCreateKotlinClass(InterfaceC21159o0.class), null);
        Object objM110111b = params.m110111b(c22673i0.getOrCreateKotlinClass(AbstractC12939a0.class));
        if (objM110111b == null) {
            throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, AbstractC12939a0.class, new StringBuilder("No value found for type '"), '\''));
        }
        return new C26681c(interfaceC21159o0, (AbstractC12939a0) objM110111b, null, 4, null);
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m64820o(c33768a);
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
