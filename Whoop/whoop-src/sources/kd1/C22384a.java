package kd1;

import android.webkit.WebView;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;
import p748zc1.AbstractC40406m9;

/* JADX INFO: renamed from: kd1.a */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C22384a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f87567w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f87568x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC28601c1 f87569y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC28601c1 f87570z;

    public /* synthetic */ C22384a(String str, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, int i13) {
        this.f87567w = i13;
        this.f87568x = str;
        this.f87569y = interfaceC28601c1;
        this.f87570z = interfaceC28601c2;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f87567w) {
            case 0:
                return AbstractC22390d.m64400K(this.f87568x, this.f87569y, this.f87570z, (WebView) obj);
            default:
                return AbstractC40406m9.m130394h(this.f87568x, this.f87569y, this.f87570z, obj);
        }
    }
}
