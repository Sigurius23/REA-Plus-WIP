package com.whoop.domain.model;

import ad3.InterfaceC0778u;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import or2.AbstractC28209v1;
import org.joda.time.LocalDateTime;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0018R\u0011\u0010(\u001a\u00020%8F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006+"}, m65681d2 = {"Lcom/whoop/domain/model/MetricsProcessedTime;", "", "", "millis", "<init>", "(J)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IJLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$connectivity_release", "(Lcom/whoop/domain/model/MetricsProcessedTime;Lzc3/c;Lyc3/g;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "component1", "()J", "copy", "(J)Lcom/whoop/domain/model/MetricsProcessedTime;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getMillis", "getMillis$annotations", "()V", "Lorg/joda/time/LocalDateTime;", "getTime", "()Lorg/joda/time/LocalDateTime;", "time", "Companion", "$serializer", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MetricsProcessedTime {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("latestMetricsProcessed")
    private final long millis;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/domain/model/MetricsProcessedTime$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/domain/model/MetricsProcessedTime;", "serializer", "()Lwc3/c;", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MetricsProcessedTime$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MetricsProcessedTime(int i13, long j7, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, MetricsProcessedTime$$serializer.INSTANCE.getDescriptor());
        }
        this.millis = j7;
    }

    public static /* synthetic */ MetricsProcessedTime copy$default(MetricsProcessedTime metricsProcessedTime, long j7, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j7 = metricsProcessedTime.millis;
        }
        return metricsProcessedTime.copy(j7);
    }

    @InterfaceC0778u(names = {"latestMetricsProcessed"})
    public static /* synthetic */ void getMillis$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getMillis() {
        return this.millis;
    }

    public final MetricsProcessedTime copy(long millis) {
        return new MetricsProcessedTime(millis);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MetricsProcessedTime) && this.millis == ((MetricsProcessedTime) other).millis;
    }

    public final long getMillis() {
        return this.millis;
    }

    public final LocalDateTime getTime() {
        return new LocalDateTime(this.millis);
    }

    public int hashCode() {
        return Long.hashCode(this.millis);
    }

    public String toString() {
        return AbstractC11895b.m31996o("MetricsProcessedTime(time = ", AbstractC28209v1.m85388b(this.millis), ")");
    }

    public MetricsProcessedTime(long j7) {
        this.millis = j7;
    }
}
