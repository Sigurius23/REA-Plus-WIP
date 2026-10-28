package l21;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p715kotlin.jvm.functions.Function1;
import yl0.AbstractC39631n;

/* JADX INFO: renamed from: l21.a */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C23237a implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f92082E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f92083F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f92084w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f92085x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C23239c f92086y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f92087z;

    public /* synthetic */ C23237a(Modifier modifier, C23239c c23239c, Function1 function1, int i13, int i14) {
        this.f92085x = modifier;
        this.f92086y = c23239c;
        this.f92087z = function1;
        this.f92082E = i13;
        this.f92083F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f92084w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                Modifier modifier = this.f92085x;
                return AbstractC23238b.m67279i(this.f92086y, modifier, this.f92087z, this.f92082E, this.f92083F, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC39631n.m126679l(this.f92085x, this.f92086y, this.f92087z, this.f92082E, this.f92083F, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C23237a(C23239c c23239c, Modifier modifier, Function1 function1, int i13, int i14) {
        this.f92086y = c23239c;
        this.f92085x = modifier;
        this.f92087z = function1;
        this.f92082E = i13;
        this.f92083F = i14;
    }
}
