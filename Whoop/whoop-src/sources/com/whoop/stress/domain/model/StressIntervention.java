package com.whoop.stress.domain.model;

import androidx.annotation.Keep;
import androidx.core.app.FrameMetricsAggregator;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih1.C18518b;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import o91.C27689f;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
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

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(m65680d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u0000 X2\u00020\u0001:\u0002YZBl\u0012\u0019\u0010\u0007\u001a\u00150\u0002j\u0002`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018By\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\b\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0017\u0010\u001cJ#\u0010\u001d\u001a\u00150\u0002j\u0002`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b$\u0010\"J\u0010\u0010%\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0087\u0001\u0010-\u001a\u00020\u00002\u001b\b\u0002\u0010\u0007\u001a\u00150\u0002j\u0002`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b/\u0010\"J\u0010\u00100\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b0\u0010 J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104J'\u0010=\u001a\u00020:2\u0006\u00105\u001a\u00020\u00002\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0001¢\u0006\u0004\b;\u0010<R3\u0010\u0007\u001a\u00150\u0002j\u0002`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010>\u0012\u0004\b@\u0010A\u001a\u0004\b?\u0010\u001eR \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010B\u0012\u0004\bD\u0010A\u001a\u0004\bC\u0010 R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010E\u0012\u0004\bG\u0010A\u001a\u0004\bF\u0010\"R \u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010E\u0012\u0004\bI\u0010A\u001a\u0004\bH\u0010\"R \u0010\r\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010E\u0012\u0004\bK\u0010A\u001a\u0004\bJ\u0010\"R \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010L\u0012\u0004\bN\u0010A\u001a\u0004\bM\u0010&R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010O\u0012\u0004\bQ\u0010A\u001a\u0004\bP\u0010(R&\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010R\u0012\u0004\bT\u0010A\u001a\u0004\bS\u0010*R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010U\u0012\u0004\bW\u0010A\u001a\u0004\bV\u0010,¨\u0006["}, m65681d2 = {"Lcom/whoop/stress/domain/model/StressIntervention;", "", "Lcom/google/gson/JsonObject;", "Lcom/whoop/design/json/serializers/SerializableJsonObject;", "Lwc3/i;", "with", "Lj93/d;", "animationJson", "", "repeatCount", "", "title", "button", "sessionDone", "Lcom/whoop/stress/domain/model/StressInterventionFinishDialog;", "finishDialog", "Lcom/whoop/stress/domain/model/DisclaimerScreen;", "disclaimerScreen", "", "Lcom/whoop/stress/domain/model/StressInterventionFrame;", "frames", "Lcom/whoop/stress/domain/model/HoldingFrame;", "holdingFrame", "<init>", "(Lcom/google/gson/JsonObject;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/stress/domain/model/StressInterventionFinishDialog;Lcom/whoop/stress/domain/model/DisclaimerScreen;Ljava/util/List;Lcom/whoop/stress/domain/model/HoldingFrame;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/google/gson/JsonObject;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/stress/domain/model/StressInterventionFinishDialog;Lcom/whoop/stress/domain/model/DisclaimerScreen;Ljava/util/List;Lcom/whoop/stress/domain/model/HoldingFrame;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/google/gson/JsonObject;", "component2", "()I", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "()Lcom/whoop/stress/domain/model/StressInterventionFinishDialog;", "component7", "()Lcom/whoop/stress/domain/model/DisclaimerScreen;", "component8", "()Ljava/util/List;", "component9", "()Lcom/whoop/stress/domain/model/HoldingFrame;", "copy", "(Lcom/google/gson/JsonObject;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/stress/domain/model/StressInterventionFinishDialog;Lcom/whoop/stress/domain/model/DisclaimerScreen;Ljava/util/List;Lcom/whoop/stress/domain/model/HoldingFrame;)Lcom/whoop/stress/domain/model/StressIntervention;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$stress_release", "(Lcom/whoop/stress/domain/model/StressIntervention;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/google/gson/JsonObject;", "getAnimationJson", "getAnimationJson$annotations", "()V", "I", "getRepeatCount", "getRepeatCount$annotations", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "getButton", "getButton$annotations", "getSessionDone", "getSessionDone$annotations", "Lcom/whoop/stress/domain/model/StressInterventionFinishDialog;", "getFinishDialog", "getFinishDialog$annotations", "Lcom/whoop/stress/domain/model/DisclaimerScreen;", "getDisclaimerScreen", "getDisclaimerScreen$annotations", "Ljava/util/List;", "getFrames", "getFrames$annotations", "Lcom/whoop/stress/domain/model/HoldingFrame;", "getHoldingFrame", "getHoldingFrame$annotations", "Companion", "$serializer", "a", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class StressIntervention {

    @SerializedName("animation")
    private final JsonObject animationJson;

    @SerializedName("button_display")
    private final String button;

    @SerializedName("intro_screen")
    private final DisclaimerScreen disclaimerScreen;

    @SerializedName("finish_dialogue")
    private final StressInterventionFinishDialog finishDialog;

    @SerializedName("frames")
    private final List<StressInterventionFrame> frames;

    @SerializedName("holding_frame")
    private final HoldingFrame holdingFrame;

    @SerializedName("repeat_count")
    private final int repeatCount;

    @SerializedName("session_done_display")
    private final String sessionDone;

    @SerializedName("title_display")
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C18518b(10)), null};

    /* JADX INFO: renamed from: com.whoop.stress.domain.model.StressIntervention$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/stress/domain/model/StressIntervention$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/stress/domain/model/StressIntervention;", "serializer", "()Lwc3/c;", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return StressIntervention$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ StressIntervention(int i13, JsonObject jsonObject, int i14, String str, String str2, String str3, StressInterventionFinishDialog stressInterventionFinishDialog, DisclaimerScreen disclaimerScreen, List list, HoldingFrame holdingFrame, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i13 & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.throwMissingFieldException(i13, FrameMetricsAggregator.EVERY_DURATION, StressIntervention$$serializer.INSTANCE.getDescriptor());
        }
        this.animationJson = jsonObject;
        this.repeatCount = i14;
        this.title = str;
        this.button = str2;
        this.sessionDone = str3;
        this.finishDialog = stressInterventionFinishDialog;
        this.disclaimerScreen = disclaimerScreen;
        this.frames = list;
        this.holdingFrame = holdingFrame;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StressInterventionFrame$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StressIntervention copy$default(StressIntervention stressIntervention, JsonObject jsonObject, int i13, String str, String str2, String str3, StressInterventionFinishDialog stressInterventionFinishDialog, DisclaimerScreen disclaimerScreen, List list, HoldingFrame holdingFrame, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            jsonObject = stressIntervention.animationJson;
        }
        if ((i14 & 2) != 0) {
            i13 = stressIntervention.repeatCount;
        }
        if ((i14 & 4) != 0) {
            str = stressIntervention.title;
        }
        if ((i14 & 8) != 0) {
            str2 = stressIntervention.button;
        }
        if ((i14 & 16) != 0) {
            str3 = stressIntervention.sessionDone;
        }
        if ((i14 & 32) != 0) {
            stressInterventionFinishDialog = stressIntervention.finishDialog;
        }
        if ((i14 & 64) != 0) {
            disclaimerScreen = stressIntervention.disclaimerScreen;
        }
        if ((i14 & 128) != 0) {
            list = stressIntervention.frames;
        }
        if ((i14 & 256) != 0) {
            holdingFrame = stressIntervention.holdingFrame;
        }
        List list2 = list;
        HoldingFrame holdingFrame2 = holdingFrame;
        StressInterventionFinishDialog stressInterventionFinishDialog2 = stressInterventionFinishDialog;
        DisclaimerScreen disclaimerScreen2 = disclaimerScreen;
        String str4 = str3;
        String str5 = str;
        return stressIntervention.copy(jsonObject, i13, str5, str2, str4, stressInterventionFinishDialog2, disclaimerScreen2, list2, holdingFrame2);
    }

    @InterfaceC37143h("animation")
    public static /* synthetic */ void getAnimationJson$annotations() {
    }

    @InterfaceC37143h("button_display")
    public static /* synthetic */ void getButton$annotations() {
    }

    @InterfaceC37143h("intro_screen")
    public static /* synthetic */ void getDisclaimerScreen$annotations() {
    }

    @InterfaceC37143h("finish_dialogue")
    public static /* synthetic */ void getFinishDialog$annotations() {
    }

    @InterfaceC37143h("frames")
    public static /* synthetic */ void getFrames$annotations() {
    }

    @InterfaceC37143h("holding_frame")
    public static /* synthetic */ void getHoldingFrame$annotations() {
    }

    @InterfaceC37143h("repeat_count")
    public static /* synthetic */ void getRepeatCount$annotations() {
    }

    @InterfaceC37143h("session_done_display")
    public static /* synthetic */ void getSessionDone$annotations() {
    }

    @InterfaceC37143h("title_display")
    public static /* synthetic */ void getTitle$annotations() {
    }

    public static final /* synthetic */ void write$Self$stress_release(StressIntervention self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, C27689f.f111463a, self.animationJson);
        output.encodeIntElement(serialDesc, 1, self.repeatCount);
        output.encodeStringElement(serialDesc, 2, self.title);
        output.encodeStringElement(serialDesc, 3, self.button);
        output.encodeStringElement(serialDesc, 4, self.sessionDone);
        output.encodeSerializableElement(serialDesc, 5, StressInterventionFinishDialog$$serializer.INSTANCE, self.finishDialog);
        output.encodeNullableSerializableElement(serialDesc, 6, DisclaimerScreen$$serializer.INSTANCE, self.disclaimerScreen);
        output.encodeSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.frames);
        output.encodeNullableSerializableElement(serialDesc, 8, HoldingFrame$$serializer.INSTANCE, self.holdingFrame);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final JsonObject getAnimationJson() {
        return this.animationJson;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRepeatCount() {
        return this.repeatCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getButton() {
        return this.button;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSessionDone() {
        return this.sessionDone;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final StressInterventionFinishDialog getFinishDialog() {
        return this.finishDialog;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final DisclaimerScreen getDisclaimerScreen() {
        return this.disclaimerScreen;
    }

    public final List<StressInterventionFrame> component8() {
        return this.frames;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final HoldingFrame getHoldingFrame() {
        return this.holdingFrame;
    }

    public final StressIntervention copy(JsonObject animationJson, int repeatCount, String title, String button, String sessionDone, StressInterventionFinishDialog finishDialog, DisclaimerScreen disclaimerScreen, List<StressInterventionFrame> frames, HoldingFrame holdingFrame) {
        AbstractC22676k.m65750j(animationJson, "animationJson");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(button, "button");
        AbstractC22676k.m65750j(sessionDone, "sessionDone");
        AbstractC22676k.m65750j(finishDialog, "finishDialog");
        AbstractC22676k.m65750j(frames, "frames");
        return new StressIntervention(animationJson, repeatCount, title, button, sessionDone, finishDialog, disclaimerScreen, frames, holdingFrame);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StressIntervention)) {
            return false;
        }
        StressIntervention stressIntervention = (StressIntervention) other;
        return AbstractC22676k.m65745e(this.animationJson, stressIntervention.animationJson) && this.repeatCount == stressIntervention.repeatCount && AbstractC22676k.m65745e(this.title, stressIntervention.title) && AbstractC22676k.m65745e(this.button, stressIntervention.button) && AbstractC22676k.m65745e(this.sessionDone, stressIntervention.sessionDone) && AbstractC22676k.m65745e(this.finishDialog, stressIntervention.finishDialog) && AbstractC22676k.m65745e(this.disclaimerScreen, stressIntervention.disclaimerScreen) && AbstractC22676k.m65745e(this.frames, stressIntervention.frames) && AbstractC22676k.m65745e(this.holdingFrame, stressIntervention.holdingFrame);
    }

    public final JsonObject getAnimationJson() {
        return this.animationJson;
    }

    public final String getButton() {
        return this.button;
    }

    public final DisclaimerScreen getDisclaimerScreen() {
        return this.disclaimerScreen;
    }

    public final StressInterventionFinishDialog getFinishDialog() {
        return this.finishDialog;
    }

    public final List<StressInterventionFrame> getFrames() {
        return this.frames;
    }

    public final HoldingFrame getHoldingFrame() {
        return this.holdingFrame;
    }

    public final int getRepeatCount() {
        return this.repeatCount;
    }

    public final String getSessionDone() {
        return this.sessionDone;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = (this.finishDialog.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.repeatCount, this.animationJson.hashCode() * 31, 31), 31, this.title), 31, this.button), 31, this.sessionDone)) * 31;
        DisclaimerScreen disclaimerScreen = this.disclaimerScreen;
        int iM31983b = AbstractC11895b.m31983b((iHashCode + (disclaimerScreen == null ? 0 : disclaimerScreen.hashCode())) * 31, 31, this.frames);
        HoldingFrame holdingFrame = this.holdingFrame;
        return iM31983b + (holdingFrame != null ? holdingFrame.hashCode() : 0);
    }

    public String toString() {
        JsonObject jsonObject = this.animationJson;
        int i13 = this.repeatCount;
        String str = this.title;
        String str2 = this.button;
        String str3 = this.sessionDone;
        StressInterventionFinishDialog stressInterventionFinishDialog = this.finishDialog;
        DisclaimerScreen disclaimerScreen = this.disclaimerScreen;
        List<StressInterventionFrame> list = this.frames;
        HoldingFrame holdingFrame = this.holdingFrame;
        StringBuilder sb4 = new StringBuilder("StressIntervention(animationJson=");
        sb4.append(jsonObject);
        sb4.append(", repeatCount=");
        sb4.append(i13);
        sb4.append(", title=");
        AbstractC11266d.m30444B(sb4, str, ", button=", str2, ", sessionDone=");
        sb4.append(str3);
        sb4.append(", finishDialog=");
        sb4.append(stressInterventionFinishDialog);
        sb4.append(", disclaimerScreen=");
        sb4.append(disclaimerScreen);
        sb4.append(", frames=");
        sb4.append(list);
        sb4.append(", holdingFrame=");
        sb4.append(holdingFrame);
        sb4.append(")");
        return sb4.toString();
    }

    public StressIntervention(JsonObject animationJson, int i13, String title, String button, String sessionDone, StressInterventionFinishDialog finishDialog, DisclaimerScreen disclaimerScreen, List<StressInterventionFrame> frames, HoldingFrame holdingFrame) {
        AbstractC22676k.m65750j(animationJson, "animationJson");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(button, "button");
        AbstractC22676k.m65750j(sessionDone, "sessionDone");
        AbstractC22676k.m65750j(finishDialog, "finishDialog");
        AbstractC22676k.m65750j(frames, "frames");
        this.animationJson = animationJson;
        this.repeatCount = i13;
        this.title = title;
        this.button = button;
        this.sessionDone = sessionDone;
        this.finishDialog = finishDialog;
        this.disclaimerScreen = disclaimerScreen;
        this.frames = frames;
        this.holdingFrame = holdingFrame;
    }
}
