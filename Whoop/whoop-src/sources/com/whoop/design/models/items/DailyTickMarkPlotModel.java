package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36956c;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0087\b\u0018\u0000 L2\u00020\u0001:\u0002MLB[\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014Bu\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J'\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0018\u0010+\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b+\u0010*J\u0010\u0010,\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b0\u00101Jt\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00105\u001a\u000204HÖ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b7\u00108J\u001a\u0010;\u001a\u00020\u00062\b\u0010:\u001a\u0004\u0018\u000109HÖ\u0003¢\u0006\u0004\b;\u0010<R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010=\u001a\u0004\b>\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010?\u001a\u0004\b@\u0010&R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010A\u001a\u0004\bB\u0010(R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010C\u001a\u0004\bD\u0010*R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\f\u0010C\u001a\u0004\bE\u0010*R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010F\u001a\u0004\bG\u0010-R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010H\u001a\u0004\bI\u0010/R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010J\u001a\u0004\bK\u00101¨\u0006N"}, m65681d2 = {"Lcom/whoop/design/models/items/DailyTickMarkPlotModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/items/DailyTickMarkHeaderModel;", "header", "Lcom/whoop/design/models/items/TickMarksStyle;", "style", "", "fillFullSpace", "", "Lcom/whoop/design/models/items/TickMarkStateModel;", "tickMarks", "Lcom/whoop/design/models/items/TickLabelModel;", "tickMarksLabels", "Lcom/whoop/design/models/items/DailyTickMarkWidthStyle;", "tickMarkWidthStyle", "Lcom/whoop/design/models/items/ExpectedAnnotationModel;", "expectedAnnotation", "Lcom/whoop/design/models/items/TickMarkFooterModel;", "footer", "<init>", "(Lcom/whoop/design/models/items/DailyTickMarkHeaderModel;Lcom/whoop/design/models/items/TickMarksStyle;ZLjava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/DailyTickMarkWidthStyle;Lcom/whoop/design/models/items/ExpectedAnnotationModel;Lcom/whoop/design/models/items/TickMarkFooterModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/items/DailyTickMarkHeaderModel;Lcom/whoop/design/models/items/TickMarksStyle;ZLjava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/DailyTickMarkWidthStyle;Lcom/whoop/design/models/items/ExpectedAnnotationModel;Lcom/whoop/design/models/items/TickMarkFooterModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/DailyTickMarkPlotModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/models/items/DailyTickMarkHeaderModel;", "component2", "()Lcom/whoop/design/models/items/TickMarksStyle;", "component3", "()Z", "component4", "()Ljava/util/List;", "component5", "component6", "()Lcom/whoop/design/models/items/DailyTickMarkWidthStyle;", "component7", "()Lcom/whoop/design/models/items/ExpectedAnnotationModel;", "component8", "()Lcom/whoop/design/models/items/TickMarkFooterModel;", "copy", "(Lcom/whoop/design/models/items/DailyTickMarkHeaderModel;Lcom/whoop/design/models/items/TickMarksStyle;ZLjava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/DailyTickMarkWidthStyle;Lcom/whoop/design/models/items/ExpectedAnnotationModel;Lcom/whoop/design/models/items/TickMarkFooterModel;)Lcom/whoop/design/models/items/DailyTickMarkPlotModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/items/DailyTickMarkHeaderModel;", "getHeader", "Lcom/whoop/design/models/items/TickMarksStyle;", "getStyle", "Z", "getFillFullSpace", "Ljava/util/List;", "getTickMarks", "getTickMarksLabels", "Lcom/whoop/design/models/items/DailyTickMarkWidthStyle;", "getTickMarkWidthStyle", "Lcom/whoop/design/models/items/ExpectedAnnotationModel;", "getExpectedAnnotation", "Lcom/whoop/design/models/items/TickMarkFooterModel;", "getFooter", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class DailyTickMarkPlotModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final ExpectedAnnotationModel expectedAnnotation;
    private final boolean fillFullSpace;
    private final TickMarkFooterModel footer;
    private final DailyTickMarkHeaderModel header;
    private final TickMarksStyle style;
    private final DailyTickMarkWidthStyle tickMarkWidthStyle;
    private final List<TickMarkStateModel> tickMarks;
    private final List<TickLabelModel> tickMarksLabels;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/DailyTickMarkPlotModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/DailyTickMarkPlotModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return DailyTickMarkPlotModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C36956c(2)), null, AbstractC30060g.m92087G(enumC23463i, new C36956c(3)), AbstractC30060g.m92087G(enumC23463i, new C36956c(4)), AbstractC30060g.m92087G(enumC23463i, new C36956c(5)), null, null};
    }

    public /* synthetic */ DailyTickMarkPlotModel(int i13, DailyTickMarkHeaderModel dailyTickMarkHeaderModel, TickMarksStyle tickMarksStyle, boolean z4, List list, List list2, DailyTickMarkWidthStyle dailyTickMarkWidthStyle, ExpectedAnnotationModel expectedAnnotationModel, TickMarkFooterModel tickMarkFooterModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i13 & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 255, DailyTickMarkPlotModel$$serializer.INSTANCE.getDescriptor());
        }
        this.header = dailyTickMarkHeaderModel;
        this.style = tickMarksStyle;
        this.fillFullSpace = z4;
        this.tickMarks = list;
        this.tickMarksLabels = list2;
        this.tickMarkWidthStyle = dailyTickMarkWidthStyle;
        this.expectedAnnotation = expectedAnnotationModel;
        this.footer = tickMarkFooterModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.TickMarksStyle", TickMarksStyle.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(TickMarkStateModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return new ArrayListSerializer(TickLabelModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$2() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.DailyTickMarkWidthStyle", DailyTickMarkWidthStyle.values());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DailyTickMarkPlotModel copy$default(DailyTickMarkPlotModel dailyTickMarkPlotModel, DailyTickMarkHeaderModel dailyTickMarkHeaderModel, TickMarksStyle tickMarksStyle, boolean z4, List list, List list2, DailyTickMarkWidthStyle dailyTickMarkWidthStyle, ExpectedAnnotationModel expectedAnnotationModel, TickMarkFooterModel tickMarkFooterModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            dailyTickMarkHeaderModel = dailyTickMarkPlotModel.header;
        }
        if ((i13 & 2) != 0) {
            tickMarksStyle = dailyTickMarkPlotModel.style;
        }
        if ((i13 & 4) != 0) {
            z4 = dailyTickMarkPlotModel.fillFullSpace;
        }
        if ((i13 & 8) != 0) {
            list = dailyTickMarkPlotModel.tickMarks;
        }
        if ((i13 & 16) != 0) {
            list2 = dailyTickMarkPlotModel.tickMarksLabels;
        }
        if ((i13 & 32) != 0) {
            dailyTickMarkWidthStyle = dailyTickMarkPlotModel.tickMarkWidthStyle;
        }
        if ((i13 & 64) != 0) {
            expectedAnnotationModel = dailyTickMarkPlotModel.expectedAnnotation;
        }
        if ((i13 & 128) != 0) {
            tickMarkFooterModel = dailyTickMarkPlotModel.footer;
        }
        ExpectedAnnotationModel expectedAnnotationModel2 = expectedAnnotationModel;
        TickMarkFooterModel tickMarkFooterModel2 = tickMarkFooterModel;
        List list3 = list2;
        DailyTickMarkWidthStyle dailyTickMarkWidthStyle2 = dailyTickMarkWidthStyle;
        return dailyTickMarkPlotModel.copy(dailyTickMarkHeaderModel, tickMarksStyle, z4, list, list3, dailyTickMarkWidthStyle2, expectedAnnotationModel2, tickMarkFooterModel2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(DailyTickMarkPlotModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, DailyTickMarkHeaderModel$$serializer.INSTANCE, self.header);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.style);
        output.encodeBooleanElement(serialDesc, 2, self.fillFullSpace);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.tickMarks);
        output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.tickMarksLabels);
        output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.tickMarkWidthStyle);
        output.encodeNullableSerializableElement(serialDesc, 6, ExpectedAnnotationModel$$serializer.INSTANCE, self.expectedAnnotation);
        output.encodeNullableSerializableElement(serialDesc, 7, TickMarkFooterModel$$serializer.INSTANCE, self.footer);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DailyTickMarkHeaderModel getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TickMarksStyle getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getFillFullSpace() {
        return this.fillFullSpace;
    }

    public final List<TickMarkStateModel> component4() {
        return this.tickMarks;
    }

    public final List<TickLabelModel> component5() {
        return this.tickMarksLabels;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final DailyTickMarkWidthStyle getTickMarkWidthStyle() {
        return this.tickMarkWidthStyle;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ExpectedAnnotationModel getExpectedAnnotation() {
        return this.expectedAnnotation;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final TickMarkFooterModel getFooter() {
        return this.footer;
    }

    public final DailyTickMarkPlotModel copy(DailyTickMarkHeaderModel header, TickMarksStyle style, boolean fillFullSpace, List<TickMarkStateModel> tickMarks, List<TickLabelModel> tickMarksLabels, DailyTickMarkWidthStyle tickMarkWidthStyle, ExpectedAnnotationModel expectedAnnotation, TickMarkFooterModel footer) {
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(tickMarks, "tickMarks");
        AbstractC22676k.m65750j(tickMarkWidthStyle, "tickMarkWidthStyle");
        return new DailyTickMarkPlotModel(header, style, fillFullSpace, tickMarks, tickMarksLabels, tickMarkWidthStyle, expectedAnnotation, footer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DailyTickMarkPlotModel)) {
            return false;
        }
        DailyTickMarkPlotModel dailyTickMarkPlotModel = (DailyTickMarkPlotModel) other;
        return AbstractC22676k.m65745e(this.header, dailyTickMarkPlotModel.header) && this.style == dailyTickMarkPlotModel.style && this.fillFullSpace == dailyTickMarkPlotModel.fillFullSpace && AbstractC22676k.m65745e(this.tickMarks, dailyTickMarkPlotModel.tickMarks) && AbstractC22676k.m65745e(this.tickMarksLabels, dailyTickMarkPlotModel.tickMarksLabels) && this.tickMarkWidthStyle == dailyTickMarkPlotModel.tickMarkWidthStyle && AbstractC22676k.m65745e(this.expectedAnnotation, dailyTickMarkPlotModel.expectedAnnotation) && AbstractC22676k.m65745e(this.footer, dailyTickMarkPlotModel.footer);
    }

    public final ExpectedAnnotationModel getExpectedAnnotation() {
        return this.expectedAnnotation;
    }

    public final boolean getFillFullSpace() {
        return this.fillFullSpace;
    }

    public final TickMarkFooterModel getFooter() {
        return this.footer;
    }

    public final DailyTickMarkHeaderModel getHeader() {
        return this.header;
    }

    public final TickMarksStyle getStyle() {
        return this.style;
    }

    public final DailyTickMarkWidthStyle getTickMarkWidthStyle() {
        return this.tickMarkWidthStyle;
    }

    public final List<TickMarkStateModel> getTickMarks() {
        return this.tickMarks;
    }

    public final List<TickLabelModel> getTickMarksLabels() {
        return this.tickMarksLabels;
    }

    public int hashCode() {
        DailyTickMarkHeaderModel dailyTickMarkHeaderModel = this.header;
        int iM31983b = AbstractC11895b.m31983b(AbstractC2875y.m8289b((this.style.hashCode() + ((dailyTickMarkHeaderModel == null ? 0 : dailyTickMarkHeaderModel.hashCode()) * 31)) * 31, 31, this.fillFullSpace), 31, this.tickMarks);
        List<TickLabelModel> list = this.tickMarksLabels;
        int iHashCode = (this.tickMarkWidthStyle.hashCode() + ((iM31983b + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        ExpectedAnnotationModel expectedAnnotationModel = this.expectedAnnotation;
        int iHashCode2 = (iHashCode + (expectedAnnotationModel == null ? 0 : expectedAnnotationModel.hashCode())) * 31;
        TickMarkFooterModel tickMarkFooterModel = this.footer;
        return iHashCode2 + (tickMarkFooterModel != null ? tickMarkFooterModel.hashCode() : 0);
    }

    public String toString() {
        DailyTickMarkHeaderModel dailyTickMarkHeaderModel = this.header;
        TickMarksStyle tickMarksStyle = this.style;
        boolean z4 = this.fillFullSpace;
        List<TickMarkStateModel> list = this.tickMarks;
        List<TickLabelModel> list2 = this.tickMarksLabels;
        DailyTickMarkWidthStyle dailyTickMarkWidthStyle = this.tickMarkWidthStyle;
        ExpectedAnnotationModel expectedAnnotationModel = this.expectedAnnotation;
        TickMarkFooterModel tickMarkFooterModel = this.footer;
        StringBuilder sb4 = new StringBuilder("DailyTickMarkPlotModel(header=");
        sb4.append(dailyTickMarkHeaderModel);
        sb4.append(", style=");
        sb4.append(tickMarksStyle);
        sb4.append(", fillFullSpace=");
        AbstractC25012a.m73391x(", tickMarks=", ", tickMarksLabels=", sb4, list, z4);
        sb4.append(list2);
        sb4.append(", tickMarkWidthStyle=");
        sb4.append(dailyTickMarkWidthStyle);
        sb4.append(", expectedAnnotation=");
        sb4.append(expectedAnnotationModel);
        sb4.append(", footer=");
        sb4.append(tickMarkFooterModel);
        sb4.append(")");
        return sb4.toString();
    }

    public DailyTickMarkPlotModel(DailyTickMarkHeaderModel dailyTickMarkHeaderModel, TickMarksStyle style, boolean z4, List<TickMarkStateModel> tickMarks, List<TickLabelModel> list, DailyTickMarkWidthStyle tickMarkWidthStyle, ExpectedAnnotationModel expectedAnnotationModel, TickMarkFooterModel tickMarkFooterModel) {
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(tickMarks, "tickMarks");
        AbstractC22676k.m65750j(tickMarkWidthStyle, "tickMarkWidthStyle");
        this.header = dailyTickMarkHeaderModel;
        this.style = style;
        this.fillFullSpace = z4;
        this.tickMarks = tickMarks;
        this.tickMarksLabels = list;
        this.tickMarkWidthStyle = tickMarkWidthStyle;
        this.expectedAnnotation = expectedAnnotationModel;
        this.footer = tickMarkFooterModel;
    }
}
