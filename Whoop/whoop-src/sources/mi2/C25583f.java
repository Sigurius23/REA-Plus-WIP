package mi2;

import ji2.C21727f;
import p329n0.InterfaceC26064q;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: mi2.f */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C25583f implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f100372w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f100373x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C21727f f100374y;

    public /* synthetic */ C25583f(int i13, C21727f c21727f, Function1 function1) {
        this.f100372w = i13;
        this.f100374y = c21727f;
        this.f100373x = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f100372w) {
            case 0:
                return AbstractC25586i.m75279x(this.f100374y, this.f100373x, ((Boolean) obj).booleanValue());
            case 1:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                return AbstractC25586i.m75246E(this.f100373x, this.f100374y, zBooleanValue);
            default:
                return AbstractC25586i.m75275t(this.f100374y, this.f100373x, (InterfaceC26064q) obj);
        }
    }

    public /* synthetic */ C25583f(Function1 function1, C21727f c21727f) {
        this.f100372w = 1;
        this.f100373x = function1;
        this.f100374y = c21727f;
    }
}
