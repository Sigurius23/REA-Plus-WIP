package p668z1;

import java.util.Arrays;
import java.util.HashMap;
import m83.AbstractC25260n;
import p002a0.C0059w0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: z1.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C39951c extends C39949b {

    /* JADX INFO: renamed from: o */
    public final C39949b f172421o;

    /* JADX INFO: renamed from: p */
    public boolean f172422p;

    public C39951c(long j7, C39961j c39961j, Function1 function1, Function1 function2, C39949b c39949b) {
        super(j7, c39961j, function1, function2);
        this.f172421o = c39949b;
        c39949b.mo128123k();
    }

    @Override // p668z1.C39949b, p668z1.AbstractC39957f
    /* JADX INFO: renamed from: c */
    public final void mo128122c() {
        if (this.f172444c) {
            return;
        }
        super.mo128122c();
        if (this.f172422p) {
            return;
        }
        this.f172422p = true;
        this.f172421o.mo128124l();
    }

    @Override // p668z1.C39949b
    /* JADX INFO: renamed from: w */
    public final AbstractC39968q mo128127w() throws Throwable {
        C39951c c39951c;
        C39949b c39949b = this.f172421o;
        if (c39949b.f172418m || c39949b.f172444c) {
            return new C39958g(this);
        }
        C0059w0 c0059w0 = this.f172413h;
        long j7 = this.f172443b;
        HashMap mapM128163c = c0059w0 != null ? AbstractC39963l.m128163c(c39949b.mo128147g(), this, this.f172421o.mo128146d()) : null;
        Object obj = AbstractC39963l.f172462c;
        synchronized (obj) {
            try {
                AbstractC39963l.m128164d(this);
                try {
                    if (c0059w0 == null || c0059w0.f180d == 0) {
                        c39951c = this;
                        m128152a();
                    } else {
                        c39951c = this;
                        AbstractC39968q abstractC39968qM128143z = c39951c.m128143z(this.f172421o.mo128147g(), c0059w0, mapM128163c, this.f172421o.mo128146d());
                        if (!abstractC39968qM128143z.equals(C39959h.f172447b)) {
                            return abstractC39968qM128143z;
                        }
                        C0059w0 c0059w0Mo128141x = c39951c.f172421o.mo128141x();
                        if (c0059w0Mo128141x != null) {
                            c0059w0Mo128141x.m145j(c0059w0);
                        } else {
                            c39951c.f172421o.mo128131B(c0059w0);
                            c39951c.f172413h = null;
                        }
                    }
                    if (AbstractC22676k.m65752l(c39951c.f172421o.mo128147g(), j7) < 0) {
                        c39951c.f172421o.m128140v();
                    }
                    C39949b c39949b2 = c39951c.f172421o;
                    c39949b2.mo128148r(c39949b2.mo128146d().m128157c(j7).m128156a(c39951c.f172415j));
                    c39951c.f172421o.m128130A(j7);
                    C39949b c39949b3 = c39951c.f172421o;
                    int i13 = c39951c.f172445d;
                    c39951c.f172445d = -1;
                    if (i13 >= 0) {
                        int[] iArr = c39949b3.f172416k;
                        AbstractC22676k.m65750j(iArr, "<this>");
                        int length = iArr.length;
                        int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                        iArrCopyOf[length] = i13;
                        c39949b3.f172416k = iArrCopyOf;
                    } else {
                        c39949b3.getClass();
                    }
                    C39949b c39949b4 = c39951c.f172421o;
                    C39961j c39961j = c39951c.f172415j;
                    c39949b4.getClass();
                    synchronized (obj) {
                        c39949b4.f172415j = c39949b4.f172415j.m128159e(c39961j);
                        C39949b c39949b5 = c39951c.f172421o;
                        int[] iArrM74031G0 = c39951c.f172416k;
                        c39949b5.getClass();
                        if (iArrM74031G0.length != 0) {
                            int[] iArr2 = c39949b5.f172416k;
                            if (iArr2.length != 0) {
                                iArrM74031G0 = AbstractC25260n.m74031G0(iArr2, iArrM74031G0);
                            }
                            c39949b5.f172416k = iArrM74031G0;
                        }
                    }
                    c39951c.f172418m = true;
                    if (!c39951c.f172422p) {
                        c39951c.f172422p = true;
                        c39951c.f172421o.mo128124l();
                    }
                    return C39959h.f172447b;
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }
}
