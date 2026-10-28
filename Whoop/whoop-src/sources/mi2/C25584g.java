package mi2;

import c93.InterfaceC4339a;
import ji2.C21727f;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: mi2.g */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C25584g implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f100375w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f100376x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C21727f f100377y;

    public /* synthetic */ C25584g(int i13, C21727f c21727f, Function1 function1) {
        this.f100375w = i13;
        this.f100376x = function1;
        this.f100377y = c21727f;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f100375w) {
            case 0:
                return AbstractC25586i.m75252K(this.f100376x, this.f100377y);
            default:
                return AbstractC25586i.m75272q(this.f100376x, this.f100377y);
        }
    }
}
