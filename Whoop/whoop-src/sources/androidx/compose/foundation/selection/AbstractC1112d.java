package androidx.compose.foundation.selection;

import androidx.compose.foundation.AbstractC1095d;
import androidx.compose.material.C1119d;
import androidx.compose.p018ui.Modifier;
import c93.InterfaceC4339a;
import p026b2.C2314t;
import p132f0.InterfaceC13832v0;
import p209i3.C18027i;
import p238j0.InterfaceC21083i;
import p271k3.EnumC22167a;
import p715kotlin.jvm.functions.Function1;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: androidx.compose.foundation.selection.d */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1112d {
    /* JADX INFO: renamed from: a */
    public static final Modifier m3447a(Modifier modifier, boolean z4, InterfaceC21083i interfaceC21083i, InterfaceC13832v0 interfaceC13832v0, boolean z13, C18027i c18027i, Function1 function1) {
        Modifier modifierMo3471e;
        if (interfaceC13832v0 instanceof InterfaceC13832v0) {
            modifierMo3471e = new ToggleableElement(z4, interfaceC21083i, interfaceC13832v0, false, z13, c18027i, function1);
        } else if (interfaceC13832v0 == null) {
            modifierMo3471e = new ToggleableElement(z4, interfaceC21083i, null, false, z13, c18027i, function1);
        } else {
            C2314t c2314t = C2314t.f9131w;
            modifierMo3471e = interfaceC21083i != null ? AbstractC1095d.m3369a(c2314t, interfaceC21083i, interfaceC13832v0).mo3471e(new ToggleableElement(z4, interfaceC21083i, null, false, z13, c18027i, function1)) : AbstractC37056f.m118997u(c2314t, new C1109a(interfaceC13832v0, z4, z13, c18027i, function1, 1));
        }
        return modifier.mo3471e(modifierMo3471e);
    }

    /* JADX INFO: renamed from: b */
    public static Modifier m3448b(Modifier modifier, boolean z4, boolean z13, C18027i c18027i, Function1 function1, int i13) {
        if ((i13 & 2) != 0) {
            z13 = true;
        }
        boolean z14 = z13;
        if ((i13 & 4) != 0) {
            c18027i = null;
        }
        return modifier.mo3471e(new ToggleableElement(z4, null, null, true, z14, c18027i, function1));
    }

    /* JADX INFO: renamed from: c */
    public static final Modifier m3449c(EnumC22167a enumC22167a, C1119d c1119d, boolean z4, C18027i c18027i, InterfaceC4339a interfaceC4339a) {
        if (c1119d != null) {
            return new TriStateToggleableElement(enumC22167a, null, c1119d, z4, c18027i, interfaceC4339a);
        }
        if (c1119d == null) {
            return new TriStateToggleableElement(enumC22167a, null, null, z4, c18027i, interfaceC4339a);
        }
        return AbstractC37056f.m118997u(C2314t.f9131w, new C1111c(c1119d, enumC22167a, z4, c18027i, interfaceC4339a));
    }
}
