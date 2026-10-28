package i11;

import com.whoop.navigation.models.GenericInteraction;
import gz0.EnumC16313m0;
import h11.C16613h;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: i11.g */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001d\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0016\u0010\u001f¨\u0006 "}, m65681d2 = {"Li11/g;", "", "", "Lh11/h;", "pills", "Lgz0/m0;", "leftCalendarIcon", "rightCalendarIcon", "Lcom/whoop/navigation/models/GenericInteraction;", "calendarIconInteraction", "<init>", "(Ljava/util/List;Lgz0/m0;Lgz0/m0;Lcom/whoop/navigation/models/GenericInteraction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Lgz0/m0;", "()Lgz0/m0;", "d", "Lcom/whoop/navigation/models/GenericInteraction;", "()Lcom/whoop/navigation/models/GenericInteraction;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17864g {

    /* JADX INFO: renamed from: e */
    public static final int f69527e = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C16613h> pills;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC16313m0 leftCalendarIcon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC16313m0 rightCalendarIcon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final GenericInteraction calendarIconInteraction;

    public C17864g(List<C16613h> pills, EnumC16313m0 enumC16313m0, EnumC16313m0 enumC16313m1, GenericInteraction genericInteraction) {
        AbstractC22676k.m65750j(pills, "pills");
        this.pills = pills;
        this.leftCalendarIcon = enumC16313m0;
        this.rightCalendarIcon = enumC16313m1;
        this.calendarIconInteraction = genericInteraction;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final GenericInteraction getCalendarIconInteraction() {
        return this.calendarIconInteraction;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC16313m0 getLeftCalendarIcon() {
        return this.leftCalendarIcon;
    }

    /* JADX INFO: renamed from: c */
    public final List<C16613h> m51376c() {
        return this.pills;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final EnumC16313m0 getRightCalendarIcon() {
        return this.rightCalendarIcon;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17864g)) {
            return false;
        }
        C17864g c17864g = (C17864g) other;
        return AbstractC22676k.m65745e(this.pills, c17864g.pills) && this.leftCalendarIcon == c17864g.leftCalendarIcon && this.rightCalendarIcon == c17864g.rightCalendarIcon && AbstractC22676k.m65745e(this.calendarIconInteraction, c17864g.calendarIconInteraction);
    }

    public int hashCode() {
        int iHashCode = this.pills.hashCode() * 31;
        EnumC16313m0 enumC16313m0 = this.leftCalendarIcon;
        int iHashCode2 = (iHashCode + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31;
        EnumC16313m0 enumC16313m1 = this.rightCalendarIcon;
        int iHashCode3 = (iHashCode2 + (enumC16313m1 == null ? 0 : enumC16313m1.hashCode())) * 31;
        GenericInteraction genericInteraction = this.calendarIconInteraction;
        return iHashCode3 + (genericInteraction != null ? genericInteraction.hashCode() : 0);
    }

    public String toString() {
        return "DateStripState(pills=" + this.pills + ", leftCalendarIcon=" + this.leftCalendarIcon + ", rightCalendarIcon=" + this.rightCalendarIcon + ", calendarIconInteraction=" + this.calendarIconInteraction + ")";
    }

    public /* synthetic */ C17864g(List list, EnumC16313m0 enumC16313m0, EnumC16313m0 enumC16313m1, GenericInteraction genericInteraction, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i13 & 2) != 0 ? null : enumC16313m0, (i13 & 4) != 0 ? null : enumC16313m1, (i13 & 8) != 0 ? null : genericInteraction);
    }
}
