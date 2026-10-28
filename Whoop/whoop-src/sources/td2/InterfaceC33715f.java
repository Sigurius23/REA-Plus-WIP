package td2;

import androidx.core.app.NotificationCompat;
import com.whoop.navigation.C9598e;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: td2.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\u0002\f\r¨\u0006\u000eÀ\u0006\u0003"}, m65681d2 = {"Ltd2/f;", "", "j", "e", "d", "b", "g", "a", "f", "c", "i", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ltd2/f$f;", "Ltd2/f$j;", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC33715f {

    /* JADX INFO: renamed from: td2.f$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Ltd2/f$a;", "Ltd2/f$j;", "", "historyDate", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements j {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String historyDate;

        public a(String historyDate) {
            AbstractC22676k.m65750j(historyDate, "historyDate");
            this.historyDate = historyDate;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getHistoryDate() {
            return this.historyDate;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.historyDate, ((a) other).historyDate);
        }

        public int hashCode() {
            return this.historyDate.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("ClearHistoryByDate(historyDate=", this.historyDate, ")");
        }
    }

    /* JADX INFO: renamed from: td2.f$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ltd2/f$b;", "Ltd2/f$j;", "<init>", "()V", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements j {

        /* JADX INFO: renamed from: a */
        public static final b f140966a = new b();

        private b() {
        }
    }

    /* JADX INFO: renamed from: td2.f$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ltd2/f$c;", "Ltd2/f$f;", "<init>", "()V", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements f {

        /* JADX INFO: renamed from: a */
        public static final c f140967a = new c();

        private c() {
        }
    }

    /* JADX INFO: renamed from: td2.f$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ltd2/f$d;", "Ltd2/f$j;", "<init>", "()V", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements j {

        /* JADX INFO: renamed from: a */
        public static final d f140968a = new d();

        private d() {
        }
    }

    /* JADX INFO: renamed from: td2.f$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ltd2/f$e;", "Ltd2/f$j;", "<init>", "()V", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements j {

        /* JADX INFO: renamed from: a */
        public static final e f140969a = new e();

        private e() {
        }
    }

    /* JADX INFO: renamed from: td2.f$f */
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0003\u0002\u0003\u0004¨\u0006\u0005À\u0006\u0003"}, m65681d2 = {"Ltd2/f$f;", "Ltd2/f;", "Ltd2/f$c;", "Ltd2/f$h;", "Ltd2/f$i;", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface f extends InterfaceC33715f {
    }

    /* JADX INFO: renamed from: td2.f$g */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Ltd2/f$g;", "Ltd2/f$j;", "", "historyDate", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g implements j {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String historyDate;

        public g(String historyDate) {
            AbstractC22676k.m65750j(historyDate, "historyDate");
            this.historyDate = historyDate;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getHistoryDate() {
            return this.historyDate;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof g) && AbstractC22676k.m65745e(this.historyDate, ((g) other).historyDate);
        }

        public int hashCode() {
            return this.historyDate.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("StartClearHistoryByDate(historyDate=", this.historyDate, ")");
        }
    }

    /* JADX INFO: renamed from: td2.f$h */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Ltd2/f$h;", "Ltd2/f$f;", "Lcom/whoop/navigation/e;", NotificationCompat.CATEGORY_NAVIGATION, "<init>", "(Lcom/whoop/navigation/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h implements f {

        /* JADX INFO: renamed from: b */
        public static final int f140971b = C9598e.f28134d;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C9598e navigation;

        public h(C9598e navigation) {
            AbstractC22676k.m65750j(navigation, "navigation");
            this.navigation = navigation;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C9598e getNavigation() {
            return this.navigation;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof h) && AbstractC22676k.m65745e(this.navigation, ((h) other).navigation);
        }

        public int hashCode() {
            return this.navigation.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106650i("ToLabradorNewRecording(navigation=", this.navigation, ")");
        }
    }

    /* JADX INFO: renamed from: td2.f$i */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ltd2/f$i;", "Ltd2/f$f;", "<init>", "()V", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements f {

        /* JADX INFO: renamed from: a */
        public static final i f140973a = new i();

        private i() {
        }
    }

    /* JADX INFO: renamed from: td2.f$j */
    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Ltd2/f$j;", "Ltd2/f;", "Ltd2/f$a;", "Ltd2/f$b;", "Ltd2/f$d;", "Ltd2/f$e;", "Ltd2/f$g;", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface j extends InterfaceC33715f {
    }
}
