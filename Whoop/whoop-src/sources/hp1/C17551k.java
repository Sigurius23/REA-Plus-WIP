package hp1;

import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: hp1.k */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Lhp1/k;", "", "Lgz0/m0;", "icon", "Lcom/whoop/design/util/TextResource;", "label", "sublabel", "<init>", "(Lgz0/m0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgz0/m0;", "()Lgz0/m0;", "b", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "c", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17551k {

    /* JADX INFO: renamed from: d */
    public static final int f67945d = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource label;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource sublabel;

    public C17551k(EnumC16313m0 icon, TextResource label, TextResource sublabel) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(sublabel, "sublabel");
        this.icon = icon;
        this.label = label;
        this.sublabel = sublabel;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getSublabel() {
        return this.sublabel;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17551k)) {
            return false;
        }
        C17551k c17551k = (C17551k) other;
        return this.icon == c17551k.icon && AbstractC22676k.m65745e(this.label, c17551k.label) && AbstractC22676k.m65745e(this.sublabel, c17551k.sublabel);
    }

    public int hashCode() {
        return this.sublabel.hashCode() + AbstractC31061c.m95625a(this.icon.hashCode() * 31, this.label, 31);
    }

    public String toString() {
        EnumC16313m0 enumC16313m0 = this.icon;
        TextResource textResource = this.label;
        TextResource textResource2 = this.sublabel;
        StringBuilder sb4 = new StringBuilder("StealthModeInputState(icon=");
        sb4.append(enumC16313m0);
        sb4.append(", label=");
        sb4.append(textResource);
        sb4.append(", sublabel=");
        return AbstractC30007c.m91841k(sb4, textResource2, ")");
    }
}
