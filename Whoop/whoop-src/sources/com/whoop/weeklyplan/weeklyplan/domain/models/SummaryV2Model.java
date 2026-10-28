package com.whoop.weeklyplan.weeklyplan.domain.models;

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

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 B2\u00020\u0001:\u0002CBBS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010Bk\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010 J\u0012\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b)\u0010(J\u0012\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b*\u0010+Jj\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010 J\u0010\u0010/\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010 R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00105\u001a\u0004\b7\u0010 R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00108\u001a\u0004\b9\u0010#R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b:\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\b<\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010=\u001a\u0004\b>\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010=\u001a\u0004\b?\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010@\u001a\u0004\bA\u0010+¨\u0006D"}, m65681d2 = {"Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;", "", "", "titleDisplay", "subtitleDisplay", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;", "headerDisplay", "descriptionDisplay", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;", "summaryV2", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;", "primaryButton", "secondaryButton", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/MetaData;", "metadata", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;Lcom/whoop/weeklyplan/weeklyplan/domain/models/MetaData;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;Lcom/whoop/weeklyplan/weeklyplan/domain/models/MetaData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weekly_plan_release", "(Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;", "component4", "component5", "()Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;", "component6", "()Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;", "component7", "component8", "()Lcom/whoop/weeklyplan/weeklyplan/domain/models/MetaData;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;Lcom/whoop/weeklyplan/weeklyplan/domain/models/MetaData;)Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitleDisplay", "getSubtitleDisplay", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;", "getHeaderDisplay", "getDescriptionDisplay", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;", "getSummaryV2", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;", "getPrimaryButton", "getSecondaryButton", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/MetaData;", "getMetadata", "Companion", "$serializer", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SummaryV2Model {
    private final String descriptionDisplay;
    private final StyledString headerDisplay;
    private final MetaData metadata;
    private final ButtonInfo primaryButton;
    private final ButtonInfo secondaryButton;
    private final String subtitleDisplay;
    private final NewSummary summaryV2;
    private final String titleDisplay;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;", "serializer", "()Lwc3/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SummaryV2Model$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SummaryV2Model(int i13, String str, String str2, StyledString styledString, String str3, NewSummary newSummary, ButtonInfo buttonInfo, ButtonInfo buttonInfo2, MetaData metaData, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, SummaryV2Model$$serializer.INSTANCE.getDescriptor());
        }
        this.titleDisplay = str;
        this.subtitleDisplay = str2;
        this.headerDisplay = styledString;
        this.descriptionDisplay = str3;
        this.summaryV2 = newSummary;
        this.primaryButton = buttonInfo;
        this.secondaryButton = buttonInfo2;
        if ((i13 & 128) == 0) {
            this.metadata = null;
        } else {
            this.metadata = metaData;
        }
    }

    public static /* synthetic */ SummaryV2Model copy$default(SummaryV2Model summaryV2Model, String str, String str2, StyledString styledString, String str3, NewSummary newSummary, ButtonInfo buttonInfo, ButtonInfo buttonInfo2, MetaData metaData, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = summaryV2Model.titleDisplay;
        }
        if ((i13 & 2) != 0) {
            str2 = summaryV2Model.subtitleDisplay;
        }
        if ((i13 & 4) != 0) {
            styledString = summaryV2Model.headerDisplay;
        }
        if ((i13 & 8) != 0) {
            str3 = summaryV2Model.descriptionDisplay;
        }
        if ((i13 & 16) != 0) {
            newSummary = summaryV2Model.summaryV2;
        }
        if ((i13 & 32) != 0) {
            buttonInfo = summaryV2Model.primaryButton;
        }
        if ((i13 & 64) != 0) {
            buttonInfo2 = summaryV2Model.secondaryButton;
        }
        if ((i13 & 128) != 0) {
            metaData = summaryV2Model.metadata;
        }
        ButtonInfo buttonInfo3 = buttonInfo2;
        MetaData metaData2 = metaData;
        NewSummary newSummary2 = newSummary;
        ButtonInfo buttonInfo4 = buttonInfo;
        return summaryV2Model.copy(str, str2, styledString, str3, newSummary2, buttonInfo4, buttonInfo3, metaData2);
    }

    public static final /* synthetic */ void write$Self$weekly_plan_release(SummaryV2Model self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.titleDisplay);
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.subtitleDisplay);
        output.encodeSerializableElement(serialDesc, 2, StyledString$$serializer.INSTANCE, self.headerDisplay);
        output.encodeStringElement(serialDesc, 3, self.descriptionDisplay);
        output.encodeNullableSerializableElement(serialDesc, 4, NewSummary$$serializer.INSTANCE, self.summaryV2);
        ButtonInfo$$serializer buttonInfo$$serializer = ButtonInfo$$serializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 5, buttonInfo$$serializer, self.primaryButton);
        output.encodeNullableSerializableElement(serialDesc, 6, buttonInfo$$serializer, self.secondaryButton);
        if (!output.shouldEncodeElementDefault(serialDesc, 7) && self.metadata == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 7, MetaData$$serializer.INSTANCE, self.metadata);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubtitleDisplay() {
        return this.subtitleDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final StyledString getHeaderDisplay() {
        return this.headerDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final NewSummary getSummaryV2() {
        return this.summaryV2;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ButtonInfo getPrimaryButton() {
        return this.primaryButton;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ButtonInfo getSecondaryButton() {
        return this.secondaryButton;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final MetaData getMetadata() {
        return this.metadata;
    }

    public final SummaryV2Model copy(String titleDisplay, String subtitleDisplay, StyledString headerDisplay, String descriptionDisplay, NewSummary summaryV2, ButtonInfo primaryButton, ButtonInfo secondaryButton, MetaData metadata) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(headerDisplay, "headerDisplay");
        AbstractC22676k.m65750j(descriptionDisplay, "descriptionDisplay");
        return new SummaryV2Model(titleDisplay, subtitleDisplay, headerDisplay, descriptionDisplay, summaryV2, primaryButton, secondaryButton, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SummaryV2Model)) {
            return false;
        }
        SummaryV2Model summaryV2Model = (SummaryV2Model) other;
        return AbstractC22676k.m65745e(this.titleDisplay, summaryV2Model.titleDisplay) && AbstractC22676k.m65745e(this.subtitleDisplay, summaryV2Model.subtitleDisplay) && AbstractC22676k.m65745e(this.headerDisplay, summaryV2Model.headerDisplay) && AbstractC22676k.m65745e(this.descriptionDisplay, summaryV2Model.descriptionDisplay) && AbstractC22676k.m65745e(this.summaryV2, summaryV2Model.summaryV2) && AbstractC22676k.m65745e(this.primaryButton, summaryV2Model.primaryButton) && AbstractC22676k.m65745e(this.secondaryButton, summaryV2Model.secondaryButton) && AbstractC22676k.m65745e(this.metadata, summaryV2Model.metadata);
    }

    public final String getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    public final StyledString getHeaderDisplay() {
        return this.headerDisplay;
    }

    public final MetaData getMetadata() {
        return this.metadata;
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

    public final NewSummary getSummaryV2() {
        return this.summaryV2;
    }

    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    public int hashCode() {
        int iHashCode = this.titleDisplay.hashCode() * 31;
        String str = this.subtitleDisplay;
        int iM30450d = AbstractC11266d.m30450d((this.headerDisplay.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.descriptionDisplay);
        NewSummary newSummary = this.summaryV2;
        int iHashCode2 = (iM30450d + (newSummary == null ? 0 : newSummary.hashCode())) * 31;
        ButtonInfo buttonInfo = this.primaryButton;
        int iHashCode3 = (iHashCode2 + (buttonInfo == null ? 0 : buttonInfo.hashCode())) * 31;
        ButtonInfo buttonInfo2 = this.secondaryButton;
        int iHashCode4 = (iHashCode3 + (buttonInfo2 == null ? 0 : buttonInfo2.hashCode())) * 31;
        MetaData metaData = this.metadata;
        return iHashCode4 + (metaData != null ? metaData.hashCode() : 0);
    }

    public String toString() {
        String str = this.titleDisplay;
        String str2 = this.subtitleDisplay;
        StyledString styledString = this.headerDisplay;
        String str3 = this.descriptionDisplay;
        NewSummary newSummary = this.summaryV2;
        ButtonInfo buttonInfo = this.primaryButton;
        ButtonInfo buttonInfo2 = this.secondaryButton;
        MetaData metaData = this.metadata;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SummaryV2Model(titleDisplay=", str, ", subtitleDisplay=", str2, ", headerDisplay=");
        sbM32001t.append(styledString);
        sbM32001t.append(", descriptionDisplay=");
        sbM32001t.append(str3);
        sbM32001t.append(", summaryV2=");
        sbM32001t.append(newSummary);
        sbM32001t.append(", primaryButton=");
        sbM32001t.append(buttonInfo);
        sbM32001t.append(", secondaryButton=");
        sbM32001t.append(buttonInfo2);
        sbM32001t.append(", metadata=");
        sbM32001t.append(metaData);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public SummaryV2Model(String titleDisplay, String str, StyledString headerDisplay, String descriptionDisplay, NewSummary newSummary, ButtonInfo buttonInfo, ButtonInfo buttonInfo2, MetaData metaData) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(headerDisplay, "headerDisplay");
        AbstractC22676k.m65750j(descriptionDisplay, "descriptionDisplay");
        this.titleDisplay = titleDisplay;
        this.subtitleDisplay = str;
        this.headerDisplay = headerDisplay;
        this.descriptionDisplay = descriptionDisplay;
        this.summaryV2 = newSummary;
        this.primaryButton = buttonInfo;
        this.secondaryButton = buttonInfo2;
        this.metadata = metaData;
    }

    public /* synthetic */ SummaryV2Model(String str, String str2, StyledString styledString, String str3, NewSummary newSummary, ButtonInfo buttonInfo, ButtonInfo buttonInfo2, MetaData metaData, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, styledString, str3, newSummary, buttonInfo, buttonInfo2, (i13 & 128) != 0 ? null : metaData);
    }
}
