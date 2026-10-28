package io.getstream.chat.android.client.events;

import c13.AbstractC3855a;
import com.whoop.service.network.model.UserState;
import d13.AbstractC11478a;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.User;
import java.util.Date;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BG\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u000fHÆ\u0003JY\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0014\u0010\f\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0014\u0010\r\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006."}, m65681d2 = {"Lio/getstream/chat/android/client/events/MemberAddedEvent;", "Lio/getstream/chat/android/client/events/CidEvent;", "Lio/getstream/chat/android/client/events/UserEvent;", "Lio/getstream/chat/android/client/events/HasMember;", "type", "", "createdAt", "Ljava/util/Date;", "rawCreatedAt", UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "cid", "channelType", "channelId", "member", "Lio/getstream/chat/android/models/Member;", "<init>", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Member;)V", "getType", "()Ljava/lang/String;", "getCreatedAt", "()Ljava/util/Date;", "getRawCreatedAt", "getUser", "()Lio/getstream/chat/android/models/User;", "getCid", "getChannelType", "getChannelId", "getMember", "()Lio/getstream/chat/android/models/Member;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class MemberAddedEvent extends CidEvent implements UserEvent, HasMember {
    private final String channelId;
    private final String channelType;
    private final String cid;
    private final Date createdAt;
    private final Member member;
    private final String rawCreatedAt;
    private final String type;
    private final User user;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemberAddedEvent(String type, Date createdAt, String rawCreatedAt, User user, String cid, String channelType, String channelId, Member member) {
        super(null);
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(rawCreatedAt, "rawCreatedAt");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(member, "member");
        this.type = type;
        this.createdAt = createdAt;
        this.rawCreatedAt = rawCreatedAt;
        this.user = user;
        this.cid = cid;
        this.channelType = channelType;
        this.channelId = channelId;
        this.member = member;
    }

    public static /* synthetic */ MemberAddedEvent copy$default(MemberAddedEvent memberAddedEvent, String str, Date date, String str2, User user, String str3, String str4, String str5, Member member, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = memberAddedEvent.type;
        }
        if ((i13 & 2) != 0) {
            date = memberAddedEvent.createdAt;
        }
        if ((i13 & 4) != 0) {
            str2 = memberAddedEvent.rawCreatedAt;
        }
        if ((i13 & 8) != 0) {
            user = memberAddedEvent.user;
        }
        if ((i13 & 16) != 0) {
            str3 = memberAddedEvent.cid;
        }
        if ((i13 & 32) != 0) {
            str4 = memberAddedEvent.channelType;
        }
        if ((i13 & 64) != 0) {
            str5 = memberAddedEvent.channelId;
        }
        if ((i13 & 128) != 0) {
            member = memberAddedEvent.member;
        }
        String str6 = str5;
        Member member2 = member;
        String str7 = str3;
        String str8 = str4;
        return memberAddedEvent.copy(str, date, str2, user, str7, str8, str6, member2);
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
    public final Member getMember() {
        return this.member;
    }

    public final MemberAddedEvent copy(String type, Date createdAt, String rawCreatedAt, User user, String cid, String channelType, String channelId, Member member) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(rawCreatedAt, "rawCreatedAt");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(member, "member");
        return new MemberAddedEvent(type, createdAt, rawCreatedAt, user, cid, channelType, channelId, member);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MemberAddedEvent)) {
            return false;
        }
        MemberAddedEvent memberAddedEvent = (MemberAddedEvent) other;
        return AbstractC22676k.m65745e(this.type, memberAddedEvent.type) && AbstractC22676k.m65745e(this.createdAt, memberAddedEvent.createdAt) && AbstractC22676k.m65745e(this.rawCreatedAt, memberAddedEvent.rawCreatedAt) && AbstractC22676k.m65745e(this.user, memberAddedEvent.user) && AbstractC22676k.m65745e(this.cid, memberAddedEvent.cid) && AbstractC22676k.m65745e(this.channelType, memberAddedEvent.channelType) && AbstractC22676k.m65745e(this.channelId, memberAddedEvent.channelId) && AbstractC22676k.m65745e(this.member, memberAddedEvent.member);
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

    @Override // io.getstream.chat.android.client.events.HasMember
    public final Member getMember() {
        return this.member;
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
        return this.member.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11478a.m30850b(this.user, AbstractC11266d.m30450d(AbstractC38963t7.m124373c(this.createdAt, this.type.hashCode() * 31, 31), 31, this.rawCreatedAt), 31), 31, this.cid), 31, this.channelType), 31, this.channelId);
    }

    public final String toString() {
        String str = this.type;
        Date date = this.createdAt;
        String str2 = this.rawCreatedAt;
        User user = this.user;
        String str3 = this.cid;
        String str4 = this.channelType;
        String str5 = this.channelId;
        Member member = this.member;
        StringBuilder sbM11830n = AbstractC3855a.m11830n("MemberAddedEvent(type=", str, ", createdAt=", date, ", rawCreatedAt=");
        AbstractC11478a.m30866r(sbM11830n, str2, ", user=", user, ", cid=");
        AbstractC11266d.m30444B(sbM11830n, str3, ", channelType=", str4, ", channelId=");
        sbM11830n.append(str5);
        sbM11830n.append(", member=");
        sbM11830n.append(member);
        sbM11830n.append(")");
        return sbM11830n.toString();
    }
}
