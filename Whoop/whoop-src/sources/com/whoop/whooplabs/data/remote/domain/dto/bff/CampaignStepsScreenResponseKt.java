package com.whoop.whooplabs.data.remote.domain.dto.bff;

import com.whoop.whooplabs.data.domain.ProtocolStep;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H\u0002¨\u0006\t"}, m65681d2 = {"toProtocolSteps", "", "Lcom/whoop/whooplabs/data/domain/ProtocolStep;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;", "campaignId", "", "isInputRequired", "", "step", "whooplabs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class CampaignStepsScreenResponseKt {
    private static final boolean isInputRequired(CampaignStepResponse campaignStepResponse) {
        if (AbstractC22676k.m65745e(campaignStepResponse.isBthr(), Boolean.TRUE)) {
            BtHrConfigResponse btHrConfig = campaignStepResponse.getBtHrConfig();
            if (btHrConfig != null) {
                return btHrConfig.isRequired();
            }
            return false;
        }
        Map<String, Object> inputConfig = campaignStepResponse.getInputConfig();
        Object obj = inputConfig != null ? inputConfig.get("required") : null;
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final List<ProtocolStep> toProtocolSteps(List<CampaignStepResponse> list, int i13) {
        AbstractC22676k.m65750j(list, "<this>");
        List<CampaignStepResponse> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        int i14 = 0;
        for (Object obj : list2) {
            int i15 = i14 + 1;
            String blockedRegex = null;
            if (i14 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            CampaignStepResponse campaignStepResponse = (CampaignStepResponse) obj;
            int id4 = campaignStepResponse.getId();
            String content = campaignStepResponse.getContent();
            String webViewUrl = campaignStepResponse.getWebViewUrl();
            String webViewTitle = campaignStepResponse.getWebViewTitle();
            String imageUrl = campaignStepResponse.getImageUrl();
            String imageAlt = campaignStepResponse.getImageAlt();
            boolean z4 = campaignStepResponse.getMysticResponse() != null;
            boolean zM65745e = AbstractC22676k.m65745e(campaignStepResponse.isBthr(), Boolean.TRUE);
            Boolean boolIsTimerActive = campaignStepResponse.isTimerActive();
            String title = campaignStepResponse.getTitle();
            String subtitle = campaignStepResponse.getSubtitle();
            String cta = campaignStepResponse.getCta();
            MysticResponse mysticResponse = campaignStepResponse.getMysticResponse();
            String systolicLabel = mysticResponse != null ? mysticResponse.getSystolicLabel() : null;
            MysticResponse mysticResponse2 = campaignStepResponse.getMysticResponse();
            Integer numValueOf = mysticResponse2 != null ? Integer.valueOf(mysticResponse2.getSystolicMax()) : null;
            MysticResponse mysticResponse3 = campaignStepResponse.getMysticResponse();
            Integer numValueOf2 = mysticResponse3 != null ? Integer.valueOf(mysticResponse3.getSystolicMin()) : null;
            MysticResponse mysticResponse4 = campaignStepResponse.getMysticResponse();
            String systolicTooHighLabel = mysticResponse4 != null ? mysticResponse4.getSystolicTooHighLabel() : null;
            MysticResponse mysticResponse5 = campaignStepResponse.getMysticResponse();
            String systolicTooLowLabel = mysticResponse5 != null ? mysticResponse5.getSystolicTooLowLabel() : null;
            MysticResponse mysticResponse6 = campaignStepResponse.getMysticResponse();
            String systolicSuffix = mysticResponse6 != null ? mysticResponse6.getSystolicSuffix() : null;
            MysticResponse mysticResponse7 = campaignStepResponse.getMysticResponse();
            String systolicRequiredText = mysticResponse7 != null ? mysticResponse7.getSystolicRequiredText() : null;
            MysticResponse mysticResponse8 = campaignStepResponse.getMysticResponse();
            Boolean boolValueOf = mysticResponse8 != null ? Boolean.valueOf(mysticResponse8.isSystolicRequired()) : null;
            MysticResponse mysticResponse9 = campaignStepResponse.getMysticResponse();
            String diastolicLabel = mysticResponse9 != null ? mysticResponse9.getDiastolicLabel() : null;
            MysticResponse mysticResponse10 = campaignStepResponse.getMysticResponse();
            Integer numValueOf3 = mysticResponse10 != null ? Integer.valueOf(mysticResponse10.getDiastolicMax()) : null;
            MysticResponse mysticResponse11 = campaignStepResponse.getMysticResponse();
            Integer numValueOf4 = mysticResponse11 != null ? Integer.valueOf(mysticResponse11.getDiastolicMin()) : null;
            MysticResponse mysticResponse12 = campaignStepResponse.getMysticResponse();
            String diastolicTooHighLabel = mysticResponse12 != null ? mysticResponse12.getDiastolicTooHighLabel() : null;
            MysticResponse mysticResponse13 = campaignStepResponse.getMysticResponse();
            String diastolicTooLowLabel = mysticResponse13 != null ? mysticResponse13.getDiastolicTooLowLabel() : null;
            MysticResponse mysticResponse14 = campaignStepResponse.getMysticResponse();
            String diastolicSuffix = mysticResponse14 != null ? mysticResponse14.getDiastolicSuffix() : null;
            MysticResponse mysticResponse15 = campaignStepResponse.getMysticResponse();
            String diastolicRequiredText = mysticResponse15 != null ? mysticResponse15.getDiastolicRequiredText() : null;
            MysticResponse mysticResponse16 = campaignStepResponse.getMysticResponse();
            Boolean boolValueOf2 = mysticResponse16 != null ? Boolean.valueOf(mysticResponse16.isDiastolicRequired()) : null;
            MysticResponse mysticResponse17 = campaignStepResponse.getMysticResponse();
            String hrLabel = mysticResponse17 != null ? mysticResponse17.getHrLabel() : null;
            MysticResponse mysticResponse18 = campaignStepResponse.getMysticResponse();
            Integer numValueOf5 = mysticResponse18 != null ? Integer.valueOf(mysticResponse18.getHrMax()) : null;
            MysticResponse mysticResponse19 = campaignStepResponse.getMysticResponse();
            Integer numValueOf6 = mysticResponse19 != null ? Integer.valueOf(mysticResponse19.getHrMin()) : null;
            MysticResponse mysticResponse20 = campaignStepResponse.getMysticResponse();
            String hrTooHighLabel = mysticResponse20 != null ? mysticResponse20.getHrTooHighLabel() : null;
            MysticResponse mysticResponse21 = campaignStepResponse.getMysticResponse();
            String hrTooLowLabel = mysticResponse21 != null ? mysticResponse21.getHrTooLowLabel() : null;
            MysticResponse mysticResponse22 = campaignStepResponse.getMysticResponse();
            String hrSuffix = mysticResponse22 != null ? mysticResponse22.getHrSuffix() : null;
            MysticResponse mysticResponse23 = campaignStepResponse.getMysticResponse();
            Boolean boolValueOf3 = mysticResponse23 != null ? Boolean.valueOf(mysticResponse23.isHrRequired()) : null;
            MysticResponse mysticResponse24 = campaignStepResponse.getMysticResponse();
            String hrRequiredText = mysticResponse24 != null ? mysticResponse24.getHrRequiredText() : null;
            InputType inputType = campaignStepResponse.getInputType();
            String string = inputType != null ? inputType.toString() : null;
            boolean zIsInputRequired = isInputRequired(campaignStepResponse);
            BtHrConfigResponse btHrConfig = campaignStepResponse.getBtHrConfig();
            String requiredRegex = btHrConfig != null ? btHrConfig.getRequiredRegex() : null;
            BtHrConfigResponse btHrConfig2 = campaignStepResponse.getBtHrConfig();
            if (btHrConfig2 != null) {
                blockedRegex = btHrConfig2.getBlockedRegex();
            }
            arrayList.add(new ProtocolStep(i13, id4, content, i14, webViewUrl, imageUrl, imageAlt, z4, boolIsTimerActive, zM65745e, title, subtitle, cta, webViewTitle, systolicLabel, systolicTooLowLabel, systolicTooHighLabel, systolicRequiredText, numValueOf, numValueOf2, systolicSuffix, boolValueOf, diastolicLabel, diastolicTooLowLabel, diastolicTooHighLabel, diastolicRequiredText, numValueOf3, numValueOf4, diastolicSuffix, boolValueOf2, hrLabel, hrTooLowLabel, hrTooHighLabel, hrRequiredText, numValueOf5, numValueOf6, hrSuffix, boolValueOf3, string, zIsInputRequired, requiredRegex, blockedRegex, campaignStepResponse.getCountDownTimerRequired(), campaignStepResponse.getCountDownTimerSeconds(), campaignStepResponse.getSurveyFormId(), campaignStepResponse.getSurveyVendorMetadata(), campaignStepResponse.getSurveyProvider()));
            i14 = i15;
        }
        return arrayList;
    }
}
