package p512u2;

import android.view.MotionEvent;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.input.pointer.PointerHoverIconModifierElement;
import p000.C31931s;
import p028b4.AbstractC2701l;
import p028b4.C2694e;
import p133f1.C13968p1;
import p181h2.C16617b;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: u2.d0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC34454d0 {

    /* JADX INFO: renamed from: a */
    public static final StackTraceElement[] f144756a = new StackTraceElement[0];

    /* JADX INFO: renamed from: a */
    public static final int m108910a(boolean z4, boolean z13, boolean z14) {
        return (z4 ? 1 : 0) | ((z13 ? 1 : 0) << 1) | ((z14 ? 1 : 0) << 2);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m108911b(C34472r c34472r) {
        return (c34472r.m108956l() || c34472r.f144822h || !c34472r.f144818d) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m108912c(C34472r c34472r) {
        return !c34472r.f144822h && c34472r.f144818d;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m108913d(C34472r c34472r) {
        return (c34472r.m108956l() || !c34472r.f144822h || c34472r.f144818d) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m108914e(C34472r c34472r) {
        return c34472r.f144822h && !c34472r.f144818d;
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m108915f(int i13, int i14) {
        return i13 == i14;
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m108916g(C34472r c34472r, long j7) {
        long j13 = c34472r.f144817c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j13 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j13 & 4294967295L));
        int i13 = (int) (j7 >> 32);
        int i14 = (int) (j7 & 4294967295L);
        return (fIntBitsToFloat > ((float) i13)) | (fIntBitsToFloat < 0.0f) | (fIntBitsToFloat2 < 0.0f) | (fIntBitsToFloat2 > ((float) i14));
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m108917h(C34472r c34472r, long j7, long j13) {
        int i13 = c34472r.f144823i == 1 ? 1 : 0;
        long j14 = c34472r.f144817c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j14 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j14 & 4294967295L));
        float f13 = i13;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j13 >> 32)) * f13;
        float f14 = ((int) (j7 >> 32)) + fIntBitsToFloat3;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j13 & 4294967295L)) * f13;
        return (fIntBitsToFloat > f14) | (fIntBitsToFloat < (-fIntBitsToFloat3)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j7 & 4294967295L)) + fIntBitsToFloat4);
    }

    /* JADX INFO: renamed from: i */
    public static Modifier m108918i(Modifier modifier, C34447a c34447a) {
        return modifier.mo3471e(new PointerHoverIconModifierElement(c34447a));
    }

    /* JADX INFO: renamed from: j */
    public static final Modifier m108919j(Modifier modifier, AbstractC2701l abstractC2701l) {
        C34479y c34479y = new C34479y();
        c34479y.f144850w = new C2694e(abstractC2701l, 1);
        C31931s c31931s = new C31931s();
        C31931s c31931s2 = c34479y.f144851x;
        if (c31931s2 != null) {
            c31931s2.f132625x = null;
        }
        c34479y.f144851x = c31931s;
        c31931s.f132625x = c34479y;
        abstractC2701l.setOnRequestDisallowInterceptTouchEvent$ui_release(c31931s);
        return modifier.mo3471e(c34479y);
    }

    /* JADX INFO: renamed from: k */
    public static final long m108920k(C34472r c34472r, boolean z4) {
        long jM47191g = C16617b.m47191g(c34472r.f144817c, c34472r.f144821g);
        if (z4 || !c34472r.m108956l()) {
            return jM47191g;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m108921l(C34472r c34472r) {
        return !C16617b.m47187c(m108920k(c34472r, false), 0L);
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m108922m(C34472r c34472r) {
        return !C16617b.m47187c(m108920k(c34472r, true), 0L);
    }

    /* JADX INFO: renamed from: n */
    public static final void m108923n(C34465k c34465k, long j7, Function1 function1, boolean z4) {
        C13968p1 c13968p1 = c34465k.f144801b;
        MotionEvent motionEventM39756l = c13968p1 != null ? c13968p1.m39756l() : null;
        if (motionEventM39756l == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int action = motionEventM39756l.getAction();
        if (z4) {
            motionEventM39756l.setAction(3);
        }
        int i13 = (int) (j7 >> 32);
        int i14 = (int) (j7 & 4294967295L);
        motionEventM39756l.offsetLocation(-Float.intBitsToFloat(i13), -Float.intBitsToFloat(i14));
        function1.invoke(motionEventM39756l);
        motionEventM39756l.offsetLocation(Float.intBitsToFloat(i13), Float.intBitsToFloat(i14));
        motionEventM39756l.setAction(action);
    }
}
