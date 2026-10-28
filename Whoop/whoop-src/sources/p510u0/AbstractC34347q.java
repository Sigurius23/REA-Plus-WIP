package p510u0;

import aa3.C0627i1;
import android.os.Trace;
import androidx.compose.runtime.Composer;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import m83.C25271y;
import p027b3.AbstractC2453v1;
import p249jc.AbstractC21598x;
import p294l3.C23254g;
import p294l3.C23285v0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p392p3.InterfaceC28770h;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p668z1.AbstractC39957f;
import p668z1.AbstractC39963l;
import p668z1.C39949b;
import p715kotlin.jvm.internal.AbstractC22676k;
import s52.C32223d;

/* JADX INFO: renamed from: u0.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC34347q {

    /* JADX INFO: renamed from: a */
    public static final C28674u2 f144285a = new C28674u2(new C32223d(25));

    /* JADX INFO: renamed from: b */
    public static Boolean f144286b;

    /* JADX WARN: Code duplicated, block: B:10:0x0040 A[Catch: RejectedExecutionException -> 0x0090, TryCatch #0 {RejectedExecutionException -> 0x0090, blocks: (B:8:0x003a, B:14:0x0047, B:16:0x005c, B:22:0x0068, B:24:0x007a, B:27:0x008b, B:26:0x007e, B:18:0x0062, B:10:0x0040), top: B:33:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:12:0x0044  */
    /* JADX WARN: Code duplicated, block: B:13:0x0046  */
    /* JADX WARN: Code duplicated, block: B:26:0x007e A[Catch: RejectedExecutionException -> 0x0090, TryCatch #0 {RejectedExecutionException -> 0x0090, blocks: (B:8:0x003a, B:14:0x0047, B:16:0x005c, B:22:0x0068, B:24:0x007a, B:27:0x008b, B:26:0x007e, B:18:0x0062, B:10:0x0040), top: B:33:0x003a }] */
    /* JADX INFO: renamed from: a */
    public static final void m108653a(final C23254g c23254g, final C23285v0 c23285v0, final InterfaceC28770h interfaceC28770h, final List list, Composer composer, int i13) {
        boolean z4;
        boolean zM87153g;
        Object objM87133R;
        C28655q c28655q = (C28655q) composer;
        Executor executor = (Executor) c28655q.m87161k(f144285a);
        if (executor == null || !m108654b(c23254g.f92135x.length())) {
            c28655q.m87150e0(-517807721);
            c28655q.m87173q(false);
            return;
        }
        c28655q.m87150e0(-518708178);
        final EnumC39181m enumC39181m = (EnumC39181m) c28655q.m87161k(AbstractC2453v1.f9575n);
        final InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
        boolean z13 = true;
        if (((i13 & 112) ^ 48) > 32) {
            try {
                if (c28655q.m87153g(c23285v0)) {
                    z4 = true;
                } else if ((i13 & 48) == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean zM87149e = z4 | c28655q.m87149e(enumC39181m.ordinal()) | c28655q.m87157i(list);
                if ((((i13 & 14) ^ 6) > 4 || !c28655q.m87153g(c23254g)) && (i13 & 6) != 4) {
                }
                zM87153g = zM87149e | z13 | c28655q.m87153g(interfaceC39171c) | c28655q.m87157i(interfaceC28770h);
                objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == C28635l.f115821a) {
                    Runnable runnable = new Runnable() { // from class: u0.p
                        @Override // java.lang.Runnable
                        public final void run() {
                            C39949b c39949bMo128121C;
                            C23285v0 c23285v1 = c23285v0;
                            EnumC39181m enumC39181m2 = enumC39181m;
                            C23254g c23254g2 = c23254g;
                            InterfaceC39171c interfaceC39171c2 = interfaceC39171c;
                            InterfaceC28770h interfaceC28770h2 = interfaceC28770h;
                            Trace.beginSection("BackgroundTextMeasurement");
                            try {
                                AbstractC39957f abstractC39957fM128171k = AbstractC39963l.m128171k();
                                C39949b c39949b = abstractC39957fM128171k instanceof C39949b ? (C39949b) abstractC39957fM128171k : null;
                                if (c39949b == null || (c39949bMo128121C = c39949b.mo128121C(null, null)) == null) {
                                    throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                                }
                                try {
                                    AbstractC39957f abstractC39957fM128153j = c39949bMo128121C.m128153j();
                                    try {
                                        C23285v0 c23285v0M60695p0 = AbstractC21598x.m60695p0(c23285v1, enumC39181m2);
                                        List list2 = list;
                                        if (list2 == null) {
                                            list2 = C25271y.f99162w;
                                        }
                                        new C0627i1(c23254g2, c23285v0M60695p0, list2, interfaceC39171c2, interfaceC28770h2).mo1619c();
                                        AbstractC39957f.m128151q(abstractC39957fM128153j);
                                        c39949bMo128121C.mo128127w().mo128155d();
                                        c39949bMo128121C.mo128122c();
                                        Trace.endSection();
                                    } catch (Throwable th3) {
                                        AbstractC39957f.m128151q(abstractC39957fM128153j);
                                        throw th3;
                                    }
                                } catch (Throwable th4) {
                                    try {
                                        throw th4;
                                    } catch (Throwable th5) {
                                        c39949bMo128121C.mo128122c();
                                        throw th5;
                                    }
                                }
                            } catch (Throwable th6) {
                                Trace.endSection();
                                throw th6;
                            }
                        }
                    };
                    c28655q.m87172p0(runnable);
                    objM87133R = runnable;
                }
                executor.execute((Runnable) objM87133R);
            } catch (RejectedExecutionException unused) {
            }
        } else {
            if ((i13 & 48) == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean zM87149e2 = z4 | c28655q.m87149e(enumC39181m.ordinal()) | c28655q.m87157i(list);
            z13 = ((i13 & 14) ^ 6) > 4 ? false : false;
            zM87153g = zM87149e2 | z13 | c28655q.m87153g(interfaceC39171c) | c28655q.m87157i(interfaceC28770h);
            objM87133R = c28655q.m87133R();
            if (zM87153g) {
                Runnable runnable2 = new Runnable() { // from class: u0.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        C39949b c39949bMo128121C;
                        C23285v0 c23285v1 = c23285v0;
                        EnumC39181m enumC39181m2 = enumC39181m;
                        C23254g c23254g2 = c23254g;
                        InterfaceC39171c interfaceC39171c2 = interfaceC39171c;
                        InterfaceC28770h interfaceC28770h2 = interfaceC28770h;
                        Trace.beginSection("BackgroundTextMeasurement");
                        try {
                            AbstractC39957f abstractC39957fM128171k = AbstractC39963l.m128171k();
                            C39949b c39949b = abstractC39957fM128171k instanceof C39949b ? (C39949b) abstractC39957fM128171k : null;
                            if (c39949b == null || (c39949bMo128121C = c39949b.mo128121C(null, null)) == null) {
                                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                            }
                            try {
                                AbstractC39957f abstractC39957fM128153j = c39949bMo128121C.m128153j();
                                try {
                                    C23285v0 c23285v0M60695p0 = AbstractC21598x.m60695p0(c23285v1, enumC39181m2);
                                    List list2 = list;
                                    if (list2 == null) {
                                        list2 = C25271y.f99162w;
                                    }
                                    new C0627i1(c23254g2, c23285v0M60695p0, list2, interfaceC39171c2, interfaceC28770h2).mo1619c();
                                    AbstractC39957f.m128151q(abstractC39957fM128153j);
                                    c39949bMo128121C.mo128127w().mo128155d();
                                    c39949bMo128121C.mo128122c();
                                    Trace.endSection();
                                } catch (Throwable th3) {
                                    AbstractC39957f.m128151q(abstractC39957fM128153j);
                                    throw th3;
                                }
                            } catch (Throwable th4) {
                                try {
                                    throw th4;
                                } catch (Throwable th5) {
                                    c39949bMo128121C.mo128122c();
                                    throw th5;
                                }
                            }
                        } catch (Throwable th6) {
                            Trace.endSection();
                            throw th6;
                        }
                    }
                };
                c28655q.m87172p0(runnable2);
                objM87133R = runnable2;
            } else {
                Runnable runnable3 = new Runnable() { // from class: u0.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        C39949b c39949bMo128121C;
                        C23285v0 c23285v1 = c23285v0;
                        EnumC39181m enumC39181m2 = enumC39181m;
                        C23254g c23254g2 = c23254g;
                        InterfaceC39171c interfaceC39171c2 = interfaceC39171c;
                        InterfaceC28770h interfaceC28770h2 = interfaceC28770h;
                        Trace.beginSection("BackgroundTextMeasurement");
                        try {
                            AbstractC39957f abstractC39957fM128171k = AbstractC39963l.m128171k();
                            C39949b c39949b = abstractC39957fM128171k instanceof C39949b ? (C39949b) abstractC39957fM128171k : null;
                            if (c39949b == null || (c39949bMo128121C = c39949b.mo128121C(null, null)) == null) {
                                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                            }
                            try {
                                AbstractC39957f abstractC39957fM128153j = c39949bMo128121C.m128153j();
                                try {
                                    C23285v0 c23285v0M60695p0 = AbstractC21598x.m60695p0(c23285v1, enumC39181m2);
                                    List list2 = list;
                                    if (list2 == null) {
                                        list2 = C25271y.f99162w;
                                    }
                                    new C0627i1(c23254g2, c23285v0M60695p0, list2, interfaceC39171c2, interfaceC28770h2).mo1619c();
                                    AbstractC39957f.m128151q(abstractC39957fM128153j);
                                    c39949bMo128121C.mo128127w().mo128155d();
                                    c39949bMo128121C.mo128122c();
                                    Trace.endSection();
                                } catch (Throwable th3) {
                                    AbstractC39957f.m128151q(abstractC39957fM128153j);
                                    throw th3;
                                }
                            } catch (Throwable th4) {
                                try {
                                    throw th4;
                                } catch (Throwable th5) {
                                    c39949bMo128121C.mo128122c();
                                    throw th5;
                                }
                            }
                        } catch (Throwable th6) {
                            Trace.endSection();
                            throw th6;
                        }
                    }
                };
                c28655q.m87172p0(runnable3);
                objM87133R = runnable3;
            }
            executor.execute((Runnable) objM87133R);
        }
        c28655q.m87173q(false);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m108654b(int i13) {
        if (i13 >= 8 && i13 < 1000) {
            if (f144286b == null) {
                f144286b = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
            }
            Boolean bool = f144286b;
            AbstractC22676k.m65747g(bool);
            if (bool.booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
