package cr;

import android.widget.ImageButton;

/* JADX INFO: renamed from: cr.q */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC11079q extends ImageButton {

    /* JADX INFO: renamed from: w */
    public int f35041w;

    /* JADX INFO: renamed from: a */
    public final void m29875a(int i13, boolean z4) {
        super.setVisibility(i13);
        if (z4) {
            this.f35041w = i13;
        }
    }

    public final int getUserSetVisibility() {
        return this.f35041w;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i13) {
        m29875a(i13, true);
    }
}
