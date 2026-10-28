package wr0;

import p077d0.C11344e;
import p209i3.InterfaceC18044z;
import p390p1.InterfaceC28690z0;
import p715kotlin.jvm.functions.Function1;
import vy0.AbstractC36597y;

/* JADX INFO: renamed from: wr0.v0 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C37559v0 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f160625w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f160626x;

    public /* synthetic */ C37559v0(Object obj, int i13) {
        this.f160625w = i13;
        this.f160626x = obj;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f160625w) {
            case 0:
                return AbstractC37557u0.d.m120552i((InterfaceC28690z0) this.f160626x, (C11344e) obj);
            case 1:
                return AbstractC37540m.m120433y((Function1) this.f160626x, (AbstractC36597y) obj);
            default:
                return AbstractC37552s.m120468u((String) this.f160626x, (InterfaceC18044z) obj);
        }
    }
}
