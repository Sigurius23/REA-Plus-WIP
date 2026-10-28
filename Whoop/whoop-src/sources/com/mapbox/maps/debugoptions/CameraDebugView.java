package com.mapbox.maps.debugoptions;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.UtilsKt;
import java.util.Arrays;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lcom/mapbox/maps/debugoptions/CameraDebugView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/mapbox/maps/CameraState;", "cameraState", "Ll83/a0;", "update", "(Lcom/mapbox/maps/CameraState;)V", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class CameraDebugView extends AppCompatTextView {
    public /* synthetic */ CameraDebugView(Context context, AttributeSet attributeSet, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    public final void update(CameraState cameraState) {
        AbstractC22676k.m65750j(cameraState, "cameraState");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        StyleSpan styleSpan = new StyleSpan(1);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "lat:");
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        SpannableStringBuilder spannableStringBuilderAppend = spannableStringBuilder.append((CharSequence) String.format(" %.4f", Arrays.copyOf(new Object[]{Double.valueOf(cameraState.getCenter().latitude())}, 1))).append((CharSequence) "\n");
        AbstractC22676k.m65749i(spannableStringBuilderAppend, "SpannableStringBuilder()…e()))\n      .append(\"\\n\")");
        StyleSpan styleSpan2 = new StyleSpan(1);
        int length2 = spannableStringBuilderAppend.length();
        spannableStringBuilderAppend.append((CharSequence) "lon:");
        spannableStringBuilderAppend.setSpan(styleSpan2, length2, spannableStringBuilderAppend.length(), 17);
        SpannableStringBuilder spannableStringBuilderAppend2 = spannableStringBuilderAppend.append((CharSequence) String.format(" %.4f", Arrays.copyOf(new Object[]{Double.valueOf(cameraState.getCenter().longitude())}, 1))).append((CharSequence) "\n");
        AbstractC22676k.m65749i(spannableStringBuilderAppend2, "SpannableStringBuilder()…e()))\n      .append(\"\\n\")");
        StyleSpan styleSpan3 = new StyleSpan(1);
        int length3 = spannableStringBuilderAppend2.length();
        spannableStringBuilderAppend2.append((CharSequence) "zoom:");
        spannableStringBuilderAppend2.setSpan(styleSpan3, length3, spannableStringBuilderAppend2.length(), 17);
        SpannableStringBuilder spannableStringBuilderAppend3 = spannableStringBuilderAppend2.append((CharSequence) String.format(" %.2f", Arrays.copyOf(new Object[]{Double.valueOf(cameraState.getZoom())}, 1)));
        if (cameraState.getBearing() != 0.0d) {
            spannableStringBuilderAppend3.append((CharSequence) "\n");
            StyleSpan styleSpan4 = new StyleSpan(1);
            int length4 = spannableStringBuilderAppend3.length();
            spannableStringBuilderAppend3.append((CharSequence) "bearing:");
            spannableStringBuilderAppend3.setSpan(styleSpan4, length4, spannableStringBuilderAppend3.length(), 17);
            spannableStringBuilderAppend3.append((CharSequence) String.format(" %.2f", Arrays.copyOf(new Object[]{Double.valueOf(cameraState.getBearing())}, 1)));
        }
        if (cameraState.getPitch() != 0.0d) {
            spannableStringBuilderAppend3.append((CharSequence) "\n");
            StyleSpan styleSpan5 = new StyleSpan(1);
            int length5 = spannableStringBuilderAppend3.length();
            spannableStringBuilderAppend3.append((CharSequence) "pitch:");
            spannableStringBuilderAppend3.setSpan(styleSpan5, length5, spannableStringBuilderAppend3.length(), 17);
            spannableStringBuilderAppend3.append((CharSequence) String.format(" %.2f", Arrays.copyOf(new Object[]{Double.valueOf(cameraState.getPitch())}, 1)));
        }
        setText(spannableStringBuilderAppend3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraDebugView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        setTypeface(Typeface.MONOSPACE);
        int iFloatValue = (int) UtilsKt.toDP(Float.valueOf(4.0f), context).floatValue();
        setTextSize(13.0f);
        setPadding(iFloatValue, iFloatValue, iFloatValue, iFloatValue);
        setTextColor(-16777216);
        int iFloatValue2 = (int) UtilsKt.toDP(Float.valueOf(8.0f), context).floatValue();
        int iFloatValue3 = (int) UtilsKt.toDP(Float.valueOf(48.0f), context).floatValue();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(iFloatValue2, iFloatValue3, 0, 0);
        setLayoutParams(layoutParams);
        float fFloatValue = UtilsKt.toDP(Float.valueOf(5.0f), context).floatValue();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(fFloatValue);
        gradientDrawable.setColor(-1);
        setBackground(gradientDrawable);
    }
}
