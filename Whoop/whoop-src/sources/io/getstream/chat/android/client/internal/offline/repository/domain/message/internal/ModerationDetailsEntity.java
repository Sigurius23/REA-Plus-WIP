package io.getstream.chat.android.client.internal.offline.repository.domain.message.internal;

import live.hms.video.utils.HMSFieldTrials;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;", "", "originalText", "", "action", "errorMsg", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOriginalText", "()Ljava/lang/String;", "getAction", "getErrorMsg", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ModerationDetailsEntity {
    private final String action;
    private final String errorMsg;
    private final String originalText;

    public ModerationDetailsEntity(String originalText, String action, String errorMsg) {
        AbstractC22676k.m65750j(originalText, "originalText");
        AbstractC22676k.m65750j(action, "action");
        AbstractC22676k.m65750j(errorMsg, "errorMsg");
        this.originalText = originalText;
        this.action = action;
        this.errorMsg = errorMsg;
    }

    public static /* synthetic */ ModerationDetailsEntity copy$default(ModerationDetailsEntity moderationDetailsEntity, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = moderationDetailsEntity.originalText;
        }
        if ((i13 & 2) != 0) {
            str2 = moderationDetailsEntity.action;
        }
        if ((i13 & 4) != 0) {
            str3 = moderationDetailsEntity.errorMsg;
        }
        return moderationDetailsEntity.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOriginalText() {
        return this.originalText;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    public final ModerationDetailsEntity copy(String originalText, String action, String errorMsg) {
        AbstractC22676k.m65750j(originalText, "originalText");
        AbstractC22676k.m65750j(action, "action");
        AbstractC22676k.m65750j(errorMsg, "errorMsg");
        return new ModerationDetailsEntity(originalText, action, errorMsg);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModerationDetailsEntity)) {
            return false;
        }
        ModerationDetailsEntity moderationDetailsEntity = (ModerationDetailsEntity) other;
        return AbstractC22676k.m65745e(this.originalText, moderationDetailsEntity.originalText) && AbstractC22676k.m65745e(this.action, moderationDetailsEntity.action) && AbstractC22676k.m65745e(this.errorMsg, moderationDetailsEntity.errorMsg);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getErrorMsg() {
        return this.errorMsg;
    }

    public final String getOriginalText() {
        return this.originalText;
    }

    public final int hashCode() {
        return this.errorMsg.hashCode() + AbstractC11266d.m30450d(this.originalText.hashCode() * 31, 31, this.action);
    }

    public final String toString() {
        return AbstractC25012a.m73376i(this.errorMsg, ")", AbstractC11895b.m32001t("ModerationDetailsEntity(originalText=", this.originalText, ", action=", this.action, ", errorMsg="));
    }
}
