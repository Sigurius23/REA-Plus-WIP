package yd2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p715kotlin.jvm.functions.Function1;
import xd2.InterfaceC38214j;

/* JADX INFO: renamed from: yd2.i */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C39467i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f169819w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC38214j.b f169820x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f169821y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f169822z;

    public /* synthetic */ C39467i(InterfaceC38214j.b bVar, Function1 function1, int i13, int i14) {
        this.f169819w = i14;
        this.f169820x = bVar;
        this.f169821y = function1;
        this.f169822z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f169819w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC39469k.m126090a0(this.f169820x, this.f169821y, this.f169822z, composer, iIntValue);
            default:
                return AbstractC39469k.m126064B(this.f169820x, this.f169821y, this.f169822z, composer, iIntValue);
        }
    }
}
