package zy2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: zy2.b */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C41229b implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC41233f f177912E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f177913w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f177914x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f177915y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f177916z;

    public /* synthetic */ C41229b(InterfaceC41233f interfaceC41233f, Function1 function1, Function1 function2, int i13, int i14) {
        this.f177913w = i14;
        this.f177912E = interfaceC41233f;
        this.f177914x = function1;
        this.f177915y = function2;
        this.f177916z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f177913w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC41231d.m133942u(this.f177912E, this.f177914x, this.f177915y, this.f177916z, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC41231d.m133937p((InterfaceC41233f.b) this.f177912E, this.f177914x, this.f177915y, this.f177916z, (Composer) obj, iIntValue2);
        }
    }
}
