package p12;

import i91.AbstractC18254h;
import p134f2.C14015d;
import p270k2.InterfaceC22129c;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: p12.p */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C28726p implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f116189w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C28716f f116190x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ AbstractC18254h f116191y;

    public /* synthetic */ C28726p(C28716f c28716f, AbstractC18254h abstractC18254h, int i13) {
        this.f116189w = i13;
        this.f116190x = c28716f;
        this.f116191y = abstractC18254h;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f116189w) {
            case 0:
                return AbstractC28734x.m87445p0(this.f116190x, this.f116191y, (C14015d) obj);
            default:
                return AbstractC28734x.m87447q0(this.f116190x, this.f116191y, (InterfaceC22129c) obj);
        }
    }
}
