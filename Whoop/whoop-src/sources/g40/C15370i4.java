package g40;

import android.view.KeyEvent;
import p164g2.InterfaceC15237i;
import p477s2.AbstractC32073e;
import p477s2.C32071c;
import p522uf.AbstractC34870c0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g40.i4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C15370i4 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ String f57772w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC15237i f57773x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f57774y;

    public C15370i4(String str, InterfaceC15237i interfaceC15237i, int i13) {
        this.f57772w = str;
        this.f57773x = interfaceC15237i;
        this.f57774y = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z4;
        KeyEvent event = ((C32071c) obj).f133019a;
        AbstractC22676k.m65750j(event, "event");
        if (AbstractC32073e.m99720L(event) == 2 && event.getKeyCode() == 67 && this.f57772w.length() == 0) {
            AbstractC34870c0.m109993c0(this.f57773x, this.f57774y);
            z4 = true;
        } else {
            z4 = false;
        }
        return Boolean.valueOf(z4);
    }
}
