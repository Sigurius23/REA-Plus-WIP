package zi2;

import ad3.AbstractC0757c;
import aj2.C0932a;
import com.whoop.design.json.AbstractC6728b;
import com.whoop.strengthworkout.api.StrengthWorkoutApi;
import com.whoop.strengthworkout.domain.models.StrengthWorkoutModel;
import com.whoop.strengthworkout.domain.models.StrengthWorkoutModelKt;
import j93.InterfaceC21461d;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import jb1.InterfaceC21538d;
import jb1.InterfaceC21539e;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import nd1.C26583i;
import nd1.InterfaceC26584j;
import nm0.InterfaceC26834e;
import on2.C28049b;
import p031b9.AbstractC2875y;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p672z6.C40121d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p720m91.InterfaceC25310s;
import pg3.C29222x0;
import qf3.C30330b;
import r80.AbstractC31061c;
import rf3.C31362a;
import rf3.C31365d;
import rm0.C31585c;
import sr2.AbstractC32943y;
import tf3.C33768a;
import u82.C34648i;
import u82.InterfaceC34640a;
import ud3.C34826l0;
import uf3.C34911a;
import v82.C35799a;
import vf3.C35953c;
import wb3.AbstractC37056f;
import wf3.C37247a;
import xf3.C38266c;

/* JADX INFO: renamed from: zi2.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m65681d2 = {"Lzi2/e;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "b", "strength-workout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40701e implements InterfaceC26584j {

    /* JADX INFO: renamed from: c */
    public static final int f175605c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC26584j> dependencies = AbstractC37056f.m118959K(new C26583i(), new C31585c(), new C35799a());

    /* JADX INFO: renamed from: j */
    private static final C23454a0 m132167j(C33768a c33768a) {
        C35953c c35953cM73386s = AbstractC25012a.m73386s(c33768a, "$this$module", "STRENGTH_WORKOUT_MAPPING");
        C40121d c40121d = new C40121d(23);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Map.class);
        C35953c c35953c = C37247a.f159360e;
        C35953c c35953cM73385r = AbstractC25012a.m73385r(new C30330b(c35953c, orCreateKotlinClass, c35953cM73386s, c40121d, 2), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass, c35953cM73386s, c35953c), false, "STRENGTH_WORKOUT_JSON");
        C40121d c40121d2 = new C40121d(24);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(AbstractC0757c.class);
        C35953c c35953cM73385r2 = AbstractC25012a.m73385r(new C30330b(c35953c, orCreateKotlinClass2, c35953cM73385r, c40121d2, 2), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass2, c35953cM73385r, c35953c), false, "STRENGTH_WORKOUT_BFF_CACHE_DESERIALIZER");
        C40121d c40121d3 = new C40121d(25);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(InterfaceC34640a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, c35953cM73385r2, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass3, c35953cM73385r2, c40121d3, 2)), false);
        C40121d c40121d4 = new C40121d(26);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(StrengthWorkoutApi.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass4, null, c40121d4, 2)), false);
        C40121d c40121d5 = new C40121d(27);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(C0932a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass5, null, c40121d5, 2)), false);
        C40121d c40121d6 = new C40121d(28);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(C40699c.class);
        C31365d c31365dM73383p = AbstractC25012a.m73383p(new C30330b(c35953c, orCreateKotlinClass6, null, c40121d6, 1), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), false);
        InterfaceC21461d clazz = c22673i0.getOrCreateKotlinClass(InterfaceC21539e.class);
        AbstractC22676k.m65750j(clazz, "clazz");
        C30330b c30330b = c31365dM73383p.f129023a;
        c30330b.f124475f = AbstractC25265s.m74128f1(clazz, (Collection) c30330b.f124475f);
        c33768a.m106774b(AbstractC21598x.m60669Y(clazz, c30330b.f124472c, c30330b.f124470a), c31365dM73383p, true);
        C40121d c40121d7 = new C40121d(29);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(C40698b.class);
        C31365d c31365dM73383p2 = AbstractC25012a.m73383p(new C30330b(c35953c, orCreateKotlinClass7, null, c40121d7, 1), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), false);
        InterfaceC21461d clazz2 = c22673i0.getOrCreateKotlinClass(InterfaceC21538d.class);
        AbstractC22676k.m65750j(clazz2, "clazz");
        C30330b c30330b2 = c31365dM73383p2.f129023a;
        c30330b2.f124475f = AbstractC25265s.m74128f1(clazz2, (Collection) c30330b2.f124475f);
        c33768a.m106774b(AbstractC21598x.m60669Y(clazz2, c30330b2.f124472c, c30330b2.f124470a), c31365dM73383p2, true);
        C40700d c40700d = new C40700d(0);
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(C40697a.class);
        C31365d c31365dM73383p3 = AbstractC25012a.m73383p(new C30330b(c35953c, orCreateKotlinClass8, null, c40700d, 1), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c), false);
        InterfaceC21461d clazz3 = c22673i0.getOrCreateKotlinClass(InterfaceC25310s.class);
        AbstractC22676k.m65750j(clazz3, "clazz");
        C30330b c30330b3 = c31365dM73383p3.f129023a;
        c30330b3.f124475f = AbstractC25265s.m74128f1(clazz3, (Collection) c30330b3.f124475f);
        c33768a.m106774b(AbstractC21598x.m60669Y(clazz3, c30330b3.f124472c, c30330b3.f124470a), c31365dM73383p3, true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final Map m132168k(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return AbstractC25247g0.m73989X(new C23465k(StrengthWorkoutModelKt.STRENGTH_WORKOUT_ITEM_TYPE, AbstractC22671h0.f89337a.getOrCreateKotlinClass(StrengthWorkoutModel.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final AbstractC0757c m132169l(C38266c c38266c, C34911a c34911a) {
        return AbstractC6728b.m20380e(c38266c, (Map) c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Map.class), AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "STRENGTH_WORKOUT_MAPPING")), null, null, null, null, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final InterfaceC34640a m132170m(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C34648i((AbstractC0757c) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC0757c.class), new C35953c("STRENGTH_WORKOUT_JSON")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final StrengthWorkoutApi m132171n(C38266c c38266c, C34911a c34911a) {
        C29222x0 c29222x0M73382o = AbstractC25012a.m73382o(c38266c, "$this$factory", c34911a, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return (StrengthWorkoutApi) AbstractC2875y.m8293f(c29222x0M73382o, (C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), AbstractC25012a.m73384q((AbstractC0757c) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC0757c.class), AbstractC31061c.m95649y((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null), c29222x0M73382o, "STRENGTH_WORKOUT_JSON")), c29222x0M73382o, "defaultOkHttpClient")), StrengthWorkoutApi.class, "create(...)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C0932a m132172o(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C0932a((InterfaceC26834e) factory.m122602a(new C28049b(factory, 22), AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC26834e.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C34911a m132173p(C38266c c38266c) {
        return new C34911a(AbstractC25260n.m74055Z0(new Object[]{c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC34640a.class), new C35953c("STRENGTH_WORKOUT_BFF_CACHE_DESERIALIZER"))}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C40699c m132174q(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C40699c((Map) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Map.class), new C35953c("STRENGTH_WORKOUT_MAPPING")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C40698b m132175r(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C40698b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C40697a m132176s(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C40697a();
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m132167j(c33768a);
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
