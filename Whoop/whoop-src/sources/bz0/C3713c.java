package bz0;

import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import c01.AbstractC3807g;
import c31.AbstractC3918b;
import c41.AbstractC3993b1;
import c41.AbstractC4021f1;
import c41.AbstractC4062l0;
import c93.InterfaceC4351m;
import com.whoop.bot.settings.CoachSettingsActivityRecommendationContentKt;
import com.whoop.bot.settings.CoachSettingsCoachingModeKt;
import com.whoop.bot.settings.CoachSettingsScreenKt;
import com.whoop.profile.view.ProfileAvatarKt;
import com.whoop.profile.view.ProfileBottomSheetKt;
import com.whoop.profile.view.ProfileFullScreenModalKt;
import com.whoop.profile.view.ProfileHeaderKt;
import com.whoop.profile.view.ProfileScreenContentKt;
import com.whoop.profile.view.edit.CountrySelectionContentKt;
import com.whoop.profile.view.edit.EditProfileContentKt;
import com.whoop.profile.view.edit.avatar.PhotoCropDisplayPreviewKt;
import com.whoop.profile.view.edit.avatar.PhotoSourceActionSheetPreviewKt;
import com.whoop.profile.view.edit.preview.EditProfileAvatarSectionWithImagePreviewKt;
import com.whoop.profile.view.edit.preview.EditProfileFullScreenModalPreviewKt;
import p702ch0.AbstractC4653u;

/* JADX INFO: renamed from: bz0.c */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C3713c implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f15170w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f15171x;

    public /* synthetic */ C3713c(int i13, int i14) {
        this.f15170w = i14;
        this.f15171x = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f15170w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC3714d.m11540i(this.f15171x, composer, iIntValue);
            case 1:
                return AbstractC3807g.m11647d(this.f15171x, composer, iIntValue);
            case 2:
                return AbstractC3807g.m11649f(this.f15171x, composer, iIntValue);
            case 3:
                return AbstractC3918b.m11901e(this.f15171x, composer, iIntValue);
            case 4:
                return AbstractC3918b.m11905i(this.f15171x, composer, iIntValue);
            case 5:
                return AbstractC4062l0.m12432t(this.f15171x, composer, iIntValue);
            case 6:
                return AbstractC3993b1.m12097u(this.f15171x, composer, iIntValue);
            case 7:
                return AbstractC4021f1.m12236m(this.f15171x, composer, iIntValue);
            case 8:
                return AbstractC4021f1.m12238o(this.f15171x, composer, iIntValue);
            case 9:
                return AbstractC4653u.m14659y(this.f15171x, composer, iIntValue);
            case 10:
                return CoachSettingsActivityRecommendationContentKt.CoachSettingsActivityRecommendationContentPreview$lambda$1(this.f15171x, composer, iIntValue);
            case 11:
                return CoachSettingsCoachingModeKt.CoachingModeContentPreview$lambda$1(this.f15171x, composer, iIntValue);
            case 12:
                return CoachSettingsScreenKt.CoachSettingsScreenPreview$lambda$1(this.f15171x, composer, iIntValue);
            case 13:
                return ProfileAvatarKt.ProfileAvatarWithImagePreview$lambda$1(this.f15171x, composer, iIntValue);
            case 14:
                return ProfileBottomSheetKt.ProfileBottomSheetContentPreview$lambda$1(this.f15171x, composer, iIntValue);
            case 15:
                return ProfileFullScreenModalKt.PreviewProfileLoadingContentAreaModal$lambda$1(this.f15171x, composer, iIntValue);
            case 16:
                return ProfileFullScreenModalKt.PreviewProfileNetworkErrorContentAreaModal$lambda$1(this.f15171x, composer, iIntValue);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return ProfileFullScreenModalKt.PreviewProfileServerErrorContentAreaModal$lambda$1(this.f15171x, composer, iIntValue);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return ProfileFullScreenModalKt.PreviewProfileSuccessContentAreaModal$lambda$1(this.f15171x, composer, iIntValue);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ProfileHeaderKt.ProfileHeaderFoundingMemberPreview$lambda$1(this.f15171x, composer, iIntValue);
            case 20:
                return ProfileHeaderKt.ProfileHeaderLongTextPreview$lambda$1(this.f15171x, composer, iIntValue);
            case 21:
                return ProfileHeaderKt.ProfileHeaderOtherProfilePreview$lambda$1(this.f15171x, composer, iIntValue);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return ProfileHeaderKt.ProfileHeaderSelfProfilePreview$lambda$1(this.f15171x, composer, iIntValue);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return ProfileScreenContentKt.PreviewProfileContentArea$lambda$1(this.f15171x, composer, iIntValue);
            case 24:
                return CountrySelectionContentKt.CountrySelectionContentPreview$lambda$1(this.f15171x, composer, iIntValue);
            case 25:
                return EditProfileContentKt.EditProfileContentPreview$lambda$1(this.f15171x, composer, iIntValue);
            case 26:
                return PhotoCropDisplayPreviewKt.PhotoCropDisplayPreview$lambda$1(this.f15171x, composer, iIntValue);
            case 27:
                return PhotoSourceActionSheetPreviewKt.PhotoSourceActionSheetPreview$lambda$1(this.f15171x, composer, iIntValue);
            case 28:
                return EditProfileAvatarSectionWithImagePreviewKt.EditProfileAvatarSectionWithImagePreview$lambda$1(this.f15171x, composer, iIntValue);
            default:
                return EditProfileFullScreenModalPreviewKt.EditProfileScreenLoadingPreview$lambda$1(this.f15171x, composer, iIntValue);
        }
    }
}
