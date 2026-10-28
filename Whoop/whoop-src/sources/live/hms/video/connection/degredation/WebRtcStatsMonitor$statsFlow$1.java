package live.hms.video.connection.degredation;

import c93.InterfaceC4351m;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "live.hms.video.connection.degredation.WebRtcStatsMonitor$statsFlow$1", m100430f = "WebRtcStatsMonitor.kt", m100431l = {53, 55, 57}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Llive/hms/video/connection/degredation/StatsBundle;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
public final class WebRtcStatsMonitor$statsFlow$1 extends AbstractC32275i implements InterfaceC4351m {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ WebRtcStatsMonitor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebRtcStatsMonitor$statsFlow$1(WebRtcStatsMonitor webRtcStatsMonitor, InterfaceC30057d<? super WebRtcStatsMonitor$statsFlow$1> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.this$0 = webRtcStatsMonitor;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        WebRtcStatsMonitor$statsFlow$1 webRtcStatsMonitor$statsFlow$1 = new WebRtcStatsMonitor$statsFlow$1(this.this$0, interfaceC30057d);
        webRtcStatsMonitor$statsFlow$1.L$0 = obj;
        return webRtcStatsMonitor$statsFlow$1;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ((WebRtcStatsMonitor$statsFlow$1) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003f  */
    /* JADX WARN: Code duplicated, block: B:19:0x004c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0053  */
    /* JADX WARN: Code duplicated, block: B:25:0x005e  */
    /* JADX WARN: Code duplicated, block: B:26:0x005f A[PHI: r1
      0x005f: PHI (r1v1 ec3.m) = (r1v2 ec3.m), (r1v2 ec3.m), (r1v5 ec3.m), (r1v13 ec3.m) binds: [B:21:0x0051, B:23:0x005b, B:25:0x005e, B:11:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if (bc3.AbstractC3034m0.m8782b(r5, r8) == r0) goto L28;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x006d -> B:8:0x0016). Please report as a decompilation issue!!! */
    @Override // s83.AbstractC32267a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r8.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L30
            if (r1 == r4) goto L28
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            java.lang.Object r1 = r8.L$0
            ec3.m r1 = (ec3.InterfaceC13062m) r1
            p505ts.AbstractC34132o.m107864I(r9)
        L16:
            r9 = r1
            goto L37
        L18:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L20:
            java.lang.Object r1 = r8.L$0
            ec3.m r1 = (ec3.InterfaceC13062m) r1
            p505ts.AbstractC34132o.m107864I(r9)
            goto L5f
        L28:
            java.lang.Object r1 = r8.L$0
            ec3.m r1 = (ec3.InterfaceC13062m) r1
            p505ts.AbstractC34132o.m107864I(r9)
            goto L4f
        L30:
            p505ts.AbstractC34132o.m107864I(r9)
            java.lang.Object r9 = r8.L$0
            ec3.m r9 = (ec3.InterfaceC13062m) r9
        L37:
            live.hms.video.connection.degredation.WebRtcStatsMonitor r1 = r8.this$0
            boolean r1 = r1.getIsTransportConnected()
            if (r1 == 0) goto L5e
            live.hms.video.connection.degredation.WebRtcStatsMonitor r1 = r8.this$0
            r8.L$0 = r9
            r8.label = r4
            java.lang.Object r1 = live.hms.video.connection.degredation.WebRtcStatsMonitor.access$retrieveStats(r1, r8)
            if (r1 != r0) goto L4c
            goto L6f
        L4c:
            r7 = r1
            r1 = r9
            r9 = r7
        L4f:
            live.hms.video.connection.degredation.StatsBundle r9 = (live.hms.video.connection.degredation.StatsBundle) r9
            if (r9 == 0) goto L5f
            r8.L$0 = r1
            r8.label = r3
            java.lang.Object r9 = r1.emit(r9, r8)
            if (r9 != r0) goto L5f
            goto L6f
        L5e:
            r1 = r9
        L5f:
            live.hms.video.connection.degredation.WebRtcStatsMonitor r9 = r8.this$0
            long r5 = live.hms.video.connection.degredation.WebRtcStatsMonitor.access$getDelayPeriod$p(r9)
            r8.L$0 = r1
            r8.label = r2
            java.lang.Object r9 = bc3.AbstractC3034m0.m8782b(r5, r8)
            if (r9 != r0) goto L16
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: live.hms.video.connection.degredation.WebRtcStatsMonitor$statsFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
