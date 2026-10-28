package io.getstream.chat.android.client.api2.model.requests;

import androidx.core.app.NotificationCompat;
import java.util.Map;
import live.hms.video.utils.HMSFieldTrials;
import nh3.AbstractC26725a;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003J\u001f\u0010\t\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/requests/SendEventRequest;", "", NotificationCompat.CATEGORY_EVENT, "", "<init>", "(Ljava/util/Map;)V", "getEvent", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class SendEventRequest {
    private final Map<Object, Object> event;

    public SendEventRequest(Map<Object, ? extends Object> event) {
        AbstractC22676k.m65750j(event, "event");
        this.event = event;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SendEventRequest copy$default(SendEventRequest sendEventRequest, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            map = sendEventRequest.event;
        }
        return sendEventRequest.copy(map);
    }

    public final Map<Object, Object> component1() {
        return this.event;
    }

    public final SendEventRequest copy(Map<Object, ? extends Object> event) {
        AbstractC22676k.m65750j(event, "event");
        return new SendEventRequest(event);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SendEventRequest) && AbstractC22676k.m65745e(this.event, ((SendEventRequest) other).event);
    }

    public final Map<Object, Object> getEvent() {
        return this.event;
    }

    public int hashCode() {
        return this.event.hashCode();
    }

    public String toString() {
        return AbstractC26725a.m79504h("SendEventRequest(event=", ")", this.event);
    }
}
