package lf0;

import androidx.core.app.NotificationCompat;
import ih0.AbstractC18489d0;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: lf0.r */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m65681d2 = {"Llf0/r;", "", "<init>", "()V", "a", "c", "b", "d", "Llf0/r$a;", "Llf0/r$b;", "Llf0/r$c;", "Llf0/r$d;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23962r {

    /* JADX INFO: renamed from: lf0.r$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Llf0/r$a;", "Llf0/r;", "", "dateToken", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC23962r {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String dateToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String dateToken) {
            super(null);
            AbstractC22676k.m65750j(dateToken, "dateToken");
            this.dateToken = dateToken;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDateToken() {
            return this.dateToken;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.dateToken, ((a) other).dateToken);
        }

        public int hashCode() {
            return this.dateToken.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("DateSelectorClicked(dateToken=", this.dateToken, ")");
        }
    }

    /* JADX INFO: renamed from: lf0.r$b */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Llf0/r$b;", "Llf0/r;", "", NotificationCompat.CATEGORY_EVENT, "<init>", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC23962r {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Object event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object event) {
            super(null);
            AbstractC22676k.m65750j(event, "event");
            this.event = event;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getEvent() {
            return this.event;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.event, ((b) other).event);
        }

        public int hashCode() {
            return this.event.hashCode();
        }

        public String toString() {
            return AbstractC18489d0.m53369j(this.event, "DesignSystemEvent(event=", ")");
        }
    }

    /* JADX INFO: renamed from: lf0.r$c */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Llf0/r$c;", "Llf0/r;", "", NotificationCompat.CATEGORY_EVENT, "<init>", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "getEvent", "()Ljava/lang/Object;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC23962r {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Object event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Object event) {
            super(null);
            AbstractC22676k.m65750j(event, "event");
            this.event = event;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && AbstractC22676k.m65745e(this.event, ((c) other).event);
        }

        public int hashCode() {
            return this.event.hashCode();
        }

        public String toString() {
            return AbstractC18489d0.m53369j(this.event, "GraphViewEvent(event=", ")");
        }
    }

    /* JADX INFO: renamed from: lf0.r$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Llf0/r$d;", "Llf0/r;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC23962r {

        /* JADX INFO: renamed from: a */
        public static final d f94641a = new d();

        private d() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC23962r(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC23962r() {
    }
}
