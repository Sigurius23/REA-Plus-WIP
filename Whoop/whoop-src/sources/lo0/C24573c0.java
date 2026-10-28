package lo0;

import com.whoop.design.util.TextResource;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: lo0.c0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b\u001a\u0010\"R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u0017\u0010%¨\u0006&"}, m65681d2 = {"Llo0/c0;", "", "", "id", "Lcom/whoop/design/util/TextResource;", "label", "displayValue", "errorMessage", "", "isError", "disabled", "Llo0/d0;", "datePicker", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLlo0/d0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "c", "d", "Z", "f", "()Z", "g", "Llo0/d0;", "()Llo0/d0;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C24573c0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource label;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource displayValue;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource errorMessage;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isError;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean disabled;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C24575d0 datePicker;

    public C24573c0(String id4, TextResource label, TextResource displayValue, TextResource errorMessage, boolean z4, boolean z13, C24575d0 c24575d0) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(displayValue, "displayValue");
        AbstractC22676k.m65750j(errorMessage, "errorMessage");
        this.id = id4;
        this.label = label;
        this.displayValue = displayValue;
        this.errorMessage = errorMessage;
        this.isError = z4;
        this.disabled = z13;
        this.datePicker = c24575d0;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C24575d0 getDatePicker() {
        return this.datePicker;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getDisabled() {
        return this.disabled;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getDisplayValue() {
        return this.displayValue;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getLabel() {
        return this.label;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24573c0)) {
            return false;
        }
        C24573c0 c24573c0 = (C24573c0) other;
        return AbstractC22676k.m65745e(this.id, c24573c0.id) && AbstractC22676k.m65745e(this.label, c24573c0.label) && AbstractC22676k.m65745e(this.displayValue, c24573c0.displayValue) && AbstractC22676k.m65745e(this.errorMessage, c24573c0.errorMessage) && this.isError == c24573c0.isError && this.disabled == c24573c0.disabled && AbstractC22676k.m65745e(this.datePicker, c24573c0.datePicker);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.id.hashCode() * 31, this.label, 31), this.displayValue, 31), this.errorMessage, 31), 31, this.isError), 31, this.disabled);
        C24575d0 c24575d0 = this.datePicker;
        return iM8289b + (c24575d0 == null ? 0 : c24575d0.hashCode());
    }

    public String toString() {
        String str = this.id;
        TextResource textResource = this.label;
        TextResource textResource2 = this.displayValue;
        TextResource textResource3 = this.errorMessage;
        boolean z4 = this.isError;
        boolean z13 = this.disabled;
        C24575d0 c24575d0 = this.datePicker;
        StringBuilder sbM91847q = AbstractC30007c.m91847q("DateFormTextFieldViewState(id=", str, ", label=", textResource, ", displayValue=");
        AbstractC30007c.m91855y(sbM91847q, textResource2, ", errorMessage=", textResource3, ", isError=");
        AbstractC38963t7.m124392v(sbM91847q, z4, ", disabled=", z13, ", datePicker=");
        sbM91847q.append(c24575d0);
        sbM91847q.append(")");
        return sbM91847q.toString();
    }
}
