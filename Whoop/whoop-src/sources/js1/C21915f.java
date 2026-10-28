package js1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import java.util.List;
import p715kotlin.jvm.functions.Function1;
import v71.AbstractC35767h;

/* JADX INFO: renamed from: js1.f */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C21915f implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f84651E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f84652F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f84653w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f84654x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ List f84655y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f84656z;

    public /* synthetic */ C21915f(Modifier modifier, List list, Function1 function1, int i13, int i14) {
        this.f84654x = modifier;
        this.f84655y = list;
        this.f84656z = function1;
        this.f84651E = i13;
        this.f84652F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f84653w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                Modifier modifier = this.f84654x;
                return AbstractC21916g.m62364g(this.f84655y, modifier, this.f84656z, this.f84651E, this.f84652F, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC35767h.m113345m(this.f84654x, this.f84655y, this.f84656z, this.f84651E, this.f84652F, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C21915f(List list, Modifier modifier, Function1 function1, int i13, int i14) {
        this.f84655y = list;
        this.f84654x = modifier;
        this.f84656z = function1;
        this.f84651E = i13;
        this.f84652F = i14;
    }
}
