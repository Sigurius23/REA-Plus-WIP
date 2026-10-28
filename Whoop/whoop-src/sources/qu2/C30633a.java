package qu2;

import android.view.View;
import p040c0.InterfaceC3770q;
import p390p1.C28624i0;
import p715kotlin.jvm.functions.Function1;
import pu2.C29564l;

/* JADX INFO: renamed from: qu2.a */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C30633a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f125981w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f125982x;

    public /* synthetic */ C30633a(Object obj, int i13) {
        this.f125981w = i13;
        this.f125982x = obj;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f125981w) {
            case 0:
                return AbstractC30640h.m94091R0((C29564l) this.f125982x, (InterfaceC3770q) obj);
            default:
                return AbstractC30640h.m94075J0((View) this.f125982x, (C28624i0) obj);
        }
    }
}
