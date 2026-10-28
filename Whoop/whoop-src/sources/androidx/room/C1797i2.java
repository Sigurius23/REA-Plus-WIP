package androidx.room;

import a11.C0129g;
import a13.C0148f;
import bc3.AbstractC3006f0;
import bc3.C2990b0;
import c93.InterfaceC4339a;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.C25235a0;
import n83.C26466i;
import p007a6.C0410c;
import p007a6.C0458v;
import p014aj.C0928c;
import p098dt.AbstractC12350b;
import p277kb.C22317a;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: androidx.room.i2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1797i2 {

    /* JADX INFO: renamed from: l */
    public static final String[] f7091l = {"INSERT", "UPDATE", "DELETE"};

    /* JADX INFO: renamed from: a */
    public final AbstractC1848z0 f7092a;

    /* JADX INFO: renamed from: b */
    public final HashMap f7093b;

    /* JADX INFO: renamed from: c */
    public final HashMap f7094c;

    /* JADX INFO: renamed from: d */
    public final boolean f7095d;

    /* JADX INFO: renamed from: e */
    public final C1832u f7096e;

    /* JADX INFO: renamed from: f */
    public final LinkedHashMap f7097f;

    /* JADX INFO: renamed from: g */
    public final String[] f7098g;

    /* JADX INFO: renamed from: h */
    public final C1787g0 f7099h;

    /* JADX INFO: renamed from: i */
    public final C0928c f7100i;

    /* JADX INFO: renamed from: j */
    public final AtomicBoolean f7101j;

    /* JADX INFO: renamed from: k */
    public InterfaceC4339a f7102k;

    public C1797i2(AbstractC1848z0 database, HashMap map, HashMap map2, String[] strArr, boolean z4, C1832u c1832u) {
        String lowerCase;
        AbstractC22676k.m65750j(database, "database");
        this.f7092a = database;
        this.f7093b = map;
        this.f7094c = map2;
        this.f7095d = z4;
        this.f7096e = c1832u;
        this.f7101j = new AtomicBoolean(false);
        this.f7102k = new C0148f(7);
        this.f7097f = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i13 = 0; i13 < length; i13++) {
            String str = strArr[i13];
            Locale locale = Locale.ROOT;
            String lowerCase2 = str.toLowerCase(locale);
            AbstractC22676k.m65749i(lowerCase2, "toLowerCase(...)");
            this.f7097f.put(lowerCase2, Integer.valueOf(i13));
            String str2 = (String) this.f7093b.get(strArr[i13]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i13] = lowerCase2;
        }
        this.f7098g = strArr2;
        for (Map.Entry entry : this.f7093b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase3 = str3.toLowerCase(locale2);
            AbstractC22676k.m65749i(lowerCase3, "toLowerCase(...)");
            if (this.f7097f.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                AbstractC22676k.m65749i(lowerCase4, "toLowerCase(...)");
                LinkedHashMap linkedHashMap = this.f7097f;
                linkedHashMap.put(lowerCase4, AbstractC25247g0.m73986U(lowerCase3, linkedHashMap));
            }
        }
        this.f7099h = new C1787g0(this.f7098g.length);
        this.f7100i = new C0928c(this.f7098g.length);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m5419a(C1797i2 c1797i2, InterfaceC1799j0 interfaceC1799j0, AbstractC32269c abstractC32269c) {
        C1846y1 c1846y1;
        if (abstractC32269c instanceof C1846y1) {
            c1846y1 = (C1846y1) abstractC32269c;
            int i13 = c1846y1.f7227z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1846y1.f7227z = i13 - Integer.MIN_VALUE;
            } else {
                c1846y1 = new C1846y1(c1797i2, abstractC32269c);
            }
        } else {
            c1846y1 = new C1846y1(c1797i2, abstractC32269c);
        }
        Object objMo5426c = c1846y1.f7225x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c1846y1.f7227z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo5426c);
            C0129g c0129g = new C0129g(6);
            c1846y1.f7224w = interfaceC1799j0;
            c1846y1.f7227z = 1;
            objMo5426c = interfaceC1799j0.mo5426c("SELECT * FROM room_table_modification_log WHERE invalidated = 1", c0129g, c1846y1);
            if (objMo5426c != enumC31071a) {
            }
            return enumC31071a;
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Set set = (Set) c1846y1.f7224w;
            AbstractC34132o.m107864I(objMo5426c);
            return set;
        }
        interfaceC1799j0 = (InterfaceC1799j0) c1846y1.f7224w;
        AbstractC34132o.m107864I(objMo5426c);
        Set set2 = (Set) objMo5426c;
        if (!set2.isEmpty()) {
            c1846y1.f7224w = set2;
            c1846y1.f7227z = 2;
            if (AbstractC34132o.m107890r(interfaceC1799j0, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", c1846y1) == enumC31071a) {
                return enumC31071a;
            }
        }
        return set2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: b */
    public static final Object m5420b(C1797i2 c1797i2, AbstractC32269c abstractC32269c) throws Throwable {
        C1773c2 c1773c2;
        C22317a c22317a;
        AbstractC1848z0 abstractC1848z0 = c1797i2.f7092a;
        if (abstractC32269c instanceof C1773c2) {
            c1773c2 = (C1773c2) abstractC32269c;
            int i13 = c1773c2.f6994z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1773c2.f6994z = i13 - Integer.MIN_VALUE;
            } else {
                c1773c2 = new C1773c2(c1797i2, abstractC32269c);
            }
        } else {
            c1773c2 = new C1773c2(c1797i2, abstractC32269c);
        }
        Object obj = c1773c2.f6992x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c1773c2.f6994z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C22317a closeBarrier$room_runtime = abstractC1848z0.getCloseBarrier$room_runtime();
            boolean zM64131a = closeBarrier$room_runtime.m64131a();
            C25235a0 c25235a0 = C25235a0.f99113w;
            if (!zM64131a) {
                return c25235a0;
            }
            try {
                if (!c1797i2.f7101j.compareAndSet(true, false)) {
                    closeBarrier$room_runtime.m64132b();
                    return c25235a0;
                }
                if (!((Boolean) c1797i2.f7102k.invoke()).booleanValue()) {
                    closeBarrier$room_runtime.m64132b();
                    return c25235a0;
                }
                C1777d2 c1777d2 = new C1777d2(c1797i2, null, 1);
                c1773c2.f6991w = closeBarrier$room_runtime;
                c1773c2.f6994z = 1;
                Object objUseConnection = abstractC1848z0.useConnection(false, c1777d2, c1773c2);
                if (objUseConnection == enumC31071a) {
                    return enumC31071a;
                }
                c22317a = closeBarrier$room_runtime;
                obj = objUseConnection;
            } catch (Throwable th3) {
                th = th3;
                c22317a = closeBarrier$room_runtime;
                c22317a.m64132b();
                throw th;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c22317a = c1773c2.f6991w;
            try {
                AbstractC34132o.m107864I(obj);
            } catch (Throwable th4) {
                th = th4;
                c22317a.m64132b();
                throw th;
            }
        }
        Set set = (Set) obj;
        if (!set.isEmpty()) {
            c1797i2.f7100i.m2303M(set);
            c1797i2.f7096e.invoke(set);
        }
        c22317a.m64132b();
        return set;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0093  */
    /* JADX WARN: Code duplicated, block: B:24:0x0096  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
    
        if (p505ts.AbstractC34132o.m107890r(r1, r3, r4) == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d9, code lost:
    
        if (p505ts.AbstractC34132o.m107890r(r11, r3, r4) == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00db, code lost:
    
        return r5;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00d9 -> B:28:0x00dc). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m5421c(androidx.room.C1797i2 r17, androidx.room.InterfaceC1843x1 r18, int r19, s83.AbstractC32269c r20) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.C1797i2.m5421c(androidx.room.i2, androidx.room.x1, int, s83.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0052  */
    /* JADX WARN: Code duplicated, block: B:18:0x0084 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0082 -> B:19:0x0085). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: d */
    public static final java.lang.Object m5422d(androidx.room.C1797i2 r8, androidx.room.InterfaceC1843x1 r9, int r10, s83.AbstractC32269c r11) {
        /*
            r8.getClass()
            boolean r0 = r11 instanceof androidx.room.C1785f2
            if (r0 == 0) goto L16
            r0 = r11
            androidx.room.f2 r0 = (androidx.room.C1785f2) r0
            int r1 = r0.f7037H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f7037H = r1
            goto L1b
        L16:
            androidx.room.f2 r0 = new androidx.room.f2
            r0.<init>(r8, r11)
        L1b:
            java.lang.Object r11 = r0.f7035F
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f7037H
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            int r8 = r0.f7034E
            int r9 = r0.f7041z
            java.lang.String[] r10 = r0.f7040y
            java.lang.String r2 = r0.f7039x
            androidx.room.j0 r4 = r0.f7038w
            p505ts.AbstractC34132o.m107864I(r11)
            r11 = r10
            r10 = r4
            goto L85
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            p505ts.AbstractC34132o.m107864I(r11)
            java.lang.String[] r8 = r8.f7098g
            r8 = r8[r10]
            java.lang.String[] r10 = androidx.room.C1797i2.f7091l
            r11 = 0
            r2 = 3
            r7 = r2
            r2 = r8
            r8 = r7
            r7 = r10
            r10 = r9
            r9 = r11
            r11 = r7
        L50:
            if (r9 >= r8) goto L87
            r4 = r11[r9]
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "room_table_modification_trigger_"
            r5.<init>(r6)
            r5.append(r2)
            r6 = 95
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "DROP TRIGGER IF EXISTS `"
            r6 = 96
            java.lang.String r4 = r80.AbstractC31061c.m95633i(r6, r5, r4)
            r0.f7038w = r10
            r0.f7039x = r2
            r0.f7040y = r11
            r0.f7041z = r9
            r0.f7034E = r8
            r0.f7037H = r3
            java.lang.Object r4 = p505ts.AbstractC34132o.m107890r(r10, r4, r0)
            if (r4 != r1) goto L85
            return r1
        L85:
            int r9 = r9 + r3
            goto L50
        L87:
            l83.a0 r8 = l83.C23454a0.f92919a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.C1797i2.m5422d(androidx.room.i2, androidx.room.x1, int, s83.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: e */
    public final void m5423e(InterfaceC4339a onRefreshScheduled, InterfaceC4339a onRefreshCompleted) {
        AbstractC22676k.m65750j(onRefreshScheduled, "onRefreshScheduled");
        AbstractC22676k.m65750j(onRefreshCompleted, "onRefreshCompleted");
        if (this.f7101j.compareAndSet(false, true)) {
            onRefreshScheduled.invoke();
            AbstractC3006f0.m8732z(this.f7092a.getCoroutineScope(), new C2990b0("Room Invalidation Tracker Refresh"), null, new C0410c(this, onRefreshCompleted, null, 6), 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m5424f(AbstractC32269c abstractC32269c) {
        C1789g2 c1789g2;
        C22317a c22317a;
        if (abstractC32269c instanceof C1789g2) {
            c1789g2 = (C1789g2) abstractC32269c;
            int i13 = c1789g2.f7073z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1789g2.f7073z = i13 - Integer.MIN_VALUE;
            } else {
                c1789g2 = new C1789g2(this, abstractC32269c);
            }
        } else {
            c1789g2 = new C1789g2(this, abstractC32269c);
        }
        Object obj = c1789g2.f7071x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c1789g2.f7073z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            AbstractC1848z0 abstractC1848z0 = this.f7092a;
            C22317a closeBarrier$room_runtime = abstractC1848z0.getCloseBarrier$room_runtime();
            if (closeBarrier$room_runtime.m64131a()) {
                try {
                    C0458v c0458v = new C0458v(this, (InterfaceC30057d) null, 2);
                    c1789g2.f7070w = closeBarrier$room_runtime;
                    c1789g2.f7073z = 1;
                    if (abstractC1848z0.useConnection(false, c0458v, c1789g2) == enumC31071a) {
                        return enumC31071a;
                    }
                    c22317a = closeBarrier$room_runtime;
                    c22317a.m64132b();
                } catch (Throwable th3) {
                    th = th3;
                    c22317a = closeBarrier$room_runtime;
                    c22317a.m64132b();
                    throw th;
                }
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c22317a = c1789g2.f7070w;
            try {
                AbstractC34132o.m107864I(obj);
                c22317a.m64132b();
            } catch (Throwable th4) {
                th = th4;
                c22317a.m64132b();
                throw th;
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g */
    public final C23465k m5425g(String[] strArr) {
        C26466i c26466i = new C26466i();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
            Set set = (Set) this.f7094c.get(lowerCase);
            if (set != null) {
                c26466i.addAll(set);
            } else {
                c26466i.add(str);
            }
        }
        String[] strArr2 = (String[]) AbstractC12350b.m34586g(c26466i).toArray(new String[0]);
        int length = strArr2.length;
        int[] iArr = new int[length];
        for (int i13 = 0; i13 < length; i13++) {
            String str2 = strArr2[i13];
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            AbstractC22676k.m65749i(lowerCase2, "toLowerCase(...)");
            Integer num = (Integer) this.f7097f.get(lowerCase2);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name ".concat(str2));
            }
            iArr[i13] = num.intValue();
        }
        return new C23465k(strArr2, iArr);
    }
}
