package androidx.lifecycle;

import android.os.Bundle;
import android.view.View;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.AbstractC3069w1;
import bc3.C3004e2;
import bc3.C3033m;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.android.R;
import e93.AbstractC12889b;
import ec3.AbstractC13091v;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ge3.AbstractC15751g;
import hc3.AbstractC17182o;
import io.sentry.hints.C20363j;
import j93.InterfaceC21461d;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kc3.C22365e;
import l83.C23454a0;
import l83.C23465k;
import n83.C26463f;
import p000.C12473e;
import p007a6.C0410c;
import p007a6.C0448q;
import p098dt.AbstractC12350b;
import p298l8.AbstractC23420c;
import p399pb.C29047d;
import p399pb.InterfaceC29046c;
import p399pb.InterfaceC29049f;
import p437qt.C30582e;
import p489t.C33242a;
import p692zt.C41113q;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.C30064k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: androidx.lifecycle.o1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1613o1 {

    /* JADX INFO: renamed from: a */
    public static final C30582e f6291a = new C30582e(6);

    /* JADX INFO: renamed from: b */
    public static final C20363j f6292b;

    /* JADX INFO: renamed from: c */
    public static final C30582e f6293c;

    static {
        int i13 = 7;
        f6292b = new C20363j(i13);
        f6293c = new C30582e(i13);
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC13058l m5011a(AbstractC1615p0 abstractC1615p0) {
        AbstractC22676k.m65750j(abstractC1615p0, "<this>");
        return AbstractC13091v.m36599i(AbstractC13091v.m36600j(new C0410c(abstractC1615p0, null, 5)), -1, 2);
    }

    /* JADX INFO: renamed from: b */
    public static C1596j m5012b(InterfaceC13058l interfaceC13058l, InterfaceC30063j interfaceC30063j, int i13) {
        if ((i13 & 1) != 0) {
            interfaceC30063j = C30064k.f122676w;
        }
        AbstractC22676k.m65750j(interfaceC13058l, "<this>");
        C1596j c1596jM5044c = AbstractC1640x1.m5044c(interfaceC30063j, new C12473e(interfaceC13058l, (InterfaceC30057d) null, 8));
        if (interfaceC13058l instanceof InterfaceC13037f2) {
            if (C33242a.m105474V().f138639a.m105476V()) {
                c1596jM5044c.setValue(((InterfaceC13037f2) interfaceC13058l).getValue());
                return c1596jM5044c;
            }
            c1596jM5044c.postValue(((InterfaceC13037f2) interfaceC13058l).getValue());
        }
        return c1596jM5044c;
    }

    /* JADX INFO: renamed from: c */
    public static final void m5013c(AbstractC1637w1 abstractC1637w1, C29047d registry, AbstractC1638x lifecycle) {
        AbstractC22676k.m65750j(registry, "registry");
        AbstractC22676k.m65750j(lifecycle, "lifecycle");
        C1607m1 c1607m1 = (C1607m1) abstractC1637w1.getCloseable("androidx.lifecycle.savedstate.vm.tag");
        if (c1607m1 == null || c1607m1.f6280y) {
            return;
        }
        c1607m1.m5006b(lifecycle, registry);
        m5027q(lifecycle, registry);
    }

    /* JADX INFO: renamed from: d */
    public static final C1607m1 m5014d(C29047d registry, AbstractC1638x lifecycle, String str, Bundle bundle) {
        C1601k1 c1601k1;
        AbstractC22676k.m65750j(registry, "registry");
        AbstractC22676k.m65750j(lifecycle, "lifecycle");
        Bundle bundleM88291a = registry.m88291a(str);
        if (bundleM88291a != null) {
            bundle = bundleM88291a;
        }
        if (bundle == null) {
            c1601k1 = new C1601k1();
        } else {
            ClassLoader classLoader = C1601k1.class.getClassLoader();
            AbstractC22676k.m65747g(classLoader);
            bundle.setClassLoader(classLoader);
            C26463f c26463f = new C26463f(bundle.size());
            for (String str2 : bundle.keySet()) {
                AbstractC22676k.m65747g(str2);
                c26463f.put(str2, bundle.get(str2));
            }
            c1601k1 = new C1601k1(c26463f.m78380b());
        }
        C1607m1 c1607m1 = new C1607m1(str, c1601k1);
        c1607m1.m5006b(lifecycle, registry);
        m5027q(lifecycle, registry);
        return c1607m1;
    }

    /* JADX INFO: renamed from: e */
    public static final C1601k1 m5015e(AbstractC23420c abstractC23420c) {
        C1601k1 c1601k1;
        AbstractC22676k.m65750j(abstractC23420c, "<this>");
        InterfaceC29049f interfaceC29049f = (InterfaceC29049f) abstractC23420c.mo67910a(f6291a);
        if (interfaceC29049f == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        InterfaceC1583f2 interfaceC1583f2 = (InterfaceC1583f2) abstractC23420c.mo67910a(f6292b);
        if (interfaceC1583f2 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) abstractC23420c.mo67910a(f6293c);
        String str = (String) abstractC23420c.mo67910a(C1575d2.f6204b);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        InterfaceC29046c interfaceC29046cM88292b = interfaceC29049f.getSavedStateRegistry().m88292b();
        Bundle bundle2 = null;
        C1619q1 c1619q1 = interfaceC29046cM88292b instanceof C1619q1 ? (C1619q1) interfaceC29046cM88292b : null;
        if (c1619q1 == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap = m5021k(interfaceC1583f2).f6304w;
        C1601k1 c1601k2 = (C1601k1) linkedHashMap.get(str);
        if (c1601k2 != null) {
            return c1601k2;
        }
        c1619q1.m5030b();
        Bundle bundle3 = c1619q1.f6300c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = AbstractC12889b.m36273g((C23465k[]) Arrays.copyOf(new C23465k[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                c1619q1.f6300c = null;
            }
            bundle2 = bundle4;
        }
        if (bundle2 != null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            c1601k1 = new C1601k1();
        } else {
            ClassLoader classLoader = C1601k1.class.getClassLoader();
            AbstractC22676k.m65747g(classLoader);
            bundle.setClassLoader(classLoader);
            C26463f c26463f = new C26463f(bundle.size());
            for (String str2 : bundle.keySet()) {
                AbstractC22676k.m65747g(str2);
                c26463f.put(str2, bundle.get(str2));
            }
            c1601k1 = new C1601k1(c26463f.m78380b());
        }
        linkedHashMap.put(str, c1601k1);
        return c1601k1;
    }

    /* JADX INFO: renamed from: f */
    public static final void m5016f(InterfaceC29049f interfaceC29049f) {
        AbstractC22676k.m65750j(interfaceC29049f, "<this>");
        EnumC1635w enumC1635wMo4987b = interfaceC29049f.getLifecycle().getCurrentState();
        if (enumC1635wMo4987b != EnumC1635w.f6326x && enumC1635wMo4987b != EnumC1635w.f6327y) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (interfaceC29049f.getSavedStateRegistry().m88292b() == null) {
            C1619q1 c1619q1 = new C1619q1(interfaceC29049f.getSavedStateRegistry(), (InterfaceC1583f2) interfaceC29049f);
            interfaceC29049f.getSavedStateRegistry().m88293c("androidx.lifecycle.internal.SavedStateHandlesProvider", c1619q1);
            interfaceC29049f.getLifecycle().mo4986a(new C1604l1(c1619q1));
        }
    }

    /* JADX INFO: renamed from: g */
    public static final InterfaceC1585g0 m5017g(View view) {
        AbstractC22676k.m65750j(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            InterfaceC1585g0 interfaceC1585g0 = tag instanceof InterfaceC1585g0 ? (InterfaceC1585g0) tag : null;
            if (interfaceC1585g0 != null) {
                return interfaceC1585g0;
            }
            Object objM34601v = AbstractC12350b.m34601v(view);
            view = objM34601v instanceof View ? (View) objM34601v : null;
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static final InterfaceC1583f2 m5018h(View view) {
        AbstractC22676k.m65750j(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            InterfaceC1583f2 interfaceC1583f2 = tag instanceof InterfaceC1583f2 ? (InterfaceC1583f2) tag : null;
            if (interfaceC1583f2 != null) {
                return interfaceC1583f2;
            }
            Object objM34601v = AbstractC12350b.m34601v(view);
            view = objM34601v instanceof View ? (View) objM34601v : null;
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static final C1565b0 m5019i(AbstractC1638x abstractC1638x) {
        AbstractC22676k.m65750j(abstractC1638x, "<this>");
        while (true) {
            C1565b0 c1565b0 = (C1565b0) abstractC1638x.m5041c().f6193a.get();
            if (c1565b0 != null) {
                return c1565b0;
            }
            C3004e2 c3004e2M8710d = AbstractC3006f0.m8710d();
            C22365e c22365e = AbstractC3050q0.f12077a;
            C1565b0 c1565b1 = new C1565b0(abstractC1638x, AbstractC12889b.m36254T(c3004e2M8710d, AbstractC17182o.f65999a.mo8825s()));
            AtomicReference atomicReference = abstractC1638x.m5041c().f6193a;
            do {
                InterfaceC30057d interfaceC30057d = null;
                if (atomicReference.compareAndSet(null, c1565b1)) {
                    C22365e c22365e2 = AbstractC3050q0.f12077a;
                    AbstractC3006f0.m8732z(c1565b1, AbstractC17182o.f65999a.mo8825s(), null, new C0448q(c1565b1, interfaceC30057d, 3), 2);
                    return c1565b1;
                }
            } while (atomicReference.get() == null);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final C1565b0 m5020j(InterfaceC1585g0 interfaceC1585g0) {
        AbstractC22676k.m65750j(interfaceC1585g0, "<this>");
        return m5019i(interfaceC1585g0.getLifecycle());
    }

    /* JADX INFO: renamed from: k */
    public static final C1622r1 m5021k(InterfaceC1583f2 interfaceC1583f2) {
        AbstractC22676k.m65750j(interfaceC1583f2, "<this>");
        C1575d2 c1575d2M93817f = C30582e.m93817f(interfaceC1583f2, new C1610n1(), 4);
        InterfaceC21461d modelClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(C1622r1.class);
        AbstractC22676k.m65750j(modelClass, "modelClass");
        return (C1622r1) ((C41113q) c1575d2M93817f.f6205a).m133475w("androidx.lifecycle.internal.SavedStateHandlesVM", modelClass);
    }

    /* JADX INFO: renamed from: l */
    public static final Object m5022l(AbstractC1638x abstractC1638x, EnumC1635w enumC1635w, InterfaceC4351m interfaceC4351m, AbstractC32275i abstractC32275i) {
        Object objM8719m;
        if (enumC1635w != EnumC1635w.f6326x) {
            return (abstractC1638x.getCurrentState() != EnumC1635w.f6325w && (objM8719m = AbstractC3006f0.m8719m(new C1642y0(abstractC1638x, enumC1635w, interfaceC4351m, null, 1), abstractC32275i)) == EnumC31071a.f128113w) ? objM8719m : C23454a0.f92919a;
        }
        throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
    }

    /* JADX INFO: renamed from: m */
    public static final Object m5023m(InterfaceC1585g0 interfaceC1585g0, EnumC1635w enumC1635w, InterfaceC4351m interfaceC4351m, AbstractC32275i abstractC32275i) {
        Object objM5022l = m5022l(interfaceC1585g0.getLifecycle(), enumC1635w, interfaceC4351m, abstractC32275i);
        return objM5022l == EnumC31071a.f128113w ? objM5022l : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    public static final void m5024n(View view, InterfaceC1585g0 interfaceC1585g0) {
        AbstractC22676k.m65750j(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, interfaceC1585g0);
    }

    /* JADX INFO: renamed from: o */
    public static final void m5025o(View view, InterfaceC1583f2 interfaceC1583f2) {
        AbstractC22676k.m65750j(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, interfaceC1583f2);
    }

    /* JADX INFO: renamed from: p */
    public static final Object m5026p(AbstractC1638x abstractC1638x, EnumC1635w enumC1635w, boolean z4, AbstractC3069w1 abstractC3069w1, InterfaceC4339a interfaceC4339a, AbstractC32269c abstractC32269c) {
        C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(abstractC32269c));
        c3033m.m8774s();
        C1595i2 c1595i2 = new C1595i2(enumC1635w, abstractC1638x, c3033m, interfaceC4339a);
        int i13 = 0;
        if (z4) {
            abstractC3069w1.dispatch(C30064k.f122676w, new RunnableC1587g2(abstractC1638x, c1595i2, 0));
        } else {
            abstractC1638x.mo4986a(c1595i2);
        }
        c3033m.m8776u(new C1591h2(abstractC3069w1, abstractC1638x, c1595i2, i13));
        Object objM8773r = c3033m.m8773r();
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return objM8773r;
    }

    /* JADX INFO: renamed from: q */
    public static void m5027q(AbstractC1638x abstractC1638x, C29047d c29047d) {
        EnumC1635w enumC1635wMo4987b = abstractC1638x.getCurrentState();
        if (enumC1635wMo4987b == EnumC1635w.f6326x || enumC1635wMo4987b.compareTo(EnumC1635w.f6328z) >= 0) {
            c29047d.m88294d();
        } else {
            abstractC1638x.mo4986a(new C1602l(abstractC1638x, c29047d));
        }
    }

    /* JADX INFO: renamed from: r */
    public static final Object m5028r(AbstractC1638x abstractC1638x, EnumC1635w enumC1635w, InterfaceC4351m interfaceC4351m, AbstractC32275i abstractC32275i) {
        C22365e c22365e = AbstractC3050q0.f12077a;
        return AbstractC3006f0.m8705K(AbstractC17182o.f65999a.mo8825s(), new C1642y0(abstractC1638x, enumC1635w, interfaceC4351m, null, 0), abstractC32275i);
    }
}
