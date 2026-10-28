package xz0;

import com.whoop.whoopaction.domain.models.Action;
import gz0.EnumC16313m0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: xz0.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u0015\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0019\u0010!¨\u0006\""}, m65681d2 = {"Lxz0/b;", "Lm91/u;", "Lgz0/m0;", "icon", "", "modal", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "", "dismissesCard", "<init>", "(Lgz0/m0;Ljava/lang/Object;Lcom/whoop/whoopaction/domain/models/Action;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lgz0/m0;", "c", "()Lgz0/m0;", "b", "Ljava/lang/Object;", "e", "()Ljava/lang/Object;", "Lcom/whoop/whoopaction/domain/models/Action;", "()Lcom/whoop/whoopaction/domain/models/Action;", "d", "Z", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C38751b implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Object modal;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Action action;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean dismissesCard;

    public C38751b(EnumC16313m0 icon, Object obj, Action action, boolean z4) {
        AbstractC22676k.m65750j(icon, "icon");
        this.icon = icon;
        this.modal = obj;
        this.action = action;
        this.dismissesCard = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getDismissesCard() {
        return this.dismissesCard;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Object getModal() {
        return this.modal;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C38751b)) {
            return false;
        }
        C38751b c38751b = (C38751b) other;
        return this.icon == c38751b.icon && AbstractC22676k.m65745e(this.modal, c38751b.modal) && AbstractC22676k.m65745e(this.action, c38751b.action) && this.dismissesCard == c38751b.dismissesCard;
    }

    public int hashCode() {
        int iHashCode = this.icon.hashCode() * 31;
        Object obj = this.modal;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Action action = this.action;
        return Boolean.hashCode(this.dismissesCard) + ((iHashCode2 + (action != null ? action.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "AppointmentCardIconButtonViewState(icon=" + this.icon + ", modal=" + this.modal + ", action=" + this.action + ", dismissesCard=" + this.dismissesCard + ")";
    }

    public /* synthetic */ C38751b(EnumC16313m0 enumC16313m0, Object obj, Action action, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC16313m0, (i13 & 2) != 0 ? null : obj, (i13 & 4) != 0 ? null : action, (i13 & 8) != 0 ? false : z4);
    }
}
