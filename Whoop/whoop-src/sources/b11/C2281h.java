package b11;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: b11.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0019\u0010\"¨\u0006#"}, m65681d2 = {"Lb11/h;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "chargeLabel", "", "isLowBattery", "Lb11/k;", "indicatorIcon", "Lb11/i;", "connectivityIndicatorStatusType", "<init>", "(Lcom/whoop/design/util/TextResource;ZLb11/k;Lb11/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "b", "Z", "e", "()Z", "c", "Lb11/k;", "()Lb11/k;", "d", "Lb11/i;", "()Lb11/i;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C2281h implements InterfaceC25312u {

    /* JADX INFO: renamed from: e */
    public static final int f9046e = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource chargeLabel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isLowBattery;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC2284k indicatorIcon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC2282i connectivityIndicatorStatusType;

    public C2281h(TextResource chargeLabel, boolean z4, AbstractC2284k indicatorIcon, AbstractC2282i connectivityIndicatorStatusType) {
        AbstractC22676k.m65750j(chargeLabel, "chargeLabel");
        AbstractC22676k.m65750j(indicatorIcon, "indicatorIcon");
        AbstractC22676k.m65750j(connectivityIndicatorStatusType, "connectivityIndicatorStatusType");
        this.chargeLabel = chargeLabel;
        this.isLowBattery = z4;
        this.indicatorIcon = indicatorIcon;
        this.connectivityIndicatorStatusType = connectivityIndicatorStatusType;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getChargeLabel() {
        return this.chargeLabel;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC2282i getConnectivityIndicatorStatusType() {
        return this.connectivityIndicatorStatusType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AbstractC2284k getIndicatorIcon() {
        return this.indicatorIcon;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsLowBattery() {
        return this.isLowBattery;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C2281h)) {
            return false;
        }
        C2281h c2281h = (C2281h) other;
        return AbstractC22676k.m65745e(this.chargeLabel, c2281h.chargeLabel) && this.isLowBattery == c2281h.isLowBattery && AbstractC22676k.m65745e(this.indicatorIcon, c2281h.indicatorIcon) && AbstractC22676k.m65745e(this.connectivityIndicatorStatusType, c2281h.connectivityIndicatorStatusType);
    }

    @Override // p720m91.InterfaceC25312u
    public /* bridge */ Object getEvent() {
        return super.getEvent();
    }

    public int hashCode() {
        return this.connectivityIndicatorStatusType.hashCode() + ((this.indicatorIcon.hashCode() + AbstractC2875y.m8289b(this.chargeLabel.hashCode() * 31, 31, this.isLowBattery)) * 31);
    }

    public String toString() {
        TextResource textResource = this.chargeLabel;
        boolean z4 = this.isLowBattery;
        AbstractC2284k abstractC2284k = this.indicatorIcon;
        AbstractC2282i abstractC2282i = this.connectivityIndicatorStatusType;
        StringBuilder sbM91846p = AbstractC30007c.m91846p("ConnectivityIndicatorState(chargeLabel=", textResource, ", isLowBattery=", z4, ", indicatorIcon=");
        sbM91846p.append(abstractC2284k);
        sbM91846p.append(", connectivityIndicatorStatusType=");
        sbM91846p.append(abstractC2282i);
        sbM91846p.append(")");
        return sbM91846p.toString();
    }

    public /* synthetic */ C2281h(TextResource textResource, boolean z4, AbstractC2284k abstractC2284k, AbstractC2282i abstractC2282i, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC8693b.m21278l("--%") : textResource, (i13 & 2) != 0 ? false : z4, (i13 & 4) != 0 ? AbstractC2284k.c.f9074d : abstractC2284k, (i13 & 8) != 0 ? AbstractC2282i.e.f9060f : abstractC2282i);
    }
}
