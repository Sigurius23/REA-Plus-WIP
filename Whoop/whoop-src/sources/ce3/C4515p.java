package ce3;

import bg.C3215j;
import c93.InterfaceC4339a;
import fa3.C14303b;
import fa3.C14327t;
import fa3.C14328u;
import hb3.C17118h0;
import hb3.C17122k;
import hg3.AbstractC17269i;
import ia3.C18295a;
import ia3.C18298d;
import ja3.C21521q;
import ja3.C21526v;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import kb3.C22333b;
import kb3.C22342k;
import l83.C23454a0;
import lb3.AbstractC23791o;
import lb3.C23784k0;
import lb3.InterfaceC23796q0;
import m83.C25235a0;
import p014aj.C0928c;
import p692zt.C41113q;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.C22708k;
import q93.C30077a;
import q93.C30083g;
import q93.C30086j;
import q93.C30092p;
import qa3.C30171w0;
import r93.EnumC31106a0;
import r93.EnumC31120f;
import r93.InterfaceC31123g;
import r93.InterfaceC31135k;
import s93.InterfaceC32307i;
import u93.AbstractC34680i;
import u93.C34673e0;
import u93.C34686l;
import va3.C35847e;
import wb3.AbstractC37056f;
import wd3.AbstractC37172f;
import x93.C38132x;

/* JADX INFO: renamed from: ce3.p */
/* JADX INFO: loaded from: classes5.dex */
public final class C4515p implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f18180w;

    /* JADX INFO: renamed from: x */
    public final Object f18181x;

    /* JADX INFO: renamed from: y */
    public final Object f18182y;

    public /* synthetic */ C4515p(int i13, Object obj, Object obj2) {
        this.f18180w = i13;
        this.f18182y = obj;
        this.f18181x = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, l83.h] */
    @Override // c93.InterfaceC4339a
    public final Object invoke() throws Throwable {
        EnumC4496a enumC4496a;
        switch (this.f18180w) {
            case 0:
                C4516q c4516q = (C4516q) this.f18182y;
                C4520u c4520u = (C4520u) this.f18181x;
                EnumC4496a enumC4496a2 = EnumC4496a.INTERNAL_ERROR;
                IOException iOException = null;
                try {
                    if (!c4520u.m14141b(true, this)) {
                        throw new IOException("Required SETTINGS preface not received");
                    }
                    while (c4520u.m14141b(false, this)) {
                    }
                    enumC4496a = EnumC4496a.NO_ERROR;
                    try {
                        try {
                            c4516q.m14133b(enumC4496a, EnumC4496a.CANCEL, null);
                        } catch (IOException e5) {
                            iOException = e5;
                            EnumC4496a enumC4496a3 = EnumC4496a.PROTOCOL_ERROR;
                            c4516q.m14133b(enumC4496a3, enumC4496a3, iOException);
                        }
                        AbstractC37172f.m119117b(c4520u);
                        return C23454a0.f92919a;
                    } catch (Throwable th3) {
                        th = th3;
                        c4516q.m14133b(enumC4496a, enumC4496a2, iOException);
                        AbstractC37172f.m119117b(c4520u);
                        throw th;
                    }
                } catch (IOException e13) {
                    iOException = e13;
                    enumC4496a = enumC4496a2;
                } catch (Throwable th4) {
                    th = th4;
                    enumC4496a = enumC4496a2;
                    c4516q.m14133b(enumC4496a, enumC4496a2, iOException);
                    AbstractC37172f.m119117b(c4520u);
                    throw th;
                }
                break;
            case 1:
                C17118h0 c17118h0 = (C17118h0) this.f18181x;
                C30171w0 c30171w0 = (C30171w0) this.f18182y;
                C17122k c17122k = c17118h0.f65728a;
                return c17122k.f65760a.f65739e.mo15984A(c30171w0, c17122k.f65761b);
            case 2:
                C41113q c41113q = (C41113q) this.f18181x;
                InterfaceC32307i additionalAnnotations = ((InterfaceC31123g) this.f18182y).getAnnotations();
                AbstractC22676k.m65750j(c41113q, "<this>");
                AbstractC22676k.m65750j(additionalAnnotations, "additionalAnnotations");
                return C14303b.m40908b(((C18295a) c41113q.f177224x).f71239q, (C14327t) c41113q.f177226z.getValue(), additionalAnnotations);
            case 3:
                C18298d c18298d = (C18298d) this.f18181x;
                return new C21521q(c18298d.f71253a, (C38132x) this.f18182y);
            case 4:
                C41113q c41113q2 = (C41113q) this.f18181x;
                C21526v c21526v = (C21526v) this.f18182y;
                C0928c c0928c = ((C18295a) c41113q2.f177224x).f71224b;
                C35847e packageFqName = c21526v.f82562o.f146067F;
                c0928c.getClass();
                AbstractC22676k.m65750j(packageFqName, "packageFqName");
                return null;
            case 5:
                C30083g c30083g = (C30083g) this.f18181x;
                C22342k c22342k = (C22342k) this.f18182y;
                Function1 function1 = c30083g.f122781b;
                C34673e0 c34673e0 = c30083g.f122780a;
                C34686l c34686l = new C34686l((InterfaceC31135k) function1.invoke(c34673e0), C30083g.f122778g, EnumC31106a0.f128307E, EnumC31120f.f128329x, AbstractC37056f.m118958J(c34673e0.f146045E.m83817e()), c22342k);
                c34686l.m109576X(new C30077a(c22342k, c34686l), C25235a0.f99113w, null);
                return c34686l;
            case 6:
                C30086j c30086j = (C30086j) this.f18181x;
                C22342k c22342k2 = (C22342k) this.f18182y;
                C34673e0 c34673e0M83824l = c30086j.m83824l();
                AbstractC22676k.m65749i(c34673e0M83824l, "getBuiltInsModule(...)");
                return new C30092p(c34673e0M83824l, c22342k2, new C14328u(c30086j, 12));
            case 7:
                C30092p c30092p = (C30092p) this.f18181x;
                C22342k c22342k3 = (C22342k) this.f18182y;
                C34673e0 c34673e1 = c30092p.m92222g().f122784a;
                C30083g.f122775d.getClass();
                return AbstractC17269i.m48868O(c34673e1, C30083g.f122779h, new C41113q(c22342k3, c30092p.m92222g().f122784a)).mo60594i();
            default:
                C23784k0.f94165x.getClass();
                C23784k0 c23784k0 = C23784k0.f94166y;
                InterfaceC23796q0 interfaceC23796q0Mo60496e = ((AbstractC34680i) this.f18182y).mo60496e();
                List list = Collections.EMPTY_LIST;
                C3215j c3215j = new C3215j(this, 15);
                C22333b NO_LOCKS = C22342k.f87183e;
                AbstractC22676k.m65749i(NO_LOCKS, "NO_LOCKS");
                return AbstractC23791o.m69892k(list, new C22708k(NO_LOCKS, c3215j), c23784k0, interfaceC23796q0Mo60496e, false);
        }
    }

    public /* synthetic */ C4515p(Object obj, Object obj2, boolean z4, int i13) {
        this.f18180w = i13;
        this.f18181x = obj;
        this.f18182y = obj2;
    }
}
