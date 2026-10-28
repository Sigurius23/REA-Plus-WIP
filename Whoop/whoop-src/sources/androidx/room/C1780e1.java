package androidx.room;

import androidx.lifecycle.AbstractC1615p0;
import bc3.AbstractC3006f0;
import com.google.crypto.tink.internal.C5101l0;
import e93.AbstractC12889b;
import ge3.AbstractC15751g;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.C30064k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: androidx.room.e1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1780e1 extends AbstractC1615p0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC1848z0 f7009a;

    /* JADX INFO: renamed from: b */
    public final C5101l0 f7010b;

    /* JADX INFO: renamed from: c */
    public final boolean f7011c;

    /* JADX INFO: renamed from: d */
    public final C1819p1 f7012d;

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f7013e;

    /* JADX INFO: renamed from: f */
    public final AtomicBoolean f7014f;

    /* JADX INFO: renamed from: g */
    public final AtomicBoolean f7015g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC30063j f7016h;

    /* JADX INFO: renamed from: i */
    public final Function1 f7017i;

    public C1780e1(AbstractC1848z0 database, C5101l0 container, boolean z4, String[] strArr, Function1 function1) {
        AbstractC22676k.m65750j(database, "database");
        AbstractC22676k.m65750j(container, "container");
        this.f7009a = database;
        this.f7010b = container;
        this.f7011c = z4;
        this.f7012d = new C1819p1(strArr, this);
        this.f7013e = new AtomicBoolean(true);
        this.f7014f = new AtomicBoolean(false);
        this.f7015g = new AtomicBoolean(false);
        this.f7016h = database.inCompatibilityMode() ? z4 ? database.getTransactionContext$room_runtime() : database.getQueryContext() : C30064k.f122676w;
        this.f7017i = function1;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0074  */
    /* JADX WARN: Code duplicated, block: B:30:0x007c A[Catch: all -> 0x0032, Exception -> 0x0035, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0035, blocks: (B:12:0x002b, B:30:0x007c), top: B:48:0x002b, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x008d A[LOOP:0: B:28:0x0076->B:33:0x008d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x009a A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #0 {all -> 0x0032, blocks: (B:12:0x002b, B:28:0x0076, B:30:0x007c, B:37:0x009a, B:34:0x0090, B:35:0x0097), top: B:47:0x0025, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0074 -> B:28:0x0076). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00a5 -> B:42:0x00a6). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: b */
    public static final Object m5416b(C1780e1 c1780e1, AbstractC32269c abstractC32269c) {
        C1822q1 c1822q1;
        int i13;
        Object obj;
        Object objM44434N;
        AtomicBoolean atomicBoolean = c1780e1.f7013e;
        AtomicBoolean atomicBoolean2 = c1780e1.f7014f;
        if (abstractC32269c instanceof C1822q1) {
            c1822q1 = (C1822q1) abstractC32269c;
            int i14 = c1822q1.f7166z;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c1822q1.f7166z = i14 - Integer.MIN_VALUE;
            } else {
                c1822q1 = new C1822q1(c1780e1, abstractC32269c);
            }
        } else {
            c1822q1 = new C1822q1(c1780e1, abstractC32269c);
        }
        Object obj2 = c1822q1.f7164x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = c1822q1.f7166z;
        InterfaceC30057d interfaceC30057d = null;
        try {
            if (i15 == 0) {
                AbstractC34132o.m107864I(obj2);
                if (c1780e1.f7015g.compareAndSet(false, true)) {
                    C1835v invalidationTracker = c1780e1.f7009a.getInvalidationTracker();
                    C1819p1 observer = c1780e1.f7012d;
                    invalidationTracker.getClass();
                    AbstractC22676k.m65750j(observer, "observer");
                    if (invalidationTracker.m5454a(new C1801j2(invalidationTracker, observer))) {
                        AbstractC12889b.m36260Z(new C1829t(invalidationTracker, interfaceC30057d, 0));
                    }
                }
                if (atomicBoolean2.compareAndSet(false, true)) {
                    obj = null;
                    i13 = 0;
                    while (atomicBoolean.compareAndSet(true, false)) {
                        c1822q1.f7163w = 1;
                        c1822q1.f7166z = 1;
                        objM44434N = AbstractC15751g.m44434N(c1780e1.f7009a, true, c1780e1.f7011c, c1780e1.f7017i, c1822q1);
                        if (objM44434N == enumC31071a) {
                            return enumC31071a;
                        }
                        obj = objM44434N;
                        i13 = 1;
                    }
                    if (i13 != 0) {
                        c1780e1.postValue(obj);
                    }
                    atomicBoolean2.set(false);
                } else {
                    i13 = 0;
                }
                if (i13 != 0) {
                }
                return C23454a0.f92919a;
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i16 = c1822q1.f7163w;
            try {
                AbstractC34132o.m107864I(obj2);
                obj = obj2;
                i13 = i16;
                while (atomicBoolean.compareAndSet(true, false)) {
                    c1822q1.f7163w = 1;
                    c1822q1.f7166z = 1;
                    objM44434N = AbstractC15751g.m44434N(c1780e1.f7009a, true, c1780e1.f7011c, c1780e1.f7017i, c1822q1);
                    if (objM44434N == enumC31071a) {
                        return enumC31071a;
                    }
                    obj = objM44434N;
                    i13 = 1;
                }
                if (i13 != 0) {
                    c1780e1.postValue(obj);
                }
                atomicBoolean2.set(false);
                if (i13 != 0 || !atomicBoolean.get()) {
                    return C23454a0.f92919a;
                }
                if (atomicBoolean2.compareAndSet(false, true)) {
                    obj = null;
                    i13 = 0;
                    while (atomicBoolean.compareAndSet(true, false)) {
                        c1822q1.f7163w = 1;
                        c1822q1.f7166z = 1;
                        objM44434N = AbstractC15751g.m44434N(c1780e1.f7009a, true, c1780e1.f7011c, c1780e1.f7017i, c1822q1);
                        if (objM44434N == enumC31071a) {
                            return enumC31071a;
                        }
                        obj = objM44434N;
                        i13 = 1;
                    }
                    if (i13 != 0) {
                        c1780e1.postValue(obj);
                    }
                    atomicBoolean2.set(false);
                } else {
                    i13 = 0;
                }
                if (i13 != 0) {
                }
                return C23454a0.f92919a;
            } catch (Exception e5) {
                throw new RuntimeException("Exception while computing database live data.", e5);
            }
        } catch (Throwable th3) {
            atomicBoolean2.set(false);
            throw th3;
        }
    }

    @Override // androidx.lifecycle.AbstractC1615p0
    public final void onActive() {
        super.onActive();
        C5101l0 c5101l0 = this.f7010b;
        c5101l0.getClass();
        ((Set) c5101l0.f21444y).add(this);
        AbstractC3006f0.m8732z(this.f7009a.getCoroutineScope(), this.f7016h, null, new C1816o1(this, null, 1), 2);
    }

    @Override // androidx.lifecycle.AbstractC1615p0
    public final void onInactive() {
        super.onInactive();
        C5101l0 c5101l0 = this.f7010b;
        c5101l0.getClass();
        ((Set) c5101l0.f21444y).remove(this);
    }
}
