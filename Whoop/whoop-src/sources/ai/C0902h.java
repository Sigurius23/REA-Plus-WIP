package ai;

import as1.C1949j;
import io.sentry.protocol.DebugImage;
import io.sentry.transport.InterfaceC20556f;
import java.util.LinkedHashMap;
import java.util.Map;
import m83.AbstractC25265s;
import p077d0.AbstractC11395r;
import p077d0.EnumC11408v0;
import p077d0.InterfaceC11363i2;
import p077d0.InterfaceC11367j2;
import p078d1.C11457j;
import p105e1.C12522i;
import p123en.InterfaceC13359f;
import p133f1.AbstractC13929c1;
import p133f1.C13926b1;
import p133f1.C13931d0;
import p133f1.C13984v;
import p133f1.InterfaceC13922a1;
import p133f1.InterfaceC13948j;
import p181h2.C16617b;
import p284ko.C22606a;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;
import p362oa.InterfaceC27750d;
import p398p9.C28977a;
import p499t9.C33651t;
import p499t9.C33652u;
import p499t9.C33653v;
import p499t9.InterfaceC33627e0;
import p499t9.InterfaceC33646o;
import p522uf.AbstractC34870c0;
import p588wm.C37370l;
import p588wm.InterfaceC37368j;
import p588wm.InterfaceC37374p;
import p607x8.AbstractC38065t;
import p635y2.InterfaceC39147y;
import p715kotlin.jvm.internal.AbstractC22676k;
import so.C32800q;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: ai.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C0902h implements InterfaceC11367j2, InterfaceC13948j, InterfaceC13359f, InterfaceC27750d {

    /* JADX INFO: renamed from: E */
    public Object f3293E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f3294w;

    /* JADX INFO: renamed from: x */
    public long f3295x;

    /* JADX INFO: renamed from: y */
    public long f3296y;

    /* JADX INFO: renamed from: z */
    public Object f3297z;

    @Override // p133f1.InterfaceC13948j
    /* JADX INFO: renamed from: b */
    public boolean mo2196b(long j7, C13984v c13984v, int i13) {
        InterfaceC39147y interfaceC39147y = (InterfaceC39147y) ((C12522i) this.f3297z).invoke();
        if (interfaceC39147y == null) {
            return false;
        }
        InterfaceC13922a1 interfaceC13922a1 = (InterfaceC13922a1) this.f3293E;
        long j13 = this.f3296y;
        if (!interfaceC39147y.mo3532g()) {
            return false;
        }
        C13926b1 c13926b1 = (C13926b1) interfaceC13922a1;
        C1949j c1949j = c13926b1.f49651f;
        if (c1949j != null) {
            c1949j.invoke(Boolean.FALSE, interfaceC39147y, new C16617b(j7), c13984v);
        }
        this.f3295x = j7;
        return AbstractC13929c1.m39697a(c13926b1, j13);
    }

    @Override // p077d0.InterfaceC11355g2
    /* JADX INFO: renamed from: c */
    public long mo2197c(AbstractC11395r abstractC11395r, AbstractC11395r abstractC11395r2, AbstractC11395r abstractC11395r3) {
        return (((long) 7) * this.f3295x) - this.f3296y;
    }

    @Override // p123en.InterfaceC13359f
    /* JADX INFO: renamed from: d */
    public InterfaceC37374p mo2199d() {
        AbstractC24543a.m71573i(this.f3295x != -1);
        return new C37370l((C33653v) this.f3297z, this.f3295x);
    }

    @Override // p123en.InterfaceC13359f, p362oa.InterfaceC27750d
    /* JADX INFO: renamed from: e */
    public void mo2200e(long j7) {
        switch (this.f3294w) {
            case 3:
                long[] jArr = (long[]) ((C32800q) this.f3293E).f136504w;
                this.f3296y = jArr[AbstractC24567y.m71674e(jArr, j7, true)];
                break;
            default:
                long[] jArr2 = (long[]) ((C33652u) this.f3293E).f140441w;
                this.f3296y = jArr2[AbstractC38065t.m121911d(jArr2, j7, true)];
                break;
        }
    }

    @Override // p133f1.InterfaceC13948j
    /* JADX INFO: renamed from: g */
    public void mo2201g() {
        C13931d0 c13931d0 = ((C13926b1) ((InterfaceC13922a1) this.f3293E)).f49653h;
        if (c13931d0 != null) {
            c13931d0.invoke();
        }
    }

    @Override // p077d0.InterfaceC11355g2
    /* JADX INFO: renamed from: h */
    public AbstractC11395r mo2202h(long j7, AbstractC11395r abstractC11395r, AbstractC11395r abstractC11395r2, AbstractC11395r abstractC11395r3) {
        return ((InterfaceC11363i2) this.f3297z).mo2202h(m2209q(j7), abstractC11395r, abstractC11395r2, m2210r(j7, abstractC11395r, abstractC11395r3, abstractC11395r2));
    }

    @Override // p362oa.InterfaceC27750d
    /* JADX INFO: renamed from: j */
    public long mo2203j(InterfaceC33646o interfaceC33646o) {
        long j7 = this.f3296y;
        if (j7 < 0) {
            return -1L;
        }
        long j13 = -(j7 + 2);
        this.f3296y = -1L;
        return j13;
    }

    @Override // p123en.InterfaceC13359f
    /* JADX INFO: renamed from: k */
    public long mo2204k(InterfaceC37368j interfaceC37368j) {
        long j7 = this.f3296y;
        if (j7 < 0) {
            return -1L;
        }
        long j13 = -(j7 + 2);
        this.f3296y = -1L;
        return j13;
    }

    @Override // p077d0.InterfaceC11355g2
    /* JADX INFO: renamed from: m */
    public AbstractC11395r mo2205m(long j7, AbstractC11395r abstractC11395r, AbstractC11395r abstractC11395r2, AbstractC11395r abstractC11395r3) {
        return ((InterfaceC11363i2) this.f3297z).mo2205m(m2209q(j7), abstractC11395r, abstractC11395r2, m2210r(j7, abstractC11395r, abstractC11395r3, abstractC11395r2));
    }

    @Override // p133f1.InterfaceC13948j
    /* JADX INFO: renamed from: n */
    public boolean mo2206n(long j7, C13984v c13984v) {
        InterfaceC39147y interfaceC39147y = (InterfaceC39147y) ((C12522i) this.f3297z).invoke();
        if (interfaceC39147y == null) {
            return true;
        }
        InterfaceC13922a1 interfaceC13922a1 = (InterfaceC13922a1) this.f3293E;
        long j13 = this.f3296y;
        if (!interfaceC39147y.mo3532g() || !AbstractC13929c1.m39697a(interfaceC13922a1, j13)) {
            return false;
        }
        if (!((C13926b1) interfaceC13922a1).m39693d(interfaceC39147y, j7, this.f3295x, c13984v, false)) {
            return true;
        }
        this.f3295x = j7;
        return true;
    }

    /* JADX INFO: renamed from: o */
    public void m2207o(Object obj, Object obj2, C0901g c0901g) {
        C0901g c0901g2 = (C0901g) obj2;
        ((C0904j) ((C11457j) this.f3293E).f36753x).m2228o((C0896b) obj, c0901g2.f3290a, c0901g2.f3291b, c0901g2.f3292c);
    }

    /* JADX INFO: renamed from: p */
    public long m2208p() {
        if (this.f3296y == -1) {
            long jM2211s = 0;
            for (Map.Entry entry : ((LinkedHashMap) this.f3297z).entrySet()) {
                jM2211s += m2211s(entry.getKey(), entry.getValue());
            }
            this.f3296y = jM2211s;
        }
        return this.f3296y;
    }

    /* JADX INFO: renamed from: q */
    public long m2209q(long j7) {
        long j13 = this.f3295x;
        long j14 = j7 + this.f3296y;
        if (j14 <= 0) {
            return 0L;
        }
        long jMin = Math.min(j14 / j13, ((long) 7) - 1);
        return (((EnumC11408v0) this.f3293E) == EnumC11408v0.f36577w || jMin % ((long) 2) == 0) ? j14 - (jMin * j13) : ((jMin + 1) * j13) - j14;
    }

    /* JADX INFO: renamed from: r */
    public AbstractC11395r m2210r(long j7, AbstractC11395r abstractC11395r, AbstractC11395r abstractC11395r2, AbstractC11395r abstractC11395r3) {
        long j13 = this.f3296y;
        long j14 = j7 + j13;
        long j15 = this.f3295x;
        return j14 > j15 ? mo2205m(j15 - j13, abstractC11395r, abstractC11395r2, abstractC11395r3) : abstractC11395r2;
    }

    /* JADX INFO: renamed from: s */
    public long m2211s(Object obj, Object obj2) throws Exception {
        try {
            long j7 = ((C0901g) obj2).f3292c;
            if (j7 >= 0) {
                return j7;
            }
            throw new IllegalStateException(("sizeOf(" + obj + ", " + obj2 + ") returned a negative value: " + j7).toString());
        } catch (Exception e5) {
            this.f3296y = -1L;
            throw e5;
        }
    }

    /* JADX INFO: renamed from: t */
    public DebugImage m2212t() {
        long j7 = this.f3295x;
        String str = (String) this.f3293E;
        if (str.isEmpty()) {
            return null;
        }
        DebugImage debugImage = new DebugImage();
        debugImage.setCodeId(str);
        debugImage.setCodeFile((String) this.f3297z);
        String strM109967B = AbstractC34870c0.m109967B(str);
        if (strM109967B != null) {
            str = strM109967B;
        }
        debugImage.setDebugId(str);
        debugImage.setImageAddr(String.format("0x%x", Long.valueOf(j7)));
        debugImage.setImageSize(this.f3296y - j7);
        debugImage.setType("elf");
        return debugImage;
    }

    /* JADX INFO: renamed from: u */
    public void m2213u(long j7) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f3297z;
        while (m2208p() > j7) {
            if (linkedHashMap.isEmpty()) {
                if (m2208p() != 0) {
                    throw new IllegalStateException("sizeOf() is returning inconsistent values");
                }
                return;
            }
            Map.Entry entry = (Map.Entry) AbstractC25265s.m74094E0(linkedHashMap.entrySet());
            Object key = entry.getKey();
            Object value = entry.getValue();
            linkedHashMap.remove(key);
            this.f3296y = m2208p() - m2211s(key, value);
            m2207o(key, value, null);
        }
    }

    public C0902h(long j7, C11457j c11457j) {
        this.f3294w = 0;
        this.f3293E = c11457j;
        this.f3295x = j7;
        this.f3297z = new LinkedHashMap(0, 0.75f, true);
        if (j7 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
    }

    @Override // p362oa.InterfaceC27750d
    /* JADX INFO: renamed from: d */
    public InterfaceC33627e0 mo2198d() {
        AbstractC35849g.m113807i(this.f3295x != -1);
        return new C33651t((C33653v) this.f3297z, this.f3295x, 0);
    }

    public C0902h(InterfaceC20556f dateProvider) {
        this.f3294w = 5;
        AbstractC22676k.m65750j(dateProvider, "dateProvider");
        this.f3293E = dateProvider;
        this.f3297z = new LinkedHashMap(10);
    }

    public C0902h(long j7, C12522i c12522i, InterfaceC13922a1 interfaceC13922a1) {
        this.f3294w = 2;
        this.f3297z = c12522i;
        this.f3293E = interfaceC13922a1;
        this.f3296y = j7;
        this.f3295x = 0L;
    }

    public C0902h(int i13, long j7, int i14) {
        this.f3294w = i14;
        switch (i14) {
            case 9:
                AbstractC24543a.m71573i(((C22606a) this.f3297z) == null);
                this.f3295x = j7;
                this.f3296y = j7 + ((long) i13);
                break;
            default:
                AbstractC35849g.m113807i(((C28977a) this.f3297z) == null);
                this.f3295x = j7;
                this.f3296y = j7 + ((long) i13);
                break;
        }
    }

    public C0902h(InterfaceC11363i2 interfaceC11363i2, EnumC11408v0 enumC11408v0, long j7) {
        this.f3294w = 1;
        this.f3297z = interfaceC11363i2;
        this.f3293E = enumC11408v0;
        this.f3295x = ((long) (interfaceC11363i2.mo14112l() + interfaceC11363i2.mo14111i())) * 1000000;
        this.f3296y = j7 * 1000000;
    }

    public C0902h(String str, byte[] bArr, long j7, long j13) {
        this.f3294w = 7;
        this.f3297z = str;
        this.f3293E = bArr;
        this.f3295x = j7;
        this.f3296y = j13;
    }
}
