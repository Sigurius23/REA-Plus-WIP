package k11;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: k11.c */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C22120c implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f85814E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f85815F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f85816w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C22123f f85817x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f85818y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Modifier f85819z;

    public /* synthetic */ C22120c(Modifier modifier, C22123f c22123f, Function1 function1, int i13, int i14) {
        this.f85819z = modifier;
        this.f85817x = c22123f;
        this.f85818y = function1;
        this.f85814E = i13;
        this.f85815F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f85816w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC22121d.m63334k(this.f85819z, this.f85817x, this.f85818y, this.f85814E, this.f85815F, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                Modifier modifier = this.f85819z;
                return AbstractC22121d.m63337n(this.f85817x, this.f85818y, modifier, this.f85814E, this.f85815F, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C22120c(C22123f c22123f, Function1 function1, Modifier modifier, int i13, int i14) {
        this.f85817x = c22123f;
        this.f85818y = function1;
        this.f85819z = modifier;
        this.f85814E = i13;
        this.f85815F = i14;
    }
}
