package dy1;

import java.util.LinkedHashMap;
import java.util.Map;
import p100dw.C12397b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import x42.InterfaceC37967d;
import y42.InterfaceC39219a;

/* JADX INFO: renamed from: dy1.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m65681d2 = {"Ldy1/e;", "Lx42/d;", "Ldy1/a;", "memfaultInitializer", "Ldw/b;", "chunkSenderBuilder", "Ltr2/n;", "logger", "<init>", "(Ldy1/a;Ldw/b;Ltr2/n;)V", "", "macAddress", "Ly42/a;", "puffin", "Ll83/a0;", "a", "(Ljava/lang/String;Ly42/a;)V", "Ldy1/a;", "b", "Ldw/b;", "c", "Ltr2/n;", "", "Ldy1/f;", "d", "Ljava/util/Map;", "puffins", "memfault_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12449e implements InterfaceC37967d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C12445a memfaultInitializer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C12397b chunkSenderBuilder;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Map<String, C12450f> puffins;

    public C12449e(C12445a memfaultInitializer, C12397b chunkSenderBuilder, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(memfaultInitializer, "memfaultInitializer");
        AbstractC22676k.m65750j(chunkSenderBuilder, "chunkSenderBuilder");
        AbstractC22676k.m65750j(logger, "logger");
        this.memfaultInitializer = memfaultInitializer;
        this.chunkSenderBuilder = chunkSenderBuilder;
        this.logger = logger;
        this.puffins = new LinkedHashMap();
    }

    @Override // x42.InterfaceC37967d
    /* JADX INFO: renamed from: a */
    public void mo35059a(String macAddress, InterfaceC39219a puffin) {
        AbstractC22676k.m65750j(macAddress, "macAddress");
        AbstractC22676k.m65750j(puffin, "puffin");
        if (this.puffins.get(macAddress) == null) {
            try {
                C12450f c12450f = new C12450f(this.memfaultInitializer, null, this.chunkSenderBuilder, null, puffin, 10, null);
                c12450f.m35080r();
                this.puffins.put(macAddress, c12450f);
            } catch (IllegalArgumentException unused) {
                this.logger.mo85222m("Invalid macAddress - ".concat(macAddress), new AbstractC30556a.a[0]);
            }
        }
    }

    public /* synthetic */ C12449e(C12445a c12445a, C12397b c12397b, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c12445a, c12397b, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("PuffinMemfaultFactoryImpl") : interfaceC34116n);
    }
}
