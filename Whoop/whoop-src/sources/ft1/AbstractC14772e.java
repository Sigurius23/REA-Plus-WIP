package ft1;

import com.whoop.design.util.AbstractC8693b;
import e93.AbstractC12889b;
import g71.C15546d;
import i93.C18284j;
import j71.AbstractC21394b;
import java.util.ArrayList;
import java.util.Iterator;
import m83.AbstractC25243e0;
import m83.AbstractC25267u;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import wb3.AbstractC37056f;
import yy0.C39889c;

/* JADX INFO: renamed from: ft1.e */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\" \u0010\u0007\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0001\u0010\u0002\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004\" \u0010\f\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\t\u0012\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u0001\u0010\n¨\u0006\r"}, m65681d2 = {"Lj71/b$h;", "a", "Lj71/b$h;", "b", "()Lj71/b$h;", "getLabradorLinePlot$annotations", "()V", "labradorLinePlot", "Lj71/b$m;", "Lj71/b$m;", "()Lj71/b$m;", "getLabradorLabelsPlot$annotations", "labradorLabelsPlot", "labrador_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC14772e {

    /* JADX INFO: renamed from: a */
    private static final AbstractC21394b.h f54753a;

    /* JADX INFO: renamed from: b */
    private static final AbstractC21394b.m f54754b;

    /* JADX INFO: renamed from: ft1.e$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f54755w = new a();

        /* JADX INFO: renamed from: a */
        public final long m42379a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m42379a((C39336i) obj));
        }
    }

    static {
        C18284j c18284jM36278i0 = AbstractC12889b.m36278i0(0, 150);
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i0, 10));
        Iterator it = c18284jM36278i0.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(((AbstractC25243e0) it).nextInt() / 149.0f));
        }
        C18284j c18284jM36278i1 = AbstractC12889b.m36278i0(0, 7);
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i1, 10));
        Iterator it3 = c18284jM36278i1.iterator();
        while (it3.hasNext()) {
            arrayList2.add(Float.valueOf(((AbstractC25243e0) it3).nextInt() / 6.0f));
        }
        f54753a = new AbstractC21394b.h(arrayList2, arrayList, p745y81.Function1.m125323a(a.f54755w), 0.05f, "labrador lines plot", false, false, 96, null);
        C18284j c18284jM36278i2 = AbstractC12889b.m36278i0(0, 30);
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i2, 10));
        Iterator it4 = c18284jM36278i2.iterator();
        while (it4.hasNext()) {
            int iNextInt = ((AbstractC25243e0) it4).nextInt();
            arrayList3.add(new C39889c(AbstractC8693b.m21278l(iNextInt + "s"), null, null, iNextInt / 30.0f, 0.0f, null, 54, null));
        }
        f54754b = new AbstractC21394b.m(AbstractC37056f.m118958J(new C15546d(0.0d, arrayList3)), "labrador second labels", false, false, 12, null);
    }

    /* JADX INFO: renamed from: a */
    public static final AbstractC21394b.m m42377a() {
        return f54754b;
    }

    /* JADX INFO: renamed from: b */
    public static final AbstractC21394b.h m42378b() {
        return f54753a;
    }
}
