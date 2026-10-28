package p736sz0;

import com.whoop.design.util.TextResource;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: sz0.t1 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u0019\u0010\u0018R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lsz0/t1;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "zoneHeaderText", "zoneMinHeaderText", "zoneMaxHeaderText", "", "Lsz0/s1;", "zoneRows", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "b", "c", "d", "Ljava/util/List;", "e", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33221t1 implements InterfaceC25312u {

    /* JADX INFO: renamed from: e */
    public static final int f138538e = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource zoneHeaderText;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource zoneMinHeaderText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource zoneMaxHeaderText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<C33218s1> zoneRows;

    public C33221t1(TextResource zoneHeaderText, TextResource zoneMinHeaderText, TextResource zoneMaxHeaderText, List<C33218s1> zoneRows) {
        AbstractC22676k.m65750j(zoneHeaderText, "zoneHeaderText");
        AbstractC22676k.m65750j(zoneMinHeaderText, "zoneMinHeaderText");
        AbstractC22676k.m65750j(zoneMaxHeaderText, "zoneMaxHeaderText");
        AbstractC22676k.m65750j(zoneRows, "zoneRows");
        this.zoneHeaderText = zoneHeaderText;
        this.zoneMinHeaderText = zoneMinHeaderText;
        this.zoneMaxHeaderText = zoneMaxHeaderText;
        this.zoneRows = zoneRows;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getZoneHeaderText() {
        return this.zoneHeaderText;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getZoneMaxHeaderText() {
        return this.zoneMaxHeaderText;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getZoneMinHeaderText() {
        return this.zoneMinHeaderText;
    }

    /* JADX INFO: renamed from: e */
    public final List<C33218s1> m105397e() {
        return this.zoneRows;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33221t1)) {
            return false;
        }
        C33221t1 c33221t1 = (C33221t1) other;
        return AbstractC22676k.m65745e(this.zoneHeaderText, c33221t1.zoneHeaderText) && AbstractC22676k.m65745e(this.zoneMinHeaderText, c33221t1.zoneMinHeaderText) && AbstractC22676k.m65745e(this.zoneMaxHeaderText, c33221t1.zoneMaxHeaderText) && AbstractC22676k.m65745e(this.zoneRows, c33221t1.zoneRows);
    }

    public int hashCode() {
        return this.zoneRows.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.zoneHeaderText.hashCode() * 31, this.zoneMinHeaderText, 31), this.zoneMaxHeaderText, 31);
    }

    public String toString() {
        TextResource textResource = this.zoneHeaderText;
        TextResource textResource2 = this.zoneMinHeaderText;
        TextResource textResource3 = this.zoneMaxHeaderText;
        List<C33218s1> list = this.zoneRows;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("ZoneState(zoneHeaderText=", textResource, ", zoneMinHeaderText=", textResource2, ", zoneMaxHeaderText=");
        sbM106658q.append(textResource3);
        sbM106658q.append(", zoneRows=");
        sbM106658q.append(list);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
