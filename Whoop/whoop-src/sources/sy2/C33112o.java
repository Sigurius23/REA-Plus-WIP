package sy2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p715kotlin.jvm.functions.Function1;
import ty2.AbstractC34268a;

/* JADX INFO: renamed from: sy2.o */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C33112o implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f138109w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC34268a.a.f f138110x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f138111y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f138112z;

    public /* synthetic */ C33112o(AbstractC34268a.a.f fVar, Function1 function1, int i13, int i14) {
        this.f138109w = i14;
        this.f138110x = fVar;
        this.f138111y = function1;
        this.f138112z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f138109w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC33113p.m104960n(this.f138110x, this.f138111y, this.f138112z, composer, iIntValue);
            default:
                return AbstractC33113p.m104946A(this.f138110x, this.f138111y, this.f138112z, composer, iIntValue);
        }
    }
}
