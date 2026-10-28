package rv2;

import com.whoop.navigation.C9598e;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import nh3.AbstractC26725a;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import qv2.C30660a;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: rv2.d */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u001d\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u0082\u0001\u0002\u001f ¨\u0006!À\u0006\u0003"}, m65681d2 = {"Lrv2/d;", "", "c0", "u", "f", "q", "b", "b0", "y", "p", "z", "a0", "e", "g", "x", "v", "o", "c", "i", "j", "m", "n", "k", "s", "r", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "l", "a", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "t", "d", "Lrv2/d$o;", "Lrv2/d$c0;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC31846d {

    /* JADX INFO: renamed from: rv2.d$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lrv2/d$a;", "Lrv2/d$o;", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Lcom/whoop/navigation/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements o {

        /* JADX INFO: renamed from: b */
        public static final int f132003b = C9598e.f28134d;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C9598e destination;

        public a(C9598e destination) {
            AbstractC22676k.m65750j(destination, "destination");
            this.destination = destination;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C9598e getDestination() {
            return this.destination;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.destination, ((a) other).destination);
        }

        public int hashCode() {
            return this.destination.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106650i("BackendDrivenNavigation(destination=", this.destination, ")");
        }
    }

    /* JADX INFO: renamed from: rv2.d$a0 */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lrv2/d$a0;", "Lrv2/d$c0;", "<init>", "()V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a0 implements c0 {

        /* JADX INFO: renamed from: a */
        public static final a0 f132005a = new a0();

        private a0() {
        }
    }

    /* JADX INFO: renamed from: rv2.d$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lrv2/d$b;", "Lrv2/d$c0;", "<init>", "()V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements c0 {

        /* JADX INFO: renamed from: a */
        public static final b f132006a = new b();

        private b() {
        }
    }

    /* JADX INFO: renamed from: rv2.d$b0 */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lrv2/d$b0;", "Lrv2/d$c0;", "<init>", "()V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b0 implements c0 {

        /* JADX INFO: renamed from: a */
        public static final b0 f132007a = new b0();

        private b0() {
        }
    }

    /* JADX INFO: renamed from: rv2.d$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lrv2/d$c;", "Lrv2/d$o;", "<init>", "()V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements o {

        /* JADX INFO: renamed from: a */
        public static final c f132008a = new c();

        private c() {
        }
    }

    /* JADX INFO: renamed from: rv2.d$c0 */
    @Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u000f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011À\u0006\u0003"}, m65681d2 = {"Lrv2/d$c0;", "Lrv2/d;", "Lrv2/d$b;", "Lrv2/d$d;", "Lrv2/d$e;", "Lrv2/d$f;", "Lrv2/d$g;", "Lrv2/d$p;", "Lrv2/d$q;", "Lrv2/d$t;", "Lrv2/d$u;", "Lrv2/d$v;", "Lrv2/d$x;", "Lrv2/d$y;", "Lrv2/d$z;", "Lrv2/d$a0;", "Lrv2/d$b0;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface c0 extends InterfaceC31846d {
    }

    /* JADX INFO: renamed from: rv2.d$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lrv2/d$d;", "Lrv2/d$c0;", "<init>", "()V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements c0 {

        /* JADX INFO: renamed from: a */
        public static final d f132009a = new d();

        private d() {
        }
    }

    /* JADX INFO: renamed from: rv2.d$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lrv2/d$e;", "Lrv2/d$c0;", "<init>", "()V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements c0 {

        /* JADX INFO: renamed from: a */
        public static final e f132010a = new e();

        private e() {
        }
    }

    /* JADX INFO: renamed from: rv2.d$f */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lrv2/d$f;", "Lrv2/d$c0;", "<init>", "()V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements c0 {

        /* JADX INFO: renamed from: a */
        public static final f f132011a = new f();

        private f() {
        }
    }

    /* JADX INFO: renamed from: rv2.d$g */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lrv2/d$g;", "Lrv2/d$c0;", "<init>", "()V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements c0 {

        /* JADX INFO: renamed from: a */
        public static final g f132012a = new g();

        private g() {
        }
    }

    /* JADX INFO: renamed from: rv2.d$h */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lrv2/d$h;", "Lrv2/d$o;", "<init>", "()V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements o {

        /* JADX INFO: renamed from: a */
        public static final h f132013a = new h();

        private h() {
        }
    }

    /* JADX INFO: renamed from: rv2.d$i */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lrv2/d$i;", "Lrv2/d$o;", "", "source", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i implements o {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String source;

        public i(String str) {
            this.source = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof i) && AbstractC22676k.m65745e(this.source, ((i) other).source);
        }

        public int hashCode() {
            String str = this.source;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("NavigateToBuildNewWorkout(source=", this.source, ")");
        }

        public /* synthetic */ i(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : str);
        }
    }

    /* JADX INFO: renamed from: rv2.d$j */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lrv2/d$j;", "Lrv2/d$o;", "", "workoutTemplateKey", "", "isCopyFlow", "<init>", "(JZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "Z", "()Z", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class j implements o {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final long workoutTemplateKey;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean isCopyFlow;

        public j(long j7, boolean z4) {
            this.workoutTemplateKey = j7;
            this.isCopyFlow = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getWorkoutTemplateKey() {
            return this.workoutTemplateKey;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsCopyFlow() {
            return this.isCopyFlow;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof j)) {
                return false;
            }
            j jVar = (j) other;
            return this.workoutTemplateKey == jVar.workoutTemplateKey && this.isCopyFlow == jVar.isCopyFlow;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isCopyFlow) + (Long.hashCode(this.workoutTemplateKey) * 31);
        }

        public String toString() {
            return "NavigateToEditWorkoutScreen(workoutTemplateKey=" + this.workoutTemplateKey + ", isCopyFlow=" + this.isCopyFlow + ")";
        }

        public /* synthetic */ j(long j7, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(j7, (i13 & 2) != 0 ? false : z4);
        }
    }

    /* JADX INFO: renamed from: rv2.d$k */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lrv2/d$k;", "Lrv2/d$o;", "<init>", "()V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements o {

        /* JADX INFO: renamed from: a */
        public static final k f132017a = new k();

        private k() {
        }
    }

    /* JADX INFO: renamed from: rv2.d$l */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lrv2/d$l;", "Lrv2/d$o;", "", "exerciseId", "", "isExerciseDetailsV2ExperimentEnabled", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class l implements o {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String exerciseId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean isExerciseDetailsV2ExperimentEnabled;

        public l(String exerciseId, boolean z4) {
            AbstractC22676k.m65750j(exerciseId, "exerciseId");
            this.exerciseId = exerciseId;
            this.isExerciseDetailsV2ExperimentEnabled = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getExerciseId() {
            return this.exerciseId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsExerciseDetailsV2ExperimentEnabled() {
            return this.isExerciseDetailsV2ExperimentEnabled;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof l)) {
                return false;
            }
            l lVar = (l) other;
            return AbstractC22676k.m65745e(this.exerciseId, lVar.exerciseId) && this.isExerciseDetailsV2ExperimentEnabled == lVar.isExerciseDetailsV2ExperimentEnabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isExerciseDetailsV2ExperimentEnabled) + (this.exerciseId.hashCode() * 31);
        }

        public String toString() {
            return AbstractC26725a.m79503g("NavigateToExerciseProgressDetails(exerciseId=", this.exerciseId, ", isExerciseDetailsV2ExperimentEnabled=", ")", this.isExerciseDetailsV2ExperimentEnabled);
        }
    }

    /* JADX INFO: renamed from: rv2.d$m */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lrv2/d$m;", "Lrv2/d$o;", "<init>", "()V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements o {

        /* JADX INFO: renamed from: a */
        public static final m f132020a = new m();

        private m() {
        }
    }

    /* JADX INFO: renamed from: rv2.d$n */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lrv2/d$n;", "Lrv2/d$o;", "", "workoutTemplateKey", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class n implements o {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String workoutTemplateKey;

        public n(String workoutTemplateKey) {
            AbstractC22676k.m65750j(workoutTemplateKey, "workoutTemplateKey");
            this.workoutTemplateKey = workoutTemplateKey;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getWorkoutTemplateKey() {
            return this.workoutTemplateKey;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof n) && AbstractC22676k.m65745e(this.workoutTemplateKey, ((n) other).workoutTemplateKey);
        }

        public int hashCode() {
            return this.workoutTemplateKey.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("NavigateToWorkoutDetails(workoutTemplateKey=", this.workoutTemplateKey, ")");
        }
    }

    /* JADX INFO: renamed from: rv2.d$o */
    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, m65681d2 = {"Lrv2/d$o;", "Lrv2/d;", "Lrv2/d$a;", "Lrv2/d$c;", "Lrv2/d$h;", "Lrv2/d$i;", "Lrv2/d$j;", "Lrv2/d$k;", "Lrv2/d$l;", "Lrv2/d$m;", "Lrv2/d$n;", "Lrv2/d$r;", "Lrv2/d$s;", "Lrv2/d$w;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface o extends InterfaceC31846d {
    }

    /* JADX INFO: renamed from: rv2.d$p */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lrv2/d$p;", "Lrv2/d$c0;", "", "workoutTemplateKey", "<init>", "(J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class p implements c0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final long workoutTemplateKey;

        public p(long j7) {
            this.workoutTemplateKey = j7;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getWorkoutTemplateKey() {
            return this.workoutTemplateKey;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof p) && this.workoutTemplateKey == ((p) other).workoutTemplateKey;
        }

        public int hashCode() {
            return Long.hashCode(this.workoutTemplateKey);
        }

        public String toString() {
            return AbstractC31061c.m95636l(this.workoutTemplateKey, "OpenBottomSheet(workoutTemplateKey=", ")");
        }
    }

    /* JADX INFO: renamed from: rv2.d$q */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lrv2/d$q;", "Lrv2/d$c0;", "<init>", "()V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q implements c0 {

        /* JADX INFO: renamed from: a */
        public static final q f132023a = new q();

        private q() {
        }
    }

    /* JADX INFO: renamed from: rv2.d$r */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lrv2/d$r;", "Lrv2/d$o;", "Lqv2/a;", "shareableWorkoutLink", "<init>", "(Lqv2/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lqv2/a;", "()Lqv2/a;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class r implements o {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C30660a shareableWorkoutLink;

        public r(C30660a shareableWorkoutLink) {
            AbstractC22676k.m65750j(shareableWorkoutLink, "shareableWorkoutLink");
            this.shareableWorkoutLink = shareableWorkoutLink;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C30660a getShareableWorkoutLink() {
            return this.shareableWorkoutLink;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof r) && AbstractC22676k.m65745e(this.shareableWorkoutLink, ((r) other).shareableWorkoutLink);
        }

        public int hashCode() {
            return this.shareableWorkoutLink.hashCode();
        }

        public String toString() {
            return "OpenWorkoutQrCodeShareSheet(shareableWorkoutLink=" + this.shareableWorkoutLink + ")";
        }
    }

    /* JADX INFO: renamed from: rv2.d$s */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lrv2/d$s;", "Lrv2/d$o;", "Lqv2/a;", "shareableWorkoutLink", "<init>", "(Lqv2/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lqv2/a;", "()Lqv2/a;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class s implements o {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C30660a shareableWorkoutLink;

        public s(C30660a shareableWorkoutLink) {
            AbstractC22676k.m65750j(shareableWorkoutLink, "shareableWorkoutLink");
            this.shareableWorkoutLink = shareableWorkoutLink;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C30660a getShareableWorkoutLink() {
            return this.shareableWorkoutLink;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof s) && AbstractC22676k.m65745e(this.shareableWorkoutLink, ((s) other).shareableWorkoutLink);
        }

        public int hashCode() {
            return this.shareableWorkoutLink.hashCode();
        }

        public String toString() {
            return "OpenWorkoutShareSheet(shareableWorkoutLink=" + this.shareableWorkoutLink + ")";
        }
    }

    /* JADX INFO: renamed from: rv2.d$t */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lrv2/d$t;", "Lrv2/d$c0;", "<init>", "()V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class t implements c0 {

        /* JADX INFO: renamed from: a */
        public static final t f132026a = new t();

        private t() {
        }
    }

    /* JADX INFO: renamed from: rv2.d$u */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lrv2/d$u;", "Lrv2/d$c0;", "<init>", "()V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class u implements c0 {

        /* JADX INFO: renamed from: a */
        public static final u f132027a = new u();

        private u() {
        }
    }

    /* JADX INFO: renamed from: rv2.d$v */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lrv2/d$v;", "Lrv2/d$c0;", "<init>", "()V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class v implements c0 {

        /* JADX INFO: renamed from: a */
        public static final v f132028a = new v();

        private v() {
        }
    }

    /* JADX INFO: renamed from: rv2.d$w */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lrv2/d$w;", "Lrv2/d$o;", "Lcom/whoop/navigation/e;", "action", "Lcom/whoop/navigation/e;", "a", "()Lcom/whoop/navigation/e;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class w implements o {
        /* JADX INFO: renamed from: a */
        public abstract C9598e m98973a();
    }

    /* JADX INFO: renamed from: rv2.d$x */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lrv2/d$x;", "Lrv2/d$c0;", "Lrv2/f;", "tab", "<init>", "(Lrv2/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lrv2/f;", "()Lrv2/f;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class x implements c0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC31848f tab;

        public x(EnumC31848f tab) {
            AbstractC22676k.m65750j(tab, "tab");
            this.tab = tab;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC31848f getTab() {
            return this.tab;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof x) && this.tab == ((x) other).tab;
        }

        public int hashCode() {
            return this.tab.hashCode();
        }

        public String toString() {
            return "SelectWorkoutLibraryTab(tab=" + this.tab + ")";
        }
    }

    /* JADX INFO: renamed from: rv2.d$y */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lrv2/d$y;", "Lrv2/d$c0;", "<init>", "()V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class y implements c0 {

        /* JADX INFO: renamed from: a */
        public static final y f132030a = new y();

        private y() {
        }
    }

    /* JADX INFO: renamed from: rv2.d$z */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lrv2/d$z;", "Lrv2/d$c0;", "<init>", "()V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class z implements c0 {

        /* JADX INFO: renamed from: a */
        public static final z f132031a = new z();

        private z() {
        }
    }
}
