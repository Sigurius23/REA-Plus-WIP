package ua3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25235a0;
import m83.C25239c0;
import m83.C25241d0;
import m83.C25263q;
import p031b9.AbstractC2875y;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import sa3.InterfaceC32332f;
import ta3.C33684j;
import ta3.C33685k;
import ta3.EnumC33683i;
import wa3.AbstractC36990e;
import wb3.AbstractC37056f;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: ua3.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C34726f implements InterfaceC32332f {

    /* JADX INFO: renamed from: d */
    public static final List f146265d;

    /* JADX INFO: renamed from: a */
    public final String[] f146266a;

    /* JADX INFO: renamed from: b */
    public final Set f146267b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f146268c;

    static {
        String strM74110N0 = AbstractC25265s.m74110N0(AbstractC37056f.m118959K('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);
        List listM118959K = AbstractC37056f.m118959K(AbstractC2875y.m8299l(strM74110N0, "/Any"), AbstractC2875y.m8299l(strM74110N0, "/Nothing"), AbstractC2875y.m8299l(strM74110N0, "/Unit"), AbstractC2875y.m8299l(strM74110N0, "/Throwable"), AbstractC2875y.m8299l(strM74110N0, "/Number"), AbstractC2875y.m8299l(strM74110N0, "/Byte"), AbstractC2875y.m8299l(strM74110N0, "/Double"), AbstractC2875y.m8299l(strM74110N0, "/Float"), AbstractC2875y.m8299l(strM74110N0, "/Int"), AbstractC2875y.m8299l(strM74110N0, "/Long"), AbstractC2875y.m8299l(strM74110N0, "/Short"), AbstractC2875y.m8299l(strM74110N0, "/Boolean"), AbstractC2875y.m8299l(strM74110N0, "/Char"), AbstractC2875y.m8299l(strM74110N0, "/CharSequence"), AbstractC2875y.m8299l(strM74110N0, "/String"), AbstractC2875y.m8299l(strM74110N0, "/Comparable"), AbstractC2875y.m8299l(strM74110N0, "/Enum"), AbstractC2875y.m8299l(strM74110N0, "/Array"), AbstractC2875y.m8299l(strM74110N0, "/ByteArray"), AbstractC2875y.m8299l(strM74110N0, "/DoubleArray"), AbstractC2875y.m8299l(strM74110N0, "/FloatArray"), AbstractC2875y.m8299l(strM74110N0, "/IntArray"), AbstractC2875y.m8299l(strM74110N0, "/LongArray"), AbstractC2875y.m8299l(strM74110N0, "/ShortArray"), AbstractC2875y.m8299l(strM74110N0, "/BooleanArray"), AbstractC2875y.m8299l(strM74110N0, "/CharArray"), AbstractC2875y.m8299l(strM74110N0, "/Cloneable"), AbstractC2875y.m8299l(strM74110N0, "/Annotation"), AbstractC2875y.m8299l(strM74110N0, "/collections/Iterable"), AbstractC2875y.m8299l(strM74110N0, "/collections/MutableIterable"), AbstractC2875y.m8299l(strM74110N0, "/collections/Collection"), AbstractC2875y.m8299l(strM74110N0, "/collections/MutableCollection"), AbstractC2875y.m8299l(strM74110N0, "/collections/List"), AbstractC2875y.m8299l(strM74110N0, "/collections/MutableList"), AbstractC2875y.m8299l(strM74110N0, "/collections/Set"), AbstractC2875y.m8299l(strM74110N0, "/collections/MutableSet"), AbstractC2875y.m8299l(strM74110N0, "/collections/Map"), AbstractC2875y.m8299l(strM74110N0, "/collections/MutableMap"), AbstractC2875y.m8299l(strM74110N0, "/collections/Map.Entry"), AbstractC2875y.m8299l(strM74110N0, "/collections/MutableMap.MutableEntry"), AbstractC2875y.m8299l(strM74110N0, "/collections/Iterator"), AbstractC2875y.m8299l(strM74110N0, "/collections/MutableIterator"), AbstractC2875y.m8299l(strM74110N0, "/collections/ListIterator"), AbstractC2875y.m8299l(strM74110N0, "/collections/MutableListIterator"));
        f146265d = listM118959K;
        C25263q c25263qM74105J1 = AbstractC25265s.m74105J1(listM118959K);
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(c25263qM74105J1, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        Iterator it = c25263qM74105J1.iterator();
        while (true) {
            C25241d0 c25241d0 = (C25241d0) it;
            if (!c25241d0.f99123x.hasNext()) {
                return;
            }
            C25239c0 c25239c0 = (C25239c0) c25241d0.next();
            linkedHashMap.put((String) c25239c0.f99118b, Integer.valueOf(c25239c0.f99117a));
        }
    }

    public C34726f(C33685k c33685k, String[] strings) {
        AbstractC22676k.m65750j(strings, "strings");
        List list = c33685k.f140733y;
        Set setM74103I1 = list.isEmpty() ? C25235a0.f99113w : AbstractC25265s.m74103I1(list);
        List<C33684j> list2 = c33685k.f140732x;
        AbstractC22676k.m65749i(list2, "getRecordList(...)");
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list2.size());
        for (C33684j c33684j : list2) {
            int i13 = c33684j.f140725y;
            for (int i14 = 0; i14 < i13; i14++) {
                arrayList.add(c33684j);
            }
        }
        arrayList.trimToSize();
        this.f146266a = strings;
        this.f146267b = setM74103I1;
        this.f146268c = arrayList;
    }

    @Override // sa3.InterfaceC32332f
    /* JADX INFO: renamed from: a */
    public final boolean mo100630a(int i13) {
        return this.f146267b.contains(Integer.valueOf(i13));
    }

    @Override // sa3.InterfaceC32332f
    /* JADX INFO: renamed from: b */
    public final String mo100631b(int i13) {
        return getString(i13);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    @Override // sa3.InterfaceC32332f
    public final String getString(int i13) {
        String strM125927L;
        C33684j c33684j = (C33684j) this.f146268c.get(i13);
        int i14 = c33684j.f140724x;
        if ((i14 & 4) == 4) {
            Object obj = c33684j.f140715E;
            if (obj instanceof String) {
                strM125927L = (String) obj;
            } else {
                AbstractC36990e abstractC36990e = (AbstractC36990e) obj;
                String strM118753q = abstractC36990e.m118753q();
                if (abstractC36990e.mo118748j()) {
                    c33684j.f140715E = strM118753q;
                }
                strM125927L = strM118753q;
            }
        } else if ((i14 & 2) == 2) {
            List list = f146265d;
            int size = list.size();
            int i15 = c33684j.f140726z;
            if (i15 < 0 || i15 >= size) {
                strM125927L = this.f146266a[i13];
            } else {
                strM125927L = (String) list.get(i15);
            }
        } else {
            strM125927L = this.f146266a[i13];
        }
        if (c33684j.f140717G.size() >= 2) {
            List list2 = c33684j.f140717G;
            AbstractC22676k.m65747g(list2);
            Integer num = (Integer) list2.get(0);
            Integer num2 = (Integer) list2.get(1);
            if (num.intValue() >= 0 && num.intValue() <= num2.intValue() && num2.intValue() <= strM125927L.length()) {
                strM125927L = strM125927L.substring(num.intValue(), num2.intValue());
                AbstractC22676k.m65749i(strM125927L, "substring(...)");
            }
        }
        if (c33684j.f140719I.size() >= 2) {
            List list3 = c33684j.f140719I;
            AbstractC22676k.m65747g(list3);
            Integer num3 = (Integer) list3.get(0);
            Integer num4 = (Integer) list3.get(1);
            AbstractC22676k.m65747g(strM125927L);
            strM125927L = AbstractC39421y.m125927L(strM125927L, (char) num3.intValue(), (char) num4.intValue());
        }
        EnumC33683i enumC33683i = c33684j.f140716F;
        if (enumC33683i == null) {
            enumC33683i = EnumC33683i.NONE;
        }
        int iOrdinal = enumC33683i.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                AbstractC22676k.m65747g(strM125927L);
                strM125927L = AbstractC39421y.m125927L(strM125927L, '$', '.');
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (strM125927L.length() >= 2) {
                    strM125927L = strM125927L.substring(1, strM125927L.length() - 1);
                    AbstractC22676k.m65749i(strM125927L, "substring(...)");
                }
                strM125927L = AbstractC39421y.m125927L(strM125927L, '$', '.');
            }
        }
        AbstractC22676k.m65747g(strM125927L);
        return strM125927L;
    }
}
