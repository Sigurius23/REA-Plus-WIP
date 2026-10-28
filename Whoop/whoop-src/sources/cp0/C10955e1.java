package cp0;

import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: cp0.e1 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001d"}, m65681d2 = {"Lcp0/e1;", "", "", "sheetHeight", "heroWidth", "heroX", "heroY", "contentOpacity", "heroGradientAlpha", "<init>", "(FFFFFF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "f", "()F", "b", "c", "d", "e", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C10955e1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float sheetHeight;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float heroWidth;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float heroX;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float heroY;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float contentOpacity;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final float heroGradientAlpha;

    public C10955e1(float f13, float f14, float f15, float f16, float f17, float f18) {
        this.sheetHeight = f13;
        this.heroWidth = f14;
        this.heroX = f15;
        this.heroY = f16;
        this.contentOpacity = f17;
        this.heroGradientAlpha = f18;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getContentOpacity() {
        return this.contentOpacity;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getHeroGradientAlpha() {
        return this.heroGradientAlpha;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getHeroWidth() {
        return this.heroWidth;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getHeroX() {
        return this.heroX;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getHeroY() {
        return this.heroY;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C10955e1)) {
            return false;
        }
        C10955e1 c10955e1 = (C10955e1) other;
        return Float.compare(this.sheetHeight, c10955e1.sheetHeight) == 0 && Float.compare(this.heroWidth, c10955e1.heroWidth) == 0 && Float.compare(this.heroX, c10955e1.heroX) == 0 && Float.compare(this.heroY, c10955e1.heroY) == 0 && Float.compare(this.contentOpacity, c10955e1.contentOpacity) == 0 && Float.compare(this.heroGradientAlpha, c10955e1.heroGradientAlpha) == 0;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getSheetHeight() {
        return this.sheetHeight;
    }

    public int hashCode() {
        return Float.hashCode(this.heroGradientAlpha) + AbstractC11266d.m30447a(this.contentOpacity, AbstractC11266d.m30447a(this.heroY, AbstractC11266d.m30447a(this.heroX, AbstractC11266d.m30447a(this.heroWidth, Float.hashCode(this.sheetHeight) * 31, 31), 31), 31), 31);
    }

    public String toString() {
        float f13 = this.sheetHeight;
        float f14 = this.heroWidth;
        float f15 = this.heroX;
        float f16 = this.heroY;
        float f17 = this.contentOpacity;
        float f18 = this.heroGradientAlpha;
        StringBuilder sbM8307t = AbstractC2875y.m8307t("HeroAnimationLayout(sheetHeight=", f13, ", heroWidth=", f14, ", heroX=");
        AbstractC30802r.m94772u(sbM8307t, f15, ", heroY=", f16, ", contentOpacity=");
        sbM8307t.append(f17);
        sbM8307t.append(", heroGradientAlpha=");
        sbM8307t.append(f18);
        sbM8307t.append(")");
        return sbM8307t.toString();
    }
}
