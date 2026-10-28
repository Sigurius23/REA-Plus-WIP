package io.getstream.chat.android;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m65681d2 = {"Lio/getstream/chat/android/PrivacySettings;", "", "typingIndicators", "Lio/getstream/chat/android/TypingIndicators;", "deliveryReceipts", "Lio/getstream/chat/android/DeliveryReceipts;", "readReceipts", "Lio/getstream/chat/android/ReadReceipts;", "<init>", "(Lio/getstream/chat/android/TypingIndicators;Lio/getstream/chat/android/DeliveryReceipts;Lio/getstream/chat/android/ReadReceipts;)V", "getTypingIndicators", "()Lio/getstream/chat/android/TypingIndicators;", "getDeliveryReceipts", "()Lio/getstream/chat/android/DeliveryReceipts;", "getReadReceipts", "()Lio/getstream/chat/android/ReadReceipts;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class PrivacySettings {
    private final DeliveryReceipts deliveryReceipts;
    private final ReadReceipts readReceipts;
    private final TypingIndicators typingIndicators;

    public PrivacySettings() {
        this(null, null, null, 7, null);
    }

    public static PrivacySettings copy$default(PrivacySettings privacySettings, TypingIndicators typingIndicators, DeliveryReceipts deliveryReceipts, ReadReceipts readReceipts, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            typingIndicators = privacySettings.typingIndicators;
        }
        if ((i13 & 2) != 0) {
            deliveryReceipts = privacySettings.deliveryReceipts;
        }
        if ((i13 & 4) != 0) {
            readReceipts = privacySettings.readReceipts;
        }
        privacySettings.getClass();
        return new PrivacySettings(typingIndicators, deliveryReceipts, readReceipts);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TypingIndicators getTypingIndicators() {
        return this.typingIndicators;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DeliveryReceipts getDeliveryReceipts() {
        return this.deliveryReceipts;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ReadReceipts getReadReceipts() {
        return this.readReceipts;
    }

    public final PrivacySettings copy(TypingIndicators typingIndicators, DeliveryReceipts deliveryReceipts, ReadReceipts readReceipts) {
        return new PrivacySettings(typingIndicators, deliveryReceipts, readReceipts);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrivacySettings)) {
            return false;
        }
        PrivacySettings privacySettings = (PrivacySettings) other;
        return AbstractC22676k.m65745e(this.typingIndicators, privacySettings.typingIndicators) && AbstractC22676k.m65745e(this.deliveryReceipts, privacySettings.deliveryReceipts) && AbstractC22676k.m65745e(this.readReceipts, privacySettings.readReceipts);
    }

    public final DeliveryReceipts getDeliveryReceipts() {
        return this.deliveryReceipts;
    }

    public final ReadReceipts getReadReceipts() {
        return this.readReceipts;
    }

    public final TypingIndicators getTypingIndicators() {
        return this.typingIndicators;
    }

    public final int hashCode() {
        TypingIndicators typingIndicators = this.typingIndicators;
        int iHashCode = (typingIndicators == null ? 0 : typingIndicators.hashCode()) * 31;
        DeliveryReceipts deliveryReceipts = this.deliveryReceipts;
        int iHashCode2 = (iHashCode + (deliveryReceipts == null ? 0 : deliveryReceipts.hashCode())) * 31;
        ReadReceipts readReceipts = this.readReceipts;
        return iHashCode2 + (readReceipts != null ? readReceipts.hashCode() : 0);
    }

    public final String toString() {
        return "PrivacySettings(typingIndicators=" + this.typingIndicators + ", deliveryReceipts=" + this.deliveryReceipts + ", readReceipts=" + this.readReceipts + ")";
    }

    public PrivacySettings(TypingIndicators typingIndicators, DeliveryReceipts deliveryReceipts, ReadReceipts readReceipts) {
        this.typingIndicators = typingIndicators;
        this.deliveryReceipts = deliveryReceipts;
        this.readReceipts = readReceipts;
    }

    public /* synthetic */ PrivacySettings(TypingIndicators typingIndicators, DeliveryReceipts deliveryReceipts, ReadReceipts readReceipts, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : typingIndicators, (i13 & 2) != 0 ? null : deliveryReceipts, (i13 & 4) != 0 ? null : readReceipts);
    }
}
