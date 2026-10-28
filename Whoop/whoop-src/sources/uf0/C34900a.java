package uf0;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;
import sf0.C32445c;

/* JADX INFO: renamed from: uf0.a */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C34900a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f146981w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C32445c.c f146982x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f146983y;

    public /* synthetic */ C34900a(C32445c.c cVar, Function1 function1, int i13) {
        this.f146981w = i13;
        this.f146982x = cVar;
        this.f146983y = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f146981w) {
            case 0:
                return AbstractC34901b.m110042h(this.f146982x, this.f146983y);
            case 1:
                return AbstractC34901b.m110043i(this.f146982x, this.f146983y);
            case 2:
                return AbstractC34901b.m110044j(this.f146982x, this.f146983y);
            default:
                return AbstractC34901b.m110047m(this.f146982x, this.f146983y);
        }
    }
}
