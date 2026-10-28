package com.whoop.design.models.items;

import androidx.core.app.FrameMetricsAggregator;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import md1.C25452a;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import w91.C36957d;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import z51.EnumC40100k;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0002EDBO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010Bi\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0010\u0010$\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010 J\u0010\u0010'\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b)\u0010(J\u0010\u0010*\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b*\u0010+Jj\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020.HÖ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00105\u001a\u00020\r2\b\u00104\u001a\u0004\u0018\u000103HÖ\u0003¢\u0006\u0004\b5\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00107\u001a\u0004\b9\u0010 R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b:\u0010 R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b;\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010<\u001a\u0004\b=\u0010%R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b>\u0010 R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010?\u001a\u0004\b@\u0010(R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u0010?\u001a\u0004\bA\u0010(R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010B\u001a\u0004\bC\u0010+¨\u0006F"}, m65681d2 = {"Lcom/whoop/design/models/items/ExplainerGaugeModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "optimalStrainPercent", "lowerOptimalStrainFillValue", "higherOptimalStrainFillValue", "recoveryPercentage", "Lz51/k;", "recoveryLevel", "strainScorePercentage", "Lcom/whoop/design/util/TextResource;", "descriptionText", "descriptionSubText", "", "hasDivider", "<init>", "(FFFFLz51/k;FLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IFFFFLz51/k;FLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/ExplainerGaugeModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()F", "component2", "component3", "component4", "component5", "()Lz51/k;", "component6", "component7", "()Lcom/whoop/design/util/TextResource;", "component8", "component9", "()Z", "copy", "(FFFFLz51/k;FLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Z)Lcom/whoop/design/models/items/ExplainerGaugeModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "F", "getOptimalStrainPercent", "getLowerOptimalStrainFillValue", "getHigherOptimalStrainFillValue", "getRecoveryPercentage", "Lz51/k;", "getRecoveryLevel", "getStrainScorePercentage", "Lcom/whoop/design/util/TextResource;", "getDescriptionText", "getDescriptionSubText", "Z", "getHasDivider", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ExplainerGaugeModel implements DesignSystemModel {
    private final TextResource descriptionSubText;
    private final TextResource descriptionText;
    private final boolean hasDivider;
    private final float higherOptimalStrainFillValue;
    private final float lowerOptimalStrainFillValue;
    private final float optimalStrainPercent;
    private final EnumC40100k recoveryLevel;
    private final float recoveryPercentage;
    private final float strainScorePercentage;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = TextResource.$stable;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36957d(6)), null, null, null, null};

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/ExplainerGaugeModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/ExplainerGaugeModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ExplainerGaugeModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ExplainerGaugeModel(float f13, float f14, float f15, float f16, EnumC40100k recoveryLevel, float f17, TextResource descriptionText, TextResource descriptionSubText, boolean z4) {
        AbstractC22676k.m65750j(recoveryLevel, "recoveryLevel");
        AbstractC22676k.m65750j(descriptionText, "descriptionText");
        AbstractC22676k.m65750j(descriptionSubText, "descriptionSubText");
        this.optimalStrainPercent = f13;
        this.lowerOptimalStrainFillValue = f14;
        this.higherOptimalStrainFillValue = f15;
        this.recoveryPercentage = f16;
        this.recoveryLevel = recoveryLevel;
        this.strainScorePercentage = f17;
        this.descriptionText = descriptionText;
        this.descriptionSubText = descriptionSubText;
        this.hasDivider = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.organism.gauge.OverviewGaugeRecoveryType", EnumC40100k.values());
    }

    public static /* synthetic */ ExplainerGaugeModel copy$default(ExplainerGaugeModel explainerGaugeModel, float f13, float f14, float f15, float f16, EnumC40100k enumC40100k, float f17, TextResource textResource, TextResource textResource2, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f13 = explainerGaugeModel.optimalStrainPercent;
        }
        if ((i13 & 2) != 0) {
            f14 = explainerGaugeModel.lowerOptimalStrainFillValue;
        }
        if ((i13 & 4) != 0) {
            f15 = explainerGaugeModel.higherOptimalStrainFillValue;
        }
        if ((i13 & 8) != 0) {
            f16 = explainerGaugeModel.recoveryPercentage;
        }
        if ((i13 & 16) != 0) {
            enumC40100k = explainerGaugeModel.recoveryLevel;
        }
        if ((i13 & 32) != 0) {
            f17 = explainerGaugeModel.strainScorePercentage;
        }
        if ((i13 & 64) != 0) {
            textResource = explainerGaugeModel.descriptionText;
        }
        if ((i13 & 128) != 0) {
            textResource2 = explainerGaugeModel.descriptionSubText;
        }
        if ((i13 & 256) != 0) {
            z4 = explainerGaugeModel.hasDivider;
        }
        TextResource textResource3 = textResource2;
        boolean z13 = z4;
        float f18 = f17;
        TextResource textResource4 = textResource;
        EnumC40100k enumC40100k2 = enumC40100k;
        float f19 = f15;
        return explainerGaugeModel.copy(f13, f14, f19, f16, enumC40100k2, f18, textResource4, textResource3, z13);
    }

    public static final /* synthetic */ void write$Self$design_models_release(ExplainerGaugeModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeFloatElement(serialDesc, 0, self.optimalStrainPercent);
        output.encodeFloatElement(serialDesc, 1, self.lowerOptimalStrainFillValue);
        output.encodeFloatElement(serialDesc, 2, self.higherOptimalStrainFillValue);
        output.encodeFloatElement(serialDesc, 3, self.recoveryPercentage);
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.recoveryLevel);
        output.encodeFloatElement(serialDesc, 5, self.strainScorePercentage);
        C25452a c25452a = C25452a.f99689a;
        output.encodeSerializableElement(serialDesc, 6, c25452a, self.descriptionText);
        output.encodeSerializableElement(serialDesc, 7, c25452a, self.descriptionSubText);
        output.encodeBooleanElement(serialDesc, 8, self.hasDivider);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getOptimalStrainPercent() {
        return this.optimalStrainPercent;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getLowerOptimalStrainFillValue() {
        return this.lowerOptimalStrainFillValue;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getHigherOptimalStrainFillValue() {
        return this.higherOptimalStrainFillValue;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getRecoveryPercentage() {
        return this.recoveryPercentage;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final EnumC40100k getRecoveryLevel() {
        return this.recoveryLevel;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final float getStrainScorePercentage() {
        return this.strainScorePercentage;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final TextResource getDescriptionText() {
        return this.descriptionText;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final TextResource getDescriptionSubText() {
        return this.descriptionSubText;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getHasDivider() {
        return this.hasDivider;
    }

    public final ExplainerGaugeModel copy(float optimalStrainPercent, float lowerOptimalStrainFillValue, float higherOptimalStrainFillValue, float recoveryPercentage, EnumC40100k recoveryLevel, float strainScorePercentage, TextResource descriptionText, TextResource descriptionSubText, boolean hasDivider) {
        AbstractC22676k.m65750j(recoveryLevel, "recoveryLevel");
        AbstractC22676k.m65750j(descriptionText, "descriptionText");
        AbstractC22676k.m65750j(descriptionSubText, "descriptionSubText");
        return new ExplainerGaugeModel(optimalStrainPercent, lowerOptimalStrainFillValue, higherOptimalStrainFillValue, recoveryPercentage, recoveryLevel, strainScorePercentage, descriptionText, descriptionSubText, hasDivider);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExplainerGaugeModel)) {
            return false;
        }
        ExplainerGaugeModel explainerGaugeModel = (ExplainerGaugeModel) other;
        return Float.compare(this.optimalStrainPercent, explainerGaugeModel.optimalStrainPercent) == 0 && Float.compare(this.lowerOptimalStrainFillValue, explainerGaugeModel.lowerOptimalStrainFillValue) == 0 && Float.compare(this.higherOptimalStrainFillValue, explainerGaugeModel.higherOptimalStrainFillValue) == 0 && Float.compare(this.recoveryPercentage, explainerGaugeModel.recoveryPercentage) == 0 && this.recoveryLevel == explainerGaugeModel.recoveryLevel && Float.compare(this.strainScorePercentage, explainerGaugeModel.strainScorePercentage) == 0 && AbstractC22676k.m65745e(this.descriptionText, explainerGaugeModel.descriptionText) && AbstractC22676k.m65745e(this.descriptionSubText, explainerGaugeModel.descriptionSubText) && this.hasDivider == explainerGaugeModel.hasDivider;
    }

    public final TextResource getDescriptionSubText() {
        return this.descriptionSubText;
    }

    public final TextResource getDescriptionText() {
        return this.descriptionText;
    }

    public final boolean getHasDivider() {
        return this.hasDivider;
    }

    public final float getHigherOptimalStrainFillValue() {
        return this.higherOptimalStrainFillValue;
    }

    public final float getLowerOptimalStrainFillValue() {
        return this.lowerOptimalStrainFillValue;
    }

    public final float getOptimalStrainPercent() {
        return this.optimalStrainPercent;
    }

    public final EnumC40100k getRecoveryLevel() {
        return this.recoveryLevel;
    }

    public final float getRecoveryPercentage() {
        return this.recoveryPercentage;
    }

    public final float getStrainScorePercentage() {
        return this.strainScorePercentage;
    }

    public int hashCode() {
        return Boolean.hashCode(this.hasDivider) + AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC11266d.m30447a(this.strainScorePercentage, (this.recoveryLevel.hashCode() + AbstractC11266d.m30447a(this.recoveryPercentage, AbstractC11266d.m30447a(this.higherOptimalStrainFillValue, AbstractC11266d.m30447a(this.lowerOptimalStrainFillValue, Float.hashCode(this.optimalStrainPercent) * 31, 31), 31), 31)) * 31, 31), this.descriptionText, 31), this.descriptionSubText, 31);
    }

    public String toString() {
        float f13 = this.optimalStrainPercent;
        float f14 = this.lowerOptimalStrainFillValue;
        float f15 = this.higherOptimalStrainFillValue;
        float f16 = this.recoveryPercentage;
        EnumC40100k enumC40100k = this.recoveryLevel;
        float f17 = this.strainScorePercentage;
        TextResource textResource = this.descriptionText;
        TextResource textResource2 = this.descriptionSubText;
        boolean z4 = this.hasDivider;
        StringBuilder sbM8307t = AbstractC2875y.m8307t("ExplainerGaugeModel(optimalStrainPercent=", f13, ", lowerOptimalStrainFillValue=", f14, ", higherOptimalStrainFillValue=");
        AbstractC30802r.m94772u(sbM8307t, f15, ", recoveryPercentage=", f16, ", recoveryLevel=");
        sbM8307t.append(enumC40100k);
        sbM8307t.append(", strainScorePercentage=");
        sbM8307t.append(f17);
        sbM8307t.append(", descriptionText=");
        AbstractC30007c.m91855y(sbM8307t, textResource, ", descriptionSubText=", textResource2, ", hasDivider=");
        return AbstractC18489d0.m53372m(sbM8307t, z4, ")");
    }

    public /* synthetic */ ExplainerGaugeModel(int i13, float f13, float f14, float f15, float f16, EnumC40100k enumC40100k, float f17, TextResource textResource, TextResource textResource2, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i13 & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.throwMissingFieldException(i13, FrameMetricsAggregator.EVERY_DURATION, ExplainerGaugeModel$$serializer.INSTANCE.getDescriptor());
        }
        this.optimalStrainPercent = f13;
        this.lowerOptimalStrainFillValue = f14;
        this.higherOptimalStrainFillValue = f15;
        this.recoveryPercentage = f16;
        this.recoveryLevel = enumC40100k;
        this.strainScorePercentage = f17;
        this.descriptionText = textResource;
        this.descriptionSubText = textResource2;
        this.hasDivider = z4;
    }
}
