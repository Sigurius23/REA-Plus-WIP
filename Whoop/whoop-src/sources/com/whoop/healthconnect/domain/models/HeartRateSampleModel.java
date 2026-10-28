package com.whoop.healthconnect.domain.models;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import lj1.C24473a;
import p322m7.C25183y;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ$\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u001c¨\u0006,"}, m65681d2 = {"Lcom/whoop/healthconnect/domain/models/HeartRateSampleModel;", "", "", "beatsPerMinute", "", "time", "<init>", "(JLjava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IJLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$health_connect_release", "(Lcom/whoop/healthconnect/domain/models/HeartRateSampleModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Lm7/y;", "toHeartRateRecordSample", "()Lm7/y;", "component1", "()J", "component2", "()Ljava/lang/String;", "copy", "(JLjava/lang/String;)Lcom/whoop/healthconnect/domain/models/HeartRateSampleModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getBeatsPerMinute", "Ljava/lang/String;", "getTime", "Companion", "$serializer", "health-connect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HeartRateSampleModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("beats_per_minute")
    private final long beatsPerMinute;

    @SerializedName("time")
    private final String time;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/healthconnect/domain/models/HeartRateSampleModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/healthconnect/domain/models/HeartRateSampleModel;", "serializer", "()Lwc3/c;", "health-connect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HeartRateSampleModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ HeartRateSampleModel(int i13, long j7, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, HeartRateSampleModel$$serializer.INSTANCE.getDescriptor());
        }
        this.beatsPerMinute = j7;
        this.time = str;
    }

    public static /* synthetic */ HeartRateSampleModel copy$default(HeartRateSampleModel heartRateSampleModel, long j7, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j7 = heartRateSampleModel.beatsPerMinute;
        }
        if ((i13 & 2) != 0) {
            str = heartRateSampleModel.time;
        }
        return heartRateSampleModel.copy(j7, str);
    }

    public static final /* synthetic */ void write$Self$health_connect_release(HeartRateSampleModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeLongElement(serialDesc, 0, self.beatsPerMinute);
        output.encodeStringElement(serialDesc, 1, self.time);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getBeatsPerMinute() {
        return this.beatsPerMinute;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTime() {
        return this.time;
    }

    public final HeartRateSampleModel copy(long beatsPerMinute, String time) {
        AbstractC22676k.m65750j(time, "time");
        return new HeartRateSampleModel(beatsPerMinute, time);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeartRateSampleModel)) {
            return false;
        }
        HeartRateSampleModel heartRateSampleModel = (HeartRateSampleModel) other;
        return this.beatsPerMinute == heartRateSampleModel.beatsPerMinute && AbstractC22676k.m65745e(this.time, heartRateSampleModel.time);
    }

    public final long getBeatsPerMinute() {
        return this.beatsPerMinute;
    }

    public final String getTime() {
        return this.time;
    }

    public int hashCode() {
        return this.time.hashCode() + (Long.hashCode(this.beatsPerMinute) * 31);
    }

    public final C25183y toHeartRateRecordSample() {
        long j7 = this.beatsPerMinute;
        Object obj = DateTimeFormatter.ISO_OFFSET_DATE_TIME.parse(this.time, new C24473a(0));
        AbstractC22676k.m65749i(obj, "parse(...)");
        return new C25183y(j7, (Instant) obj);
    }

    public String toString() {
        StringBuilder sbM114685m = AbstractC36095b.m114685m("HeartRateSampleModel(beatsPerMinute=", ", time=", this.beatsPerMinute, this.time);
        sbM114685m.append(")");
        return sbM114685m.toString();
    }

    public HeartRateSampleModel(long j7, String time) {
        AbstractC22676k.m65750j(time, "time");
        this.beatsPerMinute = j7;
        this.time = time;
    }
}
