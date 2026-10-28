package x52;

import a62.C0474a;
import ad3.AbstractC0757c;
import b62.C2761b;
import c62.C4276d;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.json.AbstractC6728b;
import com.whoop.design.json.AbstractC6730d;
import com.whoop.recoveryimpacts.domain.model.RecoveryImpactsTileModel;
import j93.InterfaceC21461d;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import nd1.C26583i;
import nd1.InterfaceC26584j;
import nm0.InterfaceC26834e;
import on2.C28049b;
import p098dt.AbstractC12350b;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import qf3.C30330b;
import rf3.C31362a;
import tf3.C33768a;
import u82.C34642c;
import u82.InterfaceC34640a;
import uf3.C34911a;
import v82.C35799a;
import vf3.C35953c;
import w52.C36843a;
import wb3.AbstractC37056f;
import wf3.C37247a;
import ws1.C37607a;
import xf3.C38266c;
import y52.C39236a;

/* JADX INFO: renamed from: x52.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m65681d2 = {"Lx52/b;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "b", "recovery-impacts-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37994b implements InterfaceC26584j {

    /* JADX INFO: renamed from: c */
    public static final int f162757c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC26584j> dependencies = AbstractC37056f.m118959K(new C26583i(), new C35799a());

    /* JADX INFO: renamed from: i */
    private static final C23454a0 m121728i(C33768a c33768a) {
        C35953c c35953cM73386s = AbstractC25012a.m73386s(c33768a, "$this$module", "recovery-impacts-mapping");
        C37607a c37607a = new C37607a(25);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Map.class);
        C35953c c35953c = C37247a.f159360e;
        C35953c c35953cM73385r = AbstractC25012a.m73385r(new C30330b(c35953c, orCreateKotlinClass, c35953cM73386s, c37607a, 2), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass, c35953cM73386s, c35953c), false, "recovery-impacts-bff-cache-deserializer");
        C37607a c37607a2 = new C37607a(26);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(InterfaceC34640a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, c35953cM73385r, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass2, c35953cM73385r, c37607a2, 2)), false);
        C37607a c37607a3 = new C37607a(27);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C39236a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass3, null, c37607a3, 2)), false);
        C37607a c37607a4 = new C37607a(28);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(C4276d.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass4, null, c37607a4, 2)), false);
        C37607a c37607a5 = new C37607a(29);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(C0474a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass5, null, c37607a5, 2)), false);
        C37993a c37993a = new C37993a(0);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(C36843a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass6, null, c37993a, 2)), false);
        C37993a c37993a2 = new C37993a(1);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(C2761b.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass7, null, c37993a2, 2), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final Map m121729j(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return AbstractC25247g0.m73989X(new C23465k("RECOVERY_IMPACTS_TILE", AbstractC22671h0.f89337a.getOrCreateKotlinClass(RecoveryImpactsTileModel.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final InterfaceC34640a m121730k(C38266c c38266c, C34911a c34911a) {
        C35953c c35953cM73387t = AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "recovery-impacts-mapping");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Map map = (Map) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(Map.class), c35953cM73387t);
        AbstractC0757c abstractC0757cM20380e = AbstractC6728b.m20380e(c38266c, map, null, null, null, null, 30, null);
        Gson gsonCreate = AbstractC6730d.m20388f(new GsonBuilder(), map, null, 2, null).create();
        AbstractC22676k.m65749i(gsonCreate, "create(...)");
        return new C34642c(abstractC0757cM20380e, gsonCreate, (FeatureFlagChecker) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), AbstractC12350b.m34570S("kt-serialization-recovery-impacts"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C39236a m121731l(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C39236a((InterfaceC26834e) factory.m122602a(new C28049b(factory, 19), AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC26834e.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C34911a m121732m(C38266c c38266c) {
        return new C34911a(AbstractC25260n.m74055Z0(new Object[]{c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC34640a.class), new C35953c("recovery-impacts-bff-cache-deserializer"))}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C4276d m121733n(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C4276d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C0474a m121734o(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C0474a((C36843a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C36843a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C36843a m121735p(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C36843a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C2761b m121736q(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C2761b((C39236a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C39236a.class), null), (C4276d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C4276d.class), null), null, 4, null);
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m121728i(c33768a);
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
