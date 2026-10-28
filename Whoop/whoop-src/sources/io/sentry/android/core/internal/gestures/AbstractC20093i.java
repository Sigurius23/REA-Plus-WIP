package io.sentry.android.core.internal.gestures;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.internal.gestures.C20381c;
import io.sentry.internal.gestures.EnumC20380b;
import io.sentry.internal.gestures.InterfaceC20379a;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: io.sentry.android.core.internal.gestures.i */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC20093i {

    /* JADX INFO: renamed from: a */
    public static final int[] f75480a = new int[2];

    /* JADX INFO: renamed from: a */
    public static C20381c m55971a(SentryAndroidOptions sentryAndroidOptions, View view, float f13, float f14, EnumC20380b enumC20380b) {
        List<InterfaceC20379a> gestureTargetLocators = sentryAndroidOptions.getGestureTargetLocators();
        LinkedList linkedList = new LinkedList();
        linkedList.add(view);
        C20381c c20381c = null;
        while (linkedList.size() > 0) {
            View view2 = (View) linkedList.poll();
            if (view2 != null) {
                int[] iArr = f75480a;
                view2.getLocationOnScreen(iArr);
                int i13 = iArr[0];
                int i14 = iArr[1];
                int width = view2.getWidth();
                int height = view2.getHeight();
                if (f13 >= i13 && f13 <= i13 + width && f14 >= i14 && f14 <= i14 + height) {
                    if (view2 instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) view2;
                        for (int i15 = 0; i15 < viewGroup.getChildCount(); i15++) {
                            linkedList.add(viewGroup.getChildAt(i15));
                        }
                    }
                    for (int i16 = 0; i16 < gestureTargetLocators.size(); i16++) {
                        C20381c c20381cMo55964a = gestureTargetLocators.get(i16).mo55964a(view2, f13, f14, enumC20380b);
                        if (c20381cMo55964a != null) {
                            if (enumC20380b == EnumC20380b.CLICKABLE) {
                                c20381c = c20381cMo55964a;
                            } else if (enumC20380b == EnumC20380b.SCROLLABLE) {
                                return c20381cMo55964a;
                            }
                        }
                    }
                }
            }
        }
        return c20381c;
    }

    /* JADX INFO: renamed from: b */
    public static String m55972b(View view) {
        int id4 = view.getId();
        if (id4 == -1 || (((-16777216) & id4) == 0 && (16777215 & id4) != 0)) {
            throw new Resources.NotFoundException();
        }
        Resources resources = view.getContext().getResources();
        return resources != null ? resources.getResourceEntryName(id4) : "";
    }
}
