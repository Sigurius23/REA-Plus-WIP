package ew0;

import com.whoop.navigation.C9598e;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import nh3.AbstractC26725a;
import org.joda.time.LocalDateTime;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: ew0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m65681d2 = {"Lew0/a;", "", "<init>", "()V", "a", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "f", "g", "e", "c", "d", "b", "Lew0/a$a;", "Lew0/a$b;", "Lew0/a$c;", "Lew0/a$d;", "Lew0/a$e;", "Lew0/a$f;", "Lew0/a$g;", "Lew0/a$h;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13720a {

    /* JADX INFO: renamed from: ew0.a$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lew0/a$a;", "Lew0/a;", "<init>", "()V", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC13720a {

        /* JADX INFO: renamed from: a */
        public static final a f48702a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ew0.a$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lew0/a$b;", "Lew0/a;", "Lcom/whoop/navigation/e;", "action", "<init>", "(Lcom/whoop/navigation/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC13720a {

        /* JADX INFO: renamed from: b */
        public static final int f48703b = C9598e.f28134d;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C9598e action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C9598e action) {
            super(null);
            AbstractC22676k.m65750j(action, "action");
            this.action = action;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C9598e getAction() {
            return this.action;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.action, ((b) other).action);
        }

        public int hashCode() {
            return this.action.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106650i("BackendDrivenNavigation(action=", this.action, ")");
        }
    }

    /* JADX INFO: renamed from: ew0.a$c */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lew0/a$c;", "Lew0/a;", "", "message", "activityName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC13720a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String message;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String activityName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String message, String activityName) {
            super(null);
            AbstractC22676k.m65750j(message, "message");
            AbstractC22676k.m65750j(activityName, "activityName");
            this.message = message;
            this.activityName = activityName;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getActivityName() {
            return this.activityName;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.message, cVar.message) && AbstractC22676k.m65745e(this.activityName, cVar.activityName);
        }

        public int hashCode() {
            return this.activityName.hashCode() + (this.message.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("NavigateToCoach(message=", this.message, ", activityName=", this.activityName, ")");
        }
    }

    /* JADX INFO: renamed from: ew0.a$d */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u001b\u0010\f¨\u0006\u001d"}, m65681d2 = {"Lew0/a$d;", "Lew0/a;", "Lorg/joda/time/LocalDateTime;", "startDate", "endDate", "", "activityInternalName", "activityId", "activityType", "<init>", "(Lorg/joda/time/LocalDateTime;Lorg/joda/time/LocalDateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lorg/joda/time/LocalDateTime;", "e", "()Lorg/joda/time/LocalDateTime;", "b", "d", "c", "Ljava/lang/String;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC13720a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final LocalDateTime startDate;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final LocalDateTime endDate;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String activityInternalName;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String activityId;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String activityType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(LocalDateTime startDate, LocalDateTime endDate, String activityInternalName, String activityId, String activityType) {
            super(null);
            AbstractC22676k.m65750j(startDate, "startDate");
            AbstractC22676k.m65750j(endDate, "endDate");
            AbstractC22676k.m65750j(activityInternalName, "activityInternalName");
            AbstractC22676k.m65750j(activityId, "activityId");
            AbstractC22676k.m65750j(activityType, "activityType");
            this.startDate = startDate;
            this.endDate = endDate;
            this.activityInternalName = activityInternalName;
            this.activityId = activityId;
            this.activityType = activityType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getActivityId() {
            return this.activityId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getActivityInternalName() {
            return this.activityInternalName;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getActivityType() {
            return this.activityType;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final LocalDateTime getEndDate() {
            return this.endDate;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final LocalDateTime getStartDate() {
            return this.startDate;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.startDate, dVar.startDate) && AbstractC22676k.m65745e(this.endDate, dVar.endDate) && AbstractC22676k.m65745e(this.activityInternalName, dVar.activityInternalName) && AbstractC22676k.m65745e(this.activityId, dVar.activityId) && AbstractC22676k.m65745e(this.activityType, dVar.activityType);
        }

        public int hashCode() {
            return this.activityType.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d((this.endDate.hashCode() + (this.startDate.hashCode() * 31)) * 31, 31, this.activityInternalName), 31, this.activityId);
        }

        public String toString() {
            LocalDateTime localDateTime = this.startDate;
            LocalDateTime localDateTime2 = this.endDate;
            String str = this.activityInternalName;
            String str2 = this.activityId;
            String str3 = this.activityType;
            StringBuilder sb4 = new StringBuilder("NavigateToEditActivity(startDate=");
            sb4.append(localDateTime);
            sb4.append(", endDate=");
            sb4.append(localDateTime2);
            sb4.append(", activityInternalName=");
            AbstractC11266d.m30444B(sb4, str, ", activityId=", str2, ", activityType=");
            return AbstractC25012a.m73376i(str3, ")", sb4);
        }
    }

    /* JADX INFO: renamed from: ew0.a$f */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lew0/a$f;", "Lew0/a;", "<init>", "()V", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC13720a {

        /* JADX INFO: renamed from: a */
        public static final f f48714a = new f();

        private f() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ew0.a$g */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lew0/a$g;", "Lew0/a;", "", "activityId", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g extends AbstractC13720a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String activityId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String activityId, String source) {
            super(null);
            AbstractC22676k.m65750j(activityId, "activityId");
            AbstractC22676k.m65750j(source, "source");
            this.activityId = activityId;
            this.source = source;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getActivityId() {
            return this.activityId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof g)) {
                return false;
            }
            g gVar = (g) other;
            return AbstractC22676k.m65745e(this.activityId, gVar.activityId) && AbstractC22676k.m65745e(this.source, gVar.source);
        }

        public int hashCode() {
            return this.source.hashCode() + (this.activityId.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("NavigateToLinkWorkoutScreen(activityId=", this.activityId, ", source=", this.source, ")");
        }
    }

    /* JADX INFO: renamed from: ew0.a$h */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lew0/a$h;", "Lew0/a;", "", "segmentedControlId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h extends AbstractC13720a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String segmentedControlId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String segmentedControlId) {
            super(null);
            AbstractC22676k.m65750j(segmentedControlId, "segmentedControlId");
            this.segmentedControlId = segmentedControlId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getSegmentedControlId() {
            return this.segmentedControlId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof h) && AbstractC22676k.m65745e(this.segmentedControlId, ((h) other).segmentedControlId);
        }

        public int hashCode() {
            return this.segmentedControlId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("SegmentedControlSelected(segmentedControlId=", this.segmentedControlId, ")");
        }
    }

    public /* synthetic */ AbstractC13720a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC13720a() {
    }

    /* JADX INFO: renamed from: ew0.a$e */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lew0/a$e;", "Lew0/a;", "", "exerciseId", "", "isExerciseDetailsV2ExperimentEnabled", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC13720a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String exerciseId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean isExerciseDetailsV2ExperimentEnabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String exerciseId, boolean z4) {
            super(null);
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
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.exerciseId, eVar.exerciseId) && this.isExerciseDetailsV2ExperimentEnabled == eVar.isExerciseDetailsV2ExperimentEnabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isExerciseDetailsV2ExperimentEnabled) + (this.exerciseId.hashCode() * 31);
        }

        public String toString() {
            return AbstractC26725a.m79503g("NavigateToExerciseDetails(exerciseId=", this.exerciseId, ", isExerciseDetailsV2ExperimentEnabled=", ")", this.isExerciseDetailsV2ExperimentEnabled);
        }

        public /* synthetic */ e(String str, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i13 & 2) != 0 ? false : z4);
        }
    }
}
