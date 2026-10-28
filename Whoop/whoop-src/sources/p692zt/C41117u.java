package p692zt;

import aa3.C0627i1;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: zt.u */
/* JADX INFO: loaded from: classes.dex */
public final class C41117u {

    /* JADX INFO: renamed from: b */
    public static WeakReference f177239b;

    /* JADX INFO: renamed from: a */
    public C0627i1 f177240a;

    /* JADX INFO: renamed from: a */
    public final synchronized C41116t m133482a() {
        String str;
        C41116t c41116t;
        C0627i1 c0627i1 = this.f177240a;
        synchronized (((ArrayDeque) c0627i1.f2197d)) {
            str = (String) ((ArrayDeque) c0627i1.f2197d).peek();
        }
        Pattern pattern = C41116t.f177235d;
        c41116t = null;
        if (!TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split("!", -1);
            if (strArrSplit.length == 2) {
                c41116t = new C41116t(strArrSplit[0], strArrSplit[1]);
            }
        }
        return c41116t;
    }
}
