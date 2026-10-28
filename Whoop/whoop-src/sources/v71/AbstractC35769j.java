package v71;

import androidx.core.app.NotificationCompat;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: v71.j */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m65681d2 = {"Lv71/j;", "", "<init>", "()V", "a", "Lv71/j$a;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35769j {

    /* JADX INFO: renamed from: v71.j$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lv71/j$a;", "Lv71/j;", "", "index", "", NotificationCompat.CATEGORY_EVENT, "<init>", "(ILjava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/Object;", "()Ljava/lang/Object;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC35769j {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int index;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Object event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i13, Object event) {
            super(null);
            AbstractC22676k.m65750j(event, "event");
            this.index = i13;
            this.event = event;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getEvent() {
            return this.event;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.index == aVar.index && AbstractC22676k.m65745e(this.event, aVar.event);
        }

        public int hashCode() {
            return this.event.hashCode() + (Integer.hashCode(this.index) * 31);
        }

        public String toString() {
            return "ChildEvent(index=" + this.index + ", event=" + this.event + ")";
        }
    }

    public /* synthetic */ AbstractC35769j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC35769j() {
    }
}
