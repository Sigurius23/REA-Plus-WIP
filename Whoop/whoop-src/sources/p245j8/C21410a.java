package p245j8;

import android.os.Looper;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import p390p1.InterfaceC28661r1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: j8.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C21410a implements InterfaceC13062m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f82087w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28661r1 f82088x;

    public /* synthetic */ C21410a(InterfaceC28661r1 interfaceC28661r1, int i13) {
        this.f82087w = i13;
        this.f82088x = interfaceC28661r1;
    }

    @Override // ec3.InterfaceC13062m
    public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f82087w) {
            case 0:
                this.f82088x.setValue(obj);
                break;
            case 1:
                this.f82088x.setValue(obj);
                break;
            case 2:
                this.f82088x.setValue(obj);
                break;
            case 3:
                AbstractC22676k.m65745e(Looper.getMainLooper(), Looper.myLooper());
                this.f82088x.setValue(obj);
                break;
            default:
                this.f82088x.setValue(obj);
                break;
        }
        return C23454a0.f92919a;
    }
}
