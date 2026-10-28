package on1;

import ad3.AbstractC0757c;
import ao1.C1872g;
import com.google.gson.Gson;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.json.AbstractC6728b;
import com.whoop.design.json.AbstractC6730d;
import fi0.InterfaceC14515a;
import ih0.AbstractC18489d0;
import j93.InterfaceC21461d;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25260n;
import nd1.C26583i;
import nd1.InterfaceC26584j;
import nm0.InterfaceC26834e;
import nn1.C26866a;
import nz1.C27305a;
import p088dc.AbstractC11895b;
import p098dt.AbstractC12350b;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pn1.C29380c;
import qf3.C30330b;
import qn1.C30518a;
import qn1.C30519b;
import qn1.C30520c;
import rf3.C31362a;
import rf3.C31365d;
import sn1.C32774b;
import tf3.C33768a;
import tn1.C33960b;
import u82.C34642c;
import u82.InterfaceC34640a;
import uf3.C34911a;
import v82.C35799a;
import vf3.C35953c;
import wb3.AbstractC37056f;
import wf3.C37247a;
import xf3.C38266c;

/* JADX INFO: renamed from: on1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m65681d2 = {"Lon1/b;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "b", "home-notifications-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28047b implements InterfaceC26584j {

    /* JADX INFO: renamed from: b */
    private static final a f113184b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final int f113185c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC26584j> dependencies = AbstractC37056f.m118959K(new C26583i(), new C35799a());

    /* JADX INFO: renamed from: on1.b$a */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, m65681d2 = {"Lon1/b$a;", "", "<init>", "()V", "", "HOME_NOTIFICATIONS_CENTER_GSON", "Ljava/lang/String;", "HOME_NOTIFICATIONS_CENTER_JSON", "HOME_NOTIFICATIONS_CENTER_BFF_CACHE_DESERIALIZER", "HOME_NOTIFICATIONS_CENTER_CACHED_API_SOURCE", "home-notifications-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: m */
    private static final C23454a0 m84588m(C33768a c33768a) {
        C35953c c35953cM73386s = AbstractC25012a.m73386s(c33768a, "$this$module", "HOME_NOTIFICATIONS_CENTER_GSON");
        C27305a c27305a = new C27305a(26);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Gson.class);
        C35953c c35953c = C37247a.f159360e;
        C35953c c35953cM53379t = AbstractC18489d0.m53379t(new C30330b(c35953c, orCreateKotlinClass, c35953cM73386s, c27305a, 1), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass, c35953cM73386s, c35953c), false, "HOME_NOTIFICATIONS_CENTER_JSON");
        C27305a c27305a2 = new C27305a(29);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(AbstractC0757c.class);
        C35953c c35953cM53379t2 = AbstractC18489d0.m53379t(new C30330b(c35953c, orCreateKotlinClass2, c35953cM53379t, c27305a2, 1), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass2, c35953cM53379t, c35953c), false, "HOME_NOTIFICATIONS_CENTER_BFF_CACHE_DESERIALIZER");
        C28046a c28046a = new C28046a(0);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(InterfaceC34640a.class);
        C35953c c35953cM73385r = AbstractC25012a.m73385r(new C30330b(c35953c, orCreateKotlinClass3, c35953cM53379t2, c28046a, 2), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass3, c35953cM53379t2, c35953c), false, "HOME_NOTIFICATIONS_CENTER_CACHED_API_SOURCE");
        C28046a c28046a2 = new C28046a(1);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(InterfaceC26834e.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, c35953cM73385r, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass4, c35953cM73385r, c28046a2, 2)), false);
        C28046a c28046a3 = new C28046a(2);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(C33960b.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass5, null, c28046a3, 2)), false);
        C28046a c28046a4 = new C28046a(3);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(C32774b.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass6, null, c28046a4, 2)), false);
        C28046a c28046a5 = new C28046a(4);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(C29380c.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass7, null, c28046a5, 1)), false);
        C28046a c28046a6 = new C28046a(5);
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(C30518a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass8, null, c28046a6, 2)), false);
        C28046a c28046a7 = new C28046a(6);
        InterfaceC21461d orCreateKotlinClass9 = c22673i0.getOrCreateKotlinClass(C30519b.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass9, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass9, null, c28046a7, 2)), false);
        C27305a c27305a3 = new C27305a(27);
        InterfaceC21461d orCreateKotlinClass10 = c22673i0.getOrCreateKotlinClass(C30520c.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass10, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass10, null, c27305a3, 2)), false);
        C27305a c27305a4 = new C27305a(28);
        InterfaceC21461d orCreateKotlinClass11 = c22673i0.getOrCreateKotlinClass(C26866a.class);
        AbstractC11895b.m31980C(new C30330b(c35953c, orCreateKotlinClass11, null, c27305a4, 1), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass11, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final Gson m84589n(C38266c c38266c, C34911a c34911a) {
        Gson gsonCreate = AbstractC6730d.m20388f(AbstractC18489d0.m53366g(c38266c, "$this$single", c34911a, "it"), null, null, 3, null).create();
        AbstractC22676k.m65749i(gsonCreate, "create(...)");
        return gsonCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final AbstractC0757c m84590o(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return AbstractC6728b.m20380e(single, null, null, null, null, null, 31, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C26866a m84591p(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C26866a((InterfaceC14515a) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final InterfaceC34640a m84592q(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C35953c c35953c = new C35953c("HOME_NOTIFICATIONS_CENTER_JSON");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C34642c((AbstractC0757c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC0757c.class), c35953c), (Gson) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(Gson.class), new C35953c("HOME_NOTIFICATIONS_CENTER_GSON")), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), AbstractC12350b.m34570S("kt-serialization-home-notifications-center"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final InterfaceC26834e m84593r(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return (InterfaceC26834e) factory.m122602a(new C1872g(factory, 6), AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC26834e.class), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C34911a m84594s(C38266c c38266c) {
        return new C34911a(AbstractC25260n.m74055Z0(new Object[]{c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC34640a.class), new C35953c("HOME_NOTIFICATIONS_CENTER_BFF_CACHE_DESERIALIZER"))}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C33960b m84595t(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C33960b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C32774b m84596u(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C32774b((C30518a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C30518a.class), null), (C33960b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C33960b.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C29380c m84597v(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C29380c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C30518a m84598w(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C30518a((C30519b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C30519b.class), null), (C30520c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C30520c.class), null), (C26866a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C26866a.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C30519b m84599x(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C35953c c35953c = new C35953c("HOME_NOTIFICATIONS_CENTER_CACHED_API_SOURCE");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C30519b((InterfaceC26834e) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC26834e.class), c35953c), (C29380c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C29380c.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C30520c m84600y(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C35953c c35953c = new C35953c("HOME_NOTIFICATIONS_CENTER_CACHED_API_SOURCE");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C30520c((InterfaceC26834e) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC26834e.class), c35953c), (C26866a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C26866a.class), null));
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m84588m(c33768a);
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
