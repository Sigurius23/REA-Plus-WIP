package tc1;

import ad3.AbstractC0770m;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.weightpicker.WeightPickerModel;
import com.whoop.domain.model.UnitSystem;
import com.whoop.domain.model.UnitSystemExtKt;
import com.whoop.whoopaction.domain.models.StateUpdateAction;
import d21.C11503a;
import i93.C18284j;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p716lb1.C23743y0;
import p716lb1.C23749z0;
import p716lb1.Function1;
import p720m91.InterfaceC25312u;
import qc1.C30217a;
import r12.C30856a;
import s41.C32194b;

/* JADX INFO: renamed from: tc1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;", "Ls41/b;", "e", "(Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;)Ls41/b;", "Llb1/y0;", "a", "Llb1/y0;", "d", "()Llb1/y0;", "weightPickerMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33698a {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f140883a = Function1.m68251a(new C30217a(22));

    /* JADX INFO: renamed from: tc1.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f140884w;

        public a(p715kotlin.jvm.functions.Function1 function1) {
            this.f140884w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f140884w.invoke((WeightPickerModel) it);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final C23743y0 m106473d() {
        return f140883a;
    }

    /* JADX INFO: renamed from: e */
    private static final C32194b m106474e(WeightPickerModel weightPickerModel) {
        UnitSystem unitSystemUnitSystemFromString = UnitSystemExtKt.unitSystemFromString(weightPickerModel.getUnitType());
        boolean zIsImperial = unitSystemUnitSystemFromString != null ? UnitSystemExtKt.isImperial(unitSystemUnitSystemFromString) : false;
        return new C32194b(zIsImperial, zIsImperial ? weightPickerModel.getDefaultLbs() : C11503a.f37005a.m30925n(weightPickerModel.getDefaultKg()), new C18284j(weightPickerModel.getLbsMin(), weightPickerModel.getLbsMax(), 1), new C18284j(weightPickerModel.getKgMin(), weightPickerModel.getKgMax(), 1), weightPickerModel.getLbsLabel(), weightPickerModel.getKgLabel(), weightPickerModel.getStateUpdateValueKey(), new C30856a(weightPickerModel, 28));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final StateUpdateAction m106475f(WeightPickerModel weightPickerModel, int i13, UnitSystem unitSystem) {
        AbstractC22676k.m65750j(unitSystem, "unitSystem");
        String stateUpdateValueKey = weightPickerModel.getStateUpdateValueKey();
        if (stateUpdateValueKey == null) {
            stateUpdateValueKey = "$weight";
        }
        if (!UnitSystemExtKt.isImperial(unitSystem)) {
            i13 = C11503a.f37005a.m30927p(i13);
        }
        return new StateUpdateAction(AbstractC25247g0.m73989X(new C23465k(stateUpdateValueKey, AbstractC0770m.m1840b(Integer.valueOf(i13)))), false, 2, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m106476g(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(WeightPickerModel.class), new a(new C30217a(23)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C32194b m106477h(WeightPickerModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m106474e(model);
    }
}
