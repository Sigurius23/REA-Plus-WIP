package j00;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p484s9.AbstractC32281f;
import p715kotlin.jvm.internal.AbstractC22674j;

/* JADX INFO: renamed from: j00.m */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C21110m implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f80075w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f80076x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Modifier f80077y;

    public /* synthetic */ C21110m(String str, Modifier modifier, int i13, int i14) {
        this.f80075w = i14;
        this.f80076x = str;
        this.f80077y = modifier;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f80075w;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i13) {
            case 0:
                AbstractC21114q.m58930a(this.f80076x, this.f80077y, composer, AbstractC28683x.m87244L(49));
                break;
            case 1:
                AbstractC22674j.m65715a(this.f80076x, this.f80077y, composer, AbstractC28683x.m87244L(1));
                break;
            default:
                AbstractC32281f.m100447l(this.f80076x, this.f80077y, composer, AbstractC28683x.m87244L(49));
                break;
        }
        return C23454a0.f92919a;
    }
}
