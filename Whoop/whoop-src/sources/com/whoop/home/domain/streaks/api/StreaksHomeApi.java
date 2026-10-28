package com.whoop.home.domain.streaks.api;

import com.whoop.home.domain.models.CommunityStreaksRequestBody;
import com.whoop.home.domain.models.StreakMetadata;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37284o;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/home/domain/streaks/api/StreaksHomeApi;", "", "Lcom/whoop/home/domain/models/StreakMetadata;", "fetchStreaks", "(Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/home/domain/models/CommunityStreaksRequestBody;", "body", "getUserStreak", "(Lcom/whoop/home/domain/models/CommunityStreaksRequestBody;Lq83/d;)Ljava/lang/Object;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface StreaksHomeApi {
    @InterfaceC37275f("streaks-service/v1/streaks/data-streak")
    Object fetchStreaks(InterfaceC30057d<? super StreakMetadata> interfaceC30057d);

    @InterfaceC37284o("streaks-service/v1/streaks/data-streak/community")
    Object getUserStreak(@InterfaceC37270a CommunityStreaksRequestBody communityStreaksRequestBody, InterfaceC30057d<? super StreakMetadata> interfaceC30057d);
}
