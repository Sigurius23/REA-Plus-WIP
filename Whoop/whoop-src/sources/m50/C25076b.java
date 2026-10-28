package m50;

import p390p1.InterfaceC28593a1;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: m50.b */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C25076b implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC28601c1 f98208E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f98209w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f98210x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C25078d f98211y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC28593a1 f98212z;

    public /* synthetic */ C25076b(Function1 function1, C25078d c25078d, InterfaceC28593a1 interfaceC28593a1, InterfaceC28601c1 interfaceC28601c1) {
        this.f98210x = function1;
        this.f98211y = c25078d;
        this.f98212z = interfaceC28593a1;
        this.f98208E = interfaceC28601c1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f98209w;
        int iIntValue = ((Integer) obj).intValue();
        switch (i13) {
            case 0:
                Function1 function1 = this.f98210x;
                return AbstractC25077c.m73550h(this.f98211y, this.f98208E, function1, this.f98212z, iIntValue);
            default:
                return AbstractC25077c.m73551i(this.f98210x, this.f98211y, this.f98212z, this.f98208E, iIntValue);
        }
    }

    public /* synthetic */ C25076b(C25078d c25078d, InterfaceC28601c1 interfaceC28601c1, Function1 function1, InterfaceC28593a1 interfaceC28593a1) {
        this.f98211y = c25078d;
        this.f98208E = interfaceC28601c1;
        this.f98210x = function1;
        this.f98212z = interfaceC28593a1;
    }
}
