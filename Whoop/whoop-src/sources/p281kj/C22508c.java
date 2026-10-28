package p281kj;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import p197hj.C17334q;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: kj.c */
/* JADX INFO: loaded from: classes.dex */
public final class C22508c {

    /* JADX INFO: renamed from: a */
    public C17334q f88215a;

    /* JADX INFO: renamed from: a */
    public static View m65010a(View view, int i13, int i14) {
        View viewM65010a;
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        if (!rect.contains(i13, i14)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            do {
                childCount--;
                if (-1 < childCount) {
                    View child = viewGroup.getChildAt(childCount);
                    AbstractC22676k.m65749i(child, "child");
                    viewM65010a = m65010a(child, i13, i14);
                }
            } while (viewM65010a == null);
            return viewM65010a;
        }
        return view;
    }
}
