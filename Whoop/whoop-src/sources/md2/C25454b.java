package md2;

import ad3.AbstractC0757c;
import be2.C3176c;
import be2.C3178e;
import com.google.gson.Gson;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.json.AbstractC6728b;
import com.whoop.design.json.AbstractC6730d;
import com.whoop.shepherd.domain.ShepherdApi;
import de2.C11985a;
import de2.C11988d;
import de2.C11989e;
import fi0.InterfaceC14515a;
import ge2.C15737b;
import ge2.C15740e;
import ge2.C15742g;
import ie2.C18448c;
import ih0.AbstractC18489d0;
import j93.InterfaceC21461d;
import java.util.List;
import je2.C21623b;
import je2.C21625d;
import l83.C23454a0;
import ld2.C23866a;
import le2.C23879c;
import me2.C25474b;
import me2.C25476d;
import nd1.C26583i;
import nd1.InterfaceC26584j;
import nd2.C26590c;
import p031b9.AbstractC2875y;
import p098dt.AbstractC12350b;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pd2.C29107c;
import pd2.C29109e;
import pg3.C29222x0;
import qf3.C30330b;
import rd2.C31249c;
import rf3.C31362a;
import rf3.C31365d;
import sr2.AbstractC32943y;
import td2.C33717h;
import td2.C33719j;
import tf3.C33768a;
import tr2.InterfaceC34116n;
import u82.C34643d;
import u82.C34644e;
import ud3.C34826l0;
import uf3.C34911a;
import v82.C35799a;
import vd2.C35913c;
import vf3.C35953c;
import wb3.AbstractC37056f;
import wf3.C37247a;
import xd2.C38213i;
import xd2.C38215k;
import xf3.C38266c;
import xm0.C38458b;
import zd2.C40556c;

/* JADX INFO: renamed from: md2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m65681d2 = {"Lmd2/b;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25454b implements InterfaceC26584j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC26584j> dependencies = AbstractC37056f.m118959K(new C26583i(), new C35799a());

    /* JADX INFO: renamed from: A */
    private static final C23454a0 m74809A(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C25453a c25453a = new C25453a(0);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(ShepherdApi.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass, null, c25453a, 1)), false);
        C25453a c25453a2 = new C25453a(2);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(C23866a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass2, null, c25453a2, 1)), false);
        C25453a c25453a3 = new C25453a(9);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C35913c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass3, null, c25453a3, 2)), false);
        C25453a c25453a4 = new C25453a(10);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(C38215k.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass4, null, c25453a4, 2)), false);
        C25453a c25453a5 = new C25453a(12);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(C38213i.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass5, null, c25453a5, 2)), false);
        C25453a c25453a6 = new C25453a(13);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(C23879c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass6, null, c25453a6, 2)), false);
        C25453a c25453a7 = new C25453a(14);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(C25476d.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass7, null, c25453a7, 2)), false);
        C25453a c25453a8 = new C25453a(15);
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(C25474b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass8, null, c25453a8, 2)), false);
        C25453a c25453a9 = new C25453a(16);
        InterfaceC21461d orCreateKotlinClass9 = c22673i0.getOrCreateKotlinClass(C11988d.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass9, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass9, null, c25453a9, 2)), false);
        C25453a c25453a10 = new C25453a(17);
        InterfaceC21461d orCreateKotlinClass10 = c22673i0.getOrCreateKotlinClass(C11989e.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass10, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass10, null, c25453a10, 1)), false);
        C25453a c25453a11 = new C25453a(11);
        InterfaceC21461d orCreateKotlinClass11 = c22673i0.getOrCreateKotlinClass(C11985a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass11, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass11, null, c25453a11, 2)), false);
        C25453a c25453a12 = new C25453a(18);
        InterfaceC21461d orCreateKotlinClass12 = c22673i0.getOrCreateKotlinClass(C15742g.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass12, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass12, null, c25453a12, 2)), false);
        C25453a c25453a13 = new C25453a(19);
        InterfaceC21461d orCreateKotlinClass13 = c22673i0.getOrCreateKotlinClass(C15737b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass13, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass13, null, c25453a13, 2)), false);
        C25453a c25453a14 = new C25453a(20);
        InterfaceC21461d orCreateKotlinClass14 = c22673i0.getOrCreateKotlinClass(C15740e.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass14, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass14, null, c25453a14, 2)), false);
        C25453a c25453a15 = new C25453a(21);
        InterfaceC21461d orCreateKotlinClass15 = c22673i0.getOrCreateKotlinClass(C31249c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass15, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass15, null, c25453a15, 2)), false);
        C25453a c25453a16 = new C25453a(22);
        InterfaceC21461d orCreateKotlinClass16 = c22673i0.getOrCreateKotlinClass(C33719j.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass16, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass16, null, c25453a16, 2)), false);
        C25453a c25453a17 = new C25453a(23);
        InterfaceC21461d orCreateKotlinClass17 = c22673i0.getOrCreateKotlinClass(C33717h.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass17, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass17, null, c25453a17, 2)), false);
        C25453a c25453a18 = new C25453a(24);
        InterfaceC21461d orCreateKotlinClass18 = c22673i0.getOrCreateKotlinClass(C18448c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass18, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass18, null, c25453a18, 2)), false);
        C25453a c25453a19 = new C25453a(25);
        InterfaceC21461d orCreateKotlinClass19 = c22673i0.getOrCreateKotlinClass(C21625d.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass19, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass19, null, c25453a19, 2)), false);
        C25453a c25453a20 = new C25453a(1);
        InterfaceC21461d orCreateKotlinClass20 = c22673i0.getOrCreateKotlinClass(C21623b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass20, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass20, null, c25453a20, 2)), false);
        C25453a c25453a21 = new C25453a(3);
        InterfaceC21461d orCreateKotlinClass21 = c22673i0.getOrCreateKotlinClass(C26590c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass21, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass21, null, c25453a21, 2)), false);
        C25453a c25453a22 = new C25453a(4);
        InterfaceC21461d orCreateKotlinClass22 = c22673i0.getOrCreateKotlinClass(C29109e.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass22, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass22, null, c25453a22, 2)), false);
        C25453a c25453a23 = new C25453a(5);
        InterfaceC21461d orCreateKotlinClass23 = c22673i0.getOrCreateKotlinClass(C29107c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass23, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass23, null, c25453a23, 2)), false);
        C25453a c25453a24 = new C25453a(6);
        InterfaceC21461d orCreateKotlinClass24 = c22673i0.getOrCreateKotlinClass(C40556c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass24, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass24, null, c25453a24, 2)), false);
        C25453a c25453a25 = new C25453a(7);
        InterfaceC21461d orCreateKotlinClass25 = c22673i0.getOrCreateKotlinClass(C3178e.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass25, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass25, null, c25453a25, 2)), false);
        C25453a c25453a26 = new C25453a(8);
        InterfaceC21461d orCreateKotlinClass26 = c22673i0.getOrCreateKotlinClass(C3176c.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass26, null, c25453a26, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass26, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final ShepherdApi m74810B(C38266c c38266c, C34911a c34911a) {
        Gson gsonCreate = AbstractC6730d.m20388f(AbstractC18489d0.m53366g(c38266c, "$this$single", c34911a, "it"), null, null, 3, null).create();
        AbstractC0757c abstractC0757cM20380e = AbstractC6728b.m20380e(c38266c, null, null, null, null, null, 31, null);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C34644e c34644e = (C34644e) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34644e.class), null);
        AbstractC22676k.m65747g(gsonCreate);
        C34643d c34643dM109481a = c34644e.m109481a(gsonCreate, abstractC0757cM20380e, AbstractC12350b.m34570S("kt-serialization-shepherd"));
        C29222x0 c29222x0 = new C29222x0();
        return (ShepherdApi) AbstractC2875y.m8293f(c29222x0, (C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), AbstractC2875y.m8312y((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null), c29222x0, c34643dM109481a, "defaultOkHttpClient")), ShepherdApi.class, "create(...)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23866a m74811C(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C23866a((InterfaceC14515a) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C11985a m74812D(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C11985a((ShepherdApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(ShepherdApi.class), null), (C11989e) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C11989e.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C15742g m74813E(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C15742g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C15737b m74814F(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        return new C15737b(null, (C11985a) viewModel.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C11985a.class), null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C15740e m74815G(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C15740e((C11988d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C11988d.class), null), (C15742g) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C15742g.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C31249c m74816H(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C31249c((ShepherdApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(ShepherdApi.class), null), InterfaceC34116n.INSTANCE.m107848a("ArrhythmiaHistoryDetailInteractor"), (C38458b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C38458b.class), null), (InterfaceC14515a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C33719j m74817I(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C33719j(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C33717h m74818J(C38266c viewModel, C34911a c34911a) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(c34911a, "<destruct>");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C33717h((C31249c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C31249c.class), null), (C33719j) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C33719j.class), null), (String) c34911a.m110110a(0, c22673i0.getOrCreateKotlinClass(String.class)), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C18448c m74819K(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C18448c((ShepherdApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(ShepherdApi.class), null), (InterfaceC14515a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14515a.class), null), (C38458b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C38458b.class), null), InterfaceC34116n.INSTANCE.m107848a("ShepherdToggleSettingsInteractor"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C21625d m74820L(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C21625d(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C21623b m74821M(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C21623b((C18448c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C18448c.class), null), (C21625d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C21625d.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C35913c m74822N(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C35913c((ShepherdApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(ShepherdApi.class), null), (InterfaceC14515a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14515a.class), null), (C38458b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C38458b.class), null), InterfaceC34116n.INSTANCE.m107848a("ArrhythmiaSettingsInteractor"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C26590c m74823O(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C26590c((ShepherdApi) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(ShepherdApi.class), null), InterfaceC34116n.INSTANCE.m107848a("ArrhythmiaAboutInteractor"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C29109e m74824P(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C29109e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C29107c m74825Q(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C29107c((C26590c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C26590c.class), null), (C29109e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C29109e.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C40556c m74826R(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C40556c((ShepherdApi) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(ShepherdApi.class), null), InterfaceC34116n.INSTANCE.m107848a("ShepherdRegistrationInteractor"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C3178e m74827S(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C3178e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C3176c m74828T(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C3176c((C40556c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C40556c.class), null), (C3178e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C3178e.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C38215k m74829U(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C38215k(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C38213i m74830V(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C38213i((C35913c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C35913c.class), null), (C38215k) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C38215k.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23879c m74831W(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C23879c((ShepherdApi) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(ShepherdApi.class), null), InterfaceC34116n.INSTANCE.m107848a("ArrhythmiaWelcomeInteractor"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C25476d m74832X(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C25476d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C25474b m74833Y(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C25474b((C23879c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C23879c.class), null), (C25476d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C25476d.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C11988d m74834Z(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C11988d((ShepherdApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(ShepherdApi.class), null), InterfaceC34116n.INSTANCE.m107848a("ArrhythmiaTermsOfUseInteractor"), (C11989e) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C11989e.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C11989e m74836a0(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C11989e();
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m74809A(c33768a);
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
