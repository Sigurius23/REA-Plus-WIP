package p748zc1;

import android.content.Context;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: zc1.g */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C40330g implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f174258w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Context f174259x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC28601c1 f174260y;

    public /* synthetic */ C40330g(Context context, InterfaceC28601c1 interfaceC28601c1, int i13) {
        this.f174258w = i13;
        this.f174259x = context;
        this.f174260y = interfaceC28601c1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f174258w) {
            case 0:
                return AbstractC40341h.m129829j(this.f174259x, this.f174260y, obj);
            case 1:
                return AbstractC40341h.m129830k(this.f174259x, this.f174260y, obj);
            case 2:
                int iIntValue = ((Integer) obj).intValue();
                return AbstractC40481u3.m130923k(this.f174260y, this.f174259x, iIntValue);
            case 3:
                int iIntValue2 = ((Integer) obj).intValue();
                return AbstractC40481u3.m130926n(this.f174260y, this.f174259x, iIntValue2);
            case 4:
                int iIntValue3 = ((Integer) obj).intValue();
                return AbstractC40481u3.m130925m(this.f174260y, this.f174259x, iIntValue3);
            default:
                return AbstractC40402m5.m130316x(this.f174259x, this.f174260y, ((Integer) obj).intValue());
        }
    }

    public /* synthetic */ C40330g(InterfaceC28601c1 interfaceC28601c1, Context context, int i13) {
        this.f174258w = i13;
        this.f174260y = interfaceC28601c1;
        this.f174259x = context;
    }
}
