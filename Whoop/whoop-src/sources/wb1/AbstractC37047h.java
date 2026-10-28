package wb1;

import com.whoop.design.models.items.graph.plane.line.GraphLineModel;
import com.whoop.design.models.items.graph.plane.line.GraphLineStyle;
import com.whoop.design.models.items.graph.plane.line.GraphLineTheme;
import g61.EnumC15533f;
import j61.C21372f;
import j61.EnumC21375i;
import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25267u;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.EnumC39333f;
import p745y81.InterfaceC39332e;
import p91.C29007a;

/* JADX INFO: renamed from: wb1.h */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"", "Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;", "lines", "Lj61/f;", "b", "(Ljava/util/List;)Ljava/util/List;", "Lcom/whoop/design/models/items/graph/plane/line/GraphLineStyle;", "graphLineStyle", "Ly81/e;", "a", "(Lcom/whoop/design/models/items/graph/plane/line/GraphLineStyle;)Ly81/e;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37047h {

    /* JADX INFO: renamed from: wb1.h$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f158529a;

        static {
            int[] iArr = new int[GraphLineStyle.values().length];
            try {
                iArr[GraphLineStyle.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GraphLineStyle.OVERVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GraphLineStyle.HEART_RATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f158529a = iArr;
        }
    }

    /* JADX INFO: renamed from: wb1.h$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f158530w = new b();

        /* JADX INFO: renamed from: a */
        public final long m118930a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite5();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m118930a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: wb1.h$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f158531w = new c();

        /* JADX INFO: renamed from: a */
        public final long m118931a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite5();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m118931a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: wb1.h$d */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f158532w = new d();

        /* JADX INFO: renamed from: a */
        public final long m118932a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBlack20();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m118932a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: a */
    private static final InterfaceC39332e m118928a(GraphLineStyle graphLineStyle) {
        int i13 = a.f158529a[graphLineStyle.ordinal()];
        if (i13 == 1) {
            return p745y81.Function1.m125323a(b.f158530w);
        }
        if (i13 == 2) {
            return p745y81.Function1.m125323a(c.f158531w);
        }
        if (i13 == 3) {
            return p745y81.Function1.m125323a(d.f158532w);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: b */
    public static final List<C21372f> m118929b(List<GraphLineModel> lines) {
        InterfaceC39332e interfaceC39332eM118928a;
        EnumC39333f labelColor;
        EnumC21375i enumC21375i;
        AbstractC22676k.m65750j(lines, "lines");
        List<GraphLineModel> list = lines;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (GraphLineModel graphLineModel : list) {
            float position = (float) graphLineModel.getPosition();
            EnumC15533f axis = graphLineModel.getAxis();
            GraphLineTheme theme = graphLineModel.getTheme();
            if (theme == null || (interfaceC39332eM118928a = theme.getLineColor()) == null) {
                interfaceC39332eM118928a = m118928a(graphLineModel.getStyle());
            }
            InterfaceC39332e interfaceC39332e = interfaceC39332eM118928a;
            String label = graphLineModel.getLabel();
            String labelStyle = graphLineModel.getLabelStyle();
            if (labelStyle == null) {
                labelStyle = "";
            }
            EnumC21375i enumC21375i2 = EnumC21375i.DEFAULT;
            EnumC21375i[] enumC21375iArrValues = EnumC21375i.values();
            int length = enumC21375iArrValues.length;
            int i13 = 0;
            while (true) {
                labelColor = null;
                if (i13 >= length) {
                    enumC21375i = null;
                    break;
                }
                enumC21375i = enumC21375iArrValues[i13];
                if (AbstractC22676k.m65745e(enumC21375i.name(), labelStyle)) {
                    break;
                }
                i13++;
            }
            EnumC21375i enumC21375i3 = enumC21375i == null ? enumC21375i2 : enumC21375i;
            C29007a c29007a = ((float) graphLineModel.getPosition()) == 0.0f ? new C29007a(0.0f, 1.0f, false, false, 13, null) : C29007a.INSTANCE.m88139d();
            GraphLineTheme theme2 = graphLineModel.getTheme();
            if (theme2 != null) {
                labelColor = theme2.getLabelColor();
            }
            arrayList.add(new C21372f(position, interfaceC39332e, axis, c29007a, label, enumC21375i3, labelColor));
        }
        return arrayList;
    }
}
