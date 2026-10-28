package p217ib;

import java.util.Collections;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ib.a0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18302a0 extends AbstractC18313j {
    /* JADX INFO: renamed from: e */
    public static int m52694e(C18326w c18326w, int i13) {
        int i14 = c18326w.f71336a;
        int i15 = c18326w.f71337b;
        int i16 = c18326w.f71338c;
        return Math.max(0, Math.min(((((i13 - i15) + i16) - 1) / i16) * i16, (i14 / i16) * i16));
    }

    /* JADX INFO: renamed from: f */
    public static int m52695f(C18326w c18326w, int i13, int i14) {
        return Math.min(i14 - i13, c18326w.f71337b);
    }

    @Override // p217ib.AbstractC18313j
    /* JADX INFO: renamed from: b */
    public boolean mo52696b() {
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final void m52697g(boolean z4, int i13, int i14, int i15, Executor executor, AbstractC18314k abstractC18314k) {
        C18325v c18325v = new C18325v(this, z4, i15, abstractC18314k);
        mo52699i(new C18326w(i13, i14, i15), c18325v);
        C18312i c18312i = c18325v.f71333a;
        synchronized (c18312i.f71290e) {
            c18312i.f71291f = executor;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m52698h(int i13, int i14, int i15, Executor executor, AbstractC18314k abstractC18314k) {
        C18328y c18328y = new C18328y(this, i13, i14, executor, abstractC18314k);
        if (i15 == 0) {
            c18328y.mo52742a(Collections.EMPTY_LIST);
        } else {
            mo52700j(new C18329z(i14, i15), c18328y);
        }
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo52699i(C18326w c18326w, AbstractC18324u abstractC18324u);

    /* JADX INFO: renamed from: j */
    public abstract void mo52700j(C18329z c18329z, AbstractC18327x abstractC18327x);

    /* JADX INFO: renamed from: k */
    public AbstractC18307d m52701k() {
        return new C18323t(this);
    }
}
