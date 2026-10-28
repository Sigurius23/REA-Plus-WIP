package mi2;

import p635y2.AbstractC39101i1;
import p635y2.AbstractC39104j1;
import p715kotlin.jvm.functions.Function1;
import sj1.AbstractC32563a;

/* JADX INFO: renamed from: mi2.j */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C25587j implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f100398w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC39104j1 f100399x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ float f100400y;

    public /* synthetic */ C25587j(AbstractC39104j1 abstractC39104j1, float f13, int i13) {
        this.f100398w = i13;
        this.f100399x = abstractC39104j1;
        this.f100400y = f13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f100398w) {
            case 0:
                return AbstractC25589l.m75287B(this.f100399x, this.f100400y, (AbstractC39101i1) obj);
            default:
                return AbstractC32563a.m101600l(this.f100399x, this.f100400y, (AbstractC39101i1) obj);
        }
    }
}
