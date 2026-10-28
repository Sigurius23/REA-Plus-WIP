package kk1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import ik1.AbstractC18611h;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: kk1.c */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C22542c implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Function1 f88611E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f88612F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f88613G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f88614w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC18611h f88615x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f88616y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f88617z;

    public /* synthetic */ C22542c(AbstractC18611h abstractC18611h, Function1 function1, Function1 function2, Function1 function3, int i13, int i14, int i15) {
        this.f88614w = i15;
        this.f88615x = abstractC18611h;
        this.f88616y = function1;
        this.f88617z = function2;
        this.f88611E = function3;
        this.f88612F = i13;
        this.f88613G = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f88614w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC22543d.m65183x(this.f88615x, this.f88616y, this.f88617z, this.f88611E, this.f88612F, this.f88613G, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC22543d.m65177r(this.f88615x, this.f88616y, this.f88617z, this.f88611E, this.f88612F, this.f88613G, (Composer) obj, iIntValue2);
        }
    }
}
