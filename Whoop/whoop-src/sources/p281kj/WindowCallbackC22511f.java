package p281kj;

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
import com.amplitude.android.engagement.C4861a;
import p031b9.AbstractC2875y;
import p197hj.C17334q;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: kj.f */
/* JADX INFO: loaded from: classes.dex */
public final class WindowCallbackC22511f implements Window.Callback {

    /* JADX INFO: renamed from: w */
    public final Window.Callback f88229w;

    /* JADX INFO: renamed from: x */
    public final C17334q f88230x;

    public WindowCallbackC22511f(Window.Callback callback, C17334q c17334q) {
        this.f88229w = callback;
        this.f88230x = c17334q;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f88229w.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f88229w.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f88229w.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f88229w.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            try {
                if (motionEvent.getAction() == 1) {
                    float x3 = motionEvent.getX();
                    float y13 = motionEvent.getY();
                    if (Float.isInfinite(x3) || Float.isNaN(x3) || Float.isInfinite(y13) || Float.isNaN(y13)) {
                        C4861a.f20259o.m16067m0("Smart Interactions: Invalid tap location detected");
                    } else {
                        this.f88230x.invoke(new C22512g(x3, System.currentTimeMillis(), y13));
                    }
                }
            } catch (Exception e5) {
                C4861a.f20259o.m16067m0(AbstractC2875y.m8298k(e5, new StringBuilder("Smart Interactions: Error handling touch event: ")));
            }
        }
        return this.f88229w.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f88229w.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f88229w.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f88229w.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f88229w.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        this.f88229w.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i13, Menu menu) {
        AbstractC22676k.m65750j(menu, "menu");
        return this.f88229w.onCreatePanelMenu(i13, menu);
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i13) {
        return this.f88229w.onCreatePanelView(i13);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f88229w.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i13, MenuItem item) {
        AbstractC22676k.m65750j(item, "item");
        return this.f88229w.onMenuItemSelected(i13, item);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i13, Menu menu) {
        AbstractC22676k.m65750j(menu, "menu");
        return this.f88229w.onMenuOpened(i13, menu);
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i13, Menu menu) {
        AbstractC22676k.m65750j(menu, "menu");
        this.f88229w.onPanelClosed(i13, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i13, View view, Menu menu) {
        AbstractC22676k.m65750j(menu, "menu");
        return this.f88229w.onPreparePanel(i13, view, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f88229w.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f88229w.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z4) {
        this.f88229w.onWindowFocusChanged(z4);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f88229w.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f88229w.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i13) {
        return this.f88229w.onWindowStartingActionMode(callback, i13);
    }
}
