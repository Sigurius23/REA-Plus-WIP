package io.getstream.chat.android.models;

import com.whoop.service.network.model.UserState;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\b\t\n¨\u0006\u000bÀ\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/models/UserEntity;", "", UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "getUser", "()Lio/getstream/chat/android/models/User;", "getUserId", "", "Lio/getstream/chat/android/models/ChannelUserRead;", "Lio/getstream/chat/android/models/Member;", "Lio/getstream/chat/android/models/ThreadParticipant;", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface UserEntity {

    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static String getUserId(UserEntity userEntity) {
            return UserEntity.super.getUserId();
        }
    }

    User getUser();

    default String getUserId() {
        return getUser().getId();
    }
}
