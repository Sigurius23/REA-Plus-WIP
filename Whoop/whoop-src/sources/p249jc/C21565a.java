package p249jc;

import ai.C0904j;
import android.content.ContentValues;
import android.content.Intent;
import android.graphics.Typeface;
import androidx.room.C1774d;
import bd3.C3143v;
import bh3.InterfaceC3254a;
import bh3.InterfaceC3260g;
import bh3.InterfaceC3261h;
import ch3.C4697n;
import ch3.C4707s;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.sentry.config.AbstractC20301a;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jh3.C21705f;
import jh3.C21707h;
import ka3.C22316h;
import lb3.AbstractC23763c0;
import lb3.AbstractC23767d1;
import lb3.AbstractC23773f1;
import lb3.AbstractC23791o;
import lb3.AbstractC23797r;
import lb3.AbstractC23804u0;
import lb3.AbstractC23811y;
import lb3.C23784k0;
import lb3.EnumC23776g1;
import lb3.InterfaceC23796q0;
import m83.AbstractC25260n;
import m83.AbstractC25267u;
import na3.AbstractC26532s;
import na3.C26517d;
import na3.C26519f;
import na3.EnumC26520g;
import na3.EnumC26529p;
import ne3.C26606c;
import ne3.C26608d;
import ne3.C26611e0;
import oe3.C27887g;
import p035bp.AbstractC3511b;
import p076d.C11311s;
import p097ds.AbstractC12313p;
import p325mb.InterfaceC25379a;
import p389p0.C28539n0;
import p392p3.C28780r;
import p428qk.C30439b;
import p518ub.InterfaceC34728a;
import p526ul.InterfaceC35055a;
import p586wk.InterfaceC37328f;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p73.InterfaceC28960a;
import p73.InterfaceC28961b;
import q83.InterfaceC30062i;
import r93.InterfaceC31117e;
import r93.InterfaceC31126h;
import r93.InterfaceC31165x0;
import s93.C32308j;
import s93.InterfaceC32307i;
import xg3.InterfaceC38278e;
import xg3.InterfaceC38279f;
import xg3.InterfaceC38288o;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: jc.a */
/* JADX INFO: loaded from: classes.dex */
public final class C21565a implements InterfaceC25379a, InterfaceC3260g, InterfaceC3261h, InterfaceC30062i, InterfaceC28960a, InterfaceC28961b, InterfaceC35055a, InterfaceC37328f {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f82704w;

    public /* synthetic */ C21565a(int i13) {
        this.f82704w = i13;
    }

    /* JADX INFO: renamed from: e */
    public static final void m60595e(C26608d c26608d) {
        C3143v c3143v = C26608d.f105837h;
        if (C26608d.f105838i == null) {
            C26608d.f105838i = new C26608d();
            C26606c c26606c = new C26606c("Okio Watchdog");
            c26606c.setDaemon(true);
            c26606c.start();
        }
        long jNanoTime = System.nanoTime();
        long j7 = c26608d.f105906c;
        boolean z4 = c26608d.f105904a;
        if (j7 != 0 && z4) {
            c26608d.f105845g = Math.min(j7, c26608d.mo79280c() - jNanoTime) + jNanoTime;
        } else if (j7 != 0) {
            c26608d.f105845g = jNanoTime + j7;
        } else {
            if (!z4) {
                throw new AssertionError();
            }
            c26608d.f105845g = c26608d.mo79280c();
        }
        C3143v c3143v2 = C26608d.f105837h;
        int i13 = c3143v2.f12310x + 1;
        c3143v2.f12310x = i13;
        C26608d[] c26608dArr = (C26608d[]) c3143v2.f12311y;
        if (i13 == c26608dArr.length) {
            C26608d[] c26608dArr2 = new C26608d[i13 * 2];
            AbstractC25260n.m74068i0(0, 0, 14, c26608dArr, c26608dArr2);
            c3143v2.f12311y = c26608dArr2;
        }
        c3143v2.m9040i(i13, c26608d);
        if (c26608d.f105844f == 1) {
            C26608d.f105840k.signal();
        }
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m60596g(C26611e0 c26611e0) {
        C26611e0 c26611e1 = C27887g.f112443F;
        return !AbstractC39421y.m125920E(c26611e0.m79173b(), ".class", true);
    }

    /* JADX INFO: renamed from: h */
    public static C26608d m60597h() throws InterruptedException {
        C3143v c3143v = C26608d.f105837h;
        C26608d c26608d = ((C26608d[]) c3143v.f12311y)[1];
        if (c26608d == null) {
            long jNanoTime = System.nanoTime();
            C26608d.f105840k.await(C26608d.f105841l, TimeUnit.MILLISECONDS);
            if (((C26608d[]) c3143v.f12311y)[1] != null || System.nanoTime() - jNanoTime < C26608d.f105842m) {
                return null;
            }
            return C26608d.f105838i;
        }
        long jNanoTime2 = c26608d.f105845g - System.nanoTime();
        if (jNanoTime2 > 0) {
            C26608d.f105840k.await(jNanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        c3143v.m9043l(c26608d);
        c26608d.f105843e = 2;
        return c26608d;
    }

    /* JADX INFO: renamed from: i */
    public static Typeface m60598i(String str, C28780r c28780r, int i13) {
        if (i13 == 0 && AbstractC22676k.m65745e(c28780r, C28780r.f116539F) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), c28780r.f116547w, i13 == 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX INFO: renamed from: j */
    public static C11311s m60599j(AbstractC23763c0 abstractC23763c0, C1774d c1774d, int i13, EnumC26529p enumC26529p, boolean z4, boolean z13) {
        InterfaceC31126h interfaceC31126hMo1784d;
        InterfaceC23796q0 interfaceC23796q0Mo69844i0;
        C0904j c0904j;
        AbstractC23804u0 abstractC23804u0M69854j;
        C1774d c1774d2 = c1774d;
        boolean zM10367G = AbstractC3511b.m10367G(enumC26529p);
        ?? r10 = 0;
        boolean z14 = (z13 && z4) ? false : true;
        Object obj = null;
        if ((zM10367G || !abstractC23763c0.mo69842X().isEmpty()) && (interfaceC31126hMo1784d = abstractC23763c0.mo69844i0().mo1784d()) != null) {
            C26517d c26517d = (C26517d) c1774d2.invoke(Integer.valueOf(i13));
            InterfaceC31117e interfaceC31117eM78606b = AbstractC26532s.m78606b(interfaceC31126hMo1784d, c26517d, enumC26529p);
            Boolean boolM78608d = AbstractC26532s.m78608d(c26517d, enumC26529p);
            if (interfaceC31117eM78606b == null || (interfaceC23796q0Mo69844i0 = interfaceC31117eM78606b.mo60496e()) == null) {
                interfaceC23796q0Mo69844i0 = abstractC23763c0.mo69844i0();
            }
            int iM2222i = i13 + 1;
            List listMo69842X = abstractC23763c0.mo69842X();
            List parameters = interfaceC23796q0Mo69844i0.getParameters();
            AbstractC22676k.m65749i(parameters, "getParameters(...)");
            List list = parameters;
            Iterator it = listMo69842X.iterator();
            Iterator it3 = list.iterator();
            ArrayList arrayList = new ArrayList(Math.min(AbstractC25267u.m74163i0(listMo69842X, 10), AbstractC25267u.m74163i0(list, 10)));
            while (it.hasNext() && it3.hasNext()) {
                Object next = it.next();
                InterfaceC31165x0 interfaceC31165x0 = (InterfaceC31165x0) it3.next();
                AbstractC23804u0 abstractC23804u0 = (AbstractC23804u0) next;
                if (!z14) {
                    c0904j = new C0904j(obj, (int) r10);
                } else if (!abstractC23804u0.mo69869c()) {
                    c0904j = m60600k(abstractC23804u0.mo69868b().mo69863p0(), c1774d2, iM2222i, z13);
                } else if (((C26517d) c1774d2.invoke(Integer.valueOf(iM2222i))).m78593b() == EnumC26520g.f105435w) {
                    AbstractC23773f1 abstractC23773f1Mo69863p0 = abstractC23804u0.mo69868b().mo69863p0();
                    c0904j = new C0904j(AbstractC23791o.m69883b(AbstractC12313p.m34261M(abstractC23773f1Mo69863p0).mo64125r0(r10), AbstractC12313p.m34288g0(abstractC23773f1Mo69863p0).mo64125r0(true)), 1);
                } else {
                    c0904j = new C0904j((Object) null, 1);
                }
                iM2222i += c0904j.m2222i();
                if (c0904j.m2223j() != null) {
                    AbstractC23811y abstractC23811yM2223j = c0904j.m2223j();
                    EnumC23776g1 enumC23776g1Mo69867a = abstractC23804u0.mo69867a();
                    AbstractC22676k.m65749i(enumC23776g1Mo69867a, "getProjectionKind(...)");
                    abstractC23804u0M69854j = AbstractC20301a.m56350r(abstractC23811yM2223j, enumC23776g1Mo69867a, interfaceC31165x0);
                } else if (interfaceC31117eM78606b == null || abstractC23804u0.mo69869c()) {
                    abstractC23804u0M69854j = interfaceC31117eM78606b != null ? AbstractC23767d1.m69854j(interfaceC31165x0) : null;
                } else {
                    AbstractC23811y abstractC23811yMo69868b = abstractC23804u0.mo69868b();
                    AbstractC22676k.m65749i(abstractC23811yMo69868b, "getType(...)");
                    EnumC23776g1 enumC23776g1Mo69867a2 = abstractC23804u0.mo69867a();
                    AbstractC22676k.m65749i(enumC23776g1Mo69867a2, "getProjectionKind(...)");
                    abstractC23804u0M69854j = AbstractC20301a.m56350r(abstractC23811yMo69868b, enumC23776g1Mo69867a2, interfaceC31165x0);
                }
                arrayList.add(abstractC23804u0M69854j);
                c1774d2 = c1774d;
                r10 = 0;
                obj = null;
            }
            int i14 = iM2222i - i13;
            if (interfaceC31117eM78606b == null && boolM78608d == null) {
                if (!arrayList.isEmpty()) {
                    Iterator it4 = arrayList.iterator();
                    do {
                        if (it4.hasNext()) {
                        }
                    } while (((AbstractC23804u0) it4.next()) == null);
                }
                return new C11311s(null, i14, false);
            }
            InterfaceC32307i annotations = abstractC23763c0.getAnnotations();
            C32308j c32308j = AbstractC26532s.f105471b;
            if (interfaceC31117eM78606b == null) {
                c32308j = null;
            }
            C23784k0 c23784k0M56329a0 = AbstractC20301a.m56329a0(AbstractC26532s.m78605a(AbstractC25260n.m74077r0(new InterfaceC32307i[]{annotations, c32308j, boolM78608d != null ? AbstractC26532s.m78609e() : null})));
            List listMo69842X2 = abstractC23763c0.mo69842X();
            Iterator it5 = arrayList.iterator();
            Iterator it6 = listMo69842X2.iterator();
            ArrayList arrayList2 = new ArrayList(Math.min(AbstractC25267u.m74163i0(arrayList, 10), AbstractC25267u.m74163i0(listMo69842X2, 10)));
            while (it5.hasNext() && it6.hasNext()) {
                Object next2 = it5.next();
                AbstractC23804u0 abstractC23804u1 = (AbstractC23804u0) it6.next();
                AbstractC23804u0 abstractC23804u2 = (AbstractC23804u0) next2;
                if (abstractC23804u2 != null) {
                    abstractC23804u1 = abstractC23804u2;
                }
                arrayList2.add(abstractC23804u1);
            }
            AbstractC23763c0 abstractC23763c0M69890i = AbstractC23791o.m69890i(arrayList2, c23784k0M56329a0, interfaceC23796q0Mo69844i0, boolM78608d != null ? boolM78608d.booleanValue() : abstractC23763c0.mo69814k0());
            if (c26517d.m78592a()) {
                abstractC23763c0M69890i = new C26519f(abstractC23763c0M69890i);
            }
            return new C11311s(abstractC23763c0M69890i, i14, boolM78608d != null && c26517d.m78594c());
        }
        return new C11311s(null, 1, false);
    }

    /* JADX INFO: renamed from: k */
    public static C0904j m60600k(AbstractC23773f1 abstractC23773f1, C1774d c1774d, int i13, boolean z4) {
        AbstractC23811y abstractC23811yM30526i;
        Object objM69897p = null;
        if (AbstractC23791o.m69886e(abstractC23773f1)) {
            return new C0904j(objM69897p, 1);
        }
        if (!(abstractC23773f1 instanceof AbstractC23797r)) {
            if (!(abstractC23773f1 instanceof AbstractC23763c0)) {
                throw new NoWhenBranchMatchedException();
            }
            C11311s c11311sM60599j = m60599j((AbstractC23763c0) abstractC23773f1, c1774d, i13, EnumC26529p.f105466y, false, z4);
            return new C0904j(c11311sM60599j.m30524g() ? AbstractC23791o.m69897p(abstractC23773f1, c11311sM60599j.m30526i()) : c11311sM60599j.m30526i(), c11311sM60599j.m30525h());
        }
        boolean z13 = abstractC23773f1 instanceof C22316h;
        AbstractC23797r abstractC23797r = (AbstractC23797r) abstractC23773f1;
        AbstractC23763c0 abstractC23763c0 = abstractC23797r.f94188y;
        AbstractC23763c0 abstractC23763c1 = abstractC23797r.f94187x;
        C11311s c11311sM60599j2 = m60599j(abstractC23763c1, c1774d, i13, EnumC26529p.f105464w, z13, z4);
        C11311s c11311sM60599j3 = m60599j(abstractC23797r.f94188y, c1774d, i13, EnumC26529p.f105465x, z13, z4);
        if (c11311sM60599j2.m30526i() != null || c11311sM60599j3.m30526i() != null) {
            if (c11311sM60599j2.m30524g() || c11311sM60599j3.m30524g()) {
                AbstractC23763c0 abstractC23763c0M30526i = c11311sM60599j3.m30526i();
                if (abstractC23763c0M30526i != null) {
                    AbstractC23763c0 abstractC23763c0M30526i2 = c11311sM60599j2.m30526i();
                    if (abstractC23763c0M30526i2 == null) {
                        abstractC23763c0M30526i2 = abstractC23763c0M30526i;
                    }
                    abstractC23811yM30526i = AbstractC23791o.m69883b(abstractC23763c0M30526i2, abstractC23763c0M30526i);
                } else {
                    abstractC23811yM30526i = c11311sM60599j2.m30526i();
                    AbstractC22676k.m65747g(abstractC23811yM30526i);
                }
                objM69897p = AbstractC23791o.m69897p(abstractC23773f1, abstractC23811yM30526i);
            } else if (z13) {
                AbstractC23763c0 abstractC23763c0M30526i3 = c11311sM60599j2.m30526i();
                if (abstractC23763c0M30526i3 == null) {
                    abstractC23763c0M30526i3 = abstractC23763c1;
                }
                AbstractC23763c0 abstractC23763c0M30526i4 = c11311sM60599j3.m30526i();
                if (abstractC23763c0M30526i4 != null) {
                    abstractC23763c0 = abstractC23763c0M30526i4;
                }
                objM69897p = new C22316h(abstractC23763c0M30526i3, abstractC23763c0);
            } else {
                AbstractC23763c0 abstractC23763c0M30526i5 = c11311sM60599j2.m30526i();
                if (abstractC23763c0M30526i5 == null) {
                    abstractC23763c0M30526i5 = abstractC23763c1;
                }
                AbstractC23763c0 abstractC23763c0M30526i6 = c11311sM60599j3.m30526i();
                if (abstractC23763c0M30526i6 != null) {
                    abstractC23763c0 = abstractC23763c0M30526i6;
                }
                objM69897p = AbstractC23791o.m69883b(abstractC23763c0M30526i5, abstractC23763c0);
            }
        }
        return new C0904j(objM69897p, c11311sM60599j2.m30525h());
    }

    /* JADX INFO: renamed from: l */
    public static C28780r m60601l() {
        return C28780r.f116542I;
    }

    /* JADX INFO: renamed from: n */
    public static C28780r m60602n() {
        return C28780r.f116541H;
    }

    @Override // p586wk.InterfaceC37328f
    /* JADX INFO: renamed from: a */
    public void mo2343a(byte[] bArr, Object obj, MessageDigest messageDigest) {
    }

    @Override // p73.InterfaceC28961b
    public void accept(Object obj) {
        AbstractC21598x.m60677d0(new OnErrorNotImplementedException((Throwable) obj));
    }

    @Override // bh3.InterfaceC3260g
    /* JADX INFO: renamed from: b */
    public Object mo1678b(Object obj) {
        switch (this.f82704w) {
            case 1:
                Throwable th3 = (Throwable) obj;
                C21705f.f83334f.m61161f().getClass();
                return th3;
            case 2:
                InterfaceC38288o interfaceC38288o = (InterfaceC38288o) obj;
                C21705f.f83334f.m61161f().getClass();
                return interfaceC38288o;
            case 3:
            case 4:
            default:
                return Integer.valueOf(((Intent) obj).getIntExtra("android.bluetooth.adapter.extra.STATE", 0));
            case 5:
                InterfaceC3254a interfaceC3254a = (InterfaceC3254a) obj;
                C21705f.f83334f.m61160e().getClass();
                return interfaceC3254a;
            case 6:
                InterfaceC38279f interfaceC38279f = (InterfaceC38279f) obj;
                C21705f.f83334f.m61159c().getClass();
                return interfaceC38279f;
        }
    }

    @Override // bh3.InterfaceC3261h
    /* JADX INFO: renamed from: c */
    public Object mo9474c(Object obj, Object obj2) {
        switch (this.f82704w) {
            case 3:
                InterfaceC38278e interfaceC38278e = (InterfaceC38278e) obj2;
                C21705f.f83334f.m61159c().getClass();
                return interfaceC38278e;
            default:
                InterfaceC38288o interfaceC38288o = (InterfaceC38288o) obj2;
                C21707h c21707hM61161f = C21705f.f83334f.m61161f();
                if (c21707hM61161f == C21707h.f83342a) {
                    return interfaceC38288o;
                }
                C4697n c4697n = new C4697n(interfaceC38288o, 1);
                c21707hM61161f.getClass();
                return new C4707s(c4697n, 2);
        }
    }

    @Override // p526ul.InterfaceC35055a
    public Object create() {
        return new ArrayList();
    }

    @Override // p325mb.InterfaceC25379a
    /* JADX INFO: renamed from: d */
    public void mo19644d(InterfaceC34728a db4) {
        AbstractC22676k.m65750j(db4, "db");
        db4.mo109660E("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        db4.mo109668f1(contentValues, new Object[0]);
    }

    /* JADX INFO: renamed from: m */
    public C28539n0 m60603m(C30439b c30439b) {
        return new C28539n0(c30439b);
    }

    @Override // p73.InterfaceC28960a
    public void run() {
    }

    public String toString() {
        switch (this.f82704w) {
            case 21:
                return "EmptyAction";
            case 25:
                return "NULL_VALUE";
            default:
                return super.toString();
        }
    }
}
