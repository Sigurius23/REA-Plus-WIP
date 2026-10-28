package d30;

import ec3.InterfaceC13062m;
import h20.C16687l;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import l83.C23454a0;
import m83.AbstractC25265s;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: d30.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C11523d implements InterfaceC13062m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f37127w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C11535h f37128x;

    public /* synthetic */ C11523d(C11535h c11535h, int i13) {
        this.f37127w = i13;
        this.f37128x = c11535h;
    }

    @Override // ec3.InterfaceC13062m
    public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f37127w) {
            case 0:
                C11570x c11570x = (C11570x) obj;
                boolean z4 = c11570x.f37345c;
                List list = c11570x.f37343a;
                if (!z4 && !c11570x.f37346d && list.size() == 1) {
                    C16687l c16687l = (C16687l) AbstractC25265s.m74096F0(list);
                    C11535h c11535h = this.f37128x;
                    ((Function1) c11535h.f37188e).invoke(c16687l);
                    if (!((AtomicBoolean) c11535h.f37192i).getAndSet(true)) {
                        ((Function1) c11535h.f37190g).invoke(Boolean.TRUE);
                    }
                }
                break;
            default:
                if (((List) obj).isEmpty()) {
                    C11535h c11535h2 = this.f37128x;
                    if (!((AtomicBoolean) c11535h2.f37192i).getAndSet(true)) {
                        ((Function1) c11535h2.f37190g).invoke(Boolean.FALSE);
                    }
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
