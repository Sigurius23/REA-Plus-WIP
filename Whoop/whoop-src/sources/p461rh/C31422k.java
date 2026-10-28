package p461rh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* JADX INFO: renamed from: rh.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C31422k extends Drawable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f129288a;

    /* JADX INFO: renamed from: b */
    public final Object f129289b;

    public /* synthetic */ C31422k(Object obj, int i13) {
        this.f129288a = i13;
        this.f129289b = obj;
    }

    /* JADX INFO: renamed from: a */
    private final void m96732a(int i13) {
    }

    /* JADX INFO: renamed from: b */
    private final void m96733b(int i13) {
    }

    /* JADX INFO: renamed from: c */
    private final void m96734c(ColorFilter colorFilter) {
    }

    /* JADX INFO: renamed from: d */
    private final void m96735d(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.f129288a) {
            case 0:
                ((InterfaceC31421j) this.f129289b).mo96730b(canvas);
                break;
            default:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.f129289b;
                if (actionBarContainer.f4251G) {
                    Drawable drawable = actionBarContainer.f4250F;
                    if (drawable != null) {
                        drawable.draw(canvas);
                    }
                    break;
                } else {
                    Drawable drawable2 = actionBarContainer.f4257z;
                    if (drawable2 != null) {
                        drawable2.draw(canvas);
                    }
                    Drawable drawable3 = actionBarContainer.f4249E;
                    if (drawable3 != null && actionBarContainer.f4252H) {
                        drawable3.draw(canvas);
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.f129288a) {
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        switch (this.f129288a) {
            case 1:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.f129289b;
                if (!actionBarContainer.f4251G) {
                    Drawable drawable = actionBarContainer.f4257z;
                    if (drawable != null) {
                        drawable.getOutline(outline);
                    }
                } else if (actionBarContainer.f4250F != null) {
                    actionBarContainer.f4257z.getOutline(outline);
                }
                break;
            default:
                super.getOutline(outline);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
        int i14 = this.f129288a;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        int i13 = this.f129288a;
    }
}
