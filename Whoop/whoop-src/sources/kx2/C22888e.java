package kx2;

import ax2.InterfaceC2121a;
import ax2.InterfaceC2122b;
import mx2.InterfaceC26015b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: kx2.e */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lkx2/e;", "Lax2/a;", "", "Lmx2/b$d;", "action", "Ltr2/n;", "logger", "<init>", "(Lmx2/b$d;Ltr2/n;)V", "Lax2/b;", "a", "(Lq83/d;)Ljava/lang/Object;", "Lmx2/b$d;", "b", "Ltr2/n;", "c", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22888e implements InterfaceC2121a {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d */
    public static final int f90376d = 8;

    /* JADX INFO: renamed from: e */
    private static final String f90377e = "UnknownActionCampaignDetailsCommand";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26015b.d action;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: kx2.e$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lkx2/e$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final String m66520a() {
            return C22888e.f90377e;
        }

        private Companion() {
        }
    }

    public C22888e(InterfaceC26015b.d action, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(action, "action");
        AbstractC22676k.m65750j(logger, "logger");
        this.action = action;
        this.logger = logger;
    }

    @Override // ax2.InterfaceC2121a
    /* JADX INFO: renamed from: a */
    public Object mo6691a(InterfaceC30057d<? super InterfaceC2122b> interfaceC30057d) {
        this.logger.mo85226q("Unknown action received/handled: " + this.action, new AbstractC30556a.a[0]);
        return InterfaceC2122b.a.f8494a;
    }
}
