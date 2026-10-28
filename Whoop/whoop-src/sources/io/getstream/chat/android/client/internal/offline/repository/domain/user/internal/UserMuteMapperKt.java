package io.getstream.chat.android.client.internal.offline.repository.domain.user.internal;

import io.getstream.chat.android.models.Mute;
import io.getstream.chat.android.models.User;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0000¨\u0006\u0004"}, m65681d2 = {"toEntity", "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserMuteEntity;", "Lio/getstream/chat/android/models/Mute;", "toModel", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class UserMuteMapperKt {
    public static final UserMuteEntity toEntity(Mute mute) {
        AbstractC22676k.m65750j(mute, "<this>");
        User user = mute.getUser();
        String id4 = user != null ? user.getId() : null;
        User target = mute.getTarget();
        return new UserMuteEntity(id4, target != null ? target.getId() : null, mute.getCreatedAt(), mute.getUpdatedAt(), mute.getExpires());
    }

    public static final Mute toModel(UserMuteEntity userMuteEntity) {
        AbstractC22676k.m65750j(userMuteEntity, "<this>");
        String userId = userMuteEntity.getUserId();
        User user = userId != null ? new User(userId, null, null, null, null, null, null, null, null, false, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, 33554430, null) : null;
        String targetId = userMuteEntity.getTargetId();
        return new Mute(user, targetId != null ? new User(targetId, null, null, null, null, null, null, null, null, false, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, 33554430, null) : null, userMuteEntity.getCreatedAt(), userMuteEntity.getUpdatedAt(), userMuteEntity.getExpires());
    }
}
