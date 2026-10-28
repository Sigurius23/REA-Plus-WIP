package com.whoop.hormonalinsights.menstrualcycleinsights.domain.models;

import androidx.core.app.FrameMetricsAggregator;
import com.whoop.design.models.items.DateSelectorModel;
import com.whoop.design.models.items.DateSelectorModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 B2\u00020\u0001:\u0002CBBO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010Bu\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0010\u0010#\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010 J\u0010\u0010&\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b*\u0010)J\u0010\u0010+\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b+\u0010)Jj\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010 J\u0010\u0010/\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00105\u001a\u0004\b7\u0010 R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b8\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b:\u0010$R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b;\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010<\u001a\u0004\b=\u0010'R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\b?\u0010)R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\b@\u0010)R\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010>\u001a\u0004\bA\u0010)¨\u0006D"}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;", "", "", "navigationTitle", "titleDisplay", "descriptionDisplay", "Lcom/whoop/design/models/items/DateSelectorModel;", "monthPicker", "buttonTitle", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCalendar;", "calendar", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;", "editingHiddenCycleModal", "editingCycleModal", "hidingCycleModal", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/DateSelectorModel;Ljava/lang/String;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCalendar;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/DateSelectorModel;Ljava/lang/String;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCalendar;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/whoop/design/models/items/DateSelectorModel;", "component5", "component6", "()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCalendar;", "component7", "()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/DateSelectorModel;Ljava/lang/String;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCalendar;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNavigationTitle", "getTitleDisplay", "getDescriptionDisplay", "Lcom/whoop/design/models/items/DateSelectorModel;", "getMonthPicker", "getButtonTitle", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCalendar;", "getCalendar", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;", "getEditingHiddenCycleModal", "getEditingCycleModal", "getHidingCycleModal", "Companion", "$serializer", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class LogCalendarResponse {
    private final String buttonTitle;
    private final MciCalendar calendar;
    private final String descriptionDisplay;
    private final HormonalInsightsConfirmDialog editingCycleModal;
    private final HormonalInsightsConfirmDialog editingHiddenCycleModal;
    private final HormonalInsightsConfirmDialog hidingCycleModal;
    private final DateSelectorModel monthPicker;
    private final String navigationTitle;
    private final String titleDisplay;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return LogCalendarResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ LogCalendarResponse(int i13, String str, String str2, String str3, DateSelectorModel dateSelectorModel, String str4, MciCalendar mciCalendar, HormonalInsightsConfirmDialog hormonalInsightsConfirmDialog, HormonalInsightsConfirmDialog hormonalInsightsConfirmDialog2, HormonalInsightsConfirmDialog hormonalInsightsConfirmDialog3, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i13 & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.throwMissingFieldException(i13, FrameMetricsAggregator.EVERY_DURATION, LogCalendarResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.navigationTitle = str;
        this.titleDisplay = str2;
        this.descriptionDisplay = str3;
        this.monthPicker = dateSelectorModel;
        this.buttonTitle = str4;
        this.calendar = mciCalendar;
        this.editingHiddenCycleModal = hormonalInsightsConfirmDialog;
        this.editingCycleModal = hormonalInsightsConfirmDialog2;
        this.hidingCycleModal = hormonalInsightsConfirmDialog3;
    }

    public static /* synthetic */ LogCalendarResponse copy$default(LogCalendarResponse logCalendarResponse, String str, String str2, String str3, DateSelectorModel dateSelectorModel, String str4, MciCalendar mciCalendar, HormonalInsightsConfirmDialog hormonalInsightsConfirmDialog, HormonalInsightsConfirmDialog hormonalInsightsConfirmDialog2, HormonalInsightsConfirmDialog hormonalInsightsConfirmDialog3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = logCalendarResponse.navigationTitle;
        }
        if ((i13 & 2) != 0) {
            str2 = logCalendarResponse.titleDisplay;
        }
        if ((i13 & 4) != 0) {
            str3 = logCalendarResponse.descriptionDisplay;
        }
        if ((i13 & 8) != 0) {
            dateSelectorModel = logCalendarResponse.monthPicker;
        }
        if ((i13 & 16) != 0) {
            str4 = logCalendarResponse.buttonTitle;
        }
        if ((i13 & 32) != 0) {
            mciCalendar = logCalendarResponse.calendar;
        }
        if ((i13 & 64) != 0) {
            hormonalInsightsConfirmDialog = logCalendarResponse.editingHiddenCycleModal;
        }
        if ((i13 & 128) != 0) {
            hormonalInsightsConfirmDialog2 = logCalendarResponse.editingCycleModal;
        }
        if ((i13 & 256) != 0) {
            hormonalInsightsConfirmDialog3 = logCalendarResponse.hidingCycleModal;
        }
        HormonalInsightsConfirmDialog hormonalInsightsConfirmDialog4 = hormonalInsightsConfirmDialog2;
        HormonalInsightsConfirmDialog hormonalInsightsConfirmDialog5 = hormonalInsightsConfirmDialog3;
        MciCalendar mciCalendar2 = mciCalendar;
        HormonalInsightsConfirmDialog hormonalInsightsConfirmDialog6 = hormonalInsightsConfirmDialog;
        String str5 = str4;
        String str6 = str3;
        return logCalendarResponse.copy(str, str2, str6, dateSelectorModel, str5, mciCalendar2, hormonalInsightsConfirmDialog6, hormonalInsightsConfirmDialog4, hormonalInsightsConfirmDialog5);
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(LogCalendarResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.navigationTitle);
        output.encodeStringElement(serialDesc, 1, self.titleDisplay);
        output.encodeStringElement(serialDesc, 2, self.descriptionDisplay);
        output.encodeSerializableElement(serialDesc, 3, DateSelectorModel$$serializer.INSTANCE, self.monthPicker);
        output.encodeStringElement(serialDesc, 4, self.buttonTitle);
        output.encodeSerializableElement(serialDesc, 5, MciCalendar$$serializer.INSTANCE, self.calendar);
        HormonalInsightsConfirmDialog$$serializer hormonalInsightsConfirmDialog$$serializer = HormonalInsightsConfirmDialog$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 6, hormonalInsightsConfirmDialog$$serializer, self.editingHiddenCycleModal);
        output.encodeSerializableElement(serialDesc, 7, hormonalInsightsConfirmDialog$$serializer, self.editingCycleModal);
        output.encodeSerializableElement(serialDesc, 8, hormonalInsightsConfirmDialog$$serializer, self.hidingCycleModal);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNavigationTitle() {
        return this.navigationTitle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final DateSelectorModel getMonthPicker() {
        return this.monthPicker;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final MciCalendar getCalendar() {
        return this.calendar;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final HormonalInsightsConfirmDialog getEditingHiddenCycleModal() {
        return this.editingHiddenCycleModal;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final HormonalInsightsConfirmDialog getEditingCycleModal() {
        return this.editingCycleModal;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final HormonalInsightsConfirmDialog getHidingCycleModal() {
        return this.hidingCycleModal;
    }

    public final LogCalendarResponse copy(String navigationTitle, String titleDisplay, String descriptionDisplay, DateSelectorModel monthPicker, String buttonTitle, MciCalendar calendar, HormonalInsightsConfirmDialog editingHiddenCycleModal, HormonalInsightsConfirmDialog editingCycleModal, HormonalInsightsConfirmDialog hidingCycleModal) {
        AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(descriptionDisplay, "descriptionDisplay");
        AbstractC22676k.m65750j(monthPicker, "monthPicker");
        AbstractC22676k.m65750j(buttonTitle, "buttonTitle");
        AbstractC22676k.m65750j(calendar, "calendar");
        AbstractC22676k.m65750j(editingHiddenCycleModal, "editingHiddenCycleModal");
        AbstractC22676k.m65750j(editingCycleModal, "editingCycleModal");
        AbstractC22676k.m65750j(hidingCycleModal, "hidingCycleModal");
        return new LogCalendarResponse(navigationTitle, titleDisplay, descriptionDisplay, monthPicker, buttonTitle, calendar, editingHiddenCycleModal, editingCycleModal, hidingCycleModal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogCalendarResponse)) {
            return false;
        }
        LogCalendarResponse logCalendarResponse = (LogCalendarResponse) other;
        return AbstractC22676k.m65745e(this.navigationTitle, logCalendarResponse.navigationTitle) && AbstractC22676k.m65745e(this.titleDisplay, logCalendarResponse.titleDisplay) && AbstractC22676k.m65745e(this.descriptionDisplay, logCalendarResponse.descriptionDisplay) && AbstractC22676k.m65745e(this.monthPicker, logCalendarResponse.monthPicker) && AbstractC22676k.m65745e(this.buttonTitle, logCalendarResponse.buttonTitle) && AbstractC22676k.m65745e(this.calendar, logCalendarResponse.calendar) && AbstractC22676k.m65745e(this.editingHiddenCycleModal, logCalendarResponse.editingHiddenCycleModal) && AbstractC22676k.m65745e(this.editingCycleModal, logCalendarResponse.editingCycleModal) && AbstractC22676k.m65745e(this.hidingCycleModal, logCalendarResponse.hidingCycleModal);
    }

    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    public final MciCalendar getCalendar() {
        return this.calendar;
    }

    public final String getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    public final HormonalInsightsConfirmDialog getEditingCycleModal() {
        return this.editingCycleModal;
    }

    public final HormonalInsightsConfirmDialog getEditingHiddenCycleModal() {
        return this.editingHiddenCycleModal;
    }

    public final HormonalInsightsConfirmDialog getHidingCycleModal() {
        return this.hidingCycleModal;
    }

    public final DateSelectorModel getMonthPicker() {
        return this.monthPicker;
    }

    public final String getNavigationTitle() {
        return this.navigationTitle;
    }

    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    public int hashCode() {
        return this.hidingCycleModal.hashCode() + ((this.editingCycleModal.hashCode() + ((this.editingHiddenCycleModal.hashCode() + ((this.calendar.hashCode() + AbstractC11266d.m30450d((this.monthPicker.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.navigationTitle.hashCode() * 31, 31, this.titleDisplay), 31, this.descriptionDisplay)) * 31, 31, this.buttonTitle)) * 31)) * 31)) * 31);
    }

    public String toString() {
        String str = this.navigationTitle;
        String str2 = this.titleDisplay;
        String str3 = this.descriptionDisplay;
        DateSelectorModel dateSelectorModel = this.monthPicker;
        String str4 = this.buttonTitle;
        MciCalendar mciCalendar = this.calendar;
        HormonalInsightsConfirmDialog hormonalInsightsConfirmDialog = this.editingHiddenCycleModal;
        HormonalInsightsConfirmDialog hormonalInsightsConfirmDialog2 = this.editingCycleModal;
        HormonalInsightsConfirmDialog hormonalInsightsConfirmDialog3 = this.hidingCycleModal;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("LogCalendarResponse(navigationTitle=", str, ", titleDisplay=", str2, ", descriptionDisplay=");
        sbM32001t.append(str3);
        sbM32001t.append(", monthPicker=");
        sbM32001t.append(dateSelectorModel);
        sbM32001t.append(", buttonTitle=");
        sbM32001t.append(str4);
        sbM32001t.append(", calendar=");
        sbM32001t.append(mciCalendar);
        sbM32001t.append(", editingHiddenCycleModal=");
        sbM32001t.append(hormonalInsightsConfirmDialog);
        sbM32001t.append(", editingCycleModal=");
        sbM32001t.append(hormonalInsightsConfirmDialog2);
        sbM32001t.append(", hidingCycleModal=");
        sbM32001t.append(hormonalInsightsConfirmDialog3);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public LogCalendarResponse(String navigationTitle, String titleDisplay, String descriptionDisplay, DateSelectorModel monthPicker, String buttonTitle, MciCalendar calendar, HormonalInsightsConfirmDialog editingHiddenCycleModal, HormonalInsightsConfirmDialog editingCycleModal, HormonalInsightsConfirmDialog hidingCycleModal) {
        AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(descriptionDisplay, "descriptionDisplay");
        AbstractC22676k.m65750j(monthPicker, "monthPicker");
        AbstractC22676k.m65750j(buttonTitle, "buttonTitle");
        AbstractC22676k.m65750j(calendar, "calendar");
        AbstractC22676k.m65750j(editingHiddenCycleModal, "editingHiddenCycleModal");
        AbstractC22676k.m65750j(editingCycleModal, "editingCycleModal");
        AbstractC22676k.m65750j(hidingCycleModal, "hidingCycleModal");
        this.navigationTitle = navigationTitle;
        this.titleDisplay = titleDisplay;
        this.descriptionDisplay = descriptionDisplay;
        this.monthPicker = monthPicker;
        this.buttonTitle = buttonTitle;
        this.calendar = calendar;
        this.editingHiddenCycleModal = editingHiddenCycleModal;
        this.editingCycleModal = editingCycleModal;
        this.hidingCycleModal = hidingCycleModal;
    }
}
