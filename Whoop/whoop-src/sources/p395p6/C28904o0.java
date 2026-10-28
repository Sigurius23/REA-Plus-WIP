package p395p6;

import java.util.List;
import l83.C23454a0;
import m83.AbstractC25260n;
import p451r6.C30947a;
import p451r6.C30948b;
import p451r6.C30949c;
import p451r6.C30958l;
import p451r6.C30959m;
import p451r6.C30960n;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: p6.o0 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C28904o0 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f116993w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC28916s0 f116994x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int[] f116995y;

    public /* synthetic */ C28904o0(AbstractC28916s0 abstractC28916s0, int[] iArr, int i13) {
        this.f116993w = i13;
        this.f116994x = abstractC28916s0;
        this.f116995y = iArr;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C30947a c30947a = (C30947a) obj;
        switch (this.f116993w) {
            case 0:
                C30948b c30948bM95194s = C30949c.m95194s();
                String canonicalName = this.f116994x.getClass().getCanonicalName();
                c30948bM95194s.m4554c();
                C30949c.m95191n((C30949c) c30948bM95194s.f5992x, canonicalName);
                List listM74045U0 = AbstractC25260n.m74045U0(this.f116995y);
                c30948bM95194s.m4554c();
                C30949c.m95192o((C30949c) c30948bM95194s.f5992x, listM74045U0);
                C30949c c30949c = (C30949c) c30948bM95194s.m4552a();
                c30947a.m4554c();
                C30960n.m95231p((C30960n) c30947a.f5992x, c30949c);
                break;
            default:
                C30958l c30958lM95224s = C30959m.m95224s();
                String canonicalName2 = this.f116994x.getClass().getCanonicalName();
                c30958lM95224s.m4554c();
                C30959m.m95221n((C30959m) c30958lM95224s.f5992x, canonicalName2);
                List listM74045U1 = AbstractC25260n.m74045U0(this.f116995y);
                c30958lM95224s.m4554c();
                C30959m.m95222o((C30959m) c30958lM95224s.f5992x, listM74045U1);
                C30959m c30959m = (C30959m) c30958lM95224s.m4552a();
                c30947a.m4554c();
                C30960n.m95229n((C30960n) c30947a.f5992x, c30959m);
                break;
        }
        return C23454a0.f92919a;
    }
}
