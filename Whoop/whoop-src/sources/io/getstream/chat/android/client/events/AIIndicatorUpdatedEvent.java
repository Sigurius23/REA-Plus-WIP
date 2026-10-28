package io.getstream.chat.android.client.events;

import c13.AbstractC3855a;
import com.whoop.service.network.model.UserState;
import d13.AbstractC11478a;
import io.getstream.chat.android.models.User;
import java.util.Date;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\u0004HÆ\u0003J\t\u0010\"\u001a\u00020\u0004HÆ\u0003J\t\u0010#\u001a\u00020\u0004HÆ\u0003J\t\u0010$\u001a\u00020\u0004HÆ\u0003J\t\u0010%\u001a\u00020\u0004HÆ\u0003Je\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u0004HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0004HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\n\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0014\u0010\u000b\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0014\u0010\f\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012¨\u0006."}, m65681d2 = {"Lio/getstream/chat/android/client/events/AIIndicatorUpdatedEvent;", "Lio/getstream/chat/android/client/events/CidEvent;", "Lio/getstream/chat/android/client/events/UserEvent;", "type", "", "createdAt", "Ljava/util/Date;", "rawCreatedAt", UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "cid", "channelType", "channelId", "aiState", "messageId", "<init>", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getCreatedAt", "()Ljava/util/Date;", "getRawCreatedAt", "getUser", "()Lio/getstream/chat/android/models/User;", "getCid", "getChannelType", "getChannelId", "getAiState", "getMessageId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class AIIndicatorUpdatedEvent extends CidEvent implements UserEvent {
    private final String aiState;
    private final String channelId;
    private final String channelType;
    private final String cid;
    private final Date createdAt;
    private final String messageId;
    private final String rawCreatedAt;
    private final String type;
    private final User user;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIIndicatorUpdatedEvent(String type, Date createdAt, String str, User user, String cid, String channelType, String channelId, String aiState, String messageId) {
        super(null);
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(aiState, "aiState");
        AbstractC22676k.m65750j(messageId, "messageId");
        this.type = type;
        this.createdAt = createdAt;
        this.rawCreatedAt = str;
        this.user = user;
        this.cid = cid;
        this.channelType = channelType;
        this.channelId = channelId;
        this.aiState = aiState;
        this.messageId = messageId;
    }

    public static /* synthetic */ AIIndicatorUpdatedEvent copy$default(AIIndicatorUpdatedEvent aIIndicatorUpdatedEvent, String str, Date date, String str2, User user, String str3, String str4, String str5, String str6, String str7, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = aIIndicatorUpdatedEvent.type;
        }
        if ((i13 & 2) != 0) {
            date = aIIndicatorUpdatedEvent.createdAt;
        }
        if ((i13 & 4) != 0) {
            str2 = aIIndicatorUpdatedEvent.rawCreatedAt;
        }
        if ((i13 & 8) != 0) {
            user = aIIndicatorUpdatedEvent.user;
        }
        if ((i13 & 16) != 0) {
            str3 = aIIndicatorUpdatedEvent.cid;
        }
        if ((i13 & 32) != 0) {
            str4 = aIIndicatorUpdatedEvent.channelType;
        }
        if ((i13 & 64) != 0) {
            str5 = aIIndicatorUpdatedEvent.channelId;
        }
        if ((i13 & 128) != 0) {
            str6 = aIIndicatorUpdatedEvent.aiState;
        }
        if ((i13 & 256) != 0) {
            str7 = aIIndicatorUpdatedEvent.messageId;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str4;
        String str11 = str5;
        String str12 = str3;
        String str13 = str2;
        return aIIndicatorUpdatedEvent.copy(str, date, str13, user, str12, str10, str11, str8, str9);
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

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCid() {
        return this.cid;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getChannelType() {
        return this.channelType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getAiState() {
        return this.aiState;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    public final AIIndicatorUpdatedEvent copy(String type, Date createdAt, String rawCreatedAt, User user, String cid, String channelType, String channelId, String aiState, String messageId) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(aiState, "aiState");
        AbstractC22676k.m65750j(messageId, "messageId");
        return new AIIndicatorUpdatedEvent(type, createdAt, rawCreatedAt, user, cid, channelType, channelId, aiState, messageId);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AIIndicatorUpdatedEvent)) {
            return false;
        }
        AIIndicatorUpdatedEvent aIIndicatorUpdatedEvent = (AIIndicatorUpdatedEvent) other;
        return AbstractC22676k.m65745e(this.type, aIIndicatorUpdatedEvent.type) && AbstractC22676k.m65745e(this.createdAt, aIIndicatorUpdatedEvent.createdAt) && AbstractC22676k.m65745e(this.rawCreatedAt, aIIndicatorUpdatedEvent.rawCreatedAt) && AbstractC22676k.m65745e(this.user, aIIndicatorUpdatedEvent.user) && AbstractC22676k.m65745e(this.cid, aIIndicatorUpdatedEvent.cid) && AbstractC22676k.m65745e(this.channelType, aIIndicatorUpdatedEvent.channelType) && AbstractC22676k.m65745e(this.channelId, aIIndicatorUpdatedEvent.channelId) && AbstractC22676k.m65745e(this.aiState, aIIndicatorUpdatedEvent.aiState) && AbstractC22676k.m65745e(this.messageId, aIIndicatorUpdatedEvent.messageId);
    }

    public final String getAiState() {
        return this.aiState;
    }

    @Override // io.getstream.chat.android.client.events.CidEvent
    public final String getChannelId() {
        return this.channelId;
    }

    @Override // io.getstream.chat.android.client.events.CidEvent
    public final String getChannelType() {
        return this.channelType;
    }

    @Override // io.getstream.chat.android.client.events.CidEvent
    public final String getCid() {
        return this.cid;
    }

    @Override // io.getstream.chat.android.client.events.ChatEvent
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    @Override // io.getstream.chat.android.client.events.ChatEvent
    public final String getRawCreatedAt() {
        return this.rawCreatedAt;
    }

    @Override // io.getstream.chat.android.client.events.ChatEvent
    public final String getType() {
        return this.type;
    }

    @Override // io.getstream.chat.android.client.events.UserEvent
    public final User getUser() {
        return this.user;
    }

    public final int hashCode() {
        int iM124373c = AbstractC38963t7.m124373c(this.createdAt, this.type.hashCode() * 31, 31);
        String str = this.rawCreatedAt;
        return this.messageId.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11478a.m30850b(this.user, (iM124373c + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.cid), 31, this.channelType), 31, this.channelId), 31, this.aiState);
    }

    public final String toString() {
        String str = this.type;
        Date date = this.createdAt;
        String str2 = this.rawCreatedAt;
        User user = this.user;
        String str3 = this.cid;
        String str4 = this.channelType;
        String str5 = this.channelId;
        String str6 = this.aiState;
        String str7 = this.messageId;
        StringBuilder sbM11830n = AbstractC3855a.m11830n("AIIndicatorUpdatedEvent(type=", str, ", createdAt=", date, ", rawCreatedAt=");
        AbstractC11478a.m30866r(sbM11830n, str2, ", user=", user, ", cid=");
        AbstractC11266d.m30444B(sbM11830n, str3, ", channelType=", str4, ", channelId=");
        AbstractC11266d.m30444B(sbM11830n, str5, ", aiState=", str6, ", messageId=");
        return AbstractC25012a.m73376i(str7, ")", sbM11830n);
    }
}
