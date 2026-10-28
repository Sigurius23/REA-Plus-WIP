package live.hms.video.signal;

import bc3.InterfaceC3055s;
import com.google.gson.JsonObject;
import l83.C23454a0;
import live.hms.video.connection.models.HMSSessionDescription;
import live.hms.video.connection.models.HMSTrickle;
import live.hms.video.error.HMSException;
import live.hms.video.transport.models.TransportFailureCategory;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH¦@¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u000fH&¢\u0006\u0004\b\u0014\u0010\u0012J \u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u0015H¦@¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Llive/hms/video/signal/ISignalEventsObserver;", "", "Llive/hms/video/connection/models/HMSSessionDescription;", "jsep", "Ll83/a0;", "onOffer", "(Llive/hms/video/connection/models/HMSSessionDescription;Lq83/d;)Ljava/lang/Object;", "Llive/hms/video/connection/models/HMSTrickle;", "trickle", "onTrickle", "(Llive/hms/video/connection/models/HMSTrickle;)V", "Lcom/google/gson/JsonObject;", "message", "onNotification", "(Lcom/google/gson/JsonObject;Lq83/d;)Ljava/lang/Object;", "Llive/hms/video/error/HMSException;", "error", "onServerError", "(Llive/hms/video/error/HMSException;)V", "exception", "onFailure", "Llive/hms/video/transport/models/TransportFailureCategory;", "tfc", "Lbc3/s;", "", "getDependency", "(Llive/hms/video/transport/models/TransportFailureCategory;Lq83/d;)Ljava/lang/Object;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public interface ISignalEventsObserver {
    Object getDependency(TransportFailureCategory transportFailureCategory, InterfaceC30057d<? super InterfaceC3055s> interfaceC30057d);

    void onFailure(HMSException exception);

    Object onNotification(JsonObject jsonObject, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object onOffer(HMSSessionDescription hMSSessionDescription, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    void onServerError(HMSException error);

    void onTrickle(HMSTrickle trickle);
}
