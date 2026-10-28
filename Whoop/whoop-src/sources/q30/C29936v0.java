package q30;

import bc3.AbstractC3006f0;
import l83.C23467m;
import l83.C23468n;
import n30.C26212c;
import n30.InterfaceC26213d;
import n43.C26285a;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r30.C30902g;

/* JADX INFO: renamed from: q30.v0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C29936v0 {

    /* JADX INFO: renamed from: a */
    public final C29938w0 f122253a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC26213d f122254b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC30063j f122255c;

    public C29936v0(C29938w0 c29938w0, InterfaceC26213d interfaceC26213d, InterfaceC30063j workContext) {
        AbstractC22676k.m65750j(workContext, "workContext");
        this.f122253a = c29938w0;
        this.f122254b = interfaceC26213d;
        this.f122255c = workContext;
    }

    /* JADX INFO: renamed from: a */
    public final void m91540a(C30902g errorData) {
        Object objM107888l;
        AbstractC22676k.m65750j(errorData, "errorData");
        try {
            objM107888l = errorData.m95020b().toString();
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        Throwable thM68037a = C23468n.m68037a(objM107888l);
        if (thM68037a != null) {
            ((C26212c) this.f122254b).m77828c(new RuntimeException("Could not convert ErrorData to JSON.\n$" + errorData, thM68037a));
        }
        InterfaceC30057d interfaceC30057d = null;
        if (objM107888l instanceof C23467m) {
            objM107888l = null;
        }
        String str = (String) objM107888l;
        if (str != null) {
            AbstractC3006f0.m8732z(AbstractC3006f0.m8708b(this.f122255c), null, null, new C26285a(this, str, interfaceC30057d, 12), 3);
        }
    }
}
