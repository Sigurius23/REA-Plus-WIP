package com.whoop.data.remote.domain.dto;

import com.google.gson.annotations.SerializedName;
import com.whoop.data.remote.domain.response.journal.JournalMetadata;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b(\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0002EDB=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fBU\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b+\u0010,JR\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b/\u0010$J\u0010\u00100\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00103\u001a\u00020\u00022\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010\"R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u0010$R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b:\u0010&R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\b<\u0010(R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010=\u0012\u0004\b?\u0010@\u001a\u0004\b>\u0010*R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010A\u0012\u0004\bC\u0010@\u001a\u0004\bB\u0010,¨\u0006F"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;", "", "", "showGradient", "", "headerText", "Lcom/whoop/data/remote/domain/dto/JournalBounds;", "journalBounds", "Lcom/whoop/data/remote/domain/dto/SubtitleCallout;", "subtitleCallout", "Lcom/whoop/data/remote/domain/dto/DatePickerInfo;", "datePickerInfo", "Lcom/whoop/data/remote/domain/dto/NavigationButton;", "navigationButton", "<init>", "(ZLjava/lang/String;Lcom/whoop/data/remote/domain/dto/JournalBounds;Lcom/whoop/data/remote/domain/dto/SubtitleCallout;Lcom/whoop/data/remote/domain/dto/DatePickerInfo;Lcom/whoop/data/remote/domain/dto/NavigationButton;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLjava/lang/String;Lcom/whoop/data/remote/domain/dto/JournalBounds;Lcom/whoop/data/remote/domain/dto/SubtitleCallout;Lcom/whoop/data/remote/domain/dto/DatePickerInfo;Lcom/whoop/data/remote/domain/dto/NavigationButton;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/data/remote/domain/response/journal/JournalMetadata;", "toJournalEntryMetadata", "()Lcom/whoop/data/remote/domain/response/journal/JournalMetadata;", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "()Lcom/whoop/data/remote/domain/dto/JournalBounds;", "component4", "()Lcom/whoop/data/remote/domain/dto/SubtitleCallout;", "component5", "()Lcom/whoop/data/remote/domain/dto/DatePickerInfo;", "component6", "()Lcom/whoop/data/remote/domain/dto/NavigationButton;", "copy", "(ZLjava/lang/String;Lcom/whoop/data/remote/domain/dto/JournalBounds;Lcom/whoop/data/remote/domain/dto/SubtitleCallout;Lcom/whoop/data/remote/domain/dto/DatePickerInfo;Lcom/whoop/data/remote/domain/dto/NavigationButton;)Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShowGradient", "Ljava/lang/String;", "getHeaderText", "Lcom/whoop/data/remote/domain/dto/JournalBounds;", "getJournalBounds", "Lcom/whoop/data/remote/domain/dto/SubtitleCallout;", "getSubtitleCallout", "Lcom/whoop/data/remote/domain/dto/DatePickerInfo;", "getDatePickerInfo", "getDatePickerInfo$annotations", "()V", "Lcom/whoop/data/remote/domain/dto/NavigationButton;", "getNavigationButton", "getNavigationButton$annotations", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class JournalEntryMetadataDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("date_picker")
    private final DatePickerInfo datePickerInfo;

    @SerializedName("header_text")
    private final String headerText;

    @SerializedName("journal_bounds")
    private final JournalBounds journalBounds;

    @SerializedName("button")
    private final NavigationButton navigationButton;

    @SerializedName("show_gradient")
    private final boolean showGradient;

    @SerializedName("subtitle_callout")
    private final SubtitleCallout subtitleCallout;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return JournalEntryMetadataDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ JournalEntryMetadataDto(int i13, boolean z4, String str, JournalBounds journalBounds, SubtitleCallout subtitleCallout, DatePickerInfo datePickerInfo, NavigationButton navigationButton, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, JournalEntryMetadataDto$$serializer.INSTANCE.getDescriptor());
        }
        this.showGradient = z4;
        this.headerText = str;
        this.journalBounds = journalBounds;
        this.subtitleCallout = subtitleCallout;
        this.datePickerInfo = datePickerInfo;
        this.navigationButton = navigationButton;
    }

    public static /* synthetic */ JournalEntryMetadataDto copy$default(JournalEntryMetadataDto journalEntryMetadataDto, boolean z4, String str, JournalBounds journalBounds, SubtitleCallout subtitleCallout, DatePickerInfo datePickerInfo, NavigationButton navigationButton, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = journalEntryMetadataDto.showGradient;
        }
        if ((i13 & 2) != 0) {
            str = journalEntryMetadataDto.headerText;
        }
        if ((i13 & 4) != 0) {
            journalBounds = journalEntryMetadataDto.journalBounds;
        }
        if ((i13 & 8) != 0) {
            subtitleCallout = journalEntryMetadataDto.subtitleCallout;
        }
        if ((i13 & 16) != 0) {
            datePickerInfo = journalEntryMetadataDto.datePickerInfo;
        }
        if ((i13 & 32) != 0) {
            navigationButton = journalEntryMetadataDto.navigationButton;
        }
        DatePickerInfo datePickerInfo2 = datePickerInfo;
        NavigationButton navigationButton2 = navigationButton;
        return journalEntryMetadataDto.copy(z4, str, journalBounds, subtitleCallout, datePickerInfo2, navigationButton2);
    }

    @InterfaceC37143h("date_picker")
    public static /* synthetic */ void getDatePickerInfo$annotations() {
    }

    @InterfaceC37143h("button")
    public static /* synthetic */ void getNavigationButton$annotations() {
    }

    public static final /* synthetic */ void write$Self$core_release(JournalEntryMetadataDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeBooleanElement(serialDesc, 0, self.showGradient);
        output.encodeStringElement(serialDesc, 1, self.headerText);
        output.encodeSerializableElement(serialDesc, 2, JournalBounds$$serializer.INSTANCE, self.journalBounds);
        output.encodeNullableSerializableElement(serialDesc, 3, SubtitleCallout$$serializer.INSTANCE, self.subtitleCallout);
        output.encodeNullableSerializableElement(serialDesc, 4, DatePickerInfo$$serializer.INSTANCE, self.datePickerInfo);
        output.encodeNullableSerializableElement(serialDesc, 5, NavigationButton$$serializer.INSTANCE, self.navigationButton);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getShowGradient() {
        return this.showGradient;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHeaderText() {
        return this.headerText;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final JournalBounds getJournalBounds() {
        return this.journalBounds;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SubtitleCallout getSubtitleCallout() {
        return this.subtitleCallout;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final DatePickerInfo getDatePickerInfo() {
        return this.datePickerInfo;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final NavigationButton getNavigationButton() {
        return this.navigationButton;
    }

    public final JournalEntryMetadataDto copy(boolean showGradient, String headerText, JournalBounds journalBounds, SubtitleCallout subtitleCallout, DatePickerInfo datePickerInfo, NavigationButton navigationButton) {
        AbstractC22676k.m65750j(headerText, "headerText");
        AbstractC22676k.m65750j(journalBounds, "journalBounds");
        return new JournalEntryMetadataDto(showGradient, headerText, journalBounds, subtitleCallout, datePickerInfo, navigationButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JournalEntryMetadataDto)) {
            return false;
        }
        JournalEntryMetadataDto journalEntryMetadataDto = (JournalEntryMetadataDto) other;
        return this.showGradient == journalEntryMetadataDto.showGradient && AbstractC22676k.m65745e(this.headerText, journalEntryMetadataDto.headerText) && AbstractC22676k.m65745e(this.journalBounds, journalEntryMetadataDto.journalBounds) && AbstractC22676k.m65745e(this.subtitleCallout, journalEntryMetadataDto.subtitleCallout) && AbstractC22676k.m65745e(this.datePickerInfo, journalEntryMetadataDto.datePickerInfo) && AbstractC22676k.m65745e(this.navigationButton, journalEntryMetadataDto.navigationButton);
    }

    public final DatePickerInfo getDatePickerInfo() {
        return this.datePickerInfo;
    }

    public final String getHeaderText() {
        return this.headerText;
    }

    public final JournalBounds getJournalBounds() {
        return this.journalBounds;
    }

    public final NavigationButton getNavigationButton() {
        return this.navigationButton;
    }

    public final boolean getShowGradient() {
        return this.showGradient;
    }

    public final SubtitleCallout getSubtitleCallout() {
        return this.subtitleCallout;
    }

    public int hashCode() {
        int iHashCode = (this.journalBounds.hashCode() + AbstractC11266d.m30450d(Boolean.hashCode(this.showGradient) * 31, 31, this.headerText)) * 31;
        SubtitleCallout subtitleCallout = this.subtitleCallout;
        int iHashCode2 = (iHashCode + (subtitleCallout == null ? 0 : subtitleCallout.hashCode())) * 31;
        DatePickerInfo datePickerInfo = this.datePickerInfo;
        int iHashCode3 = (iHashCode2 + (datePickerInfo == null ? 0 : datePickerInfo.hashCode())) * 31;
        NavigationButton navigationButton = this.navigationButton;
        return iHashCode3 + (navigationButton != null ? navigationButton.hashCode() : 0);
    }

    public final JournalMetadata toJournalEntryMetadata() {
        return new JournalMetadata(this.showGradient, this.headerText, this.journalBounds, this.subtitleCallout, this.datePickerInfo, this.navigationButton);
    }

    public String toString() {
        boolean z4 = this.showGradient;
        String str = this.headerText;
        JournalBounds journalBounds = this.journalBounds;
        SubtitleCallout subtitleCallout = this.subtitleCallout;
        DatePickerInfo datePickerInfo = this.datePickerInfo;
        NavigationButton navigationButton = this.navigationButton;
        StringBuilder sbM38567n = AbstractC13673n.m38567n("JournalEntryMetadataDto(showGradient=", ", headerText=", str, ", journalBounds=", z4);
        sbM38567n.append(journalBounds);
        sbM38567n.append(", subtitleCallout=");
        sbM38567n.append(subtitleCallout);
        sbM38567n.append(", datePickerInfo=");
        sbM38567n.append(datePickerInfo);
        sbM38567n.append(", navigationButton=");
        sbM38567n.append(navigationButton);
        sbM38567n.append(")");
        return sbM38567n.toString();
    }

    public JournalEntryMetadataDto(boolean z4, String headerText, JournalBounds journalBounds, SubtitleCallout subtitleCallout, DatePickerInfo datePickerInfo, NavigationButton navigationButton) {
        AbstractC22676k.m65750j(headerText, "headerText");
        AbstractC22676k.m65750j(journalBounds, "journalBounds");
        this.showGradient = z4;
        this.headerText = headerText;
        this.journalBounds = journalBounds;
        this.subtitleCallout = subtitleCallout;
        this.datePickerInfo = datePickerInfo;
        this.navigationButton = navigationButton;
    }
}
