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
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 T2\u00020\u0001:\u0002UTBy\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\u0093\u0001\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b$\u0010\"J\u0012\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b%\u0010\"J\u0012\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b&\u0010\"J\u0010\u0010'\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b'\u0010\"J\u0012\u0010(\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b(\u0010\"J\u0012\u0010)\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b+\u0010,J\u009a\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b/\u0010\"J\u0010\u00100\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00104\u001a\u0002032\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b4\u00105J'\u0010>\u001a\u00020;2\u0006\u00106\u001a\u00020\u00002\u0006\u00108\u001a\u0002072\u0006\u0010:\u001a\u000209H\u0001¢\u0006\u0004\b<\u0010=R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010?\u001a\u0004\b@\u0010\u001cR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010A\u0012\u0004\bC\u0010D\u001a\u0004\bB\u0010\u001eR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010E\u0012\u0004\bG\u0010D\u001a\u0004\bF\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010H\u001a\u0004\bI\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010H\u001a\u0004\bJ\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010H\u001a\u0004\bK\u0010\"R\u0019\u0010\f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\f\u0010H\u001a\u0004\bL\u0010\"R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\r\u0010H\u001a\u0004\bM\u0010\"R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010H\u001a\u0004\bN\u0010\"R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010H\u001a\u0004\bO\u0010\"R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010P\u001a\u0004\bQ\u0010*R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010R\u001a\u0004\bS\u0010,¨\u0006V"}, m65681d2 = {"Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;", "", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", WeeklyPlanApiKt.GOAL, "Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;", "slider", "Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;", "toggles", "", "navigationTitleDisplay", "navigationSubtitleDisplay", "title", "description", "buttonDescriptionDisplay", "continueButtonDisplay", "skipButtonDisplay", "Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverride;", "smartAlarmOverride", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TipContent;", "tipContent", "<init>", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverride;Lcom/whoop/weeklyplan/customizeplan/domain/api/TipContent;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverride;Lcom/whoop/weeklyplan/customizeplan/domain/api/TipContent;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "component2", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;", "component3", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;", "component4", "()Ljava/lang/String;", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverride;", "component12", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/TipContent;", "copy", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverride;Lcom/whoop/weeklyplan/customizeplan/domain/api/TipContent;)Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weekly_plan_release", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "getGoal", "Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;", "getSlider", "getSlider$annotations", "()V", "Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;", "getToggles", "getToggles$annotations", "Ljava/lang/String;", "getNavigationTitleDisplay", "getNavigationSubtitleDisplay", "getTitle", "getDescription", "getButtonDescriptionDisplay", "getContinueButtonDisplay", "getSkipButtonDisplay", "Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverride;", "getSmartAlarmOverride", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TipContent;", "getTipContent", "Companion", "$serializer", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WeeklyPlanCustomizationScreenModel {
    private final String buttonDescriptionDisplay;
    private final String continueButtonDisplay;
    private final String description;
    private final TargetGoalType goal;
    private final String navigationSubtitleDisplay;
    private final String navigationTitleDisplay;
    private final String skipButtonDisplay;
    private final SliderContent slider;
    private final SmartAlarmOverride smartAlarmOverride;
    private final TipContent tipContent;
    private final String title;
    private final ToggleContent toggles;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C10717a(7)), null, null, null, null, null, null, null, null, null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;", "serializer", "()Lwc3/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return WeeklyPlanCustomizationScreenModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WeeklyPlanCustomizationScreenModel(int i13, TargetGoalType targetGoalType, SliderContent sliderContent, ToggleContent toggleContent, String str, String str2, String str3, String str4, String str5, String str6, String str7, SmartAlarmOverride smartAlarmOverride, TipContent tipContent, SerializationConstructorMarker serializationConstructorMarker) {
        if (4095 != (i13 & 4095)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 4095, WeeklyPlanCustomizationScreenModel$$serializer.INSTANCE.getDescriptor());
        }
        this.goal = targetGoalType;
        this.slider = sliderContent;
        this.toggles = toggleContent;
        this.navigationTitleDisplay = str;
        this.navigationSubtitleDisplay = str2;
        this.title = str3;
        this.description = str4;
        this.buttonDescriptionDisplay = str5;
        this.continueButtonDisplay = str6;
        this.skipButtonDisplay = str7;
        this.smartAlarmOverride = smartAlarmOverride;
        this.tipContent = tipContent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return TargetGoalType.INSTANCE.serializer();
    }

    public static /* synthetic */ WeeklyPlanCustomizationScreenModel copy$default(WeeklyPlanCustomizationScreenModel weeklyPlanCustomizationScreenModel, TargetGoalType targetGoalType, SliderContent sliderContent, ToggleContent toggleContent, String str, String str2, String str3, String str4, String str5, String str6, String str7, SmartAlarmOverride smartAlarmOverride, TipContent tipContent, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            targetGoalType = weeklyPlanCustomizationScreenModel.goal;
        }
        if ((i13 & 2) != 0) {
            sliderContent = weeklyPlanCustomizationScreenModel.slider;
        }
        if ((i13 & 4) != 0) {
            toggleContent = weeklyPlanCustomizationScreenModel.toggles;
        }
        if ((i13 & 8) != 0) {
            str = weeklyPlanCustomizationScreenModel.navigationTitleDisplay;
        }
        if ((i13 & 16) != 0) {
            str2 = weeklyPlanCustomizationScreenModel.navigationSubtitleDisplay;
        }
        if ((i13 & 32) != 0) {
            str3 = weeklyPlanCustomizationScreenModel.title;
        }
        if ((i13 & 64) != 0) {
            str4 = weeklyPlanCustomizationScreenModel.description;
        }
        if ((i13 & 128) != 0) {
            str5 = weeklyPlanCustomizationScreenModel.buttonDescriptionDisplay;
        }
        if ((i13 & 256) != 0) {
            str6 = weeklyPlanCustomizationScreenModel.continueButtonDisplay;
        }
        if ((i13 & 512) != 0) {
            str7 = weeklyPlanCustomizationScreenModel.skipButtonDisplay;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            smartAlarmOverride = weeklyPlanCustomizationScreenModel.smartAlarmOverride;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            tipContent = weeklyPlanCustomizationScreenModel.tipContent;
        }
        SmartAlarmOverride smartAlarmOverride2 = smartAlarmOverride;
        TipContent tipContent2 = tipContent;
        String str8 = str6;
        String str9 = str7;
        String str10 = str4;
        String str11 = str5;
        String str12 = str2;
        String str13 = str3;
        return weeklyPlanCustomizationScreenModel.copy(targetGoalType, sliderContent, toggleContent, str, str12, str13, str10, str11, str8, str9, smartAlarmOverride2, tipContent2);
    }

    @InterfaceC37143h("slider_content")
    public static /* synthetic */ void getSlider$annotations() {
    }

    @InterfaceC37143h("toggle_content")
    public static /* synthetic */ void getToggles$annotations() {
    }

    public static final /* synthetic */ void write$Self$weekly_plan_release(WeeklyPlanCustomizationScreenModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) $childSerializers[0].getValue(), self.goal);
        output.encodeNullableSerializableElement(serialDesc, 1, SliderContent$$serializer.INSTANCE, self.slider);
        output.encodeNullableSerializableElement(serialDesc, 2, ToggleContent$$serializer.INSTANCE, self.toggles);
        output.encodeStringElement(serialDesc, 3, self.navigationTitleDisplay);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.navigationSubtitleDisplay);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.title);
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.description);
        output.encodeNullableSerializableElement(serialDesc, 7, stringSerializer, self.buttonDescriptionDisplay);
        output.encodeStringElement(serialDesc, 8, self.continueButtonDisplay);
        output.encodeNullableSerializableElement(serialDesc, 9, stringSerializer, self.skipButtonDisplay);
        output.encodeNullableSerializableElement(serialDesc, 10, SmartAlarmOverride$$serializer.INSTANCE, self.smartAlarmOverride);
        output.encodeNullableSerializableElement(serialDesc, 11, TipContent$$serializer.INSTANCE, self.tipContent);
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
    public final SmartAlarmOverride getSmartAlarmOverride() {
        return this.smartAlarmOverride;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final TipContent getTipContent() {
        return this.tipContent;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SliderContent getSlider() {
        return this.slider;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ToggleContent getToggles() {
        return this.toggles;
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

    public final WeeklyPlanCustomizationScreenModel copy(TargetGoalType goal, SliderContent slider, ToggleContent toggles, String navigationTitleDisplay, String navigationSubtitleDisplay, String title, String description, String buttonDescriptionDisplay, String continueButtonDisplay, String skipButtonDisplay, SmartAlarmOverride smartAlarmOverride, TipContent tipContent) {
        AbstractC22676k.m65750j(goal, "goal");
        AbstractC22676k.m65750j(navigationTitleDisplay, "navigationTitleDisplay");
        AbstractC22676k.m65750j(continueButtonDisplay, "continueButtonDisplay");
        return new WeeklyPlanCustomizationScreenModel(goal, slider, toggles, navigationTitleDisplay, navigationSubtitleDisplay, title, description, buttonDescriptionDisplay, continueButtonDisplay, skipButtonDisplay, smartAlarmOverride, tipContent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeeklyPlanCustomizationScreenModel)) {
            return false;
        }
        WeeklyPlanCustomizationScreenModel weeklyPlanCustomizationScreenModel = (WeeklyPlanCustomizationScreenModel) other;
        return this.goal == weeklyPlanCustomizationScreenModel.goal && AbstractC22676k.m65745e(this.slider, weeklyPlanCustomizationScreenModel.slider) && AbstractC22676k.m65745e(this.toggles, weeklyPlanCustomizationScreenModel.toggles) && AbstractC22676k.m65745e(this.navigationTitleDisplay, weeklyPlanCustomizationScreenModel.navigationTitleDisplay) && AbstractC22676k.m65745e(this.navigationSubtitleDisplay, weeklyPlanCustomizationScreenModel.navigationSubtitleDisplay) && AbstractC22676k.m65745e(this.title, weeklyPlanCustomizationScreenModel.title) && AbstractC22676k.m65745e(this.description, weeklyPlanCustomizationScreenModel.description) && AbstractC22676k.m65745e(this.buttonDescriptionDisplay, weeklyPlanCustomizationScreenModel.buttonDescriptionDisplay) && AbstractC22676k.m65745e(this.continueButtonDisplay, weeklyPlanCustomizationScreenModel.continueButtonDisplay) && AbstractC22676k.m65745e(this.skipButtonDisplay, weeklyPlanCustomizationScreenModel.skipButtonDisplay) && AbstractC22676k.m65745e(this.smartAlarmOverride, weeklyPlanCustomizationScreenModel.smartAlarmOverride) && AbstractC22676k.m65745e(this.tipContent, weeklyPlanCustomizationScreenModel.tipContent);
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

    public final SliderContent getSlider() {
        return this.slider;
    }

    public final SmartAlarmOverride getSmartAlarmOverride() {
        return this.smartAlarmOverride;
    }

    public final TipContent getTipContent() {
        return this.tipContent;
    }

    public final String getTitle() {
        return this.title;
    }

    public final ToggleContent getToggles() {
        return this.toggles;
    }

    public int hashCode() {
        int iHashCode = this.goal.hashCode() * 31;
        SliderContent sliderContent = this.slider;
        int iHashCode2 = (iHashCode + (sliderContent == null ? 0 : sliderContent.hashCode())) * 31;
        ToggleContent toggleContent = this.toggles;
        int iM30450d = AbstractC11266d.m30450d((iHashCode2 + (toggleContent == null ? 0 : toggleContent.hashCode())) * 31, 31, this.navigationTitleDisplay);
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
        SmartAlarmOverride smartAlarmOverride = this.smartAlarmOverride;
        int iHashCode7 = (iHashCode6 + (smartAlarmOverride == null ? 0 : smartAlarmOverride.hashCode())) * 31;
        TipContent tipContent = this.tipContent;
        return iHashCode7 + (tipContent != null ? tipContent.hashCode() : 0);
    }

    public String toString() {
        TargetGoalType targetGoalType = this.goal;
        SliderContent sliderContent = this.slider;
        ToggleContent toggleContent = this.toggles;
        String str = this.navigationTitleDisplay;
        String str2 = this.navigationSubtitleDisplay;
        String str3 = this.title;
        String str4 = this.description;
        String str5 = this.buttonDescriptionDisplay;
        String str6 = this.continueButtonDisplay;
        String str7 = this.skipButtonDisplay;
        SmartAlarmOverride smartAlarmOverride = this.smartAlarmOverride;
        TipContent tipContent = this.tipContent;
        StringBuilder sb4 = new StringBuilder("WeeklyPlanCustomizationScreenModel(goal=");
        sb4.append(targetGoalType);
        sb4.append(", slider=");
        sb4.append(sliderContent);
        sb4.append(", toggles=");
        sb4.append(toggleContent);
        sb4.append(", navigationTitleDisplay=");
        sb4.append(str);
        sb4.append(", navigationSubtitleDisplay=");
        AbstractC11266d.m30444B(sb4, str2, ", title=", str3, ", description=");
        AbstractC11266d.m30444B(sb4, str4, ", buttonDescriptionDisplay=", str5, ", continueButtonDisplay=");
        AbstractC11266d.m30444B(sb4, str6, ", skipButtonDisplay=", str7, ", smartAlarmOverride=");
        sb4.append(smartAlarmOverride);
        sb4.append(", tipContent=");
        sb4.append(tipContent);
        sb4.append(")");
        return sb4.toString();
    }

    public WeeklyPlanCustomizationScreenModel(TargetGoalType goal, SliderContent sliderContent, ToggleContent toggleContent, String navigationTitleDisplay, String str, String str2, String str3, String str4, String continueButtonDisplay, String str5, SmartAlarmOverride smartAlarmOverride, TipContent tipContent) {
        AbstractC22676k.m65750j(goal, "goal");
        AbstractC22676k.m65750j(navigationTitleDisplay, "navigationTitleDisplay");
        AbstractC22676k.m65750j(continueButtonDisplay, "continueButtonDisplay");
        this.goal = goal;
        this.slider = sliderContent;
        this.toggles = toggleContent;
        this.navigationTitleDisplay = navigationTitleDisplay;
        this.navigationSubtitleDisplay = str;
        this.title = str2;
        this.description = str3;
        this.buttonDescriptionDisplay = str4;
        this.continueButtonDisplay = continueButtonDisplay;
        this.skipButtonDisplay = str5;
        this.smartAlarmOverride = smartAlarmOverride;
        this.tipContent = tipContent;
    }
}
