package p000;

import android.graphics.BitmapFactory;
import androidx.health.platform.client.proto.C1533u;
import dc3.C11935t;
import dc3.InterfaceC11936u;
import fa3.AbstractC14314g0;
import fa3.C14303b;
import fa3.C14327t;
import ga3.C15623a;
import hb3.C17118h0;
import ia3.C18295a;
import io.sentry.android.replay.video.C20245d;
import io.sentry.config.AbstractC20301a;
import j93.InterfaceC21461d;
import ja3.C21499a;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import ka3.C22316h;
import l83.C23454a0;
import lb3.AbstractC23773f1;
import lb3.AbstractC23791o;
import lb3.AbstractC23811y;
import lb3.C23784k0;
import lb3.C23809x;
import lb3.EnumC23776g1;
import lb3.InterfaceC23796q0;
import lg3.C24055q;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import mb3.AbstractC25390g;
import mb3.C25389f;
import mb3.C25396m;
import na3.C26515b;
import no.nordicsemi.android.ble.AbstractC26907m0;
import o93.AbstractC27736h;
import o93.EnumC27738j;
import ob3.InterfaceC27797g;
import ob3.InterfaceC27801k;
import ob3.InterfaceC27802l;
import ob3.InterfaceC27803m;
import p097ds.C12320w;
import p133f1.C13988w0;
import p194hg.C17250k;
import p194hg.InterfaceC17244e;
import p208i2.C17896l0;
import p249jc.AbstractC21598x;
import p477s2.C32071c;
import p505ts.AbstractC34132o;
import p510u0.AbstractC34339n0;
import p510u0.C34346p1;
import p510u0.C34354s0;
import p510u0.EnumC34330k0;
import p512u2.C34479y;
import p520ud.AbstractC34786g;
import p520ud.C34782c;
import p550vd.C35901d;
import p581we.C37199o;
import p605x6.C37999d;
import p635y2.AbstractC39125q1;
import p635y2.InterfaceC39147y;
import p692zt.C41113q;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o;
import qa3.C30171w0;
import r80.AbstractC31061c;
import r93.InterfaceC31107a1;
import r93.InterfaceC31109b0;
import r93.InterfaceC31111c;
import r93.InterfaceC31126h;
import r93.InterfaceC31165x0;
import u93.AbstractC34676g;
import u93.AbstractC34711x0;
import u93.C34697q0;
import u93.C34709w0;
import va3.C35847e;
import va3.C35850h;
import x93.AbstractC38106a0;
import x93.AbstractC38126r;
import x93.C38110c0;
import x93.C38122n;
import x93.C38124p;
import x93.C38131w;
import z93.EnumC40212c;
import zd3.C40571o;

/* JADX INFO: renamed from: s */
/* JADX INFO: loaded from: classes9.dex */
public final class C31931s implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f132624w;

    /* JADX INFO: renamed from: x */
    public Object f132625x;

    public /* synthetic */ C31931s() {
        this.f132624w = 22;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0039  */
    /* JADX WARN: Code duplicated, block: B:165:0x036b  */
    /* JADX WARN: Code duplicated, block: B:168:0x0379  */
    /* JADX WARN: Code duplicated, block: B:19:0x0053  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object[] objArr;
        boolean zIsEmpty;
        C35847e c35847eM122102c;
        InterfaceC27802l interfaceC27802lMo74538N;
        boolean zEquals;
        boolean z4 = false;
        C23809x c23809x = null;
        switch (this.f132624w) {
            case 0:
                ((List) this.f132625x).get(((Number) obj).intValue());
                return null;
            case 1:
                EnumC27738j enumC27738j = (EnumC27738j) this.f132625x;
                InterfaceC31109b0 it = (InterfaceC31109b0) obj;
                AbstractC22676k.m65750j(it, "it");
                return it.mo78661c().m83830r(enumC27738j);
            case 2:
                AbstractC23811y abstractC23811y = (AbstractC23811y) this.f132625x;
                AbstractC22676k.m65750j((InterfaceC31109b0) obj, "it");
                return abstractC23811y;
            case 3:
                if (AbstractC34339n0.f144245a.m108671b(((C32071c) obj).f133019a) == EnumC34330k0.COPY) {
                    ((C13988w0) this.f132625x).m39798c();
                    z4 = true;
                }
                return Boolean.valueOf(z4);
            case 4:
                C34697q0 c34697q0 = (C34697q0) this.f132625x;
                AbstractC22676k.m65750j((InterfaceC31111c) obj, "it");
                return Boolean.valueOf(AbstractC14314g0.f52269i.containsKey(AbstractC20301a.m56348p(c34697q0)));
            case 5:
                InterfaceC31111c interfaceC31111c = (InterfaceC31111c) obj;
                if (interfaceC31111c == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'descriptor' of kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1.invoke must not be null");
                }
                ((C15623a) this.f132625x).f58648b.mo48367a(interfaceC31111c);
                return C23454a0.f92919a;
            case 6:
                ((C12320w) this.f132625x).cancel(false);
                return C23454a0.f92919a;
            case 7:
                C17118h0 c17118h0 = (C17118h0) this.f132625x;
                C30171w0 it3 = (C30171w0) obj;
                AbstractC22676k.m65750j(it3, "it");
                return AbstractC21598x.m60679f0(it3, c17118h0.f65728a.f65763d);
            case 8:
                C21499a c21499a = (C21499a) this.f132625x;
                C38131w m10 = (C38131w) obj;
                AbstractC22676k.m65750j(m10, "m");
                if (((Boolean) c21499a.f82459b.invoke(m10)).booleanValue()) {
                    if (m10.m122118b().f163232a.isInterface()) {
                        String strM113817b = m10.m122119d().m113817b();
                        int iHashCode = strM113817b.hashCode();
                        if (iHashCode != -1776922004) {
                            if (iHashCode != -1295482945) {
                                if (iHashCode == 147696667 && strM113817b.equals("hashCode")) {
                                    zIsEmpty = ((ArrayList) m10.m122128m()).isEmpty();
                                }
                            } else if (strM113817b.equals("equals")) {
                                C38110c0 c38110c0 = (C38110c0) AbstractC25265s.m74146r1(m10.m122128m());
                                AbstractC38106a0 abstractC38106a0 = c38110c0 != null ? c38110c0.f163215a : null;
                                C38124p c38124p = abstractC38106a0 instanceof C38124p ? (C38124p) abstractC38106a0 : null;
                                if (c38124p != null) {
                                    AbstractC38126r abstractC38126r = c38124p.f163235b;
                                    if ((abstractC38126r instanceof C38122n) && (c35847eM122102c = ((C38122n) abstractC38126r).m122102c()) != null && AbstractC22676k.m65745e(c35847eM122102c.f152613a.f152616a, "java.lang.Object")) {
                                        zIsEmpty = true;
                                    }
                                }
                            }
                            zIsEmpty = false;
                        } else if (strM113817b.equals("toString")) {
                            zIsEmpty = ((ArrayList) m10.m122128m()).isEmpty();
                        } else {
                            zIsEmpty = false;
                        }
                        if (zIsEmpty) {
                            objArr = true;
                        } else {
                            objArr = false;
                        }
                    } else {
                        objArr = false;
                    }
                    if (objArr == false) {
                        z4 = true;
                    }
                }
                return Boolean.valueOf(z4);
            case 9:
                C35850h c35850h = (C35850h) this.f132625x;
                InterfaceC22712o it4 = (InterfaceC22712o) obj;
                AbstractC22676k.m65750j(it4, "it");
                return it4.getContributedVariables(c35850h, EnumC40212c.f173632E);
            case 10:
                return Boolean.valueOf(AbstractC22676k.m65745e((InterfaceC21461d) obj, (InterfaceC21461d) this.f132625x));
            case 11:
                C23809x c23809x2 = (C23809x) this.f132625x;
                C25389f kotlinTypeRefiner = (C25389f) obj;
                AbstractC22676k.m65750j(kotlinTypeRefiner, "kotlinTypeRefiner");
                LinkedHashSet linkedHashSet = c23809x2.f94205x;
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(linkedHashSet, 10));
                Iterator it5 = linkedHashSet.iterator();
                while (it5.hasNext()) {
                    arrayList.add(((AbstractC23811y) it5.next()).mo64124m0(kotlinTypeRefiner));
                    z4 = true;
                }
                if (z4) {
                    AbstractC23811y abstractC23811y2 = c23809x2.f94204w;
                    AbstractC23811y abstractC23811yMo64124m0 = abstractC23811y2 != null ? abstractC23811y2.mo64124m0(kotlinTypeRefiner) : null;
                    arrayList.isEmpty();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList);
                    linkedHashSet2.hashCode();
                    C23809x c23809x3 = new C23809x(linkedHashSet2);
                    c23809x3.f94204w = abstractC23811yMo64124m0;
                    c23809x = c23809x3;
                }
                if (c23809x != null) {
                    c23809x2 = c23809x;
                }
                return c23809x2.m69912a();
            case 12:
                InterfaceC23796q0 interfaceC23796q0 = (InterfaceC23796q0) this.f132625x;
                AbstractC22676k.m65750j((C25389f) obj, "kotlinTypeRefiner");
                interfaceC23796q0.mo1784d();
                return null;
            case 13:
                try {
                    ((InputStream) this.f132625x).close();
                    break;
                } catch (Throwable th3) {
                    AbstractC34132o.m107888l(th3);
                }
                return C23454a0.f92919a;
            case 14:
                C24055q c24055q = (C24055q) this.f132625x;
                C25396m c25396m = C25396m.f99492w;
                C26515b it6 = (C26515b) obj;
                AbstractC22676k.m65750j(it6, "it");
                C14327t c14327t = it6.f105423b;
                InterfaceC27797g receiver = it6.f105422a;
                if (c24055q.f95069c && receiver != null) {
                    AbstractC22676k.m65750j(receiver, "$receiver");
                    if (!(receiver instanceof AbstractC23811y)) {
                        StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                        sb4.append(receiver);
                        sb4.append(", ");
                        throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, receiver.getClass(), sb4).toString());
                    }
                    if (receiver instanceof C22316h) {
                        return null;
                    }
                }
                if (receiver == null || (interfaceC27802lMo74538N = c25396m.mo74538N(receiver)) == null) {
                    return null;
                }
                List listM74507p = AbstractC25390g.m74507p(interfaceC27802lMo74538N);
                List listM74505n = AbstractC25390g.m74505n(receiver);
                Iterator it7 = listM74507p.iterator();
                Iterator it8 = listM74505n.iterator();
                ArrayList arrayList2 = new ArrayList(Math.min(AbstractC25267u.m74163i0(listM74507p, 10), AbstractC25267u.m74163i0(listM74505n, 10)));
                while (it7.hasNext() && it8.hasNext()) {
                    InterfaceC27803m interfaceC27803m = (InterfaceC27803m) it7.next();
                    AbstractC23773f1 abstractC23773f1M74509r = AbstractC25390g.m74509r(c25396m, (InterfaceC27801k) it8.next());
                    arrayList2.add(abstractC23773f1M74509r == null ? new C26515b(null, c14327t, interfaceC27803m) : new C26515b(abstractC23773f1M74509r, C14303b.m40908b(((C18295a) ((C41113q) c24055q.f95071e).f177224x).f71239q, c14327t, abstractC23773f1M74509r.getAnnotations()), interfaceC27803m));
                }
                return arrayList2;
            case 15:
                InterfaceC31107a1 interfaceC31107a1 = (InterfaceC31107a1) this.f132625x;
                InterfaceC31111c it9 = (InterfaceC31111c) obj;
                AbstractC22676k.m65750j(it9, "it");
                AbstractC23811y type = ((AbstractC34711x0) ((InterfaceC31107a1) it9.mo78676v().get(((C34709w0) interfaceC31107a1).f146186G))).getType();
                AbstractC22676k.m65749i(type, "getType(...)");
                return type;
            case 16:
                ((C11935t) ((InterfaceC11936u) this.f132625x)).mo32218s(null);
                return C23454a0.f92919a;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                ((AbstractC26907m0) this.f132625x).mo80353l();
                return C23454a0.f92919a;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                C37199o c37199o = (C37199o) this.f132625x;
                AbstractC22676k.m65750j((String) obj, "it");
                return Integer.valueOf(((AtomicInteger) c37199o.f159041x).getAndIncrement());
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                AbstractC27736h abstractC27736h = (AbstractC27736h) this.f132625x;
                InterfaceC31109b0 module = (InterfaceC31109b0) obj;
                AbstractC22676k.m65750j(module, "module");
                AbstractC27736h abstractC27736hMo78661c = module.mo78661c();
                EnumC23776g1 enumC23776g1 = EnumC23776g1.INVARIANT;
                return abstractC27736hMo78661c.m83820h(abstractC27736h.m83832v());
            case 20:
                InterfaceC39147y interfaceC39147y = (InterfaceC39147y) obj;
                C34346p1 c34346p1M108662d = ((C34354s0) this.f132625x).m108662d();
                if (c34346p1M108662d != null) {
                    c34346p1M108662d.f144284c = interfaceC39147y;
                }
                return C23454a0.f92919a;
            case 21:
                float[] fArr = ((C17896l0) obj).f69598a;
                InterfaceC39147y interfaceC39147y2 = (InterfaceC39147y) this.f132625x;
                if (interfaceC39147y2.mo3532g()) {
                    AbstractC39125q1.m124662h(interfaceC39147y2).mo3521Y(interfaceC39147y2, fArr);
                }
                return C23454a0.f92919a;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C34479y c34479y = (C34479y) this.f132625x;
                if (c34479y != null) {
                    c34479y.f144852y = zBooleanValue;
                }
                return C23454a0.f92919a;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                AbstractC34676g abstractC34676g = (AbstractC34676g) this.f132625x;
                AbstractC23773f1 abstractC23773f1 = (AbstractC23773f1) obj;
                AbstractC22676k.m65747g(abstractC23773f1);
                if (!AbstractC23791o.m69886e(abstractC23773f1)) {
                    InterfaceC31126h interfaceC31126hMo1784d = abstractC23773f1.mo69844i0().mo1784d();
                    if ((interfaceC31126hMo1784d instanceof InterfaceC31165x0) && !AbstractC22676k.m65745e(((InterfaceC31165x0) interfaceC31126hMo1784d).mo60581g(), abstractC34676g)) {
                        z4 = true;
                    }
                }
                return Boolean.valueOf(z4);
            case 24:
                ((C20245d) this.f132625x).m56167j();
                return C23454a0.f92919a;
            case 25:
                InterfaceC17244e listField = (InterfaceC17244e) obj;
                AbstractC22676k.m65750j(listField, "$this$listField");
                Iterator it10 = ((C34782c) this.f132625x).f146465b.iterator();
                while (it10.hasNext()) {
                    listField.mo48822j(new C17250k((AbstractC34786g) it10.next(), C35901d.f152837w));
                }
                return C23454a0.f92919a;
            case 26:
                ((C40571o) this.f132625x).cancel();
                return C23454a0.f92919a;
            case 27:
                C37999d c37999d = (C37999d) this.f132625x;
                synchronized (c37999d.f162781z) {
                    c37999d.f162775E = 5;
                    c37999d.f162777G = null;
                }
                return C23454a0.f92919a;
            default:
                C38122n c38122n = (C38122n) this.f132625x;
                Method method = (Method) obj;
                if (!method.isSynthetic()) {
                    if (c38122n.f163232a.isEnum()) {
                        String name = method.getName();
                        if (AbstractC22676k.m65745e(name, "values")) {
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            AbstractC22676k.m65749i(parameterTypes, "getParameterTypes(...)");
                            if (parameterTypes.length == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (AbstractC22676k.m65745e(name, "valueOf")) {
                            zEquals = Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
                        } else {
                            zEquals = false;
                        }
                        if (!zEquals) {
                            z4 = true;
                        }
                    } else {
                        z4 = true;
                    }
                }
                return Boolean.valueOf(z4);
        }
    }

    public C31931s(BitmapFactory.Options options, InputStream inputStream) {
        this.f132624w = 13;
        this.f132625x = inputStream;
    }

    public /* synthetic */ C31931s(Object obj, int i13) {
        this.f132624w = i13;
        this.f132625x = obj;
    }

    public C31931s(List list, InterfaceC22712o interfaceC22712o, C23784k0 c23784k0, InterfaceC23796q0 interfaceC23796q0, boolean z4) {
        this.f132624w = 12;
        this.f132625x = interfaceC23796q0;
    }
}
