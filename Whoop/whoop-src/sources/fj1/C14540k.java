package fj1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p745y81.EnumC39333f;
import zk2.AbstractC40862w;

/* JADX INFO: renamed from: fj1.k */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C14540k implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f53156E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f53157w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ EnumC39333f f53158x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Modifier f53159y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f53160z;

    public /* synthetic */ C14540k(Modifier modifier, EnumC39333f enumC39333f, int i13, int i14) {
        this.f53157w = 0;
        this.f53159y = modifier;
        this.f53158x = enumC39333f;
        this.f53160z = i13;
        this.f53156E = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f53157w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC14541l.m41520f(this.f53159y, this.f53158x, this.f53160z, this.f53156E, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                Modifier modifier = this.f53159y;
                return AbstractC40862w.m132440g(this.f53158x, modifier, this.f53160z, this.f53156E, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                Modifier modifier2 = this.f53159y;
                return AbstractC40862w.m132442i(this.f53158x, modifier2, this.f53160z, this.f53156E, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ C14540k(EnumC39333f enumC39333f, Modifier modifier, int i13, int i14, int i15) {
        this.f53157w = i15;
        this.f53158x = enumC39333f;
        this.f53159y = modifier;
        this.f53160z = i13;
        this.f53156E = i14;
    }
}
