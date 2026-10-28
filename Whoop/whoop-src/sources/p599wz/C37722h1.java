package p599wz;

import ad3.C0764g;
import android.content.Intent;
import androidx.health.platform.client.proto.C1533u;
import bi.AbstractC3269g;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.whoop.android.R;
import d00.C11433l;
import ec3.InterfaceC13058l;
import g40.C15329c;
import g40.C15335d;
import g40.C15411q3;
import g40.InterfaceC15361h1;
import g40.InterfaceC15421s3;
import g40.InterfaceC15450y2;
import h02.C16587n0;
import j93.InterfaceC21493z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd1.EnumC22400l;
import l40.C23328a;
import l83.C23454a0;
import l83.C23465k;
import live.hms.video.error.ErrorCodes;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import n53.C26318e;
import o02.C27354e;
import o73.C27648a;
import p209i3.AbstractC18039u;
import p209i3.AbstractC18041w;
import p209i3.C18030l;
import p209i3.InterfaceC18044z;
import p294l3.C23277r0;
import p479s4.AbstractC32128i;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import ua0.AbstractC34718a;
import va0.AbstractC35839a;
import x01.AbstractC37800b;
import x31.AbstractC37947f;
import x43.AbstractC37978j;
import x51.AbstractC37991c;
import x70.C38038c;
import x90.C38096b;
import xa0.AbstractC38137b;
import y00.EnumC38853i;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;
import yb3.C39410n;
import yb3.InterfaceC39407k;

/* JADX INFO: renamed from: wz.h1 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C37722h1 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f161653w;

    public /* synthetic */ C37722h1(int i13) {
        this.f161653w = i13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f161653w;
        int iIntValue = -1;
        C25271y c25271y = C25271y.f99162w;
        int i14 = 10;
        Object[] objArr = 0;
        boolean z4 = false;
        C23454a0 c23454a0 = C23454a0.f92919a;
        switch (i13) {
            case 0:
                C11433l c11433l = (C11433l) obj;
                if (c11433l != null) {
                    return c11433l.f36653H;
                }
                return null;
            case 1:
                C37708d it = (C37708d) obj;
                AbstractC22676k.m65750j(it, "it");
                return it.f161571w;
            case 2:
                return AbstractC37800b.m121299e(obj);
            case 3:
                AbstractC22676k.m65750j((Intent) obj, "it");
                return c23454a0;
            case 4:
                List fields = (List) obj;
                AbstractC22676k.m65750j(fields, "fields");
                List list = fields;
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList.add(((InterfaceC15450y2) it3.next()).mo43540i().mo43544f());
                }
                return new C26318e(arrayList.isEmpty() ? AbstractC3269g.m9493Z((InterfaceC15361h1) AbstractC25265s.m74100H0(AbstractC25265s.m74092D0(c25271y))) : new C15329c((InterfaceC13058l[]) AbstractC25265s.m74093D1(arrayList).toArray(new InterfaceC13058l[0]), 12), new C15335d(arrayList, 13));
            case 5:
                EnumC38853i it4 = (EnumC38853i) obj;
                AbstractC22676k.m65750j(it4, "it");
                IdentifierSpec.Companion.getClass();
                return new C23465k(IdentifierSpec.CardBrand, new C23328a(it4.f167260w, true));
            case 6:
                EnumC38853i brand = (EnumC38853i) obj;
                AbstractC22676k.m65750j(brand, "brand");
                IdentifierSpec.Companion.getClass();
                return new C23465k(IdentifierSpec.PreferredCardBrand, new C23328a(brand != EnumC38853i.Unknown ? brand.f167260w : null, true));
            case 7:
                C23328a it5 = (C23328a) obj;
                AbstractC22676k.m65750j(it5, "it");
                IdentifierSpec.Companion.getClass();
                IdentifierSpec identifierSpec = IdentifierSpec.CardExpMonth;
                String str = it5.f92491a;
                if (str != null) {
                    String strM83599v = C27648a.m83599v(str);
                    if (strM83599v.length() == 4) {
                        Integer numM125932Q = AbstractC39421y.m125932Q(AbstractC39414r.m125866L0(2, strM83599v));
                        if (numM125932Q == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        iIntValue = numM125932Q.intValue();
                    }
                }
                return new C23465k(identifierSpec, C23328a.m67553a(AbstractC39414r.m125895n0(2, String.valueOf(iIntValue)), it5));
            case 8:
                C23328a it6 = (C23328a) obj;
                AbstractC22676k.m65750j(it6, "it");
                IdentifierSpec.Companion.getClass();
                IdentifierSpec identifierSpec2 = IdentifierSpec.CardExpYear;
                String str2 = it6.f92491a;
                if (str2 != null) {
                    String strM83599v2 = C27648a.m83599v(str2);
                    if (strM83599v2.length() == 4) {
                        Integer numM125932Q2 = AbstractC39421y.m125932Q(AbstractC39414r.m125867M0(2, strM83599v2));
                        if (numM125932Q2 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        iIntValue = numM125932Q2.intValue() + ErrorCodes.InitAPIErrors.cServerErrors;
                    }
                }
                return new C23465k(identifierSpec2, C23328a.m67553a(String.valueOf(iIntValue), it6));
            case 9:
                InterfaceC18044z semantics = (InterfaceC18044z) obj;
                AbstractC22676k.m65750j(semantics, "$this$semantics");
                InterfaceC21493z[] interfaceC21493zArr = AbstractC18041w.f70062a;
                ((C18030l) semantics).m51772e(AbstractC18039u.f70041h, c23454a0);
                return c23454a0;
            case 10:
                EnumC38853i cardBrand = (EnumC38853i) obj;
                AbstractC22676k.m65750j(cardBrand, "cardBrand");
                return AbstractC32128i.m100064s(cardBrand == EnumC38853i.AmericanExpress ? R.string.stripe_cvc_amex_hint : R.string.stripe_cvc_number_hint, new Object[0], c25271y);
            case 11:
                String it7 = (String) obj;
                AbstractC22676k.m65750j(it7, "it");
                return AbstractC32128i.m100055i(AbstractC37978j.m121655p(it7));
            case 12:
                InterfaceC15421s3 it8 = (InterfaceC15421s3) obj;
                AbstractC22676k.m65750j(it8, "it");
                return Boolean.valueOf(it8.isValid());
            case 13:
                EnumC38853i it9 = (EnumC38853i) obj;
                AbstractC22676k.m65750j(it9, "it");
                return new C15411q3(it9.f167263z, z4, (C16587n0) (objArr == true ? 1 : 0), i14);
            case 14:
                String it10 = (String) obj;
                AbstractC22676k.m65750j(it10, "it");
                return AbstractC32128i.m100055i(AbstractC37978j.m121655p(it10));
            case 15:
                InterfaceC15421s3 it11 = (InterfaceC15421s3) obj;
                AbstractC22676k.m65750j(it11, "it");
                return Boolean.valueOf(it11.isValid());
            case 16:
                C0764g Json = (C0764g) obj;
                AbstractC22676k.m65750j(Json, "$this$Json");
                Json.f2776c = true;
                return c23454a0;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                InterfaceC39407k it12 = (InterfaceC39407k) obj;
                AbstractC22676k.m65750j(it12, "it");
                return String.valueOf(AbstractC39414r.m125882a0(((C39410n) it12).m125845c()) - '7');
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                C0764g Json2 = (C0764g) obj;
                AbstractC22676k.m65750j(Json2, "$this$Json");
                Json2.f2776c = true;
                Json2.f2781h = "#class";
                Json2.f2780g = true;
                return c23454a0;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                AbstractC22676k.m65750j((InterfaceC18044z) obj, "$this$semantics");
                return c23454a0;
            case 20:
                return String.valueOf(((Boolean) obj).booleanValue());
            case 21:
                return String.valueOf(((Boolean) obj).booleanValue());
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                AbstractC22676k.m65750j((InterfaceC18044z) obj, "$this$semantics");
                return c23454a0;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC37947f.m121498E((C23277r0) obj);
            case 24:
                return AbstractC37991c.m121693h(((Boolean) obj).booleanValue());
            case 25:
                return AbstractC37991c.m121694i((EnumC22400l) obj);
            case 26:
                return C38038c.m121780f((C27354e) obj);
            case 27:
                return C38096b.m122051h((InterfaceC33687a) obj);
            case 28:
                return AbstractC38137b.m122149q((AbstractC34718a) obj);
            default:
                return AbstractC38137b.m122150r((AbstractC35839a) obj);
        }
    }
}
