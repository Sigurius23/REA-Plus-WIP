package d30;

import android.content.Context;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4352n;
import com.whoop.archv2.model.template.BackgroundModel;
import h20.C16687l;
import hb1.AbstractC17090m;
import java.util.List;
import p040c0.InterfaceC3764o;
import p133f1.C13966p;
import p133f1.EnumC13975s;
import p478s3.C32096b;
import p636y3.C39169a;
import p636y3.InterfaceC39171c;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25305n;
import p734sl0.AbstractC32597d2;
import p748zc1.C40266a1;
import q20.AbstractC29835t;
import q20.AbstractC29840y;
import q20.C29818g;
import q20.C29822i;
import q20.C29824j;
import q20.C29828m;
import q20.C29838w;
import q20.C29839x;
import q83.InterfaceC30063j;
import qy0.InterfaceC30768a;
import rm1.C31588b;
import wo1.C37438b;
import y00.C38793c;
import y00.C38977v3;
import yi0.AbstractC39566d;

/* JADX INFO: renamed from: d30.c */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C11520c implements InterfaceC4352n {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f37110w;

    public /* synthetic */ C11520c(int i13) {
        this.f37110w = i13;
    }

    @Override // c93.InterfaceC4352n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f37110w) {
            case 0:
                List displayablePaymentMethods = (List) obj;
                AbstractC29840y abstractC29840y = (AbstractC29840y) obj2;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
                AbstractC22676k.m65750j(displayablePaymentMethods, "displayablePaymentMethods");
                C16687l c16687l = null;
                Object obj5 = null;
                c16687l = null;
                c16687l = null;
                c16687l = null;
                c16687l = null;
                c16687l = null;
                c16687l = null;
                c16687l = null;
                if (!zBooleanValue && abstractC29840y != null && !(abstractC29840y instanceof C29822i) && !(abstractC29840y instanceof C29818g) && !abstractC29840y.equals(C29824j.f121906x) && !(abstractC29840y instanceof C29828m) && !(abstractC29840y instanceof C29839x) && !(abstractC29840y instanceof AbstractC29835t)) {
                    if (!(abstractC29840y instanceof C29838w)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String str = ((C29838w) abstractC29840y).f121955x.f167527w;
                    for (Object obj6 : displayablePaymentMethods) {
                        if (AbstractC22676k.m65745e(((C16687l) obj6).f64178b.f167527w, str)) {
                            obj5 = obj6;
                            c16687l = (C16687l) obj5;
                        }
                    }
                    c16687l = (C16687l) obj5;
                }
                return new C11570x(displayablePaymentMethods, c16687l, zBooleanValue, zBooleanValue2);
            case 1:
                return new C13966p((InterfaceC30063j) obj, (Context) obj2, (EnumC13975s) obj3, (C32096b) obj4);
            case 2:
                return AbstractC17090m.m48244s((C39169a) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue(), (InterfaceC39171c) obj4);
            case 3:
                return AbstractC17090m.m48221H((C39169a) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue(), (InterfaceC39171c) obj4);
            case 4:
                return C31588b.m97375c((InterfaceC3764o) obj, (InterfaceC25305n) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            case 5:
                return AbstractC32597d2.m101675D((String) obj, (List) obj2, (List) obj3, ((Boolean) obj4).booleanValue());
            case 6:
                String name = (String) obj;
                C38793c c38793c = (C38793c) obj4;
                AbstractC22676k.m65750j(name, "name");
                return new C38977v3(c38793c, (String) obj2, name, (String) obj3);
            case 7:
                return C37438b.m119853d((InterfaceC30768a) obj, (Function1) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            case 8:
                return AbstractC39566d.m126358t(C1100b.f4583a, (InterfaceC3764o) obj, (BackgroundModel) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            default:
                return C40266a1.m129314c((InterfaceC1103a) obj, ((Integer) obj2).intValue(), (Composer) obj3, ((Integer) obj4).intValue());
        }
    }
}
