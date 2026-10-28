package wr2;

import c93.InterfaceC4351m;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p098dt.AbstractC12350b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import q83.AbstractC30060g;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: wr2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\u001aK\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\t\u0010\n\u001aE\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000e\u001a\u00020\u0006*\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a#\u0010\u0014\u001a\u00020\u0010*\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001d\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lwr2/d;", "T", "", "", "searchQuery", "Lkotlin/Function2;", "", "maxEditDistance", "", "n", "(Ljava/lang/Iterable;Ljava/lang/String;Lc93/m;)Ljava/util/List;", "Lwr2/a;", "A", "(Lwr2/d;Ljava/lang/String;Lc93/m;)Lwr2/a;", "l", "(I)I", "", "z", "(Z)Z", "target", "m", "(Ljava/lang/String;Ljava/lang/String;I)Z", "s1", "s2", "k", "(Ljava/lang/String;Ljava/lang/String;)I", "feature_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37575c {

    /* JADX INFO: renamed from: wr2.c$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a extends C22672i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        public static final a f160692w = new a();

        public a() {
            super(2, AbstractC37575c.class, "defaultMaxEditDistance", "defaultMaxEditDistance(Ljava/lang/String;Ljava/lang/String;)I", 1);
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(String p13, String p14) {
            AbstractC22676k.m65750j(p13, "p0");
            AbstractC22676k.m65750j(p14, "p1");
            return Integer.valueOf(AbstractC37575c.m120632k(p13, p14));
        }
    }

    /* JADX INFO: renamed from: wr2.c$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t14, T t15) {
            return AbstractC30060g.m92127q(Integer.valueOf(((String) t15).length()), Integer.valueOf(((String) t14).length()));
        }
    }

    /* JADX INFO: renamed from: A */
    private static final <T extends InterfaceC37576d> C37573a<T> m120621A(T t14, String str, InterfaceC4351m interfaceC4351m) {
        Object next;
        Object next2;
        Object next3;
        String str2;
        Object obj;
        Object next4;
        Object next5;
        Object next6;
        String str3;
        String upperCase = str.toUpperCase(Locale.ROOT);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        List listM125854h = t14.getSearchQueryDelimiter().m125854h(upperCase);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listM125854h) {
            if (!AbstractC39414r.m125890i0((String) obj2)) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(AbstractC25265s.m74152u1(arrayList, new b()));
        List<String> listMo30154b = t14.mo30154b();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listMo30154b, 10));
        Iterator<T> it = listMo30154b.iterator();
        while (it.hasNext()) {
            String upperCase2 = ((String) it.next()).toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
            arrayList2.add(upperCase2);
        }
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        boolean z4 = false;
        boolean z13 = false;
        int i17 = 0;
        for (Object obj3 : arrayList2) {
            int i18 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            String str4 = (String) obj3;
            Iterator it3 = arrayListM74097F1.iterator();
            do {
                if (!it3.hasNext()) {
                    obj = null;
                    next4 = null;
                    break;
                }
                next4 = it3.next();
                obj = null;
            } while (!AbstractC22676k.m65745e((String) next4, str4));
            String str5 = (String) next4;
            if (str5 != null) {
                i14++;
                if (i13 == 0) {
                    z4 = true;
                }
                arrayListM74097F1.remove(str5);
            } else {
                Iterator it4 = arrayListM74097F1.iterator();
                do {
                    if (!it4.hasNext()) {
                        next5 = obj;
                        break;
                    }
                    next5 = it4.next();
                    str3 = (String) next5;
                } while (!m120634m(str3, str4, ((Number) interfaceC4351m.invoke(str3, str4)).intValue()));
                String str6 = (String) next5;
                if (str6 != null) {
                    i15++;
                    if (i13 == 0) {
                        z13 = true;
                    }
                    arrayListM74097F1.remove(str6);
                } else {
                    Iterator it5 = arrayListM74097F1.iterator();
                    do {
                        if (!it5.hasNext()) {
                            next6 = obj;
                            break;
                        }
                        next6 = it5.next();
                    } while (!AbstractC39421y.m125930O(str4, (String) next6, false));
                    String str7 = (String) next6;
                    if (str7 != null) {
                        i16++;
                        if (i13 == 0) {
                            z4 = true;
                        }
                        arrayListM74097F1.remove(str7);
                    } else {
                        i17++;
                    }
                }
            }
            i13 = i18;
        }
        Set setM34605z = AbstractC12350b.m34605z(AbstractC25265s.m74103I1(t14.mo30155c()), AbstractC25265s.m74103I1(t14.mo30154b()));
        ArrayList<String> arrayList3 = new ArrayList(AbstractC25267u.m74163i0(setM34605z, 10));
        Iterator it6 = setM34605z.iterator();
        while (it6.hasNext()) {
            String upperCase3 = ((String) it6.next()).toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase3, "toUpperCase(...)");
            arrayList3.add(upperCase3);
        }
        int i19 = 0;
        int i24 = 0;
        int i25 = 0;
        for (String str8 : arrayList3) {
            Iterator it7 = arrayListM74097F1.iterator();
            do {
                if (!it7.hasNext()) {
                    next = null;
                    break;
                }
                next = it7.next();
            } while (!AbstractC22676k.m65745e((String) next, str8));
            String str9 = (String) next;
            if (str9 != null) {
                i19++;
                arrayListM74097F1.remove(str9);
            } else {
                Iterator it8 = arrayListM74097F1.iterator();
                do {
                    if (!it8.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it8.next();
                    str2 = (String) next2;
                } while (!m120634m(str2, str8, ((Number) interfaceC4351m.invoke(str2, str8)).intValue()));
                String str10 = (String) next2;
                if (str10 != null) {
                    i24++;
                    arrayListM74097F1.remove(str10);
                } else {
                    Iterator it9 = arrayListM74097F1.iterator();
                    do {
                        if (!it9.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it9.next();
                    } while (!AbstractC39421y.m125930O(str8, (String) next3, false));
                    String str11 = (String) next3;
                    if (str11 != null) {
                        i25++;
                        arrayListM74097F1.remove(str11);
                    }
                }
            }
        }
        return new C37573a<>(t14, i14, i19, i15, i24, i16, i25, z4, z13, i17, arrayListM74097F1.size());
    }

    /* JADX INFO: renamed from: k */
    public static final int m120632k(String s13, String s14) {
        AbstractC22676k.m65750j(s13, "s1");
        AbstractC22676k.m65750j(s14, "s2");
        int iMin = Math.min(s13.length(), s14.length());
        if (iMin < 0 || iMin >= 2) {
            return (2 > iMin || iMin >= 6) ? 2 : 1;
        }
        return 0;
    }

    /* JADX INFO: renamed from: l */
    private static final int m120633l(int i13) {
        return i13 * (-1);
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m120634m(String str, String target, int i13) {
        AbstractC22676k.m65750j(str, "<this>");
        AbstractC22676k.m65750j(target, "target");
        if (Math.abs(str.length() - target.length()) > i13) {
            return false;
        }
        int length = target.length() + 1;
        int[] iArr = new int[length];
        for (int i14 = 0; i14 < length; i14++) {
            iArr[i14] = i14;
        }
        int length2 = target.length() + 1;
        int[] iArr2 = new int[length2];
        for (int i15 = 0; i15 < length2; i15++) {
            iArr2[i15] = 0;
        }
        int i16 = 0;
        int i17 = 0;
        while (i16 < str.length()) {
            char cCharAt = str.charAt(i16);
            i17++;
            iArr2[0] = i17;
            int i18 = 0;
            int i19 = 0;
            while (i18 < target.length()) {
                int i24 = i19 + 1;
                iArr2[i24] = Math.min(iArr[i24] + 1, Math.min(iArr2[i19] + 1, cCharAt != target.charAt(i18) ? iArr[i19] + 1 : iArr[i19]));
                i18++;
                i19 = i24;
            }
            for (int i25 : iArr2) {
                if (i25 <= i13) {
                    i16++;
                    int[] iArr3 = iArr2;
                    iArr2 = iArr;
                    iArr = iArr3;
                }
            }
            return false;
        }
        if (iArr.length != 0) {
            return iArr[iArr.length - 1] <= i13;
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* JADX INFO: renamed from: n */
    public static final <T extends InterfaceC37576d> List<T> m120635n(Iterable<? extends T> iterable, String searchQuery, InterfaceC4351m maxEditDistance) {
        AbstractC22676k.m65750j(iterable, "<this>");
        AbstractC22676k.m65750j(searchQuery, "searchQuery");
        AbstractC22676k.m65750j(maxEditDistance, "maxEditDistance");
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(m120621A(it.next(), searchQuery, maxEditDistance));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((C37573a) obj).getMatchesSearchQuery()) {
                arrayList2.add(obj);
            }
        }
        final int i13 = 0;
        final int i14 = 1;
        final int i15 = 2;
        final int i16 = 3;
        final int i17 = 4;
        final int i18 = 5;
        final int i19 = 6;
        final int i24 = 7;
        final int i25 = 8;
        final int i26 = 9;
        List listM74152u1 = AbstractC25265s.m74152u1(arrayList2, AbstractC30060g.m92126p(new Function1() { // from class: wr2.b
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                C37573a c37573a = (C37573a) obj2;
                switch (i13) {
                    case 0:
                        return AbstractC37575c.m120639r(c37573a);
                    case 1:
                        return AbstractC37575c.m120640s(c37573a);
                    case 2:
                        return AbstractC37575c.m120641t(c37573a);
                    case 3:
                        return AbstractC37575c.m120642u(c37573a);
                    case 4:
                        return AbstractC37575c.m120643v(c37573a);
                    case 5:
                        return AbstractC37575c.m120644w(c37573a);
                    case 6:
                        return AbstractC37575c.m120645x(c37573a);
                    case 7:
                        return AbstractC37575c.m120646y(c37573a);
                    case 8:
                        return AbstractC37575c.m120637p(c37573a);
                    default:
                        return AbstractC37575c.m120638q(c37573a);
                }
            }
        }, new Function1() { // from class: wr2.b
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                C37573a c37573a = (C37573a) obj2;
                switch (i14) {
                    case 0:
                        return AbstractC37575c.m120639r(c37573a);
                    case 1:
                        return AbstractC37575c.m120640s(c37573a);
                    case 2:
                        return AbstractC37575c.m120641t(c37573a);
                    case 3:
                        return AbstractC37575c.m120642u(c37573a);
                    case 4:
                        return AbstractC37575c.m120643v(c37573a);
                    case 5:
                        return AbstractC37575c.m120644w(c37573a);
                    case 6:
                        return AbstractC37575c.m120645x(c37573a);
                    case 7:
                        return AbstractC37575c.m120646y(c37573a);
                    case 8:
                        return AbstractC37575c.m120637p(c37573a);
                    default:
                        return AbstractC37575c.m120638q(c37573a);
                }
            }
        }, new Function1() { // from class: wr2.b
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                C37573a c37573a = (C37573a) obj2;
                switch (i15) {
                    case 0:
                        return AbstractC37575c.m120639r(c37573a);
                    case 1:
                        return AbstractC37575c.m120640s(c37573a);
                    case 2:
                        return AbstractC37575c.m120641t(c37573a);
                    case 3:
                        return AbstractC37575c.m120642u(c37573a);
                    case 4:
                        return AbstractC37575c.m120643v(c37573a);
                    case 5:
                        return AbstractC37575c.m120644w(c37573a);
                    case 6:
                        return AbstractC37575c.m120645x(c37573a);
                    case 7:
                        return AbstractC37575c.m120646y(c37573a);
                    case 8:
                        return AbstractC37575c.m120637p(c37573a);
                    default:
                        return AbstractC37575c.m120638q(c37573a);
                }
            }
        }, new Function1() { // from class: wr2.b
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                C37573a c37573a = (C37573a) obj2;
                switch (i16) {
                    case 0:
                        return AbstractC37575c.m120639r(c37573a);
                    case 1:
                        return AbstractC37575c.m120640s(c37573a);
                    case 2:
                        return AbstractC37575c.m120641t(c37573a);
                    case 3:
                        return AbstractC37575c.m120642u(c37573a);
                    case 4:
                        return AbstractC37575c.m120643v(c37573a);
                    case 5:
                        return AbstractC37575c.m120644w(c37573a);
                    case 6:
                        return AbstractC37575c.m120645x(c37573a);
                    case 7:
                        return AbstractC37575c.m120646y(c37573a);
                    case 8:
                        return AbstractC37575c.m120637p(c37573a);
                    default:
                        return AbstractC37575c.m120638q(c37573a);
                }
            }
        }, new Function1() { // from class: wr2.b
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                C37573a c37573a = (C37573a) obj2;
                switch (i17) {
                    case 0:
                        return AbstractC37575c.m120639r(c37573a);
                    case 1:
                        return AbstractC37575c.m120640s(c37573a);
                    case 2:
                        return AbstractC37575c.m120641t(c37573a);
                    case 3:
                        return AbstractC37575c.m120642u(c37573a);
                    case 4:
                        return AbstractC37575c.m120643v(c37573a);
                    case 5:
                        return AbstractC37575c.m120644w(c37573a);
                    case 6:
                        return AbstractC37575c.m120645x(c37573a);
                    case 7:
                        return AbstractC37575c.m120646y(c37573a);
                    case 8:
                        return AbstractC37575c.m120637p(c37573a);
                    default:
                        return AbstractC37575c.m120638q(c37573a);
                }
            }
        }, new Function1() { // from class: wr2.b
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                C37573a c37573a = (C37573a) obj2;
                switch (i18) {
                    case 0:
                        return AbstractC37575c.m120639r(c37573a);
                    case 1:
                        return AbstractC37575c.m120640s(c37573a);
                    case 2:
                        return AbstractC37575c.m120641t(c37573a);
                    case 3:
                        return AbstractC37575c.m120642u(c37573a);
                    case 4:
                        return AbstractC37575c.m120643v(c37573a);
                    case 5:
                        return AbstractC37575c.m120644w(c37573a);
                    case 6:
                        return AbstractC37575c.m120645x(c37573a);
                    case 7:
                        return AbstractC37575c.m120646y(c37573a);
                    case 8:
                        return AbstractC37575c.m120637p(c37573a);
                    default:
                        return AbstractC37575c.m120638q(c37573a);
                }
            }
        }, new Function1() { // from class: wr2.b
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                C37573a c37573a = (C37573a) obj2;
                switch (i19) {
                    case 0:
                        return AbstractC37575c.m120639r(c37573a);
                    case 1:
                        return AbstractC37575c.m120640s(c37573a);
                    case 2:
                        return AbstractC37575c.m120641t(c37573a);
                    case 3:
                        return AbstractC37575c.m120642u(c37573a);
                    case 4:
                        return AbstractC37575c.m120643v(c37573a);
                    case 5:
                        return AbstractC37575c.m120644w(c37573a);
                    case 6:
                        return AbstractC37575c.m120645x(c37573a);
                    case 7:
                        return AbstractC37575c.m120646y(c37573a);
                    case 8:
                        return AbstractC37575c.m120637p(c37573a);
                    default:
                        return AbstractC37575c.m120638q(c37573a);
                }
            }
        }, new Function1() { // from class: wr2.b
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                C37573a c37573a = (C37573a) obj2;
                switch (i24) {
                    case 0:
                        return AbstractC37575c.m120639r(c37573a);
                    case 1:
                        return AbstractC37575c.m120640s(c37573a);
                    case 2:
                        return AbstractC37575c.m120641t(c37573a);
                    case 3:
                        return AbstractC37575c.m120642u(c37573a);
                    case 4:
                        return AbstractC37575c.m120643v(c37573a);
                    case 5:
                        return AbstractC37575c.m120644w(c37573a);
                    case 6:
                        return AbstractC37575c.m120645x(c37573a);
                    case 7:
                        return AbstractC37575c.m120646y(c37573a);
                    case 8:
                        return AbstractC37575c.m120637p(c37573a);
                    default:
                        return AbstractC37575c.m120638q(c37573a);
                }
            }
        }, new Function1() { // from class: wr2.b
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                C37573a c37573a = (C37573a) obj2;
                switch (i25) {
                    case 0:
                        return AbstractC37575c.m120639r(c37573a);
                    case 1:
                        return AbstractC37575c.m120640s(c37573a);
                    case 2:
                        return AbstractC37575c.m120641t(c37573a);
                    case 3:
                        return AbstractC37575c.m120642u(c37573a);
                    case 4:
                        return AbstractC37575c.m120643v(c37573a);
                    case 5:
                        return AbstractC37575c.m120644w(c37573a);
                    case 6:
                        return AbstractC37575c.m120645x(c37573a);
                    case 7:
                        return AbstractC37575c.m120646y(c37573a);
                    case 8:
                        return AbstractC37575c.m120637p(c37573a);
                    default:
                        return AbstractC37575c.m120638q(c37573a);
                }
            }
        }, new Function1() { // from class: wr2.b
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                C37573a c37573a = (C37573a) obj2;
                switch (i26) {
                    case 0:
                        return AbstractC37575c.m120639r(c37573a);
                    case 1:
                        return AbstractC37575c.m120640s(c37573a);
                    case 2:
                        return AbstractC37575c.m120641t(c37573a);
                    case 3:
                        return AbstractC37575c.m120642u(c37573a);
                    case 4:
                        return AbstractC37575c.m120643v(c37573a);
                    case 5:
                        return AbstractC37575c.m120644w(c37573a);
                    case 6:
                        return AbstractC37575c.m120645x(c37573a);
                    case 7:
                        return AbstractC37575c.m120646y(c37573a);
                    case 8:
                        return AbstractC37575c.m120637p(c37573a);
                    default:
                        return AbstractC37575c.m120638q(c37573a);
                }
            }
        }));
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(listM74152u1, 10));
        Iterator it3 = listM74152u1.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((C37573a) it3.next()).m120618i());
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ List m120636o(Iterable iterable, String str, InterfaceC4351m interfaceC4351m, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            interfaceC4351m = a.f160692w;
        }
        return m120635n(iterable, str, interfaceC4351m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final Comparable m120637p(C37573a it) {
        AbstractC22676k.m65750j(it, "it");
        return Integer.valueOf(it.getNumUserFacingKeywordsNotSearchedFor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final Comparable m120638q(C37573a it) {
        AbstractC22676k.m65750j(it, "it");
        return it.m120618i().getUserFacingText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final Comparable m120639r(C37573a it) {
        AbstractC22676k.m65750j(it, "it");
        return Integer.valueOf(m120633l(it.getNumUserFacingKeywordsMatchingSearchTerms()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final Comparable m120640s(C37573a it) {
        AbstractC22676k.m65750j(it, "it");
        return Integer.valueOf(m120633l(it.getNumMetadataKeywordsMatchingSearchTerms()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final Comparable m120641t(C37573a it) {
        AbstractC22676k.m65750j(it, "it");
        return Integer.valueOf(m120633l(it.getNumUserFacingKeywordsCloseToSearchTerms()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final Comparable m120642u(C37573a it) {
        AbstractC22676k.m65750j(it, "it");
        return Integer.valueOf(m120633l(it.getNumMetadataKeywordsCloseToSearchTerms()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final Comparable m120643v(C37573a it) {
        AbstractC22676k.m65750j(it, "it");
        return Integer.valueOf(m120633l(it.getNumUserFacingKeywordsStartingWithSearchTerms()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final Comparable m120644w(C37573a it) {
        AbstractC22676k.m65750j(it, "it");
        return Boolean.valueOf(m120647z(it.getUserFacingTextStartsWithSearchTerm()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final Comparable m120645x(C37573a it) {
        AbstractC22676k.m65750j(it, "it");
        return Boolean.valueOf(m120647z(it.getUserFacingTextRoughlyStartsWithSearchTerm()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final Comparable m120646y(C37573a it) {
        AbstractC22676k.m65750j(it, "it");
        return Integer.valueOf(m120633l(it.getNumMetadataKeywordsStartingWithSearchTerms()));
    }

    /* JADX INFO: renamed from: z */
    private static final boolean m120647z(boolean z4) {
        return !z4;
    }
}
