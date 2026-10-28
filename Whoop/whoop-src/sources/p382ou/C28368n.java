package p382ou;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import io.sentry.android.replay.video.C20245d;

/* JADX INFO: renamed from: ou.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C28368n extends AbstractC28355a {

    /* JADX INFO: renamed from: i */
    public final GestureDetector f114453i;

    public C28368n(Context context, C20245d c20245d) {
        super(context, c20245d);
        this.f114453i = new GestureDetector(context, new C28366l(this));
    }

    @Override // p382ou.AbstractC28355a
    /* JADX INFO: renamed from: a */
    public final boolean mo86028a(MotionEvent motionEvent) {
        return this.f114453i.onTouchEvent(motionEvent);
    }
}
