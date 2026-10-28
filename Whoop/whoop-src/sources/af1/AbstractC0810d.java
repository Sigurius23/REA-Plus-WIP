package af1;

import a71.C0520a;
import android.content.Context;
import cz0.AbstractC11258s;
import d61.InterfaceC11732a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: af1.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Ld61/a;", "Landroid/content/Context;", "context", "", "a", "(Ld61/a;Landroid/content/Context;)Ljava/lang/String;", "exercise-progress-mini-arch_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC0810d {
    /* JADX INFO: renamed from: a */
    public static final String m1969a(InterfaceC11732a interfaceC11732a, Context context) {
        AbstractC22676k.m65750j(interfaceC11732a, "<this>");
        AbstractC22676k.m65750j(context, "context");
        Collection<AbstractC11258s> collectionValues = interfaceC11732a.mo31360b().values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            AbstractC25265s.m74141p0(arrayList, ((AbstractC11258s) it.next()).mo30408a());
        }
        C0520a c0520a = (C0520a) AbstractC25265s.m74100H0(arrayList);
        if (c0520a == null) {
            return "";
        }
        List listM118959K = AbstractC37056f.m118959K(c0520a.getValueDisplay().resolve(context).toString(), c0520a.getUnitDisplay().resolve(context).toString());
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listM118959K) {
            if (!AbstractC39414r.m125890i0((String) obj)) {
                arrayList2.add(obj);
            }
        }
        return AbstractC25265s.m74110N0(arrayList2, " ", null, null, null, 62);
    }
}
