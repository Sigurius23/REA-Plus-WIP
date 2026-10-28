package il1;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: il1.q */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, m65681d2 = {"Lil1/q;", "", "b", "d", "a", "c", "Lil1/q$a;", "Lil1/q$b;", "Lil1/q$c;", "Lil1/q$d;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC18640q {

    /* JADX INFO: renamed from: il1.q$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lil1/q$a;", "Lil1/q;", "Lil1/n;", "homeData", "", "networkError", "<init>", "(Lil1/n;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lil1/n;", "()Lil1/n;", "b", "Z", "()Z", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC18640q {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C18637n homeData;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean networkError;

        public a(C18637n homeData, boolean z4) {
            AbstractC22676k.m65750j(homeData, "homeData");
            this.homeData = homeData;
            this.networkError = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C18637n getHomeData() {
            return this.homeData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getNetworkError() {
            return this.networkError;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.homeData, aVar.homeData) && this.networkError == aVar.networkError;
        }

        public int hashCode() {
            return Boolean.hashCode(this.networkError) + (this.homeData.hashCode() * 31);
        }

        public String toString() {
            return "Error(homeData=" + this.homeData + ", networkError=" + this.networkError + ")";
        }
    }

    /* JADX INFO: renamed from: il1.q$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lil1/q$b;", "Lil1/q;", "<init>", "()V", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC18640q {

        /* JADX INFO: renamed from: a */
        public static final b f72970a = new b();

        private b() {
        }
    }

    /* JADX INFO: renamed from: il1.q$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lil1/q$c;", "Lil1/q;", "Lil1/n;", "homeData", "<init>", "(Lil1/n;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lil1/n;", "()Lil1/n;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC18640q {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C18637n homeData;

        public c(C18637n homeData) {
            AbstractC22676k.m65750j(homeData, "homeData");
            this.homeData = homeData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C18637n getHomeData() {
            return this.homeData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && AbstractC22676k.m65745e(this.homeData, ((c) other).homeData);
        }

        public int hashCode() {
            return this.homeData.hashCode();
        }

        public String toString() {
            return "Result(homeData=" + this.homeData + ")";
        }
    }

    /* JADX INFO: renamed from: il1.q$d */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lil1/q$d;", "Lil1/q;", "Lil1/n;", "homeData", "<init>", "(Lil1/n;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lil1/n;", "()Lil1/n;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d implements InterfaceC18640q {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C18637n homeData;

        public d(C18637n homeData) {
            AbstractC22676k.m65750j(homeData, "homeData");
            this.homeData = homeData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C18637n getHomeData() {
            return this.homeData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && AbstractC22676k.m65745e(this.homeData, ((d) other).homeData);
        }

        public int hashCode() {
            return this.homeData.hashCode();
        }

        public String toString() {
            return "Updating(homeData=" + this.homeData + ")";
        }
    }
}
