package p395p6;

import android.os.Build;
import android.widget.RemoteViews;
import p008a7.AbstractC0514e;
import p008a7.C0510a;
import p008a7.C0511b;
import p008a7.C0512c;
import p008a7.C0513d;
import p715kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: p6.o */
/* JADX INFO: loaded from: classes5.dex */
public final class C28903o {
    /* JADX INFO: renamed from: a */
    public static void m87823a(RemoteViews remoteViews, int i13, AbstractC0514e abstractC0514e) {
        if (Build.VERSION.SDK_INT < 31) {
            throw new IllegalArgumentException("setClipToOutline is only available on SDK 31 and higher".toString());
        }
        remoteViews.setBoolean(i13, "setClipToOutline", true);
        if (abstractC0514e instanceof C0510a) {
            remoteViews.setViewOutlinePreferredRadius(i13, ((C0510a) abstractC0514e).f1719a, 1);
        } else {
            throw new IllegalStateException(("Rounded corners should not be " + abstractC0514e.getClass().getCanonicalName()).toString());
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m87824b(RemoteViews remoteViews, int i13, AbstractC0514e abstractC0514e) {
        if (abstractC0514e instanceof C0513d) {
            remoteViews.setViewLayoutHeight(i13, -2.0f, 0);
            return;
        }
        if (abstractC0514e instanceof C0511b) {
            remoteViews.setViewLayoutHeight(i13, 0.0f, 0);
        } else if (abstractC0514e instanceof C0510a) {
            remoteViews.setViewLayoutHeight(i13, ((C0510a) abstractC0514e).f1719a, 1);
        } else {
            if (!abstractC0514e.equals(C0512c.f1721a)) {
                throw new NoWhenBranchMatchedException();
            }
            remoteViews.setViewLayoutHeight(i13, -1.0f, 0);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m87825c(RemoteViews remoteViews, int i13, AbstractC0514e abstractC0514e) {
        if (abstractC0514e instanceof C0513d) {
            remoteViews.setViewLayoutWidth(i13, -2.0f, 0);
            return;
        }
        if (abstractC0514e instanceof C0511b) {
            remoteViews.setViewLayoutWidth(i13, 0.0f, 0);
        } else if (abstractC0514e instanceof C0510a) {
            remoteViews.setViewLayoutWidth(i13, ((C0510a) abstractC0514e).f1719a, 1);
        } else {
            if (!abstractC0514e.equals(C0512c.f1721a)) {
                throw new NoWhenBranchMatchedException();
            }
            remoteViews.setViewLayoutWidth(i13, -1.0f, 0);
        }
    }
}
