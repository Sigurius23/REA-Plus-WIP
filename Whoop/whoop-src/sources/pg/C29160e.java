package pg;

import fg3.AbstractC14476d;
import fg3.InterfaceC14474b;
import p368og.InterfaceC27910g;
import p368og.InterfaceC27913j;

/* JADX INFO: renamed from: pg.e */
/* JADX INFO: loaded from: classes.dex */
public final class C29160e implements InterfaceC27913j {

    /* JADX INFO: renamed from: a */
    public static final C29160e f118020a = new C29160e();

    /* JADX INFO: renamed from: b */
    public static final boolean f118021b;

    static {
        boolean z4;
        try {
            AbstractC14476d.m41339c("version_check").mo41321g(4);
            z4 = true;
        } catch (NoSuchMethodError unused) {
            AbstractC14476d.m41338b(C29160e.class).warn("falling back to SLF4J 1.x compatible binding");
            z4 = false;
        }
        f118021b = z4;
    }

    @Override // p368og.InterfaceC27913j
    /* JADX INFO: renamed from: a */
    public final InterfaceC27910g mo44900a(String str) {
        InterfaceC14474b interfaceC14474bM41339c = AbstractC14476d.m41339c(str);
        return f118021b ? new C29159d(interfaceC14474bM41339c) : new C29156a(interfaceC14474bM41339c);
    }
}
