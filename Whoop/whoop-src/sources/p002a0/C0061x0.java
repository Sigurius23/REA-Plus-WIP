package p002a0;

import c93.InterfaceC4351m;
import l83.C23454a0;
import q83.InterfaceC30057d;
import s83.AbstractC32274h;
import xb3.C38175j;

/* JADX INFO: renamed from: a0.x0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0061x0 extends AbstractC32274h implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public int f183E;

    /* JADX INFO: renamed from: F */
    public int f184F;

    /* JADX INFO: renamed from: G */
    public int f185G;

    /* JADX INFO: renamed from: H */
    public int f186H;

    /* JADX INFO: renamed from: I */
    public long f187I;

    /* JADX INFO: renamed from: J */
    public int f188J;

    /* JADX INFO: renamed from: K */
    public /* synthetic */ Object f189K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ C0063y0 f190L;

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ C0053t0 f191M;

    /* JADX INFO: renamed from: x */
    public C0053t0 f192x;

    /* JADX INFO: renamed from: y */
    public C0063y0 f193y;

    /* JADX INFO: renamed from: z */
    public long[] f194z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0061x0(C0063y0 c0063y0, C0053t0 c0053t0, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f190L = c0063y0;
        this.f191M = c0053t0;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        C0061x0 c0061x0 = new C0061x0(this.f190L, this.f191M, interfaceC30057d);
        c0061x0.f189K = obj;
        return c0061x0;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C0061x0) create((C38175j) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0054  */
    /* JADX WARN: Code duplicated, block: B:20:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x009c  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0052 -> B:22:0x00a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0054 -> B:14:0x0067). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0070 -> B:19:0x0097). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // s83.AbstractC32267a
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f188J
            r3 = 0
            r4 = 8
            r5 = 1
            if (r2 == 0) goto L2f
            if (r2 != r5) goto L27
            int r2 = r0.f186H
            int r6 = r0.f185G
            long r7 = r0.f187I
            int r9 = r0.f184F
            int r10 = r0.f183E
            long[] r11 = r0.f194z
            a0.y0 r12 = r0.f193y
            a0.t0 r13 = r0.f192x
            java.lang.Object r14 = r0.f189K
            xb3.j r14 = (xb3.C38175j) r14
            p505ts.AbstractC34132o.m107864I(r22)
            goto L97
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2f:
            p505ts.AbstractC34132o.m107864I(r22)
            java.lang.Object r2 = r0.f189K
            xb3.j r2 = (xb3.C38175j) r2
            a0.y0 r6 = r0.f190L
            a0.w0 r7 = r6.f200x
            long[] r7 = r7.f177a
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto La7
            a0.t0 r9 = r0.f191M
            r10 = r3
        L44:
            r11 = r7[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto La2
            int r13 = r10 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            int r13 = 8 - r13
            r14 = r2
            r2 = r3
            r19 = r11
            r12 = r6
            r11 = r7
            r6 = r13
            r13 = r9
            r9 = r10
            r10 = r8
            r7 = r19
        L67:
            if (r2 >= r6) goto L9a
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r7
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L97
            int r3 = r9 << 3
            int r3 = r3 + r2
            r13.f163x = r3
            a0.w0 r4 = r12.f200x
            java.lang.Object[] r4 = r4.f178b
            r3 = r4[r3]
            r0.f189K = r14
            r0.f192x = r13
            r0.f193y = r12
            r0.f194z = r11
            r0.f183E = r10
            r0.f184F = r9
            r0.f187I = r7
            r0.f185G = r6
            r0.f186H = r2
            r0.f188J = r5
            r14.m122271b(r3, r0)
            r83.a r2 = r83.EnumC31071a.f128113w
            return r1
        L97:
            long r7 = r7 >> r4
            int r2 = r2 + r5
            goto L67
        L9a:
            if (r6 != r4) goto La7
            r8 = r10
            r7 = r11
            r6 = r12
            r2 = r14
            r10 = r9
            r9 = r13
        La2:
            if (r10 == r8) goto La7
            int r10 = r10 + 1
            goto L44
        La7:
            l83.a0 r1 = l83.C23454a0.f92919a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p002a0.C0061x0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
