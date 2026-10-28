package i20;

import aq0.C1904o;
import com.stripe.android.paymentsheet.addresselement.AutocompleteContract;
import e10.C12566q0;
import java.util.LinkedHashMap;
import p161g.AbstractActivityC14909l;
import p236j.AbstractC21065d;

/* JADX INFO: renamed from: i20.y0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C17988y0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC17929b0 f69829a;

    /* JADX INFO: renamed from: b */
    public AbstractC21065d f69830b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f69831c = new LinkedHashMap();

    public C17988y0(InterfaceC17929b0 interfaceC17929b0) {
        this.f69829a = interfaceC17929b0;
    }

    /* JADX INFO: renamed from: a */
    public final void m51593a(AbstractActivityC14909l abstractActivityC14909l, AbstractActivityC14909l abstractActivityC14909l2) {
        this.f69830b = abstractActivityC14909l.registerForActivityResult(AutocompleteContract.f22381a, new C1904o(this, 4));
        abstractActivityC14909l2.getLifecycle().mo4986a(new C12566q0(this, 4));
    }
}
