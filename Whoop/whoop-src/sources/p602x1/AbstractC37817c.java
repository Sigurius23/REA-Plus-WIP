package p602x1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.InterfaceC23459e;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22681m0;

/* JADX INFO: renamed from: x1.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC37817c {

    /* JADX INFO: renamed from: a */
    public static final Object f161960a = new Object();

    /* JADX INFO: renamed from: b */
    public static final StackTraceElement[] f161961b = new StackTraceElement[0];

    /* JADX INFO: renamed from: c */
    public static final C37823i f161962c = new C37823i(0, new long[0], new Object[0]);

    /* JADX INFO: renamed from: a */
    public static final int m121340a(int i13, int i14) {
        return i13 << (((i14 % 10) * 3) + 1);
    }

    /* JADX INFO: renamed from: b */
    public static final C37816b m121341b(int i13, Composer composer, InterfaceC23459e interfaceC23459e) {
        C37816b c37816b;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87144b0(Integer.rotateLeft(i13, 1), f161960a);
        Object objM87133R = c28655q.m87133R();
        if (objM87133R == C28635l.f115821a) {
            c37816b = new C37816b(interfaceC23459e, true, i13);
            c28655q.m87172p0(c37816b);
        } else {
            AbstractC22676k.m65748h(objM87133R, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            c37816b = (C37816b) objM87133R;
            c37816b.m121339k(interfaceC23459e);
        }
        c28655q.m87173q(false);
        return c37816b;
    }

    /* JADX INFO: renamed from: c */
    public static final long m121342c() {
        return Thread.currentThread().getId();
    }

    /* JADX INFO: renamed from: d */
    public static final void m121343d(C28655q c28655q, InterfaceC4351m interfaceC4351m) {
        AbstractC22676k.m65748h(interfaceC4351m, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        AbstractC22681m0.m65774e(2, interfaceC4351m);
        interfaceC4351m.invoke(c28655q, 1);
    }

    /* JADX INFO: renamed from: e */
    public static final C37816b m121344e(int i13, Composer composer, InterfaceC23459e interfaceC23459e) {
        C28655q c28655q = (C28655q) composer;
        Object objM87133R = c28655q.m87133R();
        if (objM87133R == C28635l.f115821a) {
            objM87133R = new C37816b(interfaceC23459e, true, i13);
            c28655q.m87172p0(objM87133R);
        }
        C37816b c37816b = (C37816b) objM87133R;
        c37816b.m121339k(interfaceC23459e);
        return c37816b;
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m121345f(C28677v1 c28677v1, C28677v1 c28677v2) {
        if (c28677v1 == null) {
            return true;
        }
        if (c28677v1 instanceof C28677v1) {
            return !c28677v1.m87201b() || c28677v1.equals(c28677v2) || AbstractC22676k.m65745e(c28677v1.f115981c, c28677v2.f115981c);
        }
        return false;
    }
}
