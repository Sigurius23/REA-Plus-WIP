package w00;

import com.stripe.android.uicore.elements.C5705a;
import com.stripe.android.uicore.elements.IdentifierSpec;
import d30.C11530f0;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import p479s4.AbstractC32128i;
import p696zy.C41212d;
import p696zy.InterfaceC41211c;
import u00.C34378f;
import v00.AbstractC35485p0;
import v00.C35459c0;
import v00.C35479m0;
import v00.C35486q;
import x30.C37924r1;

/* JADX INFO: renamed from: w00.t */
/* JADX INFO: loaded from: classes6.dex */
public final class C36664t extends AbstractC35485p0 {

    /* JADX INFO: renamed from: a */
    public final C35486q f157054a;

    public C36664t(C35486q c35486q) {
        this.f157054a = c35486q;
    }

    @Override // v00.AbstractC35485p0
    /* JADX INFO: renamed from: k */
    public final void mo112559k(C35459c0 c35459c0, C35479m0 c35479m0, C11530f0 c11530f0) {
        C35486q c35486q = this.f157054a;
        InterfaceC41211c interfaceC41211c = c35486q.f151067z;
        if (interfaceC41211c != null) {
            IdentifierSpec.Companion.getClass();
            ((ArrayList) c11530f0.f37151d).add(new C37924r1(C5705a.m16892a("CustomPaymentMethodHeader"), interfaceC41211c));
        }
        if (c35486q.f151063E) {
            ((LinkedHashSet) c11530f0.f37154g).clear();
            c11530f0.f37148a = false;
        }
    }

    @Override // v00.AbstractC35485p0
    /* JADX INFO: renamed from: l */
    public final C34378f mo112560l(C35459c0 c35459c0) {
        C35486q c35486q = this.f157054a;
        String str = c35486q.f151064w;
        C41212d c41212dM100055i = AbstractC32128i.m100055i(c35486q.f151065x);
        InterfaceC41211c interfaceC41211c = c35486q.f151067z;
        String str2 = c35486q.f151066y;
        return new C34378f(str, (InterfaceC41211c) c41212dM100055i, 0, (Integer) 0, str2, str2, false, interfaceC41211c, (Integer) null, 514);
    }
}
