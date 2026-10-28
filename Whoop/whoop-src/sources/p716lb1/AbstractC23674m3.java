package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.binding.BindingLoggerKt;
import com.whoop.design.models.items.MultiWheelPickerModel;
import com.whoop.design.models.items.NumericInputSliderModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import l72.C23399f;
import l83.C23454a0;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import q83.AbstractC30060g;
import w21.C36738b;
import wb3.AbstractC37056f;
import y21.C39155b;

/* JADX INFO: renamed from: lb1.m3 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001d\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\r\"\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;", "Ly21/b$c;", "m", "(Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;)Ly21/b$c;", "Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;", "Ly21/b$a;", "l", "(Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;)Ly21/b$a;", "Lcom/whoop/design/models/items/MultiWheelPickerModel;", "", "driveSliderClientSide", "Lw21/b;", "k", "(Lcom/whoop/design/models/items/MultiWheelPickerModel;Z)Lw21/b;", "Llb1/y0;", "a", "Llb1/y0;", "e", "()Llb1/y0;", "numericInputSliderModelMapper", "Ljb1/a;", "b", "Ll83/h;", "f", "()Ljb1/a;", "pickerReducer", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23674m3 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93866a = Function1.m68251a(new C23751z2(5));

    /* JADX INFO: renamed from: b */
    private static final InterfaceC23462h f93867b = AbstractC30060g.m92088H(new C23399f(9));

    /* JADX INFO: renamed from: lb1.m3$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f93868a;

        static {
            int[] iArr = new int[NumericInputSliderModel.EndLabelFormat.values().length];
            try {
                iArr[NumericInputSliderModel.EndLabelFormat.TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NumericInputSliderModel.EndLabelFormat.DISTANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f93868a = iArr;
        }
    }

    /* JADX INFO: renamed from: lb1.m3$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93869w;

        public b(Function1 function1) {
            this.f93869w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93869w.invoke((NumericInputSliderModel) it);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final C23743y0 m69088e() {
        return f93866a;
    }

    /* JADX INFO: renamed from: f */
    private static final C21535a m69089f() {
        return (C21535a) f93867b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m69090g(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(NumericInputSliderModel.class), new b(new C23751z2(7)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [m91.u] */
    /* JADX INFO: renamed from: h */
    public static final C39155b m69091h(NumericInputSliderModel model) {
        AbstractC22676k.m65750j(model, "model");
        Map<String, String> bindings = model.getBindings();
        Object objM69094k = null;
        String strResolveContentBindingKey = bindings != null ? BindingLoggerKt.resolveContentBindingKey(bindings, "sliderValue") : null;
        float upperBound = model.getUpperBound();
        float lowerBound = model.getLowerBound();
        int stepSize = model.getStepSize();
        int barThickness = model.getBarThickness();
        EnumC39333f barColor = model.getBarColor();
        float sliderValue = model.getSliderValue();
        NumericInputSliderModel.StartLabel startLabel = model.getStartLabel();
        C39155b.c cVarM69096m = startLabel != null ? m69096m(startLabel) : null;
        NumericInputSliderModel.EndLabel endLabel = model.getEndLabel();
        C39155b.a aVarM69095l = endLabel != null ? m69095l(endLabel) : null;
        MultiWheelPickerModel picker = model.getPicker();
        if (picker != null) {
            NumericInputSliderModel.EndLabel endLabel2 = model.getEndLabel();
            objM69094k = m69094k(picker, (endLabel2 != null ? endLabel2.getFormat() : null) == NumericInputSliderModel.EndLabelFormat.TIME && strResolveContentBindingKey != null);
        }
        return new C39155b(upperBound, lowerBound, stepSize, barThickness, barColor, sliderValue, cVarM69096m, aVarM69095l, strResolveContentBindingKey, objM69094k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C21535a m69092i() {
        return AbstractC21537c.m60554d(new C23751z2(6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m69093j(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    private static final C36738b m69094k(MultiWheelPickerModel multiWheelPickerModel, boolean z4) {
        Object objM74100H0 = AbstractC25265s.m74100H0(m69089f().m60540g(AbstractC37056f.m118958J(multiWheelPickerModel)));
        C36738b c36738b = objM74100H0 instanceof C36738b ? (C36738b) objM74100H0 : null;
        if (!z4 || c36738b == null) {
            return c36738b;
        }
        List<C36738b.a> listM117848c = c36738b.m117848c();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM117848c, 10));
        for (C36738b.a aVar : listM117848c) {
            arrayList.add(C36738b.a.m117849b(aVar, null, null, null, 0, aVar.getKey(), 15, null));
        }
        return C36738b.m117846b(c36738b, null, arrayList, 1, null);
    }

    /* JADX INFO: renamed from: l */
    private static final C39155b.a m69095l(NumericInputSliderModel.EndLabel endLabel) {
        C39155b.b bVar;
        String unit = endLabel.getUnit();
        int i13 = a.f93868a[endLabel.getFormat().ordinal()];
        if (i13 == 1) {
            bVar = C39155b.b.TIME;
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = C39155b.b.DISTANCE;
        }
        return new C39155b.a(unit, bVar);
    }

    /* JADX INFO: renamed from: m */
    private static final C39155b.c m69096m(NumericInputSliderModel.StartLabel startLabel) {
        return new C39155b.c(startLabel.getTitle(), startLabel.getSubtitle(), startLabel.getBannerColor());
    }
}
