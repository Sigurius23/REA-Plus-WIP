package my0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import java.util.List;
import p208i2.C17919x;
import tk2.InterfaceC33899q;
import w41.C36806f;
import yk2.AbstractC39614n;

/* JADX INFO: renamed from: my0.a */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C26030a implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Modifier f102982E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ float f102983F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f102984G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ int f102985H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ int f102986I;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f102987w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f102988x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ float f102989y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ float f102990z;

    public /* synthetic */ C26030a(List list, float f13, float f14, Modifier modifier, float f15, C17919x c17919x, int i13, int i14, int i15) {
        this.f102987w = i15;
        this.f102988x = list;
        this.f102989y = f13;
        this.f102990z = f14;
        this.f102982E = modifier;
        this.f102983F = f15;
        this.f102984G = c17919x;
        this.f102985H = i13;
        this.f102986I = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f102987w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC26031b.m77440d((List) this.f102988x, this.f102989y, this.f102990z, this.f102982E, this.f102983F, (C17919x) this.f102984G, this.f102985H, this.f102986I, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC26031b.m77441e((List) this.f102988x, this.f102989y, this.f102990z, this.f102982E, this.f102983F, (C17919x) this.f102984G, this.f102985H, this.f102986I, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC39614n.m126580i((InterfaceC33899q) this.f102988x, this.f102982E, this.f102989y, this.f102990z, (C36806f) this.f102984G, this.f102983F, this.f102985H, this.f102986I, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ C26030a(InterfaceC33899q interfaceC33899q, Modifier modifier, float f13, float f14, C36806f c36806f, float f15, int i13, int i14) {
        this.f102987w = 2;
        this.f102988x = interfaceC33899q;
        this.f102982E = modifier;
        this.f102989y = f13;
        this.f102990z = f14;
        this.f102984G = c36806f;
        this.f102983F = f15;
        this.f102985H = i13;
        this.f102986I = i14;
    }
}
