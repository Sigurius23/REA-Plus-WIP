package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import p184h5.AbstractC16901p0;

/* JADX INFO: loaded from: classes6.dex */
final class MaterialCalendarGridView extends GridView {

    /* JADX INFO: renamed from: w */
    public final boolean f20888w;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AbstractC5031y.m15762c(null);
        if (C5021o.m15751B(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(com.whoop.android.R.id.cancel_button);
            setNextFocusRightId(com.whoop.android.R.id.confirm_button);
        }
        this.f20888w = C5021o.m15751B(getContext(), com.whoop.android.R.attr.nestedScrollable);
        AbstractC16901p0.m47583n(this, new C5013g(2));
    }

    /* JADX INFO: renamed from: a */
    public final C5024r m15735a() {
        return (C5024r) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final Adapter getAdapter() {
        return (C5024r) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((C5024r) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C5024r c5024r = (C5024r) super.getAdapter();
        c5024r.getClass();
        int iMax = Math.max(c5024r.m15757a(), getFirstVisiblePosition());
        int iMin = Math.min(c5024r.m15759c(), getLastVisiblePosition());
        c5024r.getItem(iMax);
        c5024r.getItem(iMin);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z4, int i13, Rect rect) {
        if (!z4) {
            super.onFocusChanged(false, i13, rect);
            return;
        }
        if (i13 == 33) {
            setSelection(((C5024r) super.getAdapter()).m15759c());
        } else if (i13 == 130) {
            setSelection(((C5024r) super.getAdapter()).m15757a());
        } else {
            super.onFocusChanged(true, i13, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i13, KeyEvent keyEvent) {
        if (!super.onKeyDown(i13, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((C5024r) super.getAdapter()).m15757a()) {
            return true;
        }
        if (19 != i13) {
            return false;
        }
        setSelection(((C5024r) super.getAdapter()).m15757a());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i13, int i14) {
        if (!this.f20888w) {
            super.onMeasure(i13, i14);
            return;
        }
        super.onMeasure(i13, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i13) {
        if (i13 < ((C5024r) super.getAdapter()).m15757a()) {
            super.setSelection(((C5024r) super.getAdapter()).m15757a());
        } else {
            super.setSelection(i13);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (C5024r) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof C5024r)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), C5024r.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
