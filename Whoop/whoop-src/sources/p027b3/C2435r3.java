package p027b3;

import android.view.View;
import androidx.lifecycle.EnumC1632v;
import androidx.lifecycle.InterfaceC1577e0;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.AbstractC3006f0;
import bc3.C3033m;
import bc3.EnumC2998d0;
import bc3.InterfaceC3025k;
import hc3.C17171d;
import java.util.ArrayList;
import l83.C23454a0;
import p007a6.C0419f;
import p117eh.C13184a;
import p390p1.C28688y1;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: b3.r3 */
/* JADX INFO: loaded from: classes.dex */
public final class C2435r3 implements InterfaceC1577e0 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ View f9531E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C17171d f9532w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C2363d1 f9533x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C28688y1 f9534y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C22669g0 f9535z;

    public C2435r3(C17171d c17171d, C2363d1 c2363d1, C28688y1 c28688y1, C22669g0 c22669g0, View view) {
        this.f9532w = c17171d;
        this.f9533x = c2363d1;
        this.f9534y = c28688y1;
        this.f9535z = c22669g0;
        this.f9531E = view;
    }

    @Override // androidx.lifecycle.InterfaceC1577e0
    /* JADX INFO: renamed from: h */
    public final void mo4080h(InterfaceC1585g0 interfaceC1585g0, EnumC1632v enumC1632v) {
        boolean z4;
        InterfaceC3025k interfaceC3025kM87291w = null;
        switch (AbstractC2430q3.f9519a[enumC1632v.ordinal()]) {
            case 1:
                AbstractC3006f0.m8732z(this.f9532w, null, EnumC2998d0.f12007z, new C0419f(this.f9535z, this.f9534y, interfaceC1585g0, this, this.f9531E, null), 1);
                return;
            case 2:
                C2363d1 c2363d1 = this.f9533x;
                if (c2363d1 != null) {
                    C13184a c13184a = (C13184a) c2363d1.f9329y;
                    synchronized (c13184a.f45697b) {
                        try {
                            synchronized (c13184a.f45697b) {
                                z4 = c13184a.f45696a;
                            }
                            if (!z4) {
                                ArrayList arrayList = (ArrayList) c13184a.f45698c;
                                c13184a.f45698c = (ArrayList) c13184a.f45699d;
                                c13184a.f45699d = arrayList;
                                c13184a.f45696a = true;
                                int size = arrayList.size();
                                for (int i13 = 0; i13 < size; i13++) {
                                    ((InterfaceC30057d) arrayList.get(i13)).resumeWith(C23454a0.f92919a);
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
                C28688y1 c28688y1 = this.f9534y;
                synchronized (c28688y1.f116037c) {
                    if (c28688y1.f116054t) {
                        c28688y1.f116054t = false;
                        interfaceC3025kM87291w = c28688y1.m87291w();
                    }
                    break;
                }
                if (interfaceC3025kM87291w != null) {
                    ((C3033m) interfaceC3025kM87291w).resumeWith(C23454a0.f92919a);
                    return;
                }
                return;
            case 3:
                C28688y1 c28688y2 = this.f9534y;
                synchronized (c28688y2.f116037c) {
                    c28688y2.f116054t = true;
                }
                return;
            case 4:
                this.f9534y.m87290v();
                return;
            case 5:
            case 6:
            case 7:
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
