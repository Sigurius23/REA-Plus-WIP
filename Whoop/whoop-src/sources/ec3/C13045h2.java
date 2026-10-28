package ec3;

import bc3.C3033m;
import dc3.EnumC11916a;
import fc3.AbstractC14370a;
import fc3.AbstractC14371b;
import fc3.AbstractC14372c;
import fc3.InterfaceC14386q;
import hc3.C17191x;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l83.C23454a0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: ec3.h2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13045h2 extends AbstractC14370a implements InterfaceC13075p1, InterfaceC13026d, InterfaceC14386q {

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f45088F = AtomicReferenceFieldUpdater.newUpdater(C13045h2.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: E */
    public int f45089E;
    private volatile /* synthetic */ Object _state$volatile;

    public C13045h2(Object obj) {
        this._state$volatile = obj;
    }

    @Override // ec3.InterfaceC13072o1
    /* JADX INFO: renamed from: a */
    public final boolean mo36564a(Object obj) {
        m36570j(obj);
        return true;
    }

    @Override // fc3.InterfaceC14386q
    /* JADX INFO: renamed from: b */
    public final InterfaceC13058l mo36565b(InterfaceC30063j interfaceC30063j, int i13, EnumC11916a enumC11916a) {
        return (((i13 < 0 || i13 >= 2) && i13 != -2) || enumC11916a != EnumC11916a.f38983x) ? AbstractC13091v.m36581G(this, interfaceC30063j, i13, enumC11916a) : this;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0100 A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:14:0x0039, B:36:0x0096, B:38:0x009e, B:41:0x00a5, B:42:0x00a9, B:44:0x00ac, B:54:0x00cd, B:57:0x00dd, B:58:0x00f9, B:64:0x0109, B:61:0x0100, B:63:0x0106, B:46:0x00b2, B:50:0x00b9, B:21:0x0052, B:24:0x005d, B:35:0x0087), top: B:73:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0106 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:? A[LOOP:0: B:58:0x00f9->B:78:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00dc -> B:36:0x0096). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // ec3.InterfaceC13058l
    public final java.lang.Object collect(ec3.InterfaceC13062m r18, q83.InterfaceC30057d r19) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ec3.C13045h2.collect(ec3.m, q83.d):java.lang.Object");
    }

    @Override // ec3.InterfaceC13072o1
    /* JADX INFO: renamed from: d */
    public final void mo36566d() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // fc3.AbstractC14370a
    /* JADX INFO: renamed from: e */
    public final AbstractC14372c mo36567e() {
        return new C13049i2();
    }

    @Override // ec3.InterfaceC13072o1, ec3.InterfaceC13062m
    public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
        m36570j(obj);
        return C23454a0.f92919a;
    }

    @Override // fc3.AbstractC14370a
    /* JADX INFO: renamed from: f */
    public final AbstractC14372c[] mo36568f() {
        return new C13049i2[2];
    }

    @Override // ec3.InterfaceC13087t1
    public final List getReplayCache() {
        return AbstractC37056f.m118958J(getValue());
    }

    @Override // ec3.InterfaceC13037f2
    public final Object getValue() {
        C17191x c17191x = AbstractC14371b.f52477b;
        Object obj = f45088F.get(this);
        if (obj == c17191x) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m36569i(Object obj, Object obj2) {
        C17191x c17191x = AbstractC14371b.f52477b;
        if (obj == null) {
            obj = c17191x;
        }
        if (obj2 == null) {
            obj2 = c17191x;
        }
        return m36571k(obj, obj2);
    }

    /* JADX INFO: renamed from: j */
    public final void m36570j(Object obj) {
        if (obj == null) {
            obj = AbstractC14371b.f52477b;
        }
        m36571k(null, obj);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m36571k(Object obj, Object obj2) {
        int i13;
        AbstractC14372c[] abstractC14372cArr;
        C17191x c17191x;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f45088F;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !AbstractC22676k.m65745e(obj3, obj)) {
                return false;
            }
            if (AbstractC22676k.m65745e(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i14 = this.f45089E;
            if ((i14 & 1) != 0) {
                this.f45089E = i14 + 2;
                return true;
            }
            int i15 = i14 + 1;
            this.f45089E = i15;
            AbstractC14372c[] abstractC14372cArr2 = this.f52472w;
            while (true) {
                C13049i2[] c13049i2Arr = (C13049i2[]) abstractC14372cArr2;
                if (c13049i2Arr != null) {
                    for (C13049i2 c13049i2 : c13049i2Arr) {
                        if (c13049i2 != null) {
                            AtomicReference atomicReference = c13049i2.f45101a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 == null || obj4 == (c17191x = AbstractC13091v.f45235e)) {
                                    break;
                                }
                                C17191x c17191x2 = AbstractC13091v.f45234d;
                                if (obj4 != c17191x2) {
                                    do {
                                        if (atomicReference.compareAndSet(obj4, c17191x2)) {
                                            ((C3033m) obj4).resumeWith(C23454a0.f92919a);
                                            break;
                                        }
                                    } while (atomicReference.get() == obj4);
                                } else {
                                    do {
                                        if (atomicReference.compareAndSet(obj4, c17191x)) {
                                            break;
                                        }
                                    } while (atomicReference.get() == obj4);
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i13 = this.f45089E;
                    if (i13 == i15) {
                        this.f45089E = i15 + 1;
                        return true;
                    }
                    abstractC14372cArr = this.f52472w;
                }
                abstractC14372cArr2 = abstractC14372cArr;
                i15 = i13;
            }
        }
    }
}
