package hw0;

import androidx.core.app.NotificationCompat;
import gz0.EnumC16313m0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: hw0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lhw0/e;", "", NotificationCompat.CATEGORY_EVENT, "Lgz0/m0;", "icon", "<init>", "(Ljava/lang/Object;Lgz0/m0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "b", "Lgz0/m0;", "()Lgz0/m0;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17700e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Object event;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    public C17700e(Object event, EnumC16313m0 enumC16313m0) {
        AbstractC22676k.m65750j(event, "event");
        this.event = event;
        this.icon = enumC16313m0;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Object getEvent() {
        return this.event;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17700e)) {
            return false;
        }
        C17700e c17700e = (C17700e) other;
        return AbstractC22676k.m65745e(this.event, c17700e.event) && this.icon == c17700e.icon;
    }

    public int hashCode() {
        int iHashCode = this.event.hashCode() * 31;
        EnumC16313m0 enumC16313m0 = this.icon;
        return iHashCode + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode());
    }

    public String toString() {
        return "HeaderDropdownOptionState(event=" + this.event + ", icon=" + this.icon + ")";
    }

    public /* synthetic */ C17700e(Object obj, EnumC16313m0 enumC16313m0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i13 & 2) != 0 ? null : enumC16313m0);
    }
}
