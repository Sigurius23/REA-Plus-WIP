package gv2;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import cu2.AbstractC11128h;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: gv2.g */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b\u001c\u0010\u0018¨\u0006!"}, m65681d2 = {"Lgv2/g;", "", "Lcom/whoop/design/util/TextResource;", "exerciseName", "", "showError", "", "maxCharacterCount", "errorMessage", "label", "hintText", "<init>", "(Lcom/whoop/design/util/TextResource;ZILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "b", "()Lcom/whoop/design/util/TextResource;", "Z", "e", "()Z", "c", "I", "getMaxCharacterCount", "d", "f", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C16249g {

    /* JADX INFO: renamed from: g */
    public static final int f61768g = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource exerciseName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean showError;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int maxCharacterCount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource errorMessage;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource label;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextResource hintText;

    public C16249g(TextResource exerciseName, boolean z4, int i13, TextResource errorMessage, TextResource label, TextResource hintText) {
        AbstractC22676k.m65750j(exerciseName, "exerciseName");
        AbstractC22676k.m65750j(errorMessage, "errorMessage");
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(hintText, "hintText");
        this.exerciseName = exerciseName;
        this.showError = z4;
        this.maxCharacterCount = i13;
        this.errorMessage = errorMessage;
        this.label = label;
        this.hintText = hintText;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getExerciseName() {
        return this.exerciseName;
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
    public final boolean getShowError() {
        return this.showError;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C16249g)) {
            return false;
        }
        C16249g c16249g = (C16249g) other;
        return AbstractC22676k.m65745e(this.exerciseName, c16249g.exerciseName) && this.showError == c16249g.showError && this.maxCharacterCount == c16249g.maxCharacterCount && AbstractC22676k.m65745e(this.errorMessage, c16249g.errorMessage) && AbstractC22676k.m65745e(this.label, c16249g.label) && AbstractC22676k.m65745e(this.hintText, c16249g.hintText);
    }

    public int hashCode() {
        return this.hintText.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC11266d.m30448b(this.maxCharacterCount, AbstractC2875y.m8289b(this.exerciseName.hashCode() * 31, 31, this.showError), 31), this.errorMessage, 31), this.label, 31);
    }

    public String toString() {
        TextResource textResource = this.exerciseName;
        boolean z4 = this.showError;
        int i13 = this.maxCharacterCount;
        TextResource textResource2 = this.errorMessage;
        TextResource textResource3 = this.label;
        TextResource textResource4 = this.hintText;
        StringBuilder sbM91846p = AbstractC30007c.m91846p("TextFieldState(exerciseName=", textResource, ", showError=", z4, ", maxCharacterCount=");
        sbM91846p.append(i13);
        sbM91846p.append(", errorMessage=");
        sbM91846p.append(textResource2);
        sbM91846p.append(", label=");
        return AbstractC33745d.m106655n(sbM91846p, textResource3, ", hintText=", textResource4, ")");
    }

    public /* synthetic */ C16249g(TextResource textResource, boolean z4, int i13, TextResource textResource2, TextResource textResource3, TextResource textResource4, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, z4, (i14 & 4) != 0 ? 55 : i13, (i14 & 8) != 0 ? AbstractC8693b.m21277k(AbstractC11128h.f35410N0) : textResource2, (i14 & 16) != 0 ? AbstractC8693b.m21277k(AbstractC11128h.f35407M0) : textResource3, (i14 & 32) != 0 ? AbstractC8693b.m21277k(AbstractC11128h.f35490n0) : textResource4);
    }
}
