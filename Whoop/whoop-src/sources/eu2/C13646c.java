package eu2;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import in2.C18733e;
import java.util.List;
import p329n0.C26068u;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: eu2.c */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C13646c implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C18733e f48343E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Function1 f48344F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f48345G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ int f48346H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f48347w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ List f48348x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Modifier f48349y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C26068u f48350z;

    public /* synthetic */ C13646c(List list, Modifier modifier, C26068u c26068u, C18733e c18733e, Function1 function1, int i13, int i14) {
        this.f48348x = list;
        this.f48349y = modifier;
        this.f48350z = c26068u;
        this.f48343E = c18733e;
        this.f48344F = function1;
        this.f48345G = i13;
        this.f48346H = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f48347w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                List list = this.f48348x;
                Modifier modifier = this.f48349y;
                return AbstractC13650g.m38473u(list, this.f48350z, this.f48343E, modifier, this.f48344F, this.f48345G, this.f48346H, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC13650g.m38475w(this.f48348x, this.f48349y, this.f48350z, this.f48343E, this.f48344F, this.f48345G, this.f48346H, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C13646c(List list, C26068u c26068u, C18733e c18733e, Modifier modifier, Function1 function1, int i13, int i14) {
        this.f48348x = list;
        this.f48350z = c26068u;
        this.f48343E = c18733e;
        this.f48349y = modifier;
        this.f48344F = function1;
        this.f48345G = i13;
        this.f48346H = i14;
    }
}
