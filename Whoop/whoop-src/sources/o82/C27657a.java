package o82;

import n82.C26457c;
import p329n0.InterfaceC26064q;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: o82.a */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C27657a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f111280w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C26457c f111281x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f111282y;

    public /* synthetic */ C27657a(Function1 function1, C26457c c26457c) {
        this.f111280w = 0;
        this.f111282y = function1;
        this.f111281x = c26457c;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f111280w) {
            case 0:
                return AbstractC27660d.m83633j(this.f111282y, this.f111281x, obj);
            case 1:
                return AbstractC27660d.m83634k(this.f111281x, this.f111282y, (InterfaceC26064q) obj);
            default:
                return AbstractC27660d.m83642s(this.f111281x, this.f111282y, (InterfaceC26064q) obj);
        }
    }

    public /* synthetic */ C27657a(C26457c c26457c, Function1 function1, int i13) {
        this.f111280w = i13;
        this.f111281x = c26457c;
        this.f111282y = function1;
    }
}
