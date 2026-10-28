package p516u8;

import java.util.HashSet;

/* JADX INFO: renamed from: u8.y */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC34628y {

    /* JADX INFO: renamed from: a */
    public static final HashSet f145872a = new HashSet();

    /* JADX INFO: renamed from: b */
    public static String f145873b = "media3.common";

    /* JADX INFO: renamed from: a */
    public static synchronized void m109420a(String str) {
        if (f145872a.add(str)) {
            f145873b += ", " + str;
        }
    }
}
