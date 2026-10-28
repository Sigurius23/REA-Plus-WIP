package io.getstream.chat.android.models;

import com.whoop.service.network.model.UserState;
import java.util.Date;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/models/ThreadParticipant;", "Lio/getstream/chat/android/models/UserEntity;", UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "lastThreadMessageAt", "Ljava/util/Date;", "<init>", "(Lio/getstream/chat/android/models/User;Ljava/util/Date;)V", "getUser", "()Lio/getstream/chat/android/models/User;", "getLastThreadMessageAt", "()Ljava/util/Date;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ThreadParticipant implements UserEntity {
    private final Date lastThreadMessageAt;
    private final User user;

    public ThreadParticipant(User user, Date date) {
        AbstractC22676k.m65750j(user, "user");
        this.user = user;
        this.lastThreadMessageAt = date;
    }

    public static /* synthetic */ ThreadParticipant copy$default(ThreadParticipant threadParticipant, User user, Date date, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            user = threadParticipant.user;
        }
        if ((i13 & 2) != 0) {
            date = threadParticipant.lastThreadMessageAt;
        }
        return threadParticipant.copy(user, date);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Date getLastThreadMessageAt() {
        return this.lastThreadMessageAt;
    }

    public final ThreadParticipant copy(User user, Date lastThreadMessageAt) {
        AbstractC22676k.m65750j(user, "user");
        return new ThreadParticipant(user, lastThreadMessageAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThreadParticipant)) {
            return false;
        }
        ThreadParticipant threadParticipant = (ThreadParticipant) other;
        return AbstractC22676k.m65745e(this.user, threadParticipant.user) && AbstractC22676k.m65745e(this.lastThreadMessageAt, threadParticipant.lastThreadMessageAt);
    }

    public final Date getLastThreadMessageAt() {
        return this.lastThreadMessageAt;
    }

    @Override // io.getstream.chat.android.models.UserEntity
    public User getUser() {
        return this.user;
    }

    @Override // io.getstream.chat.android.models.UserEntity
    public String getUserId() {
        return super.getUserId();
    }

    public int hashCode() {
        int iHashCode = this.user.hashCode() * 31;
        Date date = this.lastThreadMessageAt;
        return iHashCode + (date == null ? 0 : date.hashCode());
    }

    public String toString() {
        return "ThreadParticipant(user=" + this.user + ", lastThreadMessageAt=" + this.lastThreadMessageAt + ")";
    }
}
