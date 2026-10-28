package io.getstream.chat.android.client.events;

import c13.AbstractC3855a;
import io.getstream.chat.android.client.clientstate.DisconnectCause;
import java.util.Date;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, m65681d2 = {"Lio/getstream/chat/android/client/events/DisconnectedEvent;", "Lio/getstream/chat/android/client/events/ChatEvent;", "type", "", "createdAt", "Ljava/util/Date;", "rawCreatedAt", "disconnectCause", "Lio/getstream/chat/android/client/clientstate/DisconnectCause;", "<init>", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lio/getstream/chat/android/client/clientstate/DisconnectCause;)V", "getType", "()Ljava/lang/String;", "getCreatedAt", "()Ljava/util/Date;", "getRawCreatedAt", "getDisconnectCause", "()Lio/getstream/chat/android/client/clientstate/DisconnectCause;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class DisconnectedEvent extends ChatEvent {
    private final Date createdAt;
    private final DisconnectCause disconnectCause;
    private final String rawCreatedAt;
    private final String type;

    public /* synthetic */ DisconnectedEvent(String str, Date date, String str2, DisconnectCause disconnectCause, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, date, str2, (i13 & 8) != 0 ? DisconnectCause.NetworkNotAvailable.INSTANCE : disconnectCause);
    }

    public static /* synthetic */ DisconnectedEvent copy$default(DisconnectedEvent disconnectedEvent, String str, Date date, String str2, DisconnectCause disconnectCause, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = disconnectedEvent.type;
        }
        if ((i13 & 2) != 0) {
            date = disconnectedEvent.createdAt;
        }
        if ((i13 & 4) != 0) {
            str2 = disconnectedEvent.rawCreatedAt;
        }
        if ((i13 & 8) != 0) {
            disconnectCause = disconnectedEvent.disconnectCause;
        }
        return disconnectedEvent.copy(str, date, str2, disconnectCause);
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
    public final DisconnectCause getDisconnectCause() {
        return this.disconnectCause;
    }

    public final DisconnectedEvent copy(String type, Date createdAt, String rawCreatedAt, DisconnectCause disconnectCause) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(disconnectCause, "disconnectCause");
        return new DisconnectedEvent(type, createdAt, rawCreatedAt, disconnectCause);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisconnectedEvent)) {
            return false;
        }
        DisconnectedEvent disconnectedEvent = (DisconnectedEvent) other;
        return AbstractC22676k.m65745e(this.type, disconnectedEvent.type) && AbstractC22676k.m65745e(this.createdAt, disconnectedEvent.createdAt) && AbstractC22676k.m65745e(this.rawCreatedAt, disconnectedEvent.rawCreatedAt) && AbstractC22676k.m65745e(this.disconnectCause, disconnectedEvent.disconnectCause);
    }

    @Override // io.getstream.chat.android.client.events.ChatEvent
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final DisconnectCause getDisconnectCause() {
        return this.disconnectCause;
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
        return this.disconnectCause.hashCode() + ((iM124373c + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        String str = this.type;
        Date date = this.createdAt;
        String str2 = this.rawCreatedAt;
        DisconnectCause disconnectCause = this.disconnectCause;
        StringBuilder sbM11830n = AbstractC3855a.m11830n("DisconnectedEvent(type=", str, ", createdAt=", date, ", rawCreatedAt=");
        sbM11830n.append(str2);
        sbM11830n.append(", disconnectCause=");
        sbM11830n.append(disconnectCause);
        sbM11830n.append(")");
        return sbM11830n.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisconnectedEvent(String type, Date createdAt, String str, DisconnectCause disconnectCause) {
        super(null);
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(disconnectCause, "disconnectCause");
        this.type = type;
        this.createdAt = createdAt;
        this.rawCreatedAt = str;
        this.disconnectCause = disconnectCause;
    }
}
