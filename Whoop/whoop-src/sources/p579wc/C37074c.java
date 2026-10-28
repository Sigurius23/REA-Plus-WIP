package p579wc;

import androidx.room.C1832u;
import gf.InterfaceC15761b;
import java.io.IOException;
import m83.C25262p;
import p484s9.AbstractC32281f;
import p647yf.AbstractC39497j;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.InterfaceC29123a;
import q83.AbstractC30060g;
import s83.AbstractC32269c;
import se.AbstractC32417h;
import ve.C35917b;
import ve.C35922g;
import ve.InterfaceC35918c;
import vg.C35966m;
import vg.C35971r;
import vg.InterfaceC35967n;

/* JADX INFO: renamed from: wc.c */
/* JADX INFO: loaded from: classes.dex */
public final class C37074c implements InterfaceC35918c {

    /* JADX INFO: renamed from: E */
    public final C35917b f158605E;

    /* JADX INFO: renamed from: w */
    public final InterfaceC35967n f158606w;

    /* JADX INFO: renamed from: x */
    public final boolean f158607x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC29123a f158608y;

    /* JADX INFO: renamed from: z */
    public final C35922g f158609z;

    public C37074c(InterfaceC29123a interfaceC29123a, String str) {
        InterfaceC35967n.f153143a.getClass();
        C35971r platformProvider = C35966m.f153142b;
        AbstractC22676k.m65750j(platformProvider, "platformProvider");
        this.f158606w = platformProvider;
        this.f158607x = interfaceC29123a == null;
        interfaceC29123a = interfaceC29123a == null ? AbstractC32417h.m101186Q(null) : interfaceC29123a;
        this.f158608y = interfaceC29123a;
        int i13 = 0;
        int i14 = 1;
        C35922g c35922g = new C35922g(new C37100k1(new C1832u(i14, platformProvider, InterfaceC35967n.class, "getProperty", "getProperty(Ljava/lang/String;)Ljava/lang/String;", i13, 23)), new C37101l(new C1832u(i14, platformProvider, InterfaceC35967n.class, "getenv", "getenv(Ljava/lang/String;)Ljava/lang/String;", i13, 24)), new C37097j1(str, interfaceC29123a, platformProvider), new C37105m0(str, interfaceC29123a, platformProvider), new C37092i(platformProvider, interfaceC29123a), new C37116s(AbstractC30060g.m92088H(new C25262p(this, 22)), platformProvider));
        this.f158609z = c35922g;
        this.f158605E = new C35917b(c35922g);
    }

    @Override // p613xf.InterfaceC38257c
    /* JADX INFO: renamed from: b */
    public final Object mo79294b(InterfaceC15761b interfaceC15761b, AbstractC32269c abstractC32269c) {
        return this.f158605E.mo79294b(interfaceC15761b, abstractC32269c);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f158605E.close();
        if (this.f158607x) {
            AbstractC39497j.m126157b(this.f158608y);
        }
    }

    public final String toString() {
        return AbstractC32281f.m100455w(this) + ": " + this.f158609z;
    }
}
