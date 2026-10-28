package mi2;

import ji2.C21728g;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: mi2.m */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C25590m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f100404w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f100405x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C21728g f100406y;

    public /* synthetic */ C25590m(Function1 function1, C21728g c21728g, int i13) {
        this.f100404w = i13;
        this.f100405x = function1;
        this.f100406y = c21728g;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f100404w) {
            case 0:
                return AbstractC25593p.m75329p(this.f100405x, this.f100406y, obj);
            default:
                return AbstractC25593p.m75326m(this.f100405x, this.f100406y, obj);
        }
    }
}
