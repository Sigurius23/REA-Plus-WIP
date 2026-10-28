package n91;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import p720m91.C25292c0;
import p720m91.InterfaceC25312u;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: n91.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a!\u0010\u0007\u001a\u00020\u00012\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0005\"\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"", "Ln91/a;", "Lm91/u;", "a", "(Ljava/util/List;)Ljava/util/List;", "", "items", "b", "([Lm91/u;)Ln91/a;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC26477b {
    /* JADX INFO: renamed from: a */
    public static final List<InterfaceC25312u> m78413a(List<? extends InterfaceC26476a> list) {
        AbstractC22676k.m65750j(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            AbstractC25265s.m74141p0(arrayList, ((InterfaceC26476a) it.next()).mo78412a());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC26476a m78414b(InterfaceC25312u... items) {
        AbstractC22676k.m65750j(items, "items");
        C22677k0 c22677k0 = new C22677k0(3);
        float f13 = 16;
        c22677k0.m65760a(new C25292c0(0.0f, f13, 1, null));
        c22677k0.m65764e(items);
        c22677k0.m65760a(new C25292c0(0.0f, f13, 1, null));
        ArrayList arrayList = c22677k0.f89339a;
        return new C26478c(AbstractC37056f.m118959K(arrayList.toArray(new InterfaceC25312u[arrayList.size()])));
    }
}
