package nd1;

import aa0.C0591a;
import ao1.C1873h;
import ba0.C2899c;
import bh.C3238a;
import ce1.C4491b;
import ci2.InterfaceC4733b;
import com.whoop.common.network.api.AddActivitiesApi;
import com.whoop.common.network.api.StrapLocationServiceApi;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.json.AbstractC6728b;
import com.whoop.editactivities.network.EditActivitiesDrawerApi;
import com.whoop.service.network.ActivitiesApi;
import da0.C11828a;
import da0.C11830c;
import de1.C11983c;
import dt0.InterfaceC12362e;
import fi0.InterfaceC14515a;
import ge1.C15732a;
import ge1.C15734c;
import ge3.AbstractC15751g;
import ia0.C18292a;
import j93.InterfaceC21461d;
import java.util.List;
import jb1.C21535a;
import js0.AbstractC21909c;
import l83.C23454a0;
import n52.C26302a;
import na1.C26511a;
import od1.C27851n;
import or2.C28205u0;
import p007a6.InterfaceC0422g;
import p031b9.AbstractC2875y;
import p098dt.AbstractC12350b;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pf.AbstractC29125c;
import pg3.C29222x0;
import pg3.C29224y0;
import pp0.C29423a;
import pp0.C29425c;
import pp0.C29426d;
import pp0.C29427e;
import qf3.C30330b;
import rf3.C31362a;
import rf3.C31365d;
import sr2.AbstractC32943y;
import tf3.C33768a;
import tr2.InterfaceC34116n;
import u92.C34660d;
import ud3.C34826l0;
import uf3.C34911a;
import v02.C35512a;
import v82.C35799a;
import vf3.C35953c;
import wb3.AbstractC37056f;
import wd1.C37166c;
import wf3.C37247a;
import xd1.C38204c;
import xf3.C38266c;
import xm0.C38458b;
import zd1.C40546a;
import zd1.C40548c;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: nd1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m65681d2 = {"Lnd1/a;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C26575a implements InterfaceC26584j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC26584j> dependencies = AbstractC37056f.m118959K(new C35512a(), new C35799a());

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C34911a m78749A() {
        return AbstractC15751g.m44431K(AbstractC12350b.m34570S("kt-serialization-strap-location"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C40546a m78750B(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C1873h c1873h = new C1873h(factory, 22);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C40546a((C28205u0) factory.m122602a(c1873h, c22673i0.getOrCreateKotlinClass(C28205u0.class), null), (InterfaceC41070a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC41070a.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C34911a m78751C(C38266c c38266c) {
        return AbstractC15751g.m44431K(AbstractC29125c.m88532i(c38266c));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C37166c m78752D(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C37166c((InterfaceC14515a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C38204c m78753E(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        StrapLocationServiceApi strapLocationServiceApi = (StrapLocationServiceApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(StrapLocationServiceApi.class), null);
        InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("EditActivityInteractor");
        AddActivitiesApi addActivitiesApi = (AddActivitiesApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AddActivitiesApi.class), null);
        C18292a c18292a = (C18292a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C18292a.class), null);
        C29423a c29423a = (C29423a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C29423a.class), null);
        C37166c c37166c = (C37166c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C37166c.class), null);
        C29427e c29427e = (C29427e) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C29427e.class), null);
        InterfaceC12362e interfaceC12362e = (InterfaceC12362e) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC12362e.class), null);
        return new C38204c(strapLocationServiceApi, interfaceC34116nM107848a, addActivitiesApi, c18292a, AbstractC6728b.m20380e(factory, null, null, null, null, null, 31, null), c29423a, c37166c, (C29425c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C29425c.class), null), c29427e, interfaceC12362e, (C38458b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C38458b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C29423a m78754F(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C29423a((InterfaceC41070a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC41070a.class), null), (AbstractC21909c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC21909c.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C29427e m78755G(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C29427e((InterfaceC0422g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC0422g.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final EditActivitiesDrawerApi m78756H(C38266c c38266c, C34911a c34911a) {
        C29222x0 c29222x0M73382o = AbstractC25012a.m73382o(c38266c, "$this$factory", c34911a, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        c29222x0M73382o.m88729c(((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null)).getApiBaseUrl());
        return (EditActivitiesDrawerApi) AbstractC2875y.m8293f(c29222x0M73382o, (C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), AbstractC25012a.m73384q(AbstractC6728b.m20380e(c38266c, null, null, null, null, null, 31, null), c29222x0M73382o, "defaultOkHttpClient")), EditActivitiesDrawerApi.class, "create(...)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C4491b m78757I(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C4491b((InterfaceC14515a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J */
    public static final C11983c m78758J(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C11983c((EditActivitiesDrawerApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(EditActivitiesDrawerApi.class), null), new C21535a(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0), InterfaceC34116n.INSTANCE.m107848a("EditActivitiesDrawerInteractor"), (AbstractC21909c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC21909c.class), null), AbstractC6728b.m20380e(factory, null, null, null, null, null, 31, null), (C4491b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C4491b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C15732a m78759K(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C15732a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C15734c m78760L(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C15734c((C11983c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C11983c.class), null), (C15732a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C15732a.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C27851n m78761M(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C27851n((C18292a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C18292a.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C29425c m78762N(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C29425c((InterfaceC4733b) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC4733b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C2899c m78763O(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        StrapLocationServiceApi strapLocationServiceApi = (StrapLocationServiceApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(StrapLocationServiceApi.class), null);
        InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("AddActivityInteractor");
        ActivitiesApi activitiesApi = (ActivitiesApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(ActivitiesApi.class), null);
        C18292a c18292a = (C18292a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C18292a.class), null);
        C0591a c0591a = (C0591a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C0591a.class), null);
        C29423a c29423a = (C29423a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C29423a.class), null);
        C34660d c34660d = (C34660d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34660d.class), new C35953c("mainPrefs"));
        C29427e c29427e = (C29427e) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C29427e.class), null);
        InterfaceC12362e interfaceC12362e = (InterfaceC12362e) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC12362e.class), null);
        return new C2899c(strapLocationServiceApi, interfaceC34116nM107848a, activitiesApi, c18292a, AbstractC6728b.m20380e(factory, null, null, null, null, null, 31, null), c0591a, c29423a, c34660d, (C29425c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C29425c.class), null), c29427e, interfaceC12362e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C11830c m78764P(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C11830c((C2899c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C2899c.class), null), (C27851n) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C27851n.class), null), (C11828a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C11828a.class), null), null, (InterfaceC41070a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC41070a.class), null), 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C29426d m78765Q(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C29426d(AbstractC29125c.m88532i(factory), C3238a.m9378a(AbstractC29125c.m88531h(factory)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C11828a m78766R(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C1873h c1873h = new C1873h(factory, 23);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C11828a((C28205u0) factory.m122602a(c1873h, c22673i0.getOrCreateKotlinClass(C28205u0.class), null), (InterfaceC41070a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC41070a.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (C29426d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C29426d.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C34911a m78767S(C38266c c38266c) {
        return AbstractC15751g.m44431K(AbstractC29125c.m88532i(c38266c));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C0591a m78768T(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C0591a((InterfaceC14515a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C40548c m78769U(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C40548c((C38204c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C38204c.class), null), (C27851n) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C27851n.class), null), (C40546a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C40546a.class), null), null, (InterfaceC41070a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC41070a.class), null), 8, null);
    }

    /* JADX INFO: renamed from: x */
    private static final C23454a0 m78793x(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C26302a c26302a = new C26302a(9);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(AddActivitiesApi.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass, null, c26302a, 2)), false);
        C26302a c26302a2 = new C26302a(11);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(StrapLocationServiceApi.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass2, null, c26302a2, 1)), false);
        C26302a c26302a3 = new C26302a(12);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C27851n.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass3, null, c26302a3, 2)), false);
        C26302a c26302a4 = new C26302a(13);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(C29425c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass4, null, c26302a4, 2)), false);
        C26302a c26302a5 = new C26302a(14);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(C2899c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass5, null, c26302a5, 2)), false);
        C26302a c26302a6 = new C26302a(15);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(C11830c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass6, null, c26302a6, 2)), false);
        C26302a c26302a7 = new C26302a(16);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(C29426d.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass7, null, c26302a7, 2)), false);
        C26302a c26302a8 = new C26302a(17);
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(C11828a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass8, null, c26302a8, 2)), false);
        C26302a c26302a9 = new C26302a(18);
        InterfaceC21461d orCreateKotlinClass9 = c22673i0.getOrCreateKotlinClass(C0591a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass9, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass9, null, c26302a9, 2)), false);
        C26302a c26302a10 = new C26302a(19);
        InterfaceC21461d orCreateKotlinClass10 = c22673i0.getOrCreateKotlinClass(C40548c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass10, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass10, null, c26302a10, 2)), false);
        C26302a c26302a11 = new C26302a(20);
        InterfaceC21461d orCreateKotlinClass11 = c22673i0.getOrCreateKotlinClass(C40546a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass11, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass11, null, c26302a11, 2)), false);
        C26302a c26302a12 = new C26302a(21);
        InterfaceC21461d orCreateKotlinClass12 = c22673i0.getOrCreateKotlinClass(C37166c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass12, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass12, null, c26302a12, 2)), false);
        C26302a c26302a13 = new C26302a(22);
        InterfaceC21461d orCreateKotlinClass13 = c22673i0.getOrCreateKotlinClass(C38204c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass13, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass13, null, c26302a13, 2)), false);
        C26302a c26302a14 = new C26302a(23);
        InterfaceC21461d orCreateKotlinClass14 = c22673i0.getOrCreateKotlinClass(C29423a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass14, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass14, null, c26302a14, 2)), false);
        C26302a c26302a15 = new C26302a(24);
        InterfaceC21461d orCreateKotlinClass15 = c22673i0.getOrCreateKotlinClass(C29427e.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass15, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass15, null, c26302a15, 2)), false);
        C26302a c26302a16 = new C26302a(25);
        InterfaceC21461d orCreateKotlinClass16 = c22673i0.getOrCreateKotlinClass(EditActivitiesDrawerApi.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass16, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass16, null, c26302a16, 2)), false);
        C26302a c26302a17 = new C26302a(26);
        InterfaceC21461d orCreateKotlinClass17 = c22673i0.getOrCreateKotlinClass(C4491b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass17, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass17, null, c26302a17, 2)), false);
        C26302a c26302a18 = new C26302a(27);
        InterfaceC21461d orCreateKotlinClass18 = c22673i0.getOrCreateKotlinClass(C11983c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass18, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass18, null, c26302a18, 2)), false);
        C26302a c26302a19 = new C26302a(28);
        InterfaceC21461d orCreateKotlinClass19 = c22673i0.getOrCreateKotlinClass(C15732a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass19, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass19, null, c26302a19, 2)), false);
        C26302a c26302a20 = new C26302a(10);
        InterfaceC21461d orCreateKotlinClass20 = c22673i0.getOrCreateKotlinClass(C15734c.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass20, null, c26302a20, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass20, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final AddActivitiesApi m78794y(C38266c c38266c, C34911a c34911a) {
        C29222x0 c29222x0M73382o = AbstractC25012a.m73382o(c38266c, "$this$factory", c34911a, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        c29222x0M73382o.m88729c(((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null)).getApiBaseUrl());
        return (AddActivitiesApi) AbstractC2875y.m8293f(c29222x0M73382o, (C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), AbstractC25012a.m73384q(AbstractC6728b.m20380e(c38266c, null, null, null, null, null, 31, null), c29222x0M73382o, "defaultOkHttpClient")), AddActivitiesApi.class, "create(...)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final StrapLocationServiceApi m78795z(C38266c c38266c, C34911a c34911a) {
        Object objM88733b = ((C29224y0) c38266c.m122602a(new C26511a(16), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29224y0.class), AbstractC25012a.m73387t(c38266c, "$this$single", c34911a, "it", "featureFlaggableLegacyDefaultRetrofit"))).m88733b(StrapLocationServiceApi.class);
        AbstractC22676k.m65749i(objM88733b, "create(...)");
        return (StrapLocationServiceApi) objM88733b;
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m78793x(c33768a);
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
