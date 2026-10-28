package p602x1;

import a11.C0132j;
import a11.C0137o;
import androidx.compose.runtime.Composer;
import b30.C2633u2;
import be1.C3172f;
import c93.InterfaceC4340b;
import c93.InterfaceC4341c;
import c93.InterfaceC4342d;
import c93.InterfaceC4343e;
import c93.InterfaceC4344f;
import c93.InterfaceC4345g;
import c93.InterfaceC4346h;
import c93.InterfaceC4347i;
import c93.InterfaceC4348j;
import c93.InterfaceC4349k;
import c93.InterfaceC4350l;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import c93.InterfaceC4353o;
import c93.InterfaceC4354p;
import c93.InterfaceC4355q;
import c93.InterfaceC4356r;
import c93.InterfaceC4357s;
import d42.C11698n;
import java.util.ArrayList;
import l83.InterfaceC23459e;
import p239j1.C21190h;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.C28679w;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22681m0;
import ud0.C34789b;
import wm1.C37383e;

/* JADX INFO: renamed from: x1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C37816b implements InterfaceC4351m, Function3, InterfaceC4352n, InterfaceC4353o, InterfaceC4354p, InterfaceC4355q, InterfaceC4356r, InterfaceC4357s, InterfaceC4340b, InterfaceC4341c, InterfaceC4342d, InterfaceC4343e, InterfaceC4344f, InterfaceC4345g, InterfaceC4346h, InterfaceC4347i, InterfaceC4348j, InterfaceC4349k, InterfaceC4350l {

    /* JADX INFO: renamed from: E */
    public ArrayList f161955E;

    /* JADX INFO: renamed from: w */
    public final int f161956w;

    /* JADX INFO: renamed from: x */
    public final boolean f161957x;

    /* JADX INFO: renamed from: y */
    public Object f161958y;

    /* JADX INFO: renamed from: z */
    public C28677v1 f161959z;

    public C37816b(Object obj, boolean z4, int i13) {
        this.f161956w = i13;
        this.f161957x = z4;
        this.f161958y = obj;
    }

    /* JADX INFO: renamed from: a */
    public final Object m121330a(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(this.f161956w);
        m121338j(c28655q);
        int iM121340a = i13 | (c28655q.m87153g(this) ? AbstractC37817c.m121340a(2, 0) : AbstractC37817c.m121340a(1, 0));
        Object obj = this.f161958y;
        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        AbstractC22681m0.m65774e(2, obj);
        Object objInvoke = ((InterfaceC4351m) obj).invoke(c28655q, Integer.valueOf(iM121340a));
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21190h(2, this, C37816b.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8, 1);
        }
        return objInvoke;
    }

    /* JADX INFO: renamed from: c */
    public final Object m121331c(Object obj, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(this.f161956w);
        m121338j(c28655q);
        int iM121340a = c28655q.m87153g(this) ? AbstractC37817c.m121340a(2, 1) : AbstractC37817c.m121340a(1, 1);
        Object obj2 = this.f161958y;
        AbstractC22676k.m65748h(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        AbstractC22681m0.m65774e(3, obj2);
        Object objInvoke = ((Function3) obj2).invoke(obj, c28655q, Integer.valueOf(iM121340a | i13));
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0132j(this, obj, i13, 19);
        }
        return objInvoke;
    }

    /* JADX INFO: renamed from: d */
    public final Object m121332d(Object obj, Object obj2, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(this.f161956w);
        m121338j(c28655q);
        int iM121340a = c28655q.m87153g(this) ? AbstractC37817c.m121340a(2, 2) : AbstractC37817c.m121340a(1, 2);
        Object obj3 = this.f161958y;
        AbstractC22676k.m65748h(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        AbstractC22681m0.m65774e(4, obj3);
        Object objInvoke = ((InterfaceC4352n) obj3).invoke(obj, obj2, c28655q, Integer.valueOf(iM121340a | i13));
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0137o(this, obj, obj2, i13, 6);
        }
        return objInvoke;
    }

    /* JADX INFO: renamed from: e */
    public final Object m121333e(Object obj, Object obj2, Boolean bool, Object obj3, Boolean bool2, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(this.f161956w);
        m121338j(c28655q);
        int iM121340a = c28655q.m87153g(this) ? AbstractC37817c.m121340a(2, 5) : AbstractC37817c.m121340a(1, 5);
        Object obj4 = this.f161958y;
        AbstractC22676k.m65748h(obj4, "null cannot be cast to non-null type kotlin.Function7<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        AbstractC22681m0.m65774e(7, obj4);
        Object objInvoke = ((InterfaceC4355q) obj4).invoke(obj, obj2, bool, obj3, bool2, c28655q, Integer.valueOf(i13 | iM121340a));
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3172f(this, obj, obj2, bool, obj3, bool2, i13, 15);
        }
        return objInvoke;
    }

    /* JADX INFO: renamed from: f */
    public final Object m121334f(Object obj, Object obj2, Object obj3, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(this.f161956w);
        m121338j(c28655q);
        int iM121340a = c28655q.m87153g(this) ? AbstractC37817c.m121340a(2, 3) : AbstractC37817c.m121340a(1, 3);
        Object obj4 = this.f161958y;
        AbstractC22676k.m65748h(obj4, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        AbstractC22681m0.m65774e(5, obj4);
        Object objInvoke = ((InterfaceC4353o) obj4).invoke(obj, obj2, obj3, c28655q, Integer.valueOf(iM121340a | i13));
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C37383e(this, obj, obj2, obj3, i13, 22);
        }
        return objInvoke;
    }

    /* JADX INFO: renamed from: g */
    public final Object m121335g(Object obj, Object obj2, Object obj3, Object obj4, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(this.f161956w);
        m121338j(c28655q);
        int iM121340a = c28655q.m87153g(this) ? AbstractC37817c.m121340a(2, 4) : AbstractC37817c.m121340a(1, 4);
        Object obj5 = this.f161958y;
        AbstractC22676k.m65748h(obj5, "null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        AbstractC22681m0.m65774e(6, obj5);
        Object objInvoke = ((InterfaceC4354p) obj5).invoke(obj, obj2, obj3, obj4, c28655q, Integer.valueOf(i13 | iM121340a));
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C34789b(this, obj, obj2, obj3, obj4, i13, 5);
        }
        return objInvoke;
    }

    /* JADX INFO: renamed from: h */
    public final Object m121336h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(this.f161956w);
        m121338j(c28655q);
        int iM121340a = c28655q.m87153g(this) ? AbstractC37817c.m121340a(2, 6) : AbstractC37817c.m121340a(1, 6);
        Object obj7 = this.f161958y;
        AbstractC22676k.m65748h(obj7, "null cannot be cast to non-null type kotlin.Function8<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        AbstractC22681m0.m65774e(8, obj7);
        Object objInvoke = ((InterfaceC4356r) obj7).invoke(obj, obj2, obj3, obj4, obj5, obj6, c28655q, Integer.valueOf(i13 | iM121340a));
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2633u2(this, obj, obj2, obj3, obj4, obj5, obj6, i13, 13);
        }
        return objInvoke;
    }

    /* JADX INFO: renamed from: i */
    public final Object m121337i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(this.f161956w);
        m121338j(c28655q);
        int iM121340a = c28655q.m87153g(this) ? AbstractC37817c.m121340a(2, 8) : AbstractC37817c.m121340a(1, 8);
        Object obj9 = this.f161958y;
        AbstractC22676k.m65748h(obj9, "null cannot be cast to non-null type kotlin.Function10<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"p7\")] kotlin.Any?, @[ParameterName(name = \"p8\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        AbstractC22681m0.m65774e(10, obj9);
        Object objInvoke = ((InterfaceC4340b) obj9).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, c28655q, Integer.valueOf(i13 | iM121340a));
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11698n(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, i13);
        }
        return objInvoke;
    }

    @Override // c93.InterfaceC4351m
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m121330a((Composer) obj, ((Number) obj2).intValue());
    }

    /* JADX INFO: renamed from: j */
    public final void m121338j(Composer composer) {
        C28655q c28655q;
        C28677v1 c28677v1M87117B;
        if (!this.f161957x || (c28677v1M87117B = (c28655q = (C28655q) composer).m87117B()) == null) {
            return;
        }
        c28655q.getClass();
        c28677v1M87117B.f115980b |= 1;
        if (AbstractC37817c.m121345f(this.f161959z, c28677v1M87117B)) {
            this.f161959z = c28677v1M87117B;
            return;
        }
        ArrayList arrayList = this.f161955E;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.f161955E = arrayList2;
            arrayList2.add(c28677v1M87117B);
            return;
        }
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (AbstractC37817c.m121345f((C28677v1) arrayList.get(i13), c28677v1M87117B)) {
                arrayList.set(i13, c28677v1M87117B);
                return;
            }
        }
        arrayList.add(c28677v1M87117B);
    }

    /* JADX INFO: renamed from: k */
    public final void m121339k(InterfaceC23459e interfaceC23459e) {
        if (AbstractC22676k.m65745e(this.f161958y, interfaceC23459e)) {
            return;
        }
        boolean z4 = this.f161958y == null;
        this.f161958y = interfaceC23459e;
        if (z4 || !this.f161957x) {
            return;
        }
        C28677v1 c28677v1 = this.f161959z;
        if (c28677v1 != null) {
            C28679w c28679w = c28677v1.f115979a;
            if (c28679w != null) {
                c28679w.m87224r(c28677v1, null);
            }
            this.f161959z = null;
        }
        ArrayList arrayList = this.f161955E;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                C28677v1 c28677v2 = (C28677v1) arrayList.get(i13);
                C28679w c28679w2 = c28677v2.f115979a;
                if (c28679w2 != null) {
                    c28679w2.m87224r(c28677v2, null);
                }
            }
            arrayList.clear();
        }
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m121331c(obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Override // c93.InterfaceC4352n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return m121332d(obj, obj2, (Composer) obj3, ((Number) obj4).intValue());
    }

    @Override // c93.InterfaceC4353o
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return m121334f(obj, obj2, obj3, (Composer) obj4, ((Number) obj5).intValue());
    }

    @Override // c93.InterfaceC4354p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return m121335g(obj, obj2, obj3, obj4, (Composer) obj5, ((Number) obj6).intValue());
    }

    @Override // c93.InterfaceC4355q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return m121333e(obj, obj2, (Boolean) obj3, obj4, (Boolean) obj5, (Composer) obj6, ((Number) obj7).intValue());
    }

    @Override // c93.InterfaceC4356r
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return m121336h(obj, obj2, obj3, obj4, obj5, obj6, (Composer) obj7, ((Number) obj8).intValue());
    }

    @Override // c93.InterfaceC4340b
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        return m121337i(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, (Composer) obj9, ((Number) obj10).intValue());
    }
}
