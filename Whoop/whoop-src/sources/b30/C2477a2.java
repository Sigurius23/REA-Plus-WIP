package b30;

import c93.InterfaceC4339a;
import fa3.C14320m;
import fa3.C14327t;
import fa3.EnumC14301a;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import lg3.C24055q;
import na3.C26515b;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: b30.a2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2477a2 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9647w;

    /* JADX INFO: renamed from: x */
    public final int f9648x;

    /* JADX INFO: renamed from: y */
    public final Object f9649y;

    /* JADX INFO: renamed from: z */
    public final List f9650z;

    public /* synthetic */ C2477a2(Object obj, List list, int i13, int i14) {
        this.f9647w = i14;
        this.f9649y = obj;
        this.f9650z = list;
        this.f9648x = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f9647w) {
            case 0:
                ((Function1) this.f9649y).invoke(this.f9650z.get(this.f9648x));
                return C23454a0.f92919a;
            default:
                C24055q c24055q = (C24055q) this.f9649y;
                C26515b c26515b = (C26515b) ((ArrayList) this.f9650z).get(this.f9648x);
                c24055q.getClass();
                boolean z4 = c26515b.f105424c == null;
                EnumC14301a enumC14301a = (EnumC14301a) c24055q.f95072f;
                boolean z13 = enumC14301a == EnumC14301a.TYPE_PARAMETER_BOUNDS;
                if (!z4 && !z13) {
                    enumC14301a = EnumC14301a.TYPE_USE;
                }
                C14327t c14327t = c26515b.f105423b;
                if (c14327t != null) {
                    return (C14320m) c14327t.f52297a.get(enumC14301a);
                }
                return null;
        }
    }
}
