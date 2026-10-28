package cj2;

import ad3.C0764g;
import ak1.AbstractC0949b;
import androidx.health.platform.client.proto.C1533u;
import ck1.AbstractC4781d;
import ck1.AbstractC4783f;
import ck1.AbstractC4786i;
import ck1.AbstractC4787j;
import ck1.AbstractC4790m;
import ck2.C4792a;
import cm0.AbstractC4807d;
import cm2.C4836x;
import com.whoop.bot.settings.CoachSettingsActivityRecommendationContentKt;
import com.whoop.bot.settings.CoachSettingsCoachingModeKt;
import com.whoop.bot.settings.CoachSettingsConcisenessContentKt;
import com.whoop.bot.settings.CoachSettingsScreenKt;
import com.whoop.bot.settings.CoachSettingsViewEvent;
import com.whoop.data.local.room.dao.persistent.CachedMetricsDataDao_Impl;
import com.whoop.data.local.room.dao.persistent.OptimalStrainMappingDao_Impl;
import com.whoop.data.local.room.dao.persistent.RawDataDao_Impl;
import com.whoop.healthmonitor.view.ComposableHealthReportFragment;
import com.whoop.navigation.C9598e;
import com.whoop.p057ai.chat.domain.formwidget.AbstractC5939g;
import com.whoop.strengthworkout.domain.models.StrengthWorkoutModel;
import java.io.File;
import jb1.C21536b;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;
import p716lb1.C23749z0;
import p720m91.C25308q;
import p745y81.C39336i;
import uz0.InterfaceC35414h;
import vj1.AbstractC36068a;
import zj1.AbstractC40770a;

/* JADX INFO: renamed from: cj2.a */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C4769a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f19655w;

    public /* synthetic */ C4769a(int i13) {
        this.f19655w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19655w) {
            case 0:
                return AbstractC4770b.m15037g((C21536b) obj);
            case 1:
                return AbstractC4770b.m15040j((C25308q) obj);
            case 2:
                return AbstractC4770b.m15038h((C23749z0) obj);
            case 3:
                return AbstractC4770b.m15039i((StrengthWorkoutModel) obj);
            case 4:
                return AbstractC4781d.m15051b((C25308q) obj);
            case 5:
                return AbstractC4783f.m15065m((AbstractC0949b) obj);
            case 6:
                return AbstractC4783f.m15066n((AbstractC40770a) obj);
            case 7:
                return AbstractC4783f.m15067o((AbstractC36068a) obj);
            case 8:
                return AbstractC4786i.m15099s((AbstractC36068a) obj);
            case 9:
                return AbstractC4786i.m15106z(obj);
            case 10:
                return AbstractC4786i.m15074D(obj);
            case 11:
                return ComposableHealthReportFragment.m21601J((String) obj);
            case 12:
                return AbstractC4787j.m15115i((File) obj);
            case 13:
                return AbstractC4787j.m15116j((String) obj);
            case 14:
                return AbstractC4790m.m15129h((C9598e) obj);
            case 15:
                return C4792a.m15146d((C21536b) obj);
            case 16:
                return AbstractC4807d.m15177h(obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC4807d.m15178i((InterfaceC35414h) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return C4836x.m15313e((C39336i) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC5939g.m17809c((C0764g) obj);
            case 20:
                return CoachSettingsActivityRecommendationContentKt.CoachSettingsActivityRecommendationContent$lambda$1$0((CoachSettingsViewEvent) obj);
            case 21:
                return CoachSettingsCoachingModeKt.CoachingModeContent$lambda$1$0((CoachSettingsViewEvent) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return CoachSettingsConcisenessContentKt.ConcisenessContent$lambda$1$0((CoachSettingsViewEvent) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return CoachSettingsScreenKt.CoachSettingsContent$lambda$0$0((CoachSettingsViewEvent) obj);
            case 24:
                return CoachSettingsScreenKt.CoachSettingsScreen$lambda$0$0((CoachSettingsViewEvent) obj);
            case 25:
                return CoachSettingsScreenKt.ErrorState$lambda$0$0((CoachSettingsViewEvent) obj);
            case 26:
                return CachedMetricsDataDao_Impl.lambda$getOldestPacketRevision$3((InterfaceC33687a) obj);
            case 27:
                return OptimalStrainMappingDao_Impl.lambda$deleteAll$5((InterfaceC33687a) obj);
            case 28:
                return OptimalStrainMappingDao_Impl.lambda$getAll$4((InterfaceC33687a) obj);
            default:
                return RawDataDao_Impl.lambda$observeNewestTimestamp$6((InterfaceC33687a) obj);
        }
    }
}
