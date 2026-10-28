package e81;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.models.items.DateSelectorModel;
import java.util.List;
import kk1.AbstractC22546g;
import l83.InterfaceC23459e;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: e81.c0 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C12821c0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ float f43919E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f43920F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f43921G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ InterfaceC23459e f43922H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f43923w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f43924x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ float f43925y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ float f43926z;

    public /* synthetic */ C12821c0(Modifier modifier, float f13, float f14, float f15, DateSelectorModel dateSelectorModel, Function1 function1, int i13) {
        this.f43924x = modifier;
        this.f43925y = f13;
        this.f43926z = f14;
        this.f43919E = f15;
        this.f43921G = dateSelectorModel;
        this.f43922H = function1;
        this.f43920F = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f43923w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC12823d0.m35955x(this.f43924x, (List) this.f43921G, this.f43925y, this.f43926z, this.f43919E, (InterfaceC4339a) this.f43922H, this.f43920F, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC22546g.m65205K(this.f43924x, this.f43925y, this.f43926z, this.f43919E, (DateSelectorModel) this.f43921G, (Function1) this.f43922H, this.f43920F, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C12821c0(Modifier modifier, List list, float f13, float f14, float f15, InterfaceC4339a interfaceC4339a, int i13) {
        this.f43924x = modifier;
        this.f43921G = list;
        this.f43925y = f13;
        this.f43926z = f14;
        this.f43919E = f15;
        this.f43922H = interfaceC4339a;
        this.f43920F = i13;
    }
}
