package com.whoop.weeklyplan.customizeplan.domain.api;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.weeklyplan.api.WeeklyPlanApiKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 N2\u00020\u0001:\u0002ONBy\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u0093\u0001\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0012\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0012\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b$\u0010 J\u0010\u0010%\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b%\u0010 J\u0012\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b&\u0010 J\u0012\u0010'\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b)\u0010*J\u009a\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b-\u0010 J\u0010\u0010.\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b2\u00103J'\u0010<\u001a\u0002092\u0006\u00104\u001a\u00020\u00002\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0001¢\u0006\u0004\b:\u0010;R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010=\u001a\u0004\b>\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010?\u001a\u0004\b@\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010?\u001a\u0004\bA\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010B\u001a\u0004\bC\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010B\u001a\u0004\bD\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010B\u001a\u0004\bE\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010B\u001a\u0004\bF\u0010 R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010B\u001a\u0004\bG\u0010 R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010B\u001a\u0004\bH\u0010 R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010B\u001a\u0004\bI\u0010 R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010J\u001a\u0004\bK\u0010(R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010L\u001a\u0004\bM\u0010*¨\u0006P"}, m65681d2 = {"Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;", "", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", WeeklyPlanApiKt.GOAL, "Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;", "sliderContent", "toggleContent", "", "navigationTitleDisplay", "navigationSubtitleDisplay", "title", "description", "buttonDescriptionDisplay", "continueButtonDisplay", "skipButtonDisplay", "Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;", "smartAlarmOverride", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TipContentV2;", "tipContent", "<init>", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;Lcom/whoop/weeklyplan/customizeplan/domain/api/TipContentV2;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;Lcom/whoop/weeklyplan/customizeplan/domain/api/TipContentV2;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "component2", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;", "component3", "component4", "()Ljava/lang/String;", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;", "component12", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/TipContentV2;", "copy", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;Lcom/whoop/weeklyplan/customizeplan/domain/api/TipContentV2;)Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weekly_plan_release", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "getGoal", "Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;", "getSliderContent", "getToggleContent", "Ljava/lang/String;", "getNavigationTitleDisplay", "getNavigationSubtitleDisplay", "getTitle", "getDescription", "getButtonDescriptionDisplay", "getContinueButtonDisplay", "getSkipButtonDisplay", "Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;", "getSmartAlarmOverride", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TipContentV2;", "getTipContent", "Companion", "$serializer", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WeeklyPlanCustomizationScreenModelV2 {
    public static final int $stable = 0;
    private final String buttonDescriptionDisplay;
    private final String continueButtonDisplay;
    private final String description;
    private final TargetGoalType goal;
    private final String navigationSubtitleDisplay;
    private final String navigationTitleDisplay;
    private final String skipButtonDisplay;
    private final GoalScreenContent sliderContent;
    private final SmartAlarmOverrideV2 smartAlarmOverride;
    private final TipContentV2 tipContent;
    private final String title;
    private final GoalScreenContent toggleContent;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C10717a(8)), null, null, null, null, null, null, null, null, null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;", "serializer", "()Lwc3/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return WeeklyPlanCustomizationScreenModelV2$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WeeklyPlanCustomizationScreenModelV2(int i13, TargetGoalType targetGoalType, GoalScreenContent goalScreenContent, GoalScreenContent goalScreenContent2, String str, String str2, String str3, String str4, String str5, String str6, String str7, SmartAlarmOverrideV2 smartAlarmOverrideV2, TipContentV2 tipContentV2, SerializationConstructorMarker serializationConstructorMarker) {
        if (4095 != (i13 & 4095)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 4095, WeeklyPlanCustomizationScreenModelV2$$serializer.INSTANCE.getDescriptor());
        }
        this.goal = targetGoalType;
        this.sliderContent = goalScreenContent;
        this.toggleContent = goalScreenContent2;
        this.navigationTitleDisplay = str;
        this.navigationSubtitleDisplay = str2;
        this.title = str3;
        this.description = str4;
        this.buttonDescriptionDisplay = str5;
        this.continueButtonDisplay = str6;
        this.skipButtonDisplay = str7;
        this.smartAlarmOverride = smartAlarmOverrideV2;
        this.tipContent = tipContentV2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return TargetGoalType.INSTANCE.serializer();
    }

    public static /* synthetic */ WeeklyPlanCustomizationScreenModelV2 copy$default(WeeklyPlanCustomizationScreenModelV2 weeklyPlanCustomizationScreenModelV2, TargetGoalType targetGoalType, GoalScreenContent goalScreenContent, GoalScreenContent goalScreenContent2, String str, String str2, String str3, String str4, String str5, String str6, String str7, SmartAlarmOverrideV2 smartAlarmOverrideV2, TipContentV2 tipContentV2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            targetGoalType = weeklyPlanCustomizationScreenModelV2.goal;
        }
        if ((i13 & 2) != 0) {
            goalScreenContent = weeklyPlanCustomizationScreenModelV2.sliderContent;
        }
        if ((i13 & 4) != 0) {
            goalScreenContent2 = weeklyPlanCustomizationScreenModelV2.toggleContent;
        }
        if ((i13 & 8) != 0) {
            str = weeklyPlanCustomizationScreenModelV2.navigationTitleDisplay;
        }
        if ((i13 & 16) != 0) {
            str2 = weeklyPlanCustomizationScreenModelV2.navigationSubtitleDisplay;
        }
        if ((i13 & 32) != 0) {
            str3 = weeklyPlanCustomizationScreenModelV2.title;
        }
        if ((i13 & 64) != 0) {
            str4 = weeklyPlanCustomizationScreenModelV2.description;
        }
        if ((i13 & 128) != 0) {
            str5 = weeklyPlanCustomizationScreenModelV2.buttonDescriptionDisplay;
        }
        if ((i13 & 256) != 0) {
            str6 = weeklyPlanCustomizationScreenModelV2.continueButtonDisplay;
        }
        if ((i13 & 512) != 0) {
            str7 = weeklyPlanCustomizationScreenModelV2.skipButtonDisplay;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            smartAlarmOverrideV2 = weeklyPlanCustomizationScreenModelV2.smartAlarmOverride;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            tipContentV2 = weeklyPlanCustomizationScreenModelV2.tipContent;
        }
        SmartAlarmOverrideV2 smartAlarmOverrideV3 = smartAlarmOverrideV2;
        TipContentV2 tipContentV3 = tipContentV2;
        String str8 = str6;
        String str9 = str7;
        String str10 = str4;
        String str11 = str5;
        String str12 = str2;
        String str13 = str3;
        return weeklyPlanCustomizationScreenModelV2.copy(targetGoalType, goalScreenContent, goalScreenContent2, str, str12, str13, str10, str11, str8, str9, smartAlarmOverrideV3, tipContentV3);
    }

    public static final /* synthetic */ void write$Self$weekly_plan_release(WeeklyPlanCustomizationScreenModelV2 self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) $childSerializers[0].getValue(), self.goal);
        GoalScreenContentSerializer goalScreenContentSerializer = GoalScreenContentSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, goalScreenContentSerializer, self.sliderContent);
        output.encodeNullableSerializableElement(serialDesc, 2, goalScreenContentSerializer, self.toggleContent);
        output.encodeStringElement(serialDesc, 3, self.navigationTitleDisplay);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.navigationSubtitleDisplay);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.title);
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.description);
        output.encodeNullableSerializableElement(serialDesc, 7, stringSerializer, self.buttonDescriptionDisplay);
        output.encodeStringElement(serialDesc, 8, self.continueButtonDisplay);
        output.encodeNullableSerializableElement(serialDesc, 9, stringSerializer, self.skipButtonDisplay);
        output.encodeNullableSerializableElement(serialDesc, 10, SmartAlarmOverrideV2$$serializer.INSTANCE, self.smartAlarmOverride);
        output.encodeNullableSerializableElement(serialDesc, 11, TipContentV2$$serializer.INSTANCE, self.tipContent);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TargetGoalType getGoal() {
        return this.goal;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSkipButtonDisplay() {
        return this.skipButtonDisplay;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final SmartAlarmOverrideV2 getSmartAlarmOverride() {
        return this.smartAlarmOverride;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final TipContentV2 getTipContent() {
        return this.tipContent;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final GoalScreenContent getSliderContent() {
        return this.sliderContent;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final GoalScreenContent getToggleContent() {
        return this.toggleContent;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNavigationTitleDisplay() {
        return this.navigationTitleDisplay;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNavigationSubtitleDisplay() {
        return this.navigationSubtitleDisplay;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getButtonDescriptionDisplay() {
        return this.buttonDescriptionDisplay;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getContinueButtonDisplay() {
        return this.continueButtonDisplay;
    }

    public final WeeklyPlanCustomizationScreenModelV2 copy(TargetGoalType goal, GoalScreenContent sliderContent, GoalScreenContent toggleContent, String navigationTitleDisplay, String navigationSubtitleDisplay, String title, String description, String buttonDescriptionDisplay, String continueButtonDisplay, String skipButtonDisplay, SmartAlarmOverrideV2 smartAlarmOverride, TipContentV2 tipContent) {
        AbstractC22676k.m65750j(goal, "goal");
        AbstractC22676k.m65750j(navigationTitleDisplay, "navigationTitleDisplay");
        AbstractC22676k.m65750j(continueButtonDisplay, "continueButtonDisplay");
        return new WeeklyPlanCustomizationScreenModelV2(goal, sliderContent, toggleContent, navigationTitleDisplay, navigationSubtitleDisplay, title, description, buttonDescriptionDisplay, continueButtonDisplay, skipButtonDisplay, smartAlarmOverride, tipContent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeeklyPlanCustomizationScreenModelV2)) {
            return false;
        }
        WeeklyPlanCustomizationScreenModelV2 weeklyPlanCustomizationScreenModelV2 = (WeeklyPlanCustomizationScreenModelV2) other;
        return this.goal == weeklyPlanCustomizationScreenModelV2.goal && AbstractC22676k.m65745e(this.sliderContent, weeklyPlanCustomizationScreenModelV2.sliderContent) && AbstractC22676k.m65745e(this.toggleContent, weeklyPlanCustomizationScreenModelV2.toggleContent) && AbstractC22676k.m65745e(this.navigationTitleDisplay, weeklyPlanCustomizationScreenModelV2.navigationTitleDisplay) && AbstractC22676k.m65745e(this.navigationSubtitleDisplay, weeklyPlanCustomizationScreenModelV2.navigationSubtitleDisplay) && AbstractC22676k.m65745e(this.title, weeklyPlanCustomizationScreenModelV2.title) && AbstractC22676k.m65745e(this.description, weeklyPlanCustomizationScreenModelV2.description) && AbstractC22676k.m65745e(this.buttonDescriptionDisplay, weeklyPlanCustomizationScreenModelV2.buttonDescriptionDisplay) && AbstractC22676k.m65745e(this.continueButtonDisplay, weeklyPlanCustomizationScreenModelV2.continueButtonDisplay) && AbstractC22676k.m65745e(this.skipButtonDisplay, weeklyPlanCustomizationScreenModelV2.skipButtonDisplay) && AbstractC22676k.m65745e(this.smartAlarmOverride, weeklyPlanCustomizationScreenModelV2.smartAlarmOverride) && AbstractC22676k.m65745e(this.tipContent, weeklyPlanCustomizationScreenModelV2.tipContent);
    }

    public final String getButtonDescriptionDisplay() {
        return this.buttonDescriptionDisplay;
    }

    public final String getContinueButtonDisplay() {
        return this.continueButtonDisplay;
    }

    public final String getDescription() {
        return this.description;
    }

    public final TargetGoalType getGoal() {
        return this.goal;
    }

    public final String getNavigationSubtitleDisplay() {
        return this.navigationSubtitleDisplay;
    }

    public final String getNavigationTitleDisplay() {
        return this.navigationTitleDisplay;
    }

    public final String getSkipButtonDisplay() {
        return this.skipButtonDisplay;
    }

    public final GoalScreenContent getSliderContent() {
        return this.sliderContent;
    }

    public final SmartAlarmOverrideV2 getSmartAlarmOverride() {
        return this.smartAlarmOverride;
    }

    public final TipContentV2 getTipContent() {
        return this.tipContent;
    }

    public final String getTitle() {
        return this.title;
    }

    public final GoalScreenContent getToggleContent() {
        return this.toggleContent;
    }

    public int hashCode() {
        int iHashCode = this.goal.hashCode() * 31;
        GoalScreenContent goalScreenContent = this.sliderContent;
        int iHashCode2 = (iHashCode + (goalScreenContent == null ? 0 : goalScreenContent.hashCode())) * 31;
        GoalScreenContent goalScreenContent2 = this.toggleContent;
        int iM30450d = AbstractC11266d.m30450d((iHashCode2 + (goalScreenContent2 == null ? 0 : goalScreenContent2.hashCode())) * 31, 31, this.navigationTitleDisplay);
        String str = this.navigationSubtitleDisplay;
        int iHashCode3 = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.buttonDescriptionDisplay;
        int iM30450d2 = AbstractC11266d.m30450d((iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.continueButtonDisplay);
        String str5 = this.skipButtonDisplay;
        int iHashCode6 = (iM30450d2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        SmartAlarmOverrideV2 smartAlarmOverrideV2 = this.smartAlarmOverride;
        int iHashCode7 = (iHashCode6 + (smartAlarmOverrideV2 == null ? 0 : smartAlarmOverrideV2.hashCode())) * 31;
        TipContentV2 tipContentV2 = this.tipContent;
        return iHashCode7 + (tipContentV2 != null ? tipContentV2.hashCode() : 0);
    }

    public String toString() {
        TargetGoalType targetGoalType = this.goal;
        GoalScreenContent goalScreenContent = this.sliderContent;
        GoalScreenContent goalScreenContent2 = this.toggleContent;
        String str = this.navigationTitleDisplay;
        String str2 = this.navigationSubtitleDisplay;
        String str3 = this.title;
        String str4 = this.description;
        String str5 = this.buttonDescriptionDisplay;
        String str6 = this.continueButtonDisplay;
        String str7 = this.skipButtonDisplay;
        SmartAlarmOverrideV2 smartAlarmOverrideV2 = this.smartAlarmOverride;
        TipContentV2 tipContentV2 = this.tipContent;
        StringBuilder sb4 = new StringBuilder("WeeklyPlanCustomizationScreenModelV2(goal=");
        sb4.append(targetGoalType);
        sb4.append(", sliderContent=");
        sb4.append(goalScreenContent);
        sb4.append(", toggleContent=");
        sb4.append(goalScreenContent2);
        sb4.append(", navigationTitleDisplay=");
        sb4.append(str);
        sb4.append(", navigationSubtitleDisplay=");
        AbstractC11266d.m30444B(sb4, str2, ", title=", str3, ", description=");
        AbstractC11266d.m30444B(sb4, str4, ", buttonDescriptionDisplay=", str5, ", continueButtonDisplay=");
        AbstractC11266d.m30444B(sb4, str6, ", skipButtonDisplay=", str7, ", smartAlarmOverride=");
        sb4.append(smartAlarmOverrideV2);
        sb4.append(", tipContent=");
        sb4.append(tipContentV2);
        sb4.append(")");
        return sb4.toString();
    }

    public WeeklyPlanCustomizationScreenModelV2(TargetGoalType goal, GoalScreenContent goalScreenContent, GoalScreenContent goalScreenContent2, String navigationTitleDisplay, String str, String str2, String str3, String str4, String continueButtonDisplay, String str5, SmartAlarmOverrideV2 smartAlarmOverrideV2, TipContentV2 tipContentV2) {
        AbstractC22676k.m65750j(goal, "goal");
        AbstractC22676k.m65750j(navigationTitleDisplay, "navigationTitleDisplay");
        AbstractC22676k.m65750j(continueButtonDisplay, "continueButtonDisplay");
        this.goal = goal;
        this.sliderContent = goalScreenContent;
        this.toggleContent = goalScreenContent2;
        this.navigationTitleDisplay = navigationTitleDisplay;
        this.navigationSubtitleDisplay = str;
        this.title = str2;
        this.description = str3;
        this.buttonDescriptionDisplay = str4;
        this.continueButtonDisplay = continueButtonDisplay;
        this.skipButtonDisplay = str5;
        this.smartAlarmOverride = smartAlarmOverrideV2;
        this.tipContent = tipContentV2;
    }
}
