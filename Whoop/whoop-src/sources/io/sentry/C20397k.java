package io.sentry;

import e93.AbstractC12889b;
import io.sentry.featureflags.C20333a;
import io.sentry.featureflags.C20335c;
import io.sentry.featureflags.InterfaceC20334b;
import io.sentry.protocol.C20470c;
import io.sentry.protocol.C20481h0;
import io.sentry.protocol.C20482i;
import io.sentry.protocol.C20496q;
import io.sentry.protocol.C20501v;
import io.sentry.util.C20579a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.AbstractC30802r;
import p005a3.C0237p;
import p581we.C37199o;

/* JADX INFO: renamed from: io.sentry.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C20397k implements InterfaceC20259b1 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC20259b1 f76453a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC20259b1 f76454b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC20259b1 f76455c;

    public C20397k(InterfaceC20259b1 interfaceC20259b1, InterfaceC20259b1 interfaceC20259b2, InterfaceC20259b1 interfaceC20259b3) {
        this.f76453a = interfaceC20259b1;
        this.f76454b = interfaceC20259b2;
        this.f76455c = interfaceC20259b3;
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: A */
    public final String mo56179A() {
        String strMo56179A = this.f76455c.mo56179A();
        if (strMo56179A != null) {
            return strMo56179A;
        }
        String strMo56179A2 = this.f76454b.mo56179A();
        return strMo56179A2 != null ? strMo56179A2 : this.f76453a.mo56179A();
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: B */
    public final void mo56180B(InterfaceC20432n1 interfaceC20432n1) {
        m56609g(null).mo56180B(interfaceC20432n1);
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: C */
    public final List mo56181C() {
        List listMo56181C = this.f76455c.mo56181C();
        if (!listMo56181C.isEmpty()) {
            return listMo56181C;
        }
        List listMo56181C2 = this.f76454b.mo56181C();
        return !listMo56181C2.isEmpty() ? listMo56181C2 : this.f76453a.mo56181C();
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: D */
    public final String mo56182D() {
        String strMo56182D = this.f76455c.mo56182D();
        if (strMo56182D != null) {
            return strMo56182D;
        }
        String strMo56182D2 = this.f76454b.mo56182D();
        return strMo56182D2 != null ? strMo56182D2 : this.f76453a.mo56182D();
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: E */
    public final void mo56183E() {
        m56609g(null).mo56183E();
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: F */
    public final InterfaceC20334b mo56184F() {
        C20513q6 c20513q6Mo56202l = this.f76453a.mo56202l();
        InterfaceC20334b interfaceC20334bMo56184F = this.f76453a.mo56184F();
        InterfaceC20334b interfaceC20334bMo56184F2 = this.f76454b.mo56184F();
        InterfaceC20334b interfaceC20334bMo56184F3 = this.f76455c.mo56184F();
        C20335c c20335c = C20335c.f76341w;
        int maxFeatureFlags = c20513q6Mo56202l.getMaxFeatureFlags();
        if (maxFeatureFlags > 0) {
            C20333a c20333a = interfaceC20334bMo56184F instanceof C20333a ? (C20333a) interfaceC20334bMo56184F : null;
            C20333a c20333a2 = interfaceC20334bMo56184F2 instanceof C20333a ? (C20333a) interfaceC20334bMo56184F2 : null;
            C20333a c20333a3 = interfaceC20334bMo56184F3 instanceof C20333a ? (C20333a) interfaceC20334bMo56184F3 : null;
            CopyOnWriteArrayList copyOnWriteArrayList = c20333a == null ? null : c20333a.f76340w;
            CopyOnWriteArrayList copyOnWriteArrayList2 = c20333a2 == null ? null : c20333a2.f76340w;
            CopyOnWriteArrayList copyOnWriteArrayList3 = c20333a3 != null ? c20333a3.f76340w : null;
            int size = copyOnWriteArrayList == null ? 0 : copyOnWriteArrayList.size();
            int size2 = copyOnWriteArrayList2 == null ? 0 : copyOnWriteArrayList2.size();
            int size3 = copyOnWriteArrayList3 != null ? copyOnWriteArrayList3.size() : 0;
            if (size != 0 || size2 != 0 || size3 != 0) {
                int i13 = size - 1;
                int i14 = size2 - 1;
                int i15 = size3 - 1;
                if (copyOnWriteArrayList != null && i13 >= 0) {
                    AbstractC30802r.m94771t(copyOnWriteArrayList.get(i13));
                }
                if (copyOnWriteArrayList2 != null && i14 >= 0) {
                    AbstractC30802r.m94771t(copyOnWriteArrayList2.get(i14));
                }
                if (copyOnWriteArrayList3 != null && i15 >= 0) {
                    AbstractC30802r.m94771t(copyOnWriteArrayList3.get(i15));
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(maxFeatureFlags);
                linkedHashMap.size();
                ArrayList arrayList = new ArrayList(linkedHashMap.values());
                Collections.reverse(arrayList);
                CopyOnWriteArrayList copyOnWriteArrayList4 = new CopyOnWriteArrayList(arrayList);
                C20333a c20333a4 = new C20333a();
                new C20579a();
                c20333a4.f76340w = copyOnWriteArrayList4;
                return c20333a4;
            }
        }
        return c20335c;
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: G */
    public final C0237p mo56185G() {
        return m56609g(null).mo56185G();
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: H */
    public final void mo56186H(String str) {
        m56609g(null).mo56186H(str);
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: I */
    public final InterfaceC20338g1 mo56187I() {
        InterfaceC20338g1 interfaceC20338g1Mo56187I = this.f76455c.mo56187I();
        if (!(interfaceC20338g1Mo56187I instanceof C20044a3)) {
            return interfaceC20338g1Mo56187I;
        }
        InterfaceC20338g1 interfaceC20338g1Mo56187I2 = this.f76454b.mo56187I();
        return !(interfaceC20338g1Mo56187I2 instanceof C20044a3) ? interfaceC20338g1Mo56187I2 : this.f76453a.mo56187I();
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: J */
    public final void mo56188J(Object obj, String str) {
        m56609g(null).mo56188J(obj, str);
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: K */
    public final List mo56189K() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.addAll(this.f76453a.mo56189K());
        copyOnWriteArrayList.addAll(this.f76454b.mo56189K());
        copyOnWriteArrayList.addAll(this.f76455c.mo56189K());
        return copyOnWriteArrayList;
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: L */
    public final void mo56190L(C20321e5 c20321e5) {
        this.f76453a.mo56190L(c20321e5);
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: M */
    public final C0237p mo56191M(InterfaceC20642z3 interfaceC20642z3) {
        return m56609g(null).mo56191M(interfaceC20642z3);
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: N */
    public final void mo56192N(InterfaceC20262b4 interfaceC20262b4) {
        m56609g(null).mo56192N(interfaceC20262b4);
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: O */
    public final void mo56193O(C20501v c20501v) {
        this.f76453a.mo56193O(c20501v);
        this.f76454b.mo56193O(c20501v);
        this.f76455c.mo56193O(c20501v);
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: P */
    public final List mo56194P() {
        return AbstractC12889b.m36280j0((CopyOnWriteArrayList) mo56214y());
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: a */
    public final Map mo56195a() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.putAll(this.f76453a.mo56195a());
        concurrentHashMap.putAll(this.f76454b.mo56195a());
        concurrentHashMap.putAll(this.f76455c.mo56195a());
        return concurrentHashMap;
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: b */
    public final void mo56196b(String str) {
        m56609g(null).mo56196b(str);
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: c */
    public final void mo56197c(String str, String str2) {
        m56609g(null).mo56197c(str, str2);
    }

    @Override // io.sentry.InterfaceC20259b1
    public final void clear() {
        m56609g(null).clear();
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: d */
    public final C20496q mo56198d() {
        C20496q c20496qMo56198d = this.f76455c.mo56198d();
        if (c20496qMo56198d != null) {
            return c20496qMo56198d;
        }
        C20496q c20496qMo56198d2 = this.f76454b.mo56198d();
        return c20496qMo56198d2 != null ? c20496qMo56198d2 : this.f76453a.mo56198d();
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: e */
    public final void mo56199e(C20481h0 c20481h0) {
        m56609g(null).mo56199e(c20481h0);
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: f */
    public final InterfaceC20408l1 mo56200f() {
        InterfaceC20408l1 interfaceC20408l1Mo56200f = this.f76455c.mo56200f();
        if (interfaceC20408l1Mo56200f != null) {
            return interfaceC20408l1Mo56200f;
        }
        InterfaceC20408l1 interfaceC20408l1Mo56200f2 = this.f76454b.mo56200f();
        return interfaceC20408l1Mo56200f2 != null ? interfaceC20408l1Mo56200f2 : this.f76453a.mo56200f();
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC20259b1 m56609g(EnumC20341g4 enumC20341g4) {
        InterfaceC20259b1 interfaceC20259b1 = this.f76454b;
        InterfaceC20259b1 interfaceC20259b2 = this.f76455c;
        InterfaceC20259b1 interfaceC20259b3 = this.f76453a;
        if (enumC20341g4 != null) {
            int i13 = AbstractC20388j.f76441a[enumC20341g4.ordinal()];
            if (i13 == 1) {
                return interfaceC20259b2;
            }
            if (i13 == 2) {
                return interfaceC20259b1;
            }
            if (i13 == 3) {
                return interfaceC20259b3;
            }
            if (i13 == 4) {
                return this;
            }
        }
        int i14 = AbstractC20388j.f76441a[interfaceC20259b3.mo56202l().getDefaultScopeType().ordinal()];
        if (i14 == 1) {
            return interfaceC20259b2;
        }
        if (i14 != 2) {
            return i14 != 3 ? interfaceC20259b2 : interfaceC20259b3;
        }
        return interfaceC20259b1;
    }

    @Override // io.sentry.InterfaceC20259b1
    public final Map getExtras() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.putAll(this.f76453a.getExtras());
        concurrentHashMap.putAll(this.f76454b.getExtras());
        concurrentHashMap.putAll(this.f76455c.getExtras());
        return concurrentHashMap;
    }

    @Override // io.sentry.InterfaceC20259b1
    public final EnumC20436n5 getLevel() {
        EnumC20436n5 level = this.f76455c.getLevel();
        if (level != null) {
            return level;
        }
        EnumC20436n5 level2 = this.f76454b.getLevel();
        return level2 != null ? level2 : this.f76453a.getLevel();
    }

    @Override // io.sentry.InterfaceC20259b1
    public final C20481h0 getUser() {
        C20481h0 user = this.f76455c.getUser();
        if (user != null) {
            return user;
        }
        C20481h0 user2 = this.f76454b.getUser();
        return user2 != null ? user2 : this.f76453a.getUser();
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: i */
    public final void mo56201i(C20315e c20315e, C20337g0 c20337g0) {
        m56609g(null).mo56201i(c20315e, c20337g0);
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: l */
    public final C20513q6 mo56202l() {
        return this.f76453a.mo56202l();
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: m */
    public final InterfaceC20432n1 mo56203m() {
        InterfaceC20432n1 interfaceC20432n1Mo56203m = this.f76455c.mo56203m();
        if (interfaceC20432n1Mo56203m != null) {
            return interfaceC20432n1Mo56203m;
        }
        InterfaceC20432n1 interfaceC20432n1Mo56203m2 = this.f76454b.mo56203m();
        return interfaceC20432n1Mo56203m2 != null ? interfaceC20432n1Mo56203m2 : this.f76453a.mo56203m();
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: o */
    public final C20265b7 mo56204o() {
        return m56609g(null).mo56204o();
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: p */
    public final void mo56205p(Throwable th3, C20314d7 c20314d7, String str) {
        this.f76453a.mo56205p(th3, c20314d7, str);
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: q */
    public final C20265b7 mo56206q() {
        C20265b7 c20265b7Mo56206q = this.f76455c.mo56206q();
        if (c20265b7Mo56206q != null) {
            return c20265b7Mo56206q;
        }
        C20265b7 c20265b7Mo56206q2 = this.f76454b.mo56206q();
        return c20265b7Mo56206q2 != null ? c20265b7Mo56206q2 : this.f76453a.mo56206q();
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: r */
    public final C20482i mo56207r() {
        return mo56184F().mo1873r();
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: s */
    public final C20501v mo56208s() {
        C20501v c20501vMo56208s = this.f76455c.mo56208s();
        C20501v c20501v = C20501v.f76802x;
        if (!c20501v.equals(c20501vMo56208s)) {
            return c20501vMo56208s;
        }
        C20501v c20501vMo56208s2 = this.f76454b.mo56208s();
        return !c20501v.equals(c20501vMo56208s2) ? c20501vMo56208s2 : this.f76453a.mo56208s();
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: t */
    public final void mo56209t(C20501v c20501v) {
        m56609g(null).mo56209t(c20501v);
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: u */
    public final C37199o mo56210u() {
        return m56609g(null).mo56210u();
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: v */
    public final Queue mo56211v() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f76453a.mo56211v());
        arrayList.addAll(this.f76454b.mo56211v());
        InterfaceC20259b1 interfaceC20259b1 = this.f76455c;
        arrayList.addAll(interfaceC20259b1.mo56211v());
        Collections.sort(arrayList);
        Queue queueM56240g = C20274c4.m56240g(interfaceC20259b1.mo56202l().getMaxBreadcrumbs());
        queueM56240g.addAll(arrayList);
        return queueM56240g;
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: w */
    public final C20265b7 mo56212w(InterfaceC20045a4 interfaceC20045a4) {
        return m56609g(null).mo56212w(interfaceC20045a4);
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: x */
    public final void mo56213x(C0237p c0237p) {
        m56609g(null).mo56213x(c0237p);
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: y */
    public final List mo56214y() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.addAll(this.f76453a.mo56214y());
        copyOnWriteArrayList.addAll(this.f76454b.mo56214y());
        copyOnWriteArrayList.addAll(this.f76455c.mo56214y());
        Collections.sort(copyOnWriteArrayList);
        return copyOnWriteArrayList;
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: z */
    public final C20470c mo56215z() {
        InterfaceC20259b1 interfaceC20259b1 = this.f76453a;
        return new C20366i(interfaceC20259b1.mo56215z(), this.f76454b.mo56215z(), this.f76455c.mo56215z(), interfaceC20259b1.mo56202l().getDefaultScopeType());
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final InterfaceC20259b1 m134238clone() {
        return new C20397k(this.f76453a, this.f76454b.m134238clone(), this.f76455c.m134238clone());
    }
}
