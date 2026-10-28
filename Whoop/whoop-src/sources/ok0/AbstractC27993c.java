package ok0;

import fk2.C14554a;
import java.time.Clock;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import jk0.AbstractC21755i;
import kt0.C22823a;
import kt0.InterfaceC22824b;
import lt0.EnumC24733j;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import nj0.InterfaceC26750f;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import st0.EnumC32978v;
import tr2.InterfaceC34116n;
import xj0.AbstractC38334b;
import xj0.C38388v0;
import zj0.C40727h;
import zj0.InterfaceC40756t;

/* JADX INFO: renamed from: ok0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000e\"&\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Lnj0/f$b;", "Lkt0/b;", "d", "(Lnj0/f$b;)Lkt0/b;", "Lzj0/h;", "Lkt0/a;", "f", "(Lzj0/h;)Lkt0/a;", "Ljava/time/Clock;", "clock", "Lst0/v;", "deviceType", "Lxj0/b;", "e", "(Ljava/time/Clock;Lst0/v;)Lxj0/b;", "", "Lnj0/f;", "a", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "sensorHandshakes", "Ltr2/n;", "b", "Ltr2/n;", "logger", "connectivity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27993c {

    /* JADX INFO: renamed from: a */
    private static final Map<InterfaceC26750f, InterfaceC22824b> f112888a;

    /* JADX INFO: renamed from: b */
    private static final InterfaceC34116n f112889b;

    static {
        Set<InterfaceC26750f.b> setM79625c = InterfaceC26750f.INSTANCE.m79625c();
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(setM79625c, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (InterfaceC26750f.b bVar : setM79625c) {
            linkedHashMap.put(bVar, m84424d(bVar));
        }
        f112888a = linkedHashMap;
        f112889b = InterfaceC34116n.INSTANCE.m107848a("SensorHandshake");
    }

    /* JADX INFO: renamed from: c */
    public static final Map<InterfaceC26750f, InterfaceC22824b> m84423c() {
        return f112888a;
    }

    /* JADX INFO: renamed from: d */
    private static final InterfaceC22824b m84424d(InterfaceC26750f.b bVar) {
        if (AbstractC22676k.m65745e(bVar, InterfaceC26750f.b.C42056b.f106385b)) {
            return new C27991a();
        }
        if (AbstractC22676k.m65745e(bVar, InterfaceC26750f.b.c.f106390b)) {
            return new C27992b(AbstractC21755i.m61391a(bVar), EnumC24733j.REVISION_3);
        }
        if (bVar instanceof InterfaceC26750f.b.a) {
            return new C27992b(AbstractC21755i.m61391a(bVar), EnumC24733j.REVISION_2);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final AbstractC38334b m84425e(Clock clock, EnumC32978v enumC32978v) {
        return new C38388v0(new C14554a(clock.millis(), C14554a.c.MILLIS), enumC32978v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static final C22823a m84426f(C40727h c40727h) {
        InterfaceC40756t interfaceC40756t = c40727h instanceof InterfaceC40756t ? (InterfaceC40756t) c40727h : null;
        if (interfaceC40756t == null) {
            return null;
        }
        if (c40727h.m132198W()) {
            try {
                return new C22823a(interfaceC40756t.mo132226y());
            } catch (IndexOutOfBoundsException e5) {
                f112889b.mo85230v("hello body is too short to hold a serial", e5, new AbstractC30556a.a[0]);
                return null;
            }
        }
        f112889b.mo85226q("hello answered " + c40727h.m132197V() + ", so there is no serial to read", new AbstractC30556a.a[0]);
        return null;
    }
}
