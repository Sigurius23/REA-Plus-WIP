package ur1;

import c13.AbstractC3855a;
import com.whoop.data.remote.domain.dto.JournalBounds;
import com.whoop.data.remote.domain.dto.SubtitleCallout;
import com.whoop.design.models.calendar.CalendarDateModel;
import com.whoop.design.models.items.CustomizeBottomSheetSelectorModel;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import h91.C17027b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import nh3.AbstractC26725a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import sr1.C32911c;
import sr1.C32912d;
import sr1.C32915g;
import sr1.C32916h;
import sr1.C32917i;
import sr1.EnumC32914f;
import te0.AbstractC33745d;
import tr1.AbstractC34099c;
import tr1.C34098b;
import wr1.AbstractC37570d;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: ur1.n */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u001b\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u001b\u001f !\"#$%&'()*+,-./0123456789¨\u0006:"}, m65681d2 = {"Lur1/n;", "", "<init>", "()V", "s", "r", "q", "n", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "j", "t", "v", "p", "f", "d", "e", "z", "o", "x", "b", "u", "a0", "m", "a", "l", "k", "i", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "g", "y", "c", "Lur1/n$a;", "Lur1/n$b;", "Lur1/n$c;", "Lur1/n$d;", "Lur1/n$e;", "Lur1/n$f;", "Lur1/n$g;", "Lur1/n$h;", "Lur1/n$i;", "Lur1/n$j;", "Lur1/n$k;", "Lur1/n$l;", "Lur1/n$m;", "Lur1/n$n;", "Lur1/n$o;", "Lur1/n$p;", "Lur1/n$q;", "Lur1/n$r;", "Lur1/n$s;", "Lur1/n$t;", "Lur1/n$u;", "Lur1/n$v;", "Lur1/n$w;", "Lur1/n$x;", "Lur1/n$y;", "Lur1/n$z;", "Lur1/n$a0;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35197n {

    /* JADX INFO: renamed from: ur1.n$a */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lur1/n$a;", "Lur1/n;", "", "", "behaviorTrackerIds", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC35197n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<Integer> behaviorTrackerIds;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<Integer> behaviorTrackerIds) {
            super(null);
            AbstractC22676k.m65750j(behaviorTrackerIds, "behaviorTrackerIds");
            this.behaviorTrackerIds = behaviorTrackerIds;
        }

        /* JADX INFO: renamed from: a */
        public final List<Integer> m111484a() {
            return this.behaviorTrackerIds;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.behaviorTrackerIds, ((a) other).behaviorTrackerIds);
        }

        public int hashCode() {
            return this.behaviorTrackerIds.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106654m("BottomSheetFuzzySearchResult(behaviorTrackerIds=", ")", this.behaviorTrackerIds);
        }
    }

    /* JADX INFO: renamed from: ur1.n$a0 */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lur1/n$a0;", "Lur1/n;", "", "query", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a0 extends AbstractC35197n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String query;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(String query) {
            super(null);
            AbstractC22676k.m65750j(query, "query");
            this.query = query;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getQuery() {
            return this.query;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a0) && AbstractC22676k.m65745e(this.query, ((a0) other).query);
        }

        public int hashCode() {
            return this.query.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("UpdateSearchQuery(query=", this.query, ")");
        }
    }

    /* JADX INFO: renamed from: ur1.n$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, m65681d2 = {"Lur1/n$b;", "Lur1/n;", "", "categoryIndex", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC35197n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int categoryIndex;

        public b(int i13) {
            super(null);
            this.categoryIndex = i13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getCategoryIndex() {
            return this.categoryIndex;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && this.categoryIndex == ((b) other).categoryIndex;
        }

        public int hashCode() {
            return Integer.hashCode(this.categoryIndex);
        }

        public String toString() {
            return AbstractC2875y.m8296i(this.categoryIndex, "ChangeCategory(categoryIndex=", ")");
        }
    }

    /* JADX INFO: renamed from: ur1.n$c */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lur1/n$c;", "Lur1/n;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC35197n {

        /* JADX INFO: renamed from: a */
        public static final c f149641a = new c();

        private c() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof c);
        }

        public int hashCode() {
            return -732950802;
        }

        public String toString() {
            return "ClearOnSaveNavigation";
        }
    }

    /* JADX INFO: renamed from: ur1.n$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lur1/n$d;", "Lur1/n;", "<init>", "()V", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC35197n {

        /* JADX INFO: renamed from: a */
        public static final d f149642a = new d();

        private d() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ur1.n$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lur1/n$e;", "Lur1/n;", "<init>", "()V", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC35197n {

        /* JADX INFO: renamed from: a */
        public static final e f149643a = new e();

        private e() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ur1.n$f */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lur1/n$f;", "Lur1/n;", "<init>", "()V", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC35197n {

        /* JADX INFO: renamed from: a */
        public static final f f149644a = new f();

        private f() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ur1.n$g */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lur1/n$g;", "Lur1/n;", "<init>", "()V", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC35197n {

        /* JADX INFO: renamed from: a */
        public static final g f149645a = new g();

        private g() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ur1.n$h */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lur1/n$h;", "Lur1/n;", "<init>", "()V", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC35197n {

        /* JADX INFO: renamed from: a */
        public static final h f149646a = new h();

        private h() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ur1.n$i */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lur1/n$i;", "Lur1/n;", "Lcom/whoop/navigation/e;", "onSaveDestination", "<init>", "(Lcom/whoop/navigation/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i extends AbstractC35197n {

        /* JADX INFO: renamed from: b */
        public static final int f149647b = C9598e.f28134d;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C9598e onSaveDestination;

        public i(C9598e c9598e) {
            super(null);
            this.onSaveDestination = c9598e;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C9598e getOnSaveDestination() {
            return this.onSaveDestination;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof i) && AbstractC22676k.m65745e(this.onSaveDestination, ((i) other).onSaveDestination);
        }

        public int hashCode() {
            C9598e c9598e = this.onSaveDestination;
            if (c9598e == null) {
                return 0;
            }
            return c9598e.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106650i("SaveCustomizeJournalSuccess(onSaveDestination=", this.onSaveDestination, ")");
        }
    }

    /* JADX INFO: renamed from: ur1.n$j */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lur1/n$j;", "Lur1/n;", "Ltr1/c;", "actionType", "<init>", "(Ltr1/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ltr1/c;", "()Ltr1/c;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class j extends AbstractC35197n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AbstractC34099c actionType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(AbstractC34099c actionType) {
            super(null);
            AbstractC22676k.m65750j(actionType, "actionType");
            this.actionType = actionType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AbstractC34099c getActionType() {
            return this.actionType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof j) && AbstractC22676k.m65745e(this.actionType, ((j) other).actionType);
        }

        public int hashCode() {
            return this.actionType.hashCode();
        }

        public String toString() {
            return "ShowBottomSheet(actionType=" + this.actionType + ")";
        }
    }

    /* JADX INFO: renamed from: ur1.n$k */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lur1/n$k;", "Lur1/n;", "<init>", "()V", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k extends AbstractC35197n {

        /* JADX INFO: renamed from: a */
        public static final k f149650a = new k();

        private k() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ur1.n$l */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lur1/n$l;", "Lur1/n;", "<init>", "()V", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l extends AbstractC35197n {

        /* JADX INFO: renamed from: a */
        public static final l f149651a = new l();

        private l() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ur1.n$m */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lur1/n$m;", "Lur1/n;", "Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;", "bottomSheetSelectorModel", "<init>", "(Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;", "()Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class m extends AbstractC35197n {

        /* JADX INFO: renamed from: b */
        public static final int f149652b = CustomizeBottomSheetSelectorModel.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final CustomizeBottomSheetSelectorModel bottomSheetSelectorModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(CustomizeBottomSheetSelectorModel bottomSheetSelectorModel) {
            super(null);
            AbstractC22676k.m65750j(bottomSheetSelectorModel, "bottomSheetSelectorModel");
            this.bottomSheetSelectorModel = bottomSheetSelectorModel;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CustomizeBottomSheetSelectorModel getBottomSheetSelectorModel() {
            return this.bottomSheetSelectorModel;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof m) && AbstractC22676k.m65745e(this.bottomSheetSelectorModel, ((m) other).bottomSheetSelectorModel);
        }

        public int hashCode() {
            return this.bottomSheetSelectorModel.hashCode();
        }

        public String toString() {
            return "ShowBottomSheetSuccess(bottomSheetSelectorModel=" + this.bottomSheetSelectorModel + ")";
        }
    }

    /* JADX INFO: renamed from: ur1.n$n */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lur1/n$n;", "Lur1/n;", "<init>", "()V", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n extends AbstractC35197n {

        /* JADX INFO: renamed from: a */
        public static final n f149654a = new n();

        private n() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ur1.n$o */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lur1/n$o;", "Lur1/n;", "<init>", "()V", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o extends AbstractC35197n {

        /* JADX INFO: renamed from: a */
        public static final o f149655a = new o();

        private o() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ur1.n$q */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lur1/n$q;", "Lur1/n;", "Lcom/whoop/design/util/TextResource;", "error", "Lsr1/f;", "errorType", "<init>", "(Lcom/whoop/design/util/TextResource;Lsr1/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "b", "Lsr1/f;", "()Lsr1/f;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class q extends AbstractC35197n {

        /* JADX INFO: renamed from: c */
        public static final int f149658c = TextResource.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource error;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC32914f errorType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(TextResource error, EnumC32914f errorType) {
            super(null);
            AbstractC22676k.m65750j(error, "error");
            AbstractC22676k.m65750j(errorType, "errorType");
            this.error = error;
            this.errorType = errorType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextResource getError() {
            return this.error;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EnumC32914f getErrorType() {
            return this.errorType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof q)) {
                return false;
            }
            q qVar = (q) other;
            return AbstractC22676k.m65745e(this.error, qVar.error) && this.errorType == qVar.errorType;
        }

        public int hashCode() {
            return this.errorType.hashCode() + (this.error.hashCode() * 31);
        }

        public String toString() {
            return "ShowError(error=" + this.error + ", errorType=" + this.errorType + ")";
        }
    }

    /* JADX INFO: renamed from: ur1.n$s */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lur1/n$s;", "Lur1/n;", "<init>", "()V", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class s extends AbstractC35197n {

        /* JADX INFO: renamed from: a */
        public static final s f149675a = new s();

        private s() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ur1.n$t */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lur1/n$t;", "Lur1/n;", "<init>", "()V", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class t extends AbstractC35197n {

        /* JADX INFO: renamed from: a */
        public static final t f149676a = new t();

        private t() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ur1.n$u */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lur1/n$u;", "Lur1/n;", "", "id", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class u extends AbstractC35197n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(String id4) {
            super(null);
            AbstractC22676k.m65750j(id4, "id");
            this.id = id4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof u) && AbstractC22676k.m65745e(this.id, ((u) other).id);
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("ToggleItem(id=", this.id, ")");
        }
    }

    /* JADX INFO: renamed from: ur1.n$v */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lur1/n$v;", "Lur1/n;", "<init>", "()V", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class v extends AbstractC35197n {

        /* JADX INFO: renamed from: a */
        public static final v f149678a = new v();

        private v() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ur1.n$w */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lur1/n$w;", "Lur1/n;", "Ltr1/c;", "actionType", "<init>", "(Ltr1/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ltr1/c;", "()Ltr1/c;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class w extends AbstractC35197n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AbstractC34099c actionType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(AbstractC34099c actionType) {
            super(null);
            AbstractC22676k.m65750j(actionType, "actionType");
            this.actionType = actionType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AbstractC34099c getActionType() {
            return this.actionType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof w) && AbstractC22676k.m65745e(this.actionType, ((w) other).actionType);
        }

        public int hashCode() {
            return this.actionType.hashCode();
        }

        public String toString() {
            return "UpdateAnswer(actionType=" + this.actionType + ")";
        }
    }

    /* JADX INFO: renamed from: ur1.n$x */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0004\u0018\u0001`\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0004\u0018\u0001`\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lur1/n$x;", "Lur1/n;", "Lh91/b;", "Lcom/whoop/design/models/calendar/CalendarDateModel;", "Lcom/whoop/design/domain/calendar/CalendarDomainState;", "calendarDomainState", "<init>", "(Lh91/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lh91/b;", "()Lh91/b;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class x extends AbstractC35197n {

        /* JADX INFO: renamed from: b */
        public static final int f149680b = C17027b.f65485k;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C17027b<CalendarDateModel> calendarDomainState;

        public x(C17027b<CalendarDateModel> c17027b) {
            super(null);
            this.calendarDomainState = c17027b;
        }

        /* JADX INFO: renamed from: a */
        public final C17027b<CalendarDateModel> m111508a() {
            return this.calendarDomainState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof x) && AbstractC22676k.m65745e(this.calendarDomainState, ((x) other).calendarDomainState);
        }

        public int hashCode() {
            C17027b<CalendarDateModel> c17027b = this.calendarDomainState;
            if (c17027b == null) {
                return 0;
            }
            return c17027b.hashCode();
        }

        public String toString() {
            return "UpdateCalendar(calendarDomainState=" + this.calendarDomainState + ")";
        }
    }

    /* JADX INFO: renamed from: ur1.n$y */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lur1/n$y;", "Lur1/n;", "Lwr1/d;", "datePickerDomainState", "<init>", "(Lwr1/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwr1/d;", "()Lwr1/d;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class y extends AbstractC35197n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AbstractC37570d datePickerDomainState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(AbstractC37570d datePickerDomainState) {
            super(null);
            AbstractC22676k.m65750j(datePickerDomainState, "datePickerDomainState");
            this.datePickerDomainState = datePickerDomainState;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AbstractC37570d getDatePickerDomainState() {
            return this.datePickerDomainState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof y) && AbstractC22676k.m65745e(this.datePickerDomainState, ((y) other).datePickerDomainState);
        }

        public int hashCode() {
            return this.datePickerDomainState.hashCode();
        }

        public String toString() {
            return "UpdateDatePicker(datePickerDomainState=" + this.datePickerDomainState + ")";
        }
    }

    /* JADX INFO: renamed from: ur1.n$z */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lur1/n$z;", "Lur1/n;", "", "toggleValue", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class z extends AbstractC35197n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean toggleValue;

        public z(boolean z4) {
            super(null);
            this.toggleValue = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getToggleValue() {
            return this.toggleValue;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof z) && this.toggleValue == ((z) other).toggleValue;
        }

        public int hashCode() {
            return Boolean.hashCode(this.toggleValue);
        }

        public String toString() {
            return AbstractC3855a.m11827k("UpdateDefaults(toggleValue=", ")", this.toggleValue);
        }
    }

    public /* synthetic */ AbstractC35197n(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC35197n() {
    }

    /* JADX INFO: renamed from: ur1.n$p */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lur1/n$p;", "Lur1/n;", "Lsr1/d;", "exitDialogConfirmation", "", "shouldExitNow", "<init>", "(Lsr1/d;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lsr1/d;", "()Lsr1/d;", "b", "Z", "getShouldExitNow", "()Z", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class p extends AbstractC35197n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C32912d exitDialogConfirmation;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean shouldExitNow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(C32912d exitDialogConfirmation, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(exitDialogConfirmation, "exitDialogConfirmation");
            this.exitDialogConfirmation = exitDialogConfirmation;
            this.shouldExitNow = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C32912d getExitDialogConfirmation() {
            return this.exitDialogConfirmation;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof p)) {
                return false;
            }
            p pVar = (p) other;
            return AbstractC22676k.m65745e(this.exitDialogConfirmation, pVar.exitDialogConfirmation) && this.shouldExitNow == pVar.shouldExitNow;
        }

        public int hashCode() {
            return Boolean.hashCode(this.shouldExitNow) + (this.exitDialogConfirmation.hashCode() * 31);
        }

        public String toString() {
            return "ShowDismissConfirmationDialog(exitDialogConfirmation=" + this.exitDialogConfirmation + ", shouldExitNow=" + this.shouldExitNow + ")";
        }

        public /* synthetic */ p(C32912d c32912d, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(c32912d, (i13 & 2) != 0 ? false : z4);
        }
    }

    /* JADX INFO: renamed from: ur1.n$r */
    @Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b(\b\u0087\b\u0018\u00002\u00020\u0001B¡\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b1\u00103R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b8\u00105\u001a\u0004\b9\u00107R\u0017\u0010\u000e\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b:\u0010+\u001a\u0004\b4\u0010\u001fR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b,\u0010;\u001a\u0004\b8\u0010<R\u0017\u0010\u0011\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b=\u0010+\u001a\u0004\b=\u0010\u001fR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b6\u0010>\u001a\u0004\b*\u0010?R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b9\u0010@\u001a\u0004\bA\u0010BR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bA\u0010C\u001a\u0004\b-\u0010DR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\b:\u0010GR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bE\u0010J¨\u0006K"}, m65681d2 = {"Lur1/n$r;", "Lur1/n;", "", "Ltr1/b;", "behaviors", "", "notes", "Lsr1/h;", "bottomSheetInfo", "Lsr1/c;", "defaultAnswers", "", "shouldExitNow", "showGradient", "headerText", "Lcom/whoop/data/remote/domain/dto/JournalBounds;", "journalBounds", "requestDate", "", "cycleId", "Lcom/whoop/data/remote/domain/dto/SubtitleCallout;", "subtitleCallout", "Lur1/d;", "datePickerDomainState", "Lsr1/g;", "navigationButton", "Lsr1/i;", "talkTextWidget", "<init>", "(Ljava/util/List;Ljava/lang/String;Lsr1/h;Lsr1/c;ZZLjava/lang/String;Lcom/whoop/data/remote/domain/dto/JournalBounds;Ljava/lang/String;JLcom/whoop/data/remote/domain/dto/SubtitleCallout;Lur1/d;Lsr1/g;Lsr1/i;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/lang/String;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "c", "Lsr1/h;", "getBottomSheetInfo", "()Lsr1/h;", "d", "Lsr1/c;", "()Lsr1/c;", "e", "Z", "j", "()Z", "f", "k", "g", "Lcom/whoop/data/remote/domain/dto/JournalBounds;", "()Lcom/whoop/data/remote/domain/dto/JournalBounds;", "i", "J", "()J", "Lcom/whoop/data/remote/domain/dto/SubtitleCallout;", "l", "()Lcom/whoop/data/remote/domain/dto/SubtitleCallout;", "Lur1/d;", "()Lur1/d;", "m", "Lsr1/g;", "()Lsr1/g;", "n", "Lsr1/i;", "()Lsr1/i;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class r extends AbstractC35197n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<C34098b> behaviors;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String notes;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C32916h bottomSheetInfo;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final C32911c defaultAnswers;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final boolean shouldExitNow;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final boolean showGradient;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String headerText;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final JournalBounds journalBounds;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final String requestDate;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final long cycleId;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final SubtitleCallout subtitleCallout;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        private final C35187d datePickerDomainState;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        private final C32915g navigationButton;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        private final C32917i talkTextWidget;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(List<C34098b> behaviors, String notes, C32916h c32916h, C32911c defaultAnswers, boolean z4, boolean z13, String headerText, JournalBounds journalBounds, String requestDate, long j7, SubtitleCallout subtitleCallout, C35187d c35187d, C32915g c32915g, C32917i c32917i) {
            super(null);
            AbstractC22676k.m65750j(behaviors, "behaviors");
            AbstractC22676k.m65750j(notes, "notes");
            AbstractC22676k.m65750j(defaultAnswers, "defaultAnswers");
            AbstractC22676k.m65750j(headerText, "headerText");
            AbstractC22676k.m65750j(requestDate, "requestDate");
            this.behaviors = behaviors;
            this.notes = notes;
            this.bottomSheetInfo = c32916h;
            this.defaultAnswers = defaultAnswers;
            this.shouldExitNow = z4;
            this.showGradient = z13;
            this.headerText = headerText;
            this.journalBounds = journalBounds;
            this.requestDate = requestDate;
            this.cycleId = j7;
            this.subtitleCallout = subtitleCallout;
            this.datePickerDomainState = c35187d;
            this.navigationButton = c32915g;
            this.talkTextWidget = c32917i;
        }

        /* JADX INFO: renamed from: a */
        public final List<C34098b> m111493a() {
            return this.behaviors;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getCycleId() {
            return this.cycleId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C35187d getDatePickerDomainState() {
            return this.datePickerDomainState;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final C32911c getDefaultAnswers() {
            return this.defaultAnswers;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getHeaderText() {
            return this.headerText;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof r)) {
                return false;
            }
            r rVar = (r) other;
            return AbstractC22676k.m65745e(this.behaviors, rVar.behaviors) && AbstractC22676k.m65745e(this.notes, rVar.notes) && AbstractC22676k.m65745e(this.bottomSheetInfo, rVar.bottomSheetInfo) && AbstractC22676k.m65745e(this.defaultAnswers, rVar.defaultAnswers) && this.shouldExitNow == rVar.shouldExitNow && this.showGradient == rVar.showGradient && AbstractC22676k.m65745e(this.headerText, rVar.headerText) && AbstractC22676k.m65745e(this.journalBounds, rVar.journalBounds) && AbstractC22676k.m65745e(this.requestDate, rVar.requestDate) && this.cycleId == rVar.cycleId && AbstractC22676k.m65745e(this.subtitleCallout, rVar.subtitleCallout) && AbstractC22676k.m65745e(this.datePickerDomainState, rVar.datePickerDomainState) && AbstractC22676k.m65745e(this.navigationButton, rVar.navigationButton) && AbstractC22676k.m65745e(this.talkTextWidget, rVar.talkTextWidget);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final JournalBounds getJournalBounds() {
            return this.journalBounds;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final C32915g getNavigationButton() {
            return this.navigationButton;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getNotes() {
            return this.notes;
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.behaviors.hashCode() * 31, 31, this.notes);
            C32916h c32916h = this.bottomSheetInfo;
            int iM30450d2 = AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC2875y.m8289b((this.defaultAnswers.hashCode() + ((iM30450d + (c32916h == null ? 0 : c32916h.hashCode())) * 31)) * 31, 31, this.shouldExitNow), 31, this.showGradient), 31, this.headerText);
            JournalBounds journalBounds = this.journalBounds;
            int iM30451e = AbstractC11266d.m30451e(AbstractC11266d.m30450d((iM30450d2 + (journalBounds == null ? 0 : journalBounds.hashCode())) * 31, 31, this.requestDate), this.cycleId, 31);
            SubtitleCallout subtitleCallout = this.subtitleCallout;
            int iHashCode = (iM30451e + (subtitleCallout == null ? 0 : subtitleCallout.hashCode())) * 31;
            C35187d c35187d = this.datePickerDomainState;
            int iHashCode2 = (iHashCode + (c35187d == null ? 0 : c35187d.hashCode())) * 31;
            C32915g c32915g = this.navigationButton;
            int iHashCode3 = (iHashCode2 + (c32915g == null ? 0 : c32915g.hashCode())) * 31;
            C32917i c32917i = this.talkTextWidget;
            return iHashCode3 + (c32917i != null ? c32917i.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getRequestDate() {
            return this.requestDate;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final boolean getShouldExitNow() {
            return this.shouldExitNow;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final boolean getShowGradient() {
            return this.showGradient;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final SubtitleCallout getSubtitleCallout() {
            return this.subtitleCallout;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final C32917i getTalkTextWidget() {
            return this.talkTextWidget;
        }

        public String toString() {
            List<C34098b> list = this.behaviors;
            String str = this.notes;
            C32916h c32916h = this.bottomSheetInfo;
            C32911c c32911c = this.defaultAnswers;
            boolean z4 = this.shouldExitNow;
            boolean z13 = this.showGradient;
            String str2 = this.headerText;
            JournalBounds journalBounds = this.journalBounds;
            String str3 = this.requestDate;
            long j7 = this.cycleId;
            SubtitleCallout subtitleCallout = this.subtitleCallout;
            C35187d c35187d = this.datePickerDomainState;
            C32915g c32915g = this.navigationButton;
            C32917i c32917i = this.talkTextWidget;
            StringBuilder sbM79507k = AbstractC26725a.m79507k("ShowJournalLoadSuccess(behaviors=", ", notes=", str, ", bottomSheetInfo=", list);
            sbM79507k.append(c32916h);
            sbM79507k.append(", defaultAnswers=");
            sbM79507k.append(c32911c);
            sbM79507k.append(", shouldExitNow=");
            AbstractC38963t7.m124392v(sbM79507k, z4, ", showGradient=", z13, ", headerText=");
            sbM79507k.append(str2);
            sbM79507k.append(", journalBounds=");
            sbM79507k.append(journalBounds);
            sbM79507k.append(", requestDate=");
            sbM79507k.append(str3);
            sbM79507k.append(", cycleId=");
            sbM79507k.append(j7);
            sbM79507k.append(", subtitleCallout=");
            sbM79507k.append(subtitleCallout);
            sbM79507k.append(", datePickerDomainState=");
            sbM79507k.append(c35187d);
            sbM79507k.append(", navigationButton=");
            sbM79507k.append(c32915g);
            sbM79507k.append(", talkTextWidget=");
            sbM79507k.append(c32917i);
            sbM79507k.append(")");
            return sbM79507k.toString();
        }

        public /* synthetic */ r(List list, String str, C32916h c32916h, C32911c c32911c, boolean z4, boolean z13, String str2, JournalBounds journalBounds, String str3, long j7, SubtitleCallout subtitleCallout, C35187d c35187d, C32915g c32915g, C32917i c32917i, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, str, (i13 & 4) != 0 ? null : c32916h, (i13 & 8) != 0 ? new C32911c(false, false, null, 7, null) : c32911c, (i13 & 16) != 0 ? false : z4, (i13 & 32) != 0 ? false : z13, (i13 & 64) != 0 ? "" : str2, (i13 & 128) != 0 ? null : journalBounds, (i13 & 256) != 0 ? "" : str3, (i13 & 512) != 0 ? -1L : j7, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : subtitleCallout, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : c35187d, (i13 & 4096) != 0 ? null : c32915g, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : c32917i);
        }
    }
}
