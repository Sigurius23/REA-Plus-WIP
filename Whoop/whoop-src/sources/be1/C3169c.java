package be1;

import a11.C0140r;
import a42.C0378a;
import android.content.Context;
import androidx.health.platform.client.proto.C1533u;
import av2.InterfaceC2094a;
import bc3.InterfaceC2994c0;
import bi2.C3294j;
import bm2.AbstractC3487z0;
import bs1.AbstractC3583c0;
import bv2.AbstractC3676c;
import c31.C3925i;
import c31.C3927k;
import c31.EnumC3919c;
import c41.AbstractC3993b1;
import c51.AbstractC4234k;
import c51.C4242s;
import c93.InterfaceC4351m;
import c93.InterfaceC4353o;
import cc2.AbstractC4417f;
import cc2.C4414c;
import ck1.AbstractC4786i;
import cm0.AbstractC4807d;
import cm0.C4804a;
import com.whoop.advancedlabs.testupload.view.TestUploadFragment;
import com.whoop.bot.settings.CoachSettingsActivityRecommendationContentKt;
import com.whoop.bot.settings.CoachSettingsRecommendedActivitiesState;
import com.whoop.bot.settings.CoachSettingsScreenKt;
import com.whoop.bot.settings.SettingItem;
import com.whoop.data.local.room.dao.persistent.OptimalStrainMappingDao_Impl;
import com.whoop.data.local.room.dao.wipeable.FeatureTeamDao_Impl;
import com.whoop.data.local.room.dao.wipeable.GpsDao_Impl;
import com.whoop.data.local.room.dao.wipeable.JournalDao_Impl;
import com.whoop.data.local.room.dao.wipeable.MemberStoryDao_Impl;
import com.whoop.data.local.room.dao.wipeable.TeamInviteDao_Impl;
import com.whoop.data.local.room.dao.wipeable.TeamsDao_Impl;
import com.whoop.data.local.room.entity.GpsDto;
import com.whoop.data.local.room.entity.GpsMetaDataDto;
import com.whoop.data.local.room.entity.JournalAnsweredDto;
import com.whoop.data.local.room.entity.OptimalStrainMapping;
import com.whoop.data.local.room.entity.TeamsDto;
import com.whoop.design.showcase.gallery.view.fragment.AtomicGalleryFragment;
import com.whoop.domain.model.teams.FeatureTeam;
import com.whoop.domain.model.teams.MemberStory;
import com.whoop.domain.model.teams.TeamInviteDto;
import com.whoop.navigation.C9598e;
import com.whoop.pregnancy.view.PregnancySettingsFragment;
import com.whoop.profile.view.edit.EditProfileFieldsContentKt;
import com.whoop.profile.view.edit.form.TextFieldConfig;
import com.whoop.service.network.model.DefaultImages;
import ds1.C12337g;
import hv1.C17671a;
import java.util.List;
import k91.C22303b;
import l83.InterfaceC23462h;
import ld1.AbstractC23864c;
import p114eb.C12991u0;
import p163g1.C15136s0;
import p208i2.AbstractC17911t;
import p208i2.C17914u0;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p390p1.InterfaceC28601c1;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;
import p748zc1.EnumC40298d0;
import q83.InterfaceC30057d;
import tp0.EnumC34058c;
import tr2.InterfaceC34116n;
import ye0.C39477a;
import yh2.EnumC39542a;
import zd1.InterfaceC40549d;
import ze0.InterfaceC40582a;

/* JADX INFO: renamed from: be1.c */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C3169c implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f12394w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f12395x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f12396y;

    public /* synthetic */ C3169c(int i13, Object obj, Object obj2) {
        this.f12394w = i13;
        this.f12395x = obj;
        this.f12396y = obj2;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f12394w) {
            case 0:
                return AbstractC3173g.m9097b0((InterfaceC40549d.a) this.f12395x, (Function1) this.f12396y, (EnumC34058c) obj);
            case 1:
                return TestUploadFragment.m17652R((C39477a) this.f12395x, (TestUploadFragment) this.f12396y, (InterfaceC40582a) obj);
            case 2:
                return C3294j.m9584d((C3294j) this.f12395x, (EnumC39542a) this.f12396y, (String) obj);
            case 3:
                return AbstractC3487z0.m10226I((C17671a) this.f12395x, (InterfaceC28601c1) this.f12396y, obj);
            case 4:
                return AbstractC3583c0.m10794T1((Function1) this.f12396y, (InterfaceC4351m) this.f12395x, ((Boolean) obj).booleanValue());
            case 5:
                return AbstractC3583c0.m10787R0((C12337g) this.f12395x, (InterfaceC4353o) this.f12396y, obj);
            case 6:
                return AbstractC3676c.m11378n((C12991u0) this.f12395x, (InterfaceC23462h) this.f12396y, (InterfaceC2094a) obj);
            case 7:
                return C3925i.m11924d((C3927k) this.f12395x, (Function1) this.f12396y, (EnumC3919c) obj);
            case 8:
                return AbstractC3993b1.m12091o((C22303b) this.f12395x, (C17914u0) this.f12396y, (InterfaceC22129c) obj);
            case 9:
                return PregnancySettingsFragment.m23314t0((C0378a) this.f12395x, (PregnancySettingsFragment) this.f12396y, (C9598e) obj);
            case 10:
                return AbstractC4234k.m13150W((C4242s) this.f12395x, (AbstractC17911t) this.f12396y, (InterfaceC22131e) obj);
            case 11:
                return AbstractC4417f.m13860h((C4414c) this.f12395x, (AbstractC23864c) this.f12396y, (Context) obj);
            case 12:
                return AtomicGalleryFragment.m21116J0((InterfaceC2994c0) this.f12395x, (C15136s0) this.f12396y, (EnumC40298d0) obj);
            case 13:
                return AbstractC4786i.m15072B((Function1) this.f12396y, (C0140r) this.f12395x, obj);
            case 14:
                return AbstractC4807d.m15181l((C4804a) this.f12395x, (Function1) this.f12396y, obj);
            case 15:
                return CoachSettingsActivityRecommendationContentKt.CoachSettingsActivityRecommendationContent$lambda$2$0$0$0$0((Function1) this.f12396y, (CoachSettingsRecommendedActivitiesState) this.f12395x, ((Boolean) obj).booleanValue());
            case 16:
                return CoachSettingsScreenKt.SettingItemEntry_rAjV9yQ$lambda$0$0$1$0$0((Function1) this.f12396y, (SettingItem) this.f12395x, ((Boolean) obj).booleanValue());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return ((OptimalStrainMappingDao_Impl) this.f12395x).lambda$insert$0((OptimalStrainMapping) this.f12396y, (InterfaceC33687a) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return ((FeatureTeamDao_Impl) this.f12395x).lambda$saveFeatureTeam$0((FeatureTeam) this.f12396y, (InterfaceC33687a) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ((FeatureTeamDao_Impl) this.f12395x).lambda$addFeatureTeams$2((List) this.f12396y, (InterfaceC30057d) obj);
            case 20:
                return ((GpsDao_Impl) this.f12395x).lambda$saveGpsDto$0((GpsDto) this.f12396y, (InterfaceC33687a) obj);
            case 21:
                return ((GpsDao_Impl) this.f12395x).lambda$saveGpsMetaData$1((GpsMetaDataDto) this.f12396y, (InterfaceC33687a) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return ((JournalDao_Impl) this.f12395x).lambda$saveJournalAnsweredDto$0((JournalAnsweredDto) this.f12396y, (InterfaceC33687a) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return ((MemberStoryDao_Impl) this.f12395x).lambda$saveMemberStory$0((MemberStory) this.f12396y, (InterfaceC33687a) obj);
            case 24:
                return ((MemberStoryDao_Impl) this.f12395x).lambda$addMemberStories$1((List) this.f12396y, (InterfaceC30057d) obj);
            case 25:
                return ((TeamInviteDao_Impl) this.f12395x).lambda$saveTeamInvite$0((TeamInviteDto) this.f12396y, (InterfaceC33687a) obj);
            case 26:
                return ((TeamsDao_Impl) this.f12395x).lambda$saveTeam$0((TeamsDto) this.f12396y, (InterfaceC33687a) obj);
            case 27:
                return ((TeamsDao_Impl) this.f12395x).lambda$saveDefaultImages$1((DefaultImages) this.f12396y, (InterfaceC33687a) obj);
            case 28:
                return EditProfileFieldsContentKt.EditProfileFieldsContent$lambda$6$0$3$1$0((InterfaceC34116n) this.f12395x, (InterfaceC4351m) this.f12396y, (String) obj);
            default:
                return EditProfileFieldsContentKt.EditProfileFieldsContent$lambda$6$0$1$4$0((InterfaceC4351m) this.f12395x, (TextFieldConfig) this.f12396y, (String) obj);
        }
    }

    public /* synthetic */ C3169c(Function1 function1, Object obj, int i13) {
        this.f12394w = i13;
        this.f12396y = function1;
        this.f12395x = obj;
    }
}
