package wo1;

import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4353o;
import f31.C14044a;
import java.util.List;
import p390p1.InterfaceC28593a1;
import p390p1.InterfaceC28601c1;
import so1.C32833q;
import so1.C32836t;
import z80.AbstractC40180a;

/* JADX INFO: renamed from: wo1.n */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C37462n implements InterfaceC4353o {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f160294w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f160295x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC28601c1 f160296y;

    public /* synthetic */ C37462n(Object obj, InterfaceC28601c1 interfaceC28601c1, int i13) {
        this.f160294w = i13;
        this.f160295x = obj;
        this.f160296y = interfaceC28601c1;
    }

    @Override // c93.InterfaceC4353o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f160294w) {
            case 0:
                int iIntValue = ((Integer) obj5).intValue();
                return AbstractC37464o.m120056q((C32833q) this.f160295x, this.f160296y, (InterfaceC1103a) obj, (C32836t) obj2, (C14044a) obj3, (Composer) obj4, iIntValue);
            default:
                return AbstractC40180a.m128909q((List) this.f160295x, (InterfaceC28593a1) this.f160296y, (InterfaceC1103a) obj, ((Integer) obj2).intValue(), (C14044a) obj3, (Composer) obj4, ((Integer) obj5).intValue());
        }
    }
}
