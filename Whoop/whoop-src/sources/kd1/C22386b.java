package kd1;

import androidx.compose.runtime.Composer;
import j02.C21148j;
import p291l0.InterfaceC22997s1;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: kd1.b */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C22386b implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f87577w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C21148j f87578x;

    public /* synthetic */ C22386b(C21148j c21148j, int i13) {
        this.f87577w = i13;
        this.f87578x = c21148j;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i13 = this.f87577w;
        InterfaceC22997s1 interfaceC22997s1 = (InterfaceC22997s1) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i13) {
            case 0:
                return AbstractC22390d.m64430v(this.f87578x, interfaceC22997s1, composer, iIntValue);
            default:
                return AbstractC22390d.m64433y(this.f87578x, interfaceC22997s1, composer, iIntValue);
        }
    }
}
