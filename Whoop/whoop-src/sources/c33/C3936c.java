package c33;

import android.content.Context;
import androidx.recyclerview.widget.AbstractC1692i1;
import androidx.viewpager2.adapter.C1857e;
import androidx.viewpager2.widget.ViewPager2;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import com.google.android.material.tabs.TabLayout;
import h20.C16670i0;
import java.io.IOException;
import java.util.ArrayList;
import m83.AbstractC25265s;
import ne3.InterfaceC26629n0;
import p000.AbstractC11266d;
import p005a3.C0237p;
import p005a3.C0238p0;
import p014aj.C0929d;
import p031b9.C2817b;
import p043c4.C3974q;
import p077d0.AbstractC11333b0;
import p077d0.AbstractC11348f;
import p077d0.C11344e;
import p077d0.C11347e2;
import p077d0.C11415x1;
import p181h2.C16620e;
import p208i2.C17919x;
import p238j0.C21075a;
import p238j0.C21076b;
import p238j0.C21077c;
import p238j0.C21078d;
import p238j0.C21079e;
import p238j0.C21080f;
import p238j0.C21081g;
import p238j0.InterfaceC21082h;
import p268k0.AbstractC22086a;
import p269k1.AbstractC22115f;
import p269k1.C22111b;
import p270k2.C22128b;
import p270k2.InterfaceC22131e;
import p377or.C28134h;
import p377or.C28138l;
import p377or.C28140n;
import p377or.InterfaceC28139m;
import p389p0.C28521f0;
import p390p1.C28621h1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import ud3.C34812f;
import ud3.C34815g;
import wd3.AbstractC37172f;

/* JADX INFO: renamed from: c33.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3936c {

    /* JADX INFO: renamed from: a */
    public boolean f16068a;

    /* JADX INFO: renamed from: b */
    public final Object f16069b;

    /* JADX INFO: renamed from: c */
    public final Object f16070c;

    /* JADX INFO: renamed from: d */
    public Object f16071d;

    /* JADX INFO: renamed from: e */
    public Object f16072e;

    public C3936c(Context context, ArrayList arrayList, C3974q c3974q) {
        AbstractC22676k.m65750j(context, "context");
        this.f16070c = context;
        this.f16069b = arrayList;
        this.f16071d = c3974q;
    }

    /* JADX INFO: renamed from: a */
    public void m11984a() {
        synchronized (((C34815g) this.f16072e)) {
            if (this.f16068a) {
                return;
            }
            this.f16068a = true;
            AbstractC37172f.m119117b((InterfaceC26629n0) this.f16069b);
            try {
                ((C2817b) this.f16070c).m8004a();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m11985b() {
        TabLayout tabLayout = (TabLayout) this.f16070c;
        ViewPager2 viewPager2 = (ViewPager2) this.f16069b;
        if (this.f16068a) {
            throw new IllegalStateException("TabLayoutMediator is already attached");
        }
        AbstractC1692i1 adapter = viewPager2.getAdapter();
        this.f16072e = adapter;
        if (adapter == null) {
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        this.f16068a = true;
        viewPager2.m5508b(new C28140n(tabLayout));
        C28138l c28138l = new C28138l(viewPager2, 1);
        ArrayList arrayList = tabLayout.f21089o0;
        if (!arrayList.contains(c28138l)) {
            arrayList.add(c28138l);
        }
        ((AbstractC1692i1) this.f16072e).registerAdapterDataObserver(new C1857e(this, 1));
        m11989f();
        tabLayout.m15793m(viewPager2.getCurrentItem(), 0.0f, true, true, true);
    }

    /* JADX INFO: renamed from: c */
    public C34812f m11986c() {
        return (C34812f) this.f16071d;
    }

    /* JADX INFO: renamed from: d */
    public void m11987d(C0238p0 c0238p0, float f13, long j7) {
        C22128b c22128b = c0238p0.f815w;
        float fFloatValue = ((Number) ((C11344e) this.f16071d).m30549e()).floatValue();
        if (fFloatValue > 0.0f) {
            long jM51541c = C17919x.m51541c(fFloatValue, j7);
            if (!this.f16068a) {
                InterfaceC22131e.m63379M(c0238p0, jM51541c, f13, 0L, 0.0f, null, 124);
                return;
            }
            float fM47213e = C16620e.m47213e(c22128b.mo731d());
            float fM47211c = C16620e.m47211c(c22128b.mo731d());
            C0237p c0237p = c22128b.f85852x;
            long jM670A = c0237p.m670A();
            c0237p.m716w().mo51426q();
            try {
                ((C0929d) c0237p.f812x).m2346d(0.0f, 0.0f, fM47213e, fM47211c, 1);
                InterfaceC22131e.m63379M(c0238p0, jM51541c, f13, 0L, 0.0f, null, 124);
            } finally {
                AbstractC11266d.m30472z(c0237p, jM670A);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m11988e(InterfaceC21082h interfaceC21082h, InterfaceC2994c0 interfaceC2994c0) {
        float f13;
        ArrayList arrayList = (ArrayList) this.f16069b;
        if (interfaceC21082h instanceof C21080f) {
            arrayList.add(interfaceC21082h);
        } else if (interfaceC21082h instanceof C21081g) {
            arrayList.remove(((C21081g) interfaceC21082h).f79946a);
        } else if (interfaceC21082h instanceof C21078d) {
            arrayList.add(interfaceC21082h);
        } else if (interfaceC21082h instanceof C21079e) {
            arrayList.remove(((C21079e) interfaceC21082h).f79945a);
        } else if (interfaceC21082h instanceof C21076b) {
            arrayList.add(interfaceC21082h);
        } else if (interfaceC21082h instanceof C21077c) {
            arrayList.remove(((C21077c) interfaceC21082h).f79944a);
        } else if (!(interfaceC21082h instanceof C21075a)) {
            return;
        } else {
            arrayList.remove(((C21075a) interfaceC21082h).f79943a);
        }
        InterfaceC21082h interfaceC21082h2 = (InterfaceC21082h) AbstractC25265s.m74114R0(arrayList);
        if (AbstractC22676k.m65745e((InterfaceC21082h) this.f16072e, interfaceC21082h2)) {
            return;
        }
        InterfaceC30057d interfaceC30057d = null;
        if (interfaceC21082h2 != null) {
            C22111b c22111b = (C22111b) ((InterfaceC4339a) this.f16070c).invoke();
            boolean z4 = interfaceC21082h2 instanceof C21080f;
            if (z4) {
                f13 = c22111b.f85792c;
            } else if (interfaceC21082h2 instanceof C21078d) {
                f13 = c22111b.f85791b;
            } else {
                f13 = interfaceC21082h2 instanceof C21076b ? c22111b.f85790a : 0.0f;
            }
            C11347e2 c11347e2 = AbstractC22115f.f85807a;
            if (!z4 && ((interfaceC21082h2 instanceof C21078d) || (interfaceC21082h2 instanceof C21076b))) {
                c11347e2 = new C11347e2(45, AbstractC11333b0.f36312c, 2);
            }
            AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C11415x1(this, f13, c11347e2, null), 3);
        } else {
            InterfaceC21082h interfaceC21082h3 = (InterfaceC21082h) this.f16072e;
            C11347e2 c11347e3 = AbstractC22115f.f85807a;
            if (!(interfaceC21082h3 instanceof C21080f) && !(interfaceC21082h3 instanceof C21078d) && (interfaceC21082h3 instanceof C21076b)) {
                c11347e3 = new C11347e2(150, AbstractC11333b0.f36312c, 2);
            }
            AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C16670i0(this, c11347e3, interfaceC30057d, 15), 3);
        }
        this.f16072e = interfaceC21082h2;
    }

    /* JADX INFO: renamed from: f */
    public void m11989f() {
        TabLayout tabLayout = (TabLayout) this.f16070c;
        tabLayout.m15790j();
        AbstractC1692i1 abstractC1692i1 = (AbstractC1692i1) this.f16072e;
        if (abstractC1692i1 != null) {
            int itemCount = abstractC1692i1.getDisplayCount();
            for (int i13 = 0; i13 < itemCount; i13++) {
                C28134h c28134hM15788h = tabLayout.m15788h();
                ((InterfaceC28139m) this.f16071d).mo71065f(c28134hM15788h, i13);
                tabLayout.m15781a(c28134hM15788h, false);
            }
            if (itemCount > 0) {
                int iMin = Math.min(((ViewPager2) this.f16069b).getCurrentItem(), tabLayout.getTabCount() - 1);
                if (iMin != tabLayout.getSelectedTabPosition()) {
                    tabLayout.m15791k(tabLayout.m15787g(iMin), true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m11990g(int i13, int i14) {
        if (i13 < 0.0f) {
            AbstractC22086a.m63158a("Index should be non-negative");
        }
        ((C28621h1) this.f16070c).m87025y(i13);
        ((C28521f0) this.f16072e).m86825a(i13);
        ((C28621h1) this.f16069b).m87025y(i14);
    }

    public C3936c(int i13, int i14) {
        this.f16070c = new C28621h1(i13);
        this.f16069b = new C28621h1(i14);
        this.f16072e = new C28521f0(i13, 90, 200);
    }

    public C3936c(TabLayout tabLayout, ViewPager2 viewPager2, InterfaceC28139m interfaceC28139m) {
        this.f16070c = tabLayout;
        this.f16069b = viewPager2;
        this.f16071d = interfaceC28139m;
    }

    public C3936c(C34815g c34815g, C2817b c2817b) {
        this.f16072e = c34815g;
        this.f16070c = c2817b;
        InterfaceC26629n0 interfaceC26629n0M8016s = c2817b.m8016s(1);
        this.f16069b = interfaceC26629n0M8016s;
        this.f16071d = new C34812f(c34815g, this, interfaceC26629n0M8016s);
    }

    public C3936c(InterfaceC4339a interfaceC4339a, boolean z4) {
        this.f16068a = z4;
        this.f16070c = interfaceC4339a;
        this.f16071d = AbstractC11348f.m30553a(0.0f);
        this.f16069b = new ArrayList();
    }
}
