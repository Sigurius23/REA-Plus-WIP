package com.whoop.coacheverywhere.domain;

import com.whoop.coacheverywhere.domain.models.MarkMessageAsSeenRequest;
import com.whoop.coacheverywhere.domain.models.ProactiveResponse;
import l83.C23454a0;
import live.hms.video.media.tracks.HMSTrackSource;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37288s;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J$\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\t\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\u0007J.\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/coacheverywhere/domain/ProactiveApi;", "", "", HMSTrackSource.SCREEN, "conversationId", "Lcom/whoop/coacheverywhere/domain/models/ProactiveResponse;", "getProactiveAnimation", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "fingerprint", "getPresentation", "messageId", "Lcom/whoop/coacheverywhere/domain/models/MarkMessageAsSeenRequest;", "request", "Ll83/a0;", "markMessageAsSeen", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/coacheverywhere/domain/models/MarkMessageAsSeenRequest;Lq83/d;)Ljava/lang/Object;", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface ProactiveApi {
    @InterfaceC37275f("/ai-conversation-bff/v1/conversation/{fingerprint}/presentation/{screen}")
    Object getPresentation(@InterfaceC37288s("fingerprint") String str, @InterfaceC37288s(HMSTrackSource.SCREEN) String str2, InterfaceC30057d<? super ProactiveResponse> interfaceC30057d);

    @InterfaceC37275f("/ai-conversation-bff/v1/proactive-animation")
    Object getProactiveAnimation(@InterfaceC37289t(HMSTrackSource.SCREEN) String str, @InterfaceC37289t("conversationId") String str2, InterfaceC30057d<? super ProactiveResponse> interfaceC30057d);

    @InterfaceC37284o("/ai-conversation-service/v1/conversation/{conversationId}/message/{messageId}/seen")
    Object markMessageAsSeen(@InterfaceC37288s("conversationId") String str, @InterfaceC37288s("messageId") String str2, @InterfaceC37270a MarkMessageAsSeenRequest markMessageAsSeenRequest, InterfaceC30057d<? super C23454a0> interfaceC30057d);
}
