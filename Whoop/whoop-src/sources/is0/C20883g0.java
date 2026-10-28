package is0;

import c93.InterfaceC4339a;
import i91.AbstractC18254h;
import java.util.List;
import n71.AbstractC26434o;
import p270k2.InterfaceC22131e;
import p390p1.InterfaceC28690z0;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: is0.g0 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C20883g0 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f78584w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f78585x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f78586y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f78587z;

    public /* synthetic */ C20883g0(long j7, InterfaceC4339a interfaceC4339a, InterfaceC28690z0 interfaceC28690z0) {
        this.f78585x = j7;
        this.f78586y = interfaceC4339a;
        this.f78587z = interfaceC28690z0;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f78584w) {
            case 0:
                return AbstractC20889j0.m57762c0(this.f78585x, (InterfaceC4339a) this.f78586y, (InterfaceC28690z0) this.f78587z, (InterfaceC22131e) obj);
            default:
                return AbstractC26434o.m78253z((List) this.f78586y, (AbstractC18254h) this.f78587z, this.f78585x, (InterfaceC22131e) obj);
        }
    }

    public /* synthetic */ C20883g0(List list, AbstractC18254h abstractC18254h, long j7) {
        this.f78586y = list;
        this.f78587z = abstractC18254h;
        this.f78585x = j7;
    }
}
