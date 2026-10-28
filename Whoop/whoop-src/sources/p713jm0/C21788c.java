package p713jm0;

import p635y2.InterfaceC39147y;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.functions.Function1;
import z72.AbstractC40161g;

/* JADX INFO: renamed from: jm0.c */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C21788c implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f83933w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC39171c f83934x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f83935y;

    public /* synthetic */ C21788c(Function1 function1, InterfaceC39171c interfaceC39171c) {
        this.f83933w = 0;
        this.f83935y = function1;
        this.f83934x = interfaceC39171c;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f83933w) {
            case 0:
                return AbstractC21789d.m61643v(this.f83935y, this.f83934x, (InterfaceC39147y) obj);
            case 1:
                return AbstractC40161g.m128799M(this.f83934x, this.f83935y, (InterfaceC39147y) obj);
            default:
                return AbstractC40161g.m128795I(this.f83934x, this.f83935y, (InterfaceC39147y) obj);
        }
    }

    public /* synthetic */ C21788c(InterfaceC39171c interfaceC39171c, Function1 function1, int i13) {
        this.f83933w = i13;
        this.f83934x = interfaceC39171c;
        this.f83935y = function1;
    }
}
