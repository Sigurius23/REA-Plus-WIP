package com.whoop.service.network.model;

import com.google.gson.annotations.SerializedName;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m65681d2 = {"Lcom/whoop/service/network/model/TermDetailsResponse;", "", "fullTermsUrl", "", "jumpCtaTitle", "acceptCtaTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFullTermsUrl", "()Ljava/lang/String;", "getJumpCtaTitle", "getAcceptCtaTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class TermDetailsResponse {

    @SerializedName("accept_cta_title")
    private final String acceptCtaTitle;

    @SerializedName("full_terms_url")
    private final String fullTermsUrl;

    @SerializedName("jump_cta_title")
    private final String jumpCtaTitle;

    public TermDetailsResponse(String fullTermsUrl, String str, String acceptCtaTitle) {
        AbstractC22676k.m65750j(fullTermsUrl, "fullTermsUrl");
        AbstractC22676k.m65750j(acceptCtaTitle, "acceptCtaTitle");
        this.fullTermsUrl = fullTermsUrl;
        this.jumpCtaTitle = str;
        this.acceptCtaTitle = acceptCtaTitle;
    }

    public static /* synthetic */ TermDetailsResponse copy$default(TermDetailsResponse termDetailsResponse, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = termDetailsResponse.fullTermsUrl;
        }
        if ((i13 & 2) != 0) {
            str2 = termDetailsResponse.jumpCtaTitle;
        }
        if ((i13 & 4) != 0) {
            str3 = termDetailsResponse.acceptCtaTitle;
        }
        return termDetailsResponse.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFullTermsUrl() {
        return this.fullTermsUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getJumpCtaTitle() {
        return this.jumpCtaTitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAcceptCtaTitle() {
        return this.acceptCtaTitle;
    }

    public final TermDetailsResponse copy(String fullTermsUrl, String jumpCtaTitle, String acceptCtaTitle) {
        AbstractC22676k.m65750j(fullTermsUrl, "fullTermsUrl");
        AbstractC22676k.m65750j(acceptCtaTitle, "acceptCtaTitle");
        return new TermDetailsResponse(fullTermsUrl, jumpCtaTitle, acceptCtaTitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TermDetailsResponse)) {
            return false;
        }
        TermDetailsResponse termDetailsResponse = (TermDetailsResponse) other;
        return AbstractC22676k.m65745e(this.fullTermsUrl, termDetailsResponse.fullTermsUrl) && AbstractC22676k.m65745e(this.jumpCtaTitle, termDetailsResponse.jumpCtaTitle) && AbstractC22676k.m65745e(this.acceptCtaTitle, termDetailsResponse.acceptCtaTitle);
    }

    public final String getAcceptCtaTitle() {
        return this.acceptCtaTitle;
    }

    public final String getFullTermsUrl() {
        return this.fullTermsUrl;
    }

    public final String getJumpCtaTitle() {
        return this.jumpCtaTitle;
    }

    public int hashCode() {
        int iHashCode = this.fullTermsUrl.hashCode() * 31;
        String str = this.jumpCtaTitle;
        return this.acceptCtaTitle.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.acceptCtaTitle, ")", AbstractC11895b.m32001t("TermDetailsResponse(fullTermsUrl=", this.fullTermsUrl, ", jumpCtaTitle=", this.jumpCtaTitle, ", acceptCtaTitle="));
    }
}
