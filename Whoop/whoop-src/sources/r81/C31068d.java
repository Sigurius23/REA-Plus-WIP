package r81;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: r81.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lr81/d;", "", "Lcom/whoop/design/util/TextResource;", "cost", "costUnits", "title", "Lcom/whoop/navigation/e;", "actionScreen", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "b", "()Lcom/whoop/design/util/TextResource;", "c", "d", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C31068d {

    /* JADX INFO: renamed from: e */
    public static final int f128089e = C9598e.f28134d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource cost;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource costUnits;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C9598e actionScreen;

    public C31068d(TextResource cost, TextResource costUnits, TextResource title, C9598e actionScreen) {
        AbstractC22676k.m65750j(cost, "cost");
        AbstractC22676k.m65750j(costUnits, "costUnits");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(actionScreen, "actionScreen");
        this.cost = cost;
        this.costUnits = costUnits;
        this.title = title;
        this.actionScreen = actionScreen;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C9598e getActionScreen() {
        return this.actionScreen;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getCost() {
        return this.cost;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getCostUnits() {
        return this.costUnits;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C31068d)) {
            return false;
        }
        C31068d c31068d = (C31068d) other;
        return AbstractC22676k.m65745e(this.cost, c31068d.cost) && AbstractC22676k.m65745e(this.costUnits, c31068d.costUnits) && AbstractC22676k.m65745e(this.title, c31068d.title) && AbstractC22676k.m65745e(this.actionScreen, c31068d.actionScreen);
    }

    public int hashCode() {
        return this.actionScreen.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.cost.hashCode() * 31, this.costUnits, 31), this.title, 31);
    }

    public String toString() {
        TextResource textResource = this.cost;
        TextResource textResource2 = this.costUnits;
        TextResource textResource3 = this.title;
        C9598e c9598e = this.actionScreen;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("WhoopProCta(cost=", textResource, ", costUnits=", textResource2, ", title=");
        sbM106658q.append(textResource3);
        sbM106658q.append(", actionScreen=");
        sbM106658q.append(c9598e);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }

    public /* synthetic */ C31068d(TextResource textResource, TextResource textResource2, TextResource textResource3, C9598e c9598e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, textResource2, textResource3, (i13 & 8) != 0 ? new C9598e(null, null, null, 7, null) : c9598e);
    }
}
