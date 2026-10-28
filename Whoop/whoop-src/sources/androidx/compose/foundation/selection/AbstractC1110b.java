package androidx.compose.foundation.selection;

import androidx.compose.foundation.AbstractC1095d;
import androidx.compose.p018ui.Modifier;
import c93.InterfaceC4339a;
import p026b2.C2314t;
import p132f0.InterfaceC13832v0;
import p209i3.C18027i;
import p238j0.InterfaceC21083i;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: androidx.compose.foundation.selection.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1110b {
    /* JADX INFO: renamed from: a */
    public static final Modifier m3444a(Modifier modifier, boolean z4, InterfaceC21083i interfaceC21083i, InterfaceC13832v0 interfaceC13832v0, boolean z13, C18027i c18027i, InterfaceC4339a interfaceC4339a) {
        Modifier modifierMo3471e;
        if (interfaceC13832v0 instanceof InterfaceC13832v0) {
            modifierMo3471e = new SelectableElement(z4, interfaceC21083i, interfaceC13832v0, false, z13, c18027i, interfaceC4339a);
        } else if (interfaceC13832v0 == null) {
            modifierMo3471e = new SelectableElement(z4, interfaceC21083i, null, false, z13, c18027i, interfaceC4339a);
        } else {
            C2314t c2314t = C2314t.f9131w;
            modifierMo3471e = interfaceC21083i != null ? AbstractC1095d.m3369a(c2314t, interfaceC21083i, interfaceC13832v0).mo3471e(new SelectableElement(z4, interfaceC21083i, null, false, z13, c18027i, interfaceC4339a)) : AbstractC37056f.m118997u(c2314t, new C1109a(interfaceC13832v0, z4, z13, c18027i, interfaceC4339a, 0));
        }
        return modifier.mo3471e(modifierMo3471e);
    }

    /* JADX INFO: renamed from: c */
    public static Modifier m3446c(Modifier modifier, boolean z4, C18027i c18027i, InterfaceC4339a interfaceC4339a, int i13) {
        if ((i13 & 4) != 0) {
            c18027i = null;
        }
        return modifier.mo3471e(new SelectableElement(z4, null, null, true, true, c18027i, interfaceC4339a));
    }
}
