package r31;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p715kotlin.jvm.functions.Function1;
import zl0.AbstractC40878j;

/* JADX INFO: renamed from: r31.c */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C30908c implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f127468E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f127469F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f127470w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f127471x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C30911f f127472y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f127473z;

    public /* synthetic */ C30908c(Modifier modifier, C30911f c30911f, Function1 function1, int i13, int i14) {
        this.f127471x = modifier;
        this.f127472y = c30911f;
        this.f127473z = function1;
        this.f127468E = i13;
        this.f127469F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f127470w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                Modifier modifier = this.f127471x;
                return AbstractC30909d.m95030g(this.f127472y, modifier, this.f127473z, this.f127468E, this.f127469F, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC40878j.m132488h(this.f127471x, this.f127472y, this.f127473z, this.f127468E, this.f127469F, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C30908c(C30911f c30911f, Modifier modifier, Function1 function1, int i13, int i14) {
        this.f127472y = c30911f;
        this.f127471x = modifier;
        this.f127473z = function1;
        this.f127468E = i13;
        this.f127469F = i14;
    }
}
