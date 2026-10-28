package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.TextResource;
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
import w91.C36964k;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fBW\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJL\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b2\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010!R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b5\u0010\u001cR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b6\u0010\u001c¨\u00069"}, m65681d2 = {"Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "title", "value", "Lcom/whoop/design/models/items/ImpactStyle;", "style", "Lcom/whoop/design/models/items/ImpactBarSegmentModel;", "impactBarSegment", "behaviorImpactDescription", "ctaButtonLabel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactStyle;Lcom/whoop/design/models/items/ImpactBarSegmentModel;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactStyle;Lcom/whoop/design/models/items/ImpactBarSegmentModel;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/design/models/items/ImpactStyle;", "component4", "()Lcom/whoop/design/models/items/ImpactBarSegmentModel;", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactStyle;Lcom/whoop/design/models/items/ImpactBarSegmentModel;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getValue", "Lcom/whoop/design/models/items/ImpactStyle;", "getStyle", "Lcom/whoop/design/models/items/ImpactBarSegmentModel;", "getImpactBarSegment", "getBehaviorImpactDescription", "getCtaButtonLabel", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class UnlockedImpactOnRecoveryModel implements DesignSystemModel {
    private final String behaviorImpactDescription;
    private final String ctaButtonLabel;
    private final ImpactBarSegmentModel impactBarSegment;
    private final ImpactStyle style;
    private final String title;
    private final String value;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = TextResource.$stable;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36964k(29)), null, null, null};

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return UnlockedImpactOnRecoveryModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ UnlockedImpactOnRecoveryModel(int i13, String str, String str2, ImpactStyle impactStyle, ImpactBarSegmentModel impactBarSegmentModel, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, UnlockedImpactOnRecoveryModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.value = str2;
        this.style = impactStyle;
        this.impactBarSegment = impactBarSegmentModel;
        this.behaviorImpactDescription = str3;
        this.ctaButtonLabel = str4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.ImpactStyle", ImpactStyle.values());
    }

    public static /* synthetic */ UnlockedImpactOnRecoveryModel copy$default(UnlockedImpactOnRecoveryModel unlockedImpactOnRecoveryModel, String str, String str2, ImpactStyle impactStyle, ImpactBarSegmentModel impactBarSegmentModel, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = unlockedImpactOnRecoveryModel.title;
        }
        if ((i13 & 2) != 0) {
            str2 = unlockedImpactOnRecoveryModel.value;
        }
        if ((i13 & 4) != 0) {
            impactStyle = unlockedImpactOnRecoveryModel.style;
        }
        if ((i13 & 8) != 0) {
            impactBarSegmentModel = unlockedImpactOnRecoveryModel.impactBarSegment;
        }
        if ((i13 & 16) != 0) {
            str3 = unlockedImpactOnRecoveryModel.behaviorImpactDescription;
        }
        if ((i13 & 32) != 0) {
            str4 = unlockedImpactOnRecoveryModel.ctaButtonLabel;
        }
        String str5 = str3;
        String str6 = str4;
        return unlockedImpactOnRecoveryModel.copy(str, str2, impactStyle, impactBarSegmentModel, str5, str6);
    }

    public static final /* synthetic */ void write$Self$design_models_release(UnlockedImpactOnRecoveryModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeStringElement(serialDesc, 1, self.value);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.style);
        output.encodeSerializableElement(serialDesc, 3, ImpactBarSegmentModel$$serializer.INSTANCE, self.impactBarSegment);
        output.encodeStringElement(serialDesc, 4, self.behaviorImpactDescription);
        output.encodeStringElement(serialDesc, 5, self.ctaButtonLabel);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ImpactStyle getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ImpactBarSegmentModel getImpactBarSegment() {
        return this.impactBarSegment;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBehaviorImpactDescription() {
        return this.behaviorImpactDescription;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCtaButtonLabel() {
        return this.ctaButtonLabel;
    }

    public final UnlockedImpactOnRecoveryModel copy(String title, String value, ImpactStyle style, ImpactBarSegmentModel impactBarSegment, String behaviorImpactDescription, String ctaButtonLabel) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(value, "value");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(impactBarSegment, "impactBarSegment");
        AbstractC22676k.m65750j(behaviorImpactDescription, "behaviorImpactDescription");
        AbstractC22676k.m65750j(ctaButtonLabel, "ctaButtonLabel");
        return new UnlockedImpactOnRecoveryModel(title, value, style, impactBarSegment, behaviorImpactDescription, ctaButtonLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnlockedImpactOnRecoveryModel)) {
            return false;
        }
        UnlockedImpactOnRecoveryModel unlockedImpactOnRecoveryModel = (UnlockedImpactOnRecoveryModel) other;
        return AbstractC22676k.m65745e(this.title, unlockedImpactOnRecoveryModel.title) && AbstractC22676k.m65745e(this.value, unlockedImpactOnRecoveryModel.value) && this.style == unlockedImpactOnRecoveryModel.style && AbstractC22676k.m65745e(this.impactBarSegment, unlockedImpactOnRecoveryModel.impactBarSegment) && AbstractC22676k.m65745e(this.behaviorImpactDescription, unlockedImpactOnRecoveryModel.behaviorImpactDescription) && AbstractC22676k.m65745e(this.ctaButtonLabel, unlockedImpactOnRecoveryModel.ctaButtonLabel);
    }

    public final String getBehaviorImpactDescription() {
        return this.behaviorImpactDescription;
    }

    public final String getCtaButtonLabel() {
        return this.ctaButtonLabel;
    }

    public final ImpactBarSegmentModel getImpactBarSegment() {
        return this.impactBarSegment;
    }

    public final ImpactStyle getStyle() {
        return this.style;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.ctaButtonLabel.hashCode() + AbstractC11266d.m30450d((this.impactBarSegment.hashCode() + ((this.style.hashCode() + AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.value)) * 31)) * 31, 31, this.behaviorImpactDescription);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.value;
        ImpactStyle impactStyle = this.style;
        ImpactBarSegmentModel impactBarSegmentModel = this.impactBarSegment;
        String str3 = this.behaviorImpactDescription;
        String str4 = this.ctaButtonLabel;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("UnlockedImpactOnRecoveryModel(title=", str, ", value=", str2, ", style=");
        sbM32001t.append(impactStyle);
        sbM32001t.append(", impactBarSegment=");
        sbM32001t.append(impactBarSegmentModel);
        sbM32001t.append(", behaviorImpactDescription=");
        return AbstractC11266d.m30464r(sbM32001t, str3, ", ctaButtonLabel=", str4, ")");
    }

    public UnlockedImpactOnRecoveryModel(String title, String value, ImpactStyle style, ImpactBarSegmentModel impactBarSegment, String behaviorImpactDescription, String ctaButtonLabel) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(value, "value");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(impactBarSegment, "impactBarSegment");
        AbstractC22676k.m65750j(behaviorImpactDescription, "behaviorImpactDescription");
        AbstractC22676k.m65750j(ctaButtonLabel, "ctaButtonLabel");
        this.title = title;
        this.value = value;
        this.style = style;
        this.impactBarSegment = impactBarSegment;
        this.behaviorImpactDescription = behaviorImpactDescription;
        this.ctaButtonLabel = ctaButtonLabel;
    }
}
