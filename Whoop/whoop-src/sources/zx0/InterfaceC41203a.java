package zx0;

import com.mapbox.common.HttpHeaders;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import tu1.C34188a;

/* JADX INFO: renamed from: zx0.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0002\b\t¨\u0006\nÀ\u0006\u0003"}, m65681d2 = {"Lzx0/a;", "", "c", "d", "e", "f", "a", "b", "Lzx0/a$a;", "Lzx0/a$c;", "deep-dive_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC41203a {

    /* JADX INFO: renamed from: zx0.a$a */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0001\u0002¨\u0006\u0003À\u0006\u0003"}, m65681d2 = {"Lzx0/a$a;", "Lzx0/a;", "Lzx0/a$b;", "deep-dive_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface a extends InterfaceC41203a {
    }

    /* JADX INFO: renamed from: zx0.a$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lzx0/a$b;", "Lzx0/a$a;", "Ltu1/a;", "state", "<init>", "(Ltu1/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ltu1/a;", "()Ltu1/a;", "deep-dive_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements a {

        /* JADX INFO: renamed from: b */
        public static final int f177772b = C34188a.f143397d;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C34188a state;

        public b(C34188a c34188a) {
            this.state = c34188a;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C34188a getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.state, ((b) other).state);
        }

        public int hashCode() {
            C34188a c34188a = this.state;
            if (c34188a == null) {
                return 0;
            }
            return c34188a.hashCode();
        }

        public String toString() {
            return "BottomSheetContent(state=" + this.state + ")";
        }
    }

    /* JADX INFO: renamed from: zx0.a$c */
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0003\u0002\u0003\u0004¨\u0006\u0005À\u0006\u0003"}, m65681d2 = {"Lzx0/a$c;", "Lzx0/a;", "Lzx0/a$d;", "Lzx0/a$e;", "Lzx0/a$f;", "deep-dive_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface c extends InterfaceC41203a {
    }

    /* JADX INFO: renamed from: zx0.a$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lzx0/a$d;", "Lzx0/a$c;", "<init>", "()V", "deep-dive_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements c {

        /* JADX INFO: renamed from: a */
        public static final d f177774a = new d();

        private d() {
        }
    }

    /* JADX INFO: renamed from: zx0.a$e */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lzx0/a$e;", "Lzx0/a$c;", "", "pillar", HttpHeaders.DATE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "deep-dive_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e implements c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String pillar;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String date;

        public e(String pillar, String str) {
            AbstractC22676k.m65750j(pillar, "pillar");
            this.pillar = pillar;
            this.date = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getPillar() {
            return this.pillar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.pillar, eVar.pillar) && AbstractC22676k.m65745e(this.date, eVar.date);
        }

        public int hashCode() {
            int iHashCode = this.pillar.hashCode() * 31;
            String str = this.date;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return AbstractC2875y.m8300m("NetworkError(pillar=", this.pillar, ", date=", this.date, ")");
        }
    }

    /* JADX INFO: renamed from: zx0.a$f */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lzx0/a$f;", "Lzx0/a$c;", "", "pillar", HttpHeaders.DATE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "deep-dive_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f implements c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String pillar;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String date;

        public f(String pillar, String str) {
            AbstractC22676k.m65750j(pillar, "pillar");
            this.pillar = pillar;
            this.date = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getPillar() {
            return this.pillar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof f)) {
                return false;
            }
            f fVar = (f) other;
            return AbstractC22676k.m65745e(this.pillar, fVar.pillar) && AbstractC22676k.m65745e(this.date, fVar.date);
        }

        public int hashCode() {
            int iHashCode = this.pillar.hashCode() * 31;
            String str = this.date;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return AbstractC2875y.m8300m("RequestFailed(pillar=", this.pillar, ", date=", this.date, ")");
        }
    }
}
