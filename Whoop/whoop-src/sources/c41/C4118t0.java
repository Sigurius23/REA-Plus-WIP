package c41;

import androidx.core.app.NotificationCompat;
import kd1.EnumC22400l;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: c41.t0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0016\u0010\"¨\u0006#"}, m65681d2 = {"Lc41/t0;", "Lm91/u;", "", NotificationCompat.CATEGORY_EVENT, "Lkd1/l;", "ctaType", "Lc41/u0;", "type", "Ly81/f;", "background", "<init>", "(Ljava/lang/Object;Lkd1/l;Lc41/u0;Ly81/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "getEvent", "()Ljava/lang/Object;", "b", "Lkd1/l;", "()Lkd1/l;", "c", "Lc41/u0;", "()Lc41/u0;", "d", "Ly81/f;", "()Ly81/f;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4118t0 implements InterfaceC25312u {

    /* JADX INFO: renamed from: e */
    public static final int f16712e = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Object event;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC22400l ctaType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC4125u0 type;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC39333f background;

    public C4118t0(Object event, EnumC22400l enumC22400l, AbstractC4125u0 type, EnumC39333f background) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(background, "background");
        this.event = event;
        this.ctaType = enumC22400l;
        this.type = type;
        this.background = background;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC39333f getBackground() {
        return this.background;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC22400l getCtaType() {
        return this.ctaType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AbstractC4125u0 getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4118t0)) {
            return false;
        }
        C4118t0 c4118t0 = (C4118t0) other;
        return AbstractC22676k.m65745e(this.event, c4118t0.event) && this.ctaType == c4118t0.ctaType && AbstractC22676k.m65745e(this.type, c4118t0.type) && this.background == c4118t0.background;
    }

    @Override // p720m91.InterfaceC25312u
    public Object getEvent() {
        return this.event;
    }

    public int hashCode() {
        int iHashCode = this.event.hashCode() * 31;
        EnumC22400l enumC22400l = this.ctaType;
        return this.background.hashCode() + ((this.type.hashCode() + ((iHashCode + (enumC22400l == null ? 0 : enumC22400l.hashCode())) * 31)) * 31);
    }

    public String toString() {
        return "CoachingCtaTileState(event=" + this.event + ", ctaType=" + this.ctaType + ", type=" + this.type + ", background=" + this.background + ")";
    }

    public /* synthetic */ C4118t0(Object obj, EnumC22400l enumC22400l, AbstractC4125u0 abstractC4125u0, EnumC39333f enumC39333f, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C23454a0.f92919a : obj, (i13 & 2) != 0 ? null : enumC22400l, abstractC4125u0, (i13 & 8) != 0 ? EnumC39333f.WHITE_10 : enumC39333f);
    }
}
