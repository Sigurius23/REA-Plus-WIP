package cc1;

import com.whoop.design.models.items.graph.plot.IconGroupModel;
import com.whoop.design.models.items.graph.plot.IconPlotModel;
import com.whoop.design.models.items.graph.plot.IconPointStyle;
import gz0.EnumC16313m0;
import j71.AbstractC21394b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25267u;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import q61.C29999c;

/* JADX INFO: renamed from: cc1.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/IconPlotModel;", "plot", "Lj71/b$f;", "a", "(Lcom/whoop/design/models/items/graph/plot/IconPlotModel;)Lj71/b$f;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4411a {

    /* JADX INFO: renamed from: cc1.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f17832a;

        static {
            int[] iArr = new int[IconPointStyle.values().length];
            try {
                iArr[IconPointStyle.SLEEP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IconPointStyle.STRAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f17832a = iArr;
        }
    }

    /* JADX INFO: renamed from: cc1.a$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f17833w = new b();

        /* JADX INFO: renamed from: a */
        public final long m13838a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite20();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m13838a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cc1.a$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f17834w = new c();

        /* JADX INFO: renamed from: a */
        public final long m13839a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m13839a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cc1.a$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f17835w = new d();

        /* JADX INFO: renamed from: a */
        public final long m13840a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m13840a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cc1.a$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f17836w = new e();

        /* JADX INFO: renamed from: a */
        public final long m13841a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getStrain();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m13841a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cc1.a$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final f f17837w = new f();

        /* JADX INFO: renamed from: a */
        public final long m13842a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite20();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m13842a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: a */
    public static final AbstractC21394b.f m13837a(IconPlotModel plot) {
        InterfaceC39332e interfaceC39332eM125323a;
        EnumC16313m0 enumC16313m0;
        AbstractC22676k.m65750j(plot, "plot");
        List<IconGroupModel> points = plot.getPoints();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(points, 10));
        Iterator<T> it = points.iterator();
        while (true) {
            int i13 = 0;
            if (!it.hasNext()) {
                break;
            }
            IconGroupModel iconGroupModel = (IconGroupModel) it.next();
            String icon = iconGroupModel.getIcon();
            Integer numValueOf = null;
            if (icon != null) {
                EnumC16313m0 enumC16313m1 = EnumC16313m0.CHECKMARK;
                EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
                int length = enumC16313m0ArrValues.length;
                while (true) {
                    if (i13 >= length) {
                        enumC16313m0 = null;
                        break;
                    }
                    enumC16313m0 = enumC16313m0ArrValues[i13];
                    if (AbstractC22676k.m65745e(enumC16313m0.name(), icon)) {
                        break;
                    }
                    i13++;
                }
                if (enumC16313m0 != null) {
                    enumC16313m1 = enumC16313m0;
                }
                if (enumC16313m1 != null) {
                    numValueOf = Integer.valueOf(enumC16313m1.toWhoopIcon());
                }
            }
            Integer num = numValueOf;
            int i14 = a.f17832a[iconGroupModel.getStyle().ordinal()];
            if (i14 != 1) {
                interfaceC39332eM125323a = i14 != 2 ? p745y81.Function1.m125323a(f.f17837w) : p745y81.Function1.m125323a(e.f17836w);
            } else {
                interfaceC39332eM125323a = p745y81.Function1.m125323a(d.f17835w);
            }
            arrayList.add(new C29999c(iconGroupModel.getX(), 1 - iconGroupModel.getY(), num, p745y81.Function1.m125323a(iconGroupModel.getStyle() == IconPointStyle.FAILED ? b.f17833w : c.f17834w), interfaceC39332eM125323a, iconGroupModel.getWidth()));
        }
        String id4 = plot.getId();
        Boolean hideWhileScrubbing = plot.getHideWhileScrubbing();
        boolean zBooleanValue = hideWhileScrubbing != null ? hideWhileScrubbing.booleanValue() : false;
        Boolean skipScrubbing = plot.getSkipScrubbing();
        return new AbstractC21394b.f(arrayList, id4, skipScrubbing != null ? skipScrubbing.booleanValue() : false, zBooleanValue);
    }
}
