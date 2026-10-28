package io.getstream.chat.android.client.api2.model.response;

import androidx.core.app.NotificationCompat;
import io.getstream.chat.android.client.api2.model.dto.ChatEventDto;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import live.hms.video.utils.HMSFieldTrials;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/response/EventResponse;", "", NotificationCompat.CATEGORY_EVENT, "Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;", AttachmentExtensionsKt.EXTRA_DURATION, "", "<init>", "(Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;Ljava/lang/String;)V", "getEvent", "()Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;", "getDuration", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class EventResponse {
    private final String duration;
    private final ChatEventDto event;

    public EventResponse(ChatEventDto event, String duration) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(duration, "duration");
        this.event = event;
        this.duration = duration;
    }

    public static /* synthetic */ EventResponse copy$default(EventResponse eventResponse, ChatEventDto chatEventDto, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            chatEventDto = eventResponse.event;
        }
        if ((i13 & 2) != 0) {
            str = eventResponse.duration;
        }
        return eventResponse.copy(chatEventDto, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ChatEventDto getEvent() {
        return this.event;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDuration() {
        return this.duration;
    }

    public final EventResponse copy(ChatEventDto event, String duration) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(duration, "duration");
        return new EventResponse(event, duration);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventResponse)) {
            return false;
        }
        EventResponse eventResponse = (EventResponse) other;
        return AbstractC22676k.m65745e(this.event, eventResponse.event) && AbstractC22676k.m65745e(this.duration, eventResponse.duration);
    }

    public final String getDuration() {
        return this.duration;
    }

    public final ChatEventDto getEvent() {
        return this.event;
    }

    public int hashCode() {
        return this.duration.hashCode() + (this.event.hashCode() * 31);
    }

    public String toString() {
        return "EventResponse(event=" + this.event + ", duration=" + this.duration + ")";
    }
}
