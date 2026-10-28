package p163g1;

import ec3.InterfaceC13062m;
import l83.C23454a0;
import p238j0.C21075a;
import p238j0.C21076b;
import p238j0.C21077c;
import p238j0.C21078d;
import p238j0.C21079e;
import p238j0.C21080f;
import p238j0.C21081g;
import p238j0.C21085k;
import p238j0.C21086l;
import p238j0.C21087m;
import p238j0.InterfaceC21082h;
import p668z1.C39967p;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: g1.n1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15087n1 implements InterfaceC13062m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56489w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C39967p f56490x;

    public /* synthetic */ C15087n1(C39967p c39967p, int i13) {
        this.f56489w = i13;
        this.f56490x = c39967p;
    }

    @Override // ec3.InterfaceC13062m
    public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f56489w) {
            case 0:
                InterfaceC21082h interfaceC21082h = (InterfaceC21082h) obj;
                boolean z4 = interfaceC21082h instanceof C21080f;
                C39967p c39967p = this.f56490x;
                if (z4) {
                    c39967p.add(interfaceC21082h);
                } else if (interfaceC21082h instanceof C21081g) {
                    c39967p.remove(((C21081g) interfaceC21082h).f79946a);
                } else if (interfaceC21082h instanceof C21078d) {
                    c39967p.add(interfaceC21082h);
                } else if (interfaceC21082h instanceof C21079e) {
                    c39967p.remove(((C21079e) interfaceC21082h).f79945a);
                } else if (interfaceC21082h instanceof C21086l) {
                    c39967p.add(interfaceC21082h);
                } else if (interfaceC21082h instanceof C21087m) {
                    c39967p.remove(((C21087m) interfaceC21082h).f79950a);
                } else if (interfaceC21082h instanceof C21085k) {
                    c39967p.remove(((C21085k) interfaceC21082h).f79948a);
                }
                break;
            case 1:
                InterfaceC21082h interfaceC21082h2 = (InterfaceC21082h) obj;
                boolean z13 = interfaceC21082h2 instanceof C21086l;
                C39967p c39967p2 = this.f56490x;
                if (z13) {
                    c39967p2.add(interfaceC21082h2);
                } else if (interfaceC21082h2 instanceof C21087m) {
                    c39967p2.remove(((C21087m) interfaceC21082h2).f79950a);
                } else if (interfaceC21082h2 instanceof C21085k) {
                    c39967p2.remove(((C21085k) interfaceC21082h2).f79948a);
                } else if (interfaceC21082h2 instanceof C21076b) {
                    c39967p2.add(interfaceC21082h2);
                } else if (interfaceC21082h2 instanceof C21077c) {
                    c39967p2.remove(((C21077c) interfaceC21082h2).f79944a);
                } else if (interfaceC21082h2 instanceof C21075a) {
                    c39967p2.remove(((C21075a) interfaceC21082h2).f79943a);
                }
                break;
            case 2:
                InterfaceC21082h interfaceC21082h3 = (InterfaceC21082h) obj;
                boolean z14 = interfaceC21082h3 instanceof C21086l;
                C39967p c39967p3 = this.f56490x;
                if (z14) {
                    c39967p3.add(interfaceC21082h3);
                } else if (interfaceC21082h3 instanceof C21087m) {
                    c39967p3.remove(((C21087m) interfaceC21082h3).f79950a);
                } else if (interfaceC21082h3 instanceof C21085k) {
                    c39967p3.remove(((C21085k) interfaceC21082h3).f79948a);
                } else if (interfaceC21082h3 instanceof C21076b) {
                    c39967p3.add(interfaceC21082h3);
                } else if (interfaceC21082h3 instanceof C21077c) {
                    c39967p3.remove(((C21077c) interfaceC21082h3).f79944a);
                } else if (interfaceC21082h3 instanceof C21075a) {
                    c39967p3.remove(((C21075a) interfaceC21082h3).f79943a);
                }
                break;
            default:
                InterfaceC21082h interfaceC21082h4 = (InterfaceC21082h) obj;
                boolean z15 = interfaceC21082h4 instanceof C21080f;
                C39967p c39967p4 = this.f56490x;
                if (z15) {
                    c39967p4.add(interfaceC21082h4);
                } else if (interfaceC21082h4 instanceof C21081g) {
                    c39967p4.remove(((C21081g) interfaceC21082h4).f79946a);
                } else if (interfaceC21082h4 instanceof C21078d) {
                    c39967p4.add(interfaceC21082h4);
                } else if (interfaceC21082h4 instanceof C21079e) {
                    c39967p4.remove(((C21079e) interfaceC21082h4).f79945a);
                } else if (interfaceC21082h4 instanceof C21086l) {
                    c39967p4.add(interfaceC21082h4);
                } else if (interfaceC21082h4 instanceof C21087m) {
                    c39967p4.remove(((C21087m) interfaceC21082h4).f79950a);
                } else if (interfaceC21082h4 instanceof C21085k) {
                    c39967p4.remove(((C21085k) interfaceC21082h4).f79948a);
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
