package p210i4;

import java.util.Arrays;
import java.util.Objects;
import p000.AbstractC11266d;

/* JADX INFO: renamed from: i4.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC18061c implements Cloneable {

    /* JADX INFO: renamed from: w */
    public final char[] f70146w;

    /* JADX INFO: renamed from: x */
    public long f70147x = -1;

    /* JADX INFO: renamed from: y */
    public long f70148y = Long.MAX_VALUE;

    /* JADX INFO: renamed from: z */
    public AbstractC18060b f70149z;

    public AbstractC18061c(char[] cArr) {
        this.f70146w = cArr;
    }

    @Override // 
    /* JADX INFO: renamed from: a */
    public AbstractC18061c clone() {
        try {
            return (AbstractC18061c) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m51906c() {
        String str = new String(this.f70146w);
        if (str.length() < 1) {
            return "";
        }
        long j7 = this.f70148y;
        if (j7 != Long.MAX_VALUE) {
            long j13 = this.f70147x;
            if (j7 >= j13) {
                return str.substring((int) j13, ((int) j7) + 1);
            }
        }
        long j14 = this.f70147x;
        return str.substring((int) j14, ((int) j14) + 1);
    }

    /* JADX INFO: renamed from: d */
    public float mo51907d() {
        if (this instanceof C18063e) {
            return ((C18063e) this).mo51907d();
        }
        return Float.NaN;
    }

    /* JADX INFO: renamed from: e */
    public int mo51908e() {
        if (this instanceof C18063e) {
            return ((C18063e) this).mo51908e();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC18061c)) {
            return false;
        }
        AbstractC18061c abstractC18061c = (AbstractC18061c) obj;
        if (this.f70147x == abstractC18061c.f70147x && this.f70148y == abstractC18061c.f70148y && Arrays.equals(this.f70146w, abstractC18061c.f70146w)) {
            return Objects.equals(this.f70149z, abstractC18061c.f70149z);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final String m51909f() {
        String string = getClass().toString();
        return string.substring(string.lastIndexOf(46) + 1);
    }

    /* JADX INFO: renamed from: g */
    public final void m51910g(long j7) {
        if (this.f70148y != Long.MAX_VALUE) {
            return;
        }
        this.f70148y = j7;
        AbstractC18060b abstractC18060b = this.f70149z;
        if (abstractC18060b != null) {
            abstractC18060b.m51893j(this);
        }
    }

    public int hashCode() {
        int iHashCode = Arrays.hashCode(this.f70146w) * 31;
        long j7 = this.f70147x;
        int i13 = (iHashCode + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j13 = this.f70148y;
        int i14 = (i13 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        AbstractC18060b abstractC18060b = this.f70149z;
        return (i14 + (abstractC18060b != null ? abstractC18060b.hashCode() : 0)) * 31;
    }

    public String toString() {
        long j7 = this.f70147x;
        long j13 = this.f70148y;
        if (j7 > j13 || j13 == Long.MAX_VALUE) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(getClass());
            sb4.append(" (INVALID, ");
            sb4.append(this.f70147x);
            sb4.append("-");
            return AbstractC11266d.m30457k(this.f70148y, ")", sb4);
        }
        return m51909f() + " (" + this.f70147x + " : " + this.f70148y + ") <<" + new String(this.f70146w).substring((int) this.f70147x, ((int) this.f70148y) + 1) + ">>";
    }
}
