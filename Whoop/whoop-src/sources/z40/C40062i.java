package z40;

import ag.C0854d;
import cf.AbstractC4537l;
import java.util.List;
import l83.C23470p;
import p249jc.AbstractC21598x;
import p326mf.C25490j;
import p367of.C27892a;
import p522uf.C34894u;
import p522uf.InterfaceC34888o;
import p526ul.InterfaceC35055a;
import p551vf.C35937b;
import p684zk.C40800y;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: z40.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C40062i implements InterfaceC34888o, InterfaceC35055a {
    /* JADX INFO: renamed from: a */
    public static final List m128405a() {
        C23470p c23470p = C40065l.f172879o;
        return (List) C40065l.f172879o.getValue();
    }

    @Override // p526ul.InterfaceC35055a
    public Object create() {
        return new C40800y();
    }

    @Override // p522uf.InterfaceC34888o
    /* JADX INFO: renamed from: d */
    public Object mo9062d(Object obj, C0854d c0854d) {
        C34894u c34894u = (C34894u) obj;
        String str = (String) AbstractC21598x.m60654J(c34894u.f146958a, AbstractC4537l.f18268a);
        C35937b c35937b = (C35937b) c34894u.f146959b;
        c35937b.f153017y.m386f("AWSCognitoIdentityProviderService.".concat(str), "X-Amz-Target");
        c35937b.f153017y.m382P("application/x-amz-json-1.1");
        if (c35937b.f153018z instanceof C25490j) {
            c35937b.f153018z = new C27892a(AbstractC39421y.m125919D("{}"));
        }
        return c34894u;
    }
}
