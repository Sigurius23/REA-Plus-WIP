package af0;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25265s;
import ns1.AbstractC27104b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import x83.AbstractC38093j;

/* JADX INFO: renamed from: af0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"", "Lns1/b;", "", "a", "(Ljava/util/List;)Ljava/lang/String;", "advanced-labs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC0806b {
    /* JADX INFO: renamed from: a */
    public static final String m1958a(List<? extends AbstractC27104b> list) {
        AbstractC22676k.m65750j(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String strM122039m = AbstractC38093j.m122039m(new File(((AbstractC27104b) it.next()).getFilePath()));
            if (strM122039m.length() <= 0) {
                strM122039m = null;
            }
            if (strM122039m != null) {
                arrayList.add(strM122039m);
            }
        }
        return AbstractC25265s.m74110N0(AbstractC25265s.m74159y0(arrayList), ", ", null, null, null, 62);
    }
}
