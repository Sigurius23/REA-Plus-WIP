package zz0;

import com.mapbox.maps.MapboxMap;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import i93.C18284j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25243e0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.InterfaceC25237b0;
import p715kotlin.Metadata;
import se.AbstractC32410a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: zz0.k */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aK\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a)\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a?\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00022\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017\"\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001a¨\u0006\u001e"}, m65681d2 = {"", "displayRange", "", "monthNames", "", "hasToday", "nextDateTime", "previousDateTime", "", "patternSeed", "Lzz0/m;", "c", "(Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;I)Lzz0/m;", "name", "Lzz0/i;", "b", "(Ljava/lang/String;ZI)Lzz0/i;", "leadingEmpty", "trailingEmpty", MapboxMap.QFE_OFFSET, "todayAt", "Lzz0/c;", "d", "(IIILjava/lang/Integer;)Ljava/util/List;", "Lcom/whoop/design/util/TextResource;", "a", "Ljava/util/List;", "dayHeaders", "Lzz0/b;", "statusPattern", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC41250k {

    /* JADX INFO: renamed from: a */
    private static final List<TextResource> f177970a;

    /* JADX INFO: renamed from: b */
    private static final List<EnumC41241b> f177971b;

    /* JADX INFO: renamed from: zz0.k$a */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u0015\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"zz0/k$a", "Lm83/b0;", "", "g", "()Ljava/util/Iterator;", "element", "d", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC25237b0 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Iterable f177972w;

        public a(Iterable iterable) {
            this.f177972w = iterable;
        }

        @Override // m83.InterfaceC25237b0
        /* JADX INFO: renamed from: d */
        public EnumC41241b mo73982d(C41242c element) {
            return element.getDayStatus();
        }

        @Override // m83.InterfaceC25237b0
        /* JADX INFO: renamed from: g */
        public Iterator<C41242c> mo73983g() {
            return this.f177972w.iterator();
        }
    }

    static {
        List listM118959K = AbstractC37056f.m118959K("S", "M", "T", "W", "T", "F", "S");
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM118959K, 10));
        Iterator it = listM118959K.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC8693b.m21278l((String) it.next()));
        }
        f177970a = arrayList;
        EnumC41241b enumC41241b = EnumC41241b.YES;
        EnumC41241b enumC41241b2 = EnumC41241b.NO;
        EnumC41241b enumC41241b3 = EnumC41241b.INVALID;
        f177971b = AbstractC37056f.m118959K(enumC41241b, enumC41241b2, enumC41241b3, enumC41241b2, enumC41241b, enumC41241b2, enumC41241b3);
    }

    /* JADX INFO: renamed from: b */
    private static final C41248i m134007b(String str, boolean z4, int i13) {
        int i14 = 0;
        List listM118959K = AbstractC37056f.m118959K(m134010e(3, 0, i13, null, 10, null), m134010e(0, 0, i13, null, 11, null), m134010e(0, 0, i13 + 2, null, 11, null), m134010e(0, 0, i13 + 4, null, 11, null), m134010e(0, 6, i13 + 1, z4 ? 0 : null, 1, null));
        ArrayList arrayListM74164j0 = AbstractC25267u.m74164j0(listM118959K);
        if (!arrayListM74164j0.isEmpty()) {
            Iterator it = arrayListM74164j0.iterator();
            while (it.hasNext()) {
                if (((C41242c) it.next()).getDayStatus() == EnumC41241b.YES && (i14 = i14 + 1) < 0) {
                    AbstractC37056f.m118976c0();
                    throw null;
                }
            }
        }
        return new C41248i(AbstractC8693b.m21278l(str), i14, f177970a, listM118959K);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C41252m m134008c(String str, List<String> list, boolean z4, String str2, String str3, int i13) {
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        Iterator<T> it = list2.iterator();
        int i14 = 0;
        while (true) {
            boolean z13 = true;
            if (!it.hasNext()) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    AbstractC25265s.m74141p0(arrayList2, AbstractC25267u.m74164j0(((C41248i) it3.next()).m134002c()));
                }
                Map mapM101002J = AbstractC32410a.m101002J(new a(arrayList2));
                TextResource textResourceM21278l = AbstractC8693b.m21278l("Logging History");
                C41240a c41240a = new C41240a(AbstractC8693b.m21278l(str), str2 != null, str3 != null, str2, str3);
                List<C23465k> listM118959K = AbstractC37056f.m118959K(new C23465k(EnumC41241b.YES, "Yes"), new C23465k(EnumC41241b.NO, "No"), new C23465k(EnumC41241b.INVALID, "Missing"));
                ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(listM118959K, 10));
                for (C23465k c23465k : listM118959K) {
                    EnumC41241b enumC41241b = (EnumC41241b) c23465k.f92937w;
                    TextResource textResourceM21278l2 = AbstractC8693b.m21278l((String) c23465k.f92938x);
                    Integer num = (Integer) mapM101002J.get(enumC41241b);
                    arrayList3.add(new C41247h(enumC41241b, textResourceM21278l2, AbstractC8693b.m21278l("(" + (num != null ? num.intValue() : 0) + ")")));
                }
                return new C41252m(textResourceM21278l, false, c41240a, arrayList, arrayList3, null, 34, null);
            }
            Object next = it.next();
            int i15 = i14 + 1;
            if (i14 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            String str4 = (String) next;
            if (!z4 || i14 != AbstractC37056f.m118951C(list)) {
                z13 = false;
            }
            arrayList.add(m134007b(str4, z13, i13 + i14));
            i14 = i15;
        }
    }

    /* JADX INFO: renamed from: d */
    private static final List<C41242c> m134009d(int i13, int i14, int i15, Integer num) {
        EnumC41241b enumC41241b;
        C18284j c18284j = new C18284j(0, 6, 1);
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284j, 10));
        Iterator it = c18284j.iterator();
        while (it.hasNext()) {
            int iNextInt = ((AbstractC25243e0) it).nextInt();
            if (iNextInt < i13 || iNextInt > 6 - i14) {
                enumC41241b = EnumC41241b.EMPTY;
            } else {
                List<EnumC41241b> list = f177971b;
                enumC41241b = list.get((iNextInt + i15) % list.size());
            }
            arrayList.add(new C41242c(iNextInt, enumC41241b, num != null && iNextInt == num.intValue()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ List m134010e(int i13, int i14, int i15, Integer num, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i13 = 0;
        }
        if ((i16 & 2) != 0) {
            i14 = 0;
        }
        if ((i16 & 4) != 0) {
            i15 = 0;
        }
        if ((i16 & 8) != 0) {
            num = null;
        }
        return m134009d(i13, i14, i15, num);
    }
}
