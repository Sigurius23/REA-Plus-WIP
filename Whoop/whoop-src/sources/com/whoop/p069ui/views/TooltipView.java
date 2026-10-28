package com.whoop.p069ui.views;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import kn2.ViewOnTouchListenerC22603e;
import vu1.AbstractC36514e;
import vu1.AbstractC36516g;
import vu1.AbstractC36519j;

/* JADX INFO: loaded from: classes10.dex */
public class TooltipView extends FrameLayout {

    /* JADX INFO: renamed from: w */
    private ColoredImageView f32364w;

    /* JADX INFO: renamed from: x */
    private View f32365x;

    /* JADX INFO: renamed from: y */
    private TextView f32366y;

    public TooltipView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC36519j.f156223u0);
        m27470c(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: c */
    private void m27470c(TypedArray typedArray) {
        LayoutInflater.from(getContext()).inflate(AbstractC36516g.f156113c, this);
        m27471d();
        if (typedArray != null) {
            if (typedArray.hasValue(AbstractC36519j.f156227w0)) {
                this.f32365x.setBackgroundResource(typedArray.getResourceId(AbstractC36519j.f156227w0, 0));
            }
            if (typedArray.hasValue(AbstractC36519j.f156225v0)) {
                this.f32364w.setColor(typedArray.getColor(AbstractC36519j.f156225v0, 0));
            }
            if (typedArray.hasValue(AbstractC36519j.f156229x0)) {
                setText(typedArray.getText(AbstractC36519j.f156229x0));
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private void m27471d() {
        this.f32364w = (ColoredImageView) findViewById(AbstractC36514e.f156100r);
        this.f32365x = findViewById(AbstractC36514e.f156101s);
        this.f32366y = (TextView) findViewById(AbstractC36514e.f156102t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m27472e(View view, PopupWindow popupWindow, View view2, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i24) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int width = (view.getWidth() / 2) + iArr[0];
        popupWindow.getContentView().getLocationOnScreen(iArr);
        getArrowView().setTranslationX(width - ((getWidth() / 2) + iArr[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ boolean m27473f(PopupWindow popupWindow, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return false;
        }
        view.performClick();
        popupWindow.dismiss();
        return true;
    }

    /* JADX INFO: renamed from: g */
    public void m27474g(final View view, int i13, long j7) {
        setAlpha(0.0f);
        final PopupWindow popupWindow = new PopupWindow((View) this, i13, -2, true);
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: kn2.d
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25) {
                this.f88931w.m27472e(view, popupWindow, view2, i14, i15, i16, i17, i18, i19, i24, i25);
            }
        });
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        iArr[0] = iArr[0] - ((i13 / 2) - (view.getWidth() / 2));
        int height = view.getHeight() + iArr[1];
        iArr[1] = height;
        popupWindow.showAtLocation(view, 0, iArr[0], height);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setFocusable(true);
        popupWindow.setTouchInterceptor(new ViewOnTouchListenerC22603e(popupWindow, 0));
        ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f).setDuration(j7).start();
    }

    public ColoredImageView getArrowView() {
        return this.f32364w;
    }

    public View getFrame() {
        return this.f32365x;
    }

    public void setText(CharSequence charSequence) {
        this.f32366y.setText(charSequence);
    }

    public void setTextColor(Integer num) {
        this.f32366y.setTextColor(num.intValue());
    }
}
