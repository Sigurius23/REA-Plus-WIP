package p492t2;

import bc3.InterfaceC2994c0;
import p005a3.AbstractC0201g;
import p005a3.C0222l0;
import p505ts.AbstractC34132o;
import p636y3.C39185q;
import p715kotlin.jvm.internal.AbstractC22680m;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: t2.d */
/* JADX INFO: loaded from: classes.dex */
public final class C33316d {

    /* JADX INFO: renamed from: a */
    public C33319g f138977a;

    /* JADX INFO: renamed from: b */
    public C33319g f138978b;

    /* JADX INFO: renamed from: c */
    public AbstractC22680m f138979c = new C0222l0(this, 19);

    /* JADX INFO: renamed from: d */
    public InterfaceC2994c0 f138980d;

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        if (r14 == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0082, code lost:
    
        if (r14 == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0084, code lost:
    
        return r0;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m105690a(long r10, long r12, s83.AbstractC32269c r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof p492t2.C33314b
            if (r0 == 0) goto L14
            r0 = r14
            t2.b r0 = (p492t2.C33314b) r0
            int r1 = r0.f138973y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f138973y = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            t2.b r0 = new t2.b
            r0.<init>(r9, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.f138971w
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r6.f138973y
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L38
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            p505ts.AbstractC34132o.m107864I(r14)
            goto L85
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L34:
            p505ts.AbstractC34132o.m107864I(r14)
            goto L5f
        L38:
            p505ts.AbstractC34132o.m107864I(r14)
            t2.g r14 = r9.f138977a
            r1 = 0
            if (r14 == 0) goto L4b
            boolean r4 = r14.f9141N
            if (r4 == 0) goto L4b
            a3.p2 r14 = p005a3.AbstractC0201g.m507g(r14)
            t2.g r14 = (p492t2.C33319g) r14
            goto L4c
        L4b:
            r14 = r1
        L4c:
            r4 = 0
            if (r14 != 0) goto L66
            t2.g r1 = r9.f138978b
            if (r1 == 0) goto L8d
            r6.f138973y = r3
            r2 = r10
            r4 = r12
            java.lang.Object r14 = r1.mo9762V(r2, r4, r6)
            if (r14 != r0) goto L5f
            goto L84
        L5f:
            y3.q r14 = (p636y3.C39185q) r14
            long r4 = r14.m124819j()
            goto L8d
        L66:
            r7 = r12
            r12 = r2
            r2 = r10
            r10 = r4
            r4 = r7
            t2.g r13 = r9.f138977a
            if (r13 == 0) goto L7a
            boolean r14 = r13.f9141N
            if (r14 == 0) goto L7a
            a3.p2 r13 = p005a3.AbstractC0201g.m507g(r13)
            r1 = r13
            t2.g r1 = (p492t2.C33319g) r1
        L7a:
            if (r1 == 0) goto L8c
            r6.f138973y = r12
            java.lang.Object r14 = r1.mo9762V(r2, r4, r6)
            if (r14 != r0) goto L85
        L84:
            return r0
        L85:
            y3.q r14 = (p636y3.C39185q) r14
            long r4 = r14.m124819j()
            goto L8d
        L8c:
            r4 = r10
        L8d:
            y3.q r10 = p636y3.C39185q.m124810a(r4)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p492t2.C33316d.m105690a(long, long, s83.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m105691b(long j7, AbstractC32269c abstractC32269c) {
        C33315c c33315c;
        long jM124819j;
        if (abstractC32269c instanceof C33315c) {
            c33315c = (C33315c) abstractC32269c;
            int i13 = c33315c.f138976y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c33315c.f138976y = i13 - Integer.MIN_VALUE;
            } else {
                c33315c = new C33315c(this, abstractC32269c);
            }
        } else {
            c33315c = new C33315c(this, abstractC32269c);
        }
        Object objMo29342p0 = c33315c.f138974w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c33315c.f138976y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo29342p0);
            C33319g c33319g = this.f138977a;
            C33319g c33319g2 = null;
            if (c33319g != null && c33319g.f9141N) {
                c33319g2 = (C33319g) AbstractC0201g.m507g(c33319g);
            }
            if (c33319g2 != null) {
                c33315c.f138976y = 1;
                objMo29342p0 = c33319g2.mo29342p0(j7, c33315c);
                if (objMo29342p0 == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                jM124819j = 0;
            }
            return C39185q.m124810a(jM124819j);
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(objMo29342p0);
        jM124819j = ((C39185q) objMo29342p0).m124819j();
        return C39185q.m124810a(jM124819j);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c93.a, kotlin.jvm.internal.m] */
    /* JADX INFO: renamed from: c */
    public final InterfaceC2994c0 m105692c() {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f138979c.invoke();
        if (interfaceC2994c0 != null) {
            return interfaceC2994c0;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }
}
