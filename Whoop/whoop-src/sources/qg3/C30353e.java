package qg3;

import ch3.C4701p;
import java.lang.reflect.Type;
import pg3.C29174b0;
import pg3.InterfaceC29182e;
import pg3.InterfaceC29187g;
import xg3.C38280g;
import xg3.InterfaceC38278e;

/* JADX INFO: renamed from: qg3.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C30353e implements InterfaceC29187g {

    /* JADX INFO: renamed from: E */
    public final boolean f124537E;

    /* JADX INFO: renamed from: w */
    public final Type f124538w;

    /* JADX INFO: renamed from: x */
    public final boolean f124539x;

    /* JADX INFO: renamed from: y */
    public final boolean f124540y;

    /* JADX INFO: renamed from: z */
    public final boolean f124541z;

    public C30353e(Type type, boolean z4, boolean z13, boolean z14, boolean z15) {
        this.f124538w = type;
        this.f124539x = z4;
        this.f124540y = z13;
        this.f124541z = z14;
        this.f124537E = z15;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    /* JADX WARN: Code duplicated, block: B:15:0x0030  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // pg3.InterfaceC29187g
    public final Object adapt(InterfaceC29182e interfaceC29182e) {
        C30350b c30350b;
        C38280g c38280gM122641j;
        InterfaceC38278e c4701p = new C4701p((C29174b0) interfaceC29182e, 2);
        if (!this.f124539x) {
            if (this.f124540y) {
                c30350b = new C30350b(c4701p, 0);
            }
            c38280gM122641j = C38280g.m122641j(c4701p);
            if (this.f124541z) {
                return c38280gM122641j.m122670U();
            }
            if (this.f124537E) {
                return c38280gM122641j.m122669T();
            }
            return c38280gM122641j;
        }
        c30350b = new C30350b(c4701p, 1);
        c4701p = c30350b;
        c38280gM122641j = C38280g.m122641j(c4701p);
        if (this.f124541z) {
            return c38280gM122641j.m122670U();
        }
        if (this.f124537E) {
            return c38280gM122641j.m122669T();
        }
        return c38280gM122641j;
    }

    @Override // pg3.InterfaceC29187g
    /* JADX INFO: renamed from: responseType */
    public final Type getResponseType() {
        return this.f124538w;
    }
}
