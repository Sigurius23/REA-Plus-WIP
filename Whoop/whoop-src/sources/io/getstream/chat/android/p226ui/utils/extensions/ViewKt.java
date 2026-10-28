package io.getstream.chat.android.p226ui.utils.extensions;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.Toast;
import androidx.fragment.app.AbstractActivityC1340r0;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.p226ui.helper.ViewPadding;
import java.util.WeakHashMap;
import p031b9.C2865t;
import p184h5.AbstractC16871f0;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;
import p184h5.C16905q1;
import p543v4.C35643b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\b\b\u0001\u0010\u0006\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001d\u0010\n\u001a\u00020\u0003*\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\n\u0010\b\u001a\u001b\u0010\r\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0010\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0010\u0010\b\" \u0010\u0016\u001a\u0004\u0018\u00010\u0011*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m65681d2 = {"Landroid/view/View;", "", "color", "Ll83/a0;", "setBorderlessRipple", "(Landroid/view/View;Ljava/lang/Integer;)V", "resId", "showToast", "(Landroid/view/View;I)V", "start", "setPaddingStart", "Lio/getstream/chat/android/ui/helper/ViewPadding;", "padding", "setPaddingCompat", "(Landroid/view/View;Lio/getstream/chat/android/ui/helper/ViewPadding;)V", "typeMask", "applyEdgeToEdgePadding", "Landroidx/fragment/app/r0;", "getActivity", "(Landroid/view/View;)Landroidx/fragment/app/r0;", "getActivity$annotations", "(Landroid/view/View;)V", "activity", "stream-chat-android-ui-components_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ViewKt {
    public static final void applyEdgeToEdgePadding(View view, int i13) {
        AbstractC22676k.m65750j(view, "<this>");
        C2865t c2865t = new C2865t(i13, 3);
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        AbstractC16877h0.m47517l(view, c2865t);
        AbstractC16871f0.m47500c(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C16905q1 applyEdgeToEdgePadding$lambda$0(int i13, View view, C16905q1 windowInsets) {
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(windowInsets, "windowInsets");
        C35643b c35643bMo47530g = windowInsets.f64864a.mo47530g(i13);
        AbstractC22676k.m65749i(c35643bMo47530g, "getInsets(...)");
        view.setPadding(c35643bMo47530g.f151449a, c35643bMo47530g.f151450b, c35643bMo47530g.f151451c, c35643bMo47530g.f151452d);
        return C16905q1.f64863b;
    }

    public static final AbstractActivityC1340r0 getActivity(View view) {
        AbstractC22676k.m65750j(view, "<this>");
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof AbstractActivityC1340r0) {
                return (AbstractActivityC1340r0) context;
            }
        }
        return null;
    }

    @InternalStreamChatApi
    public static /* synthetic */ void getActivity$annotations(View view) {
    }

    public static final void setBorderlessRipple(View view, Integer num) {
        AbstractC22676k.m65750j(view, "<this>");
        RippleDrawable rippleDrawable = null;
        if (num != null) {
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(num.intValue());
            AbstractC22676k.m65749i(colorStateListValueOf, "valueOf(...)");
            rippleDrawable = new RippleDrawable(colorStateListValueOf, null, view.getBackground());
        }
        view.setBackground(rippleDrawable);
    }

    public static final void setPaddingCompat(View view, ViewPadding padding) {
        AbstractC22676k.m65750j(view, "<this>");
        AbstractC22676k.m65750j(padding, "padding");
        int start = padding.getStart();
        int top = padding.getTop();
        int end = padding.getEnd();
        int bottom = padding.getBottom();
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        view.setPaddingRelative(start, top, end, bottom);
    }

    public static final void setPaddingStart(View view, int i13) {
        AbstractC22676k.m65750j(view, "<this>");
        Context context = view.getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        if (ContextKt.isRtlLayout(context)) {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), i13, view.getPaddingBottom());
        } else {
            view.setPadding(i13, view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    @InternalStreamChatApi
    public static final void showToast(View view, int i13) {
        AbstractC22676k.m65750j(view, "<this>");
        Toast.makeText(view.getContext(), view.getContext().getString(i13), 0).show();
    }
}
