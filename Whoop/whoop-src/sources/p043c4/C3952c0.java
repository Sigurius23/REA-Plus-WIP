package p043c4;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import p293l2.C23235l;

/* JADX INFO: renamed from: c4.c0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C3952c0 extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f16103a;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Outline outline2;
        switch (this.f16103a) {
            case 0:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                break;
            case 1:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                break;
            case 2:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                break;
            default:
                if ((view instanceof C23235l) && (outline2 = ((C23235l) view).f92072E) != null) {
                    outline.set(outline2);
                    break;
                }
                break;
        }
    }
}
