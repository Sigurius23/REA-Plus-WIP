package com.whoop.design.models.items;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import md1.C25452a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import te0.AbstractC33745d;
import w91.C36958e;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ0\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001bR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010\u001d¨\u00063"}, m65681d2 = {"Lcom/whoop/design/models/items/GoalTrackerIndicatorModel;", "", "Lcom/whoop/design/util/TextResource;", "titleDisplay", "Lcom/whoop/design/models/items/IndicatorStyle;", "style", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/IndicatorStyle;Lcom/whoop/navigation/e;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/IndicatorStyle;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/GoalTrackerIndicatorModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "()Lcom/whoop/design/models/items/IndicatorStyle;", "component3", "()Lcom/whoop/navigation/e;", "copy", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/IndicatorStyle;Lcom/whoop/navigation/e;)Lcom/whoop/design/models/items/GoalTrackerIndicatorModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "getTitleDisplay", "Lcom/whoop/design/models/items/IndicatorStyle;", "getStyle", "Lcom/whoop/navigation/e;", "getDestination", "getDestination$annotations", "()V", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class GoalTrackerIndicatorModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final C9598e destination;
    private final IndicatorStyle style;
    private final TextResource titleDisplay;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d | TextResource.$stable;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/GoalTrackerIndicatorModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/GoalTrackerIndicatorModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return GoalTrackerIndicatorModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C36958e(10)), AbstractC30060g.m92087G(enumC23463i, new C36958e(11))};
    }

    public /* synthetic */ GoalTrackerIndicatorModel(int i13, TextResource textResource, IndicatorStyle indicatorStyle, C9598e c9598e, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, GoalTrackerIndicatorModel$$serializer.INSTANCE.getDescriptor());
        }
        this.titleDisplay = textResource;
        this.style = indicatorStyle;
        if ((i13 & 4) == 0) {
            this.destination = null;
        } else {
            this.destination = c9598e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.IndicatorStyle", IndicatorStyle.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ GoalTrackerIndicatorModel copy$default(GoalTrackerIndicatorModel goalTrackerIndicatorModel, TextResource textResource, IndicatorStyle indicatorStyle, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = goalTrackerIndicatorModel.titleDisplay;
        }
        if ((i13 & 2) != 0) {
            indicatorStyle = goalTrackerIndicatorModel.style;
        }
        if ((i13 & 4) != 0) {
            c9598e = goalTrackerIndicatorModel.destination;
        }
        return goalTrackerIndicatorModel.copy(textResource, indicatorStyle, c9598e);
    }

    public static /* synthetic */ void getDestination$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(GoalTrackerIndicatorModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, C25452a.f99689a, self.titleDisplay);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.style);
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.destination == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.destination);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final IndicatorStyle getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    public final GoalTrackerIndicatorModel copy(TextResource titleDisplay, IndicatorStyle style, C9598e destination) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(style, "style");
        return new GoalTrackerIndicatorModel(titleDisplay, style, destination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoalTrackerIndicatorModel)) {
            return false;
        }
        GoalTrackerIndicatorModel goalTrackerIndicatorModel = (GoalTrackerIndicatorModel) other;
        return AbstractC22676k.m65745e(this.titleDisplay, goalTrackerIndicatorModel.titleDisplay) && this.style == goalTrackerIndicatorModel.style && AbstractC22676k.m65745e(this.destination, goalTrackerIndicatorModel.destination);
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final IndicatorStyle getStyle() {
        return this.style;
    }

    public final TextResource getTitleDisplay() {
        return this.titleDisplay;
    }

    public int hashCode() {
        int iHashCode = (this.style.hashCode() + (this.titleDisplay.hashCode() * 31)) * 31;
        C9598e c9598e = this.destination;
        return iHashCode + (c9598e == null ? 0 : c9598e.hashCode());
    }

    public String toString() {
        TextResource textResource = this.titleDisplay;
        IndicatorStyle indicatorStyle = this.style;
        C9598e c9598e = this.destination;
        StringBuilder sb4 = new StringBuilder("GoalTrackerIndicatorModel(titleDisplay=");
        sb4.append(textResource);
        sb4.append(", style=");
        sb4.append(indicatorStyle);
        sb4.append(", destination=");
        return AbstractC33745d.m106656o(sb4, c9598e, ")");
    }

    public GoalTrackerIndicatorModel(TextResource titleDisplay, IndicatorStyle style, C9598e c9598e) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(style, "style");
        this.titleDisplay = titleDisplay;
        this.style = style;
        this.destination = c9598e;
    }

    public /* synthetic */ GoalTrackerIndicatorModel(TextResource textResource, IndicatorStyle indicatorStyle, C9598e c9598e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, indicatorStyle, (i13 & 4) != 0 ? null : c9598e);
    }
}
