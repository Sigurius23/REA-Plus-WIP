package gz0;

import androidx.core.app.NotificationCompat;
import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: gz0.o0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b3\b\u0087\b\u0018\u00002\u00020\u0001B§\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u0012\b\b\u0002\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b.\u00100R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b1\u00103R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b4\u00106R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b7\u00109R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b:\u0010<R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b?\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bC\u0010H\u001a\u0004\bI\u0010JR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bF\u0010O\u001a\u0004\bP\u0010QR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bM\u0010R\u001a\u0004\bS\u0010TR\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\bI\u0010U\u001a\u0004\bV\u0010WR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\bP\u0010X\u001a\u0004\b=\u0010YR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\bV\u0010Z\u001a\u0004\bA\u0010[R\u0017\u0010!\u001a\u00020 8\u0006¢\u0006\f\n\u0004\bS\u0010\\\u001a\u0004\bK\u0010]¨\u0006^"}, m65681d2 = {"Lgz0/o0;", "", "Lgz0/a;", "action", "Lgz0/c;", "activities", "Lgz0/k;", "connections", "Lgz0/m;", "general", "Lgz0/o;", "growth", "Lgz0/u;", "logo", "Lgz0/w;", NotificationCompat.CATEGORY_NAVIGATION, "Lgz0/a0;", "recovery", "Lgz0/e0;", "strain", "Lgz0/c0;", UserState.States.SLEEP, "Lgz0/g0;", "strap", "Lgz0/k0;", "various", "Lgz0/i0;", "tinyIcons", "Lgz0/q;", "health", "Lgz0/s;", "hormonalHealth", "Lgz0/y;", "plan", "<init>", "(Lgz0/a;Lgz0/c;Lgz0/k;Lgz0/m;Lgz0/o;Lgz0/u;Lgz0/w;Lgz0/a0;Lgz0/e0;Lgz0/c0;Lgz0/g0;Lgz0/k0;Lgz0/i0;Lgz0/q;Lgz0/s;Lgz0/y;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgz0/a;", "()Lgz0/a;", "b", "Lgz0/c;", "()Lgz0/c;", "c", "Lgz0/k;", "()Lgz0/k;", "d", "Lgz0/m;", "()Lgz0/m;", "e", "Lgz0/o;", "()Lgz0/o;", "f", "Lgz0/u;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lgz0/u;", "g", "Lgz0/w;", "i", "()Lgz0/w;", "Lgz0/a0;", "k", "()Lgz0/a0;", "Lgz0/e0;", "m", "()Lgz0/e0;", "j", "Lgz0/c0;", "l", "()Lgz0/c0;", "Lgz0/g0;", "n", "()Lgz0/g0;", "Lgz0/k0;", "p", "()Lgz0/k0;", "Lgz0/i0;", "o", "()Lgz0/i0;", "Lgz0/q;", "()Lgz0/q;", "Lgz0/s;", "()Lgz0/s;", "Lgz0/y;", "()Lgz0/y;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C16317o0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C16288a action;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C16292c activities;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C16308k connections;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C16312m general;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C16316o growth;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C16324u logo;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C16326w navigation;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C16289a0 recovery;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C16297e0 strain;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C16293c0 sleep;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C16301g0 strap;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final C16309k0 various;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final C16305i0 tinyIcons;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final C16320q health;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final C16322s hormonalHealth;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final C16328y plan;

    public C16317o0(C16288a action, C16292c activities, C16308k connections, C16312m general, C16316o growth, C16324u logo, C16326w navigation, C16289a0 recovery, C16297e0 strain, C16293c0 sleep, C16301g0 strap, C16309k0 various, C16305i0 tinyIcons, C16320q health, C16322s hormonalHealth, C16328y plan) {
        AbstractC22676k.m65750j(action, "action");
        AbstractC22676k.m65750j(activities, "activities");
        AbstractC22676k.m65750j(connections, "connections");
        AbstractC22676k.m65750j(general, "general");
        AbstractC22676k.m65750j(growth, "growth");
        AbstractC22676k.m65750j(logo, "logo");
        AbstractC22676k.m65750j(navigation, "navigation");
        AbstractC22676k.m65750j(recovery, "recovery");
        AbstractC22676k.m65750j(strain, "strain");
        AbstractC22676k.m65750j(sleep, "sleep");
        AbstractC22676k.m65750j(strap, "strap");
        AbstractC22676k.m65750j(various, "various");
        AbstractC22676k.m65750j(tinyIcons, "tinyIcons");
        AbstractC22676k.m65750j(health, "health");
        AbstractC22676k.m65750j(hormonalHealth, "hormonalHealth");
        AbstractC22676k.m65750j(plan, "plan");
        this.action = action;
        this.activities = activities;
        this.connections = connections;
        this.general = general;
        this.growth = growth;
        this.logo = logo;
        this.navigation = navigation;
        this.recovery = recovery;
        this.strain = strain;
        this.sleep = sleep;
        this.strap = strap;
        this.various = various;
        this.tinyIcons = tinyIcons;
        this.health = health;
        this.hormonalHealth = hormonalHealth;
        this.plan = plan;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C16288a getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C16292c getActivities() {
        return this.activities;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C16308k getConnections() {
        return this.connections;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C16312m getGeneral() {
        return this.general;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C16316o getGrowth() {
        return this.growth;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C16317o0)) {
            return false;
        }
        C16317o0 c16317o0 = (C16317o0) other;
        return AbstractC22676k.m65745e(this.action, c16317o0.action) && AbstractC22676k.m65745e(this.activities, c16317o0.activities) && AbstractC22676k.m65745e(this.connections, c16317o0.connections) && AbstractC22676k.m65745e(this.general, c16317o0.general) && AbstractC22676k.m65745e(this.growth, c16317o0.growth) && AbstractC22676k.m65745e(this.logo, c16317o0.logo) && AbstractC22676k.m65745e(this.navigation, c16317o0.navigation) && AbstractC22676k.m65745e(this.recovery, c16317o0.recovery) && AbstractC22676k.m65745e(this.strain, c16317o0.strain) && AbstractC22676k.m65745e(this.sleep, c16317o0.sleep) && AbstractC22676k.m65745e(this.strap, c16317o0.strap) && AbstractC22676k.m65745e(this.various, c16317o0.various) && AbstractC22676k.m65745e(this.tinyIcons, c16317o0.tinyIcons) && AbstractC22676k.m65745e(this.health, c16317o0.health) && AbstractC22676k.m65745e(this.hormonalHealth, c16317o0.hormonalHealth) && AbstractC22676k.m65745e(this.plan, c16317o0.plan);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C16320q getHealth() {
        return this.health;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C16322s getHormonalHealth() {
        return this.hormonalHealth;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C16324u getLogo() {
        return this.logo;
    }

    public int hashCode() {
        return this.plan.hashCode() + ((this.hormonalHealth.hashCode() + ((this.health.hashCode() + ((this.tinyIcons.hashCode() + ((this.various.hashCode() + ((this.strap.hashCode() + ((this.sleep.hashCode() + ((this.strain.hashCode() + ((this.recovery.hashCode() + ((this.navigation.hashCode() + ((this.logo.hashCode() + ((this.growth.hashCode() + ((this.general.hashCode() + ((this.connections.hashCode() + ((this.activities.hashCode() + (this.action.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final C16326w getNavigation() {
        return this.navigation;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final C16328y getPlan() {
        return this.plan;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final C16289a0 getRecovery() {
        return this.recovery;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final C16293c0 getSleep() {
        return this.sleep;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final C16297e0 getStrain() {
        return this.strain;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final C16301g0 getStrap() {
        return this.strap;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final C16305i0 getTinyIcons() {
        return this.tinyIcons;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final C16309k0 getVarious() {
        return this.various;
    }

    public String toString() {
        return "WhoopIcons(action=" + this.action + ", activities=" + this.activities + ", connections=" + this.connections + ", general=" + this.general + ", growth=" + this.growth + ", logo=" + this.logo + ", navigation=" + this.navigation + ", recovery=" + this.recovery + ", strain=" + this.strain + ", sleep=" + this.sleep + ", strap=" + this.strap + ", various=" + this.various + ", tinyIcons=" + this.tinyIcons + ", health=" + this.health + ", hormonalHealth=" + this.hormonalHealth + ", plan=" + this.plan + ")";
    }
}
