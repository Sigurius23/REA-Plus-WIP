package wd3;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.universalcheckout.features.buynow.domain.models.items.BuyNowCheckoutInfoModel;
import com.whoop.universalcheckout.features.buynow.domain.models.items.BuyNowItemModel;
import com.whoop.universalcheckout.features.checkout.domain.models.items.CheckoutFooterModel;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import jb1.C21536b;
import l83.C23465k;
import m83.AbstractC25265s;
import p500tb.InterfaceC33687a;
import p581we.AbstractC37197m;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23749z0;
import p720m91.C25308q;
import ro1.AbstractC31635g;
import so1.C32834r;
import tg.C33770b;
import tg.C33775g;
import vy0.AbstractC36597y;
import we1.C37220d;
import we1.C37227k;
import wh0.C37298a;
import wi0.AbstractC37313e;
import wn2.AbstractC37426d;
import wn2.AbstractC37428f;
import wo1.AbstractC37447f0;
import wo1.AbstractC37456k;
import wo1.AbstractC37464o;
import wo1.AbstractC37471t;
import yb3.AbstractC39414r;
import yn1.AbstractC39672a;

/* JADX INFO: renamed from: wd3.b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C37168b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f158951w;

    public /* synthetic */ C37168b(int i13) {
        this.f158951w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f158951w) {
            case 0:
                C37169c it = (C37169c) obj;
                AbstractC22676k.m65750j(it, "it");
                StringBuilder sb4 = new StringBuilder();
                sb4.append(it.f158952a);
                sb4.append('=');
                sb4.append(it.f158953b);
                return sb4.toString();
            case 1:
                AbstractC22676k.m65750j((String) obj, "<unused var>");
                return Boolean.TRUE;
            case 2:
                C33770b existing = (C33770b) obj;
                AbstractC22676k.m65750j(existing, "existing");
                return C33775g.f141364n.m106778c(existing.f141349b);
            case 3:
                C33770b it3 = (C33770b) obj;
                AbstractC22676k.m65750j(it3, "it");
                return it3;
            case 4:
                String it4 = (String) obj;
                AbstractC22676k.m65750j(it4, "it");
                return AbstractC39414r.m125869O0(AbstractC37197m.f159034b.m125852f(it4, " ")).toString();
            case 5:
                String v13 = (String) obj;
                AbstractC22676k.m65750j(v13, "v");
                return AbstractC39414r.m125869O0(v13).toString();
            case 6:
                Map.Entry it5 = (Map.Entry) obj;
                AbstractC22676k.m65750j(it5, "it");
                String lowerCase = ((String) it5.getKey()).toLowerCase(Locale.ROOT);
                AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
                return new C23465k(lowerCase, it5.getValue());
            case 7:
                C23465k it6 = (C23465k) obj;
                AbstractC22676k.m65750j(it6, "it");
                return (CharSequence) it6.f92937w;
            case 8:
                C23465k it7 = (C23465k) obj;
                AbstractC22676k.m65750j(it7, "it");
                Set set = AbstractC37197m.f159033a;
                return ((String) it7.f92937w) + ':' + AbstractC25265s.m74110N0((Iterable) it7.f92938x, ",", null, null, new C37168b(4), 30);
            case 9:
                return C37220d.m119282j((InterfaceC33687a) obj);
            case 10:
                return C37227k.m119315g((InterfaceC33687a) obj);
            case 11:
                return C37227k.m119316h((InterfaceC33687a) obj);
            case 12:
                return C37298a.m119439b((C21536b) obj);
            case 13:
                return AbstractC37313e.m119522r((String) obj);
            case 14:
                return AbstractC37426d.m119802f((C21536b) obj);
            case 15:
                return AbstractC37426d.m119803g((C23749z0) obj);
            case 16:
                return AbstractC37426d.m119804h((BuyNowItemModel) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC37426d.m119805i((BuyNowCheckoutInfoModel) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC37426d.m119806j((CheckoutFooterModel) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC37428f.m119820b((C25308q) obj);
            case 20:
                return AbstractC37456k.m119974k(obj);
            case 21:
                return AbstractC37456k.m119975l((AbstractC39672a) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC37464o.m120050k((C32834r) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC37464o.m120053n((AbstractC39672a) obj);
            case 24:
                return AbstractC37471t.m120136n((String) obj);
            case 25:
                return AbstractC37471t.m120137o((LocalDate) obj);
            case 26:
                return AbstractC37471t.m120138p((AbstractC36597y) obj);
            case 27:
                return AbstractC37447f0.m119912j((String) obj);
            case 28:
                return AbstractC37447f0.m119913k((String) obj);
            default:
                return AbstractC37447f0.m119914l((AbstractC31635g) obj);
        }
    }
}
