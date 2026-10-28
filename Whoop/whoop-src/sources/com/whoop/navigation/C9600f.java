package com.whoop.navigation;

import ad3.AbstractC0757c;
import androidx.core.app.NotificationCompat;
import com.mapbox.common.HttpHeaders;
import com.whoop.data.remote.domain.dto.DateTimeRange;
import com.whoop.profile.domain.ProfileApiKt;
import io.getstream.chat.android.client.api.QueryParams;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import l02.C23050a;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import m83.C25271y;
import m83.C25272z;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import qr2.AbstractC30556a;
import wb3.AbstractC37056f;
import xc3.AbstractC38195a;
import yb3.AbstractC39414r;
import yb3.AbstractC39420x;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: com.whoop.navigation.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/navigation/f;", "", "Ll02/a;", "queryParamDeserializer", "<init>", "(Ll02/a;)V", "Lcom/whoop/navigation/AppScreen;", "appScreen", "", "query", "Lcom/whoop/navigation/NavigationScreenModel;", "a", "(Lcom/whoop/navigation/AppScreen;Ljava/lang/String;)Lcom/whoop/navigation/NavigationScreenModel;", "", "queryMap", "b", "(Lcom/whoop/navigation/AppScreen;Ljava/util/Map;)Lcom/whoop/navigation/NavigationScreenModel;", "Ll02/a;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C9600f {

    /* JADX INFO: renamed from: c */
    public static final int f28139c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C23050a queryParamDeserializer;

    public C9600f(C23050a queryParamDeserializer) {
        AbstractC22676k.m65750j(queryParamDeserializer, "queryParamDeserializer");
        this.queryParamDeserializer = queryParamDeserializer;
    }

    /* JADX INFO: renamed from: a */
    public final NavigationScreenModel m23135a(AppScreen appScreen, String query) {
        Map<String, String> linkedHashMap;
        AbstractC22676k.m65750j(appScreen, "appScreen");
        if (query == null || query.length() == 0) {
            linkedHashMap = C25272z.f99163w;
        } else {
            List<String> listM125905x0 = AbstractC39414r.m125905x0(query, new char[]{'&'}, 0, 6);
            int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(listM125905x0, 10));
            if (iM73988W < 16) {
                iM73988W = 16;
            }
            linkedHashMap = new LinkedHashMap<>(iM73988W);
            for (String str : listM125905x0) {
                linkedHashMap.put(AbstractC39414r.m125862H0(str, '='), AbstractC39414r.m125858D0('=', str, str));
            }
        }
        return m23136b(appScreen, linkedHashMap);
    }

    /* JADX WARN: Code duplicated, block: B:1045:0x10e0  */
    /* JADX WARN: Code duplicated, block: B:1064:0x1124  */
    /* JADX WARN: Code duplicated, block: B:1260:0x1430  */
    /* JADX WARN: Code duplicated, block: B:1288:0x14ac  */
    /* JADX WARN: Code duplicated, block: B:1400:0x16d5  */
    /* JADX WARN: Code duplicated, block: B:228:0x03da  */
    /* JADX WARN: Code duplicated, block: B:398:0x0702  */
    /* JADX WARN: Code duplicated, block: B:465:0x07f9  */
    /* JADX WARN: Code duplicated, block: B:483:0x0833  */
    /* JADX WARN: Code duplicated, block: B:780:0x0cb3  */
    /* JADX INFO: renamed from: b */
    public final NavigationScreenModel m23136b(AppScreen appScreen, Map<String, String> queryMap) {
        Long lM125933R;
        Integer numM125932Q;
        Integer numM125932Q2;
        Object objM1831b;
        ArrayList arrayList;
        Object objM1831b2;
        Object objM1831b3;
        Integer numM125932Q3;
        Object objM1831b4;
        Integer numM125932Q4;
        Object objM1831b5;
        ProgressionLevel progressionLevel;
        Long lM125933R2;
        Long lM125933R3;
        Boolean boolM125868N0;
        Object objM1831b6;
        Object objM1831b7;
        AbstractC22676k.m65750j(appScreen, "appScreen");
        AbstractC22676k.m65750j(queryMap, "queryMap");
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9279c.f27511w)) {
            String str = queryMap.get("source");
            if (str == null) {
                str = "";
            }
            String str2 = queryMap.get("milestone_type");
            return new AchievementsScreenModel(str, str2 != null ? str2 : "");
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9263a.f27461w)) {
            String str3 = queryMap.get("source");
            return new AccessReconfirmBaselinesScreenModel(str3 != null ? str3 : "", queryMap.get("nextScreen"));
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9324h4.f27650w)) {
            String str4 = queryMap.get("source");
            return new OmronAuthScreenModel(str4 != null ? str4 : "");
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9271b.f27485w)) {
            return new AchievementMilestoneUnlockScreenModel(queryMap.get("achievement_type"));
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9421t5.f27948w)) {
            return new StreakCelebrationScreenModel(queryMap.get("source"), queryMap.get("celebration_type"));
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9441w1.f28009w)) {
            return new DayZeroSplashScreenModel(queryMap.get("source"));
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9454y.f28052w)) {
            String str5 = queryMap.get("activity_id");
            String str6 = str5 == null ? "" : str5;
            String str7 = queryMap.get("start_time");
            String str8 = str7 == null ? "" : str7;
            String str9 = queryMap.get("end_time");
            String str10 = str9 == null ? "" : str9;
            String str11 = queryMap.get("activity_score_type");
            String str12 = str11 == null ? "" : str11;
            String str13 = queryMap.get("internal_name");
            String str14 = str13 == null ? "" : str13;
            String str15 = queryMap.get("flow");
            return new ActivityEditModel(str6, str8, str10, str14, str12, str15 == null ? "" : str15, Boolean.parseBoolean(queryMap.get("is_deletable")));
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9461z.f28074w)) {
            String str16 = queryMap.get("activity_type");
            if (str16 == null) {
                str16 = "";
            }
            String str17 = queryMap.get("start_time");
            if (str17 == null) {
                str17 = "";
            }
            String str18 = queryMap.get("end_time");
            return new AddActivityModel(str17, str18 != null ? str18 : "", str16);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9264a0.f27464w)) {
            String str19 = queryMap.get("source");
            return new AdvancedLabsScreenModel(str19 != null ? str19 : "", (AiAction) null, 2, (DefaultConstructorMarker) null);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9272b0.f27488w)) {
            return new AdvancedLabsActionPlanScreenModel(queryMap.get("test_id"));
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9296e0.f27564w)) {
            String str20 = queryMap.get("test_id");
            return new AdvancedLabsHormonalContextScreenModel(str20 != null ? str20 : "");
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9304f0.f27589w)) {
            String str21 = queryMap.get("test_id");
            String str22 = queryMap.get("source");
            return new AdvancedLabsInsightsScreenModel(str21, str22 == null ? "" : str22, (AiAction) null, 4, (DefaultConstructorMarker) null);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9312g0.f27613w)) {
            String str23 = queryMap.get("insight_id");
            return new AdvancedLabsInsightsDeepDiveScreenModel(str23 != null ? str23 : "", queryMap.get("source"));
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9320h0.f27638w)) {
            String str24 = queryMap.get("source");
            if (str24 == null) {
                str24 = "";
            }
            String str25 = queryMap.get("test_count");
            return new AdvancedLabsJoinScreenModel(str24, str25 != null ? str25 : "", queryMap.get("initially_selected_segment_id"));
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9328i0.f27662w)) {
            String str26 = queryMap.get("source");
            return new AdvancedLabsManagementScreenModel(str26 != null ? str26 : "", queryMap.get("navigation_style"));
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9352l0.f27736w)) {
            String str27 = queryMap.get("source");
            return new AdvancedLabsPrimerScreenModel(str27 != null ? str27 : "");
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9280c0.f27514w)) {
            String str28 = queryMap.get("test_id");
            return new AdvancedLabsEditBiomarkersScreenModel(str28 != null ? str28 : "", Boolean.parseBoolean(queryMap.get("is_ai_confirmation")));
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9288d0.f27539w)) {
            String str29 = queryMap.get("test_id");
            return new AdvancedLabsEditTestDetailsScreenModel(str29 != null ? str29 : "");
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9368n0.f27789w)) {
            return new AdvancedLabsSchedulingFormScreenModel(queryMap.get("episode_id"), queryMap.get("biomarker_test_id"), queryMap.get("test_type"));
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9376o0.f27815w)) {
            String str30 = queryMap.get("step");
            return new AdvancedLabsSchedulingStepScreenModel(str30 != null ? str30 : "", queryMap.get("test_type"));
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9344k0.f27711w)) {
            return AdvancedLabsNativeSchedulingScreenModel.INSTANCE;
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9392q0.f27864w)) {
            String str31 = queryMap.get("biomarker_test_id");
            if (str31 == null) {
                str31 = queryMap.get("test_id");
            }
            return new AdvancedLabsTestResultsScreenModel(str31 != null ? str31 : "");
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9384p0.f27840w)) {
            return AdvancedLabsTestHistoryScreenModel.INSTANCE;
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9400r0.f27884w)) {
            String str32 = queryMap.get(QueryParams.URL);
            if (str32 == null) {
                str32 = "";
            }
            String str33 = queryMap.get("testTokenId");
            return new AdvancedLabsTypeformWebviewScreenModel(str32, str33 != null ? str33 : "", queryMap.get("test_type"));
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9416t0.f27932w)) {
            return AdvancedLabsUploadTestScreenModel.INSTANCE;
        }
        boolean zM65745e = AbstractC22676k.m65745e(appScreen, AppScreen.C9424u0.f27957w);
        C25272z c25272z = C25272z.f99163w;
        if (zM65745e) {
            String str34 = queryMap.get("fingerprint");
            String str35 = str34 == null ? "" : str34;
            String str36 = queryMap.get("source_id");
            String str37 = queryMap.get("source_type");
            String str38 = str37 == null ? "" : str37;
            String str39 = queryMap.get("static_initial_message");
            String str40 = queryMap.get("user_message");
            String str41 = queryMap.get("onboarding_analytic_source");
            String str42 = queryMap.get("education_type");
            C23050a c23050a = this.queryParamDeserializer;
            String str43 = queryMap.get("args");
            if (str43 != null) {
                try {
                    if (str43.length() <= 0) {
                        str43 = null;
                    }
                    if (str43 != null) {
                        AbstractC0757c json = c23050a.getJson();
                        json.getClass();
                        objM1831b7 = json.m1831b(AbstractC38195a.m122336d(new LinkedHashMapSerializer(StringSerializer.INSTANCE, JsonElement.Companion.serializer())), str43);
                    } else {
                        objM1831b7 = null;
                    }
                } catch (Exception e5) {
                    c23050a.getLogger().mo85230v(AbstractC11266d.m30461o("Failed to deserialize query param JSON to ", AbstractC22671h0.m65688a(Map.class).getSimpleName()), e5, new AbstractC30556a.a[0]);
                }
            } else {
                objM1831b7 = null;
            }
            Map map = (Map) objM1831b7;
            return new AiCoachChatScreenModel(str35, str36, str38, str39, str40, str41, str42, (String) null, map == null ? c25272z : map, Boolean.parseBoolean(queryMap.get("should_open_full_size")), (String) null, false, false, false, false, 31872, (DefaultConstructorMarker) null);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9432v0.f27981w)) {
            String str44 = queryMap.get("source_type");
            if (str44 == null) {
                str44 = "";
            }
            String str45 = queryMap.get("source_id");
            String str46 = queryMap.get("activity_type");
            return new AiInsightsScreenModel(str44, str45, str46 == null ? "" : str46);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9440w0.f28006w)) {
            return new AllBiomarkerRecordingsScreenModel(queryMap.get("biomarkerName"));
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9448x0.f28033w)) {
            return new AnnualUpsellSwitchModel((String) null, 1, (DefaultConstructorMarker) null);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9455y0.f28055w)) {
            String str47 = queryMap.get(QueryParams.URL);
            return new AuthenticatedWebViewModel(str47 == null ? "" : str47, (Map) null, (C9598e) null, 6, (DefaultConstructorMarker) null);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9462z0.f28077w)) {
            return new BehaviorDetailsScreenModel(queryMap.get("source"));
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9265a1.f27467w)) {
            String str48 = queryMap.get("detail_id");
            return new BehaviorImpactsScreenModel(str48 == null ? "" : str48, queryMap.get("source"));
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9273b1.f27492w)) {
            String str49 = queryMap.get("biomarkerId");
            return new BiomarkerDetailsScreenModel((str49 == null && (str49 = queryMap.get("biomarker_name")) == null) ? "" : str49, queryMap.get("source"));
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9336j0.f27687w)) {
            String str50 = queryMap.get("consent_action");
            return new MultiConsentScreenModel(str50 == null ? "" : str50, queryMap.get("test_type"));
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9281c1.f27517w)) {
            return new BiomarkerSummaryScreenModel(queryMap.get("status_type"), (AiAction) null, 2, (DefaultConstructorMarker) null);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9289d1.f27542w)) {
            String str51 = queryMap.get("activity_id");
            String str52 = str51 == null ? "" : str51;
            String str53 = queryMap.get("entry_point");
            return new CardioDetailsScreenModel(str52, str53 == null ? "" : str53, (AiAction) null, 4, (DefaultConstructorMarker) null);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9305f1.f27592w)) {
            String str54 = queryMap.get("name");
            return new ChallengesScreenModel(str54 == null ? "" : str54);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9297e1.f27567w)) {
            return new ChallengeLandingScreenModel(queryMap.get("source"));
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9313g1.f27616w)) {
            String str55 = queryMap.get("path");
            return new CheckoutScreenModel(str55 == null ? "" : str55, queryMap, queryMap.get("payment_method_id"), Boolean.valueOf(Boolean.parseBoolean(queryMap.get("skip_confirmation"))), queryMap.get("category"));
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9337j1.f27690w)) {
            String str56 = queryMap.get("appointmentType");
            if (str56 == null || AbstractC39414r.m125890i0(str56)) {
                str56 = null;
            }
            String str57 = queryMap.get("appointmentId");
            if (str57 == null || AbstractC39414r.m125890i0(str57)) {
                str57 = null;
            }
            String str58 = queryMap.get("intakeType");
            return new ClinicianVideoSchedulingIntakeScreenModel(str56, str57, (str58 == null || AbstractC39414r.m125890i0(str58)) ? null : str58);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9329i1.f27665w)) {
            String str59 = queryMap.get("appointmentId");
            return new ClinicianSchedulingConfirmationScreenModel(str59 == null ? "" : str59);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9345k1.f27714w)) {
            String str60 = queryMap.get("source_type");
            String str61 = str60 == null ? "" : str60;
            String str62 = queryMap.get("entry_text");
            String str63 = str62 == null ? "" : str62;
            String str64 = queryMap.get("conversation_seed_id");
            String str65 = str64 == null ? "" : str64;
            String str66 = queryMap.get("card_variant");
            Integer numM125932Q5 = str66 != null ? AbstractC39421y.m125932Q(str66) : null;
            String str67 = queryMap.get("preset_question");
            String str68 = queryMap.get("include_initial_message");
            boolean z4 = str68 != null ? Boolean.parseBoolean(str68) : true;
            String str69 = queryMap.get("source_id");
            String str70 = queryMap.get("source");
            String str71 = str70 == null ? "" : str70;
            String str72 = queryMap.get("education_type");
            String str73 = queryMap.get("id");
            String str74 = queryMap.get("source_id");
            String str75 = queryMap.get("should_open_full_size");
            boolean z13 = str75 != null ? Boolean.parseBoolean(str75) : false;
            C23050a c23050a2 = this.queryParamDeserializer;
            String str76 = queryMap.get("args");
            if (str76 != null) {
                try {
                    if (str76.length() <= 0) {
                        str76 = null;
                    }
                    if (str76 != null) {
                        AbstractC0757c json2 = c23050a2.getJson();
                        json2.getClass();
                        objM1831b6 = json2.m1831b(AbstractC38195a.m122336d(new LinkedHashMapSerializer(StringSerializer.INSTANCE, JsonElement.Companion.serializer())), str76);
                    } else {
                        objM1831b6 = null;
                    }
                } catch (Exception e13) {
                    c23050a2.getLogger().mo85230v(AbstractC11266d.m30461o("Failed to deserialize query param JSON to ", AbstractC22671h0.m65688a(Map.class).getSimpleName()), e13, new AbstractC30556a.a[0]);
                }
            } else {
                objM1831b6 = null;
            }
            Map map2 = (Map) objM1831b6;
            return new CoachScreenModel(str61, str63, str65, numM125932Q5, (String) null, str67, z4, str69, map2 == null ? c25272z : map2, str71, str72, str73, str74, z13, 16, (DefaultConstructorMarker) null);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9353l1.f27740w)) {
            return CoachSettingsScreenModel.INSTANCE;
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9361m1.f27766w)) {
            return new CommunityScreenModel((AiAction) null, queryMap.get("share_code"), 1, (DefaultConstructorMarker) null);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9456y1.f28058w)) {
            return ConnectivityNavigationScreenModel.INSTANCE;
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9463z1.f28080w)) {
            String str77 = queryMap.get("path");
            return new DownloadedFileExportScreenModel(str77 == null ? "" : str77);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9409s1.f27911w)) {
            return CustomizeJournalScreenModel.INSTANCE;
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9417t1.f27936w)) {
            return CustomizeOverviewModel.INSTANCE;
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9425u1.f27960w)) {
            return CyclePatternHistoryScreenModel.INSTANCE;
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9449x1.f28036w)) {
            String str78 = queryMap.get("pillar");
            String str79 = str78 == null ? "" : str78;
            String str80 = queryMap.get(HttpHeaders.DATE);
            String str81 = str80 == null ? "" : str80;
            String str82 = queryMap.get("source");
            return new DeepDiveScreenModel(str79, str81, str82 == null ? "" : str82, (AiAction) null, 8, (DefaultConstructorMarker) null);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9266a2.f27470w)) {
            return new EditActivitiesDrawerScreenModel(queryMap.get(HttpHeaders.DATE), (String) null, 2, (DefaultConstructorMarker) null);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9274b2.f27496w)) {
            String str83 = queryMap.get("exercise_id");
            if (str83 == null) {
                str83 = queryMap.get("exerciseId");
            } else {
                if (AbstractC39414r.m125890i0(str83)) {
                    str83 = null;
                }
                if (str83 == null) {
                    str83 = queryMap.get("exerciseId");
                }
            }
            String str84 = str83 == null ? "" : str83;
            String str85 = queryMap.get("entry_point");
            if (str85 == null) {
                str85 = queryMap.get("entryPoint");
            }
            return new EditCustomExerciseModel(str84, str85);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9290d2.f27545w)) {
            String str86 = queryMap.get("exercise_id");
            if (str86 == null) {
                str86 = queryMap.get("exerciseId");
            } else {
                if (AbstractC39414r.m125890i0(str86)) {
                    str86 = null;
                }
                if (str86 == null) {
                    str86 = queryMap.get("exerciseId");
                }
            }
            String str87 = str86 == null ? "" : str86;
            String str88 = queryMap.get("show_cta");
            if (str88 == null) {
                str88 = queryMap.get("showCTA");
            }
            boolean zBooleanValue = (str88 == null || (boolM125868N0 = AbstractC39414r.m125868N0(str88)) == null) ? false : boolM125868N0.booleanValue();
            String str89 = queryMap.get("entry_point");
            if (str89 == null && (str89 = queryMap.get("entryPoint")) == null) {
                str89 = queryMap.get("source");
            }
            String str90 = queryMap.get("entry_point_type");
            if (str90 == null && (str90 = queryMap.get("entryPointType")) == null) {
                str90 = "EXTERNAL";
            }
            return new ExerciseDetailsScreenModel(str87, zBooleanValue, str89, str90);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9298e2.f27571w)) {
            String str91 = queryMap.get("pc");
            return new ExtensionsScreenModel(str91 == null ? "" : str91, false, 2, (DefaultConstructorMarker) null);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9340j4.f27699w)) {
            String str92 = queryMap.get("source");
            return new OrderConfirmationScreenModel(str92 == null ? "" : str92);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9348k4.f27724w)) {
            return new PairDeviceScreenModel((C9598e) null, 1, (DefaultConstructorMarker) null);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9356l4.f27750w)) {
            return new PasswordResetScreenModel(queryMap.get("token"), queryMap.get("expires"), queryMap.get(NotificationCompat.CATEGORY_EMAIL));
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9306f2.f27595w)) {
            return FamilyPlanScreenModel.INSTANCE;
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9314g2.f27619w)) {
            String str93 = queryMap.get("source");
            return new FamilyPlanHubScreenModel(str93 == null ? "" : str93);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9322h2.f27644w)) {
            boolean z14 = Boolean.parseBoolean(queryMap.get("is_new_member"));
            String str94 = queryMap.get("source");
            return new FamilyPlanInviteScreenModel(z14, str94 == null ? "" : str94);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9338j2.f27693w)) {
            String str95 = queryMap.get("source");
            return new FeedbackSurveyScreenModel(str95 == null ? "" : str95);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9354l2.f27743w)) {
            return new GiftHubScreenModel(queryMap.get("source"));
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9362m2.f27769w)) {
            String str96 = queryMap.get("source");
            if (str96 == null) {
                str96 = "";
            }
            String str97 = queryMap.get("giftCode");
            return new GiftedScreenModel(str96, str97 == null ? "" : str97);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9370n2.f27796w)) {
            String str98 = queryMap.get("source");
            if (str98 == null) {
                str98 = "";
            }
            String str99 = queryMap.get("giftType");
            if (str99 == null) {
                str99 = queryMap.get("gift_type");
            }
            if (str99 == null) {
                str99 = "";
            }
            String str100 = queryMap.get("test_count");
            if (str100 == null) {
                str100 = "";
            }
            String str101 = queryMap.get("selected_tier");
            return new GiftingScreenModel(str98, str100, str99, str101 == null ? "" : str101);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9378o2.f27821w)) {
            String str102 = queryMap.get("source");
            return new HealthMonitorScreenModel((Integer) null, (String) null, str102 == null ? "" : str102, (AiAction) null, 11, (DefaultConstructorMarker) null);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9386p2.f27846w)) {
            return HealthReportScreenModel.INSTANCE;
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9402r2.f27890w)) {
            String str103 = queryMap.get(HttpHeaders.DATE);
            return new HealthspanScreenModel(str103 == null ? "" : str103, (String) null, (AiAction) null, 6, (DefaultConstructorMarker) null);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9394q2.f27867w)) {
            String str104 = queryMap.get("source");
            return new HealthTabScreenModel(str104 == null ? "" : str104, (AiAction) null, 2, (DefaultConstructorMarker) null);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9410s2.f27914w)) {
            return new HeartScreenerModel((String) null, 1, (DefaultConstructorMarker) null);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9418t2.f27939w)) {
            return HiddenMetricsModel.INSTANCE;
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9426u2.f27963w)) {
            return new HomeScreenModel(queryMap.get("home_pillar"), AiAction.INSTANCE.m23024a(queryMap));
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9434v2.f27987w)) {
            String str105 = queryMap.get("feature");
            return new HormonalInsightsOnboardingModel(str105 == null ? "" : str105);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9442w2.f28012w)) {
            return HormonalInsightsSettingsScreenModel.INSTANCE;
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9450x2.f28039w)) {
            return HrSettingsScreenModel.INSTANCE;
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9457y2.f28061w)) {
            String str106 = queryMap.get(QueryParams.URL);
            return new InAppBrowserScreenModel(str106 == null ? "" : str106);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9464z2.f28083w)) {
            String str107 = queryMap.get("integrationId");
            return new IntegrationsScreenModel(str107 == null ? "" : str107, (String) null, AiAction.INSTANCE.m23024a(queryMap), 2, (DefaultConstructorMarker) null);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9267a3.f27473w)) {
            return IntegrationsDisclaimerScreenModel.INSTANCE;
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9401r1.f27887w)) {
            String str108 = queryMap.get("type");
            return new CustomizeBottomSheetScreenModel(str108 == null ? "" : str108);
        }
        long jLongValue = 0;
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9275b3.f27499w)) {
            String str109 = queryMap.get("cycle_id");
            if (str109 != null && (lM125933R3 = AbstractC39421y.m125933R(str109)) != null) {
                jLongValue = lM125933R3.longValue();
            }
            String str110 = queryMap.get("source");
            return new JournalScreenModel(jLongValue, str110 == null ? "" : str110, Boolean.parseBoolean(queryMap.get("should_show_onboarding")));
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9291d3.f27548w)) {
            String str111 = queryMap.get(HttpHeaders.DATE);
            if (str111 == null) {
                str111 = "";
            }
            String str112 = queryMap.get("cycle_id");
            long jLongValue2 = (str112 == null || (lM125933R2 = AbstractC39421y.m125933R(str112)) == null) ? -1L : lM125933R2.longValue();
            String str113 = queryMap.get("source");
            if (str113 == null) {
                str113 = "";
            }
            return new InterdayJournalScreenModel(str111, jLongValue2, str113);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9299e3.f27574w)) {
            return LabradorAboutScreenModel.INSTANCE;
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9307f3.f27598w)) {
            String str114 = queryMap.get("ecg_reading_id");
            return new LabradorDetailsScreenModel(str114 == null ? "" : str114);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9315g3.f27622w)) {
            return LabradorDeviceLocationModel.INSTANCE;
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9323h3.f27647w)) {
            return LabradorOnboardingModel.INSTANCE;
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9331i3.f27672w)) {
            String str115 = queryMap.get("selectedWrist");
            return new LabradorReadingModel(str115 == null ? "" : str115);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9339j3.f27696w)) {
            return LabradorRegistrationModel.INSTANCE;
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9347k3.f27721w)) {
            return LabradorResultsModel.INSTANCE;
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9355l3.f27747w)) {
            return LanguageSettingsScreenModel.INSTANCE;
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9363m3.f27772w)) {
            return LegacyProCheckoutScreenModel.INSTANCE;
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9371n3.f27799w)) {
            String str116 = queryMap.get("id");
            long j7 = str116 != null ? Long.parseLong(str116) : 0L;
            String str117 = queryMap.get("level");
            int i13 = str117 != null ? Integer.parseInt(str117) : 0;
            String str118 = queryMap.get("experience");
            int i14 = str118 != null ? Integer.parseInt(str118) : 0;
            String str119 = queryMap.get("user_id");
            long j13 = str119 != null ? Long.parseLong(str119) : 0L;
            C23050a c23050a3 = this.queryParamDeserializer;
            String str120 = queryMap.get("progression_level");
            if (str120 != null) {
                try {
                    if (str120.length() <= 0) {
                        str120 = null;
                    }
                    if (str120 != null) {
                        AbstractC0757c json3 = c23050a3.getJson();
                        json3.getClass();
                        objM1831b5 = json3.m1831b(ProgressionLevel.INSTANCE.serializer(), str120);
                    } else {
                        objM1831b5 = null;
                    }
                } catch (Exception e14) {
                    c23050a3.getLogger().mo85230v(AbstractC11266d.m30461o("Failed to deserialize query param JSON to ", AbstractC22671h0.m65688a(ProgressionLevel.class).getSimpleName()), e14, new AbstractC30556a.a[0]);
                }
            } else {
                objM1831b5 = null;
            }
            ProgressionLevel progressionLevel2 = (ProgressionLevel) objM1831b5;
            if (progressionLevel2 == null) {
                String str121 = queryMap.get("tier");
                if (str121 == null) {
                    str121 = "";
                }
                String str122 = queryMap.get("level");
                int i15 = str122 != null ? Integer.parseInt(str122) : 0;
                String str123 = queryMap.get("badge");
                String str124 = str123 == null ? "" : str123;
                String str125 = queryMap.get("mini_badge");
                String str126 = str125 == null ? "" : str125;
                String str127 = queryMap.get("minimum_experience");
                int i16 = str127 != null ? Integer.parseInt(str127) : 0;
                String str128 = queryMap.get("maximum_experience");
                progressionLevel = new ProgressionLevel(str121, i15, str124, str126, i16, str128 != null ? AbstractC39421y.m125932Q(str128) : null);
            } else {
                progressionLevel = progressionLevel2;
            }
            return new LevelsScreenModel(new MemberLevelInfo(j7, i13, i14, j13, progressionLevel));
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9379o3.f27824w)) {
            String str129 = queryMap.get("source");
            if (str129 == null) {
                str129 = "";
            }
            String str130 = queryMap.get("offer_id");
            return new LimitedTimeOfferScreenModel(str129, str130 == null ? "" : str130);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9387p3.f27849w)) {
            String str131 = queryMap.get("activity_id");
            if (str131 != null) {
                String str132 = !AbstractC39414r.m125890i0(str131) ? str131 : null;
                if (str132 != null) {
                    return new LinkWorkoutScreenModel(str132, queryMap.get("entry_point"), queryMap.get("activity_name"));
                }
            }
            throw new IllegalArgumentException("activity_id is required for LINK_WORKOUT deep link");
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9395q3.f27870w)) {
            String str133 = queryMap.get("source");
            return new LogSymptomsScreenModel(str133 == null ? "" : str133, queryMap.get("requestDate"));
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9403r3.f27893w)) {
            return new LoginScreenModel(Boolean.parseBoolean(queryMap.get("show_create_account")));
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9411s3.f27917w)) {
            String str134 = queryMap.get("source");
            return new MarketingConsentScreenModel(str134 == null ? "" : str134, null);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9419t3.f27942w)) {
            return new MciLogCalendarScreenModel(queryMap.get(HttpHeaders.DATE), queryMap.get("source"));
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9427u3.f27966w)) {
            String str135 = queryMap.get(HttpHeaders.DATE);
            String str136 = str135 == null ? "" : str135;
            String str137 = queryMap.get("preSelectedLogValue");
            return new MciOverviewScreenModel(str136, str137 == null ? "" : str137, queryMap.get("analyticsSource"), (AiAction) null, 8, (DefaultConstructorMarker) null);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9435v3.f27990w)) {
            String str138 = queryMap.get("phase");
            return new MciPhaseCoachingScreenModel(str138 == null ? "" : str138, AiAction.INSTANCE.m23024a(queryMap));
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9443w3.f28015w)) {
            String str139 = queryMap.get("video_url");
            return new MediaFocusModel(str139 == null ? "" : str139);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9458y3.f28064w)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, String> entry : queryMap.entrySet()) {
                if (!AbstractC37056f.m118959K("tracking_tier", "tracking_source").contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            String str140 = queryMap.get("tracking_tier");
            String str141 = queryMap.get("tracking_source");
            return new MembershipAdjustmentCheckoutScreenModel(linkedHashMap, str140, str141 == null ? "" : str141);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9465z3.f28087w)) {
            return MembershipAndBillingScreenModel.INSTANCE;
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9268a4.f27476w)) {
            return MembershipManagementScreenModel.INSTANCE;
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9276b4.f27502w)) {
            return MenuScreenModel.INSTANCE;
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9292d4.f27551w)) {
            return MyAccountScreenModel.INSTANCE;
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9300e4.f27577w)) {
            String str142 = queryMap.get("subscription_type");
            return new NativePlanSwitchModel(str142 == null ? "" : str142);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9316g4.f27625w)) {
            String str143 = queryMap.get("source");
            if (str143 == null) {
                str143 = "deeplink";
            }
            return new NativeStoreScreenModel(str143);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9308f4.f27601w)) {
            String str144 = queryMap.get("slug");
            return new ProductDescriptionPageScreenModel(str144 == null ? "" : str144, queryMap.get("sku"), queryMap.get("source"));
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9404r4.f27896w)) {
            String str145 = queryMap.get("key");
            return new ProductSizeGuideScreenModel(str145 == null ? "" : str145);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9364m4.f27775w)) {
            String str146 = queryMap.get("source");
            return new PaymentMethodManagementScreenModel(str146 == null ? "" : str146);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9372n4.f27802w)) {
            String str147 = queryMap.get(HttpHeaders.DATE);
            if (str147 == null) {
                str147 = "";
            }
            String str148 = queryMap.get("source");
            return new PregnancyInsightsScreenModel(str147, str148 == null ? "" : str148, AiAction.INSTANCE.m23024a(queryMap));
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9380o4.f27828w)) {
            String str149 = queryMap.get("pregnancyScreen");
            if (str149 == null) {
                str149 = "";
            }
            String str150 = queryMap.get("source");
            return new PregnancySettingsScreenModel(str149, str150 == null ? "" : str150);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9388p4.f27852w)) {
            String str151 = queryMap.get("id");
            return new PreviousPregnancyScreenModel(str151 == null ? "" : str151);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9377o1.f27818w)) {
            String str152 = queryMap.get("id");
            return new CommunityTeamScreenModel((str152 == null || (numM125932Q4 = AbstractC39421y.m125932Q(str152)) == null) ? 0 : numM125932Q4.intValue());
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9385p1.f27843w)) {
            return CommunityTeamsHubScreenModel.INSTANCE;
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9396q4.f27873w)) {
            return PrivacyScreenModel.INSTANCE;
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9282c2.f27521w)) {
            return EnterpriseProgramSettingsScreenModel.INSTANCE;
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9428u4.f27969w)) {
            String str153 = queryMap.get("activity_id");
            String str154 = str153 == null ? "" : str153;
            String str155 = queryMap.get("entry_point");
            return new RecoveryDetailsScreenModel(str154, str155 == null ? "" : str155, (AiAction) null, 4, (DefaultConstructorMarker) null);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9436v4.f27993w)) {
            String str156 = queryMap.get("share_message");
            String str157 = str156 == null ? "" : str156;
            String str158 = queryMap.get("source");
            String str159 = str158 == null ? "" : str158;
            String str160 = queryMap.get("checkout_origin");
            String str161 = str160 == null ? "" : str160;
            C23050a c23050a4 = this.queryParamDeserializer;
            String str162 = queryMap.get("analytics_properties");
            if (str162 != null) {
                try {
                    if (str162.length() <= 0) {
                        str162 = null;
                    }
                    if (str162 != null) {
                        AbstractC0757c json4 = c23050a4.getJson();
                        json4.getClass();
                        StringSerializer stringSerializer = StringSerializer.INSTANCE;
                        objM1831b4 = json4.m1831b(new LinkedHashMapSerializer(stringSerializer, stringSerializer), str162);
                    } else {
                        objM1831b4 = null;
                    }
                } catch (Exception e15) {
                    c23050a4.getLogger().mo85230v(AbstractC11266d.m30461o("Failed to deserialize query param JSON to ", AbstractC22671h0.m65688a(Map.class).getSimpleName()), e15, new AbstractC30556a.a[0]);
                }
            } else {
                objM1831b4 = null;
            }
            Map map3 = (Map) objM1831b4;
            String str163 = queryMap.get("disable_default_open_sheet_analytic");
            return new ReferAFriendScreenModel(str157, str159, str161, map3, str163 != null ? AbstractC39414r.m125868N0(str163) : null);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9444w4.f28018w)) {
            String str164 = queryMap.get("share_message");
            String str165 = str164 == null ? "" : str164;
            String str166 = queryMap.get("source");
            if (str166 == null) {
                str166 = "Deeplink";
            } else {
                if (AbstractC39414r.m125890i0(str166)) {
                    str166 = null;
                }
                if (str166 == null) {
                    str166 = "Deeplink";
                }
            }
            String str167 = queryMap.get("graph_id");
            return new ReferAFriendHubScreenModel(str165, str166, str167 != null ? AbstractC39421y.m125932Q(str167) : null, true);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9452x4.f28045w)) {
            String str168 = queryMap.get("code");
            return new ReferAFriendReceiverScreenModel(str168 == null ? "" : str168);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9466z4.f28090w)) {
            return ReturnsScreenModel.INSTANCE;
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9459y4.f28067w)) {
            return new CheckoutScreenModel("/growth-content-service/v1/reactivations/one-click-resume", AbstractC25247g0.m73989X(AbstractC37056f.m118979e0("source", "resume_link")), null, Boolean.TRUE, null);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9269a5.f27479w)) {
            String str169 = queryMap.get(HttpHeaders.DATE);
            if (str169 == null) {
                str169 = "";
            }
            String str170 = queryMap.get("source");
            return new SageScreenModel(str169, str170 == null ? "" : str170);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9277b5.f27505w)) {
            return new SageManualEntryScreenModel(queryMap.get("source"));
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9285c5.f27530w)) {
            return SageOnboardingScreenModel.INSTANCE;
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9293d5.f27554w)) {
            String str171 = queryMap.get("source");
            String str172 = queryMap.get("sign_up_on_entry");
            return new SanguineWaitlistScreenModel(str171, str172 != null ? AbstractC39414r.m125868N0(str172) : null);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9301e5.f27580w)) {
            return SanguineWaitlistBiomarkersScreenModel.INSTANCE;
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9309f5.f27604w)) {
            String str173 = queryMap.get("measurement_id");
            return new SeeAllRecordingsScreenModel(str173 == null ? "" : str173);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9317g5.f27629w)) {
            return ShepherdAboutModel.INSTANCE;
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9325h5.f27653w)) {
            String str174 = queryMap.get(HttpHeaders.DATE);
            if (str174 == null) {
                str174 = "";
            }
            String str175 = queryMap.get("education_name");
            return new ShepherdDetailsModel(str174, str175 == null ? "" : str175);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9333i5.f27678w)) {
            return ShepherdHistoryModel.INSTANCE;
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9341j5.f27702w)) {
            return ShepherdOnboardingModel.INSTANCE;
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9349k5.f27727w)) {
            return ShepherdRegistrationModel.INSTANCE;
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9357l5.f27754w)) {
            return ShepherdSettingsModel.INSTANCE;
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9365m5.f27779w)) {
            String str176 = queryMap.get("activity_id");
            return new SleepDetailsScreenModel(str176 == null ? "" : str176, (String) null, (AiAction) null, 6, (DefaultConstructorMarker) null);
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9373n5.f27805w)) {
            return SleepPlannerScreenModel.INSTANCE;
        }
        if (!AbstractC22676k.m65745e(appScreen, AppScreen.C9389p5.f27855w) && !AbstractC22676k.m65745e(appScreen, AppScreen.C9397q5.f27876w) && !AbstractC22676k.m65745e(appScreen, AppScreen.C9405r5.f27899w)) {
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9413s5.f27923w)) {
                String str177 = queryMap.get("sport_id");
                Integer numM125932Q6 = str177 != null ? AbstractC39421y.m125932Q(str177) : null;
                String str178 = queryMap.get("auto_start_activity");
                return new StartActivitySportModel(numM125932Q6, str178 != null ? Boolean.valueOf(Boolean.parseBoolean(str178)) : null);
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9429u5.f27972w)) {
                return StreaksExplainerModel.INSTANCE;
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9437v5.f27996w)) {
                String str179 = queryMap.get("open_tab");
                String str180 = (str179 == null || AbstractC39414r.m125890i0(str179)) ? null : str179;
                String str181 = queryMap.get("entry_point");
                return new StrengthTrainerScreenModel((Long) null, (String) null, (str181 == null || AbstractC39414r.m125890i0(str181)) ? null : str181, str180, false, AiAction.INSTANCE.m23024a(queryMap), 19, (DefaultConstructorMarker) null);
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9445w5.f28022w)) {
                String str182 = queryMap.get("intervention_type");
                return new StressInterventionModel(str182 == null ? "" : str182);
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9453x5.f28049w)) {
                return new StressMonitorScreenModel(queryMap.get(HttpHeaders.DATE), (AiAction) null, 2, (DefaultConstructorMarker) null);
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9460y5.f28071w)) {
                return new SymptomPatternsScreenModel(queryMap.get("featureType"));
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9467z5.f28093w)) {
                return new TiltModeScreenModel(queryMap.get(HttpHeaders.DATE), queryMap.get("source"));
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9270a6.f27482w)) {
                String str183 = queryMap.get("trend_key");
                String str184 = str183 == null ? "" : str183;
                String str185 = queryMap.get(AttachmentExtensionsKt.EXTRA_DURATION);
                return new TrendsScreenModel(str184, (str185 == null || (numM125932Q3 = AbstractC39421y.m125932Q(str185)) == null) ? 1 : numM125932Q3.intValue(), queryMap.get(HttpHeaders.DATE), (String) null, (String) null, (AiAction) null, 56, (DefaultConstructorMarker) null);
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9294d6.f27557w)) {
                C23050a c23050a5 = this.queryParamDeserializer;
                String str186 = queryMap.get("payload");
                if (str186 != null) {
                    try {
                        if (str186.length() <= 0) {
                            str186 = null;
                        }
                        if (str186 != null) {
                            AbstractC0757c json5 = c23050a5.getJson();
                            json5.getClass();
                            objM1831b3 = json5.m1831b(UniversalCheckoutPayload.INSTANCE.serializer(), str186);
                        } else {
                            objM1831b3 = null;
                        }
                    } catch (Exception e16) {
                        c23050a5.getLogger().mo85230v(AbstractC11266d.m30461o("Failed to deserialize query param JSON to ", AbstractC22671h0.m65688a(UniversalCheckoutPayload.class).getSimpleName()), e16, new AbstractC30556a.a[0]);
                    }
                } else {
                    objM1831b3 = null;
                }
                UniversalCheckoutPayload universalCheckoutPayload = (UniversalCheckoutPayload) objM1831b3;
                String str187 = queryMap.get("path");
                if (str187 == null) {
                    str187 = "";
                }
                String str188 = queryMap.get("source");
                String str189 = str188 == null ? "" : str188;
                String str190 = queryMap.get("method");
                return new UniversalCheckoutScreenModel(str187, universalCheckoutPayload, str189, (str190 == null || AbstractC39414r.m125890i0(str190)) ? null : str190);
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9321h1.f27641w)) {
                C23050a c23050a6 = this.queryParamDeserializer;
                String str191 = queryMap.get("payload");
                if (str191 != null) {
                    try {
                        if (str191.length() <= 0) {
                            str191 = null;
                        }
                        if (str191 != null) {
                            AbstractC0757c json6 = c23050a6.getJson();
                            json6.getClass();
                            objM1831b2 = json6.m1831b(CheckoutWithCartPayload.INSTANCE.serializer(), str191);
                        } else {
                            objM1831b2 = null;
                        }
                    } catch (Exception e17) {
                        c23050a6.getLogger().mo85230v(AbstractC11266d.m30461o("Failed to deserialize query param JSON to ", AbstractC22671h0.m65688a(CheckoutWithCartPayload.class).getSimpleName()), e17, new AbstractC30556a.a[0]);
                    }
                } else {
                    objM1831b2 = null;
                }
                CheckoutWithCartPayload checkoutWithCartPayload = (CheckoutWithCartPayload) objM1831b2;
                String str192 = queryMap.get("path");
                if (str192 == null) {
                    str192 = "";
                }
                String str193 = queryMap.get("source");
                if (str193 == null) {
                    str193 = "";
                }
                String str194 = queryMap.get("method");
                return new CheckoutWithCartScreenModel(str192, checkoutWithCartPayload, str193, str194 == null ? "" : str194);
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9302e6.f27583w)) {
                String str195 = queryMap.get("cart_id");
                if (str195 == null) {
                    str195 = "";
                }
                String str196 = queryMap.get("source");
                return new UniversalCheckoutShippingAddressScreenModel(str195, str196 == null ? "" : str196);
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9310f6.f27607w)) {
                String str197 = queryMap.get("cart_id");
                if (str197 == null) {
                    str197 = "";
                }
                String str198 = queryMap.get("source");
                return new UniversalCheckoutShippingMethodScreenModel(str197, str198 == null ? "" : str198);
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9286c6.f27533w)) {
                return new UniversalCartScreenModel(queryMap.get("cart_id"), queryMap.get("sku"), queryMap.get("source"));
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9278b6.f27508w)) {
                String str199 = queryMap.get("sku");
                String str200 = queryMap.get("pack_sku");
                String str201 = queryMap.get("child_item_skus");
                if (str201 != null) {
                    List listM125905x0 = AbstractC39414r.m125905x0(str201, new char[]{DateTimeRange.lowerUpperDelimiter}, 0, 6);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : listM125905x0) {
                        if (!AbstractC39414r.m125890i0((String) obj)) {
                            arrayList2.add(obj);
                        }
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = null;
                }
                return new UniversalBuyNowScreenModel(str199, str200, arrayList, queryMap.get("wyw_sku"), queryMap.get("band_sku"), queryMap.get("clasp_sku"), queryMap.get("hook_sku"), queryMap.get("fast_link_sku"), queryMap.get("store_domain"));
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9408s0.f27908w)) {
                String str202 = queryMap.get("source");
                if (str202 == null) {
                    str202 = "";
                }
                String str203 = queryMap.get("test_count");
                return new AdvancedLabsUpdateTestsScreenModel(str202, str203 == null ? "" : str203);
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9342j6.f27705w)) {
                return WeekInReviewScreenModel.INSTANCE;
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9350k6.f27730w)) {
                String str204 = queryMap.get("plan_edit_screens");
                List listM125905x1 = str204 != null ? AbstractC39414r.m125905x0(AbstractC39414r.m125901t0(str204, "[", "]"), new char[]{DateTimeRange.lowerUpperDelimiter}, 0, 6) : C25271y.f99162w;
                String str205 = queryMap.get("analytics_source");
                return new WeeklyPlanEditScreenModel(listM125905x1, str205 == null ? "" : str205);
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9366m6.f27782w)) {
                String str206 = queryMap.get("plan_id");
                return new WeeklyPlanPresetLandingScreenModel(str206 == null ? "" : str206);
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9382o6.f27834w)) {
                String str207 = queryMap.get("plan_id");
                return new WeeklyPlanSummaryScreenModel(str207 == null ? "" : str207, (AiAction) null, 2, (DefaultConstructorMarker) null);
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9374n6.f27808w)) {
                String str208 = queryMap.get("initialSelection");
                if (str208 == null) {
                    str208 = queryMap.get("initial_selection");
                }
                String str209 = str208;
                C23050a c23050a7 = this.queryParamDeserializer;
                if (str209 != null) {
                    try {
                        if (str209.length() <= 0) {
                            str209 = null;
                        }
                        if (str209 != null) {
                            AbstractC0757c json7 = c23050a7.getJson();
                            json7.getClass();
                            objM1831b = json7.m1831b(InitialSelectionModel.INSTANCE.serializer(), str209);
                        } else {
                            objM1831b = null;
                        }
                    } catch (Exception e18) {
                        c23050a7.getLogger().mo85230v(AbstractC11266d.m30461o("Failed to deserialize query param JSON to ", AbstractC22671h0.m65688a(InitialSelectionModel.class).getSimpleName()), e18, new AbstractC30556a.a[0]);
                    }
                } else {
                    objM1831b = null;
                }
                InitialSelectionModel initialSelectionModel = (InitialSelectionModel) objM1831b;
                String str210 = queryMap.get("plan_name");
                String str211 = str210 == null ? "" : str210;
                boolean z15 = Boolean.parseBoolean(queryMap.get("locked"));
                boolean z16 = Boolean.parseBoolean(queryMap.get("no_plan_show_metric_selection"));
                String str212 = queryMap.get("analytics_source");
                String str213 = str212 == null ? "" : str212;
                String str214 = queryMap.get(HttpHeaders.DATE);
                String str215 = queryMap.get("source");
                String str216 = queryMap.get("presetPlanCategory");
                String str217 = queryMap.get("planTitle");
                String str218 = queryMap.get("description");
                String str219 = queryMap.get("explanationTitle");
                if (str219 == null) {
                    str219 = queryMap.get("explanation_title");
                }
                String str220 = str219;
                String str221 = queryMap.get("explanation");
                String str222 = queryMap.get("templateId");
                if (str222 == null) {
                    str222 = queryMap.get("template_id");
                }
                return new WeeklyPlanSetupScreenModel(str211, z15, z16, str213, initialSelectionModel, str214, str215, str216, str217, str218, str220, str221, str222, (String) null, (String) null, (String) null, 57344, (DefaultConstructorMarker) null);
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9358l6.f27757w)) {
                String str223 = queryMap.get("scroll_id");
                return new WeeklyPlanOverviewScreenModel((Boolean) null, str223 == null ? "" : str223, (String) null, (AiAction) null, 13, (DefaultConstructorMarker) null);
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9390p6.f27858w)) {
                String str224 = queryMap.get("activity_id");
                return new WeightliftingDetailsScreenModel(str224 == null ? "" : str224, (String) null, 2, (DefaultConstructorMarker) null);
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9406r6.f27902w)) {
                String str225 = queryMap.get("campaignId");
                Integer numM125932Q7 = str225 != null ? AbstractC39421y.m125932Q(str225) : null;
                String str226 = queryMap.get("sessionId");
                return new WhoopLabsHomeScreenModel(numM125932Q7, str226 != null ? AbstractC39421y.m125932Q(str226) : null, (String) null, 4, (DefaultConstructorMarker) null);
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9414s6.f27926w)) {
                String str227 = queryMap.get("campaignId");
                Integer numValueOf = Integer.valueOf((str227 == null || (numM125932Q2 = AbstractC39421y.m125932Q(str227)) == null) ? 0 : numM125932Q2.intValue());
                String str228 = queryMap.get("sessionId");
                return new WhoopLabsScreenModel(numValueOf, str228 != null ? AbstractC39421y.m125932Q(str228) : null, (String) null, 4, (DefaultConstructorMarker) null);
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9422t6.f27951w)) {
                String str229 = queryMap.get("campaign_filter");
                return new WhoopLabsScreenModel((Integer) null, (Integer) null, str229 == null ? "" : str229, 3, (DefaultConstructorMarker) null);
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9438v6.f28000w)) {
                return new WhoopShareScreenModel(queryMap.get("path"), queryMap.get("source"));
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9430u6.f27975w)) {
                String str230 = queryMap.get("cycle_id");
                Long lM125933R4 = str230 != null ? AbstractC39421y.m125933R(str230) : null;
                String str231 = queryMap.get("lower_bound");
                String str232 = queryMap.get("upper_bound");
                String str233 = queryMap.get("day_strain");
                Double dM125914x = str233 != null ? AbstractC39420x.m125914x(str233) : null;
                String str234 = queryMap.get("recovery_score");
                Integer numM125932Q8 = str234 != null ? AbstractC39421y.m125932Q(str234) : null;
                String str235 = queryMap.get("sleep_milliseconds");
                Long lM125933R5 = str235 != null ? AbstractC39421y.m125933R(str235) : null;
                String str236 = queryMap.get("calories");
                Integer numM125932Q9 = str236 != null ? AbstractC39421y.m125932Q(str236) : null;
                String str237 = queryMap.get("is_complete");
                return new WhoopLiveScreenModel(lM125933R4, str231, str232, dM125914x, numM125932Q8, lM125933R5, numM125932Q9, str237 != null ? AbstractC39414r.m125868N0(str237) : null);
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9398q6.f27879w)) {
                return WhatToExpectScreenModel.INSTANCE;
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9446w6.f28025w)) {
                String str238 = queryMap.get("year");
                return new YearInReviewScreenModel((str238 == null || (numM125932Q = AbstractC39421y.m125932Q(str238)) == null) ? 2025 : numM125932Q.intValue());
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9326h6.f27656w)) {
                return UpcycleLandingScreenModel.INSTANCE;
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9334i6.f27681w)) {
                String str239 = queryMap.get("call_id");
                return new VideoCallScreenModel(str239 == null ? "" : str239);
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9412s4.f27920w)) {
                String str240 = queryMap.get("source");
                String str241 = str240 == null ? "" : str240;
                String str242 = queryMap.get(ProfileApiKt.TARGET_USER_ID_PARAM);
                Integer numM125932Q10 = str242 != null ? AbstractC39421y.m125932Q(str242) : null;
                String str243 = queryMap.get(ProfileApiKt.COMMUNITY_ID_PARAM);
                return new ProfileScreenModel(str241, numM125932Q10, str243 != null ? AbstractC39421y.m125932Q(str243) : null, (String) null, 8, (DefaultConstructorMarker) null);
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9360m0.f27763w)) {
                String str244 = queryMap.get("source");
                if (str244 == null) {
                    str244 = "";
                }
                String str245 = queryMap.get("test_count");
                return new AdvancedLabsPurchaseAddOnsScreenModel(str244, str245 == null ? "" : str245, queryMap.get("navigation_style"));
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9420t4.f27945w)) {
                return ReactivationUpsellScreenModel.INSTANCE;
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9332i4.f27675w)) {
                String str246 = queryMap.get("onboarding_story_name");
                String str247 = str246 == null ? "" : str246;
                String str248 = queryMap.get("cycle_id");
                if (str248 != null && (lM125933R = AbstractC39421y.m125933R(str248)) != null) {
                    jLongValue = lM125933R.longValue();
                }
                return new OnboardingStoryScreenModel(str247, jLongValue);
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9330i2.f27668w)) {
                String str249 = queryMap.get("feature_education_name");
                return new FeatureEducationModel(str249 == null ? "" : str249, queryMap.get("source"), (String) null, 4, (DefaultConstructorMarker) null);
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9287d.f27536w)) {
                return new ActivationAccountActivationScreenModel(appScreen.getName());
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9295e.f27561w)) {
                return new ActivationAccountCreationScreenModel(appScreen.getName());
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9303f.f27586w)) {
                return new ActivationAccountTransitionLegacyAfterActivationScreenModel(appScreen.getName());
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9311g.f27610w)) {
                return new AfterActivationFinalScreensScreenModel(queryMap.get("source"), appScreen.getName());
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9319h.f27635w)) {
                return new ActivationAlAfterActivationScreenModel(appScreen.getName());
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9327i.f27659w)) {
                return new ActivationAlPermissionsScreenModel(appScreen.getName());
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9335j.f27684w)) {
                return new ActivationAlProfileScreenModel(appScreen.getName());
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9343k.f27708w)) {
                return new ActivationDeviceEducationScreenModel(appScreen.getName());
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9351l.f27733w)) {
                return new ActivationEnterYourEmailScreenModel(appScreen.getName());
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9359m.f27760w)) {
                return new ActivationEnterYourPasswordScreenModel(appScreen.getName());
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9367n.f27786w)) {
                return new ActivationHwOnlyAfterActivationScreenModel(appScreen.getName());
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9375o.f27812w)) {
                return new ActivationHwOnlyPermissionsScreenModel(appScreen.getName());
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9383p.f27837w)) {
                return new ActivationHwOnlyProfileScreenModel(appScreen.getName());
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9391q.f27861w)) {
                return new ActivationInAppJoinFlowScreenModel(appScreen.getName());
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9399r.f27881w)) {
                return new ActivationMedicareAfterActivationScreenModel(appScreen.getName());
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9407s.f27905w)) {
                return new ActivationMedicarePermissionsScreenModel(appScreen.getName());
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9415t.f27929w)) {
                return new ActivationMembershipServicesScreenModel(appScreen.getName());
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9423u.f27954w)) {
                return new ActivationMfaChallengeScreenModel(appScreen.getName());
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9431v.f27978w)) {
                return new ActivationPairingScreenModel(appScreen.getName());
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9439w.f28003w)) {
                return new ActivationPostPairingScreenModel(appScreen.getName());
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9447x.f28029w)) {
                return new ActivationStartScreenScreenModel(appScreen.getName());
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9318g6.f27632w) || AbstractC22676k.m65745e(appScreen, AppScreen.C9451x3.f28042w) || AbstractC22676k.m65745e(appScreen, AppScreen.C9346k2.f27718w) || AbstractC22676k.m65745e(appScreen, AppScreen.C9433v1.f27984w) || AbstractC22676k.m65745e(appScreen, AppScreen.C9369n1.f27793w) || AbstractC22676k.m65745e(appScreen, AppScreen.C9283c3.f27524w) || (appScreen instanceof AppScreen.URLScreen) || (appScreen instanceof FeatureSpecificAppScreen)) {
                return NavigationScreenModel.None.INSTANCE;
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9284c4.f27527w)) {
                return new MfaSetupScreenModel(queryMap.get("source"));
            }
            if (AbstractC22676k.m65745e(appScreen, AppScreen.C9381o5.f27831w)) {
                return new SmsSetupScreenModel(queryMap.get("source"));
            }
            throw new NoWhenBranchMatchedException();
        }
        return StartActivityScreenModel.INSTANCE;
    }
}
