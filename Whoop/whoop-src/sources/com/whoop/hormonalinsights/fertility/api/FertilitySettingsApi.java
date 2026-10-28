package com.whoop.hormonalinsights.fertility.api;

import l83.C23454a0;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37284o;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/hormonalinsights/fertility/api/FertilitySettingsApi;", "", "Lcom/whoop/hormonalinsights/fertility/api/FertilitySettingsRequest;", "body", "Lpg3/v0;", "Ll83/a0;", "updateFertilitySettings", "(Lcom/whoop/hormonalinsights/fertility/api/FertilitySettingsRequest;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/hormonalinsights/fertility/api/DisableFertilitySurveyRequest;", "submitDisableFertilitySurvey", "(Lcom/whoop/hormonalinsights/fertility/api/DisableFertilitySurveyRequest;Lq83/d;)Ljava/lang/Object;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface FertilitySettingsApi {
    @InterfaceC37284o("fertility-service/v1/fertility-insights/disable-survey-responses")
    Object submitDisableFertilitySurvey(@InterfaceC37270a DisableFertilitySurveyRequest disableFertilitySurveyRequest, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37284o("fertility-service/v1/fertility-insights/feature-enablement")
    Object updateFertilitySettings(@InterfaceC37270a FertilitySettingsRequest fertilitySettingsRequest, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);
}
