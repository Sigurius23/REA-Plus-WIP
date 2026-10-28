package ws2;

import c13.AbstractC3855a;
import com.whoop.weeklyplan.customizeplan.domain.api.ActivityTarget;
import com.whoop.weeklyplan.customizeplan.domain.api.BehaviorTarget;
import com.whoop.weeklyplan.customizeplan.domain.api.TargetGoalType;
import hc3.AbstractC17176i;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import te0.AbstractC33745d;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: ws2.i */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000e\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000e\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, m65681d2 = {"Lws2/i;", "", "<init>", "()V", "d", "i", "f", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "m", "l", "c", "j", "a", "e", "k", "b", "n", "g", "Lws2/i$a;", "Lws2/i$b;", "Lws2/i$c;", "Lws2/i$d;", "Lws2/i$e;", "Lws2/i$f;", "Lws2/i$g;", "Lws2/i$h;", "Lws2/i$i;", "Lws2/i$j;", "Lws2/i$k;", "Lws2/i$l;", "Lws2/i$m;", "Lws2/i$n;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37617i {

    /* JADX INFO: renamed from: ws2.i$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\f¨\u0006\u0016"}, m65681d2 = {"Lws2/i$a;", "Lws2/i;", "", "exit", "", "change", "<init>", "(ZI)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "I", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC37617i {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean exit;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int change;

        public a(boolean z4, int i13) {
            super(null);
            this.exit = z4;
            this.change = i13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getChange() {
            return this.change;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getExit() {
            return this.exit;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.exit == aVar.exit && this.change == aVar.change;
        }

        public int hashCode() {
            return Integer.hashCode(this.change) + (Boolean.hashCode(this.exit) * 31);
        }

        public String toString() {
            return "Backward(exit=" + this.exit + ", change=" + this.change + ")";
        }

        public /* synthetic */ a(boolean z4, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this((i14 & 1) != 0 ? false : z4, (i14 & 2) != 0 ? -1 : i13);
        }
    }

    /* JADX INFO: renamed from: ws2.i$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, m65681d2 = {"Lws2/i$b;", "Lws2/i;", "", "categoryIndex", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC37617i {

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

    /* JADX INFO: renamed from: ws2.i$d */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lws2/i$d;", "Lws2/i;", "", "", "screens", "<init>", "(Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC37617i {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<String> screens;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<String> screens) {
            super(null);
            AbstractC22676k.m65750j(screens, "screens");
            this.screens = screens;
        }

        /* JADX INFO: renamed from: a */
        public final List<String> m120821a() {
            return this.screens;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && AbstractC22676k.m65745e(this.screens, ((d) other).screens);
        }

        public int hashCode() {
            return this.screens.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106654m("Refresh(screens=", ")", this.screens);
        }
    }

    /* JADX INFO: renamed from: ws2.i$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lws2/i$e;", "Lws2/i;", "<init>", "()V", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC37617i {

        /* JADX INFO: renamed from: a */
        public static final e f160952a = new e();

        private e() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ws2.i$g */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lws2/i$g;", "Lws2/i;", "<init>", "()V", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC37617i {

        /* JADX INFO: renamed from: a */
        public static final g f160957a = new g();

        private g() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ws2.i$j */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lws2/i$j;", "Lws2/i;", "", "exit", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class j extends AbstractC37617i {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean exit;

        public j(boolean z4) {
            super(null);
            this.exit = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getExit() {
            return this.exit;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof j) && this.exit == ((j) other).exit;
        }

        public int hashCode() {
            return Boolean.hashCode(this.exit);
        }

        public String toString() {
            return AbstractC3855a.m11827k("Skip(exit=", ")", this.exit);
        }

        public /* synthetic */ j(boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? false : z4);
        }
    }

    /* JADX INFO: renamed from: ws2.i$k */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lws2/i$k;", "Lws2/i;", "", "id", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class k extends AbstractC37617i {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String id4) {
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
            return (other instanceof k) && AbstractC22676k.m65745e(this.id, ((k) other).id);
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("ToggleItem(id=", this.id, ")");
        }
    }

    /* JADX INFO: renamed from: ws2.i$l */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b\u001a\u0010\u0010¨\u0006 "}, m65681d2 = {"Lws2/i$l;", "Lws2/i;", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "goalTypeEnum", "", "id", "", "isToggled", "isAvoid", "", "selectedDay", "<init>", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Ljava/lang/String;ZZI)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "b", "Ljava/lang/String;", "c", "Z", "e", "()Z", "d", "I", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class l extends AbstractC37617i {

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
        public l(TargetGoalType goalTypeEnum, String id4, boolean z4, boolean z13, int i13) {
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
            if (!(other instanceof l)) {
                return false;
            }
            l lVar = (l) other;
            return this.goalTypeEnum == lVar.goalTypeEnum && AbstractC22676k.m65745e(this.id, lVar.id) && this.isToggled == lVar.isToggled && this.isAvoid == lVar.isAvoid && this.selectedDay == lVar.selectedDay;
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

    /* JADX INFO: renamed from: ws2.i$m */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lws2/i$m;", "Lws2/i;", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "goalTypeEnum", "", "value", "<init>", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;D)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "b", "D", "()D", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class m extends AbstractC37617i {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TargetGoalType goalTypeEnum;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final double value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(TargetGoalType goalTypeEnum, double d3) {
            super(null);
            AbstractC22676k.m65750j(goalTypeEnum, "goalTypeEnum");
            this.goalTypeEnum = goalTypeEnum;
            this.value = d3;
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
            if (!(other instanceof m)) {
                return false;
            }
            m mVar = (m) other;
            return this.goalTypeEnum == mVar.goalTypeEnum && Double.compare(this.value, mVar.value) == 0;
        }

        public int hashCode() {
            return Double.hashCode(this.value) + (this.goalTypeEnum.hashCode() * 31);
        }

        public String toString() {
            return "UpdateNumericGoalMetric(goalTypeEnum=" + this.goalTypeEnum + ", value=" + this.value + ")";
        }
    }

    /* JADX INFO: renamed from: ws2.i$n */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lws2/i$n;", "Lws2/i;", "", "query", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class n extends AbstractC37617i {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String query;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String query) {
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
            return (other instanceof n) && AbstractC22676k.m65745e(this.query, ((n) other).query);
        }

        public int hashCode() {
            return this.query.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("UpdateSearchQuery(query=", this.query, ")");
        }
    }

    public /* synthetic */ AbstractC37617i(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC37617i() {
    }

    /* JADX INFO: renamed from: ws2.i$c */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001b\u0010\f¨\u0006\u001c"}, m65681d2 = {"Lws2/i$c;", "Lws2/i;", "", "id", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "goalTypeEnum", "source", "<init>", "(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Ljava/lang/String;)V", "a", "(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Ljava/lang/String;)Lws2/i$c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "d", "b", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "c", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "e", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC37617i {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TargetGoalType goalTypeEnum;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String id4, TargetGoalType goalTypeEnum, String source) {
            super(null);
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(goalTypeEnum, "goalTypeEnum");
            AbstractC22676k.m65750j(source, "source");
            this.id = id4;
            this.goalTypeEnum = goalTypeEnum;
            this.source = source;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ c m120816b(c cVar, String str, TargetGoalType targetGoalType, String str2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = cVar.id;
            }
            if ((i13 & 2) != 0) {
                targetGoalType = cVar.goalTypeEnum;
            }
            if ((i13 & 4) != 0) {
                str2 = cVar.source;
            }
            return cVar.m120817a(str, targetGoalType, str2);
        }

        /* JADX INFO: renamed from: a */
        public final c m120817a(String id4, TargetGoalType goalTypeEnum, String source) {
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(goalTypeEnum, "goalTypeEnum");
            AbstractC22676k.m65750j(source, "source");
            return new c(id4, goalTypeEnum, source);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TargetGoalType getGoalTypeEnum() {
            return this.goalTypeEnum;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.id, cVar.id) && this.goalTypeEnum == cVar.goalTypeEnum && AbstractC22676k.m65745e(this.source, cVar.source);
        }

        public int hashCode() {
            return this.source.hashCode() + AbstractC36095b.m114674b(this.goalTypeEnum, this.id.hashCode() * 31, 31);
        }

        public String toString() {
            String str = this.id;
            TargetGoalType targetGoalType = this.goalTypeEnum;
            String str2 = this.source;
            StringBuilder sb4 = new StringBuilder("DeleteGoal(id=");
            sb4.append(str);
            sb4.append(", goalTypeEnum=");
            sb4.append(targetGoalType);
            sb4.append(", source=");
            return AbstractC25012a.m73376i(str2, ")", sb4);
        }

        public /* synthetic */ c(String str, TargetGoalType targetGoalType, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, targetGoalType, (i13 & 4) != 0 ? "" : str2);
        }
    }

    /* JADX INFO: renamed from: ws2.i$f */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ>\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b!\u0010\u000f¨\u0006\""}, m65681d2 = {"Lws2/i$f;", "Lws2/i;", "", "id", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "goalTypeEnum", "", "Lcom/whoop/weeklyplan/customizeplan/domain/api/ActivityTarget;", "savedToggles", "source", "<init>", "(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Ljava/util/List;Ljava/lang/String;)V", "a", "(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Ljava/util/List;Ljava/lang/String;)Lws2/i$f;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "b", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "getGoalTypeEnum", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "Ljava/util/List;", "d", "()Ljava/util/List;", "e", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC37617i {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TargetGoalType goalTypeEnum;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final List<ActivityTarget> savedToggles;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String id4, TargetGoalType goalTypeEnum, List<ActivityTarget> savedToggles, String source) {
            super(null);
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(goalTypeEnum, "goalTypeEnum");
            AbstractC22676k.m65750j(savedToggles, "savedToggles");
            AbstractC22676k.m65750j(source, "source");
            this.id = id4;
            this.goalTypeEnum = goalTypeEnum;
            this.savedToggles = savedToggles;
            this.source = source;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ f m120822b(f fVar, String str, TargetGoalType targetGoalType, List list, String str2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = fVar.id;
            }
            if ((i13 & 2) != 0) {
                targetGoalType = fVar.goalTypeEnum;
            }
            if ((i13 & 4) != 0) {
                list = fVar.savedToggles;
            }
            if ((i13 & 8) != 0) {
                str2 = fVar.source;
            }
            return fVar.m120823a(str, targetGoalType, list, str2);
        }

        /* JADX INFO: renamed from: a */
        public final f m120823a(String id4, TargetGoalType goalTypeEnum, List<ActivityTarget> savedToggles, String source) {
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(goalTypeEnum, "goalTypeEnum");
            AbstractC22676k.m65750j(savedToggles, "savedToggles");
            AbstractC22676k.m65750j(source, "source");
            return new f(id4, goalTypeEnum, savedToggles, source);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: d */
        public final List<ActivityTarget> m120825d() {
            return this.savedToggles;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof f)) {
                return false;
            }
            f fVar = (f) other;
            return AbstractC22676k.m65745e(this.id, fVar.id) && this.goalTypeEnum == fVar.goalTypeEnum && AbstractC22676k.m65745e(this.savedToggles, fVar.savedToggles) && AbstractC22676k.m65745e(this.source, fVar.source);
        }

        public int hashCode() {
            return this.source.hashCode() + AbstractC11895b.m31983b(AbstractC36095b.m114674b(this.goalTypeEnum, this.id.hashCode() * 31, 31), 31, this.savedToggles);
        }

        public String toString() {
            String str = this.id;
            TargetGoalType targetGoalType = this.goalTypeEnum;
            List<ActivityTarget> list = this.savedToggles;
            String str2 = this.source;
            StringBuilder sb4 = new StringBuilder("SaveActivityMetric(id=");
            sb4.append(str);
            sb4.append(", goalTypeEnum=");
            sb4.append(targetGoalType);
            sb4.append(", savedToggles=");
            return AbstractC38963t7.m124377g(", source=", str2, ")", sb4, list);
        }

        public /* synthetic */ f(String str, TargetGoalType targetGoalType, List list, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, targetGoalType, list, (i13 & 8) != 0 ? "" : str2);
        }
    }

    /* JADX INFO: renamed from: ws2.i$h */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ>\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b!\u0010\u000f¨\u0006\""}, m65681d2 = {"Lws2/i$h;", "Lws2/i;", "", "id", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "goalTypeEnum", "", "Lcom/whoop/weeklyplan/customizeplan/domain/api/BehaviorTarget;", "savedToggles", "source", "<init>", "(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Ljava/util/List;Ljava/lang/String;)V", "a", "(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Ljava/util/List;Ljava/lang/String;)Lws2/i$h;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "b", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "getGoalTypeEnum", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "Ljava/util/List;", "d", "()Ljava/util/List;", "e", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h extends AbstractC37617i {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TargetGoalType goalTypeEnum;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final List<BehaviorTarget> savedToggles;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String id4, TargetGoalType goalTypeEnum, List<BehaviorTarget> savedToggles, String source) {
            super(null);
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(goalTypeEnum, "goalTypeEnum");
            AbstractC22676k.m65750j(savedToggles, "savedToggles");
            AbstractC22676k.m65750j(source, "source");
            this.id = id4;
            this.goalTypeEnum = goalTypeEnum;
            this.savedToggles = savedToggles;
            this.source = source;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ h m120827b(h hVar, String str, TargetGoalType targetGoalType, List list, String str2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = hVar.id;
            }
            if ((i13 & 2) != 0) {
                targetGoalType = hVar.goalTypeEnum;
            }
            if ((i13 & 4) != 0) {
                list = hVar.savedToggles;
            }
            if ((i13 & 8) != 0) {
                str2 = hVar.source;
            }
            return hVar.m120828a(str, targetGoalType, list, str2);
        }

        /* JADX INFO: renamed from: a */
        public final h m120828a(String id4, TargetGoalType goalTypeEnum, List<BehaviorTarget> savedToggles, String source) {
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(goalTypeEnum, "goalTypeEnum");
            AbstractC22676k.m65750j(savedToggles, "savedToggles");
            AbstractC22676k.m65750j(source, "source");
            return new h(id4, goalTypeEnum, savedToggles, source);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: d */
        public final List<BehaviorTarget> m120830d() {
            return this.savedToggles;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof h)) {
                return false;
            }
            h hVar = (h) other;
            return AbstractC22676k.m65745e(this.id, hVar.id) && this.goalTypeEnum == hVar.goalTypeEnum && AbstractC22676k.m65745e(this.savedToggles, hVar.savedToggles) && AbstractC22676k.m65745e(this.source, hVar.source);
        }

        public int hashCode() {
            return this.source.hashCode() + AbstractC11895b.m31983b(AbstractC36095b.m114674b(this.goalTypeEnum, this.id.hashCode() * 31, 31), 31, this.savedToggles);
        }

        public String toString() {
            String str = this.id;
            TargetGoalType targetGoalType = this.goalTypeEnum;
            List<BehaviorTarget> list = this.savedToggles;
            String str2 = this.source;
            StringBuilder sb4 = new StringBuilder("SaveJournalMetric(id=");
            sb4.append(str);
            sb4.append(", goalTypeEnum=");
            sb4.append(targetGoalType);
            sb4.append(", savedToggles=");
            return AbstractC38963t7.m124377g(", source=", str2, ")", sb4, list);
        }

        public /* synthetic */ h(String str, TargetGoalType targetGoalType, List list, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, targetGoalType, list, (i13 & 8) != 0 ? "" : str2);
        }
    }

    /* JADX INFO: renamed from: ws2.i$i */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJB\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b$\u0010\u0010¨\u0006%"}, m65681d2 = {"Lws2/i$i;", "Lws2/i;", "", "id", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "goalTypeEnum", "", "target", "", "migrateSmartAlarm", "source", "<init>", "(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;DZLjava/lang/String;)V", "a", "(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;DZLjava/lang/String;)Lws2/i$i;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "d", "b", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "c", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "D", "g", "()D", "Z", "e", "()Z", "f", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i extends AbstractC37617i {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TargetGoalType goalTypeEnum;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final double target;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean migrateSmartAlarm;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String id4, TargetGoalType goalTypeEnum, double d3, boolean z4, String source) {
            super(null);
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(goalTypeEnum, "goalTypeEnum");
            AbstractC22676k.m65750j(source, "source");
            this.id = id4;
            this.goalTypeEnum = goalTypeEnum;
            this.target = d3;
            this.migrateSmartAlarm = z4;
            this.source = source;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ i m120832b(i iVar, String str, TargetGoalType targetGoalType, double d3, boolean z4, String str2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = iVar.id;
            }
            if ((i13 & 2) != 0) {
                targetGoalType = iVar.goalTypeEnum;
            }
            if ((i13 & 4) != 0) {
                d3 = iVar.target;
            }
            if ((i13 & 8) != 0) {
                z4 = iVar.migrateSmartAlarm;
            }
            if ((i13 & 16) != 0) {
                str2 = iVar.source;
            }
            double d14 = d3;
            return iVar.m120833a(str, targetGoalType, d14, z4, str2);
        }

        /* JADX INFO: renamed from: a */
        public final i m120833a(String id4, TargetGoalType goalTypeEnum, double target, boolean migrateSmartAlarm, String source) {
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(goalTypeEnum, "goalTypeEnum");
            AbstractC22676k.m65750j(source, "source");
            return new i(id4, goalTypeEnum, target, migrateSmartAlarm, source);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TargetGoalType getGoalTypeEnum() {
            return this.goalTypeEnum;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getMigrateSmartAlarm() {
            return this.migrateSmartAlarm;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof i)) {
                return false;
            }
            i iVar = (i) other;
            return AbstractC22676k.m65745e(this.id, iVar.id) && this.goalTypeEnum == iVar.goalTypeEnum && Double.compare(this.target, iVar.target) == 0 && this.migrateSmartAlarm == iVar.migrateSmartAlarm && AbstractC22676k.m65745e(this.source, iVar.source);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final double getTarget() {
            return this.target;
        }

        public int hashCode() {
            return this.source.hashCode() + AbstractC2875y.m8289b(AbstractC17176i.m48499a(AbstractC36095b.m114674b(this.goalTypeEnum, this.id.hashCode() * 31, 31), 31, this.target), 31, this.migrateSmartAlarm);
        }

        public String toString() {
            String str = this.id;
            TargetGoalType targetGoalType = this.goalTypeEnum;
            double d3 = this.target;
            boolean z4 = this.migrateSmartAlarm;
            String str2 = this.source;
            StringBuilder sb4 = new StringBuilder("SaveNumericGoal(id=");
            sb4.append(str);
            sb4.append(", goalTypeEnum=");
            sb4.append(targetGoalType);
            sb4.append(", target=");
            sb4.append(d3);
            sb4.append(", migrateSmartAlarm=");
            sb4.append(z4);
            return AbstractC2875y.m8304q(sb4, ", source=", str2, ")");
        }

        public /* synthetic */ i(String str, TargetGoalType targetGoalType, double d3, boolean z4, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, targetGoalType, d3, (i13 & 8) != 0 ? false : z4, (i13 & 16) != 0 ? "" : str2);
        }
    }
}
