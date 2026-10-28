package p132f0;

import android.graphics.Rect;
import p095dp.AbstractC12240d;
import p446r1.C30849c;

/* JADX INFO: renamed from: f0.h0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13790h0 extends AbstractC13800k1 {
    @Override // p132f0.AbstractC13800k1
    /* JADX INFO: renamed from: X0 */
    public final C30849c mo39155X0() {
        C30849c c30849c = new C30849c(new Rect[16]);
        c30849c.m94886c(c30849c.f127229y, AbstractC12240d.m34057W(this).getSystemGestureExclusionRects());
        return c30849c;
    }

    @Override // p132f0.AbstractC13800k1
    /* JADX INFO: renamed from: Y0 */
    public final void mo39156Y0(C30849c c30849c) {
        AbstractC12240d.m34057W(this).setSystemGestureExclusionRects(c30849c.m94889f());
    }
}
