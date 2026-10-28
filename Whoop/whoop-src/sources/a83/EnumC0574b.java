package a83;

import s73.InterfaceC32245c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: a83.b */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC0574b implements InterfaceC32245c {

    /* JADX INFO: renamed from: w */
    public static final EnumC0574b f2047w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC0574b[] f2048x;

    static {
        EnumC0574b enumC0574b = new EnumC0574b("INSTANCE", 0);
        f2047w = enumC0574b;
        f2048x = new EnumC0574b[]{enumC0574b};
    }

    public static EnumC0574b valueOf(String str) {
        return (EnumC0574b) Enum.valueOf(EnumC0574b.class, str);
    }

    public static EnumC0574b[] values() {
        return (EnumC0574b[]) f2048x.clone();
    }

    @Override // s73.InterfaceC32244b
    /* JADX INFO: renamed from: a */
    public final int mo1488a() {
        return 2;
    }

    @Override // eg3.InterfaceC13183b
    public final void cancel() {
    }

    @Override // s73.InterfaceC32247e
    public final void clear() {
    }

    @Override // s73.InterfaceC32247e
    public final boolean isEmpty() {
        return true;
    }

    @Override // s73.InterfaceC32247e
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // s73.InterfaceC32247e
    public final Object poll() {
        return null;
    }

    @Override // eg3.InterfaceC13183b
    public final void request(long j7) {
        EnumC0575c.m1490b(j7);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "EmptySubscription";
    }
}
