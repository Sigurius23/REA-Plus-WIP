package q83;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l83.C23467m;
import r83.EnumC31071a;
import s83.InterfaceC32270d;

/* JADX INFO: renamed from: q83.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C30065l implements InterfaceC30057d, InterfaceC32270d {

    /* JADX INFO: renamed from: x */
    public static final AtomicReferenceFieldUpdater f122677x = AtomicReferenceFieldUpdater.newUpdater(C30065l.class, Object.class, "result");
    private volatile Object result;

    /* JADX INFO: renamed from: w */
    public final InterfaceC30057d f122678w;

    public C30065l(InterfaceC30057d interfaceC30057d, EnumC31071a enumC31071a) {
        this.f122678w = interfaceC30057d;
        this.result = enumC31071a;
    }

    /* JADX INFO: renamed from: a */
    public final Object m92140a() {
        Object obj = this.result;
        EnumC31071a enumC31071a = EnumC31071a.f128114x;
        if (obj == enumC31071a) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f122677x;
            EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, enumC31071a, enumC31071a2)) {
                if (atomicReferenceFieldUpdater.get(this) != enumC31071a) {
                    obj = this.result;
                }
            }
            return EnumC31071a.f128113w;
        }
        if (obj == EnumC31071a.f128115y) {
            return EnumC31071a.f128113w;
        }
        if (obj instanceof C23467m) {
            throw ((C23467m) obj).f92939w;
        }
        return obj;
    }

    @Override // s83.InterfaceC32270d
    public final InterfaceC32270d getCallerFrame() {
        InterfaceC30057d interfaceC30057d = this.f122678w;
        if (interfaceC30057d instanceof InterfaceC32270d) {
            return (InterfaceC32270d) interfaceC30057d;
        }
        return null;
    }

    @Override // q83.InterfaceC30057d
    public final InterfaceC30063j getContext() {
        return this.f122678w.getContext();
    }

    @Override // q83.InterfaceC30057d
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            EnumC31071a enumC31071a = EnumC31071a.f128114x;
            if (obj2 == enumC31071a) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f122677x;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, enumC31071a, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != enumC31071a) {
                    }
                }
                return;
            }
            EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
            if (obj2 != enumC31071a2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f122677x;
            EnumC31071a enumC31071a3 = EnumC31071a.f128115y;
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(this, enumC31071a2, enumC31071a3)) {
                    this.f122678w.resumeWith(obj);
                    return;
                }
            } while (atomicReferenceFieldUpdater2.get(this) == enumC31071a2);
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f122678w;
    }

    public C30065l(InterfaceC30057d interfaceC30057d) {
        EnumC31071a enumC31071a = EnumC31071a.f128114x;
        this.f122678w = interfaceC30057d;
        this.result = enumC31071a;
    }
}
