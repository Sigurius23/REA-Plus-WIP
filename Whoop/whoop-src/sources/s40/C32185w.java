package s40;

import b30.C2544i5;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import com.stripe.android.view.CardNumberEditText;
import ec3.InterfaceC13062m;
import hc3.AbstractC17182o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kc3.C22365e;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p695zx.InterfaceC41183e;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import y00.C38783b;
import y00.EnumC38853i;

/* JADX INFO: renamed from: s40.w */
/* JADX INFO: loaded from: classes6.dex */
public final class C32185w implements InterfaceC13062m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f133297w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ CardNumberEditText f133298x;

    public /* synthetic */ C32185w(CardNumberEditText cardNumberEditText, int i13) {
        this.f133297w = i13;
        this.f133298x = cardNumberEditText;
    }

    @Override // ec3.InterfaceC13062m
    public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) throws Throwable {
        int i13 = this.f133297w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        CardNumberEditText cardNumberEditText = this.f133298x;
        switch (i13) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C22365e c22365e = AbstractC3050q0.f12077a;
                Object objM8705K = AbstractC3006f0.m8705K(AbstractC17182o.f65999a, new C2544i5(cardNumberEditText, zBooleanValue, (InterfaceC30057d) null, 6), interfaceC30057d);
                return objM8705K == EnumC31071a.f128113w ? objM8705K : c23454a0;
            default:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                cardNumberEditText.f22521l0 = zBooleanValue2;
                List listMo133829a = ((InterfaceC41183e) cardNumberEditText.getAccountRangeService().f177742m.getValue()).mo133829a();
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listMo133829a, 10));
                Iterator it = listMo133829a.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C38783b) it.next()).f166934y.f166885x);
                }
                List<? extends EnumC38853i> listM74159y0 = AbstractC25265s.m74159y0(arrayList);
                if (zBooleanValue2) {
                    EnumC38853i enumC38853i = (EnumC38853i) AbstractC25265s.m74100H0(listM74159y0);
                    if (enumC38853i == null) {
                        enumC38853i = EnumC38853i.Unknown;
                    }
                    cardNumberEditText.setImplicitCardBrandForCbc$payments_core_release(enumC38853i);
                    cardNumberEditText.setPossibleCardBrands$payments_core_release(listM74159y0);
                } else {
                    EnumC38853i enumC38853i2 = (EnumC38853i) AbstractC25265s.m74146r1(listM74159y0);
                    if (enumC38853i2 == null) {
                        enumC38853i2 = EnumC38853i.Unknown;
                    }
                    cardNumberEditText.setCardBrand$payments_core_release(enumC38853i2);
                }
                return c23454a0;
        }
    }
}
