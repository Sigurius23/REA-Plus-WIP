package gf1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import ef1.C13147c;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: gf1.d */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C15785d implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Function1 f59483E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f59484F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f59485G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f59486w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f59487x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C13147c.b f59488y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ String f59489z;

    public /* synthetic */ C15785d(Modifier modifier, C13147c.b bVar, String str, Function1 function1, int i13, int i14, int i15) {
        this.f59486w = i15;
        this.f59487x = modifier;
        this.f59488y = bVar;
        this.f59489z = str;
        this.f59483E = function1;
        this.f59484F = i13;
        this.f59485G = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f59486w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC15788g.m44529y(this.f59487x, this.f59488y, this.f59489z, this.f59483E, this.f59484F, this.f59485G, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC15788g.m44522r(this.f59487x, this.f59488y, this.f59489z, this.f59483E, this.f59484F, this.f59485G, (Composer) obj, iIntValue2);
        }
    }
}
