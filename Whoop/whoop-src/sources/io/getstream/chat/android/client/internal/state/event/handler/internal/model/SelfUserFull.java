package io.getstream.chat.android.client.internal.state.event.handler.internal.model;

import io.getstream.chat.android.models.User;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/event/handler/internal/model/SelfUserFull;", "Lio/getstream/chat/android/client/internal/state/event/handler/internal/model/SelfUser;", "me", "Lio/getstream/chat/android/models/User;", "<init>", "(Lio/getstream/chat/android/models/User;)V", "getMe", "()Lio/getstream/chat/android/models/User;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class SelfUserFull extends SelfUser {
    private final User me;

    public SelfUserFull(User me4) {
        AbstractC22676k.m65750j(me4, "me");
        this.me = me4;
    }

    public static /* synthetic */ SelfUserFull copy$default(SelfUserFull selfUserFull, User user, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            user = selfUserFull.me;
        }
        return selfUserFull.copy(user);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final User getMe() {
        return this.me;
    }

    public final SelfUserFull copy(User me4) {
        AbstractC22676k.m65750j(me4, "me");
        return new SelfUserFull(me4);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SelfUserFull) && AbstractC22676k.m65745e(this.me, ((SelfUserFull) other).me);
    }

    @Override // io.getstream.chat.android.client.internal.state.event.handler.internal.model.SelfUser
    public final User getMe() {
        return this.me;
    }

    public final int hashCode() {
        return this.me.hashCode();
    }

    public final String toString() {
        return "SelfUserFull(me=" + this.me + ")";
    }
}
