package cm2;

import or2.EnumC28166h0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: cm2.m */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Lcm2/m;", "", "<init>", "()V", "b", "a", "c", "Lcm2/m$a;", "Lcm2/m$b;", "Lcm2/m$c;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4825m {

    /* JADX INFO: renamed from: cm2.m$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcm2/m$a;", "Lcm2/m;", "Lor2/h0;", "graphKey", "<init>", "(Lor2/h0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lor2/h0;", "()Lor2/h0;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC4825m {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC28166h0 graphKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(EnumC28166h0 graphKey) {
            super(null);
            AbstractC22676k.m65750j(graphKey, "graphKey");
            this.graphKey = graphKey;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC28166h0 getGraphKey() {
            return this.graphKey;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && this.graphKey == ((a) other).graphKey;
        }

        public int hashCode() {
            return this.graphKey.hashCode();
        }

        public String toString() {
            return "Error(graphKey=" + this.graphKey + ")";
        }
    }

    /* JADX INFO: renamed from: cm2.m$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcm2/m$b;", "Lcm2/m;", "<init>", "()V", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC4825m {

        /* JADX INFO: renamed from: a */
        public static final b f19861a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: cm2.m$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcm2/m$c;", "Lcm2/m;", "Lcm2/l;", "viewState", "<init>", "(Lcm2/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcm2/l;", "()Lcm2/l;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC4825m {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C4824l viewState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C4824l viewState) {
            super(null);
            AbstractC22676k.m65750j(viewState, "viewState");
            this.viewState = viewState;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C4824l getViewState() {
            return this.viewState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && AbstractC22676k.m65745e(this.viewState, ((c) other).viewState);
        }

        public int hashCode() {
            return this.viewState.hashCode();
        }

        public String toString() {
            return "Success(viewState=" + this.viewState + ")";
        }
    }

    public /* synthetic */ AbstractC4825m(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC4825m() {
    }
}
