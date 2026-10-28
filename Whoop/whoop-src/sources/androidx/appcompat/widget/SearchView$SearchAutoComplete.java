package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import p036bq.RunnableC3543b;
import p474s.AbstractC31959g2;
import p474s.C31976l;

/* JADX INFO: loaded from: classes5.dex */
public class SearchView$SearchAutoComplete extends C31976l {

    /* JADX INFO: renamed from: E */
    public int f4348E;

    /* JADX INFO: renamed from: F */
    public boolean f4349F;

    /* JADX INFO: renamed from: G */
    public final RunnableC3543b f4350G;

    public SearchView$SearchAutoComplete(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f4350G = new RunnableC3543b(this, 22);
        this.f4348E = getThreshold();
    }

    private int getSearchViewTextMinWidthDp() {
        Configuration configuration = getResources().getConfiguration();
        int i13 = configuration.screenWidthDp;
        int i14 = configuration.screenHeightDp;
        if (i13 >= 960 && i14 >= 720 && configuration.orientation == 2) {
            return 256;
        }
        if (i13 < 600) {
            return (i13 < 640 || i14 < 480) ? 160 : 192;
        }
        return 192;
    }

    @Override // android.widget.AutoCompleteTextView
    public final boolean enoughToFilter() {
        return this.f4348E <= 0 || super.enoughToFilter();
    }

    @Override // p474s.C31976l, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (this.f4349F) {
            RunnableC3543b runnableC3543b = this.f4350G;
            removeCallbacks(runnableC3543b);
            post(runnableC3543b);
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z4, int i13, Rect rect) {
        super.onFocusChanged(z4, i13, rect);
        throw null;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i13, KeyEvent keyEvent) {
        if (i13 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    throw null;
                }
            }
        }
        return super.onKeyPreIme(i13, keyEvent);
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z4) {
        super.onWindowFocusChanged(z4);
        if (z4) {
            throw null;
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void performCompletion() {
    }

    @Override // android.widget.AutoCompleteTextView
    public final void replaceText(CharSequence charSequence) {
    }

    public void setImeVisibility(boolean z4) {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        RunnableC3543b runnableC3543b = this.f4350G;
        if (!z4) {
            this.f4349F = false;
            removeCallbacks(runnableC3543b);
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        } else {
            if (!inputMethodManager.isActive(this)) {
                this.f4349F = true;
                return;
            }
            this.f4349F = false;
            removeCallbacks(runnableC3543b);
            inputMethodManager.showSoftInput(this, 0);
        }
    }

    public void setSearchView(AbstractC31959g2 abstractC31959g2) {
    }

    @Override // android.widget.AutoCompleteTextView
    public void setThreshold(int i13) {
        super.setThreshold(i13);
        this.f4348E = i13;
    }
}
