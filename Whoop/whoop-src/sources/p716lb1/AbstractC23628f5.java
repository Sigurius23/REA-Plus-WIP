package p716lb1;

import com.whoop.design.atomic.molecule.trilabelslider.TriLabelSliderBarStyle;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.binding.BindingLoggerKt;
import com.whoop.design.models.items.TriLabelSliderModel;
import java.util.Iterator;
import java.util.Map;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q41.C29970c;

/* JADX INFO: renamed from: lb1.f5 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m65681d2 = {"Llb1/y0;", "a", "Llb1/y0;", "c", "()Llb1/y0;", "triLabelSliderModelMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23628f5 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93758a = Function1.m68251a(new C23751z2(25));

    /* JADX INFO: renamed from: lb1.f5$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93759w;

        public a(Function1 function1) {
            this.f93759w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93759w.invoke((TriLabelSliderModel) it);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C23743y0 m68759c() {
        return f93758a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m68760d(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(TriLabelSliderModel.class), new a(new C23751z2(26)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C29970c m68761e(TriLabelSliderModel model) {
        Object next;
        AbstractC22676k.m65750j(model, "model");
        float lowerBound = model.getLowerBound();
        Float centerBound = model.getCenterBound();
        float upperBound = model.getUpperBound();
        String startLabel = model.getStartLabel();
        String centerLabel = model.getCenterLabel();
        String endLabel = model.getEndLabel();
        float sliderValue = model.getSliderValue();
        int barThickness = model.getBarThickness();
        Iterator<E> it = TriLabelSliderBarStyle.getEntries().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((TriLabelSliderBarStyle) next).name(), model.getBarStyle()));
        TriLabelSliderBarStyle triLabelSliderBarStyle = (TriLabelSliderBarStyle) next;
        if (triLabelSliderBarStyle == null) {
            triLabelSliderBarStyle = TriLabelSliderBarStyle.STRAIN_GRADIENT;
        }
        Map<String, String> bindings = model.getBindings();
        return new C29970c(lowerBound, centerBound, upperBound, startLabel, centerLabel, endLabel, sliderValue, barThickness, triLabelSliderBarStyle, bindings != null ? BindingLoggerKt.resolveContentBindingKey(bindings, "sliderValue") : null);
    }
}
