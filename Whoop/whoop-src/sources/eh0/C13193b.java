package eh0;

import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.runtime.Composer;
import i01.AbstractC17843f;
import java.util.List;
import no0.AbstractC26979w;
import p291l0.InterfaceC22996s0;
import p715kotlin.jvm.functions.Function3;
import u01.AbstractC34382d;
import u71.AbstractC34573g;
import vo1.AbstractC36249x;
import wo1.AbstractC37446f;

/* JADX INFO: renamed from: eh0.b */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C13193b implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f45734w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ List f45735x;

    public /* synthetic */ C13193b(List list, int i13) {
        this.f45734w = i13;
        this.f45735x = list;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f45734w) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return AbstractC13194c.m37099d(this.f45735x, (InterfaceC22996s0) obj, (Composer) obj2, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj3).intValue();
                return AbstractC17843f.m51290q(this.f45735x, (InterfaceC22996s0) obj, (Composer) obj2, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj3).intValue();
                return AbstractC26979w.m80855W(this.f45735x, (InterfaceC1103a) obj, (Composer) obj2, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj3).intValue();
                return AbstractC34382d.m108701r(this.f45735x, (InterfaceC22996s0) obj, (Composer) obj2, iIntValue4);
            case 4:
                int iIntValue5 = ((Integer) obj3).intValue();
                return AbstractC34573g.m109331n(this.f45735x, (InterfaceC22996s0) obj, (Composer) obj2, iIntValue5);
            case 5:
                int iIntValue6 = ((Integer) obj3).intValue();
                return AbstractC36249x.m115616N(this.f45735x, (InterfaceC22996s0) obj, (Composer) obj2, iIntValue6);
            default:
                int iIntValue7 = ((Integer) obj3).intValue();
                return AbstractC37446f.m119901n(this.f45735x, (InterfaceC22996s0) obj, (Composer) obj2, iIntValue7);
        }
    }
}
