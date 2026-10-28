package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.TrendStateEnum;
import com.whoop.design.models.items.TrendIconModel;
import com.whoop.design.models.items.TrendIconsLegendModel;
import gz0.EnumC16313m0;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import m21.C24942a;
import m21.C24945d;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: lb1.p2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m65681d2 = {"Llb1/y0;", "a", "Llb1/y0;", "c", "()Llb1/y0;", "legendMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23691p2 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93907a = Function1.m68251a(new C23714t1(25));

    /* JADX INFO: renamed from: lb1.p2$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93908w;

        public a(Function1 function1) {
            this.f93908w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93908w.invoke((TrendIconsLegendModel) it);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C23743y0 m69228c() {
        return f93907a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m69229d(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(TrendIconsLegendModel.class), new a(new C23714t1(26)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C24945d m69230e(TrendIconsLegendModel model) {
        EnumC16313m0 enumC16313m0;
        TrendStateEnum trendStateEnum;
        AbstractC22676k.m65750j(model, "model");
        String title = model.getTitle();
        List<TrendIconModel> icons = model.getIcons();
        ArrayList arrayList = null;
        if (icons != null) {
            List<TrendIconModel> list = icons;
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            for (TrendIconModel trendIconModel : list) {
                String icon = trendIconModel.getIcon();
                EnumC16313m0 enumC16313m1 = EnumC16313m0.TINY_ELLIPSE;
                EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
                int length = enumC16313m0ArrValues.length;
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    if (i14 >= length) {
                        enumC16313m0 = null;
                        break;
                    }
                    enumC16313m0 = enumC16313m0ArrValues[i14];
                    if (AbstractC22676k.m65745e(enumC16313m0.name(), icon)) {
                        break;
                    }
                    i14++;
                }
                if (enumC16313m0 != null) {
                    enumC16313m1 = enumC16313m0;
                }
                String type = trendIconModel.getType();
                TrendStateEnum trendStateEnum2 = TrendStateEnum.UNKNOWN;
                TrendStateEnum[] trendStateEnumArrValues = TrendStateEnum.values();
                int length2 = trendStateEnumArrValues.length;
                while (true) {
                    if (i13 >= length2) {
                        trendStateEnum = null;
                        break;
                    }
                    trendStateEnum = trendStateEnumArrValues[i13];
                    if (AbstractC22676k.m65745e(trendStateEnum.name(), type)) {
                        break;
                    }
                    i13++;
                }
                if (trendStateEnum != null) {
                    trendStateEnum2 = trendStateEnum;
                }
                arrayList2.add(new C24942a(enumC16313m1, AbstractC23682o.m69172b(trendStateEnum2)));
            }
            arrayList = arrayList2;
        }
        return new C24945d(title, model.getSubtitle(), arrayList);
    }
}
