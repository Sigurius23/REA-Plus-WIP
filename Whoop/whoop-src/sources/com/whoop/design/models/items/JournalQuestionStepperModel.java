package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:9BQ\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fB[\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0012\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$JZ\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001cJ\u0010\u0010(\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b2\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b4\u0010 R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b5\u0010 R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b6\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b8\u0010$¨\u0006;"}, m65681d2 = {"Lcom/whoop/design/models/items/JournalQuestionStepperModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "label", "units", "", "minimumInclusive", "maximumInclusive", "interval", "initial", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDLjava/lang/Double;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDLjava/lang/Double;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/JournalQuestionStepperModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()D", "component5", "component6", "component7", "()Ljava/lang/Double;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDLjava/lang/Double;)Lcom/whoop/design/models/items/JournalQuestionStepperModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getLabel", "getUnits", "D", "getMinimumInclusive", "getMaximumInclusive", "getInterval", "Ljava/lang/Double;", "getInitial", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class JournalQuestionStepperModel implements DesignSystemModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String id;
    private final Double initial;
    private final double interval;
    private final String label;
    private final double maximumInclusive;
    private final double minimumInclusive;
    private final String units;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/JournalQuestionStepperModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/JournalQuestionStepperModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return JournalQuestionStepperModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public JournalQuestionStepperModel() {
        this((String) null, (String) null, (String) null, 0.0d, 0.0d, 0.0d, (Double) null, 127, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ JournalQuestionStepperModel copy$default(JournalQuestionStepperModel journalQuestionStepperModel, String str, String str2, String str3, double d3, double d14, double d15, Double d16, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = journalQuestionStepperModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = journalQuestionStepperModel.label;
        }
        if ((i13 & 4) != 0) {
            str3 = journalQuestionStepperModel.units;
        }
        if ((i13 & 8) != 0) {
            d3 = journalQuestionStepperModel.minimumInclusive;
        }
        if ((i13 & 16) != 0) {
            d14 = journalQuestionStepperModel.maximumInclusive;
        }
        if ((i13 & 32) != 0) {
            d15 = journalQuestionStepperModel.interval;
        }
        if ((i13 & 64) != 0) {
            d16 = journalQuestionStepperModel.initial;
        }
        Double d17 = d16;
        double d18 = d15;
        double d19 = d14;
        String str4 = str3;
        return journalQuestionStepperModel.copy(str, str2, str4, d3, d19, d18, d17);
    }

    public static final /* synthetic */ void write$Self$design_models_release(JournalQuestionStepperModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.id, "")) {
            output.encodeStringElement(serialDesc, 0, self.id);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.label, "")) {
            output.encodeStringElement(serialDesc, 1, self.label);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.units != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.units);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || Double.compare(self.minimumInclusive, 0.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 3, self.minimumInclusive);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || Double.compare(self.maximumInclusive, 0.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 4, self.maximumInclusive);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || Double.compare(self.interval, 1.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 5, self.interval);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && self.initial == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 6, DoubleSerializer.INSTANCE, self.initial);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUnits() {
        return this.units;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getMinimumInclusive() {
        return this.minimumInclusive;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getMaximumInclusive() {
        return this.maximumInclusive;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final double getInterval() {
        return this.interval;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Double getInitial() {
        return this.initial;
    }

    public final JournalQuestionStepperModel copy(String id4, String label, String units, double minimumInclusive, double maximumInclusive, double interval, Double initial) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(label, "label");
        return new JournalQuestionStepperModel(id4, label, units, minimumInclusive, maximumInclusive, interval, initial);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JournalQuestionStepperModel)) {
            return false;
        }
        JournalQuestionStepperModel journalQuestionStepperModel = (JournalQuestionStepperModel) other;
        return AbstractC22676k.m65745e(this.id, journalQuestionStepperModel.id) && AbstractC22676k.m65745e(this.label, journalQuestionStepperModel.label) && AbstractC22676k.m65745e(this.units, journalQuestionStepperModel.units) && Double.compare(this.minimumInclusive, journalQuestionStepperModel.minimumInclusive) == 0 && Double.compare(this.maximumInclusive, journalQuestionStepperModel.maximumInclusive) == 0 && Double.compare(this.interval, journalQuestionStepperModel.interval) == 0 && AbstractC22676k.m65745e(this.initial, journalQuestionStepperModel.initial);
    }

    public final String getId() {
        return this.id;
    }

    public final Double getInitial() {
        return this.initial;
    }

    public final double getInterval() {
        return this.interval;
    }

    public final String getLabel() {
        return this.label;
    }

    public final double getMaximumInclusive() {
        return this.maximumInclusive;
    }

    public final double getMinimumInclusive() {
        return this.minimumInclusive;
    }

    public final String getUnits() {
        return this.units;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.label);
        String str = this.units;
        int iM48499a = AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC17176i.m48499a((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.minimumInclusive), 31, this.maximumInclusive), 31, this.interval);
        Double d3 = this.initial;
        return iM48499a + (d3 != null ? d3.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.label;
        String str3 = this.units;
        double d3 = this.minimumInclusive;
        double d14 = this.maximumInclusive;
        double d15 = this.interval;
        Double d16 = this.initial;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("JournalQuestionStepperModel(id=", str, ", label=", str2, ", units=");
        sbM32001t.append(str3);
        sbM32001t.append(", minimumInclusive=");
        sbM32001t.append(d3);
        AbstractC31061c.m95622B(sbM32001t, ", maximumInclusive=", d14, ", interval=");
        sbM32001t.append(d15);
        sbM32001t.append(", initial=");
        sbM32001t.append(d16);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ JournalQuestionStepperModel(int i13, String str, String str2, String str3, double d3, double d14, double d15, Double d16, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.id = "";
        } else {
            this.id = str;
        }
        if ((i13 & 2) == 0) {
            this.label = "";
        } else {
            this.label = str2;
        }
        if ((i13 & 4) == 0) {
            this.units = null;
        } else {
            this.units = str3;
        }
        if ((i13 & 8) == 0) {
            this.minimumInclusive = 0.0d;
        } else {
            this.minimumInclusive = d3;
        }
        if ((i13 & 16) == 0) {
            this.maximumInclusive = 0.0d;
        } else {
            this.maximumInclusive = d14;
        }
        if ((i13 & 32) == 0) {
            this.interval = 1.0d;
        } else {
            this.interval = d15;
        }
        if ((i13 & 64) == 0) {
            this.initial = null;
        } else {
            this.initial = d16;
        }
    }

    public JournalQuestionStepperModel(String id4, String label, String str, double d3, double d14, double d15, Double d16) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(label, "label");
        this.id = id4;
        this.label = label;
        this.units = str;
        this.minimumInclusive = d3;
        this.maximumInclusive = d14;
        this.interval = d15;
        this.initial = d16;
    }

    public /* synthetic */ JournalQuestionStepperModel(String str, String str2, String str3, double d3, double d14, double d15, Double d16, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? 0.0d : d3, (i13 & 16) != 0 ? 0.0d : d14, (i13 & 32) != 0 ? 1.0d : d15, (i13 & 64) != 0 ? null : d16);
    }
}
