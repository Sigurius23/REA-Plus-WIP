package p734sl0;

import android.net.Uri;
import p164g2.InterfaceC15250v;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: sl0.e */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C32599e implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f135088w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f135089x;

    public /* synthetic */ C32599e(Function1 function1, int i13) {
        this.f135088w = i13;
        this.f135089x = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f135088w) {
            case 0:
                return AbstractC32619i.m101815G(this.f135089x, (InterfaceC15250v) obj);
            case 1:
                return AbstractC32654p.m102110n(this.f135089x, (Uri) obj);
            default:
                return AbstractC32650o0.m102085w(this.f135089x, (Uri) obj);
        }
    }
}
