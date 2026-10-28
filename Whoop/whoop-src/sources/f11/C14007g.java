package f11;

import com.whoop.design.util.TextResource;
import jh3.AbstractC21702c;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: f11.g */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b\"\u0010!R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b$\u0010&\u001a\u0004\b\u001f\u0010'¨\u0006("}, m65681d2 = {"Lf11/g;", "", "", "index", "Lcom/whoop/design/util/TextResource;", "label", "subLabel", "Ly81/f;", "labelActiveColor", "subLabelActiveColor", "", "isBelow", "", "positionY", "<init>", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;Ly81/f;ZLjava/lang/Float;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "c", "e", "d", "Ly81/f;", "()Ly81/f;", "f", "Z", "g", "()Z", "Ljava/lang/Float;", "()Ljava/lang/Float;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C14007g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int index;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource label;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource subLabel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC39333f labelActiveColor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EnumC39333f subLabelActiveColor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean isBelow;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Float positionY;

    public C14007g(int i13, TextResource label, TextResource textResource, EnumC39333f labelActiveColor, EnumC39333f enumC39333f, boolean z4, Float f13) {
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(labelActiveColor, "labelActiveColor");
        this.index = i13;
        this.label = label;
        this.subLabel = textResource;
        this.labelActiveColor = labelActiveColor;
        this.subLabelActiveColor = enumC39333f;
        this.isBelow = z4;
        this.positionY = f13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC39333f getLabelActiveColor() {
        return this.labelActiveColor;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Float getPositionY() {
        return this.positionY;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getSubLabel() {
        return this.subLabel;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14007g)) {
            return false;
        }
        C14007g c14007g = (C14007g) other;
        return this.index == c14007g.index && AbstractC22676k.m65745e(this.label, c14007g.label) && AbstractC22676k.m65745e(this.subLabel, c14007g.subLabel) && this.labelActiveColor == c14007g.labelActiveColor && this.subLabelActiveColor == c14007g.subLabelActiveColor && this.isBelow == c14007g.isBelow && AbstractC22676k.m65745e(this.positionY, c14007g.positionY);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC39333f getSubLabelActiveColor() {
        return this.subLabelActiveColor;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsBelow() {
        return this.isBelow;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(Integer.hashCode(this.index) * 31, this.label, 31);
        TextResource textResource = this.subLabel;
        int iM61132c = AbstractC21702c.m61132c(this.labelActiveColor, (iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31, 31);
        EnumC39333f enumC39333f = this.subLabelActiveColor;
        int iM8289b = AbstractC2875y.m8289b((iM61132c + (enumC39333f == null ? 0 : enumC39333f.hashCode())) * 31, 31, this.isBelow);
        Float f13 = this.positionY;
        return iM8289b + (f13 != null ? f13.hashCode() : 0);
    }

    public String toString() {
        int i13 = this.index;
        TextResource textResource = this.label;
        TextResource textResource2 = this.subLabel;
        EnumC39333f enumC39333f = this.labelActiveColor;
        EnumC39333f enumC39333f2 = this.subLabelActiveColor;
        boolean z4 = this.isBelow;
        Float f13 = this.positionY;
        StringBuilder sbM91844n = AbstractC30007c.m91844n("TickLabel(index=", i13, ", label=", textResource, ", subLabel=");
        sbM91844n.append(textResource2);
        sbM91844n.append(", labelActiveColor=");
        sbM91844n.append(enumC39333f);
        sbM91844n.append(", subLabelActiveColor=");
        sbM91844n.append(enumC39333f2);
        sbM91844n.append(", isBelow=");
        sbM91844n.append(z4);
        sbM91844n.append(", positionY=");
        sbM91844n.append(f13);
        sbM91844n.append(")");
        return sbM91844n.toString();
    }

    public /* synthetic */ C14007g(int i13, TextResource textResource, TextResource textResource2, EnumC39333f enumC39333f, EnumC39333f enumC39333f2, boolean z4, Float f13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, textResource, (i14 & 4) != 0 ? null : textResource2, enumC39333f, (i14 & 16) != 0 ? null : enumC39333f2, z4, (i14 & 64) != 0 ? null : f13);
    }
}
