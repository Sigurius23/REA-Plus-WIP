package p716lb1;

import a01.C0088h;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.BiomarkerCardModel;
import com.whoop.design.models.items.BiomarkerPieChartSectionModel;
import com.whoop.design.models.items.TrendCountModel;
import e81.C12816a;
import e81.C12827f0;
import e81.C12837k0;
import e81.C12840n;
import e81.EnumC12838l;
import e81.EnumC12839m;
import gz0.EnumC16313m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import l83.C23454a0;
import m83.AbstractC25267u;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: lb1.u */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\"\u001a\u0010\u0012\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m65681d2 = {"Lcom/whoop/design/models/items/BiomarkerPieChartSectionModel;", "model", "Le81/n;", "c", "(Lcom/whoop/design/models/items/BiomarkerPieChartSectionModel;)Le81/n;", "", "Lcom/whoop/design/models/items/BiomarkerCardModel;", "models", "Ljb1/a;", "reducer", "La01/h;", "g", "(Ljava/util/List;Ljb1/a;)Ljava/util/List;", "Llb1/y0;", "a", "Llb1/y0;", "f", "()Llb1/y0;", "biomarkerPieChartSectionMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23718u {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93979a = Function1.m68251a(new C23587a(26));

    /* JADX INFO: renamed from: lb1.u$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93980w;

        public a(Function1 function1) {
            this.f93980w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93980w.invoke((BiomarkerPieChartSectionModel) it);
        }
    }

    /* JADX WARN: Code duplicated, block: B:76:0x0162  */
    /* JADX INFO: renamed from: c */
    public static final C12840n m69443c(BiomarkerPieChartSectionModel model) {
        EnumC12838l enumC12838l;
        EnumC16313m0 enumC16313m0;
        EnumC12839m enumC12839m;
        EnumC12838l enumC12838l2;
        EnumC12838l enumC12838l3;
        EnumC12839m enumC12839m2;
        EnumC16313m0 enumC16313m1;
        AbstractC22676k.m65750j(model, "model");
        C21535a c21535aM60555e = AbstractC21537c.m60555e(null, 1, null);
        String id4 = model.getId();
        String orientation = model.getOrientation();
        EnumC12838l enumC12838l4 = EnumC12838l.PIE_LEFT;
        EnumC12838l[] enumC12838lArrValues = EnumC12838l.values();
        int length = enumC12838lArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC12838l = null;
                break;
            }
            enumC12838l = enumC12838lArrValues[i13];
            if (AbstractC22676k.m65745e(enumC12838l.name(), orientation)) {
                break;
            }
            i13++;
        }
        if (enumC12838l != null) {
            enumC12838l4 = enumC12838l;
        }
        InterfaceC25312u interfaceC25312uM60541h = c21535aM60555e.m60541h(model.getPieChart());
        C12827f0 c12827f0 = interfaceC25312uM60541h instanceof C12827f0 ? (C12827f0) interfaceC25312uM60541h : null;
        if (c12827f0 == null) {
            c12827f0 = new C12827f0("", false, C25271y.f99162w);
        }
        C12827f0 c12827f1 = c12827f0;
        String title = model.getPieChartContent().getTitle();
        String subtitle = model.getPieChartContent().getSubtitle();
        String subtitleIcon = model.getPieChartContent().getSubtitleIcon();
        if (subtitleIcon != null) {
            enumC16313m0 = EnumC16313m0.CARET_FORWARD;
            EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
            int length2 = enumC16313m0ArrValues.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length2) {
                    enumC16313m1 = null;
                    break;
                }
                enumC16313m1 = enumC16313m0ArrValues[i14];
                if (AbstractC22676k.m65745e(enumC16313m1.name(), subtitleIcon)) {
                    break;
                }
                i14++;
            }
            if (enumC16313m1 != null) {
                enumC16313m0 = enumC16313m1;
            }
        } else {
            enumC16313m0 = null;
        }
        C12816a c12816a = new C12816a(title, subtitle, enumC16313m0, model.getPieChartContent().getDestination());
        List<TrendCountModel> trendCounts = model.getTrendCounts();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(trendCounts, 10));
        for (TrendCountModel trendCountModel : trendCounts) {
            arrayList.add(new C12837k0(AbstractC23632g2.m68791d(trendCountModel.getTrend()), trendCountModel.getValue()));
        }
        List<C0088h> listM69447g = m69447g(model.getBiomarkers(), c21535aM60555e);
        String caption = model.getCaption();
        String style = model.getStyle();
        if (style != null) {
            EnumC12838l enumC12838l5 = EnumC12838l.PIE_LEFT;
            String orientation2 = model.getOrientation();
            EnumC12838l[] enumC12838lArrValues2 = EnumC12838l.values();
            int length3 = enumC12838lArrValues2.length;
            int i15 = 0;
            while (true) {
                if (i15 >= length3) {
                    enumC12838l2 = null;
                    break;
                }
                enumC12838l2 = enumC12838lArrValues2[i15];
                if (AbstractC22676k.m65745e(enumC12838l2.name(), orientation2)) {
                    break;
                }
                i15++;
            }
            boolean z4 = enumC12838l5 == (enumC12838l2 == null ? enumC12838l5 : enumC12838l2);
            EnumC12838l enumC12838l6 = EnumC12838l.PIE_RIGHT;
            String orientation3 = model.getOrientation();
            EnumC12838l[] enumC12838lArrValues3 = EnumC12838l.values();
            int length4 = enumC12838lArrValues3.length;
            int i16 = 0;
            while (true) {
                if (i16 >= length4) {
                    enumC12838l3 = null;
                    break;
                }
                enumC12838l3 = enumC12838lArrValues3[i16];
                if (AbstractC22676k.m65745e(enumC12838l3.name(), orientation3)) {
                    break;
                }
                i16++;
            }
            if (enumC12838l3 == null) {
                enumC12838l3 = enumC12838l6;
            }
            if (enumC12838l6 == enumC12838l3 || z4) {
                enumC12839m = EnumC12839m.DEFAULT;
            } else {
                enumC12839m = EnumC12839m.DEFAULT;
                EnumC12839m[] enumC12839mArrValues = EnumC12839m.values();
                int length5 = enumC12839mArrValues.length;
                int i17 = 0;
                while (true) {
                    if (i17 >= length5) {
                        enumC12839m2 = null;
                        break;
                    }
                    EnumC12839m enumC12839m3 = enumC12839mArrValues[i17];
                    if (AbstractC22676k.m65745e(enumC12839m3.name(), style)) {
                        enumC12839m2 = enumC12839m3;
                        break;
                    }
                    i17++;
                }
                if (enumC12839m2 != null) {
                    enumC12839m = enumC12839m2;
                }
            }
            if (enumC12839m == null) {
                enumC12839m = EnumC12839m.DEFAULT;
            }
        } else {
            enumC12839m = EnumC12839m.DEFAULT;
        }
        return new C12840n(id4, enumC12838l4, c12827f1, c12816a, arrayList, listM69447g, caption, enumC12839m, 0.0f, 256, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m69444d(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(BiomarkerPieChartSectionModel.class), new a(new C23587a(27)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C12840n m69445e(BiomarkerPieChartSectionModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69443c(model);
    }

    /* JADX INFO: renamed from: f */
    public static final C23743y0 m69446f() {
        return f93979a;
    }

    /* JADX INFO: renamed from: g */
    public static final List<C0088h> m69447g(List<BiomarkerCardModel> list, C21535a reducer) {
        AbstractC22676k.m65750j(reducer, "reducer");
        C25271y c25271y = C25271y.f99162w;
        if (list == null) {
            return c25271y;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<BiomarkerCardModel> it = list.iterator();
        while (it.hasNext()) {
            InterfaceC25312u interfaceC25312uM60544l = reducer.m60544l(it.next());
            C0088h c0088h = interfaceC25312uM60544l instanceof C0088h ? (C0088h) interfaceC25312uM60544l : null;
            if (c0088h == null) {
                return c25271y;
            }
            arrayList.add(c0088h.m229a((32767 & 1) != 0 ? c0088h.id : null, (32767 & 2) != 0 ? c0088h.title : null, (32767 & 4) != 0 ? c0088h.icon : null, (32767 & 8) != 0 ? c0088h.value : null, (32767 & 16) != 0 ? c0088h.unit : null, (32767 & 32) != 0 ? c0088h.statusType : null, (32767 & 64) != 0 ? c0088h.trend : null, (32767 & 128) != 0 ? c0088h.disclaimer : null, (32767 & 256) != 0 ? c0088h.destination : null, (32767 & 512) != 0 ? c0088h.interaction : null, (32767 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c0088h.categoryIds : null, (32767 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c0088h.rangeMeter : null, (32767 & 4096) != 0 ? c0088h.lastRecording : null, (32767 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c0088h.miniCallout : null, (32767 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c0088h.graph : null, (32767 & 32768) != 0 ? c0088h.useTileBackground : false));
        }
        return arrayList;
    }
}
