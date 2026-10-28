package pt2;

import c93.InterfaceC4339a;
import ot2.AbstractC28344m;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: pt2.o */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C29533o implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f120266w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC28344m.i f120267x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f120268y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC28601c1 f120269z;

    public /* synthetic */ C29533o(Function1 function1, AbstractC28344m.i iVar, InterfaceC28601c1 interfaceC28601c1, int i13) {
        this.f120266w = i13;
        this.f120268y = function1;
        this.f120267x = iVar;
        this.f120269z = interfaceC28601c1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f120266w) {
            case 0:
                return AbstractC29540v.m90430l0(this.f120267x, this.f120268y, this.f120269z);
            case 1:
                return AbstractC29540v.m90444s0(this.f120267x, this.f120268y, this.f120269z);
            case 2:
                return AbstractC29540v.m90367D0(this.f120268y, this.f120267x, this.f120269z);
            default:
                return AbstractC29540v.m90369E0(this.f120268y, this.f120267x, this.f120269z);
        }
    }

    public /* synthetic */ C29533o(AbstractC28344m.i iVar, Function1 function1, InterfaceC28601c1 interfaceC28601c1, int i13) {
        this.f120266w = i13;
        this.f120267x = iVar;
        this.f120268y = function1;
        this.f120269z = interfaceC28601c1;
    }
}
