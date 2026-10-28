package io.getstream.chat.android.client.events;

import c13.AbstractC3855a;
import com.whoop.service.network.model.UserState;
import d13.AbstractC11478a;
import io.getstream.chat.android.models.User;
import java.util.Date;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002BI\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0004HÆ\u0003J\t\u0010 \u001a\u00020\u0004HÆ\u0003J\t\u0010!\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003J[\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0004HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\n\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0014\u0010\u000b\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0014\u0010\f\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011¨\u0006+"}, m65681d2 = {"Lio/getstream/chat/android/client/events/TypingStartEvent;", "Lio/getstream/chat/android/client/events/CidEvent;", "Lio/getstream/chat/android/client/events/UserEvent;", "type", "", "createdAt", "Ljava/util/Date;", "rawCreatedAt", UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "cid", "channelType", "channelId", "parentId", "<init>", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getCreatedAt", "()Ljava/util/Date;", "getRawCreatedAt", "getUser", "()Lio/getstream/chat/android/models/User;", "getCid", "getChannelType", "getChannelId", "getParentId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class TypingStartEvent extends CidEvent implements UserEvent {
    private final String channelId;
    private final String channelType;
    private final String cid;
    private final Date createdAt;
    private final String parentId;
    private final String rawCreatedAt;
    private final String type;
    private final User user;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypingStartEvent(String type, Date createdAt, String rawCreatedAt, User user, String cid, String channelType, String channelId, String str) {
        super(null);
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(rawCreatedAt, "rawCreatedAt");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        this.type = type;
        this.createdAt = createdAt;
        this.rawCreatedAt = rawCreatedAt;
        this.user = user;
        this.cid = cid;
        this.channelType = channelType;
        this.channelId = channelId;
        this.parentId = str;
    }

    public static /* synthetic */ TypingStartEvent copy$default(TypingStartEvent typingStartEvent, String str, Date date, String str2, User user, String str3, String str4, String str5, String str6, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = typingStartEvent.type;
        }
        if ((i13 & 2) != 0) {
            date = typingStartEvent.createdAt;
        }
        if ((i13 & 4) != 0) {
            str2 = typingStartEvent.rawCreatedAt;
        }
        if ((i13 & 8) != 0) {
            user = typingStartEvent.user;
        }
        if ((i13 & 16) != 0) {
            str3 = typingStartEvent.cid;
        }
        if ((i13 & 32) != 0) {
            str4 = typingStartEvent.channelType;
        }
        if ((i13 & 64) != 0) {
            str5 = typingStartEvent.channelId;
        }
        if ((i13 & 128) != 0) {
            str6 = typingStartEvent.parentId;
        }
        String str7 = str5;
        String str8 = str6;
        String str9 = str3;
        String str10 = str4;
        return typingStartEvent.copy(str, date, str2, user, str9, str10, str7, str8);
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
    public final String getParentId() {
        return this.parentId;
    }

    public final TypingStartEvent copy(String type, Date createdAt, String rawCreatedAt, User user, String cid, String channelType, String channelId, String parentId) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(rawCreatedAt, "rawCreatedAt");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return new TypingStartEvent(type, createdAt, rawCreatedAt, user, cid, channelType, channelId, parentId);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TypingStartEvent)) {
            return false;
        }
        TypingStartEvent typingStartEvent = (TypingStartEvent) other;
        return AbstractC22676k.m65745e(this.type, typingStartEvent.type) && AbstractC22676k.m65745e(this.createdAt, typingStartEvent.createdAt) && AbstractC22676k.m65745e(this.rawCreatedAt, typingStartEvent.rawCreatedAt) && AbstractC22676k.m65745e(this.user, typingStartEvent.user) && AbstractC22676k.m65745e(this.cid, typingStartEvent.cid) && AbstractC22676k.m65745e(this.channelType, typingStartEvent.channelType) && AbstractC22676k.m65745e(this.channelId, typingStartEvent.channelId) && AbstractC22676k.m65745e(this.parentId, typingStartEvent.parentId);
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

    public final String getParentId() {
        return this.parentId;
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
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11478a.m30850b(this.user, AbstractC11266d.m30450d(AbstractC38963t7.m124373c(this.createdAt, this.type.hashCode() * 31, 31), 31, this.rawCreatedAt), 31), 31, this.cid), 31, this.channelType), 31, this.channelId);
        String str = this.parentId;
        return iM30450d + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String str = this.type;
        Date date = this.createdAt;
        String str2 = this.rawCreatedAt;
        User user = this.user;
        String str3 = this.cid;
        String str4 = this.channelType;
        String str5 = this.channelId;
        String str6 = this.parentId;
        StringBuilder sbM11830n = AbstractC3855a.m11830n("TypingStartEvent(type=", str, ", createdAt=", date, ", rawCreatedAt=");
        AbstractC11478a.m30866r(sbM11830n, str2, ", user=", user, ", cid=");
        AbstractC11266d.m30444B(sbM11830n, str3, ", channelType=", str4, ", channelId=");
        return AbstractC11266d.m30464r(sbM11830n, str5, ", parentId=", str6, ")");
    }
}
