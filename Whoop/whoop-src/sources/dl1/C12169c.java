package dl1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p715kotlin.jvm.functions.Function1;
import zo2.AbstractC40935f;

/* JADX INFO: renamed from: dl1.c */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C12169c implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f40470E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f40471w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f40472x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f40473y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f40474z;

    public /* synthetic */ C12169c(Function1 function1, int i13, int i14, String str, String str2) {
        this.f40471w = i14;
        this.f40472x = str;
        this.f40473y = str2;
        this.f40474z = function1;
        this.f40470E = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f40471w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC12170d.m33665o(this.f40472x, this.f40473y, this.f40474z, this.f40470E, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC40935f.m132823l(this.f40472x, this.f40473y, this.f40474z, this.f40470E, (Composer) obj, iIntValue2);
        }
    }
}
