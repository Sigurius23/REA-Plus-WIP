package ec3;

import l83.C23454a0;
import p715kotlin.jvm.functions.Function3;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: ec3.d2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13029d2 extends AbstractC32275i implements Function3 {

    /* JADX INFO: renamed from: w */
    public int f45039w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ InterfaceC13062m f45040x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ int f45041y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C13033e2 f45042z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13029d2(C13033e2 c13033e2, InterfaceC30057d interfaceC30057d) {
        super(3, interfaceC30057d);
        this.f45042z = c13033e2;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        C13029d2 c13029d2 = new C13029d2(this.f45042z, (InterfaceC30057d) obj3);
        c13029d2.f45040x = (InterfaceC13062m) obj;
        c13029d2.f45041y = iIntValue;
        return c13029d2.invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0060  */
    /* JADX WARN: Code duplicated, block: B:30:0x006d A[PHI: r0
      0x006d: PHI (r0v5 ec3.m) = (r0v4 ec3.m), (r0v8 ec3.m) binds: [B:28:0x006a, B:13:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x0078 A[PHI: r0
      0x0078: PHI (r0v6 ec3.m) = (r0v4 ec3.m), (r0v5 ec3.m), (r0v9 ec3.m) binds: [B:26:0x005e, B:31:0x0075, B:12:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if (r12.emit(r0, r11) == r3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0083, code lost:
    
        if (r0.emit(r12, r11) == r3) goto L35;
     */
    @Override // s83.AbstractC32267a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            ec3.e2 r0 = r11.f45042z
            long r1 = r0.f45051b
            r83.a r3 = r83.EnumC31071a.f128113w
            int r4 = r11.f45039w
            r5 = 5
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            if (r4 == 0) goto L38
            if (r4 == r9) goto L34
            if (r4 == r8) goto L2e
            if (r4 == r7) goto L28
            if (r4 == r6) goto L22
            if (r4 != r5) goto L1a
            goto L34
        L1a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L22:
            ec3.m r0 = r11.f45040x
            p505ts.AbstractC34132o.m107864I(r12)
            goto L78
        L28:
            ec3.m r0 = r11.f45040x
            p505ts.AbstractC34132o.m107864I(r12)
            goto L6d
        L2e:
            ec3.m r0 = r11.f45040x
            p505ts.AbstractC34132o.m107864I(r12)
            goto L5a
        L34:
            p505ts.AbstractC34132o.m107864I(r12)
            goto L86
        L38:
            p505ts.AbstractC34132o.m107864I(r12)
            ec3.m r12 = r11.f45040x
            int r4 = r11.f45041y
            if (r4 <= 0) goto L4c
            ec3.y1 r0 = ec3.EnumC13102y1.f45274w
            r11.f45039w = r9
            java.lang.Object r12 = r12.emit(r0, r11)
            if (r12 != r3) goto L86
            goto L85
        L4c:
            long r9 = r0.f45050a
            r11.f45040x = r12
            r11.f45039w = r8
            java.lang.Object r0 = bc3.AbstractC3034m0.m8782b(r9, r11)
            if (r0 != r3) goto L59
            goto L85
        L59:
            r0 = r12
        L5a:
            r8 = 0
            int r12 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r12 <= 0) goto L78
            ec3.y1 r12 = ec3.EnumC13102y1.f45275x
            r11.f45040x = r0
            r11.f45039w = r7
            java.lang.Object r12 = r0.emit(r12, r11)
            if (r12 != r3) goto L6d
            goto L85
        L6d:
            r11.f45040x = r0
            r11.f45039w = r6
            java.lang.Object r12 = bc3.AbstractC3034m0.m8782b(r1, r11)
            if (r12 != r3) goto L78
            goto L85
        L78:
            ec3.y1 r12 = ec3.EnumC13102y1.f45276y
            r1 = 0
            r11.f45040x = r1
            r11.f45039w = r5
            java.lang.Object r12 = r0.emit(r12, r11)
            if (r12 != r3) goto L86
        L85:
            return r3
        L86:
            l83.a0 r12 = l83.C23454a0.f92919a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ec3.C13029d2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
