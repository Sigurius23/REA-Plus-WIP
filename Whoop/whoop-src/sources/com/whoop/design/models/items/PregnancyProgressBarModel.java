package com.whoop.design.models.items;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import lz0.EnumC24819d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import w91.C36961h;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBG\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b!\u0010\"JD\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020\b2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b1\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b5\u0010\"¨\u00068"}, m65681d2 = {"Lcom/whoop/design/models/items/PregnancyProgressBarModel;", "", "Llz0/d;", "style", "", "rangeMin", "rangeMax", "currentValue", "", "showAnnotation", "<init>", "(Llz0/d;DDLjava/lang/Double;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILlz0/d;DDLjava/lang/Double;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/PregnancyProgressBarModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Llz0/d;", "component2", "()D", "component3", "component4", "()Ljava/lang/Double;", "component5", "()Z", "copy", "(Llz0/d;DDLjava/lang/Double;Z)Lcom/whoop/design/models/items/PregnancyProgressBarModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Llz0/d;", "getStyle", "D", "getRangeMin", "getRangeMax", "Ljava/lang/Double;", "getCurrentValue", "Z", "getShowAnnotation", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PregnancyProgressBarModel {
    public static final int $stable = 0;
    private final Double currentValue;
    private final double rangeMax;
    private final double rangeMin;
    private final boolean showAnnotation;
    private final EnumC24819d style;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36961h(22)), null, null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/PregnancyProgressBarModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/PregnancyProgressBarModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PregnancyProgressBarModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PregnancyProgressBarModel(int i13, EnumC24819d enumC24819d, double d3, double d14, Double d15, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, PregnancyProgressBarModel$$serializer.INSTANCE.getDescriptor());
        }
        this.style = enumC24819d;
        this.rangeMin = d3;
        this.rangeMax = d14;
        this.currentValue = d15;
        this.showAnnotation = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.atom.progressbar.PregnancyProgressPlotStyle", EnumC24819d.values());
    }

    public static /* synthetic */ PregnancyProgressBarModel copy$default(PregnancyProgressBarModel pregnancyProgressBarModel, EnumC24819d enumC24819d, double d3, double d14, Double d15, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            enumC24819d = pregnancyProgressBarModel.style;
        }
        if ((i13 & 2) != 0) {
            d3 = pregnancyProgressBarModel.rangeMin;
        }
        if ((i13 & 4) != 0) {
            d14 = pregnancyProgressBarModel.rangeMax;
        }
        if ((i13 & 8) != 0) {
            d15 = pregnancyProgressBarModel.currentValue;
        }
        if ((i13 & 16) != 0) {
            z4 = pregnancyProgressBarModel.showAnnotation;
        }
        double d16 = d14;
        return pregnancyProgressBarModel.copy(enumC24819d, d3, d16, d15, z4);
    }

    public static final /* synthetic */ void write$Self$design_models_release(PregnancyProgressBarModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) $childSerializers[0].getValue(), self.style);
        output.encodeDoubleElement(serialDesc, 1, self.rangeMin);
        output.encodeDoubleElement(serialDesc, 2, self.rangeMax);
        output.encodeNullableSerializableElement(serialDesc, 3, DoubleSerializer.INSTANCE, self.currentValue);
        output.encodeBooleanElement(serialDesc, 4, self.showAnnotation);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EnumC24819d getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getRangeMin() {
        return this.rangeMin;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getRangeMax() {
        return this.rangeMax;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getCurrentValue() {
        return this.currentValue;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getShowAnnotation() {
        return this.showAnnotation;
    }

    public final PregnancyProgressBarModel copy(EnumC24819d style, double rangeMin, double rangeMax, Double currentValue, boolean showAnnotation) {
        AbstractC22676k.m65750j(style, "style");
        return new PregnancyProgressBarModel(style, rangeMin, rangeMax, currentValue, showAnnotation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PregnancyProgressBarModel)) {
            return false;
        }
        PregnancyProgressBarModel pregnancyProgressBarModel = (PregnancyProgressBarModel) other;
        return this.style == pregnancyProgressBarModel.style && Double.compare(this.rangeMin, pregnancyProgressBarModel.rangeMin) == 0 && Double.compare(this.rangeMax, pregnancyProgressBarModel.rangeMax) == 0 && AbstractC22676k.m65745e(this.currentValue, pregnancyProgressBarModel.currentValue) && this.showAnnotation == pregnancyProgressBarModel.showAnnotation;
    }

    public final Double getCurrentValue() {
        return this.currentValue;
    }

    public final double getRangeMax() {
        return this.rangeMax;
    }

    public final double getRangeMin() {
        return this.rangeMin;
    }

    public final boolean getShowAnnotation() {
        return this.showAnnotation;
    }

    public final EnumC24819d getStyle() {
        return this.style;
    }

    public int hashCode() {
        int iM48499a = AbstractC17176i.m48499a(AbstractC17176i.m48499a(this.style.hashCode() * 31, 31, this.rangeMin), 31, this.rangeMax);
        Double d3 = this.currentValue;
        return Boolean.hashCode(this.showAnnotation) + ((iM48499a + (d3 == null ? 0 : d3.hashCode())) * 31);
    }

    public String toString() {
        EnumC24819d enumC24819d = this.style;
        double d3 = this.rangeMin;
        double d14 = this.rangeMax;
        Double d15 = this.currentValue;
        boolean z4 = this.showAnnotation;
        StringBuilder sb4 = new StringBuilder("PregnancyProgressBarModel(style=");
        sb4.append(enumC24819d);
        sb4.append(", rangeMin=");
        sb4.append(d3);
        AbstractC31061c.m95622B(sb4, ", rangeMax=", d14, ", currentValue=");
        sb4.append(d15);
        sb4.append(", showAnnotation=");
        sb4.append(z4);
        sb4.append(")");
        return sb4.toString();
    }

    public PregnancyProgressBarModel(EnumC24819d style, double d3, double d14, Double d15, boolean z4) {
        AbstractC22676k.m65750j(style, "style");
        this.style = style;
        this.rangeMin = d3;
        this.rangeMax = d14;
        this.currentValue = d15;
        this.showAnnotation = z4;
    }
}
