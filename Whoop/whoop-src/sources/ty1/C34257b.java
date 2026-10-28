package ty1;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ty1.b */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C34257b implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f143683w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f143684x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C34266k f143685y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ String f143686z;

    public /* synthetic */ C34257b(int i13, String str, Function1 function1, C34266k c34266k) {
        this.f143683w = i13;
        this.f143684x = function1;
        this.f143685y = c34266k;
        this.f143686z = str;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f143683w) {
            case 0:
                return AbstractC34264i.m108361f0(this.f143684x, this.f143685y, this.f143686z);
            default:
                return AbstractC34264i.m108340Q(this.f143684x, this.f143685y, this.f143686z);
        }
    }
}
