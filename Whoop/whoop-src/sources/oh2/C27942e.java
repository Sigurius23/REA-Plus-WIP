package oh2;

import ih0.AbstractC18489d0;
import java.nio.ByteBuffer;
import uk0.AbstractC35049c;
import uk0.C35048b;

/* JADX INFO: renamed from: oh2.e */
/* JADX INFO: loaded from: classes4.dex */
public class C27942e {

    /* JADX INFO: renamed from: a */
    private short f112708a;

    /* JADX INFO: renamed from: b */
    private short f112709b;

    /* JADX INFO: renamed from: c */
    private short f112710c;

    /* JADX INFO: renamed from: oh2.e$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private short f112711a;

        /* JADX INFO: renamed from: b */
        private short f112712b;

        /* JADX INFO: renamed from: c */
        private short f112713c;

        /* JADX INFO: renamed from: a */
        public C27942e m84361a() {
            return new C27942e(this.f112711a, this.f112712b, this.f112713c);
        }

        /* JADX INFO: renamed from: b */
        public a m84362b(short s13) {
            this.f112711a = s13;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m84363c(short s13) {
            this.f112712b = s13;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m84364d(short s13) {
            this.f112713c = s13;
            return this;
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("SigProcVersion.SigProcVersionBuilder(major=");
            sb4.append((int) this.f112711a);
            sb4.append(", minor=");
            sb4.append((int) this.f112712b);
            sb4.append(", patch=");
            return AbstractC18489d0.m53371l(sb4, this.f112713c, ")");
        }
    }

    public C27942e(short s13, short s14, short s15) {
        this.f112708a = s13;
        this.f112709b = s14;
        this.f112710c = s15;
    }

    /* JADX INFO: renamed from: a */
    public static a m84355a() {
        return new a();
    }

    /* JADX INFO: renamed from: b */
    public static C27942e m84356b(ByteBuffer byteBuffer) {
        return m84355a().m84362b(C35048b.m110782b(byteBuffer.get())).m84363c(C35048b.m110782b(byteBuffer.get())).m84364d(C35048b.m110782b(byteBuffer.get())).m84361a();
    }

    /* JADX INFO: renamed from: c */
    public short m84357c() {
        return this.f112708a;
    }

    /* JADX INFO: renamed from: d */
    public short m84358d() {
        return this.f112709b;
    }

    /* JADX INFO: renamed from: e */
    public short m84359e() {
        return this.f112710c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C27942e)) {
            C27942e c27942e = (C27942e) obj;
            if (this.f112710c == c27942e.f112710c && this.f112709b == c27942e.f112709b && this.f112708a == c27942e.f112708a) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public String m84360f() {
        return AbstractC35049c.m110788b(this.f112708a, this.f112709b, this.f112710c);
    }

    public int hashCode() {
        return (((this.f112708a * 31) + this.f112709b) * 31) + this.f112710c;
    }
}
