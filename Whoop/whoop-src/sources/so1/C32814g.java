package so1;

import com.whoop.data.repositories.SmartAlarmTriggerRepository;
import f11.C14005e;
import gz0.EnumC16313m0;
import hc3.AbstractC17176i;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: so1.g */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u0015\u0010 ¨\u0006!"}, m65681d2 = {"Lso1/g;", "", "Lf11/e;", SmartAlarmTriggerRepository.DEFAULT_REFRESH_SCOPE, "Lgz0/m0;", "icon", "", "isHidden", "Lso1/i;", "bottomSheet", "<init>", "(Lf11/e;Lgz0/m0;ZLso1/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lf11/e;", "b", "()Lf11/e;", "Lgz0/m0;", "c", "()Lgz0/m0;", "Z", "d", "()Z", "Lso1/i;", "()Lso1/i;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32814g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C14005e cycle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isHidden;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C32818i bottomSheet;

    public C32814g(C14005e cycle, EnumC16313m0 icon, boolean z4, C32818i bottomSheet) {
        AbstractC22676k.m65750j(cycle, "cycle");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(bottomSheet, "bottomSheet");
        this.cycle = cycle;
        this.icon = icon;
        this.isHidden = z4;
        this.bottomSheet = bottomSheet;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C32818i getBottomSheet() {
        return this.bottomSheet;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C14005e getCycle() {
        return this.cycle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsHidden() {
        return this.isHidden;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32814g)) {
            return false;
        }
        C32814g c32814g = (C32814g) other;
        return AbstractC22676k.m65745e(this.cycle, c32814g.cycle) && this.icon == c32814g.icon && this.isHidden == c32814g.isHidden && AbstractC22676k.m65745e(this.bottomSheet, c32814g.bottomSheet);
    }

    public int hashCode() {
        return this.bottomSheet.hashCode() + AbstractC2875y.m8289b(AbstractC17176i.m48500b(this.icon, this.cycle.hashCode() * 31, 31), 31, this.isHidden);
    }

    public String toString() {
        return "CycleState(cycle=" + this.cycle + ", icon=" + this.icon + ", isHidden=" + this.isHidden + ", bottomSheet=" + this.bottomSheet + ")";
    }
}
