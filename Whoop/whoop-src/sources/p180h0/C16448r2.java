package p180h0;

import p492t2.InterfaceC33313a;
import p505ts.AbstractC34132o;
import p636y3.C39185q;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: h0.r2 */
/* JADX INFO: loaded from: classes.dex */
public final class C16448r2 implements InterfaceC33313a {

    /* JADX INFO: renamed from: w */
    public final C16372c3 f63202w;

    /* JADX INFO: renamed from: x */
    public boolean f63203x;

    public C16448r2(C16372c3 c16372c3, boolean z4) {
        this.f63202w = c16372c3;
        this.f63203x = z4;
    }

    @Override // p492t2.InterfaceC33313a
    /* JADX INFO: renamed from: J */
    public final long mo9761J(long j7, long j13, int i13) {
        if (!this.f63203x) {
            return 0L;
        }
        C16372c3 c16372c3 = this.f63202w;
        if (c16372c3.f62936a.mo9765b()) {
            return 0L;
        }
        return c16372c3.m46575h(c16372c3.m46571d(c16372c3.f62936a.mo9766e(c16372c3.m46571d(c16372c3.m46574g(j13)))));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p492t2.InterfaceC33313a
    /* JADX INFO: renamed from: V */
    public final Object mo9762V(long j7, long j13, InterfaceC30057d interfaceC30057d) throws Throwable {
        C16443q2 c16443q2;
        long jM124815f;
        if (interfaceC30057d instanceof C16443q2) {
            c16443q2 = (C16443q2) interfaceC30057d;
            int i13 = c16443q2.f63184z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c16443q2.f63184z = i13 - Integer.MIN_VALUE;
            } else {
                c16443q2 = new C16443q2(this, (AbstractC32269c) interfaceC30057d);
            }
        } else {
            c16443q2 = new C16443q2(this, (AbstractC32269c) interfaceC30057d);
        }
        Object objM46568a = c16443q2.f63182x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c16443q2.f63184z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM46568a);
            jM124815f = 0;
            if (this.f63203x) {
                C16372c3 c16372c3 = this.f63202w;
                if (!c16372c3.f62944i) {
                    c16443q2.f63181w = j13;
                    c16443q2.f63184z = 1;
                    objM46568a = c16372c3.m46568a(j13, c16443q2);
                    if (objM46568a == enumC31071a) {
                        return enumC31071a;
                    }
                }
                jM124815f = C39185q.m124815f(j13, jM124815f);
            }
            return C39185q.m124810a(jM124815f);
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j13 = c16443q2.f63181w;
        AbstractC34132o.m107864I(objM46568a);
        jM124815f = ((C39185q) objM46568a).m124819j();
        jM124815f = C39185q.m124815f(j13, jM124815f);
        return C39185q.m124810a(jM124815f);
    }
}
