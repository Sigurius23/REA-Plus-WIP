package com.whoop.design.models.items.graph;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ga1.C15620a;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0019¨\u0006*"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/GraphingCardTheme;", "", "Lcom/whoop/design/models/items/graph/ChartBackgroundStyle;", "backgroundStyle", "", "preserveLabelCasing", "<init>", "(Lcom/whoop/design/models/items/graph/ChartBackgroundStyle;Ljava/lang/Boolean;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/items/graph/ChartBackgroundStyle;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/graph/GraphingCardTheme;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/models/items/graph/ChartBackgroundStyle;", "component2", "()Ljava/lang/Boolean;", "copy", "(Lcom/whoop/design/models/items/graph/ChartBackgroundStyle;Ljava/lang/Boolean;)Lcom/whoop/design/models/items/graph/GraphingCardTheme;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/items/graph/ChartBackgroundStyle;", "getBackgroundStyle", "Ljava/lang/Boolean;", "getPreserveLabelCasing", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class GraphingCardTheme {
    public static final int $stable = 0;
    private final ChartBackgroundStyle backgroundStyle;
    private final Boolean preserveLabelCasing;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C15620a(1)), null};

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/GraphingCardTheme$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/graph/GraphingCardTheme;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return GraphingCardTheme$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GraphingCardTheme() {
        this((ChartBackgroundStyle) null, (Boolean) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.graph.ChartBackgroundStyle", ChartBackgroundStyle.values());
    }

    public static /* synthetic */ GraphingCardTheme copy$default(GraphingCardTheme graphingCardTheme, ChartBackgroundStyle chartBackgroundStyle, Boolean bool, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            chartBackgroundStyle = graphingCardTheme.backgroundStyle;
        }
        if ((i13 & 2) != 0) {
            bool = graphingCardTheme.preserveLabelCasing;
        }
        return graphingCardTheme.copy(chartBackgroundStyle, bool);
    }

    public static final /* synthetic */ void write$Self$design_models_release(GraphingCardTheme self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.backgroundStyle != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.backgroundStyle);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.preserveLabelCasing == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, BooleanSerializer.INSTANCE, self.preserveLabelCasing);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ChartBackgroundStyle getBackgroundStyle() {
        return this.backgroundStyle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getPreserveLabelCasing() {
        return this.preserveLabelCasing;
    }

    public final GraphingCardTheme copy(ChartBackgroundStyle backgroundStyle, Boolean preserveLabelCasing) {
        return new GraphingCardTheme(backgroundStyle, preserveLabelCasing);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GraphingCardTheme)) {
            return false;
        }
        GraphingCardTheme graphingCardTheme = (GraphingCardTheme) other;
        return this.backgroundStyle == graphingCardTheme.backgroundStyle && AbstractC22676k.m65745e(this.preserveLabelCasing, graphingCardTheme.preserveLabelCasing);
    }

    public final ChartBackgroundStyle getBackgroundStyle() {
        return this.backgroundStyle;
    }

    public final Boolean getPreserveLabelCasing() {
        return this.preserveLabelCasing;
    }

    public int hashCode() {
        ChartBackgroundStyle chartBackgroundStyle = this.backgroundStyle;
        int iHashCode = (chartBackgroundStyle == null ? 0 : chartBackgroundStyle.hashCode()) * 31;
        Boolean bool = this.preserveLabelCasing;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "GraphingCardTheme(backgroundStyle=" + this.backgroundStyle + ", preserveLabelCasing=" + this.preserveLabelCasing + ")";
    }

    public /* synthetic */ GraphingCardTheme(int i13, ChartBackgroundStyle chartBackgroundStyle, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.backgroundStyle = null;
        } else {
            this.backgroundStyle = chartBackgroundStyle;
        }
        if ((i13 & 2) == 0) {
            this.preserveLabelCasing = null;
        } else {
            this.preserveLabelCasing = bool;
        }
    }

    public GraphingCardTheme(ChartBackgroundStyle chartBackgroundStyle, Boolean bool) {
        this.backgroundStyle = chartBackgroundStyle;
        this.preserveLabelCasing = bool;
    }

    public /* synthetic */ GraphingCardTheme(ChartBackgroundStyle chartBackgroundStyle, Boolean bool, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : chartBackgroundStyle, (i13 & 2) != 0 ? null : bool);
    }
}
