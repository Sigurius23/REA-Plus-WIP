package com.whoop.whooplabs.data.room.entity;

import p319m4.AbstractC25012a;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m65681d2 = {"Lcom/whoop/whooplabs/data/room/entity/LabsCampaignToLegalDocumentCrossRef;", "", "campaignId", "", "legalId", "<init>", "(II)V", "getCampaignId", "()I", "getLegalId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class LabsCampaignToLegalDocumentCrossRef {
    public static final int $stable = 0;
    private final int campaignId;
    private final int legalId;

    public LabsCampaignToLegalDocumentCrossRef(int i13, int i14) {
        this.campaignId = i13;
        this.legalId = i14;
    }

    public static /* synthetic */ LabsCampaignToLegalDocumentCrossRef copy$default(LabsCampaignToLegalDocumentCrossRef labsCampaignToLegalDocumentCrossRef, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = labsCampaignToLegalDocumentCrossRef.campaignId;
        }
        if ((i15 & 2) != 0) {
            i14 = labsCampaignToLegalDocumentCrossRef.legalId;
        }
        return labsCampaignToLegalDocumentCrossRef.copy(i13, i14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCampaignId() {
        return this.campaignId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getLegalId() {
        return this.legalId;
    }

    public final LabsCampaignToLegalDocumentCrossRef copy(int campaignId, int legalId) {
        return new LabsCampaignToLegalDocumentCrossRef(campaignId, legalId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LabsCampaignToLegalDocumentCrossRef)) {
            return false;
        }
        LabsCampaignToLegalDocumentCrossRef labsCampaignToLegalDocumentCrossRef = (LabsCampaignToLegalDocumentCrossRef) other;
        return this.campaignId == labsCampaignToLegalDocumentCrossRef.campaignId && this.legalId == labsCampaignToLegalDocumentCrossRef.legalId;
    }

    public final int getCampaignId() {
        return this.campaignId;
    }

    public final int getLegalId() {
        return this.legalId;
    }

    public int hashCode() {
        return Integer.hashCode(this.legalId) + (Integer.hashCode(this.campaignId) * 31);
    }

    public String toString() {
        return AbstractC25012a.m73372e(this.campaignId, this.legalId, "LabsCampaignToLegalDocumentCrossRef(campaignId=", ", legalId=", ")");
    }
}
