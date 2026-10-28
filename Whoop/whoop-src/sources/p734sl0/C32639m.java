package p734sl0;

import android.net.Uri;
import c93.InterfaceC4351m;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: sl0.m */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C32639m implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f135285w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f135286x;

    public /* synthetic */ C32639m(Function1 function1, int i13) {
        this.f135285w = i13;
        this.f135286x = function1;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f135285w) {
            case 0:
                return AbstractC32654p.m102112p(this.f135286x, (String) obj, (Uri) obj2);
            case 1:
                return AbstractC32650o0.m102087y(this.f135286x, (String) obj, (Uri) obj2);
            default:
                return AbstractC32700z1.m102620g(this.f135286x, (Uri) obj, (String) obj2);
        }
    }
}
