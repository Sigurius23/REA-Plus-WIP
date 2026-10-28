package com.whoop.data.local.room.dao.persistent;

import android.graphics.Rect;
import androidx.health.platform.client.proto.C1533u;
import com.whoop.data.local.room.dao.wipeable.FeatureTeamDao_Impl;
import com.whoop.data.local.room.dao.wipeable.GpsDao_Impl;
import com.whoop.data.local.room.dao.wipeable.MemberStoryDao_Impl;
import com.whoop.data.local.room.dao.wipeable.SmartAlarmDiagnosticDao_Impl;
import com.whoop.data.local.room.dao.wipeable.TeamInviteDao_Impl;
import com.whoop.profile.domain.models.components.ContextHubTileModel;
import com.whoop.profile.domain.models.components.ReferralsTileModel;
import com.whoop.profile.domain.models.components.StreakTileModel;
import com.whoop.profile.presentation.ProfileEvent;
import com.whoop.profile.presentation.edit.EditProfileEvent;
import com.whoop.profile.presentation.reducers.ProfileViewStateReducerKt;
import com.whoop.profile.view.ProfileHeaderKt;
import com.whoop.profile.view.ProfileScreenContentKt;
import com.whoop.profile.view.ProfileScreenEventRouter;
import com.whoop.profile.view.ProfileScreenKt;
import com.whoop.profile.view.edit.CountrySelectionContentKt;
import com.whoop.profile.view.edit.EditProfileAvatarSectionKt;
import com.whoop.profile.view.edit.EditProfileContentKt;
import com.whoop.profile.view.edit.EditProfileFieldsContentKt;
import com.whoop.profile.view.edit.avatar.AvatarEditBottomSheetContentKt;
import com.whoop.profile.view.edit.avatar.AvatarEditBottomSheetKt;
import com.whoop.profile.view.edit.form.EditProfileFormUtils;
import com.whoop.profile.view.edit.form.FieldState;
import jb1.C21536b;
import l83.C23465k;
import p134f2.C14015d;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;
import p716lb1.C23749z0;
import p720m91.C25308q;

/* JADX INFO: renamed from: com.whoop.data.local.room.dao.persistent.i */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C6498i implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f25400w;

    public /* synthetic */ C6498i(int i13) {
        this.f25400w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f25400w) {
            case 0:
                return RawDataDao_Impl.lambda$deleteAllData$7((InterfaceC33687a) obj);
            case 1:
                return FeatureTeamDao_Impl.lambda$deleteAllFeatureTeams$7((InterfaceC33687a) obj);
            case 2:
                return GpsDao_Impl.lambda$getGpsMetaData$5((InterfaceC33687a) obj);
            case 3:
                return GpsDao_Impl.lambda$getGpsMetaCount$6((InterfaceC33687a) obj);
            case 4:
                return GpsDao_Impl.lambda$count$2((InterfaceC33687a) obj);
            case 5:
                return MemberStoryDao_Impl.lambda$deleteAllMemberStories$6((InterfaceC33687a) obj);
            case 6:
                return MemberStoryDao_Impl.lambda$getMemberStoryData$3((InterfaceC33687a) obj);
            case 7:
                return MemberStoryDao_Impl.lambda$getFlowMemberStoryData$4((InterfaceC33687a) obj);
            case 8:
                return SmartAlarmDiagnosticDao_Impl.lambda$deleteAll$3((InterfaceC33687a) obj);
            case 9:
                return TeamInviteDao_Impl.lambda$removeAllInvites$6((InterfaceC33687a) obj);
            case 10:
                return ProfileViewStateReducerKt.itemReducer$lambda$0$0$0((ContextHubTileModel) obj);
            case 11:
                return ProfileViewStateReducerKt.itemReducer$lambda$0$0$1((StreakTileModel) obj);
            case 12:
                return ProfileViewStateReducerKt.itemReducer$lambda$0$0$2((ReferralsTileModel) obj);
            case 13:
                return ProfileViewStateReducerKt.itemReducer$lambda$0$0((C23749z0) obj);
            case 14:
                return ProfileViewStateReducerKt.itemReducer$lambda$0((C21536b) obj);
            case 15:
                return ProfileHeaderKt.ProfileHeader$lambda$0$0((ProfileEvent) obj);
            case 16:
                return ProfileHeaderKt.ProfileHeader$lambda$2$0$0$0((C14015d) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return ProfileScreenContentKt.profileItemViewFactory$lambda$0((C25308q) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return ProfileScreenContentKt.ProfileContentArea$lambda$1$0(((Float) obj).floatValue());
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ProfileScreenContentKt.ProfileScreenItem$lambda$0$0(obj);
            case 20:
                return ProfileScreenEventRouter._init_$lambda$0((Runnable) obj);
            case 21:
                return ProfileScreenKt.ProfileScreen$lambda$13$0((ProfileEvent) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return CountrySelectionContentKt.CountrySelectionContent$lambda$5$0$1((C23465k) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return EditProfileAvatarSectionKt.EditProfileAvatarSection$lambda$0$0((EditProfileEvent.ViewEvent) obj);
            case 24:
                return EditProfileContentKt.EditProfileMainContent$lambda$0$0((EditProfileEvent.FieldType) obj);
            case 25:
                return EditProfileContentKt.EditProfileContent$lambda$0$0((EditProfileEvent.FieldType) obj);
            case 26:
                return EditProfileFieldsContentKt.EditProfileFieldsContent$lambda$0$0((EditProfileEvent.FieldType) obj);
            case 27:
                return AvatarEditBottomSheetContentKt.AvatarEditBottomSheetContent$lambda$0$0((Rect) obj);
            case 28:
                return AvatarEditBottomSheetKt.PhotoCropDisplay$lambda$0$0((Rect) obj);
            default:
                return EditProfileFormUtils.handleEmailValidation$lambda$1((FieldState) obj);
        }
    }
}
