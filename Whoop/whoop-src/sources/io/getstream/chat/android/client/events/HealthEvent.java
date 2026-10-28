package io.getstream.chat.android.client.events;

import c13.AbstractC3855a;
import java.util.Date;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, m65681d2 = {"Lio/getstream/chat/android/client/events/HealthEvent;", "Lio/getstream/chat/android/client/events/ChatEvent;", "type", "", "createdAt", "Ljava/util/Date;", "rawCreatedAt", "connectionId", "<init>", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getCreatedAt", "()Ljava/util/Date;", "getRawCreatedAt", "getConnectionId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class HealthEvent extends ChatEvent {
    private final String connectionId;
    private final Date createdAt;
    private final String rawCreatedAt;
    private final String type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HealthEvent(String type, Date createdAt, String rawCreatedAt, String connectionId) {
        super(null);
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(rawCreatedAt, "rawCreatedAt");
        AbstractC22676k.m65750j(connectionId, "connectionId");
        this.type = type;
        this.createdAt = createdAt;
        this.rawCreatedAt = rawCreatedAt;
        this.connectionId = connectionId;
    }

    public static /* synthetic */ HealthEvent copy$default(HealthEvent healthEvent, String str, Date date, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = healthEvent.type;
        }
        if ((i13 & 2) != 0) {
            date = healthEvent.createdAt;
        }
        if ((i13 & 4) != 0) {
            str2 = healthEvent.rawCreatedAt;
        }
        if ((i13 & 8) != 0) {
            str3 = healthEvent.connectionId;
        }
        return healthEvent.copy(str, date, str2, str3);
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
    public final String getConnectionId() {
        return this.connectionId;
    }

    public final HealthEvent copy(String type, Date createdAt, String rawCreatedAt, String connectionId) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(rawCreatedAt, "rawCreatedAt");
        AbstractC22676k.m65750j(connectionId, "connectionId");
        return new HealthEvent(type, createdAt, rawCreatedAt, connectionId);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthEvent)) {
            return false;
        }
        HealthEvent healthEvent = (HealthEvent) other;
        return AbstractC22676k.m65745e(this.type, healthEvent.type) && AbstractC22676k.m65745e(this.createdAt, healthEvent.createdAt) && AbstractC22676k.m65745e(this.rawCreatedAt, healthEvent.rawCreatedAt) && AbstractC22676k.m65745e(this.connectionId, healthEvent.connectionId);
    }

    public final String getConnectionId() {
        return this.connectionId;
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
        return this.connectionId.hashCode() + AbstractC11266d.m30450d(AbstractC38963t7.m124373c(this.createdAt, this.type.hashCode() * 31, 31), 31, this.rawCreatedAt);
    }

    public final String toString() {
        String str = this.type;
        Date date = this.createdAt;
        return AbstractC11266d.m30464r(AbstractC3855a.m11830n("HealthEvent(type=", str, ", createdAt=", date, ", rawCreatedAt="), this.rawCreatedAt, ", connectionId=", this.connectionId, ")");
    }
}
