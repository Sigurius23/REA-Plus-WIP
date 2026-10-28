package gf1;

import p715kotlin.jvm.functions.Function1;
import w71.AbstractC36884g0;

/* JADX INFO: renamed from: gf1.f */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C15787f implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f59491w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f59492x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Integer f59493y;

    public /* synthetic */ C15787f(Function1 function1, Integer num, int i13) {
        this.f59491w = i13;
        this.f59492x = function1;
        this.f59493y = num;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f59491w) {
            case 0:
                return AbstractC15788g.m44496B(this.f59492x, this.f59493y, obj);
            default:
                return AbstractC36884g0.m118350f(this.f59492x, this.f59493y, ((Integer) obj).intValue());
        }
    }
}
