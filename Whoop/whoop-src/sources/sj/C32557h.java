package sj;

import com.amplitude.android.engagement.C4861a;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: sj.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C32557h extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f134883w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C4861a f134884x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C32561l f134885y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C32557h(C4861a c4861a, C32561l c32561l, int i13) {
        super(1);
        this.f134883w = i13;
        this.f134884x = c4861a;
        this.f134885y = c32561l;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f134883w) {
            case 0:
                String url = (String) obj;
                AbstractC22676k.m65750j(url, "url");
                C32561l c32561l = this.f134885y;
                this.f134884x.m15518d(c32561l.f134896a.getVariantId(), c32561l.f134898c, url);
                break;
            default:
                String url2 = (String) obj;
                AbstractC22676k.m65750j(url2, "url");
                C32561l c32561l2 = this.f134885y;
                this.f134884x.m15518d(c32561l2.f134896a.getVariantId(), c32561l2.f134898c, url2);
                break;
        }
        return C23454a0.f92919a;
    }
}
