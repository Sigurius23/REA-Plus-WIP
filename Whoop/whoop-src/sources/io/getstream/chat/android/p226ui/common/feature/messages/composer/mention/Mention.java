package io.getstream.chat.android.p226ui.common.feature.messages.composer.mention;

import com.whoop.service.network.model.UserState;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\nR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000bÀ\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/Mention;", "", "type", "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/MentionType;", "getType", "()Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/MentionType;", "display", "", "getDisplay", "()Ljava/lang/String;", "User", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface Mention {

    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/Mention$User;", "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/Mention;", UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "<init>", "(Lio/getstream/chat/android/models/User;)V", "getUser", "()Lio/getstream/chat/android/models/User;", "type", "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/MentionType;", "getType", "()Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/MentionType;", "display", "", "getDisplay", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class User implements Mention {
        public static final int $stable = 0;
        private final String display;
        private final MentionType type;
        private final io.getstream.chat.android.models.User user;

        public User(io.getstream.chat.android.models.User user) {
            AbstractC22676k.m65750j(user, "user");
            this.user = user;
            MentionType.INSTANCE.getClass();
            this.type = MentionType.user;
            String name = user.getName();
            this.display = name.length() == 0 ? user.getId() : name;
        }

        public static /* synthetic */ User copy$default(User user, io.getstream.chat.android.models.User user2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                user2 = user.user;
            }
            return user.copy(user2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final io.getstream.chat.android.models.User getUser() {
            return this.user;
        }

        public final User copy(io.getstream.chat.android.models.User user) {
            AbstractC22676k.m65750j(user, "user");
            return new User(user);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof User) && AbstractC22676k.m65745e(this.user, ((User) other).user);
        }

        @Override // io.getstream.chat.android.p226ui.common.feature.messages.composer.mention.Mention
        public final String getDisplay() {
            return this.display;
        }

        @Override // io.getstream.chat.android.p226ui.common.feature.messages.composer.mention.Mention
        public final MentionType getType() {
            return this.type;
        }

        public final io.getstream.chat.android.models.User getUser() {
            return this.user;
        }

        public final int hashCode() {
            return this.user.hashCode();
        }

        public final String toString() {
            return "User(user=" + this.user + ")";
        }
    }

    String getDisplay();

    MentionType getType();
}
