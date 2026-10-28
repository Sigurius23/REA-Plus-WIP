package com.whoop.aiinsights.domain;

import com.whoop.aiinsights.domain.models.AiInsightsResponse;
import l83.C23454a0;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37271b;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37288s;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J$\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\b\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/aiinsights/domain/AiInsightsApi;", "", "", "sourceContextType", "sourceId", "Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;", "getAiInsights", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "recommendationId", "Lpg3/v0;", "Ll83/a0;", "deleteActivityRecommendation", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "ai-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface AiInsightsApi {
    @InterfaceC37271b("ai-conversation-service/v1/activity-recommendations/{recommendation_id}")
    Object deleteActivityRecommendation(@InterfaceC37288s("recommendation_id") String str, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37275f("ai-conversation-service/v1/bottom-sheet/{source_context_type}")
    Object getAiInsights(@InterfaceC37288s("source_context_type") String str, @InterfaceC37289t("sourceId") String str2, InterfaceC30057d<? super AiInsightsResponse> interfaceC30057d);
}
