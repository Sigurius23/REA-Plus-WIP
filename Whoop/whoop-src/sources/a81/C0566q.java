package a81;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.design.models.modal.ToastModal;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: a81.q */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C0566q implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f2006w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ ToastModal f2007x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f2008y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f2009z;

    public /* synthetic */ C0566q(ToastModal toastModal, Function1 function1, int i13, int i14) {
        this.f2006w = i14;
        this.f2007x = toastModal;
        this.f2008y = function1;
        this.f2009z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f2006w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC0567r.m1459t(this.f2007x, this.f2008y, this.f2009z, composer, iIntValue);
            default:
                return AbstractC0567r.m1457r(this.f2007x, this.f2008y, this.f2009z, composer, iIntValue);
        }
    }
}
