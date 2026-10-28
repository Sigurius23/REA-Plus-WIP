package p474s;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: s.j1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC31970j1 {

    /* JADX INFO: renamed from: a */
    public static final Field f132729a;

    static {
        Field declaredField = null;
        try {
            declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e5) {
            e5.printStackTrace();
        }
        f132729a = declaredField;
    }
}
