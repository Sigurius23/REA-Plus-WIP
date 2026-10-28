package com.whoop.sleep.coach.data.network.api;

import com.whoop.sleep.coach.data.network.model.HarvardSleepAdviceDto;
import com.whoop.sleep.coach.data.network.model.VowDto;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J$\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/sleep/coach/data/network/api/SleepCoachUsersApiMigrations;", "", "Lcom/whoop/sleep/coach/data/network/model/HarvardSleepAdviceDto;", "fetchSleepAdviceV2", "(Lq83/d;)Ljava/lang/Object;", "harvardSleepAdviceDto", "", "format", "Lcom/whoop/sleep/coach/data/network/model/VowDto;", "fetchSleepCoachVow", "(Lcom/whoop/sleep/coach/data/network/model/HarvardSleepAdviceDto;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface SleepCoachUsersApiMigrations {
    @InterfaceC37275f("coaching-service/v2/sleepneed")
    Object fetchSleepAdviceV2(InterfaceC30057d<? super HarvardSleepAdviceDto> interfaceC30057d);

    @InterfaceC37284o("vow-service/v1/coaching/vows/sleepcoach")
    Object fetchSleepCoachVow(@InterfaceC37270a HarvardSleepAdviceDto harvardSleepAdviceDto, @InterfaceC37289t("format") String str, InterfaceC30057d<? super VowDto> interfaceC30057d);
}
