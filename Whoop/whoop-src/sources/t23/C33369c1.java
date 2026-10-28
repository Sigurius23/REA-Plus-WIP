package t23;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: t23.c1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C33369c1 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C33381e1 f139313E;

    /* JADX INFO: renamed from: w */
    public int f139314w;

    /* JADX INFO: renamed from: x */
    public int f139315x;

    /* JADX INFO: renamed from: y */
    public C33381e1 f139316y;

    /* JADX INFO: renamed from: z */
    public int f139317z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33369c1(C33381e1 c33381e1, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f139313E = c33381e1;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        return new C33369c1(this.f139313E, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C33369c1) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:12:0x0035  */
    /* JADX WARN: Code duplicated, block: B:15:0x0044 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:18:0x004f  */
    /* JADX WARN: Code duplicated, block: B:20:0x0061  */
    /* JADX WARN: Code duplicated, block: B:21:0x0066  */
    /* JADX WARN: Code duplicated, block: B:24:0x006d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0042 -> B:16:0x0045). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:18:0x004f
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // s83.AbstractC32267a
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r12.f139317z
            l83.a0 r2 = l83.C23454a0.f92919a
            r3 = 0
            t23.e1 r4 = r12.f139313E
            r5 = 1
            if (r1 == 0) goto L20
            if (r1 != r5) goto L18
            int r1 = r12.f139315x
            int r6 = r12.f139314w
            t23.e1 r7 = r12.f139316y
            p505ts.AbstractC34132o.m107864I(r13)
            goto L45
        L18:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L20:
            p505ts.AbstractC34132o.m107864I(r13)
            r13 = 5
            r1 = 0
            r6 = r13
            r7 = r4
        L27:
            if (r1 >= r6) goto L7b
            int r13 = r1 + 1
            long r8 = (long) r13
            r10 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 * r10
            r10 = 3000(0xbb8, double:1.482E-320)
            int r13 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r13 >= 0) goto L36
            r8 = r10
        L36:
            r12.f139316y = r7
            r12.f139314w = r6
            r12.f139315x = r1
            r12.f139317z = r5
            java.lang.Object r13 = bc3.AbstractC3034m0.m8782b(r8, r12)
            if (r13 != r0) goto L45
            return r0
        L45:
            ec3.h2 r13 = r7.f139358o
            java.lang.Object r13 = r13.getValue()
            t23.v0 r13 = (t23.C33465v0) r13
            if (r13 == 0) goto L79
            java.util.List r13 = r13.f139735c
            t23.x1 r8 = r7.f139344a
            t23.c0 r8 = r8.f139754b
            t23.s0 r8 = r8.f139302p
            ec3.h2 r8 = r8.f139621J
            java.lang.Object r8 = r8.getValue()
            io.getstream.android.video.generated.models.CallSettingsResponse r8 = (io.getstream.android.video.generated.models.CallSettingsResponse) r8
            if (r8 == 0) goto L66
            io.getstream.android.video.generated.models.VideoSettingsResponse r8 = r8.getVideo()
            goto L67
        L66:
            r8 = r3
        L67:
            org.webrtc.CameraEnumerationAndroid$CaptureFormat r13 = r7.m105838i(r13, r8)
            if (r13 == 0) goto L79
            ec3.h2 r0 = r7.f139359p
            r0.getClass()
            r0.m36571k(r3, r13)
            r7.m105839j()
            return r2
        L79:
            int r1 = r1 + r5
            goto L27
        L7b:
            b23.k r13 = r4.m105836g()
            b23.e r0 = r13.f9275c
            java.lang.String r1 = r13.f9273a
            b23.g r4 = b23.EnumC2341g.WARN
            boolean r0 = r0.isLoggable(r4, r1)
            if (r0 == 0) goto L92
            b23.j r13 = r13.f9274b
            java.lang.String r0 = "Resolution selection failed after 5 retries"
            r13.log(r4, r1, r0, r3)
        L92:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: t23.C33369c1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
