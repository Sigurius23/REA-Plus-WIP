package p005a3;

import androidx.compose.p018ui.node.NodeCoordinator;
import java.util.HashMap;
import java.util.Map;
import m83.AbstractC25247g0;
import p002a0.C0006a1;
import p635y2.AbstractC39071a;
import p635y2.AbstractC39083d;
import p635y2.AbstractC39104j1;
import p635y2.C39111m;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a3.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0177a {

    /* JADX INFO: renamed from: a */
    public final AbstractC39104j1 f570a;

    /* JADX INFO: renamed from: c */
    public boolean f572c;

    /* JADX INFO: renamed from: d */
    public boolean f573d;

    /* JADX INFO: renamed from: e */
    public boolean f574e;

    /* JADX INFO: renamed from: f */
    public boolean f575f;

    /* JADX INFO: renamed from: g */
    public boolean f576g;

    /* JADX INFO: renamed from: h */
    public InterfaceC0181b f577h;

    /* JADX INFO: renamed from: b */
    public boolean f571b = true;

    /* JADX INFO: renamed from: i */
    public final HashMap f578i = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC0177a(InterfaceC0181b interfaceC0181b) {
        this.f570a = (AbstractC39104j1) interfaceC0181b;
    }

    /* JADX WARN: Type inference failed for: r12v5, types: [c93.m, kotlin.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r3v3, types: [a3.b, y2.j1] */
    /* JADX INFO: renamed from: a */
    public static final void m413a(AbstractC0177a abstractC0177a, AbstractC39071a abstractC39071a, int i13, NodeCoordinator nodeCoordinator) {
        long jMo414b;
        HashMap map = abstractC0177a.f578i;
        float f13 = i13;
        long jFloatToRawIntBits = ((long) Float.floatToRawIntBits(f13)) << 32;
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f13)) & 4294967295L;
        loop0: while (true) {
            jMo414b = jFloatToRawIntBits | jFloatToRawIntBits2;
            do {
                jMo414b = abstractC0177a.mo414b(nodeCoordinator, jMo414b);
                nodeCoordinator = nodeCoordinator.f4860Q;
                AbstractC22676k.m65747g(nodeCoordinator);
                if (nodeCoordinator.equals(abstractC0177a.f570a.mo424J())) {
                    break loop0;
                }
            } while (!abstractC0177a.mo415c(nodeCoordinator).containsKey(abstractC39071a));
            float fMo416d = abstractC0177a.mo416d(nodeCoordinator, abstractC39071a);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fMo416d);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fMo416d);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        }
        int iRound = Math.round(abstractC39071a instanceof C39111m ? Float.intBitsToFloat((int) (jMo414b & 4294967295L)) : Float.intBitsToFloat((int) (jMo414b >> 32)));
        if (map.containsKey(abstractC39071a)) {
            int iIntValue = ((Number) AbstractC25247g0.m73986U(abstractC39071a, map)).intValue();
            C39111m c39111m = AbstractC39083d.f168140a;
            iRound = ((Number) abstractC39071a.f168117a.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iRound))).intValue();
        }
        map.put(abstractC39071a, Integer.valueOf(iRound));
    }

    /* JADX INFO: renamed from: b */
    public abstract long mo414b(NodeCoordinator nodeCoordinator, long j7);

    /* JADX INFO: renamed from: c */
    public abstract Map mo415c(NodeCoordinator nodeCoordinator);

    /* JADX INFO: renamed from: d */
    public abstract int mo416d(NodeCoordinator nodeCoordinator, AbstractC39071a abstractC39071a);

    /* JADX INFO: renamed from: e */
    public final boolean m417e() {
        return this.f572c || this.f574e || this.f575f || this.f576g;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m418f() {
        m421i();
        return this.f577h != null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [a3.b, y2.j1] */
    /* JADX INFO: renamed from: g */
    public final void m419g() {
        this.f571b = true;
        ?? r10 = this.f570a;
        InterfaceC0181b interfaceC0181bMo428f = r10.mo428f();
        if (interfaceC0181bMo428f == null) {
            return;
        }
        if (this.f572c) {
            interfaceC0181bMo428f.mo426b0();
        } else if (this.f574e || this.f573d) {
            interfaceC0181bMo428f.requestLayout();
        }
        if (this.f575f) {
            r10.mo426b0();
        }
        if (this.f576g) {
            r10.requestLayout();
        }
        interfaceC0181bMo428f.mo425a().m419g();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [a3.b, y2.j1] */
    /* JADX INFO: renamed from: h */
    public final void m420h() {
        HashMap map = this.f578i;
        map.clear();
        C0006a1 c0006a1 = new C0006a1(this, 3);
        ?? r10 = this.f570a;
        r10.mo427e(c0006a1);
        map.putAll(mo415c(r10.mo424J()));
        this.f571b = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [a3.b, y2.j1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [a3.b] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX INFO: renamed from: i */
    public final void m421i() {
        InterfaceC0181b interfaceC0181b;
        AbstractC0177a abstractC0177aMo425a;
        AbstractC0177a abstractC0177aMo425a2;
        boolean zM417e = m417e();
        ?? r10 = this.f570a;
        ?? r14 = r10;
        if (!zM417e) {
            InterfaceC0181b interfaceC0181bMo428f = r10.mo428f();
            if (interfaceC0181bMo428f == null) {
                return;
            }
            interfaceC0181b = interfaceC0181bMo428f.mo425a().f577h;
            if (interfaceC0181b == null || !interfaceC0181b.mo425a().m417e()) {
                r14 = interfaceC0181b;
                InterfaceC0181b interfaceC0181b2 = this.f577h;
                if (interfaceC0181b2 == null || interfaceC0181b2.mo425a().m417e()) {
                    return;
                }
                InterfaceC0181b interfaceC0181bMo428f2 = interfaceC0181b2.mo428f();
                if (interfaceC0181bMo428f2 != null && (abstractC0177aMo425a2 = interfaceC0181bMo428f2.mo425a()) != null) {
                    abstractC0177aMo425a2.m421i();
                }
                InterfaceC0181b interfaceC0181bMo428f3 = interfaceC0181b2.mo428f();
                r14 = (interfaceC0181bMo428f3 == null || (abstractC0177aMo425a = interfaceC0181bMo428f3.mo425a()) == null) ? 0 : abstractC0177aMo425a.f577h;
            }
        }
        r14 = interfaceC0181b;
        this.f577h = r14;
    }
}
