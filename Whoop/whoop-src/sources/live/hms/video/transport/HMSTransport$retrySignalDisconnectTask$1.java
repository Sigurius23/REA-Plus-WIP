package live.hms.video.transport;

import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "live.hms.video.transport.HMSTransport$retrySignalDisconnectTask$1", m100430f = "HMSTransport.kt", m100431l = {224, 237}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", ""}, m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSTransport$retrySignalDisconnectTask$1 extends AbstractC32275i implements Function1 {
    int I$0;
    int label;
    final /* synthetic */ HMSTransport this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HMSTransport$retrySignalDisconnectTask$1(HMSTransport hMSTransport, InterfaceC30057d<? super HMSTransport$retrySignalDisconnectTask$1> interfaceC30057d) {
        super(1, interfaceC30057d);
        this.this$0 = hMSTransport;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
        return new HMSTransport$retrySignalDisconnectTask$1(this.this$0, interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0083 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0085  */
    /* JADX WARN: Code duplicated, block: B:38:0x009e  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a9  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
    
        if (r14 == r0) goto L34;
     */
    @Override // s83.AbstractC32267a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r13.label
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L24
            if (r1 == r4) goto L1b
            if (r1 != r2) goto L13
            p505ts.AbstractC34132o.m107864I(r14)
            r10 = r13
            goto L94
        L13:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1b:
            int r1 = r13.I$0
            p505ts.AbstractC34132o.m107864I(r14)     // Catch: live.hms.video.error.HMSException -> L22
            r10 = r13
            goto L64
        L22:
            r10 = r13
            goto L67
        L24:
            p505ts.AbstractC34132o.m107864I(r14)
            live.hms.video.transport.HMSTransport r14 = r13.this$0
            live.hms.video.signal.ISignal r14 = live.hms.video.transport.HMSTransport.access$getSignal$p(r14)
            boolean r14 = r14.get_isConnected()
            if (r14 != 0) goto L69
            live.hms.video.transport.HMSTransport r14 = r13.this$0     // Catch: live.hms.video.error.HMSException -> L22
            live.hms.video.signal.ISignal r14 = live.hms.video.transport.HMSTransport.access$getSignal$p(r14)     // Catch: live.hms.video.error.HMSException -> L22
            r14.close()     // Catch: live.hms.video.error.HMSException -> L22
            live.hms.video.transport.HMSTransport r14 = r13.this$0     // Catch: live.hms.video.error.HMSException -> L22
            live.hms.video.transport.models.ConnectParameters r14 = live.hms.video.transport.HMSTransport.access$getConnectParameters$p(r14)     // Catch: live.hms.video.error.HMSException -> L22
            p715kotlin.jvm.internal.AbstractC22676k.m65747g(r14)     // Catch: live.hms.video.error.HMSException -> L22
            live.hms.video.transport.HMSTransport r5 = r13.this$0     // Catch: live.hms.video.error.HMSException -> L22
            java.lang.String r6 = r14.getToken()     // Catch: live.hms.video.error.HMSException -> L22
            java.lang.String r7 = r14.getEndpoint()     // Catch: live.hms.video.error.HMSException -> L22
            java.lang.String r8 = r14.getPeerId()     // Catch: live.hms.video.error.HMSException -> L22
            r13.I$0 = r4     // Catch: live.hms.video.error.HMSException -> L22
            r13.label = r4     // Catch: live.hms.video.error.HMSException -> L22
            r9 = 0
            r11 = 8
            r12 = 0
            r10 = r13
            java.lang.Object r14 = live.hms.video.transport.HMSTransport.internalConnect$default(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: live.hms.video.error.HMSException -> L67
            if (r14 != r0) goto L63
            goto L93
        L63:
            r1 = r4
        L64:
            live.hms.video.signal.init.InitConfig r14 = (live.hms.video.signal.init.InitConfig) r14     // Catch: live.hms.video.error.HMSException -> L67
            goto L6b
        L67:
            r1 = r3
            goto L6b
        L69:
            r10 = r13
            r1 = r4
        L6b:
            live.hms.video.transport.HMSTransport r14 = r10.this$0
            boolean r14 = live.hms.video.transport.HMSTransport.access$isRenegotiationDone$p(r14)
            if (r14 == 0) goto La7
            live.hms.video.transport.HMSTransport r14 = r10.this$0
            live.hms.video.connection.publish.HMSPublishConnection r14 = live.hms.video.transport.HMSTransport.access$getPublishConnection$p(r14)
            if (r14 == 0) goto La0
            hms.webrtc.PeerConnection$IceConnectionState r14 = r14.getIceConnectionState()
            hms.webrtc.PeerConnection$IceConnectionState r5 = hms.webrtc.PeerConnection.IceConnectionState.CLOSED
            if (r14 == r5) goto La7
            if (r1 == 0) goto L9e
            live.hms.video.transport.HMSTransport r14 = r10.this$0
            kotlin.jvm.functions.Function1 r14 = live.hms.video.transport.HMSTransport.access$getRetryPublishIceFailedTask$p(r14)
            r10.label = r2
            java.lang.Object r14 = r14.invoke(r13)
            if (r14 != r0) goto L94
        L93:
            return r0
        L94:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L9e
            r1 = r4
            goto La7
        L9e:
            r1 = r3
            goto La7
        La0:
            java.lang.String r14 = "publishConnection"
            p715kotlin.jvm.internal.AbstractC22676k.m65757q(r14)
            r14 = 0
            throw r14
        La7:
            if (r1 == 0) goto Laa
            r3 = r4
        Laa:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r3)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: live.hms.video.transport.HMSTransport$retrySignalDisconnectTask$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        return ((HMSTransport$retrySignalDisconnectTask$1) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }
}
