package fk2;

import org.joda.time.DateTimeUtils;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import p000.AbstractC11266d;

/* JADX INFO: renamed from: fk2.a */
/* JADX INFO: loaded from: classes4.dex */
public class C14554a implements Comparable<C14554a> {

    /* JADX INFO: renamed from: y */
    private static final DateTimeFormatter f53188y = DateTimeFormat.forPattern("k:mm:ss.SSS");

    /* JADX INFO: renamed from: z */
    private static final DateTimeFormatter f53189z = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ssZ");

    /* JADX INFO: renamed from: w */
    private long f53190w;

    /* JADX INFO: renamed from: x */
    private long f53191x;

    /* JADX INFO: renamed from: fk2.a$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f53192a;

        static {
            int[] iArr = new int[c.values().length];
            f53192a = iArr;
            try {
                iArr[c.MILLIS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53192a[c.SUBSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: fk2.a$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        private long f53193a;

        /* JADX INFO: renamed from: b */
        private long f53194b;

        public b(long j7, long j13) {
            this.f53193a = j7;
            this.f53194b = j13;
        }

        /* JADX INFO: renamed from: e */
        public void m41588e() {
            long j7 = this.f53194b;
            if (j7 > 32768) {
                this.f53193a = (long) (Math.floor(j7 / 32768.0d) + this.f53193a);
                this.f53194b %= 32768;
            }
        }

        /* JADX INFO: renamed from: f */
        public long m41589f() {
            return this.f53193a;
        }

        /* JADX INFO: renamed from: g */
        public long m41590g() {
            return this.f53194b;
        }

        public String toString() {
            return "seconds=" + this.f53193a + ", sub-seconds=" + this.f53194b;
        }
    }

    /* JADX INFO: renamed from: fk2.a$c */
    public enum c {
        MILLIS,
        SUBSECONDS
    }

    public C14554a(long j7, long j13) {
        this.f53190w = j7;
        this.f53191x = j13;
    }

    /* JADX INFO: renamed from: g */
    public static C14554a m41574g() {
        return new C14554a();
    }

    /* JADX INFO: renamed from: a */
    public boolean m41575a(Object obj) {
        return obj instanceof C14554a;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14554a c14554a) {
        long j7 = this.f53190w;
        long j13 = c14554a.f53190w;
        if (j7 > j13) {
            return 1;
        }
        if (j7 < j13) {
            return -1;
        }
        long j14 = this.f53191x;
        long j15 = c14554a.f53191x;
        if (j14 > j15) {
            return 1;
        }
        return j14 == j15 ? -1 : 0;
    }

    /* JADX INFO: renamed from: c */
    public b m41577c(C14554a c14554a) {
        b bVarM41578d = m41578d(c14554a);
        if (bVarM41578d.m41589f() >= 0 && bVarM41578d.m41590g() >= 0) {
            return bVarM41578d;
        }
        bVarM41578d.f53193a = -bVarM41578d.f53193a;
        bVarM41578d.f53194b = (short) (-bVarM41578d.f53194b);
        return bVarM41578d;
    }

    /* JADX INFO: renamed from: d */
    public b m41578d(C14554a c14554a) {
        C14554a c14554a2;
        C14554a c14554a3;
        if (compareTo(c14554a) > 0) {
            c14554a3 = this;
            c14554a2 = c14554a;
        } else {
            c14554a2 = this;
            c14554a3 = c14554a;
        }
        long j7 = c14554a3.f53190w - c14554a2.f53190w;
        long j13 = (short) (c14554a3.f53191x - c14554a2.f53191x);
        if (j13 < 0) {
            j7--;
            j13 += 32768;
        }
        if (c14554a3 == c14554a) {
            j7 = -j7;
            j13 = (short) (-j13);
        }
        b bVar = new b(j7, j13);
        bVar.m41588e();
        return bVar;
    }

    /* JADX INFO: renamed from: e */
    public long m41579e() {
        return this.f53191x;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C14554a)) {
            return false;
        }
        C14554a c14554a = (C14554a) obj;
        return c14554a.m41575a(this) && m41580f() == c14554a.m41580f() && m41579e() == c14554a.m41579e();
    }

    /* JADX INFO: renamed from: f */
    public long m41580f() {
        return this.f53190w;
    }

    /* JADX INFO: renamed from: h */
    public void m41581h(long j7, c cVar) {
        int i13 = a.f53192a[cVar.ordinal()];
        if (i13 == 1) {
            this.f53190w = (int) (j7 / 1000);
            this.f53191x = (short) (((j7 % 1000) * 32768) / 1000);
        } else {
            if (i13 != 2) {
                return;
            }
            this.f53190w = (int) (j7 / 32768);
            this.f53191x = (short) (j7 % 32768);
        }
    }

    public int hashCode() {
        long jM41580f = m41580f();
        int i13 = ((int) (jM41580f ^ (jM41580f >>> 32))) + 59;
        long jM41579e = m41579e();
        return (i13 * 59) + ((int) ((jM41579e >>> 32) ^ jM41579e));
    }

    /* JADX INFO: renamed from: i */
    public String m41582i() {
        return f53189z.print(m41583j());
    }

    /* JADX INFO: renamed from: j */
    public long m41583j() {
        return Math.round(((this.f53191x * 1000.0d) / 32768.0d) + (this.f53190w * 1000.0d));
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("TimeStamp(Time=");
        sb4.append(f53188y.print(m41583j()));
        sb4.append(", wholeSeconds=");
        sb4.append(this.f53190w);
        sb4.append(", subseconds=");
        return AbstractC11266d.m30457k(this.f53191x, ")", sb4);
    }

    public C14554a() {
        this(DateTimeUtils.currentTimeMillis(), c.MILLIS);
    }

    public C14554a(long j7, c cVar) {
        m41581h(j7, cVar);
    }
}
