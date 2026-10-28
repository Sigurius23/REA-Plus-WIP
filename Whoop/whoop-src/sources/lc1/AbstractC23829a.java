package lc1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.heightpicker.HeightPickerModel;
import com.whoop.design.models.items.heightweight.HeightWeightModel;
import com.whoop.design.models.items.heightweight.SegmentedControlDisplayModel;
import com.whoop.design.models.items.weightpicker.WeightPickerModel;
import com.whoop.domain.model.UnitSystemExtKt;
import d21.C11505c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import l83.C23454a0;
import m83.AbstractC25267u;
import no.nordicsemi.android.dfu.DfuBaseService;
import o71.C27638h;
import o71.C27639i;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23743y0;
import p716lb1.C23749z0;
import p716lb1.C23753z4;
import p716lb1.Function1;
import p720m91.InterfaceC25312u;
import s41.C32194b;

/* JADX INFO: renamed from: lc1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\"\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lcom/whoop/design/models/items/heightweight/HeightWeightModel;", "Ljb1/a;", "reducer", "Lo71/h;", "f", "(Lcom/whoop/design/models/items/heightweight/HeightWeightModel;Ljb1/a;)Lo71/h;", "Lcom/whoop/design/models/items/heightweight/SegmentedControlDisplayModel;", "Lo71/i;", "g", "(Lcom/whoop/design/models/items/heightweight/SegmentedControlDisplayModel;)Lo71/i;", "Llb1/y0;", "a", "Llb1/y0;", "c", "()Llb1/y0;", "heightWeightMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23829a {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f94266a = Function1.m68251a(new C23753z4(20));

    /* JADX INFO: renamed from: lc1.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f94267w;

        public a(p715kotlin.jvm.functions.Function1 function1) {
            this.f94267w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f94267w.invoke((HeightWeightModel) it);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C23743y0 m70020c() {
        return f94266a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m70021d(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(HeightWeightModel.class), new a(new C23753z4(21)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C27638h m70022e(HeightWeightModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m70023f(model, AbstractC21537c.m60555e(null, 1, null));
    }

    /* JADX INFO: renamed from: f */
    public static final C27638h m70023f(HeightWeightModel heightWeightModel, C21535a reducer) {
        C11505c c11505c;
        C32194b c32194b;
        AbstractC22676k.m65750j(heightWeightModel, "<this>");
        AbstractC22676k.m65750j(reducer, "reducer");
        String unitType = heightWeightModel.getUnitType();
        if (unitType == null) {
            HeightPickerModel heightPicker = heightWeightModel.getHeightPicker();
            unitType = heightPicker != null ? heightPicker.getUnitType() : null;
            if (unitType == null) {
                WeightPickerModel weightPicker = heightWeightModel.getWeightPicker();
                unitType = weightPicker != null ? weightPicker.getUnitType() : null;
            }
        }
        HeightPickerModel heightPicker2 = heightWeightModel.getHeightPicker();
        if (heightPicker2 != null) {
            InterfaceC25312u interfaceC25312uM60544l = reducer.m60544l(heightPicker2.copy((12287 & 1) != 0 ? heightPicker2.label : null, (12287 & 2) != 0 ? heightPicker2.feetMin : 0, (12287 & 4) != 0 ? heightPicker2.feetMax : 0, (12287 & 8) != 0 ? heightPicker2.defaultFeet : 0, (12287 & 16) != 0 ? heightPicker2.defaultInches : 0, (12287 & 32) != 0 ? heightPicker2.defaultIn : null, (12287 & 64) != 0 ? heightPicker2.feetLabel : null, (12287 & 128) != 0 ? heightPicker2.inchesLabel : null, (12287 & 256) != 0 ? heightPicker2.cmMin : 0, (12287 & 512) != 0 ? heightPicker2.cmMax : 0, (12287 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? heightPicker2.defaultCm : 0, (12287 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? heightPicker2.cmLabel : null, (12287 & 4096) != 0 ? heightPicker2.unitType : unitType == null ? heightPicker2.getUnitType() : unitType, (12287 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? heightPicker2.stateUpdateValueKey : null));
            c11505c = interfaceC25312uM60544l instanceof C11505c ? (C11505c) interfaceC25312uM60544l : null;
        } else {
            c11505c = null;
        }
        WeightPickerModel weightPicker2 = heightWeightModel.getWeightPicker();
        if (weightPicker2 != null) {
            InterfaceC25312u interfaceC25312uM60544l2 = reducer.m60544l(WeightPickerModel.copy$default(weightPicker2, null, 0, 0, 0, null, 0, 0, 0, null, unitType == null ? weightPicker2.getUnitType() : unitType, null, 1535, null));
            c32194b = interfaceC25312uM60544l2 instanceof C32194b ? (C32194b) interfaceC25312uM60544l2 : null;
        } else {
            c32194b = null;
        }
        List<SegmentedControlDisplayModel> segmentedControl = heightWeightModel.getSegmentedControl();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(segmentedControl, 10));
        Iterator<T> it = segmentedControl.iterator();
        while (it.hasNext()) {
            arrayList.add(m70024g((SegmentedControlDisplayModel) it.next()));
        }
        HeightPickerModel heightPicker3 = heightWeightModel.getHeightPicker();
        String label = heightPicker3 != null ? heightPicker3.getLabel() : null;
        WeightPickerModel weightPicker3 = heightWeightModel.getWeightPicker();
        return new C27638h(arrayList, label, c11505c, weightPicker3 != null ? weightPicker3.getLabel() : null, c32194b, UnitSystemExtKt.unitSystemFromStringOrDefault$default(unitType, null, 2, null), heightWeightModel.getStateUpdateUnitKey());
    }

    /* JADX INFO: renamed from: g */
    public static final C27639i m70024g(SegmentedControlDisplayModel segmentedControlDisplayModel) {
        AbstractC22676k.m65750j(segmentedControlDisplayModel, "<this>");
        return new C27639i(segmentedControlDisplayModel.getNameDisplay(), segmentedControlDisplayModel.getId());
    }
}
