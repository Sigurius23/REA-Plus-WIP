package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36960g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rBa\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0010\u0010\"\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b$\u0010#J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001dJV\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b2\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b4\u0010 R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b5\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b7\u0010#R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b8\u0010#R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b9\u0010\u001d¨\u0006<"}, m65681d2 = {"Lcom/whoop/design/models/items/LockedImpactOnRecoveryModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "title", "value", "Lcom/whoop/design/models/items/ImpactStyle;", "style", "description", "Lcom/whoop/design/models/items/DetailsAnswers;", "detailsYesAnswers", "detailsNoAnswers", "ctaButtonLabel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactStyle;Ljava/lang/String;Lcom/whoop/design/models/items/DetailsAnswers;Lcom/whoop/design/models/items/DetailsAnswers;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactStyle;Ljava/lang/String;Lcom/whoop/design/models/items/DetailsAnswers;Lcom/whoop/design/models/items/DetailsAnswers;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/LockedImpactOnRecoveryModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/design/models/items/ImpactStyle;", "component4", "component5", "()Lcom/whoop/design/models/items/DetailsAnswers;", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactStyle;Ljava/lang/String;Lcom/whoop/design/models/items/DetailsAnswers;Lcom/whoop/design/models/items/DetailsAnswers;Ljava/lang/String;)Lcom/whoop/design/models/items/LockedImpactOnRecoveryModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getValue", "Lcom/whoop/design/models/items/ImpactStyle;", "getStyle", "getDescription", "Lcom/whoop/design/models/items/DetailsAnswers;", "getDetailsYesAnswers", "getDetailsNoAnswers", "getCtaButtonLabel", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class LockedImpactOnRecoveryModel implements DesignSystemModel {
    public static final int $stable = 0;
    private final String ctaButtonLabel;
    private final String description;
    private final DetailsAnswers detailsNoAnswers;
    private final DetailsAnswers detailsYesAnswers;
    private final ImpactStyle style;
    private final String title;
    private final String value;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36960g(9)), null, null, null, null};

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/LockedImpactOnRecoveryModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/LockedImpactOnRecoveryModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return LockedImpactOnRecoveryModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ LockedImpactOnRecoveryModel(int i13, String str, String str2, ImpactStyle impactStyle, String str3, DetailsAnswers detailsAnswers, DetailsAnswers detailsAnswers2, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, LockedImpactOnRecoveryModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.value = str2;
        this.style = impactStyle;
        this.description = str3;
        this.detailsYesAnswers = detailsAnswers;
        this.detailsNoAnswers = detailsAnswers2;
        this.ctaButtonLabel = str4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.ImpactStyle", ImpactStyle.values());
    }

    public static /* synthetic */ LockedImpactOnRecoveryModel copy$default(LockedImpactOnRecoveryModel lockedImpactOnRecoveryModel, String str, String str2, ImpactStyle impactStyle, String str3, DetailsAnswers detailsAnswers, DetailsAnswers detailsAnswers2, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = lockedImpactOnRecoveryModel.title;
        }
        if ((i13 & 2) != 0) {
            str2 = lockedImpactOnRecoveryModel.value;
        }
        if ((i13 & 4) != 0) {
            impactStyle = lockedImpactOnRecoveryModel.style;
        }
        if ((i13 & 8) != 0) {
            str3 = lockedImpactOnRecoveryModel.description;
        }
        if ((i13 & 16) != 0) {
            detailsAnswers = lockedImpactOnRecoveryModel.detailsYesAnswers;
        }
        if ((i13 & 32) != 0) {
            detailsAnswers2 = lockedImpactOnRecoveryModel.detailsNoAnswers;
        }
        if ((i13 & 64) != 0) {
            str4 = lockedImpactOnRecoveryModel.ctaButtonLabel;
        }
        DetailsAnswers detailsAnswers3 = detailsAnswers2;
        String str5 = str4;
        DetailsAnswers detailsAnswers4 = detailsAnswers;
        ImpactStyle impactStyle2 = impactStyle;
        return lockedImpactOnRecoveryModel.copy(str, str2, impactStyle2, str3, detailsAnswers4, detailsAnswers3, str5);
    }

    public static final /* synthetic */ void write$Self$design_models_release(LockedImpactOnRecoveryModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeStringElement(serialDesc, 1, self.value);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.style);
        output.encodeStringElement(serialDesc, 3, self.description);
        DetailsAnswers$$serializer detailsAnswers$$serializer = DetailsAnswers$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 4, detailsAnswers$$serializer, self.detailsYesAnswers);
        output.encodeSerializableElement(serialDesc, 5, detailsAnswers$$serializer, self.detailsNoAnswers);
        output.encodeStringElement(serialDesc, 6, self.ctaButtonLabel);
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
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final DetailsAnswers getDetailsYesAnswers() {
        return this.detailsYesAnswers;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final DetailsAnswers getDetailsNoAnswers() {
        return this.detailsNoAnswers;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCtaButtonLabel() {
        return this.ctaButtonLabel;
    }

    public final LockedImpactOnRecoveryModel copy(String title, String value, ImpactStyle style, String description, DetailsAnswers detailsYesAnswers, DetailsAnswers detailsNoAnswers, String ctaButtonLabel) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(value, "value");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(detailsYesAnswers, "detailsYesAnswers");
        AbstractC22676k.m65750j(detailsNoAnswers, "detailsNoAnswers");
        AbstractC22676k.m65750j(ctaButtonLabel, "ctaButtonLabel");
        return new LockedImpactOnRecoveryModel(title, value, style, description, detailsYesAnswers, detailsNoAnswers, ctaButtonLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LockedImpactOnRecoveryModel)) {
            return false;
        }
        LockedImpactOnRecoveryModel lockedImpactOnRecoveryModel = (LockedImpactOnRecoveryModel) other;
        return AbstractC22676k.m65745e(this.title, lockedImpactOnRecoveryModel.title) && AbstractC22676k.m65745e(this.value, lockedImpactOnRecoveryModel.value) && this.style == lockedImpactOnRecoveryModel.style && AbstractC22676k.m65745e(this.description, lockedImpactOnRecoveryModel.description) && AbstractC22676k.m65745e(this.detailsYesAnswers, lockedImpactOnRecoveryModel.detailsYesAnswers) && AbstractC22676k.m65745e(this.detailsNoAnswers, lockedImpactOnRecoveryModel.detailsNoAnswers) && AbstractC22676k.m65745e(this.ctaButtonLabel, lockedImpactOnRecoveryModel.ctaButtonLabel);
    }

    public final String getCtaButtonLabel() {
        return this.ctaButtonLabel;
    }

    public final String getDescription() {
        return this.description;
    }

    public final DetailsAnswers getDetailsNoAnswers() {
        return this.detailsNoAnswers;
    }

    public final DetailsAnswers getDetailsYesAnswers() {
        return this.detailsYesAnswers;
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
        return this.ctaButtonLabel.hashCode() + ((this.detailsNoAnswers.hashCode() + ((this.detailsYesAnswers.hashCode() + AbstractC11266d.m30450d((this.style.hashCode() + AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.value)) * 31, 31, this.description)) * 31)) * 31);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.value;
        ImpactStyle impactStyle = this.style;
        String str3 = this.description;
        DetailsAnswers detailsAnswers = this.detailsYesAnswers;
        DetailsAnswers detailsAnswers2 = this.detailsNoAnswers;
        String str4 = this.ctaButtonLabel;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("LockedImpactOnRecoveryModel(title=", str, ", value=", str2, ", style=");
        sbM32001t.append(impactStyle);
        sbM32001t.append(", description=");
        sbM32001t.append(str3);
        sbM32001t.append(", detailsYesAnswers=");
        sbM32001t.append(detailsAnswers);
        sbM32001t.append(", detailsNoAnswers=");
        sbM32001t.append(detailsAnswers2);
        sbM32001t.append(", ctaButtonLabel=");
        return AbstractC25012a.m73376i(str4, ")", sbM32001t);
    }

    public LockedImpactOnRecoveryModel(String title, String value, ImpactStyle style, String description, DetailsAnswers detailsYesAnswers, DetailsAnswers detailsNoAnswers, String ctaButtonLabel) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(value, "value");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(detailsYesAnswers, "detailsYesAnswers");
        AbstractC22676k.m65750j(detailsNoAnswers, "detailsNoAnswers");
        AbstractC22676k.m65750j(ctaButtonLabel, "ctaButtonLabel");
        this.title = title;
        this.value = value;
        this.style = style;
        this.description = description;
        this.detailsYesAnswers = detailsYesAnswers;
        this.detailsNoAnswers = detailsNoAnswers;
        this.ctaButtonLabel = ctaButtonLabel;
    }
}
