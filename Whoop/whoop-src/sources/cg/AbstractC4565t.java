package cg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: cg.t */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4565t {

    /* JADX INFO: renamed from: b */
    public static final Set f18379b;

    /* JADX INFO: renamed from: c */
    public static final C4561p f18380c;

    /* JADX INFO: renamed from: a */
    public final int f18381a;

    static {
        int i13 = 0;
        Set setM74059b1 = AbstractC25260n.m74059b1(new AbstractC4565t[]{C4563r.f18377d, C4564s.f18378d, C4562q.f18376d});
        f18379b = setM74059b1;
        Iterator it = setM74059b1.iterator();
        while (it.hasNext()) {
            i13 += ((AbstractC4565t) it.next()).f18381a;
        }
        f18380c = new C4561p(i13);
    }

    public AbstractC4565t(int i13) {
        this.f18381a = i13;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m14243a(AbstractC4565t item) {
        AbstractC22676k.m65750j(item, "item");
        return (item.f18381a & this.f18381a) != 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC4565t) {
            return this.f18381a == ((AbstractC4565t) obj).f18381a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f18381a;
    }

    public String toString() {
        Set set = f18379b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (m14243a((AbstractC4565t) obj)) {
                arrayList.add(obj);
            }
        }
        return AbstractC25265s.m74110N0(arrayList, "|", null, null, null, 62);
    }
}
