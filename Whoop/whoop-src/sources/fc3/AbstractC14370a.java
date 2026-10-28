package fc3;

import dc3.EnumC11916a;
import java.util.Arrays;
import l83.C23454a0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: fc3.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14370a {

    /* JADX INFO: renamed from: w */
    public AbstractC14372c[] f52472w;

    /* JADX INFO: renamed from: x */
    public int f52473x;

    /* JADX INFO: renamed from: y */
    public int f52474y;

    /* JADX INFO: renamed from: z */
    public C14394y f52475z;

    /* JADX INFO: renamed from: c */
    public final AbstractC14372c m41035c() {
        AbstractC14372c abstractC14372cMo36567e;
        C14394y c14394y;
        synchronized (this) {
            try {
                AbstractC14372c[] abstractC14372cArrMo36568f = this.f52472w;
                if (abstractC14372cArrMo36568f == null) {
                    abstractC14372cArrMo36568f = mo36568f();
                    this.f52472w = abstractC14372cArrMo36568f;
                } else if (this.f52473x >= abstractC14372cArrMo36568f.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(abstractC14372cArrMo36568f, abstractC14372cArrMo36568f.length * 2);
                    AbstractC22676k.m65749i(objArrCopyOf, "copyOf(...)");
                    this.f52472w = (AbstractC14372c[]) objArrCopyOf;
                    abstractC14372cArrMo36568f = (AbstractC14372c[]) objArrCopyOf;
                }
                int i13 = this.f52474y;
                do {
                    abstractC14372cMo36567e = abstractC14372cArrMo36568f[i13];
                    if (abstractC14372cMo36567e == null) {
                        abstractC14372cMo36567e = mo36567e();
                        abstractC14372cArrMo36568f[i13] = abstractC14372cMo36567e;
                    }
                    i13++;
                    if (i13 >= abstractC14372cArrMo36568f.length) {
                        i13 = 0;
                    }
                } while (!abstractC14372cMo36567e.mo36572a(this));
                this.f52474y = i13;
                this.f52473x++;
                c14394y = this.f52475z;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (c14394y != null) {
            c14394y.m41043v(1);
        }
        return abstractC14372cMo36567e;
    }

    /* JADX INFO: renamed from: e */
    public abstract AbstractC14372c mo36567e();

    /* JADX INFO: renamed from: f */
    public abstract AbstractC14372c[] mo36568f();

    /* JADX INFO: renamed from: g */
    public final void m41036g(AbstractC14372c abstractC14372c) {
        C14394y c14394y;
        int i13;
        InterfaceC30057d[] interfaceC30057dArrMo36573b;
        synchronized (this) {
            try {
                int i14 = this.f52473x - 1;
                this.f52473x = i14;
                c14394y = this.f52475z;
                if (i14 == 0) {
                    this.f52474y = 0;
                }
                AbstractC22676k.m65748h(abstractC14372c, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                interfaceC30057dArrMo36573b = abstractC14372c.mo36573b(this);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        for (InterfaceC30057d interfaceC30057d : interfaceC30057dArrMo36573b) {
            if (interfaceC30057d != null) {
                interfaceC30057d.resumeWith(C23454a0.f92919a);
            }
        }
        if (c14394y != null) {
            c14394y.m41043v(-1);
        }
    }

    /* JADX INFO: renamed from: h */
    public final C14394y m41037h() {
        C14394y c14394y;
        synchronized (this) {
            c14394y = this.f52475z;
            if (c14394y == null) {
                int i13 = this.f52473x;
                c14394y = new C14394y(1, Integer.MAX_VALUE, EnumC11916a.f38983x);
                c14394y.mo36564a(Integer.valueOf(i13));
                this.f52475z = c14394y;
            }
        }
        return c14394y;
    }
}
