package p182h3;

import android.graphics.Point;
import android.view.ScrollCaptureTarget;
import androidx.compose.p018ui.platform.AndroidComposeView;
import bc3.AbstractC3006f0;
import java.util.function.Consumer;
import m83.AbstractC25260n;
import p181h2.C16618c;
import p208i2.AbstractC17918w0;
import p209i3.C18036r;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p446r1.C30849c;
import p557vo.AbstractC36221c;
import p635y2.AbstractC39125q1;
import p635y2.InterfaceC39147y;
import q83.AbstractC30060g;
import q83.InterfaceC30063j;
import ug.AbstractC34924m;

/* JADX INFO: renamed from: h3.j */
/* JADX INFO: loaded from: classes.dex */
public final class C16794j {

    /* JADX INFO: renamed from: a */
    public final C28633k1 f64547a = AbstractC28683x.m87272z(Boolean.FALSE);

    /* JADX INFO: renamed from: a */
    public final void m47341a(AndroidComposeView androidComposeView, C18036r c18036r, InterfaceC30063j interfaceC30063j, Consumer consumer) {
        C30849c c30849c = new C30849c(new C16795k[16]);
        AbstractC34924m.m110138T(c18036r.m51794a(), 0, new C16793i(c30849c));
        AbstractC25260n.m74040P0(c30849c.f127227w, AbstractC30060g.m92126p(C16786b.f64528y, C16786b.f64529z), 0, c30849c.f127229y);
        int i13 = c30849c.f127229y;
        C16795k c16795k = (C16795k) (i13 == 0 ? null : c30849c.f127227w[i13 - 1]);
        if (c16795k == null) {
            return;
        }
        ScrollCaptureCallbackC16787c scrollCaptureCallbackC16787c = new ScrollCaptureCallbackC16787c(c16795k.m47343b(), c16795k.m47344c(), AbstractC3006f0.m8708b(interfaceC30063j), this, androidComposeView);
        InterfaceC39147y interfaceC39147yM47342a = c16795k.m47342a();
        C16618c c16618cMo3547r = AbstractC39125q1.m124662h(interfaceC39147yM47342a).mo3547r(interfaceC39147yM47342a, true);
        long jM124797b = c16795k.m47344c().m124797b();
        ScrollCaptureTarget scrollCaptureTargetM47340c = AbstractC16792h.m47340c(androidComposeView, AbstractC17918w0.m51503E(AbstractC36221c.m115322c(c16618cMo3547r)), new Point((int) (jM124797b >> 32), (int) (jM124797b & 4294967295L)), scrollCaptureCallbackC16787c);
        scrollCaptureTargetM47340c.setScrollBounds(AbstractC17918w0.m51503E(c16795k.m47344c()));
        consumer.accept(scrollCaptureTargetM47340c);
    }
}
