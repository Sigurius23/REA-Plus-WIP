package rg2;

import n71.C26436q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import w41.C36823w;

/* JADX INFO: renamed from: rg2.n */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Lrg2/n;", "", "<init>", "()V", "b", "a", "c", "Lrg2/n$a;", "Lrg2/n$b;", "Lrg2/n$c;", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31402n {

    /* JADX INFO: renamed from: rg2.n$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lrg2/n$a;", "Lrg2/n;", "<init>", "()V", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC31402n {

        /* JADX INFO: renamed from: a */
        public static final a f129244a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: rg2.n$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lrg2/n$b;", "Lrg2/n;", "Ln71/q;", "state", "<init>", "(Ln71/q;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln71/q;", "()Ln71/q;", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC31402n {

        /* JADX INFO: renamed from: b */
        public static final int f129245b = C26436q.f105013d;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C26436q state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C26436q state) {
            super(null);
            AbstractC22676k.m65750j(state, "state");
            this.state = state;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C26436q getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.state, ((b) other).state);
        }

        public int hashCode() {
            return this.state.hashCode();
        }

        public String toString() {
            return "HrMonitorState(state=" + this.state + ")";
        }
    }

    /* JADX INFO: renamed from: rg2.n$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lrg2/n$c;", "Lrg2/n;", "Lw41/w;", "userLocation", "<init>", "(Lw41/w;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lw41/w;", "()Lw41/w;", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC31402n {

        /* JADX INFO: renamed from: b */
        public static final int f129247b = C36823w.f157507c;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C36823w userLocation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C36823w userLocation) {
            super(null);
            AbstractC22676k.m65750j(userLocation, "userLocation");
            this.userLocation = userLocation;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C36823w getUserLocation() {
            return this.userLocation;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && AbstractC22676k.m65745e(this.userLocation, ((c) other).userLocation);
        }

        public int hashCode() {
            return this.userLocation.hashCode();
        }

        public String toString() {
            return "MapState(userLocation=" + this.userLocation + ")";
        }
    }

    public /* synthetic */ AbstractC31402n(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC31402n() {
    }
}
