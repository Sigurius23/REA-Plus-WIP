package q73;

import s73.InterfaceC32243a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: q73.d */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC30025d implements InterfaceC32243a {

    /* JADX INFO: renamed from: w */
    public static final EnumC30025d f122538w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC30025d[] f122539x;

    static {
        EnumC30025d enumC30025d = new EnumC30025d("INSTANCE", 0);
        f122538w = enumC30025d;
        f122539x = new EnumC30025d[]{enumC30025d, new EnumC30025d("NEVER", 1)};
    }

    public static EnumC30025d valueOf(String str) {
        return (EnumC30025d) Enum.valueOf(EnumC30025d.class, str);
    }

    public static EnumC30025d[] values() {
        return (EnumC30025d[]) f122539x.clone();
    }

    @Override // s73.InterfaceC32244b
    /* JADX INFO: renamed from: a */
    public final int mo1488a() {
        return 2;
    }

    @Override // s73.InterfaceC32247e
    public final void clear() {
    }

    @Override // n73.InterfaceC26443b
    public final void dispose() {
    }

    @Override // n73.InterfaceC26443b
    public final boolean isDisposed() {
        return this == f122538w;
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
}
