package com.whoop.design.models.items.targetrecommendation;

import com.whoop.design.models.calendar.archmini.C7011a;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
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
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!J:\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010\u001dJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010!¨\u00065"}, m65681d2 = {"Lcom/whoop/design/models/items/targetrecommendation/WidgetFooterButton;", "", "Lcom/whoop/design/models/items/targetrecommendation/WidgetFooterButtonType;", "type", "", "title", "Lcom/whoop/design/models/items/targetrecommendation/WidgetFooterButtonStyle;", "style", "Lcom/whoop/navigation/models/GenericInteraction;", "interaction", "<init>", "(Lcom/whoop/design/models/items/targetrecommendation/WidgetFooterButtonType;Ljava/lang/String;Lcom/whoop/design/models/items/targetrecommendation/WidgetFooterButtonStyle;Lcom/whoop/navigation/models/GenericInteraction;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/items/targetrecommendation/WidgetFooterButtonType;Ljava/lang/String;Lcom/whoop/design/models/items/targetrecommendation/WidgetFooterButtonStyle;Lcom/whoop/navigation/models/GenericInteraction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/targetrecommendation/WidgetFooterButton;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/models/items/targetrecommendation/WidgetFooterButtonType;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/whoop/design/models/items/targetrecommendation/WidgetFooterButtonStyle;", "component4", "()Lcom/whoop/navigation/models/GenericInteraction;", "copy", "(Lcom/whoop/design/models/items/targetrecommendation/WidgetFooterButtonType;Ljava/lang/String;Lcom/whoop/design/models/items/targetrecommendation/WidgetFooterButtonStyle;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/design/models/items/targetrecommendation/WidgetFooterButton;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/items/targetrecommendation/WidgetFooterButtonType;", "getType", "Ljava/lang/String;", "getTitle", "Lcom/whoop/design/models/items/targetrecommendation/WidgetFooterButtonStyle;", "getStyle", "Lcom/whoop/navigation/models/GenericInteraction;", "getInteraction", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WidgetFooterButton {
    private static final InterfaceC23462h[] $childSerializers;
    private final GenericInteraction interaction;
    private final WidgetFooterButtonStyle style;
    private final String title;
    private final WidgetFooterButtonType type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = GenericInteraction.$stable;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/targetrecommendation/WidgetFooterButton$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/targetrecommendation/WidgetFooterButton;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return WidgetFooterButton$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C7011a(5)), null, AbstractC30060g.m92087G(enumC23463i, new C7011a(6)), null};
    }

    public /* synthetic */ WidgetFooterButton(int i13, WidgetFooterButtonType widgetFooterButtonType, String str, WidgetFooterButtonStyle widgetFooterButtonStyle, GenericInteraction genericInteraction, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i13 & 2)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 2, WidgetFooterButton$$serializer.INSTANCE.getDescriptor());
        }
        this.type = (i13 & 1) == 0 ? WidgetFooterButtonType.UNKNOWN : widgetFooterButtonType;
        this.title = str;
        if ((i13 & 4) == 0) {
            this.style = WidgetFooterButtonStyle.PRIMARY;
        } else {
            this.style = widgetFooterButtonStyle;
        }
        if ((i13 & 8) == 0) {
            this.interaction = null;
        } else {
            this.interaction = genericInteraction;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return WidgetFooterButtonType.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return WidgetFooterButtonStyle.INSTANCE.serializer();
    }

    public static /* synthetic */ WidgetFooterButton copy$default(WidgetFooterButton widgetFooterButton, WidgetFooterButtonType widgetFooterButtonType, String str, WidgetFooterButtonStyle widgetFooterButtonStyle, GenericInteraction genericInteraction, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            widgetFooterButtonType = widgetFooterButton.type;
        }
        if ((i13 & 2) != 0) {
            str = widgetFooterButton.title;
        }
        if ((i13 & 4) != 0) {
            widgetFooterButtonStyle = widgetFooterButton.style;
        }
        if ((i13 & 8) != 0) {
            genericInteraction = widgetFooterButton.interaction;
        }
        return widgetFooterButton.copy(widgetFooterButtonType, str, widgetFooterButtonStyle, genericInteraction);
    }

    public static final /* synthetic */ void write$Self$design_models_release(WidgetFooterButton self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.type != WidgetFooterButtonType.UNKNOWN) {
            output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.type);
        }
        output.encodeStringElement(serialDesc, 1, self.title);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.style != WidgetFooterButtonStyle.PRIMARY) {
            output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.style);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.interaction == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, GenericInteraction$$serializer.INSTANCE, self.interaction);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final WidgetFooterButtonType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final WidgetFooterButtonStyle getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    public final WidgetFooterButton copy(WidgetFooterButtonType type, String title, WidgetFooterButtonStyle style, GenericInteraction interaction) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(style, "style");
        return new WidgetFooterButton(type, title, style, interaction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WidgetFooterButton)) {
            return false;
        }
        WidgetFooterButton widgetFooterButton = (WidgetFooterButton) other;
        return this.type == widgetFooterButton.type && AbstractC22676k.m65745e(this.title, widgetFooterButton.title) && this.style == widgetFooterButton.style && AbstractC22676k.m65745e(this.interaction, widgetFooterButton.interaction);
    }

    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    public final WidgetFooterButtonStyle getStyle() {
        return this.style;
    }

    public final String getTitle() {
        return this.title;
    }

    public final WidgetFooterButtonType getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = (this.style.hashCode() + AbstractC11266d.m30450d(this.type.hashCode() * 31, 31, this.title)) * 31;
        GenericInteraction genericInteraction = this.interaction;
        return iHashCode + (genericInteraction == null ? 0 : genericInteraction.hashCode());
    }

    public String toString() {
        return "WidgetFooterButton(type=" + this.type + ", title=" + this.title + ", style=" + this.style + ", interaction=" + this.interaction + ")";
    }

    public WidgetFooterButton(WidgetFooterButtonType type, String title, WidgetFooterButtonStyle style, GenericInteraction genericInteraction) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(style, "style");
        this.type = type;
        this.title = title;
        this.style = style;
        this.interaction = genericInteraction;
    }

    public /* synthetic */ WidgetFooterButton(WidgetFooterButtonType widgetFooterButtonType, String str, WidgetFooterButtonStyle widgetFooterButtonStyle, GenericInteraction genericInteraction, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? WidgetFooterButtonType.UNKNOWN : widgetFooterButtonType, str, (i13 & 4) != 0 ? WidgetFooterButtonStyle.PRIMARY : widgetFooterButtonStyle, (i13 & 8) != 0 ? null : genericInteraction);
    }
}
