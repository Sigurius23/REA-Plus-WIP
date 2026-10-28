package aa3;

import aa3.C0627i1;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.RunnableC1319m;
import androidx.lifecycle.C1579e2;
import bh.C3239b;
import c93.InterfaceC4339a;
import com.google.firebase.components.DependencyException;
import com.iterable.iterableapi.C5359o1;
import com.iterable.iterableapi.IterableKeychainEncryptedDataMigrator$MigrationException;
import ec3.C13045h2;
import ec3.InterfaceC13075p1;
import gh.InterfaceC15838g;
import gt.C16163b;
import gt.C16171j;
import gt.C16177p;
import gt.C16178q;
import gt.InterfaceC16164c;
import j93.InterfaceC21461d;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kg2.C22459e;
import l83.C23465k;
import l83.EnumC23458d;
import l83.EnumC23463i;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.C25258m;
import m83.C25271y;
import p002a0.C0006a1;
import p005a3.C0222l0;
import p027b3.C2472z1;
import p098dt.AbstractC12350b;
import p252jh.C21692a;
import p294l3.AbstractC23256h;
import p294l3.C23245b0;
import p294l3.C23250e;
import p294l3.C23252f;
import p294l3.C23254g;
import p294l3.C23285v0;
import p294l3.C23291z;
import p294l3.InterfaceC23243a0;
import p319m4.AbstractC25012a;
import p392p3.InterfaceC28770h;
import p399pb.InterfaceC29049f;
import p448r3.AbstractC30895a;
import p493t3.C33491c;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.internal.AbstractC22676k;
import pt.InterfaceC29508a;
import q83.AbstractC30060g;
import qa3.EnumC30138h1;
import sa3.C32335i;
import st.InterfaceC32956a;
import vf3.InterfaceC35951a;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: aa3.i1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0627i1 implements InterfaceC16164c, InterfaceC23243a0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2194a;

    /* JADX INFO: renamed from: b */
    public Object f2195b;

    /* JADX INFO: renamed from: c */
    public Object f2196c;

    /* JADX INFO: renamed from: d */
    public Object f2197d;

    /* JADX INFO: renamed from: e */
    public Object f2198e;

    /* JADX INFO: renamed from: f */
    public Object f2199f;

    public /* synthetic */ C0627i1() {
        this.f2194a = 0;
    }

    /* JADX INFO: renamed from: m */
    public static C0627i1 m1616m(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        C0627i1 c0627i1 = new C0627i1(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) c0627i1.f2197d)) {
            try {
                ((ArrayDeque) c0627i1.f2197d).clear();
                String string = ((SharedPreferences) c0627i1.f2195b).getString((String) c0627i1.f2198e, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) c0627i1.f2196c)) {
                    String[] strArrSplit = string.split((String) c0627i1.f2196c, -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) c0627i1.f2197d).add(str);
                        }
                    }
                    return c0627i1;
                }
                return c0627i1;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // gt.InterfaceC16164c
    /* JADX INFO: renamed from: a */
    public Object mo1617a(Class cls) {
        if (!((Set) this.f2195b).contains(C16177p.m45715a(cls))) {
            throw new DependencyException("Attempting to request an undeclared dependency " + cls + ".");
        }
        Object objMo1617a = ((InterfaceC16164c) this.f2199f).mo1617a(cls);
        if (!cls.equals(InterfaceC29508a.class)) {
            return objMo1617a;
        }
        return new C16178q();
    }

    @Override // p294l3.InterfaceC23243a0
    /* JADX INFO: renamed from: b */
    public boolean mo1618b() {
        ArrayList arrayList = (ArrayList) this.f2199f;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (((C23291z) arrayList.get(i13)).f92277a.mo1618b()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l83.h] */
    @Override // p294l3.InterfaceC23243a0
    /* JADX INFO: renamed from: c */
    public float mo1619c() {
        return ((Number) this.f2198e.getValue()).floatValue();
    }

    @Override // gt.InterfaceC16164c
    /* JADX INFO: renamed from: d */
    public Set mo1620d(C16177p c16177p) {
        if (((Set) this.f2197d).contains(c16177p)) {
            return ((InterfaceC16164c) this.f2199f).mo1620d(c16177p);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Set<" + c16177p + ">.");
    }

    @Override // gt.InterfaceC16164c
    /* JADX INFO: renamed from: e */
    public InterfaceC32956a mo1621e(Class cls) {
        return mo1622f(C16177p.m45715a(cls));
    }

    @Override // gt.InterfaceC16164c
    /* JADX INFO: renamed from: f */
    public InterfaceC32956a mo1622f(C16177p c16177p) {
        if (((Set) this.f2196c).contains(c16177p)) {
            return ((InterfaceC16164c) this.f2199f).mo1622f(c16177p);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Provider<" + c16177p + ">.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l83.h] */
    @Override // p294l3.InterfaceC23243a0
    /* JADX INFO: renamed from: g */
    public float mo1623g() {
        return ((Number) this.f2197d.getValue()).floatValue();
    }

    @Override // gt.InterfaceC16164c
    /* JADX INFO: renamed from: h */
    public Object mo1624h(C16177p c16177p) {
        if (((Set) this.f2195b).contains(c16177p)) {
            return ((InterfaceC16164c) this.f2199f).mo1624h(c16177p);
        }
        throw new DependencyException("Attempting to request an undeclared dependency " + c16177p + ".");
    }

    @Override // gt.InterfaceC16164c
    /* JADX INFO: renamed from: i */
    public InterfaceC32956a mo1625i(C16177p c16177p) {
        if (((Set) this.f2198e).contains(c16177p)) {
            return ((InterfaceC16164c) this.f2199f).mo1625i(c16177p);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Provider<Set<" + c16177p + ">>.");
    }

    /* JADX INFO: renamed from: j */
    public void m1626j(InterfaceC15838g interfaceC15838g, Class cls) {
        ((ArrayList) this.f2198e).add(new C23465k(interfaceC15838g, cls));
    }

    /* JADX INFO: renamed from: k */
    public void m1627k(C21692a c21692a, Class cls) {
        ((ArrayList) this.f2196c).add(new C23465k(c21692a, cls));
    }

    /* JADX INFO: renamed from: l */
    public void m1628l() {
        synchronized (this.f2199f) {
            String property = System.getProperty("java.vendor");
            if (property == null || !AbstractC39414r.m125876U(property, "Android", false)) {
                AbstractC12350b.m34577Z("IterableKeychainMigrator", "Running in JVM, skipping migration of encrypted shared preferences");
                m1629n();
                C0006a1 c0006a1 = (C0006a1) this.f2198e;
                if (c0006a1 != null) {
                    c0006a1.invoke(null);
                }
                return;
            }
            if (((SharedPreferences) this.f2196c).getBoolean("iterable-encrypted-migration-completed", false)) {
                AbstractC12350b.m34577Z("IterableKeychainMigrator", "Migration was already completed, skipping");
                C0006a1 c0006a2 = (C0006a1) this.f2198e;
                if (c0006a2 != null) {
                    c0006a2.invoke(null);
                }
                return;
            }
            if (((SharedPreferences) this.f2196c).getBoolean("iterable-encrypted-migration-started", false)) {
                AbstractC12350b.m34579a0("IterableKeychainMigrator", "Previous migration attempt was interrupted");
                m1629n();
                IterableKeychainEncryptedDataMigrator$MigrationException iterableKeychainEncryptedDataMigrator$MigrationException = new IterableKeychainEncryptedDataMigrator$MigrationException("Previous migration attempt was interrupted");
                C0006a1 c0006a3 = (C0006a1) this.f2198e;
                if (c0006a3 != null) {
                    c0006a3.invoke(iterableKeychainEncryptedDataMigrator$MigrationException);
                }
                return;
            }
            ((SharedPreferences) this.f2196c).edit().putBoolean("iterable-encrypted-migration-started", true).apply();
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            try {
                Future<?> futureSubmit = executorServiceNewSingleThreadExecutor.submit(new RunnableC1319m(this, 13));
                AbstractC22676k.m65749i(futureSubmit, "submit(...)");
                try {
                    futureSubmit.get(5000L, TimeUnit.MILLISECONDS);
                } catch (TimeoutException unused) {
                    AbstractC12350b.m34579a0("IterableKeychainMigrator", "Migration timed out after 5000ms");
                    futureSubmit.cancel(true);
                    if (!((SharedPreferences) this.f2196c).getBoolean("iterable-encrypted-migration-completed", false)) {
                        m1629n();
                        C0006a1 c0006a4 = (C0006a1) this.f2198e;
                        if (c0006a4 != null) {
                            c0006a4.invoke(new IterableKeychainEncryptedDataMigrator$MigrationException("Migration timed out"));
                        }
                    }
                } catch (Exception e5) {
                    AbstractC12350b.m34581b0("IterableKeychainMigrator", "Migration failed", e5);
                    m1629n();
                    C0006a1 c0006a5 = (C0006a1) this.f2198e;
                    if (c0006a5 != null) {
                        c0006a5.invoke(new IterableKeychainEncryptedDataMigrator$MigrationException(e5, "Migration failed"));
                    }
                }
                executorServiceNewSingleThreadExecutor.shutdown();
            } catch (Throwable th3) {
                executorServiceNewSingleThreadExecutor.shutdown();
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m1629n() {
        ((SharedPreferences) this.f2196c).edit().putBoolean("iterable-encrypted-migration-started", false).putBoolean("iterable-encrypted-migration-completed", true).apply();
    }

    /* JADX INFO: renamed from: o */
    public void m1630o(Object obj, String key) {
        AbstractC22676k.m65750j(key, "key");
        ((LinkedHashMap) this.f2195b).put(key, obj);
        InterfaceC13075p1 interfaceC13075p1 = (InterfaceC13075p1) ((LinkedHashMap) this.f2197d).get(key);
        if (interfaceC13075p1 != null) {
            ((C13045h2) interfaceC13075p1).m36570j(obj);
        }
        InterfaceC13075p1 interfaceC13075p2 = (InterfaceC13075p1) ((LinkedHashMap) this.f2198e).get(key);
        if (interfaceC13075p2 != null) {
            ((C13045h2) interfaceC13075p2).m36570j(obj);
        }
    }

    public String toString() {
        String str;
        switch (this.f2194a) {
            case 0:
                StringBuilder sb4 = new StringBuilder("KmVersionRequirement(kind=");
                EnumC0633k1 enumC0633k1 = (EnumC0633k1) this.f2195b;
                if (enumC0633k1 == null) {
                    AbstractC22676k.m65757q("kind");
                    throw null;
                }
                sb4.append(enumC0633k1);
                sb4.append(", level=");
                EnumC0630j1 enumC0630j1 = (EnumC0630j1) this.f2196c;
                if (enumC0630j1 == null) {
                    AbstractC22676k.m65757q("level");
                    throw null;
                }
                sb4.append(enumC0630j1);
                sb4.append(", version=");
                C0624h1 c0624h1 = (C0624h1) this.f2199f;
                if (c0624h1 == null) {
                    AbstractC22676k.m65757q("version");
                    throw null;
                }
                sb4.append(c0624h1);
                sb4.append(", errorCode=");
                sb4.append((Integer) this.f2197d);
                sb4.append(", message=");
                return AbstractC25012a.m73377j(sb4, (String) this.f2198e, ')');
            case 9:
                String str2 = (String) this.f2198e;
                StringBuilder sb5 = new StringBuilder("since ");
                sb5.append((C32335i) this.f2195b);
                sb5.append(' ');
                sb5.append((EnumC23458d) this.f2199f);
                Integer num = (Integer) this.f2197d;
                String str3 = "";
                if (num != null) {
                    str = " error " + num.intValue();
                } else {
                    str = "";
                }
                sb5.append(str);
                if (str2 != null) {
                    str3 = ": " + str2;
                }
                sb5.append(str3);
                return sb5.toString();
            default:
                return super.toString();
        }
    }

    public C0627i1(InterfaceC21461d clazz, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, C1579e2 c1579e2, InterfaceC29049f interfaceC29049f) {
        this.f2194a = 6;
        AbstractC22676k.m65750j(clazz, "clazz");
        this.f2195b = clazz;
        this.f2196c = interfaceC35951a;
        this.f2197d = interfaceC4339a;
        this.f2198e = interfaceC4339a2;
        this.f2199f = interfaceC29049f;
    }

    public C0627i1(Context context, SharedPreferences sharedPreferences, C5359o1 c5359o1) {
        this.f2194a = 2;
        AbstractC22676k.m65750j(context, "context");
        this.f2195b = context;
        this.f2196c = sharedPreferences;
        this.f2197d = c5359o1;
        this.f2199f = new Object();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0627i1(Boolean bool, Double d3) {
        this(bool, d3, (Double) null, Boolean.FALSE, (Double) null);
        this.f2194a = 5;
    }

    public C0627i1(C32335i c32335i, EnumC30138h1 kind, EnumC23458d enumC23458d, Integer num, String str) {
        this.f2194a = 9;
        AbstractC22676k.m65750j(kind, "kind");
        this.f2195b = c32335i;
        this.f2196c = kind;
        this.f2199f = enumC23458d;
        this.f2197d = num;
        this.f2198e = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0627i1(Boolean bool, Double d3, Double d14) {
        this(bool, d3, d14, Boolean.FALSE, (Double) null);
        this.f2194a = 5;
    }

    public C0627i1(C0222l0 c0222l0) {
        this.f2194a = 3;
        this.f2195b = null;
        this.f2196c = null;
        this.f2197d = null;
        this.f2198e = null;
        this.f2199f = null;
    }

    public C0627i1(Map initialState) {
        this.f2194a = 7;
        AbstractC22676k.m65750j(initialState, "initialState");
        this.f2195b = AbstractC25247g0.m74003l0(initialState);
        this.f2196c = new LinkedHashMap();
        this.f2197d = new LinkedHashMap();
        this.f2198e = new LinkedHashMap();
        this.f2199f = new C2472z1(this, 4);
    }

    public C0627i1(C16163b c16163b, InterfaceC16164c interfaceC16164c) {
        this.f2194a = 4;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        Set<C16171j> set = c16163b.f61430c;
        Set set2 = c16163b.f61434g;
        for (C16171j c16171j : set) {
            int i13 = c16171j.f61453c;
            int i14 = c16171j.f61452b;
            boolean z4 = i13 == 0;
            C16177p c16177p = c16171j.f61451a;
            if (z4) {
                if (i14 == 2) {
                    hashSet4.add(c16177p);
                } else {
                    hashSet.add(c16177p);
                }
            } else if (i13 == 2) {
                hashSet3.add(c16177p);
            } else if (i14 == 2) {
                hashSet5.add(c16177p);
            } else {
                hashSet2.add(c16177p);
            }
        }
        if (!set2.isEmpty()) {
            hashSet.add(C16177p.m45715a(InterfaceC29508a.class));
        }
        this.f2195b = Collections.unmodifiableSet(hashSet);
        this.f2196c = Collections.unmodifiableSet(hashSet2);
        Collections.unmodifiableSet(hashSet3);
        this.f2197d = Collections.unmodifiableSet(hashSet4);
        this.f2198e = Collections.unmodifiableSet(hashSet5);
        this.f2199f = interfaceC16164c;
    }

    public C0627i1(Boolean bool, Double d3, Double d14, Boolean bool2, Double d15) {
        this.f2194a = 5;
        this.f2195b = bool;
        this.f2196c = d3;
        this.f2197d = d14;
        this.f2198e = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
        this.f2199f = d15;
    }

    public C0627i1(C23254g c23254g, C23285v0 c23285v0, List list, InterfaceC39171c interfaceC39171c, InterfaceC28770h interfaceC28770h) {
        int i13;
        String strSubstring;
        C23254g c23254g2 = c23254g;
        C23285v0 c23285v1 = c23285v0;
        this.f2194a = 8;
        this.f2195b = c23254g2;
        this.f2196c = list;
        EnumC23463i enumC23463i = EnumC23463i.f92935y;
        final int i14 = 0;
        this.f2197d = AbstractC30060g.m92087G(enumC23463i, new InterfaceC4339a(this) { // from class: l3.x

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C0627i1 f92268x;

            {
                this.f92268x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                Object obj;
                Object obj2;
                switch (i14) {
                    case 0:
                        ArrayList arrayList = (ArrayList) this.f92268x.f2199f;
                        if (arrayList.isEmpty()) {
                            obj = null;
                        } else {
                            Object obj3 = arrayList.get(0);
                            float fMo1623g = ((C23291z) obj3).f92277a.mo1623g();
                            int iM118951C = AbstractC37056f.m118951C(arrayList);
                            int i15 = 1;
                            if (1 <= iM118951C) {
                                while (true) {
                                    Object obj4 = arrayList.get(i15);
                                    float fMo1623g2 = ((C23291z) obj4).f92277a.mo1623g();
                                    if (Float.compare(fMo1623g, fMo1623g2) < 0) {
                                        obj3 = obj4;
                                        fMo1623g = fMo1623g2;
                                    }
                                    if (i15 != iM118951C) {
                                        i15++;
                                    }
                                }
                            }
                            obj = obj3;
                        }
                        C23291z c23291z = (C23291z) obj;
                        return Float.valueOf(c23291z != null ? c23291z.f92277a.mo1623g() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) this.f92268x.f2199f;
                        if (arrayList2.isEmpty()) {
                            obj2 = null;
                        } else {
                            Object obj5 = arrayList2.get(0);
                            float fM73303c = ((C23291z) obj5).f92277a.f139827i.m73303c();
                            int iM118951C2 = AbstractC37056f.m118951C(arrayList2);
                            int i16 = 1;
                            if (1 <= iM118951C2) {
                                while (true) {
                                    Object obj6 = arrayList2.get(i16);
                                    float fM73303c2 = ((C23291z) obj6).f92277a.f139827i.m73303c();
                                    if (Float.compare(fM73303c, fM73303c2) < 0) {
                                        obj5 = obj6;
                                        fM73303c = fM73303c2;
                                    }
                                    if (i16 != iM118951C2) {
                                        i16++;
                                    }
                                }
                            }
                            obj2 = obj5;
                        }
                        C23291z c23291z2 = (C23291z) obj2;
                        return Float.valueOf(c23291z2 != null ? c23291z2.f92277a.f139827i.m73303c() : 0.0f);
                }
            }
        });
        final int i15 = 1;
        this.f2198e = AbstractC30060g.m92087G(enumC23463i, new InterfaceC4339a(this) { // from class: l3.x

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C0627i1 f92268x;

            {
                this.f92268x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                Object obj;
                Object obj2;
                switch (i15) {
                    case 0:
                        ArrayList arrayList = (ArrayList) this.f92268x.f2199f;
                        if (arrayList.isEmpty()) {
                            obj = null;
                        } else {
                            Object obj3 = arrayList.get(0);
                            float fMo1623g = ((C23291z) obj3).f92277a.mo1623g();
                            int iM118951C = AbstractC37056f.m118951C(arrayList);
                            int i16 = 1;
                            if (1 <= iM118951C) {
                                while (true) {
                                    Object obj4 = arrayList.get(i16);
                                    float fMo1623g2 = ((C23291z) obj4).f92277a.mo1623g();
                                    if (Float.compare(fMo1623g, fMo1623g2) < 0) {
                                        obj3 = obj4;
                                        fMo1623g = fMo1623g2;
                                    }
                                    if (i16 != iM118951C) {
                                        i16++;
                                    }
                                }
                            }
                            obj = obj3;
                        }
                        C23291z c23291z = (C23291z) obj;
                        return Float.valueOf(c23291z != null ? c23291z.f92277a.mo1623g() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) this.f92268x.f2199f;
                        if (arrayList2.isEmpty()) {
                            obj2 = null;
                        } else {
                            Object obj5 = arrayList2.get(0);
                            float fM73303c = ((C23291z) obj5).f92277a.f139827i.m73303c();
                            int iM118951C2 = AbstractC37056f.m118951C(arrayList2);
                            int i17 = 1;
                            if (1 <= iM118951C2) {
                                while (true) {
                                    Object obj6 = arrayList2.get(i17);
                                    float fM73303c2 = ((C23291z) obj6).f92277a.f139827i.m73303c();
                                    if (Float.compare(fM73303c, fM73303c2) < 0) {
                                        obj5 = obj6;
                                        fM73303c = fM73303c2;
                                    }
                                    if (i17 != iM118951C2) {
                                        i17++;
                                    }
                                }
                            }
                            obj2 = obj5;
                        }
                        C23291z c23291z2 = (C23291z) obj2;
                        return Float.valueOf(c23291z2 != null ? c23291z2.f92277a.f139827i.m73303c() : 0.0f);
                }
            }
        });
        C23245b0 c23245b0 = c23285v1.f92256b;
        C23254g c23254g3 = AbstractC23256h.f92140a;
        ArrayList arrayList = c23254g2.f92137z;
        String str = c23254g2.f92135x;
        C25271y c25271y = C25271y.f99162w;
        List listM74152u1 = arrayList != null ? AbstractC25265s.m74152u1(arrayList, new C23252f(i15)) : c25271y;
        ArrayList arrayList2 = new ArrayList();
        C25258m c25258m = new C25258m();
        int size = listM74152u1.size();
        int i16 = 0;
        int i17 = 0;
        while (i16 < size) {
            C23250e c23250e = (C23250e) listM74152u1.get(i16);
            C23250e c23250eM67313a = C23250e.m67313a(c23250e, c23245b0.m67296a((C23245b0) c23250e.f92125a), i14, 14);
            Object obj = c23250eM67313a.f92125a;
            int i18 = c23250eM67313a.f92127c;
            int i19 = c23250eM67313a.f92126b;
            while (i17 < i19 && !c25258m.isEmpty()) {
                C23250e c23250e2 = (C23250e) c25258m.last();
                listM74152u1 = listM74152u1;
                int i24 = c23250e2.f92127c;
                c25271y = c25271y;
                Object obj2 = c23250e2.f92125a;
                if (i19 < i24) {
                    arrayList2.add(new C23250e(obj2, i17, i19));
                    i17 = i19;
                } else {
                    int i25 = size;
                    arrayList2.add(new C23250e(obj2, i17, i24));
                    i17 = c23250e2.f92127c;
                    while (!c25258m.isEmpty() && i17 == ((C23250e) c25258m.last()).f92127c) {
                        c25258m.removeLast();
                    }
                    size = i25;
                }
            }
            List list2 = listM74152u1;
            C25271y c25271y2 = c25271y;
            int i26 = size;
            if (i17 < i19) {
                arrayList2.add(new C23250e(c23245b0, i17, i19));
                i17 = i19;
            }
            C23250e c23250e3 = (C23250e) c25258m.m74019l();
            if (c23250e3 != null) {
                int i27 = c23250e3.f92127c;
                Object obj3 = c23250e3.f92125a;
                int i28 = c23250e3.f92126b;
                if (i28 == i19 && i27 == i18) {
                    c25258m.removeLast();
                    c25258m.addLast(new C23250e(((C23245b0) obj3).m67296a((C23245b0) obj), i19, i18));
                } else if (i28 == i27) {
                    arrayList2.add(new C23250e(obj3, i28, i27));
                    c25258m.removeLast();
                    c25258m.addLast(new C23250e(obj, i19, i18));
                } else if (i27 >= i18) {
                    c25258m.addLast(new C23250e(((C23245b0) obj3).m67296a((C23245b0) obj), i19, i18));
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                c25258m.addLast(new C23250e(obj, i19, i18));
            }
            i16++;
            listM74152u1 = list2;
            c25271y = c25271y2;
            size = i26;
            i14 = 0;
        }
        C25271y c25271y3 = c25271y;
        while (i17 <= str.length() && !c25258m.isEmpty()) {
            C23250e c23250e4 = (C23250e) c25258m.last();
            Object obj4 = c23250e4.f92125a;
            int i29 = c23250e4.f92127c;
            arrayList2.add(new C23250e(obj4, i17, i29));
            while (!c25258m.isEmpty() && i29 == ((C23250e) c25258m.last()).f92127c) {
                c25258m.removeLast();
            }
            i17 = i29;
        }
        if (i17 < str.length()) {
            arrayList2.add(new C23250e(c23245b0, i17, str.length()));
        }
        if (arrayList2.isEmpty()) {
            i13 = 0;
            arrayList2.add(new C23250e(c23245b0, 0, 0));
        } else {
            i13 = 0;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size2 = arrayList2.size();
        int i34 = i13;
        while (i34 < size2) {
            C23250e c23250e5 = (C23250e) arrayList2.get(i34);
            int i35 = c23250e5.f92126b;
            int i36 = c23250e5.f92127c;
            if (i35 != i36) {
                strSubstring = str.substring(i35, i36);
                AbstractC22676k.m65749i(strSubstring, "substring(...)");
            } else {
                strSubstring = "";
            }
            List listM67319a = AbstractC23256h.m67319a(c23254g2, i35, i36, new C22459e(7));
            C23254g c23254g4 = new C23254g(strSubstring, listM67319a == null ? c25271y3 : listM67319a);
            C23245b0 c23245b1 = (C23245b0) c23250e5.f92125a;
            if (c23245b1.f92105b == Integer.MIN_VALUE) {
                c23245b1 = new C23245b0(c23245b1.f92104a, c23245b0.f92105b, c23245b1.f92106c, c23245b1.f92107d, c23245b1.f92108e, c23245b1.f92109f, c23245b1.f92110g, c23245b1.f92111h, c23245b1.f92112i);
            }
            C23285v0 c23285v2 = new C23285v0(c23285v1.f92255a, c23245b0.m67296a(c23245b1));
            List list3 = c23254g4.f92134w;
            List list4 = list3 == null ? c25271y3 : list3;
            List list5 = (List) this.f2196c;
            ArrayList arrayList4 = new ArrayList(list5.size());
            int size3 = list5.size();
            int i37 = 0;
            while (i37 < size3) {
                C23250e c23250e6 = (C23250e) list5.get(i37);
                int i38 = c23250e6.f92126b;
                C23245b0 c23245b2 = c23245b0;
                int i39 = c23250e6.f92127c;
                if (AbstractC23256h.m67320b(i35, i36, i38, i39)) {
                    if (i35 > i38 || i39 > i36) {
                        AbstractC30895a.m95015a("placeholder can not overlap with paragraph.");
                    }
                    arrayList4.add(new C23250e(c23250e6.f92125a, i38 - i35, i39 - i35));
                }
                i37++;
                list5 = list5;
                c23245b0 = c23245b2;
            }
            arrayList3.add(new C23291z(new C33491c(strSubstring, c23285v2, list4, arrayList4, interfaceC28770h, interfaceC39171c), i35, i36));
            i34++;
            c23254g2 = c23254g;
            c23285v1 = c23285v0;
            str = str;
            arrayList2 = arrayList2;
        }
        this.f2199f = arrayList3;
    }

    public C0627i1(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f2194a = 10;
        this.f2197d = new ArrayDeque();
        this.f2195b = sharedPreferences;
        this.f2198e = "topic_operation_queue";
        this.f2196c = ",";
        this.f2199f = scheduledThreadPoolExecutor;
    }

    public C0627i1(C3239b c3239b) {
        this.f2194a = 1;
        this.f2195b = AbstractC25265s.m74097F1(c3239b.f12702a);
        this.f2196c = AbstractC25265s.m74097F1(c3239b.f12703b);
        this.f2197d = AbstractC25265s.m74097F1(c3239b.f12704c);
        this.f2198e = AbstractC25265s.m74097F1(c3239b.f12705d);
        this.f2199f = AbstractC25265s.m74097F1(c3239b.f12706e);
    }
}
