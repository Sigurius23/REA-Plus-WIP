package p190hc;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: hc.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C17138a {

    /* JADX INFO: renamed from: a */
    public static final ViewGroup.MarginLayoutParams f65811a;

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f65811a = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m48381a(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                if (m48381a(viewGroup.getChildAt(i13))) {
                    return true;
                }
            }
        }
        return false;
    }
}
