package ch;

import coil.compose.AsyncImagePainter$State$Error;
import coil.compose.AsyncImagePainter$State$Loading;
import coil.compose.AsyncImagePainter$State$Success;
import l83.C23454a0;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ch.u */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4600u implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f18502w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f18503x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f18504y;

    public /* synthetic */ C4600u(Function1 function1, int i13, Function1 function2) {
        this.f18502w = i13;
        this.f18503x = function1;
        this.f18504y = function2;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f18502w) {
            case 0:
                AbstractC4585f abstractC4585f = (AbstractC4585f) obj;
                if (!(abstractC4585f instanceof AsyncImagePainter$State$Loading)) {
                    if (abstractC4585f instanceof AsyncImagePainter$State$Success) {
                        Function1 function1 = this.f18503x;
                        if (function1 != null) {
                            function1.invoke(abstractC4585f);
                        }
                    } else if (abstractC4585f instanceof AsyncImagePainter$State$Error) {
                        Function1 function2 = this.f18504y;
                        if (function2 != null) {
                            function2.invoke(abstractC4585f);
                        }
                    } else if (!(abstractC4585f instanceof C4584e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return C23454a0.f92919a;
            case 1:
                this.f18503x.invoke(obj);
                this.f18504y.invoke(obj);
                break;
            default:
                this.f18503x.invoke(obj);
                this.f18504y.invoke(obj);
                break;
        }
        return C23454a0.f92919a;
    }
}
