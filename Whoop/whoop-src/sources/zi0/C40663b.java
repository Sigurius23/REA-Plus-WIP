package zi0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p715kotlin.jvm.functions.Function1;
import ti0.C33842g;

/* JADX INFO: renamed from: zi0.b */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C40663b implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f175574w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C33842g f175575x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f175576y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f175577z;

    public /* synthetic */ C40663b(C33842g c33842g, Function1 function1, int i13, int i14) {
        this.f175574w = i14;
        this.f175575x = c33842g;
        this.f175576y = function1;
        this.f175577z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f175574w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC40664c.m131992j(this.f175575x, this.f175576y, this.f175577z, composer, iIntValue);
            default:
                return AbstractC40664c.m131988f(this.f175575x, this.f175576y, this.f175577z, composer, iIntValue);
        }
    }
}
