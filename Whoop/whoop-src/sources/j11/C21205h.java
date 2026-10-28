package j11;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l03.AbstractC23059i;

/* JADX INFO: renamed from: j11.h */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C21205h implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f80806w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Integer f80807x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f80808y;

    public /* synthetic */ C21205h(Integer num, int i13, int i14) {
        this.f80806w = i14;
        this.f80807x = num;
        this.f80808y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f80806w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC21206i.m59476q(this.f80807x, this.f80808y, composer, iIntValue);
            case 1:
                return AbstractC21206i.m59474o(this.f80807x, this.f80808y, composer, iIntValue);
            default:
                return AbstractC23059i.m67038c(this.f80807x, this.f80808y, composer, iIntValue);
        }
    }
}
