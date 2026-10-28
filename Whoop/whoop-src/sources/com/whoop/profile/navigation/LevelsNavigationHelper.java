package com.whoop.profile.navigation;

import com.whoop.domain.model.memberlevels.MemberLevelProfileViewData;
import j02.AbstractC21155m0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lcom/whoop/profile/navigation/LevelsNavigationHelper;", "", "<init>", "()V", "Lj02/m0$o2;", "levelsScreen", "Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;", "convertToMemberLevelProfileViewData", "(Lj02/m0$o2;)Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class LevelsNavigationHelper {
    public static final int $stable = 0;
    public static final LevelsNavigationHelper INSTANCE = new LevelsNavigationHelper();

    private LevelsNavigationHelper() {
    }

    public final MemberLevelProfileViewData convertToMemberLevelProfileViewData(AbstractC21155m0.o2 levelsScreen) {
        AbstractC22676k.m65750j(levelsScreen, "levelsScreen");
        return new MemberLevelProfileViewData(levelsScreen.getLevel(), levelsScreen.getExperience(), levelsScreen.getMinimumExperience(), levelsScreen.getMaximumExperience(), levelsScreen.getBadge(), levelsScreen.getMiniBadge(), levelsScreen.getTier(), null, 0, null, null, null);
    }
}
