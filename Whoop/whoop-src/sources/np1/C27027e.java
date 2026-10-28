package np1;

import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import hc3.AbstractC17176i;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import y71.C39282o;

/* JADX INFO: renamed from: np1.e */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b!\u0010'\u001a\u0004\b \u0010(R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b#\u0010)\u001a\u0004\b\"\u0010*¨\u0006+"}, m65681d2 = {"Lnp1/e;", "", "Lcom/whoop/design/util/TextResource;", "currentWeek", "Lnp1/c;", "datePicker", "trimester", "weeksRemaining", "Lgz0/m0;", "icon", "Ly71/o;", "haveYouDeliveredButton", "Lnp1/f;", "haveYouDeliveredDialogState", "<init>", "(Lcom/whoop/design/util/TextResource;Lnp1/c;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;Ly71/o;Lnp1/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "b", "Lnp1/c;", "()Lnp1/c;", "c", "f", "d", "g", "e", "Lgz0/m0;", "()Lgz0/m0;", "Ly71/o;", "()Ly71/o;", "Lnp1/f;", "()Lnp1/f;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C27027e {

    /* JADX INFO: renamed from: h */
    public static final int f107751h;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource currentWeek;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C27025c datePicker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource trimester;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource weeksRemaining;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C39282o haveYouDeliveredButton;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C27028f haveYouDeliveredDialogState;

    static {
        int i13 = TextResource.$stable;
        f107751h = i13 | C39282o.f168987q | i13 | i13 | i13 | i13;
    }

    public C27027e(TextResource currentWeek, C27025c c27025c, TextResource trimester, TextResource weeksRemaining, EnumC16313m0 icon, C39282o c39282o, C27028f haveYouDeliveredDialogState) {
        AbstractC22676k.m65750j(currentWeek, "currentWeek");
        AbstractC22676k.m65750j(trimester, "trimester");
        AbstractC22676k.m65750j(weeksRemaining, "weeksRemaining");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(haveYouDeliveredDialogState, "haveYouDeliveredDialogState");
        this.currentWeek = currentWeek;
        this.datePicker = c27025c;
        this.trimester = trimester;
        this.weeksRemaining = weeksRemaining;
        this.icon = icon;
        this.haveYouDeliveredButton = c39282o;
        this.haveYouDeliveredDialogState = haveYouDeliveredDialogState;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getCurrentWeek() {
        return this.currentWeek;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C27025c getDatePicker() {
        return this.datePicker;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C39282o getHaveYouDeliveredButton() {
        return this.haveYouDeliveredButton;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C27028f getHaveYouDeliveredDialogState() {
        return this.haveYouDeliveredDialogState;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C27027e)) {
            return false;
        }
        C27027e c27027e = (C27027e) other;
        return AbstractC22676k.m65745e(this.currentWeek, c27027e.currentWeek) && AbstractC22676k.m65745e(this.datePicker, c27027e.datePicker) && AbstractC22676k.m65745e(this.trimester, c27027e.trimester) && AbstractC22676k.m65745e(this.weeksRemaining, c27027e.weeksRemaining) && this.icon == c27027e.icon && AbstractC22676k.m65745e(this.haveYouDeliveredButton, c27027e.haveYouDeliveredButton) && AbstractC22676k.m65745e(this.haveYouDeliveredDialogState, c27027e.haveYouDeliveredDialogState);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getTrimester() {
        return this.trimester;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getWeeksRemaining() {
        return this.weeksRemaining;
    }

    public int hashCode() {
        int iHashCode = this.currentWeek.hashCode() * 31;
        C27025c c27025c = this.datePicker;
        int iM48500b = AbstractC17176i.m48500b(this.icon, AbstractC31061c.m95625a(AbstractC31061c.m95625a((iHashCode + (c27025c == null ? 0 : c27025c.hashCode())) * 31, this.trimester, 31), this.weeksRemaining, 31), 31);
        C39282o c39282o = this.haveYouDeliveredButton;
        return this.haveYouDeliveredDialogState.hashCode() + ((iM48500b + (c39282o != null ? c39282o.hashCode() : 0)) * 31);
    }

    public String toString() {
        TextResource textResource = this.currentWeek;
        C27025c c27025c = this.datePicker;
        TextResource textResource2 = this.trimester;
        TextResource textResource3 = this.weeksRemaining;
        EnumC16313m0 enumC16313m0 = this.icon;
        C39282o c39282o = this.haveYouDeliveredButton;
        C27028f c27028f = this.haveYouDeliveredDialogState;
        StringBuilder sb4 = new StringBuilder("HeaderState(currentWeek=");
        sb4.append(textResource);
        sb4.append(", datePicker=");
        sb4.append(c27025c);
        sb4.append(", trimester=");
        AbstractC30007c.m91855y(sb4, textResource2, ", weeksRemaining=", textResource3, ", icon=");
        sb4.append(enumC16313m0);
        sb4.append(", haveYouDeliveredButton=");
        sb4.append(c39282o);
        sb4.append(", haveYouDeliveredDialogState=");
        sb4.append(c27028f);
        sb4.append(")");
        return sb4.toString();
    }
}
