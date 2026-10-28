package com.whoop.sage.onboarding.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0015J\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u0015¨\u0006'"}, m65681d2 = {"Lcom/whoop/sage/onboarding/domain/models/ManualBloodPressureReadingInput;", "", "", "systolicMmhg", "diastolicMmhg", "<init>", "(II)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$sage_release", "(Lcom/whoop/sage/onboarding/domain/models/ManualBloodPressureReadingInput;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()I", "component2", "copy", "(II)Lcom/whoop/sage/onboarding/domain/models/ManualBloodPressureReadingInput;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getSystolicMmhg", "getDiastolicMmhg", "Companion", "$serializer", "a", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ManualBloodPressureReadingInput {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int diastolicMmhg;
    private final int systolicMmhg;

    /* JADX INFO: renamed from: com.whoop.sage.onboarding.domain.models.ManualBloodPressureReadingInput$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/sage/onboarding/domain/models/ManualBloodPressureReadingInput$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/sage/onboarding/domain/models/ManualBloodPressureReadingInput;", "serializer", "()Lwc3/c;", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ManualBloodPressureReadingInput$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ManualBloodPressureReadingInput(int i13, int i14) {
        this.systolicMmhg = i13;
        this.diastolicMmhg = i14;
    }

    public static /* synthetic */ ManualBloodPressureReadingInput copy$default(ManualBloodPressureReadingInput manualBloodPressureReadingInput, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = manualBloodPressureReadingInput.systolicMmhg;
        }
        if ((i15 & 2) != 0) {
            i14 = manualBloodPressureReadingInput.diastolicMmhg;
        }
        return manualBloodPressureReadingInput.copy(i13, i14);
    }

    public static final /* synthetic */ void write$Self$sage_release(ManualBloodPressureReadingInput self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeIntElement(serialDesc, 0, self.systolicMmhg);
        output.encodeIntElement(serialDesc, 1, self.diastolicMmhg);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSystolicMmhg() {
        return this.systolicMmhg;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDiastolicMmhg() {
        return this.diastolicMmhg;
    }

    public final ManualBloodPressureReadingInput copy(int systolicMmhg, int diastolicMmhg) {
        return new ManualBloodPressureReadingInput(systolicMmhg, diastolicMmhg);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ManualBloodPressureReadingInput)) {
            return false;
        }
        ManualBloodPressureReadingInput manualBloodPressureReadingInput = (ManualBloodPressureReadingInput) other;
        return this.systolicMmhg == manualBloodPressureReadingInput.systolicMmhg && this.diastolicMmhg == manualBloodPressureReadingInput.diastolicMmhg;
    }

    public final int getDiastolicMmhg() {
        return this.diastolicMmhg;
    }

    public final int getSystolicMmhg() {
        return this.systolicMmhg;
    }

    public int hashCode() {
        return Integer.hashCode(this.diastolicMmhg) + (Integer.hashCode(this.systolicMmhg) * 31);
    }

    public String toString() {
        return AbstractC25012a.m73372e(this.systolicMmhg, this.diastolicMmhg, "ManualBloodPressureReadingInput(systolicMmhg=", ", diastolicMmhg=", ")");
    }

    public /* synthetic */ ManualBloodPressureReadingInput(int i13, int i14, int i15, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, ManualBloodPressureReadingInput$$serializer.INSTANCE.getDescriptor());
        }
        this.systolicMmhg = i14;
        this.diastolicMmhg = i15;
    }
}
