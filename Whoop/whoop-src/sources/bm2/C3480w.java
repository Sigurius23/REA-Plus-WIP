package bm2;

import android.app.DatePickerDialog;
import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: bm2.w */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C3480w implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f13662w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f13663x;

    public /* synthetic */ C3480w(Object obj, int i13) {
        this.f13662w = i13;
        this.f13663x = obj;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f13662w) {
            case 0:
                return AbstractC3436e0.m10012r0((DatePickerDialog) this.f13663x);
            case 1:
                return AbstractC3487z0.m10220C((DatePickerDialog) this.f13663x);
            default:
                return AbstractC3469q0.m10198f((Function1) this.f13663x);
        }
    }
}
