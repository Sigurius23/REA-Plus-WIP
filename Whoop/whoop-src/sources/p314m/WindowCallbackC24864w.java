package p314m;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;
import p408q.AbstractC29658b;
import p408q.AbstractC29669m;
import p408q.AbstractC29670n;
import p408q.AbstractC29671o;
import p408q.C29662f;
import p444r.MenuC30818l;

/* JADX INFO: renamed from: m.w */
/* JADX INFO: loaded from: classes.dex */
public final class WindowCallbackC24864w implements Window.Callback {

    /* JADX INFO: renamed from: E */
    public boolean f97390E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ LayoutInflaterFactory2C24829a0 f97391F;

    /* JADX INFO: renamed from: w */
    public final Window.Callback f97392w;

    /* JADX INFO: renamed from: x */
    public C24843h0 f97393x;

    /* JADX INFO: renamed from: y */
    public boolean f97394y;

    /* JADX INFO: renamed from: z */
    public boolean f97395z;

    public WindowCallbackC24864w(LayoutInflaterFactory2C24829a0 layoutInflaterFactory2C24829a0, Window.Callback callback) {
        this.f97391F = layoutInflaterFactory2C24829a0;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f97392w = callback;
    }

    /* JADX INFO: renamed from: a */
    public final void m72894a(Window.Callback callback) {
        try {
            this.f97394y = true;
            callback.onContentChanged();
        } finally {
            this.f97394y = false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m72895b(int i13, Menu menu) {
        return this.f97392w.onMenuOpened(i13, menu);
    }

    /* JADX INFO: renamed from: c */
    public final void m72896c(int i13, Menu menu) {
        this.f97392w.onPanelClosed(i13, menu);
    }

    /* JADX INFO: renamed from: d */
    public final void m72897d(List list, Menu menu, int i13) {
        AbstractC29670n.m91146a(this.f97392w, list, menu, i13);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f97392w.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z4 = this.f97395z;
        Window.Callback callback = this.f97392w;
        if (z4) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        return this.f97391F.m72811z(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!this.f97392w.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            LayoutInflaterFactory2C24829a0 layoutInflaterFactory2C24829a0 = this.f97391F;
            layoutInflaterFactory2C24829a0.m72787E();
            AbstractC24830b abstractC24830b = layoutInflaterFactory2C24829a0.f97213O;
            if (abstractC24830b == null || !abstractC24830b.mo72820i(keyCode, keyEvent)) {
                C24867z c24867z = layoutInflaterFactory2C24829a0.f97237m0;
                if (c24867z == null || !layoutInflaterFactory2C24829a0.m72792J(c24867z, keyEvent.getKeyCode(), keyEvent)) {
                    if (layoutInflaterFactory2C24829a0.f97237m0 == null) {
                        C24867z c24867zM72786D = layoutInflaterFactory2C24829a0.m72786D(0);
                        layoutInflaterFactory2C24829a0.m72793K(c24867zM72786D, keyEvent);
                        boolean zM72792J = layoutInflaterFactory2C24829a0.m72792J(c24867zM72786D, keyEvent.getKeyCode(), keyEvent);
                        c24867zM72786D.f97410k = false;
                        if (zM72792J) {
                        }
                    }
                    return false;
                }
                C24867z c24867z2 = layoutInflaterFactory2C24829a0.f97237m0;
                if (c24867z2 != null) {
                    c24867z2.f97411l = true;
                    return true;
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f97392w.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f97392w.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f97392w.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f97392w.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f97392w.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f97392w.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f97394y) {
            this.f97392w.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i13, Menu menu) {
        if (i13 != 0 || (menu instanceof MenuC30818l)) {
            return this.f97392w.onCreatePanelMenu(i13, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i13) {
        View viewM72846c;
        C24843h0 c24843h0 = this.f97393x;
        return (c24843h0 == null || (viewM72846c = c24843h0.m72846c(i13)) == null) ? this.f97392w.onCreatePanelView(i13) : viewM72846c;
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f97392w.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i13, MenuItem menuItem) {
        return this.f97392w.onMenuItemSelected(i13, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i13, Menu menu) {
        m72895b(i13, menu);
        LayoutInflaterFactory2C24829a0 layoutInflaterFactory2C24829a0 = this.f97391F;
        if (i13 == 108) {
            layoutInflaterFactory2C24829a0.m72787E();
            AbstractC24830b abstractC24830b = layoutInflaterFactory2C24829a0.f97213O;
            if (abstractC24830b != null) {
                abstractC24830b.mo72814c(true);
            }
        } else {
            layoutInflaterFactory2C24829a0.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i13, Menu menu) {
        if (this.f97390E) {
            this.f97392w.onPanelClosed(i13, menu);
            return;
        }
        m72896c(i13, menu);
        LayoutInflaterFactory2C24829a0 layoutInflaterFactory2C24829a0 = this.f97391F;
        if (i13 == 108) {
            layoutInflaterFactory2C24829a0.m72787E();
            AbstractC24830b abstractC24830b = layoutInflaterFactory2C24829a0.f97213O;
            if (abstractC24830b != null) {
                abstractC24830b.mo72814c(false);
                return;
            }
            return;
        }
        if (i13 == 0) {
            C24867z c24867zM72786D = layoutInflaterFactory2C24829a0.m72786D(i13);
            if (c24867zM72786D.f97412m) {
                layoutInflaterFactory2C24829a0.m72810x(c24867zM72786D, false);
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z4) {
        AbstractC29671o.m91147a(this.f97392w, z4);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i13, View view, Menu menu) {
        MenuC30818l menuC30818l = menu instanceof MenuC30818l ? (MenuC30818l) menu : null;
        if (i13 == 0 && menuC30818l == null) {
            return false;
        }
        if (menuC30818l != null) {
            menuC30818l.m94826x(true);
        }
        C24843h0 c24843h0 = this.f97393x;
        if (c24843h0 != null) {
            c24843h0.m72847d(i13);
        }
        boolean zOnPreparePanel = this.f97392w.onPreparePanel(i13, view, menu);
        if (menuC30818l != null) {
            menuC30818l.m94826x(false);
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i13) {
        MenuC30818l menuC30818l = this.f97391F.m72786D(0).f97407h;
        if (menuC30818l != null) {
            m72897d(list, menuC30818l, i13);
        } else {
            m72897d(list, menu, i13);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return AbstractC29669m.m91144a(this.f97392w, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f97392w.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z4) {
        this.f97392w.onWindowFocusChanged(z4);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i13) {
        if (i13 != 0) {
            return AbstractC29669m.m91145b(this.f97392w, callback, i13);
        }
        LayoutInflaterFactory2C24829a0 layoutInflaterFactory2C24829a0 = this.f97391F;
        C29662f c29662f = new C29662f(layoutInflaterFactory2C24829a0.f97209K, callback);
        AbstractC29658b abstractC29658bMo72805q = layoutInflaterFactory2C24829a0.mo72805q(c29662f);
        if (abstractC29658bMo72805q != null) {
            return c29662f.m91130t0(abstractC29658bMo72805q);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f97392w.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
