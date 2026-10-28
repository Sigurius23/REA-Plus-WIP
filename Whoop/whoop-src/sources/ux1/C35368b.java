package ux1;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import y71.C39274g;

/* JADX INFO: renamed from: ux1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u0019\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b\u0015\u0010\u001f¨\u0006 "}, m65681d2 = {"Lux1/b;", "", "Lcom/whoop/design/util/TextResource;", "text", "", "trackingLabel", "Ly71/g;", "icon", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ly71/g;Lcom/whoop/navigation/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "Ljava/lang/String;", "d", "Ly71/g;", "()Ly71/g;", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35368b {

    /* JADX INFO: renamed from: e */
    public static final int f150645e = (C9598e.f28134d | C39274g.f168929c) | TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource text;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String trackingLabel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C39274g icon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C9598e destination;

    public C35368b(TextResource text, String str, C39274g c39274g, C9598e destination) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(destination, "destination");
        this.text = text;
        this.trackingLabel = str;
        this.icon = c39274g;
        this.destination = destination;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C39274g getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTrackingLabel() {
        return this.trackingLabel;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35368b)) {
            return false;
        }
        C35368b c35368b = (C35368b) other;
        return AbstractC22676k.m65745e(this.text, c35368b.text) && AbstractC22676k.m65745e(this.trackingLabel, c35368b.trackingLabel) && AbstractC22676k.m65745e(this.icon, c35368b.icon) && AbstractC22676k.m65745e(this.destination, c35368b.destination);
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        String str = this.trackingLabel;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C39274g c39274g = this.icon;
        return this.destination.hashCode() + ((iHashCode2 + (c39274g != null ? c39274g.hashCode() : 0)) * 31);
    }

    public String toString() {
        TextResource textResource = this.text;
        String str = this.trackingLabel;
        C39274g c39274g = this.icon;
        C9598e c9598e = this.destination;
        StringBuilder sbM91845o = AbstractC30007c.m91845o("ReactivationModalCta(text=", textResource, ", trackingLabel=", str, ", icon=");
        sbM91845o.append(c39274g);
        sbM91845o.append(", destination=");
        sbM91845o.append(c9598e);
        sbM91845o.append(")");
        return sbM91845o.toString();
    }
}
