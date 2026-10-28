package tu1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: tu1.e */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C34192e implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f143412E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f143413w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C34194g f143414x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f143415y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f143416z;

    public /* synthetic */ C34192e(C34194g c34194g, Function1 function1, Function1 function2, int i13, int i14) {
        this.f143413w = i14;
        this.f143414x = c34194g;
        this.f143415y = function1;
        this.f143416z = function2;
        this.f143412E = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f143413w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC34193f.m108062z(this.f143414x, this.f143415y, this.f143416z, this.f143412E, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC34193f.m108050n(this.f143414x, this.f143415y, this.f143416z, this.f143412E, (Composer) obj, iIntValue2);
        }
    }
}
