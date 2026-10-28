package com.amplitude.android.engagement.types;

import androidx.profileinstaller.ProfileVerifier;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.InterfaceC23457c;
import live.hms.video.media.tracks.HMSTrackSource;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u0000 d2\u00020\u0001:\u0002efB§\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\n\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dB¹\u0001\b\u0017\u0012\u0006\u0010\u001e\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\n\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001c\u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b,\u0010+J\u0010\u0010-\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b-\u0010+J\u0010\u0010.\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b.\u0010+J\u0010\u0010/\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b/\u0010+J\u0010\u00100\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b0\u0010+J\u0010\u00101\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b1\u0010+J\u0010\u00102\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b2\u0010+J\u0010\u00103\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b3\u0010+J\u0012\u00104\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b6\u00105J\u0010\u00107\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b7\u0010+J\u0010\u00108\u001a\u00020\u0018HÆ\u0003¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u001aHÆ\u0003¢\u0006\u0004\b:\u0010;JÌ\u0001\u0010<\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001aHÆ\u0001¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b>\u00109J\u0010\u0010?\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b?\u0010)J\u001a\u0010A\u001a\u00020\n2\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bA\u0010BJ(\u0010I\u001a\u00020H2\u0006\u0010C\u001a\u00020\u00002\u0006\u0010E\u001a\u00020D2\u0006\u0010G\u001a\u00020FHÇ\u0001¢\u0006\u0004\bI\u0010JR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010K\u001a\u0004\bL\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010M\u001a\u0004\bN\u0010%R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010O\u001a\u0004\bP\u0010'R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010Q\u001a\u0004\bR\u0010)R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010S\u001a\u0004\bT\u0010+R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u0010S\u001a\u0004\bU\u0010+R\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\r\u0010S\u001a\u0004\bV\u0010+R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000e\u0010S\u001a\u0004\bW\u0010+R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010S\u001a\u0004\bX\u0010+R\u0017\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010S\u001a\u0004\bY\u0010+R\u0017\u0010\u0011\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0011\u0010S\u001a\u0004\bZ\u0010+R\u0017\u0010\u0012\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0012\u0010S\u001a\u0004\b\u0012\u0010+R\u0017\u0010\u0013\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0013\u0010S\u001a\u0004\b[\u0010+R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\\\u001a\u0004\b]\u00105R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010\\\u001a\u0004\b^\u00105R\u0017\u0010\u0017\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0017\u0010S\u001a\u0004\b_\u0010+R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010`\u001a\u0004\ba\u00109R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010b\u001a\u0004\bc\u0010;¨\u0006g"}, m65681d2 = {"Lcom/amplitude/android/engagement/types/SimulationContext;", "", "Lcom/amplitude/android/engagement/types/TriggerEvent;", "lastTriggerEvent", "Lcom/amplitude/android/engagement/types/Nudge;", "simulatedNudge", "Lcom/amplitude/android/engagement/types/LastEvent;", "lastEvent", "", "currentStepIndex", "", "passesCooldown", "passesSnoozedConditions", "passesPageTargeting", "passesPinnedElement", "shouldTemporarilyHide", "passesTriggerMatch", "passesClickedElement", "isAnchorableStep", "passesCustomThrottles", "Lcom/amplitude/android/engagement/types/ThrottleLimit;", "surveyThrottleLimit", "guideThrottleLimit", "bypassCustomThrottles", "", HMSTrackSource.SCREEN, "Lcom/amplitude/android/engagement/types/EndUser;", "endUser", "<init>", "(Lcom/amplitude/android/engagement/types/TriggerEvent;Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/LastEvent;IZZZZZZZZZLcom/amplitude/android/engagement/types/ThrottleLimit;Lcom/amplitude/android/engagement/types/ThrottleLimit;ZLjava/lang/String;Lcom/amplitude/android/engagement/types/EndUser;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/amplitude/android/engagement/types/TriggerEvent;Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/LastEvent;IZZZZZZZZZLcom/amplitude/android/engagement/types/ThrottleLimit;Lcom/amplitude/android/engagement/types/ThrottleLimit;ZLjava/lang/String;Lcom/amplitude/android/engagement/types/EndUser;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/amplitude/android/engagement/types/TriggerEvent;", "component2", "()Lcom/amplitude/android/engagement/types/Nudge;", "component3", "()Lcom/amplitude/android/engagement/types/LastEvent;", "component4", "()I", "component5", "()Z", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "()Lcom/amplitude/android/engagement/types/ThrottleLimit;", "component15", "component16", "component17", "()Ljava/lang/String;", "component18", "()Lcom/amplitude/android/engagement/types/EndUser;", "copy", "(Lcom/amplitude/android/engagement/types/TriggerEvent;Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/LastEvent;IZZZZZZZZZLcom/amplitude/android/engagement/types/ThrottleLimit;Lcom/amplitude/android/engagement/types/ThrottleLimit;ZLjava/lang/String;Lcom/amplitude/android/engagement/types/EndUser;)Lcom/amplitude/android/engagement/types/SimulationContext;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lcom/amplitude/android/engagement/types/SimulationContext;Lzc3/c;Lyc3/g;)V", "Lcom/amplitude/android/engagement/types/TriggerEvent;", "getLastTriggerEvent", "Lcom/amplitude/android/engagement/types/Nudge;", "getSimulatedNudge", "Lcom/amplitude/android/engagement/types/LastEvent;", "getLastEvent", "I", "getCurrentStepIndex", "Z", "getPassesCooldown", "getPassesSnoozedConditions", "getPassesPageTargeting", "getPassesPinnedElement", "getShouldTemporarilyHide", "getPassesTriggerMatch", "getPassesClickedElement", "getPassesCustomThrottles", "Lcom/amplitude/android/engagement/types/ThrottleLimit;", "getSurveyThrottleLimit", "getGuideThrottleLimit", "getBypassCustomThrottles", "Ljava/lang/String;", "getScreen", "Lcom/amplitude/android/engagement/types/EndUser;", "getEndUser", "Companion", "$serializer", "com/amplitude/android/engagement/types/e1", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SimulationContext {
    public static final int $stable = 8;
    public static final C4882e1 Companion = new C4882e1();
    private final boolean bypassCustomThrottles;
    private final int currentStepIndex;
    private final EndUser endUser;
    private final ThrottleLimit guideThrottleLimit;
    private final boolean isAnchorableStep;
    private final LastEvent lastEvent;
    private final TriggerEvent lastTriggerEvent;
    private final boolean passesClickedElement;
    private final boolean passesCooldown;
    private final boolean passesCustomThrottles;
    private final boolean passesPageTargeting;
    private final boolean passesPinnedElement;
    private final boolean passesSnoozedConditions;
    private final boolean passesTriggerMatch;
    private final String screen;
    private final boolean shouldTemporarilyHide;
    private final Nudge simulatedNudge;
    private final ThrottleLimit surveyThrottleLimit;

    @InterfaceC23457c
    public /* synthetic */ SimulationContext(int i13, TriggerEvent triggerEvent, Nudge nudge, LastEvent lastEvent, int i14, boolean z4, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, ThrottleLimit throttleLimit, ThrottleLimit throttleLimit2, boolean z25, String str, EndUser endUser, SerializationConstructorMarker serializationConstructorMarker) {
        if (237562 != (i13 & 237562)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 237562, SimulationContext$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.lastTriggerEvent = null;
        } else {
            this.lastTriggerEvent = triggerEvent;
        }
        this.simulatedNudge = nudge;
        if ((i13 & 4) == 0) {
            this.lastEvent = null;
        } else {
            this.lastEvent = lastEvent;
        }
        this.currentStepIndex = i14;
        this.passesCooldown = z4;
        this.passesSnoozedConditions = z13;
        this.passesPageTargeting = z14;
        this.passesPinnedElement = z15;
        this.shouldTemporarilyHide = z16;
        this.passesTriggerMatch = z17;
        this.passesClickedElement = z18;
        this.isAnchorableStep = z19;
        this.passesCustomThrottles = z24;
        if ((i13 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
            this.surveyThrottleLimit = null;
        } else {
            this.surveyThrottleLimit = throttleLimit;
        }
        if ((i13 & DfuBaseService.ERROR_CONNECTION_MASK) == 0) {
            this.guideThrottleLimit = null;
        } else {
            this.guideThrottleLimit = throttleLimit2;
        }
        this.bypassCustomThrottles = z25;
        this.screen = str;
        this.endUser = endUser;
    }

    public static /* synthetic */ SimulationContext copy$default(SimulationContext simulationContext, TriggerEvent triggerEvent, Nudge nudge, LastEvent lastEvent, int i13, boolean z4, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, ThrottleLimit throttleLimit, ThrottleLimit throttleLimit2, boolean z25, String str, EndUser endUser, int i14, Object obj) {
        EndUser endUser2;
        String str2;
        TriggerEvent triggerEvent2 = (i14 & 1) != 0 ? simulationContext.lastTriggerEvent : triggerEvent;
        Nudge nudge2 = (i14 & 2) != 0 ? simulationContext.simulatedNudge : nudge;
        LastEvent lastEvent2 = (i14 & 4) != 0 ? simulationContext.lastEvent : lastEvent;
        int i15 = (i14 & 8) != 0 ? simulationContext.currentStepIndex : i13;
        boolean z26 = (i14 & 16) != 0 ? simulationContext.passesCooldown : z4;
        boolean z27 = (i14 & 32) != 0 ? simulationContext.passesSnoozedConditions : z13;
        boolean z28 = (i14 & 64) != 0 ? simulationContext.passesPageTargeting : z14;
        boolean z29 = (i14 & 128) != 0 ? simulationContext.passesPinnedElement : z15;
        boolean z34 = (i14 & 256) != 0 ? simulationContext.shouldTemporarilyHide : z16;
        boolean z35 = (i14 & 512) != 0 ? simulationContext.passesTriggerMatch : z17;
        boolean z36 = (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? simulationContext.passesClickedElement : z18;
        boolean z37 = (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? simulationContext.isAnchorableStep : z19;
        boolean z38 = (i14 & 4096) != 0 ? simulationContext.passesCustomThrottles : z24;
        ThrottleLimit throttleLimit3 = (i14 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? simulationContext.surveyThrottleLimit : throttleLimit;
        TriggerEvent triggerEvent3 = triggerEvent2;
        ThrottleLimit throttleLimit4 = (i14 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? simulationContext.guideThrottleLimit : throttleLimit2;
        boolean z39 = (i14 & 32768) != 0 ? simulationContext.bypassCustomThrottles : z25;
        String str3 = (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? simulationContext.screen : str;
        if ((i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0) {
            str2 = str3;
            endUser2 = simulationContext.endUser;
        } else {
            endUser2 = endUser;
            str2 = str3;
        }
        return simulationContext.copy(triggerEvent3, nudge2, lastEvent2, i15, z26, z27, z28, z29, z34, z35, z36, z37, z38, throttleLimit3, throttleLimit4, z39, str2, endUser2);
    }

    public static final /* synthetic */ void write$Self(SimulationContext self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.lastTriggerEvent != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, TriggerEvent$$serializer.INSTANCE, self.lastTriggerEvent);
        }
        output.encodeSerializableElement(serialDesc, 1, Nudge$$serializer.INSTANCE, self.simulatedNudge);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.lastEvent != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, LastEvent$$serializer.INSTANCE, self.lastEvent);
        }
        output.encodeIntElement(serialDesc, 3, self.currentStepIndex);
        output.encodeBooleanElement(serialDesc, 4, self.passesCooldown);
        output.encodeBooleanElement(serialDesc, 5, self.passesSnoozedConditions);
        output.encodeBooleanElement(serialDesc, 6, self.passesPageTargeting);
        output.encodeBooleanElement(serialDesc, 7, self.passesPinnedElement);
        output.encodeBooleanElement(serialDesc, 8, self.shouldTemporarilyHide);
        output.encodeBooleanElement(serialDesc, 9, self.passesTriggerMatch);
        output.encodeBooleanElement(serialDesc, 10, self.passesClickedElement);
        output.encodeBooleanElement(serialDesc, 11, self.isAnchorableStep);
        output.encodeBooleanElement(serialDesc, 12, self.passesCustomThrottles);
        if (output.shouldEncodeElementDefault(serialDesc, 13) || self.surveyThrottleLimit != null) {
            output.encodeNullableSerializableElement(serialDesc, 13, ThrottleLimit$$serializer.INSTANCE, self.surveyThrottleLimit);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 14) || self.guideThrottleLimit != null) {
            output.encodeNullableSerializableElement(serialDesc, 14, ThrottleLimit$$serializer.INSTANCE, self.guideThrottleLimit);
        }
        output.encodeBooleanElement(serialDesc, 15, self.bypassCustomThrottles);
        output.encodeStringElement(serialDesc, 16, self.screen);
        output.encodeSerializableElement(serialDesc, 17, EndUser$$serializer.INSTANCE, self.endUser);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TriggerEvent getLastTriggerEvent() {
        return this.lastTriggerEvent;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getPassesTriggerMatch() {
        return this.passesTriggerMatch;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getPassesClickedElement() {
        return this.passesClickedElement;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getIsAnchorableStep() {
        return this.isAnchorableStep;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getPassesCustomThrottles() {
        return this.passesCustomThrottles;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final ThrottleLimit getSurveyThrottleLimit() {
        return this.surveyThrottleLimit;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final ThrottleLimit getGuideThrottleLimit() {
        return this.guideThrottleLimit;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final boolean getBypassCustomThrottles() {
        return this.bypassCustomThrottles;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getScreen() {
        return this.screen;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final EndUser getEndUser() {
        return this.endUser;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Nudge getSimulatedNudge() {
        return this.simulatedNudge;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final LastEvent getLastEvent() {
        return this.lastEvent;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getCurrentStepIndex() {
        return this.currentStepIndex;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getPassesCooldown() {
        return this.passesCooldown;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getPassesSnoozedConditions() {
        return this.passesSnoozedConditions;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getPassesPageTargeting() {
        return this.passesPageTargeting;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getPassesPinnedElement() {
        return this.passesPinnedElement;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getShouldTemporarilyHide() {
        return this.shouldTemporarilyHide;
    }

    public final SimulationContext copy(TriggerEvent lastTriggerEvent, Nudge simulatedNudge, LastEvent lastEvent, int currentStepIndex, boolean passesCooldown, boolean passesSnoozedConditions, boolean passesPageTargeting, boolean passesPinnedElement, boolean shouldTemporarilyHide, boolean passesTriggerMatch, boolean passesClickedElement, boolean isAnchorableStep, boolean passesCustomThrottles, ThrottleLimit surveyThrottleLimit, ThrottleLimit guideThrottleLimit, boolean bypassCustomThrottles, String screen, EndUser endUser) {
        AbstractC22676k.m65750j(simulatedNudge, "simulatedNudge");
        AbstractC22676k.m65750j(screen, "screen");
        AbstractC22676k.m65750j(endUser, "endUser");
        return new SimulationContext(lastTriggerEvent, simulatedNudge, lastEvent, currentStepIndex, passesCooldown, passesSnoozedConditions, passesPageTargeting, passesPinnedElement, shouldTemporarilyHide, passesTriggerMatch, passesClickedElement, isAnchorableStep, passesCustomThrottles, surveyThrottleLimit, guideThrottleLimit, bypassCustomThrottles, screen, endUser);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SimulationContext)) {
            return false;
        }
        SimulationContext simulationContext = (SimulationContext) other;
        return AbstractC22676k.m65745e(this.lastTriggerEvent, simulationContext.lastTriggerEvent) && AbstractC22676k.m65745e(this.simulatedNudge, simulationContext.simulatedNudge) && AbstractC22676k.m65745e(this.lastEvent, simulationContext.lastEvent) && this.currentStepIndex == simulationContext.currentStepIndex && this.passesCooldown == simulationContext.passesCooldown && this.passesSnoozedConditions == simulationContext.passesSnoozedConditions && this.passesPageTargeting == simulationContext.passesPageTargeting && this.passesPinnedElement == simulationContext.passesPinnedElement && this.shouldTemporarilyHide == simulationContext.shouldTemporarilyHide && this.passesTriggerMatch == simulationContext.passesTriggerMatch && this.passesClickedElement == simulationContext.passesClickedElement && this.isAnchorableStep == simulationContext.isAnchorableStep && this.passesCustomThrottles == simulationContext.passesCustomThrottles && AbstractC22676k.m65745e(this.surveyThrottleLimit, simulationContext.surveyThrottleLimit) && AbstractC22676k.m65745e(this.guideThrottleLimit, simulationContext.guideThrottleLimit) && this.bypassCustomThrottles == simulationContext.bypassCustomThrottles && AbstractC22676k.m65745e(this.screen, simulationContext.screen) && AbstractC22676k.m65745e(this.endUser, simulationContext.endUser);
    }

    public final boolean getBypassCustomThrottles() {
        return this.bypassCustomThrottles;
    }

    public final int getCurrentStepIndex() {
        return this.currentStepIndex;
    }

    public final EndUser getEndUser() {
        return this.endUser;
    }

    public final ThrottleLimit getGuideThrottleLimit() {
        return this.guideThrottleLimit;
    }

    public final LastEvent getLastEvent() {
        return this.lastEvent;
    }

    public final TriggerEvent getLastTriggerEvent() {
        return this.lastTriggerEvent;
    }

    public final boolean getPassesClickedElement() {
        return this.passesClickedElement;
    }

    public final boolean getPassesCooldown() {
        return this.passesCooldown;
    }

    public final boolean getPassesCustomThrottles() {
        return this.passesCustomThrottles;
    }

    public final boolean getPassesPageTargeting() {
        return this.passesPageTargeting;
    }

    public final boolean getPassesPinnedElement() {
        return this.passesPinnedElement;
    }

    public final boolean getPassesSnoozedConditions() {
        return this.passesSnoozedConditions;
    }

    public final boolean getPassesTriggerMatch() {
        return this.passesTriggerMatch;
    }

    public final String getScreen() {
        return this.screen;
    }

    public final boolean getShouldTemporarilyHide() {
        return this.shouldTemporarilyHide;
    }

    public final Nudge getSimulatedNudge() {
        return this.simulatedNudge;
    }

    public final ThrottleLimit getSurveyThrottleLimit() {
        return this.surveyThrottleLimit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [int] */
    /* JADX WARN: Type inference failed for: r3v11, types: [int] */
    /* JADX WARN: Type inference failed for: r3v13, types: [int] */
    /* JADX WARN: Type inference failed for: r3v15, types: [int] */
    /* JADX WARN: Type inference failed for: r3v17, types: [int] */
    /* JADX WARN: Type inference failed for: r3v19, types: [int] */
    /* JADX WARN: Type inference failed for: r3v21, types: [int] */
    /* JADX WARN: Type inference failed for: r3v23, types: [int] */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v7, types: [int] */
    /* JADX WARN: Type inference failed for: r3v9, types: [int] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public int hashCode() {
        TriggerEvent triggerEvent = this.lastTriggerEvent;
        int iHashCode = (this.simulatedNudge.hashCode() + ((triggerEvent == null ? 0 : triggerEvent.hashCode()) * 31)) * 31;
        LastEvent lastEvent = this.lastEvent;
        int iM30448b = AbstractC11266d.m30448b(this.currentStepIndex, (iHashCode + (lastEvent == null ? 0 : lastEvent.hashCode())) * 31, 31);
        boolean z4 = this.passesCooldown;
        ?? r10 = z4;
        if (z4) {
            r10 = 1;
        }
        int i13 = (iM30448b + r10) * 31;
        boolean z13 = this.passesSnoozedConditions;
        ?? r14 = z13;
        if (z13) {
            r14 = 1;
        }
        int i14 = (i13 + r14) * 31;
        boolean z14 = this.passesPageTargeting;
        ?? r15 = z14;
        if (z14) {
            r15 = 1;
        }
        int i15 = (i14 + r15) * 31;
        boolean z15 = this.passesPinnedElement;
        ?? r16 = z15;
        if (z15) {
            r16 = 1;
        }
        int i16 = (i15 + r16) * 31;
        boolean z16 = this.shouldTemporarilyHide;
        ?? r17 = z16;
        if (z16) {
            r17 = 1;
        }
        int i17 = (i16 + r17) * 31;
        boolean z17 = this.passesTriggerMatch;
        ?? r18 = z17;
        if (z17) {
            r18 = 1;
        }
        int i18 = (i17 + r18) * 31;
        boolean z18 = this.passesClickedElement;
        ?? r19 = z18;
        if (z18) {
            r19 = 1;
        }
        int i19 = (i18 + r19) * 31;
        boolean z19 = this.isAnchorableStep;
        ?? r24 = z19;
        if (z19) {
            r24 = 1;
        }
        int i24 = (i19 + r24) * 31;
        boolean z24 = this.passesCustomThrottles;
        ?? r25 = z24;
        if (z24) {
            r25 = 1;
        }
        int i25 = (i24 + r25) * 31;
        ThrottleLimit throttleLimit = this.surveyThrottleLimit;
        int iHashCode2 = (i25 + (throttleLimit == null ? 0 : throttleLimit.hashCode())) * 31;
        ThrottleLimit throttleLimit2 = this.guideThrottleLimit;
        int iHashCode3 = (iHashCode2 + (throttleLimit2 != null ? throttleLimit2.hashCode() : 0)) * 31;
        boolean z25 = this.bypassCustomThrottles;
        return this.endUser.hashCode() + AbstractC11266d.m30450d((iHashCode3 + (z25 ? 1 : z25)) * 31, 31, this.screen);
    }

    public final boolean isAnchorableStep() {
        return this.isAnchorableStep;
    }

    public String toString() {
        return "SimulationContext(lastTriggerEvent=" + this.lastTriggerEvent + ", simulatedNudge=" + this.simulatedNudge + ", lastEvent=" + this.lastEvent + ", currentStepIndex=" + this.currentStepIndex + ", passesCooldown=" + this.passesCooldown + ", passesSnoozedConditions=" + this.passesSnoozedConditions + ", passesPageTargeting=" + this.passesPageTargeting + ", passesPinnedElement=" + this.passesPinnedElement + ", shouldTemporarilyHide=" + this.shouldTemporarilyHide + ", passesTriggerMatch=" + this.passesTriggerMatch + ", passesClickedElement=" + this.passesClickedElement + ", isAnchorableStep=" + this.isAnchorableStep + ", passesCustomThrottles=" + this.passesCustomThrottles + ", surveyThrottleLimit=" + this.surveyThrottleLimit + ", guideThrottleLimit=" + this.guideThrottleLimit + ", bypassCustomThrottles=" + this.bypassCustomThrottles + ", screen=" + this.screen + ", endUser=" + this.endUser + ')';
    }

    public SimulationContext(TriggerEvent triggerEvent, Nudge simulatedNudge, LastEvent lastEvent, int i13, boolean z4, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, ThrottleLimit throttleLimit, ThrottleLimit throttleLimit2, boolean z25, String screen, EndUser endUser) {
        AbstractC22676k.m65750j(simulatedNudge, "simulatedNudge");
        AbstractC22676k.m65750j(screen, "screen");
        AbstractC22676k.m65750j(endUser, "endUser");
        this.lastTriggerEvent = triggerEvent;
        this.simulatedNudge = simulatedNudge;
        this.lastEvent = lastEvent;
        this.currentStepIndex = i13;
        this.passesCooldown = z4;
        this.passesSnoozedConditions = z13;
        this.passesPageTargeting = z14;
        this.passesPinnedElement = z15;
        this.shouldTemporarilyHide = z16;
        this.passesTriggerMatch = z17;
        this.passesClickedElement = z18;
        this.isAnchorableStep = z19;
        this.passesCustomThrottles = z24;
        this.surveyThrottleLimit = throttleLimit;
        this.guideThrottleLimit = throttleLimit2;
        this.bypassCustomThrottles = z25;
        this.screen = screen;
        this.endUser = endUser;
    }

    public /* synthetic */ SimulationContext(TriggerEvent triggerEvent, Nudge nudge, LastEvent lastEvent, int i13, boolean z4, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, ThrottleLimit throttleLimit, ThrottleLimit throttleLimit2, boolean z25, String str, EndUser endUser, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? null : triggerEvent, nudge, (i14 & 4) != 0 ? null : lastEvent, i13, z4, z13, z14, z15, z16, z17, z18, z19, z24, (i14 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : throttleLimit, (i14 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : throttleLimit2, z25, str, endUser);
    }
}
