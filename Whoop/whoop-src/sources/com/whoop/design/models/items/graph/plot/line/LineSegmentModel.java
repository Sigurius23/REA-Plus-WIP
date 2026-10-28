package com.whoop.design.models.items.graph.plot.line;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import ma1.C25371a;
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
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B/\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ8\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b+\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001e¨\u00062"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/line/LineSegmentModel;", "", "", "Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;", "points", "Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;", "style", "Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;", "theme", "<init>", "(Ljava/util/List;Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/graph/plot/line/LineSegmentModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;", "component3", "()Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;", "copy", "(Ljava/util/List;Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;)Lcom/whoop/design/models/items/graph/plot/line/LineSegmentModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getPoints", "Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;", "getStyle", "Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;", "getTheme", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class LineSegmentModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final List<LineDataPointModel> points;
    private final LinePlotStyle style;
    private final LinePlotTheme theme;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/line/LineSegmentModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/graph/plot/line/LineSegmentModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return LineSegmentModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C25371a(20)), AbstractC30060g.m92087G(enumC23463i, new C25371a(21)), null};
    }

    public LineSegmentModel() {
        this((List) null, (LinePlotStyle) null, (LinePlotTheme) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(LineDataPointModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.graph.plot.line.LinePlotStyle", LinePlotStyle.values());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LineSegmentModel copy$default(LineSegmentModel lineSegmentModel, List list, LinePlotStyle linePlotStyle, LinePlotTheme linePlotTheme, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = lineSegmentModel.points;
        }
        if ((i13 & 2) != 0) {
            linePlotStyle = lineSegmentModel.style;
        }
        if ((i13 & 4) != 0) {
            linePlotTheme = lineSegmentModel.theme;
        }
        return lineSegmentModel.copy(list, linePlotStyle, linePlotTheme);
    }

    public static final /* synthetic */ void write$Self$design_models_release(LineSegmentModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.points, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.points);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.style != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.style);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.theme == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, LinePlotTheme$$serializer.INSTANCE, self.theme);
    }

    public final List<LineDataPointModel> component1() {
        return this.points;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LinePlotStyle getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final LinePlotTheme getTheme() {
        return this.theme;
    }

    public final LineSegmentModel copy(List<LineDataPointModel> points, LinePlotStyle style, LinePlotTheme theme) {
        AbstractC22676k.m65750j(points, "points");
        return new LineSegmentModel(points, style, theme);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LineSegmentModel)) {
            return false;
        }
        LineSegmentModel lineSegmentModel = (LineSegmentModel) other;
        return AbstractC22676k.m65745e(this.points, lineSegmentModel.points) && this.style == lineSegmentModel.style && AbstractC22676k.m65745e(this.theme, lineSegmentModel.theme);
    }

    public final List<LineDataPointModel> getPoints() {
        return this.points;
    }

    public final LinePlotStyle getStyle() {
        return this.style;
    }

    public final LinePlotTheme getTheme() {
        return this.theme;
    }

    public int hashCode() {
        int iHashCode = this.points.hashCode() * 31;
        LinePlotStyle linePlotStyle = this.style;
        int iHashCode2 = (iHashCode + (linePlotStyle == null ? 0 : linePlotStyle.hashCode())) * 31;
        LinePlotTheme linePlotTheme = this.theme;
        return iHashCode2 + (linePlotTheme != null ? linePlotTheme.hashCode() : 0);
    }

    public String toString() {
        return "LineSegmentModel(points=" + this.points + ", style=" + this.style + ", theme=" + this.theme + ")";
    }

    public /* synthetic */ LineSegmentModel(int i13, List list, LinePlotStyle linePlotStyle, LinePlotTheme linePlotTheme, SerializationConstructorMarker serializationConstructorMarker) {
        this.points = (i13 & 1) == 0 ? C25271y.f99162w : list;
        if ((i13 & 2) == 0) {
            this.style = null;
        } else {
            this.style = linePlotStyle;
        }
        if ((i13 & 4) == 0) {
            this.theme = null;
        } else {
            this.theme = linePlotTheme;
        }
    }

    public LineSegmentModel(List<LineDataPointModel> points, LinePlotStyle linePlotStyle, LinePlotTheme linePlotTheme) {
        AbstractC22676k.m65750j(points, "points");
        this.points = points;
        this.style = linePlotStyle;
        this.theme = linePlotTheme;
    }

    public /* synthetic */ LineSegmentModel(List list, LinePlotStyle linePlotStyle, LinePlotTheme linePlotTheme, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C25271y.f99162w : list, (i13 & 2) != 0 ? null : linePlotStyle, (i13 & 4) != 0 ? null : linePlotTheme);
    }
}
