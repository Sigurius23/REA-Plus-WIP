package io.sentry;

import io.sentry.exception.ExceptionMechanismException;
import io.sentry.protocol.C20470c;
import io.sentry.protocol.C20472d;
import io.sentry.protocol.C20481h0;
import io.sentry.protocol.C20496q;
import io.sentry.protocol.C20499t;
import io.sentry.protocol.C20501v;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: io.sentry.r4 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20519r4 {

    /* JADX INFO: renamed from: E */
    public AbstractMap f76872E;

    /* JADX INFO: renamed from: F */
    public String f76873F;

    /* JADX INFO: renamed from: G */
    public String f76874G;

    /* JADX INFO: renamed from: H */
    public String f76875H;

    /* JADX INFO: renamed from: I */
    public C20481h0 f76876I;

    /* JADX INFO: renamed from: J */
    public transient Throwable f76877J;

    /* JADX INFO: renamed from: K */
    public String f76878K;

    /* JADX INFO: renamed from: L */
    public String f76879L;

    /* JADX INFO: renamed from: M */
    public List f76880M;

    /* JADX INFO: renamed from: N */
    public C20472d f76881N;

    /* JADX INFO: renamed from: O */
    public AbstractMap f76882O;

    /* JADX INFO: renamed from: w */
    public C20501v f76883w;

    /* JADX INFO: renamed from: x */
    public final C20470c f76884x;

    /* JADX INFO: renamed from: y */
    public C20499t f76885y;

    /* JADX INFO: renamed from: z */
    public C20496q f76886z;

    public AbstractC20519r4(C20501v c20501v) {
        this.f76884x = new C20470c();
        this.f76883w = c20501v;
    }

    /* JADX INFO: renamed from: a */
    public final Throwable m56670a() {
        Throwable th3 = this.f76877J;
        return th3 instanceof ExceptionMechanismException ? ((ExceptionMechanismException) th3).m56487c() : th3;
    }

    /* JADX INFO: renamed from: b */
    public final void m56671b(String str, String str2) {
        if (this.f76872E == null) {
            this.f76872E = new HashMap();
        }
        if (str == null) {
            return;
        }
        if (str2 != null) {
            this.f76872E.put(str, str2);
            return;
        }
        AbstractMap abstractMap = this.f76872E;
        if (abstractMap != null) {
            abstractMap.remove(str);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m56672c(HashMap map) {
        this.f76872E = new HashMap(map);
    }

    public AbstractC20519r4() {
        this(new C20501v());
    }
}
