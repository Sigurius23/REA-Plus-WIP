package x20;

import c93.InterfaceC4351m;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: x20.x */
/* JADX INFO: loaded from: classes6.dex */
public final class C37856x extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public long f162055w;

    /* JADX INFO: renamed from: x */
    public int f162056x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f162057y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ long f162058z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37856x(long j7, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f162058z = j7;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        C37856x c37856x = new C37856x(this.f162058z, interfaceC30057d);
        c37856x.f162057y = obj;
        return c37856x;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C37856x) create((InterfaceC13062m) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0047 A[PHI: r1 r5
      0x0047: PHI (r1v3 ec3.m) = (r1v2 ec3.m), (r1v4 ec3.m), (r1v6 ec3.m) binds: [B:13:0x0044, B:21:0x0080, B:11:0x0022] A[DONT_GENERATE, DONT_INLINE]
      0x0047: PHI (r5v1 long) = (r5v0 long), (r5v3 long), (r5v4 long) binds: [B:13:0x0044, B:21:0x0080, B:11:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x0053  */
    /* JADX WARN: Code duplicated, block: B:20:0x0066 A[PHI: r1 r5
      0x0066: PHI (r1v4 ec3.m) = (r1v3 ec3.m), (r1v8 ec3.m) binds: [B:18:0x0063, B:10:0x0018] A[DONT_GENERATE, DONT_INLINE]
      0x0066: PHI (r5v2 long) = (r5v1 long), (r5v5 long) binds: [B:18:0x0063, B:10:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0080 -> B:15:0x0047). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // s83.AbstractC32267a
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r9.f162056x
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2c
            if (r1 == r4) goto L22
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            goto L22
        L10:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L18:
            long r5 = r9.f162055w
            java.lang.Object r1 = r9.f162057y
            ec3.m r1 = (ec3.InterfaceC13062m) r1
            p505ts.AbstractC34132o.m107864I(r10)
            goto L66
        L22:
            long r5 = r9.f162055w
            java.lang.Object r1 = r9.f162057y
            ec3.m r1 = (ec3.InterfaceC13062m) r1
            p505ts.AbstractC34132o.m107864I(r10)
            goto L47
        L2c:
            p505ts.AbstractC34132o.m107864I(r10)
            java.lang.Object r10 = r9.f162057y
            r1 = r10
            ec3.m r1 = (ec3.InterfaceC13062m) r1
            long r5 = r9.f162058z
            kotlin.time.Duration r10 = p715kotlin.time.Duration.m134260boximpl(r5)
            r9.f162057y = r1
            r9.f162055w = r5
            r9.f162056x = r4
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto L47
            goto L82
        L47:
            kotlin.time.Duration$Companion r10 = p715kotlin.time.Duration.INSTANCE
            long r7 = r10.m134357getZEROUwyO8pc()
            int r10 = p715kotlin.time.Duration.m134261compareToLRDsOJo(r5, r7)
            if (r10 <= 0) goto L83
            kotlin.time.DurationUnit r10 = p715kotlin.time.DurationUnit.SECONDS
            long r7 = p715kotlin.time.DurationKt.toDuration(r4, r10)
            r9.f162057y = r1
            r9.f162055w = r5
            r9.f162056x = r3
            java.lang.Object r10 = bc3.AbstractC3034m0.m8783c(r7, r9)
            if (r10 != r0) goto L66
            goto L82
        L66:
            kotlin.time.Duration$Companion r10 = p715kotlin.time.Duration.INSTANCE
            kotlin.time.DurationUnit r10 = p715kotlin.time.DurationUnit.SECONDS
            long r7 = p715kotlin.time.DurationKt.toDuration(r4, r10)
            long r5 = p715kotlin.time.Duration.m134290minusLRDsOJo(r5, r7)
            kotlin.time.Duration r10 = p715kotlin.time.Duration.m134260boximpl(r5)
            r9.f162057y = r1
            r9.f162055w = r5
            r9.f162056x = r2
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto L47
        L82:
            return r0
        L83:
            l83.a0 r10 = l83.C23454a0.f92919a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: x20.C37856x.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
