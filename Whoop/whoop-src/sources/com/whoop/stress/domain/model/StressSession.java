package com.whoop.stress.domain.model;

import androidx.annotation.Keep;
import androidx.core.app.FrameMetricsAggregator;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u0000 O2\u00020\u0001:\u0002PQBS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011Bu\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0018J\u0010\u0010!\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b#\u0010$Jn\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0018J\u0010\u0010(\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-J'\u00106\u001a\u0002032\u0006\u0010.\u001a\u00020\u00002\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0001¢\u0006\u0004\b4\u00105R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00107\u0012\u0004\b9\u0010:\u001a\u0004\b8\u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00107\u0012\u0004\b<\u0010:\u001a\u0004\b;\u0010\u0018R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00107\u0012\u0004\b>\u0010:\u001a\u0004\b=\u0010\u0018R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00107\u0012\u0004\b@\u0010:\u001a\u0004\b?\u0010\u0018R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010A\u0012\u0004\bC\u0010:\u001a\u0004\bB\u0010\u001dR \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010D\u0012\u0004\bF\u0010:\u001a\u0004\bE\u0010\u001fR \u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00107\u0012\u0004\bH\u0010:\u001a\u0004\bG\u0010\u0018R \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010I\u0012\u0004\bK\u0010:\u001a\u0004\bJ\u0010\"R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010L\u0012\u0004\bN\u0010:\u001a\u0004\bM\u0010$¨\u0006R"}, m65681d2 = {"Lcom/whoop/stress/domain/model/StressSession;", "", "", "backgroundImageUrl", "navigationTitle", "title", "descriptionDisplay", "Lcom/whoop/stress/domain/model/StressDuration;", AttachmentExtensionsKt.EXTRA_DURATION, "Lcom/whoop/stress/domain/model/StressInstruction;", "instruction", "buttonDisplay", "Lcom/whoop/stress/domain/model/StressIntervention;", "intervention", "Lcom/whoop/stress/domain/model/StressCustomization;", "customization", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/stress/domain/model/StressDuration;Lcom/whoop/stress/domain/model/StressInstruction;Ljava/lang/String;Lcom/whoop/stress/domain/model/StressIntervention;Lcom/whoop/stress/domain/model/StressCustomization;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/stress/domain/model/StressDuration;Lcom/whoop/stress/domain/model/StressInstruction;Ljava/lang/String;Lcom/whoop/stress/domain/model/StressIntervention;Lcom/whoop/stress/domain/model/StressCustomization;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/whoop/stress/domain/model/StressDuration;", "component6", "()Lcom/whoop/stress/domain/model/StressInstruction;", "component7", "component8", "()Lcom/whoop/stress/domain/model/StressIntervention;", "component9", "()Lcom/whoop/stress/domain/model/StressCustomization;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/stress/domain/model/StressDuration;Lcom/whoop/stress/domain/model/StressInstruction;Ljava/lang/String;Lcom/whoop/stress/domain/model/StressIntervention;Lcom/whoop/stress/domain/model/StressCustomization;)Lcom/whoop/stress/domain/model/StressSession;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$stress_release", "(Lcom/whoop/stress/domain/model/StressSession;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getBackgroundImageUrl", "getBackgroundImageUrl$annotations", "()V", "getNavigationTitle", "getNavigationTitle$annotations", "getTitle", "getTitle$annotations", "getDescriptionDisplay", "getDescriptionDisplay$annotations", "Lcom/whoop/stress/domain/model/StressDuration;", "getDuration", "getDuration$annotations", "Lcom/whoop/stress/domain/model/StressInstruction;", "getInstruction", "getInstruction$annotations", "getButtonDisplay", "getButtonDisplay$annotations", "Lcom/whoop/stress/domain/model/StressIntervention;", "getIntervention", "getIntervention$annotations", "Lcom/whoop/stress/domain/model/StressCustomization;", "getCustomization", "getCustomization$annotations", "Companion", "$serializer", "a", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class StressSession {

    @SerializedName("background_image_url")
    private final String backgroundImageUrl;

    @SerializedName("button_display")
    private final String buttonDisplay;

    @SerializedName("customization")
    private final StressCustomization customization;

    @SerializedName("description_display")
    private final String descriptionDisplay;

    @SerializedName(AttachmentExtensionsKt.EXTRA_DURATION)
    private final StressDuration duration;

    @SerializedName("instruction")
    private final StressInstruction instruction;

    @SerializedName("intervention")
    private final StressIntervention intervention;

    @SerializedName("navigation_title_display")
    private final String navigationTitle;

    @SerializedName("title_display")
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.stress.domain.model.StressSession$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/stress/domain/model/StressSession$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/stress/domain/model/StressSession;", "serializer", "()Lwc3/c;", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return StressSession$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ StressSession(int i13, String str, String str2, String str3, String str4, StressDuration stressDuration, StressInstruction stressInstruction, String str5, StressIntervention stressIntervention, StressCustomization stressCustomization, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i13 & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.throwMissingFieldException(i13, FrameMetricsAggregator.EVERY_DURATION, StressSession$$serializer.INSTANCE.getDescriptor());
        }
        this.backgroundImageUrl = str;
        this.navigationTitle = str2;
        this.title = str3;
        this.descriptionDisplay = str4;
        this.duration = stressDuration;
        this.instruction = stressInstruction;
        this.buttonDisplay = str5;
        this.intervention = stressIntervention;
        this.customization = stressCustomization;
    }

    public static /* synthetic */ StressSession copy$default(StressSession stressSession, String str, String str2, String str3, String str4, StressDuration stressDuration, StressInstruction stressInstruction, String str5, StressIntervention stressIntervention, StressCustomization stressCustomization, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = stressSession.backgroundImageUrl;
        }
        if ((i13 & 2) != 0) {
            str2 = stressSession.navigationTitle;
        }
        if ((i13 & 4) != 0) {
            str3 = stressSession.title;
        }
        if ((i13 & 8) != 0) {
            str4 = stressSession.descriptionDisplay;
        }
        if ((i13 & 16) != 0) {
            stressDuration = stressSession.duration;
        }
        if ((i13 & 32) != 0) {
            stressInstruction = stressSession.instruction;
        }
        if ((i13 & 64) != 0) {
            str5 = stressSession.buttonDisplay;
        }
        if ((i13 & 128) != 0) {
            stressIntervention = stressSession.intervention;
        }
        if ((i13 & 256) != 0) {
            stressCustomization = stressSession.customization;
        }
        StressIntervention stressIntervention2 = stressIntervention;
        StressCustomization stressCustomization2 = stressCustomization;
        StressInstruction stressInstruction2 = stressInstruction;
        String str6 = str5;
        StressDuration stressDuration2 = stressDuration;
        String str7 = str3;
        return stressSession.copy(str, str2, str7, str4, stressDuration2, stressInstruction2, str6, stressIntervention2, stressCustomization2);
    }

    @InterfaceC37143h("background_image_url")
    public static /* synthetic */ void getBackgroundImageUrl$annotations() {
    }

    @InterfaceC37143h("button_display")
    public static /* synthetic */ void getButtonDisplay$annotations() {
    }

    @InterfaceC37143h("customization")
    public static /* synthetic */ void getCustomization$annotations() {
    }

    @InterfaceC37143h("description_display")
    public static /* synthetic */ void getDescriptionDisplay$annotations() {
    }

    @InterfaceC37143h(AttachmentExtensionsKt.EXTRA_DURATION)
    public static /* synthetic */ void getDuration$annotations() {
    }

    @InterfaceC37143h("instruction")
    public static /* synthetic */ void getInstruction$annotations() {
    }

    @InterfaceC37143h("intervention")
    public static /* synthetic */ void getIntervention$annotations() {
    }

    @InterfaceC37143h("navigation_title_display")
    public static /* synthetic */ void getNavigationTitle$annotations() {
    }

    @InterfaceC37143h("title_display")
    public static /* synthetic */ void getTitle$annotations() {
    }

    public static final /* synthetic */ void write$Self$stress_release(StressSession self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.backgroundImageUrl);
        output.encodeStringElement(serialDesc, 1, self.navigationTitle);
        output.encodeStringElement(serialDesc, 2, self.title);
        output.encodeStringElement(serialDesc, 3, self.descriptionDisplay);
        output.encodeNullableSerializableElement(serialDesc, 4, StressDuration$$serializer.INSTANCE, self.duration);
        output.encodeSerializableElement(serialDesc, 5, StressInstruction$$serializer.INSTANCE, self.instruction);
        output.encodeStringElement(serialDesc, 6, self.buttonDisplay);
        output.encodeSerializableElement(serialDesc, 7, StressIntervention$$serializer.INSTANCE, self.intervention);
        output.encodeNullableSerializableElement(serialDesc, 8, StressCustomization$$serializer.INSTANCE, self.customization);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNavigationTitle() {
        return this.navigationTitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final StressDuration getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final StressInstruction getInstruction() {
        return this.instruction;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getButtonDisplay() {
        return this.buttonDisplay;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final StressIntervention getIntervention() {
        return this.intervention;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final StressCustomization getCustomization() {
        return this.customization;
    }

    public final StressSession copy(String backgroundImageUrl, String navigationTitle, String title, String descriptionDisplay, StressDuration duration, StressInstruction instruction, String buttonDisplay, StressIntervention intervention, StressCustomization customization) {
        AbstractC22676k.m65750j(backgroundImageUrl, "backgroundImageUrl");
        AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(descriptionDisplay, "descriptionDisplay");
        AbstractC22676k.m65750j(instruction, "instruction");
        AbstractC22676k.m65750j(buttonDisplay, "buttonDisplay");
        AbstractC22676k.m65750j(intervention, "intervention");
        return new StressSession(backgroundImageUrl, navigationTitle, title, descriptionDisplay, duration, instruction, buttonDisplay, intervention, customization);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StressSession)) {
            return false;
        }
        StressSession stressSession = (StressSession) other;
        return AbstractC22676k.m65745e(this.backgroundImageUrl, stressSession.backgroundImageUrl) && AbstractC22676k.m65745e(this.navigationTitle, stressSession.navigationTitle) && AbstractC22676k.m65745e(this.title, stressSession.title) && AbstractC22676k.m65745e(this.descriptionDisplay, stressSession.descriptionDisplay) && AbstractC22676k.m65745e(this.duration, stressSession.duration) && AbstractC22676k.m65745e(this.instruction, stressSession.instruction) && AbstractC22676k.m65745e(this.buttonDisplay, stressSession.buttonDisplay) && AbstractC22676k.m65745e(this.intervention, stressSession.intervention) && AbstractC22676k.m65745e(this.customization, stressSession.customization);
    }

    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    public final String getButtonDisplay() {
        return this.buttonDisplay;
    }

    public final StressCustomization getCustomization() {
        return this.customization;
    }

    public final String getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    public final StressDuration getDuration() {
        return this.duration;
    }

    public final StressInstruction getInstruction() {
        return this.instruction;
    }

    public final StressIntervention getIntervention() {
        return this.intervention;
    }

    public final String getNavigationTitle() {
        return this.navigationTitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.backgroundImageUrl.hashCode() * 31, 31, this.navigationTitle), 31, this.title), 31, this.descriptionDisplay);
        StressDuration stressDuration = this.duration;
        int iHashCode = (this.intervention.hashCode() + AbstractC11266d.m30450d((this.instruction.hashCode() + ((iM30450d + (stressDuration == null ? 0 : stressDuration.hashCode())) * 31)) * 31, 31, this.buttonDisplay)) * 31;
        StressCustomization stressCustomization = this.customization;
        return iHashCode + (stressCustomization != null ? stressCustomization.hashCode() : 0);
    }

    public String toString() {
        String str = this.backgroundImageUrl;
        String str2 = this.navigationTitle;
        String str3 = this.title;
        String str4 = this.descriptionDisplay;
        StressDuration stressDuration = this.duration;
        StressInstruction stressInstruction = this.instruction;
        String str5 = this.buttonDisplay;
        StressIntervention stressIntervention = this.intervention;
        StressCustomization stressCustomization = this.customization;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("StressSession(backgroundImageUrl=", str, ", navigationTitle=", str2, ", title=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", descriptionDisplay=", str4, ", duration=");
        sbM32001t.append(stressDuration);
        sbM32001t.append(", instruction=");
        sbM32001t.append(stressInstruction);
        sbM32001t.append(", buttonDisplay=");
        sbM32001t.append(str5);
        sbM32001t.append(", intervention=");
        sbM32001t.append(stressIntervention);
        sbM32001t.append(", customization=");
        sbM32001t.append(stressCustomization);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public StressSession(String backgroundImageUrl, String navigationTitle, String title, String descriptionDisplay, StressDuration stressDuration, StressInstruction instruction, String buttonDisplay, StressIntervention intervention, StressCustomization stressCustomization) {
        AbstractC22676k.m65750j(backgroundImageUrl, "backgroundImageUrl");
        AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(descriptionDisplay, "descriptionDisplay");
        AbstractC22676k.m65750j(instruction, "instruction");
        AbstractC22676k.m65750j(buttonDisplay, "buttonDisplay");
        AbstractC22676k.m65750j(intervention, "intervention");
        this.backgroundImageUrl = backgroundImageUrl;
        this.navigationTitle = navigationTitle;
        this.title = title;
        this.descriptionDisplay = descriptionDisplay;
        this.duration = stressDuration;
        this.instruction = instruction;
        this.buttonDisplay = buttonDisplay;
        this.intervention = intervention;
        this.customization = stressCustomization;
    }
}
