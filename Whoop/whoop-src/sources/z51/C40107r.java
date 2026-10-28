package z51;

import com.whoop.design.util.TextResource;
import l83.C23454a0;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: z51.r */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)¨\u0006,"}, m65681d2 = {"Lz51/r;", "Lm91/u;", "Lz51/s;", "type", "", "fillPercent", "Lcom/whoop/design/util/TextResource;", "score", "", "showOptimalStrain", "optimalStrainPercent", "", "onHelpClickedEvent", "onShareClickedEvent", "<init>", "(Lz51/s;FLcom/whoop/design/util/TextResource;ZFLjava/lang/Object;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lz51/s;", "f", "()Lz51/s;", "b", "F", "()F", "c", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "d", "Z", "e", "()Z", "Ljava/lang/Object;", "getOnHelpClickedEvent", "()Ljava/lang/Object;", "g", "getOnShareClickedEvent", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C40107r implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC40108s type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float fillPercent;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource score;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean showOptimalStrain;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float optimalStrainPercent;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Object onHelpClickedEvent;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Object onShareClickedEvent;

    public C40107r(EnumC40108s type, float f13, TextResource score, boolean z4, float f14, Object onHelpClickedEvent, Object onShareClickedEvent) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(score, "score");
        AbstractC22676k.m65750j(onHelpClickedEvent, "onHelpClickedEvent");
        AbstractC22676k.m65750j(onShareClickedEvent, "onShareClickedEvent");
        this.type = type;
        this.fillPercent = f13;
        this.score = score;
        this.showOptimalStrain = z4;
        this.optimalStrainPercent = f14;
        this.onHelpClickedEvent = onHelpClickedEvent;
        this.onShareClickedEvent = onShareClickedEvent;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getFillPercent() {
        return this.fillPercent;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getOptimalStrainPercent() {
        return this.optimalStrainPercent;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getScore() {
        return this.score;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getShowOptimalStrain() {
        return this.showOptimalStrain;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C40107r)) {
            return false;
        }
        C40107r c40107r = (C40107r) other;
        return this.type == c40107r.type && Float.compare(this.fillPercent, c40107r.fillPercent) == 0 && AbstractC22676k.m65745e(this.score, c40107r.score) && this.showOptimalStrain == c40107r.showOptimalStrain && Float.compare(this.optimalStrainPercent, c40107r.optimalStrainPercent) == 0 && AbstractC22676k.m65745e(this.onHelpClickedEvent, c40107r.onHelpClickedEvent) && AbstractC22676k.m65745e(this.onShareClickedEvent, c40107r.onShareClickedEvent);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC40108s getType() {
        return this.type;
    }

    public int hashCode() {
        return this.onShareClickedEvent.hashCode() + AbstractC33745d.m106644c(AbstractC11266d.m30447a(this.optimalStrainPercent, AbstractC2875y.m8289b(AbstractC31061c.m95625a(AbstractC11266d.m30447a(this.fillPercent, this.type.hashCode() * 31, 31), this.score, 31), 31, this.showOptimalStrain), 31), 31, this.onHelpClickedEvent);
    }

    public String toString() {
        EnumC40108s enumC40108s = this.type;
        float f13 = this.fillPercent;
        TextResource textResource = this.score;
        boolean z4 = this.showOptimalStrain;
        float f14 = this.optimalStrainPercent;
        Object obj = this.onHelpClickedEvent;
        Object obj2 = this.onShareClickedEvent;
        StringBuilder sb4 = new StringBuilder("PillarGaugeState(type=");
        sb4.append(enumC40108s);
        sb4.append(", fillPercent=");
        sb4.append(f13);
        sb4.append(", score=");
        AbstractC33745d.m106664w(textResource, ", showOptimalStrain=", ", optimalStrainPercent=", sb4, z4);
        sb4.append(f14);
        sb4.append(", onHelpClickedEvent=");
        sb4.append(obj);
        sb4.append(", onShareClickedEvent=");
        return AbstractC2875y.m8303p(sb4, ")", obj2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C40107r(EnumC40108s enumC40108s, float f13, TextResource textResource, boolean z4, float f14, Object obj, Object obj2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z13 = (i13 & 8) != 0 ? false : z4;
        float f15 = (i13 & 16) != 0 ? 0.0f : f14;
        int i14 = i13 & 32;
        C23454a0 c23454a0 = C23454a0.f92919a;
        this(enumC40108s, f13, textResource, z13, f15, i14 != 0 ? c23454a0 : obj, (i13 & 64) != 0 ? c23454a0 : obj2);
    }
}
