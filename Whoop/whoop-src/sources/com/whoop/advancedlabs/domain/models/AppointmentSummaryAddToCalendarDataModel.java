package com.whoop.advancedlabs.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yb0.AbstractC39383f;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0016¨\u0006("}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;", "", "", "dateTimeStart", "dateTimeEnd", "<init>", "(JJ)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IJJLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$advanced_labs_release", "(Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()J", "component2", "copy", "(JJ)Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getDateTimeStart", "getDateTimeEnd", "Companion", "$serializer", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AppointmentSummaryAddToCalendarDataModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final long dateTimeEnd;
    private final long dateTimeStart;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;", "serializer", "()Lwc3/c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AppointmentSummaryAddToCalendarDataModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ AppointmentSummaryAddToCalendarDataModel(int i13, long j7, long j13, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, AppointmentSummaryAddToCalendarDataModel$$serializer.INSTANCE.getDescriptor());
        }
        this.dateTimeStart = j7;
        this.dateTimeEnd = j13;
    }

    public static /* synthetic */ AppointmentSummaryAddToCalendarDataModel copy$default(AppointmentSummaryAddToCalendarDataModel appointmentSummaryAddToCalendarDataModel, long j7, long j13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j7 = appointmentSummaryAddToCalendarDataModel.dateTimeStart;
        }
        if ((i13 & 2) != 0) {
            j13 = appointmentSummaryAddToCalendarDataModel.dateTimeEnd;
        }
        return appointmentSummaryAddToCalendarDataModel.copy(j7, j13);
    }

    public static final /* synthetic */ void write$Self$advanced_labs_release(AppointmentSummaryAddToCalendarDataModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeLongElement(serialDesc, 0, self.dateTimeStart);
        output.encodeLongElement(serialDesc, 1, self.dateTimeEnd);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getDateTimeStart() {
        return this.dateTimeStart;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getDateTimeEnd() {
        return this.dateTimeEnd;
    }

    public final AppointmentSummaryAddToCalendarDataModel copy(long dateTimeStart, long dateTimeEnd) {
        return new AppointmentSummaryAddToCalendarDataModel(dateTimeStart, dateTimeEnd);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppointmentSummaryAddToCalendarDataModel)) {
            return false;
        }
        AppointmentSummaryAddToCalendarDataModel appointmentSummaryAddToCalendarDataModel = (AppointmentSummaryAddToCalendarDataModel) other;
        return this.dateTimeStart == appointmentSummaryAddToCalendarDataModel.dateTimeStart && this.dateTimeEnd == appointmentSummaryAddToCalendarDataModel.dateTimeEnd;
    }

    public final long getDateTimeEnd() {
        return this.dateTimeEnd;
    }

    public final long getDateTimeStart() {
        return this.dateTimeStart;
    }

    public int hashCode() {
        return Long.hashCode(this.dateTimeEnd) + (Long.hashCode(this.dateTimeStart) * 31);
    }

    public String toString() {
        return AbstractC11266d.m30457k(this.dateTimeEnd, ")", AbstractC39383f.m125596b(this.dateTimeStart, "AppointmentSummaryAddToCalendarDataModel(dateTimeStart=", ", dateTimeEnd="));
    }

    public AppointmentSummaryAddToCalendarDataModel(long j7, long j13) {
        this.dateTimeStart = j7;
        this.dateTimeEnd = j13;
    }
}
