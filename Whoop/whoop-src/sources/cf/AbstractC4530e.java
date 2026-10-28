package cf;

import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25265s;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: cf.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4530e {

    /* JADX INFO: renamed from: b */
    public static final C4527b f18265b = new C4527b();

    /* JADX INFO: renamed from: a */
    public final int f18266a;

    public AbstractC4530e(int i13) {
        this.f18266a = i13;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m14181a(AbstractC4530e mode) {
        AbstractC22676k.m65750j(mode, "mode");
        int i13 = mode.f18266a;
        return (this.f18266a & i13) == i13;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC4530e) {
            return this.f18266a == ((AbstractC4530e) obj).f18266a;
        }
        return false;
    }

    public String toString() {
        List listM118959K = AbstractC37056f.m118959K(C4529d.f18261d, C4529d.f18262e, C4528c.f18259e, C4529d.f18263f);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM118959K) {
            if (m14181a((AbstractC4530e) obj)) {
                arrayList.add(obj);
            }
        }
        return AbstractC25265s.m74110N0(arrayList, "|", null, null, null, 62);
    }
}
