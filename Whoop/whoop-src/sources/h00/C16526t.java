package h00;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import d00.C11433l;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p507tx.AbstractC34235f;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: h00.t */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C16526t implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f63536w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C11433l f63537x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f63538y;

    public /* synthetic */ C16526t(C11433l c11433l, Function1 function1, int i13, int i14) {
        this.f63536w = i14;
        this.f63537x = c11433l;
        this.f63538y = function1;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f63536w;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i13) {
            case 0:
                AbstractC34235f.m108224j(this.f63537x, this.f63538y, composer, AbstractC28683x.m87244L(1));
                break;
            default:
                AbstractC34235f.m108223i(this.f63537x, this.f63538y, composer, AbstractC28683x.m87244L(1));
                break;
        }
        return C23454a0.f92919a;
    }
}
