package p218ic;

import android.net.NetworkRequest;
import java.util.Set;
import m83.C25235a0;
import p319m4.AbstractC25012a;
import p457rc.C31222e;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ic.e */
/* JADX INFO: loaded from: classes.dex */
public final class C18354e {

    /* JADX INFO: renamed from: j */
    public static final C18354e f71464j = new C18354e();

    /* JADX INFO: renamed from: a */
    public final EnumC18390x f71465a;

    /* JADX INFO: renamed from: b */
    public final C31222e f71466b;

    /* JADX INFO: renamed from: c */
    public final boolean f71467c;

    /* JADX INFO: renamed from: d */
    public final boolean f71468d;

    /* JADX INFO: renamed from: e */
    public final boolean f71469e;

    /* JADX INFO: renamed from: f */
    public final boolean f71470f;

    /* JADX INFO: renamed from: g */
    public final long f71471g;

    /* JADX INFO: renamed from: h */
    public final long f71472h;

    /* JADX INFO: renamed from: i */
    public final Set f71473i;

    public C18354e() {
        EnumC18390x enumC18390x = EnumC18390x.f71560w;
        this.f71466b = new C31222e(null);
        this.f71465a = enumC18390x;
        this.f71467c = false;
        this.f71468d = false;
        this.f71469e = false;
        this.f71470f = false;
        this.f71471g = -1L;
        this.f71472h = -1L;
        this.f71473i = C25235a0.f99113w;
    }

    /* JADX INFO: renamed from: a */
    public final NetworkRequest m52856a() {
        return (NetworkRequest) this.f71466b.f128599a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m52857b() {
        return !this.f71473i.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C18354e.class.equals(obj.getClass())) {
            return false;
        }
        C18354e c18354e = (C18354e) obj;
        if (this.f71467c == c18354e.f71467c && this.f71468d == c18354e.f71468d && this.f71469e == c18354e.f71469e && this.f71470f == c18354e.f71470f && this.f71471g == c18354e.f71471g && this.f71472h == c18354e.f71472h && AbstractC22676k.m65745e(m52856a(), c18354e.m52856a()) && this.f71465a == c18354e.f71465a) {
            return AbstractC22676k.m65745e(this.f71473i, c18354e.f71473i);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.f71465a.hashCode() * 31) + (this.f71467c ? 1 : 0)) * 31) + (this.f71468d ? 1 : 0)) * 31) + (this.f71469e ? 1 : 0)) * 31) + (this.f71470f ? 1 : 0)) * 31;
        long j7 = this.f71471g;
        int i13 = (iHashCode + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j13 = this.f71472h;
        int iM73368a = AbstractC25012a.m73368a(this.f71473i, (i13 + ((int) (j13 ^ (j13 >>> 32)))) * 31, 31);
        NetworkRequest networkRequestM52856a = m52856a();
        return iM73368a + (networkRequestM52856a != null ? networkRequestM52856a.hashCode() : 0);
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + this.f71465a + ", requiresCharging=" + this.f71467c + ", requiresDeviceIdle=" + this.f71468d + ", requiresBatteryNotLow=" + this.f71469e + ", requiresStorageNotLow=" + this.f71470f + ", contentTriggerUpdateDelayMillis=" + this.f71471g + ", contentTriggerMaxDelayMillis=" + this.f71472h + ", contentUriTriggers=" + this.f71473i + ", }";
    }

    public C18354e(C31222e c31222e, EnumC18390x enumC18390x, boolean z4, boolean z13, boolean z14, boolean z15, long j7, long j13, Set set) {
        this.f71466b = c31222e;
        this.f71465a = enumC18390x;
        this.f71467c = z4;
        this.f71468d = z13;
        this.f71469e = z14;
        this.f71470f = z15;
        this.f71471g = j7;
        this.f71472h = j13;
        this.f71473i = set;
    }

    public C18354e(C18354e other) {
        AbstractC22676k.m65750j(other, "other");
        this.f71467c = other.f71467c;
        this.f71468d = other.f71468d;
        this.f71466b = other.f71466b;
        this.f71465a = other.f71465a;
        this.f71469e = other.f71469e;
        this.f71470f = other.f71470f;
        this.f71473i = other.f71473i;
        this.f71471g = other.f71471g;
        this.f71472h = other.f71472h;
    }
}
