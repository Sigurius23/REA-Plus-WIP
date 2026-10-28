package zz2;

import a03.C0099b;
import a03.C0100c;
import ad3.AbstractC0757c;
import b03.C2209f;
import c03.C3814b;
import c93.InterfaceC4351m;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.whoop.whoopstatus.domain.WhoopStatusService;
import com.whoop.whoopstatus.models.WhoopStatusArchMiniModel;
import fi0.InterfaceC14515a;
import ih0.AbstractC18489d0;
import j93.InterfaceC21461d;
import java.util.Collection;
import java.util.List;
import jb1.InterfaceC21538d;
import jb1.InterfaceC21539e;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import nd1.InterfaceC26584j;
import or2.C28162g;
import p031b9.AbstractC2875y;
import p098dt.AbstractC12350b;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p720m91.InterfaceC25310s;
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
import wf3.C37247a;
import xf3.C38266c;
import yf2.C39520a;

/* JADX INFO: renamed from: zz2.e */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"Lzz2/e;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "Lv82/a;", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "whoop-status_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C41258e implements InterfaceC26584j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C35799a> dependencies = AbstractC2875y.m8308u();

    /* JADX INFO: renamed from: i */
    private static final C23454a0 m134028i(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C39520a c39520a = new C39520a(29);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(WhoopStatusService.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass, null, c39520a, 2)), false);
        final int i13 = 0;
        InterfaceC4351m interfaceC4351m = new InterfaceC4351m() { // from class: zz2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i13) {
                    case 0:
                        return C41258e.m134030k(c38266c, c34911a);
                    case 1:
                        return C41258e.m134031l(c38266c, c34911a);
                    case 2:
                        return C41258e.m134032m(c38266c, c34911a);
                    case 3:
                        return C41258e.m134033n(c38266c, c34911a);
                    case 4:
                        return C41258e.m134034o(c38266c, c34911a);
                    case 5:
                        return C41258e.m134035p(c38266c, c34911a);
                    default:
                        return C41258e.m134036q(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(C0100c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass2, null, interfaceC4351m, 2)), false);
        final int i14 = 1;
        InterfaceC4351m interfaceC4351m2 = new InterfaceC4351m() { // from class: zz2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i14) {
                    case 0:
                        return C41258e.m134030k(c38266c, c34911a);
                    case 1:
                        return C41258e.m134031l(c38266c, c34911a);
                    case 2:
                        return C41258e.m134032m(c38266c, c34911a);
                    case 3:
                        return C41258e.m134033n(c38266c, c34911a);
                    case 4:
                        return C41258e.m134034o(c38266c, c34911a);
                    case 5:
                        return C41258e.m134035p(c38266c, c34911a);
                    default:
                        return C41258e.m134036q(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C3814b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass3, null, interfaceC4351m2, 2)), false);
        final int i15 = 2;
        InterfaceC4351m interfaceC4351m3 = new InterfaceC4351m() { // from class: zz2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i15) {
                    case 0:
                        return C41258e.m134030k(c38266c, c34911a);
                    case 1:
                        return C41258e.m134031l(c38266c, c34911a);
                    case 2:
                        return C41258e.m134032m(c38266c, c34911a);
                    case 3:
                        return C41258e.m134033n(c38266c, c34911a);
                    case 4:
                        return C41258e.m134034o(c38266c, c34911a);
                    case 5:
                        return C41258e.m134035p(c38266c, c34911a);
                    default:
                        return C41258e.m134036q(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(C2209f.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass4, null, interfaceC4351m3, 2)), false);
        final int i16 = 3;
        InterfaceC4351m interfaceC4351m4 = new InterfaceC4351m() { // from class: zz2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i16) {
                    case 0:
                        return C41258e.m134030k(c38266c, c34911a);
                    case 1:
                        return C41258e.m134031l(c38266c, c34911a);
                    case 2:
                        return C41258e.m134032m(c38266c, c34911a);
                    case 3:
                        return C41258e.m134033n(c38266c, c34911a);
                    case 4:
                        return C41258e.m134034o(c38266c, c34911a);
                    case 5:
                        return C41258e.m134035p(c38266c, c34911a);
                    default:
                        return C41258e.m134036q(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(C0099b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass5, null, interfaceC4351m4, 2)), false);
        final int i17 = 4;
        InterfaceC4351m interfaceC4351m5 = new InterfaceC4351m() { // from class: zz2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i17) {
                    case 0:
                        return C41258e.m134030k(c38266c, c34911a);
                    case 1:
                        return C41258e.m134031l(c38266c, c34911a);
                    case 2:
                        return C41258e.m134032m(c38266c, c34911a);
                    case 3:
                        return C41258e.m134033n(c38266c, c34911a);
                    case 4:
                        return C41258e.m134034o(c38266c, c34911a);
                    case 5:
                        return C41258e.m134035p(c38266c, c34911a);
                    default:
                        return C41258e.m134036q(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(C41255b.class);
        C31365d c31365dM73383p = AbstractC25012a.m73383p(new C30330b(c35953c, orCreateKotlinClass6, null, interfaceC4351m5, 1), module, AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), false);
        InterfaceC21461d clazz = c22673i0.getOrCreateKotlinClass(InterfaceC25310s.class);
        AbstractC22676k.m65750j(clazz, "clazz");
        C30330b c30330b = c31365dM73383p.f129023a;
        c30330b.f124475f = AbstractC25265s.m74128f1(clazz, (Collection) c30330b.f124475f);
        module.m106774b(AbstractC21598x.m60669Y(clazz, c30330b.f124472c, c30330b.f124470a), c31365dM73383p, true);
        final int i18 = 5;
        InterfaceC4351m interfaceC4351m6 = new InterfaceC4351m() { // from class: zz2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i18) {
                    case 0:
                        return C41258e.m134030k(c38266c, c34911a);
                    case 1:
                        return C41258e.m134031l(c38266c, c34911a);
                    case 2:
                        return C41258e.m134032m(c38266c, c34911a);
                    case 3:
                        return C41258e.m134033n(c38266c, c34911a);
                    case 4:
                        return C41258e.m134034o(c38266c, c34911a);
                    case 5:
                        return C41258e.m134035p(c38266c, c34911a);
                    default:
                        return C41258e.m134036q(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(C41256c.class);
        C31365d c31365dM73383p2 = AbstractC25012a.m73383p(new C30330b(c35953c, orCreateKotlinClass7, null, interfaceC4351m6, 1), module, AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), false);
        InterfaceC21461d clazz2 = c22673i0.getOrCreateKotlinClass(InterfaceC21539e.class);
        AbstractC22676k.m65750j(clazz2, "clazz");
        C30330b c30330b2 = c31365dM73383p2.f129023a;
        c30330b2.f124475f = AbstractC25265s.m74128f1(clazz2, (Collection) c30330b2.f124475f);
        module.m106774b(AbstractC21598x.m60669Y(clazz2, c30330b2.f124472c, c30330b2.f124470a), c31365dM73383p2, true);
        final int i19 = 6;
        InterfaceC4351m interfaceC4351m7 = new InterfaceC4351m() { // from class: zz2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i19) {
                    case 0:
                        return C41258e.m134030k(c38266c, c34911a);
                    case 1:
                        return C41258e.m134031l(c38266c, c34911a);
                    case 2:
                        return C41258e.m134032m(c38266c, c34911a);
                    case 3:
                        return C41258e.m134033n(c38266c, c34911a);
                    case 4:
                        return C41258e.m134034o(c38266c, c34911a);
                    case 5:
                        return C41258e.m134035p(c38266c, c34911a);
                    default:
                        return C41258e.m134036q(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(C41254a.class);
        C31365d c31365dM73383p3 = AbstractC25012a.m73383p(new C30330b(c35953c, orCreateKotlinClass8, null, interfaceC4351m7, 1), module, AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c), false);
        InterfaceC21461d clazz3 = c22673i0.getOrCreateKotlinClass(InterfaceC21538d.class);
        AbstractC22676k.m65750j(clazz3, "clazz");
        C30330b c30330b3 = c31365dM73383p3.f129023a;
        c30330b3.f124475f = AbstractC25265s.m74128f1(clazz3, (Collection) c30330b3.f124475f);
        module.m106774b(AbstractC21598x.m60669Y(clazz3, c30330b3.f124472c, c30330b3.f124470a), c31365dM73383p3, true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final WhoopStatusService m134029j(C38266c c38266c, C34911a c34911a) {
        Gson gsonCreate = AbstractC18489d0.m53366g(c38266c, "$this$factory", c34911a, "it").setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
        AbstractC0757c abstractC0757cM109496c = AbstractC34650k.m109496c();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C34644e c34644e = (C34644e) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34644e.class), null);
        AbstractC22676k.m65747g(gsonCreate);
        C34643d c34643dM109481a = c34644e.m109481a(gsonCreate, abstractC0757cM109496c, AbstractC12350b.m34570S("kt-serialization-whoop-status"));
        C29222x0 c29222x0 = new C29222x0();
        c29222x0.m88731e((C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), AbstractC2875y.m8312y((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null), c29222x0, c34643dM109481a, "defaultOkHttpClient")));
        return (WhoopStatusService) c29222x0.m88730d().m88733b(WhoopStatusService.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C0100c m134030k(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C0100c((WhoopStatusService) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(WhoopStatusService.class), null), InterfaceC34116n.INSTANCE.m107848a("WhoopStatusInteractor"), (C0099b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C0099b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C3814b m134031l(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C3814b((C28162g) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28162g.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C2209f m134032m(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C2209f((C0100c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C0100c.class), null), (C3814b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C3814b.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C0099b m134033n(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C0099b((InterfaceC14515a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C41255b m134034o(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C41255b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C41256c m134035p(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C41256c(AbstractC25247g0.m73989X(new C23465k("WHOOP_STATUS_ARCH_MINI", AbstractC22671h0.f89337a.getOrCreateKotlinClass(WhoopStatusArchMiniModel.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C41254a m134036q(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C41254a();
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m134028i(c33768a);
        return c33768a;
    }

    @Override // nd1.InterfaceC26584j
    public List<C35799a> getDependencies() {
        return this.dependencies;
    }

    @Override // nd1.InterfaceC26584j
    public /* bridge */ Object getKey() {
        return super.getKey();
    }
}
