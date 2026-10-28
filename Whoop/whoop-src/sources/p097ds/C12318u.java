package p097ds;

import java.util.logging.Logger;
import p403pp.C29406b;
import p403pp.C29409e;

/* JADX INFO: renamed from: ds.u */
/* JADX INFO: loaded from: classes6.dex */
public final class C12318u {

    /* JADX INFO: renamed from: a */
    public final String f41250a;

    /* JADX INFO: renamed from: b */
    public volatile Logger f41251b;

    /* JADX INFO: renamed from: c */
    public final Object f41252c;

    public C12318u() {
        this.f41252c = new C29409e();
        this.f41250a = C29406b.class.getName();
    }

    /* JADX INFO: renamed from: a */
    public Logger m34347a() {
        Logger logger = this.f41251b;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f41252c) {
            try {
                Logger logger2 = this.f41251b;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f41250a);
                this.f41251b = logger3;
                return logger3;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public Logger m34348b() {
        Logger logger = this.f41251b;
        if (logger != null) {
            return logger;
        }
        synchronized (((C29409e) this.f41252c)) {
            try {
                Logger logger2 = this.f41251b;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f41250a);
                this.f41251b = logger3;
                return logger3;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public C12318u(Class cls) {
        this.f41252c = new Object();
        this.f41250a = cls.getName();
    }
}
