package com.whoop.core.details.network.model;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tB;\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ8\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b.\u0010\u001c¨\u00061"}, m65681d2 = {"Lcom/whoop/core/details/network/model/HeartRateTimelineModel;", "", "", "endPercentage", "startPercentage", "", "startTimeInMillis", "endTimeInMillis", "<init>", "(DDJJ)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IDDJJLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_details_release", "(Lcom/whoop/core/details/network/model/HeartRateTimelineModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()D", "component2", "component3", "()J", "component4", "copy", "(DDJJ)Lcom/whoop/core/details/network/model/HeartRateTimelineModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "D", "getEndPercentage", "getStartPercentage", "J", "getStartTimeInMillis", "getEndTimeInMillis", "Companion", "$serializer", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HeartRateTimelineModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final double endPercentage;
    private final long endTimeInMillis;
    private final double startPercentage;
    private final long startTimeInMillis;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/core/details/network/model/HeartRateTimelineModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/core/details/network/model/HeartRateTimelineModel;", "serializer", "()Lwc3/c;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HeartRateTimelineModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public HeartRateTimelineModel(double d3, double d14, long j7, long j13) {
        this.endPercentage = d3;
        this.startPercentage = d14;
        this.startTimeInMillis = j7;
        this.endTimeInMillis = j13;
    }

    public static /* synthetic */ HeartRateTimelineModel copy$default(HeartRateTimelineModel heartRateTimelineModel, double d3, double d14, long j7, long j13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            d3 = heartRateTimelineModel.endPercentage;
        }
        double d15 = d3;
        if ((i13 & 2) != 0) {
            d14 = heartRateTimelineModel.startPercentage;
        }
        double d16 = d14;
        if ((i13 & 4) != 0) {
            j7 = heartRateTimelineModel.startTimeInMillis;
        }
        return heartRateTimelineModel.copy(d15, d16, j7, (i13 & 8) != 0 ? heartRateTimelineModel.endTimeInMillis : j13);
    }

    public static final /* synthetic */ void write$Self$core_details_release(HeartRateTimelineModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeDoubleElement(serialDesc, 0, self.endPercentage);
        output.encodeDoubleElement(serialDesc, 1, self.startPercentage);
        output.encodeLongElement(serialDesc, 2, self.startTimeInMillis);
        output.encodeLongElement(serialDesc, 3, self.endTimeInMillis);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getEndPercentage() {
        return this.endPercentage;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getStartPercentage() {
        return this.startPercentage;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getStartTimeInMillis() {
        return this.startTimeInMillis;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getEndTimeInMillis() {
        return this.endTimeInMillis;
    }

    public final HeartRateTimelineModel copy(double endPercentage, double startPercentage, long startTimeInMillis, long endTimeInMillis) {
        return new HeartRateTimelineModel(endPercentage, startPercentage, startTimeInMillis, endTimeInMillis);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeartRateTimelineModel)) {
            return false;
        }
        HeartRateTimelineModel heartRateTimelineModel = (HeartRateTimelineModel) other;
        return Double.compare(this.endPercentage, heartRateTimelineModel.endPercentage) == 0 && Double.compare(this.startPercentage, heartRateTimelineModel.startPercentage) == 0 && this.startTimeInMillis == heartRateTimelineModel.startTimeInMillis && this.endTimeInMillis == heartRateTimelineModel.endTimeInMillis;
    }

    public final double getEndPercentage() {
        return this.endPercentage;
    }

    public final long getEndTimeInMillis() {
        return this.endTimeInMillis;
    }

    public final double getStartPercentage() {
        return this.startPercentage;
    }

    public final long getStartTimeInMillis() {
        return this.startTimeInMillis;
    }

    public int hashCode() {
        return Long.hashCode(this.endTimeInMillis) + AbstractC11266d.m30451e(AbstractC17176i.m48499a(Double.hashCode(this.endPercentage) * 31, 31, this.startPercentage), this.startTimeInMillis, 31);
    }

    public String toString() {
        double d3 = this.endPercentage;
        double d14 = this.startPercentage;
        long j7 = this.startTimeInMillis;
        long j13 = this.endTimeInMillis;
        StringBuilder sbM8306s = AbstractC2875y.m8306s("HeartRateTimelineModel(endPercentage=", d3, ", startPercentage=");
        sbM8306s.append(d14);
        AbstractC2875y.m8285A(sbM8306s, ", startTimeInMillis=", j7, ", endTimeInMillis=");
        return AbstractC11266d.m30457k(j13, ")", sbM8306s);
    }

    public /* synthetic */ HeartRateTimelineModel(int i13, double d3, double d14, long j7, long j13, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, HeartRateTimelineModel$$serializer.INSTANCE.getDescriptor());
        }
        this.endPercentage = d3;
        this.startPercentage = d14;
        this.startTimeInMillis = j7;
        this.endTimeInMillis = j13;
    }
}
