package p748zc1;

import android.content.Context;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: zc1.o6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C40424o6 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f174385w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28601c1 f174386x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f174387y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Context f174388z;

    public /* synthetic */ C40424o6(InterfaceC28601c1 interfaceC28601c1, int i13, Context context, int i14) {
        this.f174385w = i14;
        this.f174386x = interfaceC28601c1;
        this.f174387y = i13;
        this.f174388z = context;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f174385w;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        switch (i13) {
            case 0:
                return AbstractC40434p6.m130619p(this.f174386x, this.f174387y, this.f174388z, zBooleanValue);
            case 1:
                return AbstractC40434p6.m130615l(this.f174386x, this.f174387y, this.f174388z, zBooleanValue);
            default:
                return AbstractC40434p6.m130617n(this.f174386x, this.f174387y, this.f174388z, zBooleanValue);
        }
    }
}
