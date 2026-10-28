package p634y1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import d91.C11813a;
import java.util.Arrays;
import l83.C23454a0;
import p389p0.C28539n0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p474s.C31983m2;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22681m0;
import u93.C34672e;
import va3.AbstractC35846d;
import vb1.C35868a;
import we1.C37224h;
import x31.C37942a;
import xl2.C38454a;

/* JADX INFO: renamed from: y1.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC39038k {

    /* JADX INFO: renamed from: a */
    public static final C28539n0 f168009a = new C28539n0(10, new C38454a(23), new C35868a(18));

    /* JADX INFO: renamed from: a */
    public static final String m124455a(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    /* JADX INFO: renamed from: b */
    public static final C28539n0 m124456b(InterfaceC4351m interfaceC4351m, Function1 function1) {
        C11813a c11813a = new C11813a(4, interfaceC4351m);
        AbstractC22681m0.m65774e(1, function1);
        return new C28539n0(10, c11813a, function1);
    }

    /* JADX INFO: renamed from: c */
    public static final Object m124457c(Object[] objArr, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        return m124459e(Arrays.copyOf(objArr, objArr.length), f168009a, interfaceC4339a, composer, ((i13 << 6) & 7168) | 384, 0);
    }

    /* JADX INFO: renamed from: d */
    public static final Object m124458d(Object[] objArr, InterfaceC39037j interfaceC39037j, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        return m124459e(Arrays.copyOf(objArr, objArr.length), interfaceC39037j, interfaceC4339a, composer, 384 | ((i13 << 3) & 7168), 0);
    }

    /* JADX INFO: renamed from: e */
    public static final Object m124459e(Object[] objArr, InterfaceC39037j interfaceC39037j, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        Object[] objArr2;
        final Object obj;
        Object objMo7448f;
        if ((i14 & 2) != 0) {
            interfaceC39037j = f168009a;
        }
        final InterfaceC39037j interfaceC39037j2 = interfaceC39037j;
        C28655q c28655q = (C28655q) composer;
        long j7 = c28655q.f115904T;
        AbstractC35846d.m113779c(36);
        final String string = Long.toString(j7, 36);
        AbstractC22676k.m65749i(string, "toString(...)");
        AbstractC22676k.m65748h(interfaceC39037j2, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        final InterfaceC39033f interfaceC39033f = (InterfaceC39033f) c28655q.m87161k(AbstractC39035h.f168004a);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (objM87133R == c28676v0) {
            Object objMo67323c = (interfaceC39033f == null || (objMo7448f = interfaceC39033f.mo7448f(string)) == null) ? null : interfaceC39037j2.mo67323c(objMo7448f);
            if (objMo67323c == null) {
                objMo67323c = interfaceC4339a.invoke();
            }
            objArr2 = objArr;
            C39029b c39029b = new C39029b(interfaceC39037j2, interfaceC39033f, string, objMo67323c, objArr2);
            c28655q.m87172p0(c39029b);
            objM87133R = c39029b;
        } else {
            objArr2 = objArr;
        }
        final C39029b c39029b2 = (C39029b) objM87133R;
        Object objInvoke = Arrays.equals(objArr2, c39029b2.f167989E) ? c39029b2.f167995z : null;
        if (objInvoke == null) {
            objInvoke = interfaceC4339a.invoke();
        }
        boolean zM87157i = c28655q.m87157i(c39029b2) | ((((i13 & 112) ^ 48) > 32 && c28655q.m87157i(interfaceC39037j2)) || (i13 & 48) == 32) | c28655q.m87157i(interfaceC39033f) | c28655q.m87153g(string) | c28655q.m87157i(objInvoke) | c28655q.m87157i(objArr2);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87157i || objM87133R2 == c28676v0) {
            final Object[] objArr3 = objArr2;
            obj = objInvoke;
            InterfaceC4339a interfaceC4339a2 = new InterfaceC4339a() { // from class: y1.a
                @Override // c93.InterfaceC4339a
                public final Object invoke() throws Throwable {
                    boolean z4;
                    C39029b c39029b3 = c39029b2;
                    InterfaceC39033f interfaceC39033f2 = c39029b3.f167993x;
                    InterfaceC39033f interfaceC39033f3 = interfaceC39033f;
                    boolean z13 = true;
                    if (interfaceC39033f2 != interfaceC39033f3) {
                        c39029b3.f167993x = interfaceC39033f3;
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    String str = c39029b3.f167994y;
                    String str2 = string;
                    if (AbstractC22676k.m65745e(str, str2)) {
                        z13 = z4;
                    } else {
                        c39029b3.f167994y = str2;
                    }
                    c39029b3.f167992w = interfaceC39037j2;
                    c39029b3.f167995z = obj;
                    c39029b3.f167989E = objArr3;
                    InterfaceC39032e interfaceC39032e = c39029b3.f167990F;
                    if (interfaceC39032e != null && z13) {
                        ((C31983m2) interfaceC39032e).m99494u();
                        c39029b3.f167990F = null;
                        c39029b3.m124454b();
                    }
                    return C23454a0.f92919a;
                }
            };
            c28655q.m87172p0(interfaceC4339a2);
            objM87133R2 = interfaceC4339a2;
        } else {
            obj = objInvoke;
        }
        AbstractC28683x.m87257k((InterfaceC4339a) objM87133R2, c28655q);
        return obj;
    }

    /* JADX INFO: renamed from: f */
    public static final InterfaceC28601c1 m124460f(Object[] objArr, InterfaceC4339a interfaceC4339a, Composer composer) {
        return (InterfaceC28601c1) m124459e(Arrays.copyOf(objArr, objArr.length), new C28539n0(10, new C37942a(10), new C34672e()), interfaceC4339a, composer, 3456, 0);
    }

    /* JADX INFO: renamed from: g */
    public static final C39031d m124461g(Composer composer) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(1967008021);
        Object[] objArr = new Object[0];
        Object objM87133R = c28655q.m87133R();
        if (objM87133R == C28635l.f115821a) {
            objM87133R = new C37224h(9);
            c28655q.m87172p0(objM87133R);
        }
        C39031d c39031d = (C39031d) m124458d(objArr, C39031d.f167996E, (InterfaceC4339a) objM87133R, c28655q, 384);
        c39031d.f167999y = (InterfaceC39033f) c28655q.m87161k(AbstractC39035h.f168004a);
        c28655q.m87173q(false);
        return c39031d;
    }
}
