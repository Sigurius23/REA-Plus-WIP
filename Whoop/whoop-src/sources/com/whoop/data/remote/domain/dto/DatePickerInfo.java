package com.whoop.data.remote.domain.dto;

import com.google.gson.annotations.SerializedName;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ2\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u001aR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b)\u0010\u001a¨\u0006,"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/DatePickerInfo;", "", "", "title", "Lcom/whoop/data/remote/domain/dto/JournalDayInfo;", "nextDay", "previousDay", "<init>", "(Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/JournalDayInfo;Lcom/whoop/data/remote/domain/dto/JournalDayInfo;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/data/remote/domain/dto/JournalDayInfo;Lcom/whoop/data/remote/domain/dto/JournalDayInfo;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/data/remote/domain/dto/DatePickerInfo;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/data/remote/domain/dto/JournalDayInfo;", "component3", "copy", "(Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/JournalDayInfo;Lcom/whoop/data/remote/domain/dto/JournalDayInfo;)Lcom/whoop/data/remote/domain/dto/DatePickerInfo;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Lcom/whoop/data/remote/domain/dto/JournalDayInfo;", "getNextDay", "getPreviousDay", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class DatePickerInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("next_day")
    private final JournalDayInfo nextDay;

    @SerializedName("previous_day")
    private final JournalDayInfo previousDay;

    @SerializedName("title")
    private final String title;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/DatePickerInfo$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/data/remote/domain/dto/DatePickerInfo;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return DatePickerInfo$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ DatePickerInfo(int i13, String str, JournalDayInfo journalDayInfo, JournalDayInfo journalDayInfo2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, DatePickerInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.nextDay = journalDayInfo;
        this.previousDay = journalDayInfo2;
    }

    public static /* synthetic */ DatePickerInfo copy$default(DatePickerInfo datePickerInfo, String str, JournalDayInfo journalDayInfo, JournalDayInfo journalDayInfo2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = datePickerInfo.title;
        }
        if ((i13 & 2) != 0) {
            journalDayInfo = datePickerInfo.nextDay;
        }
        if ((i13 & 4) != 0) {
            journalDayInfo2 = datePickerInfo.previousDay;
        }
        return datePickerInfo.copy(str, journalDayInfo, journalDayInfo2);
    }

    public static final /* synthetic */ void write$Self$core_release(DatePickerInfo self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.title);
        JournalDayInfo$$serializer journalDayInfo$$serializer = JournalDayInfo$$serializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, journalDayInfo$$serializer, self.nextDay);
        output.encodeNullableSerializableElement(serialDesc, 2, journalDayInfo$$serializer, self.previousDay);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final JournalDayInfo getNextDay() {
        return this.nextDay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final JournalDayInfo getPreviousDay() {
        return this.previousDay;
    }

    public final DatePickerInfo copy(String title, JournalDayInfo nextDay, JournalDayInfo previousDay) {
        AbstractC22676k.m65750j(title, "title");
        return new DatePickerInfo(title, nextDay, previousDay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DatePickerInfo)) {
            return false;
        }
        DatePickerInfo datePickerInfo = (DatePickerInfo) other;
        return AbstractC22676k.m65745e(this.title, datePickerInfo.title) && AbstractC22676k.m65745e(this.nextDay, datePickerInfo.nextDay) && AbstractC22676k.m65745e(this.previousDay, datePickerInfo.previousDay);
    }

    public final JournalDayInfo getNextDay() {
        return this.nextDay;
    }

    public final JournalDayInfo getPreviousDay() {
        return this.previousDay;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        JournalDayInfo journalDayInfo = this.nextDay;
        int iHashCode2 = (iHashCode + (journalDayInfo == null ? 0 : journalDayInfo.hashCode())) * 31;
        JournalDayInfo journalDayInfo2 = this.previousDay;
        return iHashCode2 + (journalDayInfo2 != null ? journalDayInfo2.hashCode() : 0);
    }

    public String toString() {
        return "DatePickerInfo(title=" + this.title + ", nextDay=" + this.nextDay + ", previousDay=" + this.previousDay + ")";
    }

    public DatePickerInfo(String title, JournalDayInfo journalDayInfo, JournalDayInfo journalDayInfo2) {
        AbstractC22676k.m65750j(title, "title");
        this.title = title;
        this.nextDay = journalDayInfo;
        this.previousDay = journalDayInfo2;
    }
}
