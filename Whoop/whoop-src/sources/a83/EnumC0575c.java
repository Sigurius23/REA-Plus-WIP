package a83;

import eg3.InterfaceC13183b;
import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicReference;
import p088dc.AbstractC11895b;
import p249jc.AbstractC21598x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: a83.c */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC0575c implements InterfaceC13183b {

    /* JADX INFO: renamed from: w */
    public static final EnumC0575c f2049w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC0575c[] f2050x;

    static {
        EnumC0575c enumC0575c = new EnumC0575c("CANCELLED", 0);
        f2049w = enumC0575c;
        f2050x = new EnumC0575c[]{enumC0575c};
    }

    /* JADX INFO: renamed from: a */
    public static void m1489a(AtomicReference atomicReference) {
        InterfaceC13183b interfaceC13183b;
        InterfaceC13183b interfaceC13183b2 = (InterfaceC13183b) atomicReference.get();
        EnumC0575c enumC0575c = f2049w;
        if (interfaceC13183b2 == enumC0575c || (interfaceC13183b = (InterfaceC13183b) atomicReference.getAndSet(enumC0575c)) == enumC0575c || interfaceC13183b == null) {
            return;
        }
        interfaceC13183b.cancel();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1490b(long j7) {
        if (j7 > 0) {
            return true;
        }
        AbstractC21598x.m60677d0(new IllegalArgumentException(AbstractC11895b.m31994m(j7, "n > 0 required but it was ")));
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m1491c(InterfaceC13183b interfaceC13183b, InterfaceC13183b interfaceC13183b2) {
        if (interfaceC13183b == null) {
            return true;
        }
        interfaceC13183b2.cancel();
        AbstractC21598x.m60677d0(new ProtocolViolationException("Subscription already set!"));
        return false;
    }

    public static EnumC0575c valueOf(String str) {
        return (EnumC0575c) Enum.valueOf(EnumC0575c.class, str);
    }

    public static EnumC0575c[] values() {
        return (EnumC0575c[]) f2050x.clone();
    }

    @Override // eg3.InterfaceC13183b
    public final void cancel() {
    }

    @Override // eg3.InterfaceC13183b
    public final void request(long j7) {
    }
}
