package rm0;

import ad3.AbstractC0757c;
import androidx.room.C1818p0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import bh1.C3249a;
import c93.InterfaceC4339a;
import com.google.gson.Gson;
import com.whoop.cache.persistence.BffCacheDatabase;
import com.whoop.data.repositories.FeatureFlagChecker;
import fy1.InterfaceC14865a;
import fy1.InterfaceC14867c;
import ge3.AbstractC15751g;
import ih0.AbstractC18489d0;
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import js0.AbstractC21909c;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import l83.EnumC23463i;
import m83.C25235a0;
import m83.C25262p;
import mm0.C25684c;
import mm0.C25685d;
import mm0.C25686e;
import mm0.InterfaceC25682a;
import nd1.C26587m;
import nd1.InterfaceC26584j;
import nm0.C26831b;
import nm0.C26833d;
import nm0.C26835f;
import nm0.InterfaceC26834e;
import om0.C28026c;
import p031b9.AbstractC2875y;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22673i0;
import q83.AbstractC30060g;
import qf3.C30330b;
import qm0.C30478a;
import rb0.C31189f;
import rf3.C31362a;
import rf3.C31365d;
import rr2.InterfaceC31766c;
import sr2.AbstractC32943y;
import tf3.C33768a;
import tm0.C33950b;
import tm0.C33951c;
import tm0.InterfaceC33949a;
import u02.C34387c;
import u82.AbstractC34650k;
import u82.C34642c;
import u82.InterfaceC34640a;
import uf3.C34911a;
import um0.AbstractC35075a;
import um0.C35079e;
import um0.C35081g;
import v02.C35512a;
import vf3.C35953c;
import vf3.InterfaceC35951a;
import vm0.C36144b;
import vm0.C36151i;
import vm0.C36152j;
import vm0.InterfaceC36149g;
import wb3.AbstractC37056f;
import wf3.C37247a;
import wm0.C37378a;
import xf3.C38266c;
import xm0.C38458b;
import ym0.C39648a;

/* JADX INFO: renamed from: rm0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m65681d2 = {"Lrm0/c;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "cache_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31585c implements InterfaceC26584j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC26584j> dependencies = AbstractC37056f.m118959K(new C26587m(), new C35512a());

    /* JADX INFO: renamed from: rm0.c$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f130525w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f130526x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f130527y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f130525w = c38266c;
            this.f130526x = interfaceC35951a;
            this.f130527y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [com.whoop.data.repositories.FeatureFlagChecker, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagChecker invoke() {
            return this.f130525w.m122602a(this.f130527y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), this.f130526x);
        }
    }

    /* JADX INFO: renamed from: rm0.c$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f130528w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f130529x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f130530y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f130528w = c38266c;
            this.f130529x = interfaceC35951a;
            this.f130530y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, um0.g] */
        @Override // c93.InterfaceC4339a
        public final C35081g invoke() {
            return this.f130528w.m122602a(this.f130530y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C35081g.class), this.f130529x);
        }
    }

    /* JADX INFO: renamed from: A */
    private static final C23454a0 m97315A(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C31189f c31189f = new C31189f(29);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(BffCacheDatabase.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass, null, c31189f, 1)), false);
        C31583a c31583a = new C31583a(1);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(AbstractC35075a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass2, null, c31583a, 1)), false);
        C31583a c31583a2 = new C31583a(3);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C35081g.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass3, null, c31583a2, 2)), false);
        C31583a c31583a3 = new C31583a(4);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(C35079e.class);
        C35953c c35953cM73385r = AbstractC25012a.m73385r(new C30330b(c35953c, orCreateKotlinClass4, null, c31583a3, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), false, "InMemoryCache");
        C31583a c31583a4 = new C31583a(5);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(InterfaceC25682a.class);
        C35953c c35953cM53379t = AbstractC18489d0.m53379t(new C30330b(c35953c, orCreateKotlinClass5, c35953cM73385r, c31583a4, 1), module, AbstractC21598x.m60669Y(orCreateKotlinClass5, c35953cM73385r, c35953c), false, "PersistentCache");
        C31583a c31583a5 = new C31583a(6);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(InterfaceC25682a.class);
        C35953c c35953cM53379t2 = AbstractC18489d0.m53379t(new C30330b(c35953c, orCreateKotlinClass6, c35953cM53379t, c31583a5, 1), module, AbstractC21598x.m60669Y(orCreateKotlinClass6, c35953cM53379t, c35953c), false, "CompositeCache");
        C31583a c31583a6 = new C31583a(7);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(InterfaceC25682a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass7, c35953cM53379t2, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass7, c35953cM53379t2, c31583a6, 1)), false);
        C31583a c31583a7 = new C31583a(8);
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(InterfaceC14865a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass8, null, c31583a7, 2)), false);
        C31583a c31583a8 = new C31583a(9);
        InterfaceC21461d orCreateKotlinClass9 = c22673i0.getOrCreateKotlinClass(C38458b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass9, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass9, null, c31583a8, 2)), false);
        C31583a c31583a9 = new C31583a(11);
        InterfaceC21461d orCreateKotlinClass10 = c22673i0.getOrCreateKotlinClass(C39648a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass10, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass10, null, c31583a9, 2)), false);
        C31583a c31583a10 = new C31583a(10);
        InterfaceC21461d orCreateKotlinClass11 = c22673i0.getOrCreateKotlinClass(C26833d.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass11, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass11, null, c31583a10, 2)), false);
        C31583a c31583a11 = new C31583a(12);
        InterfaceC21461d orCreateKotlinClass12 = c22673i0.getOrCreateKotlinClass(C30478a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass12, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass12, null, c31583a11, 2)), false);
        C31583a c31583a12 = new C31583a(13);
        InterfaceC21461d orCreateKotlinClass13 = c22673i0.getOrCreateKotlinClass(C33950b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass13, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass13, null, c31583a12, 2)), false);
        C31583a c31583a13 = new C31583a(14);
        InterfaceC21461d orCreateKotlinClass14 = c22673i0.getOrCreateKotlinClass(InterfaceC33949a.class);
        C35953c c35953cM73385r2 = AbstractC25012a.m73385r(new C30330b(c35953c, orCreateKotlinClass14, null, c31583a13, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass14, null, c35953c), false, "DefaultDeserializer");
        C31583a c31583a14 = new C31583a(15);
        InterfaceC21461d orCreateKotlinClass15 = c22673i0.getOrCreateKotlinClass(InterfaceC34640a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass15, c35953cM73385r2, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass15, c35953cM73385r2, c31583a14, 2)), false);
        C31583a c31583a15 = new C31583a(16);
        InterfaceC21461d orCreateKotlinClass16 = c22673i0.getOrCreateKotlinClass(C26831b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass16, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass16, null, c31583a15, 2)), false);
        C31583a c31583a16 = new C31583a(17);
        InterfaceC21461d orCreateKotlinClass17 = c22673i0.getOrCreateKotlinClass(InterfaceC26834e.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass17, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass17, null, c31583a16, 2)), false);
        C31583a c31583a17 = new C31583a(18);
        InterfaceC21461d orCreateKotlinClass18 = c22673i0.getOrCreateKotlinClass(C37378a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass18, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass18, null, c31583a17, 1)), false);
        C31583a c31583a18 = new C31583a(19);
        InterfaceC21461d orCreateKotlinClass19 = c22673i0.getOrCreateKotlinClass(C36144b.class);
        C35953c c35953cM53379t3 = AbstractC18489d0.m53379t(new C30330b(c35953c, orCreateKotlinClass19, null, c31583a18, 1), module, AbstractC21598x.m60669Y(orCreateKotlinClass19, null, c35953c), false, "RealCacheReporter");
        C31583a c31583a19 = new C31583a(0);
        InterfaceC21461d orCreateKotlinClass20 = c22673i0.getOrCreateKotlinClass(InterfaceC36149g.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass20, c35953cM53379t3, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass20, c35953cM53379t3, c31583a19, 2)), false);
        C31583a c31583a20 = new C31583a(2);
        InterfaceC21461d orCreateKotlinClass21 = c22673i0.getOrCreateKotlinClass(C28026c.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass21, null, c31583a20, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass21, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final BffCacheDatabase m97316B(C38266c c38266c, C34911a c34911a) {
        C1818p0 c1818p0M60645C = AbstractC21598x.m60645C(AbstractC2875y.m8292e(c38266c, "$this$single", c34911a, "it", c38266c), BffCacheDatabase.class, "bff_cache_db");
        c1818p0M60645C.f7157p = false;
        c1818p0M60645C.f7158q = true;
        return (BffCacheDatabase) c1818p0M60645C.m5450b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final AbstractC35075a m97317C(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return ((BffCacheDatabase) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(BffCacheDatabase.class), null)).mo18299b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C26833d m97318D(C38266c factory, C34911a params) {
        Object next;
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        Iterator it = params.f147011a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(next instanceof InterfaceC34640a)) {
                next = null;
            }
        } while (next == null);
        InterfaceC34640a interfaceC34640a = (InterfaceC34640a) next;
        if (interfaceC34640a == null) {
            interfaceC34640a = (InterfaceC34640a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC34640a.class), new C35953c("DefaultDeserializer"));
        }
        C31584b c31584b = new C31584b(interfaceC34640a, 2);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C26833d((C30478a) factory.m122602a(c31584b, c22673i0.getOrCreateKotlinClass(C30478a.class), null), (C38458b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C38458b.class), null), (InterfaceC36149g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC36149g.class), new C35953c("RealCacheReporter")), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C34911a m97319E(InterfaceC34640a interfaceC34640a) {
        return AbstractC15751g.m44431K(interfaceC34640a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C30478a m97320F(C38266c factory, C34911a params) {
        Object next;
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        Iterator it = params.f147011a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(next instanceof InterfaceC34640a)) {
                next = null;
            }
        } while (next == null);
        InterfaceC34640a interfaceC34640a = (InterfaceC34640a) next;
        if (interfaceC34640a == null) {
            interfaceC34640a = (InterfaceC34640a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC34640a.class), new C35953c("DefaultDeserializer"));
        }
        C22365e c22365e = AbstractC3050q0.f12077a;
        return new C30478a(interfaceC34640a, ExecutorC22364d.f87316w);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C33950b m97321G(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C33950b((InterfaceC33949a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC33949a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final InterfaceC33949a m97322H(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C35953c c35953c = new C35953c("CompositeCache");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C33951c((InterfaceC25682a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC25682a.class), c35953c), (InterfaceC36149g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC36149g.class), new C35953c("RealCacheReporter")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final InterfaceC34640a m97323I(C38266c factory, C34911a params) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        for (Object obj : params.f147011a) {
            if (!(obj instanceof Map)) {
                obj = null;
            }
            if (obj != null) {
                AbstractC0757c abstractC0757cM109496c = AbstractC34650k.m109496c();
                C35953c c35953c = new C35953c("api_gson_name");
                C3249a c3249a = new C3249a((Map) obj, 8);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                return new C34642c(abstractC0757cM109496c, (Gson) factory.m122602a(c3249a, c22673i0.getOrCreateKotlinClass(Gson.class), c35953c), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), C25235a0.f99113w);
            }
        }
        obj = null;
        AbstractC0757c abstractC0757cM109496c2 = AbstractC34650k.m109496c();
        C35953c c35953c2 = new C35953c("api_gson_name");
        C3249a c3249a2 = new C3249a((Map) obj, 8);
        C22673i0 c22673i1 = AbstractC22671h0.f89337a;
        return new C34642c(abstractC0757cM109496c2, (Gson) factory.m122602a(c3249a2, c22673i1.getOrCreateKotlinClass(Gson.class), c35953c2), (FeatureFlagChecker) factory.m122602a(null, c22673i1.getOrCreateKotlinClass(FeatureFlagChecker.class), null), C25235a0.f99113w);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C34911a m97324J(Map map) {
        return AbstractC15751g.m44431K(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C26831b m97325K(C38266c factory, C34911a params) {
        Object next;
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        Iterator it = params.f147011a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(next instanceof InterfaceC34640a)) {
                next = null;
            }
        } while (next == null);
        InterfaceC34640a interfaceC34640a = (InterfaceC34640a) next;
        if (interfaceC34640a == null) {
            interfaceC34640a = (InterfaceC34640a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC34640a.class), new C35953c("DefaultDeserializer"));
        }
        InterfaceC34640a interfaceC34640a2 = interfaceC34640a;
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C38458b c38458b = (C38458b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C38458b.class), null);
        C34387c c34387c = (C34387c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34387c.class), null);
        AbstractC32943y abstractC32943y = (AbstractC32943y) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null);
        InterfaceC36149g interfaceC36149g = (InterfaceC36149g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC36149g.class), new C35953c("RealCacheReporter"));
        C22365e c22365e = AbstractC3050q0.f12077a;
        return new C26831b(c38458b, c34387c, abstractC32943y, interfaceC36149g, ExecutorC22364d.f87316w, interfaceC34640a2, (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final InterfaceC26834e m97326L(C38266c factory, C34911a params) {
        Object next;
        Object next2;
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        ArrayList arrayList = params.f147011a;
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(next instanceof Map)) {
                next = null;
            }
        } while (next == null);
        Map map = (Map) next;
        Iterator it3 = arrayList.iterator();
        do {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it3.next();
            if (!(next2 instanceof InterfaceC34640a)) {
                next2 = null;
            }
        } while (next2 == null);
        InterfaceC34640a interfaceC34640a = (InterfaceC34640a) next2;
        if (interfaceC34640a == null) {
            interfaceC34640a = (InterfaceC34640a) factory.m122602a(new C25262p(map, 13), AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC34640a.class), new C35953c("DefaultDeserializer"));
        }
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C26835f((C39648a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C39648a.class), null), (C26831b) factory.m122602a(new C31584b(interfaceC34640a, 0), c22673i0.getOrCreateKotlinClass(C26831b.class), null), (C26833d) factory.m122602a(new C31584b(interfaceC34640a, 1), c22673i0.getOrCreateKotlinClass(C26833d.class), null), (C37378a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C37378a.class), null), (AbstractC32943y) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C34911a m97327M(Map map) {
        return AbstractC15751g.m44431K(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C34911a m97328N(InterfaceC34640a interfaceC34640a) {
        return AbstractC15751g.m44431K(interfaceC34640a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C34911a m97329O(InterfaceC34640a interfaceC34640a) {
        return AbstractC15751g.m44431K(interfaceC34640a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P */
    public static final C37378a m97330P(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C37378a(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C36144b m97331Q(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C36144b((InterfaceC14867c) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14867c.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final InterfaceC36149g m97332R(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C35953c c35953c = new C35953c("CompositeCache");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C36152j((InterfaceC25682a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC25682a.class), c35953c), (InterfaceC31766c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31766c.class), null), (C36144b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C36144b.class), null), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C35081g m97333S(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C35081g((BffCacheDatabase) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(BffCacheDatabase.class), null), (AbstractC35075a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC35075a.class), null), (InterfaceC31766c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31766c.class), null), (C35079e) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C35079e.class), null), null, null, 48, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C28026c m97334T(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C35953c c35953c = new C35953c("CompositeCache");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C28026c((InterfaceC25682a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC25682a.class), c35953c), (C38458b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C38458b.class), null), (C34387c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34387c.class), null), (AbstractC32943y) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null), (InterfaceC36149g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC36149g.class), new C35953c("RealCacheReporter")), (InterfaceC2994c0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C35079e m97335U(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C35079e((AbstractC35075a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC35075a.class), null), (AbstractC21909c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC21909c.class), null), (C36144b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C36144b.class), null), null, null, 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final InterfaceC25682a m97336V(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C25686e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final InterfaceC25682a m97337W(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        return new C25685d(AbstractC30060g.m92087G(enumC23463i, new a(single, null, null)), AbstractC30060g.m92087G(enumC23463i, new b(single, null, null)), new C25686e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final InterfaceC25682a m97338X(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C35953c c35953c = new C35953c("InMemoryCache");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C25684c((InterfaceC25682a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC25682a.class), c35953c), (InterfaceC25682a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC25682a.class), new C35953c("PersistentCache")), (C36144b) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C36144b.class), null), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final InterfaceC14865a m97339Y(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C36151i((InterfaceC25682a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC25682a.class), new C35953c("CompositeCache")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C38458b m97340Z(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C38458b((AbstractC32943y) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null), (InterfaceC25682a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC25682a.class), new C35953c("CompositeCache")), (InterfaceC36149g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC36149g.class), new C35953c("RealCacheReporter")), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C39648a m97342a0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C35953c c35953c = new C35953c("CompositeCache");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C39648a((InterfaceC25682a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC25682a.class), c35953c), (InterfaceC36149g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC36149g.class), new C35953c("RealCacheReporter")));
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m97315A(c33768a);
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
