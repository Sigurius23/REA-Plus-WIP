package androidx.compose.animation;

import androidx.compose.p018ui.Modifier;
import p077d0.AbstractC11348f;
import p077d0.C11347e2;
import p077d0.InterfaceC11337c0;
import p636y3.C39180l;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: androidx.compose.animation.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1091c {

    /* JADX INFO: renamed from: a */
    public static final long f4474a;

    static {
        long j7 = Integer.MIN_VALUE;
        f4474a = (j7 & 4294967295L) | (j7 << 32);
    }

    /* JADX INFO: renamed from: a */
    public static Modifier m3355a(Modifier modifier, C11347e2 c11347e2, int i13) {
        InterfaceC11337c0 interfaceC11337c0M30573u = c11347e2;
        if ((i13 & 1) != 0) {
            long j7 = 1;
            interfaceC11337c0M30573u = AbstractC11348f.m30573u(0.0f, 400.0f, 1, new C39180l((j7 & 4294967295L) | (j7 << 32)));
        }
        return AbstractC37056f.m118995s(modifier).mo3471e(new SizeAnimationModifierElement(interfaceC11337c0M30573u));
    }
}
