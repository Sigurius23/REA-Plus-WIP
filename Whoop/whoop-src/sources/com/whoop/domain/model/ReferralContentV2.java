package com.whoop.domain.model;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m65681d2 = {"Lcom/whoop/domain/model/ReferralContentV2;", "", "title", "", "body", "shareMessage", "ctaText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getBody", "getShareMessage", "getCtaText", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class ReferralContentV2 {
    private final String body;
    private final String ctaText;
    private final String shareMessage;
    private final String title;

    public ReferralContentV2(String title, String body, String shareMessage, String ctaText) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(shareMessage, "shareMessage");
        AbstractC22676k.m65750j(ctaText, "ctaText");
        this.title = title;
        this.body = body;
        this.shareMessage = shareMessage;
        this.ctaText = ctaText;
    }

    public static /* synthetic */ ReferralContentV2 copy$default(ReferralContentV2 referralContentV2, String str, String str2, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = referralContentV2.title;
        }
        if ((i13 & 2) != 0) {
            str2 = referralContentV2.body;
        }
        if ((i13 & 4) != 0) {
            str3 = referralContentV2.shareMessage;
        }
        if ((i13 & 8) != 0) {
            str4 = referralContentV2.ctaText;
        }
        return referralContentV2.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getShareMessage() {
        return this.shareMessage;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCtaText() {
        return this.ctaText;
    }

    public final ReferralContentV2 copy(String title, String body, String shareMessage, String ctaText) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(shareMessage, "shareMessage");
        AbstractC22676k.m65750j(ctaText, "ctaText");
        return new ReferralContentV2(title, body, shareMessage, ctaText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReferralContentV2)) {
            return false;
        }
        ReferralContentV2 referralContentV2 = (ReferralContentV2) other;
        return AbstractC22676k.m65745e(this.title, referralContentV2.title) && AbstractC22676k.m65745e(this.body, referralContentV2.body) && AbstractC22676k.m65745e(this.shareMessage, referralContentV2.shareMessage) && AbstractC22676k.m65745e(this.ctaText, referralContentV2.ctaText);
    }

    public final String getBody() {
        return this.body;
    }

    public final String getCtaText() {
        return this.ctaText;
    }

    public final String getShareMessage() {
        return this.shareMessage;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.ctaText.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.body), 31, this.shareMessage);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.body;
        return AbstractC11266d.m30464r(AbstractC11895b.m32001t("ReferralContentV2(title=", str, ", body=", str2, ", shareMessage="), this.shareMessage, ", ctaText=", this.ctaText, ")");
    }
}
