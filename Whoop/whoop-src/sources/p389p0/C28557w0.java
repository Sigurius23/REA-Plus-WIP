package p389p0;

import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;
import com.whoop.navigation.C9598e;
import com.whoop.payments.domain.models.Card;
import e93.AbstractC12889b;
import gt0.InterfaceC16186h;
import h91.C17027b;
import java.util.Map;
import l83.C23454a0;
import o73.C27648a;
import p077d0.AbstractC11333b0;
import p077d0.AbstractC11348f;
import p335n6.InterfaceC26397n;
import p358o6.C27594b;
import p390p1.AbstractC28683x;
import p390p1.C28617g1;
import p395p6.C28921u;
import p395p6.C28927w;
import p395p6.C28933y;
import p395p6.InterfaceC28923u1;
import p409q0.C29674b;
import p545v6.C35725n;
import p545v6.C35733v;
import p636y3.C39176h;
import p715kotlin.jvm.internal.AbstractC22676k;
import p90.AbstractC28996d;
import p90.C28997e;
import pa2.AbstractC29037a;
import ph1.C29237a;
import pj2.C29303b;
import pm2.C29363d;
import pm2.C29365f;
import pp1.C29428a;
import pp2.C29437a;
import q12.C29800a;
import q22.AbstractC29854d;
import q22.C29851a;
import q22.EnumC29858h;
import q83.C30056c;
import q83.C30058e;
import q83.C30064k;
import q83.InterfaceC30059f;
import q83.InterfaceC30061h;
import q83.InterfaceC30063j;
import qg0.C30345f;
import qj2.AbstractC30437b;
import qm1.AbstractC30483e;
import r61.C30981d;
import se.AbstractC32410a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: p0.w0 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C28557w0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f115540w;

    public /* synthetic */ C28557w0(int i13) {
        this.f115540w = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        C30056c c30056c;
        switch (this.f115540w) {
            case 0:
                Map mapMo7447e = ((C28559x0) obj2).mo7447e();
                if (mapMo7447e.isEmpty()) {
                    return null;
                }
                return mapMo7447e;
            case 1:
                ((Integer) obj2).getClass();
                C27648a.m83580c((Composer) obj, AbstractC28683x.m87244L(1));
                return C23454a0.f92919a;
            case 2:
                int iIntValue = ((Integer) obj).intValue();
                if (((InterfaceC26397n) obj2) instanceof C27594b) {
                    iIntValue++;
                }
                return Integer.valueOf(iIntValue);
            case 3:
                C28933y c28933y = (C28933y) obj;
                InterfaceC26397n interfaceC26397n = (InterfaceC26397n) obj2;
                if ((interfaceC26397n instanceof C35733v) || (interfaceC26397n instanceof C35725n) || (interfaceC26397n instanceof C28921u)) {
                    return new C28933y(c28933y.f117064a.mo78107d(interfaceC26397n), c28933y.f117065b);
                }
                return new C28933y(c28933y.f117064a, c28933y.f117065b.mo78107d(interfaceC26397n));
            case 4:
                ((C28927w) obj).f117042c = ((C39176h) obj2).f168415a;
                return C23454a0.f92919a;
            case 5:
                ((C28927w) obj).f117043d = (InterfaceC28923u1) obj2;
                return C23454a0.f92919a;
            case 6:
                return AbstractC28996d.m88065x((EnumC29858h) obj, ((Boolean) obj2).booleanValue());
            case 7:
                return AbstractC28996d.m88018G(((Boolean) obj).booleanValue(), (C28997e) obj2);
            case 8:
                return AbstractC29037a.m88277h((C9598e) obj, (String) obj2);
            case 9:
                return C29237a.m88743c((Composer) obj, ((Integer) obj2).intValue());
            case 10:
                return C29303b.m88949c((Composer) obj, ((Integer) obj2).intValue());
            case 11:
                return Boolean.valueOf(C29363d.m89486u0((InterfaceC16186h) obj, (InterfaceC16186h) obj2));
            case 12:
                return C29365f.m89531c((Composer) obj, ((Integer) obj2).intValue());
            case 13:
                return C29428a.m89706c((Composer) obj, ((Integer) obj2).intValue());
            case 14:
                return C29437a.m89818c((Composer) obj, ((Integer) obj2).intValue());
            case 15:
                C29674b c29674b = (C29674b) obj2;
                return AbstractC37056f.m118959K(Integer.valueOf(c29674b.m91162k()), Float.valueOf(AbstractC12889b.m36283m(((C28617g1) c29674b.f121433d.f93080d).m87022x(), -0.5f, 0.5f)), Integer.valueOf(c29674b.mo91148m()));
            case 16:
                ((Integer) obj2).getClass();
                AbstractC32410a.m101028f((Composer) obj, AbstractC28683x.m87244L(1));
                return C23454a0.f92919a;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return C29800a.m91296f((Composer) obj, ((Integer) obj2).intValue());
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return C29851a.m91426g((Composer) obj, ((Integer) obj2).intValue());
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return C29851a.m91427h((Composer) obj, ((Integer) obj2).intValue());
            case 20:
                return C29851a.m91428i((Composer) obj, ((Integer) obj2).intValue());
            case 21:
                return AbstractC29854d.m91468s((EnumC29858h) obj, ((Boolean) obj2).booleanValue());
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC29854d.m91440I(((Boolean) obj).booleanValue(), (Card) obj2);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                String acc = (String) obj;
                InterfaceC30061h element = (InterfaceC30061h) obj2;
                AbstractC22676k.m65750j(acc, "acc");
                AbstractC22676k.m65750j(element, "element");
                if (acc.length() == 0) {
                    return element.toString();
                }
                return acc + ", " + element;
            case 24:
                InterfaceC30063j acc2 = (InterfaceC30063j) obj;
                InterfaceC30061h element2 = (InterfaceC30061h) obj2;
                AbstractC22676k.m65750j(acc2, "acc");
                AbstractC22676k.m65750j(element2, "element");
                InterfaceC30063j interfaceC30063jMinusKey = acc2.minusKey(element2.getKey());
                C30064k c30064k = C30064k.f122676w;
                if (interfaceC30063jMinusKey == c30064k) {
                    return element2;
                }
                C30058e c30058e = C30058e.f122675w;
                InterfaceC30059f interfaceC30059f = (InterfaceC30059f) interfaceC30063jMinusKey.get(c30058e);
                if (interfaceC30059f == null) {
                    c30056c = new C30056c(element2, interfaceC30063jMinusKey);
                } else {
                    InterfaceC30063j interfaceC30063jMinusKey2 = interfaceC30063jMinusKey.minusKey(c30058e);
                    if (interfaceC30063jMinusKey2 == c30064k) {
                        return new C30056c(interfaceC30059f, element2);
                    }
                    c30056c = new C30056c(interfaceC30059f, new C30056c(element2, interfaceC30063jMinusKey2));
                }
                return c30056c;
            case 25:
                return C30345f.m92742c((Composer) obj, ((Integer) obj2).intValue());
            case 26:
                return AbstractC30437b.m93109n((C17027b) obj, ((Integer) obj2).intValue());
            case 27:
                return AbstractC30483e.m93338u(obj, obj2);
            case 28:
                return AbstractC11348f.m30574v(300, 0, AbstractC11333b0.f36310a, 2);
            default:
                return C30981d.m95329c((Composer) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ C28557w0(int i13, int i14) {
        this.f115540w = i14;
    }
}
