package p390p1;

import c93.InterfaceC4339a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p1.t1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC28669t1 {

    /* JADX INFO: renamed from: a */
    public final C28668t0 f115964a;

    public AbstractC28669t1(InterfaceC4339a interfaceC4339a) {
        this.f115964a = new C28668t0(interfaceC4339a);
    }

    /* JADX INFO: renamed from: a */
    public abstract C28673u1 mo86977a(Object obj);

    /* JADX INFO: renamed from: b */
    public InterfaceC28682w2 mo86978b() {
        return this.f115964a;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC28682w2 m87197c(C28673u1 c28673u1, InterfaceC28682w2 interfaceC28682w2) {
        C28628j0 c28628j0;
        InterfaceC28682w2 interfaceC28682w3 = null;
        interfaceC28682w3 = null;
        interfaceC28682w3 = null;
        interfaceC28682w3 = null;
        interfaceC28682w3 = null;
        interfaceC28682w3 = null;
        if (interfaceC28682w2 instanceof C28628j0) {
            if (c28673u1.f115969d) {
                c28628j0 = (C28628j0) interfaceC28682w2;
                c28628j0.f115811a.setValue(c28673u1.m87198a());
            }
        } else if (interfaceC28682w2 instanceof C28678v2) {
            if ((c28673u1.f115967b || c28673u1.f115970e != null) && !c28673u1.f115969d) {
                C28678v2 c28678v2 = (C28678v2) interfaceC28682w2;
                if (AbstractC22676k.m65745e(c28673u1.m87198a(), c28678v2.f115986a)) {
                    interfaceC28682w3 = c28678v2;
                }
            }
        } else if (interfaceC28682w2 instanceof C28600c0) {
            c28673u1.getClass();
        }
        if (interfaceC28682w3 != null) {
            interfaceC28682w3 = c28628j0;
            return interfaceC28682w3;
        }
        if (!c28673u1.f115969d) {
            interfaceC28682w3 = c28628j0;
            return new C28678v2(c28673u1.m87198a());
        }
        Object obj = c28673u1.f115970e;
        InterfaceC28650o2 interfaceC28650o2 = c28673u1.f115968c;
        if (interfaceC28650o2 == null) {
            interfaceC28682w3 = c28628j0;
            interfaceC28650o2 = C28676v0.f115974F;
        }
        interfaceC28682w3 = c28628j0;
        return new C28628j0(new C28633k1(obj, interfaceC28650o2));
    }
}
