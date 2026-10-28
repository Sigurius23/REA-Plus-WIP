package wn1;

import androidx.compose.runtime.Composer;
import p040c0.InterfaceC3747i0;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: wn1.a */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C37417a implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f160160w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f160161x;

    public /* synthetic */ C37417a(float f13, int i13) {
        this.f160160w = i13;
        this.f160161x = f13;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i13 = this.f160160w;
        InterfaceC3747i0 interfaceC3747i0 = (InterfaceC3747i0) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i13) {
            case 0:
                return AbstractC37419c.m119781d(this.f160161x, interfaceC3747i0, composer, iIntValue);
            default:
                return AbstractC37420d.m119786d(this.f160161x, interfaceC3747i0, composer, iIntValue);
        }
    }
}
