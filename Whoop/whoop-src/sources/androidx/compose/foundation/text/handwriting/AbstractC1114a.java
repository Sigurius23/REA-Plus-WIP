package androidx.compose.foundation.text.handwriting;

import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.input.pointer.StylusHoverIconModifierElement;
import c93.InterfaceC4339a;
import p005a3.C0241q;
import p026b2.C2314t;
import p041c1.AbstractC3817b;

/* JADX INFO: renamed from: androidx.compose.foundation.text.handwriting.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1114a {

    /* JADX INFO: renamed from: a */
    public static final C0241q f4667a;

    static {
        float f13 = 40;
        float f14 = 10;
        f4667a = new C0241q(f14, f13, f14, f13);
    }

    /* JADX INFO: renamed from: a */
    public static final Modifier m3454a(boolean z4, boolean z13, InterfaceC4339a interfaceC4339a) {
        Modifier stylusHoverIconModifierElement = C2314t.f9131w;
        if (!z4 || !AbstractC3817b.f15656a) {
            return stylusHoverIconModifierElement;
        }
        if (z13) {
            stylusHoverIconModifierElement = new StylusHoverIconModifierElement(f4667a);
        }
        return stylusHoverIconModifierElement.mo3471e(new StylusHandwritingElement(interfaceC4339a));
    }
}
