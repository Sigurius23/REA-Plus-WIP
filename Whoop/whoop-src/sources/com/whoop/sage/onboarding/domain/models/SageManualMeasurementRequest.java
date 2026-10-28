package com.whoop.sage.onboarding.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import h00.C16497d0;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u001a¨\u0006+"}, m65681d2 = {"Lcom/whoop/sage/onboarding/domain/models/SageManualMeasurementRequest;", "", "", "Lcom/whoop/sage/onboarding/domain/models/ManualBloodPressureReadingInput;", "manualBloodPressureReadings", "", "readingDate", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$sage_release", "(Lcom/whoop/sage/onboarding/domain/models/SageManualMeasurementRequest;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/lang/String;)Lcom/whoop/sage/onboarding/domain/models/SageManualMeasurementRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getManualBloodPressureReadings", "Ljava/lang/String;", "getReadingDate", "Companion", "$serializer", "a", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SageManualMeasurementRequest {
    private final List<ManualBloodPressureReadingInput> manualBloodPressureReadings;
    private final String readingDate;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C16497d0(14)), null};

    /* JADX INFO: renamed from: com.whoop.sage.onboarding.domain.models.SageManualMeasurementRequest$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/sage/onboarding/domain/models/SageManualMeasurementRequest$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/sage/onboarding/domain/models/SageManualMeasurementRequest;", "serializer", "()Lwc3/c;", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SageManualMeasurementRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SageManualMeasurementRequest(int i13, List list, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, SageManualMeasurementRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.manualBloodPressureReadings = list;
        this.readingDate = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(ManualBloodPressureReadingInput$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SageManualMeasurementRequest copy$default(SageManualMeasurementRequest sageManualMeasurementRequest, List list, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = sageManualMeasurementRequest.manualBloodPressureReadings;
        }
        if ((i13 & 2) != 0) {
            str = sageManualMeasurementRequest.readingDate;
        }
        return sageManualMeasurementRequest.copy(list, str);
    }

    public static final /* synthetic */ void write$Self$sage_release(SageManualMeasurementRequest self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) $childSerializers[0].getValue(), self.manualBloodPressureReadings);
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.readingDate);
    }

    public final List<ManualBloodPressureReadingInput> component1() {
        return this.manualBloodPressureReadings;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getReadingDate() {
        return this.readingDate;
    }

    public final SageManualMeasurementRequest copy(List<ManualBloodPressureReadingInput> manualBloodPressureReadings, String readingDate) {
        AbstractC22676k.m65750j(manualBloodPressureReadings, "manualBloodPressureReadings");
        return new SageManualMeasurementRequest(manualBloodPressureReadings, readingDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SageManualMeasurementRequest)) {
            return false;
        }
        SageManualMeasurementRequest sageManualMeasurementRequest = (SageManualMeasurementRequest) other;
        return AbstractC22676k.m65745e(this.manualBloodPressureReadings, sageManualMeasurementRequest.manualBloodPressureReadings) && AbstractC22676k.m65745e(this.readingDate, sageManualMeasurementRequest.readingDate);
    }

    public final List<ManualBloodPressureReadingInput> getManualBloodPressureReadings() {
        return this.manualBloodPressureReadings;
    }

    public final String getReadingDate() {
        return this.readingDate;
    }

    public int hashCode() {
        int iHashCode = this.manualBloodPressureReadings.hashCode() * 31;
        String str = this.readingDate;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return AbstractC30802r.m94761j("SageManualMeasurementRequest(manualBloodPressureReadings=", ", readingDate=", this.readingDate, ")", this.manualBloodPressureReadings);
    }

    public SageManualMeasurementRequest(List<ManualBloodPressureReadingInput> manualBloodPressureReadings, String str) {
        AbstractC22676k.m65750j(manualBloodPressureReadings, "manualBloodPressureReadings");
        this.manualBloodPressureReadings = manualBloodPressureReadings;
        this.readingDate = str;
    }
}
