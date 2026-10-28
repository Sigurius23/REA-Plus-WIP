package p474s;

import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;
import p185h6.AbstractC16952g;

/* JADX INFO: renamed from: s.h2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C31963h2 extends AbstractC16952g {

    /* JADX INFO: renamed from: w */
    public final WeakReference f132707w;

    public C31963h2(SwitchCompat switchCompat) {
        this.f132707w = new WeakReference(switchCompat);
    }

    @Override // p185h6.AbstractC16952g
    /* JADX INFO: renamed from: a */
    public final void mo47706a() {
        SwitchCompat switchCompat = (SwitchCompat) this.f132707w.get();
        if (switchCompat != null) {
            switchCompat.m3292c();
        }
    }

    @Override // p185h6.AbstractC16952g
    /* JADX INFO: renamed from: b */
    public final void mo47707b() {
        SwitchCompat switchCompat = (SwitchCompat) this.f132707w.get();
        if (switchCompat != null) {
            switchCompat.m3292c();
        }
    }
}
