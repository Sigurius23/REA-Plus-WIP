package io.getstream.chat.android.client.clientstate;

import io.getstream.chat.android.models.User;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0006\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, m65681d2 = {"Lio/getstream/chat/android/client/clientstate/UserState;", "", "<init>", "()V", "userOrError", "Lio/getstream/chat/android/models/User;", "userOrError$stream_chat_android_client_release", "NotSet", "UserSet", "AnonymousUserSet", "Lio/getstream/chat/android/client/clientstate/UserState$AnonymousUserSet;", "Lio/getstream/chat/android/client/clientstate/UserState$NotSet;", "Lio/getstream/chat/android/client/clientstate/UserState$UserSet;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public abstract class UserState {

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/client/clientstate/UserState$AnonymousUserSet;", "Lio/getstream/chat/android/client/clientstate/UserState;", "anonymousUser", "Lio/getstream/chat/android/models/User;", "<init>", "(Lio/getstream/chat/android/models/User;)V", "getAnonymousUser", "()Lio/getstream/chat/android/models/User;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class AnonymousUserSet extends UserState {
        private final User anonymousUser;

        public AnonymousUserSet(User anonymousUser) {
            AbstractC22676k.m65750j(anonymousUser, "anonymousUser");
            this.anonymousUser = anonymousUser;
        }

        public static /* synthetic */ AnonymousUserSet copy$default(AnonymousUserSet anonymousUserSet, User user, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                user = anonymousUserSet.anonymousUser;
            }
            return anonymousUserSet.copy(user);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final User getAnonymousUser() {
            return this.anonymousUser;
        }

        public final AnonymousUserSet copy(User anonymousUser) {
            AbstractC22676k.m65750j(anonymousUser, "anonymousUser");
            return new AnonymousUserSet(anonymousUser);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AnonymousUserSet) && AbstractC22676k.m65745e(this.anonymousUser, ((AnonymousUserSet) other).anonymousUser);
        }

        public final User getAnonymousUser() {
            return this.anonymousUser;
        }

        public final int hashCode() {
            return this.anonymousUser.hashCode();
        }

        public final String toString() {
            return "AnonymousUserSet(anonymousUser=" + this.anonymousUser + ")";
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/client/clientstate/UserState$NotSet;", "Lio/getstream/chat/android/client/clientstate/UserState;", "<init>", "()V", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class NotSet extends UserState {
        public static final NotSet INSTANCE = new NotSet();

        private NotSet() {
        }

        public final String toString() {
            return "NotSet";
        }
    }

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/client/clientstate/UserState$UserSet;", "Lio/getstream/chat/android/client/clientstate/UserState;", com.whoop.service.network.model.UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "<init>", "(Lio/getstream/chat/android/models/User;)V", "getUser", "()Lio/getstream/chat/android/models/User;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class UserSet extends UserState {
        private final User user;

        public UserSet(User user) {
            AbstractC22676k.m65750j(user, "user");
            this.user = user;
        }

        public static /* synthetic */ UserSet copy$default(UserSet userSet, User user, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                user = userSet.user;
            }
            return userSet.copy(user);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final User getUser() {
            return this.user;
        }

        public final UserSet copy(User user) {
            AbstractC22676k.m65750j(user, "user");
            return new UserSet(user);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UserSet) && AbstractC22676k.m65745e(this.user, ((UserSet) other).user);
        }

        public final User getUser() {
            return this.user;
        }

        public final int hashCode() {
            return this.user.hashCode();
        }

        public final String toString() {
            return "UserSet(user=" + this.user + ")";
        }
    }

    private UserState() {
    }

    public final User userOrError$stream_chat_android_client_release() {
        if (this instanceof UserSet) {
            return ((UserSet) this).getUser();
        }
        if (this instanceof AnonymousUserSet) {
            return ((AnonymousUserSet) this).getAnonymousUser();
        }
        throw new IllegalStateException("This state doesn't contain user!");
    }

    public UserState(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
