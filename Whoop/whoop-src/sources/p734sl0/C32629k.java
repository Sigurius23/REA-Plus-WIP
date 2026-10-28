package p734sl0;

import c93.InterfaceC4352n;
import java.util.List;
import nl0.C26804f;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: sl0.k */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C32629k implements InterfaceC4352n {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f135235w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f135236x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C26804f f135237y;

    public /* synthetic */ C32629k(Function1 function1, C26804f c26804f, int i13) {
        this.f135235w = i13;
        this.f135236x = function1;
        this.f135237y = c26804f;
    }

    @Override // c93.InterfaceC4352n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f135235w) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                return AbstractC32654p.m102109m(this.f135236x, this.f135237y, (String) obj, (List) obj2, (List) obj3, zBooleanValue);
            default:
                boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
                return AbstractC32650o0.m102084v(this.f135236x, this.f135237y, (String) obj, (List) obj2, (List) obj3, zBooleanValue2);
        }
    }
}
