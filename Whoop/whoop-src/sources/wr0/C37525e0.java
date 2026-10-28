package wr0;

import c13.AbstractC3855a;
import com.whoop.design.util.TextResource;
import j81.C21425i;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: wr0.e0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b!\u0010 R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u0018\u0010$¨\u0006%"}, m65681d2 = {"Lwr0/e0;", "Lm91/u;", "", "id", "Lj81/i;", "gauge", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "", "Ly81/f;", "barStyles", "<init>", "(Ljava/lang/String;Lj81/i;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Lj81/i;", "()Lj81/i;", "c", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "d", "e", "Ljava/util/List;", "()Ljava/util/List;", "community-moments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C37525e0 implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C21425i gauge;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<EnumC39333f> barStyles;

    /* JADX WARN: Multi-variable type inference failed */
    public C37525e0(String id4, C21425i gauge, TextResource title, TextResource textResource, List<? extends EnumC39333f> list) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(gauge, "gauge");
        AbstractC22676k.m65750j(title, "title");
        this.id = id4;
        this.gauge = gauge;
        this.title = title;
        this.subtitle = textResource;
        this.barStyles = list;
    }

    /* JADX INFO: renamed from: a */
    public final List<EnumC39333f> m120332a() {
        return this.barStyles;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C21425i getGauge() {
        return this.gauge;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C37525e0)) {
            return false;
        }
        C37525e0 c37525e0 = (C37525e0) other;
        return AbstractC22676k.m65745e(this.id, c37525e0.id) && AbstractC22676k.m65745e(this.gauge, c37525e0.gauge) && AbstractC22676k.m65745e(this.title, c37525e0.title) && AbstractC22676k.m65745e(this.subtitle, c37525e0.subtitle) && AbstractC22676k.m65745e(this.barStyles, c37525e0.barStyles);
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a((this.gauge.hashCode() + (this.id.hashCode() * 31)) * 31, this.title, 31);
        TextResource textResource = this.subtitle;
        int iHashCode = (iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31;
        List<EnumC39333f> list = this.barStyles;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        C21425i c21425i = this.gauge;
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        List<EnumC39333f> list = this.barStyles;
        StringBuilder sb4 = new StringBuilder("MomentCompactScoreGaugeState(id=");
        sb4.append(str);
        sb4.append(", gauge=");
        sb4.append(c21425i);
        sb4.append(", title=");
        AbstractC30007c.m91855y(sb4, textResource, ", subtitle=", textResource2, ", barStyles=");
        return AbstractC3855a.m11829m(sb4, list, ")");
    }
}
