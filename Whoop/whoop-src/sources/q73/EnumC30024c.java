package q73;

import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicReference;
import n73.InterfaceC26443b;
import p249jc.AbstractC21598x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: q73.c */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC30024c implements InterfaceC26443b {

    /* JADX INFO: renamed from: w */
    public static final EnumC30024c f122536w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC30024c[] f122537x;

    static {
        EnumC30024c enumC30024c = new EnumC30024c("DISPOSED", 0);
        f122536w = enumC30024c;
        f122537x = new EnumC30024c[]{enumC30024c};
    }

    /* JADX INFO: renamed from: a */
    public static void m91915a(AtomicReference atomicReference) {
        InterfaceC26443b interfaceC26443b;
        InterfaceC26443b interfaceC26443b2 = (InterfaceC26443b) atomicReference.get();
        EnumC30024c enumC30024c = f122536w;
        if (interfaceC26443b2 == enumC30024c || (interfaceC26443b = (InterfaceC26443b) atomicReference.getAndSet(enumC30024c)) == enumC30024c || interfaceC26443b == null) {
            return;
        }
        interfaceC26443b.dispose();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m91916b(AtomicReference atomicReference, InterfaceC26443b interfaceC26443b) {
        while (!atomicReference.compareAndSet(null, interfaceC26443b)) {
            if (atomicReference.get() != null) {
                interfaceC26443b.dispose();
                if (atomicReference.get() == f122536w) {
                    return false;
                }
                AbstractC21598x.m60677d0(new ProtocolViolationException("Disposable already set!"));
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m91917c(InterfaceC26443b interfaceC26443b, InterfaceC26443b interfaceC26443b2) {
        if (interfaceC26443b == null) {
            return true;
        }
        interfaceC26443b2.dispose();
        AbstractC21598x.m60677d0(new ProtocolViolationException("Disposable already set!"));
        return false;
    }

    public static EnumC30024c valueOf(String str) {
        return (EnumC30024c) Enum.valueOf(EnumC30024c.class, str);
    }

    public static EnumC30024c[] values() {
        return (EnumC30024c[]) f122537x.clone();
    }

    @Override // n73.InterfaceC26443b
    public final void dispose() {
    }

    @Override // n73.InterfaceC26443b
    public final boolean isDisposed() {
        return true;
    }
}
