package pt2;

import ot2.C28351t;
import p209i3.InterfaceC18044z;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: pt2.r */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C29536r implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f120274w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f120275x;

    public /* synthetic */ C29536r(Object obj, int i13) {
        this.f120274w = i13;
        this.f120275x = obj;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f120274w) {
            case 0:
                return AbstractC29540v.m90361A0((InterfaceC28601c1) this.f120275x, ((Boolean) obj).booleanValue());
            case 1:
                return AbstractC29540v.m90363B0((InterfaceC28601c1) this.f120275x, ((Boolean) obj).booleanValue());
            default:
                return AbstractC29517a0.m90208n((C28351t) this.f120275x, (InterfaceC18044z) obj);
        }
    }
}
