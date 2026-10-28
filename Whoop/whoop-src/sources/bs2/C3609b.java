package bs2;

import android.content.Context;
import b30.C2598p3;
import bm2.C3433d0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import l41.AbstractC23332d;
import l83.InterfaceC23459e;
import org.joda.time.LocalTime;
import p00.C28573j;
import p390p1.InterfaceC28601c1;
import p465rm.InterfaceC31544k;
import p696zy.C41210b;
import p715kotlin.jvm.functions.Function1;
import t20.C33333n;

/* JADX INFO: renamed from: bs2.b */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C3609b implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f14671E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f14672F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f14673G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ InterfaceC23459e f14674H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f14675w = 2;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f14676x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f14677y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f14678z;

    public /* synthetic */ C3609b(C41210b c41210b, boolean z4, C28573j c28573j, boolean z13, C33333n c33333n, boolean z14, C28573j c28573j2) {
        this.f14671E = c41210b;
        this.f14676x = z4;
        this.f14672F = c28573j;
        this.f14677y = z13;
        this.f14673G = c33333n;
        this.f14678z = z14;
        this.f14674H = c28573j2;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f14675w) {
            case 0:
                return AbstractC3613f.m10968g(this.f14676x, (InterfaceC31544k) this.f14671E, this.f14677y, this.f14678z, (InterfaceC4339a) this.f14672F, (InterfaceC4339a) this.f14673G, (InterfaceC4339a) this.f14674H, (Context) obj);
            case 1:
                return AbstractC23332d.m67561h(this.f14676x, (LocalTime) this.f14671E, (InterfaceC28601c1) this.f14672F, (InterfaceC28601c1) this.f14673G, this.f14677y, this.f14678z, (InterfaceC4351m) this.f14674H, (Context) obj);
            default:
                C41210b c41210b = (C41210b) this.f14671E;
                C28573j c28573j = (C28573j) this.f14672F;
                C33333n c33333n = (C33333n) this.f14673G;
                return new C2598p3(c41210b, this.f14676x, new C3433d0(this.f14678z, c33333n, (C28573j) this.f14674H, 9), c28573j, this.f14677y, c33333n.f139027f);
        }
    }

    public /* synthetic */ C3609b(boolean z4, LocalTime localTime, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, boolean z13, boolean z14, InterfaceC4351m interfaceC4351m) {
        this.f14676x = z4;
        this.f14671E = localTime;
        this.f14672F = interfaceC28601c1;
        this.f14673G = interfaceC28601c2;
        this.f14677y = z13;
        this.f14678z = z14;
        this.f14674H = interfaceC4351m;
    }

    public /* synthetic */ C3609b(boolean z4, InterfaceC31544k interfaceC31544k, boolean z13, boolean z14, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3) {
        this.f14676x = z4;
        this.f14671E = interfaceC31544k;
        this.f14677y = z13;
        this.f14678z = z14;
        this.f14672F = interfaceC4339a;
        this.f14673G = interfaceC4339a2;
        this.f14674H = interfaceC4339a3;
    }
}
