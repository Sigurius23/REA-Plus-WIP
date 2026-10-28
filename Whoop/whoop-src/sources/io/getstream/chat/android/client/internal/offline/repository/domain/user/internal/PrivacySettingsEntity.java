package io.getstream.chat.android.client.internal.offline.repository.domain.user.internal;

import live.hms.video.utils.HMSFieldTrials;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;", "", "typingIndicators", "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/TypingIndicatorsEntity;", "readReceipts", "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/ReadReceiptsEntity;", "deliveryReceipts", "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DeliveryReceiptsEntity;", "<init>", "(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/TypingIndicatorsEntity;Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/ReadReceiptsEntity;Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DeliveryReceiptsEntity;)V", "getTypingIndicators", "()Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/TypingIndicatorsEntity;", "getReadReceipts", "()Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/ReadReceiptsEntity;", "getDeliveryReceipts", "()Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DeliveryReceiptsEntity;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class PrivacySettingsEntity {
    private final DeliveryReceiptsEntity deliveryReceipts;
    private final ReadReceiptsEntity readReceipts;
    private final TypingIndicatorsEntity typingIndicators;

    public PrivacySettingsEntity() {
        this(null, null, null, 7, null);
    }

    public static PrivacySettingsEntity copy$default(PrivacySettingsEntity privacySettingsEntity, TypingIndicatorsEntity typingIndicatorsEntity, ReadReceiptsEntity readReceiptsEntity, DeliveryReceiptsEntity deliveryReceiptsEntity, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            typingIndicatorsEntity = privacySettingsEntity.typingIndicators;
        }
        if ((i13 & 2) != 0) {
            readReceiptsEntity = privacySettingsEntity.readReceipts;
        }
        if ((i13 & 4) != 0) {
            deliveryReceiptsEntity = privacySettingsEntity.deliveryReceipts;
        }
        privacySettingsEntity.getClass();
        return new PrivacySettingsEntity(typingIndicatorsEntity, readReceiptsEntity, deliveryReceiptsEntity);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TypingIndicatorsEntity getTypingIndicators() {
        return this.typingIndicators;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ReadReceiptsEntity getReadReceipts() {
        return this.readReceipts;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DeliveryReceiptsEntity getDeliveryReceipts() {
        return this.deliveryReceipts;
    }

    public final PrivacySettingsEntity copy(TypingIndicatorsEntity typingIndicators, ReadReceiptsEntity readReceipts, DeliveryReceiptsEntity deliveryReceipts) {
        return new PrivacySettingsEntity(typingIndicators, readReceipts, deliveryReceipts);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrivacySettingsEntity)) {
            return false;
        }
        PrivacySettingsEntity privacySettingsEntity = (PrivacySettingsEntity) other;
        return AbstractC22676k.m65745e(this.typingIndicators, privacySettingsEntity.typingIndicators) && AbstractC22676k.m65745e(this.readReceipts, privacySettingsEntity.readReceipts) && AbstractC22676k.m65745e(this.deliveryReceipts, privacySettingsEntity.deliveryReceipts);
    }

    public final DeliveryReceiptsEntity getDeliveryReceipts() {
        return this.deliveryReceipts;
    }

    public final ReadReceiptsEntity getReadReceipts() {
        return this.readReceipts;
    }

    public final TypingIndicatorsEntity getTypingIndicators() {
        return this.typingIndicators;
    }

    public final int hashCode() {
        TypingIndicatorsEntity typingIndicatorsEntity = this.typingIndicators;
        int iHashCode = (typingIndicatorsEntity == null ? 0 : typingIndicatorsEntity.hashCode()) * 31;
        ReadReceiptsEntity readReceiptsEntity = this.readReceipts;
        int iHashCode2 = (iHashCode + (readReceiptsEntity == null ? 0 : readReceiptsEntity.hashCode())) * 31;
        DeliveryReceiptsEntity deliveryReceiptsEntity = this.deliveryReceipts;
        return iHashCode2 + (deliveryReceiptsEntity != null ? deliveryReceiptsEntity.hashCode() : 0);
    }

    public final String toString() {
        return "PrivacySettingsEntity(typingIndicators=" + this.typingIndicators + ", readReceipts=" + this.readReceipts + ", deliveryReceipts=" + this.deliveryReceipts + ")";
    }

    public PrivacySettingsEntity(TypingIndicatorsEntity typingIndicatorsEntity, ReadReceiptsEntity readReceiptsEntity, DeliveryReceiptsEntity deliveryReceiptsEntity) {
        this.typingIndicators = typingIndicatorsEntity;
        this.readReceipts = readReceiptsEntity;
        this.deliveryReceipts = deliveryReceiptsEntity;
    }

    public /* synthetic */ PrivacySettingsEntity(TypingIndicatorsEntity typingIndicatorsEntity, ReadReceiptsEntity readReceiptsEntity, DeliveryReceiptsEntity deliveryReceiptsEntity, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : typingIndicatorsEntity, (i13 & 2) != 0 ? null : readReceiptsEntity, (i13 & 4) != 0 ? null : deliveryReceiptsEntity);
    }
}
