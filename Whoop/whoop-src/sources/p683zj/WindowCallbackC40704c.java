package p683zj;

import android.app.Activity;
import android.view.ActionMode;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import fk.InterfaceC14544a;
import java.util.List;
import p120ek.C13270d;
import p715kotlin.jvm.internal.AbstractC22676k;
import z40.C40062i;

/* JADX INFO: renamed from: zj.c */
/* JADX INFO: loaded from: classes6.dex */
public final class WindowCallbackC40704c implements Window.Callback {

    /* JADX INFO: renamed from: w */
    public final Window.Callback f175612w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC14544a f175613x;

    /* JADX INFO: renamed from: y */
    public final C40062i f175614y;

    /* JADX INFO: renamed from: z */
    public final GestureDetector f175615z;

    public WindowCallbackC40704c(Window.Callback callback, Activity activity, C13270d c13270d, List viewTargetLocators, InterfaceC14544a logger) {
        C40062i c40062i = new C40062i();
        GestureDetector gestureDetector = new GestureDetector(activity, new GestureDetectorOnGestureListenerC40703b(activity, c13270d, logger, viewTargetLocators));
        AbstractC22676k.m65750j(viewTargetLocators, "viewTargetLocators");
        AbstractC22676k.m65750j(logger, "logger");
        this.f175612w = callback;
        this.f175613x = logger;
        this.f175614y = c40062i;
        this.f175615z = gestureDetector;
    }

    /* JADX INFO: renamed from: a */
    public final Window.Callback m132177a() {
        return this.f175612w;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f175612w.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f175612w.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f175612w.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f175612w.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            this.f175614y.getClass();
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            AbstractC22676k.m65749i(motionEventObtain, "obtain(origin)");
            try {
                try {
                    this.f175615z.onTouchEvent(motionEventObtain);
                } catch (Exception e5) {
                    this.f175613x.error("Error handling touch event: " + e5);
                }
            } finally {
                motionEventObtain.recycle();
            }
        }
        return this.f175612w.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f175612w.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f175612w.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f175612w.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f175612w.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        this.f175612w.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i13, Menu menu) {
        AbstractC22676k.m65750j(menu, "menu");
        return this.f175612w.onCreatePanelMenu(i13, menu);
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i13) {
        return this.f175612w.onCreatePanelView(i13);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f175612w.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i13, MenuItem item) {
        AbstractC22676k.m65750j(item, "item");
        return this.f175612w.onMenuItemSelected(i13, item);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i13, Menu menu) {
        AbstractC22676k.m65750j(menu, "menu");
        return this.f175612w.onMenuOpened(i13, menu);
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i13, Menu menu) {
        AbstractC22676k.m65750j(menu, "menu");
        this.f175612w.onPanelClosed(i13, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i13, View view, Menu menu) {
        AbstractC22676k.m65750j(menu, "menu");
        return this.f175612w.onPreparePanel(i13, view, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f175612w.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f175612w.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z4) {
        this.f175612w.onWindowFocusChanged(z4);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f175612w.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f175612w.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i13) {
        return this.f175612w.onWindowStartingActionMode(callback, i13);
    }
}
