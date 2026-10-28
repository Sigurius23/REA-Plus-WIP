package io.getstream.chat.android.client.events;

import c13.AbstractC3855a;
import com.whoop.service.network.model.UserState;
import d13.AbstractC11478a;
import io.getstream.chat.android.models.User;
import java.util.Date;
import java.util.Map;
import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\t\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\nHÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\t\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, m65681d2 = {"Lio/getstream/chat/android/client/events/UnknownEvent;", "Lio/getstream/chat/android/client/events/ChatEvent;", "type", "", "createdAt", "Ljava/util/Date;", "rawCreatedAt", UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "rawData", "", "<init>", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lio/getstream/chat/android/models/User;Ljava/util/Map;)V", "getType", "()Ljava/lang/String;", "getCreatedAt", "()Ljava/util/Date;", "getRawCreatedAt", "getUser", "()Lio/getstream/chat/android/models/User;", "getRawData", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class UnknownEvent extends ChatEvent {
    private final Date createdAt;
    private final String rawCreatedAt;
    private final Map<?, ?> rawData;
    private final String type;
    private final User user;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnknownEvent(String type, Date createdAt, String rawCreatedAt, User user, Map<?, ?> rawData) {
        super(null);
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(rawCreatedAt, "rawCreatedAt");
        AbstractC22676k.m65750j(rawData, "rawData");
        this.type = type;
        this.createdAt = createdAt;
        this.rawCreatedAt = rawCreatedAt;
        this.user = user;
        this.rawData = rawData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UnknownEvent copy$default(UnknownEvent unknownEvent, String str, Date date, String str2, User user, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = unknownEvent.type;
        }
        if ((i13 & 2) != 0) {
            date = unknownEvent.createdAt;
        }
        if ((i13 & 4) != 0) {
            str2 = unknownEvent.rawCreatedAt;
        }
        if ((i13 & 8) != 0) {
            user = unknownEvent.user;
        }
        if ((i13 & 16) != 0) {
            map = unknownEvent.rawData;
        }
        Map map2 = map;
        String str3 = str2;
        return unknownEvent.copy(str, date, str3, user, map2);
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
    public final User getUser() {
        return this.user;
    }

    public final Map<?, ?> component5() {
        return this.rawData;
    }

    public final UnknownEvent copy(String type, Date createdAt, String rawCreatedAt, User user, Map<?, ?> rawData) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(rawCreatedAt, "rawCreatedAt");
        AbstractC22676k.m65750j(rawData, "rawData");
        return new UnknownEvent(type, createdAt, rawCreatedAt, user, rawData);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnknownEvent)) {
            return false;
        }
        UnknownEvent unknownEvent = (UnknownEvent) other;
        return AbstractC22676k.m65745e(this.type, unknownEvent.type) && AbstractC22676k.m65745e(this.createdAt, unknownEvent.createdAt) && AbstractC22676k.m65745e(this.rawCreatedAt, unknownEvent.rawCreatedAt) && AbstractC22676k.m65745e(this.user, unknownEvent.user) && AbstractC22676k.m65745e(this.rawData, unknownEvent.rawData);
    }

    @Override // io.getstream.chat.android.client.events.ChatEvent
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    @Override // io.getstream.chat.android.client.events.ChatEvent
    public final String getRawCreatedAt() {
        return this.rawCreatedAt;
    }

    public final Map<?, ?> getRawData() {
        return this.rawData;
    }

    @Override // io.getstream.chat.android.client.events.ChatEvent
    public final String getType() {
        return this.type;
    }

    public final User getUser() {
        return this.user;
    }

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC38963t7.m124373c(this.createdAt, this.type.hashCode() * 31, 31), 31, this.rawCreatedAt);
        User user = this.user;
        return this.rawData.hashCode() + ((iM30450d + (user == null ? 0 : user.hashCode())) * 31);
    }

    public final String toString() {
        String str = this.type;
        Date date = this.createdAt;
        String str2 = this.rawCreatedAt;
        User user = this.user;
        Map<?, ?> map = this.rawData;
        StringBuilder sbM11830n = AbstractC3855a.m11830n("UnknownEvent(type=", str, ", createdAt=", date, ", rawCreatedAt=");
        AbstractC11478a.m30866r(sbM11830n, str2, ", user=", user, ", rawData=");
        return AbstractC13673n.m38565l(sbM11830n, map, ")");
    }
}
