package com.amplitude.android.engagement.types;

import androidx.profileinstaller.ProfileVerifier;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.InterfaceC23457c;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p305lj.C24451r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\b\u0087\b\u0018\u0000 s2\u00020\u0001:\u0002tuBÑ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b!\u0010\"Bß\u0001\b\u0017\u0012\u0006\u0010#\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001e\u0012\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b!\u0010&J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b-\u0010(J\u0012\u0010.\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b8\u00105J\u0010\u00109\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b9\u00105J\u0010\u0010:\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b:\u00105J\u0010\u0010;\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b;\u0010(J\u0010\u0010<\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\b<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b>\u00103J\u0010\u0010?\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b?\u0010(J\u0012\u0010@\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0012\u0010B\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0012\u0010D\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0012\u0010F\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\bF\u0010EJî\u0001\u0010G\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001eHÆ\u0001¢\u0006\u0004\bG\u0010HJ\u0010\u0010I\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bI\u0010(J\u0010\u0010J\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\bJ\u0010*J\u001a\u0010L\u001a\u00020\n2\b\u0010K\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bL\u0010MJ(\u0010T\u001a\u00020S2\u0006\u0010N\u001a\u00020\u00002\u0006\u0010P\u001a\u00020O2\u0006\u0010R\u001a\u00020QHÇ\u0001¢\u0006\u0004\bT\u0010UR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010V\u001a\u0004\bW\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010X\u001a\u0004\bY\u0010*R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010Z\u001a\u0004\b[\u0010,R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010V\u001a\u0004\b\\\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010]\u001a\u0004\b^\u0010/R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010_\u001a\u0004\b`\u00101R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010a\u001a\u0004\bb\u00103R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010c\u001a\u0004\bd\u00105R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010e\u001a\u0004\bf\u00107R\u0017\u0010\u0012\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0012\u0010c\u001a\u0004\b\u0012\u00105R\u0017\u0010\u0013\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0013\u0010c\u001a\u0004\b\u0013\u00105R\u0017\u0010\u0014\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0014\u0010c\u001a\u0004\b\u0014\u00105R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010V\u001a\u0004\bg\u0010(R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010h\u001a\u0004\bi\u0010=R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010a\u001a\u0004\bj\u00103R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010V\u001a\u0004\bk\u0010(R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010l\u001a\u0004\bm\u0010AR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010n\u001a\u0004\bo\u0010CR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010p\u001a\u0004\bq\u0010ER\u0019\u0010 \u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b \u0010p\u001a\u0004\br\u0010E¨\u0006v"}, m65681d2 = {"Lcom/amplitude/android/engagement/types/Nudge;", "", "", "title", "", "variantId", "", "Lcom/amplitude/android/engagement/types/NudgeStep;", "steps", "flagKey", "", "archived", "Lcom/amplitude/android/engagement/types/NudgePosition;", "position", "priority", "showStepCounter", "Lcom/amplitude/android/engagement/types/StepCounterFormat;", "stepCounterFormat", "isCarousel", "isDismissible", "isSnoozable", "snoozeLabel", "Lcom/amplitude/android/engagement/types/NudgeType;", "type", "customThemeId", "variant", "Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;", "lifecycleConfig", "Lcom/amplitude/android/engagement/types/TriggerConfig;", "triggerConfig", "Lcom/amplitude/android/engagement/types/PageTargetingConfig;", "pageTargeting", "temporarilyHideTargeting", "<init>", "(Ljava/lang/String;ILjava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Lcom/amplitude/android/engagement/types/NudgePosition;Ljava/lang/Integer;ZLcom/amplitude/android/engagement/types/StepCounterFormat;ZZZLjava/lang/String;Lcom/amplitude/android/engagement/types/NudgeType;Ljava/lang/Integer;Ljava/lang/String;Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;Lcom/amplitude/android/engagement/types/TriggerConfig;Lcom/amplitude/android/engagement/types/PageTargetingConfig;Lcom/amplitude/android/engagement/types/PageTargetingConfig;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ILjava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Lcom/amplitude/android/engagement/types/NudgePosition;Ljava/lang/Integer;ZLcom/amplitude/android/engagement/types/StepCounterFormat;ZZZLjava/lang/String;Lcom/amplitude/android/engagement/types/NudgeType;Ljava/lang/Integer;Ljava/lang/String;Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;Lcom/amplitude/android/engagement/types/TriggerConfig;Lcom/amplitude/android/engagement/types/PageTargetingConfig;Lcom/amplitude/android/engagement/types/PageTargetingConfig;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "()Ljava/util/List;", "component4", "component5", "()Ljava/lang/Boolean;", "component6", "()Lcom/amplitude/android/engagement/types/NudgePosition;", "component7", "()Ljava/lang/Integer;", "component8", "()Z", "component9", "()Lcom/amplitude/android/engagement/types/StepCounterFormat;", "component10", "component11", "component12", "component13", "component14", "()Lcom/amplitude/android/engagement/types/NudgeType;", "component15", "component16", "component17", "()Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;", "component18", "()Lcom/amplitude/android/engagement/types/TriggerConfig;", "component19", "()Lcom/amplitude/android/engagement/types/PageTargetingConfig;", "component20", "copy", "(Ljava/lang/String;ILjava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Lcom/amplitude/android/engagement/types/NudgePosition;Ljava/lang/Integer;ZLcom/amplitude/android/engagement/types/StepCounterFormat;ZZZLjava/lang/String;Lcom/amplitude/android/engagement/types/NudgeType;Ljava/lang/Integer;Ljava/lang/String;Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;Lcom/amplitude/android/engagement/types/TriggerConfig;Lcom/amplitude/android/engagement/types/PageTargetingConfig;Lcom/amplitude/android/engagement/types/PageTargetingConfig;)Lcom/amplitude/android/engagement/types/Nudge;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lcom/amplitude/android/engagement/types/Nudge;Lzc3/c;Lyc3/g;)V", "Ljava/lang/String;", "getTitle", "I", "getVariantId", "Ljava/util/List;", "getSteps", "getFlagKey", "Ljava/lang/Boolean;", "getArchived", "Lcom/amplitude/android/engagement/types/NudgePosition;", "getPosition", "Ljava/lang/Integer;", "getPriority", "Z", "getShowStepCounter", "Lcom/amplitude/android/engagement/types/StepCounterFormat;", "getStepCounterFormat", "getSnoozeLabel", "Lcom/amplitude/android/engagement/types/NudgeType;", "getType", "getCustomThemeId", "getVariant", "Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;", "getLifecycleConfig", "Lcom/amplitude/android/engagement/types/TriggerConfig;", "getTriggerConfig", "Lcom/amplitude/android/engagement/types/PageTargetingConfig;", "getPageTargeting", "getTemporarilyHideTargeting", "Companion", "$serializer", "com/amplitude/android/engagement/types/q0", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class Nudge {
    public static final int $stable = 8;
    private final Boolean archived;
    private final Integer customThemeId;
    private final String flagKey;
    private final boolean isCarousel;
    private final boolean isDismissible;
    private final boolean isSnoozable;
    private final NudgeLifecycleConfig lifecycleConfig;
    private final PageTargetingConfig pageTargeting;
    private final NudgePosition position;
    private final Integer priority;
    private final boolean showStepCounter;
    private final String snoozeLabel;
    private final StepCounterFormat stepCounterFormat;
    private final List<NudgeStep> steps;
    private final PageTargetingConfig temporarilyHideTargeting;
    private final String title;
    private final TriggerConfig triggerConfig;
    private final NudgeType type;
    private final String variant;
    private final int variantId;
    public static final C4926q0 Companion = new C4926q0();
    private static final InterfaceC37138c[] $childSerializers = {null, null, new ArrayListSerializer(NudgeStep$$serializer.INSTANCE), null, null, NudgePosition.Companion.serializer(), null, null, StepCounterFormat.Companion.serializer(), null, null, null, null, NudgeType.Companion.serializer(), null, null, null, null, null, null};

    @InterfaceC23457c
    public /* synthetic */ Nudge(int i13, String str, int i14, List list, String str2, Boolean bool, NudgePosition nudgePosition, Integer num, boolean z4, StepCounterFormat stepCounterFormat, boolean z13, boolean z14, boolean z15, String str3, NudgeType nudgeType, Integer num2, String str4, NudgeLifecycleConfig nudgeLifecycleConfig, TriggerConfig triggerConfig, PageTargetingConfig pageTargetingConfig, PageTargetingConfig pageTargetingConfig2, SerializationConstructorMarker serializationConstructorMarker) {
        if (48271 != (i13 & 48271)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 48271, Nudge$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.variantId = i14;
        this.steps = list;
        this.flagKey = str2;
        if ((i13 & 16) == 0) {
            this.archived = Boolean.FALSE;
        } else {
            this.archived = bool;
        }
        if ((i13 & 32) == 0) {
            this.position = null;
        } else {
            this.position = nudgePosition;
        }
        if ((i13 & 64) == 0) {
            this.priority = null;
        } else {
            this.priority = num;
        }
        this.showStepCounter = z4;
        if ((i13 & 256) == 0) {
            this.stepCounterFormat = StepCounterFormat.NUMERIC;
        } else {
            this.stepCounterFormat = stepCounterFormat;
        }
        if ((i13 & 512) == 0) {
            this.isCarousel = false;
        } else {
            this.isCarousel = z13;
        }
        this.isDismissible = z14;
        this.isSnoozable = z15;
        this.snoozeLabel = str3;
        this.type = nudgeType;
        if ((i13 & DfuBaseService.ERROR_CONNECTION_MASK) == 0) {
            this.customThemeId = null;
        } else {
            this.customThemeId = num2;
        }
        this.variant = str4;
        if ((65536 & i13) == 0) {
            this.lifecycleConfig = null;
        } else {
            this.lifecycleConfig = nudgeLifecycleConfig;
        }
        if ((131072 & i13) == 0) {
            this.triggerConfig = null;
        } else {
            this.triggerConfig = triggerConfig;
        }
        if ((262144 & i13) == 0) {
            this.pageTargeting = null;
        } else {
            this.pageTargeting = pageTargetingConfig;
        }
        if ((i13 & 524288) == 0) {
            this.temporarilyHideTargeting = null;
        } else {
            this.temporarilyHideTargeting = pageTargetingConfig2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Nudge copy$default(Nudge nudge, String str, int i13, List list, String str2, Boolean bool, NudgePosition nudgePosition, Integer num, boolean z4, StepCounterFormat stepCounterFormat, boolean z13, boolean z14, boolean z15, String str3, NudgeType nudgeType, Integer num2, String str4, NudgeLifecycleConfig nudgeLifecycleConfig, TriggerConfig triggerConfig, PageTargetingConfig pageTargetingConfig, PageTargetingConfig pageTargetingConfig2, int i14, Object obj) {
        PageTargetingConfig pageTargetingConfig3;
        PageTargetingConfig pageTargetingConfig4;
        String str5 = (i14 & 1) != 0 ? nudge.title : str;
        int i15 = (i14 & 2) != 0 ? nudge.variantId : i13;
        List list2 = (i14 & 4) != 0 ? nudge.steps : list;
        String str6 = (i14 & 8) != 0 ? nudge.flagKey : str2;
        Boolean bool2 = (i14 & 16) != 0 ? nudge.archived : bool;
        NudgePosition nudgePosition2 = (i14 & 32) != 0 ? nudge.position : nudgePosition;
        Integer num3 = (i14 & 64) != 0 ? nudge.priority : num;
        boolean z16 = (i14 & 128) != 0 ? nudge.showStepCounter : z4;
        StepCounterFormat stepCounterFormat2 = (i14 & 256) != 0 ? nudge.stepCounterFormat : stepCounterFormat;
        boolean z17 = (i14 & 512) != 0 ? nudge.isCarousel : z13;
        boolean z18 = (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? nudge.isDismissible : z14;
        boolean z19 = (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? nudge.isSnoozable : z15;
        String str7 = (i14 & 4096) != 0 ? nudge.snoozeLabel : str3;
        NudgeType nudgeType2 = (i14 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? nudge.type : nudgeType;
        String str8 = str5;
        Integer num4 = (i14 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? nudge.customThemeId : num2;
        String str9 = (i14 & 32768) != 0 ? nudge.variant : str4;
        NudgeLifecycleConfig nudgeLifecycleConfig2 = (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? nudge.lifecycleConfig : nudgeLifecycleConfig;
        TriggerConfig triggerConfig2 = (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? nudge.triggerConfig : triggerConfig;
        PageTargetingConfig pageTargetingConfig5 = (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? nudge.pageTargeting : pageTargetingConfig;
        if ((i14 & 524288) != 0) {
            pageTargetingConfig4 = pageTargetingConfig5;
            pageTargetingConfig3 = nudge.temporarilyHideTargeting;
        } else {
            pageTargetingConfig3 = pageTargetingConfig2;
            pageTargetingConfig4 = pageTargetingConfig5;
        }
        return nudge.copy(str8, i15, list2, str6, bool2, nudgePosition2, num3, z16, stepCounterFormat2, z17, z18, z19, str7, nudgeType2, num4, str9, nudgeLifecycleConfig2, triggerConfig2, pageTargetingConfig4, pageTargetingConfig3);
    }

    public static final /* synthetic */ void write$Self(Nudge self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC37138c[] interfaceC37138cArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeIntElement(serialDesc, 1, self.variantId);
        output.encodeSerializableElement(serialDesc, 2, interfaceC37138cArr[2], self.steps);
        output.encodeStringElement(serialDesc, 3, self.flagKey);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !AbstractC22676k.m65745e(self.archived, Boolean.FALSE)) {
            output.encodeNullableSerializableElement(serialDesc, 4, BooleanSerializer.INSTANCE, self.archived);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.position != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, interfaceC37138cArr[5], self.position);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.priority != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, IntSerializer.INSTANCE, self.priority);
        }
        output.encodeBooleanElement(serialDesc, 7, self.showStepCounter);
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.stepCounterFormat != StepCounterFormat.NUMERIC) {
            output.encodeSerializableElement(serialDesc, 8, interfaceC37138cArr[8], self.stepCounterFormat);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.isCarousel) {
            output.encodeBooleanElement(serialDesc, 9, self.isCarousel);
        }
        output.encodeBooleanElement(serialDesc, 10, self.isDismissible);
        output.encodeBooleanElement(serialDesc, 11, self.isSnoozable);
        output.encodeStringElement(serialDesc, 12, self.snoozeLabel);
        output.encodeSerializableElement(serialDesc, 13, interfaceC37138cArr[13], self.type);
        if (output.shouldEncodeElementDefault(serialDesc, 14) || self.customThemeId != null) {
            output.encodeNullableSerializableElement(serialDesc, 14, IntSerializer.INSTANCE, self.customThemeId);
        }
        output.encodeStringElement(serialDesc, 15, self.variant);
        if (output.shouldEncodeElementDefault(serialDesc, 16) || self.lifecycleConfig != null) {
            output.encodeNullableSerializableElement(serialDesc, 16, NudgeLifecycleConfig$$serializer.INSTANCE, self.lifecycleConfig);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 17) || self.triggerConfig != null) {
            output.encodeNullableSerializableElement(serialDesc, 17, C24451r0.f95330a, self.triggerConfig);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 18) || self.pageTargeting != null) {
            output.encodeNullableSerializableElement(serialDesc, 18, PageTargetingConfig$$serializer.INSTANCE, self.pageTargeting);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 19) && self.temporarilyHideTargeting == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 19, PageTargetingConfig$$serializer.INSTANCE, self.temporarilyHideTargeting);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getIsCarousel() {
        return this.isCarousel;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getIsDismissible() {
        return this.isDismissible;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getIsSnoozable() {
        return this.isSnoozable;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getSnoozeLabel() {
        return this.snoozeLabel;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final NudgeType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Integer getCustomThemeId() {
        return this.customThemeId;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getVariant() {
        return this.variant;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final NudgeLifecycleConfig getLifecycleConfig() {
        return this.lifecycleConfig;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final TriggerConfig getTriggerConfig() {
        return this.triggerConfig;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final PageTargetingConfig getPageTargeting() {
        return this.pageTargeting;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getVariantId() {
        return this.variantId;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final PageTargetingConfig getTemporarilyHideTargeting() {
        return this.temporarilyHideTargeting;
    }

    public final List<NudgeStep> component3() {
        return this.steps;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFlagKey() {
        return this.flagKey;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getArchived() {
        return this.archived;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final NudgePosition getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getPriority() {
        return this.priority;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getShowStepCounter() {
        return this.showStepCounter;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final StepCounterFormat getStepCounterFormat() {
        return this.stepCounterFormat;
    }

    public final Nudge copy(String title, int variantId, List<NudgeStep> steps, String flagKey, Boolean archived, NudgePosition position, Integer priority, boolean showStepCounter, StepCounterFormat stepCounterFormat, boolean isCarousel, boolean isDismissible, boolean isSnoozable, String snoozeLabel, NudgeType type, Integer customThemeId, String variant, NudgeLifecycleConfig lifecycleConfig, TriggerConfig triggerConfig, PageTargetingConfig pageTargeting, PageTargetingConfig temporarilyHideTargeting) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(steps, "steps");
        AbstractC22676k.m65750j(flagKey, "flagKey");
        AbstractC22676k.m65750j(stepCounterFormat, "stepCounterFormat");
        AbstractC22676k.m65750j(snoozeLabel, "snoozeLabel");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(variant, "variant");
        return new Nudge(title, variantId, steps, flagKey, archived, position, priority, showStepCounter, stepCounterFormat, isCarousel, isDismissible, isSnoozable, snoozeLabel, type, customThemeId, variant, lifecycleConfig, triggerConfig, pageTargeting, temporarilyHideTargeting);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Nudge)) {
            return false;
        }
        Nudge nudge = (Nudge) other;
        return AbstractC22676k.m65745e(this.title, nudge.title) && this.variantId == nudge.variantId && AbstractC22676k.m65745e(this.steps, nudge.steps) && AbstractC22676k.m65745e(this.flagKey, nudge.flagKey) && AbstractC22676k.m65745e(this.archived, nudge.archived) && this.position == nudge.position && AbstractC22676k.m65745e(this.priority, nudge.priority) && this.showStepCounter == nudge.showStepCounter && this.stepCounterFormat == nudge.stepCounterFormat && this.isCarousel == nudge.isCarousel && this.isDismissible == nudge.isDismissible && this.isSnoozable == nudge.isSnoozable && AbstractC22676k.m65745e(this.snoozeLabel, nudge.snoozeLabel) && this.type == nudge.type && AbstractC22676k.m65745e(this.customThemeId, nudge.customThemeId) && AbstractC22676k.m65745e(this.variant, nudge.variant) && AbstractC22676k.m65745e(this.lifecycleConfig, nudge.lifecycleConfig) && AbstractC22676k.m65745e(this.triggerConfig, nudge.triggerConfig) && AbstractC22676k.m65745e(this.pageTargeting, nudge.pageTargeting) && AbstractC22676k.m65745e(this.temporarilyHideTargeting, nudge.temporarilyHideTargeting);
    }

    public final Boolean getArchived() {
        return this.archived;
    }

    public final Integer getCustomThemeId() {
        return this.customThemeId;
    }

    public final String getFlagKey() {
        return this.flagKey;
    }

    public final NudgeLifecycleConfig getLifecycleConfig() {
        return this.lifecycleConfig;
    }

    public final PageTargetingConfig getPageTargeting() {
        return this.pageTargeting;
    }

    public final NudgePosition getPosition() {
        return this.position;
    }

    public final Integer getPriority() {
        return this.priority;
    }

    public final boolean getShowStepCounter() {
        return this.showStepCounter;
    }

    public final String getSnoozeLabel() {
        return this.snoozeLabel;
    }

    public final StepCounterFormat getStepCounterFormat() {
        return this.stepCounterFormat;
    }

    public final List<NudgeStep> getSteps() {
        return this.steps;
    }

    public final PageTargetingConfig getTemporarilyHideTargeting() {
        return this.temporarilyHideTargeting;
    }

    public final String getTitle() {
        return this.title;
    }

    public final TriggerConfig getTriggerConfig() {
        return this.triggerConfig;
    }

    public final NudgeType getType() {
        return this.type;
    }

    public final String getVariant() {
        return this.variant;
    }

    public final int getVariantId() {
        return this.variantId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v17, types: [int] */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r2v13, types: [int] */
    /* JADX WARN: Type inference failed for: r2v18, types: [int] */
    /* JADX WARN: Type inference failed for: r2v20, types: [int] */
    /* JADX WARN: Type inference failed for: r2v22, types: [int] */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11895b.m31983b(AbstractC11266d.m30448b(this.variantId, this.title.hashCode() * 31, 31), 31, this.steps), 31, this.flagKey);
        Boolean bool = this.archived;
        int iHashCode = (iM30450d + (bool == null ? 0 : bool.hashCode())) * 31;
        NudgePosition nudgePosition = this.position;
        int iHashCode2 = (iHashCode + (nudgePosition == null ? 0 : nudgePosition.hashCode())) * 31;
        Integer num = this.priority;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z4 = this.showStepCounter;
        ?? r10 = z4;
        if (z4) {
            r10 = 1;
        }
        int iHashCode4 = (this.stepCounterFormat.hashCode() + ((iHashCode3 + r10) * 31)) * 31;
        boolean z13 = this.isCarousel;
        ?? r14 = z13;
        if (z13) {
            r14 = 1;
        }
        int i13 = (iHashCode4 + r14) * 31;
        boolean z14 = this.isDismissible;
        ?? r15 = z14;
        if (z14) {
            r15 = 1;
        }
        int i14 = (i13 + r15) * 31;
        boolean z15 = this.isSnoozable;
        int iHashCode5 = (this.type.hashCode() + AbstractC11266d.m30450d((i14 + (z15 ? 1 : z15)) * 31, 31, this.snoozeLabel)) * 31;
        Integer num2 = this.customThemeId;
        int iM30450d2 = AbstractC11266d.m30450d((iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.variant);
        NudgeLifecycleConfig nudgeLifecycleConfig = this.lifecycleConfig;
        int iHashCode6 = (iM30450d2 + (nudgeLifecycleConfig == null ? 0 : nudgeLifecycleConfig.hashCode())) * 31;
        TriggerConfig triggerConfig = this.triggerConfig;
        int iHashCode7 = (iHashCode6 + (triggerConfig == null ? 0 : triggerConfig.hashCode())) * 31;
        PageTargetingConfig pageTargetingConfig = this.pageTargeting;
        int iHashCode8 = (iHashCode7 + (pageTargetingConfig == null ? 0 : pageTargetingConfig.hashCode())) * 31;
        PageTargetingConfig pageTargetingConfig2 = this.temporarilyHideTargeting;
        return iHashCode8 + (pageTargetingConfig2 != null ? pageTargetingConfig2.hashCode() : 0);
    }

    public final boolean isCarousel() {
        return this.isCarousel;
    }

    public final boolean isDismissible() {
        return this.isDismissible;
    }

    public final boolean isSnoozable() {
        return this.isSnoozable;
    }

    public String toString() {
        return "Nudge(title=" + this.title + ", variantId=" + this.variantId + ", steps=" + this.steps + ", flagKey=" + this.flagKey + ", archived=" + this.archived + ", position=" + this.position + ", priority=" + this.priority + ", showStepCounter=" + this.showStepCounter + ", stepCounterFormat=" + this.stepCounterFormat + ", isCarousel=" + this.isCarousel + ", isDismissible=" + this.isDismissible + ", isSnoozable=" + this.isSnoozable + ", snoozeLabel=" + this.snoozeLabel + ", type=" + this.type + ", customThemeId=" + this.customThemeId + ", variant=" + this.variant + ", lifecycleConfig=" + this.lifecycleConfig + ", triggerConfig=" + this.triggerConfig + ", pageTargeting=" + this.pageTargeting + ", temporarilyHideTargeting=" + this.temporarilyHideTargeting + ')';
    }

    public Nudge(String title, int i13, List<NudgeStep> steps, String flagKey, Boolean bool, NudgePosition nudgePosition, Integer num, boolean z4, StepCounterFormat stepCounterFormat, boolean z13, boolean z14, boolean z15, String snoozeLabel, NudgeType type, Integer num2, String variant, NudgeLifecycleConfig nudgeLifecycleConfig, TriggerConfig triggerConfig, PageTargetingConfig pageTargetingConfig, PageTargetingConfig pageTargetingConfig2) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(steps, "steps");
        AbstractC22676k.m65750j(flagKey, "flagKey");
        AbstractC22676k.m65750j(stepCounterFormat, "stepCounterFormat");
        AbstractC22676k.m65750j(snoozeLabel, "snoozeLabel");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(variant, "variant");
        this.title = title;
        this.variantId = i13;
        this.steps = steps;
        this.flagKey = flagKey;
        this.archived = bool;
        this.position = nudgePosition;
        this.priority = num;
        this.showStepCounter = z4;
        this.stepCounterFormat = stepCounterFormat;
        this.isCarousel = z13;
        this.isDismissible = z14;
        this.isSnoozable = z15;
        this.snoozeLabel = snoozeLabel;
        this.type = type;
        this.customThemeId = num2;
        this.variant = variant;
        this.lifecycleConfig = nudgeLifecycleConfig;
        this.triggerConfig = triggerConfig;
        this.pageTargeting = pageTargetingConfig;
        this.temporarilyHideTargeting = pageTargetingConfig2;
    }

    public /* synthetic */ Nudge(String str, int i13, List list, String str2, Boolean bool, NudgePosition nudgePosition, Integer num, boolean z4, StepCounterFormat stepCounterFormat, boolean z13, boolean z14, boolean z15, String str3, NudgeType nudgeType, Integer num2, String str4, NudgeLifecycleConfig nudgeLifecycleConfig, TriggerConfig triggerConfig, PageTargetingConfig pageTargetingConfig, PageTargetingConfig pageTargetingConfig2, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, list, str2, (i14 & 16) != 0 ? Boolean.FALSE : bool, (i14 & 32) != 0 ? null : nudgePosition, (i14 & 64) != 0 ? null : num, z4, (i14 & 256) != 0 ? StepCounterFormat.NUMERIC : stepCounterFormat, (i14 & 512) != 0 ? false : z13, z14, z15, str3, nudgeType, (i14 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : num2, str4, (65536 & i14) != 0 ? null : nudgeLifecycleConfig, (131072 & i14) != 0 ? null : triggerConfig, (262144 & i14) != 0 ? null : pageTargetingConfig, (i14 & 524288) != 0 ? null : pageTargetingConfig2);
    }
}
