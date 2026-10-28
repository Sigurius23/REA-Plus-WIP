package kotlin;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;
import pt2.AbstractC29527i;
import v41.AbstractC35664f;

/* JADX INFO: renamed from: at2.n */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C2018n implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f8010w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC2994c0 f8011x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f8012y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ AbstractC35664f.a f8013z;

    public /* synthetic */ C2018n(InterfaceC2994c0 interfaceC2994c0, Function1 function1, AbstractC35664f.a aVar, int i13) {
        this.f8010w = i13;
        this.f8011x = interfaceC2994c0;
        this.f8012y = function1;
        this.f8013z = aVar;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f8010w) {
            case 0:
                return AbstractC2036w.m6378R(this.f8011x, this.f8012y, this.f8013z);
            default:
                return AbstractC29527i.m90254Z(this.f8011x, this.f8012y, this.f8013z);
        }
    }
}
