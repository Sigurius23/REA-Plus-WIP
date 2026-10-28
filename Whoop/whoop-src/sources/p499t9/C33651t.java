package p499t9;

import p548v9.C35802b;
import p548v9.C35805e;
import p607x8.AbstractC38065t;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: t9.t */
/* JADX INFO: loaded from: classes5.dex */
public class C33651t implements InterfaceC33627e0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f140437a;

    /* JADX INFO: renamed from: b */
    public final long f140438b;

    /* JADX INFO: renamed from: c */
    public final Object f140439c;

    public /* synthetic */ C33651t(Object obj, long j7, int i13) {
        this.f140437a = i13;
        this.f140439c = obj;
        this.f140438b = j7;
    }

    @Override // p499t9.InterfaceC33627e0
    /* JADX INFO: renamed from: c */
    public final C33625d0 mo8456c(long j7) {
        switch (this.f140437a) {
            case 0:
                C33653v c33653v = (C33653v) this.f140439c;
                AbstractC35849g.m113808j((C33652u) c33653v.f140454l);
                C33652u c33652u = (C33652u) c33653v.f140454l;
                long[] jArr = (long[]) c33652u.f140441w;
                long[] jArr2 = (long[]) c33652u.f140442x;
                int iM121911d = AbstractC38065t.m121911d(jArr, AbstractC38065t.m121915h((((long) c33653v.f140448f) * j7) / 1000000, 0L, c33653v.f140453k - 1), false);
                long j13 = iM121911d == -1 ? 0L : jArr[iM121911d];
                long j14 = iM121911d != -1 ? jArr2[iM121911d] : 0L;
                int i13 = c33653v.f140448f;
                long j15 = (j13 * 1000000) / ((long) i13);
                long j16 = this.f140438b;
                C33629f0 c33629f0 = new C33629f0(j15, j14 + j16);
                if (j15 == j7 || iM121911d == jArr.length - 1) {
                    return new C33625d0(c33629f0, c33629f0);
                }
                int i14 = iM121911d + 1;
                return new C33625d0(c33629f0, new C33629f0((jArr[i14] * 1000000) / ((long) i13), j16 + jArr2[i14]));
            case 1:
                return (C33625d0) this.f140439c;
            default:
                C35802b c35802b = (C35802b) this.f140439c;
                C33625d0 c33625d0M113525b = c35802b.f152293i[0].m113525b(j7);
                int i15 = 1;
                while (true) {
                    C35805e[] c35805eArr = c35802b.f152293i;
                    if (i15 >= c35805eArr.length) {
                        return c33625d0M113525b;
                    }
                    C33625d0 c33625d0M113525b2 = c35805eArr[i15].m113525b(j7);
                    if (c33625d0M113525b2.f140364a.f140372b < c33625d0M113525b.f140364a.f140372b) {
                        c33625d0M113525b = c33625d0M113525b2;
                    }
                    i15++;
                }
                break;
        }
    }

    @Override // p499t9.InterfaceC33627e0
    /* JADX INFO: renamed from: e */
    public final boolean mo8509e() {
        switch (this.f140437a) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }

    @Override // p499t9.InterfaceC33627e0
    /* JADX INFO: renamed from: f */
    public final long mo8510f() {
        switch (this.f140437a) {
            case 0:
                return ((C33653v) this.f140439c).m106292c();
            case 1:
                return this.f140438b;
            default:
                return this.f140438b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C33651t(long j7) {
        this(j7, 0L);
        this.f140437a = 1;
    }

    public C33651t(long j7, long j13) {
        this.f140437a = 1;
        this.f140438b = j7;
        C33629f0 c33629f0 = j13 == 0 ? C33629f0.f140370c : new C33629f0(0L, j13);
        this.f140439c = new C33625d0(c33629f0, c33629f0);
    }
}
