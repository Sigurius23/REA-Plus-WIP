package com.whoop.journal.interactors.p062v2.datepicker;

import androidx.annotation.Keep;
import com.mapbox.common.HttpHeaders;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000289B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rBU\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b%\u0010$JP\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b(\u0010\u001fJ\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\u00022\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b\u0003\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b1\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b6\u0010$¨\u0006:"}, m65681d2 = {"Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;", "", "", "isSelected", "", "journalEntryStatus", HttpHeaders.DATE, "", "cycleId", "Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;", "dateDisplay", "multiDayCycleDateDisplay", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$journal_release", "(Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/lang/Long;", "component5", "()Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;", "component6", "copy", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;)Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Ljava/lang/String;", "getJournalEntryStatus", "getDate", "Ljava/lang/Long;", "getCycleId", "Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;", "getDateDisplay", "getMultiDayCycleDateDisplay", "Companion", "$serializer", "a", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class JournalDatePickerEntry {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Long cycleId;
    private final String date;
    private final DateDisplay dateDisplay;
    private final boolean isSelected;
    private final String journalEntryStatus;
    private final DateDisplay multiDayCycleDateDisplay;

    /* JADX INFO: renamed from: com.whoop.journal.interactors.v2.datepicker.JournalDatePickerEntry$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;", "serializer", "()Lwc3/c;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return JournalDatePickerEntry$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ JournalDatePickerEntry(int i13, boolean z4, String str, String str2, Long l7, DateDisplay dateDisplay, DateDisplay dateDisplay2, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, JournalDatePickerEntry$$serializer.INSTANCE.getDescriptor());
        }
        this.isSelected = z4;
        this.journalEntryStatus = str;
        this.date = str2;
        this.cycleId = l7;
        this.dateDisplay = dateDisplay;
        this.multiDayCycleDateDisplay = dateDisplay2;
    }

    public static /* synthetic */ JournalDatePickerEntry copy$default(JournalDatePickerEntry journalDatePickerEntry, boolean z4, String str, String str2, Long l7, DateDisplay dateDisplay, DateDisplay dateDisplay2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = journalDatePickerEntry.isSelected;
        }
        if ((i13 & 2) != 0) {
            str = journalDatePickerEntry.journalEntryStatus;
        }
        if ((i13 & 4) != 0) {
            str2 = journalDatePickerEntry.date;
        }
        if ((i13 & 8) != 0) {
            l7 = journalDatePickerEntry.cycleId;
        }
        if ((i13 & 16) != 0) {
            dateDisplay = journalDatePickerEntry.dateDisplay;
        }
        if ((i13 & 32) != 0) {
            dateDisplay2 = journalDatePickerEntry.multiDayCycleDateDisplay;
        }
        DateDisplay dateDisplay3 = dateDisplay;
        DateDisplay dateDisplay4 = dateDisplay2;
        return journalDatePickerEntry.copy(z4, str, str2, l7, dateDisplay3, dateDisplay4);
    }

    public static final /* synthetic */ void write$Self$journal_release(JournalDatePickerEntry self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeBooleanElement(serialDesc, 0, self.isSelected);
        output.encodeStringElement(serialDesc, 1, self.journalEntryStatus);
        output.encodeStringElement(serialDesc, 2, self.date);
        output.encodeNullableSerializableElement(serialDesc, 3, LongSerializer.INSTANCE, self.cycleId);
        DateDisplay$$serializer dateDisplay$$serializer = DateDisplay$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 4, dateDisplay$$serializer, self.dateDisplay);
        output.encodeNullableSerializableElement(serialDesc, 5, dateDisplay$$serializer, self.multiDayCycleDateDisplay);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getJournalEntryStatus() {
        return this.journalEntryStatus;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getCycleId() {
        return this.cycleId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final DateDisplay getDateDisplay() {
        return this.dateDisplay;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final DateDisplay getMultiDayCycleDateDisplay() {
        return this.multiDayCycleDateDisplay;
    }

    public final JournalDatePickerEntry copy(boolean isSelected, String journalEntryStatus, String date, Long cycleId, DateDisplay dateDisplay, DateDisplay multiDayCycleDateDisplay) {
        AbstractC22676k.m65750j(journalEntryStatus, "journalEntryStatus");
        AbstractC22676k.m65750j(date, "date");
        AbstractC22676k.m65750j(dateDisplay, "dateDisplay");
        return new JournalDatePickerEntry(isSelected, journalEntryStatus, date, cycleId, dateDisplay, multiDayCycleDateDisplay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JournalDatePickerEntry)) {
            return false;
        }
        JournalDatePickerEntry journalDatePickerEntry = (JournalDatePickerEntry) other;
        return this.isSelected == journalDatePickerEntry.isSelected && AbstractC22676k.m65745e(this.journalEntryStatus, journalDatePickerEntry.journalEntryStatus) && AbstractC22676k.m65745e(this.date, journalDatePickerEntry.date) && AbstractC22676k.m65745e(this.cycleId, journalDatePickerEntry.cycleId) && AbstractC22676k.m65745e(this.dateDisplay, journalDatePickerEntry.dateDisplay) && AbstractC22676k.m65745e(this.multiDayCycleDateDisplay, journalDatePickerEntry.multiDayCycleDateDisplay);
    }

    public final Long getCycleId() {
        return this.cycleId;
    }

    public final String getDate() {
        return this.date;
    }

    public final DateDisplay getDateDisplay() {
        return this.dateDisplay;
    }

    public final String getJournalEntryStatus() {
        return this.journalEntryStatus;
    }

    public final DateDisplay getMultiDayCycleDateDisplay() {
        return this.multiDayCycleDateDisplay;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(Boolean.hashCode(this.isSelected) * 31, 31, this.journalEntryStatus), 31, this.date);
        Long l7 = this.cycleId;
        int iHashCode = (this.dateDisplay.hashCode() + ((iM30450d + (l7 == null ? 0 : l7.hashCode())) * 31)) * 31;
        DateDisplay dateDisplay = this.multiDayCycleDateDisplay;
        return iHashCode + (dateDisplay != null ? dateDisplay.hashCode() : 0);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public String toString() {
        boolean z4 = this.isSelected;
        String str = this.journalEntryStatus;
        String str2 = this.date;
        Long l7 = this.cycleId;
        DateDisplay dateDisplay = this.dateDisplay;
        DateDisplay dateDisplay2 = this.multiDayCycleDateDisplay;
        StringBuilder sbM38567n = AbstractC13673n.m38567n("JournalDatePickerEntry(isSelected=", ", journalEntryStatus=", str, ", date=", z4);
        sbM38567n.append(str2);
        sbM38567n.append(", cycleId=");
        sbM38567n.append(l7);
        sbM38567n.append(", dateDisplay=");
        sbM38567n.append(dateDisplay);
        sbM38567n.append(", multiDayCycleDateDisplay=");
        sbM38567n.append(dateDisplay2);
        sbM38567n.append(")");
        return sbM38567n.toString();
    }

    public JournalDatePickerEntry(boolean z4, String journalEntryStatus, String date, Long l7, DateDisplay dateDisplay, DateDisplay dateDisplay2) {
        AbstractC22676k.m65750j(journalEntryStatus, "journalEntryStatus");
        AbstractC22676k.m65750j(date, "date");
        AbstractC22676k.m65750j(dateDisplay, "dateDisplay");
        this.isSelected = z4;
        this.journalEntryStatus = journalEntryStatus;
        this.date = date;
        this.cycleId = l7;
        this.dateDisplay = dateDisplay;
        this.multiDayCycleDateDisplay = dateDisplay2;
    }
}
