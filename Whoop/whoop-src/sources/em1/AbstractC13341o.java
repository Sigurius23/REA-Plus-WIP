package em1;

import com.whoop.analytics.AnalyticEventModel;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: em1.o */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m65681d2 = {"Lem1/o;", "", "<init>", "()V", "a", "d", "b", "c", "Lem1/o$a;", "Lem1/o$b;", "Lem1/o$c;", "Lem1/o$d;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13341o {

    /* JADX INFO: renamed from: em1.o$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lem1/o$a;", "Lem1/o;", "", "navType", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC13341o {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String navType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String navType) {
            super(null);
            AbstractC22676k.m65750j(navType, "navType");
            this.navType = navType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getNavType() {
            return this.navType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.navType, ((a) other).navType);
        }

        public int hashCode() {
            return this.navType.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("AlertTileViewEvent(navType=", this.navType, ")");
        }
    }

    /* JADX INFO: renamed from: em1.o$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lem1/o$b;", "Lem1/o;", "Lcom/whoop/analytics/AnalyticEventModel;", "analyticEvent", "<init>", "(Lcom/whoop/analytics/AnalyticEventModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/analytics/AnalyticEventModel;", "()Lcom/whoop/analytics/AnalyticEventModel;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC13341o {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AnalyticEventModel analyticEvent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AnalyticEventModel analyticEvent) {
            super(null);
            AbstractC22676k.m65750j(analyticEvent, "analyticEvent");
            this.analyticEvent = analyticEvent;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AnalyticEventModel getAnalyticEvent() {
            return this.analyticEvent;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.analyticEvent, ((b) other).analyticEvent);
        }

        public int hashCode() {
            return this.analyticEvent.hashCode();
        }

        public String toString() {
            return "EntryPointTileCtaEvent(analyticEvent=" + this.analyticEvent + ")";
        }
    }

    /* JADX INFO: renamed from: em1.o$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lem1/o$c;", "Lem1/o;", "Lcom/whoop/analytics/AnalyticEventModel;", "analyticEvent", "<init>", "(Lcom/whoop/analytics/AnalyticEventModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/analytics/AnalyticEventModel;", "()Lcom/whoop/analytics/AnalyticEventModel;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC13341o {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AnalyticEventModel analyticEvent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AnalyticEventModel analyticEvent) {
            super(null);
            AbstractC22676k.m65750j(analyticEvent, "analyticEvent");
            this.analyticEvent = analyticEvent;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AnalyticEventModel getAnalyticEvent() {
            return this.analyticEvent;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && AbstractC22676k.m65745e(this.analyticEvent, ((c) other).analyticEvent);
        }

        public int hashCode() {
            return this.analyticEvent.hashCode();
        }

        public String toString() {
            return "EntryPointTileDismissEvent(analyticEvent=" + this.analyticEvent + ")";
        }
    }

    /* JADX INFO: renamed from: em1.o$d */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lem1/o$d;", "Lem1/o;", "Lcom/whoop/analytics/AnalyticEventModel;", "analyticEvent", "<init>", "(Lcom/whoop/analytics/AnalyticEventModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/analytics/AnalyticEventModel;", "()Lcom/whoop/analytics/AnalyticEventModel;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC13341o {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AnalyticEventModel analyticEvent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AnalyticEventModel analyticEvent) {
            super(null);
            AbstractC22676k.m65750j(analyticEvent, "analyticEvent");
            this.analyticEvent = analyticEvent;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AnalyticEventModel getAnalyticEvent() {
            return this.analyticEvent;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && AbstractC22676k.m65745e(this.analyticEvent, ((d) other).analyticEvent);
        }

        public int hashCode() {
            return this.analyticEvent.hashCode();
        }

        public String toString() {
            return "EntryPointTileViewEvent(analyticEvent=" + this.analyticEvent + ")";
        }
    }

    public /* synthetic */ AbstractC13341o(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC13341o() {
    }
}
