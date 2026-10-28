package mj0;

import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: mj0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0005J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0012"}, m65681d2 = {"Lmj0/d;", "", "", "value", "b", "(Ljava/lang/String;)Ljava/lang/String;", "f", "", "e", "(Ljava/lang/String;)I", "other", "", "c", "(Ljava/lang/String;Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "whoop-ble-api"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25615d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String value;

    private /* synthetic */ C25615d(String str) {
        this.value = str;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C25615d m75336a(String str) {
        return new C25615d(str);
    }

    /* JADX INFO: renamed from: b */
    public static String m75337b(String value) {
        AbstractC22676k.m65750j(value, "value");
        return value;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m75338c(String str, Object obj) {
        return (obj instanceof C25615d) && AbstractC22676k.m65745e(str, ((C25615d) obj).getValue());
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m75339d(String str, String str2) {
        return AbstractC22676k.m65745e(str, str2);
    }

    /* JADX INFO: renamed from: e */
    public static int m75340e(String str) {
        return str.hashCode();
    }

    /* JADX INFO: renamed from: f */
    public static String m75341f(String str) {
        return AbstractC11895b.m31996o("DeviceId(value=", str, ")");
    }

    public boolean equals(Object obj) {
        return m75338c(this.value, obj);
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final /* synthetic */ String getValue() {
        return this.value;
    }

    public int hashCode() {
        return m75340e(this.value);
    }

    public String toString() {
        return m75341f(this.value);
    }
}
