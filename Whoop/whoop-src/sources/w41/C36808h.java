package w41;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: w41.h */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C36808h implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C36806f f157452E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ boolean f157453F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f157454G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ int f157455H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f157456w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC36826z f157457x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Modifier f157458y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f157459z;

    public /* synthetic */ C36808h(AbstractC36826z abstractC36826z, Modifier modifier, boolean z4, C36806f c36806f, boolean z13, int i13, int i14, int i15) {
        this.f157456w = i15;
        this.f157457x = abstractC36826z;
        this.f157458y = modifier;
        this.f157459z = z4;
        this.f157452E = c36806f;
        this.f157453F = z13;
        this.f157454G = i13;
        this.f157455H = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f157456w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC36811k.m117999m(this.f157457x, this.f157458y, this.f157459z, this.f157452E, this.f157453F, this.f157454G, this.f157455H, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC36811k.m118011y(this.f157457x, this.f157458y, this.f157459z, this.f157452E, this.f157453F, this.f157454G, this.f157455H, (Composer) obj, iIntValue2);
        }
    }
}
