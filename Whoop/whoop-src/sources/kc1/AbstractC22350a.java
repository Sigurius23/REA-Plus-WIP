package kc1;

import ad3.AbstractC0770m;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.heightpicker.HeightPickerModel;
import com.whoop.domain.model.UnitSystem;
import com.whoop.domain.model.UnitSystemExtKt;
import com.whoop.whoopaction.domain.models.StateUpdateAction;
import d21.C11503a;
import d21.C11505c;
import i93.C18284j;
import ji0.C21714b;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import p708hb2.C17098f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p716lb1.C23743y0;
import p716lb1.C23749z0;
import p716lb1.Function1;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: kc1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;", "Ld21/c;", "g", "(Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;)Ld21/c;", "Llb1/y0;", "a", "Llb1/y0;", "d", "()Llb1/y0;", "heightPickerMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22350a {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f87209a = Function1.m68251a(new C21714b(21));

    /* JADX INFO: renamed from: kc1.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f87210w;

        public a(p715kotlin.jvm.functions.Function1 function1) {
            this.f87210w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f87210w.invoke((HeightPickerModel) it);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final C23743y0 m64235d() {
        return f87209a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m64236e(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(HeightPickerModel.class), new a(new C21714b(22)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C11505c m64237f(HeightPickerModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m64238g(model);
    }

    /* JADX INFO: renamed from: g */
    private static final C11505c m64238g(HeightPickerModel heightPickerModel) {
        int defaultCm;
        UnitSystem unitSystemUnitSystemFromString = UnitSystemExtKt.unitSystemFromString(heightPickerModel.getUnitType());
        boolean zIsImperial = unitSystemUnitSystemFromString != null ? UnitSystemExtKt.isImperial(unitSystemUnitSystemFromString) : false;
        if (zIsImperial) {
            Integer defaultIn = heightPickerModel.getDefaultIn();
            if (defaultIn != null) {
                defaultCm = C11503a.f37005a.m30921j(defaultIn.intValue());
            } else {
                defaultCm = C11503a.f37005a.m30913b(heightPickerModel.getDefaultFeet(), heightPickerModel.getDefaultInches());
            }
        } else {
            defaultCm = heightPickerModel.getDefaultCm();
        }
        return new C11505c(zIsImperial, defaultCm, new C18284j(heightPickerModel.getFeetMin(), heightPickerModel.getFeetMax(), 1), new C18284j(heightPickerModel.getCmMin(), heightPickerModel.getCmMax(), 1), heightPickerModel.getFeetLabel(), heightPickerModel.getInchesLabel(), heightPickerModel.getCmLabel(), heightPickerModel.getStateUpdateValueKey(), new C17098f(heightPickerModel, 27));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final StateUpdateAction m64239h(HeightPickerModel heightPickerModel, int i13, UnitSystem unitSystem) {
        AbstractC22676k.m65750j(unitSystem, "unitSystem");
        String stateUpdateValueKey = heightPickerModel.getStateUpdateValueKey();
        if (stateUpdateValueKey == null) {
            stateUpdateValueKey = "$height";
        }
        if (UnitSystemExtKt.isImperial(unitSystem)) {
            i13 = C11503a.f37005a.m30912a(i13);
        }
        return new StateUpdateAction(AbstractC25247g0.m73989X(new C23465k(stateUpdateValueKey, AbstractC0770m.m1840b(Integer.valueOf(i13)))), false, 2, (DefaultConstructorMarker) null);
    }
}
