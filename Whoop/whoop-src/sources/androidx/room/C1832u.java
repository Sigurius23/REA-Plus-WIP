package androidx.room;

import a63.C0486f0;
import androidx.health.platform.client.proto.C1533u;
import aws.smithy.kotlin.runtime.ClientException;
import aws.smithy.kotlin.runtime.SdkBaseException;
import aws.smithy.kotlin.runtime.ServiceException;
import bc3.AbstractC3006f0;
import bc3.AbstractC3035m1;
import be.C3154g;
import be.InterfaceC3160m;
import cf.AbstractC4530e;
import cf.C4527b;
import cf.C4528c;
import cf.C4529d;
import gg.C15815b;
import gg.C15821h;
import gg.EnumC15819f;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import jb3.C21547g;
import jb3.C21548h;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25235a0;
import mb3.C25388e;
import mb3.C25389f;
import me.C25461b;
import me.C25463d;
import n83.C26466i;
import ob3.InterfaceC27797g;
import p000.AbstractC30802r;
import p002a0.C0035k0;
import p098dt.AbstractC12350b;
import p132f0.AbstractC13789h;
import p132f0.C13783f;
import p238j0.C21086l;
import p239j1.C21194l;
import p390p1.C28617g1;
import p423qf.AbstractC30317a;
import p423qf.C30318b;
import p424qg.InterfaceC30332a;
import p459rf.AbstractC31342m;
import p459rf.C31344o;
import p459rf.C31346q;
import p459rf.C31347r;
import p501te.C33738c;
import p501te.C33740e;
import p501te.EnumC33741f;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import q83.InterfaceC30057d;
import tg.InterfaceC33773e;
import ud3.C34824k0;
import ud3.C34826l0;
import ud3.C34843u;
import vg.C35971r;
import vg.InterfaceC35967n;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;
import z53.C40110b;
import z53.C40115g;

/* JADX INFO: renamed from: androidx.room.u */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1832u extends C22672i implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f7180w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1832u(int i13, Object obj, Class cls, String str, String str2, int i14, int i15) {
        super(i13, i14, cls, obj, str, str2);
        this.f7180w = i15;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        char c3;
        Object next;
        Object[] objArr;
        float fM87022x;
        char c7 = 2;
        int i13 = 0;
        InterfaceC30057d interfaceC30057d = null;
        switch (this.f7180w) {
            case 0:
                Set p13 = (Set) obj;
                AbstractC22676k.m65750j(p13, "p0");
                C1835v c1835v = (C1835v) this.receiver;
                ReentrantLock reentrantLock = c1835v.f7191e;
                reentrantLock.lock();
                try {
                    List<C1795i0> listM74093D1 = AbstractC25265s.m74093D1(c1835v.f7190d.values());
                    reentrantLock.unlock();
                    for (C1795i0 c1795i0 : listM74093D1) {
                        c1795i0.getClass();
                        Set setM34586g = C25235a0.f99113w;
                        int[] iArr = c1795i0.f7088b;
                        int length = iArr.length;
                        if (length != 0) {
                            if (length != 1) {
                                C26466i c26466i = new C26466i();
                                int length2 = iArr.length;
                                int i14 = 0;
                                int i15 = 0;
                                while (i14 < length2) {
                                    int i16 = i15 + 1;
                                    if (p13.contains(Integer.valueOf(iArr[i14]))) {
                                        c26466i.add(c1795i0.f7089c[i15]);
                                    }
                                    i14++;
                                    i15 = i16;
                                }
                                setM34586g = AbstractC12350b.m34586g(c26466i);
                            } else if (p13.contains(Integer.valueOf(iArr[0]))) {
                                setM34586g = c1795i0.f7090d;
                            }
                        }
                        if (!setM34586g.isEmpty()) {
                            c1795i0.f7087a.mo5361a(setM34586g);
                        }
                    }
                    return C23454a0.f92919a;
                } catch (Throwable th3) {
                    reentrantLock.unlock();
                    throw th3;
                }
            case 1:
                ((AbstractC3035m1) this.receiver).mo8686j((Throwable) obj);
                return C23454a0.f92919a;
            case 2:
                String p14 = (String) obj;
                AbstractC22676k.m65750j(p14, "p0");
                return ((InterfaceC33773e) this.receiver).m106778c(p14);
            case 3:
                String p15 = (String) obj;
                AbstractC22676k.m65750j(p15, "p0");
                return ((InterfaceC33773e) this.receiver).m106778c(p15);
            case 4:
                String p16 = (String) obj;
                AbstractC22676k.m65750j(p16, "p0");
                return ((InterfaceC33773e) this.receiver).m106779d(p16);
            case 5:
                String p17 = (String) obj;
                AbstractC22676k.m65750j(p17, "p0");
                return ((InterfaceC33773e) this.receiver).m106779d(p17);
            case 6:
                String p18 = (String) obj;
                AbstractC22676k.m65750j(p18, "p0");
                return ((InterfaceC33773e) this.receiver).m106778c(p18);
            case 7:
                String p19 = (String) obj;
                AbstractC22676k.m65750j(p19, "p0");
                return ((InterfaceC33773e) this.receiver).m106779d(p19);
            case 8:
                String p24 = (String) obj;
                AbstractC22676k.m65750j(p24, "p0");
                return ((InterfaceC33773e) this.receiver).m106779d(p24);
            case 9:
                String p25 = (String) obj;
                AbstractC22676k.m65750j(p25, "p0");
                ((C4527b) this.receiver).getClass();
                C4529d c4529d = C4529d.f18263f;
                C4528c c4528c = C4528c.f18259e;
                C4529d c4529d2 = C4529d.f18262e;
                C4529d c4529d3 = C4529d.f18261d;
                List<String> listM125906y0 = AbstractC39414r.m125906y0(AbstractC39414r.m125869O0(p25).toString(), new String[]{"|"}, 6);
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM125906y0, 10));
                for (String str : listM125906y0) {
                    AbstractC4530e[] abstractC4530eArr = new AbstractC4530e[4];
                    abstractC4530eArr[0] = c4529d3;
                    abstractC4530eArr[1] = c4529d2;
                    abstractC4530eArr[c7] = c4528c;
                    abstractC4530eArr[3] = c4529d;
                    Iterator it = AbstractC37056f.m118959K(abstractC4530eArr).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            c3 = c7;
                            if (!AbstractC39421y.m125921F(str, ((AbstractC4530e) next).toString(), true)) {
                                c7 = c3;
                            }
                        } else {
                            c3 = c7;
                            next = null;
                        }
                    }
                    AbstractC4530e abstractC4530e = (AbstractC4530e) next;
                    if (abstractC4530e == null) {
                        StringBuilder sbM53375p = AbstractC18489d0.m53375p("Log mode ", str, " is not supported, should be one or more of: ");
                        AbstractC4530e[] abstractC4530eArr2 = new AbstractC4530e[4];
                        abstractC4530eArr2[0] = c4529d3;
                        abstractC4530eArr2[1] = c4529d2;
                        abstractC4530eArr2[c3] = c4528c;
                        abstractC4530eArr2[3] = c4529d;
                        sbM53375p.append(AbstractC25265s.m74110N0(AbstractC37056f.m118959K(abstractC4530eArr2), ", ", null, null, null, 62));
                        throw new ClientException(sbM53375p.toString());
                    }
                    arrayList.add(abstractC4530e);
                    c7 = c3;
                }
                Iterator it3 = arrayList.iterator();
                if (!it3.hasNext()) {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
                Object next2 = it3.next();
                while (it3.hasNext()) {
                    AbstractC4530e mode = (AbstractC4530e) it3.next();
                    AbstractC4530e abstractC4530e2 = (AbstractC4530e) next2;
                    abstractC4530e2.getClass();
                    AbstractC22676k.m65750j(mode, "mode");
                    next2 = new C4529d(abstractC4530e2.f18266a | mode.f18266a, 3);
                }
                return (AbstractC4530e) next2;
            case 10:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                AbstractC13789h abstractC13789h = (AbstractC13789h) this.receiver;
                C0035k0 c0035k0 = abstractC13789h.f49209d0;
                if (zBooleanValue) {
                    abstractC13789h.m39153f1();
                } else {
                    if (abstractC13789h.f49196Q != null) {
                        Object[] objArr2 = c0035k0.f101c;
                        long[] jArr = c0035k0.f99a;
                        int length3 = jArr.length - 2;
                        if (length3 >= 0) {
                            int i17 = 0;
                            while (true) {
                                long j7 = jArr[i17];
                                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i18 = 8;
                                    int i19 = 8 - ((~(i17 - length3)) >>> 31);
                                    int i24 = 0;
                                    while (i24 < i19) {
                                        if ((255 & j7) < 128) {
                                            AbstractC3006f0.m8732z(abstractC13789h.m7158L0(), null, null, new C13783f(abstractC13789h, (C21086l) objArr2[(i17 << 3) + i24], interfaceC30057d, i13), 3);
                                        }
                                        j7 >>= i18;
                                        i24++;
                                        i18 = i18;
                                        objArr2 = objArr2;
                                    }
                                    objArr = objArr2;
                                    if (i19 == i18) {
                                    }
                                } else {
                                    objArr = objArr2;
                                }
                                if (i17 != length3) {
                                    i17++;
                                    objArr2 = objArr;
                                }
                            }
                        }
                    }
                    c0035k0.m77a();
                    abstractC13789h.mo39132g1();
                }
                return C23454a0.f92919a;
            case 11:
                return C25461b.m74864h((C25461b) this.receiver, (InterfaceC30057d) obj);
            case 12:
                Throwable p26 = (Throwable) obj;
                AbstractC22676k.m65750j(p26, "p0");
                return ((C15821h) this.receiver).mo9058a(p26);
            case 13:
                ServiceException p27 = (ServiceException) obj;
                AbstractC22676k.m65750j(p27, "p0");
                ((C15821h) this.receiver).getClass();
                C33740e f8399w = p27.getF8399w();
                if (f8399w.m106622c() && f8399w.m106626g() == EnumC33741f.f141129x) {
                    return new C15815b(EnumC15819f.f59711w);
                }
                if (f8399w.m106622c() && f8399w.m106626g() == EnumC33741f.f141128w) {
                    return new C15815b(EnumC15819f.f59712x);
                }
                return null;
            case 14:
                ClientException p28 = (ClientException) obj;
                AbstractC22676k.m65750j(p28, "p0");
                ((C15821h) this.receiver).getClass();
                if (p28.f8399w.m106622c()) {
                    return new C15815b(EnumC15819f.f59712x);
                }
                return null;
            case 15:
                SdkBaseException p29 = (SdkBaseException) obj;
                AbstractC22676k.m65750j(p29, "p0");
                ((C15821h) this.receiver).getClass();
                C33738c f8400x = p29.getF8400x();
                if (f8400x.m106623d()) {
                    return new C15815b(EnumC15819f.f59713y);
                }
                if (f8400x.m106622c()) {
                    return new C15815b(EnumC15819f.f59714z);
                }
                return null;
            case 16:
                float fFloatValue = ((Number) obj).floatValue();
                C21194l c21194l = (C21194l) this.receiver;
                boolean zM59427b = c21194l.m59427b();
                C28617g1 c28617g1 = c21194l.f80761f;
                C28617g1 c28617g2 = c21194l.f80762g;
                float f13 = 0.0f;
                if (!zM59427b) {
                    float fM87022x2 = c28617g1.m87022x() + fFloatValue;
                    if (fM87022x2 < 0.0f) {
                        fM87022x2 = 0.0f;
                    }
                    float fM87022x3 = fM87022x2 - c28617g1.m87022x();
                    c28617g1.m87023y(fM87022x2);
                    if (c21194l.m59426a() <= c28617g2.m87022x()) {
                        fM87022x = c21194l.m59426a();
                    } else {
                        float fAbs = Math.abs(c21194l.m59426a() / c28617g2.m87022x()) - 1.0f;
                        f13 = fAbs >= 0.0f ? fAbs : 0.0f;
                        if (f13 > 2.0f) {
                            f13 = 2.0f;
                        }
                        fM87022x = (c28617g2.m87022x() * (f13 - (((float) Math.pow(f13, 2)) / 4))) + c28617g2.m87022x();
                    }
                    c21194l.f80760e.m87023y(fM87022x);
                    f13 = fM87022x3;
                }
                return Float.valueOf(f13);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                C25389f p32 = (C25389f) obj;
                AbstractC22676k.m65750j(p32, "p0");
                return new C21547g((C21548h) this.receiver, p32);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                InterfaceC27797g p34 = (InterfaceC27797g) obj;
                AbstractC22676k.m65750j(p34, "p0");
                return ((C25388e) this.receiver).m74463a(p34);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ((C3154g) ((InterfaceC3160m) ((C25463d) this.receiver).f99700w.getValue())).m9054b("/latest/meta-data/placement/region", (InterfaceC30057d) obj);
            case 20:
                AbstractC30802r.m94771t(obj);
                AbstractC22676k.m65750j(null, "p0");
                InterfaceC30332a.m92689a(Long.valueOf(((C30318b) this.receiver).f124394x), AbstractC30317a.m92661a(), 4);
                throw null;
            case 21:
                AbstractC30802r.m94771t(obj);
                AbstractC22676k.m65750j(null, "p0");
                InterfaceC30332a.m92689a(Long.valueOf(((C30318b) this.receiver).f124383F), AbstractC30317a.m92662b(), 4);
                throw null;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                Function1 p35 = (Function1) obj;
                AbstractC22676k.m65750j(p35, "p0");
                ((AbstractC31342m) this.receiver).getClass();
                C31346q c31346q = new C31346q();
                p35.invoke(c31346q);
                return new C31344o(new C31347r(c31346q), null);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                String p36 = (String) obj;
                AbstractC22676k.m65750j(p36, "p0");
                ((C35971r) ((InterfaceC35967n) this.receiver)).getClass();
                return System.getProperty(p36);
            case 24:
                String p37 = (String) obj;
                AbstractC22676k.m65750j(p37, "p0");
                return ((C35971r) ((InterfaceC35967n) this.receiver)).m114207b(p37);
            case 25:
                String p38 = (String) obj;
                AbstractC22676k.m65750j(p38, "p0");
                return ((C35971r) ((InterfaceC35967n) this.receiver)).m114207b(p38);
            default:
                C0486f0 c0486f0 = (C0486f0) obj;
                C40110b c40110b = ((C40115g) this.receiver).f173157y;
                C34826l0 c34826l0 = c40110b.f173135b;
                if (c34826l0 == null) {
                    c34826l0 = (C34826l0) C40115g.f173152I.getValue();
                }
                C34824k0 c34824k0M109897a = c34826l0.m109897a();
                c34824k0M109897a.f146612a = new C34843u();
                c40110b.f173134a.invoke(c34824k0M109897a);
                if (c0486f0 != null) {
                    Long l7 = c0486f0.f1646b;
                    if (l7 != null) {
                        long jLongValue = l7.longValue();
                        if (jLongValue == Long.MAX_VALUE) {
                            jLongValue = 0;
                        }
                        c34824k0M109897a.m109892b(jLongValue, TimeUnit.MILLISECONDS);
                    }
                    Long l12 = c0486f0.f1647c;
                    if (l12 != null) {
                        long jLongValue2 = l12.longValue();
                        long j13 = jLongValue2 == Long.MAX_VALUE ? 0L : jLongValue2;
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        c34824k0M109897a.m109895e(j13, timeUnit);
                        c34824k0M109897a.m109896f(jLongValue2 != Long.MAX_VALUE ? jLongValue2 : 0L, timeUnit);
                    }
                }
                return new C34826l0(c34824k0M109897a);
        }
    }
}
