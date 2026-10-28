package io.getstream.chat.android.client.events;

import c13.AbstractC3855a;
import java.util.Date;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m65681d2 = {"Lio/getstream/chat/android/client/events/ConnectingEvent;", "Lio/getstream/chat/android/client/events/ChatEvent;", "type", "", "createdAt", "Ljava/util/Date;", "rawCreatedAt", "<init>", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getCreatedAt", "()Ljava/util/Date;", "getRawCreatedAt", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ConnectingEvent extends ChatEvent {
    private final Date createdAt;
    private final String rawCreatedAt;
    private final String type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectingEvent(String type, Date createdAt, String str) {
        super(null);
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        this.type = type;
        this.createdAt = createdAt;
        this.rawCreatedAt = str;
    }

    public static /* synthetic */ ConnectingEvent copy$default(ConnectingEvent connectingEvent, String str, Date date, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = connectingEvent.type;
        }
        if ((i13 & 2) != 0) {
            date = connectingEvent.createdAt;
        }
        if ((i13 & 4) != 0) {
            str2 = connectingEvent.rawCreatedAt;
        }
        return connectingEvent.copy(str, date, str2);
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

    public final ConnectingEvent copy(String type, Date createdAt, String rawCreatedAt) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        return new ConnectingEvent(type, createdAt, rawCreatedAt);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConnectingEvent)) {
            return false;
        }
        ConnectingEvent connectingEvent = (ConnectingEvent) other;
        return AbstractC22676k.m65745e(this.type, connectingEvent.type) && AbstractC22676k.m65745e(this.createdAt, connectingEvent.createdAt) && AbstractC22676k.m65745e(this.rawCreatedAt, connectingEvent.rawCreatedAt);
    }

    @Override // io.getstream.chat.android.client.events.ChatEvent
    public final Date getCreatedAt() {
        return this.createdAt;
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
        int iM124373c = AbstractC38963t7.m124373c(this.createdAt, this.type.hashCode() * 31, 31);
        String str = this.rawCreatedAt;
        return iM124373c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return AbstractC25012a.m73376i(this.rawCreatedAt, ")", AbstractC3855a.m11830n("ConnectingEvent(type=", this.type, ", createdAt=", this.createdAt, ", rawCreatedAt="));
    }
}
