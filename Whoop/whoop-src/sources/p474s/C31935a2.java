package p474s;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import p444r.C30820n;
import p444r.MenuC30818l;
import q30.C29934u0;

/* JADX INFO: renamed from: s.a2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C31935a2 extends C32018v1 implements InterfaceC32022w1 {

    /* JADX INFO: renamed from: d0 */
    public static final Method f132629d0;

    /* JADX INFO: renamed from: c0 */
    public C29934u0 f132630c0;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f132629d0 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // p474s.C32018v1
    /* JADX INFO: renamed from: o */
    public final C31974k1 mo99417o(Context context, boolean z4) {
        C32033z1 c32033z1 = new C32033z1(context, z4);
        c32033z1.setHoverListener(this);
        return c32033z1;
    }

    @Override // p474s.InterfaceC32022w1
    /* JADX INFO: renamed from: t */
    public final void mo91535t(MenuC30818l menuC30818l, MenuItem menuItem) {
        C29934u0 c29934u0 = this.f132630c0;
        if (c29934u0 != null) {
            c29934u0.mo91535t(menuC30818l, menuItem);
        }
    }

    @Override // p474s.InterfaceC32022w1
    /* JADX INFO: renamed from: x */
    public final void mo91537x(MenuC30818l menuC30818l, C30820n c30820n) {
        C29934u0 c29934u0 = this.f132630c0;
        if (c29934u0 != null) {
            c29934u0.mo91537x(menuC30818l, c30820n);
        }
    }
}
