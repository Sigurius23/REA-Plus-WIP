package com.whoop.hormonalinsights.menstrualcycleinsights.domain.models;

import com.mapbox.common.HttpHeaders;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b)\u0010\u001a¨\u0006,"}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PeriodLog;", "", "", HttpHeaders.DATE, "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MenstrualLevelAnswer;", "period", "ovulation", "<init>", "(Ljava/lang/String;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MenstrualLevelAnswer;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MenstrualLevelAnswer;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MenstrualLevelAnswer;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MenstrualLevelAnswer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PeriodLog;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MenstrualLevelAnswer;", "component3", "copy", "(Ljava/lang/String;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MenstrualLevelAnswer;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MenstrualLevelAnswer;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PeriodLog;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDate", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MenstrualLevelAnswer;", "getPeriod", "getOvulation", "Companion", "$serializer", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PeriodLog {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String date;
    private final MenstrualLevelAnswer ovulation;
    private final MenstrualLevelAnswer period;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PeriodLog$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PeriodLog;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PeriodLog$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PeriodLog(int i13, String str, MenstrualLevelAnswer menstrualLevelAnswer, MenstrualLevelAnswer menstrualLevelAnswer2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, PeriodLog$$serializer.INSTANCE.getDescriptor());
        }
        this.date = str;
        this.period = menstrualLevelAnswer;
        this.ovulation = menstrualLevelAnswer2;
    }

    public static /* synthetic */ PeriodLog copy$default(PeriodLog periodLog, String str, MenstrualLevelAnswer menstrualLevelAnswer, MenstrualLevelAnswer menstrualLevelAnswer2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = periodLog.date;
        }
        if ((i13 & 2) != 0) {
            menstrualLevelAnswer = periodLog.period;
        }
        if ((i13 & 4) != 0) {
            menstrualLevelAnswer2 = periodLog.ovulation;
        }
        return periodLog.copy(str, menstrualLevelAnswer, menstrualLevelAnswer2);
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(PeriodLog self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.date);
        MenstrualLevelAnswer$$serializer menstrualLevelAnswer$$serializer = MenstrualLevelAnswer$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 1, menstrualLevelAnswer$$serializer, self.period);
        output.encodeSerializableElement(serialDesc, 2, menstrualLevelAnswer$$serializer, self.ovulation);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MenstrualLevelAnswer getPeriod() {
        return this.period;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final MenstrualLevelAnswer getOvulation() {
        return this.ovulation;
    }

    public final PeriodLog copy(String date, MenstrualLevelAnswer period, MenstrualLevelAnswer ovulation) {
        AbstractC22676k.m65750j(date, "date");
        AbstractC22676k.m65750j(period, "period");
        AbstractC22676k.m65750j(ovulation, "ovulation");
        return new PeriodLog(date, period, ovulation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PeriodLog)) {
            return false;
        }
        PeriodLog periodLog = (PeriodLog) other;
        return AbstractC22676k.m65745e(this.date, periodLog.date) && AbstractC22676k.m65745e(this.period, periodLog.period) && AbstractC22676k.m65745e(this.ovulation, periodLog.ovulation);
    }

    public final String getDate() {
        return this.date;
    }

    public final MenstrualLevelAnswer getOvulation() {
        return this.ovulation;
    }

    public final MenstrualLevelAnswer getPeriod() {
        return this.period;
    }

    public int hashCode() {
        return this.ovulation.hashCode() + ((this.period.hashCode() + (this.date.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "PeriodLog(date=" + this.date + ", period=" + this.period + ", ovulation=" + this.ovulation + ")";
    }

    public PeriodLog(String date, MenstrualLevelAnswer period, MenstrualLevelAnswer ovulation) {
        AbstractC22676k.m65750j(date, "date");
        AbstractC22676k.m65750j(period, "period");
        AbstractC22676k.m65750j(ovulation, "ovulation");
        this.date = date;
        this.period = period;
        this.ovulation = ovulation;
    }
}
