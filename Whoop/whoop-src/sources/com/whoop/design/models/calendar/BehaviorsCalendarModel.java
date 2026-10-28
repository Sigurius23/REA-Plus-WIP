package com.whoop.design.models.calendar;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import s51.C32219p;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\u000b\u0010\fBO\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003¢\u0006\u0004\b!\u0010 JD\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001cJ\u0010\u0010%\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b2\u0010 ¨\u00065"}, m65681d2 = {"Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "title", "Lcom/whoop/design/models/calendar/BehaviorsCalendarDatePickerModel;", "datePicker", "", "Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;", "months", "Lcom/whoop/design/models/calendar/BehaviorsCalendarLegendItemModel;", "legend", "<init>", "(Ljava/lang/String;Lcom/whoop/design/models/calendar/BehaviorsCalendarDatePickerModel;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/design/models/calendar/BehaviorsCalendarDatePickerModel;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/design/models/calendar/BehaviorsCalendarDatePickerModel;", "component3", "()Ljava/util/List;", "component4", "copy", "(Ljava/lang/String;Lcom/whoop/design/models/calendar/BehaviorsCalendarDatePickerModel;Ljava/util/List;Ljava/util/List;)Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Lcom/whoop/design/models/calendar/BehaviorsCalendarDatePickerModel;", "getDatePicker", "Ljava/util/List;", "getMonths", "getLegend", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class BehaviorsCalendarModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final BehaviorsCalendarDatePickerModel datePicker;
    private final List<BehaviorsCalendarLegendItemModel> legend;
    private final List<BehaviorsCalendarMonthModel> months;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/calendar/BehaviorsCalendarModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return BehaviorsCalendarModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C32219p(10)), AbstractC30060g.m92087G(enumC23463i, new C32219p(11))};
    }

    public BehaviorsCalendarModel() {
        this((String) null, (BehaviorsCalendarDatePickerModel) null, (List) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(BehaviorsCalendarMonthModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(BehaviorsCalendarLegendItemModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BehaviorsCalendarModel copy$default(BehaviorsCalendarModel behaviorsCalendarModel, String str, BehaviorsCalendarDatePickerModel behaviorsCalendarDatePickerModel, List list, List list2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = behaviorsCalendarModel.title;
        }
        if ((i13 & 2) != 0) {
            behaviorsCalendarDatePickerModel = behaviorsCalendarModel.datePicker;
        }
        if ((i13 & 4) != 0) {
            list = behaviorsCalendarModel.months;
        }
        if ((i13 & 8) != 0) {
            list2 = behaviorsCalendarModel.legend;
        }
        return behaviorsCalendarModel.copy(str, behaviorsCalendarDatePickerModel, list, list2);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0033  */
    public static final /* synthetic */ void write$Self$design_models_release(BehaviorsCalendarModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.title, "")) {
            output.encodeStringElement(serialDesc, 0, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1)) {
            output.encodeSerializableElement(serialDesc, 1, BehaviorsCalendarDatePickerModel$$serializer.INSTANCE, self.datePicker);
        } else {
            if (!AbstractC22676k.m65745e(self.datePicker, new BehaviorsCalendarDatePickerModel((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null))) {
                output.encodeSerializableElement(serialDesc, 1, BehaviorsCalendarDatePickerModel$$serializer.INSTANCE, self.datePicker);
            }
        }
        boolean zShouldEncodeElementDefault = output.shouldEncodeElementDefault(serialDesc, 2);
        C25271y c25271y = C25271y.f99162w;
        if (zShouldEncodeElementDefault || !AbstractC22676k.m65745e(self.months, c25271y)) {
            output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.months);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && AbstractC22676k.m65745e(self.legend, c25271y)) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.legend);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BehaviorsCalendarDatePickerModel getDatePicker() {
        return this.datePicker;
    }

    public final List<BehaviorsCalendarMonthModel> component3() {
        return this.months;
    }

    public final List<BehaviorsCalendarLegendItemModel> component4() {
        return this.legend;
    }

    public final BehaviorsCalendarModel copy(String title, BehaviorsCalendarDatePickerModel datePicker, List<BehaviorsCalendarMonthModel> months, List<BehaviorsCalendarLegendItemModel> legend) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(datePicker, "datePicker");
        AbstractC22676k.m65750j(months, "months");
        AbstractC22676k.m65750j(legend, "legend");
        return new BehaviorsCalendarModel(title, datePicker, months, legend);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BehaviorsCalendarModel)) {
            return false;
        }
        BehaviorsCalendarModel behaviorsCalendarModel = (BehaviorsCalendarModel) other;
        return AbstractC22676k.m65745e(this.title, behaviorsCalendarModel.title) && AbstractC22676k.m65745e(this.datePicker, behaviorsCalendarModel.datePicker) && AbstractC22676k.m65745e(this.months, behaviorsCalendarModel.months) && AbstractC22676k.m65745e(this.legend, behaviorsCalendarModel.legend);
    }

    public final BehaviorsCalendarDatePickerModel getDatePicker() {
        return this.datePicker;
    }

    public final List<BehaviorsCalendarLegendItemModel> getLegend() {
        return this.legend;
    }

    public final List<BehaviorsCalendarMonthModel> getMonths() {
        return this.months;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.legend.hashCode() + AbstractC11895b.m31983b((this.datePicker.hashCode() + (this.title.hashCode() * 31)) * 31, 31, this.months);
    }

    public String toString() {
        String str = this.title;
        BehaviorsCalendarDatePickerModel behaviorsCalendarDatePickerModel = this.datePicker;
        List<BehaviorsCalendarMonthModel> list = this.months;
        List<BehaviorsCalendarLegendItemModel> list2 = this.legend;
        StringBuilder sb4 = new StringBuilder("BehaviorsCalendarModel(title=");
        sb4.append(str);
        sb4.append(", datePicker=");
        sb4.append(behaviorsCalendarDatePickerModel);
        sb4.append(", months=");
        return AbstractC30007c.m91843m(sb4, list, ", legend=", list2, ")");
    }

    public /* synthetic */ BehaviorsCalendarModel(int i13, String str, BehaviorsCalendarDatePickerModel behaviorsCalendarDatePickerModel, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        this.title = (i13 & 1) == 0 ? "" : str;
        if ((i13 & 2) == 0) {
            this.datePicker = new BehaviorsCalendarDatePickerModel((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
        } else {
            this.datePicker = behaviorsCalendarDatePickerModel;
        }
        int i14 = i13 & 4;
        C25271y c25271y = C25271y.f99162w;
        if (i14 == 0) {
            this.months = c25271y;
        } else {
            this.months = list;
        }
        if ((i13 & 8) == 0) {
            this.legend = c25271y;
        } else {
            this.legend = list2;
        }
    }

    public BehaviorsCalendarModel(String title, BehaviorsCalendarDatePickerModel datePicker, List<BehaviorsCalendarMonthModel> months, List<BehaviorsCalendarLegendItemModel> legend) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(datePicker, "datePicker");
        AbstractC22676k.m65750j(months, "months");
        AbstractC22676k.m65750j(legend, "legend");
        this.title = title;
        this.datePicker = datePicker;
        this.months = months;
        this.legend = legend;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BehaviorsCalendarModel(String str, BehaviorsCalendarDatePickerModel behaviorsCalendarDatePickerModel, List list, List list2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i13 & 1) != 0 ? "" : str;
        behaviorsCalendarDatePickerModel = (i13 & 2) != 0 ? new BehaviorsCalendarDatePickerModel((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : behaviorsCalendarDatePickerModel;
        int i14 = i13 & 4;
        C25271y c25271y = C25271y.f99162w;
        this(str, behaviorsCalendarDatePickerModel, i14 != 0 ? c25271y : list, (i13 & 8) != 0 ? c25271y : list2);
    }
}
