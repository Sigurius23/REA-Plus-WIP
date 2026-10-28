package io.getstream.chat.android.client.internal.offline.repository.domain.push.internal;

import java.util.Date;
import live.hms.video.utils.HMSFieldTrials;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/push/internal/PushPreferenceEntity;", "", "level", "", "disabledUntil", "Ljava/util/Date;", "<init>", "(Ljava/lang/String;Ljava/util/Date;)V", "getLevel", "()Ljava/lang/String;", "getDisabledUntil", "()Ljava/util/Date;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class PushPreferenceEntity {
    private final Date disabledUntil;
    private final String level;

    public PushPreferenceEntity(String str, Date date) {
        this.level = str;
        this.disabledUntil = date;
    }

    public static PushPreferenceEntity copy$default(PushPreferenceEntity pushPreferenceEntity, String str, Date date, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = pushPreferenceEntity.level;
        }
        if ((i13 & 2) != 0) {
            date = pushPreferenceEntity.disabledUntil;
        }
        pushPreferenceEntity.getClass();
        return new PushPreferenceEntity(str, date);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLevel() {
        return this.level;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Date getDisabledUntil() {
        return this.disabledUntil;
    }

    public final PushPreferenceEntity copy(String level, Date disabledUntil) {
        return new PushPreferenceEntity(level, disabledUntil);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PushPreferenceEntity)) {
            return false;
        }
        PushPreferenceEntity pushPreferenceEntity = (PushPreferenceEntity) other;
        return AbstractC22676k.m65745e(this.level, pushPreferenceEntity.level) && AbstractC22676k.m65745e(this.disabledUntil, pushPreferenceEntity.disabledUntil);
    }

    public final Date getDisabledUntil() {
        return this.disabledUntil;
    }

    public final String getLevel() {
        return this.level;
    }

    public final int hashCode() {
        String str = this.level;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Date date = this.disabledUntil;
        return iHashCode + (date != null ? date.hashCode() : 0);
    }

    public final String toString() {
        return "PushPreferenceEntity(level=" + this.level + ", disabledUntil=" + this.disabledUntil + ")";
    }
}
