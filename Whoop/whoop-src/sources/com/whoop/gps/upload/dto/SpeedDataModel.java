package com.whoop.gps.upload.dto;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b)\u0010\u0018¨\u0006-"}, m65681d2 = {"Lcom/whoop/gps/upload/dto/SpeedDataModel;", "", "", "value", "", "unit", "accuracy", "<init>", "(DLjava/lang/String;D)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IDLjava/lang/String;DLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$gps_tracking_release", "(Lcom/whoop/gps/upload/dto/SpeedDataModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()D", "component2", "()Ljava/lang/String;", "component3", "copy", "(DLjava/lang/String;D)Lcom/whoop/gps/upload/dto/SpeedDataModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "D", "getValue", "Ljava/lang/String;", "getUnit", "getAccuracy", "Companion", "$serializer", "a", "gps-tracking_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SpeedDataModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final double accuracy;
    private final String unit;
    private final double value;

    /* JADX INFO: renamed from: com.whoop.gps.upload.dto.SpeedDataModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/gps/upload/dto/SpeedDataModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/gps/upload/dto/SpeedDataModel;", "serializer", "()Lwc3/c;", "gps-tracking_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SpeedDataModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public SpeedDataModel(double d3, String unit, double d14) {
        AbstractC22676k.m65750j(unit, "unit");
        this.value = d3;
        this.unit = unit;
        this.accuracy = d14;
    }

    public static /* synthetic */ SpeedDataModel copy$default(SpeedDataModel speedDataModel, double d3, String str, double d14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            d3 = speedDataModel.value;
        }
        double d15 = d3;
        if ((i13 & 2) != 0) {
            str = speedDataModel.unit;
        }
        String str2 = str;
        if ((i13 & 4) != 0) {
            d14 = speedDataModel.accuracy;
        }
        return speedDataModel.copy(d15, str2, d14);
    }

    public static final /* synthetic */ void write$Self$gps_tracking_release(SpeedDataModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeDoubleElement(serialDesc, 0, self.value);
        output.encodeStringElement(serialDesc, 1, self.unit);
        output.encodeDoubleElement(serialDesc, 2, self.accuracy);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUnit() {
        return this.unit;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getAccuracy() {
        return this.accuracy;
    }

    public final SpeedDataModel copy(double value, String unit, double accuracy) {
        AbstractC22676k.m65750j(unit, "unit");
        return new SpeedDataModel(value, unit, accuracy);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpeedDataModel)) {
            return false;
        }
        SpeedDataModel speedDataModel = (SpeedDataModel) other;
        return Double.compare(this.value, speedDataModel.value) == 0 && AbstractC22676k.m65745e(this.unit, speedDataModel.unit) && Double.compare(this.accuracy, speedDataModel.accuracy) == 0;
    }

    public final double getAccuracy() {
        return this.accuracy;
    }

    public final String getUnit() {
        return this.unit;
    }

    public final double getValue() {
        return this.value;
    }

    public int hashCode() {
        return Double.hashCode(this.accuracy) + AbstractC11266d.m30450d(Double.hashCode(this.value) * 31, 31, this.unit);
    }

    public String toString() {
        return "SpeedDataModel(value=" + this.value + ", unit=" + this.unit + ", accuracy=" + this.accuracy + ")";
    }

    public /* synthetic */ SpeedDataModel(int i13, double d3, String str, double d14, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, SpeedDataModel$$serializer.INSTANCE.getDescriptor());
        }
        this.value = d3;
        this.unit = str;
        this.accuracy = d14;
    }
}
