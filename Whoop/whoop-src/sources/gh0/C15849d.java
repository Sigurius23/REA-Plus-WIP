package gh0;

import c93.InterfaceC4339a;
import p390p1.InterfaceC28601c1;
import p668z1.C39967p;
import p715kotlin.jvm.functions.Function1;
import p734sl0.AbstractC32681u2;

/* JADX INFO: renamed from: gh0.d */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C15849d implements InterfaceC4339a {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC28601c1 f59862E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ InterfaceC28601c1 f59863F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f59864w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f59865x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f59866y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C39967p f59867z;

    public /* synthetic */ C15849d(String str, Function1 function1, C39967p c39967p, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
        this.f59865x = str;
        this.f59866y = function1;
        this.f59867z = c39967p;
        this.f59862E = interfaceC28601c1;
        this.f59863F = interfaceC28601c2;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f59864w) {
            case 0:
                InterfaceC28601c1 interfaceC28601c1 = this.f59862E;
                InterfaceC28601c1 interfaceC28601c2 = this.f59863F;
                return AbstractC15850e.m44711G(this.f59866y, this.f59865x, this.f59867z, interfaceC28601c1, interfaceC28601c2);
            default:
                return AbstractC32681u2.m102454G(this.f59865x, this.f59866y, this.f59867z, this.f59862E, this.f59863F);
        }
    }

    public /* synthetic */ C15849d(Function1 function1, String str, C39967p c39967p, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
        this.f59866y = function1;
        this.f59865x = str;
        this.f59867z = c39967p;
        this.f59862E = interfaceC28601c1;
        this.f59863F = interfaceC28601c2;
    }
}
