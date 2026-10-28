package pt2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import ot2.AbstractC28344m;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: pt2.f */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C29524f implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f120163E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f120164F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f120165w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC28344m f120166x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f120167y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f120168z;

    public /* synthetic */ C29524f(AbstractC28344m abstractC28344m, Function1 function1, Function1 function2, int i13, int i14, int i15) {
        this.f120165w = i15;
        this.f120166x = abstractC28344m;
        this.f120167y = function1;
        this.f120168z = function2;
        this.f120163E = i13;
        this.f120164F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f120165w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC29527i.m90233E(this.f120166x, this.f120167y, this.f120168z, this.f120163E, this.f120164F, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC29530l.m90296A(this.f120166x, this.f120167y, this.f120168z, this.f120163E, this.f120164F, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC29517a0.m90205k(this.f120166x, this.f120167y, this.f120168z, this.f120163E, this.f120164F, (Composer) obj, iIntValue3);
        }
    }
}
