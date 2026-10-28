package s93;

import a81.C0563n;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import bd3.C3130k;
import c93.InterfaceC4339a;
import cb3.C4392d;
import cg.C4552g;
import cg.C4554i;
import cg.C4555j;
import cg.C4569x;
import com.stripe.android.p056ui.core.elements.FormItemSpec;
import com.stripe.android.p056ui.core.elements.SharedDataSpec;
import com.stripe.android.uicore.elements.IdentifierSpec;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import gf.C15762c;
import gf.C15768i;
import gf.InterfaceC15761b;
import h20.EnumC16673i3;
import io.sentry.hints.C20363j;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.C25271y;
import o73.C27648a;
import p000.AbstractC11266d;
import p009a8.C0534d;
import p026b2.C2314t;
import p028b4.AbstractC2703n;
import p031b9.AbstractC2875y;
import p249jc.AbstractC21598x;
import p326mf.AbstractC25491k;
import p326mf.AbstractC25492l;
import p326mf.C25483c;
import p326mf.C25490j;
import p326mf.C25494n;
import p326mf.EnumC25498r;
import p367of.C27892a;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p437qt.C30582e;
import p484s9.AbstractC32281f;
import p505ts.AbstractC34132o;
import p508ty.C34249c;
import p551vf.C35937b;
import p551vf.C35938c;
import p551vf.C35939d;
import p551vf.C35940e;
import p551vf.C35942g;
import p598wy.InterfaceC37689b;
import p611xd.AbstractC38196a;
import p613xf.AbstractC38256b;
import p647yf.C39498k;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import p715kotlin.time.DurationKt;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import tg.C33770b;
import u11.C34441g;
import ub3.InterfaceC34747a;
import ug.C34913b;
import um0.C35076b;
import v00.AbstractC35461d0;
import v00.C35459c0;
import v00.InterfaceC35457b0;
import va3.C35847e;
import ve.C35919d;
import ve.C35920e;
import x30.AbstractC37926s0;
import x93.AbstractC38109c;
import y00.C38793c;
import yb3.AbstractC39421y;
import yd3.AbstractC39470a;
import yd3.C39472c;

/* JADX INFO: renamed from: s93.h */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC32306h implements InterfaceC37689b {
    /* JADX INFO: renamed from: a */
    public static final void m100553a(String url, String clientSecret, InterfaceC4339a onClose, Composer composer, int i13) {
        String str;
        String str2;
        InterfaceC4339a interfaceC4339a;
        AbstractC22676k.m65750j(url, "url");
        AbstractC22676k.m65750j(clientSecret, "clientSecret");
        AbstractC22676k.m65750j(onClose, "onClose");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1960822209);
        if ((((c28655q.m87153g(url) ? 4 : 2) | i13 | (c28655q.m87153g(clientSecret) ? 32 : 16) | (c28655q.m87157i(onClose) ? 256 : 128)) & 147) == 146 && c28655q.m87121F()) {
            c28655q.m87138X();
            str = url;
            str2 = clientSecret;
            interfaceC4339a = onClose;
        } else {
            C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(Boolean.FALSE);
            InterfaceC28601c1 interfaceC28601c1M83597t = C27648a.m83597t(c13045h2M36593c, c28655q, 0);
            C22669g0 c22669g0 = new C22669g0();
            str = url;
            str2 = clientSecret;
            interfaceC4339a = onClose;
            AbstractC2703n.m7582a(new C0563n(c13045h2M36593c, str2, str, c22669g0, interfaceC4339a, 17), AbstractC1136a.m3599a(AbstractC1102d.m3407d(1.0f, C2314t.f9131w), "qr_code_web_view"), new C35076b(29, c22669g0, interfaceC28601c1M83597t), c28655q, 48);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C34441g(str, str2, interfaceC4339a, i13);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m100554b(Logger logger, AbstractC39470a abstractC39470a, C39472c c39472c, String str) {
        logger.fine(c39472c.f169836b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + abstractC39470a.f169829a);
    }

    /* JADX INFO: renamed from: c */
    public static final Map m100555c(C38793c c38793c) {
        IdentifierSpec.Companion.getClass();
        return AbstractC25247g0.m73990Y(new C23465k(IdentifierSpec.Line1, c38793c.f166962y), new C23465k(IdentifierSpec.Line2, c38793c.f166963z), new C23465k(IdentifierSpec.City, c38793c.f166960w), new C23465k(IdentifierSpec.State, c38793c.f166959F), new C23465k(IdentifierSpec.Country, c38793c.f166961x), new C23465k(IdentifierSpec.PostalCode, c38793c.f166958E));
    }

    /* JADX INFO: renamed from: d */
    public static String m100556d(Constructor constructor) {
        StringBuilder sb4 = new StringBuilder("(");
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        AbstractC22676k.m65749i(parameterTypes, "getParameterTypes(...)");
        for (Class<?> cls : parameterTypes) {
            AbstractC22676k.m65747g(cls);
            sb4.append(AbstractC38109c.m122090b(cls));
        }
        sb4.append(")V");
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public static final Object m100557e(AbstractC25492l abstractC25492l, C39498k c39498k, AbstractC32269c abstractC32269c) throws IOException {
        C35938c c35938c;
        if (abstractC32269c instanceof C35938c) {
            c35938c = (C35938c) abstractC32269c;
            int i13 = c35938c.f153022z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c35938c.f153022z = i13 - Integer.MIN_VALUE;
            } else {
                c35938c = new C35938c(abstractC32269c);
            }
        } else {
            c35938c = new C35938c(abstractC32269c);
        }
        Object objM121450B = c35938c.f153021y;
        Object obj = EnumC31071a.f128113w;
        int i14 = c35938c.f153022z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM121450B);
            c35938c.f153019w = abstractC25492l;
            c35938c.f153020x = c39498k;
            c35938c.f153022z = 1;
            objM121450B = AbstractC37926s0.m121450B(abstractC25492l, c35938c);
            if (objM121450B == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c39498k = c35938c.f153020x;
            abstractC25492l = c35938c.f153019w;
            AbstractC34132o.m107864I(objM121450B);
        }
        byte[] bArr = (byte[]) objM121450B;
        if (bArr == null) {
            return C25490j.f99825a;
        }
        c39498k.write(bArr, 0, bArr.length);
        return new C35939d(abstractC25492l, bArr);
    }

    /* JADX INFO: renamed from: f */
    public static ArrayList m100558f(C35459c0 c35459c0, SharedDataSpec sharedDataSpec, C34249c c34249c) {
        ArrayList<FormItemSpec> fields = sharedDataSpec.getFields();
        String paymentMethodCode = sharedDataSpec.getType();
        AbstractC22676k.m65750j(paymentMethodCode, "paymentMethodCode");
        InterfaceC35457b0 interfaceC35457b0 = (InterfaceC35457b0) ((Map) AbstractC35461d0.f151001b.getValue()).get(paymentMethodCode);
        EnumC16673i3 enumC16673i3 = (EnumC16673i3) c35459c0.f150983Z.get(interfaceC35457b0 != null ? interfaceC35457b0.getType() : null);
        if (enumC16673i3 == null) {
            enumC16673i3 = EnumC16673i3.f64121w;
        }
        return c34249c.m108305v(c35459c0, fields, C25271y.f99162w, enumC16673i3);
    }

    /* JADX INFO: renamed from: g */
    public static final C35920e m100559g(String accessKeyId, String secretAccessKey, String str, C34913b c34913b, String str2, String str3) {
        InterfaceC15761b interfaceC15761b;
        AbstractC22676k.m65750j(accessKeyId, "accessKeyId");
        AbstractC22676k.m65750j(secretAccessKey, "secretAccessKey");
        if (str2 == null && str3 == null) {
            interfaceC15761b = C15768i.f59433w;
        } else {
            C15762c c15762c = new C15762c();
            AbstractC21598x.m60701s0(c15762c, AbstractC38256b.f164024a, str2);
            AbstractC21598x.m60701s0(c15762c, AbstractC38196a.f163563b, str3);
            interfaceC15761b = c15762c;
        }
        return C35919d.m114098a(accessKeyId, secretAccessKey, str, c34913b, interfaceC15761b, 16);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ C35920e m100560h(String str, String str2, String str3, String str4, String str5, int i13) {
        if ((i13 & 16) != 0) {
            str4 = null;
        }
        return m100559g(str, str2, str3, null, str4, str5);
    }

    /* JADX INFO: renamed from: i */
    public static Object m100561i(Collection collection, InterfaceC34747a interfaceC34747a, AbstractC32281f abstractC32281f) {
        C0534d c0534d = new C0534d(2);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            m100562j(it.next(), interfaceC34747a, c0534d, abstractC32281f);
        }
        return abstractC32281f.mo13802y();
    }

    /* JADX INFO: renamed from: j */
    public static void m100562j(Object obj, InterfaceC34747a interfaceC34747a, C0534d c0534d, AbstractC32281f abstractC32281f) {
        if (obj != null) {
            if (c0534d.f1848a.add(obj) && abstractC32281f.mo13801q(obj)) {
                Iterator it = interfaceC34747a.mo13799r(obj).iterator();
                while (it.hasNext()) {
                    m100562j(it.next(), interfaceC34747a, c0534d, abstractC32281f);
                }
                abstractC32281f.mo13800p(obj);
                return;
            }
            return;
        }
        Object[] objArr = new Object[3];
        switch (22) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
            case 21:
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 4:
            case 7:
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (22) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: k */
    public static final Object m100563k(C35937b c35937b, boolean z4, AbstractC32269c abstractC32269c) throws IOException {
        C35940e c35940e;
        C39498k c39498k;
        Long lMo74901a;
        C39498k c39498k2;
        C35937b c35937b2 = c35937b;
        if (abstractC32269c instanceof C35940e) {
            c35940e = (C35940e) abstractC32269c;
            int i13 = c35940e.f153030z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c35940e.f153030z = i13 - Integer.MIN_VALUE;
            } else {
                c35940e = new C35940e(abstractC32269c);
            }
        } else {
            c35940e = new C35940e(abstractC32269c);
        }
        Object obj = c35940e.f153029y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c35940e.f153030z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            c39498k = new C39498k();
            StringBuilder sb4 = new StringBuilder();
            EnumC25498r enumC25498r = c35937b2.f153015w;
            C25483c c25483c = c35937b2.f153017y;
            C4555j c4555j = c35937b2.f153016x;
            sb4.append(enumC25498r);
            sb4.append(' ');
            StringBuilder sb5 = new StringBuilder();
            C3130k c3130k = c4555j.f18357z;
            c3130k.getClass();
            int i15 = C4569x.f18385c;
            sb5.append(C20363j.m56528i((ArrayList) c3130k.f12277c, c3130k.f12276b));
            C4552g c4552g = c4555j.f18351E;
            c4552g.getClass();
            int i16 = C4554i.f18348y;
            sb5.append(C30582e.m93815c(c4552g.f18343w.mo14235f(), c4552g.f18344x));
            C33770b c33770b = c4555j.f18353G;
            if (c33770b != null) {
                sb5.append('#');
                sb5.append(c33770b.f141349b);
            }
            String string = sb5.toString();
            AbstractC22676k.m65750j(string, "<this>");
            if (!AbstractC39421y.m125930O(string, "/", false)) {
                string = "/".concat(string);
            }
            sb4.append(string);
            sb4.append("\r\n");
            String string2 = sb4.toString();
            c39498k.mo126148z(string2.length(), string2);
            String str = "Host: " + c4555j.f18355x + "\r\n";
            c39498k.mo126148z(str.length(), str);
            String str2 = (String) c25483c.m397v("Content-Length");
            long jLongValue = ((str2 == null || (lMo74901a = AbstractC39421y.m125933R(str2)) == null) && (lMo74901a = c35937b2.f153018z.mo74901a()) == null) ? 0L : lMo74901a.longValue();
            if (jLongValue > 0) {
                String str3 = "Content-Length: " + jLongValue + "\r\n";
                c39498k.mo126148z(str3.length(), str3);
            }
            Set setM74059b1 = AbstractC25260n.m74059b1(new String[]{"Host", "Content-Length"});
            Set setEntrySet = ((Map) c25483c.f475x).entrySet();
            ArrayList<Map.Entry> arrayList = new ArrayList();
            for (Object obj2 : setEntrySet) {
                if (!setM74059b1.contains(((Map.Entry) obj2).getKey())) {
                    arrayList.add(obj2);
                }
            }
            for (Map.Entry entry : arrayList) {
                String strM74110N0 = AbstractC25265s.m74110N0((List) entry.getValue(), ";", AbstractC2875y.m8299l((String) entry.getKey(), ": "), "\r\n", null, 56);
                c39498k.mo126148z(strM74110N0.length(), strM74110N0);
            }
            c39498k.mo126148z(2, "\r\n");
            if (z4) {
                AbstractC25492l abstractC25492l = c35937b2.f153018z;
                if (abstractC25492l instanceof C27892a) {
                    byte[] bArr = ((C27892a) abstractC25492l).f112471a;
                    c39498k.write(bArr, 0, bArr.length);
                } else if ((abstractC25492l instanceof C25494n) || (abstractC25492l instanceof AbstractC25491k)) {
                    c35940e.f153027w = c39498k;
                    c35940e.f153028x = c35937b2;
                    c35940e.f153030z = 1;
                    Object objM100557e = m100557e(abstractC25492l, c39498k, c35940e);
                    if (objM100557e == enumC31071a) {
                        return enumC31071a;
                    }
                    c39498k2 = c39498k;
                    obj = objM100557e;
                } else if (!(abstractC25492l instanceof C25490j)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return c39498k.m126161b();
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c35937b2 = c35940e.f153028x;
        c39498k2 = c35940e.f153027w;
        AbstractC34132o.m107864I(obj);
        AbstractC25492l abstractC25492l2 = (AbstractC25492l) obj;
        c35937b2.getClass();
        AbstractC22676k.m65750j(abstractC25492l2, "<set-?>");
        c35937b2.f153018z = abstractC25492l2;
        c39498k = c39498k2;
        return c39498k.m126161b();
    }

    /* JADX INFO: renamed from: l */
    public static String m100564l(Field field) {
        Class<?> type = field.getType();
        AbstractC22676k.m65749i(type, "getType(...)");
        return AbstractC38109c.m122090b(type);
    }

    /* JADX INFO: renamed from: n */
    public static InterfaceC32300b m100565n(InterfaceC32307i interfaceC32307i, C35847e fqName) {
        Object next;
        AbstractC22676k.m65750j(fqName, "fqName");
        Iterator it = interfaceC32307i.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (AbstractC22676k.m65745e(((InterfaceC32300b) next).mo43953b(), fqName)) {
                return (InterfaceC32300b) next;
            }
        }
        next = null;
        return (InterfaceC32300b) next;
    }

    /* JADX INFO: renamed from: o */
    public static final String m100566o(long j7) {
        String strM30457k;
        if (j7 <= -999500000) {
            strM30457k = AbstractC11266d.m30457k((j7 - ((long) 500000000)) / ((long) 1000000000), " s ", new StringBuilder());
        } else if (j7 <= -999500) {
            strM30457k = AbstractC11266d.m30457k((j7 - ((long) 500000)) / ((long) DurationKt.NANOS_IN_MILLIS), " ms", new StringBuilder());
        } else if (j7 <= 0) {
            strM30457k = AbstractC11266d.m30457k((j7 - ((long) 500)) / ((long) 1000), " µs", new StringBuilder());
        } else if (j7 < 999500) {
            strM30457k = AbstractC11266d.m30457k((j7 + ((long) 500)) / ((long) 1000), " µs", new StringBuilder());
        } else if (j7 < 999500000) {
            strM30457k = AbstractC11266d.m30457k((j7 + ((long) 500000)) / ((long) DurationKt.NANOS_IN_MILLIS), " ms", new StringBuilder());
        } else {
            strM30457k = AbstractC11266d.m30457k((j7 + ((long) 500000000)) / ((long) 1000000000), " s ", new StringBuilder());
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{strM30457k}, 1));
    }

    /* JADX INFO: renamed from: p */
    public static boolean m100567p(InterfaceC32307i interfaceC32307i, C35847e fqName) {
        AbstractC22676k.m65750j(fqName, "fqName");
        return interfaceC32307i.mo52689T(fqName) != null;
    }

    /* JADX INFO: renamed from: q */
    public static final void m100568q(C35937b c35937b, String str, String value) {
        AbstractC22676k.m65750j(c35937b, "<this>");
        AbstractC22676k.m65750j(value, "value");
        c35937b.f153017y.m386f(value, str);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean[], java.io.Serializable] */
    /* JADX INFO: renamed from: r */
    public static Boolean m100569r(Collection collection, InterfaceC34747a interfaceC34747a, Function1 function1) {
        return (Boolean) m100561i(collection, interfaceC34747a, new C4392d(function1, new boolean[1], 2));
    }

    /* JADX INFO: renamed from: s */
    public static C35942g m100570s(C35937b c35937b) {
        AbstractC22676k.m65750j(c35937b, "<this>");
        return new C35942g(c35937b, false);
    }

    /* JADX INFO: renamed from: t */
    public static String m100571t(Method method) {
        StringBuilder sb4 = new StringBuilder("(");
        Class<?>[] parameterTypes = method.getParameterTypes();
        AbstractC22676k.m65749i(parameterTypes, "getParameterTypes(...)");
        for (Class<?> cls : parameterTypes) {
            AbstractC22676k.m65747g(cls);
            sb4.append(AbstractC38109c.m122090b(cls));
        }
        sb4.append(")");
        Class<?> returnType = method.getReturnType();
        AbstractC22676k.m65749i(returnType, "getReturnType(...)");
        sb4.append(AbstractC38109c.m122090b(returnType));
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }
}
