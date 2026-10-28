package p197hj;

import c93.InterfaceC4339a;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: hj.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C17333p extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f67132w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f67133x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f67134y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17333p(int i13, int i14, String str) {
        super(0);
        this.f67132w = i13;
        this.f67133x = i14;
        this.f67134y = str;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        StringBuilder sb4 = new StringBuilder("AmplitudeEngagement.sdk[internal]#handleLinkTap(variantId=");
        sb4.append(this.f67132w);
        sb4.append(", stepIndex=");
        sb4.append(this.f67133x);
        sb4.append(", url=");
        return AbstractC25012a.m73377j(sb4, this.f67134y, ')');
    }
}
