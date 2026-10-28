package s53;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;
import de.hdodenhof.circleimageview.CircleImageView;
import p531uq.C35159d;

/* JADX INFO: renamed from: s53.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C32227b extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f133435a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f133436b;

    public /* synthetic */ C32227b(View view, int i13) {
        this.f133435a = i13;
        this.f133436b = view;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Path path;
        switch (this.f133435a) {
            case 0:
                AbstractC32228c abstractC32228c = (AbstractC32228c) this.f133436b;
                if (abstractC32228c.f133443z != null && !abstractC32228c.isInEditMode() && (path = (Path) abstractC32228c.f133443z.f122260x) != null) {
                    try {
                        outline.setConvexPath(path);
                    } catch (Exception e5) {
                        e5.printStackTrace();
                        return;
                    }
                    break;
                }
                break;
            case 1:
                C35159d c35159d = ((Chip) this.f133436b).f20870E;
                if (c35159d == null) {
                    outline.setAlpha(0.0f);
                } else {
                    c35159d.getOutline(outline);
                }
                break;
            default:
                CircleImageView circleImageView = (CircleImageView) this.f133436b;
                if (!circleImageView.f39346T) {
                    Rect rect = new Rect();
                    circleImageView.f39348x.roundOut(rect);
                    outline.setRoundRect(rect, rect.width() / 2.0f);
                } else {
                    ViewOutlineProvider.BACKGROUND.getOutline(view, outline);
                }
                break;
        }
    }
}
