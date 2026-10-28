package com.whoop.design.models.items.graph.plot;

import c13.AbstractC3855a;
import com.whoop.design.models.items.graph.plot.line.LinePlotStyle;
import com.whoop.design.models.items.graph.plot.line.LinePlotTheme;
import com.whoop.design.models.items.graph.plot.line.LinePlotTheme$$serializer;
import com.whoop.design.models.items.graph.plot.line.LineSegmentModel;
import com.whoop.design.models.items.graph.plot.line.LineSegmentModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import ma1.C25371a;
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

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0002DCB[\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011Bg\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b*\u0010)J\u0012\u0010+\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b+\u0010,Jd\u0010-\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b/\u0010'J\u0010\u00100\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00104\u001a\u00020\u000b2\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b4\u00105R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b7\u0010!R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00108\u001a\u0004\b9\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010:\u001a\u0004\b;\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010<\u001a\u0004\b=\u0010'R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\b?\u0010)R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\b@\u0010)R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010A\u001a\u0004\bB\u0010,¨\u0006E"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/LinePlotModel;", "Lcom/whoop/design/models/items/graph/plot/GraphPlot;", "", "Lcom/whoop/design/models/items/graph/plot/line/LineSegmentModel;", "segments", "Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;", "style", "Lcom/whoop/design/models/items/graph/plot/DiagonalPoints;", "diagonalPoints", "", "id", "", "hideWhileScrubbing", "skipScrubbing", "Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;", "theme", "<init>", "(Ljava/util/List;Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;Lcom/whoop/design/models/items/graph/plot/DiagonalPoints;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;Lcom/whoop/design/models/items/graph/plot/DiagonalPoints;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/graph/plot/LinePlotModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;", "component3", "()Lcom/whoop/design/models/items/graph/plot/DiagonalPoints;", "component4", "()Ljava/lang/String;", "component5", "()Ljava/lang/Boolean;", "component6", "component7", "()Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;", "copy", "(Ljava/util/List;Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;Lcom/whoop/design/models/items/graph/plot/DiagonalPoints;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;)Lcom/whoop/design/models/items/graph/plot/LinePlotModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getSegments", "Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;", "getStyle", "Lcom/whoop/design/models/items/graph/plot/DiagonalPoints;", "getDiagonalPoints", "Ljava/lang/String;", "getId", "Ljava/lang/Boolean;", "getHideWhileScrubbing", "getSkipScrubbing", "Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;", "getTheme", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class LinePlotModel extends GraphPlot {
    private static final InterfaceC23462h[] $childSerializers;
    private final DiagonalPoints diagonalPoints;
    private final Boolean hideWhileScrubbing;
    private final String id;
    private final List<LineSegmentModel> segments;
    private final Boolean skipScrubbing;
    private final LinePlotStyle style;
    private final LinePlotTheme theme;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/LinePlotModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/graph/plot/LinePlotModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return LinePlotModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C25371a(4)), AbstractC30060g.m92087G(enumC23463i, new C25371a(5)), null, null, null, null, null};
    }

    public LinePlotModel() {
        this((List) null, (LinePlotStyle) null, (DiagonalPoints) null, (String) null, (Boolean) null, (Boolean) null, (LinePlotTheme) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(LineSegmentModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.graph.plot.line.LinePlotStyle", LinePlotStyle.values());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LinePlotModel copy$default(LinePlotModel linePlotModel, List list, LinePlotStyle linePlotStyle, DiagonalPoints diagonalPoints, String str, Boolean bool, Boolean bool2, LinePlotTheme linePlotTheme, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = linePlotModel.segments;
        }
        if ((i13 & 2) != 0) {
            linePlotStyle = linePlotModel.style;
        }
        if ((i13 & 4) != 0) {
            diagonalPoints = linePlotModel.diagonalPoints;
        }
        if ((i13 & 8) != 0) {
            str = linePlotModel.id;
        }
        if ((i13 & 16) != 0) {
            bool = linePlotModel.hideWhileScrubbing;
        }
        if ((i13 & 32) != 0) {
            bool2 = linePlotModel.skipScrubbing;
        }
        if ((i13 & 64) != 0) {
            linePlotTheme = linePlotModel.theme;
        }
        Boolean bool3 = bool2;
        LinePlotTheme linePlotTheme2 = linePlotTheme;
        Boolean bool4 = bool;
        DiagonalPoints diagonalPoints2 = diagonalPoints;
        return linePlotModel.copy(list, linePlotStyle, diagonalPoints2, str, bool4, bool3, linePlotTheme2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(LinePlotModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.segments, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.segments);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.style != LinePlotStyle.NONE) {
            output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.style);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.diagonalPoints != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, DiagonalPoints$$serializer.INSTANCE, self.diagonalPoints);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !AbstractC22676k.m65745e(self.id, "line")) {
            output.encodeStringElement(serialDesc, 3, self.id);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !AbstractC22676k.m65745e(self.getHideWhileScrubbing(), Boolean.FALSE)) {
            output.encodeNullableSerializableElement(serialDesc, 4, BooleanSerializer.INSTANCE, self.getHideWhileScrubbing());
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.getSkipScrubbing() != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, BooleanSerializer.INSTANCE, self.getSkipScrubbing());
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && self.theme == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 6, LinePlotTheme$$serializer.INSTANCE, self.theme);
    }

    public final List<LineSegmentModel> component1() {
        return this.segments;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LinePlotStyle getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DiagonalPoints getDiagonalPoints() {
        return this.diagonalPoints;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getHideWhileScrubbing() {
        return this.hideWhileScrubbing;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getSkipScrubbing() {
        return this.skipScrubbing;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final LinePlotTheme getTheme() {
        return this.theme;
    }

    public final LinePlotModel copy(List<LineSegmentModel> segments, LinePlotStyle style, DiagonalPoints diagonalPoints, String id4, Boolean hideWhileScrubbing, Boolean skipScrubbing, LinePlotTheme theme) {
        AbstractC22676k.m65750j(segments, "segments");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(id4, "id");
        return new LinePlotModel(segments, style, diagonalPoints, id4, hideWhileScrubbing, skipScrubbing, theme);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinePlotModel)) {
            return false;
        }
        LinePlotModel linePlotModel = (LinePlotModel) other;
        return AbstractC22676k.m65745e(this.segments, linePlotModel.segments) && this.style == linePlotModel.style && AbstractC22676k.m65745e(this.diagonalPoints, linePlotModel.diagonalPoints) && AbstractC22676k.m65745e(this.id, linePlotModel.id) && AbstractC22676k.m65745e(this.hideWhileScrubbing, linePlotModel.hideWhileScrubbing) && AbstractC22676k.m65745e(this.skipScrubbing, linePlotModel.skipScrubbing) && AbstractC22676k.m65745e(this.theme, linePlotModel.theme);
    }

    public final DiagonalPoints getDiagonalPoints() {
        return this.diagonalPoints;
    }

    @Override // com.whoop.design.models.items.graph.plot.GraphPlot
    public Boolean getHideWhileScrubbing() {
        return this.hideWhileScrubbing;
    }

    public final String getId() {
        return this.id;
    }

    public final List<LineSegmentModel> getSegments() {
        return this.segments;
    }

    @Override // com.whoop.design.models.items.graph.plot.GraphPlot
    public Boolean getSkipScrubbing() {
        return this.skipScrubbing;
    }

    public final LinePlotStyle getStyle() {
        return this.style;
    }

    public final LinePlotTheme getTheme() {
        return this.theme;
    }

    public int hashCode() {
        int iHashCode = (this.style.hashCode() + (this.segments.hashCode() * 31)) * 31;
        DiagonalPoints diagonalPoints = this.diagonalPoints;
        int iM30450d = AbstractC11266d.m30450d((iHashCode + (diagonalPoints == null ? 0 : diagonalPoints.hashCode())) * 31, 31, this.id);
        Boolean bool = this.hideWhileScrubbing;
        int iHashCode2 = (iM30450d + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.skipScrubbing;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        LinePlotTheme linePlotTheme = this.theme;
        return iHashCode3 + (linePlotTheme != null ? linePlotTheme.hashCode() : 0);
    }

    public String toString() {
        List<LineSegmentModel> list = this.segments;
        LinePlotStyle linePlotStyle = this.style;
        DiagonalPoints diagonalPoints = this.diagonalPoints;
        String str = this.id;
        Boolean bool = this.hideWhileScrubbing;
        Boolean bool2 = this.skipScrubbing;
        LinePlotTheme linePlotTheme = this.theme;
        StringBuilder sb4 = new StringBuilder("LinePlotModel(segments=");
        sb4.append(list);
        sb4.append(", style=");
        sb4.append(linePlotStyle);
        sb4.append(", diagonalPoints=");
        sb4.append(diagonalPoints);
        sb4.append(", id=");
        sb4.append(str);
        sb4.append(", hideWhileScrubbing=");
        AbstractC3855a.m11839w(sb4, bool, ", skipScrubbing=", bool2, ", theme=");
        sb4.append(linePlotTheme);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ LinePlotModel(int i13, List list, LinePlotStyle linePlotStyle, DiagonalPoints diagonalPoints, String str, Boolean bool, Boolean bool2, LinePlotTheme linePlotTheme, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        this.segments = (i13 & 1) == 0 ? C25271y.f99162w : list;
        if ((i13 & 2) == 0) {
            this.style = LinePlotStyle.NONE;
        } else {
            this.style = linePlotStyle;
        }
        if ((i13 & 4) == 0) {
            this.diagonalPoints = null;
        } else {
            this.diagonalPoints = diagonalPoints;
        }
        if ((i13 & 8) == 0) {
            this.id = "line";
        } else {
            this.id = str;
        }
        if ((i13 & 16) == 0) {
            this.hideWhileScrubbing = Boolean.FALSE;
        } else {
            this.hideWhileScrubbing = bool;
        }
        if ((i13 & 32) == 0) {
            this.skipScrubbing = null;
        } else {
            this.skipScrubbing = bool2;
        }
        if ((i13 & 64) == 0) {
            this.theme = null;
        } else {
            this.theme = linePlotTheme;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinePlotModel(List<LineSegmentModel> segments, LinePlotStyle style, DiagonalPoints diagonalPoints, String id4, Boolean bool, Boolean bool2, LinePlotTheme linePlotTheme) {
        super(null);
        AbstractC22676k.m65750j(segments, "segments");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(id4, "id");
        this.segments = segments;
        this.style = style;
        this.diagonalPoints = diagonalPoints;
        this.id = id4;
        this.hideWhileScrubbing = bool;
        this.skipScrubbing = bool2;
        this.theme = linePlotTheme;
    }

    public /* synthetic */ LinePlotModel(List list, LinePlotStyle linePlotStyle, DiagonalPoints diagonalPoints, String str, Boolean bool, Boolean bool2, LinePlotTheme linePlotTheme, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C25271y.f99162w : list, (i13 & 2) != 0 ? LinePlotStyle.NONE : linePlotStyle, (i13 & 4) != 0 ? null : diagonalPoints, (i13 & 8) != 0 ? "line" : str, (i13 & 16) != 0 ? Boolean.FALSE : bool, (i13 & 32) != 0 ? null : bool2, (i13 & 64) != 0 ? null : linePlotTheme);
    }
}
