package og2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: og2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"", "raw", "", "a", "(Ljava/lang/String;)Ljava/util/List;", "start-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27921b {
    /* JADX INFO: renamed from: a */
    public static final List<String> m84259a(String raw) {
        AbstractC22676k.m65750j(raw, "raw");
        List listM125906y0 = AbstractC39414r.m125906y0(raw, new String[]{","}, 6);
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM125906y0, 10));
        Iterator it = listM125906y0.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC39414r.m125869O0((String) it.next()).toString());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }
}
