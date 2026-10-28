package io.getstream.chat.android.client.api2.model.requests;

import io.getstream.chat.android.models.Message;
import java.util.ArrayList;
import java.util.List;
import live.hms.video.utils.HMSFieldTrials;
import m83.AbstractC25267u;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import te0.AbstractC33745d;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/requests/MarkDeliveredRequest;", "", "latest_delivered_messages", "", "Lio/getstream/chat/android/client/api2/model/requests/DeliveredMessageDto;", "<init>", "(Ljava/util/List;)V", "getLatest_delivered_messages", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class MarkDeliveredRequest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final List<DeliveredMessageDto> latest_delivered_messages;

    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¨\u0006\t"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/requests/MarkDeliveredRequest$Companion;", "", "<init>", "()V", "create", "Lio/getstream/chat/android/client/api2/model/requests/MarkDeliveredRequest;", "messages", "", "Lio/getstream/chat/android/models/Message;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MarkDeliveredRequest create(List<Message> messages) {
            AbstractC22676k.m65750j(messages, "messages");
            List<Message> list = messages;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            for (Message message : list) {
                arrayList.add(new DeliveredMessageDto(message.getCid(), message.getId()));
            }
            return new MarkDeliveredRequest(arrayList);
        }

        private Companion() {
        }
    }

    public MarkDeliveredRequest(List<DeliveredMessageDto> latest_delivered_messages) {
        AbstractC22676k.m65750j(latest_delivered_messages, "latest_delivered_messages");
        this.latest_delivered_messages = latest_delivered_messages;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarkDeliveredRequest copy$default(MarkDeliveredRequest markDeliveredRequest, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = markDeliveredRequest.latest_delivered_messages;
        }
        return markDeliveredRequest.copy(list);
    }

    public final List<DeliveredMessageDto> component1() {
        return this.latest_delivered_messages;
    }

    public final MarkDeliveredRequest copy(List<DeliveredMessageDto> latest_delivered_messages) {
        AbstractC22676k.m65750j(latest_delivered_messages, "latest_delivered_messages");
        return new MarkDeliveredRequest(latest_delivered_messages);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MarkDeliveredRequest) && AbstractC22676k.m65745e(this.latest_delivered_messages, ((MarkDeliveredRequest) other).latest_delivered_messages);
    }

    public final List<DeliveredMessageDto> getLatest_delivered_messages() {
        return this.latest_delivered_messages;
    }

    public int hashCode() {
        return this.latest_delivered_messages.hashCode();
    }

    public String toString() {
        return AbstractC33745d.m106654m("MarkDeliveredRequest(latest_delivered_messages=", ")", this.latest_delivered_messages);
    }
}
