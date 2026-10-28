package np1;

import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: np1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001f\u001a\u0004\b\u0016\u0010 ¨\u0006!"}, m65681d2 = {"Lnp1/a;", "", "Lcom/whoop/design/util/TextResource;", "title", "editTextDisplay", "editDateDisplay", "editNameDisplay", "editWeightDisplay", "deleteDisplay", "", "allowEdit", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "g", "()Lcom/whoop/design/util/TextResource;", "b", "e", "c", "d", "f", "Z", "()Z", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C27023a {

    /* JADX INFO: renamed from: h */
    public static final int f107730h = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource editTextDisplay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource editDateDisplay;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource editNameDisplay;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource editWeightDisplay;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextResource deleteDisplay;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean allowEdit;

    public C27023a(TextResource title, TextResource editTextDisplay, TextResource editDateDisplay, TextResource editNameDisplay, TextResource editWeightDisplay, TextResource deleteDisplay, boolean z4) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(editTextDisplay, "editTextDisplay");
        AbstractC22676k.m65750j(editDateDisplay, "editDateDisplay");
        AbstractC22676k.m65750j(editNameDisplay, "editNameDisplay");
        AbstractC22676k.m65750j(editWeightDisplay, "editWeightDisplay");
        AbstractC22676k.m65750j(deleteDisplay, "deleteDisplay");
        this.title = title;
        this.editTextDisplay = editTextDisplay;
        this.editDateDisplay = editDateDisplay;
        this.editNameDisplay = editNameDisplay;
        this.editWeightDisplay = editWeightDisplay;
        this.deleteDisplay = deleteDisplay;
        this.allowEdit = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getAllowEdit() {
        return this.allowEdit;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getDeleteDisplay() {
        return this.deleteDisplay;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getEditDateDisplay() {
        return this.editDateDisplay;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getEditNameDisplay() {
        return this.editNameDisplay;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getEditTextDisplay() {
        return this.editTextDisplay;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C27023a)) {
            return false;
        }
        C27023a c27023a = (C27023a) other;
        return AbstractC22676k.m65745e(this.title, c27023a.title) && AbstractC22676k.m65745e(this.editTextDisplay, c27023a.editTextDisplay) && AbstractC22676k.m65745e(this.editDateDisplay, c27023a.editDateDisplay) && AbstractC22676k.m65745e(this.editNameDisplay, c27023a.editNameDisplay) && AbstractC22676k.m65745e(this.editWeightDisplay, c27023a.editWeightDisplay) && AbstractC22676k.m65745e(this.deleteDisplay, c27023a.deleteDisplay) && this.allowEdit == c27023a.allowEdit;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getEditWeightDisplay() {
        return this.editWeightDisplay;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        return Boolean.hashCode(this.allowEdit) + AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.title.hashCode() * 31, this.editTextDisplay, 31), this.editDateDisplay, 31), this.editNameDisplay, 31), this.editWeightDisplay, 31), this.deleteDisplay, 31);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.editTextDisplay;
        TextResource textResource3 = this.editDateDisplay;
        TextResource textResource4 = this.editNameDisplay;
        TextResource textResource5 = this.editWeightDisplay;
        TextResource textResource6 = this.deleteDisplay;
        boolean z4 = this.allowEdit;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("BottomSheetState(title=", textResource, ", editTextDisplay=", textResource2, ", editDateDisplay=");
        AbstractC30007c.m91855y(sbM106658q, textResource3, ", editNameDisplay=", textResource4, ", editWeightDisplay=");
        AbstractC30007c.m91855y(sbM106658q, textResource5, ", deleteDisplay=", textResource6, ", allowEdit=");
        return AbstractC18489d0.m53372m(sbM106658q, z4, ")");
    }
}
