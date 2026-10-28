package m81;

import b91.C2886a;
import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import jh3.AbstractC21702c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: m81.g */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f¨\u0006 "}, m65681d2 = {"Lm81/g;", "", "", "buttonId", "Lgz0/m0;", "icon", "Lcom/whoop/design/util/TextResource;", "label", "Lb91/a;", "labelStyle", "<init>", "(Ljava/lang/String;Lgz0/m0;Lcom/whoop/design/util/TextResource;Lb91/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lgz0/m0;", "()Lgz0/m0;", "c", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "d", "Lb91/a;", "()Lb91/a;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C25232g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String buttonId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource label;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C2886a labelStyle;

    public C25232g(String buttonId, EnumC16313m0 enumC16313m0, TextResource label, C2886a c2886a) {
        AbstractC22676k.m65750j(buttonId, "buttonId");
        AbstractC22676k.m65750j(label, "label");
        this.buttonId = buttonId;
        this.icon = enumC16313m0;
        this.label = label;
        this.labelStyle = c2886a;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getButtonId() {
        return this.buttonId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C2886a getLabelStyle() {
        return this.labelStyle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C25232g)) {
            return false;
        }
        C25232g c25232g = (C25232g) other;
        return AbstractC22676k.m65745e(this.buttonId, c25232g.buttonId) && this.icon == c25232g.icon && AbstractC22676k.m65745e(this.label, c25232g.label) && AbstractC22676k.m65745e(this.labelStyle, c25232g.labelStyle);
    }

    public int hashCode() {
        int iHashCode = this.buttonId.hashCode() * 31;
        EnumC16313m0 enumC16313m0 = this.icon;
        int iM95625a = AbstractC31061c.m95625a((iHashCode + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31, this.label, 31);
        C2886a c2886a = this.labelStyle;
        return iM95625a + (c2886a != null ? c2886a.hashCode() : 0);
    }

    public String toString() {
        String str = this.buttonId;
        EnumC16313m0 enumC16313m0 = this.icon;
        TextResource textResource = this.label;
        C2886a c2886a = this.labelStyle;
        StringBuilder sbM61141l = AbstractC21702c.m61141l("SelectorButtonViewState(buttonId=", str, ", icon=", enumC16313m0, ", label=");
        sbM61141l.append(textResource);
        sbM61141l.append(", labelStyle=");
        sbM61141l.append(c2886a);
        sbM61141l.append(")");
        return sbM61141l.toString();
    }

    public /* synthetic */ C25232g(String str, EnumC16313m0 enumC16313m0, TextResource textResource, C2886a c2886a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, enumC16313m0, textResource, (i13 & 8) != 0 ? null : c2886a);
    }
}
