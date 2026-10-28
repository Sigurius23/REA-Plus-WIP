package live.hms.video.transport;

import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "live.hms.video.transport.HMSTransport$retryPublishIceFailedTask$1", m100430f = "HMSTransport.kt", m100431l = {198, 199}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", ""}, m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSTransport$retryPublishIceFailedTask$1 extends AbstractC32275i implements Function1 {
    Object L$0;
    int label;
    final /* synthetic */ HMSTransport this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HMSTransport$retryPublishIceFailedTask$1(HMSTransport hMSTransport, InterfaceC30057d<? super HMSTransport$retryPublishIceFailedTask$1> interfaceC30057d) {
        super(1, interfaceC30057d);
        this.this$0 = hMSTransport;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
        return new HMSTransport$retryPublishIceFailedTask$1(this.this$0, interfaceC30057d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007f, code lost:
    
        if (((bc3.C3058t) r1).m8817m(r12) == r0) goto L29;
     */
    @Override // s83.AbstractC32267a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r12.label
            java.lang.String r2 = "HMSTransport"
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L27
            if (r1 == r4) goto L1f
            if (r1 != r3) goto L17
            p505ts.AbstractC34132o.m107864I(r13)     // Catch: java.lang.IllegalStateException -> L14
            goto L9a
        L14:
            r0 = move-exception
            r13 = r0
            goto L82
        L17:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1f:
            java.lang.Object r1 = r12.L$0
            bc3.s r1 = (bc3.InterfaceC3055s) r1
            p505ts.AbstractC34132o.m107864I(r13)     // Catch: java.lang.IllegalStateException -> L14
            goto L75
        L27:
            p505ts.AbstractC34132o.m107864I(r13)
            live.hms.video.transport.HMSTransport r13 = r12.this$0
            boolean r13 = live.hms.video.transport.HMSTransport.access$isPeerConnectionReady$p(r13)
            if (r13 != 0) goto L38
            java.lang.String r13 = "Ignore publish renegotiation since this is called after peer connection is close or not created yet"
            live.hms.video.utils.HMSLogger.m71137e(r2, r13)
            goto L9a
        L38:
            live.hms.video.transport.HMSTransport r13 = r12.this$0
            live.hms.video.connection.publish.HMSPublishConnection r13 = live.hms.video.transport.HMSTransport.access$getPublishConnection$p(r13)
            if (r13 == 0) goto L9d
            hms.webrtc.PeerConnection$IceConnectionState r13 = r13.getIceConnectionState()
            hms.webrtc.PeerConnection$IceConnectionState r1 = hms.webrtc.PeerConnection.IceConnectionState.CONNECTED
            if (r13 == r1) goto L9a
            bc3.t r7 = bc3.AbstractC3006f0.m8707a()
            live.hms.video.transport.HMSTransport r13 = r12.this$0
            java.util.HashMap r13 = live.hms.video.transport.HMSTransport.access$getCallbacks$p(r13)
            live.hms.video.transport.models.TransportCallbackTriple r6 = new live.hms.video.transport.models.TransportCallbackTriple
            live.hms.video.error.HMSAction r8 = live.hms.video.error.HMSAction.RestartIce
            r10 = 4
            r11 = 0
            r9 = 0
            r6.<init>(r7, r8, r9, r10, r11)
            java.lang.String r1 = "publish-renegotiation-callback"
            r13.put(r1, r6)
            live.hms.video.transport.HMSTransport r13 = r12.this$0     // Catch: java.lang.IllegalStateException -> L14
            live.hms.video.factories.MediaConstraintsFactory r1 = live.hms.video.factories.MediaConstraintsFactory.INSTANCE     // Catch: java.lang.IllegalStateException -> L14
            hms.webrtc.MediaConstraints r1 = r1.makeIceRestartPublishOfferConstraints()     // Catch: java.lang.IllegalStateException -> L14
            r12.L$0 = r7     // Catch: java.lang.IllegalStateException -> L14
            r12.label = r4     // Catch: java.lang.IllegalStateException -> L14
            java.lang.Object r13 = live.hms.video.transport.HMSTransport.access$performPublishRenegotiation(r13, r1, r12)     // Catch: java.lang.IllegalStateException -> L14
            if (r13 != r0) goto L74
            goto L81
        L74:
            r1 = r7
        L75:
            r12.L$0 = r5     // Catch: java.lang.IllegalStateException -> L14
            r12.label = r3     // Catch: java.lang.IllegalStateException -> L14
            bc3.t r1 = (bc3.C3058t) r1     // Catch: java.lang.IllegalStateException -> L14
            java.lang.Object r13 = r1.m8817m(r12)     // Catch: java.lang.IllegalStateException -> L14
            if (r13 != r0) goto L9a
        L81:
            return r0
        L82:
            live.hms.video.utils.HMSLogger r0 = live.hms.video.utils.HMSLogger.INSTANCE
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Renegotiation could not be performed due to : "
            r1.<init>(r3)
            java.lang.String r3 = r13.getMessage()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.m71141w(r2, r1)
            throw r13
        L9a:
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            return r13
        L9d:
            java.lang.String r13 = "publishConnection"
            p715kotlin.jvm.internal.AbstractC22676k.m65757q(r13)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: live.hms.video.transport.HMSTransport$retryPublishIceFailedTask$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        return ((HMSTransport$retryPublishIceFailedTask$1) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }
}
