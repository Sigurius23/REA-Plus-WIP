package gs;

import com.google.crypto.tink.internal.C5089f0;
import p560vs.C36328c0;
import p560vs.C36334d0;
import p560vs.C36340e0;
import p560vs.C36346f0;
import p560vs.C36387m;
import p560vs.C36393n;
import p560vs.C36400o0;
import p560vs.C36403o3;
import p560vs.C36406p0;
import p560vs.C36408p2;
import p560vs.C36409p3;
import p560vs.C36414q2;
import p560vs.C36420r2;
import p560vs.C36426s2;
import p560vs.C36447w;
import p560vs.C36453x;
import p560vs.C36459y;
import p560vs.C36465z;
import p560vs.EnumC36354g2;
import p560vs.EnumC36362h4;

/* JADX INFO: renamed from: gs.c */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC16125c {

    /* JADX INFO: renamed from: a */
    public static final C36409p3 f61253a;

    static {
        m45683c(16);
        f61253a = m45683c(32);
        m45682b(16);
        m45682b(32);
        m45681a(16, 16);
        m45681a(32, 32);
        C36403o3 c36403o3M116529G = C36409p3.m116529G();
        C5089f0 c5089f0 = AbstractC16153v.f61370a;
        c36403o3M116529G.m116484h("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        EnumC36362h4 enumC36362h4 = EnumC36362h4.TINK;
        c36403o3M116529G.m116483g(enumC36362h4);
        C36403o3 c36403o3M116529G2 = C36409p3.m116529G();
        C5089f0 c5089f1 = AbstractC16140j0.f61321a;
        c36403o3M116529G2.m116484h("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        c36403o3M116529G2.m116483g(enumC36362h4);
    }

    /* JADX INFO: renamed from: a */
    public static void m45681a(int i13, int i14) {
        C36447w c36447wM116758E = C36453x.m116758E();
        C36459y c36459yM116813C = C36465z.m116813C();
        c36459yM116813C.m116786g(16);
        c36447wM116758E.m116724h((C36465z) c36459yM116813C.m16347b());
        c36447wM116758E.m116723g(i13);
        C36453x c36453x = (C36453x) c36447wM116758E.m16347b();
        C36408p2 c36408p2M116547F = C36414q2.m116547F();
        C36420r2 c36420r2M116601E = C36426s2.m116601E();
        c36420r2M116601E.m116586g(EnumC36354g2.SHA256);
        c36420r2M116601E.m116587h(i14);
        c36408p2M116547F.m116525h((C36426s2) c36420r2M116601E.m16347b());
        c36408p2M116547F.m116524g(32);
        C36414q2 c36414q2 = (C36414q2) c36408p2M116547F.m16347b();
        C36387m c36387mM116442D = C36393n.m116442D();
        c36387mM116442D.m116419g(c36453x);
        c36387mM116442D.m116420h(c36414q2);
        C36393n c36393n = (C36393n) c36387mM116442D.m16347b();
        C36403o3 c36403o3M116529G = C36409p3.m116529G();
        c36403o3M116529G.m116485i(c36393n.m16109f());
        C5089f0 c5089f0 = AbstractC16137i.f61287a;
        c36403o3M116529G.m116484h("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        c36403o3M116529G.m116483g(EnumC36362h4.TINK);
    }

    /* JADX INFO: renamed from: b */
    public static void m45682b(int i13) {
        C36328c0 c36328c0M116197D = C36334d0.m116197D();
        c36328c0M116197D.m116174g(i13);
        C36340e0 c36340e0M116231C = C36346f0.m116231C();
        c36340e0M116231C.m116211g(16);
        c36328c0M116197D.m116175h((C36346f0) c36340e0M116231C.m16347b());
        C36334d0 c36334d0 = (C36334d0) c36328c0M116197D.m16347b();
        C36403o3 c36403o3M116529G = C36409p3.m116529G();
        c36403o3M116529G.m116485i(c36334d0.m16109f());
        C5089f0 c5089f0 = AbstractC16144m.f61336a;
        c36403o3M116529G.m116484h("type.googleapis.com/google.crypto.tink.AesEaxKey");
        c36403o3M116529G.m116483g(EnumC36362h4.TINK);
    }

    /* JADX INFO: renamed from: c */
    public static C36409p3 m45683c(int i13) {
        C36400o0 c36400o0M116515C = C36406p0.m116515C();
        c36400o0M116515C.m116471g(i13);
        C36406p0 c36406p0 = (C36406p0) c36400o0M116515C.m16347b();
        C36403o3 c36403o3M116529G = C36409p3.m116529G();
        c36403o3M116529G.m116485i(c36406p0.m16109f());
        C5089f0 c5089f0 = AbstractC16147p.f61347a;
        c36403o3M116529G.m116484h("type.googleapis.com/google.crypto.tink.AesGcmKey");
        c36403o3M116529G.m116483g(EnumC36362h4.TINK);
        return (C36409p3) c36403o3M116529G.m16347b();
    }
}
