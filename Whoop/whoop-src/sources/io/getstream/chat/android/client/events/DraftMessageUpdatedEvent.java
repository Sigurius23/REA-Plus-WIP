package io.getstream.chat.android.client.events;

import c13.AbstractC3855a;
import io.getstream.chat.android.models.DraftMessage;
import java.util.Date;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, m65681d2 = {"Lio/getstream/chat/android/client/events/DraftMessageUpdatedEvent;", "Lio/getstream/chat/android/client/events/ChatEvent;", "type", "", "createdAt", "Ljava/util/Date;", "rawCreatedAt", "draftMessage", "Lio/getstream/chat/android/models/DraftMessage;", "<init>", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lio/getstream/chat/android/models/DraftMessage;)V", "getType", "()Ljava/lang/String;", "getCreatedAt", "()Ljava/util/Date;", "getRawCreatedAt", "getDraftMessage", "()Lio/getstream/chat/android/models/DraftMessage;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class DraftMessageUpdatedEvent extends ChatEvent {
    private final Date createdAt;
    private final DraftMessage draftMessage;
    private final String rawCreatedAt;
    private final String type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraftMessageUpdatedEvent(String type, Date createdAt, String rawCreatedAt, DraftMessage draftMessage) {
        super(null);
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(rawCreatedAt, "rawCreatedAt");
        AbstractC22676k.m65750j(draftMessage, "draftMessage");
        this.type = type;
        this.createdAt = createdAt;
        this.rawCreatedAt = rawCreatedAt;
        this.draftMessage = draftMessage;
    }

    public static /* synthetic */ DraftMessageUpdatedEvent copy$default(DraftMessageUpdatedEvent draftMessageUpdatedEvent, String str, Date date, String str2, DraftMessage draftMessage, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = draftMessageUpdatedEvent.type;
        }
        if ((i13 & 2) != 0) {
            date = draftMessageUpdatedEvent.createdAt;
        }
        if ((i13 & 4) != 0) {
            str2 = draftMessageUpdatedEvent.rawCreatedAt;
        }
        if ((i13 & 8) != 0) {
            draftMessage = draftMessageUpdatedEvent.draftMessage;
        }
        return draftMessageUpdatedEvent.copy(str, date, str2, draftMessage);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRawCreatedAt() {
        return this.rawCreatedAt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final DraftMessage getDraftMessage() {
        return this.draftMessage;
    }

    public final DraftMessageUpdatedEvent copy(String type, Date createdAt, String rawCreatedAt, DraftMessage draftMessage) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(rawCreatedAt, "rawCreatedAt");
        AbstractC22676k.m65750j(draftMessage, "draftMessage");
        return new DraftMessageUpdatedEvent(type, createdAt, rawCreatedAt, draftMessage);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DraftMessageUpdatedEvent)) {
            return false;
        }
        DraftMessageUpdatedEvent draftMessageUpdatedEvent = (DraftMessageUpdatedEvent) other;
        return AbstractC22676k.m65745e(this.type, draftMessageUpdatedEvent.type) && AbstractC22676k.m65745e(this.createdAt, draftMessageUpdatedEvent.createdAt) && AbstractC22676k.m65745e(this.rawCreatedAt, draftMessageUpdatedEvent.rawCreatedAt) && AbstractC22676k.m65745e(this.draftMessage, draftMessageUpdatedEvent.draftMessage);
    }

    @Override // io.getstream.chat.android.client.events.ChatEvent
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final DraftMessage getDraftMessage() {
        return this.draftMessage;
    }

    @Override // io.getstream.chat.android.client.events.ChatEvent
    public final String getRawCreatedAt() {
        return this.rawCreatedAt;
    }

    @Override // io.getstream.chat.android.client.events.ChatEvent
    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        return this.draftMessage.hashCode() + AbstractC11266d.m30450d(AbstractC38963t7.m124373c(this.createdAt, this.type.hashCode() * 31, 31), 31, this.rawCreatedAt);
    }

    public final String toString() {
        String str = this.type;
        Date date = this.createdAt;
        String str2 = this.rawCreatedAt;
        DraftMessage draftMessage = this.draftMessage;
        StringBuilder sbM11830n = AbstractC3855a.m11830n("DraftMessageUpdatedEvent(type=", str, ", createdAt=", date, ", rawCreatedAt=");
        sbM11830n.append(str2);
        sbM11830n.append(", draftMessage=");
        sbM11830n.append(draftMessage);
        sbM11830n.append(")");
        return sbM11830n.toString();
    }
}
