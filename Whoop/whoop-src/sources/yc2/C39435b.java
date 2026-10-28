package yc2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import p715kotlin.jvm.functions.Function1;
import xc2.InterfaceC38193d;

/* JADX INFO: renamed from: yc2.b */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C39435b implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f169673w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC38193d f169674x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f169675y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC4339a f169676z;

    public /* synthetic */ C39435b(InterfaceC38193d interfaceC38193d, Function1 function1, InterfaceC4339a interfaceC4339a, int i13) {
        this.f169673w = i13;
        this.f169674x = interfaceC38193d;
        this.f169675y = function1;
        this.f169676z = interfaceC4339a;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f169673w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC39436c.m125961K(this.f169674x, this.f169675y, this.f169676z, composer, iIntValue);
            default:
                return AbstractC39436c.m125962L(this.f169674x, this.f169675y, this.f169676z, composer, iIntValue);
        }
    }
}
