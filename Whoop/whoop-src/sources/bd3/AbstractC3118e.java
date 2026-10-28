package bd3;

import l83.C23467m;
import p505ts.AbstractC34132o;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: bd3.e */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3118e {

    /* JADX INFO: renamed from: a */
    public static final int f12241a;

    static {
        Object objM107888l;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            objM107888l = property != null ? AbstractC39421y.m125932Q(property) : null;
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        Integer num = (Integer) (objM107888l instanceof C23467m ? null : objM107888l);
        f12241a = num != null ? num.intValue() : 2097152;
    }
}
