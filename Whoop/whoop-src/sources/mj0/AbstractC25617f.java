package mj0;

import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: mj0.f */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0005J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\t\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\n"}, m65681d2 = {"Lmj0/f;", "", "", "macAddress", "a", "(Ljava/lang/String;)Ljava/lang/String;", "d", "", "c", "(Ljava/lang/String;)I", "whoop-ble-api"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25617f {
    /* JADX INFO: renamed from: a */
    public static String m75347a(String macAddress) {
        AbstractC22676k.m65750j(macAddress, "macAddress");
        return macAddress;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m75348b(String str, String str2) {
        return AbstractC22676k.m65745e(str, str2);
    }

    /* JADX INFO: renamed from: c */
    public static int m75349c(String str) {
        return str.hashCode();
    }

    /* JADX INFO: renamed from: d */
    public static String m75350d(String str) {
        return AbstractC11895b.m31996o("ScanAddress(macAddress=", str, ")");
    }
}
