package ws1;

import ad3.AbstractC0757c;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import bt1.C3622c;
import bt1.C3624e;
import ci2.InterfaceC4733b;
import com.google.gson.Gson;
import com.whoop.data.remote.api.FileDownloaderApi;
import com.whoop.design.json.AbstractC6728b;
import com.whoop.design.json.AbstractC6730d;
import com.whoop.labrador.data.WhoopLabradorDatabase;
import com.whoop.labrador.domain.LabradorApi;
import dt1.C12366d;
import dt1.C12368f;
import dt1.C12370h;
import dt1.C12372j;
import fi0.InterfaceC14515a;
import ft1.C14769b;
import ft1.C14771d;
import fu1.InterfaceC14783b;
import ht1.C17626c;
import i92.InterfaceC18260e;
import ih0.AbstractC18489d0;
import it1.C20928b;
import it1.C20930d;
import j93.InterfaceC21461d;
import java.time.Clock;
import java.util.Collection;
import java.util.List;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import kt1.C22827c;
import kt1.C22828d;
import kt1.C22830f;
import l83.C23454a0;
import m83.AbstractC25265s;
import nd1.C26583i;
import nd1.InterfaceC26584j;
import nm0.InterfaceC26834e;
import nt1.C27124c;
import nt1.C27126e;
import nt1.C27128g;
import od1.InterfaceC27837a0;
import or2.C28144a0;
import p031b9.AbstractC2875y;
import p098dt.AbstractC12350b;
import p218ic.AbstractC18377p0;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pg3.C29222x0;
import pt1.C29514d;
import qf3.C30330b;
import qk1.InterfaceC30444b;
import rf3.C31362a;
import rf3.C31365d;
import rt1.C31809g;
import rt1.C31811i;
import sr2.AbstractC32943y;
import ss1.C32948a;
import tf3.C33768a;
import tr2.InterfaceC34116n;
import ts1.C34142a;
import ts1.C34143b;
import ts1.InterfaceC34144c;
import tt1.C34162c;
import u02.C34387c;
import u82.C34643d;
import u82.C34644e;
import ud3.C34826l0;
import uf3.C34911a;
import us1.InterfaceC35218a;
import v82.C35799a;
import vf3.C35953c;
import vk1.C36087a;
import vt1.C36488b;
import vt1.C36490d;
import wb3.AbstractC37056f;
import wf3.C37247a;
import xf3.C38266c;
import xm0.C38458b;
import xs1.C38639a;
import xt1.C38646c;
import ys1.C39753c;
import yu0.C39787d;
import zt1.C41130e;
import zt1.C41131f;

/* JADX INFO: renamed from: ws1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m65681d2 = {"Lws1/b;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37608b implements InterfaceC26584j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC26584j> dependencies = AbstractC37056f.m118959K(new C26583i(), new C35799a());

    /* JADX INFO: renamed from: I */
    private static final C23454a0 m120669I(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C36087a c36087a = new C36087a(16);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(WhoopLabradorDatabase.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass, null, c36087a, 1)), false);
        C36087a c36087a2 = new C36087a(18);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(LabradorApi.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass2, null, c36087a2, 1)), false);
        C37607a c37607a = new C37607a(0);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C17626c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass3, null, c37607a, 2)), false);
        C37607a c37607a2 = new C37607a(5);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(C20930d.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass4, null, c37607a2, 2)), false);
        C37607a c37607a3 = new C37607a(6);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(C20928b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass5, null, c37607a3, 2)), false);
        C37607a c37607a4 = new C37607a(7);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(C29514d.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass6, null, c37607a4, 2)), false);
        C37607a c37607a5 = new C37607a(9);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(C31811i.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass7, null, c37607a5, 2)), false);
        C37607a c37607a6 = new C37607a(10);
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(C31809g.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass8, null, c37607a6, 2)), false);
        C37607a c37607a7 = new C37607a(11);
        InterfaceC21461d orCreateKotlinClass9 = c22673i0.getOrCreateKotlinClass(InterfaceC35218a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass9, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass9, null, c37607a7, 2)), false);
        C37607a c37607a8 = new C37607a(12);
        InterfaceC21461d orCreateKotlinClass10 = c22673i0.getOrCreateKotlinClass(C34142a.class);
        C30330b c30330b = new C30330b(c35953c, orCreateKotlinClass10, null, c37607a8, 2);
        String strM60669Y = AbstractC21598x.m60669Y(orCreateKotlinClass10, null, c35953c);
        C31362a c31362a = new C31362a(c30330b);
        module.m106774b(strM60669Y, c31362a, false);
        InterfaceC21461d clazz = c22673i0.getOrCreateKotlinClass(InterfaceC30444b.class);
        AbstractC22676k.m65750j(clazz, "clazz");
        C30330b c30330b2 = c31362a.f129023a;
        c30330b2.f124475f = AbstractC25265s.m74128f1(clazz, (Collection) c30330b2.f124475f);
        module.m106774b(AbstractC21598x.m60669Y(clazz, c30330b2.f124472c, c30330b2.f124470a), c31362a, true);
        C36087a c36087a3 = new C36087a(27);
        InterfaceC21461d orCreateKotlinClass11 = c22673i0.getOrCreateKotlinClass(InterfaceC34144c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass11, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass11, null, c36087a3, 2)), false);
        C37607a c37607a9 = new C37607a(8);
        InterfaceC21461d orCreateKotlinClass12 = c22673i0.getOrCreateKotlinClass(C38639a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass12, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass12, null, c37607a9, 2)), false);
        C37607a c37607a10 = new C37607a(13);
        InterfaceC21461d orCreateKotlinClass13 = c22673i0.getOrCreateKotlinClass(C39753c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass13, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass13, null, c37607a10, 2)), false);
        C37607a c37607a11 = new C37607a(14);
        InterfaceC21461d orCreateKotlinClass14 = c22673i0.getOrCreateKotlinClass(C3624e.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass14, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass14, null, c37607a11, 2)), false);
        C37607a c37607a12 = new C37607a(15);
        InterfaceC21461d orCreateKotlinClass15 = c22673i0.getOrCreateKotlinClass(C3622c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass15, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass15, null, c37607a12, 2)), false);
        C37607a c37607a13 = new C37607a(16);
        InterfaceC21461d orCreateKotlinClass16 = c22673i0.getOrCreateKotlinClass(C34162c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass16, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass16, null, c37607a13, 2)), false);
        C37607a c37607a14 = new C37607a(17);
        InterfaceC21461d orCreateKotlinClass17 = c22673i0.getOrCreateKotlinClass(C36490d.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass17, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass17, null, c37607a14, 2)), false);
        C37607a c37607a15 = new C37607a(18);
        InterfaceC21461d orCreateKotlinClass18 = c22673i0.getOrCreateKotlinClass(C36488b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass18, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass18, null, c37607a15, 2)), false);
        C37607a c37607a16 = new C37607a(19);
        InterfaceC21461d orCreateKotlinClass19 = c22673i0.getOrCreateKotlinClass(C22827c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass19, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass19, null, c37607a16, 2)), false);
        C36087a c36087a4 = new C36087a(17);
        InterfaceC21461d orCreateKotlinClass20 = c22673i0.getOrCreateKotlinClass(C22828d.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass20, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass20, null, c36087a4, 1)), false);
        C36087a c36087a5 = new C36087a(19);
        InterfaceC21461d orCreateKotlinClass21 = c22673i0.getOrCreateKotlinClass(C27126e.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass21, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass21, null, c36087a5, 2)), false);
        C36087a c36087a6 = new C36087a(20);
        InterfaceC21461d orCreateKotlinClass22 = c22673i0.getOrCreateKotlinClass(C27124c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass22, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass22, null, c36087a6, 2)), false);
        C36087a c36087a7 = new C36087a(21);
        InterfaceC21461d orCreateKotlinClass23 = c22673i0.getOrCreateKotlinClass(C22830f.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass23, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass23, null, c36087a7, 2)), false);
        C36087a c36087a8 = new C36087a(22);
        InterfaceC21461d orCreateKotlinClass24 = c22673i0.getOrCreateKotlinClass(C27128g.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass24, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass24, null, c36087a8, 2)), false);
        C36087a c36087a9 = new C36087a(23);
        InterfaceC21461d orCreateKotlinClass25 = c22673i0.getOrCreateKotlinClass(C38646c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass25, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass25, null, c36087a9, 2)), false);
        C36087a c36087a10 = new C36087a(24);
        InterfaceC21461d orCreateKotlinClass26 = c22673i0.getOrCreateKotlinClass(C41131f.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass26, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass26, null, c36087a10, 2)), false);
        C36087a c36087a11 = new C36087a(25);
        InterfaceC21461d orCreateKotlinClass27 = c22673i0.getOrCreateKotlinClass(C12366d.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass27, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass27, null, c36087a11, 2)), false);
        C36087a c36087a12 = new C36087a(26);
        InterfaceC21461d orCreateKotlinClass28 = c22673i0.getOrCreateKotlinClass(C12372j.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass28, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass28, null, c36087a12, 2)), false);
        C36087a c36087a13 = new C36087a(28);
        InterfaceC21461d orCreateKotlinClass29 = c22673i0.getOrCreateKotlinClass(C12368f.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass29, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass29, null, c36087a13, 2)), false);
        C36087a c36087a14 = new C36087a(29);
        InterfaceC21461d orCreateKotlinClass30 = c22673i0.getOrCreateKotlinClass(C41130e.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass30, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass30, null, c36087a14, 2)), false);
        C37607a c37607a17 = new C37607a(1);
        InterfaceC21461d orCreateKotlinClass31 = c22673i0.getOrCreateKotlinClass(C14769b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass31, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass31, null, c37607a17, 2)), false);
        C37607a c37607a18 = new C37607a(2);
        InterfaceC21461d orCreateKotlinClass32 = c22673i0.getOrCreateKotlinClass(C14771d.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass32, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass32, null, c37607a18, 2)), false);
        C37607a c37607a19 = new C37607a(3);
        InterfaceC21461d orCreateKotlinClass33 = c22673i0.getOrCreateKotlinClass(C32948a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass33, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass33, null, c37607a19, 2)), false);
        C37607a c37607a20 = new C37607a(4);
        InterfaceC21461d orCreateKotlinClass34 = c22673i0.getOrCreateKotlinClass(C12370h.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass34, null, c37607a20, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass34, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final WhoopLabradorDatabase m120670J(C38266c c38266c, C34911a c34911a) {
        return (WhoopLabradorDatabase) AbstractC21598x.m60645C(AbstractC2875y.m8292e(c38266c, "$this$single", c34911a, "it", c38266c), WhoopLabradorDatabase.class, "whoop_labrador_db").m5450b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final LabradorApi m120671K(C38266c c38266c, C34911a c34911a) {
        Gson gsonCreate = AbstractC6730d.m20388f(AbstractC18489d0.m53366g(c38266c, "$this$single", c34911a, "it"), null, null, 3, null).create();
        AbstractC0757c abstractC0757cM20380e = AbstractC6728b.m20380e(c38266c, null, null, null, null, null, 31, null);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C34644e c34644e = (C34644e) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34644e.class), null);
        AbstractC22676k.m65747g(gsonCreate);
        C34643d c34643dM109481a = c34644e.m109481a(gsonCreate, abstractC0757cM20380e, AbstractC12350b.m34570S("kt-serialization-labrador"));
        C29222x0 c29222x0 = new C29222x0();
        return (LabradorApi) AbstractC2875y.m8293f(c29222x0, (C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), AbstractC2875y.m8312y((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null), c29222x0, c34643dM109481a, "defaultOkHttpClient")), LabradorApi.class, "create(...)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final InterfaceC34144c m120672L(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C34143b((C34142a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C34142a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C38639a m120673M(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C38639a((InterfaceC34144c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC34144c.class), null), (InterfaceC34116n) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC34116n.class), null), (InterfaceC27837a0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC27837a0.class), null), (InterfaceC2994c0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C39753c m120674N(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C39753c((LabradorApi) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(LabradorApi.class), null), InterfaceC34116n.INSTANCE.m107848a("ShepherdAboutInteractor"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C3624e m120675O(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C3624e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C3622c m120676P(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C3622c((C39753c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C39753c.class), null), (C3624e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C3624e.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C34162c m120677Q(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C34162c((LabradorApi) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(LabradorApi.class), null), InterfaceC34116n.INSTANCE.m107848a("LabradorRegistrationInteractor"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C36490d m120678R(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C36490d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C36488b m120679S(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C36488b((C34162c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C34162c.class), null), (C36490d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C36490d.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C22827c m120680T(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C22827c((LabradorApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(LabradorApi.class), null), InterfaceC34116n.INSTANCE.m107848a("EcgEligibilityInteractor"), (C22828d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C22828d.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C22828d m120681U(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C22828d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C17626c m120682V(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C17626c(InterfaceC34116n.INSTANCE.m107848a("EcgDeviceLocationInteractor"), (InterfaceC30444b) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC30444b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C27126e m120683W(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C27126e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C27124c m120684X(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C27124c((C22827c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C22827c.class), null), (C27126e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C27126e.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C22830f m120685Y(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C22830f((LabradorApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(LabradorApi.class), null), (C22828d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C22828d.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z */
    public static final C27128g m120686Z(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        return new C27128g(null, (C22830f) viewModel.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C22830f.class), null), 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C38646c m120688a0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C38646c((InterfaceC26834e) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC26834e.class), null), (InterfaceC30444b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC30444b.class), null), null, (C32948a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C32948a.class), null), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final C41131f m120690b0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C41131f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final C12366d m120692c0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C12366d((C12370h) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C12370h.class), null), (C12372j) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C12372j.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final C12372j m120694d0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C12372j((InterfaceC30444b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC30444b.class), null), (C12368f) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C12368f.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final C12368f m120696e0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C12368f(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final C41130e m120698f0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C41130e((C38646c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C38646c.class), null), (C41131f) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C41131f.class), null), null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final C20930d m120700g0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C20930d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final C14769b m120702h0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C14769b((C12366d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C12366d.class), null), (C14771d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C14771d.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i0 */
    public static final C14771d m120704i0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C14771d(null, (InterfaceC18260e) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC18260e.class), null), 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final C32948a m120706j0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C32948a((InterfaceC14515a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final C12370h m120708k0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC26834e interfaceC26834e = (InterfaceC26834e) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC26834e.class), null);
        InterfaceC30444b interfaceC30444b = (InterfaceC30444b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC30444b.class), null);
        C34387c c34387c = (C34387c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34387c.class), null);
        FileDownloaderApi fileDownloaderApi = (FileDownloaderApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FileDownloaderApi.class), null);
        C38458b c38458b = (C38458b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C38458b.class), null);
        C32948a c32948a = (C32948a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C32948a.class), null);
        InterfaceC4733b interfaceC4733b = (InterfaceC4733b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4733b.class), null);
        AbstractC18377p0 abstractC18377p0 = (AbstractC18377p0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC18377p0.class), new C35953c("workManagerInstance"));
        C28144a0 c28144a0 = (C28144a0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C28144a0.class), null);
        C22365e c22365e = AbstractC3050q0.f12077a;
        return new C12370h(interfaceC26834e, c34387c, fileDownloaderApi, interfaceC30444b, c38458b, null, c32948a, null, interfaceC4733b, abstractC18377p0, c28144a0, ExecutorC22364d.f87316w, (InterfaceC14783b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14783b.class), null), null, 8352, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final C20928b m120710l0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C20928b((C17626c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C17626c.class), null), (C20930d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C20930d.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final C29514d m120712m0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C29514d((InterfaceC14783b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14783b.class), null), (C39787d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C39787d.class), null), InterfaceC34116n.INSTANCE.m107848a("EcgReadingInteractor"), (InterfaceC34144c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC34144c.class), null), (C32948a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C32948a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final C31811i m120714n0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C31811i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final C31809g m120716o0(C38266c viewModel, C34911a c34911a) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(c34911a, "<destruct>");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C31809g((C29514d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C29514d.class), null), (C31811i) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C31811i.class), null), (String) c34911a.m110110a(0, c22673i0.getOrCreateKotlinClass(String.class)), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final InterfaceC35218a m120718p0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return ((WhoopLabradorDatabase) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(WhoopLabradorDatabase.class), null)).mo22421b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final C34142a m120720q0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("ecgReadingResultDbManager");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC35218a interfaceC35218aMo22421b = ((WhoopLabradorDatabase) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(WhoopLabradorDatabase.class), null)).mo22421b();
        InterfaceC14515a interfaceC14515a = (InterfaceC14515a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14515a.class), null);
        Clock clockSystemUTC = Clock.systemUTC();
        AbstractC22676k.m65749i(clockSystemUTC, "systemUTC(...)");
        return new C34142a(interfaceC34116nM107848a, interfaceC35218aMo22421b, interfaceC14515a, clockSystemUTC);
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m120669I(c33768a);
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
