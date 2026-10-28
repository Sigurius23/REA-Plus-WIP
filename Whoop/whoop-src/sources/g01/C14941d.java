package g01;

import com.whoop.navigation.C9598e;
import gz0.EnumC16313m0;
import hc3.AbstractC17176i;
import hy0.C17731c2;
import java.util.List;
import jh3.AbstractC21702c;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: g01.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001a\u0010%R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001e\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b'\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, m65681d2 = {"Lg01/d;", "Lm91/u;", "", "cardTitle", "Lgz0/m0;", "icon", "Lcom/whoop/navigation/e;", "destination", "Lg01/a;", "body", "", "items", "Lhy0/c2;", "trend", "<init>", "(Ljava/lang/String;Lgz0/m0;Lcom/whoop/navigation/e;Lg01/a;Ljava/util/List;Lhy0/c2;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lgz0/m0;", "e", "()Lgz0/m0;", "c", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "d", "Lg01/a;", "()Lg01/a;", "Ljava/util/List;", "f", "()Ljava/util/List;", "Lhy0/c2;", "g", "()Lhy0/c2;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C14941d implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String cardTitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C9598e destination;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C14938a body;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<InterfaceC25312u> items;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C17731c2 trend;

    /* JADX WARN: Multi-variable type inference failed */
    public C14941d(String str, EnumC16313m0 icon, C9598e c9598e, C14938a c14938a, List<? extends InterfaceC25312u> items, C17731c2 c17731c2) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(items, "items");
        this.cardTitle = str;
        this.icon = icon;
        this.destination = c9598e;
        this.body = c14938a;
        this.items = items;
        this.trend = c17731c2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C14938a getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCardTitle() {
        return this.cardTitle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14941d)) {
            return false;
        }
        C14941d c14941d = (C14941d) other;
        return AbstractC22676k.m65745e(this.cardTitle, c14941d.cardTitle) && this.icon == c14941d.icon && AbstractC22676k.m65745e(this.destination, c14941d.destination) && AbstractC22676k.m65745e(this.body, c14941d.body) && AbstractC22676k.m65745e(this.items, c14941d.items) && AbstractC22676k.m65745e(this.trend, c14941d.trend);
    }

    /* JADX INFO: renamed from: f */
    public final List<InterfaceC25312u> m43049f() {
        return this.items;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C17731c2 getTrend() {
        return this.trend;
    }

    public int hashCode() {
        String str = this.cardTitle;
        int iM48500b = AbstractC17176i.m48500b(this.icon, (str == null ? 0 : str.hashCode()) * 31, 31);
        C9598e c9598e = this.destination;
        int iHashCode = (iM48500b + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        C14938a c14938a = this.body;
        int iM31983b = AbstractC11895b.m31983b((iHashCode + (c14938a == null ? 0 : c14938a.hashCode())) * 31, 31, this.items);
        C17731c2 c17731c2 = this.trend;
        return iM31983b + (c17731c2 != null ? c17731c2.hashCode() : 0);
    }

    public String toString() {
        String str = this.cardTitle;
        EnumC16313m0 enumC16313m0 = this.icon;
        C9598e c9598e = this.destination;
        C14938a c14938a = this.body;
        List<InterfaceC25312u> list = this.items;
        C17731c2 c17731c2 = this.trend;
        StringBuilder sbM61141l = AbstractC21702c.m61141l("FertilityCardViewState(cardTitle=", str, ", icon=", enumC16313m0, ", destination=");
        sbM61141l.append(c9598e);
        sbM61141l.append(", body=");
        sbM61141l.append(c14938a);
        sbM61141l.append(", items=");
        sbM61141l.append(list);
        sbM61141l.append(", trend=");
        sbM61141l.append(c17731c2);
        sbM61141l.append(")");
        return sbM61141l.toString();
    }
}
