package p042c2;

import ad3.C0783z;
import android.graphics.Rect;
import android.view.autofill.AutofillManager;
import c93.InterfaceC4352n;
import l83.C23454a0;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: c2.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C3857b extends AbstractC22680m implements InterfaceC4352n {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C3859d f15782w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f15783x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3857b(C3859d c3859d, int i13) {
        super(4);
        this.f15782w = c3859d;
        this.f15783x = i13;
    }

    @Override // c93.InterfaceC4352n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue();
        C3859d c3859d = this.f15782w;
        C0783z c0783z = c3859d.f15787a;
        ((AutofillManager) c0783z.f2818x).notifyViewEntered(c3859d.f15789c, this.f15783x, new Rect(iIntValue, iIntValue2, iIntValue3, iIntValue4));
        return C23454a0.f92919a;
    }
}
