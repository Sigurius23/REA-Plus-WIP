package t20;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p484s9.AbstractC32281f;
import wi0.AbstractC37313e;
import yw1.AbstractC39822i;

/* JADX INFO: renamed from: t20.o */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C33334o implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f139048E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f139049w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f139050x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC4339a f139051y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC4339a f139052z;

    public /* synthetic */ C33334o(InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, String str, int i13) {
        this.f139049w = 0;
        this.f139051y = interfaceC4339a;
        this.f139052z = interfaceC4339a2;
        this.f139050x = str;
        this.f139048E = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f139049w) {
            case 0:
                ((Integer) obj2).intValue();
                int iM87244L = AbstractC28683x.m87244L(this.f139048E | 1);
                AbstractC32281f.m100437b(this.f139050x, this.f139051y, this.f139052z, (Composer) obj, iM87244L);
                return C23454a0.f92919a;
            case 1:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC37313e.m119500J(this.f139050x, this.f139051y, this.f139052z, this.f139048E, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC39822i.m127687L(this.f139050x, this.f139051y, this.f139052z, this.f139048E, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C33334o(String str, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, int i14) {
        this.f139049w = i14;
        this.f139050x = str;
        this.f139051y = interfaceC4339a;
        this.f139052z = interfaceC4339a2;
        this.f139048E = i13;
    }
}
