package p512u2;

import java.util.List;
import p002a0.C0035k0;
import p002a0.C0047q0;
import p002a0.C0062y;
import p026b2.AbstractC2316v;
import p133f1.C13968p1;
import p446r1.C30849c;
import p450r5.C30929c;
import p635y2.InterfaceC39147y;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: u2.d */
/* JADX INFO: loaded from: classes.dex */
public final class C34453d {

    /* JADX INFO: renamed from: a */
    public final InterfaceC39147y f144748a;

    /* JADX INFO: renamed from: b */
    public boolean f144749b;

    /* JADX INFO: renamed from: c */
    public boolean f144750c;

    /* JADX INFO: renamed from: d */
    public boolean f144751d;

    /* JADX INFO: renamed from: e */
    public boolean f144752e;

    /* JADX INFO: renamed from: f */
    public final C0047q0 f144753f = new C0047q0();

    /* JADX INFO: renamed from: g */
    public final C34464j f144754g = new C34464j();

    /* JADX INFO: renamed from: h */
    public final C0035k0 f144755h = new C0035k0(10);

    public C34453d(InterfaceC39147y interfaceC39147y) {
        this.f144748a = interfaceC39147y;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007f  */
    /* JADX INFO: renamed from: a */
    public final void m108906a(long j7, List list, boolean z4) {
        C34463i c34463i;
        Object objM81e;
        Object obj;
        C0035k0 c0035k0 = this.f144755h;
        c0035k0.m77a();
        int size = list.size();
        C34464j c34464j = this.f144754g;
        C34464j c34464j2 = c34464j;
        boolean z13 = true;
        for (int i13 = 0; i13 < size; i13++) {
            AbstractC2316v abstractC2316v = (AbstractC2316v) list.get(i13);
            if (abstractC2316v.f9141N) {
                abstractC2316v.f9140M = new C30929c(9, this, abstractC2316v);
                if (z13) {
                    C30849c c30849c = c34464j2.f144798a;
                    Object[] objArr = c30849c.f127227w;
                    int i14 = c30849c.f127229y;
                    int i15 = 0;
                    while (true) {
                        if (i15 >= i14) {
                            obj = null;
                            break;
                        }
                        obj = objArr[i15];
                        if (AbstractC22676k.m65745e(((C34463i) obj).f144790c, abstractC2316v)) {
                            break;
                        } else {
                            i15++;
                        }
                    }
                    c34463i = (C34463i) obj;
                    if (c34463i != null) {
                        c34463i.f144796i = true;
                        c34463i.f144791d.m71597a(j7);
                        Object objM81e2 = c0035k0.m81e(j7);
                        if (objM81e2 == null) {
                            objM81e2 = new C0047q0();
                            c0035k0.m84h(j7, objM81e2);
                        }
                        ((C0047q0) objM81e2).m98a(c34463i);
                    } else {
                        z13 = false;
                        c34463i = new C34463i(abstractC2316v);
                        c34463i.f144791d.m71597a(j7);
                        objM81e = c0035k0.m81e(j7);
                        if (objM81e == null) {
                            objM81e = new C0047q0();
                            c0035k0.m84h(j7, objM81e);
                        }
                        ((C0047q0) objM81e).m98a(c34463i);
                        c34464j2.f144798a.m94885b(c34463i);
                    }
                } else {
                    c34463i = new C34463i(abstractC2316v);
                    c34463i.f144791d.m71597a(j7);
                    objM81e = c0035k0.m81e(j7);
                    if (objM81e == null) {
                        objM81e = new C0047q0();
                        c0035k0.m84h(j7, objM81e);
                    }
                    ((C0047q0) objM81e).m98a(c34463i);
                    c34464j2.f144798a.m94885b(c34463i);
                }
                c34464j2 = c34463i;
            }
        }
        if (!z4) {
            return;
        }
        long[] jArr = c0035k0.f100b;
        Object[] objArr2 = c0035k0.f101c;
        long[] jArr2 = c0035k0.f99a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i16 = 0;
        while (true) {
            long j13 = jArr2[i16];
            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i17 = 8;
                int i18 = 8 - ((~(i16 - length)) >>> 31);
                int i19 = 0;
                while (i19 < i18) {
                    if ((255 & j13) < 128) {
                        int i24 = (i16 << 3) + i19;
                        long j14 = jArr[i24];
                        C0047q0 c0047q0 = (C0047q0) objArr2[i24];
                        C30849c c30849c2 = c34464j.f144798a;
                        Object[] objArr3 = c30849c2.f127227w;
                        int i25 = c30849c2.f127229y;
                        for (int i26 = 0; i26 < i25; i26++) {
                            ((C34463i) objArr3[i26]).m108942f(j14, c0047q0);
                        }
                    }
                    j13 >>= i17;
                    i19++;
                    i17 = i17;
                }
                if (i18 != i17) {
                    return;
                }
            }
            if (i16 == length) {
                return;
            } else {
                i16++;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m108907b(C13968p1 c13968p1, boolean z4) {
        C0062y c0062yM39755k = c13968p1.m39755k();
        InterfaceC39147y interfaceC39147y = this.f144748a;
        C34464j c34464j = this.f144754g;
        boolean zMo108937a = c34464j.mo108937a(c0062yM39755k, interfaceC39147y, c13968p1, z4);
        C30849c c30849c = c34464j.f144798a;
        if (!zMo108937a) {
            return false;
        }
        boolean z13 = true;
        this.f144749b = true;
        Object[] objArr = c30849c.f127227w;
        int i13 = c30849c.f127229y;
        boolean z14 = false;
        for (int i14 = 0; i14 < i13; i14++) {
            z14 = ((C34463i) objArr[i14]).m108941e(c13968p1, z4) || z14;
        }
        Object[] objArr2 = c30849c.f127227w;
        int i15 = c30849c.f127229y;
        boolean z15 = false;
        for (int i16 = 0; i16 < i15; i16++) {
            z15 = ((C34463i) objArr2[i16]).m108940d(c13968p1) || z15;
        }
        c34464j.mo108938b(c13968p1);
        if (!z15 && !z14) {
            z13 = false;
        }
        this.f144749b = false;
        if (this.f144752e) {
            this.f144752e = false;
            C0047q0 c0047q0 = this.f144753f;
            int i17 = c0047q0.f137b;
            for (int i18 = 0; i18 < i17; i18++) {
                m108909d((AbstractC2316v) c0047q0.m102e(i18));
            }
            c0047q0.m100c();
        }
        if (this.f144750c) {
            this.f144750c = false;
            m108908c();
        }
        if (this.f144751d) {
            this.f144751d = false;
            c34464j.f144798a.m94890g();
        }
        return z13;
    }

    /* JADX INFO: renamed from: c */
    public final void m108908c() {
        if (this.f144749b) {
            this.f144750c = true;
            return;
        }
        C34464j c34464j = this.f144754g;
        C30849c c30849c = c34464j.f144798a;
        Object[] objArr = c30849c.f127227w;
        int i13 = c30849c.f127229y;
        for (int i14 = 0; i14 < i13; i14++) {
            ((C34463i) objArr[i14]).m108939c();
        }
        if (this.f144751d) {
            this.f144751d = true;
        } else {
            c34464j.f144798a.m94890g();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: d */
    public final void m108909d(AbstractC2316v abstractC2316v) {
        if (this.f144749b) {
            this.f144752e = true;
            this.f144753f.m98a(abstractC2316v);
            return;
        }
        C34464j c34464j = this.f144754g;
        C0047q0 c0047q0 = c34464j.f144799b;
        c0047q0.m100c();
        c0047q0.m98a(c34464j);
        while (c0047q0.m105h()) {
            C34464j c34464j2 = (C34464j) c0047q0.m107j(c0047q0.f137b - 1);
            int i13 = 0;
            while (true) {
                C30849c c30849c = c34464j2.f144798a;
                if (i13 < c30849c.f127229y) {
                    C34463i c34463i = (C34463i) c30849c.f127227w[i13];
                    if (AbstractC22676k.m65745e(c34463i.f144790c, abstractC2316v)) {
                        c34464j2.f144798a.m94893k(c34463i);
                        c34463i.m108939c();
                    } else {
                        c0047q0.m98a(c34463i);
                        i13++;
                    }
                }
            }
        }
    }
}
