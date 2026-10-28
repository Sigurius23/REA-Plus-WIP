package io.getstream.chat.android.client.internal.offline.repository.domain.message.internal;

import io.getstream.chat.android.models.Moderation;
import io.getstream.chat.android.models.ModerationAction;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0000¨\u0006\u0004"}, m65681d2 = {"toEntity", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;", "Lio/getstream/chat/android/models/Moderation;", "toDomain", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ModerationMapperKt {
    public static final Moderation toDomain(ModerationEntity moderationEntity) {
        AbstractC22676k.m65750j(moderationEntity, "<this>");
        return new Moderation(ModerationAction.INSTANCE.fromValue(moderationEntity.getAction()), moderationEntity.getOriginalText(), moderationEntity.getTextHarms(), moderationEntity.getImageHarms(), moderationEntity.getBlocklistMatched(), moderationEntity.getSemanticFilterMatched(), moderationEntity.getPlatformCircumvented());
    }

    public static final ModerationEntity toEntity(Moderation moderation) {
        AbstractC22676k.m65750j(moderation, "<this>");
        return new ModerationEntity(moderation.getAction().getValue(), moderation.getOriginalText(), moderation.getTextHarms(), moderation.getImageHarms(), moderation.getBlocklistMatched(), moderation.getSemanticFilterMatched(), moderation.getPlatformCircumvented());
    }
}
