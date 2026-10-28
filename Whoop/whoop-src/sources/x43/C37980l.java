package x43;

import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import ec3.C13096w1;
import n23.AbstractC26205h;
import n23.C26203f;
import n23.C26204g;
import ne3.C26624l;
import p408q.C29662f;
import p479s4.AbstractC32120a;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import u33.EnumC34512e;
import ud3.AbstractC34814f1;
import ud3.C34850x0;
import ud3.InterfaceC34811e1;
import yb3.AbstractC39397a;

/* JADX INFO: renamed from: x43.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C37980l extends AbstractC34814f1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C29662f f162638a;

    public C37980l(C29662f c29662f) {
        this.f162638a = c29662f;
    }

    @Override // ud3.AbstractC34814f1
    public final void onClosed(InterfaceC34811e1 webSocket, int i13, String reason) {
        AbstractC22676k.m65750j(webSocket, "webSocket");
        AbstractC22676k.m65750j(reason, "reason");
        if (i13 != 1000) {
            ((C13096w1) this.f162638a.f121232z).mo36564a(new C37981m(AbstractC32120a.m99978d(EnumC34512e.SOCKET_CLOSED, null, 6), null));
        }
    }

    @Override // ud3.AbstractC34814f1
    public final void onFailure(InterfaceC34811e1 webSocket, Throwable th3, C34850x0 c34850x0) {
        AbstractC22676k.m65750j(webSocket, "webSocket");
        ((C13096w1) this.f162638a.f121232z).mo36564a(new C37981m(AbstractC32120a.m99978d(EnumC34512e.SOCKET_FAILURE, th3, 2), null));
    }

    @Override // ud3.AbstractC34814f1
    public final void onMessage(InterfaceC34811e1 webSocket, C26624l bytes) {
        AbstractC22676k.m65750j(webSocket, "webSocket");
        AbstractC22676k.m65750j(bytes, "bytes");
        C29662f c29662f = this.f162638a;
        C13096w1 c13096w1 = (C13096w1) c29662f.f121232z;
        AbstractC26205h abstractC26205hMo30749s = ((InterfaceC37973e) c29662f.f121230x).mo30749s(bytes.mo79264r());
        boolean z4 = abstractC26205hMo30749s instanceof C26204g;
        if (z4) {
            c13096w1.mo36564a((AbstractC37984p) ((C26204g) abstractC26205hMo30749s).f103919a);
        } else if (!(abstractC26205hMo30749s instanceof C26203f)) {
            throw new NoWhenBranchMatchedException();
        }
        if (!z4) {
            if (!(abstractC26205hMo30749s instanceof C26203f)) {
                throw new NoWhenBranchMatchedException();
            }
            c13096w1.mo36564a(new C37981m(((C26203f) abstractC26205hMo30749s).f103918a, null));
        }
        C2345k c2345kM91131u0 = c29662f.m91131u0();
        InterfaceC2339e interfaceC2339e = c2345kM91131u0.f9275c;
        String str = c2345kM91131u0.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM91131u0.f9274b.log(enumC2341g, str, "[onMessage#ByteString] event: `" + abstractC26205hMo30749s + "`", null);
        }
    }

    @Override // ud3.AbstractC34814f1
    public final void onOpen(InterfaceC34811e1 webSocket, C34850x0 response) {
        AbstractC22676k.m65750j(webSocket, "webSocket");
        AbstractC22676k.m65750j(response, "response");
        super.onOpen(webSocket, response);
    }

    @Override // ud3.AbstractC34814f1
    public final void onMessage(InterfaceC34811e1 interfaceC34811e1, String str) {
        C29662f c29662f = this.f162638a;
        C13096w1 c13096w1 = (C13096w1) c29662f.f121232z;
        InterfaceC37973e interfaceC37973e = (InterfaceC37973e) c29662f.f121230x;
        byte[] bytes = str.getBytes(AbstractC39397a.f169546a);
        AbstractC22676k.m65749i(bytes, "getBytes(...)");
        AbstractC26205h abstractC26205hMo30749s = interfaceC37973e.mo30749s(bytes);
        boolean z4 = abstractC26205hMo30749s instanceof C26204g;
        if (z4) {
            c13096w1.mo36564a((AbstractC37984p) ((C26204g) abstractC26205hMo30749s).f103919a);
        } else if (!(abstractC26205hMo30749s instanceof C26203f)) {
            throw new NoWhenBranchMatchedException();
        }
        if (!z4) {
            if (abstractC26205hMo30749s instanceof C26203f) {
                c13096w1.mo36564a(new C37981m(((C26203f) abstractC26205hMo30749s).f103918a, null));
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        C2345k c2345kM91131u0 = c29662f.m91131u0();
        InterfaceC2339e interfaceC2339e = c2345kM91131u0.f9275c;
        String str2 = c2345kM91131u0.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
            c2345kM91131u0.f9274b.log(enumC2341g, str2, "[onMessage#string] event: `" + abstractC26205hMo30749s + "`", null);
        }
    }
}
