package c41;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: c41.e2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\"\u0010&\u001a\u0004\b\u0018\u0010'¨\u0006("}, m65681d2 = {"Lc41/e2;", "Lm91/u;", "", "dataAvailable", "", "icon", "Lcom/whoop/design/util/TextResource;", "metricText", "rangeText", "Lc41/f2;", "type", "Ly81/f;", "backgroundColor", "<init>", "(ZILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc41/f2;Ly81/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "I", "c", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "d", "f", "Lc41/f2;", "g", "()Lc41/f2;", "Ly81/f;", "()Ly81/f;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4015e2 implements InterfaceC25312u {

    /* JADX INFO: renamed from: g */
    public static final int f16311g = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean dataAvailable;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int icon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource metricText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource rangeText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EnumC4022f2 type;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final EnumC39333f backgroundColor;

    public C4015e2(boolean z4, int i13, TextResource metricText, TextResource textResource, EnumC4022f2 type, EnumC39333f backgroundColor) {
        AbstractC22676k.m65750j(metricText, "metricText");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(backgroundColor, "backgroundColor");
        this.dataAvailable = z4;
        this.icon = i13;
        this.metricText = metricText;
        this.rangeText = textResource;
        this.type = type;
        this.backgroundColor = backgroundColor;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC39333f getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getDataAvailable() {
        return this.dataAvailable;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getMetricText() {
        return this.metricText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4015e2)) {
            return false;
        }
        C4015e2 c4015e2 = (C4015e2) other;
        return this.dataAvailable == c4015e2.dataAvailable && this.icon == c4015e2.icon && AbstractC22676k.m65745e(this.metricText, c4015e2.metricText) && AbstractC22676k.m65745e(this.rangeText, c4015e2.rangeText) && this.type == c4015e2.type && this.backgroundColor == c4015e2.backgroundColor;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getRangeText() {
        return this.rangeText;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final EnumC4022f2 getType() {
        return this.type;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(AbstractC11266d.m30448b(this.icon, Boolean.hashCode(this.dataAvailable) * 31, 31), this.metricText, 31);
        TextResource textResource = this.rangeText;
        return this.backgroundColor.hashCode() + ((this.type.hashCode() + ((iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31)) * 31);
    }

    public String toString() {
        boolean z4 = this.dataAvailable;
        int i13 = this.icon;
        TextResource textResource = this.metricText;
        TextResource textResource2 = this.rangeText;
        EnumC4022f2 enumC4022f2 = this.type;
        EnumC39333f enumC39333f = this.backgroundColor;
        StringBuilder sb4 = new StringBuilder("HealthMonitorTileState(dataAvailable=");
        sb4.append(z4);
        sb4.append(", icon=");
        sb4.append(i13);
        sb4.append(", metricText=");
        AbstractC30007c.m91855y(sb4, textResource, ", rangeText=", textResource2, ", type=");
        sb4.append(enumC4022f2);
        sb4.append(", backgroundColor=");
        sb4.append(enumC39333f);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ C4015e2(boolean z4, int i13, TextResource textResource, TextResource textResource2, EnumC4022f2 enumC4022f2, EnumC39333f enumC39333f, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? true : z4, (i14 & 2) != 0 ? Integer.MIN_VALUE : i13, (i14 & 4) != 0 ? AbstractC8693b.m21267a() : textResource, (i14 & 8) != 0 ? null : textResource2, (i14 & 16) != 0 ? EnumC4022f2.POSITIVE : enumC4022f2, (i14 & 32) != 0 ? EnumC39333f.WHITE_10 : enumC39333f);
    }
}
