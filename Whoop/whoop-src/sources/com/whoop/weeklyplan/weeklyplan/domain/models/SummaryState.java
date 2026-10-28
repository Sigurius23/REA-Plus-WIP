package com.whoop.weeklyplan.weeklyplan.domain.models;

import ad3.C0771n;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import l83.InterfaceC23457c;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 Q2\u00020\u0001:\u0002RQBg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\u0089\u0001\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001cJ\u0012\u0010&\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b*\u0010)J\u0010\u0010+\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0086\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u0012HÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b/\u0010\u001cJ\u0010\u00100\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00103\u001a\u00020\u00062\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104J'\u0010=\u001a\u00020:2\u0006\u00105\u001a\u00020\u00002\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0001¢\u0006\u0004\b;\u0010<R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010>\u001a\u0004\b?\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010>\u001a\u0004\b@\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010>\u001a\u0004\bA\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010B\u001a\u0004\b\u0007\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010C\u001a\u0004\bD\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010E\u001a\u0004\bF\u0010$R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\bG\u0010\u001cR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010H\u001a\u0004\bI\u0010'R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010J\u001a\u0004\bK\u0010)R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010J\u001a\u0004\bL\u0010)R \u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010M\u0012\u0004\bO\u0010P\u001a\u0004\bN\u0010,¨\u0006S"}, m65681d2 = {"Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;", "", "", "planId", "titleDisplay", "subtitleDisplay", "", "isDismissible", "Lkotlinx/serialization/json/JsonElement;", "animation", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;", "headerDisplay", "descriptionDisplay", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;", "summaryV2", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;", "primaryButton", "secondaryButton", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/Summary;", "summary", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlinx/serialization/json/JsonElement;Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;Lcom/whoop/weeklyplan/weeklyplan/domain/models/Summary;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlinx/serialization/json/JsonElement;Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;Lcom/whoop/weeklyplan/weeklyplan/domain/models/Summary;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/lang/Boolean;", "component5", "()Lkotlinx/serialization/json/JsonElement;", "component6", "()Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;", "component7", "component8", "()Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;", "component9", "()Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;", "component10", "component11", "()Lcom/whoop/weeklyplan/weeklyplan/domain/models/Summary;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlinx/serialization/json/JsonElement;Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;Lcom/whoop/weeklyplan/weeklyplan/domain/models/Summary;)Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weekly_plan_release", "(Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getPlanId", "getTitleDisplay", "getSubtitleDisplay", "Ljava/lang/Boolean;", "Lkotlinx/serialization/json/JsonElement;", "getAnimation", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;", "getHeaderDisplay", "getDescriptionDisplay", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;", "getSummaryV2", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;", "getPrimaryButton", "getSecondaryButton", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/Summary;", "getSummary", "getSummary$annotations", "()V", "Companion", "$serializer", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SummaryState {
    private final JsonElement animation;
    private final String descriptionDisplay;
    private final StyledString headerDisplay;
    private final Boolean isDismissible;
    private final String planId;
    private final ButtonInfo primaryButton;
    private final ButtonInfo secondaryButton;
    private final String subtitleDisplay;
    private final Summary summary;
    private final NewSummary summaryV2;
    private final String titleDisplay;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;", "serializer", "()Lwc3/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SummaryState$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SummaryState(int i13, String str, String str2, String str3, Boolean bool, JsonElement jsonElement, StyledString styledString, String str4, NewSummary newSummary, ButtonInfo buttonInfo, ButtonInfo buttonInfo2, Summary summary, SerializationConstructorMarker serializationConstructorMarker) {
        if (2047 != (i13 & 2047)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 2047, SummaryState$$serializer.INSTANCE.getDescriptor());
        }
        this.planId = str;
        this.titleDisplay = str2;
        this.subtitleDisplay = str3;
        this.isDismissible = bool;
        this.animation = jsonElement;
        this.headerDisplay = styledString;
        this.descriptionDisplay = str4;
        this.summaryV2 = newSummary;
        this.primaryButton = buttonInfo;
        this.secondaryButton = buttonInfo2;
        this.summary = summary;
    }

    public static /* synthetic */ SummaryState copy$default(SummaryState summaryState, String str, String str2, String str3, Boolean bool, JsonElement jsonElement, StyledString styledString, String str4, NewSummary newSummary, ButtonInfo buttonInfo, ButtonInfo buttonInfo2, Summary summary, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = summaryState.planId;
        }
        if ((i13 & 2) != 0) {
            str2 = summaryState.titleDisplay;
        }
        if ((i13 & 4) != 0) {
            str3 = summaryState.subtitleDisplay;
        }
        if ((i13 & 8) != 0) {
            bool = summaryState.isDismissible;
        }
        if ((i13 & 16) != 0) {
            jsonElement = summaryState.animation;
        }
        if ((i13 & 32) != 0) {
            styledString = summaryState.headerDisplay;
        }
        if ((i13 & 64) != 0) {
            str4 = summaryState.descriptionDisplay;
        }
        if ((i13 & 128) != 0) {
            newSummary = summaryState.summaryV2;
        }
        if ((i13 & 256) != 0) {
            buttonInfo = summaryState.primaryButton;
        }
        if ((i13 & 512) != 0) {
            buttonInfo2 = summaryState.secondaryButton;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            summary = summaryState.summary;
        }
        ButtonInfo buttonInfo3 = buttonInfo2;
        Summary summary2 = summary;
        NewSummary newSummary2 = newSummary;
        ButtonInfo buttonInfo4 = buttonInfo;
        StyledString styledString2 = styledString;
        String str5 = str4;
        JsonElement jsonElement2 = jsonElement;
        String str6 = str3;
        return summaryState.copy(str, str2, str6, bool, jsonElement2, styledString2, str5, newSummary2, buttonInfo4, buttonInfo3, summary2);
    }

    @InterfaceC23457c
    public static /* synthetic */ void getSummary$annotations() {
    }

    public static final /* synthetic */ void write$Self$weekly_plan_release(SummaryState self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.planId);
        output.encodeStringElement(serialDesc, 1, self.titleDisplay);
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.subtitleDisplay);
        output.encodeNullableSerializableElement(serialDesc, 3, BooleanSerializer.INSTANCE, self.isDismissible);
        output.encodeSerializableElement(serialDesc, 4, C0771n.f2806a, self.animation);
        output.encodeSerializableElement(serialDesc, 5, StyledString$$serializer.INSTANCE, self.headerDisplay);
        output.encodeStringElement(serialDesc, 6, self.descriptionDisplay);
        output.encodeNullableSerializableElement(serialDesc, 7, NewSummary$$serializer.INSTANCE, self.summaryV2);
        ButtonInfo$$serializer buttonInfo$$serializer = ButtonInfo$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 8, buttonInfo$$serializer, self.primaryButton);
        output.encodeNullableSerializableElement(serialDesc, 9, buttonInfo$$serializer, self.secondaryButton);
        output.encodeSerializableElement(serialDesc, 10, Summary$$serializer.INSTANCE, self.summary);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPlanId() {
        return this.planId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final ButtonInfo getSecondaryButton() {
        return this.secondaryButton;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Summary getSummary() {
        return this.summary;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubtitleDisplay() {
        return this.subtitleDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getIsDismissible() {
        return this.isDismissible;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final JsonElement getAnimation() {
        return this.animation;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final StyledString getHeaderDisplay() {
        return this.headerDisplay;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final NewSummary getSummaryV2() {
        return this.summaryV2;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final ButtonInfo getPrimaryButton() {
        return this.primaryButton;
    }

    public final SummaryState copy(String planId, String titleDisplay, String subtitleDisplay, Boolean isDismissible, JsonElement animation, StyledString headerDisplay, String descriptionDisplay, NewSummary summaryV2, ButtonInfo primaryButton, ButtonInfo secondaryButton, Summary summary) {
        AbstractC22676k.m65750j(planId, "planId");
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(animation, "animation");
        AbstractC22676k.m65750j(headerDisplay, "headerDisplay");
        AbstractC22676k.m65750j(descriptionDisplay, "descriptionDisplay");
        AbstractC22676k.m65750j(primaryButton, "primaryButton");
        AbstractC22676k.m65750j(summary, "summary");
        return new SummaryState(planId, titleDisplay, subtitleDisplay, isDismissible, animation, headerDisplay, descriptionDisplay, summaryV2, primaryButton, secondaryButton, summary);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SummaryState)) {
            return false;
        }
        SummaryState summaryState = (SummaryState) other;
        return AbstractC22676k.m65745e(this.planId, summaryState.planId) && AbstractC22676k.m65745e(this.titleDisplay, summaryState.titleDisplay) && AbstractC22676k.m65745e(this.subtitleDisplay, summaryState.subtitleDisplay) && AbstractC22676k.m65745e(this.isDismissible, summaryState.isDismissible) && AbstractC22676k.m65745e(this.animation, summaryState.animation) && AbstractC22676k.m65745e(this.headerDisplay, summaryState.headerDisplay) && AbstractC22676k.m65745e(this.descriptionDisplay, summaryState.descriptionDisplay) && AbstractC22676k.m65745e(this.summaryV2, summaryState.summaryV2) && AbstractC22676k.m65745e(this.primaryButton, summaryState.primaryButton) && AbstractC22676k.m65745e(this.secondaryButton, summaryState.secondaryButton) && AbstractC22676k.m65745e(this.summary, summaryState.summary);
    }

    public final JsonElement getAnimation() {
        return this.animation;
    }

    public final String getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    public final StyledString getHeaderDisplay() {
        return this.headerDisplay;
    }

    public final String getPlanId() {
        return this.planId;
    }

    public final ButtonInfo getPrimaryButton() {
        return this.primaryButton;
    }

    public final ButtonInfo getSecondaryButton() {
        return this.secondaryButton;
    }

    public final String getSubtitleDisplay() {
        return this.subtitleDisplay;
    }

    public final Summary getSummary() {
        return this.summary;
    }

    public final NewSummary getSummaryV2() {
        return this.summaryV2;
    }

    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.planId.hashCode() * 31, 31, this.titleDisplay);
        String str = this.subtitleDisplay;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isDismissible;
        int iM30450d2 = AbstractC11266d.m30450d((this.headerDisplay.hashCode() + ((this.animation.hashCode() + ((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31)) * 31)) * 31, 31, this.descriptionDisplay);
        NewSummary newSummary = this.summaryV2;
        int iHashCode2 = (this.primaryButton.hashCode() + ((iM30450d2 + (newSummary == null ? 0 : newSummary.hashCode())) * 31)) * 31;
        ButtonInfo buttonInfo = this.secondaryButton;
        return this.summary.hashCode() + ((iHashCode2 + (buttonInfo != null ? buttonInfo.hashCode() : 0)) * 31);
    }

    public final Boolean isDismissible() {
        return this.isDismissible;
    }

    public String toString() {
        String str = this.planId;
        String str2 = this.titleDisplay;
        String str3 = this.subtitleDisplay;
        Boolean bool = this.isDismissible;
        JsonElement jsonElement = this.animation;
        StyledString styledString = this.headerDisplay;
        String str4 = this.descriptionDisplay;
        NewSummary newSummary = this.summaryV2;
        ButtonInfo buttonInfo = this.primaryButton;
        ButtonInfo buttonInfo2 = this.secondaryButton;
        Summary summary = this.summary;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SummaryState(planId=", str, ", titleDisplay=", str2, ", subtitleDisplay=");
        AbstractC36095b.m114692t(bool, str3, ", isDismissible=", ", animation=", sbM32001t);
        sbM32001t.append(jsonElement);
        sbM32001t.append(", headerDisplay=");
        sbM32001t.append(styledString);
        sbM32001t.append(", descriptionDisplay=");
        sbM32001t.append(str4);
        sbM32001t.append(", summaryV2=");
        sbM32001t.append(newSummary);
        sbM32001t.append(", primaryButton=");
        sbM32001t.append(buttonInfo);
        sbM32001t.append(", secondaryButton=");
        sbM32001t.append(buttonInfo2);
        sbM32001t.append(", summary=");
        sbM32001t.append(summary);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public SummaryState(String planId, String titleDisplay, String str, Boolean bool, JsonElement animation, StyledString headerDisplay, String descriptionDisplay, NewSummary newSummary, ButtonInfo primaryButton, ButtonInfo buttonInfo, Summary summary) {
        AbstractC22676k.m65750j(planId, "planId");
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(animation, "animation");
        AbstractC22676k.m65750j(headerDisplay, "headerDisplay");
        AbstractC22676k.m65750j(descriptionDisplay, "descriptionDisplay");
        AbstractC22676k.m65750j(primaryButton, "primaryButton");
        AbstractC22676k.m65750j(summary, "summary");
        this.planId = planId;
        this.titleDisplay = titleDisplay;
        this.subtitleDisplay = str;
        this.isDismissible = bool;
        this.animation = animation;
        this.headerDisplay = headerDisplay;
        this.descriptionDisplay = descriptionDisplay;
        this.summaryV2 = newSummary;
        this.primaryButton = primaryButton;
        this.secondaryButton = buttonInfo;
        this.summary = summary;
    }
}
