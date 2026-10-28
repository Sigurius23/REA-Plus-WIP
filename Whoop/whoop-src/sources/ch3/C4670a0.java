package ch3;

import eh3.AbstractC13209m;
import java.util.concurrent.TimeUnit;
import xg3.AbstractC38283j;
import xg3.AbstractC38284k;
import xg3.AbstractC38292s;
import xg3.InterfaceC38279f;

/* JADX INFO: renamed from: ch3.a0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4670a0 implements InterfaceC38279f {

    /* JADX INFO: renamed from: w */
    public final long f19119w;

    /* JADX INFO: renamed from: x */
    public final long f19120x;

    /* JADX INFO: renamed from: y */
    public final TimeUnit f19121y;

    /* JADX INFO: renamed from: z */
    public final AbstractC38284k f19122z;

    public C4670a0(long j7, long j13, TimeUnit timeUnit, AbstractC38284k abstractC38284k) {
        this.f19119w = j7;
        this.f19120x = j13;
        this.f19121y = timeUnit;
        this.f19122z = abstractC38284k;
    }

    @Override // bh3.InterfaceC3260g
    /* JADX INFO: renamed from: b */
    public final Object mo1678b(Object obj) {
        AbstractC38292s abstractC38292s = (AbstractC38292s) obj;
        AbstractC38283j abstractC38283jMo37108a = this.f19122z.mo37108a();
        C4700o0 c4700o0 = new C4700o0(abstractC38292s, true);
        if (this.f19119w == this.f19120x) {
            C4717x c4717x = new C4717x(this, c4700o0, abstractC38283jMo37108a);
            c4717x.m122688c(abstractC38283jMo37108a);
            abstractC38292s.m122688c(c4717x);
            AbstractC38283j abstractC38283j = (AbstractC38283j) c4717x.f19298H;
            C4715w c4715w = new C4715w(c4717x, 0);
            abstractC38283j.getClass();
            long j7 = this.f19119w;
            AbstractC13209m.m37112a(abstractC38283j, c4715w, j7, j7, this.f19121y);
            return c4717x;
        }
        C4721z c4721z = new C4721z(this, c4700o0, abstractC38283jMo37108a);
        c4721z.m122688c(abstractC38283jMo37108a);
        abstractC38292s.m122688c(c4721z);
        c4721z.m14776g();
        C4715w c4715w2 = new C4715w(c4721z, 1);
        AbstractC38283j abstractC38283j2 = c4721z.f19308F;
        abstractC38283j2.getClass();
        long j13 = this.f19120x;
        AbstractC13209m.m37112a(abstractC38283j2, c4715w2, j13, j13, this.f19121y);
        return c4721z;
    }
}
