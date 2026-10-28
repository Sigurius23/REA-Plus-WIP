package gv1;

import androidx.compose.runtime.Composer;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: gv1.i */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C16235i implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f61688w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f61689x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f61690y;

    public /* synthetic */ C16235i(String str, Function1 function1) {
        this.f61689x = str;
        this.f61690y = function1;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i13 = this.f61688w;
        EnumC16238l enumC16238l = (EnumC16238l) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i13) {
            case 0:
                return AbstractC16236j.m45995e(this.f61690y, this.f61689x, enumC16238l, composer, iIntValue);
            default:
                return AbstractC16237k.m46002e(this.f61689x, this.f61690y, enumC16238l, composer, iIntValue);
        }
    }

    public /* synthetic */ C16235i(Function1 function1, String str) {
        this.f61690y = function1;
        this.f61689x = str;
    }
}
