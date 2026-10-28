package p683zj;

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
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: zj.d */
/* JADX INFO: loaded from: classes6.dex */
public final class WindowCallbackC40705d implements Window.Callback {
    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i13, Menu menu) {
        AbstractC22676k.m65750j(menu, "menu");
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i13) {
        return null;
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i13, MenuItem item) {
        AbstractC22676k.m65750j(item, "item");
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i13, Menu menu) {
        AbstractC22676k.m65750j(menu, "menu");
        return false;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i13, Menu menu) {
        AbstractC22676k.m65750j(menu, "menu");
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i13, View view, Menu menu) {
        AbstractC22676k.m65750j(menu, "menu");
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return false;
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z4) {
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i13) {
        return null;
    }
}
