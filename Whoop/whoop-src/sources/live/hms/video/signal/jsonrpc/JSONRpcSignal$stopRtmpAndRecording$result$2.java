package live.hms.video.signal.jsonrpc;

import bc3.InterfaceC3055s;
import c93.InterfaceC4351m;
import live.hms.video.signal.ISignalEventsObserver;
import live.hms.video.transport.models.TransportFailureCategory;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.C22672i;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
public /* synthetic */ class JSONRpcSignal$stopRtmpAndRecording$result$2 extends C22672i implements InterfaceC4351m {
    public JSONRpcSignal$stopRtmpAndRecording$result$2(Object obj) {
        super(2, 0, ISignalEventsObserver.class, obj, "getDependency", "getDependency(Llive/hms/video/transport/models/TransportFailureCategory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(TransportFailureCategory transportFailureCategory, InterfaceC30057d<? super InterfaceC3055s> interfaceC30057d) {
        return ((ISignalEventsObserver) this.receiver).getDependency(transportFailureCategory, interfaceC30057d);
    }
}
