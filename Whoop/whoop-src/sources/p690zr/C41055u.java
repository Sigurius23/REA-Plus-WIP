package p690zr;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p463rj.AbstractC31479j;

/* JADX INFO: renamed from: zr.u */
/* JADX INFO: loaded from: classes6.dex */
public final class C41055u extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: J */
    public static final Object f177053J = new Object();

    /* JADX INFO: renamed from: E */
    public transient int f177054E;

    /* JADX INFO: renamed from: F */
    public transient int f177055F;

    /* JADX INFO: renamed from: G */
    public transient C41051s f177056G;

    /* JADX INFO: renamed from: H */
    public transient C41051s f177057H;

    /* JADX INFO: renamed from: I */
    public transient C41041n f177058I;

    /* JADX INFO: renamed from: w */
    public transient Object f177059w;

    /* JADX INFO: renamed from: x */
    public transient int[] f177060x;

    /* JADX INFO: renamed from: y */
    public transient Object[] f177061y;

    /* JADX INFO: renamed from: z */
    public transient Object[] f177062z;

    /* JADX INFO: renamed from: a */
    public static C41055u m133296a(int i13) {
        C41055u c41055u = new C41055u();
        if (!(i13 >= 0)) {
            throw new IllegalArgumentException("Expected size must be >= 0");
        }
        c41055u.f177054E = Math.min(Math.max(i13, 1), 1073741823);
        return c41055u;
    }

    /* JADX INFO: renamed from: b */
    public final Map m133297b() {
        Object obj = this.f177059w;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final int m133298c() {
        return (1 << (this.f177054E & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (m133301g()) {
            return;
        }
        this.f177054E += 32;
        Map mapM133297b = m133297b();
        if (mapM133297b != null) {
            this.f177054E = Math.min(Math.max(size(), 3), 1073741823);
            mapM133297b.clear();
            this.f177059w = null;
            this.f177055F = 0;
            return;
        }
        Arrays.fill(m133304j(), 0, this.f177055F, (Object) null);
        Arrays.fill(m133305k(), 0, this.f177055F, (Object) null);
        Object obj = this.f177059w;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(m133303i(), 0, this.f177055F, 0);
        this.f177055F = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapM133297b = m133297b();
        if (mapM133297b != null) {
            return mapM133297b.containsKey(obj);
        }
        return m133299d(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapM133297b = m133297b();
        if (mapM133297b != null) {
            return mapM133297b.containsValue(obj);
        }
        for (int i13 = 0; i13 < this.f177055F; i13++) {
            if (AbstractC31479j.m96940s(obj, m133305k()[i13])) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final int m133299d(Object obj) {
        if (m133301g()) {
            return -1;
        }
        int iM133287q = AbstractC41047q.m133287q(obj);
        int iM133298c = m133298c();
        Object obj2 = this.f177059w;
        Objects.requireNonNull(obj2);
        int iM133288r = AbstractC41047q.m133288r(iM133287q & iM133298c, obj2);
        if (iM133288r == 0) {
            return -1;
        }
        int i13 = ~iM133298c;
        int i14 = iM133287q & i13;
        do {
            int i15 = iM133288r - 1;
            int i16 = m133303i()[i15];
            if ((i16 & i13) == i14 && AbstractC31479j.m96940s(obj, m133304j()[i15])) {
                return i15;
            }
            iM133288r = i16 & iM133298c;
        } while (iM133288r != 0);
        return -1;
    }

    /* JADX INFO: renamed from: e */
    public final void m133300e(int i13, int i14) {
        Object obj = this.f177059w;
        Objects.requireNonNull(obj);
        int[] iArrM133303i = m133303i();
        Object[] objArrM133304j = m133304j();
        Object[] objArrM133305k = m133305k();
        int size = size();
        int i15 = size - 1;
        if (i13 >= i15) {
            objArrM133304j[i13] = null;
            objArrM133305k[i13] = null;
            iArrM133303i[i13] = 0;
            return;
        }
        Object obj2 = objArrM133304j[i15];
        objArrM133304j[i13] = obj2;
        objArrM133305k[i13] = objArrM133305k[i15];
        objArrM133304j[i15] = null;
        objArrM133305k[i15] = null;
        iArrM133303i[i13] = iArrM133303i[i15];
        iArrM133303i[i15] = 0;
        int iM133287q = AbstractC41047q.m133287q(obj2) & i14;
        int iM133288r = AbstractC41047q.m133288r(iM133287q, obj);
        if (iM133288r == size) {
            AbstractC41047q.m133289s(iM133287q, i13 + 1, obj);
            return;
        }
        while (true) {
            int i16 = iM133288r - 1;
            int i17 = iArrM133303i[i16];
            int i18 = i17 & i14;
            if (i18 == size) {
                iArrM133303i[i16] = AbstractC41047q.m133282l(i17, i13 + 1, i14);
                return;
            }
            iM133288r = i18;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C41051s c41051s = this.f177057H;
        if (c41051s != null) {
            return c41051s;
        }
        C41051s c41051s2 = new C41051s(this, 0);
        this.f177057H = c41051s2;
        return c41051s2;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m133301g() {
        return this.f177059w == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapM133297b = m133297b();
        if (mapM133297b != null) {
            return mapM133297b.get(obj);
        }
        int iM133299d = m133299d(obj);
        if (iM133299d == -1) {
            return null;
        }
        return m133305k()[iM133299d];
    }

    /* JADX INFO: renamed from: h */
    public final Object m133302h(Object obj) {
        if (!m133301g()) {
            int iM133298c = m133298c();
            Object obj2 = this.f177059w;
            Objects.requireNonNull(obj2);
            int iM133284n = AbstractC41047q.m133284n(obj, null, iM133298c, obj2, m133303i(), m133304j(), null);
            if (iM133284n != -1) {
                Object obj3 = m133305k()[iM133284n];
                m133300e(iM133284n, iM133298c);
                this.f177055F--;
                this.f177054E += 32;
                return obj3;
            }
        }
        return f177053J;
    }

    /* JADX INFO: renamed from: i */
    public final int[] m133303i() {
        int[] iArr = this.f177060x;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    /* JADX INFO: renamed from: j */
    public final Object[] m133304j() {
        Object[] objArr = this.f177061y;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: renamed from: k */
    public final Object[] m133305k() {
        Object[] objArr = this.f177062z;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C41051s c41051s = this.f177056G;
        if (c41051s != null) {
            return c41051s;
        }
        C41051s c41051s2 = new C41051s(this, 1);
        this.f177056G = c41051s2;
        return c41051s2;
    }

    /* JADX INFO: renamed from: l */
    public final int m133306l(int i13, int i14, int i15, int i16) {
        Object objM133274d = AbstractC41047q.m133274d(i14);
        int i17 = i14 - 1;
        if (i16 != 0) {
            AbstractC41047q.m133289s(i15 & i17, i16 + 1, objM133274d);
        }
        Object obj = this.f177059w;
        Objects.requireNonNull(obj);
        int[] iArrM133303i = m133303i();
        for (int i18 = 0; i18 <= i13; i18++) {
            int iM133288r = AbstractC41047q.m133288r(i18, obj);
            while (iM133288r != 0) {
                int i19 = iM133288r - 1;
                int i24 = iArrM133303i[i19];
                int i25 = ((~i13) & i24) | i18;
                int i26 = i25 & i17;
                int iM133288r2 = AbstractC41047q.m133288r(i26, objM133274d);
                AbstractC41047q.m133289s(i26, iM133288r, objM133274d);
                iArrM133303i[i19] = AbstractC41047q.m133282l(i25, iM133288r2, i17);
                iM133288r = i24 & i13;
            }
        }
        this.f177059w = objM133274d;
        this.f177054E = AbstractC41047q.m133282l(this.f177054E, 32 - Integer.numberOfLeadingZeros(i17), 31);
        return i17;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:46:0x0106 A[LOOP:1: B:43:0x00ef->B:46:0x0106, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ea A[EDGE_INSN: B:67:0x00ea->B:41:0x00ea BREAK  A[LOOP:1: B:43:0x00ef->B:46:0x0106], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0104 -> B:41:0x00ea). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object put(java.lang.Object r23, java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p690zr.C41055u.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapM133297b = m133297b();
        if (mapM133297b != null) {
            return mapM133297b.remove(obj);
        }
        Object objM133302h = m133302h(obj);
        if (objM133302h == f177053J) {
            return null;
        }
        return objM133302h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapM133297b = m133297b();
        return mapM133297b != null ? mapM133297b.size() : this.f177055F;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C41041n c41041n = this.f177058I;
        if (c41041n != null) {
            return c41041n;
        }
        C41041n c41041n2 = new C41041n(1, this);
        this.f177058I = c41041n2;
        return c41041n2;
    }
}
