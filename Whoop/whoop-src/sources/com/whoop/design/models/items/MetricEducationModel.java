package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import d13.AbstractC11478a;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import md1.C25452a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import r21.EnumC30883a;
import te0.AbstractC33745d;
import w91.C36960g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBM\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#JH\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010!J\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020\t2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u0010#¨\u00068"}, m65681d2 = {"Lcom/whoop/design/models/items/MetricEducationModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/util/TextResource;", "detailsEducationTitleDisplay", "detailsEducationContentDisplay", "Lr21/a;", "style", "", "icon", "", "hasCloseButton", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lr21/a;Ljava/lang/String;Ljava/lang/Boolean;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lr21/a;Ljava/lang/String;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/MetricEducationModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "component3", "()Lr21/a;", "component4", "()Ljava/lang/String;", "component5", "()Ljava/lang/Boolean;", "copy", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lr21/a;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/whoop/design/models/items/MetricEducationModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "getDetailsEducationTitleDisplay", "getDetailsEducationContentDisplay", "Lr21/a;", "getStyle", "Ljava/lang/String;", "getIcon", "Ljava/lang/Boolean;", "getHasCloseButton", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MetricEducationModel implements DesignSystemModel {
    private final TextResource detailsEducationContentDisplay;
    private final TextResource detailsEducationTitleDisplay;
    private final Boolean hasCloseButton;
    private final String icon;
    private final EnumC30883a style;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = TextResource.$stable;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36960g(18)), null, null};

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/MetricEducationModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/MetricEducationModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MetricEducationModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MetricEducationModel(int i13, TextResource textResource, TextResource textResource2, EnumC30883a enumC30883a, String str, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, MetricEducationModel$$serializer.INSTANCE.getDescriptor());
        }
        this.detailsEducationTitleDisplay = textResource;
        this.detailsEducationContentDisplay = textResource2;
        this.style = enumC30883a;
        this.icon = str;
        this.hasCloseButton = bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.molecule.metriceducation.EducationStyle", EnumC30883a.values());
    }

    public static /* synthetic */ MetricEducationModel copy$default(MetricEducationModel metricEducationModel, TextResource textResource, TextResource textResource2, EnumC30883a enumC30883a, String str, Boolean bool, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = metricEducationModel.detailsEducationTitleDisplay;
        }
        if ((i13 & 2) != 0) {
            textResource2 = metricEducationModel.detailsEducationContentDisplay;
        }
        if ((i13 & 4) != 0) {
            enumC30883a = metricEducationModel.style;
        }
        if ((i13 & 8) != 0) {
            str = metricEducationModel.icon;
        }
        if ((i13 & 16) != 0) {
            bool = metricEducationModel.hasCloseButton;
        }
        Boolean bool2 = bool;
        EnumC30883a enumC30883a2 = enumC30883a;
        return metricEducationModel.copy(textResource, textResource2, enumC30883a2, str, bool2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(MetricEducationModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        C25452a c25452a = C25452a.f99689a;
        output.encodeSerializableElement(serialDesc, 0, c25452a, self.detailsEducationTitleDisplay);
        output.encodeNullableSerializableElement(serialDesc, 1, c25452a, self.detailsEducationContentDisplay);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.style);
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.icon);
        output.encodeNullableSerializableElement(serialDesc, 4, BooleanSerializer.INSTANCE, self.hasCloseButton);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getDetailsEducationTitleDisplay() {
        return this.detailsEducationTitleDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getDetailsEducationContentDisplay() {
        return this.detailsEducationContentDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final EnumC30883a getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getHasCloseButton() {
        return this.hasCloseButton;
    }

    public final MetricEducationModel copy(TextResource detailsEducationTitleDisplay, TextResource detailsEducationContentDisplay, EnumC30883a style, String icon, Boolean hasCloseButton) {
        AbstractC22676k.m65750j(detailsEducationTitleDisplay, "detailsEducationTitleDisplay");
        AbstractC22676k.m65750j(style, "style");
        return new MetricEducationModel(detailsEducationTitleDisplay, detailsEducationContentDisplay, style, icon, hasCloseButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MetricEducationModel)) {
            return false;
        }
        MetricEducationModel metricEducationModel = (MetricEducationModel) other;
        return AbstractC22676k.m65745e(this.detailsEducationTitleDisplay, metricEducationModel.detailsEducationTitleDisplay) && AbstractC22676k.m65745e(this.detailsEducationContentDisplay, metricEducationModel.detailsEducationContentDisplay) && this.style == metricEducationModel.style && AbstractC22676k.m65745e(this.icon, metricEducationModel.icon) && AbstractC22676k.m65745e(this.hasCloseButton, metricEducationModel.hasCloseButton);
    }

    public final TextResource getDetailsEducationContentDisplay() {
        return this.detailsEducationContentDisplay;
    }

    public final TextResource getDetailsEducationTitleDisplay() {
        return this.detailsEducationTitleDisplay;
    }

    public final Boolean getHasCloseButton() {
        return this.hasCloseButton;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final EnumC30883a getStyle() {
        return this.style;
    }

    public int hashCode() {
        int iHashCode = this.detailsEducationTitleDisplay.hashCode() * 31;
        TextResource textResource = this.detailsEducationContentDisplay;
        int iHashCode2 = (this.style.hashCode() + ((iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31)) * 31;
        String str = this.icon;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.hasCloseButton;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.detailsEducationTitleDisplay;
        TextResource textResource2 = this.detailsEducationContentDisplay;
        EnumC30883a enumC30883a = this.style;
        String str = this.icon;
        Boolean bool = this.hasCloseButton;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("MetricEducationModel(detailsEducationTitleDisplay=", textResource, ", detailsEducationContentDisplay=", textResource2, ", style=");
        sbM106658q.append(enumC30883a);
        sbM106658q.append(", icon=");
        sbM106658q.append(str);
        sbM106658q.append(", hasCloseButton=");
        return AbstractC11478a.m30858j(sbM106658q, bool, ")");
    }

    public MetricEducationModel(TextResource detailsEducationTitleDisplay, TextResource textResource, EnumC30883a style, String str, Boolean bool) {
        AbstractC22676k.m65750j(detailsEducationTitleDisplay, "detailsEducationTitleDisplay");
        AbstractC22676k.m65750j(style, "style");
        this.detailsEducationTitleDisplay = detailsEducationTitleDisplay;
        this.detailsEducationContentDisplay = textResource;
        this.style = style;
        this.icon = str;
        this.hasCloseButton = bool;
    }
}
