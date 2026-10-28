package io.sentry.android.core.internal.gestures;

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

/* JADX INFO: renamed from: io.sentry.android.core.internal.gestures.j */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractWindowCallbackC20094j implements Window.Callback {

    /* JADX INFO: renamed from: w */
    public final Window.Callback f75481w;

    public AbstractWindowCallbackC20094j(Window.Callback callback) {
        this.f75481w = callback;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f75481w.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f75481w.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f75481w.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f75481w.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f75481w.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f75481w.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f75481w.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f75481w.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f75481w.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public void onContentChanged() {
        this.f75481w.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i13, Menu menu) {
        return this.f75481w.onCreatePanelMenu(i13, menu);
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i13) {
        return this.f75481w.onCreatePanelView(i13);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f75481w.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i13, MenuItem menuItem) {
        return this.f75481w.onMenuItemSelected(i13, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i13, Menu menu) {
        return this.f75481w.onMenuOpened(i13, menu);
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i13, Menu menu) {
        this.f75481w.onPanelClosed(i13, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i13, View view, Menu menu) {
        return this.f75481w.onPreparePanel(i13, view, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f75481w.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f75481w.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z4) {
        this.f75481w.onWindowFocusChanged(z4);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f75481w.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f75481w.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i13) {
        return this.f75481w.onWindowStartingActionMode(callback, i13);
    }
}
