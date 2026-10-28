package m23;

import c93.InterfaceC4339a;
import l83.C23454a0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m23.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C24967a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f97713w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C24970d f97714x;

    public /* synthetic */ C24967a(C24970d c24970d, int i13) {
        this.f97713w = i13;
        this.f97714x = c24970d;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f97713w) {
            case 0:
                C24970d this$0 = this.f97714x;
                AbstractC22676k.m65750j(this$0, "this$0");
                this$0.m73292c();
                return C23454a0.f92919a;
            default:
                return Boolean.valueOf(C24970d.m73291b(this.f97714x));
        }
    }
}
