package com.whoop.whooplabs.data.domain;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0005\u001a\u00020\u0006*\u0004\u0018\u00010\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\u00020\u00018\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0003\u0010\u0004¨\u0006\b"}, m65681d2 = {"LABS_CAMPAIGN_TABLE", "", "LABS_CAMPAIGN_INFO_QUERY", "getLABS_CAMPAIGN_INFO_QUERY$annotations", "()V", "hasBtHrAdditionalCollection", "", "Lcom/whoop/whooplabs/data/domain/LabsCampaign;", "whooplabs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class LabsCampaignKt {
    public static final String LABS_CAMPAIGN_INFO_QUERY = "SELECT * FROM labs_campaign LIMIT 1";
    public static final String LABS_CAMPAIGN_TABLE = "labs_campaign";

    public static /* synthetic */ void getLABS_CAMPAIGN_INFO_QUERY$annotations() {
    }

    public static final boolean hasBtHrAdditionalCollection(LabsCampaign labsCampaign) {
        return (labsCampaign == null || labsCampaign.getBthrAdditionalCollectionLength() == null) ? false : true;
    }
}
