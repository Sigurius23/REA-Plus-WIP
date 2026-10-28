package oe3;

import java.util.logging.Logger;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: oe3.k */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC27891k {

    /* JADX INFO: renamed from: a */
    public static final Logger f112470a = Logger.getLogger("okio.Okio");

    /* JADX INFO: renamed from: b */
    public static final boolean m84162b(AssertionError assertionError) {
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? AbstractC39414r.m125876U(message, "getsockname failed", false) : false) {
                return true;
            }
        }
        return false;
    }
}
