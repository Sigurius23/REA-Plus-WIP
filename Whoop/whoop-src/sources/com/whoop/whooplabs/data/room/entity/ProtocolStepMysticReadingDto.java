package com.whoop.whooplabs.data.room.entity;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.Date;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import u82.C34641b;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000212B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ:\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0018J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0018R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u001d¨\u00063"}, m65681d2 = {"Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReadingDto;", "", "", "systolic", "diastolic", "Ljava/util/Date;", "timestamp", "heartRate", "<init>", "(IILjava/util/Date;Ljava/lang/Integer;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIILjava/util/Date;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$whooplabs_release", "(Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReadingDto;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()I", "component2", "component3", "()Ljava/util/Date;", "component4", "()Ljava/lang/Integer;", "copy", "(IILjava/util/Date;Ljava/lang/Integer;)Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReadingDto;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getSystolic", "getDiastolic", "Ljava/util/Date;", "getTimestamp", "getTimestamp$annotations", "()V", "Ljava/lang/Integer;", "getHeartRate", "Companion", "$serializer", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ProtocolStepMysticReadingDto {
    private final int diastolic;
    private final Integer heartRate;
    private final int systolic;
    private final Date timestamp;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReadingDto$Companion;", "", "<init>", "()V", "Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;", "mysticReading", "Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReadingDto;", "fromMysticReading", "(Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;)Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReadingDto;", "Lwc3/c;", "serializer", "()Lwc3/c;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ProtocolStepMysticReadingDto fromMysticReading(ProtocolStepMysticReading mysticReading) {
            if (mysticReading == null) {
                return null;
            }
            if (mysticReading.getSystolic() == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            if (mysticReading.getDiastolic() == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            if (mysticReading.getTimestamp() == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            int iIntValue = mysticReading.getSystolic().intValue();
            int iIntValue2 = mysticReading.getDiastolic().intValue();
            Date date = mysticReading.getTimestamp().toDate();
            AbstractC22676k.m65749i(date, "toDate(...)");
            return new ProtocolStepMysticReadingDto(iIntValue, iIntValue2, date, mysticReading.getHeartRate());
        }

        public final InterfaceC37138c serializer() {
            return ProtocolStepMysticReadingDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ProtocolStepMysticReadingDto(int i13, int i14, int i15, Date date, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, ProtocolStepMysticReadingDto$$serializer.INSTANCE.getDescriptor());
        }
        this.systolic = i14;
        this.diastolic = i15;
        this.timestamp = date;
        this.heartRate = num;
    }

    public static /* synthetic */ ProtocolStepMysticReadingDto copy$default(ProtocolStepMysticReadingDto protocolStepMysticReadingDto, int i13, int i14, Date date, Integer num, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = protocolStepMysticReadingDto.systolic;
        }
        if ((i15 & 2) != 0) {
            i14 = protocolStepMysticReadingDto.diastolic;
        }
        if ((i15 & 4) != 0) {
            date = protocolStepMysticReadingDto.timestamp;
        }
        if ((i15 & 8) != 0) {
            num = protocolStepMysticReadingDto.heartRate;
        }
        return protocolStepMysticReadingDto.copy(i13, i14, date, num);
    }

    @InterfaceC37144i(with = C34641b.class)
    public static /* synthetic */ void getTimestamp$annotations() {
    }

    public static final /* synthetic */ void write$Self$whooplabs_release(ProtocolStepMysticReadingDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeIntElement(serialDesc, 0, self.systolic);
        output.encodeIntElement(serialDesc, 1, self.diastolic);
        output.encodeSerializableElement(serialDesc, 2, C34641b.f145940a, self.timestamp);
        output.encodeNullableSerializableElement(serialDesc, 3, IntSerializer.INSTANCE, self.heartRate);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSystolic() {
        return this.systolic;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDiastolic() {
        return this.diastolic;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Date getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getHeartRate() {
        return this.heartRate;
    }

    public final ProtocolStepMysticReadingDto copy(int systolic, int diastolic, Date timestamp, Integer heartRate) {
        AbstractC22676k.m65750j(timestamp, "timestamp");
        return new ProtocolStepMysticReadingDto(systolic, diastolic, timestamp, heartRate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProtocolStepMysticReadingDto)) {
            return false;
        }
        ProtocolStepMysticReadingDto protocolStepMysticReadingDto = (ProtocolStepMysticReadingDto) other;
        return this.systolic == protocolStepMysticReadingDto.systolic && this.diastolic == protocolStepMysticReadingDto.diastolic && AbstractC22676k.m65745e(this.timestamp, protocolStepMysticReadingDto.timestamp) && AbstractC22676k.m65745e(this.heartRate, protocolStepMysticReadingDto.heartRate);
    }

    public final int getDiastolic() {
        return this.diastolic;
    }

    public final Integer getHeartRate() {
        return this.heartRate;
    }

    public final int getSystolic() {
        return this.systolic;
    }

    public final Date getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iM124373c = AbstractC38963t7.m124373c(this.timestamp, AbstractC11266d.m30448b(this.diastolic, Integer.hashCode(this.systolic) * 31, 31), 31);
        Integer num = this.heartRate;
        return iM124373c + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        int i13 = this.systolic;
        int i14 = this.diastolic;
        Date date = this.timestamp;
        Integer num = this.heartRate;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "ProtocolStepMysticReadingDto(systolic=", ", diastolic=", ", timestamp=");
        sbM30465s.append(date);
        sbM30465s.append(", heartRate=");
        sbM30465s.append(num);
        sbM30465s.append(")");
        return sbM30465s.toString();
    }

    public ProtocolStepMysticReadingDto(int i13, int i14, Date timestamp, Integer num) {
        AbstractC22676k.m65750j(timestamp, "timestamp");
        this.systolic = i13;
        this.diastolic = i14;
        this.timestamp = timestamp;
        this.heartRate = num;
    }
}
