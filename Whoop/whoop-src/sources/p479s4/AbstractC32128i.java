package p479s4;

import android.content.Context;
import android.graphics.Rect;
import androidx.glance.session.TimeoutCancellationException;
import aws.smithy.kotlin.runtime.serde.DeserializationException;
import bc3.AbstractC3006f0;
import bc3.C3033m;
import com.google.android.gms.tasks.Task;
import com.stripe.android.uicore.elements.IdentifierSpec;
import d93.InterfaceC11820a;
import d93.InterfaceC11824e;
import ed3.C13117a;
import eu.C13610f;
import g40.EnumC15429u1;
import ge3.AbstractC15751g;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kg.C22447a;
import l40.C23328a;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import m83.AbstractC25267u;
import m83.C25235a0;
import m83.C25271y;
import p031b9.C2817b;
import p309lo.AbstractC24567y;
import p499t9.C33650s;
import p499t9.C33653v;
import p505ts.AbstractC34132o;
import p510u0.C34350r;
import p537ux.C35331f0;
import p598wy.InterfaceC37689b;
import p605x6.C38018w;
import p696zy.C41209a;
import p696zy.C41210b;
import p696zy.C41212d;
import p696zy.InterfaceC41211c;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import sz.ExecutorC33129f;
import uz.C35387a;
import uz.C35388b;
import uz.C35389c;
import uz.C35390d;
import uz.InterfaceC35391e;
import wb3.AbstractC37056f;
import x30.C37902k0;
import xa0.C38136a;
import xb3.AbstractC38176k;
import xb3.C38171f;
import y00.C38793c;
import y00.C38809d5;
import y00.C38901n;
import y00.C38977v3;
import y00.EnumC38941r3;
import yb3.C39412p;

/* JADX INFO: renamed from: s4.i */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC32128i implements InterfaceC37689b {
    /* JADX INFO: renamed from: a */
    public static final long m100047a(float f13, float f14) {
        return (((long) Float.floatToRawIntBits(f14)) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32);
    }

    /* JADX INFO: renamed from: b */
    public static void m100048b(String str, List keys, Map map) {
        AbstractC22676k.m65750j(keys, "keys");
        if (keys.isEmpty()) {
            return;
        }
        String str2 = (String) keys.get(0);
        if (keys.size() == 1) {
            map.put(str2, str);
            return;
        }
        Object obj = map.get(str2);
        Map linkedHashMap = (!(obj instanceof Map) || ((obj instanceof InterfaceC11820a) && !(obj instanceof InterfaceC11824e))) ? null : (Map) obj;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
            map.put(str2, linkedHashMap);
        }
        m100048b(str, keys.subList(1, keys.size()), linkedHashMap);
    }

    /* JADX INFO: renamed from: c */
    public static Object m100049c(Task task, AbstractC32269c abstractC32269c) {
        if (task.isComplete()) {
            return task;
        }
        C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(abstractC32269c));
        c3033m.m8774s();
        task.addOnCompleteListener(ExecutorC33129f.f138191w, new C13610f(c3033m, 7));
        Object objM8773r = c3033m.m8773r();
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return objM8773r;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:29:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x004f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static boolean m100050d(int i13, Rect rect, Rect rect2, Rect rect3) {
        int iM100058l;
        int i14;
        int i15;
        boolean zM100051e = m100051e(i13, rect, rect2);
        if (m100051e(i13, rect, rect3) || !zM100051e) {
            return false;
        }
        if (i13 != 17) {
            if (i13 != 33) {
                if (i13 != 66) {
                    if (i13 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    if (rect.bottom <= rect3.top) {
                        if (i13 != 17 && i13 != 66) {
                            iM100058l = m100058l(i13, rect, rect2);
                            if (i13 != 17) {
                                i14 = rect.left;
                                i15 = rect3.left;
                            } else if (i13 != 33) {
                                i14 = rect.top;
                                i15 = rect3.top;
                            } else if (i13 != 66) {
                                i14 = rect3.right;
                                i15 = rect.right;
                            } else {
                                if (i13 == 130) {
                                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                }
                                i14 = rect3.bottom;
                                i15 = rect.bottom;
                            }
                            if (iM100058l < Math.max(1, i14 - i15)) {
                                return false;
                            }
                        }
                    }
                } else if (rect.right <= rect3.left) {
                    if (i13 != 17) {
                        iM100058l = m100058l(i13, rect, rect2);
                        if (i13 != 17) {
                            i14 = rect.left;
                            i15 = rect3.left;
                        } else if (i13 != 33) {
                            i14 = rect.top;
                            i15 = rect3.top;
                        } else if (i13 != 66) {
                            i14 = rect3.right;
                            i15 = rect.right;
                        } else {
                            if (i13 == 130) {
                                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            }
                            i14 = rect3.bottom;
                            i15 = rect.bottom;
                        }
                        if (iM100058l < Math.max(1, i14 - i15)) {
                            return false;
                        }
                    }
                }
            } else if (rect.top >= rect3.bottom) {
                if (i13 != 17) {
                    iM100058l = m100058l(i13, rect, rect2);
                    if (i13 != 17) {
                        i14 = rect.left;
                        i15 = rect3.left;
                    } else if (i13 != 33) {
                        i14 = rect.top;
                        i15 = rect3.top;
                    } else if (i13 != 66) {
                        i14 = rect3.right;
                        i15 = rect.right;
                    } else {
                        if (i13 == 130) {
                            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        }
                        i14 = rect3.bottom;
                        i15 = rect.bottom;
                    }
                    if (iM100058l < Math.max(1, i14 - i15)) {
                        return false;
                    }
                }
            }
        } else if (rect.left >= rect3.right) {
            if (i13 != 17) {
                iM100058l = m100058l(i13, rect, rect2);
                if (i13 != 17) {
                    i14 = rect.left;
                    i15 = rect3.left;
                } else if (i13 != 33) {
                    i14 = rect.top;
                    i15 = rect3.top;
                } else if (i13 != 66) {
                    i14 = rect3.right;
                    i15 = rect.right;
                } else {
                    if (i13 == 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    i14 = rect3.bottom;
                    i15 = rect.bottom;
                }
                if (iM100058l < Math.max(1, i14 - i15)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m100051e(int i13, Rect rect, Rect rect2) {
        if (i13 != 17) {
            if (i13 != 33) {
                if (i13 != 66) {
                    if (i13 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m100052f(C13117a c13117a, C33653v c33653v, int i13, C33650s c33650s) {
        long jM36716z = c13117a.m36716z();
        long j7 = jM36716z >>> 16;
        if (j7 != i13) {
            return false;
        }
        boolean z4 = (j7 & 1) == 1;
        int i14 = (int) ((jM36716z >> 12) & 15);
        int i15 = (int) ((jM36716z >> 8) & 15);
        int i16 = (int) ((jM36716z >> 4) & 15);
        int i17 = (int) ((jM36716z >> 1) & 7);
        boolean z13 = (jM36716z & 1) == 1;
        if (i16 <= 7) {
            if (i16 != c33653v.f140450h - 1) {
                return false;
            }
        } else if (i16 > 10 || c33653v.f140450h != 2) {
            return false;
        }
        if (!(i17 == 0 || i17 == c33653v.f140452j) || z13) {
            return false;
        }
        try {
            long jM36683E = c13117a.m36683E();
            if (!z4) {
                jM36683E *= (long) c33653v.f140445c;
            }
            c33650s.f140436a = jM36683E;
            int iM100063r = m100063r(i14, c13117a);
            if (iM100063r == -1 || iM100063r > c33653v.f140445c) {
                return false;
            }
            int i18 = c33653v.f140448f;
            if (i15 != 0) {
                if (i15 <= 11) {
                    if (i15 != c33653v.f140449g) {
                        return false;
                    }
                } else if (i15 != 12) {
                    if (i15 > 14) {
                        return false;
                    }
                    int iM36682D = c13117a.m36682D();
                    if (i15 == 14) {
                        iM36682D *= 10;
                    }
                    if (iM36682D != i18) {
                        return false;
                    }
                } else if (c13117a.m36715y() * 1000 != i18) {
                    return false;
                }
            }
            int iM36715y = c13117a.m36715y();
            int i19 = c13117a.f45382b;
            byte[] bArr = c13117a.f45381a;
            int i24 = i19 - 1;
            int i25 = 0;
            for (int i26 = c13117a.f45382b; i26 < i24; i26++) {
                i25 = AbstractC24567y.f95887m[i25 ^ (bArr[i26] & 255)];
            }
            int i27 = AbstractC24567y.f95875a;
            return iM36715y == i25;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m100053g(InterfaceC35391e interfaceC35391e) {
        if ((interfaceC35391e instanceof C35387a) || interfaceC35391e.equals(C35388b.f150796a)) {
            return true;
        }
        if (interfaceC35391e.equals(C35389c.f150797a) || (interfaceC35391e instanceof C35390d)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: h */
    public static final C41210b m100054h(int i13) {
        C25271y c25271y = C25271y.f99162w;
        return new C41210b(i13, c25271y, c25271y);
    }

    /* JADX INFO: renamed from: i */
    public static final C41212d m100055i(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        return new C41212d(str, C25271y.f99162w);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m100056j(int i13, Rect rect, Rect rect2) {
        if (i13 == 17) {
            int i14 = rect.right;
            int i15 = rect2.right;
            return (i14 > i15 || rect.left >= i15) && rect.left > rect2.left;
        }
        if (i13 == 33) {
            int i16 = rect.bottom;
            int i17 = rect2.bottom;
            return (i16 > i17 || rect.top >= i17) && rect.top > rect2.top;
        }
        if (i13 == 66) {
            int i18 = rect.left;
            int i19 = rect2.left;
            return (i18 < i19 || rect.right <= i19) && rect.right < rect2.right;
        }
        if (i13 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i24 = rect.top;
        int i25 = rect2.top;
        return (i24 < i25 || rect.bottom <= i25) && rect.bottom < rect2.bottom;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m100057k(InterfaceC35391e interfaceC35391e) {
        if (interfaceC35391e.equals(C35389c.f150797a) || interfaceC35391e.equals(C35388b.f150796a)) {
            return false;
        }
        if ((interfaceC35391e instanceof C35387a) || (interfaceC35391e instanceof C35390d)) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: l */
    public static int m100058l(int i13, Rect rect, Rect rect2) {
        int i14;
        int i15;
        if (i13 == 17) {
            i14 = rect.left;
            i15 = rect2.right;
        } else if (i13 == 33) {
            i14 = rect.top;
            i15 = rect2.bottom;
        } else if (i13 == 66) {
            i14 = rect2.left;
            i15 = rect.right;
        } else {
            if (i13 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i14 = rect2.top;
            i15 = rect.bottom;
        }
        return Math.max(0, i14 - i15);
    }

    /* JADX INFO: renamed from: n */
    public static String m100059n(String str, String[] strArr) {
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("/");
        for (String str2 : strArr) {
            String[] strArrSplit2 = str2.split("/");
            if (strArrSplit2.length != 2) {
                throw new IllegalArgumentException("Ill-formatted MIME type filter. Must be type/subtype.");
            }
            if (strArrSplit2[0].isEmpty() || strArrSplit2[1].isEmpty()) {
                throw new IllegalArgumentException("Ill-formatted MIME type filter. Type or subtype empty.");
            }
            if (strArrSplit.length == 2 && (("*".equals(strArrSplit2[0]) || strArrSplit2[0].equals(strArrSplit[0])) && ("*".equals(strArrSplit2[1]) || strArrSplit2[1].equals(strArrSplit[1])))) {
                return str2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public static int m100060o(int i13, Rect rect, Rect rect2) {
        if (i13 != 17) {
            if (i13 != 33) {
                if (i13 != 66) {
                    if (i13 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    /* JADX INFO: renamed from: p */
    public static final InterfaceC41211c m100061p(InterfaceC41211c interfaceC41211c) {
        return interfaceC41211c == null ? m100055i("") : interfaceC41211c;
    }

    /* JADX INFO: renamed from: q */
    public static final C41209a m100062q(InterfaceC41211c interfaceC41211c, InterfaceC41211c other) {
        AbstractC22676k.m65750j(interfaceC41211c, "<this>");
        AbstractC22676k.m65750j(other, "other");
        return new C41209a(interfaceC41211c, other);
    }

    /* JADX INFO: renamed from: r */
    public static int m100063r(int i13, C13117a c13117a) {
        switch (i13) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i13 - 2);
            case 6:
                return c13117a.m36715y() + 1;
            case 7:
                return c13117a.m36682D() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i13 - 8);
            default:
                return -1;
        }
    }

    /* JADX INFO: renamed from: s */
    public static final C41210b m100064s(int i13, Object[] formatArgs, List list) {
        AbstractC22676k.m65750j(formatArgs, "formatArgs");
        return new C41210b(i13, list, AbstractC25260n.m74049W0(formatArgs));
    }

    /* JADX INFO: renamed from: t */
    public static final Object[] m100065t(Context context, List list) {
        AbstractC22676k.m65750j(context, "context");
        List list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        for (Object objMo133889M : list2) {
            if (objMo133889M instanceof InterfaceC41211c) {
                objMo133889M = ((InterfaceC41211c) objMo133889M).mo133889M(context);
            }
            arrayList.add(objMo133889M);
        }
        return arrayList.toArray(new Object[0]);
    }

    /* JADX INFO: renamed from: u */
    public static C38809d5 m100066u(Map map, String code, boolean z4, EnumC38941r3 enumC38941r3, C38901n clientAttributionMetadata) {
        String str;
        AbstractC22676k.m65750j(code, "code");
        AbstractC22676k.m65750j(clientAttributionMetadata, "clientAttributionMetadata");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (((IdentifierSpec) entry.getKey()).getDestination() == EnumC15429u1.f57996w) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            IdentifierSpec.Companion.getClass();
            if (!AbstractC22676k.m65745e(key, IdentifierSpec.SaveForFutureUse) && !AbstractC22676k.m65745e(entry2.getKey(), IdentifierSpec.CardBrand)) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
            if (!((IdentifierSpec) entry3.getKey()).getIgnoreField()) {
                linkedHashMap4.put(entry3.getKey(), entry3.getValue());
            }
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap(AbstractC25247g0.m73988W(linkedHashMap4.size()));
        for (Map.Entry entry4 : linkedHashMap4.entrySet()) {
            linkedHashMap5.put(entry4.getKey(), ((C23328a) entry4.getValue()).f92491a);
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap(AbstractC25247g0.m73988W(linkedHashMap5.size()));
        for (Map.Entry entry5 : linkedHashMap5.entrySet()) {
            linkedHashMap6.put(((IdentifierSpec) entry5.getKey()).getV1(), entry5.getValue());
        }
        m100048b(code, AbstractC37056f.m118958J("type"), linkedHashMap3);
        for (Map.Entry entry6 : linkedHashMap6.entrySet()) {
            String string = (String) entry6.getKey();
            AbstractC22676k.m65750j(string, "string");
            m100048b((String) entry6.getValue(), AbstractC38176k.m122276E(new C38171f(AbstractC38176k.m122286v(AbstractC38176k.m122272A(C39412p.m125847b(string, new C39412p("[*([A-Za-z_0-9]+)]*")), new C34350r(22)), new C38136a(5)), false, new C34350r(23))), linkedHashMap3);
        }
        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
        for (Map.Entry entry7 : linkedHashMap3.entrySet()) {
            if (entry7.getValue() != null) {
                linkedHashMap7.put(entry7.getKey(), entry7.getValue());
            }
        }
        Map mapM74001j0 = AbstractC25247g0.m74001j0(linkedHashMap7);
        IdentifierSpec.Companion.getClass();
        C23328a c23328a = (C23328a) linkedHashMap2.get(IdentifierSpec.Name);
        String str2 = c23328a != null ? c23328a.f92491a : null;
        C23328a c23328a2 = (C23328a) linkedHashMap2.get(IdentifierSpec.Email);
        String str3 = c23328a2 != null ? c23328a2.f92491a : null;
        C23328a c23328a3 = (C23328a) linkedHashMap2.get(IdentifierSpec.Phone);
        String str4 = c23328a3 != null ? c23328a3.f92491a : null;
        C23328a c23328a4 = (C23328a) linkedHashMap2.get(IdentifierSpec.Line1);
        String str5 = c23328a4 != null ? c23328a4.f92491a : null;
        C23328a c23328a5 = (C23328a) linkedHashMap2.get(IdentifierSpec.Line2);
        String str6 = c23328a5 != null ? c23328a5.f92491a : null;
        C23328a c23328a6 = (C23328a) linkedHashMap2.get(IdentifierSpec.City);
        String str7 = c23328a6 != null ? c23328a6.f92491a : null;
        C23328a c23328a7 = (C23328a) linkedHashMap2.get(IdentifierSpec.State);
        String str8 = c23328a7 != null ? c23328a7.f92491a : null;
        C23328a c23328a8 = (C23328a) linkedHashMap2.get(IdentifierSpec.Country);
        String str9 = c23328a8 != null ? c23328a8.f92491a : null;
        if (str9 != null) {
            String upperCase = str9.toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            str = upperCase;
        } else {
            str = null;
        }
        C23328a c23328a9 = (C23328a) linkedHashMap2.get(IdentifierSpec.PostalCode);
        String str10 = c23328a9 != null ? c23328a9.f92491a : null;
        return new C38809d5(code, z4, (str7 == null && str == null && str5 == null && str6 == null && str10 == null && str8 == null && str3 == null && str2 == null && str4 == null) ? null : new C38977v3(new C38793c(str7, str, str5, str6, str10, str8), str3, str2, str4), enumC38941r3, C25235a0.f99113w, clientAttributionMetadata, mapM74001j0, 425980);
    }

    /* JADX INFO: renamed from: v */
    public static final C2817b m100067v(C2817b c2817b, String str) {
        String strConcat = str.concat("Response");
        String strConcat2 = str.concat("Result");
        if (!AbstractC22676k.m65745e(c2817b.m8014q(), strConcat)) {
            StringBuilder sbM53375p = AbstractC18489d0.m53375p("invalid root, expected ", strConcat, "; found `");
            sbM53375p.append((C22447a) c2817b.f11024y);
            sbM53375p.append('`');
            throw new DeserializationException(sbM53375p.toString());
        }
        C2817b c2817bM8017t = c2817b.m8017t();
        if (c2817bM8017t != null && AbstractC22676k.m65745e(c2817bM8017t.m8014q(), strConcat2)) {
            return c2817bM8017t;
        }
        StringBuilder sbM53375p2 = AbstractC18489d0.m53375p("invalid result, expected ", strConcat2, "; found `");
        sbM53375p2.append(c2817bM8017t != null ? (C22447a) c2817bM8017t.f11024y : null);
        sbM53375p2.append('`');
        throw new DeserializationException(sbM53375p2.toString());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: w */
    public static final Object m100068w(C35331f0 c35331f0, C37902k0 c37902k0, AbstractC32269c abstractC32269c) {
        C38018w c38018w;
        if (abstractC32269c instanceof C38018w) {
            c38018w = (C38018w) abstractC32269c;
            int i13 = c38018w.f162850y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c38018w.f162850y = i13 - Integer.MIN_VALUE;
            } else {
                c38018w = new C38018w(abstractC32269c);
            }
        } else {
            c38018w = new C38018w(abstractC32269c);
        }
        Object obj = c38018w.f162849x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c38018w.f162850y;
        InterfaceC30057d interfaceC30057d = null;
        try {
            if (i14 != 0) {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C37902k0 c37902k1 = c38018w.f162848w;
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            c38018w.f162848w = c37902k0;
            c38018w.f162850y = 1;
            Object objM8719m = AbstractC3006f0.m8719m(new C37902k0(c37902k0, c35331f0, interfaceC30057d, 2), c38018w);
            return objM8719m == enumC31071a ? enumC31071a : objM8719m;
        } catch (TimeoutCancellationException e5) {
            if (e5.f6005x == c37902k0.hashCode()) {
                return null;
            }
            throw e5;
        }
    }
}
