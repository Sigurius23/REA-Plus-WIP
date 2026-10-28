package jn1;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: jn1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u001b"}, m65681d2 = {"Ljn1/a;", "", "Lcom/whoop/design/util/TextResource;", "defaultStatLeftName", "defaultStatRightName", "firstChosenStat", "secondChosenStat", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "getDefaultStatLeftName", "()Lcom/whoop/design/util/TextResource;", "b", "getDefaultStatRightName", "c", "d", "home-customization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21802a {

    /* JADX INFO: renamed from: e */
    public static final int f84002e = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource defaultStatLeftName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource defaultStatRightName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource firstChosenStat;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource secondChosenStat;

    public C21802a(TextResource defaultStatLeftName, TextResource defaultStatRightName, TextResource firstChosenStat, TextResource secondChosenStat) {
        AbstractC22676k.m65750j(defaultStatLeftName, "defaultStatLeftName");
        AbstractC22676k.m65750j(defaultStatRightName, "defaultStatRightName");
        AbstractC22676k.m65750j(firstChosenStat, "firstChosenStat");
        AbstractC22676k.m65750j(secondChosenStat, "secondChosenStat");
        this.defaultStatLeftName = defaultStatLeftName;
        this.defaultStatRightName = defaultStatRightName;
        this.firstChosenStat = firstChosenStat;
        this.secondChosenStat = secondChosenStat;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getFirstChosenStat() {
        return this.firstChosenStat;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getSecondChosenStat() {
        return this.secondChosenStat;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21802a)) {
            return false;
        }
        C21802a c21802a = (C21802a) other;
        return AbstractC22676k.m65745e(this.defaultStatLeftName, c21802a.defaultStatLeftName) && AbstractC22676k.m65745e(this.defaultStatRightName, c21802a.defaultStatRightName) && AbstractC22676k.m65745e(this.firstChosenStat, c21802a.firstChosenStat) && AbstractC22676k.m65745e(this.secondChosenStat, c21802a.secondChosenStat);
    }

    public int hashCode() {
        return this.secondChosenStat.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.defaultStatLeftName.hashCode() * 31, this.defaultStatRightName, 31), this.firstChosenStat, 31);
    }

    public String toString() {
        TextResource textResource = this.defaultStatLeftName;
        TextResource textResource2 = this.defaultStatRightName;
        return AbstractC33745d.m106655n(AbstractC33745d.m106658q("GaugeExplainerViewState(defaultStatLeftName=", textResource, ", defaultStatRightName=", textResource2, ", firstChosenStat="), this.firstChosenStat, ", secondChosenStat=", this.secondChosenStat, ")");
    }
}
