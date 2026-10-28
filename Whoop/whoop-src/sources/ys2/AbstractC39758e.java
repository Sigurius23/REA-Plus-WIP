package ys2;

import androidx.core.app.NotificationCompat;
import bu2.C3643d;
import c13.AbstractC3855a;
import com.whoop.design.util.TextResource;
import com.whoop.weeklyplan.customizeplan.domain.api.ActivityTarget;
import com.whoop.weeklyplan.customizeplan.domain.api.BehaviorTarget;
import com.whoop.weeklyplan.customizeplan.domain.api.ConfirmTarget;
import com.whoop.weeklyplan.customizeplan.domain.api.TargetGoalType;
import hc3.AbstractC17176i;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jh3.AbstractC21702c;
import km0.C22581e;
import live.hms.video.media.tracks.HMSTrackSource;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p730qt2.C30596c0;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import ws2.C37615g;

/* JADX INFO: renamed from: ys2.e */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0011\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0011\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%¨\u0006&"}, m65681d2 = {"Lys2/e;", "", "<init>", "()V", "c", "b", "f", "a", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "g", "e", "d", "l", "m", "n", "o", "p", "i", "j", "q", "k", "Lys2/e$a;", "Lys2/e$b;", "Lys2/e$c;", "Lys2/e$d;", "Lys2/e$e;", "Lys2/e$f;", "Lys2/e$g;", "Lys2/e$h;", "Lys2/e$i;", "Lys2/e$j;", "Lys2/e$k;", "Lys2/e$l;", "Lys2/e$m;", "Lys2/e$n;", "Lys2/e$o;", "Lys2/e$p;", "Lys2/e$q;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39758e {

    /* JADX INFO: renamed from: ys2.e$a */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0013\u0010\r¨\u0006\u001a"}, m65681d2 = {"Lys2/e$a;", "Lys2/e;", "", "id", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "targetGoalType", "", "curPage", "<init>", "(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "c", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "I", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC39758e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TargetGoalType targetGoalType;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final int curPage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String id4, TargetGoalType targetGoalType, int i13) {
            super(null);
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(targetGoalType, "targetGoalType");
            this.id = id4;
            this.targetGoalType = targetGoalType;
            this.curPage = i13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getCurPage() {
            return this.curPage;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TargetGoalType getTargetGoalType() {
            return this.targetGoalType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.id, aVar.id) && this.targetGoalType == aVar.targetGoalType && this.curPage == aVar.curPage;
        }

        public int hashCode() {
            return Integer.hashCode(this.curPage) + AbstractC36095b.m114674b(this.targetGoalType, this.id.hashCode() * 31, 31);
        }

        public String toString() {
            String str = this.id;
            TargetGoalType targetGoalType = this.targetGoalType;
            int i13 = this.curPage;
            StringBuilder sb4 = new StringBuilder("DeleteMetricError(id=");
            sb4.append(str);
            sb4.append(", targetGoalType=");
            sb4.append(targetGoalType);
            sb4.append(", curPage=");
            return AbstractC18489d0.m53371l(sb4, i13, ")");
        }
    }

    /* JADX INFO: renamed from: ys2.e$b */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lys2/e$b;", "Lys2/e;", "", "", "screens", "<init>", "(Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC39758e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<String> screens;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<String> screens) {
            super(null);
            AbstractC22676k.m65750j(screens, "screens");
            this.screens = screens;
        }

        /* JADX INFO: renamed from: a */
        public final List<String> m127183a() {
            return this.screens;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.screens, ((b) other).screens);
        }

        public int hashCode() {
            return this.screens.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106654m("InitialLoadError(screens=", ")", this.screens);
        }
    }

    /* JADX INFO: renamed from: ys2.e$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lys2/e$c;", "Lys2/e;", "<init>", "()V", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC39758e {

        /* JADX INFO: renamed from: a */
        public static final c f171182a = new c();

        private c() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ys2.e$d */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lys2/e$d;", "Lys2/e;", "", "exit", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC39758e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean exit;

        public d(boolean z4) {
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
            return (other instanceof d) && this.exit == ((d) other).exit;
        }

        public int hashCode() {
            return Boolean.hashCode(this.exit);
        }

        public String toString() {
            return AbstractC3855a.m11827k("RemoveSuccess(exit=", ")", this.exit);
        }
    }

    /* JADX INFO: renamed from: ys2.e$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lys2/e$e;", "Lys2/e;", "<init>", "()V", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC39758e {

        /* JADX INFO: renamed from: a */
        public static final e f171184a = new e();

        private e() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ys2.e$f */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u0016\u0010\r¨\u0006\u001a"}, m65681d2 = {"Lys2/e$f;", "Lys2/e;", "", "id", "Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget;", "confirmTarget", "", "curPage", "<init>", "(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget;", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget;", "I", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC39758e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final ConfirmTarget confirmTarget;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final int curPage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String id4, ConfirmTarget confirmTarget, int i13) {
            super(null);
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(confirmTarget, "confirmTarget");
            this.id = id4;
            this.confirmTarget = confirmTarget;
            this.curPage = i13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ConfirmTarget getConfirmTarget() {
            return this.confirmTarget;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getCurPage() {
            return this.curPage;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof f)) {
                return false;
            }
            f fVar = (f) other;
            return AbstractC22676k.m65745e(this.id, fVar.id) && AbstractC22676k.m65745e(this.confirmTarget, fVar.confirmTarget) && this.curPage == fVar.curPage;
        }

        public int hashCode() {
            return Integer.hashCode(this.curPage) + ((this.confirmTarget.hashCode() + (this.id.hashCode() * 31)) * 31);
        }

        public String toString() {
            String str = this.id;
            ConfirmTarget confirmTarget = this.confirmTarget;
            int i13 = this.curPage;
            StringBuilder sb4 = new StringBuilder("SaveMetricError(id=");
            sb4.append(str);
            sb4.append(", confirmTarget=");
            sb4.append(confirmTarget);
            sb4.append(", curPage=");
            return AbstractC18489d0.m53371l(sb4, i13, ")");
        }
    }

    /* JADX INFO: renamed from: ys2.e$g */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lys2/e$g;", "Lys2/e;", "", "exit", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g extends AbstractC39758e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean exit;

        public g(boolean z4) {
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
            return (other instanceof g) && this.exit == ((g) other).exit;
        }

        public int hashCode() {
            return Boolean.hashCode(this.exit);
        }

        public String toString() {
            return AbstractC3855a.m11827k("SaveSuccess(exit=", ")", this.exit);
        }
    }

    /* JADX INFO: renamed from: ys2.e$h */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lys2/e$h;", "Lys2/e;", "<init>", "()V", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC39758e {

        /* JADX INFO: renamed from: a */
        public static final h f171189a = new h();

        private h() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ys2.e$i */
    @Metadata(m65680d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\b\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b0\u00102\u001a\u0004\b3\u00104R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b9\u00106\u001a\u0004\b5\u00108R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b)\u00102\u001a\u0004\b9\u00104R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b'\u0010<R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b*\u0010?R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\b8\u0006¢\u0006\f\n\u0004\b,\u00102\u001a\u0004\b=\u00104R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b.\u0010BR\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b7\u0010C\u001a\u0004\b:\u0010DR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b3\u0010E\u001a\u0004\b@\u0010F¨\u0006G"}, m65681d2 = {"Lys2/e$i;", "Lys2/e;", "", "planId", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", HMSTrackSource.SCREEN, "Lys2/f;", "header", "", "Lm91/u;", "topItemStates", "Lcom/whoop/design/util/TextResource;", "topHeadingDisplay", "headingDisplay", "itemStates", "Lys2/a;", "addButtonInfo", "Lys2/b;", "bottom", "Lcom/whoop/weeklyplan/customizeplan/domain/api/ActivityTarget;", "saveValue", "Lkm0/e;", "bottomSheet", "Lws2/g;", NotificationCompat.CATEGORY_PROGRESS, "Lqt2/c0;", "tooltip", "<init>", "(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Lys2/f;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lys2/a;Lys2/b;Ljava/util/List;Lkm0/e;Lws2/g;Lqt2/c0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "g", "b", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "j", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "c", "Lys2/f;", "d", "()Lys2/f;", "Ljava/util/List;", "m", "()Ljava/util/List;", "e", "Lcom/whoop/design/util/TextResource;", "l", "()Lcom/whoop/design/util/TextResource;", "f", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lys2/a;", "()Lys2/a;", "i", "Lys2/b;", "()Lys2/b;", "k", "Lkm0/e;", "()Lkm0/e;", "Lws2/g;", "()Lws2/g;", "Lqt2/c0;", "()Lqt2/c0;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i extends AbstractC39758e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String planId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TargetGoalType screen;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C39759f header;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final List<InterfaceC25312u> topItemStates;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final TextResource topHeadingDisplay;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final TextResource headingDisplay;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final List<InterfaceC25312u> itemStates;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final C39754a addButtonInfo;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final C39755b bottom;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final List<ActivityTarget> saveValue;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final C22581e bottomSheet;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        private final C37615g progress;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        private final C30596c0 tooltip;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(String planId, TargetGoalType screen, C39759f header, List<? extends InterfaceC25312u> topItemStates, TextResource topHeadingDisplay, TextResource headingDisplay, List<? extends InterfaceC25312u> itemStates, C39754a addButtonInfo, C39755b bottom, List<ActivityTarget> saveValue, C22581e bottomSheet, C37615g progress, C30596c0 c30596c0) {
            super(null);
            AbstractC22676k.m65750j(planId, "planId");
            AbstractC22676k.m65750j(screen, "screen");
            AbstractC22676k.m65750j(header, "header");
            AbstractC22676k.m65750j(topItemStates, "topItemStates");
            AbstractC22676k.m65750j(topHeadingDisplay, "topHeadingDisplay");
            AbstractC22676k.m65750j(headingDisplay, "headingDisplay");
            AbstractC22676k.m65750j(itemStates, "itemStates");
            AbstractC22676k.m65750j(addButtonInfo, "addButtonInfo");
            AbstractC22676k.m65750j(bottom, "bottom");
            AbstractC22676k.m65750j(saveValue, "saveValue");
            AbstractC22676k.m65750j(bottomSheet, "bottomSheet");
            AbstractC22676k.m65750j(progress, "progress");
            this.planId = planId;
            this.screen = screen;
            this.header = header;
            this.topItemStates = topItemStates;
            this.topHeadingDisplay = topHeadingDisplay;
            this.headingDisplay = headingDisplay;
            this.itemStates = itemStates;
            this.addButtonInfo = addButtonInfo;
            this.bottom = bottom;
            this.saveValue = saveValue;
            this.bottomSheet = bottomSheet;
            this.progress = progress;
            this.tooltip = c30596c0;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C39754a getAddButtonInfo() {
            return this.addButtonInfo;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C39755b getBottom() {
            return this.bottom;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C22581e getBottomSheet() {
            return this.bottomSheet;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final C39759f getHeader() {
            return this.header;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final TextResource getHeadingDisplay() {
            return this.headingDisplay;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof i)) {
                return false;
            }
            i iVar = (i) other;
            return AbstractC22676k.m65745e(this.planId, iVar.planId) && this.screen == iVar.screen && AbstractC22676k.m65745e(this.header, iVar.header) && AbstractC22676k.m65745e(this.topItemStates, iVar.topItemStates) && AbstractC22676k.m65745e(this.topHeadingDisplay, iVar.topHeadingDisplay) && AbstractC22676k.m65745e(this.headingDisplay, iVar.headingDisplay) && AbstractC22676k.m65745e(this.itemStates, iVar.itemStates) && AbstractC22676k.m65745e(this.addButtonInfo, iVar.addButtonInfo) && AbstractC22676k.m65745e(this.bottom, iVar.bottom) && AbstractC22676k.m65745e(this.saveValue, iVar.saveValue) && AbstractC22676k.m65745e(this.bottomSheet, iVar.bottomSheet) && AbstractC22676k.m65745e(this.progress, iVar.progress) && AbstractC22676k.m65745e(this.tooltip, iVar.tooltip);
        }

        /* JADX INFO: renamed from: f */
        public final List<InterfaceC25312u> m127194f() {
            return this.itemStates;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getPlanId() {
            return this.planId;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final C37615g getProgress() {
            return this.progress;
        }

        public int hashCode() {
            int iHashCode = (this.progress.hashCode() + ((this.bottomSheet.hashCode() + AbstractC11895b.m31983b((this.bottom.hashCode() + ((this.addButtonInfo.hashCode() + AbstractC11895b.m31983b(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC11895b.m31983b((this.header.hashCode() + AbstractC36095b.m114674b(this.screen, this.planId.hashCode() * 31, 31)) * 31, 31, this.topItemStates), this.topHeadingDisplay, 31), this.headingDisplay, 31), 31, this.itemStates)) * 31)) * 31, 31, this.saveValue)) * 31)) * 31;
            C30596c0 c30596c0 = this.tooltip;
            return iHashCode + (c30596c0 == null ? 0 : c30596c0.hashCode());
        }

        /* JADX INFO: renamed from: i */
        public final List<ActivityTarget> m127197i() {
            return this.saveValue;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final TargetGoalType getScreen() {
            return this.screen;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final C30596c0 getTooltip() {
            return this.tooltip;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final TextResource getTopHeadingDisplay() {
            return this.topHeadingDisplay;
        }

        /* JADX INFO: renamed from: m */
        public final List<InterfaceC25312u> m127201m() {
            return this.topItemStates;
        }

        public String toString() {
            String str = this.planId;
            TargetGoalType targetGoalType = this.screen;
            C39759f c39759f = this.header;
            List<InterfaceC25312u> list = this.topItemStates;
            TextResource textResource = this.topHeadingDisplay;
            TextResource textResource2 = this.headingDisplay;
            List<InterfaceC25312u> list2 = this.itemStates;
            C39754a c39754a = this.addButtonInfo;
            C39755b c39755b = this.bottom;
            List<ActivityTarget> list3 = this.saveValue;
            C22581e c22581e = this.bottomSheet;
            C37615g c37615g = this.progress;
            C30596c0 c30596c0 = this.tooltip;
            StringBuilder sb4 = new StringBuilder("SetUpActivities(planId=");
            sb4.append(str);
            sb4.append(", screen=");
            sb4.append(targetGoalType);
            sb4.append(", header=");
            sb4.append(c39759f);
            sb4.append(", topItemStates=");
            sb4.append(list);
            sb4.append(", topHeadingDisplay=");
            AbstractC30007c.m91855y(sb4, textResource, ", headingDisplay=", textResource2, ", itemStates=");
            sb4.append(list2);
            sb4.append(", addButtonInfo=");
            sb4.append(c39754a);
            sb4.append(", bottom=");
            sb4.append(c39755b);
            sb4.append(", saveValue=");
            sb4.append(list3);
            sb4.append(", bottomSheet=");
            sb4.append(c22581e);
            sb4.append(", progress=");
            sb4.append(c37615g);
            sb4.append(", tooltip=");
            sb4.append(c30596c0);
            sb4.append(")");
            return sb4.toString();
        }
    }

    /* JADX INFO: renamed from: ys2.e$j */
    @Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\b\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b0\u00106\u001a\u0004\b7\u00108R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b9\u00106\u001a\u0004\b9\u00108R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b:\u00106\u001a\u0004\b;\u00108R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b)\u00103\u001a\u0004\b:\u00105R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b'\u0010>R\u0017\u0010\u0012\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b?\u00106\u001a\u0004\b2\u00108R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b,\u0010@\u001a\u0004\b*\u0010AR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\b8\u0006¢\u0006\f\n\u0004\b;\u00103\u001a\u0004\b?\u00105R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b7\u0010B\u001a\u0004\b.\u0010CR\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b4\u0010D\u001a\u0004\b<\u0010E¨\u0006F"}, m65681d2 = {"Lys2/e$j;", "Lys2/e;", "", "planId", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", HMSTrackSource.SCREEN, "Lys2/f;", "header", "", "Lm91/u;", "topItemStates", "Lcom/whoop/design/util/TextResource;", "topHeadingDisplay", "headingDisplay", "subHeadingDisplay", "itemStates", "Lys2/a;", "addButtonInfo", "buttonDescriptionDisplay", "Lys2/b;", "bottom", "Lcom/whoop/weeklyplan/customizeplan/domain/api/BehaviorTarget;", "saveValue", "Lkm0/e;", "bottomSheet", "Lws2/g;", NotificationCompat.CATEGORY_PROGRESS, "<init>", "(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Lys2/f;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lys2/a;Lcom/whoop/design/util/TextResource;Lys2/b;Ljava/util/List;Lkm0/e;Lws2/g;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "b", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "k", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "c", "Lys2/f;", "e", "()Lys2/f;", "d", "Ljava/util/List;", "n", "()Ljava/util/List;", "Lcom/whoop/design/util/TextResource;", "m", "()Lcom/whoop/design/util/TextResource;", "f", "g", "l", "i", "Lys2/a;", "()Lys2/a;", "j", "Lys2/b;", "()Lys2/b;", "Lkm0/e;", "()Lkm0/e;", "Lws2/g;", "()Lws2/g;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class j extends AbstractC39758e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String planId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TargetGoalType screen;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C39759f header;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final List<InterfaceC25312u> topItemStates;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final TextResource topHeadingDisplay;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final TextResource headingDisplay;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final TextResource subHeadingDisplay;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final List<InterfaceC25312u> itemStates;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final C39754a addButtonInfo;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final TextResource buttonDescriptionDisplay;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final C39755b bottom;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        private final List<BehaviorTarget> saveValue;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        private final C22581e bottomSheet;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        private final C37615g progress;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(String planId, TargetGoalType screen, C39759f header, List<? extends InterfaceC25312u> topItemStates, TextResource topHeadingDisplay, TextResource headingDisplay, TextResource textResource, List<? extends InterfaceC25312u> itemStates, C39754a addButtonInfo, TextResource buttonDescriptionDisplay, C39755b bottom, List<BehaviorTarget> saveValue, C22581e bottomSheet, C37615g progress) {
            super(null);
            AbstractC22676k.m65750j(planId, "planId");
            AbstractC22676k.m65750j(screen, "screen");
            AbstractC22676k.m65750j(header, "header");
            AbstractC22676k.m65750j(topItemStates, "topItemStates");
            AbstractC22676k.m65750j(topHeadingDisplay, "topHeadingDisplay");
            AbstractC22676k.m65750j(headingDisplay, "headingDisplay");
            AbstractC22676k.m65750j(itemStates, "itemStates");
            AbstractC22676k.m65750j(addButtonInfo, "addButtonInfo");
            AbstractC22676k.m65750j(buttonDescriptionDisplay, "buttonDescriptionDisplay");
            AbstractC22676k.m65750j(bottom, "bottom");
            AbstractC22676k.m65750j(saveValue, "saveValue");
            AbstractC22676k.m65750j(bottomSheet, "bottomSheet");
            AbstractC22676k.m65750j(progress, "progress");
            this.planId = planId;
            this.screen = screen;
            this.header = header;
            this.topItemStates = topItemStates;
            this.topHeadingDisplay = topHeadingDisplay;
            this.headingDisplay = headingDisplay;
            this.subHeadingDisplay = textResource;
            this.itemStates = itemStates;
            this.addButtonInfo = addButtonInfo;
            this.buttonDescriptionDisplay = buttonDescriptionDisplay;
            this.bottom = bottom;
            this.saveValue = saveValue;
            this.bottomSheet = bottomSheet;
            this.progress = progress;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C39754a getAddButtonInfo() {
            return this.addButtonInfo;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C39755b getBottom() {
            return this.bottom;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C22581e getBottomSheet() {
            return this.bottomSheet;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextResource getButtonDescriptionDisplay() {
            return this.buttonDescriptionDisplay;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final C39759f getHeader() {
            return this.header;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof j)) {
                return false;
            }
            j jVar = (j) other;
            return AbstractC22676k.m65745e(this.planId, jVar.planId) && this.screen == jVar.screen && AbstractC22676k.m65745e(this.header, jVar.header) && AbstractC22676k.m65745e(this.topItemStates, jVar.topItemStates) && AbstractC22676k.m65745e(this.topHeadingDisplay, jVar.topHeadingDisplay) && AbstractC22676k.m65745e(this.headingDisplay, jVar.headingDisplay) && AbstractC22676k.m65745e(this.subHeadingDisplay, jVar.subHeadingDisplay) && AbstractC22676k.m65745e(this.itemStates, jVar.itemStates) && AbstractC22676k.m65745e(this.addButtonInfo, jVar.addButtonInfo) && AbstractC22676k.m65745e(this.buttonDescriptionDisplay, jVar.buttonDescriptionDisplay) && AbstractC22676k.m65745e(this.bottom, jVar.bottom) && AbstractC22676k.m65745e(this.saveValue, jVar.saveValue) && AbstractC22676k.m65745e(this.bottomSheet, jVar.bottomSheet) && AbstractC22676k.m65745e(this.progress, jVar.progress);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final TextResource getHeadingDisplay() {
            return this.headingDisplay;
        }

        /* JADX INFO: renamed from: g */
        public final List<InterfaceC25312u> m127208g() {
            return this.itemStates;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getPlanId() {
            return this.planId;
        }

        public int hashCode() {
            int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC11895b.m31983b((this.header.hashCode() + AbstractC36095b.m114674b(this.screen, this.planId.hashCode() * 31, 31)) * 31, 31, this.topItemStates), this.topHeadingDisplay, 31), this.headingDisplay, 31);
            TextResource textResource = this.subHeadingDisplay;
            return this.progress.hashCode() + ((this.bottomSheet.hashCode() + AbstractC11895b.m31983b((this.bottom.hashCode() + AbstractC31061c.m95625a((this.addButtonInfo.hashCode() + AbstractC11895b.m31983b((iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31, 31, this.itemStates)) * 31, this.buttonDescriptionDisplay, 31)) * 31, 31, this.saveValue)) * 31);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final C37615g getProgress() {
            return this.progress;
        }

        /* JADX INFO: renamed from: j */
        public final List<BehaviorTarget> m127211j() {
            return this.saveValue;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final TargetGoalType getScreen() {
            return this.screen;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final TextResource getSubHeadingDisplay() {
            return this.subHeadingDisplay;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final TextResource getTopHeadingDisplay() {
            return this.topHeadingDisplay;
        }

        /* JADX INFO: renamed from: n */
        public final List<InterfaceC25312u> m127215n() {
            return this.topItemStates;
        }

        public String toString() {
            String str = this.planId;
            TargetGoalType targetGoalType = this.screen;
            C39759f c39759f = this.header;
            List<InterfaceC25312u> list = this.topItemStates;
            TextResource textResource = this.topHeadingDisplay;
            TextResource textResource2 = this.headingDisplay;
            TextResource textResource3 = this.subHeadingDisplay;
            List<InterfaceC25312u> list2 = this.itemStates;
            C39754a c39754a = this.addButtonInfo;
            TextResource textResource4 = this.buttonDescriptionDisplay;
            C39755b c39755b = this.bottom;
            List<BehaviorTarget> list3 = this.saveValue;
            C22581e c22581e = this.bottomSheet;
            C37615g c37615g = this.progress;
            StringBuilder sb4 = new StringBuilder("SetUpBehaviors(planId=");
            sb4.append(str);
            sb4.append(", screen=");
            sb4.append(targetGoalType);
            sb4.append(", header=");
            sb4.append(c39759f);
            sb4.append(", topItemStates=");
            sb4.append(list);
            sb4.append(", topHeadingDisplay=");
            AbstractC30007c.m91855y(sb4, textResource, ", headingDisplay=", textResource2, ", subHeadingDisplay=");
            AbstractC21702c.m61143n(textResource3, ", itemStates=", ", addButtonInfo=", sb4, list2);
            sb4.append(c39754a);
            sb4.append(", buttonDescriptionDisplay=");
            sb4.append(textResource4);
            sb4.append(", bottom=");
            sb4.append(c39755b);
            sb4.append(", saveValue=");
            sb4.append(list3);
            sb4.append(", bottomSheet=");
            sb4.append(c22581e);
            sb4.append(", progress=");
            sb4.append(c37615g);
            sb4.append(")");
            return sb4.toString();
        }
    }

    /* JADX INFO: renamed from: ys2.e$k */
    @Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001f\u0010%R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010&\u001a\u0004\b#\u0010'R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b\u001c\u0010*R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b!\u0010.\u001a\u0004\b(\u0010/¨\u00060"}, m65681d2 = {"Lys2/e$k;", "Lys2/e;", "", "planId", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", HMSTrackSource.SCREEN, "Lys2/f;", "header", "Lbu2/d;", "metricSlider", "Lys2/b;", "bottom", "", "saveValue", "Lws2/g;", NotificationCompat.CATEGORY_PROGRESS, "<init>", "(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Lys2/f;Lbu2/d;Lys2/b;DLws2/g;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "g", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "c", "Lys2/f;", "()Lys2/f;", "Lbu2/d;", "()Lbu2/d;", "e", "Lys2/b;", "()Lys2/b;", "f", "D", "()D", "Lws2/g;", "()Lws2/g;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class k extends AbstractC39758e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String planId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TargetGoalType screen;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C39759f header;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final C3643d metricSlider;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final C39755b bottom;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final double saveValue;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final C37615g progress;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String planId, TargetGoalType screen, C39759f header, C3643d metricSlider, C39755b bottom, double d3, C37615g progress) {
            super(null);
            AbstractC22676k.m65750j(planId, "planId");
            AbstractC22676k.m65750j(screen, "screen");
            AbstractC22676k.m65750j(header, "header");
            AbstractC22676k.m65750j(metricSlider, "metricSlider");
            AbstractC22676k.m65750j(bottom, "bottom");
            AbstractC22676k.m65750j(progress, "progress");
            this.planId = planId;
            this.screen = screen;
            this.header = header;
            this.metricSlider = metricSlider;
            this.bottom = bottom;
            this.saveValue = d3;
            this.progress = progress;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C39755b getBottom() {
            return this.bottom;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C39759f getHeader() {
            return this.header;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C3643d getMetricSlider() {
            return this.metricSlider;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getPlanId() {
            return this.planId;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final C37615g getProgress() {
            return this.progress;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof k)) {
                return false;
            }
            k kVar = (k) other;
            return AbstractC22676k.m65745e(this.planId, kVar.planId) && this.screen == kVar.screen && AbstractC22676k.m65745e(this.header, kVar.header) && AbstractC22676k.m65745e(this.metricSlider, kVar.metricSlider) && AbstractC22676k.m65745e(this.bottom, kVar.bottom) && Double.compare(this.saveValue, kVar.saveValue) == 0 && AbstractC22676k.m65745e(this.progress, kVar.progress);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final double getSaveValue() {
            return this.saveValue;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final TargetGoalType getScreen() {
            return this.screen;
        }

        public int hashCode() {
            return this.progress.hashCode() + AbstractC17176i.m48499a((this.bottom.hashCode() + ((this.metricSlider.hashCode() + ((this.header.hashCode() + AbstractC36095b.m114674b(this.screen, this.planId.hashCode() * 31, 31)) * 31)) * 31)) * 31, 31, this.saveValue);
        }

        public String toString() {
            return "SetUpGoalTime(planId=" + this.planId + ", screen=" + this.screen + ", header=" + this.header + ", metricSlider=" + this.metricSlider + ", bottom=" + this.bottom + ", saveValue=" + this.saveValue + ", progress=" + this.progress + ")";
        }
    }

    /* JADX INFO: renamed from: ys2.e$l */
    @Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b!\u0010,\u001a\u0004\b\u001f\u0010-R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b0\u00102\u001a\u0004\b.\u00103R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b$\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b5\u00107\u001a\u0004\b\"\u00108¨\u00069"}, m65681d2 = {"Lys2/e$l;", "Lys2/e;", "", "planId", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", HMSTrackSource.SCREEN, "Lys2/f;", "header", "Lbu2/d;", "metricSlider", "Lys2/b;", "bottom", "", "saveValue", "Lws2/g;", NotificationCompat.CATEGORY_PROGRESS, "", "isSmartAlarmOverride", "Lys2/c;", "customizePlanDialogViewState", "<init>", "(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Lys2/f;Lbu2/d;Lys2/b;DLws2/g;ZLys2/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "c", "Lys2/f;", "()Lys2/f;", "d", "Lbu2/d;", "()Lbu2/d;", "Lys2/b;", "()Lys2/b;", "f", "D", "g", "()D", "Lws2/g;", "()Lws2/g;", "Z", "i", "()Z", "Lys2/c;", "()Lys2/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class l extends AbstractC39758e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String planId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TargetGoalType screen;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C39759f header;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final C3643d metricSlider;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final C39755b bottom;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final double saveValue;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final C37615g progress;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final boolean isSmartAlarmOverride;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final C39756c customizePlanDialogViewState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String planId, TargetGoalType screen, C39759f header, C3643d metricSlider, C39755b bottom, double d3, C37615g progress, boolean z4, C39756c c39756c) {
            super(null);
            AbstractC22676k.m65750j(planId, "planId");
            AbstractC22676k.m65750j(screen, "screen");
            AbstractC22676k.m65750j(header, "header");
            AbstractC22676k.m65750j(metricSlider, "metricSlider");
            AbstractC22676k.m65750j(bottom, "bottom");
            AbstractC22676k.m65750j(progress, "progress");
            this.planId = planId;
            this.screen = screen;
            this.header = header;
            this.metricSlider = metricSlider;
            this.bottom = bottom;
            this.saveValue = d3;
            this.progress = progress;
            this.isSmartAlarmOverride = z4;
            this.customizePlanDialogViewState = c39756c;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C39755b getBottom() {
            return this.bottom;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C39756c getCustomizePlanDialogViewState() {
            return this.customizePlanDialogViewState;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C39759f getHeader() {
            return this.header;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final C3643d getMetricSlider() {
            return this.metricSlider;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getPlanId() {
            return this.planId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof l)) {
                return false;
            }
            l lVar = (l) other;
            return AbstractC22676k.m65745e(this.planId, lVar.planId) && this.screen == lVar.screen && AbstractC22676k.m65745e(this.header, lVar.header) && AbstractC22676k.m65745e(this.metricSlider, lVar.metricSlider) && AbstractC22676k.m65745e(this.bottom, lVar.bottom) && Double.compare(this.saveValue, lVar.saveValue) == 0 && AbstractC22676k.m65745e(this.progress, lVar.progress) && this.isSmartAlarmOverride == lVar.isSmartAlarmOverride && AbstractC22676k.m65745e(this.customizePlanDialogViewState, lVar.customizePlanDialogViewState);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final C37615g getProgress() {
            return this.progress;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final double getSaveValue() {
            return this.saveValue;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final TargetGoalType getScreen() {
            return this.screen;
        }

        public int hashCode() {
            int iM8289b = AbstractC2875y.m8289b((this.progress.hashCode() + AbstractC17176i.m48499a((this.bottom.hashCode() + ((this.metricSlider.hashCode() + ((this.header.hashCode() + AbstractC36095b.m114674b(this.screen, this.planId.hashCode() * 31, 31)) * 31)) * 31)) * 31, 31, this.saveValue)) * 31, 31, this.isSmartAlarmOverride);
            C39756c c39756c = this.customizePlanDialogViewState;
            return iM8289b + (c39756c == null ? 0 : c39756c.hashCode());
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getIsSmartAlarmOverride() {
            return this.isSmartAlarmOverride;
        }

        public String toString() {
            return "SetUpSleep(planId=" + this.planId + ", screen=" + this.screen + ", header=" + this.header + ", metricSlider=" + this.metricSlider + ", bottom=" + this.bottom + ", saveValue=" + this.saveValue + ", progress=" + this.progress + ", isSmartAlarmOverride=" + this.isSmartAlarmOverride + ", customizePlanDialogViewState=" + this.customizePlanDialogViewState + ")";
        }
    }

    /* JADX INFO: renamed from: ys2.e$m */
    @Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b!\u0010'R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010(\u001a\u0004\b%\u0010)R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b\u001e\u0010,R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b-\u0010/R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b#\u00100\u001a\u0004\b*\u00101R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105¨\u00066"}, m65681d2 = {"Lys2/e$m;", "Lys2/e;", "", "planId", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", HMSTrackSource.SCREEN, "Lys2/f;", "header", "Lbu2/d;", "metricSlider", "Lys2/b;", "bottom", "", "saveValue", "Lws2/g;", NotificationCompat.CATEGORY_PROGRESS, "Lys2/c;", "customizePlanDialogViewState", "<init>", "(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Lys2/f;Lbu2/d;Lys2/b;DLws2/g;Lys2/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "g", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "c", "Lys2/f;", "()Lys2/f;", "Lbu2/d;", "()Lbu2/d;", "e", "Lys2/b;", "()Lys2/b;", "f", "D", "()D", "Lws2/g;", "()Lws2/g;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lys2/c;", "getCustomizePlanDialogViewState", "()Lys2/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class m extends AbstractC39758e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String planId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TargetGoalType screen;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C39759f header;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final C3643d metricSlider;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final C39755b bottom;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final double saveValue;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final C37615g progress;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final C39756c customizePlanDialogViewState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String planId, TargetGoalType screen, C39759f header, C3643d metricSlider, C39755b bottom, double d3, C37615g progress, C39756c c39756c) {
            super(null);
            AbstractC22676k.m65750j(planId, "planId");
            AbstractC22676k.m65750j(screen, "screen");
            AbstractC22676k.m65750j(header, "header");
            AbstractC22676k.m65750j(metricSlider, "metricSlider");
            AbstractC22676k.m65750j(bottom, "bottom");
            AbstractC22676k.m65750j(progress, "progress");
            this.planId = planId;
            this.screen = screen;
            this.header = header;
            this.metricSlider = metricSlider;
            this.bottom = bottom;
            this.saveValue = d3;
            this.progress = progress;
            this.customizePlanDialogViewState = c39756c;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C39755b getBottom() {
            return this.bottom;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C39759f getHeader() {
            return this.header;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C3643d getMetricSlider() {
            return this.metricSlider;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getPlanId() {
            return this.planId;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final C37615g getProgress() {
            return this.progress;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof m)) {
                return false;
            }
            m mVar = (m) other;
            return AbstractC22676k.m65745e(this.planId, mVar.planId) && this.screen == mVar.screen && AbstractC22676k.m65745e(this.header, mVar.header) && AbstractC22676k.m65745e(this.metricSlider, mVar.metricSlider) && AbstractC22676k.m65745e(this.bottom, mVar.bottom) && Double.compare(this.saveValue, mVar.saveValue) == 0 && AbstractC22676k.m65745e(this.progress, mVar.progress) && AbstractC22676k.m65745e(this.customizePlanDialogViewState, mVar.customizePlanDialogViewState);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final double getSaveValue() {
            return this.saveValue;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final TargetGoalType getScreen() {
            return this.screen;
        }

        public int hashCode() {
            int iHashCode = (this.progress.hashCode() + AbstractC17176i.m48499a((this.bottom.hashCode() + ((this.metricSlider.hashCode() + ((this.header.hashCode() + AbstractC36095b.m114674b(this.screen, this.planId.hashCode() * 31, 31)) * 31)) * 31)) * 31, 31, this.saveValue)) * 31;
            C39756c c39756c = this.customizePlanDialogViewState;
            return iHashCode + (c39756c == null ? 0 : c39756c.hashCode());
        }

        public String toString() {
            return "SetUpSleepConsistency(planId=" + this.planId + ", screen=" + this.screen + ", header=" + this.header + ", metricSlider=" + this.metricSlider + ", bottom=" + this.bottom + ", saveValue=" + this.saveValue + ", progress=" + this.progress + ", customizePlanDialogViewState=" + this.customizePlanDialogViewState + ")";
        }
    }

    /* JADX INFO: renamed from: ys2.e$n */
    @Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b!\u0010,\u001a\u0004\b\u001f\u0010-R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b0\u00102\u001a\u0004\b.\u00103R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b$\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b5\u00107\u001a\u0004\b\"\u00108¨\u00069"}, m65681d2 = {"Lys2/e$n;", "Lys2/e;", "", "planId", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", HMSTrackSource.SCREEN, "Lys2/f;", "header", "Lbu2/d;", "metricSlider", "Lys2/b;", "bottom", "", "saveValue", "Lws2/g;", NotificationCompat.CATEGORY_PROGRESS, "", "isSmartAlarmOverride", "Lys2/c;", "customizePlanDialogViewState", "<init>", "(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Lys2/f;Lbu2/d;Lys2/b;DLws2/g;ZLys2/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "c", "Lys2/f;", "()Lys2/f;", "d", "Lbu2/d;", "()Lbu2/d;", "Lys2/b;", "()Lys2/b;", "f", "D", "g", "()D", "Lws2/g;", "()Lws2/g;", "Z", "i", "()Z", "Lys2/c;", "()Lys2/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class n extends AbstractC39758e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String planId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TargetGoalType screen;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C39759f header;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final C3643d metricSlider;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final C39755b bottom;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final double saveValue;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final C37615g progress;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final boolean isSmartAlarmOverride;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final C39756c customizePlanDialogViewState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String planId, TargetGoalType screen, C39759f header, C3643d metricSlider, C39755b bottom, double d3, C37615g progress, boolean z4, C39756c c39756c) {
            super(null);
            AbstractC22676k.m65750j(planId, "planId");
            AbstractC22676k.m65750j(screen, "screen");
            AbstractC22676k.m65750j(header, "header");
            AbstractC22676k.m65750j(metricSlider, "metricSlider");
            AbstractC22676k.m65750j(bottom, "bottom");
            AbstractC22676k.m65750j(progress, "progress");
            this.planId = planId;
            this.screen = screen;
            this.header = header;
            this.metricSlider = metricSlider;
            this.bottom = bottom;
            this.saveValue = d3;
            this.progress = progress;
            this.isSmartAlarmOverride = z4;
            this.customizePlanDialogViewState = c39756c;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C39755b getBottom() {
            return this.bottom;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C39756c getCustomizePlanDialogViewState() {
            return this.customizePlanDialogViewState;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C39759f getHeader() {
            return this.header;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final C3643d getMetricSlider() {
            return this.metricSlider;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getPlanId() {
            return this.planId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof n)) {
                return false;
            }
            n nVar = (n) other;
            return AbstractC22676k.m65745e(this.planId, nVar.planId) && this.screen == nVar.screen && AbstractC22676k.m65745e(this.header, nVar.header) && AbstractC22676k.m65745e(this.metricSlider, nVar.metricSlider) && AbstractC22676k.m65745e(this.bottom, nVar.bottom) && Double.compare(this.saveValue, nVar.saveValue) == 0 && AbstractC22676k.m65745e(this.progress, nVar.progress) && this.isSmartAlarmOverride == nVar.isSmartAlarmOverride && AbstractC22676k.m65745e(this.customizePlanDialogViewState, nVar.customizePlanDialogViewState);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final C37615g getProgress() {
            return this.progress;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final double getSaveValue() {
            return this.saveValue;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final TargetGoalType getScreen() {
            return this.screen;
        }

        public int hashCode() {
            int iM8289b = AbstractC2875y.m8289b((this.progress.hashCode() + AbstractC17176i.m48499a((this.bottom.hashCode() + ((this.metricSlider.hashCode() + ((this.header.hashCode() + AbstractC36095b.m114674b(this.screen, this.planId.hashCode() * 31, 31)) * 31)) * 31)) * 31, 31, this.saveValue)) * 31, 31, this.isSmartAlarmOverride);
            C39756c c39756c = this.customizePlanDialogViewState;
            return iM8289b + (c39756c == null ? 0 : c39756c.hashCode());
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getIsSmartAlarmOverride() {
            return this.isSmartAlarmOverride;
        }

        public String toString() {
            return "SetUpSleepHours(planId=" + this.planId + ", screen=" + this.screen + ", header=" + this.header + ", metricSlider=" + this.metricSlider + ", bottom=" + this.bottom + ", saveValue=" + this.saveValue + ", progress=" + this.progress + ", isSmartAlarmOverride=" + this.isSmartAlarmOverride + ", customizePlanDialogViewState=" + this.customizePlanDialogViewState + ")";
        }
    }

    /* JADX INFO: renamed from: ys2.e$o */
    @Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001f\u0010%R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010&\u001a\u0004\b#\u0010'R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b\u001c\u0010*R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b!\u0010.\u001a\u0004\b(\u0010/¨\u00060"}, m65681d2 = {"Lys2/e$o;", "Lys2/e;", "", "planId", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", HMSTrackSource.SCREEN, "Lys2/f;", "header", "Lbu2/d;", "metricSlider", "Lys2/b;", "bottom", "", "saveValue", "Lws2/g;", NotificationCompat.CATEGORY_PROGRESS, "<init>", "(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Lys2/f;Lbu2/d;Lys2/b;DLws2/g;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "g", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "c", "Lys2/f;", "()Lys2/f;", "Lbu2/d;", "()Lbu2/d;", "e", "Lys2/b;", "()Lys2/b;", "f", "D", "()D", "Lws2/g;", "()Lws2/g;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class o extends AbstractC39758e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String planId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TargetGoalType screen;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C39759f header;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final C3643d metricSlider;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final C39755b bottom;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final double saveValue;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final C37615g progress;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String planId, TargetGoalType screen, C39759f header, C3643d metricSlider, C39755b bottom, double d3, C37615g progress) {
            super(null);
            AbstractC22676k.m65750j(planId, "planId");
            AbstractC22676k.m65750j(screen, "screen");
            AbstractC22676k.m65750j(header, "header");
            AbstractC22676k.m65750j(metricSlider, "metricSlider");
            AbstractC22676k.m65750j(bottom, "bottom");
            AbstractC22676k.m65750j(progress, "progress");
            this.planId = planId;
            this.screen = screen;
            this.header = header;
            this.metricSlider = metricSlider;
            this.bottom = bottom;
            this.saveValue = d3;
            this.progress = progress;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C39755b getBottom() {
            return this.bottom;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C39759f getHeader() {
            return this.header;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C3643d getMetricSlider() {
            return this.metricSlider;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getPlanId() {
            return this.planId;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final C37615g getProgress() {
            return this.progress;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof o)) {
                return false;
            }
            o oVar = (o) other;
            return AbstractC22676k.m65745e(this.planId, oVar.planId) && this.screen == oVar.screen && AbstractC22676k.m65745e(this.header, oVar.header) && AbstractC22676k.m65745e(this.metricSlider, oVar.metricSlider) && AbstractC22676k.m65745e(this.bottom, oVar.bottom) && Double.compare(this.saveValue, oVar.saveValue) == 0 && AbstractC22676k.m65745e(this.progress, oVar.progress);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final double getSaveValue() {
            return this.saveValue;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final TargetGoalType getScreen() {
            return this.screen;
        }

        public int hashCode() {
            return this.progress.hashCode() + AbstractC17176i.m48499a((this.bottom.hashCode() + ((this.metricSlider.hashCode() + ((this.header.hashCode() + AbstractC36095b.m114674b(this.screen, this.planId.hashCode() * 31, 31)) * 31)) * 31)) * 31, 31, this.saveValue);
        }

        public String toString() {
            return "SetUpSteps(planId=" + this.planId + ", screen=" + this.screen + ", header=" + this.header + ", metricSlider=" + this.metricSlider + ", bottom=" + this.bottom + ", saveValue=" + this.saveValue + ", progress=" + this.progress + ")";
        }
    }

    /* JADX INFO: renamed from: ys2.e$p */
    @Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001f\u0010%R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010&\u001a\u0004\b#\u0010'R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b\u001c\u0010*R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b!\u0010.\u001a\u0004\b(\u0010/¨\u00060"}, m65681d2 = {"Lys2/e$p;", "Lys2/e;", "", "planId", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", HMSTrackSource.SCREEN, "Lys2/f;", "header", "Lbu2/d;", "metricSlider", "Lys2/b;", "bottom", "", "saveValue", "Lws2/g;", NotificationCompat.CATEGORY_PROGRESS, "<init>", "(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Lys2/f;Lbu2/d;Lys2/b;DLws2/g;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "g", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "c", "Lys2/f;", "()Lys2/f;", "Lbu2/d;", "()Lbu2/d;", "e", "Lys2/b;", "()Lys2/b;", "f", "D", "()D", "Lws2/g;", "()Lws2/g;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class p extends AbstractC39758e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String planId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TargetGoalType screen;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C39759f header;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final C3643d metricSlider;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final C39755b bottom;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final double saveValue;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final C37615g progress;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(String planId, TargetGoalType screen, C39759f header, C3643d metricSlider, C39755b bottom, double d3, C37615g progress) {
            super(null);
            AbstractC22676k.m65750j(planId, "planId");
            AbstractC22676k.m65750j(screen, "screen");
            AbstractC22676k.m65750j(header, "header");
            AbstractC22676k.m65750j(metricSlider, "metricSlider");
            AbstractC22676k.m65750j(bottom, "bottom");
            AbstractC22676k.m65750j(progress, "progress");
            this.planId = planId;
            this.screen = screen;
            this.header = header;
            this.metricSlider = metricSlider;
            this.bottom = bottom;
            this.saveValue = d3;
            this.progress = progress;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C39755b getBottom() {
            return this.bottom;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C39759f getHeader() {
            return this.header;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C3643d getMetricSlider() {
            return this.metricSlider;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getPlanId() {
            return this.planId;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final C37615g getProgress() {
            return this.progress;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof p)) {
                return false;
            }
            p pVar = (p) other;
            return AbstractC22676k.m65745e(this.planId, pVar.planId) && this.screen == pVar.screen && AbstractC22676k.m65745e(this.header, pVar.header) && AbstractC22676k.m65745e(this.metricSlider, pVar.metricSlider) && AbstractC22676k.m65745e(this.bottom, pVar.bottom) && Double.compare(this.saveValue, pVar.saveValue) == 0 && AbstractC22676k.m65745e(this.progress, pVar.progress);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final double getSaveValue() {
            return this.saveValue;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final TargetGoalType getScreen() {
            return this.screen;
        }

        public int hashCode() {
            return this.progress.hashCode() + AbstractC17176i.m48499a((this.bottom.hashCode() + ((this.metricSlider.hashCode() + ((this.header.hashCode() + AbstractC36095b.m114674b(this.screen, this.planId.hashCode() * 31, 31)) * 31)) * 31)) * 31, 31, this.saveValue);
        }

        public String toString() {
            return "SetUpStrain(planId=" + this.planId + ", screen=" + this.screen + ", header=" + this.header + ", metricSlider=" + this.metricSlider + ", bottom=" + this.bottom + ", saveValue=" + this.saveValue + ", progress=" + this.progress + ")";
        }
    }

    /* JADX INFO: renamed from: ys2.e$q */
    @Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b \u0010+\u001a\u0004\b\u001e\u0010,R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b/\u00101\u001a\u0004\b-\u00102R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b#\u00103\u001a\u0004\b!\u00104¨\u00065"}, m65681d2 = {"Lys2/e$q;", "Lys2/e;", "", "planId", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", HMSTrackSource.SCREEN, "Lys2/f;", "header", "Lbu2/d;", "metricSlider", "Lys2/b;", "bottom", "", "saveValue", "Lws2/g;", NotificationCompat.CATEGORY_PROGRESS, "Lys2/c;", "customizePlanDialogViewState", "<init>", "(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Lys2/f;Lbu2/d;Lys2/b;DLws2/g;Lys2/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "c", "Lys2/f;", "()Lys2/f;", "d", "Lbu2/d;", "()Lbu2/d;", "Lys2/b;", "()Lys2/b;", "f", "D", "g", "()D", "Lws2/g;", "()Lws2/g;", "Lys2/c;", "()Lys2/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class q extends AbstractC39758e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String planId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TargetGoalType screen;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C39759f header;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final C3643d metricSlider;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final C39755b bottom;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final double saveValue;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final C37615g progress;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final C39756c customizePlanDialogViewState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(String planId, TargetGoalType screen, C39759f header, C3643d metricSlider, C39755b bottom, double d3, C37615g progress, C39756c c39756c) {
            super(null);
            AbstractC22676k.m65750j(planId, "planId");
            AbstractC22676k.m65750j(screen, "screen");
            AbstractC22676k.m65750j(header, "header");
            AbstractC22676k.m65750j(metricSlider, "metricSlider");
            AbstractC22676k.m65750j(bottom, "bottom");
            AbstractC22676k.m65750j(progress, "progress");
            this.planId = planId;
            this.screen = screen;
            this.header = header;
            this.metricSlider = metricSlider;
            this.bottom = bottom;
            this.saveValue = d3;
            this.progress = progress;
            this.customizePlanDialogViewState = c39756c;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C39755b getBottom() {
            return this.bottom;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C39756c getCustomizePlanDialogViewState() {
            return this.customizePlanDialogViewState;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C39759f getHeader() {
            return this.header;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final C3643d getMetricSlider() {
            return this.metricSlider;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getPlanId() {
            return this.planId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof q)) {
                return false;
            }
            q qVar = (q) other;
            return AbstractC22676k.m65745e(this.planId, qVar.planId) && this.screen == qVar.screen && AbstractC22676k.m65745e(this.header, qVar.header) && AbstractC22676k.m65745e(this.metricSlider, qVar.metricSlider) && AbstractC22676k.m65745e(this.bottom, qVar.bottom) && Double.compare(this.saveValue, qVar.saveValue) == 0 && AbstractC22676k.m65745e(this.progress, qVar.progress) && AbstractC22676k.m65745e(this.customizePlanDialogViewState, qVar.customizePlanDialogViewState);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final C37615g getProgress() {
            return this.progress;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final double getSaveValue() {
            return this.saveValue;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final TargetGoalType getScreen() {
            return this.screen;
        }

        public int hashCode() {
            int iHashCode = (this.progress.hashCode() + AbstractC17176i.m48499a((this.bottom.hashCode() + ((this.metricSlider.hashCode() + ((this.header.hashCode() + AbstractC36095b.m114674b(this.screen, this.planId.hashCode() * 31, 31)) * 31)) * 31)) * 31, 31, this.saveValue)) * 31;
            C39756c c39756c = this.customizePlanDialogViewState;
            return iHashCode + (c39756c == null ? 0 : c39756c.hashCode());
        }

        public String toString() {
            return "SetUpWeight(planId=" + this.planId + ", screen=" + this.screen + ", header=" + this.header + ", metricSlider=" + this.metricSlider + ", bottom=" + this.bottom + ", saveValue=" + this.saveValue + ", progress=" + this.progress + ", customizePlanDialogViewState=" + this.customizePlanDialogViewState + ")";
        }
    }

    public /* synthetic */ AbstractC39758e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC39758e() {
    }
}
