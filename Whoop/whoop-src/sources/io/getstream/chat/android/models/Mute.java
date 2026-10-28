package io.getstream.chat.android.models;

import com.whoop.service.network.model.UserState;
import hc3.AbstractC17176i;
import java.util.Date;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001f"}, m65681d2 = {"Lio/getstream/chat/android/models/Mute;", "", UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "target", "createdAt", "Ljava/util/Date;", "updatedAt", "expires", "<init>", "(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/User;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)V", "getUser", "()Lio/getstream/chat/android/models/User;", "getTarget", "getCreatedAt", "()Ljava/util/Date;", "getUpdatedAt", "getExpires", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class Mute {
    private final Date createdAt;
    private final Date expires;
    private final User target;
    private final Date updatedAt;
    private final User user;

    public Mute(User user, User user2, Date createdAt, Date updatedAt, Date date) {
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        this.user = user;
        this.target = user2;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.expires = date;
    }

    public static /* synthetic */ Mute copy$default(Mute mute, User user, User user2, Date date, Date date2, Date date3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            user = mute.user;
        }
        if ((i13 & 2) != 0) {
            user2 = mute.target;
        }
        if ((i13 & 4) != 0) {
            date = mute.createdAt;
        }
        if ((i13 & 8) != 0) {
            date2 = mute.updatedAt;
        }
        if ((i13 & 16) != 0) {
            date3 = mute.expires;
        }
        Date date4 = date3;
        Date date5 = date;
        return mute.copy(user, user2, date5, date2, date4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final User getTarget() {
        return this.target;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Date getExpires() {
        return this.expires;
    }

    public final Mute copy(User user, User target, Date createdAt, Date updatedAt, Date expires) {
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        return new Mute(user, target, createdAt, updatedAt, expires);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Mute)) {
            return false;
        }
        Mute mute = (Mute) other;
        return AbstractC22676k.m65745e(this.user, mute.user) && AbstractC22676k.m65745e(this.target, mute.target) && AbstractC22676k.m65745e(this.createdAt, mute.createdAt) && AbstractC22676k.m65745e(this.updatedAt, mute.updatedAt) && AbstractC22676k.m65745e(this.expires, mute.expires);
    }

    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final Date getExpires() {
        return this.expires;
    }

    public final User getTarget() {
        return this.target;
    }

    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    public final User getUser() {
        return this.user;
    }

    public int hashCode() {
        User user = this.user;
        int iHashCode = (user == null ? 0 : user.hashCode()) * 31;
        User user2 = this.target;
        int iM124373c = AbstractC38963t7.m124373c(this.updatedAt, AbstractC38963t7.m124373c(this.createdAt, (iHashCode + (user2 == null ? 0 : user2.hashCode())) * 31, 31), 31);
        Date date = this.expires;
        return iM124373c + (date != null ? date.hashCode() : 0);
    }

    public String toString() {
        User user = this.user;
        User user2 = this.target;
        Date date = this.createdAt;
        Date date2 = this.updatedAt;
        Date date3 = this.expires;
        StringBuilder sb4 = new StringBuilder("Mute(user=");
        sb4.append(user);
        sb4.append(", target=");
        sb4.append(user2);
        sb4.append(", createdAt=");
        AbstractC17176i.m48512n(sb4, date, ", updatedAt=", date2, ", expires=");
        return AbstractC13673n.m38564k(sb4, date3, ")");
    }
}
