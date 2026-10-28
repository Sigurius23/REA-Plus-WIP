package mk1;

import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: mk1.b */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C25630b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f100572w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C25633e f100573x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f100574y;

    public /* synthetic */ C25630b(C25633e c25633e, Function1 function1, int i13) {
        this.f100572w = i13;
        this.f100573x = c25633e;
        this.f100574y = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f100572w) {
            case 0:
                return AbstractC25631c.m75416l(this.f100573x, this.f100574y, obj);
            default:
                return AbstractC25631c.m75420p(this.f100573x, this.f100574y, obj);
        }
    }
}
