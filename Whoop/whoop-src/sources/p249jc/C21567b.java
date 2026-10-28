package p249jc;

import al.AbstractC0954a;
import android.util.Log;
import androidx.room.C1774d;
import bb3.AbstractC2936c;
import bh3.InterfaceC3260g;
import cb3.AbstractC4393e;
import com.google.crypto.tink.internal.C5101l0;
import fa3.C14313g;
import fa3.EnumC14301a;
import ge3.AbstractC15751g;
import ha3.C17062e;
import ha3.C17063f;
import ha3.InterfaceC17058a;
import ia3.C18295a;
import io.sentry.config.AbstractC20301a;
import ja3.C21509f;
import ja3.C21513i;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import jh3.C21705f;
import ka3.C22309a;
import ka3.EnumC22310b;
import l83.C23465k;
import lb3.AbstractC23767d1;
import lb3.AbstractC23804u0;
import lb3.AbstractC23811y;
import lb3.C23806v0;
import lb3.EnumC23776g1;
import lg3.C24055q;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import na3.AbstractC26525l;
import na3.C26526m;
import na3.C26527n;
import na3.C26530q;
import ne3.C26611e0;
import ne3.C26616h;
import ne3.C26624l;
import o73.C27648a;
import oe3.AbstractC27883c;
import p000.AbstractC11266d;
import p000.C31931s;
import p108e4.AbstractC12667a;
import p283kl.C22553b;
import p283kl.C22558g;
import p325mb.InterfaceC25379a;
import p392p3.InterfaceC28785w;
import p408q.C29662f;
import p499t9.C33652u;
import p499t9.C33657z;
import p516u8.C34610p;
import p518ub.C34730c;
import p518ub.InterfaceC34728a;
import p518ub.InterfaceC34731d;
import p518ub.InterfaceC34732e;
import p549vb.C35864i;
import p577wa.C36977d;
import p586wk.C37330h;
import p586wk.InterfaceC37333k;
import p608xa.C38135a;
import p684zk.InterfaceC40801z;
import p692zt.C41113q;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p73.InterfaceC28961b;
import q83.InterfaceC30062i;
import qa.InterfaceC30105j;
import qa.InterfaceC30107l;
import r93.AbstractC31166y;
import r93.InterfaceC31107a1;
import r93.InterfaceC31108b;
import r93.InterfaceC31111c;
import r93.InterfaceC31117e;
import r93.InterfaceC31126h;
import r93.InterfaceC31135k;
import r93.InterfaceC31145n0;
import r93.InterfaceC31151q0;
import r93.InterfaceC31162w;
import r93.InterfaceC31165x0;
import s93.C32305g;
import s93.C32308j;
import s93.InterfaceC32307i;
import sa.C32323i;
import se.AbstractC32417h;
import tl.AbstractC33902a;
import to.InterfaceC33989o;
import u93.AbstractC34670d;
import u93.AbstractC34711x0;
import u93.C34689m0;
import u93.C34691n0;
import u93.C34709w0;
import ua.C34714a;
import va.C35838a;
import wb3.AbstractC37056f;
import x93.C38111d;
import xg3.InterfaceC38276c;
import xg3.InterfaceC38278e;
import xg3.InterfaceC38293t;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: jc.b */
/* JADX INFO: loaded from: classes.dex */
public final class C21567b implements InterfaceC25379a, InterfaceC3260g, InterfaceC37333k, InterfaceC30062i, InterfaceC28785w, InterfaceC30105j, InterfaceC28961b, InterfaceC33989o, InterfaceC34731d {

    /* JADX INFO: renamed from: x */
    public static C21567b f82709x;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f82710w;

    public /* synthetic */ C21567b(int i13) {
        this.f82710w = i13;
    }

    /* JADX INFO: renamed from: j */
    public static final int m60604j(int i13) {
        return (i13 & 2) != 0 ? i13 | 64 : i13;
    }

    /* JADX INFO: renamed from: k */
    public static AbstractC23804u0 m60605k(InterfaceC31165x0 interfaceC31165x0, C22309a typeAttr, C5101l0 typeParameterUpperBoundEraser, AbstractC23811y abstractC23811y) {
        AbstractC22676k.m65750j(typeAttr, "typeAttr");
        AbstractC22676k.m65750j(typeParameterUpperBoundEraser, "typeParameterUpperBoundEraser");
        if (!typeAttr.m64114g()) {
            typeAttr = typeAttr.m64116i(EnumC22310b.f87071w);
        }
        int iOrdinal = typeAttr.m64110c().ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2) {
                return new C23806v0(abstractC23811y, EnumC23776g1.INVARIANT);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!interfaceC31165x0.getVariance().f94155x) {
            return new C23806v0(AbstractC4393e.m13807e(interfaceC31165x0).m83827o(), EnumC23776g1.INVARIANT);
        }
        List parameters = abstractC23811y.mo69844i0().getParameters();
        AbstractC22676k.m65749i(parameters, "getParameters(...)");
        return !parameters.isEmpty() ? new C23806v0(abstractC23811y, EnumC23776g1.OUT_VARIANCE) : AbstractC23767d1.m69855k(interfaceC31165x0, typeAttr);
    }

    /* JADX INFO: renamed from: o */
    public static C26611e0 m60606o(String str, boolean z4) {
        AbstractC22676k.m65750j(str, "<this>");
        C26624l c26624l = AbstractC27883c.f112429a;
        C26616h c26616h = new C26616h();
        c26616h.m79232u1(str);
        return AbstractC27883c.m84157d(c26616h, z4);
    }

    /* JADX INFO: renamed from: p */
    public static C26611e0 m60607p(File file) {
        String str = C26611e0.f105848x;
        AbstractC22676k.m65750j(file, "<this>");
        String string = file.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return m60606o(string, false);
    }

    /* JADX INFO: renamed from: r */
    private final void m60608r(Object obj) {
    }

    @Override // p518ub.InterfaceC34731d
    /* JADX INFO: renamed from: a */
    public InterfaceC34732e mo60609a(C34730c c34730c) {
        return new C35864i(c34730c.f146271a, c34730c.f146272b, c34730c.f146273c, c34730c.f146274d, c34730c.f146275e);
    }

    @Override // p73.InterfaceC28961b
    public void accept(Object obj) {
    }

    @Override // bh3.InterfaceC3260g
    /* JADX INFO: renamed from: b */
    public Object mo1678b(Object obj) {
        switch (this.f82710w) {
            case 1:
                InterfaceC38278e interfaceC38278e = (InterfaceC38278e) obj;
                C21705f.f83334f.m61159c().getClass();
                return interfaceC38278e;
            case 2:
                InterfaceC38276c interfaceC38276c = (InterfaceC38276c) obj;
                C21705f.f83334f.m61157a().getClass();
                return interfaceC38276c;
            case 3:
                InterfaceC38293t interfaceC38293t = (InterfaceC38293t) obj;
                C21705f.f83334f.m61159c().getClass();
                return interfaceC38293t;
            case 4:
                InterfaceC38293t interfaceC38293t2 = (InterfaceC38293t) obj;
                C21705f.f83334f.m61161f().getClass();
                return interfaceC38293t2;
            default:
                Throwable th3 = (Throwable) obj;
                C21705f.f83334f.m61159c().getClass();
                return th3;
        }
    }

    @Override // p586wk.InterfaceC37325c
    /* JADX INFO: renamed from: c */
    public boolean mo2345c(Object obj, File file, C37330h c37330h) {
        try {
            AbstractC33902a.m107253c(((C22558g) ((C22553b) ((InterfaceC40801z) obj).get()).f88726w.f7566b).m65285a(), file);
            return true;
        } catch (IOException e5) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            Log.w("GifEncoder", "Failed to encode GIF drawable data", e5);
            return false;
        }
    }

    @Override // p325mb.InterfaceC25379a
    /* JADX INFO: renamed from: d */
    public void mo19644d(InterfaceC34728a db4) {
        AbstractC22676k.m65750j(db4, "db");
        db4.mo109660E("UPDATE WorkSpec SET `last_enqueue_time` = -1 WHERE `last_enqueue_time` = 0");
    }

    @Override // p586wk.InterfaceC37333k
    /* JADX INFO: renamed from: e */
    public int mo44992e(C37330h c37330h) {
        return 1;
    }

    @Override // qa.InterfaceC30105j
    /* JADX INFO: renamed from: g */
    public boolean mo60610g(C34610p c34610p) {
        String str = c34610p.f145783n;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    @Override // qa.InterfaceC30105j
    /* JADX INFO: renamed from: h */
    public InterfaceC30107l mo60611h(C34610p c34610p) {
        String str = c34610p.f145783n;
        List list = c34610p.f145786q;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new C32323i(list);
                case "application/pgs":
                    return new C29662f(11);
                case "application/x-mp4-vtt":
                    return new C33657z(1);
                case "text/vtt":
                    return new C33652u(11);
                case "application/x-quicktime-tx3g":
                    return new C38135a(list);
                case "text/x-ssa":
                    return new C34714a(list);
                case "application/vobsub":
                    return new C29662f(list);
                case "application/x-subrip":
                    return new C35838a();
                case "application/ttml+xml":
                    return new C36977d();
            }
        }
        throw new IllegalArgumentException(AbstractC11266d.m30461o("Unsupported MIME type: ", str));
    }

    @Override // qa.InterfaceC30105j
    /* JADX INFO: renamed from: i */
    public int mo60612i(C34610p c34610p) {
        String str = c34610p.f145783n;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                    return 1;
                case "application/vobsub":
                    return 2;
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new IllegalArgumentException(AbstractC11266d.m30461o("Unsupported MIME type: ", str));
    }

    /* JADX INFO: renamed from: l */
    public AbstractC23811y m60613l(InterfaceC17058a interfaceC17058a, InterfaceC31108b interfaceC31108b, boolean z4, C41113q c41113q, EnumC14301a enumC14301a, C26530q c26530q, boolean z13, Function1 function1) {
        C24055q c24055q = new C24055q(interfaceC31108b, z4, c41113q, enumC14301a);
        AbstractC23811y abstractC23811y = (AbstractC23811y) function1.invoke(interfaceC17058a);
        Collection collectionMo78673h = interfaceC17058a.mo78673h();
        AbstractC22676k.m65749i(collectionMo78673h, "getOverriddenDescriptors(...)");
        Collection<InterfaceC31111c> collection = collectionMo78673h;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(collection, 10));
        for (InterfaceC31111c interfaceC31111c : collection) {
            AbstractC22676k.m65747g(interfaceC31111c);
            arrayList.add((AbstractC23811y) function1.invoke(interfaceC31111c));
        }
        return m60614m(c24055q, abstractC23811y, arrayList, c26530q, z13);
    }

    /* JADX INFO: renamed from: m */
    public AbstractC23811y m60614m(C24055q c24055q, AbstractC23811y abstractC23811y, List list, C26530q c26530q, boolean z4) {
        C1774d c1774dM70968b = c24055q.m70968b(abstractC23811y, list, c26530q, z4);
        boolean zM70972i = c24055q.m70972i();
        AbstractC22676k.m65750j(abstractC23811y, "<this>");
        return C21565a.m60600k(abstractC23811y.mo69863p0(), c1774dM70968b, 0, zM70972i).m2223j();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:104:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:105:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:109:0x021f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0223  */
    /* JADX WARN: Code duplicated, block: B:112:0x0226  */
    /* JADX WARN: Code duplicated, block: B:114:0x022d  */
    /* JADX WARN: Code duplicated, block: B:116:0x0231  */
    /* JADX WARN: Code duplicated, block: B:119:0x0237  */
    /* JADX WARN: Code duplicated, block: B:120:0x023d  */
    /* JADX WARN: Code duplicated, block: B:123:0x025f  */
    /* JADX WARN: Code duplicated, block: B:125:0x0265  */
    /* JADX WARN: Code duplicated, block: B:126:0x0270  */
    /* JADX WARN: Code duplicated, block: B:128:0x0273  */
    /* JADX WARN: Code duplicated, block: B:130:0x0280  */
    /* JADX WARN: Code duplicated, block: B:133:0x028b  */
    /* JADX WARN: Code duplicated, block: B:136:0x0295  */
    /* JADX WARN: Code duplicated, block: B:141:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:142:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:144:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:145:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:147:0x02c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:150:0x02ce A[EDGE_INSN: B:150:0x02ce->B:159:0x02e9 BREAK  A[LOOP:2: B:152:0x02d5->B:198:?]] */
    /* JADX WARN: Code duplicated, block: B:151:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:154:0x02db  */
    /* JADX WARN: Code duplicated, block: B:156:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:157:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:160:0x02eb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:162:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:164:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:166:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:167:0x0300  */
    /* JADX WARN: Code duplicated, block: B:171:0x0316  */
    /* JADX WARN: Code duplicated, block: B:173:0x031e  */
    /* JADX WARN: Code duplicated, block: B:175:0x0322  */
    /* JADX WARN: Code duplicated, block: B:180:0x0342  */
    /* JADX WARN: Code duplicated, block: B:187:0x033a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x02ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x0335 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x0289 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x02ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:? A[LOOP:4: B:134:0x028f->B:204:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x016f  */
    /* JADX WARN: Code duplicated, block: B:96:0x01c5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [r93.b] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.lang.Object, r93.a1, r93.b] */
    /* JADX WARN: Type inference failed for: r25v0, types: [jc.b] */
    /* JADX WARN: Type inference failed for: r5v3, types: [r93.b, r93.c, r93.k] */
    /* JADX WARN: Type inference failed for: r5v4, types: [ha3.a] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX INFO: renamed from: n */
    public ArrayList m60615n(C41113q c3, Collection collection) {
        InterfaceC32307i annotations;
        AbstractC23811y type;
        C26526m c26526mM78600d;
        boolean z4;
        String str;
        ArrayList arrayList;
        String str2;
        ArrayList arrayList2;
        InterfaceC31145n0 interfaceC31145n0;
        boolean z13;
        EnumC14301a enumC14301a;
        C26530q c26530qM78599c;
        boolean z14;
        InterfaceC17058a interfaceC17058a;
        int i13;
        AbstractC23811y abstractC23811yM60613l;
        AbstractC23811y returnType;
        boolean z15;
        C23465k c23465k;
        ArrayList arrayList3;
        int i14;
        int i15;
        AbstractC23811y type2;
        InterfaceC31151q0 interfaceC31151q0Mo78667B;
        Iterator it;
        boolean z16;
        InterfaceC31151q0 interfaceC31151q0Mo78667B2;
        boolean zM69847c;
        List list;
        Iterator it3;
        AbstractC23811y type3;
        boolean z17;
        C26530q c26530q;
        C41113q c41113qM44462o;
        List listM78598b;
        String strM78597a;
        C34691n0 c34691n0;
        C26527n c26527n = C26527n.f105456E;
        AbstractC22676k.m65750j(c3, "c");
        Collection<??> collection2 = collection;
        int i16 = 10;
        ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(collection2, 10));
        for (?? Mo48174J : collection2) {
            if (!(Mo48174J instanceof InterfaceC17058a)) {
                i14 = i16;
            } else if (Mo48174J.getKind() == 2 && Mo48174J.mo78660a().mo78673h().size() == 1) {
                i14 = 10;
            } else {
                InterfaceC31126h interfaceC31126hM95883a = AbstractC31166y.m95883a(Mo48174J);
                if (interfaceC31126hM95883a == null) {
                    annotations = ((AbstractC0954a) Mo48174J).getAnnotations();
                } else {
                    C21513i c21513i = interfaceC31126hM95883a instanceof C21513i ? (C21513i) interfaceC31126hM95883a : null;
                    List list2 = c21513i != null ? (List) c21513i.f82510K.getValue() : null;
                    List list3 = list2;
                    if (list3 == null || list3.isEmpty()) {
                        annotations = ((AbstractC0954a) Mo48174J).getAnnotations();
                    } else {
                        List list4 = list2;
                        ArrayList arrayList5 = new ArrayList(AbstractC25267u.m74163i0(list4, i16));
                        Iterator it4 = list4.iterator();
                        while (it4.hasNext()) {
                            arrayList5.add(new C21509f((C38111d) it4.next(), c3, true));
                        }
                        ArrayList arrayListM74126d1 = AbstractC25265s.m74126d1(((AbstractC0954a) Mo48174J).getAnnotations(), arrayList5);
                        annotations = arrayListM74126d1.isEmpty() ? C32305g.f133684a : new C32308j(arrayListM74126d1, 0);
                    }
                }
                C41113q c41113qM44462o2 = AbstractC15751g.m44462o(c3, annotations);
                ?? r14 = (!(Mo48174J instanceof C17063f) || (c34691n0 = ((C34689m0) Mo48174J).f146128X) == null || c34691n0.f146084F) ? Mo48174J : c34691n0;
                if (Mo48174J.mo78667B() != null) {
                    InterfaceC31162w interfaceC31162w = r14 instanceof InterfaceC31162w ? (InterfaceC31162w) r14 : null;
                    InterfaceC31107a1 interfaceC31107a1 = interfaceC31162w != null ? (InterfaceC31107a1) interfaceC31162w.mo48190h0(C17062e.f65587g0) : null;
                    type = m60613l((InterfaceC17058a) Mo48174J, interfaceC31107a1, false, interfaceC31107a1 != null ? AbstractC15751g.m44462o(c41113qM44462o2, ((AbstractC0954a) interfaceC31107a1).getAnnotations()) : c41113qM44462o2, EnumC14301a.VALUE_PARAMETER, null, false, C26527n.f105457x);
                } else {
                    type = null;
                }
                C17062e c17062e = Mo48174J instanceof C17062e ? (C17062e) Mo48174J : null;
                if (c17062e != null) {
                    InterfaceC31135k interfaceC31135kMo60581g = c17062e.mo60581g();
                    AbstractC22676k.m65748h(interfaceC31135kMo60581g, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    String strM35446R = AbstractC12667a.m35446R((InterfaceC31117e) interfaceC31135kMo60581g, AbstractC20301a.m56347o(c17062e, 3));
                    if (strM35446R == null || (c26526mM78600d = (C26526m) AbstractC26525l.m78596a().get(strM35446R)) == null) {
                        c26526mM78600d = null;
                    } else {
                        if (c26526mM78600d.m78597a() != null && ((strM78597a = c26526mM78600d.m78597a()) == null || !AbstractC39421y.m125930O(strM78597a, "2.", false))) {
                            throw new IllegalStateException("Check failed.");
                        }
                        if (c26526mM78600d.m78597a() != null) {
                            c26526mM78600d = c26526mM78600d.m78600d();
                        }
                    }
                } else {
                    c26526mM78600d = null;
                }
                if (c26526mM78600d != null) {
                    c26526mM78600d.m78598b().size();
                    ((C17062e) Mo48174J).mo78676v().size();
                }
                if (AbstractC32417h.m101182M(((C18295a) c3.f177224x).f71244v)) {
                    z4 = AbstractC32417h.m101178I((InterfaceC17058a) Mo48174J);
                    List listMo78676v = r14.mo78676v();
                    str = "getValueParameters(...)";
                    AbstractC22676k.m65749i(listMo78676v, "getValueParameters(...)");
                    List<??> list5 = listMo78676v;
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(list5, i16));
                    for (?? r15 : list5) {
                        if (c26526mM78600d != null || (listM78598b = c26526mM78600d.m78598b()) == null) {
                            c26530q = null;
                        } else {
                            c26530q = (C26530q) AbstractC25265s.m74102I0(((C34709w0) r15).f146186G, listM78598b);
                        }
                        C31931s c31931s = new C31931s((Object) r15, 15);
                        ArrayList arrayList6 = arrayList;
                        InterfaceC17058a interfaceC17058a2 = (InterfaceC17058a) Mo48174J;
                        if (r15 != 0) {
                            c41113qM44462o = AbstractC15751g.m44462o(c41113qM44462o2, ((AbstractC0954a) r15).getAnnotations());
                        } else {
                            c41113qM44462o = c41113qM44462o2;
                        }
                        arrayList6.add(m60613l(interfaceC17058a2, r15, false, c41113qM44462o, EnumC14301a.VALUE_PARAMETER, c26530q, z4, c31931s));
                        str = str;
                        arrayList = arrayList6;
                    }
                    str2 = str;
                    arrayList2 = arrayList;
                    if (Mo48174J instanceof InterfaceC31145n0) {
                        interfaceC31145n0 = (InterfaceC31145n0) Mo48174J;
                    } else {
                        interfaceC31145n0 = null;
                    }
                    if (interfaceC31145n0 != null) {
                        z13 = true;
                        if (C27648a.m83565P(interfaceC31145n0)) {
                            enumC14301a = EnumC14301a.FIELD;
                        }
                        EnumC14301a enumC14301a2 = enumC14301a;
                        if (c26526mM78600d != null) {
                            c26530qM78599c = c26526mM78600d.m78599c();
                        } else {
                            c26530qM78599c = null;
                        }
                        z14 = z13;
                        interfaceC17058a = (InterfaceC17058a) Mo48174J;
                        i13 = 0;
                        abstractC23811yM60613l = m60613l(interfaceC17058a, r14, true, c41113qM44462o2, enumC14301a2, c26530qM78599c, false, C26527n.f105458y);
                        returnType = Mo48174J.getReturnType();
                        AbstractC22676k.m65747g(returnType);
                        if (AbstractC23767d1.m69847c(returnType, c26527n, null)) {
                            z15 = z14;
                        } else {
                            interfaceC31151q0Mo78667B2 = Mo48174J.mo78667B();
                            if (interfaceC31151q0Mo78667B2 != null) {
                                zM69847c = AbstractC23767d1.m69847c(((AbstractC34670d) interfaceC31151q0Mo78667B2).getType(), c26527n, null);
                            } else {
                                zM69847c = false;
                            }
                            if (zM69847c) {
                                z15 = z14;
                            } else {
                                List listMo78676v2 = Mo48174J.mo78676v();
                                AbstractC22676k.m65749i(listMo78676v2, str2);
                                list = listMo78676v2;
                                if (!(list instanceof Collection) && list.isEmpty()) {
                                    z17 = false;
                                    break;
                                }
                                it3 = list.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        z17 = false;
                                        break;
                                    }
                                    type3 = ((AbstractC34711x0) ((InterfaceC31107a1) it3.next())).getType();
                                    AbstractC22676k.m65749i(type3, "getType(...)");
                                    if (AbstractC23767d1.m69847c(type3, c26527n, null)) {
                                        z17 = z14;
                                        break;
                                    }
                                }
                                if (z17) {
                                    z15 = z14;
                                } else {
                                    z15 = false;
                                }
                            }
                        }
                        if (z15) {
                            c23465k = new C23465k(AbstractC2936c.f11822a, new C14313g(interfaceC17058a));
                        } else {
                            c23465k = null;
                        }
                        if (type == null && abstractC23811yM60613l == null) {
                            if (arrayList2.isEmpty()) {
                                z14 = false;
                                break;
                            }
                            it = arrayList2.iterator();
                            do {
                                if (it.hasNext()) {
                                    z14 = false;
                                    break;
                                }
                                if (((AbstractC23811y) it.next()) != null) {
                                    z16 = z14;
                                } else {
                                    z16 = false;
                                }
                            } while (!z16);
                            if (z14 && c23465k == null) {
                                i14 = 10;
                            }
                        }
                        if (type == null) {
                            interfaceC31151q0Mo78667B = Mo48174J.mo78667B();
                            if (interfaceC31151q0Mo78667B != null) {
                                type = ((AbstractC34670d) interfaceC31151q0Mo78667B).getType();
                            } else {
                                type = null;
                            }
                        }
                        i14 = 10;
                        arrayList3 = new ArrayList(AbstractC25267u.m74163i0(arrayList2, 10));
                        for (Object obj : arrayList2) {
                            i15 = i13 + 1;
                            if (i13 >= 0) {
                                AbstractC37056f.m118977d0();
                                throw null;
                            }
                            type2 = (AbstractC23811y) obj;
                            if (type2 == null) {
                                type2 = ((AbstractC34711x0) ((InterfaceC31107a1) Mo48174J.mo78676v().get(i13))).getType();
                                AbstractC22676k.m65749i(type2, "getType(...)");
                            }
                            arrayList3.add(type2);
                            i13 = i15;
                        }
                        if (abstractC23811yM60613l == null) {
                            abstractC23811yM60613l = Mo48174J.getReturnType();
                            AbstractC22676k.m65747g(abstractC23811yM60613l);
                        }
                        Mo48174J = interfaceC17058a.mo48174J(type, arrayList3, abstractC23811yM60613l, c23465k);
                    } else {
                        z13 = true;
                    }
                    enumC14301a = EnumC14301a.METHOD_RETURN_TYPE;
                    EnumC14301a enumC14301a3 = enumC14301a;
                    if (c26526mM78600d != null) {
                        c26530qM78599c = c26526mM78600d.m78599c();
                    } else {
                        c26530qM78599c = null;
                    }
                    z14 = z13;
                    interfaceC17058a = (InterfaceC17058a) Mo48174J;
                    i13 = 0;
                    abstractC23811yM60613l = m60613l(interfaceC17058a, r14, true, c41113qM44462o2, enumC14301a3, c26530qM78599c, false, C26527n.f105458y);
                    returnType = Mo48174J.getReturnType();
                    AbstractC22676k.m65747g(returnType);
                    if (AbstractC23767d1.m69847c(returnType, c26527n, null)) {
                        z15 = z14;
                    } else {
                        interfaceC31151q0Mo78667B2 = Mo48174J.mo78667B();
                        if (interfaceC31151q0Mo78667B2 != null) {
                            zM69847c = AbstractC23767d1.m69847c(((AbstractC34670d) interfaceC31151q0Mo78667B2).getType(), c26527n, null);
                        } else {
                            zM69847c = false;
                        }
                        if (zM69847c) {
                            List listMo78676v3 = Mo48174J.mo78676v();
                            AbstractC22676k.m65749i(listMo78676v3, str2);
                            list = listMo78676v3;
                            if (!(list instanceof Collection)) {
                                it3 = list.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        z17 = false;
                                        break;
                                    }
                                    type3 = ((AbstractC34711x0) ((InterfaceC31107a1) it3.next())).getType();
                                    AbstractC22676k.m65749i(type3, "getType(...)");
                                    if (AbstractC23767d1.m69847c(type3, c26527n, null)) {
                                        z17 = z14;
                                        break;
                                    }
                                }
                            } else {
                                it3 = list.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        z17 = false;
                                        break;
                                    }
                                    type3 = ((AbstractC34711x0) ((InterfaceC31107a1) it3.next())).getType();
                                    AbstractC22676k.m65749i(type3, "getType(...)");
                                    if (AbstractC23767d1.m69847c(type3, c26527n, null)) {
                                        z17 = z14;
                                        break;
                                    }
                                }
                            }
                            if (z17) {
                                z15 = z14;
                            } else {
                                z15 = false;
                            }
                        } else {
                            z15 = z14;
                        }
                    }
                    if (z15) {
                        c23465k = new C23465k(AbstractC2936c.f11822a, new C14313g(interfaceC17058a));
                    } else {
                        c23465k = null;
                    }
                    if (type == null) {
                        if (arrayList2.isEmpty()) {
                            z14 = false;
                            break;
                        }
                        it = arrayList2.iterator();
                        do {
                            if (it.hasNext()) {
                                z14 = false;
                                break;
                            }
                            if (((AbstractC23811y) it.next()) != null) {
                                z16 = z14;
                            } else {
                                z16 = false;
                            }
                        } while (!z16);
                        if (z14) {
                        }
                    }
                    if (type == null) {
                        interfaceC31151q0Mo78667B = Mo48174J.mo78667B();
                        if (interfaceC31151q0Mo78667B != null) {
                            type = ((AbstractC34670d) interfaceC31151q0Mo78667B).getType();
                        } else {
                            type = null;
                        }
                    }
                    i14 = 10;
                    arrayList3 = new ArrayList(AbstractC25267u.m74163i0(arrayList2, 10));
                    while (r7.hasNext()) {
                        i15 = i13 + 1;
                        if (i13 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        type2 = (AbstractC23811y) obj;
                        if (type2 == null) {
                            type2 = ((AbstractC34711x0) ((InterfaceC31107a1) Mo48174J.mo78676v().get(i13))).getType();
                            AbstractC22676k.m65749i(type2, "getType(...)");
                        }
                        arrayList3.add(type2);
                        i13 = i15;
                    }
                    if (abstractC23811yM60613l == null) {
                        abstractC23811yM60613l = Mo48174J.getReturnType();
                        AbstractC22676k.m65747g(abstractC23811yM60613l);
                    }
                    Mo48174J = interfaceC17058a.mo48174J(type, arrayList3, abstractC23811yM60613l, c23465k);
                } else {
                    ((C18295a) c41113qM44462o2.f177224x).f71242t.getClass();
                }
                List listMo78676v4 = r14.mo78676v();
                str = "getValueParameters(...)";
                AbstractC22676k.m65749i(listMo78676v4, "getValueParameters(...)");
                List<??> list6 = listMo78676v4;
                arrayList = new ArrayList(AbstractC25267u.m74163i0(list6, i16));
                while (r10.hasNext()) {
                    if (c26526mM78600d != null) {
                        c26530q = null;
                    } else {
                        c26530q = null;
                    }
                    C31931s c31931s2 = new C31931s((Object) r15, 15);
                    ArrayList arrayList7 = arrayList;
                    InterfaceC17058a interfaceC17058a3 = (InterfaceC17058a) Mo48174J;
                    if (r15 != 0) {
                        c41113qM44462o = AbstractC15751g.m44462o(c41113qM44462o2, ((AbstractC0954a) r15).getAnnotations());
                    } else {
                        c41113qM44462o = c41113qM44462o2;
                    }
                    arrayList7.add(m60613l(interfaceC17058a3, r15, false, c41113qM44462o, EnumC14301a.VALUE_PARAMETER, c26530q, z4, c31931s2));
                    str = str;
                    arrayList = arrayList7;
                }
                str2 = str;
                arrayList2 = arrayList;
                if (Mo48174J instanceof InterfaceC31145n0) {
                    interfaceC31145n0 = (InterfaceC31145n0) Mo48174J;
                } else {
                    interfaceC31145n0 = null;
                }
                if (interfaceC31145n0 != null) {
                    z13 = true;
                    if (C27648a.m83565P(interfaceC31145n0)) {
                        enumC14301a = EnumC14301a.FIELD;
                    }
                    EnumC14301a enumC14301a4 = enumC14301a;
                    if (c26526mM78600d != null) {
                        c26530qM78599c = c26526mM78600d.m78599c();
                    } else {
                        c26530qM78599c = null;
                    }
                    z14 = z13;
                    interfaceC17058a = (InterfaceC17058a) Mo48174J;
                    i13 = 0;
                    abstractC23811yM60613l = m60613l(interfaceC17058a, r14, true, c41113qM44462o2, enumC14301a4, c26530qM78599c, false, C26527n.f105458y);
                    returnType = Mo48174J.getReturnType();
                    AbstractC22676k.m65747g(returnType);
                    if (AbstractC23767d1.m69847c(returnType, c26527n, null)) {
                        z15 = z14;
                    } else {
                        interfaceC31151q0Mo78667B2 = Mo48174J.mo78667B();
                        if (interfaceC31151q0Mo78667B2 != null) {
                            zM69847c = AbstractC23767d1.m69847c(((AbstractC34670d) interfaceC31151q0Mo78667B2).getType(), c26527n, null);
                        } else {
                            zM69847c = false;
                        }
                        if (zM69847c) {
                            List listMo78676v5 = Mo48174J.mo78676v();
                            AbstractC22676k.m65749i(listMo78676v5, str2);
                            list = listMo78676v5;
                            if (!(list instanceof Collection)) {
                                it3 = list.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        z17 = false;
                                        break;
                                    }
                                    type3 = ((AbstractC34711x0) ((InterfaceC31107a1) it3.next())).getType();
                                    AbstractC22676k.m65749i(type3, "getType(...)");
                                    if (AbstractC23767d1.m69847c(type3, c26527n, null)) {
                                        z17 = z14;
                                        break;
                                    }
                                }
                            } else {
                                it3 = list.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        z17 = false;
                                        break;
                                    }
                                    type3 = ((AbstractC34711x0) ((InterfaceC31107a1) it3.next())).getType();
                                    AbstractC22676k.m65749i(type3, "getType(...)");
                                    if (AbstractC23767d1.m69847c(type3, c26527n, null)) {
                                        z17 = z14;
                                        break;
                                    }
                                }
                            }
                            if (z17) {
                                z15 = z14;
                            } else {
                                z15 = false;
                            }
                        } else {
                            z15 = z14;
                        }
                    }
                    if (z15) {
                        c23465k = new C23465k(AbstractC2936c.f11822a, new C14313g(interfaceC17058a));
                    } else {
                        c23465k = null;
                    }
                    if (type == null) {
                        if (arrayList2.isEmpty()) {
                            z14 = false;
                            break;
                        }
                        it = arrayList2.iterator();
                        do {
                            if (it.hasNext()) {
                                z14 = false;
                                break;
                            }
                            if (((AbstractC23811y) it.next()) != null) {
                                z16 = z14;
                            } else {
                                z16 = false;
                            }
                        } while (!z16);
                        if (z14) {
                        }
                    }
                    if (type == null) {
                        interfaceC31151q0Mo78667B = Mo48174J.mo78667B();
                        if (interfaceC31151q0Mo78667B != null) {
                            type = ((AbstractC34670d) interfaceC31151q0Mo78667B).getType();
                        } else {
                            type = null;
                        }
                    }
                    i14 = 10;
                    arrayList3 = new ArrayList(AbstractC25267u.m74163i0(arrayList2, 10));
                    while (r7.hasNext()) {
                        i15 = i13 + 1;
                        if (i13 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        type2 = (AbstractC23811y) obj;
                        if (type2 == null) {
                            type2 = ((AbstractC34711x0) ((InterfaceC31107a1) Mo48174J.mo78676v().get(i13))).getType();
                            AbstractC22676k.m65749i(type2, "getType(...)");
                        }
                        arrayList3.add(type2);
                        i13 = i15;
                    }
                    if (abstractC23811yM60613l == null) {
                        abstractC23811yM60613l = Mo48174J.getReturnType();
                        AbstractC22676k.m65747g(abstractC23811yM60613l);
                    }
                    Mo48174J = interfaceC17058a.mo48174J(type, arrayList3, abstractC23811yM60613l, c23465k);
                } else {
                    z13 = true;
                }
                enumC14301a = EnumC14301a.METHOD_RETURN_TYPE;
                EnumC14301a enumC14301a5 = enumC14301a;
                if (c26526mM78600d != null) {
                    c26530qM78599c = c26526mM78600d.m78599c();
                } else {
                    c26530qM78599c = null;
                }
                z14 = z13;
                interfaceC17058a = (InterfaceC17058a) Mo48174J;
                i13 = 0;
                abstractC23811yM60613l = m60613l(interfaceC17058a, r14, true, c41113qM44462o2, enumC14301a5, c26530qM78599c, false, C26527n.f105458y);
                returnType = Mo48174J.getReturnType();
                AbstractC22676k.m65747g(returnType);
                if (AbstractC23767d1.m69847c(returnType, c26527n, null)) {
                    z15 = z14;
                } else {
                    interfaceC31151q0Mo78667B2 = Mo48174J.mo78667B();
                    if (interfaceC31151q0Mo78667B2 != null) {
                        zM69847c = AbstractC23767d1.m69847c(((AbstractC34670d) interfaceC31151q0Mo78667B2).getType(), c26527n, null);
                    } else {
                        zM69847c = false;
                    }
                    if (zM69847c) {
                        List listMo78676v6 = Mo48174J.mo78676v();
                        AbstractC22676k.m65749i(listMo78676v6, str2);
                        list = listMo78676v6;
                        if (!(list instanceof Collection)) {
                            it3 = list.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    z17 = false;
                                    break;
                                }
                                type3 = ((AbstractC34711x0) ((InterfaceC31107a1) it3.next())).getType();
                                AbstractC22676k.m65749i(type3, "getType(...)");
                                if (AbstractC23767d1.m69847c(type3, c26527n, null)) {
                                    z17 = z14;
                                    break;
                                }
                            }
                        } else {
                            it3 = list.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    z17 = false;
                                    break;
                                }
                                type3 = ((AbstractC34711x0) ((InterfaceC31107a1) it3.next())).getType();
                                AbstractC22676k.m65749i(type3, "getType(...)");
                                if (AbstractC23767d1.m69847c(type3, c26527n, null)) {
                                    z17 = z14;
                                    break;
                                }
                            }
                        }
                        if (z17) {
                            z15 = z14;
                        } else {
                            z15 = false;
                        }
                    } else {
                        z15 = z14;
                    }
                }
                if (z15) {
                    c23465k = new C23465k(AbstractC2936c.f11822a, new C14313g(interfaceC17058a));
                } else {
                    c23465k = null;
                }
                if (type == null) {
                    if (arrayList2.isEmpty()) {
                        z14 = false;
                        break;
                    }
                    it = arrayList2.iterator();
                    do {
                        if (it.hasNext()) {
                            z14 = false;
                            break;
                        }
                        if (((AbstractC23811y) it.next()) != null) {
                            z16 = z14;
                        } else {
                            z16 = false;
                        }
                    } while (!z16);
                    if (z14) {
                    }
                }
                if (type == null) {
                    interfaceC31151q0Mo78667B = Mo48174J.mo78667B();
                    if (interfaceC31151q0Mo78667B != null) {
                        type = ((AbstractC34670d) interfaceC31151q0Mo78667B).getType();
                    } else {
                        type = null;
                    }
                }
                i14 = 10;
                arrayList3 = new ArrayList(AbstractC25267u.m74163i0(arrayList2, 10));
                while (r7.hasNext()) {
                    i15 = i13 + 1;
                    if (i13 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    type2 = (AbstractC23811y) obj;
                    if (type2 == null) {
                        type2 = ((AbstractC34711x0) ((InterfaceC31107a1) Mo48174J.mo78676v().get(i13))).getType();
                        AbstractC22676k.m65749i(type2, "getType(...)");
                    }
                    arrayList3.add(type2);
                    i13 = i15;
                }
                if (abstractC23811yM60613l == null) {
                    abstractC23811yM60613l = Mo48174J.getReturnType();
                    AbstractC22676k.m65747g(abstractC23811yM60613l);
                }
                Mo48174J = interfaceC17058a.mo48174J(type, arrayList3, abstractC23811yM60613l, c23465k);
            }
            arrayList4.add(Mo48174J);
            i16 = i14;
        }
        return arrayList4;
    }

    /* JADX INFO: renamed from: q */
    public int m60616q(int i13) {
        return i13 == 7 ? 6 : 3;
    }

    public String toString() {
        switch (this.f82710w) {
            case 21:
                return "EmptyConsumer";
            default:
                return super.toString();
        }
    }

    public C21567b(C21565a c21565a) {
        this.f82710w = 11;
    }
}
