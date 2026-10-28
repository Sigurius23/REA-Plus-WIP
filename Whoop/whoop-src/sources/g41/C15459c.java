package g41;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import java.util.List;
import kd1.AbstractC22403o;
import y11.AbstractC39050c;

/* JADX INFO: renamed from: g41.c */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C15459c implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f58065E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f58066w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f58067x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f58068y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f58069z;

    public /* synthetic */ C15459c(float f13, AbstractC22403o abstractC22403o, boolean z4, int i13) {
        this.f58067x = f13;
        this.f58065E = abstractC22403o;
        this.f58068y = z4;
        this.f58069z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f58066w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC15460d.m43634o(this.f58067x, (AbstractC22403o) this.f58065E, this.f58068y, this.f58069z, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC39050c.m124481j((List) this.f58065E, this.f58067x, this.f58068y, this.f58069z, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C15459c(List list, float f13, boolean z4, int i13) {
        this.f58065E = list;
        this.f58067x = f13;
        this.f58068y = z4;
        this.f58069z = i13;
    }
}
