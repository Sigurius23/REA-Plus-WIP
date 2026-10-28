package p390p1;

import ec3.C13045h2;
import p476s1.InterfaceC32058e;
import p511u1.C34396c;
import p511u1.C34408o;
import p540v1.C35523a;
import p540v1.C35524b;
import p569w1.C36688b;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30062i;

/* JADX INFO: renamed from: p1.v0 */
/* JADX INFO: loaded from: classes.dex */
public final class C28676v0 implements InterfaceC30062i, InterfaceC28650o2 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f115978w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ C28676v0 f115975x = new C28676v0(0);

    /* JADX INFO: renamed from: y */
    public static final C28676v0 f115976y = new C28676v0(1);

    /* JADX INFO: renamed from: z */
    public static final C28676v0 f115977z = new C28676v0(2);

    /* JADX INFO: renamed from: E */
    public static final C28676v0 f115973E = new C28676v0(3);

    /* JADX INFO: renamed from: F */
    public static final C28676v0 f115974F = new C28676v0(4);

    public /* synthetic */ C28676v0(int i13) {
        this.f115978w = i13;
    }

    /* JADX INFO: renamed from: b */
    public static final void m87199b(C28676v0 c28676v0) {
        C13045h2 c13045h2;
        InterfaceC32058e interfaceC32058e;
        C35524b c35524b;
        C13045h2 c13045h3 = C28688y1.f116034z;
        do {
            c13045h2 = C28688y1.f116034z;
            interfaceC32058e = (InterfaceC32058e) c13045h2.getValue();
            c35524b = (C35524b) interfaceC32058e;
            C34396c c34396cM108760b = c35524b.f151148y;
            C35523a c35523a = (C35523a) c34396cM108760b.get(c28676v0);
            if (c35523a != null) {
                Object obj = c35523a.f151143a;
                Object obj2 = c35523a.f151144b;
                C34408o c34408o = c34396cM108760b.f144602w;
                C34408o c34408oM108787v = c34408o.m108787v(c28676v0 != null ? c28676v0.hashCode() : 0, 0, c28676v0);
                if (c34408o != c34408oM108787v) {
                    c34396cM108760b = c34408oM108787v == null ? C34396c.f144601y : new C34396c(c34408oM108787v, c34396cM108760b.f144603x - 1);
                }
                C36688b c36688b = C36688b.f157125a;
                if (obj != c36688b) {
                    Object obj3 = c34396cM108760b.get(obj);
                    AbstractC22676k.m65747g(obj3);
                    c34396cM108760b = c34396cM108760b.m108760b(obj, new C35523a(((C35523a) obj3).f151143a, obj2));
                }
                if (obj2 != c36688b) {
                    Object obj4 = c34396cM108760b.get(obj2);
                    AbstractC22676k.m65747g(obj4);
                    c34396cM108760b = c34396cM108760b.m108760b(obj2, new C35523a(obj, ((C35523a) obj4).f151144b));
                }
                Object obj5 = obj != c36688b ? c35524b.f151146w : obj2;
                if (obj2 != c36688b) {
                    obj = c35524b.f151147x;
                }
                c35524b = new C35524b(obj5, obj, c34396cM108760b);
            }
            if (interfaceC32058e == c35524b) {
                return;
            }
        } while (!c13045h2.m36569i(interfaceC32058e, c35524b));
    }

    @Override // p390p1.InterfaceC28650o2
    /* JADX INFO: renamed from: a */
    public boolean mo87112a(Object obj, Object obj2) {
        switch (this.f115978w) {
            case 1:
                return false;
            case 2:
                return obj == obj2;
            default:
                return AbstractC22676k.m65745e(obj, obj2);
        }
    }

    public String toString() {
        switch (this.f115978w) {
            case 1:
                return "NeverEqualPolicy";
            case 2:
                return "ReferentialEqualityPolicy";
            case 3:
            case 5:
            default:
                return super.toString();
            case 4:
                return "StructuralEqualityPolicy";
            case 6:
                return "Empty";
        }
    }
}
