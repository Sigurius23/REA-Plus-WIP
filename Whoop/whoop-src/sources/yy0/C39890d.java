package yy0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import java.util.List;
import p91.C29007a;

/* JADX INFO: renamed from: yy0.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C39890d implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f172235E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f172236F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f172237w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f172238x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ List f172239y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C29007a f172240z;

    public /* synthetic */ C39890d(Modifier modifier, List list, C29007a c29007a, int i13, int i14, int i15) {
        this.f172237w = i15;
        this.f172238x = modifier;
        this.f172239y = list;
        this.f172240z = c29007a;
        this.f172235E = i13;
        this.f172236F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f172237w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC39891e.m127985c(this.f172238x, this.f172239y, this.f172240z, this.f172235E, this.f172236F, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC39892f.m127988c(this.f172238x, this.f172239y, this.f172240z, this.f172235E, this.f172236F, (Composer) obj, iIntValue2);
        }
    }
}
