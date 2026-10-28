package mc1;

import i91.AbstractC18249c;
import j71.AbstractC21394b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k61.C22228a;
import k61.C22230c;
import m01.C24875c;
import m83.AbstractC25267u;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import u61.C34552a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: mc1.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lj71/b$g;", "graphPlotState", "Lj71/b;", "b", "(Lj71/b$g;)Lj71/b;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25416a {

    /* JADX INFO: renamed from: mc1.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f99520w = new a();

        /* JADX INFO: renamed from: a */
        public final long m74607a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getWhite20();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m74607a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: b */
    public static final AbstractC21394b m74605b(AbstractC21394b.g graphPlotState) {
        AbstractC22676k.m65750j(graphPlotState, "graphPlotState");
        List<C34552a> listM60076g = graphPlotState.m60076g();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM60076g, 10));
        Iterator<T> it = listM60076g.iterator();
        while (it.hasNext()) {
            arrayList.add(C34552a.m109231b((C34552a) it.next(), null, new C22228a(AbstractC18249c.m52572j(new C24875c(21)), null, 2, null), new C22230c(1, 0, 0, AbstractC18249c.m52574l(a.f99520w), 0L, false, 54, null), null, 9, null));
        }
        return AbstractC21394b.g.m60074f(graphPlotState, arrayList, null, true, null, null, false, 58, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final AbstractC17911t m74606c(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        return C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(brushBackground.getBlack5()), new C17919x(brushBackground.getTransparent())), 0.0f, 0.0f, 14);
    }
}
