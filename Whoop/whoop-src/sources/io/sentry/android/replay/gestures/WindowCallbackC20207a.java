package io.sentry.android.replay.gestures;

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
import io.sentry.C20513q6;
import io.sentry.EnumC20436n5;
import io.sentry.android.replay.C20217p;
import io.sentry.android.replay.EnumC20218q;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.capture.InterfaceC20196l;
import java.util.List;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: io.sentry.android.replay.gestures.a */
/* JADX INFO: loaded from: classes3.dex */
public final class WindowCallbackC20207a implements Window.Callback {

    /* JADX INFO: renamed from: w */
    public final Window.Callback f75907w;

    /* JADX INFO: renamed from: x */
    public final C20513q6 f75908x;

    /* JADX INFO: renamed from: y */
    public volatile ReplayIntegration f75909y;

    public WindowCallbackC20207a(C20513q6 c20513q6, ReplayIntegration replayIntegration, Window.Callback callback) {
        this.f75907w = callback;
        this.f75908x = c20513q6;
        this.f75909y = replayIntegration;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m56131a(MotionEvent motionEvent) {
        Window.Callback callback = this.f75907w;
        if (callback == null) {
            return false;
        }
        return callback.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        Window.Callback callback = this.f75907w;
        if (callback == null) {
            return false;
        }
        return callback.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Window.Callback callback = this.f75907w;
        if (callback == null) {
            return false;
        }
        return callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        Window.Callback callback = this.f75907w;
        if (callback == null) {
            return false;
        }
        return callback.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        Window.Callback callback = this.f75907w;
        if (callback == null) {
            return false;
        }
        return callback.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        InterfaceC20196l interfaceC20196l;
        if (motionEvent != null) {
            MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
            AbstractC22676k.m65749i(motionEventObtainNoHistory, "obtainNoHistory(...)");
            try {
                ReplayIntegration replayIntegration = this.f75909y;
                if (replayIntegration != null && replayIntegration.f75794K.get()) {
                    C20217p c20217p = replayIntegration.f75800Q;
                    if ((c20217p.f75940a == EnumC20218q.STARTED || c20217p.f75940a == EnumC20218q.RESUMED) && (interfaceC20196l = replayIntegration.f75796M) != null) {
                        interfaceC20196l.onTouchEvent(motionEventObtainNoHistory);
                    }
                }
            } catch (Throwable th3) {
                try {
                    this.f75908x.getLogger().mo16060j(EnumC20436n5.ERROR, "Error dispatching touch event", th3);
                } finally {
                    motionEventObtainNoHistory.recycle();
                }
            }
        }
        return m56131a(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        Window.Callback callback = this.f75907w;
        if (callback == null) {
            return false;
        }
        return callback.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        Window.Callback callback = this.f75907w;
        if (callback == null) {
            return;
        }
        callback.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        Window.Callback callback = this.f75907w;
        if (callback == null) {
            return;
        }
        callback.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        Window.Callback callback = this.f75907w;
        if (callback == null) {
            return;
        }
        callback.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        Window.Callback callback = this.f75907w;
        if (callback == null) {
            return;
        }
        callback.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i13, Menu menu) {
        Window.Callback callback = this.f75907w;
        if (callback == null) {
            return false;
        }
        return callback.onCreatePanelMenu(i13, menu);
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i13) {
        Window.Callback callback = this.f75907w;
        if (callback == null) {
            return null;
        }
        return callback.onCreatePanelView(i13);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        Window.Callback callback = this.f75907w;
        if (callback == null) {
            return;
        }
        callback.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i13, MenuItem menuItem) {
        Window.Callback callback = this.f75907w;
        if (callback == null) {
            return false;
        }
        return callback.onMenuItemSelected(i13, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i13, Menu menu) {
        Window.Callback callback = this.f75907w;
        if (callback == null) {
            return false;
        }
        return callback.onMenuOpened(i13, menu);
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i13, Menu menu) {
        Window.Callback callback = this.f75907w;
        if (callback == null) {
            return;
        }
        callback.onPanelClosed(i13, menu);
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z4) {
        Window.Callback callback = this.f75907w;
        if (callback == null) {
            return;
        }
        callback.onPointerCaptureChanged(z4);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i13, View view, Menu menu) {
        Window.Callback callback = this.f75907w;
        if (callback == null) {
            return false;
        }
        return callback.onPreparePanel(i13, view, menu);
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i13) {
        Window.Callback callback = this.f75907w;
        if (callback == null) {
            return;
        }
        callback.onProvideKeyboardShortcuts(list, menu, i13);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        Window.Callback callback = this.f75907w;
        if (callback == null) {
            return false;
        }
        return callback.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        Window.Callback callback = this.f75907w;
        if (callback == null) {
            return;
        }
        callback.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z4) {
        Window.Callback callback = this.f75907w;
        if (callback == null) {
            return;
        }
        callback.onWindowFocusChanged(z4);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        Window.Callback callback2 = this.f75907w;
        if (callback2 == null) {
            return null;
        }
        return callback2.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        Window.Callback callback = this.f75907w;
        if (callback == null) {
            return false;
        }
        return callback.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i13) {
        Window.Callback callback2 = this.f75907w;
        if (callback2 == null) {
            return null;
        }
        return callback2.onWindowStartingActionMode(callback, i13);
    }
}
