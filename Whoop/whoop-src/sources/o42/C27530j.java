package o42;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import l83.C23454a0;
import l83.InterfaceC23459e;
import p390p1.AbstractC28683x;
import p715kotlin.jvm.functions.Function1;
import p748zc1.AbstractC40306d8;
import se.AbstractC32410a;

/* JADX INFO: renamed from: o42.j */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C27530j implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f110829E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f110830w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f110831x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f110832y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f110833z;

    public /* synthetic */ C27530j(String str, boolean z4, boolean z13, int i13) {
        this.f110830w = 2;
        this.f110829E = str;
        this.f110831x = z4;
        this.f110832y = z13;
        this.f110833z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f110830w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC27531k.m82976J(this.f110831x, this.f110832y, (Function1) this.f110829E, this.f110833z, (Composer) obj, iIntValue);
            case 1:
                ((Integer) obj2).intValue();
                int iM87244L = AbstractC28683x.m87244L(this.f110833z | 1);
                AbstractC32410a.m101032h(this.f110831x, this.f110832y, (InterfaceC4339a) this.f110829E, (Composer) obj, iM87244L);
                return C23454a0.f92919a;
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC40306d8.m129595h((String) this.f110829E, this.f110831x, this.f110832y, this.f110833z, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C27530j(boolean z4, boolean z13, InterfaceC23459e interfaceC23459e, int i13, int i14) {
        this.f110830w = i14;
        this.f110831x = z4;
        this.f110832y = z13;
        this.f110829E = interfaceC23459e;
        this.f110833z = i13;
    }
}
