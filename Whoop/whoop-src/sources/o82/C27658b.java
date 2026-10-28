package o82;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import n82.C26457c;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: o82.b */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C27658b implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f111283E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f111284w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C26457c f111285x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f111286y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f111287z;

    public /* synthetic */ C27658b(C26457c c26457c, Function1 function1, Function1 function2, int i13, int i14) {
        this.f111284w = i14;
        this.f111285x = c26457c;
        this.f111286y = function1;
        this.f111287z = function2;
        this.f111283E = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f111284w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC27660d.m83636m(this.f111285x, this.f111286y, this.f111287z, this.f111283E, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC27660d.m83643t(this.f111285x, this.f111286y, this.f111287z, this.f111283E, (Composer) obj, iIntValue2);
        }
    }
}
