package p408q;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: q.h */
/* JADX INFO: loaded from: classes5.dex */
public final class MenuItemOnMenuItemClickListenerC29664h implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: c */
    public static final Class[] f121235c = {MenuItem.class};

    /* JADX INFO: renamed from: a */
    public Object f121236a;

    /* JADX INFO: renamed from: b */
    public Method f121237b;

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Object obj = this.f121236a;
        Method method = this.f121237b;
        try {
            if (method.getReturnType() == Boolean.TYPE) {
                return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (Exception e5) {
            throw new RuntimeException(e5);
        }
    }
}
