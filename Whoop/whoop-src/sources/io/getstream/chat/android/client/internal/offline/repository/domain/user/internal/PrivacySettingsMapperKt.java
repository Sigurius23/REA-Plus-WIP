package io.getstream.chat.android.client.internal.offline.repository.domain.user.internal;

import io.getstream.chat.android.DeliveryReceipts;
import io.getstream.chat.android.PrivacySettings;
import io.getstream.chat.android.ReadReceipts;
import io.getstream.chat.android.TypingIndicators;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0000¨\u0006\u0004"}, m65681d2 = {"toEntity", "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;", "Lio/getstream/chat/android/PrivacySettings;", "toModel", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class PrivacySettingsMapperKt {
    public static final PrivacySettingsEntity toEntity(PrivacySettings privacySettings) {
        AbstractC22676k.m65750j(privacySettings, "<this>");
        TypingIndicators typingIndicators = privacySettings.getTypingIndicators();
        TypingIndicatorsEntity typingIndicatorsEntity = typingIndicators != null ? new TypingIndicatorsEntity(typingIndicators.getEnabled()) : null;
        ReadReceipts readReceipts = privacySettings.getReadReceipts();
        ReadReceiptsEntity readReceiptsEntity = readReceipts != null ? new ReadReceiptsEntity(readReceipts.getEnabled()) : null;
        DeliveryReceipts deliveryReceipts = privacySettings.getDeliveryReceipts();
        return new PrivacySettingsEntity(typingIndicatorsEntity, readReceiptsEntity, deliveryReceipts != null ? new DeliveryReceiptsEntity(deliveryReceipts.getEnabled()) : null);
    }

    public static final PrivacySettings toModel(PrivacySettingsEntity privacySettingsEntity) {
        AbstractC22676k.m65750j(privacySettingsEntity, "<this>");
        TypingIndicatorsEntity typingIndicators = privacySettingsEntity.getTypingIndicators();
        TypingIndicators typingIndicators2 = typingIndicators != null ? new TypingIndicators(typingIndicators.getEnabled()) : null;
        ReadReceiptsEntity readReceipts = privacySettingsEntity.getReadReceipts();
        ReadReceipts readReceipts2 = readReceipts != null ? new ReadReceipts(readReceipts.getEnabled()) : null;
        DeliveryReceiptsEntity deliveryReceipts = privacySettingsEntity.getDeliveryReceipts();
        return new PrivacySettings(typingIndicators2, deliveryReceipts != null ? new DeliveryReceipts(deliveryReceipts.getEnabled()) : null, readReceipts2);
    }
}
