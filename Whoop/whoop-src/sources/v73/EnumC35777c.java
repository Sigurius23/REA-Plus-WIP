package v73;

import eg3.InterfaceC13183b;
import p73.InterfaceC28961b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: v73.c */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC35777c implements InterfaceC28961b {

    /* JADX INFO: renamed from: w */
    public static final EnumC35777c f152146w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC35777c[] f152147x;

    static {
        EnumC35777c enumC35777c = new EnumC35777c("INSTANCE", 0);
        f152146w = enumC35777c;
        f152147x = new EnumC35777c[]{enumC35777c};
    }

    public static EnumC35777c valueOf(String str) {
        return (EnumC35777c) Enum.valueOf(EnumC35777c.class, str);
    }

    public static EnumC35777c[] values() {
        return (EnumC35777c[]) f152147x.clone();
    }

    @Override // p73.InterfaceC28961b
    public final void accept(Object obj) {
        ((InterfaceC13183b) obj).request(Long.MAX_VALUE);
    }
}
