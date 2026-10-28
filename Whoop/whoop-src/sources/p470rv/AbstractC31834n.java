package p470rv;

import androidx.compose.runtime.Composer;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.C1601k1;
import androidx.profileinstaller.ProfileVerifier;
import bd3.C3130k;
import bg.AbstractC3210e;
import bg.C3217l;
import c93.InterfaceC4339a;
import cg.C4555j;
import cg.C4560o;
import cg.C4569x;
import cg.C4570y;
import com.mapbox.bindgen.Value;
import com.stripe.android.uicore.elements.IdentifierSpec;
import ih0.AbstractC18489d0;
import j93.InterfaceC21467g;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import l40.C23328a;
import l83.C23465k;
import live.hms.video.error.ErrorCodes;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import no.nordicsemi.android.dfu.DfuBaseService;
import o73.C27648a;
import p031b9.AbstractC2875y;
import p091dg.C12002a;
import p116ef.C13140a;
import p326mf.C25483c;
import p335n6.C26385b;
import p335n6.C26396m;
import p335n6.InterfaceC26398o;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p470rv.AbstractC31834n;
import p497t7.C33562c;
import p497t7.InterfaceC33561b;
import p522uf.AbstractC34881i;
import p522uf.C34894u;
import p545v6.C35712a;
import p545v6.C35713b;
import p545v6.C35716e;
import p545v6.C35717f;
import p545v6.C35719h;
import p551vf.C35937b;
import p564vx.C36549a;
import p564vx.C36550b;
import p564vx.InterfaceC36551c;
import p581we.C37199o;
import p602x1.C37816b;
import p661yv.C39796a;
import p661yv.C39797b;
import p664yy.AbstractC39851c;
import p674z8.InterfaceC40170f;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p734sl0.C32587b2;
import tg.C33770b;
import tg.C33775g;
import vv1.C36532c;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: rv.n */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC31834n {

    /* JADX INFO: renamed from: a */
    public static boolean f131894a;

    /* JADX INFO: renamed from: a */
    public static final void m98892a(InterfaceC26398o interfaceC26398o, int i13, int i14, C37816b c37816b, Composer composer, int i15, int i16) {
        int i17;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-474572032);
        int i18 = i16 & 1;
        if (i18 != 0) {
            i17 = i15 | 6;
        } else if ((i15 & 6) == 0) {
            i17 = (c28655q.m87153g(interfaceC26398o) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i19 = i16 & 2;
        if (i19 != 0) {
            i17 |= 48;
        } else if ((i15 & 48) == 0) {
            i17 |= c28655q.m87149e(i13) ? 32 : 16;
        }
        int i24 = i16 & 4;
        if (i24 != 0) {
            i17 |= 384;
        } else if ((i15 & 384) == 0) {
            i17 |= c28655q.m87149e(i14) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i17 |= c28655q.m87157i(c37816b) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i17 & 1171) == 1170 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            if (i18 != 0) {
                interfaceC26398o = C26396m.f104850a;
            }
            if (i19 != 0) {
                i13 = 0;
            }
            if (i24 != 0) {
                i14 = 0;
            }
            c28655q.m87152f0(1849434622);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = C35717f.f151959w;
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) ((InterfaceC21467g) objM87133R);
            c28655q.m87152f0(-683746039);
            c28655q.m87152f0(-548224868);
            if (!(c28655q.f115906a instanceof C26385b)) {
                AbstractC28683x.m87269w();
                throw null;
            }
            c28655q.m87146c0();
            if (c28655q.f115903S) {
                c28655q.m87163l(interfaceC4339a);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, new C32587b2(27), interfaceC26398o);
            AbstractC28683x.m87239G(c28655q, new C32587b2(28), new C35712a(i14));
            AbstractC28683x.m87239G(c28655q, new C32587b2(29), new C35713b(i13));
            c37816b.invoke(C35719h.f151960a, c28655q, Integer.valueOf(((i17 >> 6) & 112) | 6));
            c28655q.m87173q(true);
            c28655q.m87173q(false);
            c28655q.m87173q(false);
        }
        InterfaceC26398o interfaceC26398o2 = interfaceC26398o;
        int i25 = i13;
        int i26 = i14;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35716e(interfaceC26398o2, i25, i26, c37816b, i15, i16, 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final C39797b m98893b(Function1 function1) {
        C39796a c39796a = new C39796a();
        c39796a.f171450a = true;
        c39796a.f171451b = 8388659;
        c39796a.f171452c = 4.0f;
        c39796a.f171453d = 4.0f;
        c39796a.f171454e = 4.0f;
        c39796a.f171455f = 4.0f;
        c39796a.f171456g = -16777216;
        c39796a.f171457h = -16777216;
        c39796a.f171458i = -1;
        c39796a.f171459j = 2.0f;
        c39796a.f171460k = 2.0f;
        c39796a.f171461l = 8.0f;
        c39796a.f171462m = 2.0f;
        c39796a.f171463n = 8.0f;
        c39796a.f171464o = true;
        c39796a.f171465p = 15L;
        c39796a.f171466q = true;
        c39796a.f171467r = 0.5f;
        function1.invoke(c39796a);
        return new C39797b(c39796a.f171450a, c39796a.f171451b, c39796a.f171452c, c39796a.f171453d, c39796a.f171454e, c39796a.f171455f, c39796a.f171456g, c39796a.f171457h, c39796a.f171458i, c39796a.f171459j, c39796a.f171460k, c39796a.f171461l, c39796a.f171462m, c39796a.f171463n, c39796a.f171464o, c39796a.f171465p, c39796a.f171466q, c39796a.f171467r, c39796a.f171468s);
    }

    /* JADX INFO: renamed from: c */
    public static C36532c m98894c(AbstractC1637w1 abstractC1637w1, final C1601k1 savedStateHandle) {
        Object c36550b;
        AbstractC22676k.m65750j(savedStateHandle, "savedStateHandle");
        InterfaceC36551c interfaceC36551c = (InterfaceC36551c) savedStateHandle.m5001b("STRIPE_ANALYTICS_LOCAL_SESSION");
        if (interfaceC36551c == null) {
            if (f131894a) {
                c36550b = C36549a.f156471w;
            } else {
                f131894a = true;
                UUID uuidRandomUUID = UUID.randomUUID();
                UUID uuid = AbstractC39851c.f172106g;
                AbstractC22676k.m65747g(uuidRandomUUID);
                AbstractC39851c.f172106g = uuidRandomUUID;
                String string = uuidRandomUUID.toString();
                AbstractC22676k.m65749i(string, "toString(...)");
                c36550b = new C36550b(string);
            }
            savedStateHandle.m5004e(c36550b, "STRIPE_ANALYTICS_LOCAL_SESSION");
        } else if (interfaceC36551c instanceof C36550b) {
            UUID uuid2 = AbstractC39851c.f172106g;
            UUID uuidFromString = UUID.fromString(((C36550b) interfaceC36551c).f156472w);
            AbstractC22676k.m65749i(uuidFromString, "fromString(...)");
            AbstractC39851c.f172106g = uuidFromString;
            f131894a = true;
        } else if (!(interfaceC36551c instanceof C36549a)) {
            throw new NoWhenBranchMatchedException();
        }
        abstractC1637w1.addCloseable(new AutoCloseable() { // from class: vx.d
            @Override // java.lang.AutoCloseable
            public final void close() {
                InterfaceC36551c interfaceC36551c2 = (InterfaceC36551c) savedStateHandle.m5001b("STRIPE_ANALYTICS_LOCAL_SESSION");
                if (interfaceC36551c2 != null) {
                    if (interfaceC36551c2 instanceof C36550b) {
                        AbstractC31834n.f131894a = false;
                    } else if (!(interfaceC36551c2 instanceof C36549a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
        });
        return new C36532c(savedStateHandle, 2);
    }

    /* JADX INFO: renamed from: d */
    public static ArrayList m98895d(float[] fArr) {
        return AbstractC37056f.m118980f(new Value("rgba"), new Value(fArr[0]), new Value(fArr[1]), new Value(fArr[2]), new Value(fArr[3]));
    }

    /* JADX INFO: renamed from: e */
    public static void m98896e(InterfaceC40170f interfaceC40170f) {
        if (interfaceC40170f != null) {
            try {
                interfaceC40170f.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static final char[] m98897f(int i13) {
        if (i13 >= 0 && i13 < 65536) {
            return new char[]{(char) i13};
        }
        if (65536 > i13 || i13 >= 1114112) {
            throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "invalid codepoint "));
        }
        int i14 = i13 - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        return new char[]{(char) (((i14 >>> 10) & 1023) + 55296), (char) ((i14 & 1023) + 56320)};
    }

    /* JADX INFO: renamed from: g */
    public static float[] m98898g(int i13) {
        return new float[]{(i13 >> 16) & 255, (i13 >> 8) & 255, i13 & 255, ((i13 >> 24) & 255) / 255.0f};
    }

    /* JADX INFO: renamed from: h */
    public static byte[] m98899h(byte[]... bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            for (byte[] bArr2 : bArr) {
                if (bArr2 != null) {
                    byteArrayOutputStream.write(bArr2);
                }
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e5) {
            throw new IllegalStateException(e5.getMessage(), e5);
        }
    }

    /* JADX INFO: renamed from: i */
    public static C33562c m98900i(int i13, String str) {
        int iIntValue;
        Object obj;
        Field[] declaredFields = InterfaceC33561b.class.getDeclaredFields();
        AbstractC22676k.m65749i(declaredFields, "ErrorCode::class\n       …          .declaredFields");
        ArrayList arrayList = new ArrayList();
        for (Field field : declaredFields) {
            if (field.getType().isAssignableFrom(Integer.TYPE)) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            iIntValue = InterfaceC33561b.INTERNAL_ERROR;
            obj = null;
            if (!zHasNext) {
                break;
            }
            try {
                Object obj2 = ((Field) it.next()).get(null);
                AbstractC22676k.m65748h(obj2, "null cannot be cast to non-null type kotlin.Int");
                iIntValue = ((Integer) obj2).intValue();
            } catch (IllegalAccessException unused) {
            }
            arrayList2.add(Integer.valueOf(iIntValue));
        }
        for (Object obj3 : arrayList2) {
            if (((Number) obj3).intValue() == i13) {
                obj = obj3;
                break;
            }
        }
        Integer num = (Integer) obj;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return new C33562c(iIntValue, str);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031  */
    /* JADX INFO: renamed from: j */
    public static Map m98901j(C23328a c23328a) {
        int iIntValue;
        IdentifierSpec.Companion.getClass();
        IdentifierSpec identifierSpec = IdentifierSpec.CardExpMonth;
        String str = c23328a.f92491a;
        int iIntValue2 = -1;
        if (str != null) {
            String strM83599v = C27648a.m83599v(str);
            if (strM83599v.length() == 4) {
                Integer numM125932Q = AbstractC39421y.m125932Q(AbstractC39414r.m125866L0(2, strM83599v));
                if (numM125932Q == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                iIntValue = numM125932Q.intValue();
            } else {
                iIntValue = -1;
            }
        } else {
            iIntValue = -1;
        }
        C23465k c23465k = new C23465k(identifierSpec, C23328a.m67553a(AbstractC39414r.m125895n0(2, String.valueOf(iIntValue)), c23328a));
        IdentifierSpec identifierSpec2 = IdentifierSpec.CardExpYear;
        if (str != null) {
            String strM83599v2 = C27648a.m83599v(str);
            if (strM83599v2.length() == 4) {
                Integer numM125932Q2 = AbstractC39421y.m125932Q(AbstractC39414r.m125867M0(2, strM83599v2));
                if (numM125932Q2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                iIntValue2 = numM125932Q2.intValue() + ErrorCodes.InitAPIErrors.cServerErrors;
            }
        }
        return AbstractC25247g0.m73990Y(c23465k, new C23465k(identifierSpec2, C23328a.m67553a(String.valueOf(iIntValue2), c23328a)));
    }

    /* JADX INFO: renamed from: k */
    public static final void m98902k(C34894u req, C13140a endpoint) {
        AbstractC22676k.m65750j(req, "req");
        AbstractC22676k.m65750j(endpoint, "endpoint");
        C35937b req2 = (C35937b) req.f146959b;
        C12002a ctx = req.f146958a;
        AbstractC22676k.m65750j(req2, "req");
        C25483c c25483c = req2.f153017y;
        C4555j c4555j = req2.f153016x;
        AbstractC22676k.m65750j(ctx, "ctx");
        C4560o c4560o = endpoint.f45448a;
        String str = (String) ctx.mo33082b(AbstractC34881i.f146915c);
        if (str == null) {
            str = "";
        }
        StringBuilder sbM53374o = AbstractC18489d0.m53374o(str);
        AbstractC3210e abstractC3210e = c4560o.f18369b;
        C4569x c4569x = c4560o.f18371d;
        sbM53374o.append(abstractC3210e);
        String string = sbM53374o.toString();
        C3217l c3217l = c4560o.f18368a;
        c4555j.getClass();
        AbstractC22676k.m65750j(c3217l, "<set-?>");
        c4555j.f18354w = c3217l;
        C37199o c37199o = c4555j.f18352F;
        C4570y c4570y = c4560o.f18373f;
        c37199o.getClass();
        c37199o.f159040w = c4570y.f18389a;
        c37199o.f159041x = c4570y.f18390b;
        c4555j.f18355x = AbstractC37056f.m118967V(string);
        c4555j.f18356y = Integer.valueOf(c4560o.f18370c);
        C3130k c3130k = c4555j.f18357z;
        boolean z4 = c3130k.f12276b;
        ArrayList arrayList = (ArrayList) c3130k.f12277c;
        c3130k.f12276b = z4 || (arrayList.isEmpty() && c4569x.f18387b);
        arrayList.addAll(0, c4569x.f18386a);
        c4555j.f18351E.f18343w.mo14231H(c4560o.f18372e);
        C33770b c33770b = c4560o.f18374g;
        String str2 = c33770b != null ? c33770b.f141349b : null;
        c4555j.f18353G = str2 != null ? C33775g.f141361k.m106779d(str2) : null;
        c25483c.m380N(c4555j.m14241d(), "Host");
    }

    /* JADX INFO: renamed from: l */
    public static byte[] m98903l(byte[] bArr, int i13, int i14) {
        byte[] bArr2 = new byte[i14];
        System.arraycopy(bArr, i13, bArr2, 0, i14);
        return bArr2;
    }
}
