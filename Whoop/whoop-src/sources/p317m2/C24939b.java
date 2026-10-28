package p317m2;

import android.content.Context;
import android.graphics.Canvas;
import com.whoop.android.R;

/* JADX INFO: renamed from: m2.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C24939b extends AbstractC24938a {
    public C24939b(Context context) {
        super(context);
        setClipChildren(false);
        setClipToPadding(false);
        setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    public final void dispatchGetDisplayList() {
    }
}
