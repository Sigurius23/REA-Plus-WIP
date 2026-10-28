package io.getstream.chat.android.client.internal.offline.repository.domain.message.internal;

import ih0.AbstractC18489d0;
import java.util.List;
import jh3.AbstractC21702c;
import live.hms.video.utils.HMSFieldTrials;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003J_\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;", "", "action", "", "originalText", "textHarms", "", "imageHarms", "blocklistMatched", "semanticFilterMatched", "platformCircumvented", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Z)V", "getAction", "()Ljava/lang/String;", "getOriginalText", "getTextHarms", "()Ljava/util/List;", "getImageHarms", "getBlocklistMatched", "getSemanticFilterMatched", "getPlatformCircumvented", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ModerationEntity {
    private final String action;
    private final String blocklistMatched;
    private final List<String> imageHarms;
    private final String originalText;
    private final boolean platformCircumvented;
    private final String semanticFilterMatched;
    private final List<String> textHarms;

    public ModerationEntity(String action, String originalText, List<String> textHarms, List<String> imageHarms, String str, String str2, boolean z4) {
        AbstractC22676k.m65750j(action, "action");
        AbstractC22676k.m65750j(originalText, "originalText");
        AbstractC22676k.m65750j(textHarms, "textHarms");
        AbstractC22676k.m65750j(imageHarms, "imageHarms");
        this.action = action;
        this.originalText = originalText;
        this.textHarms = textHarms;
        this.imageHarms = imageHarms;
        this.blocklistMatched = str;
        this.semanticFilterMatched = str2;
        this.platformCircumvented = z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ModerationEntity copy$default(ModerationEntity moderationEntity, String str, String str2, List list, List list2, String str3, String str4, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = moderationEntity.action;
        }
        if ((i13 & 2) != 0) {
            str2 = moderationEntity.originalText;
        }
        if ((i13 & 4) != 0) {
            list = moderationEntity.textHarms;
        }
        if ((i13 & 8) != 0) {
            list2 = moderationEntity.imageHarms;
        }
        if ((i13 & 16) != 0) {
            str3 = moderationEntity.blocklistMatched;
        }
        if ((i13 & 32) != 0) {
            str4 = moderationEntity.semanticFilterMatched;
        }
        if ((i13 & 64) != 0) {
            z4 = moderationEntity.platformCircumvented;
        }
        String str5 = str4;
        boolean z13 = z4;
        String str6 = str3;
        List list3 = list;
        return moderationEntity.copy(str, str2, list3, list2, str6, str5, z13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOriginalText() {
        return this.originalText;
    }

    public final List<String> component3() {
        return this.textHarms;
    }

    public final List<String> component4() {
        return this.imageHarms;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBlocklistMatched() {
        return this.blocklistMatched;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSemanticFilterMatched() {
        return this.semanticFilterMatched;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getPlatformCircumvented() {
        return this.platformCircumvented;
    }

    public final ModerationEntity copy(String action, String originalText, List<String> textHarms, List<String> imageHarms, String blocklistMatched, String semanticFilterMatched, boolean platformCircumvented) {
        AbstractC22676k.m65750j(action, "action");
        AbstractC22676k.m65750j(originalText, "originalText");
        AbstractC22676k.m65750j(textHarms, "textHarms");
        AbstractC22676k.m65750j(imageHarms, "imageHarms");
        return new ModerationEntity(action, originalText, textHarms, imageHarms, blocklistMatched, semanticFilterMatched, platformCircumvented);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModerationEntity)) {
            return false;
        }
        ModerationEntity moderationEntity = (ModerationEntity) other;
        return AbstractC22676k.m65745e(this.action, moderationEntity.action) && AbstractC22676k.m65745e(this.originalText, moderationEntity.originalText) && AbstractC22676k.m65745e(this.textHarms, moderationEntity.textHarms) && AbstractC22676k.m65745e(this.imageHarms, moderationEntity.imageHarms) && AbstractC22676k.m65745e(this.blocklistMatched, moderationEntity.blocklistMatched) && AbstractC22676k.m65745e(this.semanticFilterMatched, moderationEntity.semanticFilterMatched) && this.platformCircumvented == moderationEntity.platformCircumvented;
    }

    public final String getAction() {
        return this.action;
    }

    public final String getBlocklistMatched() {
        return this.blocklistMatched;
    }

    public final List<String> getImageHarms() {
        return this.imageHarms;
    }

    public final String getOriginalText() {
        return this.originalText;
    }

    public final boolean getPlatformCircumvented() {
        return this.platformCircumvented;
    }

    public final String getSemanticFilterMatched() {
        return this.semanticFilterMatched;
    }

    public final List<String> getTextHarms() {
        return this.textHarms;
    }

    public final int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11266d.m30450d(this.action.hashCode() * 31, 31, this.originalText), 31, this.textHarms), 31, this.imageHarms);
        String str = this.blocklistMatched;
        int iHashCode = (iM31983b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.semanticFilterMatched;
        return Boolean.hashCode(this.platformCircumvented) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.action;
        String str2 = this.originalText;
        List<String> list = this.textHarms;
        List<String> list2 = this.imageHarms;
        String str3 = this.blocklistMatched;
        String str4 = this.semanticFilterMatched;
        boolean z4 = this.platformCircumvented;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ModerationEntity(action=", str, ", originalText=", str2, ", textHarms=");
        AbstractC21702c.m61148s(sbM32001t, list, ", imageHarms=", list2, ", blocklistMatched=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", semanticFilterMatched=", str4, ", platformCircumvented=");
        return AbstractC18489d0.m53372m(sbM32001t, z4, ")");
    }
}
