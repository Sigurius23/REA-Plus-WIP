package androidx.compose.foundation;

import androidx.compose.p018ui.Modifier;
import b30.C2591o4;
import ep0.C13395a;
import p132f0.InterfaceC13832v0;
import p238j0.InterfaceC21083i;
import p390p1.C28596b0;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: androidx.compose.foundation.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1095d {

    /* JADX INFO: renamed from: a */
    public static final C28596b0 f4515a = new C28596b0(new C13395a(3));

    /* JADX INFO: renamed from: a */
    public static final Modifier m3369a(Modifier modifier, InterfaceC21083i interfaceC21083i, InterfaceC13832v0 interfaceC13832v0) {
        if (interfaceC13832v0 == null) {
            return modifier;
        }
        return interfaceC13832v0 instanceof InterfaceC13832v0 ? modifier.mo3471e(new IndicationModifierElement(interfaceC13832v0, interfaceC21083i)) : AbstractC37056f.m118997u(modifier, new C2591o4(interfaceC13832v0, interfaceC21083i));
    }
}
