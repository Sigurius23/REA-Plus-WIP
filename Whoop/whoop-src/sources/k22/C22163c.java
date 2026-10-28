package k22;

import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import qt0.C30586b;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: k22.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lk22/c;", "", "Ltr2/n;", "logger", "<init>", "(Ltr2/n;)V", "Lk22/a;", "action", "", "Lqt0/b;", "devices", "Lk22/b;", "a", "(Lk22/a;Ljava/util/List;)Lk22/b;", "Ltr2/n;", "pairing-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22163c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    public C22163c(InterfaceC34116n logger) {
        AbstractC22676k.m65750j(logger, "logger");
        this.logger = logger;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC22162b m63440a(AbstractC22161a action, List<C30586b> devices) {
        AbstractC22676k.m65750j(action, "action");
        AbstractC22676k.m65750j(devices, "devices");
        if (action instanceof AbstractC22161a.a) {
            return AbstractC22162b.a.f85926a;
        }
        if (action instanceof AbstractC22161a.c) {
            return new AbstractC22162b.c(devices);
        }
        if (action instanceof AbstractC22161a.b) {
            return AbstractC22162b.b.f85927a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
