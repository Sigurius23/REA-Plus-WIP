package gv2;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import cu2.AbstractC11128h;
import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: gv2.f */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b\u001d\u0010\u0018R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\u0012R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\u001f\u0010\u0012¨\u0006\""}, m65681d2 = {"Lgv2/f;", "", "Lcom/whoop/design/util/TextResource;", "description", "", "showError", "label", "errorMessage", "hintText", "", "maxLines", "maxCharacterCount", "<init>", "(Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "b", "Z", "g", "()Z", "c", "d", "e", "f", "I", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C16248f {

    /* JADX INFO: renamed from: h */
    public static final int f61760h = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource description;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean showError;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource label;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource errorMessage;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource hintText;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int maxLines;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int maxCharacterCount;

    public C16248f(TextResource description, boolean z4, TextResource label, TextResource errorMessage, TextResource hintText, int i13, int i14) {
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(errorMessage, "errorMessage");
        AbstractC22676k.m65750j(hintText, "hintText");
        this.description = description;
        this.showError = z4;
        this.label = label;
        this.errorMessage = errorMessage;
        this.hintText = hintText;
        this.maxLines = i13;
        this.maxCharacterCount = i14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getHintText() {
        return this.hintText;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getMaxCharacterCount() {
        return this.maxCharacterCount;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C16248f)) {
            return false;
        }
        C16248f c16248f = (C16248f) other;
        return AbstractC22676k.m65745e(this.description, c16248f.description) && this.showError == c16248f.showError && AbstractC22676k.m65745e(this.label, c16248f.label) && AbstractC22676k.m65745e(this.errorMessage, c16248f.errorMessage) && AbstractC22676k.m65745e(this.hintText, c16248f.hintText) && this.maxLines == c16248f.maxLines && this.maxCharacterCount == c16248f.maxCharacterCount;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getMaxLines() {
        return this.maxLines;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getShowError() {
        return this.showError;
    }

    public int hashCode() {
        return Integer.hashCode(this.maxCharacterCount) + AbstractC11266d.m30448b(this.maxLines, AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC2875y.m8289b(this.description.hashCode() * 31, 31, this.showError), this.label, 31), this.errorMessage, 31), this.hintText, 31), 31);
    }

    public String toString() {
        TextResource textResource = this.description;
        boolean z4 = this.showError;
        TextResource textResource2 = this.label;
        TextResource textResource3 = this.errorMessage;
        TextResource textResource4 = this.hintText;
        int i13 = this.maxLines;
        int i14 = this.maxCharacterCount;
        StringBuilder sbM91846p = AbstractC30007c.m91846p("TextAreaState(description=", textResource, ", showError=", z4, ", label=");
        AbstractC30007c.m91855y(sbM91846p, textResource2, ", errorMessage=", textResource3, ", hintText=");
        sbM91846p.append(textResource4);
        sbM91846p.append(", maxLines=");
        sbM91846p.append(i13);
        sbM91846p.append(", maxCharacterCount=");
        return AbstractC18489d0.m53371l(sbM91846p, i14, ")");
    }

    public /* synthetic */ C16248f(TextResource textResource, boolean z4, TextResource textResource2, TextResource textResource3, TextResource textResource4, int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, z4, (i15 & 4) != 0 ? AbstractC8693b.m21277k(AbstractC11128h.f35517w0) : textResource2, (i15 & 8) != 0 ? AbstractC8693b.m21277k(AbstractC11128h.f35523y0) : textResource3, (i15 & 16) != 0 ? AbstractC8693b.m21277k(AbstractC11128h.f35520x0) : textResource4, (i15 & 32) != 0 ? 8 : i13, (i15 & 64) != 0 ? 5000 : i14);
    }
}
