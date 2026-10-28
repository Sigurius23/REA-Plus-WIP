package com.whoop.clinicianintheloop.api;

import androidx.core.app.FrameMetricsAggregator;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.analytics.AnalyticEventModel$$serializer;
import com.whoop.design.models.InfoCalloutTileModel;
import com.whoop.design.models.InfoCalloutTileModel$$serializer;
import com.whoop.design.models.ProgressButtonModel;
import com.whoop.design.models.ProgressButtonModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u0000 E2\u00020\u0001:\u0002FGBY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011Bu\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0010\u0010$\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010!J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010!J\u0012\u0010*\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b,\u0010-Jt\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b0\u0010!J\u0010\u00101\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00105\u001a\u0002042\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b5\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u0010!R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00107\u001a\u0004\b9\u0010!R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b:\u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010;\u001a\u0004\b<\u0010%R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010=\u001a\u0004\b>\u0010'R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b?\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b@\u0010!R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010A\u001a\u0004\bB\u0010+R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010C\u001a\u0004\bD\u0010-¨\u0006H"}, m65681d2 = {"Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;", "", "", "navigationTitle", "title", "subtitle", "Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormContent;", "formContent", "Lcom/whoop/design/models/ProgressButtonModel;", "nextButton", "savingTitle", "savingSubtitle", "Lcom/whoop/analytics/AnalyticEventModel;", "analyticEvent", "Lcom/whoop/design/models/InfoCalloutTileModel;", "callout", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormContent;Lcom/whoop/design/models/ProgressButtonModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/design/models/InfoCalloutTileModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormContent;Lcom/whoop/design/models/ProgressButtonModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/design/models/InfoCalloutTileModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$clinician_in_the_loop_release", "(Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormContent;", "component5", "()Lcom/whoop/design/models/ProgressButtonModel;", "component6", "component7", "component8", "()Lcom/whoop/analytics/AnalyticEventModel;", "component9", "()Lcom/whoop/design/models/InfoCalloutTileModel;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormContent;Lcom/whoop/design/models/ProgressButtonModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/design/models/InfoCalloutTileModel;)Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNavigationTitle", "getTitle", "getSubtitle", "Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormContent;", "getFormContent", "Lcom/whoop/design/models/ProgressButtonModel;", "getNextButton", "getSavingTitle", "getSavingSubtitle", "Lcom/whoop/analytics/AnalyticEventModel;", "getAnalyticEvent", "Lcom/whoop/design/models/InfoCalloutTileModel;", "getCallout", "Companion", "$serializer", "a", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class VideoSchedulingFormResponse {
    private final AnalyticEventModel analyticEvent;
    private final InfoCalloutTileModel callout;
    private final VideoSchedulingFormContent formContent;
    private final String navigationTitle;
    private final ProgressButtonModel nextButton;
    private final String savingSubtitle;
    private final String savingTitle;
    private final String subtitle;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.clinicianintheloop.api.VideoSchedulingFormResponse$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;", "serializer", "()Lwc3/c;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return VideoSchedulingFormResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ VideoSchedulingFormResponse(int i13, String str, String str2, String str3, VideoSchedulingFormContent videoSchedulingFormContent, ProgressButtonModel progressButtonModel, String str4, String str5, AnalyticEventModel analyticEventModel, InfoCalloutTileModel infoCalloutTileModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i13 & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.throwMissingFieldException(i13, FrameMetricsAggregator.EVERY_DURATION, VideoSchedulingFormResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.navigationTitle = str;
        this.title = str2;
        this.subtitle = str3;
        this.formContent = videoSchedulingFormContent;
        this.nextButton = progressButtonModel;
        this.savingTitle = str4;
        this.savingSubtitle = str5;
        this.analyticEvent = analyticEventModel;
        this.callout = infoCalloutTileModel;
    }

    public static /* synthetic */ VideoSchedulingFormResponse copy$default(VideoSchedulingFormResponse videoSchedulingFormResponse, String str, String str2, String str3, VideoSchedulingFormContent videoSchedulingFormContent, ProgressButtonModel progressButtonModel, String str4, String str5, AnalyticEventModel analyticEventModel, InfoCalloutTileModel infoCalloutTileModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = videoSchedulingFormResponse.navigationTitle;
        }
        if ((i13 & 2) != 0) {
            str2 = videoSchedulingFormResponse.title;
        }
        if ((i13 & 4) != 0) {
            str3 = videoSchedulingFormResponse.subtitle;
        }
        if ((i13 & 8) != 0) {
            videoSchedulingFormContent = videoSchedulingFormResponse.formContent;
        }
        if ((i13 & 16) != 0) {
            progressButtonModel = videoSchedulingFormResponse.nextButton;
        }
        if ((i13 & 32) != 0) {
            str4 = videoSchedulingFormResponse.savingTitle;
        }
        if ((i13 & 64) != 0) {
            str5 = videoSchedulingFormResponse.savingSubtitle;
        }
        if ((i13 & 128) != 0) {
            analyticEventModel = videoSchedulingFormResponse.analyticEvent;
        }
        if ((i13 & 256) != 0) {
            infoCalloutTileModel = videoSchedulingFormResponse.callout;
        }
        AnalyticEventModel analyticEventModel2 = analyticEventModel;
        InfoCalloutTileModel infoCalloutTileModel2 = infoCalloutTileModel;
        String str6 = str4;
        String str7 = str5;
        ProgressButtonModel progressButtonModel2 = progressButtonModel;
        String str8 = str3;
        return videoSchedulingFormResponse.copy(str, str2, str8, videoSchedulingFormContent, progressButtonModel2, str6, str7, analyticEventModel2, infoCalloutTileModel2);
    }

    public static final /* synthetic */ void write$Self$clinician_in_the_loop_release(VideoSchedulingFormResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.navigationTitle);
        output.encodeStringElement(serialDesc, 1, self.title);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.subtitle);
        output.encodeSerializableElement(serialDesc, 3, VideoSchedulingFormContent$$serializer.INSTANCE, self.formContent);
        output.encodeSerializableElement(serialDesc, 4, ProgressButtonModel$$serializer.INSTANCE, self.nextButton);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.savingTitle);
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.savingSubtitle);
        output.encodeNullableSerializableElement(serialDesc, 7, AnalyticEventModel$$serializer.INSTANCE, self.analyticEvent);
        output.encodeNullableSerializableElement(serialDesc, 8, InfoCalloutTileModel$$serializer.INSTANCE, self.callout);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNavigationTitle() {
        return this.navigationTitle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final VideoSchedulingFormContent getFormContent() {
        return this.formContent;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ProgressButtonModel getNextButton() {
        return this.nextButton;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSavingTitle() {
        return this.savingTitle;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSavingSubtitle() {
        return this.savingSubtitle;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final InfoCalloutTileModel getCallout() {
        return this.callout;
    }

    public final VideoSchedulingFormResponse copy(String navigationTitle, String title, String subtitle, VideoSchedulingFormContent formContent, ProgressButtonModel nextButton, String savingTitle, String savingSubtitle, AnalyticEventModel analyticEvent, InfoCalloutTileModel callout) {
        AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(formContent, "formContent");
        AbstractC22676k.m65750j(nextButton, "nextButton");
        return new VideoSchedulingFormResponse(navigationTitle, title, subtitle, formContent, nextButton, savingTitle, savingSubtitle, analyticEvent, callout);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoSchedulingFormResponse)) {
            return false;
        }
        VideoSchedulingFormResponse videoSchedulingFormResponse = (VideoSchedulingFormResponse) other;
        return AbstractC22676k.m65745e(this.navigationTitle, videoSchedulingFormResponse.navigationTitle) && AbstractC22676k.m65745e(this.title, videoSchedulingFormResponse.title) && AbstractC22676k.m65745e(this.subtitle, videoSchedulingFormResponse.subtitle) && AbstractC22676k.m65745e(this.formContent, videoSchedulingFormResponse.formContent) && AbstractC22676k.m65745e(this.nextButton, videoSchedulingFormResponse.nextButton) && AbstractC22676k.m65745e(this.savingTitle, videoSchedulingFormResponse.savingTitle) && AbstractC22676k.m65745e(this.savingSubtitle, videoSchedulingFormResponse.savingSubtitle) && AbstractC22676k.m65745e(this.analyticEvent, videoSchedulingFormResponse.analyticEvent) && AbstractC22676k.m65745e(this.callout, videoSchedulingFormResponse.callout);
    }

    public final AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    public final InfoCalloutTileModel getCallout() {
        return this.callout;
    }

    public final VideoSchedulingFormContent getFormContent() {
        return this.formContent;
    }

    public final String getNavigationTitle() {
        return this.navigationTitle;
    }

    public final ProgressButtonModel getNextButton() {
        return this.nextButton;
    }

    public final String getSavingSubtitle() {
        return this.savingSubtitle;
    }

    public final String getSavingTitle() {
        return this.savingTitle;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.navigationTitle.hashCode() * 31, 31, this.title);
        String str = this.subtitle;
        int iHashCode = (this.nextButton.hashCode() + ((this.formContent.hashCode() + ((iM30450d + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        String str2 = this.savingTitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.savingSubtitle;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        int iHashCode4 = (iHashCode3 + (analyticEventModel == null ? 0 : analyticEventModel.hashCode())) * 31;
        InfoCalloutTileModel infoCalloutTileModel = this.callout;
        return iHashCode4 + (infoCalloutTileModel != null ? infoCalloutTileModel.hashCode() : 0);
    }

    public String toString() {
        String str = this.navigationTitle;
        String str2 = this.title;
        String str3 = this.subtitle;
        VideoSchedulingFormContent videoSchedulingFormContent = this.formContent;
        ProgressButtonModel progressButtonModel = this.nextButton;
        String str4 = this.savingTitle;
        String str5 = this.savingSubtitle;
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        InfoCalloutTileModel infoCalloutTileModel = this.callout;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("VideoSchedulingFormResponse(navigationTitle=", str, ", title=", str2, ", subtitle=");
        sbM32001t.append(str3);
        sbM32001t.append(", formContent=");
        sbM32001t.append(videoSchedulingFormContent);
        sbM32001t.append(", nextButton=");
        sbM32001t.append(progressButtonModel);
        sbM32001t.append(", savingTitle=");
        sbM32001t.append(str4);
        sbM32001t.append(", savingSubtitle=");
        sbM32001t.append(str5);
        sbM32001t.append(", analyticEvent=");
        sbM32001t.append(analyticEventModel);
        sbM32001t.append(", callout=");
        sbM32001t.append(infoCalloutTileModel);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public VideoSchedulingFormResponse(String navigationTitle, String title, String str, VideoSchedulingFormContent formContent, ProgressButtonModel nextButton, String str2, String str3, AnalyticEventModel analyticEventModel, InfoCalloutTileModel infoCalloutTileModel) {
        AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(formContent, "formContent");
        AbstractC22676k.m65750j(nextButton, "nextButton");
        this.navigationTitle = navigationTitle;
        this.title = title;
        this.subtitle = str;
        this.formContent = formContent;
        this.nextButton = nextButton;
        this.savingTitle = str2;
        this.savingSubtitle = str3;
        this.analyticEvent = analyticEventModel;
        this.callout = infoCalloutTileModel;
    }
}
