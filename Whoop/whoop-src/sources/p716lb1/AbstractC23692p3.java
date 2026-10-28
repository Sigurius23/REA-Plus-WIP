package p716lb1;

import c81.C4305e;
import c81.C4307g;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.ImpactModel;
import com.whoop.design.models.items.PaceOfAgingMeterModel;
import com.whoop.design.models.items.PaceOfAgingMeterTickModel;
import gz0.AbstractC16315n0;
import gz0.EnumC16313m0;
import hy0.C17731c2;
import i93.C18282h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import l83.C23454a0;
import m83.AbstractC25267u;
import or2.AbstractC28145a1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: lb1.p3 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b\"\u001a\u0010\u000e\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m65681d2 = {"Lcom/whoop/design/models/items/PaceOfAgingMeterModel;", "model", "", "ignoreAnimation", "", "pastCurrentIndex", "Lc81/g;", "g", "(Lcom/whoop/design/models/items/PaceOfAgingMeterModel;ZLjava/lang/Integer;)Lc81/g;", "Llb1/y0;", "a", "Llb1/y0;", "d", "()Llb1/y0;", "paceOfAgingMeterMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23692p3 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93909a = Function1.m68251a(new C23654j3(13));

    /* JADX INFO: renamed from: lb1.p3$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93910w;

        public a(Function1 function1) {
            this.f93910w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93910w.invoke((PaceOfAgingMeterModel) it);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final C23743y0 m69235d() {
        return f93909a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m69236e(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(PaceOfAgingMeterModel.class), new a(new C23654j3(14)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C4307g m69237f(PaceOfAgingMeterModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69239h(model, false, null, 6, null);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b A[PHI: r2
      0x003b: PHI (r2v15 java.lang.Integer) = (r2v3 java.lang.Integer), (r2v5 java.lang.Integer) binds: [B:11:0x0039, B:17:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: g */
    public static final C4307g m69238g(PaceOfAgingMeterModel model, boolean z4, Integer num) {
        int iIntValue;
        int iIntValue2;
        AbstractC22676k.m65750j(model, "model");
        C21535a c21535aM60554d = AbstractC21537c.m60554d(new C23751z2(9));
        Iterator<PaceOfAgingMeterTickModel> it = model.getTicks().iterator();
        boolean z13 = false;
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            if (it.next().isCurrentValue()) {
                break;
            }
            i13++;
        }
        Integer currentValueRiseStartTickIndex = model.getCurrentValueRiseStartTickIndex();
        if (currentValueRiseStartTickIndex != null) {
            iIntValue = currentValueRiseStartTickIndex.intValue();
        } else {
            currentValueRiseStartTickIndex = Integer.valueOf(i13);
            if (i13 == -1) {
                currentValueRiseStartTickIndex = null;
            }
            if (currentValueRiseStartTickIndex != null) {
                iIntValue = currentValueRiseStartTickIndex.intValue();
            } else {
                iIntValue = 0;
            }
        }
        Integer numValueOf = Integer.valueOf(i13);
        if (i13 == -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            iIntValue2 = numValueOf.intValue();
        } else {
            Integer currentValueRiseStartTickIndex2 = model.getCurrentValueRiseStartTickIndex();
            iIntValue2 = currentValueRiseStartTickIndex2 != null ? currentValueRiseStartTickIndex2.intValue() : 0;
        }
        C18282h c18282hM85167c = AbstractC28145a1.m85167c(iIntValue, iIntValue2);
        List<PaceOfAgingMeterTickModel> ticks = model.getTicks();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(ticks, 10));
        for (PaceOfAgingMeterTickModel paceOfAgingMeterTickModel : ticks) {
            arrayList.add(new C4305e(paceOfAgingMeterTickModel.getTopValueDisplay(), paceOfAgingMeterTickModel.getBottomValueDisplay(), paceOfAgingMeterTickModel.isCurrentValue(), paceOfAgingMeterTickModel.getStyle()));
        }
        String leftLabelDisplay = model.getLeftLabelDisplay();
        EnumC16313m0 enumC16313m0M46378c = AbstractC16315n0.m46378c(model.getLeftIcon(), EnumC16313m0.SLOW_PACE_OF_AGING);
        String rightLabelDisplay = model.getRightLabelDisplay();
        EnumC16313m0 enumC16313m0M46378c2 = AbstractC16315n0.m46378c(model.getRightIcon(), EnumC16313m0.FAST_PACE_OF_AGING);
        String titleDisplay = model.getTitleDisplay();
        if (z4 || (num != null && i13 == num.intValue())) {
            z13 = true;
        }
        boolean z14 = z13;
        ImpactModel trend = model.getTrend();
        InterfaceC25312u interfaceC25312uM60541h = trend != null ? c21535aM60554d.m60541h(trend) : null;
        return new C4307g(arrayList, leftLabelDisplay, enumC16313m0M46378c, rightLabelDisplay, enumC16313m0M46378c2, titleDisplay, c18282hM85167c, z14, false, interfaceC25312uM60541h instanceof C17731c2 ? (C17731c2) interfaceC25312uM60541h : null, 256, null);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ C4307g m69239h(PaceOfAgingMeterModel paceOfAgingMeterModel, boolean z4, Integer num, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z4 = true;
        }
        if ((i13 & 4) != 0) {
            num = null;
        }
        return m69238g(paceOfAgingMeterModel, z4, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m69240i(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        return C23454a0.f92919a;
    }
}
