package com.whoop.hormonalinsights.menstrualcycleinsights.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.DateSelectorModel;
import com.whoop.design.models.items.DateSelectorModel$$serializer;
import com.whoop.design.models.items.FabMenuModel;
import com.whoop.design.models.items.FabMenuModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!J<\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b5\u0010!¨\u00068"}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CalendarTileModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/items/DateSelectorModel;", "datePicker", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCalendar;", "calendar", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/BackToTodayModel;", "backToToday", "Lcom/whoop/design/models/items/FabMenuModel;", "fabMenu", "<init>", "(Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCalendar;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/BackToTodayModel;Lcom/whoop/design/models/items/FabMenuModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCalendar;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/BackToTodayModel;Lcom/whoop/design/models/items/FabMenuModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CalendarTileModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/models/items/DateSelectorModel;", "component2", "()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCalendar;", "component3", "()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/BackToTodayModel;", "component4", "()Lcom/whoop/design/models/items/FabMenuModel;", "copy", "(Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCalendar;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/BackToTodayModel;Lcom/whoop/design/models/items/FabMenuModel;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CalendarTileModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/items/DateSelectorModel;", "getDatePicker", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCalendar;", "getCalendar", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/BackToTodayModel;", "getBackToToday", "Lcom/whoop/design/models/items/FabMenuModel;", "getFabMenu", "Companion", "$serializer", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CalendarTileModel implements DesignSystemModel {
    private final BackToTodayModel backToToday;
    private final MciCalendar calendar;
    private final DateSelectorModel datePicker;
    private final FabMenuModel fabMenu;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CalendarTileModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CalendarTileModel;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CalendarTileModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CalendarTileModel(int i13, DateSelectorModel dateSelectorModel, MciCalendar mciCalendar, BackToTodayModel backToTodayModel, FabMenuModel fabMenuModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, CalendarTileModel$$serializer.INSTANCE.getDescriptor());
        }
        this.datePicker = dateSelectorModel;
        this.calendar = mciCalendar;
        this.backToToday = backToTodayModel;
        this.fabMenu = fabMenuModel;
    }

    public static /* synthetic */ CalendarTileModel copy$default(CalendarTileModel calendarTileModel, DateSelectorModel dateSelectorModel, MciCalendar mciCalendar, BackToTodayModel backToTodayModel, FabMenuModel fabMenuModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            dateSelectorModel = calendarTileModel.datePicker;
        }
        if ((i13 & 2) != 0) {
            mciCalendar = calendarTileModel.calendar;
        }
        if ((i13 & 4) != 0) {
            backToTodayModel = calendarTileModel.backToToday;
        }
        if ((i13 & 8) != 0) {
            fabMenuModel = calendarTileModel.fabMenu;
        }
        return calendarTileModel.copy(dateSelectorModel, mciCalendar, backToTodayModel, fabMenuModel);
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(CalendarTileModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, DateSelectorModel$$serializer.INSTANCE, self.datePicker);
        output.encodeSerializableElement(serialDesc, 1, MciCalendar$$serializer.INSTANCE, self.calendar);
        output.encodeNullableSerializableElement(serialDesc, 2, BackToTodayModel$$serializer.INSTANCE, self.backToToday);
        output.encodeNullableSerializableElement(serialDesc, 3, FabMenuModel$$serializer.INSTANCE, self.fabMenu);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DateSelectorModel getDatePicker() {
        return this.datePicker;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MciCalendar getCalendar() {
        return this.calendar;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BackToTodayModel getBackToToday() {
        return this.backToToday;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final FabMenuModel getFabMenu() {
        return this.fabMenu;
    }

    public final CalendarTileModel copy(DateSelectorModel datePicker, MciCalendar calendar, BackToTodayModel backToToday, FabMenuModel fabMenu) {
        AbstractC22676k.m65750j(datePicker, "datePicker");
        AbstractC22676k.m65750j(calendar, "calendar");
        return new CalendarTileModel(datePicker, calendar, backToToday, fabMenu);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalendarTileModel)) {
            return false;
        }
        CalendarTileModel calendarTileModel = (CalendarTileModel) other;
        return AbstractC22676k.m65745e(this.datePicker, calendarTileModel.datePicker) && AbstractC22676k.m65745e(this.calendar, calendarTileModel.calendar) && AbstractC22676k.m65745e(this.backToToday, calendarTileModel.backToToday) && AbstractC22676k.m65745e(this.fabMenu, calendarTileModel.fabMenu);
    }

    public final BackToTodayModel getBackToToday() {
        return this.backToToday;
    }

    public final MciCalendar getCalendar() {
        return this.calendar;
    }

    public final DateSelectorModel getDatePicker() {
        return this.datePicker;
    }

    public final FabMenuModel getFabMenu() {
        return this.fabMenu;
    }

    public int hashCode() {
        int iHashCode = (this.calendar.hashCode() + (this.datePicker.hashCode() * 31)) * 31;
        BackToTodayModel backToTodayModel = this.backToToday;
        int iHashCode2 = (iHashCode + (backToTodayModel == null ? 0 : backToTodayModel.hashCode())) * 31;
        FabMenuModel fabMenuModel = this.fabMenu;
        return iHashCode2 + (fabMenuModel != null ? fabMenuModel.hashCode() : 0);
    }

    public String toString() {
        return "CalendarTileModel(datePicker=" + this.datePicker + ", calendar=" + this.calendar + ", backToToday=" + this.backToToday + ", fabMenu=" + this.fabMenu + ")";
    }

    public CalendarTileModel(DateSelectorModel datePicker, MciCalendar calendar, BackToTodayModel backToTodayModel, FabMenuModel fabMenuModel) {
        AbstractC22676k.m65750j(datePicker, "datePicker");
        AbstractC22676k.m65750j(calendar, "calendar");
        this.datePicker = datePicker;
        this.calendar = calendar;
        this.backToToday = backToTodayModel;
        this.fabMenu = fabMenuModel;
    }
}
