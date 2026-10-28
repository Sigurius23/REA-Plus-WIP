package tq2;

import com.whoop.design.util.TextResource;
import jh3.AbstractC21702c;
import p208i2.AbstractC17911t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: tq2.h */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b \u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b$\u0010#R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\"\u0010&\u001a\u0004\b\u0019\u0010'¨\u0006("}, m65681d2 = {"Ltq2/h;", "", "", "fillPercentage", "Ly81/f;", "barColor", "labelColor", "Lcom/whoop/design/util/TextResource;", "labelText", "labelSuffix", "labelSubtext", "Li2/t;", "barBrush", "<init>", "(FLy81/f;Ly81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Li2/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "c", "()F", "b", "Ly81/f;", "()Ly81/f;", "d", "Lcom/whoop/design/util/TextResource;", "g", "()Lcom/whoop/design/util/TextResource;", "e", "f", "Li2/t;", "()Li2/t;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C34091h {

    /* JADX INFO: renamed from: h */
    public static final int f142970h = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float fillPercentage;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC39333f barColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC39333f labelColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource labelText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource labelSuffix;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextResource labelSubtext;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final AbstractC17911t barBrush;

    public C34091h(float f13, EnumC39333f barColor, EnumC39333f labelColor, TextResource labelText, TextResource labelSuffix, TextResource labelSubtext, AbstractC17911t barBrush) {
        AbstractC22676k.m65750j(barColor, "barColor");
        AbstractC22676k.m65750j(labelColor, "labelColor");
        AbstractC22676k.m65750j(labelText, "labelText");
        AbstractC22676k.m65750j(labelSuffix, "labelSuffix");
        AbstractC22676k.m65750j(labelSubtext, "labelSubtext");
        AbstractC22676k.m65750j(barBrush, "barBrush");
        this.fillPercentage = f13;
        this.barColor = barColor;
        this.labelColor = labelColor;
        this.labelText = labelText;
        this.labelSuffix = labelSuffix;
        this.labelSubtext = labelSubtext;
        this.barBrush = barBrush;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC17911t getBarBrush() {
        return this.barBrush;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC39333f getBarColor() {
        return this.barColor;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getFillPercentage() {
        return this.fillPercentage;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final EnumC39333f getLabelColor() {
        return this.labelColor;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getLabelSubtext() {
        return this.labelSubtext;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C34091h)) {
            return false;
        }
        C34091h c34091h = (C34091h) other;
        return Float.compare(this.fillPercentage, c34091h.fillPercentage) == 0 && this.barColor == c34091h.barColor && this.labelColor == c34091h.labelColor && AbstractC22676k.m65745e(this.labelText, c34091h.labelText) && AbstractC22676k.m65745e(this.labelSuffix, c34091h.labelSuffix) && AbstractC22676k.m65745e(this.labelSubtext, c34091h.labelSubtext) && AbstractC22676k.m65745e(this.barBrush, c34091h.barBrush);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getLabelSuffix() {
        return this.labelSuffix;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getLabelText() {
        return this.labelText;
    }

    public int hashCode() {
        return this.barBrush.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC21702c.m61132c(this.labelColor, AbstractC21702c.m61132c(this.barColor, Float.hashCode(this.fillPercentage) * 31, 31), 31), this.labelText, 31), this.labelSuffix, 31), this.labelSubtext, 31);
    }

    public String toString() {
        float f13 = this.fillPercentage;
        EnumC39333f enumC39333f = this.barColor;
        EnumC39333f enumC39333f2 = this.labelColor;
        TextResource textResource = this.labelText;
        TextResource textResource2 = this.labelSuffix;
        TextResource textResource3 = this.labelSubtext;
        AbstractC17911t abstractC17911t = this.barBrush;
        StringBuilder sb4 = new StringBuilder("VerticalBarModelState(fillPercentage=");
        sb4.append(f13);
        sb4.append(", barColor=");
        sb4.append(enumC39333f);
        sb4.append(", labelColor=");
        sb4.append(enumC39333f2);
        sb4.append(", labelText=");
        sb4.append(textResource);
        sb4.append(", labelSuffix=");
        AbstractC30007c.m91855y(sb4, textResource2, ", labelSubtext=", textResource3, ", barBrush=");
        sb4.append(abstractC17911t);
        sb4.append(")");
        return sb4.toString();
    }
}
