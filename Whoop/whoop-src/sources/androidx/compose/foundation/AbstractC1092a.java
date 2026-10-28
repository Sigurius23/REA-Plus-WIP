package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.p018ui.Modifier;
import c93.InterfaceC4339a;
import p026b2.C2314t;
import p132f0.AbstractC13837y;
import p132f0.C13798k;
import p132f0.C13805m0;
import p132f0.C13830u1;
import p132f0.C13831v;
import p132f0.InterfaceC13832v0;
import p180h0.EnumC16377d2;
import p180h0.InterfaceC16432o1;
import p180h0.InterfaceC16478x2;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.InterfaceC17869a1;
import p209i3.C18027i;
import p238j0.InterfaceC21083i;
import p409q0.C29683g;
import p477s2.AbstractC32069a;
import p477s2.AbstractC32070b;
import p477s2.AbstractC32073e;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: androidx.compose.foundation.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1092a {
    /* JADX INFO: renamed from: a */
    public static final Modifier m3356a(float f13, Modifier modifier, AbstractC17911t abstractC17911t, InterfaceC17869a1 interfaceC17869a1) {
        return modifier.mo3471e(new BackgroundElement(0L, abstractC17911t, f13, interfaceC17869a1, 1));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Modifier m3357b(Modifier modifier, AbstractC17911t abstractC17911t, InterfaceC17869a1 interfaceC17869a1, float f13, int i13) {
        if ((i13 & 2) != 0) {
            interfaceC17869a1 = AbstractC17918w0.f69621a;
        }
        if ((i13 & 4) != 0) {
            f13 = 1.0f;
        }
        return m3356a(f13, modifier, abstractC17911t, interfaceC17869a1);
    }

    /* JADX INFO: renamed from: c */
    public static final Modifier m3358c(Modifier modifier, long j7, InterfaceC17869a1 interfaceC17869a1) {
        return modifier.mo3471e(new BackgroundElement(j7, null, 1.0f, interfaceC17869a1, 2));
    }

    /* JADX INFO: renamed from: d */
    public static final Modifier m3359d(Modifier modifier, InterfaceC21083i interfaceC21083i, InterfaceC13832v0 interfaceC13832v0, boolean z4, String str, C18027i c18027i, InterfaceC4339a interfaceC4339a) {
        Modifier modifierMo3471e;
        if (interfaceC13832v0 instanceof InterfaceC13832v0) {
            modifierMo3471e = new ClickableElement(interfaceC21083i, interfaceC13832v0, false, z4, str, c18027i, interfaceC4339a);
        } else if (interfaceC13832v0 == null) {
            modifierMo3471e = new ClickableElement(interfaceC21083i, null, false, z4, str, c18027i, interfaceC4339a);
        } else {
            C2314t c2314t = C2314t.f9131w;
            modifierMo3471e = interfaceC21083i != null ? AbstractC1095d.m3369a(c2314t, interfaceC21083i, interfaceC13832v0).mo3471e(new ClickableElement(interfaceC21083i, null, false, z4, str, c18027i, interfaceC4339a)) : AbstractC37056f.m118997u(c2314t, new C1093b(interfaceC13832v0, z4, str, c18027i, interfaceC4339a));
        }
        return modifier.mo3471e(modifierMo3471e);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Modifier m3360e(Modifier modifier, InterfaceC21083i interfaceC21083i, InterfaceC13832v0 interfaceC13832v0, boolean z4, C18027i c18027i, InterfaceC4339a interfaceC4339a, int i13) {
        if ((i13 & 4) != 0) {
            z4 = true;
        }
        boolean z13 = z4;
        if ((i13 & 16) != 0) {
            c18027i = null;
        }
        return m3359d(modifier, interfaceC21083i, interfaceC13832v0, z13, null, c18027i, interfaceC4339a);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Modifier m3361f(Modifier modifier, boolean z4, String str, InterfaceC4339a interfaceC4339a, int i13) {
        if ((i13 & 1) != 0) {
            z4 = true;
        }
        if ((i13 & 2) != 0) {
            str = null;
        }
        return AbstractC37056f.m118997u(modifier, new C13831v(interfaceC4339a, str, z4));
    }

    /* JADX INFO: renamed from: g */
    public static Modifier m3362g(Modifier modifier, boolean z4, String str, C18027i c18027i, InterfaceC4339a interfaceC4339a, int i13) {
        if ((i13 & 1) != 0) {
            z4 = true;
        }
        return modifier.mo3471e(new ClickableElement(null, null, true, z4, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : c18027i, interfaceC4339a));
    }

    /* JADX INFO: renamed from: h */
    public static Modifier m3363h(Modifier modifier, InterfaceC21083i interfaceC21083i, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13) {
        if ((i13 & 64) != 0) {
            interfaceC4339a = null;
        }
        return modifier.mo3471e(new CombinedClickableElement(interfaceC4339a2, interfaceC4339a, interfaceC21083i));
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m3364i(KeyEvent keyEvent) {
        long jM99714D = AbstractC32073e.m99714D(keyEvent);
        int i13 = AbstractC32070b.f133018r;
        return AbstractC32070b.m99689a(jM99714D, AbstractC32069a.m99673k()) || AbstractC32070b.m99689a(jM99714D, AbstractC32069a.m99678p()) || AbstractC32070b.m99689a(jM99714D, AbstractC32069a.m99682t()) || AbstractC32070b.m99689a(jM99714D, AbstractC32069a.m99687y());
    }

    /* JADX INFO: renamed from: j */
    public static final Modifier m3365j(Modifier modifier, InterfaceC16478x2 interfaceC16478x2, EnumC16377d2 enumC16377d2, boolean z4, InterfaceC16432o1 interfaceC16432o1, InterfaceC21083i interfaceC21083i, boolean z13, C13798k c13798k, C29683g c29683g) {
        float f13 = AbstractC13837y.f49372a;
        EnumC16377d2 enumC16377d3 = EnumC16377d2.f62971w;
        C2314t c2314t = C2314t.f9131w;
        return modifier.mo3471e(enumC16377d2 == enumC16377d3 ? AbstractC37056f.m118994r(c2314t, C13830u1.f49353a) : AbstractC37056f.m118994r(c2314t, C13805m0.f49254a)).mo3471e(new ScrollingContainerElement(c13798k, c29683g, interfaceC16432o1, enumC16377d2, interfaceC16478x2, interfaceC21083i, z4, z13));
    }
}
