package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.binding.BindingLoggerKt;
import com.whoop.design.models.items.MultiWheelPickerModel;
import com.whoop.design.models.items.MultiWheelPickerWheel;
import com.whoop.design.models.items.WheelContent;
import com.whoop.design.models.items.WheelContentType;
import com.whoop.design.models.items.WheelOption;
import e93.AbstractC12889b;
import i93.C18282h;
import i93.C18283i;
import i93.C18284j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import m83.AbstractC25243e0;
import m83.AbstractC25267u;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import w21.C36738b;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: lb1.h3 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b\"\u001a\u0010\u000e\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m65681d2 = {"Lcom/whoop/design/models/items/MultiWheelPickerWheel;", "Lw21/b$a;", "g", "(Lcom/whoop/design/models/items/MultiWheelPickerWheel;)Lw21/b$a;", "Lcom/whoop/design/models/items/WheelContent;", "", "Lw21/b$b;", "c", "(Lcom/whoop/design/models/items/WheelContent;)Ljava/util/List;", "Llb1/y0;", "a", "Llb1/y0;", "d", "()Llb1/y0;", "multiWheelPickerModelMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23640h3 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93785a = Function1.m68251a(new C23751z2(1));

    /* JADX INFO: renamed from: lb1.h3$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f93786a;

        static {
            int[] iArr = new int[WheelContentType.values().length];
            try {
                iArr[WheelContentType.RANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WheelContentType.OPTIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f93786a = iArr;
        }
    }

    /* JADX INFO: renamed from: lb1.h3$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93787w;

        public b(Function1 function1) {
            this.f93787w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93787w.invoke((MultiWheelPickerModel) it);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0082  */
    /* JADX INFO: renamed from: c */
    private static final List<C36738b.b> m68836c(WheelContent wheelContent) {
        int iIntValue;
        String strM125895n0;
        int i13 = a.f93786a[wheelContent.getType().ordinal()];
        if (i13 != 1) {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            List<WheelOption> options = wheelContent.getOptions();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(options, 10));
            for (WheelOption wheelOption : options) {
                arrayList.add(new C36738b.b(wheelOption.getLabel(), wheelOption.getValue()));
            }
            return arrayList;
        }
        Double lowerBound = wheelContent.getLowerBound();
        int iDoubleValue = lowerBound != null ? (int) lowerBound.doubleValue() : 0;
        Double upperBound = wheelContent.getUpperBound();
        int iDoubleValue2 = upperBound != null ? (int) upperBound.doubleValue() : iDoubleValue;
        if (iDoubleValue2 < iDoubleValue) {
            iDoubleValue2 = iDoubleValue;
        }
        Double stepSize = wheelContent.getStepSize();
        if (stepSize != null) {
            int iDoubleValue3 = (int) stepSize.doubleValue();
            Integer numValueOf = Integer.valueOf(iDoubleValue3);
            if (iDoubleValue3 <= 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            } else {
                iIntValue = 1;
            }
        } else {
            iIntValue = 1;
        }
        C18282h c18282hM36268d0 = AbstractC12889b.m36268d0(iIntValue, new C18284j(iDoubleValue, iDoubleValue2, 1));
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(c18282hM36268d0, 10));
        Iterator it = c18282hM36268d0.iterator();
        while (((C18283i) it).f71138y) {
            String strValueOf = String.valueOf(((AbstractC25243e0) it).nextInt());
            Integer padTo = wheelContent.getPadTo();
            if (padTo == null || (strM125895n0 = AbstractC39414r.m125895n0(padTo.intValue(), strValueOf)) == null) {
                strM125895n0 = strValueOf;
            }
            String prefix = wheelContent.getPrefix();
            if (prefix == null) {
                prefix = "";
            }
            arrayList2.add(new C36738b.b(AbstractC2875y.m8299l(prefix, strM125895n0), strValueOf));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: d */
    public static final C23743y0 m68837d() {
        return f93785a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m68838e(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(MultiWheelPickerModel.class), new b(new C23751z2(2)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C36738b m68839f(MultiWheelPickerModel model) {
        AbstractC22676k.m65750j(model, "model");
        String id4 = model.getId();
        List<MultiWheelPickerWheel> wheels = model.getWheels();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(wheels, 10));
        Iterator<T> it = wheels.iterator();
        while (it.hasNext()) {
            arrayList.add(m68840g((MultiWheelPickerWheel) it.next()));
        }
        return new C36738b(id4, arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003d A[PHI: r0
      0x003d: PHI (r0v10 java.lang.Integer) = (r0v3 java.lang.Integer), (r0v6 java.lang.Integer) binds: [B:14:0x003b, B:28:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: g */
    private static final C36738b.a m68840g(MultiWheelPickerWheel multiWheelPickerWheel) {
        int i13;
        int iIntValue;
        List<C36738b.b> listM68836c = m68836c(multiWheelPickerWheel.getContent());
        Iterator<C36738b.b> it = listM68836c.iterator();
        int i14 = 0;
        while (true) {
            i13 = -1;
            if (!it.hasNext()) {
                i14 = -1;
                break;
            }
            if (AbstractC22676k.m65745e(it.next().getRawValue(), multiWheelPickerWheel.getSelectedValue())) {
                break;
            }
            i14++;
        }
        Integer numValueOf = Integer.valueOf(i14);
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            Iterator<C36738b.b> it3 = listM68836c.iterator();
            int i15 = 0;
            while (it3.hasNext()) {
                if (AbstractC22676k.m65745e(it3.next().getDisplayValue(), multiWheelPickerWheel.getSelectedValue())) {
                    i13 = i15;
                    break;
                }
                i15++;
            }
            numValueOf = Integer.valueOf(i13);
            if (numValueOf.intValue() < 0) {
                numValueOf = null;
            }
            iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        }
        int i16 = iIntValue;
        String key = multiWheelPickerWheel.getKey();
        String unitLabel = multiWheelPickerWheel.getUnitLabel();
        Map<String, String> bindings = multiWheelPickerWheel.getBindings();
        return new C36738b.a(key, listM68836c, unitLabel, i16, bindings != null ? BindingLoggerKt.resolveContentBindingKey(bindings, "selectedValue") : null);
    }
}
