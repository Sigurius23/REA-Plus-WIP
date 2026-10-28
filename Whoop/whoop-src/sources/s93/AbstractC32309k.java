package s93;

import aws.sdk.kotlin.runtime.AwsServiceException;
import az.C2157a;
import bd3.C3130k;
import cg.C4552g;
import cg.C4554i;
import cg.C4555j;
import cg.C4560o;
import cg.C4569x;
import cg.C4570y;
import com.whoop.android.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.datetime.internal.format.parser.ParseException;
import m83.AbstractC25265s;
import m83.AbstractC25269w;
import m83.C25271y;
import p088dc.AbstractC11895b;
import p249jc.AbstractC21598x;
import p326mf.AbstractC25492l;
import p326mf.C25483c;
import p326mf.EnumC25498r;
import p326mf.InterfaceC25482b;
import p326mf.InterfaceC25488h;
import p479s4.AbstractC32128i;
import p501te.C33740e;
import p551vf.C35937b;
import p551vf.C35942g;
import p551vf.C35943h;
import p551vf.InterfaceC35936a;
import p577wa.C36979f;
import p581we.C37199o;
import p598wy.InterfaceC37689b;
import p696zy.C41210b;
import p696zy.InterfaceC41211c;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import u71.C34569c;
import uc3.C34769g;
import uc3.C34770h;
import uc3.C34771i;
import uc3.C34772j;
import uc3.C34774l;
import uc3.InterfaceC34764b;
import uc3.InterfaceC34773k;
import ud3.C34832o0;
import wb3.AbstractC37056f;
import wf.C37236a;
import ye.C39476c;

/* JADX INFO: renamed from: s93.k */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC32309k implements InterfaceC37689b {
    /* JADX INFO: renamed from: a */
    public static final C34832o0 m100572a(C34832o0 c34832o0) {
        c34832o0.getClass();
        return c34832o0;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC41211c m100573b(String merchantName, String str, boolean z4, boolean z13, boolean z14, boolean z15, boolean z16) {
        String str2;
        C41210b c41210bM100064s;
        AbstractC22676k.m65750j(merchantName, "merchantName");
        if (z15) {
            str2 = "https://link.com/terms/ach-authorization";
        } else {
            if (z15) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = "https://stripe.com/ach-payments/authorization";
        }
        List listM118959K = AbstractC37056f.m118959K(new C2157a("<terms>", AbstractC11895b.m31996o("<a href=\"", str2, "\">")), new C2157a("</terms>", "</a>"));
        if (z4 && str != null) {
            c41210bM100064s = AbstractC32128i.m100064s(R.string.stripe_wallet_bank_account_terms_merchant_and_seller, new Object[]{merchantName, str, merchantName}, listM118959K);
        } else if (str != null) {
            c41210bM100064s = AbstractC32128i.m100064s(R.string.stripe_wallet_bank_account_terms_seller, new Object[]{str}, listM118959K);
        } else {
            c41210bM100064s = (z14 || z16) ? AbstractC32128i.m100064s(R.string.stripe_paymentsheet_ach_save_mandate, new Object[]{merchantName}, listM118959K) : AbstractC32128i.m100064s(R.string.stripe_paymentsheet_ach_continue_mandate, new Object[0], listM118959K);
        }
        C41210b c41210bM100064s2 = z13 ? AbstractC32128i.m100064s(R.string.stripe_paymentsheet_microdeposit, new Object[]{merchantName}, C25271y.f99162w) : null;
        return c41210bM100064s2 != null ? AbstractC32128i.m100062q(AbstractC32128i.m100062q(c41210bM100064s2, AbstractC32128i.m100055i(" ")), c41210bM100064s) : c41210bM100064s;
    }

    /* JADX INFO: renamed from: c */
    public static void m100574c(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC32307i m100575d(InterfaceC32307i first, InterfaceC32307i second) {
        AbstractC22676k.m65750j(first, "first");
        AbstractC22676k.m65750j(second, "second");
        if (first.isEmpty()) {
            return second;
        }
        return second.isEmpty() ? first : new C32308j(new InterfaceC32307i[]{first, second});
    }

    /* JADX INFO: renamed from: f */
    public static InterfaceC34764b m100576f(C34774l c34774l, String str, InterfaceC34764b initialContainer) throws IOException, ParseException {
        String string;
        AbstractC22676k.m65750j(initialContainer, "initialContainer");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayListM118964P = AbstractC37056f.m118964P(new C34770h(initialContainer, c34774l, 0));
        while (true) {
            C34770h c34770h = (C34770h) AbstractC25265s.m74136m1(arrayListM118964P);
            if (c34770h != null) {
                InterfaceC34764b interfaceC34764b = (InterfaceC34764b) ((InterfaceC34764b) c34770h.f146438a).mo92535a();
                int iIntValue = c34770h.f146440c;
                C34774l c34774l2 = c34770h.f146439b;
                List list = c34774l2.f146442a;
                List list2 = c34774l2.f146443b;
                int size = list.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size) {
                        if (!list2.isEmpty()) {
                            int size2 = list2.size() - 1;
                            if (size2 < 0) {
                                break;
                            }
                            while (true) {
                                int i14 = size2 - 1;
                                arrayListM118964P.add(new C34770h(interfaceC34764b, (C34774l) list2.get(size2), iIntValue));
                                if (i14 < 0) {
                                    break;
                                }
                                size2 = i14;
                            }
                        } else {
                            if (iIntValue != str.length()) {
                                arrayList.add(new C34769g(iIntValue, C34772j.f146441w));
                                break;
                            }
                            return interfaceC34764b;
                        }
                    } else {
                        Object objMo109777a = ((InterfaceC34773k) c34774l2.f146442a.get(i13)).mo109777a(interfaceC34764b, str, iIntValue);
                        if (!(objMo109777a instanceof Integer)) {
                            if (objMo109777a instanceof C34769g) {
                                arrayList.add((C34769g) objMo109777a);
                                break;
                            }
                            throw new IllegalStateException(("Unexpected parse result: " + objMo109777a).toString());
                        }
                        iIntValue = ((Number) objMo109777a).intValue();
                        i13++;
                    }
                }
            } else {
                if (arrayList.size() > 1) {
                    AbstractC25269w.m74166l0(arrayList, new C34771i());
                }
                if (arrayList.size() == 1) {
                    string = "Position " + ((C34769g) arrayList.get(0)).f146436a + ": " + ((String) ((C34769g) arrayList.get(0)).f146437b.invoke());
                } else {
                    StringBuilder sb4 = new StringBuilder(arrayList.size() * 33);
                    AbstractC25265s.m74109M0(arrayList, sb4, ", ", "Errors: ", null, new C34569c(13), 56);
                    string = sb4.toString();
                    AbstractC22676k.m65749i(string, "toString(...)");
                }
                throw new ParseException(string);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static C36979f m100577g(C36979f c36979f, String[] strArr, Map map) {
        int i13 = 0;
        if (c36979f == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (C36979f) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                C36979f c36979f2 = new C36979f();
                int length = strArr.length;
                while (i13 < length) {
                    c36979f2.m118712a((C36979f) map.get(strArr[i13]));
                    i13++;
                }
                return c36979f2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                c36979f.m118712a((C36979f) map.get(strArr[0]));
                return c36979f;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i13 < length2) {
                    c36979f.m118712a((C36979f) map.get(strArr[i13]));
                    i13++;
                }
            }
        }
        return c36979f;
    }

    /* JADX INFO: renamed from: h */
    public static final void m100578h(AwsServiceException awsServiceException, C37236a c37236a, C39476c c39476c) {
        AbstractC21598x.m60701s0(awsServiceException.getF8399w().f141122a, C33740e.f141123e, c39476c != null ? c39476c.f169859a : null);
        AbstractC21598x.m60701s0(awsServiceException.getF8399w().f141122a, C33740e.f141124f, c39476c != null ? c39476c.f169860b : null);
        AbstractC21598x.m60701s0(awsServiceException.getF8399w().f141122a, C33740e.f141127i, c37236a.f159236b.get("x-amz-request-id"));
        awsServiceException.getF8399w().f141122a.mo33083c(C33740e.f141126h, c37236a);
    }

    /* JADX INFO: renamed from: i */
    public static final C35937b m100579i(InterfaceC35936a interfaceC35936a) {
        AbstractC22676k.m65750j(interfaceC35936a, "<this>");
        if (interfaceC35936a instanceof C35942g) {
            C35942g c35942g = (C35942g) interfaceC35936a;
            if (c35942g.f153034b) {
                return c35942g.f153033a;
            }
            throw new IllegalStateException("This is an immutable HttpRequest that should not be converted to a builder");
        }
        if (!(interfaceC35936a instanceof C35943h)) {
            throw new NoWhenBranchMatchedException();
        }
        C35937b c35937b = new C35937b();
        C35943h c35943h = (C35943h) interfaceC35936a;
        EnumC25498r enumC25498r = c35943h.f153039a;
        AbstractC22676k.m65750j(enumC25498r, "<set-?>");
        c35937b.f153015w = enumC25498r;
        InterfaceC25488h interfaceC25488h = c35943h.f153041c;
        C25483c c25483c = c35937b.f153017y;
        c25483c.getClass();
        for (Map.Entry entry : interfaceC25488h.mo44479b()) {
            String name = (String) entry.getKey();
            List values = (List) entry.getValue();
            AbstractC22676k.m65750j(name, "name");
            AbstractC22676k.m65750j(values, "values");
            c25483c.m387h(name, values);
        }
        C4560o c4560o = c35943h.f153040b;
        C4555j c4555j = c35937b.f153016x;
        c4555j.getClass();
        c4555j.f18354w = c4560o.f18368a;
        c4555j.f18355x = c4560o.f18369b;
        c4555j.f18356y = Integer.valueOf(c4560o.f18370c);
        C3130k c3130k = c4555j.f18357z;
        C4569x c4569x = c4560o.f18371d;
        c3130k.getClass();
        ArrayList arrayList = (ArrayList) c3130k.f12277c;
        arrayList.clear();
        arrayList.addAll(c4569x.f18386a);
        c3130k.f12276b = c4569x.f18387b;
        C4552g c4552g = c4555j.f18351E;
        C4554i c4554i = c4560o.f18372e;
        c4552g.getClass();
        c4552g.clear();
        for (Map.Entry entry2 : c4554i.f18349w.entrySet()) {
            c4552g.put(entry2.getKey(), (Object) AbstractC25265s.m74097F1((List) entry2.getValue()));
        }
        c4552g.f18344x = c4554i.f18350x;
        C37199o c37199o = c4555j.f18352F;
        C4570y c4570y = c4560o.f18373f;
        c37199o.getClass();
        c37199o.f159040w = c4570y.f18389a;
        c37199o.f159041x = c4570y.f18390b;
        c4555j.f18353G = c4560o.f18374g;
        AbstractC25492l abstractC25492l = c35943h.f153042d;
        AbstractC22676k.m65750j(abstractC25492l, "<set-?>");
        c35937b.f153018z = abstractC25492l;
        InterfaceC25482b interfaceC25482b = c35943h.f153043e;
        C25483c c25483c2 = c35937b.f153014E;
        c25483c2.getClass();
        for (Map.Entry entry3 : interfaceC25482b.mo44479b()) {
            String name2 = (String) entry3.getKey();
            List values2 = (List) entry3.getValue();
            AbstractC22676k.m65750j(name2, "name");
            AbstractC22676k.m65750j(values2, "values");
            c25483c2.m387h(name2, values2);
        }
        return c35937b;
    }

    /* JADX INFO: renamed from: e */
    public abstract String mo100580e();
}
