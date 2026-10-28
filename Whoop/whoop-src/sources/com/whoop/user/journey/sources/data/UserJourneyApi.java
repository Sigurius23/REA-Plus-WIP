package com.whoop.user.journey.sources.data;

import com.whoop.user.journey.model.TimeCapsuleRequest;
import com.whoop.user.journey.model.UserJourneyContentModel;
import com.whoop.user.journey.model.UserJourneyContentModelV2;
import l83.C23454a0;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37285p;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH§@¢\u0006\u0004\b\f\u0010\tJ \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\r\u0010\u0006J*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/user/journey/sources/data/UserJourneyApi;", "", "", "year", "Lcom/whoop/user/journey/model/UserJourneyContentModelV2;", "getYearInReviewSteps", "(ILq83/d;)Ljava/lang/Object;", "Lcom/whoop/user/journey/model/UserJourneyContentModel;", "getWeekInReviewSteps", "(Lq83/d;)Ljava/lang/Object;", "Lpg3/v0;", "Ll83/a0;", "sendWirSeen", "sendYirSeen", "Lcom/whoop/user/journey/model/TimeCapsuleRequest;", "request", "saveTimeCapsule", "(ILcom/whoop/user/journey/model/TimeCapsuleRequest;Lq83/d;)Ljava/lang/Object;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface UserJourneyApi {
    @InterfaceC37275f("user-journey-service/v1/user-journey/first-week-in-review")
    Object getWeekInReviewSteps(InterfaceC30057d<? super UserJourneyContentModel> interfaceC30057d);

    @InterfaceC37275f("user-journey-service/v2/bff/user-journey/year-in-review")
    Object getYearInReviewSteps(@InterfaceC37289t("year") int i13, InterfaceC30057d<? super UserJourneyContentModelV2> interfaceC30057d);

    @InterfaceC37284o("user-journey-service/v2/user-journey/year-in-review/time-capsule")
    Object saveTimeCapsule(@InterfaceC37289t("year") int i13, @InterfaceC37270a TimeCapsuleRequest timeCapsuleRequest, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37284o("user-journey-service/v1/user-journey/first-week-in-review/is-seen")
    Object sendWirSeen(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37285p("user-journey-service/v1/user-journey/year-in-review/is-seen")
    Object sendYirSeen(@InterfaceC37289t("year") int i13, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);
}
