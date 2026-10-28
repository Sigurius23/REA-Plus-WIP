package kotlin;

import p715kotlin.jvm.functions.Function1;
import ws2.AbstractC37617i;

/* JADX INFO: renamed from: at2.j */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C2010j implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f7984w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f7985x;

    public /* synthetic */ C2010j(Function1 function1, int i13) {
        this.f7984w = i13;
        this.f7985x = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f7984w) {
            case 0:
                return AbstractC2016m.m6232S(this.f7985x, (AbstractC37617i) obj);
            case 1:
                return AbstractC2016m.m6230Q(this.f7985x, (AbstractC37617i) obj);
            case 2:
                return AbstractC2016m.m6249e0(this.f7985x, (AbstractC37617i) obj);
            case 3:
                return AbstractC2016m.m6245c0(this.f7985x, (AbstractC37617i) obj);
            case 4:
                return AbstractC2016m.m6236W(this.f7985x, (AbstractC37617i) obj);
            case 5:
                return AbstractC2016m.m6241a0(this.f7985x, (AbstractC37617i) obj);
            case 6:
                return AbstractC2016m.m6253g0(this.f7985x, (AbstractC37617i) obj);
            case 7:
                return AbstractC2016m.m6228O(this.f7985x, (AbstractC37617i) obj);
            case 8:
                return AbstractC2016m.m6238Y(this.f7985x, (AbstractC37617i) obj);
            case 9:
                return AbstractC2016m.m6257i0(this.f7985x, (AbstractC37617i) obj);
            case 10:
                return AbstractC2016m.m6234U(this.f7985x, (AbstractC37617i) obj);
            case 11:
                return AbstractC2036w.m6368H(this.f7985x, ((Integer) obj).intValue());
            case 12:
                return AbstractC2036w.m6369I(this.f7985x, (String) obj);
            case 13:
                return AbstractC2036w.m6366F(this.f7985x, (String) obj);
            case 14:
                return AbstractC2003f1.m6160i(this.f7985x, (String) obj);
            case 15:
                return AbstractC2003f1.m6162k(this.f7985x, ((Integer) obj).intValue());
            default:
                return AbstractC2003f1.m6163l(this.f7985x, (String) obj);
        }
    }
}
