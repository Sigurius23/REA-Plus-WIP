package kf2;

import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jf2.C21643a;
import jf2.C21645c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: kf2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m65681d2 = {"Lkf2/d;", "", "<init>", "()V", "d", "c", "e", "b", "a", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "g", "f", "Lkf2/d$a;", "Lkf2/d$b;", "Lkf2/d$c;", "Lkf2/d$d;", "Lkf2/d$e;", "Lkf2/d$f;", "Lkf2/d$g;", "Lkf2/d$h;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22445d {

    /* JADX INFO: renamed from: kf2.d$a */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\t¨\u0006\u0017"}, m65681d2 = {"Lkf2/d$a;", "Lkf2/d;", "Ljf2/a;", "deleteErrorState", "", "scheduleId", "<init>", "(Ljf2/a;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljf2/a;", "()Ljf2/a;", "b", "Ljava/lang/String;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC22445d {

        /* JADX INFO: renamed from: c */
        public static final int f87858c = TextResource.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C21643a deleteErrorState;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String scheduleId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C21643a deleteErrorState, String scheduleId) {
            super(null);
            AbstractC22676k.m65750j(deleteErrorState, "deleteErrorState");
            AbstractC22676k.m65750j(scheduleId, "scheduleId");
            this.deleteErrorState = deleteErrorState;
            this.scheduleId = scheduleId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C21643a getDeleteErrorState() {
            return this.deleteErrorState;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getScheduleId() {
            return this.scheduleId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.deleteErrorState, aVar.deleteErrorState) && AbstractC22676k.m65745e(this.scheduleId, aVar.scheduleId);
        }

        public int hashCode() {
            return this.scheduleId.hashCode() + (this.deleteErrorState.hashCode() * 31);
        }

        public String toString() {
            return "DeleteErrorScreen(deleteErrorState=" + this.deleteErrorState + ", scheduleId=" + this.scheduleId + ")";
        }
    }

    /* JADX INFO: renamed from: kf2.d$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lkf2/d$b;", "Lkf2/d;", "Ljf2/c;", "deleteLoadingState", "<init>", "(Ljf2/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljf2/c;", "()Ljf2/c;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC22445d {

        /* JADX INFO: renamed from: b */
        public static final int f87861b = TextResource.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C21645c deleteLoadingState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C21645c deleteLoadingState) {
            super(null);
            AbstractC22676k.m65750j(deleteLoadingState, "deleteLoadingState");
            this.deleteLoadingState = deleteLoadingState;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C21645c getDeleteLoadingState() {
            return this.deleteLoadingState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.deleteLoadingState, ((b) other).deleteLoadingState);
        }

        public int hashCode() {
            return this.deleteLoadingState.hashCode();
        }

        public String toString() {
            return "DeleteLoadingScreen(deleteLoadingState=" + this.deleteLoadingState + ")";
        }
    }

    /* JADX INFO: renamed from: kf2.d$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lkf2/d$c;", "Lkf2/d;", "Ljf2/c;", "deleteSuccessState", "<init>", "(Ljf2/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljf2/c;", "()Ljf2/c;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC22445d {

        /* JADX INFO: renamed from: b */
        public static final int f87863b = TextResource.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C21645c deleteSuccessState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C21645c deleteSuccessState) {
            super(null);
            AbstractC22676k.m65750j(deleteSuccessState, "deleteSuccessState");
            this.deleteSuccessState = deleteSuccessState;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C21645c getDeleteSuccessState() {
            return this.deleteSuccessState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && AbstractC22676k.m65745e(this.deleteSuccessState, ((c) other).deleteSuccessState);
        }

        public int hashCode() {
            return this.deleteSuccessState.hashCode();
        }

        public String toString() {
            return "DeleteSuccess(deleteSuccessState=" + this.deleteSuccessState + ")";
        }
    }

    /* JADX INFO: renamed from: kf2.d$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lkf2/d$d;", "Lkf2/d;", "<init>", "()V", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC22445d {

        /* JADX INFO: renamed from: a */
        public static final d f87865a = new d();

        private d() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: kf2.d$e */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lkf2/d$e;", "Lkf2/d;", "Lkf2/b;", "sleepScheduleList", "<init>", "(Lkf2/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkf2/b;", "()Lkf2/b;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC22445d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C22443b sleepScheduleList;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C22443b sleepScheduleList) {
            super(null);
            AbstractC22676k.m65750j(sleepScheduleList, "sleepScheduleList");
            this.sleepScheduleList = sleepScheduleList;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C22443b getSleepScheduleList() {
            return this.sleepScheduleList;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof e) && AbstractC22676k.m65745e(this.sleepScheduleList, ((e) other).sleepScheduleList);
        }

        public int hashCode() {
            return this.sleepScheduleList.hashCode();
        }

        public String toString() {
            return "SleepSchedule(sleepScheduleList=" + this.sleepScheduleList + ")";
        }
    }

    /* JADX INFO: renamed from: kf2.d$f */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lkf2/d$f;", "Lkf2/d;", "Ljf2/a;", "toggleErrorState", "", "isScheduleEnabled", "<init>", "(Ljf2/a;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljf2/a;", "()Ljf2/a;", "b", "Z", "()Z", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC22445d {

        /* JADX INFO: renamed from: c */
        public static final int f87867c = TextResource.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C21643a toggleErrorState;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean isScheduleEnabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C21643a toggleErrorState, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(toggleErrorState, "toggleErrorState");
            this.toggleErrorState = toggleErrorState;
            this.isScheduleEnabled = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C21643a getToggleErrorState() {
            return this.toggleErrorState;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsScheduleEnabled() {
            return this.isScheduleEnabled;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof f)) {
                return false;
            }
            f fVar = (f) other;
            return AbstractC22676k.m65745e(this.toggleErrorState, fVar.toggleErrorState) && this.isScheduleEnabled == fVar.isScheduleEnabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isScheduleEnabled) + (this.toggleErrorState.hashCode() * 31);
        }

        public String toString() {
            return "ToggleErrorScreen(toggleErrorState=" + this.toggleErrorState + ", isScheduleEnabled=" + this.isScheduleEnabled + ")";
        }
    }

    /* JADX INFO: renamed from: kf2.d$g */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lkf2/d$g;", "Lkf2/d;", "Ljf2/c;", "toggleLoadingState", "<init>", "(Ljf2/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljf2/c;", "()Ljf2/c;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g extends AbstractC22445d {

        /* JADX INFO: renamed from: b */
        public static final int f87870b = TextResource.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C21645c toggleLoadingState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C21645c toggleLoadingState) {
            super(null);
            AbstractC22676k.m65750j(toggleLoadingState, "toggleLoadingState");
            this.toggleLoadingState = toggleLoadingState;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C21645c getToggleLoadingState() {
            return this.toggleLoadingState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof g) && AbstractC22676k.m65745e(this.toggleLoadingState, ((g) other).toggleLoadingState);
        }

        public int hashCode() {
            return this.toggleLoadingState.hashCode();
        }

        public String toString() {
            return "ToggleLoadingScreen(toggleLoadingState=" + this.toggleLoadingState + ")";
        }
    }

    /* JADX INFO: renamed from: kf2.d$h */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lkf2/d$h;", "Lkf2/d;", "Ljf2/c;", "toggleSuccessState", "<init>", "(Ljf2/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljf2/c;", "()Ljf2/c;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h extends AbstractC22445d {

        /* JADX INFO: renamed from: b */
        public static final int f87872b = TextResource.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C21645c toggleSuccessState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(C21645c toggleSuccessState) {
            super(null);
            AbstractC22676k.m65750j(toggleSuccessState, "toggleSuccessState");
            this.toggleSuccessState = toggleSuccessState;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C21645c getToggleSuccessState() {
            return this.toggleSuccessState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof h) && AbstractC22676k.m65745e(this.toggleSuccessState, ((h) other).toggleSuccessState);
        }

        public int hashCode() {
            return this.toggleSuccessState.hashCode();
        }

        public String toString() {
            return "ToggleSuccess(toggleSuccessState=" + this.toggleSuccessState + ")";
        }
    }

    public /* synthetic */ AbstractC22445d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC22445d() {
    }
}
