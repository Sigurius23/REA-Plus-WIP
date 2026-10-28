package io.getstream.chat.android.p226ui.utils.extensions;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import androidx.fragment.app.AbstractC1329o1;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.p226ui.C19469R;
import p314m.AbstractActivityC24852m;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0001\u0010\u0005\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001d\u0010\n\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\n\u0010\u0004\u001a\u001f\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\u00002\b\b\u0001\u0010\u0005\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u0011*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001b\u0010\u0017\u001a\u00020\u0016*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0013\u0010\u0019\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\"\u0018\u0010\u001c\u001a\u00020\u001b*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\"\u0018\u0010!\u001a\u00020\u001e*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, m65681d2 = {"Landroid/content/Context;", "", "dimen", "getDimension", "(Landroid/content/Context;I)I", "id", "", "getIntArray", "(Landroid/content/Context;I)[I", "color", "getColorCompat", "Landroid/content/res/ColorStateList;", "getColorStateListCompat", "(Landroid/content/Context;I)Landroid/content/res/ColorStateList;", "Landroid/graphics/drawable/Drawable;", "getDrawableCompat", "(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;", "Landroidx/fragment/app/o1;", "getFragmentManager", "(Landroid/content/Context;)Landroidx/fragment/app/o1;", "", "text", "Ll83/a0;", "copyToClipboard", "(Landroid/content/Context;Ljava/lang/String;)V", "createStreamThemeWrapper", "(Landroid/content/Context;)Landroid/content/Context;", "", "isRtlLayout", "(Landroid/content/Context;)Z", "Landroid/view/LayoutInflater;", "getStreamThemeInflater", "(Landroid/content/Context;)Landroid/view/LayoutInflater;", "streamThemeInflater", "stream-chat-android-ui-components_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ContextKt {
    public static final void copyToClipboard(Context context, String text) {
        AbstractC22676k.m65750j(context, "<this>");
        AbstractC22676k.m65750j(text, "text");
        Object systemService = context.getSystemService("clipboard");
        AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(null, text));
    }

    public static final Context createStreamThemeWrapper(Context context) {
        AbstractC22676k.m65750j(context, "<this>");
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(C19469R.attr.streamUiValidTheme, typedValue, true)) {
            return context;
        }
        return context.getTheme().resolveAttribute(C19469R.attr.streamUiTheme, typedValue, true) ? new ContextThemeWrapper(context, typedValue.resourceId) : new ContextThemeWrapper(context, C19469R.style.StreamUiTheme);
    }

    @InternalStreamChatApi
    public static final int getColorCompat(Context context, int i13) {
        AbstractC22676k.m65750j(context, "<this>");
        return AbstractC32122c.getColor(context, i13);
    }

    @InternalStreamChatApi
    public static final ColorStateList getColorStateListCompat(Context context, int i13) {
        AbstractC22676k.m65750j(context, "<this>");
        return AbstractC32122c.getColorStateList(context, i13);
    }

    @InternalStreamChatApi
    public static final int getDimension(Context context, int i13) {
        AbstractC22676k.m65750j(context, "<this>");
        return context.getResources().getDimensionPixelSize(i13);
    }

    @InternalStreamChatApi
    public static final Drawable getDrawableCompat(Context context, int i13) {
        AbstractC22676k.m65750j(context, "<this>");
        return AbstractC32122c.getDrawable(context, i13);
    }

    public static final AbstractC1329o1 getFragmentManager(Context context) {
        if (context instanceof AbstractActivityC24852m) {
            return ((AbstractActivityC24852m) context).getSupportFragmentManager();
        }
        if (context instanceof ContextWrapper) {
            return getFragmentManager(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static final int[] getIntArray(Context context, int i13) {
        AbstractC22676k.m65750j(context, "<this>");
        int[] intArray = context.getResources().getIntArray(i13);
        AbstractC22676k.m65749i(intArray, "getIntArray(...)");
        return intArray;
    }

    public static final LayoutInflater getStreamThemeInflater(Context context) {
        AbstractC22676k.m65750j(context, "<this>");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(createStreamThemeWrapper(context));
        AbstractC22676k.m65749i(layoutInflaterFrom, "from(...)");
        return layoutInflaterFrom;
    }

    public static final boolean isRtlLayout(Context context) {
        AbstractC22676k.m65750j(context, "<this>");
        return context.getResources().getConfiguration().getLayoutDirection() == 1;
    }
}
