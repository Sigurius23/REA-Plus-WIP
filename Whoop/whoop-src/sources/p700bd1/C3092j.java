package p700bd1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p704dk2.AbstractC12123j;
import p715kotlin.jvm.functions.Function3;
import vy0.AbstractC36596x;
import w81.C36947e;

/* JADX INFO: renamed from: bd1.j */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C3092j implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f12133w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function3 f12134x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f12135y;

    public /* synthetic */ C3092j(Function3 function3, int i13, int i14) {
        this.f12133w = i14;
        this.f12134x = function3;
        this.f12135y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f12133w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return Function1.m8865e(this.f12134x, this.f12135y, composer, iIntValue);
            case 1:
                return AbstractC42782p.m8887e(this.f12134x, this.f12135y, composer, iIntValue);
            case 2:
                return AbstractC12123j.m33558r(this.f12134x, this.f12135y, composer, iIntValue);
            case 3:
                return AbstractC36596x.m117526p(this.f12134x, this.f12135y, composer, iIntValue);
            default:
                return C36947e.m118632c(this.f12134x, this.f12135y, composer, iIntValue);
        }
    }
}
