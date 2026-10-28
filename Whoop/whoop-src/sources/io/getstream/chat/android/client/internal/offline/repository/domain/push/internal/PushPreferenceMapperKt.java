package io.getstream.chat.android.client.internal.offline.repository.domain.push.internal;

import io.getstream.chat.android.models.PushPreference;
import io.getstream.chat.android.models.PushPreferenceLevel;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0000¨\u0006\u0004"}, m65681d2 = {"toEntity", "Lio/getstream/chat/android/client/internal/offline/repository/domain/push/internal/PushPreferenceEntity;", "Lio/getstream/chat/android/models/PushPreference;", "toModel", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class PushPreferenceMapperKt {
    public static final PushPreferenceEntity toEntity(PushPreference pushPreference) {
        AbstractC22676k.m65750j(pushPreference, "<this>");
        PushPreferenceLevel level = pushPreference.getLevel();
        return new PushPreferenceEntity(level != null ? level.getValue() : null, pushPreference.getDisabledUntil());
    }

    public static final PushPreference toModel(PushPreferenceEntity pushPreferenceEntity) {
        AbstractC22676k.m65750j(pushPreferenceEntity, "<this>");
        return new PushPreference(PushPreferenceLevel.INSTANCE.fromValue(pushPreferenceEntity.getLevel()), pushPreferenceEntity.getDisabledUntil());
    }
}
