package w71;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: w71.e */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C36879e implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ boolean f157755E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Function1 f157756F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f157757G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ int f157758H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f157759w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ TextResource f157760x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f157761y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f157762z;

    public /* synthetic */ C36879e(TextResource textResource, boolean z4, boolean z13, boolean z14, Function1 function1, int i13, int i14, int i15) {
        this.f157759w = i15;
        this.f157760x = textResource;
        this.f157761y = z4;
        this.f157762z = z13;
        this.f157755E = z14;
        this.f157756F = function1;
        this.f157757G = i13;
        this.f157758H = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f157759w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC36881f.m118309c(this.f157760x, this.f157761y, this.f157762z, this.f157755E, this.f157756F, this.f157757G, this.f157758H, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC36886h0.m118358g(this.f157760x, this.f157761y, this.f157762z, this.f157755E, this.f157756F, this.f157757G, this.f157758H, (Composer) obj, iIntValue2);
        }
    }
}
