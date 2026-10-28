package com.whoop.design.models;

import com.whoop.design.models.items.ImpactStyle;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ8\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b+\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001d¨\u00060"}, m65681d2 = {"Lcom/whoop/design/models/MagnitudeDetailCardModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "magnitudeDisplay", "countDisplay", "impactDisplay", "Lcom/whoop/design/models/items/ImpactStyle;", "impactStyle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactStyle;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactStyle;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/MagnitudeDetailCardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/whoop/design/models/items/ImpactStyle;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactStyle;)Lcom/whoop/design/models/MagnitudeDetailCardModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMagnitudeDisplay", "getCountDisplay", "getImpactDisplay", "Lcom/whoop/design/models/items/ImpactStyle;", "getImpactStyle", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MagnitudeDetailCardModel implements DesignSystemModel {
    public static final int $stable = 0;
    private final String countDisplay;
    private final String impactDisplay;
    private final ImpactStyle impactStyle;
    private final String magnitudeDisplay;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C6909a(13))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/MagnitudeDetailCardModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/MagnitudeDetailCardModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MagnitudeDetailCardModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MagnitudeDetailCardModel(int i13, String str, String str2, String str3, ImpactStyle impactStyle, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, MagnitudeDetailCardModel$$serializer.INSTANCE.getDescriptor());
        }
        this.magnitudeDisplay = str;
        this.countDisplay = str2;
        this.impactDisplay = str3;
        this.impactStyle = impactStyle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.ImpactStyle", ImpactStyle.values());
    }

    public static /* synthetic */ MagnitudeDetailCardModel copy$default(MagnitudeDetailCardModel magnitudeDetailCardModel, String str, String str2, String str3, ImpactStyle impactStyle, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = magnitudeDetailCardModel.magnitudeDisplay;
        }
        if ((i13 & 2) != 0) {
            str2 = magnitudeDetailCardModel.countDisplay;
        }
        if ((i13 & 4) != 0) {
            str3 = magnitudeDetailCardModel.impactDisplay;
        }
        if ((i13 & 8) != 0) {
            impactStyle = magnitudeDetailCardModel.impactStyle;
        }
        return magnitudeDetailCardModel.copy(str, str2, str3, impactStyle);
    }

    public static final /* synthetic */ void write$Self$design_models_release(MagnitudeDetailCardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.magnitudeDisplay);
        output.encodeStringElement(serialDesc, 1, self.countDisplay);
        output.encodeStringElement(serialDesc, 2, self.impactDisplay);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.impactStyle);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMagnitudeDisplay() {
        return this.magnitudeDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCountDisplay() {
        return this.countDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getImpactDisplay() {
        return this.impactDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ImpactStyle getImpactStyle() {
        return this.impactStyle;
    }

    public final MagnitudeDetailCardModel copy(String magnitudeDisplay, String countDisplay, String impactDisplay, ImpactStyle impactStyle) {
        AbstractC22676k.m65750j(magnitudeDisplay, "magnitudeDisplay");
        AbstractC22676k.m65750j(countDisplay, "countDisplay");
        AbstractC22676k.m65750j(impactDisplay, "impactDisplay");
        AbstractC22676k.m65750j(impactStyle, "impactStyle");
        return new MagnitudeDetailCardModel(magnitudeDisplay, countDisplay, impactDisplay, impactStyle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MagnitudeDetailCardModel)) {
            return false;
        }
        MagnitudeDetailCardModel magnitudeDetailCardModel = (MagnitudeDetailCardModel) other;
        return AbstractC22676k.m65745e(this.magnitudeDisplay, magnitudeDetailCardModel.magnitudeDisplay) && AbstractC22676k.m65745e(this.countDisplay, magnitudeDetailCardModel.countDisplay) && AbstractC22676k.m65745e(this.impactDisplay, magnitudeDetailCardModel.impactDisplay) && this.impactStyle == magnitudeDetailCardModel.impactStyle;
    }

    public final String getCountDisplay() {
        return this.countDisplay;
    }

    public final String getImpactDisplay() {
        return this.impactDisplay;
    }

    public final ImpactStyle getImpactStyle() {
        return this.impactStyle;
    }

    public final String getMagnitudeDisplay() {
        return this.magnitudeDisplay;
    }

    public int hashCode() {
        return this.impactStyle.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.magnitudeDisplay.hashCode() * 31, 31, this.countDisplay), 31, this.impactDisplay);
    }

    public String toString() {
        String str = this.magnitudeDisplay;
        String str2 = this.countDisplay;
        String str3 = this.impactDisplay;
        ImpactStyle impactStyle = this.impactStyle;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("MagnitudeDetailCardModel(magnitudeDisplay=", str, ", countDisplay=", str2, ", impactDisplay=");
        sbM32001t.append(str3);
        sbM32001t.append(", impactStyle=");
        sbM32001t.append(impactStyle);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public MagnitudeDetailCardModel(String magnitudeDisplay, String countDisplay, String impactDisplay, ImpactStyle impactStyle) {
        AbstractC22676k.m65750j(magnitudeDisplay, "magnitudeDisplay");
        AbstractC22676k.m65750j(countDisplay, "countDisplay");
        AbstractC22676k.m65750j(impactDisplay, "impactDisplay");
        AbstractC22676k.m65750j(impactStyle, "impactStyle");
        this.magnitudeDisplay = magnitudeDisplay;
        this.countDisplay = countDisplay;
        this.impactDisplay = impactDisplay;
        this.impactStyle = impactStyle;
    }
}
