package yx0;

import ad3.AbstractC0757c;
import by0.C3691a;
import by0.C3693c;
import com.whoop.deepdive.domain.models.ArchMiniLastNightModel;
import com.whoop.deepdive.domain.models.ArchMiniRecoveryImpactsModel;
import com.whoop.deepdive.domain.models.ArchMiniTrendsModel;
import com.whoop.design.json.AbstractC6728b;
import cy0.C11183b;
import dy0.C12442a;
import fi0.InterfaceC14515a;
import ge3.AbstractC15751g;
import hf1.InterfaceC17235b;
import j02.InterfaceC21159o0;
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
import on2.C28050c;
import org.koin.core.error.DefinitionParameterException;
import p114eb.AbstractC12939a0;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import qf3.C30330b;
import rf3.C31362a;
import tf3.C33768a;
import u82.C34648i;
import u82.InterfaceC34640a;
import uf3.C34911a;
import v82.C35799a;
import vf3.C35953c;
import wb3.AbstractC37056f;
import wf3.C37247a;
import xf3.C38266c;
import xx0.C38689a;
import yf2.C39520a;
import zx0.C41206d;

/* JADX INFO: renamed from: yx0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m65681d2 = {"Lyx0/a;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "b", "deep-dive_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39839a implements InterfaceC26584j {

    /* JADX INFO: renamed from: c */
    public static final int f172031c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC26584j> dependencies = AbstractC37056f.m118959K(new C26583i(), new C35799a());

    /* JADX INFO: renamed from: l */
    private static final C23454a0 m127889l(C33768a c33768a) {
        C35953c c35953cM73386s = AbstractC25012a.m73386s(c33768a, "$this$module", "deep-dive-model-mapping");
        C39520a c39520a = new C39520a(14);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Map.class);
        C35953c c35953c = C37247a.f159360e;
        C35953c c35953cM73385r = AbstractC25012a.m73385r(new C30330b(c35953c, orCreateKotlinClass, c35953cM73386s, c39520a, 2), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass, c35953cM73386s, c35953c), false, "deep-dive-json");
        C39520a c39520a2 = new C39520a(15);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(AbstractC0757c.class);
        C35953c c35953cM73385r2 = AbstractC25012a.m73385r(new C30330b(c35953c, orCreateKotlinClass2, c35953cM73385r, c39520a2, 2), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass2, c35953cM73385r, c35953c), false, "deep-dive-bff-cache-deserializer");
        C39520a c39520a3 = new C39520a(16);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(InterfaceC34640a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, c35953cM73385r2, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass3, c35953cM73385r2, c39520a3, 2)), false);
        C39520a c39520a4 = new C39520a(17);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(C41206d.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass4, null, c39520a4, 2)), false);
        C39520a c39520a5 = new C39520a(18);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(C12442a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass5, null, c39520a5, 2)), false);
        C39520a c39520a6 = new C39520a(19);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(C3693c.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass6, null, c39520a6, 2)), false);
        C39520a c39520a7 = new C39520a(20);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(C3691a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass7, null, c39520a7, 2)), false);
        C39520a c39520a8 = new C39520a(21);
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(C38689a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass8, null, c39520a8, 2)), false);
        C39520a c39520a9 = new C39520a(22);
        InterfaceC21461d orCreateKotlinClass9 = c22673i0.getOrCreateKotlinClass(C11183b.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass9, null, c39520a9, 2), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass9, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final Map m127890m(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return AbstractC25247g0.m73990Y(new C23465k("ARCH_MINI_TRENDS", c22673i0.getOrCreateKotlinClass(ArchMiniTrendsModel.class)), new C23465k("ARCH_MINI_LAST_NIGHT", c22673i0.getOrCreateKotlinClass(ArchMiniLastNightModel.class)), new C23465k("ARCH_MINI_RECOVERY_IMPACTS", c22673i0.getOrCreateKotlinClass(ArchMiniRecoveryImpactsModel.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final AbstractC0757c m127891n(C38266c c38266c, C34911a c34911a) {
        return AbstractC6728b.m20380e(c38266c, (Map) c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Map.class), AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "deep-dive-model-mapping")), null, null, null, null, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final InterfaceC34640a m127892o(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C34648i((AbstractC0757c) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC0757c.class), new C35953c("deep-dive-json")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C41206d m127893p(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C28049b c28049b = new C28049b(factory, 21);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C41206d((InterfaceC26834e) factory.m122602a(c28049b, c22673i0.getOrCreateKotlinClass(InterfaceC26834e.class), null), (InterfaceC17235b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC17235b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C34911a m127894q(C38266c c38266c) {
        return new C34911a(AbstractC25260n.m74055Z0(new Object[]{c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC34640a.class), new C35953c("deep-dive-bff-cache-deserializer"))}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    public static final C12442a m127895r(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C12442a(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C3693c m127896s(C38266c factory, C34911a params) throws DefinitionParameterException {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        C28050c c28050c = new C28050c(params, 19);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21159o0 interfaceC21159o0 = (InterfaceC21159o0) factory.m122602a(c28050c, c22673i0.getOrCreateKotlinClass(InterfaceC21159o0.class), null);
        Object objM110111b = params.m110111b(c22673i0.getOrCreateKotlinClass(AbstractC12939a0.class));
        if (objM110111b == null) {
            throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, AbstractC12939a0.class, new StringBuilder("No value found for type '"), '\''));
        }
        return new C3693c(interfaceC21159o0, (AbstractC12939a0) objM110111b, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C34911a m127897t(C34911a c34911a) throws DefinitionParameterException {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = c34911a.m110111b(c22673i0.getOrCreateKotlinClass(Object.class));
        if (objM110111b != null) {
            return AbstractC15751g.m44431K(objM110111b);
        }
        throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, Object.class, new StringBuilder("No value found for type '"), '\''));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C3691a m127898u(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C3691a((C38689a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C38689a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C38689a m127899v(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C38689a((InterfaceC14515a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C11183b m127900w(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C11183b((C41206d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C41206d.class), null), (C12442a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C12442a.class), null), null, 4, null);
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m127889l(c33768a);
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
