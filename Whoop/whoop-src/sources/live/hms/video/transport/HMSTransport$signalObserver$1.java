package live.hms.video.transport;

import bc3.AbstractC3006f0;
import bc3.C3058t;
import bc3.InterfaceC3055s;
import com.google.gson.JsonObject;
import hms.webrtc.IceCandidate;
import hms.webrtc.MediaConstraints;
import hms.webrtc.PeerConnection;
import hms.webrtc.SessionDescription;
import java.util.Iterator;
import l83.C23454a0;
import live.hms.video.connection.HMSConnection;
import live.hms.video.connection.models.HMSConnectionRole;
import live.hms.video.connection.models.HMSSessionDescription;
import live.hms.video.connection.models.HMSTrickle;
import live.hms.video.connection.subscribe.HMSSubscribeConnection;
import live.hms.video.error.ErrorFactory;
import live.hms.video.error.HMSException;
import live.hms.video.events.AnalyticsEventFactory;
import live.hms.video.factories.MediaConstraintsFactory;
import live.hms.video.signal.ISignalEventsObserver;
import live.hms.video.transport.models.TransportCallbackTriple;
import live.hms.video.transport.models.TransportFailureCategory;
import live.hms.video.transport.models.TransportState;
import live.hms.video.utils.HMSConstantsKt;
import live.hms.video.utils.HMSCoroutineScope;
import live.hms.video.utils.HMSLogger;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0012J \u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"live/hms/video/transport/HMSTransport$signalObserver$1", "Llive/hms/video/signal/ISignalEventsObserver;", "Llive/hms/video/connection/models/HMSSessionDescription;", "jsep", "Ll83/a0;", "onOffer", "(Llive/hms/video/connection/models/HMSSessionDescription;Lq83/d;)Ljava/lang/Object;", "Llive/hms/video/connection/models/HMSTrickle;", "trickle", "onTrickle", "(Llive/hms/video/connection/models/HMSTrickle;)V", "Lcom/google/gson/JsonObject;", "message", "onNotification", "(Lcom/google/gson/JsonObject;Lq83/d;)Ljava/lang/Object;", "Llive/hms/video/error/HMSException;", "error", "onServerError", "(Llive/hms/video/error/HMSException;)V", "exception", "onFailure", "Llive/hms/video/transport/models/TransportFailureCategory;", "tfc", "Lbc3/s;", "", "getDependency", "(Llive/hms/video/transport/models/TransportFailureCategory;Lq83/d;)Ljava/lang/Object;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSTransport$signalObserver$1 implements ISignalEventsObserver {
    final /* synthetic */ HMSTransport this$0;

    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMSConnectionRole.values().length];
            try {
                iArr[HMSConnectionRole.PUBLISH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HMSConnectionRole.SUBSCRIBE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public HMSTransport$signalObserver$1(HMSTransport hMSTransport) {
        this.this$0 = hMSTransport;
    }

    @Override // live.hms.video.signal.ISignalEventsObserver
    public Object getDependency(TransportFailureCategory transportFailureCategory, InterfaceC30057d<? super InterfaceC3055s> interfaceC30057d) {
        return this.this$0.retryScheduler.getDependecyForCategory(transportFailureCategory);
    }

    @Override // live.hms.video.signal.ISignalEventsObserver
    public void onFailure(HMSException exception) {
        AbstractC22676k.m65750j(exception, "exception");
        this.this$0.getAnalyticsEventsService().removeTransport(this.this$0.signal);
        AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new HMSTransport$signalObserver$1$onFailure$1(this.this$0, exception, null), 3);
    }

    @Override // live.hms.video.signal.ISignalEventsObserver
    public Object onNotification(JsonObject jsonObject, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        boolean z4 = this.this$0.isTearDownInProgress;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!z4 && this.this$0.getState() != TransportState.Disconnected && this.this$0.getState() != TransportState.Failed) {
            Object objOnNotification = this.this$0.observer.onNotification(jsonObject, interfaceC30057d);
            return objOnNotification == EnumC31071a.f128113w ? objOnNotification : c23454a0;
        }
        HMSLogger.INSTANCE.m71141w("HMSTransport", "Ignoring " + jsonObject + " as leave in progress");
        return c23454a0;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0236  */
    /* JADX WARN: Code duplicated, block: B:110:0x0250  */
    /* JADX WARN: Code duplicated, block: B:112:0x025a  */
    /* JADX WARN: Code duplicated, block: B:114:0x0265  */
    /* JADX WARN: Code duplicated, block: B:117:0x0278  */
    /* JADX WARN: Code duplicated, block: B:119:0x0296  */
    /* JADX WARN: Code duplicated, block: B:51:0x012a A[Catch: Exception -> 0x0093, LOOP:0: B:49:0x0124->B:51:0x012a, LOOP_END, TryCatch #2 {Exception -> 0x0093, blocks: (B:81:0x01cb, B:83:0x01d3, B:85:0x01d9, B:87:0x01df, B:89:0x01eb, B:91:0x01f3, B:97:0x0226, B:98:0x0229, B:26:0x008d, B:48:0x00f4, B:49:0x0124, B:51:0x012a, B:52:0x0134, B:54:0x0141, B:56:0x0147, B:59:0x0152, B:61:0x015c, B:63:0x0166, B:65:0x0178, B:67:0x0198, B:68:0x019b, B:69:0x019c, B:70:0x019f, B:71:0x01a0, B:72:0x01a3, B:73:0x01a4, B:75:0x01aa, B:77:0x01ae), top: B:126:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0141 A[Catch: Exception -> 0x0093, TryCatch #2 {Exception -> 0x0093, blocks: (B:81:0x01cb, B:83:0x01d3, B:85:0x01d9, B:87:0x01df, B:89:0x01eb, B:91:0x01f3, B:97:0x0226, B:98:0x0229, B:26:0x008d, B:48:0x00f4, B:49:0x0124, B:51:0x012a, B:52:0x0134, B:54:0x0141, B:56:0x0147, B:59:0x0152, B:61:0x015c, B:63:0x0166, B:65:0x0178, B:67:0x0198, B:68:0x019b, B:69:0x019c, B:70:0x019f, B:71:0x01a0, B:72:0x01a3, B:73:0x01a4, B:75:0x01aa, B:77:0x01ae), top: B:126:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0147 A[Catch: Exception -> 0x0093, TryCatch #2 {Exception -> 0x0093, blocks: (B:81:0x01cb, B:83:0x01d3, B:85:0x01d9, B:87:0x01df, B:89:0x01eb, B:91:0x01f3, B:97:0x0226, B:98:0x0229, B:26:0x008d, B:48:0x00f4, B:49:0x0124, B:51:0x012a, B:52:0x0134, B:54:0x0141, B:56:0x0147, B:59:0x0152, B:61:0x015c, B:63:0x0166, B:65:0x0178, B:67:0x0198, B:68:0x019b, B:69:0x019c, B:70:0x019f, B:71:0x01a0, B:72:0x01a3, B:73:0x01a4, B:75:0x01aa, B:77:0x01ae), top: B:126:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0151  */
    /* JADX WARN: Code duplicated, block: B:59:0x0152 A[Catch: Exception -> 0x0093, TryCatch #2 {Exception -> 0x0093, blocks: (B:81:0x01cb, B:83:0x01d3, B:85:0x01d9, B:87:0x01df, B:89:0x01eb, B:91:0x01f3, B:97:0x0226, B:98:0x0229, B:26:0x008d, B:48:0x00f4, B:49:0x0124, B:51:0x012a, B:52:0x0134, B:54:0x0141, B:56:0x0147, B:59:0x0152, B:61:0x015c, B:63:0x0166, B:65:0x0178, B:67:0x0198, B:68:0x019b, B:69:0x019c, B:70:0x019f, B:71:0x01a0, B:72:0x01a3, B:73:0x01a4, B:75:0x01aa, B:77:0x01ae), top: B:126:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:61:0x015c A[Catch: Exception -> 0x0093, TryCatch #2 {Exception -> 0x0093, blocks: (B:81:0x01cb, B:83:0x01d3, B:85:0x01d9, B:87:0x01df, B:89:0x01eb, B:91:0x01f3, B:97:0x0226, B:98:0x0229, B:26:0x008d, B:48:0x00f4, B:49:0x0124, B:51:0x012a, B:52:0x0134, B:54:0x0141, B:56:0x0147, B:59:0x0152, B:61:0x015c, B:63:0x0166, B:65:0x0178, B:67:0x0198, B:68:0x019b, B:69:0x019c, B:70:0x019f, B:71:0x01a0, B:72:0x01a3, B:73:0x01a4, B:75:0x01aa, B:77:0x01ae), top: B:126:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0166 A[Catch: Exception -> 0x0093, TryCatch #2 {Exception -> 0x0093, blocks: (B:81:0x01cb, B:83:0x01d3, B:85:0x01d9, B:87:0x01df, B:89:0x01eb, B:91:0x01f3, B:97:0x0226, B:98:0x0229, B:26:0x008d, B:48:0x00f4, B:49:0x0124, B:51:0x012a, B:52:0x0134, B:54:0x0141, B:56:0x0147, B:59:0x0152, B:61:0x015c, B:63:0x0166, B:65:0x0178, B:67:0x0198, B:68:0x019b, B:69:0x019c, B:70:0x019f, B:71:0x01a0, B:72:0x01a3, B:73:0x01a4, B:75:0x01aa, B:77:0x01ae), top: B:126:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0178 A[Catch: Exception -> 0x0093, TryCatch #2 {Exception -> 0x0093, blocks: (B:81:0x01cb, B:83:0x01d3, B:85:0x01d9, B:87:0x01df, B:89:0x01eb, B:91:0x01f3, B:97:0x0226, B:98:0x0229, B:26:0x008d, B:48:0x00f4, B:49:0x0124, B:51:0x012a, B:52:0x0134, B:54:0x0141, B:56:0x0147, B:59:0x0152, B:61:0x015c, B:63:0x0166, B:65:0x0178, B:67:0x0198, B:68:0x019b, B:69:0x019c, B:70:0x019f, B:71:0x01a0, B:72:0x01a3, B:73:0x01a4, B:75:0x01aa, B:77:0x01ae), top: B:126:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0198 A[Catch: Exception -> 0x0093, TryCatch #2 {Exception -> 0x0093, blocks: (B:81:0x01cb, B:83:0x01d3, B:85:0x01d9, B:87:0x01df, B:89:0x01eb, B:91:0x01f3, B:97:0x0226, B:98:0x0229, B:26:0x008d, B:48:0x00f4, B:49:0x0124, B:51:0x012a, B:52:0x0134, B:54:0x0141, B:56:0x0147, B:59:0x0152, B:61:0x015c, B:63:0x0166, B:65:0x0178, B:67:0x0198, B:68:0x019b, B:69:0x019c, B:70:0x019f, B:71:0x01a0, B:72:0x01a3, B:73:0x01a4, B:75:0x01aa, B:77:0x01ae), top: B:126:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:69:0x019c A[Catch: Exception -> 0x0093, TryCatch #2 {Exception -> 0x0093, blocks: (B:81:0x01cb, B:83:0x01d3, B:85:0x01d9, B:87:0x01df, B:89:0x01eb, B:91:0x01f3, B:97:0x0226, B:98:0x0229, B:26:0x008d, B:48:0x00f4, B:49:0x0124, B:51:0x012a, B:52:0x0134, B:54:0x0141, B:56:0x0147, B:59:0x0152, B:61:0x015c, B:63:0x0166, B:65:0x0178, B:67:0x0198, B:68:0x019b, B:69:0x019c, B:70:0x019f, B:71:0x01a0, B:72:0x01a3, B:73:0x01a4, B:75:0x01aa, B:77:0x01ae), top: B:126:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:71:0x01a0 A[Catch: Exception -> 0x0093, TryCatch #2 {Exception -> 0x0093, blocks: (B:81:0x01cb, B:83:0x01d3, B:85:0x01d9, B:87:0x01df, B:89:0x01eb, B:91:0x01f3, B:97:0x0226, B:98:0x0229, B:26:0x008d, B:48:0x00f4, B:49:0x0124, B:51:0x012a, B:52:0x0134, B:54:0x0141, B:56:0x0147, B:59:0x0152, B:61:0x015c, B:63:0x0166, B:65:0x0178, B:67:0x0198, B:68:0x019b, B:69:0x019c, B:70:0x019f, B:71:0x01a0, B:72:0x01a3, B:73:0x01a4, B:75:0x01aa, B:77:0x01ae), top: B:126:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:75:0x01aa A[Catch: Exception -> 0x0093, TryCatch #2 {Exception -> 0x0093, blocks: (B:81:0x01cb, B:83:0x01d3, B:85:0x01d9, B:87:0x01df, B:89:0x01eb, B:91:0x01f3, B:97:0x0226, B:98:0x0229, B:26:0x008d, B:48:0x00f4, B:49:0x0124, B:51:0x012a, B:52:0x0134, B:54:0x0141, B:56:0x0147, B:59:0x0152, B:61:0x015c, B:63:0x0166, B:65:0x0178, B:67:0x0198, B:68:0x019b, B:69:0x019c, B:70:0x019f, B:71:0x01a0, B:72:0x01a3, B:73:0x01a4, B:75:0x01aa, B:77:0x01ae), top: B:126:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:77:0x01ae A[Catch: Exception -> 0x0093, TryCatch #2 {Exception -> 0x0093, blocks: (B:81:0x01cb, B:83:0x01d3, B:85:0x01d9, B:87:0x01df, B:89:0x01eb, B:91:0x01f3, B:97:0x0226, B:98:0x0229, B:26:0x008d, B:48:0x00f4, B:49:0x0124, B:51:0x012a, B:52:0x0134, B:54:0x0141, B:56:0x0147, B:59:0x0152, B:61:0x015c, B:63:0x0166, B:65:0x0178, B:67:0x0198, B:68:0x019b, B:69:0x019c, B:70:0x019f, B:71:0x01a0, B:72:0x01a3, B:73:0x01a4, B:75:0x01aa, B:77:0x01ae), top: B:126:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d3 A[Catch: Exception -> 0x0093, TryCatch #2 {Exception -> 0x0093, blocks: (B:81:0x01cb, B:83:0x01d3, B:85:0x01d9, B:87:0x01df, B:89:0x01eb, B:91:0x01f3, B:97:0x0226, B:98:0x0229, B:26:0x008d, B:48:0x00f4, B:49:0x0124, B:51:0x012a, B:52:0x0134, B:54:0x0141, B:56:0x0147, B:59:0x0152, B:61:0x015c, B:63:0x0166, B:65:0x0178, B:67:0x0198, B:68:0x019b, B:69:0x019c, B:70:0x019f, B:71:0x01a0, B:72:0x01a3, B:73:0x01a4, B:75:0x01aa, B:77:0x01ae), top: B:126:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:85:0x01d9 A[Catch: Exception -> 0x0093, TryCatch #2 {Exception -> 0x0093, blocks: (B:81:0x01cb, B:83:0x01d3, B:85:0x01d9, B:87:0x01df, B:89:0x01eb, B:91:0x01f3, B:97:0x0226, B:98:0x0229, B:26:0x008d, B:48:0x00f4, B:49:0x0124, B:51:0x012a, B:52:0x0134, B:54:0x0141, B:56:0x0147, B:59:0x0152, B:61:0x015c, B:63:0x0166, B:65:0x0178, B:67:0x0198, B:68:0x019b, B:69:0x019c, B:70:0x019f, B:71:0x01a0, B:72:0x01a3, B:73:0x01a4, B:75:0x01aa, B:77:0x01ae), top: B:126:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:87:0x01df A[Catch: Exception -> 0x0093, TryCatch #2 {Exception -> 0x0093, blocks: (B:81:0x01cb, B:83:0x01d3, B:85:0x01d9, B:87:0x01df, B:89:0x01eb, B:91:0x01f3, B:97:0x0226, B:98:0x0229, B:26:0x008d, B:48:0x00f4, B:49:0x0124, B:51:0x012a, B:52:0x0134, B:54:0x0141, B:56:0x0147, B:59:0x0152, B:61:0x015c, B:63:0x0166, B:65:0x0178, B:67:0x0198, B:68:0x019b, B:69:0x019c, B:70:0x019f, B:71:0x01a0, B:72:0x01a3, B:73:0x01a4, B:75:0x01aa, B:77:0x01ae), top: B:126:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01eb A[Catch: Exception -> 0x0093, TryCatch #2 {Exception -> 0x0093, blocks: (B:81:0x01cb, B:83:0x01d3, B:85:0x01d9, B:87:0x01df, B:89:0x01eb, B:91:0x01f3, B:97:0x0226, B:98:0x0229, B:26:0x008d, B:48:0x00f4, B:49:0x0124, B:51:0x012a, B:52:0x0134, B:54:0x0141, B:56:0x0147, B:59:0x0152, B:61:0x015c, B:63:0x0166, B:65:0x0178, B:67:0x0198, B:68:0x019b, B:69:0x019c, B:70:0x019f, B:71:0x01a0, B:72:0x01a3, B:73:0x01a4, B:75:0x01aa, B:77:0x01ae), top: B:126:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:91:0x01f3 A[Catch: Exception -> 0x0093, TRY_LEAVE, TryCatch #2 {Exception -> 0x0093, blocks: (B:81:0x01cb, B:83:0x01d3, B:85:0x01d9, B:87:0x01df, B:89:0x01eb, B:91:0x01f3, B:97:0x0226, B:98:0x0229, B:26:0x008d, B:48:0x00f4, B:49:0x0124, B:51:0x012a, B:52:0x0134, B:54:0x0141, B:56:0x0147, B:59:0x0152, B:61:0x015c, B:63:0x0166, B:65:0x0178, B:67:0x0198, B:68:0x019b, B:69:0x019c, B:70:0x019f, B:71:0x01a0, B:72:0x01a3, B:73:0x01a4, B:75:0x01aa, B:77:0x01ae), top: B:126:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0207  */
    /* JADX WARN: Code duplicated, block: B:97:0x0226 A[Catch: Exception -> 0x0093, TRY_ENTER, TryCatch #2 {Exception -> 0x0093, blocks: (B:81:0x01cb, B:83:0x01d3, B:85:0x01d9, B:87:0x01df, B:89:0x01eb, B:91:0x01f3, B:97:0x0226, B:98:0x0229, B:26:0x008d, B:48:0x00f4, B:49:0x0124, B:51:0x012a, B:52:0x0134, B:54:0x0141, B:56:0x0147, B:59:0x0152, B:61:0x015c, B:63:0x0166, B:65:0x0178, B:67:0x0198, B:68:0x019b, B:69:0x019c, B:70:0x019f, B:71:0x01a0, B:72:0x01a3, B:73:0x01a4, B:75:0x01aa, B:77:0x01ae), top: B:126:0x008d }] */
    @Override // live.hms.video.signal.ISignalEventsObserver
    public Object onOffer(HMSSessionDescription hMSSessionDescription, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        HMSTransport$signalObserver$1$onOffer$1 hMSTransport$signalObserver$1$onOffer$1;
        Exception exc;
        HMSTransport$signalObserver$1 hMSTransport$signalObserver$1;
        HMSSubscribeConnection hMSSubscribeConnection;
        HMSSessionDescription hMSSessionDescription2;
        HMSTransport hMSTransport;
        HMSTransport$signalObserver$1 hMSTransport$signalObserver$2;
        HMSSubscribeConnection hMSSubscribeConnection2;
        Iterator<T> it;
        Object objCreateAnswer;
        HMSSubscribeConnection hMSSubscribeConnection3;
        HMSSubscribeConnection hMSSubscribeConnection4;
        HMSTransport hMSTransport2;
        HMSSubscribeConnection hMSSubscribeConnection5;
        String sfuNodeId;
        HMSSubscribeConnection hMSSubscribeConnection6;
        StringBuilder sb4;
        HMSSubscribeConnection hMSSubscribeConnection7;
        SessionDescription sessionDescription;
        HMSSubscribeConnection hMSSubscribeConnection8;
        HMSSubscribeConnection hMSSubscribeConnection9;
        HMSTransport$signalObserver$1 hMSTransport$signalObserver$3;
        SessionDescription sessionDescription2;
        boolean z4;
        HMSException hMSExceptionUnknown$default;
        TransportCallbackTriple transportCallbackTriple;
        InterfaceC3055s deferred;
        String message;
        if (interfaceC30057d instanceof HMSTransport$signalObserver$1$onOffer$1) {
            hMSTransport$signalObserver$1$onOffer$1 = (HMSTransport$signalObserver$1$onOffer$1) interfaceC30057d;
            int i13 = hMSTransport$signalObserver$1$onOffer$1.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                hMSTransport$signalObserver$1$onOffer$1.label = i13 - Integer.MIN_VALUE;
            } else {
                hMSTransport$signalObserver$1$onOffer$1 = new HMSTransport$signalObserver$1$onOffer$1(this, interfaceC30057d);
            }
        } else {
            hMSTransport$signalObserver$1$onOffer$1 = new HMSTransport$signalObserver$1$onOffer$1(this, interfaceC30057d);
        }
        Object obj = hMSTransport$signalObserver$1$onOffer$1.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = hMSTransport$signalObserver$1$onOffer$1.label;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 != 0) {
            if (i14 == 1) {
                hMSSubscribeConnection = (HMSSubscribeConnection) hMSTransport$signalObserver$1$onOffer$1.L$4;
                hMSTransport = (HMSTransport) hMSTransport$signalObserver$1$onOffer$1.L$3;
                HMSSubscribeConnection hMSSubscribeConnection10 = (HMSSubscribeConnection) hMSTransport$signalObserver$1$onOffer$1.L$2;
                HMSSessionDescription hMSSessionDescription3 = (HMSSessionDescription) hMSTransport$signalObserver$1$onOffer$1.L$1;
                hMSTransport$signalObserver$2 = (HMSTransport$signalObserver$1) hMSTransport$signalObserver$1$onOffer$1.L$0;
                try {
                    AbstractC34132o.m107864I(obj);
                    hMSSubscribeConnection2 = hMSSubscribeConnection10;
                    hMSSessionDescription2 = hMSSessionDescription3;
                    HMSLogger.m71136d("HMSTransport", "[SUBSCRIBE] Adding " + hMSSubscribeConnection.getCandidates().size() + " ice-candidates [" + hMSSubscribeConnection.getCandidates() + ']');
                    it = hMSSubscribeConnection.getCandidates().iterator();
                    while (it.hasNext()) {
                        hMSSubscribeConnection.addIceCandidate((IceCandidate) it.next());
                    }
                    hMSSubscribeConnection.getCandidates().clear();
                    if (hMSSessionDescription2.getSfuNodeId() != null) {
                        hMSSubscribeConnection5 = hMSTransport.subscribeConnection;
                        if (hMSSubscribeConnection5 != null) {
                            AbstractC22676k.m65757q("subscribeConnection");
                            throw null;
                        }
                        if (hMSSubscribeConnection5.get_nodeInfo().length() == 0) {
                            sfuNodeId = hMSSessionDescription2.getSfuNodeId();
                            hMSSubscribeConnection6 = hMSTransport.subscribeConnection;
                            if (hMSSubscribeConnection6 != null) {
                                AbstractC22676k.m65757q("subscribeConnection");
                                throw null;
                            }
                            if (!AbstractC22676k.m65745e(sfuNodeId, hMSSubscribeConnection6.get_nodeInfo())) {
                                sb4 = new StringBuilder();
                                sb4.append("[role=SUBSCRIBE] node-mismatch the current peerConnection is old node id :");
                                hMSSubscribeConnection7 = hMSTransport.subscribeConnection;
                                if (hMSSubscribeConnection7 != null) {
                                    AbstractC22676k.m65757q("subscribeConnection");
                                    throw null;
                                }
                                sb4.append(hMSSubscribeConnection7.get_nodeInfo());
                                sb4.append(" and the offer is from node id ");
                                sb4.append(hMSSessionDescription2.getSfuNodeId());
                                sb4.append("  ❌");
                                HMSLogger.m71136d("SFUMIGRATION", sb4.toString());
                                return c23454a0;
                            }
                        }
                    }
                    if (!hMSTransport.isPeerConnectionReady) {
                        HMSLogger.m71137e("HMSTransport", "Ignore remote offer since it is called after peer connection is closed or not created yet");
                        return c23454a0;
                    }
                    MediaConstraints mediaConstraintsMakeSubscribeAnswerConstraints = MediaConstraintsFactory.INSTANCE.makeSubscribeAnswerConstraints();
                    hMSTransport$signalObserver$1$onOffer$1.L$0 = hMSTransport$signalObserver$2;
                    hMSTransport$signalObserver$1$onOffer$1.L$1 = hMSSubscribeConnection2;
                    hMSTransport$signalObserver$1$onOffer$1.L$2 = hMSTransport;
                    hMSTransport$signalObserver$1$onOffer$1.L$3 = hMSSubscribeConnection;
                    hMSTransport$signalObserver$1$onOffer$1.L$4 = null;
                    hMSTransport$signalObserver$1$onOffer$1.label = 2;
                    objCreateAnswer = hMSSubscribeConnection.createAnswer(mediaConstraintsMakeSubscribeAnswerConstraints, hMSTransport$signalObserver$1$onOffer$1);
                    if (objCreateAnswer == enumC31071a) {
                        hMSSubscribeConnection3 = hMSSubscribeConnection2;
                        obj = objCreateAnswer;
                        hMSSubscribeConnection4 = hMSSubscribeConnection;
                        hMSTransport2 = hMSTransport;
                        sessionDescription = (SessionDescription) obj;
                        if (!hMSTransport2.isPeerConnectionReady) {
                            HMSLogger.m71137e("HMSTransport", "Ignore local answer since it is called after peer connection is closed or not created yet");
                            return c23454a0;
                        }
                        hMSSubscribeConnection8 = hMSTransport2.subscribeConnection;
                        if (hMSSubscribeConnection8 == null) {
                            AbstractC22676k.m65757q("subscribeConnection");
                            throw null;
                        }
                        if (hMSSubscribeConnection8.getNativeConnection().connectionState() == PeerConnection.PeerConnectionState.CLOSED) {
                            HMSLogger.INSTANCE.m71141w("HMSTransport", "[role=SUBSCRIBE] local answer as IGNORED as PeerConnection is closed ❌");
                            return c23454a0;
                        }
                        hMSTransport$signalObserver$1$onOffer$1.L$0 = hMSTransport$signalObserver$2;
                        hMSTransport$signalObserver$1$onOffer$1.L$1 = hMSSubscribeConnection3;
                        hMSTransport$signalObserver$1$onOffer$1.L$2 = hMSTransport2;
                        hMSTransport$signalObserver$1$onOffer$1.L$3 = hMSSubscribeConnection4;
                        hMSTransport$signalObserver$1$onOffer$1.L$4 = sessionDescription;
                        hMSTransport$signalObserver$1$onOffer$1.label = 3;
                        if (hMSSubscribeConnection4.setLocalDescription(sessionDescription, hMSTransport$signalObserver$1$onOffer$1) != enumC31071a) {
                            hMSSubscribeConnection9 = hMSSubscribeConnection4;
                            hMSTransport$signalObserver$3 = hMSTransport$signalObserver$2;
                            sessionDescription2 = sessionDescription;
                            hMSSubscribeConnection9.getSignal().answer(HMSSessionDescription.INSTANCE.from(sessionDescription2, hMSTransport2.getNodeID()), hMSTransport2.getNodeID());
                            HMSLogger.m71136d("HMSTransport", "[role=SUBSCRIBE] onOffer renegotiation DONE ✅");
                        }
                    }
                    return enumC31071a;
                } catch (Exception e5) {
                    exc = e5;
                    hMSTransport$signalObserver$1 = hMSTransport$signalObserver$2;
                    z4 = exc instanceof HMSException;
                    if (!z4) {
                    }
                    HMSLogger.m71136d("HMSTransport", "[role=SUBSCRIBE] onOffer renegotiation FAILED ❌");
                    hMSTransport$signalObserver$1.this$0.setState(TransportState.Failed);
                    if (z4) {
                        hMSExceptionUnknown$default = (HMSException) exc;
                    } else {
                        ErrorFactory.GenericErrors genericErrors = ErrorFactory.GenericErrors.INSTANCE;
                        ErrorFactory.Action action = ErrorFactory.Action.SUBSCRIBE;
                        message = exc.getMessage();
                        if (message == null) {
                            message = "Renegotiation with offer received from server failed";
                        }
                        hMSExceptionUnknown$default = ErrorFactory.GenericErrors.Unknown$default(genericErrors, action, message, exc, null, 8, null);
                    }
                    transportCallbackTriple = (TransportCallbackTriple) hMSTransport$signalObserver$1.this$0.callbacks.remove(HMSConstantsKt.cSubscribeRenegotiationCallback);
                    if (transportCallbackTriple == null) {
                        hMSTransport$signalObserver$1.this$0.getAnalyticsEventsService().queue(AnalyticsEventFactory.INSTANCE.subscribeFail(hMSExceptionUnknown$default)).flush();
                        hMSTransport$signalObserver$1.this$0.observer.onNonFatalError(hMSExceptionUnknown$default);
                    }
                    if (transportCallbackTriple != null) {
                        ((C3058t) deferred).completeExceptionally(hMSExceptionUnknown$default);
                    }
                }
            } else if (i14 == 2) {
                hMSSubscribeConnection4 = (HMSSubscribeConnection) hMSTransport$signalObserver$1$onOffer$1.L$3;
                hMSTransport2 = (HMSTransport) hMSTransport$signalObserver$1$onOffer$1.L$2;
                hMSSubscribeConnection3 = (HMSSubscribeConnection) hMSTransport$signalObserver$1$onOffer$1.L$1;
                HMSTransport$signalObserver$1 hMSTransport$signalObserver$4 = (HMSTransport$signalObserver$1) hMSTransport$signalObserver$1$onOffer$1.L$0;
                try {
                    AbstractC34132o.m107864I(obj);
                    hMSTransport$signalObserver$2 = hMSTransport$signalObserver$4;
                    sessionDescription = (SessionDescription) obj;
                    if (!hMSTransport2.isPeerConnectionReady) {
                        HMSLogger.m71137e("HMSTransport", "Ignore local answer since it is called after peer connection is closed or not created yet");
                        return c23454a0;
                    }
                    hMSSubscribeConnection8 = hMSTransport2.subscribeConnection;
                    if (hMSSubscribeConnection8 == null) {
                        AbstractC22676k.m65757q("subscribeConnection");
                        throw null;
                    }
                    if (hMSSubscribeConnection8.getNativeConnection().connectionState() == PeerConnection.PeerConnectionState.CLOSED) {
                        HMSLogger.INSTANCE.m71141w("HMSTransport", "[role=SUBSCRIBE] local answer as IGNORED as PeerConnection is closed ❌");
                        return c23454a0;
                    }
                    hMSTransport$signalObserver$1$onOffer$1.L$0 = hMSTransport$signalObserver$2;
                    hMSTransport$signalObserver$1$onOffer$1.L$1 = hMSSubscribeConnection3;
                    hMSTransport$signalObserver$1$onOffer$1.L$2 = hMSTransport2;
                    hMSTransport$signalObserver$1$onOffer$1.L$3 = hMSSubscribeConnection4;
                    hMSTransport$signalObserver$1$onOffer$1.L$4 = sessionDescription;
                    hMSTransport$signalObserver$1$onOffer$1.label = 3;
                    if (hMSSubscribeConnection4.setLocalDescription(sessionDescription, hMSTransport$signalObserver$1$onOffer$1) != enumC31071a) {
                        hMSSubscribeConnection9 = hMSSubscribeConnection4;
                        hMSTransport$signalObserver$3 = hMSTransport$signalObserver$2;
                        sessionDescription2 = sessionDescription;
                        hMSSubscribeConnection9.getSignal().answer(HMSSessionDescription.INSTANCE.from(sessionDescription2, hMSTransport2.getNodeID()), hMSTransport2.getNodeID());
                        HMSLogger.m71136d("HMSTransport", "[role=SUBSCRIBE] onOffer renegotiation DONE ✅");
                    }
                    return enumC31071a;
                } catch (Exception e13) {
                    exc = e13;
                    hMSTransport$signalObserver$1 = hMSTransport$signalObserver$4;
                    z4 = exc instanceof HMSException;
                    if (!z4) {
                    }
                    HMSLogger.m71136d("HMSTransport", "[role=SUBSCRIBE] onOffer renegotiation FAILED ❌");
                    hMSTransport$signalObserver$1.this$0.setState(TransportState.Failed);
                    if (z4) {
                        ErrorFactory.GenericErrors genericErrors2 = ErrorFactory.GenericErrors.INSTANCE;
                        ErrorFactory.Action action2 = ErrorFactory.Action.SUBSCRIBE;
                        message = exc.getMessage();
                        if (message == null) {
                            message = "Renegotiation with offer received from server failed";
                        }
                        hMSExceptionUnknown$default = ErrorFactory.GenericErrors.Unknown$default(genericErrors2, action2, message, exc, null, 8, null);
                    } else {
                        hMSExceptionUnknown$default = (HMSException) exc;
                    }
                    transportCallbackTriple = (TransportCallbackTriple) hMSTransport$signalObserver$1.this$0.callbacks.remove(HMSConstantsKt.cSubscribeRenegotiationCallback);
                    if (transportCallbackTriple == null) {
                        hMSTransport$signalObserver$1.this$0.getAnalyticsEventsService().queue(AnalyticsEventFactory.INSTANCE.subscribeFail(hMSExceptionUnknown$default)).flush();
                        hMSTransport$signalObserver$1.this$0.observer.onNonFatalError(hMSExceptionUnknown$default);
                    }
                    if (transportCallbackTriple != null) {
                        ((C3058t) deferred).completeExceptionally(hMSExceptionUnknown$default);
                    }
                }
            } else {
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sessionDescription2 = (SessionDescription) hMSTransport$signalObserver$1$onOffer$1.L$4;
                hMSSubscribeConnection9 = (HMSSubscribeConnection) hMSTransport$signalObserver$1$onOffer$1.L$3;
                hMSTransport2 = (HMSTransport) hMSTransport$signalObserver$1$onOffer$1.L$2;
                hMSTransport$signalObserver$3 = (HMSTransport$signalObserver$1) hMSTransport$signalObserver$1$onOffer$1.L$0;
                try {
                    AbstractC34132o.m107864I(obj);
                    hMSSubscribeConnection9.getSignal().answer(HMSSessionDescription.INSTANCE.from(sessionDescription2, hMSTransport2.getNodeID()), hMSTransport2.getNodeID());
                    HMSLogger.m71136d("HMSTransport", "[role=SUBSCRIBE] onOffer renegotiation DONE ✅");
                } catch (Exception e14) {
                    exc = e14;
                    hMSTransport$signalObserver$1 = hMSTransport$signalObserver$3;
                    z4 = exc instanceof HMSException;
                    if (!z4) {
                    }
                    HMSLogger.m71136d("HMSTransport", "[role=SUBSCRIBE] onOffer renegotiation FAILED ❌");
                    hMSTransport$signalObserver$1.this$0.setState(TransportState.Failed);
                    if (z4) {
                        ErrorFactory.GenericErrors genericErrors3 = ErrorFactory.GenericErrors.INSTANCE;
                        ErrorFactory.Action action3 = ErrorFactory.Action.SUBSCRIBE;
                        message = exc.getMessage();
                        if (message == null) {
                            message = "Renegotiation with offer received from server failed";
                        }
                        hMSExceptionUnknown$default = ErrorFactory.GenericErrors.Unknown$default(genericErrors3, action3, message, exc, null, 8, null);
                    } else {
                        hMSExceptionUnknown$default = (HMSException) exc;
                    }
                    transportCallbackTriple = (TransportCallbackTriple) hMSTransport$signalObserver$1.this$0.callbacks.remove(HMSConstantsKt.cSubscribeRenegotiationCallback);
                    if (transportCallbackTriple == null) {
                        hMSTransport$signalObserver$1.this$0.getAnalyticsEventsService().queue(AnalyticsEventFactory.INSTANCE.subscribeFail(hMSExceptionUnknown$default)).flush();
                        hMSTransport$signalObserver$1.this$0.observer.onNonFatalError(hMSExceptionUnknown$default);
                    }
                    if (transportCallbackTriple != null) {
                        ((C3058t) deferred).completeExceptionally(hMSExceptionUnknown$default);
                    }
                }
            }
            z4 = exc instanceof HMSException;
            if (!z4 && ((HMSException) exc).getCode() == 421) {
                return c23454a0;
            }
            HMSLogger.m71136d("HMSTransport", "[role=SUBSCRIBE] onOffer renegotiation FAILED ❌");
            hMSTransport$signalObserver$1.this$0.setState(TransportState.Failed);
            if (z4) {
                ErrorFactory.GenericErrors genericErrors4 = ErrorFactory.GenericErrors.INSTANCE;
                ErrorFactory.Action action4 = ErrorFactory.Action.SUBSCRIBE;
                message = exc.getMessage();
                if (message == null) {
                    message = "Renegotiation with offer received from server failed";
                }
                hMSExceptionUnknown$default = ErrorFactory.GenericErrors.Unknown$default(genericErrors4, action4, message, exc, null, 8, null);
            } else {
                hMSExceptionUnknown$default = (HMSException) exc;
            }
            transportCallbackTriple = (TransportCallbackTriple) hMSTransport$signalObserver$1.this$0.callbacks.remove(HMSConstantsKt.cSubscribeRenegotiationCallback);
            if (transportCallbackTriple == null) {
                hMSTransport$signalObserver$1.this$0.getAnalyticsEventsService().queue(AnalyticsEventFactory.INSTANCE.subscribeFail(hMSExceptionUnknown$default)).flush();
                hMSTransport$signalObserver$1.this$0.observer.onNonFatalError(hMSExceptionUnknown$default);
            }
            if (transportCallbackTriple != null && (deferred = transportCallbackTriple.getDeferred()) != null) {
                ((C3058t) deferred).completeExceptionally(hMSExceptionUnknown$default);
            }
        } else {
            AbstractC34132o.m107864I(obj);
            HMSLogger.m71136d("HMSTransport", "[role=SUBSCRIBE] onOffer renegotiation START ⏰");
            if (!this.this$0.isPeerConnectionReady) {
                HMSLogger.m71137e("HMSTransport", "Ignore remote offer since it is called after peer connection is closed or not created yet");
                return c23454a0;
            }
            try {
                HMSSubscribeConnection hMSSubscribeConnection11 = this.this$0.subscribeConnection;
                if (hMSSubscribeConnection11 == null) {
                    AbstractC22676k.m65757q("subscribeConnection");
                    throw null;
                }
                if (hMSSubscribeConnection11.getNativeConnection().connectionState() == PeerConnection.PeerConnectionState.CLOSED) {
                    HMSLogger.INSTANCE.m71141w("HMSTransport", "[role=SUBSCRIBE] remote offer  IGNORED as PeerConnection is closed ❌");
                    return c23454a0;
                }
                hMSSubscribeConnection = this.this$0.subscribeConnection;
                if (hMSSubscribeConnection == null) {
                    AbstractC22676k.m65757q("subscribeConnection");
                    throw null;
                }
                HMSTransport hMSTransport3 = this.this$0;
                SessionDescription sessionDescriptionM134454native = hMSSessionDescription.m134454native();
                hMSTransport$signalObserver$1$onOffer$1.L$0 = this;
                hMSSessionDescription2 = hMSSessionDescription;
                hMSTransport$signalObserver$1$onOffer$1.L$1 = hMSSessionDescription2;
                hMSTransport$signalObserver$1$onOffer$1.L$2 = hMSSubscribeConnection;
                hMSTransport$signalObserver$1$onOffer$1.L$3 = hMSTransport3;
                hMSTransport$signalObserver$1$onOffer$1.L$4 = hMSSubscribeConnection;
                hMSTransport$signalObserver$1$onOffer$1.label = 1;
                if (hMSSubscribeConnection.setRemoteDescription(sessionDescriptionM134454native, hMSTransport$signalObserver$1$onOffer$1) != enumC31071a) {
                    hMSTransport = hMSTransport3;
                    hMSTransport$signalObserver$2 = this;
                    hMSSubscribeConnection2 = hMSSubscribeConnection;
                    HMSLogger.m71136d("HMSTransport", "[SUBSCRIBE] Adding " + hMSSubscribeConnection.getCandidates().size() + " ice-candidates [" + hMSSubscribeConnection.getCandidates() + ']');
                    it = hMSSubscribeConnection.getCandidates().iterator();
                    while (it.hasNext()) {
                        hMSSubscribeConnection.addIceCandidate((IceCandidate) it.next());
                    }
                    hMSSubscribeConnection.getCandidates().clear();
                    if (hMSSessionDescription2.getSfuNodeId() != null) {
                        hMSSubscribeConnection5 = hMSTransport.subscribeConnection;
                        if (hMSSubscribeConnection5 != null) {
                            AbstractC22676k.m65757q("subscribeConnection");
                            throw null;
                        }
                        if (hMSSubscribeConnection5.get_nodeInfo().length() == 0) {
                            sfuNodeId = hMSSessionDescription2.getSfuNodeId();
                            hMSSubscribeConnection6 = hMSTransport.subscribeConnection;
                            if (hMSSubscribeConnection6 != null) {
                                AbstractC22676k.m65757q("subscribeConnection");
                                throw null;
                            }
                            if (!AbstractC22676k.m65745e(sfuNodeId, hMSSubscribeConnection6.get_nodeInfo())) {
                                sb4 = new StringBuilder();
                                sb4.append("[role=SUBSCRIBE] node-mismatch the current peerConnection is old node id :");
                                hMSSubscribeConnection7 = hMSTransport.subscribeConnection;
                                if (hMSSubscribeConnection7 != null) {
                                    AbstractC22676k.m65757q("subscribeConnection");
                                    throw null;
                                }
                                sb4.append(hMSSubscribeConnection7.get_nodeInfo());
                                sb4.append(" and the offer is from node id ");
                                sb4.append(hMSSessionDescription2.getSfuNodeId());
                                sb4.append("  ❌");
                                HMSLogger.m71136d("SFUMIGRATION", sb4.toString());
                                return c23454a0;
                            }
                        }
                    }
                    if (!hMSTransport.isPeerConnectionReady) {
                        HMSLogger.m71137e("HMSTransport", "Ignore remote offer since it is called after peer connection is closed or not created yet");
                        return c23454a0;
                    }
                    MediaConstraints mediaConstraintsMakeSubscribeAnswerConstraints2 = MediaConstraintsFactory.INSTANCE.makeSubscribeAnswerConstraints();
                    hMSTransport$signalObserver$1$onOffer$1.L$0 = hMSTransport$signalObserver$2;
                    hMSTransport$signalObserver$1$onOffer$1.L$1 = hMSSubscribeConnection2;
                    hMSTransport$signalObserver$1$onOffer$1.L$2 = hMSTransport;
                    hMSTransport$signalObserver$1$onOffer$1.L$3 = hMSSubscribeConnection;
                    hMSTransport$signalObserver$1$onOffer$1.L$4 = null;
                    hMSTransport$signalObserver$1$onOffer$1.label = 2;
                    objCreateAnswer = hMSSubscribeConnection.createAnswer(mediaConstraintsMakeSubscribeAnswerConstraints2, hMSTransport$signalObserver$1$onOffer$1);
                    if (objCreateAnswer == enumC31071a) {
                        hMSSubscribeConnection3 = hMSSubscribeConnection2;
                        obj = objCreateAnswer;
                        hMSSubscribeConnection4 = hMSSubscribeConnection;
                        hMSTransport2 = hMSTransport;
                        sessionDescription = (SessionDescription) obj;
                        if (!hMSTransport2.isPeerConnectionReady) {
                            HMSLogger.m71137e("HMSTransport", "Ignore local answer since it is called after peer connection is closed or not created yet");
                            return c23454a0;
                        }
                        hMSSubscribeConnection8 = hMSTransport2.subscribeConnection;
                        if (hMSSubscribeConnection8 == null) {
                            AbstractC22676k.m65757q("subscribeConnection");
                            throw null;
                        }
                        if (hMSSubscribeConnection8.getNativeConnection().connectionState() == PeerConnection.PeerConnectionState.CLOSED) {
                            HMSLogger.INSTANCE.m71141w("HMSTransport", "[role=SUBSCRIBE] local answer as IGNORED as PeerConnection is closed ❌");
                            return c23454a0;
                        }
                        hMSTransport$signalObserver$1$onOffer$1.L$0 = hMSTransport$signalObserver$2;
                        hMSTransport$signalObserver$1$onOffer$1.L$1 = hMSSubscribeConnection3;
                        hMSTransport$signalObserver$1$onOffer$1.L$2 = hMSTransport2;
                        hMSTransport$signalObserver$1$onOffer$1.L$3 = hMSSubscribeConnection4;
                        hMSTransport$signalObserver$1$onOffer$1.L$4 = sessionDescription;
                        hMSTransport$signalObserver$1$onOffer$1.label = 3;
                        if (hMSSubscribeConnection4.setLocalDescription(sessionDescription, hMSTransport$signalObserver$1$onOffer$1) != enumC31071a) {
                            hMSSubscribeConnection9 = hMSSubscribeConnection4;
                            hMSTransport$signalObserver$3 = hMSTransport$signalObserver$2;
                            sessionDescription2 = sessionDescription;
                            hMSSubscribeConnection9.getSignal().answer(HMSSessionDescription.INSTANCE.from(sessionDescription2, hMSTransport2.getNodeID()), hMSTransport2.getNodeID());
                            HMSLogger.m71136d("HMSTransport", "[role=SUBSCRIBE] onOffer renegotiation DONE ✅");
                        }
                    }
                }
                return enumC31071a;
            } catch (Exception e15) {
                exc = e15;
                hMSTransport$signalObserver$1 = this;
                z4 = exc instanceof HMSException;
                if (!z4) {
                }
                HMSLogger.m71136d("HMSTransport", "[role=SUBSCRIBE] onOffer renegotiation FAILED ❌");
                hMSTransport$signalObserver$1.this$0.setState(TransportState.Failed);
                if (z4) {
                    ErrorFactory.GenericErrors genericErrors5 = ErrorFactory.GenericErrors.INSTANCE;
                    ErrorFactory.Action action5 = ErrorFactory.Action.SUBSCRIBE;
                    message = exc.getMessage();
                    if (message == null) {
                        message = "Renegotiation with offer received from server failed";
                    }
                    hMSExceptionUnknown$default = ErrorFactory.GenericErrors.Unknown$default(genericErrors5, action5, message, exc, null, 8, null);
                } else {
                    hMSExceptionUnknown$default = (HMSException) exc;
                }
                transportCallbackTriple = (TransportCallbackTriple) hMSTransport$signalObserver$1.this$0.callbacks.remove(HMSConstantsKt.cSubscribeRenegotiationCallback);
                if (transportCallbackTriple == null) {
                    hMSTransport$signalObserver$1.this$0.getAnalyticsEventsService().queue(AnalyticsEventFactory.INSTANCE.subscribeFail(hMSExceptionUnknown$default)).flush();
                    hMSTransport$signalObserver$1.this$0.observer.onNonFatalError(hMSExceptionUnknown$default);
                }
                if (transportCallbackTriple != null) {
                    ((C3058t) deferred).completeExceptionally(hMSExceptionUnknown$default);
                }
            }
        }
        return c23454a0;
    }

    @Override // live.hms.video.signal.ISignalEventsObserver
    public void onServerError(HMSException error) {
        AbstractC22676k.m65750j(error, "error");
        if (error.getCode() == 41001) {
            AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new HMSTransport$signalObserver$1$onServerError$1(this.this$0, null), 3);
        }
        this.this$0.observer.onStateChange(TransportState.Failed, error);
    }

    @Override // live.hms.video.signal.ISignalEventsObserver
    public void onTrickle(HMSTrickle trickle) {
        HMSConnection hMSConnection;
        AbstractC22676k.m65750j(trickle, "trickle");
        if (!this.this$0.isPeerConnectionReady) {
            HMSLogger.m71137e("HMSTransport", "Ignore trickle since it is called after peer connection is closed or not created yet");
            return;
        }
        int i13 = WhenMappings.$EnumSwitchMapping$0[trickle.getRole().ordinal()];
        if (i13 == 1) {
            hMSConnection = this.this$0.publishConnection;
            if (hMSConnection == null) {
                AbstractC22676k.m65757q("publishConnection");
                throw null;
            }
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            hMSConnection = this.this$0.subscribeConnection;
            if (hMSConnection == null) {
                AbstractC22676k.m65757q("subscribeConnection");
                throw null;
            }
        }
        if (hMSConnection.getRemoteDescription() != null) {
            HMSLogger.m71136d("HMSTransport", "[role=" + hMSConnection.getRole() + "] Adding ice-candidate=" + trickle.getCandidate());
            hMSConnection.addIceCandidate(trickle.getCandidate().m134453native());
            return;
        }
        HMSLogger.m71136d("HMSTransport", "[role=" + hMSConnection.getRole() + "] Queuing ice-candidate=" + trickle.getCandidate());
        hMSConnection.getCandidates().add(trickle.getCandidate().m134453native());
    }
}
