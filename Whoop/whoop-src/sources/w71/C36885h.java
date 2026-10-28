package w71;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: w71.h */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C36885h implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f157792E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f157793w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C36893l f157794x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C36906y f157795y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f157796z;

    public /* synthetic */ C36885h(C36893l c36893l, C36906y c36906y, Function1 function1, int i13, int i14) {
        this.f157793w = i14;
        this.f157794x = c36893l;
        this.f157795y = c36906y;
        this.f157796z = function1;
        this.f157792E = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f157793w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return C36893l.m118392Q(this.f157794x, this.f157795y, this.f157796z, this.f157792E, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return C36893l.m118433q0(this.f157794x, this.f157795y, this.f157796z, this.f157792E, (Composer) obj, iIntValue2);
        }
    }
}
