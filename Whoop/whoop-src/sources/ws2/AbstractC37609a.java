package ws2;

import com.whoop.weeklyplan.customizeplan.domain.api.ConfirmTarget;
import com.whoop.weeklyplan.customizeplan.domain.api.TargetGoalType;
import java.util.List;
import p319m4.AbstractC25012a;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: ws2.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Lws2/a;", "", "<init>", "()V", "b", "c", "a", "Lws2/a$a;", "Lws2/a$b;", "Lws2/a$c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37609a {

    /* JADX INFO: renamed from: ws2.a$a */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0015\u0010\n¨\u0006\u0019"}, m65681d2 = {"Lws2/a$a;", "Lws2/a;", "", "id", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "targetGoalType", "source", "<init>", "(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "c", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC37609a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TargetGoalType targetGoalType;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String id4, TargetGoalType targetGoalType, String source) {
            super(null);
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(targetGoalType, "targetGoalType");
            AbstractC22676k.m65750j(source, "source");
            this.id = id4;
            this.targetGoalType = targetGoalType;
            this.source = source;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSource() {
            return this.source;
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
            return AbstractC22676k.m65745e(this.id, aVar.id) && this.targetGoalType == aVar.targetGoalType && AbstractC22676k.m65745e(this.source, aVar.source);
        }

        public int hashCode() {
            return this.source.hashCode() + AbstractC36095b.m114674b(this.targetGoalType, this.id.hashCode() * 31, 31);
        }

        public String toString() {
            String str = this.id;
            TargetGoalType targetGoalType = this.targetGoalType;
            String str2 = this.source;
            StringBuilder sb4 = new StringBuilder("DeleteTargetGoal(id=");
            sb4.append(str);
            sb4.append(", targetGoalType=");
            sb4.append(targetGoalType);
            sb4.append(", source=");
            return AbstractC25012a.m73376i(str2, ")", sb4);
        }
    }

    /* JADX INFO: renamed from: ws2.a$b */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lws2/a$b;", "Lws2/a;", "", "", "screens", "<init>", "(Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC37609a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<String> screens;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<String> screens) {
            super(null);
            AbstractC22676k.m65750j(screens, "screens");
            this.screens = screens;
        }

        /* JADX INFO: renamed from: a */
        public final List<String> m120733a() {
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
            return AbstractC33745d.m106654m("LoadData(screens=", ")", this.screens);
        }
    }

    /* JADX INFO: renamed from: ws2.a$c */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0018\u0010\n¨\u0006\u0019"}, m65681d2 = {"Lws2/a$c;", "Lws2/a;", "", "id", "Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget;", "confirmTarget", "source", "<init>", "(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget;", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget;", "c", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC37609a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final ConfirmTarget confirmTarget;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String id4, ConfirmTarget confirmTarget, String source) {
            super(null);
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(confirmTarget, "confirmTarget");
            AbstractC22676k.m65750j(source, "source");
            this.id = id4;
            this.confirmTarget = confirmTarget;
            this.source = source;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ConfirmTarget getConfirmTarget() {
            return this.confirmTarget;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
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
            return AbstractC22676k.m65745e(this.id, cVar.id) && AbstractC22676k.m65745e(this.confirmTarget, cVar.confirmTarget) && AbstractC22676k.m65745e(this.source, cVar.source);
        }

        public int hashCode() {
            return this.source.hashCode() + ((this.confirmTarget.hashCode() + (this.id.hashCode() * 31)) * 31);
        }

        public String toString() {
            String str = this.id;
            ConfirmTarget confirmTarget = this.confirmTarget;
            String str2 = this.source;
            StringBuilder sb4 = new StringBuilder("UpdateTargetGoal(id=");
            sb4.append(str);
            sb4.append(", confirmTarget=");
            sb4.append(confirmTarget);
            sb4.append(", source=");
            return AbstractC25012a.m73376i(str2, ")", sb4);
        }
    }

    public /* synthetic */ AbstractC37609a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC37609a() {
    }
}
