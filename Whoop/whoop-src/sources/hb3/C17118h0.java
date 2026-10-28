package hb3;

import a00.C0072g;
import androidx.lifecycle.C1591h2;
import cb3.AbstractC4393e;
import ce3.C4515p;
import com.squareup.wire.AbstractC5583n;
import e93.AbstractC12889b;
import io.sentry.config.AbstractC20301a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jb3.C21541a;
import jb3.C21562v;
import kb3.C22342k;
import lb3.AbstractC23763c0;
import lb3.AbstractC23767d1;
import lb3.AbstractC23791o;
import lb3.AbstractC23804u0;
import lb3.AbstractC23811y;
import lb3.C23765d;
import lb3.C23774g;
import lb3.C23775g0;
import lb3.C23778h0;
import lb3.C23782j0;
import lb3.C23783k;
import lb3.C23784k0;
import lb3.C23806v0;
import lb3.EnumC23776g1;
import lb3.InterfaceC23796q0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import m83.C25272z;
import nb3.C26555l;
import nb3.EnumC26554k;
import o63.C27617h;
import o93.AbstractC27736h;
import o93.AbstractC27742n;
import p000.C31931s;
import p108e4.AbstractC12667a;
import p249jc.AbstractC21598x;
import p581we.C37199o;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import qa3.C30120b1;
import qa3.C30167u0;
import qa3.C30171w0;
import qa3.EnumC30165t0;
import r93.InterfaceC31108b;
import r93.InterfaceC31117e;
import r93.InterfaceC31126h;
import r93.InterfaceC31135k;
import r93.InterfaceC31163w0;
import r93.InterfaceC31165x0;
import s93.C32305g;
import s93.C32308j;
import s93.InterfaceC32307i;
import sa3.AbstractC32330d;
import sa3.C32334h;
import va3.C35845c;
import va3.C35847e;
import wb3.AbstractC37056f;
import xb3.AbstractC38176k;
import xb3.C38184s;

/* JADX INFO: renamed from: hb3.h0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17118h0 {

    /* JADX INFO: renamed from: a */
    public final C17122k f65728a;

    /* JADX INFO: renamed from: b */
    public final C17118h0 f65729b;

    /* JADX INFO: renamed from: c */
    public final String f65730c;

    /* JADX INFO: renamed from: d */
    public final String f65731d;

    /* JADX INFO: renamed from: e */
    public final C1591h2 f65732e;

    /* JADX INFO: renamed from: f */
    public final C1591h2 f65733f;

    /* JADX INFO: renamed from: g */
    public final Object f65734g;

    public C17118h0(C17122k c17122k, C17118h0 c17118h0, List typeParameterProtos, String debugName, String str) {
        Map linkedHashMap;
        AbstractC22676k.m65750j(typeParameterProtos, "typeParameterProtos");
        AbstractC22676k.m65750j(debugName, "debugName");
        this.f65728a = c17122k;
        this.f65729b = c17118h0;
        this.f65730c = debugName;
        this.f65731d = str;
        C22342k c22342k = c17122k.f65760a.f65735a;
        this.f65732e = c22342k.m64224c(new C17112e0(this, 0));
        this.f65733f = c22342k.m64224c(new C17112e0(this, 1));
        if (typeParameterProtos.isEmpty()) {
            linkedHashMap = C25272z.f99163w;
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = typeParameterProtos.iterator();
            int i13 = 0;
            while (it.hasNext()) {
                C30120b1 c30120b1 = (C30120b1) it.next();
                linkedHashMap.put(Integer.valueOf(c30120b1.f123021z), new C21562v(this.f65728a, c30120b1, i13));
                i13++;
            }
        }
        this.f65734g = linkedHashMap;
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC23763c0 m48355a(AbstractC23763c0 abstractC23763c0, AbstractC23811y abstractC23811y) {
        AbstractC27736h abstractC27736hM56356z = AbstractC20301a.m56356z(abstractC23763c0);
        InterfaceC32307i annotations = abstractC23763c0.getAnnotations();
        AbstractC23811y abstractC23811yM16752L = AbstractC5583n.m16752L(abstractC23763c0);
        List listM16746E = AbstractC5583n.m16746E(abstractC23763c0);
        List listM74086A0 = AbstractC25265s.m74086A0(1, AbstractC5583n.m16754N(abstractC23763c0));
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM74086A0, 10));
        Iterator it = listM74086A0.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC23804u0) it.next()).mo69868b());
        }
        return AbstractC5583n.m16793t(abstractC27736hM56356z, annotations, abstractC23811yM16752L, listM16746E, arrayList, abstractC23811y, true).mo64125r0(abstractC23763c0.mo69814k0());
    }

    /* JADX INFO: renamed from: e */
    public static final ArrayList m48356e(C30171w0 c30171w0, C17118h0 c17118h0) {
        List list = c30171w0.f123495z;
        AbstractC22676k.m65749i(list, "getArgumentList(...)");
        List list2 = list;
        C30171w0 c30171w0M60679f0 = AbstractC21598x.m60679f0(c30171w0, c17118h0.f65728a.f65763d);
        Iterable iterableM48356e = c30171w0M60679f0 != null ? m48356e(c30171w0M60679f0, c17118h0) : null;
        if (iterableM48356e == null) {
            iterableM48356e = C25271y.f99162w;
        }
        return AbstractC25265s.m74129g1(list2, iterableM48356e);
    }

    /* JADX INFO: renamed from: f */
    public static C23784k0 m48357f(List list, InterfaceC32307i interfaceC32307i, InterfaceC23796q0 interfaceC23796q0, InterfaceC31135k interfaceC31135k) {
        C23784k0 c23784k0M119197l;
        List list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            ((C23783k) it.next()).getClass();
            if (interfaceC32307i.isEmpty()) {
                C23784k0.f94165x.getClass();
                c23784k0M119197l = C23784k0.f94166y;
            } else {
                C37199o c37199o = C23784k0.f94165x;
                List listM118958J = AbstractC37056f.m118958J(new C23774g(interfaceC32307i));
                c37199o.getClass();
                c23784k0M119197l = C37199o.m119197l(listM118958J);
            }
            arrayList.add(c23784k0M119197l);
        }
        ArrayList arrayListM74164j0 = AbstractC25267u.m74164j0(arrayList);
        C23784k0.f94165x.getClass();
        return C37199o.m119197l(arrayListM74164j0);
    }

    /* JADX INFO: renamed from: h */
    public static final InterfaceC31117e m48358h(C17118h0 c17118h0, C30171w0 c30171w0, int i13) {
        C17122k c17122k = c17118h0.f65728a;
        C35845c c35845cM36239E = AbstractC12889b.m36239E(c17122k.f65761b, i13);
        C38184s c38184sM122272A = AbstractC38176k.m122272A(AbstractC38176k.m122288x(c30171w0, new C31931s(c17118h0, 7)), C17114f0.f65722w);
        ArrayList arrayList = new ArrayList();
        Iterator it = c38184sM122272A.iterator();
        while (true) {
            C27617h c27617h = (C27617h) it;
            if (!c27617h.hasNext()) {
                break;
            }
            arrayList.add(c27617h.next());
        }
        int iM122280p = AbstractC38176k.m122280p(AbstractC38176k.m122288x(c35845cM36239E, C17116g0.f65726w));
        while (arrayList.size() < iM122280p) {
            arrayList.add(0);
        }
        return c17122k.f65760a.f65746l.m133473t(c35845cM36239E, arrayList);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: b */
    public final List m48359b() {
        return AbstractC25265s.m74093D1(this.f65734g.values());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: c */
    public final InterfaceC31165x0 m48360c(int i13) {
        InterfaceC31165x0 interfaceC31165x0 = (InterfaceC31165x0) this.f65734g.get(Integer.valueOf(i13));
        if (interfaceC31165x0 != null) {
            return interfaceC31165x0;
        }
        C17118h0 c17118h0 = this.f65729b;
        if (c17118h0 != null) {
            return c17118h0.m48360c(i13);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0290  */
    /* JADX WARN: Code duplicated, block: B:104:0x029b  */
    /* JADX WARN: Code duplicated, block: B:111:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:112:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:115:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:122:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:123:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:125:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:126:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:129:0x0306  */
    /* JADX WARN: Code duplicated, block: B:130:0x030b  */
    /* JADX WARN: Code duplicated, block: B:132:0x0311  */
    /* JADX WARN: Code duplicated, block: B:133:0x031d A[PHI: r4
      0x031d: PHI (r4v10 lb3.c0) = (r4v8 lb3.c0), (r4v15 lb3.c0) binds: [B:137:0x0337, B:131:0x030f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:134:0x031f  */
    /* JADX WARN: Code duplicated, block: B:136:0x0333  */
    /* JADX WARN: Code duplicated, block: B:139:0x033a  */
    /* JADX WARN: Code duplicated, block: B:143:0x035d  */
    /* JADX WARN: Code duplicated, block: B:145:0x0367 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:147:0x01ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x019b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0110  */
    /* JADX WARN: Code duplicated, block: B:46:0x0129  */
    /* JADX WARN: Code duplicated, block: B:49:0x0155  */
    /* JADX WARN: Code duplicated, block: B:51:0x015d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0176 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0178  */
    /* JADX WARN: Code duplicated, block: B:55:0x0184  */
    /* JADX WARN: Code duplicated, block: B:56:0x018b  */
    /* JADX WARN: Code duplicated, block: B:58:0x0196 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x0198  */
    /* JADX WARN: Code duplicated, block: B:63:0x019e  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:68:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:69:0x01be  */
    /* JADX WARN: Code duplicated, block: B:72:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:73:0x01da  */
    /* JADX WARN: Code duplicated, block: B:92:0x024e  */
    /* JADX WARN: Code duplicated, block: B:94:0x025e  */
    /* JADX WARN: Code duplicated, block: B:96:0x026f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0271  */
    /* JADX WARN: Code duplicated, block: B:98:0x0274  */
    /* JADX WARN: Instruction removed from duplicated block: B:139:0x033a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:65:0x01a4, please report this as an issue */
    /* JADX INFO: renamed from: d */
    public final AbstractC23763c0 m48361d(C30171w0 proto, boolean z4) {
        InterfaceC23796q0 interfaceC23796q0M78683d;
        InterfaceC31126h interfaceC31126hM48358h;
        Object next;
        boolean z13;
        C23784k0 c23784k0M48357f;
        ArrayList arrayList;
        int i13;
        List listM74093D1;
        AbstractC23763c0 abstractC23763c0M69890i;
        AbstractC23763c0 abstractC23763c0M69839m;
        boolean z14;
        int size;
        AbstractC23804u0 abstractC23804u0;
        AbstractC23811y abstractC23811yMo69868b;
        InterfaceC31126h interfaceC31126hMo1784d;
        C35847e c35847eM13809g;
        AbstractC23811y abstractC23811yMo69868b2;
        InterfaceC31108b interfaceC31108b;
        C35847e c35847eM13805c;
        int size2;
        C30171w0 c30171w0M60674c;
        int i14;
        C30167u0 c30167u0;
        InterfaceC31165x0 interfaceC31165x0;
        EnumC30165t0 enumC30165t0;
        int iOrdinal;
        EnumC23776g1 enumC23776g1;
        C30171w0 c30171w0M60711x0;
        Object c23806v0;
        C17122k c17122k = this.f65728a;
        C32334h c32334h = c17122k.f65763d;
        C17119i c17119i = c17122k.f65760a;
        InterfaceC31135k interfaceC31135k = c17122k.f65762c;
        AbstractC22676k.m65750j(proto, "proto");
        if (proto.m92362p()) {
            if (AbstractC12889b.m36239E(c17122k.f65761b, proto.f123481I).f152611c) {
                c17122k.f65760a.f65741g.getClass();
            }
        } else if ((proto.f123494y & 128) == 128) {
            if (AbstractC12889b.m36239E(c17122k.f65761b, proto.f123484L).f152611c) {
                c17122k.f65760a.f65741g.getClass();
            }
        }
        boolean z15 = false;
        if (!proto.m92362p()) {
            int i15 = proto.f123494y;
            if ((i15 & 32) == 32) {
                interfaceC31126hM48358h = m48360c(proto.f123482J);
                if (interfaceC31126hM48358h == null) {
                    C26555l c26555l = C26555l.f105564a;
                    interfaceC23796q0M78683d = C26555l.m78683d(EnumC26554k.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER, String.valueOf(proto.f123482J), this.f65731d);
                }
            } else if ((i15 & 64) == 64) {
                String string = c17122k.f65761b.getString(proto.f123483K);
                Iterator it = m48359b().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!AbstractC22676k.m65745e(((InterfaceC31165x0) next).getName().m113817b(), string));
                InterfaceC31165x0 interfaceC31165x1 = (InterfaceC31165x0) next;
                if (interfaceC31165x1 == null) {
                    C26555l c26555l2 = C26555l.f105564a;
                    interfaceC23796q0M78683d = C26555l.m78683d(EnumC26554k.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME, string, interfaceC31135k.toString());
                } else {
                    interfaceC31126hM48358h = interfaceC31165x1;
                }
            } else if ((i15 & 128) == 128) {
                interfaceC31126hM48358h = (InterfaceC31126h) this.f65733f.invoke(Integer.valueOf(proto.f123484L));
                if (interfaceC31126hM48358h == null) {
                    interfaceC31126hM48358h = m48358h(this, proto, proto.f123484L);
                }
            } else {
                C26555l c26555l3 = C26555l.f105564a;
                interfaceC23796q0M78683d = C26555l.m78683d(EnumC26554k.UNKNOWN_TYPE, new String[0]);
            }
            z13 = true;
            z13 = true;
            if (C26555l.m78685f(interfaceC23796q0M78683d.mo1784d())) {
                C26555l c26555l4 = C26555l.f105564a;
                return C26555l.m78684e(EnumC26554k.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR, C25271y.f99162w, interfaceC23796q0M78683d, (String[]) Arrays.copyOf(new String[]{interfaceC23796q0M78683d.toString()}, 1));
            }
            C21541a c21541a = new C21541a(c17119i.f65735a, new C4515p(this, proto, z15, z13 ? 1 : 0));
            c23784k0M48357f = m48357f(c17119i.f65752r, c21541a, interfaceC23796q0M78683d, interfaceC31135k);
            ArrayList arrayListM48356e = m48356e(proto, this);
            arrayList = new ArrayList(AbstractC25267u.m74163i0(arrayListM48356e, 10));
            i13 = 0;
            for (Object obj : arrayListM48356e) {
                i14 = i13 + 1;
                if (i13 >= 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                c30167u0 = (C30167u0) obj;
                List parameters = interfaceC23796q0M78683d.getParameters();
                AbstractC22676k.m65749i(parameters, "getParameters(...)");
                interfaceC31165x0 = (InterfaceC31165x0) AbstractC25265s.m74102I0(i13, parameters);
                enumC30165t0 = c30167u0.f123443y;
                if (enumC30165t0 == EnumC30165t0.STAR) {
                    AbstractC22676k.m65749i(enumC30165t0, "getProjection(...)");
                    iOrdinal = enumC30165t0.ordinal();
                    if (iOrdinal != 0) {
                        enumC23776g1 = EnumC23776g1.IN_VARIANCE;
                    } else if (iOrdinal != 1) {
                        enumC23776g1 = EnumC23776g1.OUT_VARIANCE;
                    } else {
                        if (iOrdinal != 2) {
                            if (iOrdinal != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw new IllegalArgumentException("Only IN, OUT and INV are supported. Actual argument: " + enumC30165t0);
                        }
                        enumC23776g1 = EnumC23776g1.INVARIANT;
                    }
                    c30171w0M60711x0 = AbstractC21598x.m60711x0(c30167u0, c32334h);
                    if (c30171w0M60711x0 == null) {
                        c23806v0 = new C23806v0(C26555l.m78682c(EnumC26554k.NO_RECORDED_TYPE, c30167u0.toString()));
                    } else {
                        c23806v0 = new C23806v0(m48362g(c30171w0M60711x0), enumC23776g1);
                    }
                } else if (interfaceC31165x0 == null) {
                    c23806v0 = new C23775g0(c17119i.f65736b.mo78661c());
                } else {
                    c23806v0 = new C23778h0(interfaceC31165x0);
                }
                arrayList.add(c23806v0);
                i13 = i14;
            }
            listM74093D1 = AbstractC25265s.m74093D1(arrayList);
            InterfaceC31126h interfaceC31126hMo1784d2 = interfaceC23796q0M78683d.mo1784d();
            if (!z4 && (interfaceC31126hMo1784d2 instanceof InterfaceC31163w0)) {
                C23782j0 c23782j0 = new C23782j0();
                C0072g c0072gM35466r = AbstractC12667a.m35466r(null, (InterfaceC31163w0) interfaceC31126hMo1784d2, listM74093D1);
                C23784k0.f94165x.getClass();
                AbstractC23763c0 abstractC23763c0M69877b = c23782j0.m69877b(c0072gM35466r, C23784k0.f94166y);
                List list = c17119i.f65752r;
                ArrayList arrayListM74126d1 = AbstractC25265s.m74126d1(c21541a, abstractC23763c0M69877b.getAnnotations());
                C23784k0 c23784k0M48357f2 = m48357f(list, arrayListM74126d1.isEmpty() ? C32305g.f133684a : new C32308j(arrayListM74126d1, 0), interfaceC23796q0M78683d, interfaceC31135k);
                if (!AbstractC23767d1.m69849e(abstractC23763c0M69877b) && !proto.f123477E) {
                    z13 = false;
                }
                abstractC23763c0M69890i = abstractC23763c0M69877b.mo64125r0(z13).mo64127t0(c23784k0M48357f2);
            } else if (AbstractC32330d.f133801a.mo91233e(proto.f123489Q).booleanValue()) {
                z14 = proto.f123477E;
                size = interfaceC23796q0M78683d.getParameters().size() - listM74093D1.size();
                if (size == 0) {
                    abstractC23763c0M69839m = AbstractC23791o.m69890i(listM74093D1, c23784k0M48357f, interfaceC23796q0M78683d, z14);
                    if (AbstractC5583n.m16757Q(abstractC23763c0M69839m) || (abstractC23804u0 = (AbstractC23804u0) AbstractC25265s.m74114R0(AbstractC5583n.m16754N(abstractC23763c0M69839m))) == null || (abstractC23811yMo69868b = abstractC23804u0.mo69868b()) == null) {
                        abstractC23763c0M69839m = null;
                    } else {
                        interfaceC31126hMo1784d = abstractC23811yMo69868b.mo69844i0().mo1784d();
                        if (interfaceC31126hMo1784d != null) {
                            c35847eM13809g = AbstractC4393e.m13809g(interfaceC31126hMo1784d);
                        } else {
                            c35847eM13809g = null;
                        }
                        if (abstractC23811yMo69868b.mo69842X().size() == 1 && (AbstractC22676k.m65745e(c35847eM13809g, AbstractC27742n.f111882g) || AbstractC22676k.m65745e(c35847eM13809g, AbstractC17120i0.f65755a))) {
                            abstractC23811yMo69868b2 = ((AbstractC23804u0) AbstractC25265s.m74142p1(abstractC23811yMo69868b.mo69842X())).mo69868b();
                            AbstractC22676k.m65749i(abstractC23811yMo69868b2, "getType(...)");
                            if (interfaceC31135k instanceof InterfaceC31108b) {
                                interfaceC31108b = (InterfaceC31108b) interfaceC31135k;
                            } else {
                                interfaceC31108b = null;
                            }
                            if (interfaceC31108b != null) {
                                c35847eM13805c = AbstractC4393e.m13805c(interfaceC31108b);
                            } else {
                                c35847eM13805c = null;
                            }
                            if (AbstractC22676k.m65745e(c35847eM13805c, AbstractC17110d0.f65717a)) {
                                abstractC23763c0M69839m = m48355a(abstractC23763c0M69839m, abstractC23811yMo69868b2);
                            } else {
                                abstractC23763c0M69839m = m48355a(abstractC23763c0M69839m, abstractC23811yMo69868b2);
                            }
                        }
                    }
                } else if (size != 1 && (size2 = listM74093D1.size() - 1) >= 0) {
                    InterfaceC23796q0 interfaceC23796q0Mo60496e = interfaceC23796q0M78683d.mo1783c().m83833w(size2).mo60496e();
                    AbstractC22676k.m65749i(interfaceC23796q0Mo60496e, "getTypeConstructor(...)");
                    abstractC23763c0M69839m = AbstractC23791o.m69890i(listM74093D1, c23784k0M48357f, interfaceC23796q0Mo60496e, z14);
                } else {
                    abstractC23763c0M69839m = null;
                }
                if (abstractC23763c0M69839m == null) {
                    C26555l c26555l5 = C26555l.f105564a;
                    abstractC23763c0M69890i = C26555l.m78684e(EnumC26554k.INCONSISTENT_SUSPEND_FUNCTION, listM74093D1, interfaceC23796q0M78683d, new String[0]);
                } else {
                    abstractC23763c0M69890i = abstractC23763c0M69839m;
                }
            } else {
                abstractC23763c0M69890i = AbstractC23791o.m69890i(listM74093D1, c23784k0M48357f, interfaceC23796q0M78683d, proto.f123477E);
                if (AbstractC32330d.f133802b.mo91233e(proto.f123489Q).booleanValue()) {
                    abstractC23763c0M69839m = C23765d.m69839m(abstractC23763c0M69890i, true);
                    if (abstractC23763c0M69839m == null) {
                        throw new IllegalStateException(("null DefinitelyNotNullType for '" + abstractC23763c0M69890i + '\'').toString());
                    }
                    abstractC23763c0M69890i = abstractC23763c0M69839m;
                }
            }
            c30171w0M60674c = AbstractC21598x.m60674c(proto, c32334h);
            if (c30171w0M60674c != null) {
                return AbstractC23791o.m69896o(abstractC23763c0M69890i, m48361d(c30171w0M60674c, false));
            }
            return abstractC23763c0M69890i;
        }
        interfaceC31126hM48358h = (InterfaceC31126h) this.f65732e.invoke(Integer.valueOf(proto.f123481I));
        if (interfaceC31126hM48358h == null) {
            interfaceC31126hM48358h = m48358h(this, proto, proto.f123481I);
        }
        interfaceC23796q0M78683d = interfaceC31126hM48358h.mo60496e();
        AbstractC22676k.m65749i(interfaceC23796q0M78683d, "getTypeConstructor(...)");
        z13 = true;
        z13 = true;
        if (C26555l.m78685f(interfaceC23796q0M78683d.mo1784d())) {
            C26555l c26555l6 = C26555l.f105564a;
            return C26555l.m78684e(EnumC26554k.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR, C25271y.f99162w, interfaceC23796q0M78683d, (String[]) Arrays.copyOf(new String[]{interfaceC23796q0M78683d.toString()}, 1));
        }
        C21541a c21541a2 = new C21541a(c17119i.f65735a, new C4515p(this, proto, z15, z13 ? 1 : 0));
        c23784k0M48357f = m48357f(c17119i.f65752r, c21541a2, interfaceC23796q0M78683d, interfaceC31135k);
        ArrayList arrayListM48356e2 = m48356e(proto, this);
        arrayList = new ArrayList(AbstractC25267u.m74163i0(arrayListM48356e2, 10));
        i13 = 0;
        while (r12.hasNext()) {
            i14 = i13 + 1;
            if (i13 >= 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            c30167u0 = (C30167u0) obj;
            List parameters2 = interfaceC23796q0M78683d.getParameters();
            AbstractC22676k.m65749i(parameters2, "getParameters(...)");
            interfaceC31165x0 = (InterfaceC31165x0) AbstractC25265s.m74102I0(i13, parameters2);
            enumC30165t0 = c30167u0.f123443y;
            if (enumC30165t0 == EnumC30165t0.STAR) {
                AbstractC22676k.m65749i(enumC30165t0, "getProjection(...)");
                iOrdinal = enumC30165t0.ordinal();
                if (iOrdinal != 0) {
                    enumC23776g1 = EnumC23776g1.IN_VARIANCE;
                } else if (iOrdinal != 1) {
                    enumC23776g1 = EnumC23776g1.OUT_VARIANCE;
                } else {
                    if (iOrdinal != 2) {
                        if (iOrdinal != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new IllegalArgumentException("Only IN, OUT and INV are supported. Actual argument: " + enumC30165t0);
                    }
                    enumC23776g1 = EnumC23776g1.INVARIANT;
                }
                c30171w0M60711x0 = AbstractC21598x.m60711x0(c30167u0, c32334h);
                if (c30171w0M60711x0 == null) {
                    c23806v0 = new C23806v0(C26555l.m78682c(EnumC26554k.NO_RECORDED_TYPE, c30167u0.toString()));
                } else {
                    c23806v0 = new C23806v0(m48362g(c30171w0M60711x0), enumC23776g1);
                }
            } else if (interfaceC31165x0 == null) {
                c23806v0 = new C23775g0(c17119i.f65736b.mo78661c());
            } else {
                c23806v0 = new C23778h0(interfaceC31165x0);
            }
            arrayList.add(c23806v0);
            i13 = i14;
        }
        listM74093D1 = AbstractC25265s.m74093D1(arrayList);
        InterfaceC31126h interfaceC31126hMo1784d3 = interfaceC23796q0M78683d.mo1784d();
        if (!z4) {
            if (AbstractC32330d.f133801a.mo91233e(proto.f123489Q).booleanValue()) {
                z14 = proto.f123477E;
                size = interfaceC23796q0M78683d.getParameters().size() - listM74093D1.size();
                if (size == 0) {
                    abstractC23763c0M69839m = AbstractC23791o.m69890i(listM74093D1, c23784k0M48357f, interfaceC23796q0M78683d, z14);
                    if (AbstractC5583n.m16757Q(abstractC23763c0M69839m)) {
                        abstractC23763c0M69839m = null;
                    } else {
                        interfaceC31126hMo1784d = abstractC23811yMo69868b.mo69844i0().mo1784d();
                        if (interfaceC31126hMo1784d != null) {
                            c35847eM13809g = AbstractC4393e.m13809g(interfaceC31126hMo1784d);
                        } else {
                            c35847eM13809g = null;
                        }
                        if (abstractC23811yMo69868b.mo69842X().size() == 1) {
                            abstractC23811yMo69868b2 = ((AbstractC23804u0) AbstractC25265s.m74142p1(abstractC23811yMo69868b.mo69842X())).mo69868b();
                            AbstractC22676k.m65749i(abstractC23811yMo69868b2, "getType(...)");
                            if (interfaceC31135k instanceof InterfaceC31108b) {
                                interfaceC31108b = (InterfaceC31108b) interfaceC31135k;
                            } else {
                                interfaceC31108b = null;
                            }
                            if (interfaceC31108b != null) {
                                c35847eM13805c = AbstractC4393e.m13805c(interfaceC31108b);
                            } else {
                                c35847eM13805c = null;
                            }
                            if (AbstractC22676k.m65745e(c35847eM13805c, AbstractC17110d0.f65717a)) {
                                abstractC23763c0M69839m = m48355a(abstractC23763c0M69839m, abstractC23811yMo69868b2);
                            } else {
                                abstractC23763c0M69839m = m48355a(abstractC23763c0M69839m, abstractC23811yMo69868b2);
                            }
                        }
                    }
                } else if (size != 1) {
                    abstractC23763c0M69839m = null;
                } else {
                    InterfaceC23796q0 interfaceC23796q0Mo60496e2 = interfaceC23796q0M78683d.mo1783c().m83833w(size2).mo60496e();
                    AbstractC22676k.m65749i(interfaceC23796q0Mo60496e2, "getTypeConstructor(...)");
                    abstractC23763c0M69839m = AbstractC23791o.m69890i(listM74093D1, c23784k0M48357f, interfaceC23796q0Mo60496e2, z14);
                }
                if (abstractC23763c0M69839m == null) {
                    C26555l c26555l7 = C26555l.f105564a;
                    abstractC23763c0M69890i = C26555l.m78684e(EnumC26554k.INCONSISTENT_SUSPEND_FUNCTION, listM74093D1, interfaceC23796q0M78683d, new String[0]);
                } else {
                    abstractC23763c0M69890i = abstractC23763c0M69839m;
                }
            } else {
                abstractC23763c0M69890i = AbstractC23791o.m69890i(listM74093D1, c23784k0M48357f, interfaceC23796q0M78683d, proto.f123477E);
                if (AbstractC32330d.f133802b.mo91233e(proto.f123489Q).booleanValue()) {
                    abstractC23763c0M69839m = C23765d.m69839m(abstractC23763c0M69890i, true);
                    if (abstractC23763c0M69839m == null) {
                        throw new IllegalStateException(("null DefinitelyNotNullType for '" + abstractC23763c0M69890i + '\'').toString());
                    }
                    abstractC23763c0M69890i = abstractC23763c0M69839m;
                }
            }
        } else if (AbstractC32330d.f133801a.mo91233e(proto.f123489Q).booleanValue()) {
            z14 = proto.f123477E;
            size = interfaceC23796q0M78683d.getParameters().size() - listM74093D1.size();
            if (size == 0) {
                abstractC23763c0M69839m = AbstractC23791o.m69890i(listM74093D1, c23784k0M48357f, interfaceC23796q0M78683d, z14);
                if (AbstractC5583n.m16757Q(abstractC23763c0M69839m)) {
                    abstractC23763c0M69839m = null;
                } else {
                    interfaceC31126hMo1784d = abstractC23811yMo69868b.mo69844i0().mo1784d();
                    if (interfaceC31126hMo1784d != null) {
                        c35847eM13809g = AbstractC4393e.m13809g(interfaceC31126hMo1784d);
                    } else {
                        c35847eM13809g = null;
                    }
                    if (abstractC23811yMo69868b.mo69842X().size() == 1) {
                        abstractC23811yMo69868b2 = ((AbstractC23804u0) AbstractC25265s.m74142p1(abstractC23811yMo69868b.mo69842X())).mo69868b();
                        AbstractC22676k.m65749i(abstractC23811yMo69868b2, "getType(...)");
                        if (interfaceC31135k instanceof InterfaceC31108b) {
                            interfaceC31108b = (InterfaceC31108b) interfaceC31135k;
                        } else {
                            interfaceC31108b = null;
                        }
                        if (interfaceC31108b != null) {
                            c35847eM13805c = AbstractC4393e.m13805c(interfaceC31108b);
                        } else {
                            c35847eM13805c = null;
                        }
                        if (AbstractC22676k.m65745e(c35847eM13805c, AbstractC17110d0.f65717a)) {
                            abstractC23763c0M69839m = m48355a(abstractC23763c0M69839m, abstractC23811yMo69868b2);
                        } else {
                            abstractC23763c0M69839m = m48355a(abstractC23763c0M69839m, abstractC23811yMo69868b2);
                        }
                    }
                }
            } else if (size != 1) {
                abstractC23763c0M69839m = null;
            } else {
                InterfaceC23796q0 interfaceC23796q0Mo60496e3 = interfaceC23796q0M78683d.mo1783c().m83833w(size2).mo60496e();
                AbstractC22676k.m65749i(interfaceC23796q0Mo60496e3, "getTypeConstructor(...)");
                abstractC23763c0M69839m = AbstractC23791o.m69890i(listM74093D1, c23784k0M48357f, interfaceC23796q0Mo60496e3, z14);
            }
            if (abstractC23763c0M69839m == null) {
                C26555l c26555l8 = C26555l.f105564a;
                abstractC23763c0M69890i = C26555l.m78684e(EnumC26554k.INCONSISTENT_SUSPEND_FUNCTION, listM74093D1, interfaceC23796q0M78683d, new String[0]);
            } else {
                abstractC23763c0M69890i = abstractC23763c0M69839m;
            }
        } else {
            abstractC23763c0M69890i = AbstractC23791o.m69890i(listM74093D1, c23784k0M48357f, interfaceC23796q0M78683d, proto.f123477E);
            if (AbstractC32330d.f133802b.mo91233e(proto.f123489Q).booleanValue()) {
                abstractC23763c0M69839m = C23765d.m69839m(abstractC23763c0M69890i, true);
                if (abstractC23763c0M69839m == null) {
                    throw new IllegalStateException(("null DefinitelyNotNullType for '" + abstractC23763c0M69890i + '\'').toString());
                }
                abstractC23763c0M69890i = abstractC23763c0M69839m;
            }
        }
        c30171w0M60674c = AbstractC21598x.m60674c(proto, c32334h);
        if (c30171w0M60674c != null) {
            return AbstractC23791o.m69896o(abstractC23763c0M69890i, m48361d(c30171w0M60674c, false));
        }
        return abstractC23763c0M69890i;
    }

    /* JADX INFO: renamed from: g */
    public final AbstractC23811y m48362g(C30171w0 proto) {
        AbstractC22676k.m65750j(proto, "proto");
        if ((proto.f123494y & 2) != 2) {
            return m48361d(proto, true);
        }
        C17122k c17122k = this.f65728a;
        String string = c17122k.f65761b.getString(proto.f123478F);
        AbstractC23763c0 abstractC23763c0M48361d = m48361d(proto, true);
        C30171w0 c30171w0M60652H = AbstractC21598x.m60652H(proto, c17122k.f65763d);
        AbstractC22676k.m65747g(c30171w0M60652H);
        return c17122k.f65760a.f65744j.mo48369c(proto, string, abstractC23763c0M48361d, m48361d(c30171w0M60652H, true));
    }

    public final String toString() {
        String str;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f65730c);
        C17118h0 c17118h0 = this.f65729b;
        if (c17118h0 == null) {
            str = "";
        } else {
            str = ". Child of " + c17118h0.f65730c;
        }
        sb4.append(str);
        return sb4.toString();
    }
}
