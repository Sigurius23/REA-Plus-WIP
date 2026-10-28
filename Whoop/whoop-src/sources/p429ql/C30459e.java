package p429ql;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import java.util.ArrayList;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: ql.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C30459e {

    /* JADX INFO: renamed from: d */
    public static Integer f125164d;

    /* JADX INFO: renamed from: a */
    public final View f125165a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f125166b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public ViewTreeObserverOnPreDrawListenerC30458d f125167c;

    public C30459e(View view) {
        this.f125165a = view;
    }

    /* JADX INFO: renamed from: a */
    public final int m93221a(int i13, int i14, int i15) {
        int i16 = i14 - i15;
        if (i16 > 0) {
            return i16;
        }
        int i17 = i13 - i15;
        if (i17 > 0) {
            return i17;
        }
        View view = this.f125165a;
        if (view.isLayoutRequested() || i14 != -2) {
            return 0;
        }
        if (Log.isLoggable("CustomViewTarget", 4)) {
            Log.i("CustomViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
        }
        Context context = view.getContext();
        if (f125164d == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            AbstractC29125c.m88539p(windowManager, "Argument must not be null");
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            f125164d = Integer.valueOf(Math.max(point.x, point.y));
        }
        return f125164d.intValue();
    }
}
