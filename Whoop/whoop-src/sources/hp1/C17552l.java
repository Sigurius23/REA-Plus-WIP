package hp1;

import com.whoop.design.util.TextResource;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: hp1.l */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u0016\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u001b\u0010\u001f¨\u0006 "}, m65681d2 = {"Lhp1/l;", "", "Lcom/whoop/design/util/TextResource;", "title", "firstTextFieldUnits", "secondTextFieldUnits", "errorMessage", "", "minValueG", "maxValueG", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;FF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "f", "()Lcom/whoop/design/util/TextResource;", "b", "c", "e", "d", "F", "()F", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17552l {

    /* JADX INFO: renamed from: g */
    public static final int f67949g = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource firstTextFieldUnits;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource secondTextFieldUnits;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource errorMessage;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float minValueG;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final float maxValueG;

    public C17552l(TextResource title, TextResource firstTextFieldUnits, TextResource textResource, TextResource errorMessage, float f13, float f14) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(firstTextFieldUnits, "firstTextFieldUnits");
        AbstractC22676k.m65750j(errorMessage, "errorMessage");
        this.title = title;
        this.firstTextFieldUnits = firstTextFieldUnits;
        this.secondTextFieldUnits = textResource;
        this.errorMessage = errorMessage;
        this.minValueG = f13;
        this.maxValueG = f14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getFirstTextFieldUnits() {
        return this.firstTextFieldUnits;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getMaxValueG() {
        return this.maxValueG;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getMinValueG() {
        return this.minValueG;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getSecondTextFieldUnits() {
        return this.secondTextFieldUnits;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17552l)) {
            return false;
        }
        C17552l c17552l = (C17552l) other;
        return AbstractC22676k.m65745e(this.title, c17552l.title) && AbstractC22676k.m65745e(this.firstTextFieldUnits, c17552l.firstTextFieldUnits) && AbstractC22676k.m65745e(this.secondTextFieldUnits, c17552l.secondTextFieldUnits) && AbstractC22676k.m65745e(this.errorMessage, c17552l.errorMessage) && Float.compare(this.minValueG, c17552l.minValueG) == 0 && Float.compare(this.maxValueG, c17552l.maxValueG) == 0;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(this.title.hashCode() * 31, this.firstTextFieldUnits, 31);
        TextResource textResource = this.secondTextFieldUnits;
        return Float.hashCode(this.maxValueG) + AbstractC11266d.m30447a(this.minValueG, AbstractC31061c.m95625a((iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31, this.errorMessage, 31), 31);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.firstTextFieldUnits;
        TextResource textResource3 = this.secondTextFieldUnits;
        TextResource textResource4 = this.errorMessage;
        float f13 = this.minValueG;
        float f14 = this.maxValueG;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("TextInputFieldState(title=", textResource, ", firstTextFieldUnits=", textResource2, ", secondTextFieldUnits=");
        AbstractC30007c.m91855y(sbM106658q, textResource3, ", errorMessage=", textResource4, ", minValueG=");
        sbM106658q.append(f13);
        sbM106658q.append(", maxValueG=");
        sbM106658q.append(f14);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
