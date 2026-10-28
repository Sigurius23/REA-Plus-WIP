package io.getstream.chat.android.models;

import com.whoop.service.network.model.UserState;
import java.util.Date;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003JY\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010$\u001a\u00020\u000b2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006)"}, m65681d2 = {"Lio/getstream/chat/android/models/BannedUser;", "", UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "bannedBy", "channel", "Lio/getstream/chat/android/models/Channel;", "createdAt", "Ljava/util/Date;", "expires", "shadow", "", "reason", "", "<init>", "(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Channel;Ljava/util/Date;Ljava/util/Date;ZLjava/lang/String;)V", "getUser", "()Lio/getstream/chat/android/models/User;", "getBannedBy", "getChannel", "()Lio/getstream/chat/android/models/Channel;", "getCreatedAt", "()Ljava/util/Date;", "getExpires", "getShadow", "()Z", "getReason", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class BannedUser {
    private final User bannedBy;
    private final Channel channel;
    private final Date createdAt;
    private final Date expires;
    private final String reason;
    private final boolean shadow;
    private final User user;

    public BannedUser(User user, User user2, Channel channel, Date date, Date date2, boolean z4, String str) {
        AbstractC22676k.m65750j(user, "user");
        this.user = user;
        this.bannedBy = user2;
        this.channel = channel;
        this.createdAt = date;
        this.expires = date2;
        this.shadow = z4;
        this.reason = str;
    }

    public static /* synthetic */ BannedUser copy$default(BannedUser bannedUser, User user, User user2, Channel channel, Date date, Date date2, boolean z4, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            user = bannedUser.user;
        }
        if ((i13 & 2) != 0) {
            user2 = bannedUser.bannedBy;
        }
        if ((i13 & 4) != 0) {
            channel = bannedUser.channel;
        }
        if ((i13 & 8) != 0) {
            date = bannedUser.createdAt;
        }
        if ((i13 & 16) != 0) {
            date2 = bannedUser.expires;
        }
        if ((i13 & 32) != 0) {
            z4 = bannedUser.shadow;
        }
        if ((i13 & 64) != 0) {
            str = bannedUser.reason;
        }
        boolean z13 = z4;
        String str2 = str;
        Date date3 = date2;
        Channel channel2 = channel;
        return bannedUser.copy(user, user2, channel2, date, date3, z13, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final User getBannedBy() {
        return this.bannedBy;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Channel getChannel() {
        return this.channel;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Date getExpires() {
        return this.expires;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getShadow() {
        return this.shadow;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    public final BannedUser copy(User user, User bannedBy, Channel channel, Date createdAt, Date expires, boolean shadow, String reason) {
        AbstractC22676k.m65750j(user, "user");
        return new BannedUser(user, bannedBy, channel, createdAt, expires, shadow, reason);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BannedUser)) {
            return false;
        }
        BannedUser bannedUser = (BannedUser) other;
        return AbstractC22676k.m65745e(this.user, bannedUser.user) && AbstractC22676k.m65745e(this.bannedBy, bannedUser.bannedBy) && AbstractC22676k.m65745e(this.channel, bannedUser.channel) && AbstractC22676k.m65745e(this.createdAt, bannedUser.createdAt) && AbstractC22676k.m65745e(this.expires, bannedUser.expires) && this.shadow == bannedUser.shadow && AbstractC22676k.m65745e(this.reason, bannedUser.reason);
    }

    public final User getBannedBy() {
        return this.bannedBy;
    }

    public final Channel getChannel() {
        return this.channel;
    }

    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final Date getExpires() {
        return this.expires;
    }

    public final String getReason() {
        return this.reason;
    }

    public final boolean getShadow() {
        return this.shadow;
    }

    public final User getUser() {
        return this.user;
    }

    public int hashCode() {
        int iHashCode = this.user.hashCode() * 31;
        User user = this.bannedBy;
        int iHashCode2 = (iHashCode + (user == null ? 0 : user.hashCode())) * 31;
        Channel channel = this.channel;
        int iHashCode3 = (iHashCode2 + (channel == null ? 0 : channel.hashCode())) * 31;
        Date date = this.createdAt;
        int iHashCode4 = (iHashCode3 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.expires;
        int iM8289b = AbstractC2875y.m8289b((iHashCode4 + (date2 == null ? 0 : date2.hashCode())) * 31, 31, this.shadow);
        String str = this.reason;
        return iM8289b + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        User user = this.user;
        User user2 = this.bannedBy;
        Channel channel = this.channel;
        Date date = this.createdAt;
        Date date2 = this.expires;
        boolean z4 = this.shadow;
        String str = this.reason;
        StringBuilder sb4 = new StringBuilder("BannedUser(user=");
        sb4.append(user);
        sb4.append(", bannedBy=");
        sb4.append(user2);
        sb4.append(", channel=");
        sb4.append(channel);
        sb4.append(", createdAt=");
        sb4.append(date);
        sb4.append(", expires=");
        sb4.append(date2);
        sb4.append(", shadow=");
        sb4.append(z4);
        sb4.append(", reason=");
        return AbstractC25012a.m73376i(str, ")", sb4);
    }
}
