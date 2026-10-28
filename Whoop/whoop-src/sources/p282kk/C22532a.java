package p282kk;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import dc3.C11918c;
import l83.C23454a0;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: kk.a */
/* JADX INFO: loaded from: classes.dex */
public final class C22532a extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public C11918c f88554w;

    /* JADX INFO: renamed from: x */
    public int f88555x;

    /* JADX INFO: renamed from: y */
    public int f88556y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C22533b f88557z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22532a(C22533b c22533b, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f88557z = c22533b;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        return new C22532a(this.f88557z, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C22532a) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0054  */
    /* JADX WARN: Code duplicated, block: B:24:0x0056  */
    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x0083  */
    /* JADX WARN: Code duplicated, block: B:38:0x0099  */
    /* JADX WARN: Code duplicated, block: B:40:0x009c  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x005b -> B:31:0x006c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0069 -> B:31:0x006c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x006e -> B:31:0x006c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // s83.AbstractC32267a
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            kk.b r0 = r12.f88557z
            java.util.concurrent.atomic.AtomicInteger r1 = r0.f88559b
            gj.d r2 = r0.f88558a
            r83.a r3 = r83.EnumC31071a.f128113w
            int r4 = r12.f88556y
            r5 = 0
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L2c
            if (r4 == r7) goto L25
            if (r4 != r6) goto L1d
            int r4 = r12.f88555x
            dc3.c r8 = r12.f88554w
            p505ts.AbstractC34132o.m107864I(r13)     // Catch: java.lang.Exception -> L1b
            goto L6c
        L1b:
            r13 = move-exception
            goto L6e
        L1d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L25:
            dc3.c r4 = r12.f88554w
            p505ts.AbstractC34132o.m107864I(r13)
            r8 = r4
            goto L42
        L2c:
            p505ts.AbstractC34132o.m107864I(r13)
            dc3.l r13 = r0.f88564g
            dc3.c r13 = r13.iterator()
        L35:
            r12.f88554w = r13
            r12.f88556y = r7
            java.lang.Object r4 = r13.m32187a(r12)
            if (r4 != r3) goto L40
            goto L6b
        L40:
            r8 = r13
            r13 = r4
        L42:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto Lc3
            java.lang.Object r13 = r8.m32188c()
            kk.f r13 = (p282kk.C22537f) r13
            int r4 = r13.f88577a
            if (r4 != r6) goto L56
            r4 = r7
            goto L57
        L56:
            r4 = r5
        L57:
            if (r4 != 0) goto L6c
            jk.a r13 = r13.f88578b
            if (r13 == 0) goto L6c
            ik.b r9 = r0.f88562e     // Catch: java.lang.Exception -> L1b
            r12.f88554w = r8     // Catch: java.lang.Exception -> L1b
            r12.f88555x = r4     // Catch: java.lang.Exception -> L1b
            r12.f88556y = r6     // Catch: java.lang.Exception -> L1b
            java.lang.Object r13 = r9.mo33428e(r13, r12)     // Catch: java.lang.Exception -> L1b
            if (r13 != r3) goto L6c
        L6b:
            return r3
        L6c:
            r13 = r8
            goto L76
        L6e:
            fk.a r9 = r2.f60138k
            java.lang.String r10 = "Error when writing event to pipeline"
            io.sentry.config.AbstractC20301a.m56317P(r13, r9, r10)
            goto L6c
        L76:
            gj.g r8 = r2.f60128a
            java.lang.Boolean r8 = r8.f60167p
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            boolean r8 = p715kotlin.jvm.internal.AbstractC22676k.m65745e(r8, r9)
            if (r8 == 0) goto L83
            goto L35
        L83:
            int r8 = r1.incrementAndGet()
            gj.g r9 = r2.f60128a
            int r9 = r9.f60154c
            java.util.concurrent.atomic.AtomicInteger r10 = r0.f88568k
            int r10 = r10.get()
            int r9 = r9 / r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r11 = 0
            if (r9 != 0) goto L9a
            r10 = r11
        L9a:
            if (r10 == 0) goto La1
            int r9 = r10.intValue()
            goto La2
        La1:
            r9 = r7
        La2:
            if (r8 >= r9) goto Lb7
            if (r4 == 0) goto La7
            goto Lb7
        La7:
            bc3.c0 r4 = r0.f88563f
            bc3.z r8 = r2.f60133f
            a6.c r9 = new a6.c
            r10 = 23
            r9.<init>(r0, r11, r10)
            bc3.AbstractC3006f0.m8732z(r4, r8, r11, r9, r6)
            goto L35
        Lb7:
            r1.set(r5)
            dc3.l r4 = r0.f88565h
            java.lang.String r8 = "#!upload"
            r4.mo32218s(r8)
            goto L35
        Lc3:
            l83.a0 r13 = l83.C23454a0.f92919a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p282kk.C22532a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
