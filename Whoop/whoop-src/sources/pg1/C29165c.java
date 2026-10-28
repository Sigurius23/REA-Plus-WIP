package pg1;

import no.nordicsemi.android.dfu.DfuLogListener;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: pg1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\f\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lpg1/c;", "Lno/nordicsemi/android/dfu/DfuLogListener;", "Ltr2/n;", "logger", "<init>", "(Ltr2/n;)V", "", "deviceAddress", "", "level", "message", "Ll83/a0;", "onLogEvent", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ltr2/n;", "getLogger", "()Ltr2/n;", "firmware-update-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29165c implements DfuLogListener {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    public C29165c(InterfaceC34116n logger) {
        AbstractC22676k.m65750j(logger, "logger");
        this.logger = logger;
    }

    @Override // no.nordicsemi.android.dfu.DfuLogListener
    public void onLogEvent(String deviceAddress, int level, String message) {
        if (level == 0) {
            if (message != null) {
                this.logger.mo85228t(message, new AbstractC30556a.a[0]);
                return;
            }
            return;
        }
        if (level == 1) {
            if (message != null) {
                this.logger.mo85219j(message, new AbstractC30556a.a[0]);
                return;
            }
            return;
        }
        if (level == 5) {
            if (message != null) {
                this.logger.mo85216g(message, new AbstractC30556a.a[0]);
            }
        } else if (level == 10) {
            if (message != null) {
                this.logger.mo85226q(message, new AbstractC30556a.a[0]);
            }
        } else if (level == 15) {
            if (message != null) {
                this.logger.mo85226q(message, new AbstractC30556a.a[0]);
            }
        } else if (level == 20 && message != null) {
            this.logger.mo85222m(message, new AbstractC30556a.a[0]);
        }
    }
}
