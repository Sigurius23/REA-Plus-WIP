package bi;

import android.content.Context;
import bf2.C3201a;
import ci.C4724b;
import df2.C12000a;
import fi.C14509o;
import l83.C23470p;
import p003a1.C0111j;
import p461rh.C31431t;
import p461rh.C31436y;
import p523uh.InterfaceC34959e;
import p523uh.InterfaceC34960f;
import p619xl.C38445a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: bi.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C3272j implements InterfaceC34959e {

    /* JADX INFO: renamed from: a */
    public final C23470p f12773a;

    /* JADX INFO: renamed from: b */
    public final C23470p f12774b;

    /* JADX INFO: renamed from: c */
    public final C38445a f12775c;

    public C3272j(C12000a c12000a) {
        C3201a c3201a = new C3201a(5);
        C3271i c3271i = C3271i.f12772w;
        this.f12773a = AbstractC30060g.m92088H(c12000a);
        this.f12774b = AbstractC30060g.m92088H(c3201a);
        C38445a c38445a = new C38445a(6, false);
        c38445a.f164636x = c3271i;
        c38445a.f164637y = C4724b.f19313a;
        this.f12775c = c38445a;
    }

    @Override // p523uh.InterfaceC34959e
    /* JADX INFO: renamed from: a */
    public final InterfaceC34960f mo9536a(Object obj, C14509o c14509o, C31431t c31431t) {
        C31436y c31436y = (C31436y) obj;
        if (!AbstractC22676k.m65745e(c31436y.f129329c, "http") && !AbstractC22676k.m65745e(c31436y.f129329c, "https")) {
            return null;
        }
        String str = c31436y.f129327a;
        C23470p c23470p = this.f12773a;
        C23470p c23470pM92088H = AbstractC30060g.m92088H(new C0111j(c31431t, 12));
        C23470p c23470p2 = this.f12774b;
        C38445a c38445a = this.f12775c;
        Context context = c14509o.f53003a;
        Object obj2 = c38445a.f164637y;
        C4724b c4724b = C4724b.f19313a;
        if (obj2 == c4724b) {
            synchronized (c38445a) {
                obj2 = c38445a.f164637y;
                if (obj2 == c4724b) {
                    Function1 function1 = (Function1) c38445a.f164636x;
                    AbstractC22676k.m65747g(function1);
                    Object objInvoke = function1.invoke(context);
                    c38445a.f164637y = objInvoke;
                    c38445a.f164636x = null;
                    obj2 = objInvoke;
                }
            }
        }
        return new C3277o(str, c14509o, c23470p, c23470pM92088H, c23470p2, (InterfaceC3267e) obj2);
    }
}
