package c41;

import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: c41.z2 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lc41/z2;", "", "", "name", "ctaUrl", "Lc41/d3;", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lc41/d3;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Lc41/d3;", "()Lc41/d3;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4161z2 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String ctaUrl;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC4009d3 type;

    public C4161z2(String name, String str, EnumC4009d3 type) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(type, "type");
        this.name = name;
        this.ctaUrl = str;
        this.type = type;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCtaUrl() {
        return this.ctaUrl;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC4009d3 getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4161z2)) {
            return false;
        }
        C4161z2 c4161z2 = (C4161z2) other;
        return AbstractC22676k.m65745e(this.name, c4161z2.name) && AbstractC22676k.m65745e(this.ctaUrl, c4161z2.ctaUrl) && this.type == c4161z2.type;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.ctaUrl;
        return this.type.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        String str = this.name;
        String str2 = this.ctaUrl;
        EnumC4009d3 enumC4009d3 = this.type;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ListItemTileClicked(name=", str, ", ctaUrl=", str2, ", type=");
        sbM32001t.append(enumC4009d3);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
