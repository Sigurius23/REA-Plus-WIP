package io.getstream.chat.android.p226ui.utils.extensions;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a'\u0010\n\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\f\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Landroid/widget/TextView;", "", "size", "Ll83/a0;", "setTextSizePx", "(Landroid/widget/TextView;F)V", "Landroid/graphics/drawable/Drawable;", "drawable", "", "sizeRes", "setStartDrawableWithSize", "(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;I)V", "setStartDrawable", "(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;)V", "stream-chat-android-ui-components_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class TextViewKt {
    public static final void setStartDrawable(TextView textView, Drawable drawable) {
        AbstractC22676k.m65750j(textView, "<this>");
        Context context = textView.getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        if (ContextKt.isRtlLayout(context)) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public static final void setStartDrawableWithSize(TextView textView, Drawable drawable, int i13) {
        AbstractC22676k.m65750j(textView, "<this>");
        int dimensionPixelSize = textView.getResources().getDimensionPixelSize(i13);
        Context context = textView.getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        boolean zIsRtlLayout = ContextKt.isRtlLayout(context);
        if (drawable != null) {
            drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        }
        if (zIsRtlLayout) {
            textView.setCompoundDrawables(null, null, drawable, null);
        } else {
            textView.setCompoundDrawables(drawable, null, null, null);
        }
    }

    public static final void setTextSizePx(TextView textView, float f13) {
        AbstractC22676k.m65750j(textView, "<this>");
        textView.setTextSize(0, f13);
    }
}
