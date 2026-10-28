package p027b3;

import androidx.compose.p018ui.node.Owner;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p390p1.AbstractC28683x;
import p390p1.C28596b0;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28674u2;
import p390p1.C28677v1;

/* JADX INFO: renamed from: b3.v1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2453v1 {

    /* JADX INFO: renamed from: a */
    public static final C28674u2 f9562a = new C28674u2(C2422p0.f9481H);

    /* JADX INFO: renamed from: b */
    public static final C28674u2 f9563b = new C28674u2(C2422p0.f9482I);

    /* JADX INFO: renamed from: c */
    public static final C28674u2 f9564c = new C28674u2(C2422p0.f9484K);

    /* JADX INFO: renamed from: d */
    public static final C28674u2 f9565d = new C28674u2(C2422p0.f9483J);

    /* JADX INFO: renamed from: e */
    public static final C28674u2 f9566e = new C28674u2(C2422p0.f9486M);

    /* JADX INFO: renamed from: f */
    public static final C28674u2 f9567f = new C28674u2(C2422p0.f9485L);

    /* JADX INFO: renamed from: g */
    public static final C28674u2 f9568g = new C28674u2(C2422p0.f9492S);

    /* JADX INFO: renamed from: h */
    public static final C28674u2 f9569h = new C28674u2(C2422p0.f9488O);

    /* JADX INFO: renamed from: i */
    public static final C28674u2 f9570i = new C28674u2(C2422p0.f9489P);

    /* JADX INFO: renamed from: j */
    public static final C28674u2 f9571j = new C28674u2(C2422p0.f9491R);

    /* JADX INFO: renamed from: k */
    public static final C28674u2 f9572k = new C28674u2(C2422p0.f9490Q);

    /* JADX INFO: renamed from: l */
    public static final C28674u2 f9573l = new C28674u2(C2422p0.f9493T);

    /* JADX INFO: renamed from: m */
    public static final C28674u2 f9574m = new C28674u2(C2422p0.f9494U);

    /* JADX INFO: renamed from: n */
    public static final C28674u2 f9575n = new C28674u2(C2422p0.f9495V);

    /* JADX INFO: renamed from: o */
    public static final C28674u2 f9576o = new C28674u2(C2422p0.f9499Z);

    /* JADX INFO: renamed from: p */
    public static final C28674u2 f9577p = new C28674u2(C2422p0.f9498Y);

    /* JADX INFO: renamed from: q */
    public static final C28674u2 f9578q = new C28674u2(C2422p0.f9500a0);

    /* JADX INFO: renamed from: r */
    public static final C28674u2 f9579r = new C28674u2(C2422p0.f9501b0);

    /* JADX INFO: renamed from: s */
    public static final C28674u2 f9580s = new C28674u2(C2422p0.f9502c0);

    /* JADX INFO: renamed from: t */
    public static final C28674u2 f9581t = new C28674u2(C2422p0.f9503d0);

    /* JADX INFO: renamed from: u */
    public static final C28674u2 f9582u = new C28674u2(C2422p0.f9496W);

    /* JADX INFO: renamed from: v */
    public static final C28596b0 f9583v = new C28596b0(C2422p0.f9497X);

    /* JADX INFO: renamed from: w */
    public static final C28674u2 f9584w = new C28674u2(C2422p0.f9487N);

    /* JADX INFO: renamed from: a */
    public static final void m7433a(Owner owner, InterfaceC2355b3 interfaceC2355b3, InterfaceC4351m interfaceC4351m, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1925803616);
        int i14 = (c28655q.m87153g(owner) ? 4 : 2) | i13 | (c28655q.m87153g(interfaceC2355b3) ? 32 : 16) | (c28655q.m87157i(interfaceC4351m) ? 256 : 128);
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C28673u1 c28673u1Mo86977a = f9562a.mo86977a(owner.getAccessibilityManager());
            C28673u1 c28673u1Mo86977a2 = f9563b.mo86977a(owner.getAutofill());
            C28673u1 c28673u1Mo86977a3 = f9565d.mo86977a(owner.getAutofillManager());
            C28673u1 c28673u1Mo86977a4 = f9564c.mo86977a(owner.getAutofillTree());
            C28673u1 c28673u1Mo86977a5 = f9566e.mo86977a(owner.getClipboardManager());
            C28673u1 c28673u1Mo86977a6 = f9567f.mo86977a(owner.getClipboard());
            C28673u1 c28673u1Mo86977a7 = f9569h.mo86977a(owner.getDensity());
            C28673u1 c28673u1Mo86977a8 = f9570i.mo86977a(owner.getFocusOwner());
            C28673u1 c28673u1Mo86977a9 = f9571j.mo86977a(owner.getFontLoader());
            c28673u1Mo86977a9.f115971f = false;
            C28673u1 c28673u1Mo86977a10 = f9572k.mo86977a(owner.getFontFamilyResolver());
            c28673u1Mo86977a10.f115971f = false;
            AbstractC28683x.m87248b(new C28673u1[]{c28673u1Mo86977a, c28673u1Mo86977a2, c28673u1Mo86977a3, c28673u1Mo86977a4, c28673u1Mo86977a5, c28673u1Mo86977a6, c28673u1Mo86977a7, c28673u1Mo86977a8, c28673u1Mo86977a9, c28673u1Mo86977a10, f9573l.mo86977a(owner.getHapticFeedBack()), f9574m.mo86977a(owner.getInputModeManager()), f9575n.mo86977a(owner.getLayoutDirection()), f9576o.mo86977a(owner.getTextInputService()), f9577p.mo86977a(owner.getSoftwareKeyboardController()), f9578q.mo86977a(owner.getTextToolbar()), f9579r.mo86977a(interfaceC2355b3), f9580s.mo86977a(owner.getViewConfiguration()), f9581t.mo86977a(owner.getWindowInfo()), f9582u.mo86977a(owner.getPointerIconService()), f9568g.mo86977a(owner.getGraphicsContext())}, interfaceC4351m, c28655q, ((i14 >> 3) & 112) | 8);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2432r0(owner, interfaceC2355b3, interfaceC4351m, i13);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m7434b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    /* JADX INFO: renamed from: c */
    public static final C28674u2 m7435c() {
        return f9569h;
    }

    /* JADX INFO: renamed from: d */
    public static final C28674u2 m7436d() {
        return f9575n;
    }
}
