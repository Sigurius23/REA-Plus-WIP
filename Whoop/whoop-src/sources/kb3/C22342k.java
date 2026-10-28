package kb3;

import androidx.lifecycle.C1591h2;
import bd3.C3130k;
import c93.InterfaceC4339a;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import p037bu.C3632c;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.functions.Function1;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: kb3.k */
/* JADX INFO: loaded from: classes5.dex */
public class C22342k implements InterfaceC22345n {

    /* JADX INFO: renamed from: d */
    public static final String f87182d = AbstractC39414r.m125865K0(C22342k.class.getCanonicalName(), ".", "");

    /* JADX INFO: renamed from: e */
    public static final C22333b f87183e = new C22333b("NO_LOCKS", C22332a.f87168w);

    /* JADX INFO: renamed from: a */
    public final InterfaceC22344m f87184a;

    /* JADX INFO: renamed from: b */
    public final C22332a f87185b;

    /* JADX INFO: renamed from: c */
    public final String f87186c;

    public C22342k(String str) {
        this(str, new C3632c(new ReentrantLock()));
    }

    /* JADX INFO: renamed from: e */
    public static void m64221e(AssertionError assertionError) {
        StackTraceElement[] stackTrace = assertionError.getStackTrace();
        int length = stackTrace.length;
        int i13 = 0;
        while (i13 < length) {
            if (!stackTrace[i13].getClassName().startsWith(f87182d)) {
                List listSubList = Arrays.asList(stackTrace).subList(i13, length);
                assertionError.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
            }
            i13++;
        }
        i13 = -1;
        List listSubList2 = Arrays.asList(stackTrace).subList(i13, length);
        assertionError.setStackTrace((StackTraceElement[]) listSubList2.toArray(new StackTraceElement[listSubList2.size()]));
    }

    /* JADX INFO: renamed from: a */
    public final C22340i m64222a(InterfaceC4339a interfaceC4339a) {
        return new C22340i(this, interfaceC4339a);
    }

    /* JADX INFO: renamed from: b */
    public final C22336e m64223b(Function1 function1) {
        return new C22336e(this, new ConcurrentHashMap(3, 1.0f, 2), function1, 1);
    }

    /* JADX INFO: renamed from: c */
    public final C1591h2 m64224c(Function1 function1) {
        return new C1591h2(this, new ConcurrentHashMap(3, 1.0f, 2), function1, 1);
    }

    /* JADX INFO: renamed from: d */
    public C3130k mo64214d(Object obj, String str) {
        StringBuilder sb4 = new StringBuilder("Recursion detected ");
        sb4.append(str);
        sb4.append(obj == null ? "" : AbstractC25012a.m73375h(obj, "on input: "));
        sb4.append(" under ");
        sb4.append(this);
        AssertionError assertionError = new AssertionError(sb4.toString());
        m64221e(assertionError);
        throw assertionError;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        sb4.append(getClass().getSimpleName());
        sb4.append("@");
        sb4.append(Integer.toHexString(hashCode()));
        sb4.append(" (");
        return AbstractC25012a.m73376i(this.f87186c, ")", sb4);
    }

    public C22342k(String str, InterfaceC22344m interfaceC22344m) {
        C22332a c22332a = C22332a.f87169x;
        this.f87184a = interfaceC22344m;
        this.f87185b = c22332a;
        this.f87186c = str;
    }
}
