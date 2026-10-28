package com.whoop.whooplabs.data.domain;

import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m65681d2 = {"Lcom/whoop/whooplabs/data/domain/DwlCampaignSectionEmptyState;", "", "imageUrl", "", "title", "body", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getImageUrl", "()Ljava/lang/String;", "getTitle", "getBody", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class DwlCampaignSectionEmptyState {
    public static final int $stable = 0;
    private final String body;
    private final String imageUrl;
    private final String title;

    public DwlCampaignSectionEmptyState(String str, String str2, String str3) {
        this.imageUrl = str;
        this.title = str2;
        this.body = str3;
    }

    public static /* synthetic */ DwlCampaignSectionEmptyState copy$default(DwlCampaignSectionEmptyState dwlCampaignSectionEmptyState, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = dwlCampaignSectionEmptyState.imageUrl;
        }
        if ((i13 & 2) != 0) {
            str2 = dwlCampaignSectionEmptyState.title;
        }
        if ((i13 & 4) != 0) {
            str3 = dwlCampaignSectionEmptyState.body;
        }
        return dwlCampaignSectionEmptyState.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    public final DwlCampaignSectionEmptyState copy(String imageUrl, String title, String body) {
        return new DwlCampaignSectionEmptyState(imageUrl, title, body);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DwlCampaignSectionEmptyState)) {
            return false;
        }
        DwlCampaignSectionEmptyState dwlCampaignSectionEmptyState = (DwlCampaignSectionEmptyState) other;
        return AbstractC22676k.m65745e(this.imageUrl, dwlCampaignSectionEmptyState.imageUrl) && AbstractC22676k.m65745e(this.title, dwlCampaignSectionEmptyState.title) && AbstractC22676k.m65745e(this.body, dwlCampaignSectionEmptyState.body);
    }

    public final String getBody() {
        return this.body;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.imageUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.body;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.body, ")", AbstractC11895b.m32001t("DwlCampaignSectionEmptyState(imageUrl=", this.imageUrl, ", title=", this.title, ", body="));
    }
}
