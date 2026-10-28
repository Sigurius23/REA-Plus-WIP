package p716lb1;

import java.util.List;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import xb3.AbstractC38176k;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: lb1.p */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0000*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"", "", "", "max", "Lkd1/o;", "c", "(Ljava/util/List;I)Ljava/util/List;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23688p {
    /* JADX INFO: renamed from: c */
    public static final List<AbstractC22403o> m69208c(List<String> list, int i13) {
        if (list == null) {
            return null;
        }
        List<AbstractC22403o> listM122276E = AbstractC38176k.m122276E(AbstractC38176k.m122272A(AbstractC38176k.m122275D(AbstractC38176k.m122273B(AbstractC25265s.m74145r0(list), new C23670m(2)), i13), new C23670m(3)));
        if (listM122276E.isEmpty()) {
            return null;
        }
        return listM122276E;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ List m69209d(List list, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = 3;
        }
        return m69208c(list, i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final String m69210e(String url) {
        AbstractC22676k.m65750j(url, "url");
        if (AbstractC39414r.m125890i0(url)) {
            return null;
        }
        return url;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final AbstractC22403o m69211f(String it) {
        AbstractC22676k.m65750j(it, "it");
        return AbstractC22404p.m64503l(it);
    }
}
