package p736sz0;

import androidx.core.app.NotificationCompat;
import com.whoop.design.util.TextResource;
import jh3.AbstractC21702c;
import l83.C23454a0;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: sz0.n1 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001d\u0010\"R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b \u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b)\u0010+\u001a\u0004\b'\u0010,¨\u0006-"}, m65681d2 = {"Lsz0/n1;", "Lm91/u;", "", NotificationCompat.CATEGORY_EVENT, "", "icon", "Lcom/whoop/design/util/TextResource;", "stat", "statTitle", "Lsz0/g1;", "statTrend", "", "isPressed", "Ly81/f;", "statValueTextColor", "<init>", "(Ljava/lang/Object;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lsz0/g1;ZLy81/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "getEvent", "()Ljava/lang/Object;", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "c", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "d", "e", "Lsz0/g1;", "()Lsz0/g1;", "f", "Z", "g", "()Z", "Ly81/f;", "()Ly81/f;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33203n1 implements InterfaceC25312u {

    /* JADX INFO: renamed from: h */
    public static final int f138424h = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Object event;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Integer icon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource stat;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource statTitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C33182g1 statTrend;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean isPressed;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final EnumC39333f statValueTextColor;

    public C33203n1(Object event, Integer num, TextResource stat, TextResource statTitle, C33182g1 c33182g1, boolean z4, EnumC39333f statValueTextColor) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(stat, "stat");
        AbstractC22676k.m65750j(statTitle, "statTitle");
        AbstractC22676k.m65750j(statValueTextColor, "statValueTextColor");
        this.event = event;
        this.icon = num;
        this.stat = stat;
        this.statTitle = statTitle;
        this.statTrend = c33182g1;
        this.isPressed = z4;
        this.statValueTextColor = statValueTextColor;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getStat() {
        return this.stat;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getStatTitle() {
        return this.statTitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C33182g1 getStatTrend() {
        return this.statTrend;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33203n1)) {
            return false;
        }
        C33203n1 c33203n1 = (C33203n1) other;
        return AbstractC22676k.m65745e(this.event, c33203n1.event) && AbstractC22676k.m65745e(this.icon, c33203n1.icon) && AbstractC22676k.m65745e(this.stat, c33203n1.stat) && AbstractC22676k.m65745e(this.statTitle, c33203n1.statTitle) && AbstractC22676k.m65745e(this.statTrend, c33203n1.statTrend) && this.isPressed == c33203n1.isPressed && this.statValueTextColor == c33203n1.statValueTextColor;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC39333f getStatValueTextColor() {
        return this.statValueTextColor;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsPressed() {
        return this.isPressed;
    }

    public int hashCode() {
        int iHashCode = this.event.hashCode() * 31;
        Integer num = this.icon;
        int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a((iHashCode + (num == null ? 0 : num.hashCode())) * 31, this.stat, 31), this.statTitle, 31);
        C33182g1 c33182g1 = this.statTrend;
        return this.statValueTextColor.hashCode() + AbstractC2875y.m8289b((iM95625a + (c33182g1 != null ? c33182g1.hashCode() : 0)) * 31, 31, this.isPressed);
    }

    public String toString() {
        Object obj = this.event;
        Integer num = this.icon;
        TextResource textResource = this.stat;
        TextResource textResource2 = this.statTitle;
        C33182g1 c33182g1 = this.statTrend;
        boolean z4 = this.isPressed;
        EnumC39333f enumC39333f = this.statValueTextColor;
        StringBuilder sb4 = new StringBuilder("VerticalStatState(event=");
        sb4.append(obj);
        sb4.append(", icon=");
        sb4.append(num);
        sb4.append(", stat=");
        AbstractC30007c.m91855y(sb4, textResource, ", statTitle=", textResource2, ", statTrend=");
        sb4.append(c33182g1);
        sb4.append(", isPressed=");
        sb4.append(z4);
        sb4.append(", statValueTextColor=");
        return AbstractC21702c.m61138i(sb4, enumC39333f, ")");
    }

    public /* synthetic */ C33203n1(Object obj, Integer num, TextResource textResource, TextResource textResource2, C33182g1 c33182g1, boolean z4, EnumC39333f enumC39333f, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C23454a0.f92919a : obj, (i13 & 2) != 0 ? null : num, textResource, textResource2, (i13 & 16) != 0 ? null : c33182g1, (i13 & 32) != 0 ? false : z4, (i13 & 64) != 0 ? EnumC39333f.BRAND_WHITE : enumC39333f);
    }
}
