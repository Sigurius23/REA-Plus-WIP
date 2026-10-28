package tg;

import com.whoop.data.remote.domain.dto.DateTimeRange;
import e93.AbstractC12889b;
import i93.C18277c;
import i93.C18283i;
import i93.C18284j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import m83.AbstractC25243e0;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25272z;
import p098dt.AbstractC12350b;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: tg.g */
/* JADX INFO: loaded from: classes.dex */
public final class C33775g implements InterfaceC33773e {

    /* JADX INFO: renamed from: g */
    public static final C33775g f141357g;

    /* JADX INFO: renamed from: h */
    public static final C33775g f141358h;

    /* JADX INFO: renamed from: i */
    public static final C33775g f141359i;

    /* JADX INFO: renamed from: j */
    public static final C33775g f141360j;

    /* JADX INFO: renamed from: k */
    public static final C33775g f141361k;

    /* JADX INFO: renamed from: l */
    public static final C33775g f141362l;

    /* JADX INFO: renamed from: m */
    public static final C33775g f141363m;

    /* JADX INFO: renamed from: n */
    public static final C33775g f141364n;

    /* JADX INFO: renamed from: b */
    public final String f141365b;

    /* JADX INFO: renamed from: c */
    public final Set f141366c;

    /* JADX INFO: renamed from: d */
    public final Map f141367d = C25272z.f99163w;

    /* JADX INFO: renamed from: e */
    public final LinkedHashMap f141368e;

    /* JADX INFO: renamed from: f */
    public final LinkedHashMap f141369f;

    static {
        LinkedHashSet linkedHashSetM34556E = AbstractC12350b.m34556E(AbstractC12350b.m34556E(AbstractC25265s.m74103I1(AbstractC25265s.m74126d1(new C18277c('A', 'Z'), new C18277c('a', 'z'))), AbstractC25265s.m74103I1(new C18277c('0', '9'))), AbstractC25260n.m74059b1(new Character[]{'-', '.', '_', '~'}));
        LinkedHashSet linkedHashSetM34556E2 = AbstractC12350b.m34556E(linkedHashSetM34556E, AbstractC25260n.m74059b1(new Character[]{'!', '$', '&', '\'', '(', ')', '*', '+', Character.valueOf(DateTimeRange.lowerUpperDelimiter), ';', '='}));
        LinkedHashSet linkedHashSetM34556E3 = AbstractC12350b.m34556E(linkedHashSetM34556E2, AbstractC25260n.m74059b1(new Character[]{':', '@'}));
        LinkedHashSet linkedHashSetM34556E4 = AbstractC12350b.m34556E(linkedHashSetM34556E3, AbstractC25260n.m74059b1(new Character[]{'/', '?'}));
        Set setM34605z = AbstractC12350b.m34605z(linkedHashSetM34556E4, AbstractC25260n.m74059b1(new Character[]{'&', '='}));
        f141357g = new C33775g("host", AbstractC12350b.m34555D(':', linkedHashSetM34556E));
        f141358h = new C33775g("user info", linkedHashSetM34556E2);
        f141359i = new C33775g("path", linkedHashSetM34556E3);
        f141360j = new C33775g("query string", setM34605z);
        f141361k = new C33775g("fragment", linkedHashSetM34556E4);
        f141362l = new C33775g("form URL", linkedHashSetM34556E);
        f141363m = new C33775g("Smithy label", linkedHashSetM34556E);
        f141364n = new C33775g("SigV4", linkedHashSetM34556E);
    }

    public C33775g(String str, Set set) {
        this.f141365b = str;
        this.f141366c = set;
        C18284j c18284jM36278i0 = AbstractC12889b.m36278i0(0, 128);
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i0, 10));
        Iterator it = c18284jM36278i0.iterator();
        while (((C18283i) it).f71138y) {
            arrayList.add(Character.valueOf((char) ((AbstractC25243e0) it).nextInt()));
        }
        Set set2 = this.f141366c;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            Character ch4 = (Character) obj;
            ch4.getClass();
            if (!set2.contains(ch4)) {
                arrayList2.add(obj);
            }
        }
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(arrayList2, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W < 16 ? 16 : iM73988W);
        for (Object obj2 : arrayList2) {
            char cCharValue = ((Character) obj2).charValue();
            linkedHashMap.put(obj2, "%" + "0123456789ABCDEF".charAt((cCharValue & 255) >> 4) + "0123456789ABCDEF".charAt(cCharValue & 15));
        }
        Map map = this.f141367d;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC25247g0.m73988W(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap2.put(entry.getKey(), String.valueOf(((Character) entry.getValue()).charValue()));
        }
        this.f141368e = AbstractC25247g0.m73995d0(linkedHashMap, linkedHashMap2);
        Set set3 = this.f141366c;
        int iM73988W2 = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(set3, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iM73988W2 < 16 ? 16 : iM73988W2);
        for (Object obj3 : set3) {
            Character ch5 = (Character) obj3;
            ch5.getClass();
            linkedHashMap3.put(obj3, ch5);
        }
        Set<Map.Entry> setEntrySet = AbstractC25247g0.m73995d0(linkedHashMap3, this.f141367d).entrySet();
        int iM73988W3 = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(setEntrySet, 10));
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(iM73988W3 >= 16 ? iM73988W3 : 16);
        for (Map.Entry entry2 : setEntrySet) {
            Character ch6 = (Character) entry2.getKey();
            ch6.getClass();
            Character ch7 = (Character) entry2.getValue();
            ch7.getClass();
            linkedHashMap4.put(ch7, ch6);
        }
        this.f141369f = linkedHashMap4;
    }

    @Override // tg.InterfaceC33773e
    /* JADX INFO: renamed from: a */
    public final String mo106776a(String decoded) {
        AbstractC22676k.m65750j(decoded, "decoded");
        StringBuilder sb4 = new StringBuilder(decoded.length());
        for (byte b : AbstractC39421y.m125919D(decoded)) {
            char c3 = (char) b;
            if (this.f141366c.contains(Character.valueOf(c3))) {
                sb4.append(c3);
            } else {
                String str = (String) this.f141368e.get(Character.valueOf(c3));
                if (str != null) {
                    sb4.append(str);
                } else {
                    sb4.append('%');
                    sb4.append("0123456789ABCDEF".charAt((b & 255) >> 4));
                    sb4.append("0123456789ABCDEF".charAt(b & 15));
                }
            }
        }
        return sb4.toString();
    }

    @Override // tg.InterfaceC33773e
    /* JADX INFO: renamed from: b */
    public final String mo106777b(String encoded) {
        AbstractC22676k.m65750j(encoded, "encoded");
        StringBuilder sb4 = new StringBuilder(encoded.length());
        byte[] bArr = null;
        int i13 = 0;
        while (i13 < encoded.length()) {
            char cCharAt = encoded.charAt(i13);
            if (cCharAt == '%') {
                if (bArr == null) {
                    bArr = new byte[(encoded.length() - i13) / 3];
                }
                int i14 = 0;
                while (i13 + 2 < encoded.length() && cCharAt == '%') {
                    int i15 = i13 + 3;
                    String strSubstring = encoded.substring(i13 + 1, i15);
                    AbstractC22676k.m65749i(strSubstring, "substring(...)");
                    Integer numM125931P = AbstractC39421y.m125931P(16, strSubstring);
                    if (numM125931P == null) {
                        break;
                    }
                    byte bIntValue = (byte) numM125931P.intValue();
                    int i16 = i14 + 1;
                    bArr[i14] = bIntValue;
                    if (i15 < encoded.length()) {
                        cCharAt = encoded.charAt(i15);
                    }
                    i14 = i16;
                    i13 = i15;
                }
                sb4.append(AbstractC39421y.m125918C(0, i14, 5, bArr));
                if (i13 != encoded.length() && cCharAt == '%') {
                    sb4.append(cCharAt);
                }
            } else {
                Character ch4 = (Character) this.f141369f.get(Character.valueOf(cCharAt));
                if (ch4 != null) {
                    cCharAt = ch4.charValue();
                }
                sb4.append(cCharAt);
            }
            i13++;
        }
        return sb4.toString();
    }

    @Override // tg.InterfaceC33773e
    public final String getName() {
        return this.f141365b;
    }
}
