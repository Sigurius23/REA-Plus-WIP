package ws2;

import com.whoop.weeklyplan.customizeplan.domain.api.ConfirmTarget;
import com.whoop.weeklyplan.customizeplan.domain.api.TargetGoalType;
import com.whoop.weeklyplan.customizeplan.domain.api.WeeklyPlanCustomizationResponse;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: ws2.e */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0011\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0011\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%¨\u0006&"}, m65681d2 = {"Lws2/e;", "", "<init>", "()V", "m", "e", "j", "c", "l", "k", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "g", "q", "o", "d", "a", "f", "n", "b", "p", "i", "Lws2/e$a;", "Lws2/e$b;", "Lws2/e$c;", "Lws2/e$d;", "Lws2/e$e;", "Lws2/e$f;", "Lws2/e$g;", "Lws2/e$h;", "Lws2/e$i;", "Lws2/e$j;", "Lws2/e$k;", "Lws2/e$l;", "Lws2/e$m;", "Lws2/e$n;", "Lws2/e$o;", "Lws2/e$p;", "Lws2/e$q;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37613e {

    /* JADX INFO: renamed from: ws2.e$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, m65681d2 = {"Lws2/e$a;", "Lws2/e;", "", "change", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC37613e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int change;

        public a(int i13) {
            super(null);
            this.change = i13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getChange() {
            return this.change;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && this.change == ((a) other).change;
        }

        public int hashCode() {
            return Integer.hashCode(this.change);
        }

        public String toString() {
            return AbstractC2875y.m8296i(this.change, "Backward(change=", ")");
        }
    }

    /* JADX INFO: renamed from: ws2.e$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, m65681d2 = {"Lws2/e$b;", "Lws2/e;", "", "categoryIndex", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC37613e {

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

    /* JADX INFO: renamed from: ws2.e$c */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lws2/e$c;", "Lws2/e;", "", "id", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "targetGoalType", "<init>", "(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC37613e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TargetGoalType targetGoalType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String id4, TargetGoalType targetGoalType) {
            super(null);
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(targetGoalType, "targetGoalType");
            this.id = id4;
            this.targetGoalType = targetGoalType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TargetGoalType getTargetGoalType() {
            return this.targetGoalType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.id, cVar.id) && this.targetGoalType == cVar.targetGoalType;
        }

        public int hashCode() {
            return this.targetGoalType.hashCode() + (this.id.hashCode() * 31);
        }

        public String toString() {
            return "DeleteMetricError(id=" + this.id + ", targetGoalType=" + this.targetGoalType + ")";
        }
    }

    /* JADX INFO: renamed from: ws2.e$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lws2/e$d;", "Lws2/e;", "<init>", "()V", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC37613e {

        /* JADX INFO: renamed from: a */
        public static final d f160909a = new d();

        private d() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ws2.e$e */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lws2/e$e;", "Lws2/e;", "", "error", "", "screens", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getError", "b", "Ljava/util/List;", "()Ljava/util/List;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC37613e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String error;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<String> screens;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String error, List<String> screens) {
            super(null);
            AbstractC22676k.m65750j(error, "error");
            AbstractC22676k.m65750j(screens, "screens");
            this.error = error;
            this.screens = screens;
        }

        /* JADX INFO: renamed from: a */
        public final List<String> m120789a() {
            return this.screens;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.error, eVar.error) && AbstractC22676k.m65745e(this.screens, eVar.screens);
        }

        public int hashCode() {
            return this.screens.hashCode() + (this.error.hashCode() * 31);
        }

        public String toString() {
            return AbstractC36095b.m114679g("InitialLoadError(error=", this.error, ", screens=", ")", this.screens);
        }
    }

    /* JADX INFO: renamed from: ws2.e$f */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lws2/e$f;", "Lws2/e;", "<init>", "()V", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC37613e {

        /* JADX INFO: renamed from: a */
        public static final f f160912a = new f();

        private f() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ws2.e$g */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lws2/e$g;", "Lws2/e;", "<init>", "()V", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC37613e {

        /* JADX INFO: renamed from: a */
        public static final g f160913a = new g();

        private g() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ws2.e$h */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lws2/e$h;", "Lws2/e;", "<init>", "()V", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC37613e {

        /* JADX INFO: renamed from: a */
        public static final h f160914a = new h();

        private h() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ws2.e$i */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lws2/e$i;", "Lws2/e;", "<init>", "()V", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC37613e {

        /* JADX INFO: renamed from: a */
        public static final i f160915a = new i();

        private i() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ws2.e$j */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lws2/e$j;", "Lws2/e;", "", "id", "Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget;", "confirmTarget", "<init>", "(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget;", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class j extends AbstractC37613e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final ConfirmTarget confirmTarget;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String id4, ConfirmTarget confirmTarget) {
            super(null);
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(confirmTarget, "confirmTarget");
            this.id = id4;
            this.confirmTarget = confirmTarget;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ConfirmTarget getConfirmTarget() {
            return this.confirmTarget;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof j)) {
                return false;
            }
            j jVar = (j) other;
            return AbstractC22676k.m65745e(this.id, jVar.id) && AbstractC22676k.m65745e(this.confirmTarget, jVar.confirmTarget);
        }

        public int hashCode() {
            return this.confirmTarget.hashCode() + (this.id.hashCode() * 31);
        }

        public String toString() {
            return "SaveMetricError(id=" + this.id + ", confirmTarget=" + this.confirmTarget + ")";
        }
    }

    /* JADX INFO: renamed from: ws2.e$k */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lws2/e$k;", "Lws2/e;", "<init>", "()V", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k extends AbstractC37613e {

        /* JADX INFO: renamed from: a */
        public static final k f160918a = new k();

        private k() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ws2.e$l */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lws2/e$l;", "Lws2/e;", "<init>", "()V", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l extends AbstractC37613e {

        /* JADX INFO: renamed from: a */
        public static final l f160919a = new l();

        private l() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ws2.e$m */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lws2/e$m;", "Lws2/e;", "Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;", "result", "<init>", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class m extends AbstractC37613e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final WeeklyPlanCustomizationResponse result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(WeeklyPlanCustomizationResponse result) {
            super(null);
            AbstractC22676k.m65750j(result, "result");
            this.result = result;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final WeeklyPlanCustomizationResponse getResult() {
            return this.result;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof m) && AbstractC22676k.m65745e(this.result, ((m) other).result);
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        public String toString() {
            return "Success(result=" + this.result + ")";
        }
    }

    /* JADX INFO: renamed from: ws2.e$n */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lws2/e$n;", "Lws2/e;", "", "id", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class n extends AbstractC37613e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String id4) {
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
            return (other instanceof n) && AbstractC22676k.m65745e(this.id, ((n) other).id);
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("ToggleItem(id=", this.id, ")");
        }
    }

    /* JADX INFO: renamed from: ws2.e$o */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b\u001a\u0010\u0010¨\u0006 "}, m65681d2 = {"Lws2/e$o;", "Lws2/e;", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "goalTypeEnum", "", "id", "", "isToggled", "isAvoid", "", "selectedDay", "<init>", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Ljava/lang/String;ZZI)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "b", "Ljava/lang/String;", "c", "Z", "e", "()Z", "d", "I", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class o extends AbstractC37613e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TargetGoalType goalTypeEnum;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean isToggled;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean isAvoid;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final int selectedDay;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(TargetGoalType goalTypeEnum, String id4, boolean z4, boolean z13, int i13) {
            super(null);
            AbstractC22676k.m65750j(goalTypeEnum, "goalTypeEnum");
            AbstractC22676k.m65750j(id4, "id");
            this.goalTypeEnum = goalTypeEnum;
            this.id = id4;
            this.isToggled = z4;
            this.isAvoid = z13;
            this.selectedDay = i13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TargetGoalType getGoalTypeEnum() {
            return this.goalTypeEnum;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getSelectedDay() {
            return this.selectedDay;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getIsAvoid() {
            return this.isAvoid;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getIsToggled() {
            return this.isToggled;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof o)) {
                return false;
            }
            o oVar = (o) other;
            return this.goalTypeEnum == oVar.goalTypeEnum && AbstractC22676k.m65745e(this.id, oVar.id) && this.isToggled == oVar.isToggled && this.isAvoid == oVar.isAvoid && this.selectedDay == oVar.selectedDay;
        }

        public int hashCode() {
            return Integer.hashCode(this.selectedDay) + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30450d(this.goalTypeEnum.hashCode() * 31, 31, this.id), 31, this.isToggled), 31, this.isAvoid);
        }

        public String toString() {
            TargetGoalType targetGoalType = this.goalTypeEnum;
            String str = this.id;
            boolean z4 = this.isToggled;
            boolean z13 = this.isAvoid;
            int i13 = this.selectedDay;
            StringBuilder sb4 = new StringBuilder("UpdateActivityOrBehaviorToggle(goalTypeEnum=");
            sb4.append(targetGoalType);
            sb4.append(", id=");
            sb4.append(str);
            sb4.append(", isToggled=");
            AbstractC38963t7.m124392v(sb4, z4, ", isAvoid=", z13, ", selectedDay=");
            return AbstractC18489d0.m53371l(sb4, i13, ")");
        }
    }

    /* JADX INFO: renamed from: ws2.e$p */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lws2/e$p;", "Lws2/e;", "", "query", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class p extends AbstractC37613e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String query;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(String query) {
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
            return (other instanceof p) && AbstractC22676k.m65745e(this.query, ((p) other).query);
        }

        public int hashCode() {
            return this.query.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("UpdateSearchQuery(query=", this.query, ")");
        }
    }

    /* JADX INFO: renamed from: ws2.e$q */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lws2/e$q;", "Lws2/e;", "", "value", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "goalTypeEnum", "<init>", "(DLcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "b", "()D", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class q extends AbstractC37613e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final double value;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TargetGoalType goalTypeEnum;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(double d3, TargetGoalType goalTypeEnum) {
            super(null);
            AbstractC22676k.m65750j(goalTypeEnum, "goalTypeEnum");
            this.value = d3;
            this.goalTypeEnum = goalTypeEnum;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TargetGoalType getGoalTypeEnum() {
            return this.goalTypeEnum;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final double getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof q)) {
                return false;
            }
            q qVar = (q) other;
            return Double.compare(this.value, qVar.value) == 0 && this.goalTypeEnum == qVar.goalTypeEnum;
        }

        public int hashCode() {
            return this.goalTypeEnum.hashCode() + (Double.hashCode(this.value) * 31);
        }

        public String toString() {
            return "UpdateStrainOrSleepMetric(value=" + this.value + ", goalTypeEnum=" + this.goalTypeEnum + ")";
        }
    }

    public /* synthetic */ AbstractC37613e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC37613e() {
    }
}
