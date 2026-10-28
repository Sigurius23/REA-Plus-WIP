package kg2;

import ad3.C0764g;
import android.util.Log;
import androidx.health.platform.client.proto.C1533u;
import com.whoop.navigation.json.NavigationActionTypeAdapter;
import com.whoop.startactivity.goals.StartActivityTargetsMiniArch;
import j93.AbstractC21478l0;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import jb1.C21536b;
import ki0.AbstractC22502b;
import kk0.C22538a;
import l02.C23050a;
import p181h2.C16617b;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p208i2.C17924z0;
import p294l3.AbstractC23265l0;
import p294l3.AbstractC23278s;
import p294l3.C23245b0;
import p294l3.C23250e;
import p294l3.C23251e0;
import p294l3.C23254g;
import p294l3.C23263k0;
import p294l3.C23267m0;
import p294l3.C23271o0;
import p294l3.C23279s0;
import p294l3.C23280t;
import p294l3.C23282u;
import p294l3.C23283u0;
import p294l3.C23287w0;
import p294l3.C23289x0;
import p294l3.EnumC23262k;
import p294l3.InterfaceC23244b;
import p392p3.AbstractC28771i;
import p392p3.C28776n;
import p392p3.C28777o;
import p392p3.C28780r;
import p478s3.AbstractC32097c;
import p478s3.C32095a;
import p478s3.C32096b;
import p571w3.C36765a;
import p571w3.C36768d;
import p571w3.C36769e;
import p571w3.C36770f;
import p571w3.C36771g;
import p571w3.C36772h;
import p571w3.C36773i;
import p571w3.C36775k;
import p571w3.C36776l;
import p571w3.C36777m;
import p571w3.C36780p;
import p571w3.C36781q;
import p571w3.C36783s;
import p636y3.C39183o;
import p636y3.C39184p;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23749z0;
import v63.AbstractC35745c;

/* JADX INFO: renamed from: kg2.e */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C22459e implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f87977w;

    public /* synthetic */ C22459e(int i13) {
        this.f87977w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C17919x c17919x;
        C17919x c17919x2;
        C17919x c17919x3;
        int i13 = 0;
        switch (this.f87977w) {
            case 0:
                return AbstractC22460f.m64872f((C21536b) obj);
            case 1:
                return AbstractC22460f.m64873g((C23749z0) obj);
            case 2:
                return AbstractC22460f.m64874h((StartActivityTargetsMiniArch) obj);
            case 3:
                return AbstractC22502b.m65005c((C0764g) obj);
            case 4:
                return C22538a.m65132k((C22538a) obj);
            case 5:
                return NavigationActionTypeAdapter.m23139d((C0764g) obj);
            case 6:
                return C23050a.m66985b((C0764g) obj);
            case 7:
                return Boolean.valueOf(!(((InterfaceC23244b) obj) instanceof C23245b0));
            case 8:
                AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                Function1 function1 = (Function1) AbstractC23265l0.f92173i.f115463y;
                Boolean bool = Boolean.FALSE;
                C23267m0 c23267m0 = (AbstractC22676k.m65745e(obj2, bool) || obj2 == null) ? null : (C23267m0) function1.invoke(obj2);
                Object obj3 = list.get(1);
                C23267m0 c23267m1 = (AbstractC22676k.m65745e(obj3, bool) || obj3 == null) ? null : (C23267m0) function1.invoke(obj3);
                Object obj4 = list.get(2);
                C23267m0 c23267m2 = (AbstractC22676k.m65745e(obj4, bool) || obj4 == null) ? null : (C23267m0) function1.invoke(obj4);
                Object obj5 = list.get(3);
                return new C23279s0(c23267m0, c23267m1, c23267m2, (AbstractC22676k.m65745e(obj5, bool) || obj5 == null) ? null : (C23267m0) function1.invoke(obj5));
            case 9:
                AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list2 = (List) obj;
                Object obj6 = list2.get(1);
                List list3 = (AbstractC22676k.m65745e(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((Function1) AbstractC23265l0.f92166b.f115463y).invoke(obj6);
                Object obj7 = list2.get(0);
                String str = obj7 != null ? (String) obj7 : null;
                AbstractC22676k.m65747g(str);
                return new C23254g(list3, str);
            case 10:
                AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.Int");
                return new C36776l(((Integer) obj).intValue());
            case 11:
                AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                List list4 = (List) obj;
                return new C36780p(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
            case 12:
                AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list5 = (List) obj;
                Object obj8 = list5.get(0);
                C39184p[] c39184pArr = C39183o.f168427b;
                Function1 function2 = AbstractC23265l0.f92183s.f92159x;
                Boolean bool2 = Boolean.FALSE;
                AbstractC22676k.m65745e(obj8, bool2);
                C39183o c39183o = obj8 != null ? (C39183o) function2.invoke(obj8) : null;
                AbstractC22676k.m65747g(c39183o);
                long j7 = c39183o.f168429a;
                Object obj9 = list5.get(1);
                AbstractC22676k.m65745e(obj9, bool2);
                C39183o c39183o2 = obj9 != null ? (C39183o) function2.invoke(obj9) : null;
                AbstractC22676k.m65747g(c39183o2);
                return new C36781q(j7, c39183o2.f168429a);
            case 13:
                AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.Int");
                return new C28780r(((Integer) obj).intValue());
            case 14:
                AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.Float");
                return new C36765a(((Float) obj).floatValue());
            case 15:
                AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list6 = (List) obj;
                Object obj10 = list6.get(0);
                Integer num = obj10 != null ? (Integer) obj10 : null;
                AbstractC22676k.m65747g(num);
                int iIntValue = num.intValue();
                Object obj11 = list6.get(1);
                Integer num2 = obj11 != null ? (Integer) obj11 : null;
                AbstractC22676k.m65747g(num2);
                return new C23283u0(AbstractC21478l0.m60431f(iIntValue, num2.intValue()));
            case 16:
                AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list7 = (List) obj;
                Object obj12 = list7.get(0);
                int i14 = C17919x.f69638o;
                Boolean bool3 = Boolean.FALSE;
                AbstractC22676k.m65745e(obj12, bool3);
                if (obj12 != null) {
                    c17919x = AbstractC22676k.m65745e(obj12, Boolean.FALSE) ? new C17919x(C17919x.f69637n) : new C17919x(AbstractC17918w0.m51515c(((Integer) obj12).intValue()));
                } else {
                    c17919x = null;
                }
                AbstractC22676k.m65747g(c17919x);
                long j13 = c17919x.f69639a;
                Object obj13 = list7.get(1);
                C23263k0 c23263k0 = AbstractC23265l0.f92184t;
                AbstractC22676k.m65745e(obj13, bool3);
                C16617b c16617b = obj13 != null ? (C16617b) c23263k0.f92159x.invoke(obj13) : null;
                AbstractC22676k.m65747g(c16617b);
                long j14 = c16617b.f63937a;
                Object obj14 = list7.get(2);
                Float f13 = obj14 != null ? (Float) obj14 : null;
                AbstractC22676k.m65747g(f13);
                return new C17924z0(j13, j14, f13.floatValue());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                if (AbstractC22676k.m65745e(obj, Boolean.FALSE)) {
                    return new C39183o(C39183o.f168428c);
                }
                AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list8 = (List) obj;
                Object obj15 = list8.get(0);
                Float f14 = obj15 != null ? (Float) obj15 : null;
                AbstractC22676k.m65747g(f14);
                float fFloatValue = f14.floatValue();
                Object obj16 = list8.get(1);
                C39184p c39184p = obj16 != null ? (C39184p) obj16 : null;
                AbstractC22676k.m65747g(c39184p);
                return new C39183o(AbstractC35745c.m113248j(fFloatValue, c39184p.f168430a));
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list9 = (List) obj;
                Object obj17 = list9.get(0);
                String str2 = obj17 != null ? (String) obj17 : null;
                AbstractC22676k.m65747g(str2);
                Object obj18 = list9.get(1);
                return new C23282u(str2, (AbstractC22676k.m65745e(obj18, Boolean.FALSE) || obj18 == null) ? null : (C23279s0) ((Function1) AbstractC23265l0.f92174j.f115463y).invoke(obj18), null);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                if (AbstractC22676k.m65745e(obj, Boolean.FALSE)) {
                    return new C16617b(9205357640488583168L);
                }
                AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list10 = (List) obj;
                Object obj19 = list10.get(0);
                Float f15 = obj19 != null ? (Float) obj19 : null;
                AbstractC22676k.m65747g(f15);
                float fFloatValue2 = f15.floatValue();
                Object obj20 = list10.get(1);
                Float f16 = obj20 != null ? (Float) obj20 : null;
                AbstractC22676k.m65747g(f16);
                return new C16617b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f16.floatValue())) & 4294967295L));
            case 20:
                AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list11 = (List) obj;
                ArrayList arrayList = new ArrayList(list11.size());
                int size = list11.size();
                while (i13 < size) {
                    Object obj21 = list11.get(i13);
                    C32095a c32095a = (AbstractC22676k.m65745e(obj21, Boolean.FALSE) || obj21 == null) ? null : (C32095a) ((Function1) AbstractC23265l0.f92186v.f115463y).invoke(obj21);
                    AbstractC22676k.m65747g(c32095a);
                    arrayList.add(c32095a);
                    i13++;
                }
                return new C32096b(arrayList);
            case 21:
                AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list12 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list12.size());
                int size2 = list12.size();
                while (i13 < size2) {
                    Object obj22 = list12.get(i13);
                    C23250e c23250e = (AbstractC22676k.m65745e(obj22, Boolean.FALSE) || obj22 == null) ? null : (C23250e) ((Function1) AbstractC23265l0.f92167c.f115463y).invoke(obj22);
                    AbstractC22676k.m65747g(c23250e);
                    arrayList2.add(c23250e);
                    i13++;
                }
                return arrayList2;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.String");
                String str3 = (String) obj;
                AbstractC32097c.f133101a.getClass();
                Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                if (AbstractC22676k.m65745e(localeForLanguageTag.toLanguageTag(), "und")) {
                    Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new C32095a(localeForLanguageTag);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list13 = (List) obj;
                Object obj23 = list13.get(0);
                C36770f c36770f = obj23 != null ? (C36770f) obj23 : null;
                AbstractC22676k.m65747g(c36770f);
                float f17 = c36770f.f157342a;
                Object obj24 = list13.get(1);
                C36772h c36772h = obj24 != null ? (C36772h) obj24 : null;
                AbstractC22676k.m65747g(c36772h);
                int i15 = c36772h.f157343a;
                Object obj25 = list13.get(2);
                AbstractC22676k.m65747g(obj25 != null ? (C36771g) obj25 : null);
                return new C36773i(f17, i15);
            case 24:
                AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list14 = (List) obj;
                Object obj26 = list14.get(0);
                EnumC23262k enumC23262k = obj26 != null ? (EnumC23262k) obj26 : null;
                AbstractC22676k.m65747g(enumC23262k);
                Object obj27 = list14.get(2);
                Integer num3 = obj27 != null ? (Integer) obj27 : null;
                AbstractC22676k.m65747g(num3);
                int iIntValue2 = num3.intValue();
                Object obj28 = list14.get(3);
                Integer num4 = obj28 != null ? (Integer) obj28 : null;
                AbstractC22676k.m65747g(num4);
                int iIntValue3 = num4.intValue();
                Object obj29 = list14.get(4);
                String str4 = obj29 != null ? (String) obj29 : null;
                AbstractC22676k.m65747g(str4);
                switch (enumC23262k.ordinal()) {
                    case 0:
                        Object obj30 = list14.get(1);
                        C23245b0 c23245b0 = (AbstractC22676k.m65745e(obj30, Boolean.FALSE) || obj30 == null) ? null : (C23245b0) ((Function1) AbstractC23265l0.f92172h.f115463y).invoke(obj30);
                        AbstractC22676k.m65747g(c23245b0);
                        return new C23250e(iIntValue2, iIntValue3, c23245b0, str4);
                    case 1:
                        Object obj31 = list14.get(1);
                        C23267m0 c23267m3 = (AbstractC22676k.m65745e(obj31, Boolean.FALSE) || obj31 == null) ? null : (C23267m0) ((Function1) AbstractC23265l0.f92173i.f115463y).invoke(obj31);
                        AbstractC22676k.m65747g(c23267m3);
                        return new C23250e(iIntValue2, iIntValue3, c23267m3, str4);
                    case 2:
                        Object obj32 = list14.get(1);
                        C23289x0 c23289x0 = (AbstractC22676k.m65745e(obj32, Boolean.FALSE) || obj32 == null) ? null : (C23289x0) ((Function1) AbstractC23265l0.f92168d.f115463y).invoke(obj32);
                        AbstractC22676k.m65747g(c23289x0);
                        return new C23250e(iIntValue2, iIntValue3, c23289x0, str4);
                    case 3:
                        Object obj33 = list14.get(1);
                        C23287w0 c23287w0 = (AbstractC22676k.m65745e(obj33, Boolean.FALSE) || obj33 == null) ? null : (C23287w0) ((Function1) AbstractC23265l0.f92169e.f115463y).invoke(obj33);
                        AbstractC22676k.m65747g(c23287w0);
                        return new C23250e(iIntValue2, iIntValue3, c23287w0, str4);
                    case 4:
                        Object obj34 = list14.get(1);
                        C23282u c23282u = (AbstractC22676k.m65745e(obj34, Boolean.FALSE) || obj34 == null) ? null : (C23282u) ((Function1) AbstractC23265l0.f92170f.f115463y).invoke(obj34);
                        AbstractC22676k.m65747g(c23282u);
                        return new C23250e(iIntValue2, iIntValue3, c23282u, str4);
                    case 5:
                        Object obj35 = list14.get(1);
                        C23280t c23280t = (AbstractC22676k.m65745e(obj35, Boolean.FALSE) || obj35 == null) ? null : (C23280t) ((Function1) AbstractC23265l0.f92171g.f115463y).invoke(obj35);
                        AbstractC22676k.m65747g(c23280t);
                        return new C23250e(iIntValue2, iIntValue3, c23280t, str4);
                    case 6:
                        Object obj36 = list14.get(1);
                        String str5 = obj36 != null ? (String) obj36 : null;
                        AbstractC22676k.m65747g(str5);
                        return new C23250e(iIntValue2, iIntValue3, new C23271o0(str5), str4);
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            case 25:
                String str6 = obj != null ? (String) obj : null;
                AbstractC22676k.m65747g(str6);
                return new C23289x0(str6);
            case 26:
                String str7 = obj != null ? (String) obj : null;
                AbstractC22676k.m65747g(str7);
                return new C23287w0(str7);
            case 27:
                AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list15 = (List) obj;
                Object obj37 = list15.get(0);
                String str8 = obj37 != null ? (String) obj37 : null;
                AbstractC22676k.m65747g(str8);
                Object obj38 = list15.get(1);
                return new C23280t(str8, (AbstractC22676k.m65745e(obj38, Boolean.FALSE) || obj38 == null) ? null : (C23279s0) ((Function1) AbstractC23265l0.f92174j.f115463y).invoke(obj38), null);
            case 28:
                AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list16 = (List) obj;
                Object obj39 = list16.get(0);
                C36775k c36775k = obj39 != null ? (C36775k) obj39 : null;
                AbstractC22676k.m65747g(c36775k);
                int i16 = c36775k.f157350a;
                Object obj40 = list16.get(1);
                C36777m c36777m = obj40 != null ? (C36777m) obj40 : null;
                AbstractC22676k.m65747g(c36777m);
                int i17 = c36777m.f157355a;
                Object obj41 = list16.get(2);
                C39184p[] c39184pArr2 = C39183o.f168427b;
                C23263k0 c23263k1 = AbstractC23265l0.f92183s;
                Boolean bool4 = Boolean.FALSE;
                AbstractC22676k.m65745e(obj41, bool4);
                C39183o c39183o3 = obj41 != null ? (C39183o) c23263k1.f92159x.invoke(obj41) : null;
                AbstractC22676k.m65747g(c39183o3);
                long j15 = c39183o3.f168429a;
                Object obj42 = list16.get(3);
                C36781q c36781q = C36781q.f157360c;
                C36781q c36781q2 = (AbstractC22676k.m65745e(obj42, bool4) || obj42 == null) ? null : (C36781q) ((Function1) AbstractC23265l0.f92177m.f115463y).invoke(obj42);
                Object obj43 = list16.get(4);
                C23251e0 c23251e0 = (AbstractC22676k.m65745e(obj43, bool4) || obj43 == null) ? null : (C23251e0) ((Function1) AbstractC23278s.f92234b.f115463y).invoke(obj43);
                Object obj44 = list16.get(5);
                C36773i c36773i = C36773i.f157344c;
                C36773i c36773i2 = (AbstractC22676k.m65745e(obj44, bool4) || obj44 == null) ? null : (C36773i) ((Function1) AbstractC23265l0.f92187w.f115463y).invoke(obj44);
                Object obj45 = list16.get(6);
                C36769e c36769e = (AbstractC22676k.m65745e(obj45, bool4) || obj45 == null) ? null : (C36769e) ((Function1) AbstractC23278s.f92235c.f115463y).invoke(obj45);
                AbstractC22676k.m65747g(c36769e);
                int i18 = c36769e.f157338a;
                Object obj46 = list16.get(7);
                C36768d c36768d = obj46 != null ? (C36768d) obj46 : null;
                AbstractC22676k.m65747g(c36768d);
                int i19 = c36768d.f157336a;
                Object obj47 = list16.get(8);
                return new C23245b0(i16, i17, j15, c36781q2, c23251e0, c36773i2, i18, i19, (AbstractC22676k.m65745e(obj47, bool4) || obj47 == null) ? null : (C36783s) ((Function1) AbstractC23278s.f92236d.f115463y).invoke(obj47));
            default:
                AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list17 = (List) obj;
                Object obj48 = list17.get(0);
                int i24 = C17919x.f69638o;
                Boolean bool5 = Boolean.FALSE;
                AbstractC22676k.m65745e(obj48, bool5);
                if (obj48 != null) {
                    c17919x2 = obj48.equals(bool5) ? new C17919x(C17919x.f69637n) : new C17919x(AbstractC17918w0.m51515c(((Integer) obj48).intValue()));
                } else {
                    c17919x2 = null;
                }
                AbstractC22676k.m65747g(c17919x2);
                long j16 = c17919x2.f69639a;
                Object obj49 = list17.get(1);
                C39184p[] c39184pArr3 = C39183o.f168427b;
                Function1 function3 = AbstractC23265l0.f92183s.f92159x;
                AbstractC22676k.m65745e(obj49, bool5);
                C39183o c39183o4 = obj49 != null ? (C39183o) function3.invoke(obj49) : null;
                AbstractC22676k.m65747g(c39183o4);
                long j17 = c39183o4.f168429a;
                Object obj50 = list17.get(2);
                C28780r c28780r = C28780r.f116544x;
                C28780r c28780r2 = (AbstractC22676k.m65745e(obj50, bool5) || obj50 == null) ? null : (C28780r) ((Function1) AbstractC23265l0.f92178n.f115463y).invoke(obj50);
                Object obj51 = list17.get(3);
                C28776n c28776n = obj51 != null ? (C28776n) obj51 : null;
                Object obj52 = list17.get(4);
                C28777o c28777o = obj52 != null ? (C28777o) obj52 : null;
                Object obj53 = list17.get(6);
                String str9 = obj53 != null ? (String) obj53 : null;
                Object obj54 = list17.get(7);
                AbstractC22676k.m65745e(obj54, bool5);
                C39183o c39183o5 = obj54 != null ? (C39183o) function3.invoke(obj54) : null;
                AbstractC22676k.m65747g(c39183o5);
                long j18 = c39183o5.f168429a;
                Object obj55 = list17.get(8);
                C36765a c36765a = (AbstractC22676k.m65745e(obj55, bool5) || obj55 == null) ? null : (C36765a) ((Function1) AbstractC23265l0.f92179o.f115463y).invoke(obj55);
                Object obj56 = list17.get(9);
                C36780p c36780p = (AbstractC22676k.m65745e(obj56, bool5) || obj56 == null) ? null : (C36780p) ((Function1) AbstractC23265l0.f92176l.f115463y).invoke(obj56);
                Object obj57 = list17.get(10);
                C32096b c32096b = C32096b.f133098y;
                C32096b c32096b2 = (AbstractC22676k.m65745e(obj57, bool5) || obj57 == null) ? null : (C32096b) ((Function1) AbstractC23265l0.f92185u.f115463y).invoke(obj57);
                Object obj58 = list17.get(11);
                AbstractC22676k.m65745e(obj58, bool5);
                if (obj58 != null) {
                    c17919x3 = obj58.equals(bool5) ? new C17919x(C17919x.f69637n) : new C17919x(AbstractC17918w0.m51515c(((Integer) obj58).intValue()));
                } else {
                    c17919x3 = null;
                }
                AbstractC22676k.m65747g(c17919x3);
                long j19 = c17919x3.f69639a;
                Object obj59 = list17.get(12);
                C36776l c36776l = (AbstractC22676k.m65745e(obj59, bool5) || obj59 == null) ? null : (C36776l) ((Function1) AbstractC23265l0.f92175k.f115463y).invoke(obj59);
                Object obj60 = list17.get(13);
                C17924z0 c17924z0 = C17924z0.f69668d;
                return new C23267m0(j16, j17, c28780r2, c28776n, c28777o, (AbstractC28771i) null, str9, j18, c36765a, c36780p, c32096b2, j19, c36776l, (AbstractC22676k.m65745e(obj60, bool5) || obj60 == null) ? null : (C17924z0) ((Function1) AbstractC23265l0.f92181q.f115463y).invoke(obj60), 49184);
        }
    }
}
