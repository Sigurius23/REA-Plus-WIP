package jt2;

import androidx.profileinstaller.ProfileVerifier;
import com.whoop.weeklyplan.customizeplan.domain.api.TargetGoalType;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jh3.AbstractC21702c;
import m83.C25271y;
import nh3.AbstractC26725a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import sw0.C33050g;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: jt2.d */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b4\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0002\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0002\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0002\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b \u0010!J \u0002\u0010\"\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00022\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00142\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\u00142\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010+\u001a\u0004\b,\u0010-R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010-R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0006¢\u0006\f\n\u0004\b4\u0010+\u001a\u0004\b5\u0010-R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0006¢\u0006\f\n\u0004\b,\u0010+\u001a\u0004\b6\u0010-R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b2\u00107\u001a\u0004\b0\u00108R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00028\u0006¢\u0006\f\n\u0004\b9\u0010+\u001a\u0004\b:\u0010-R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u00028\u0006¢\u0006\f\n\u0004\b;\u0010+\u001a\u0004\b<\u0010-R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b=\u00107\u001a\u0004\b4\u00108R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00028\u0006¢\u0006\f\n\u0004\b:\u0010+\u001a\u0004\b>\u0010-R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u00028\u0006¢\u0006\f\n\u0004\b>\u0010+\u001a\u0004\b?\u0010-R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b6\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bC\u0010%R\u0017\u0010\u0018\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bE\u0010@\u001a\u0004\bF\u0010BR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bG\u0010D\u001a\u0004\bH\u0010%R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b<\u0010D\u001a\u0004\bG\u0010%R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b?\u0010D\u001a\u0004\bI\u0010%R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b5\u0010D\u001a\u0004\bE\u0010%R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bH\u0010D\u001a\u0004\b9\u0010%R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b/\u0010D\u001a\u0004\b=\u0010%R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bI\u0010D\u001a\u0004\b;\u0010%¨\u0006J"}, m65681d2 = {"Ljt2/d;", "", "", "", "contributorId", "tempContributorId", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "currentSlider", "Ljt2/r;", "sliderValues", "pendingSliderValues", "Lsw0/g;", "activitiesBottomSheet", "Ljt2/a;", "pendingSelectedActivities", "selectedActivities", "behaviorsBottomSheet", "Ljt2/b;", "pendingSelectedBehaviors", "selectedBehaviors", "", "isCustomized", "", "planId", "isSaveEnabled", "source", "presetPlanCategory", "templateId", "planTitle", "description", "explanationTitle", "explanation", "<init>", "(Ljava/util/List;Ljava/util/List;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Ljava/util/List;Ljava/util/List;Lsw0/g;Ljava/util/List;Ljava/util/List;Lsw0/g;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "(Ljava/util/List;Ljava/util/List;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Ljava/util/List;Ljava/util/List;Lsw0/g;Ljava/util/List;Ljava/util/List;Lsw0/g;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljt2/d;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "e", "()Ljava/util/List;", "b", "t", "c", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "f", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "d", "r", "l", "Lsw0/g;", "()Lsw0/g;", "g", "j", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "p", "i", "k", "q", "Z", "v", "()Z", "m", "Ljava/lang/String;", "n", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "o", "s", "u", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21942d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<Integer> contributorId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<Integer> tempContributorId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TargetGoalType currentSlider;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<C21956r> sliderValues;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<C21956r> pendingSliderValues;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C33050g activitiesBottomSheet;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final List<C21939a> pendingSelectedActivities;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final List<C21939a> selectedActivities;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C33050g behaviorsBottomSheet;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final List<C21940b> pendingSelectedBehaviors;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final List<C21940b> selectedBehaviors;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final boolean isCustomized;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final String planId;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final boolean isSaveEnabled;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final String source;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final String presetPlanCategory;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final String templateId;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final String planTitle;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final String description;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final String explanationTitle;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final String explanation;

    public C21942d(List<Integer> contributorId, List<Integer> tempContributorId, TargetGoalType currentSlider, List<C21956r> sliderValues, List<C21956r> pendingSliderValues, C33050g activitiesBottomSheet, List<C21939a> pendingSelectedActivities, List<C21939a> selectedActivities, C33050g behaviorsBottomSheet, List<C21940b> pendingSelectedBehaviors, List<C21940b> selectedBehaviors, boolean z4, String planId, boolean z13, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AbstractC22676k.m65750j(contributorId, "contributorId");
        AbstractC22676k.m65750j(tempContributorId, "tempContributorId");
        AbstractC22676k.m65750j(currentSlider, "currentSlider");
        AbstractC22676k.m65750j(sliderValues, "sliderValues");
        AbstractC22676k.m65750j(pendingSliderValues, "pendingSliderValues");
        AbstractC22676k.m65750j(activitiesBottomSheet, "activitiesBottomSheet");
        AbstractC22676k.m65750j(pendingSelectedActivities, "pendingSelectedActivities");
        AbstractC22676k.m65750j(selectedActivities, "selectedActivities");
        AbstractC22676k.m65750j(behaviorsBottomSheet, "behaviorsBottomSheet");
        AbstractC22676k.m65750j(pendingSelectedBehaviors, "pendingSelectedBehaviors");
        AbstractC22676k.m65750j(selectedBehaviors, "selectedBehaviors");
        AbstractC22676k.m65750j(planId, "planId");
        this.contributorId = contributorId;
        this.tempContributorId = tempContributorId;
        this.currentSlider = currentSlider;
        this.sliderValues = sliderValues;
        this.pendingSliderValues = pendingSliderValues;
        this.activitiesBottomSheet = activitiesBottomSheet;
        this.pendingSelectedActivities = pendingSelectedActivities;
        this.selectedActivities = selectedActivities;
        this.behaviorsBottomSheet = behaviorsBottomSheet;
        this.pendingSelectedBehaviors = pendingSelectedBehaviors;
        this.selectedBehaviors = selectedBehaviors;
        this.isCustomized = z4;
        this.planId = planId;
        this.isSaveEnabled = z13;
        this.source = str;
        this.presetPlanCategory = str2;
        this.templateId = str3;
        this.planTitle = str4;
        this.description = str5;
        this.explanationTitle = str6;
        this.explanation = str7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C21942d m62534b(C21942d c21942d, List list, List list2, TargetGoalType targetGoalType, List list3, List list4, C33050g c33050g, List list5, List list6, C33050g c33050g2, List list7, List list8, boolean z4, String str, boolean z13, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i13, Object obj) {
        String str9;
        String str10;
        List list9 = (i13 & 1) != 0 ? c21942d.contributorId : list;
        List list10 = (i13 & 2) != 0 ? c21942d.tempContributorId : list2;
        TargetGoalType targetGoalType2 = (i13 & 4) != 0 ? c21942d.currentSlider : targetGoalType;
        List list11 = (i13 & 8) != 0 ? c21942d.sliderValues : list3;
        List list12 = (i13 & 16) != 0 ? c21942d.pendingSliderValues : list4;
        C33050g c33050g3 = (i13 & 32) != 0 ? c21942d.activitiesBottomSheet : c33050g;
        List list13 = (i13 & 64) != 0 ? c21942d.pendingSelectedActivities : list5;
        List list14 = (i13 & 128) != 0 ? c21942d.selectedActivities : list6;
        C33050g c33050g4 = (i13 & 256) != 0 ? c21942d.behaviorsBottomSheet : c33050g2;
        List list15 = (i13 & 512) != 0 ? c21942d.pendingSelectedBehaviors : list7;
        List list16 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c21942d.selectedBehaviors : list8;
        boolean z14 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c21942d.isCustomized : z4;
        String str11 = (i13 & 4096) != 0 ? c21942d.planId : str;
        boolean z15 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c21942d.isSaveEnabled : z13;
        List list17 = list9;
        String str12 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c21942d.source : str2;
        String str13 = (i13 & 32768) != 0 ? c21942d.presetPlanCategory : str3;
        String str14 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? c21942d.templateId : str4;
        String str15 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? c21942d.planTitle : str5;
        String str16 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? c21942d.description : str6;
        String str17 = (i13 & 524288) != 0 ? c21942d.explanationTitle : str7;
        if ((i13 & 1048576) != 0) {
            str10 = str17;
            str9 = c21942d.explanation;
        } else {
            str9 = str8;
            str10 = str17;
        }
        return c21942d.m62535a(list17, list10, targetGoalType2, list11, list12, c33050g3, list13, list14, c33050g4, list15, list16, z14, str11, z15, str12, str13, str14, str15, str16, str10, str9);
    }

    /* JADX INFO: renamed from: a */
    public final C21942d m62535a(List<Integer> contributorId, List<Integer> tempContributorId, TargetGoalType currentSlider, List<C21956r> sliderValues, List<C21956r> pendingSliderValues, C33050g activitiesBottomSheet, List<C21939a> pendingSelectedActivities, List<C21939a> selectedActivities, C33050g behaviorsBottomSheet, List<C21940b> pendingSelectedBehaviors, List<C21940b> selectedBehaviors, boolean isCustomized, String planId, boolean isSaveEnabled, String source, String presetPlanCategory, String templateId, String planTitle, String description, String explanationTitle, String explanation) {
        AbstractC22676k.m65750j(contributorId, "contributorId");
        AbstractC22676k.m65750j(tempContributorId, "tempContributorId");
        AbstractC22676k.m65750j(currentSlider, "currentSlider");
        AbstractC22676k.m65750j(sliderValues, "sliderValues");
        AbstractC22676k.m65750j(pendingSliderValues, "pendingSliderValues");
        AbstractC22676k.m65750j(activitiesBottomSheet, "activitiesBottomSheet");
        AbstractC22676k.m65750j(pendingSelectedActivities, "pendingSelectedActivities");
        AbstractC22676k.m65750j(selectedActivities, "selectedActivities");
        AbstractC22676k.m65750j(behaviorsBottomSheet, "behaviorsBottomSheet");
        AbstractC22676k.m65750j(pendingSelectedBehaviors, "pendingSelectedBehaviors");
        AbstractC22676k.m65750j(selectedBehaviors, "selectedBehaviors");
        AbstractC22676k.m65750j(planId, "planId");
        return new C21942d(contributorId, tempContributorId, currentSlider, sliderValues, pendingSliderValues, activitiesBottomSheet, pendingSelectedActivities, selectedActivities, behaviorsBottomSheet, pendingSelectedBehaviors, selectedBehaviors, isCustomized, planId, isSaveEnabled, source, presetPlanCategory, templateId, planTitle, description, explanationTitle, explanation);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C33050g getActivitiesBottomSheet() {
        return this.activitiesBottomSheet;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C33050g getBehaviorsBottomSheet() {
        return this.behaviorsBottomSheet;
    }

    /* JADX INFO: renamed from: e */
    public final List<Integer> m62538e() {
        return this.contributorId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21942d)) {
            return false;
        }
        C21942d c21942d = (C21942d) other;
        return AbstractC22676k.m65745e(this.contributorId, c21942d.contributorId) && AbstractC22676k.m65745e(this.tempContributorId, c21942d.tempContributorId) && this.currentSlider == c21942d.currentSlider && AbstractC22676k.m65745e(this.sliderValues, c21942d.sliderValues) && AbstractC22676k.m65745e(this.pendingSliderValues, c21942d.pendingSliderValues) && AbstractC22676k.m65745e(this.activitiesBottomSheet, c21942d.activitiesBottomSheet) && AbstractC22676k.m65745e(this.pendingSelectedActivities, c21942d.pendingSelectedActivities) && AbstractC22676k.m65745e(this.selectedActivities, c21942d.selectedActivities) && AbstractC22676k.m65745e(this.behaviorsBottomSheet, c21942d.behaviorsBottomSheet) && AbstractC22676k.m65745e(this.pendingSelectedBehaviors, c21942d.pendingSelectedBehaviors) && AbstractC22676k.m65745e(this.selectedBehaviors, c21942d.selectedBehaviors) && this.isCustomized == c21942d.isCustomized && AbstractC22676k.m65745e(this.planId, c21942d.planId) && this.isSaveEnabled == c21942d.isSaveEnabled && AbstractC22676k.m65745e(this.source, c21942d.source) && AbstractC22676k.m65745e(this.presetPlanCategory, c21942d.presetPlanCategory) && AbstractC22676k.m65745e(this.templateId, c21942d.templateId) && AbstractC22676k.m65745e(this.planTitle, c21942d.planTitle) && AbstractC22676k.m65745e(this.description, c21942d.description) && AbstractC22676k.m65745e(this.explanationTitle, c21942d.explanationTitle) && AbstractC22676k.m65745e(this.explanation, c21942d.explanation);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TargetGoalType getCurrentSlider() {
        return this.currentSlider;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getExplanation() {
        return this.explanation;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC11895b.m31983b(AbstractC11895b.m31983b((this.behaviorsBottomSheet.hashCode() + AbstractC11895b.m31983b(AbstractC11895b.m31983b((this.activitiesBottomSheet.hashCode() + AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC36095b.m114674b(this.currentSlider, AbstractC11895b.m31983b(this.contributorId.hashCode() * 31, 31, this.tempContributorId), 31), 31, this.sliderValues), 31, this.pendingSliderValues)) * 31, 31, this.pendingSelectedActivities), 31, this.selectedActivities)) * 31, 31, this.pendingSelectedBehaviors), 31, this.selectedBehaviors), 31, this.isCustomized), 31, this.planId), 31, this.isSaveEnabled);
        String str = this.source;
        int iHashCode = (iM8289b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.presetPlanCategory;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.templateId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.planTitle;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.description;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.explanationTitle;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.explanation;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getExplanationTitle() {
        return this.explanationTitle;
    }

    /* JADX INFO: renamed from: j */
    public final List<C21939a> m62543j() {
        return this.pendingSelectedActivities;
    }

    /* JADX INFO: renamed from: k */
    public final List<C21940b> m62544k() {
        return this.pendingSelectedBehaviors;
    }

    /* JADX INFO: renamed from: l */
    public final List<C21956r> m62545l() {
        return this.pendingSliderValues;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getPlanId() {
        return this.planId;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getPlanTitle() {
        return this.planTitle;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getPresetPlanCategory() {
        return this.presetPlanCategory;
    }

    /* JADX INFO: renamed from: p */
    public final List<C21939a> m62549p() {
        return this.selectedActivities;
    }

    /* JADX INFO: renamed from: q */
    public final List<C21940b> m62550q() {
        return this.selectedBehaviors;
    }

    /* JADX INFO: renamed from: r */
    public final List<C21956r> m62551r() {
        return this.sliderValues;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: t */
    public final List<Integer> m62553t() {
        return this.tempContributorId;
    }

    public String toString() {
        List<Integer> list = this.contributorId;
        List<Integer> list2 = this.tempContributorId;
        TargetGoalType targetGoalType = this.currentSlider;
        List<C21956r> list3 = this.sliderValues;
        List<C21956r> list4 = this.pendingSliderValues;
        C33050g c33050g = this.activitiesBottomSheet;
        List<C21939a> list5 = this.pendingSelectedActivities;
        List<C21939a> list6 = this.selectedActivities;
        C33050g c33050g2 = this.behaviorsBottomSheet;
        List<C21940b> list7 = this.pendingSelectedBehaviors;
        List<C21940b> list8 = this.selectedBehaviors;
        boolean z4 = this.isCustomized;
        String str = this.planId;
        boolean z13 = this.isSaveEnabled;
        String str2 = this.source;
        String str3 = this.presetPlanCategory;
        String str4 = this.templateId;
        String str5 = this.planTitle;
        String str6 = this.description;
        String str7 = this.explanationTitle;
        String str8 = this.explanation;
        StringBuilder sbM124380j = AbstractC38963t7.m124380j("HubAndSpokeAccumulationObject(contributorId=", ", tempContributorId=", list, ", currentSlider=", list2);
        sbM124380j.append(targetGoalType);
        sbM124380j.append(", sliderValues=");
        sbM124380j.append(list3);
        sbM124380j.append(", pendingSliderValues=");
        sbM124380j.append(list4);
        sbM124380j.append(", activitiesBottomSheet=");
        sbM124380j.append(c33050g);
        sbM124380j.append(", pendingSelectedActivities=");
        AbstractC21702c.m61148s(sbM124380j, list5, ", selectedActivities=", list6, ", behaviorsBottomSheet=");
        sbM124380j.append(c33050g2);
        sbM124380j.append(", pendingSelectedBehaviors=");
        sbM124380j.append(list7);
        sbM124380j.append(", selectedBehaviors=");
        AbstractC26725a.m79512p(", isCustomized=", ", planId=", sbM124380j, list8, z4);
        AbstractC38963t7.m124390t(sbM124380j, str, ", isSaveEnabled=", z13, ", source=");
        AbstractC11266d.m30444B(sbM124380j, str2, ", presetPlanCategory=", str3, ", templateId=");
        AbstractC11266d.m30444B(sbM124380j, str4, ", planTitle=", str5, ", description=");
        AbstractC11266d.m30444B(sbM124380j, str6, ", explanationTitle=", str7, ", explanation=");
        return AbstractC25012a.m73376i(str8, ")", sbM124380j);
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getTemplateId() {
        return this.templateId;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final boolean getIsCustomized() {
        return this.isCustomized;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final boolean getIsSaveEnabled() {
        return this.isSaveEnabled;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C21942d(List list, List list2, TargetGoalType targetGoalType, List list3, List list4, C33050g c33050g, List list5, List list6, C33050g c33050g2, List list7, List list8, boolean z4, String str, boolean z13, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        int i14 = i13 & 1;
        List list9 = C25271y.f99162w;
        this(i14 != 0 ? list9 : list, (i13 & 2) != 0 ? list9 : list2, (i13 & 4) != 0 ? TargetGoalType.SLEEP_PERFORMANCE : targetGoalType, (i13 & 8) != 0 ? list9 : list3, (i13 & 16) != 0 ? list9 : list4, (i13 & 32) != 0 ? new C33050g(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null) : c33050g, (i13 & 64) != 0 ? list9 : list5, (i13 & 128) != 0 ? list9 : list6, (i13 & 256) != 0 ? new C33050g(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null) : c33050g2, (i13 & 512) != 0 ? list9 : list7, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0 ? list8 : list9, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? false : z4, (i13 & 4096) != 0 ? "" : str, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? true : z13, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : str2, (i13 & 32768) != 0 ? null : str3, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? null : str4, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? null : str5, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? null : str6, (i13 & 524288) != 0 ? null : str7, (i13 & 1048576) != 0 ? null : str8);
    }
}
