package p734sl0;

import c93.InterfaceC4339a;
import java.util.List;
import l83.InterfaceC23459e;
import p390p1.InterfaceC28601c1;
import p412q3.C29891y;
import p715kotlin.jvm.functions.Function3;
import ql0.InterfaceC30468c;

/* JADX INFO: renamed from: sl0.d */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C32594d implements InterfaceC4339a {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f135063E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f135064F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ InterfaceC23459e f135065G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f135066w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f135067x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f135068y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC4339a f135069z;

    public /* synthetic */ C32594d(boolean z4, InterfaceC4339a interfaceC4339a, boolean z13, InterfaceC28601c1 interfaceC28601c1, List list, Function3 function3) {
        this.f135067x = z4;
        this.f135069z = interfaceC4339a;
        this.f135068y = z13;
        this.f135063E = interfaceC28601c1;
        this.f135064F = list;
        this.f135065G = function3;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f135066w) {
            case 0:
                return AbstractC32619i.m101812D(this.f135067x, this.f135069z, this.f135068y, (InterfaceC28601c1) this.f135063E, (List) this.f135064F, (Function3) this.f135065G);
            default:
                return AbstractC32658p3.m102217q(this.f135067x, (C29891y) this.f135063E, this.f135068y, (InterfaceC30468c) this.f135064F, this.f135069z, (InterfaceC4339a) this.f135065G);
        }
    }

    public /* synthetic */ C32594d(boolean z4, C29891y c29891y, boolean z13, InterfaceC30468c interfaceC30468c, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
        this.f135067x = z4;
        this.f135063E = c29891y;
        this.f135068y = z13;
        this.f135064F = interfaceC30468c;
        this.f135069z = interfaceC4339a;
        this.f135065G = interfaceC4339a2;
    }
}
