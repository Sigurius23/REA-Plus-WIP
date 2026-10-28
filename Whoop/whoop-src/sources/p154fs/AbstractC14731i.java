package p154fs;

import java.security.GeneralSecurityException;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.AbstractC11266d;
import ps.C29501c;

/* JADX INFO: renamed from: fs.i */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC14731i {

    /* JADX INFO: renamed from: a */
    public static final CopyOnWriteArrayList f54473a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: a */
    public static C29501c m42236a(String str) throws GeneralSecurityException {
        for (C29501c c29501c : f54473a) {
            c29501c.getClass();
            if (str.toLowerCase(Locale.US).startsWith("android-keystore://")) {
                return c29501c;
            }
        }
        throw new GeneralSecurityException(AbstractC11266d.m30461o("No KMS client does support: ", str));
    }
}
