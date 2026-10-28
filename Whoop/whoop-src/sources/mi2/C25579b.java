package mi2;

import c93.InterfaceC4339a;
import ji2.C21726e;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: mi2.b */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C25579b implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f100353w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f100354x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C21726e f100355y;

    public /* synthetic */ C25579b(Function1 function1, C21726e c21726e, int i13) {
        this.f100353w = i13;
        this.f100354x = function1;
        this.f100355y = c21726e;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f100353w) {
            case 0:
                return AbstractC25580c.m75234w(this.f100354x, this.f100355y);
            default:
                return AbstractC25580c.m75232u(this.f100354x, this.f100355y);
        }
    }
}
