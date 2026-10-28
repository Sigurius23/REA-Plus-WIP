package p474s;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: s.g1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC31958g1 {

    /* JADX INFO: renamed from: a */
    public static final Method f132678a;

    /* JADX INFO: renamed from: b */
    public static final Method f132679b;

    /* JADX INFO: renamed from: c */
    public static final Method f132680c;

    /* JADX INFO: renamed from: d */
    public static final boolean f132681d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
            f132678a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f132679b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f132680c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f132681d = true;
        } catch (NoSuchMethodException e5) {
            e5.printStackTrace();
        }
    }
}
