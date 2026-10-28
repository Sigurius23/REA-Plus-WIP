package p512u2;

import androidx.compose.p018ui.node.NodeCoordinator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p002a0.C0047q0;
import p002a0.C0062y;
import p005a3.AbstractC0201g;
import p005a3.AbstractC0233o;
import p005a3.InterfaceC0200f2;
import p026b2.AbstractC2316v;
import p133f1.C13968p1;
import p181h2.C16617b;
import p309lo.C24553k;
import p446r1.C30849c;
import p635y2.InterfaceC39147y;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: u2.i */
/* JADX INFO: loaded from: classes.dex */
public final class C34463i extends C34464j {

    /* JADX INFO: renamed from: c */
    public final AbstractC2316v f144790c;

    /* JADX INFO: renamed from: f */
    public NodeCoordinator f144793f;

    /* JADX INFO: renamed from: g */
    public C34465k f144794g;

    /* JADX INFO: renamed from: h */
    public boolean f144795h;

    /* JADX INFO: renamed from: d */
    public final C24553k f144791d = new C24553k(1, (byte) 0);

    /* JADX INFO: renamed from: e */
    public final C0062y f144792e = new C0062y(2);

    /* JADX INFO: renamed from: i */
    public boolean f144796i = true;

    /* JADX INFO: renamed from: j */
    public boolean f144797j = true;

    public C34463i(AbstractC2316v abstractC2316v) {
        this.f144790c = abstractC2316v;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0251  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r5v1, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    @Override // p512u2.C34464j
    /* JADX INFO: renamed from: a */
    public final boolean mo108937a(C0062y c0062y, InterfaceC39147y interfaceC39147y, C13968p1 c13968p1, boolean z4) {
        C0062y c0062y2;
        C24553k c24553k;
        Object obj;
        boolean z13;
        boolean z14;
        C34465k c34465k;
        int i13;
        boolean z15;
        int i14;
        boolean zMo108937a = super.mo108937a(c0062y, interfaceC39147y, c13968p1, z4);
        ?? M504d = this.f144790c;
        boolean z16 = true;
        if (M504d.f9141N) {
            ?? c30849c = 0;
            while (M504d != 0) {
                if (M504d instanceof InterfaceC0200f2) {
                    this.f144793f = AbstractC22674j.m65702J((InterfaceC0200f2) M504d);
                } else if ((M504d.f9144y & 16) != 0 && (M504d instanceof AbstractC0233o)) {
                    AbstractC2316v abstractC2316v = ((AbstractC0233o) M504d).f804P;
                    int i15 = 0;
                    while (abstractC2316v != null) {
                        if ((abstractC2316v.f9144y & 16) != 0) {
                            i15++;
                            if (i15 == 1) {
                                M504d = M504d;
                                c30849c = c30849c;
                                c30849c = c30849c;
                                M504d = abstractC2316v;
                            } else {
                                if (c30849c == 0) {
                                    c30849c = new C30849c(new AbstractC2316v[16]);
                                }
                                if (M504d != 0) {
                                    c30849c.m94885b(M504d);
                                    M504d = 0;
                                }
                                c30849c.m94885b(abstractC2316v);
                            }
                        } else {
                            M504d = M504d;
                            c30849c = c30849c;
                        }
                        abstractC2316v = abstractC2316v.f9133F;
                        M504d = M504d;
                        c30849c = c30849c;
                    }
                    if (i15 == 1) {
                        M504d = M504d;
                        c30849c = c30849c;
                    } else {
                        M504d = M504d;
                        c30849c = c30849c;
                    }
                }
                M504d = AbstractC0201g.m504d(c30849c);
            }
            if (this.f144793f != null) {
                int iM157i = c0062y.m157i();
                int i16 = 0;
                while (true) {
                    c0062y2 = this.f144792e;
                    c24553k = this.f144791d;
                    if (i16 >= iM157i) {
                        break;
                    }
                    long jM154f = c0062y.m154f(i16);
                    C34472r c34472r = (C34472r) c0062y.m158j(i16);
                    if (c24553k.m71600d(jM154f)) {
                        long jM108952h = c34472r.m108952h();
                        z15 = z16;
                        long jM108949e = c34472r.m108949e();
                        if ((((jM108952h & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((jM108949e & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            ArrayList arrayList = new ArrayList(c34472r.m108947c().size());
                            List listM108947c = c34472r.m108947c();
                            zMo108937a = zMo108937a;
                            int size = listM108947c.size();
                            iM157i = iM157i;
                            int i17 = 0;
                            while (i17 < size) {
                                C34451c c34451c = (C34451c) listM108947c.get(i17);
                                int i18 = size;
                                int i19 = i17;
                                long jM108900b = c34451c.m108900b();
                                if ((((jM108900b & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    long jM108901c = c34451c.m108901c();
                                    NodeCoordinator nodeCoordinator = this.f144793f;
                                    AbstractC22676k.m65747g(nodeCoordinator);
                                    arrayList.add(new C34451c(jM108901c, nodeCoordinator.m3545p1(interfaceC39147y, jM108900b), c34451c.m108899a()));
                                }
                                i17 = i19 + 1;
                                size = i18;
                                i16 = i16;
                            }
                            i14 = i16;
                            NodeCoordinator nodeCoordinator2 = this.f144793f;
                            AbstractC22676k.m65747g(nodeCoordinator2);
                            long jM3545p1 = nodeCoordinator2.m3545p1(interfaceC39147y, jM108952h);
                            NodeCoordinator nodeCoordinator3 = this.f144793f;
                            AbstractC22676k.m65747g(nodeCoordinator3);
                            c0062y2.m155g(jM154f, C34472r.m108945b(c34472r, nodeCoordinator3.m3545p1(interfaceC39147y, jM108949e), jM3545p1, arrayList));
                        }
                        i16 = i14 + 1;
                        z16 = z15;
                        zMo108937a = zMo108937a;
                        iM157i = iM157i;
                    } else {
                        z15 = z16;
                    }
                    i14 = i16;
                    i16 = i14 + 1;
                    z16 = z15;
                    zMo108937a = zMo108937a;
                    iM157i = iM157i;
                }
                boolean z17 = zMo108937a;
                boolean z18 = z16;
                if (c0062y2.m153e()) {
                    c24553k.m71599c();
                    this.f144798a.m94890g();
                    return z18;
                }
                int iM71603g = c24553k.m71603g();
                while (true) {
                    iM71603g--;
                    if (-1 >= iM71603g) {
                        break;
                    }
                    if (!c0062y.m150b(c24553k.m71602f(iM71603g))) {
                        c24553k.m71606j(iM71603g);
                    }
                }
                ArrayList arrayList2 = new ArrayList(c0062y2.m157i());
                int iM157i2 = c0062y2.m157i();
                for (int i24 = 0; i24 < iM157i2; i24++) {
                    arrayList2.add(c0062y2.m158j(i24));
                }
                C34465k c34465k2 = new C34465k(arrayList2, c13968p1);
                int size2 = arrayList2.size();
                int i25 = 0;
                while (true) {
                    if (i25 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = arrayList2.get(i25);
                    if (c13968p1.m39749c(((C34472r) obj).m108948d())) {
                        break;
                    }
                    i25++;
                }
                C34472r c34472r2 = (C34472r) obj;
                if (c34472r2 != null) {
                    if (z4) {
                        z13 = false;
                        if (!this.f144796i && (c34472r2.m108950f() || c34472r2.m108953i())) {
                            NodeCoordinator nodeCoordinator4 = this.f144793f;
                            AbstractC22676k.m65747g(nodeCoordinator4);
                            this.f144796i = !AbstractC34454d0.m108916g(c34472r2, nodeCoordinator4.f168213y);
                        }
                    } else {
                        z13 = false;
                        this.f144796i = false;
                    }
                    boolean z19 = this.f144796i;
                    boolean z24 = this.f144795h;
                    if (z19 == z24 || !((i13 = c34465k2.f144805f) == 3 || i13 == 4 || i13 == 5)) {
                        int i26 = c34465k2.f144805f;
                        if (i26 == 4 && z24 && !this.f144797j) {
                            c34465k2.f144805f = 3;
                        } else if (i26 == 5 && z19 && c34472r2.m108950f()) {
                            c34465k2.f144805f = 3;
                        }
                    } else {
                        c34465k2.f144805f = z19 ? 4 : 5;
                    }
                } else {
                    z13 = false;
                }
                if (!z17 && c34465k2.f144805f == 3 && (c34465k = this.f144794g) != null) {
                    ?? r10 = c34465k.f144800a;
                    int size3 = r10.size();
                    ?? r14 = c34465k2.f144800a;
                    if (size3 != r14.size()) {
                        z14 = z18;
                        break;
                    }
                    int size4 = r14.size();
                    ?? r15 = z13;
                    while (true) {
                        if (r15 >= size4) {
                            z14 = z13;
                            break;
                        }
                        if (!C16617b.m47187c(((C34472r) r10.get(r15)).m108949e(), ((C34472r) r14.get(r15)).m108949e())) {
                            z14 = z18;
                            break;
                        }
                        r15++;
                    }
                } else {
                    z14 = z18;
                    break;
                }
                this.f144794g = c34465k2;
                return z14;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // p512u2.C34464j
    /* JADX INFO: renamed from: b */
    public final void mo108938b(C13968p1 c13968p1) {
        super.mo108938b(c13968p1);
        C34465k c34465k = this.f144794g;
        if (c34465k == null) {
            return;
        }
        this.f144795h = this.f144796i;
        ?? r10 = c34465k.f144800a;
        int size = ((Collection) r10).size();
        for (int i13 = 0; i13 < size; i13++) {
            C34472r c34472r = (C34472r) r10.get(i13);
            boolean zM108950f = c34472r.m108950f();
            boolean zM39749c = c13968p1.m39749c(c34472r.m108948d());
            boolean z4 = this.f144796i;
            if ((!zM108950f && !zM39749c) || (!zM108950f && !z4)) {
                this.f144791d.m71605i(c34472r.m108948d());
            }
        }
        this.f144796i = false;
        this.f144797j = c34465k.f144805f == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX INFO: renamed from: c */
    public final void m108939c() {
        C30849c c30849c = this.f144798a;
        Object[] objArr = c30849c.f127227w;
        int i13 = c30849c.f127229y;
        for (int i14 = 0; i14 < i13; i14++) {
            ((C34463i) objArr[i14]).m108939c();
        }
        ?? M504d = this.f144790c;
        ?? c30849c2 = 0;
        while (M504d != 0) {
            if (M504d instanceof InterfaceC0200f2) {
                ((InterfaceC0200f2) M504d).mo465b0();
            } else if ((M504d.f9144y & 16) != 0 && (M504d instanceof AbstractC0233o)) {
                AbstractC2316v abstractC2316v = ((AbstractC0233o) M504d).f804P;
                int i15 = 0;
                M504d = M504d;
                c30849c2 = c30849c2;
                while (abstractC2316v != null) {
                    if ((abstractC2316v.f9144y & 16) != 0) {
                        i15++;
                        if (i15 == 1) {
                            c30849c2 = c30849c2;
                            M504d = abstractC2316v;
                        } else {
                            if (c30849c2 == 0) {
                                c30849c2 = new C30849c(new AbstractC2316v[16]);
                            }
                            if (M504d != 0) {
                                c30849c2.m94885b(M504d);
                                M504d = 0;
                            }
                            c30849c2.m94885b(abstractC2316v);
                        }
                    }
                    abstractC2316v = abstractC2316v.f9133F;
                    M504d = M504d;
                    c30849c2 = c30849c2;
                }
                if (i15 == 1) {
                }
            }
            M504d = AbstractC0201g.m504d(c30849c2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX INFO: renamed from: d */
    public final boolean m108940d(C13968p1 c13968p1) {
        C0062y c0062y = this.f144792e;
        boolean z4 = false;
        z4 = false;
        if (!c0062y.m153e()) {
            AbstractC2316v abstractC2316v = this.f144790c;
            if (abstractC2316v.f9141N) {
                C34465k c34465k = this.f144794g;
                AbstractC22676k.m65747g(c34465k);
                NodeCoordinator nodeCoordinator = this.f144793f;
                AbstractC22676k.m65747g(nodeCoordinator);
                long j7 = nodeCoordinator.f168213y;
                ?? M504d = abstractC2316v;
                ?? c30849c = 0;
                while (M504d != 0) {
                    if (M504d instanceof InterfaceC0200f2) {
                        ((InterfaceC0200f2) M504d).mo473r0(c34465k, EnumC34466l.f144808y, j7);
                    } else if ((M504d.f9144y & 16) != 0 && (M504d instanceof AbstractC0233o)) {
                        AbstractC2316v abstractC2316v2 = ((AbstractC0233o) M504d).f804P;
                        int i13 = 0;
                        while (abstractC2316v2 != null) {
                            if ((abstractC2316v2.f9144y & 16) != 0) {
                                i13++;
                                if (i13 == 1) {
                                    M504d = M504d;
                                    c30849c = c30849c;
                                    c30849c = c30849c;
                                    M504d = abstractC2316v2;
                                } else {
                                    if (c30849c == 0) {
                                        c30849c = new C30849c(new AbstractC2316v[16]);
                                    }
                                    if (M504d != 0) {
                                        c30849c.m94885b(M504d);
                                        M504d = 0;
                                    }
                                    c30849c.m94885b(abstractC2316v2);
                                }
                            } else {
                                M504d = M504d;
                                c30849c = c30849c;
                            }
                            abstractC2316v2 = abstractC2316v2.f9133F;
                            M504d = M504d;
                            c30849c = c30849c;
                        }
                        if (i13 == 1) {
                            M504d = M504d;
                            c30849c = c30849c;
                        } else {
                            M504d = M504d;
                            c30849c = c30849c;
                        }
                    }
                    M504d = AbstractC0201g.m504d(c30849c);
                }
                if (abstractC2316v.f9141N) {
                    C30849c c30849c2 = this.f144798a;
                    Object[] objArr = c30849c2.f127227w;
                    int i14 = c30849c2.f127229y;
                    for (int i15 = 0; i15 < i14; i15++) {
                        ((C34463i) objArr[i15]).m108940d(c13968p1);
                    }
                }
                z4 = true;
            }
        }
        mo108938b(c13968p1);
        c0062y.m149a();
        this.f144793f = null;
        return z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r0v3, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX INFO: renamed from: e */
    public final boolean m108941e(C13968p1 c13968p1, boolean z4) {
        if (!this.f144792e.m153e()) {
            ?? M504d = this.f144790c;
            if (M504d.f9141N) {
                C34465k c34465k = this.f144794g;
                AbstractC22676k.m65747g(c34465k);
                NodeCoordinator nodeCoordinator = this.f144793f;
                AbstractC22676k.m65747g(nodeCoordinator);
                long j7 = nodeCoordinator.f168213y;
                ?? M504d2 = M504d;
                ?? c30849c = 0;
                while (M504d2 != 0) {
                    if (M504d2 instanceof InterfaceC0200f2) {
                        ((InterfaceC0200f2) M504d2).mo473r0(c34465k, EnumC34466l.f144806w, j7);
                    } else if ((M504d2.f9144y & 16) != 0 && (M504d2 instanceof AbstractC0233o)) {
                        AbstractC2316v abstractC2316v = ((AbstractC0233o) M504d2).f804P;
                        int i13 = 0;
                        while (abstractC2316v != null) {
                            if ((abstractC2316v.f9144y & 16) != 0) {
                                i13++;
                                if (i13 == 1) {
                                    M504d2 = M504d2;
                                    c30849c = c30849c;
                                    c30849c = c30849c;
                                    M504d2 = abstractC2316v;
                                } else {
                                    if (c30849c == 0) {
                                        c30849c = new C30849c(new AbstractC2316v[16]);
                                    }
                                    if (M504d2 != 0) {
                                        c30849c.m94885b(M504d2);
                                        M504d2 = 0;
                                    }
                                    c30849c.m94885b(abstractC2316v);
                                }
                            } else {
                                M504d2 = M504d2;
                                c30849c = c30849c;
                            }
                            abstractC2316v = abstractC2316v.f9133F;
                            M504d2 = M504d2;
                            c30849c = c30849c;
                        }
                        if (i13 == 1) {
                            M504d2 = M504d2;
                            c30849c = c30849c;
                        } else {
                            M504d2 = M504d2;
                            c30849c = c30849c;
                        }
                    }
                    M504d2 = AbstractC0201g.m504d(c30849c);
                }
                if (M504d.f9141N) {
                    C30849c c30849c2 = this.f144798a;
                    Object[] objArr = c30849c2.f127227w;
                    int i14 = c30849c2.f127229y;
                    for (int i15 = 0; i15 < i14; i15++) {
                        C34463i c34463i = (C34463i) objArr[i15];
                        AbstractC22676k.m65747g(this.f144793f);
                        c34463i.m108941e(c13968p1, z4);
                    }
                }
                if (M504d.f9141N) {
                    ?? c30849c3 = 0;
                    while (M504d != 0) {
                        if (M504d instanceof InterfaceC0200f2) {
                            ((InterfaceC0200f2) M504d).mo473r0(c34465k, EnumC34466l.f144807x, j7);
                        } else if ((M504d.f9144y & 16) != 0 && (M504d instanceof AbstractC0233o)) {
                            AbstractC2316v abstractC2316v2 = ((AbstractC0233o) M504d).f804P;
                            int i16 = 0;
                            while (abstractC2316v2 != null) {
                                if ((abstractC2316v2.f9144y & 16) != 0) {
                                    i16++;
                                    if (i16 == 1) {
                                        M504d = M504d;
                                        c30849c3 = c30849c3;
                                        c30849c3 = c30849c3;
                                        M504d = abstractC2316v2;
                                    } else {
                                        if (c30849c3 == 0) {
                                            c30849c3 = new C30849c(new AbstractC2316v[16]);
                                        }
                                        if (M504d != 0) {
                                            c30849c3.m94885b(M504d);
                                            M504d = 0;
                                        }
                                        c30849c3.m94885b(abstractC2316v2);
                                    }
                                } else {
                                    M504d = M504d;
                                    c30849c3 = c30849c3;
                                }
                                abstractC2316v2 = abstractC2316v2.f9133F;
                                M504d = M504d;
                                c30849c3 = c30849c3;
                            }
                            if (i16 == 1) {
                                M504d = M504d;
                                c30849c3 = c30849c3;
                            } else {
                                M504d = M504d;
                                c30849c3 = c30849c3;
                            }
                        }
                        M504d = AbstractC0201g.m504d(c30849c3);
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m108942f(long j7, C0047q0 c0047q0) {
        C24553k c24553k = this.f144791d;
        if (c24553k.m71600d(j7) && c0047q0.m103f(this) < 0) {
            c24553k.m71605i(j7);
            this.f144792e.m156h(j7);
        }
        C30849c c30849c = this.f144798a;
        Object[] objArr = c30849c.f127227w;
        int i13 = c30849c.f127229y;
        for (int i14 = 0; i14 < i13; i14++) {
            ((C34463i) objArr[i14]).m108942f(j7, c0047q0);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.f144790c + ", children=" + this.f144798a + ", pointerIds=" + this.f144791d + ')';
    }
}
