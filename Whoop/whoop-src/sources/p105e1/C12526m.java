package p105e1;

import l83.C23454a0;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39104j1;
import p636y3.C39178j;
import p636y3.EnumC39181m;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: e1.m */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C12526m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f42791w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC39104j1 f42792x;

    public /* synthetic */ C12526m(AbstractC39104j1 abstractC39104j1, int i13) {
        this.f42791w = i13;
        this.f42792x = abstractC39104j1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AbstractC39101i1 abstractC39101i1 = (AbstractC39101i1) obj;
        switch (this.f42791w) {
            case 0:
                abstractC39101i1.m124632f(this.f42792x, 0, 0, 0.0f);
                break;
            case 1:
                abstractC39101i1.m124632f(this.f42792x, 0, 0, 0.0f);
                break;
            case 2:
                AbstractC39101i1.m124624n(this.f42792x, 0, 0, abstractC39101i1);
                break;
            case 3:
                AbstractC39101i1.m124624n(this.f42792x, 0, 0, abstractC39101i1);
                break;
            case 4:
                EnumC39181m enumC39181mMo124630c = abstractC39101i1.mo124630c();
                EnumC39181m enumC39181m = EnumC39181m.f168423w;
                AbstractC39104j1 abstractC39104j1 = this.f42792x;
                if (enumC39181mMo124630c == enumC39181m || abstractC39101i1.mo124631e() == 0) {
                    AbstractC39101i1.m124621a(abstractC39104j1, abstractC39101i1);
                    abstractC39104j1.mo453o0(C39178j.m124794d(0L, abstractC39104j1.f168210E), 0.0f, null);
                } else {
                    int i13 = (int) 0;
                    long jMo124631e = ((long) ((abstractC39101i1.mo124631e() - abstractC39104j1.f168211w) - i13)) << 32;
                    AbstractC39101i1.m124621a(abstractC39104j1, abstractC39101i1);
                    abstractC39104j1.mo453o0(C39178j.m124794d((((long) i13) & 4294967295L) | jMo124631e, abstractC39104j1.f168210E), 0.0f, null);
                }
                return C23454a0.f92919a;
            case 5:
                AbstractC39101i1.m124624n(this.f42792x, 0, 0, abstractC39101i1);
                break;
            default:
                AbstractC39101i1.m124624n(this.f42792x, 0, 0, abstractC39101i1);
                break;
        }
        return C23454a0.f92919a;
    }
}
