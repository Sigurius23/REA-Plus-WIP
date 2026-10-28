package o23;

import d33.C11636x;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: o23.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C27473c {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C27473c f110682a = new C27473c();

    /* JADX INFO: renamed from: b */
    public static Object m82901b(Function1 function1, InterfaceC30057d interfaceC30057d) {
        return f110682a.m82902a(new C11636x(2, 7, null), function1, interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0080  */
    /* JADX WARN: Code duplicated, block: B:42:0x0090  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ad, code lost:
    
        if (r10 == r1) goto L45;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m82902a(c93.InterfaceC4351m r8, p715kotlin.jvm.functions.Function1 r9, q83.InterfaceC30057d r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof o23.C27472b
            if (r0 == 0) goto L13
            r0 = r10
            o23.b r0 = (o23.C27472b) r0
            int r1 = r0.f110677F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f110677F = r1
            goto L18
        L13:
            o23.b r0 = new o23.b
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f110681z
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f110677F
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4f
            if (r2 == r5) goto L42
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            p505ts.AbstractC34132o.m107864I(r10)
            goto Lb0
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            java.lang.Object r8 = r0.f110680y
            c93.m r9 = r0.f110679x
            o23.c r2 = r0.f110678w
            p505ts.AbstractC34132o.m107864I(r10)     // Catch: java.lang.Throwable -> L40
            goto L74
        L40:
            r8 = move-exception
            goto L7c
        L42:
            c93.m r8 = r0.f110679x
            o23.c r2 = r0.f110678w
            p505ts.AbstractC34132o.m107864I(r10)     // Catch: java.lang.Throwable -> L4a
            goto L60
        L4a:
            r9 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
            goto L7c
        L4f:
            p505ts.AbstractC34132o.m107864I(r10)
            r0.f110678w = r7     // Catch: java.lang.Throwable -> L77
            r0.f110679x = r8     // Catch: java.lang.Throwable -> L77
            r0.f110677F = r5     // Catch: java.lang.Throwable -> L77
            java.lang.Object r10 = r9.invoke(r0)     // Catch: java.lang.Throwable -> L77
            if (r10 != r1) goto L5f
            goto Laf
        L5f:
            r2 = r7
        L60:
            r9 = r10
            n23.h r9 = (n23.AbstractC26205h) r9     // Catch: java.lang.Throwable -> L4a
            r0.f110678w = r2     // Catch: java.lang.Throwable -> L4a
            r0.f110679x = r8     // Catch: java.lang.Throwable -> L4a
            r0.f110680y = r10     // Catch: java.lang.Throwable -> L4a
            r0.f110677F = r4     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r9 = bc3.AbstractC3006f0.m8706L(r0)     // Catch: java.lang.Throwable -> L4a
            if (r9 != r1) goto L72
            goto Laf
        L72:
            r9 = r8
            r8 = r10
        L74:
            n23.h r8 = (n23.AbstractC26205h) r8     // Catch: java.lang.Throwable -> L40
            return r8
        L77:
            r9 = move-exception
            r2 = r9
            r9 = r8
            r8 = r2
            r2 = r7
        L7c:
            boolean r10 = r8 instanceof java.util.concurrent.CancellationException
            if (r10 == 0) goto L90
            r2.getClass()
            n23.f r8 = new n23.f
            n23.a r10 = new n23.a
            java.lang.String r2 = "The call was canceled before complete its execution."
            r10.<init>(r2)
            r8.<init>(r10)
            goto La0
        L90:
            r2.getClass()
            n23.f r10 = new n23.f
            n23.d r2 = new n23.d
            java.lang.String r4 = ""
            r2.<init>(r4, r8)
            r10.<init>(r2)
            r8 = r10
        La0:
            r10 = 0
            r0.f110678w = r10
            r0.f110679x = r10
            r0.f110680y = r10
            r0.f110677F = r3
            java.lang.Object r10 = r9.invoke(r8, r0)
            if (r10 != r1) goto Lb0
        Laf:
            return r1
        Lb0:
            n23.h r10 = (n23.AbstractC26205h) r10
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o23.C27473c.m82902a(c93.m, kotlin.jvm.functions.Function1, q83.d):java.lang.Object");
    }
}
