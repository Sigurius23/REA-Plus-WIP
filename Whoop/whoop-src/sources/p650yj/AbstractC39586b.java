package p650yj;

import android.app.Activity;
import androidx.fragment.app.AbstractActivityC1340r0;
import fk.InterfaceC14544a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import p120ek.C13270d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: yj.b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC39586b {

    /* JADX INFO: renamed from: a */
    public static final WeakHashMap f170326a = new WeakHashMap();

    /* JADX INFO: renamed from: a */
    public static void m126469a(Activity activity, C13270d c13270d, InterfaceC14544a logger) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractActivityC1340r0 abstractActivityC1340r0 = activity instanceof AbstractActivityC1340r0 ? (AbstractActivityC1340r0) activity : null;
        if (abstractActivityC1340r0 == null) {
            logger.debug("Activity is not a FragmentActivity");
            return;
        }
        C39585a c39585a = new C39585a(c13270d, logger);
        abstractActivityC1340r0.getSupportFragmentManager().m4154X(c39585a, false);
        WeakHashMap weakHashMap = f170326a;
        Object arrayList = weakHashMap.get(abstractActivityC1340r0);
        if (arrayList == null) {
            arrayList = new ArrayList();
            weakHashMap.put(abstractActivityC1340r0, arrayList);
        }
        ((List) arrayList).add(c39585a);
    }

    /* JADX INFO: renamed from: b */
    public static void m126470b(Activity activity, InterfaceC14544a logger) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractActivityC1340r0 abstractActivityC1340r0 = activity instanceof AbstractActivityC1340r0 ? (AbstractActivityC1340r0) activity : null;
        if (abstractActivityC1340r0 == null) {
            logger.debug("Activity is not a FragmentActivity");
            return;
        }
        List list = (List) f170326a.remove(abstractActivityC1340r0);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                abstractActivityC1340r0.getSupportFragmentManager().m4181m0((C39585a) it.next());
            }
        }
    }
}
