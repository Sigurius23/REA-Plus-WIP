package com.mapbox.maps.debugoptions;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.UtilsKt;
import java.util.Arrays;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013¨\u0006\u0017"}, m65681d2 = {"Lcom/mapbox/maps/debugoptions/PaddingDebugView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/mapbox/maps/EdgeInsets;", "padding", "Ll83/a0;", "update", "(Lcom/mapbox/maps/EdgeInsets;)V", "paddingFrame", "Landroid/widget/FrameLayout;", "Landroid/widget/TextView;", "top", "Landroid/widget/TextView;", "left", "right", "bottom", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class PaddingDebugView extends FrameLayout {
    private final TextView bottom;
    private final TextView left;
    private final FrameLayout paddingFrame;
    private final TextView right;
    private final TextView top;

    public /* synthetic */ PaddingDebugView(Context context, AttributeSet attributeSet, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    @SuppressLint({"SetTextI18n"})
    public final void update(EdgeInsets padding) {
        AbstractC22676k.m65750j(padding, "padding");
        FrameLayout frameLayout = this.paddingFrame;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        AbstractC22676k.m65748h(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        Double dValueOf = Double.valueOf(padding.getLeft());
        Context context = getContext();
        AbstractC22676k.m65749i(context, "context");
        int iDoubleValue = (int) UtilsKt.toDP(dValueOf, context).doubleValue();
        Double dValueOf2 = Double.valueOf(padding.getTop());
        Context context2 = getContext();
        AbstractC22676k.m65749i(context2, "context");
        int iDoubleValue2 = (int) UtilsKt.toDP(dValueOf2, context2).doubleValue();
        Double dValueOf3 = Double.valueOf(padding.getRight());
        Context context3 = getContext();
        AbstractC22676k.m65749i(context3, "context");
        int iDoubleValue3 = (int) UtilsKt.toDP(dValueOf3, context3).doubleValue();
        Double dValueOf4 = Double.valueOf(padding.getBottom());
        Context context4 = getContext();
        AbstractC22676k.m65749i(context4, "context");
        layoutParams2.setMargins(iDoubleValue, iDoubleValue2, iDoubleValue3, (int) UtilsKt.toDP(dValueOf4, context4).doubleValue());
        frameLayout.setLayoutParams(layoutParams2);
        this.top.setText(String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(padding.getTop())}, 1)));
        this.left.setText(String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(padding.getLeft())}, 1)));
        this.right.setText(String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(padding.getRight())}, 1)));
        this.bottom.setText(String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(padding.getBottom())}, 1)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaddingDebugView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        FrameLayout frameLayout = new FrameLayout(context);
        this.paddingFrame = frameLayout;
        TextView textView = new TextView(context);
        this.top = textView;
        TextView textView2 = new TextView(context);
        this.left = textView2;
        TextView textView3 = new TextView(context);
        this.right = textView3;
        TextView textView4 = new TextView(context);
        this.bottom = textView4;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(0);
        Float fValueOf = Float.valueOf(1.0f);
        gradientDrawable.setStroke((int) UtilsKt.toDP(fValueOf, context).floatValue(), PaddingDebugViewKt.GREEN_DARK);
        frameLayout.setBackground(gradientDrawable);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        View crossView = new CrossView(context, null, 0, 6, null);
        Float fValueOf2 = Float.valueOf(15.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) UtilsKt.toDP(fValueOf2, context).floatValue(), (int) UtilsKt.toDP(fValueOf2, context).floatValue());
        layoutParams.gravity = 17;
        crossView.setLayoutParams(layoutParams);
        for (TextView textView5 : AbstractC37056f.m118959K(textView, textView2, textView3, textView4)) {
            textView5.setTypeface(Typeface.MONOSPACE);
            textView5.setTextSize(10.0f);
            textView5.setTextColor(-1);
            textView5.setBackgroundColor(PaddingDebugViewKt.GREEN_DARK);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            if (textView5.equals(this.top)) {
                layoutParams2.gravity = 1;
            } else if (textView5.equals(this.left)) {
                layoutParams2.gravity = 16;
            } else if (textView5.equals(this.right)) {
                layoutParams2.gravity = 21;
            } else if (textView5.equals(this.bottom)) {
                layoutParams2.gravity = 81;
            }
            layoutParams2.leftMargin = (int) UtilsKt.toDP(fValueOf, context).floatValue();
            layoutParams2.rightMargin = (int) UtilsKt.toDP(fValueOf, context).floatValue();
            textView5.setLayoutParams(layoutParams2);
            textView5.setPadding((int) UtilsKt.toDP(fValueOf, context).floatValue(), 0, (int) UtilsKt.toDP(fValueOf, context).floatValue(), 0);
            this.paddingFrame.addView(textView5);
        }
        this.paddingFrame.addView(crossView);
        addView(this.paddingFrame);
    }
}
