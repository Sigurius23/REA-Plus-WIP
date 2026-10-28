package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.PieChartModel;
import com.whoop.design.models.items.SliceModel;
import e81.C12827f0;
import e81.C12835j0;
import e81.EnumC12833i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: lb1.q3 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/design/models/items/PieChartModel;", "Le81/f0;", "f", "(Lcom/whoop/design/models/items/PieChartModel;)Le81/f0;", "Llb1/y0;", "a", "Llb1/y0;", "c", "()Llb1/y0;", "pieChartMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23698q3 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93932a = Function1.m68251a(new C23654j3(15));

    /* JADX INFO: renamed from: lb1.q3$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93933w;

        public a(Function1 function1) {
            this.f93933w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93933w.invoke((PieChartModel) it);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C23743y0 m69306c() {
        return f93932a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m69307d(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(PieChartModel.class), new a(new C23654j3(16)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C12827f0 m69308e(PieChartModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69309f(model);
    }

    /* JADX INFO: renamed from: f */
    public static final C12827f0 m69309f(PieChartModel pieChartModel) {
        EnumC12833i0 enumC12833i0;
        AbstractC22676k.m65750j(pieChartModel, "<this>");
        String id4 = pieChartModel.getId();
        List<SliceModel> slices = pieChartModel.getSlices();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(slices, 10));
        Iterator<T> it = slices.iterator();
        while (it.hasNext()) {
            String style = ((SliceModel) it.next()).getStyle();
            EnumC12833i0 enumC12833i1 = EnumC12833i0.NONE;
            EnumC12833i0[] enumC12833i0ArrValues = EnumC12833i0.values();
            int length = enumC12833i0ArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    enumC12833i0 = null;
                    break;
                }
                enumC12833i0 = enumC12833i0ArrValues[i13];
                if (AbstractC22676k.m65745e(enumC12833i0.name(), style)) {
                    break;
                }
                i13++;
            }
            if (enumC12833i0 != null) {
                enumC12833i1 = enumC12833i0;
            }
            arrayList.add(new C12835j0(enumC12833i1));
        }
        return new C12827f0(id4, false, arrayList, 2, null);
    }
}
