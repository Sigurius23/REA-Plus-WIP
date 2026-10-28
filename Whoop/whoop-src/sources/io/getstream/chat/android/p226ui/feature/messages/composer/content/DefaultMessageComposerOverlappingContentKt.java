package io.getstream.chat.android.p226ui.feature.messages.composer.content;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import java.util.Arrays;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\r\u001a\u00020\u0003*\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\n\"\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0018\u0010\u0016\u001a\u00020\u0006*\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m65681d2 = {"Landroid/view/View;", "Landroid/graphics/Rect;", "out", "Ll83/a0;", "getRectInWindow", "(Landroid/view/View;Landroid/graphics/Rect;)V", "", "milliseconds", "", "formatMillis", "(I)Ljava/lang/String;", "Landroid/widget/ImageView;", "colorResId", "setImageColorRes", "(Landroid/widget/ImageView;I)V", "action", "actionToString", "TAG", "Ljava/lang/String;", "Landroid/view/ViewParent;", "getId", "(Landroid/view/ViewParent;)I", "id", "stream-chat-android-ui-components_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DefaultMessageComposerOverlappingContentKt {
    private static final String TAG = "OverlappingContent";

    /* JADX INFO: Access modifiers changed from: private */
    public static final String actionToString(int i13) {
        if (i13 == 0) {
            return "ACTION_DOWN";
        }
        if (i13 == 1) {
            return "ACTION_UP";
        }
        if (i13 != 2) {
            return i13 != 3 ? "ACTION_UNKNOWN" : "ACTION_CANCEL";
        }
        return "ACTION_MOVE";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String formatMillis(int i13) {
        int i14 = i13 / 1000;
        return String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i14 / 60), Integer.valueOf(i14 % 60)}, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final int getId(ViewParent viewParent) {
        View view = viewParent instanceof View ? (View) viewParent : null;
        if (view != null) {
            return view.getId();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getRectInWindow(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i13 = iArr[0];
        rect.left = i13;
        rect.top = iArr[1];
        rect.right = view.getWidth() + i13;
        rect.bottom = view.getHeight() + iArr[1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setImageColorRes(ImageView imageView, int i13) {
        imageView.setImageTintList(ColorStateList.valueOf(AbstractC32122c.getColor(imageView.getContext(), i13)));
    }
}
