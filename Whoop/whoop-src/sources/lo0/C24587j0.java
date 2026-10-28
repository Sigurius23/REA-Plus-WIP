package lo0;

import com.whoop.design.models.items.form.FormTextFieldKeyboardType;
import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import ny0.C27256h;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: lo0.j0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b&\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010\u0015R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001d\u001a\u0004\b)\u0010\u0015R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u001d\u001a\u0004\b\u001f\u0010\u0015R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b\u001c\u0010-R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b'\u00100R\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b\u0010\u0010-R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b2\u0010,\u001a\u0004\b*\u0010-¨\u00063"}, m65681d2 = {"Llo0/j0;", "", "", "id", "Lcom/whoop/design/util/TextResource;", "label", "Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;", "keyboardType", "hintText", "text", "validRegex", "errorMessage", "", "disabled", "Llo0/i0;", "selectionSheet", "isRequired", "isError", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLlo0/i0;ZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "c", "Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;", "()Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;", "getHintText", "e", "f", "getValidRegex", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Z", "()Z", "i", "Llo0/i0;", "()Llo0/i0;", "j", "k", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C24587j0 {

    /* JADX INFO: renamed from: l */
    public static final int f96067l = C27256h.f109055z | TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource label;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final FormTextFieldKeyboardType keyboardType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String hintText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String text;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String validRegex;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String errorMessage;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean disabled;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C24585i0 selectionSheet;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final boolean isRequired;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final boolean isError;

    public C24587j0(String id4, TextResource label, FormTextFieldKeyboardType formTextFieldKeyboardType, String str, String str2, String str3, String str4, boolean z4, C24585i0 c24585i0, boolean z13, boolean z14) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(label, "label");
        this.id = id4;
        this.label = label;
        this.keyboardType = formTextFieldKeyboardType;
        this.hintText = str;
        this.text = str2;
        this.validRegex = str3;
        this.errorMessage = str4;
        this.disabled = z4;
        this.selectionSheet = c24585i0;
        this.isRequired = z13;
        this.isError = z14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getDisabled() {
        return this.disabled;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final FormTextFieldKeyboardType getKeyboardType() {
        return this.keyboardType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C24585i0 getSelectionSheet() {
        return this.selectionSheet;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24587j0)) {
            return false;
        }
        C24587j0 c24587j0 = (C24587j0) other;
        return AbstractC22676k.m65745e(this.id, c24587j0.id) && AbstractC22676k.m65745e(this.label, c24587j0.label) && this.keyboardType == c24587j0.keyboardType && AbstractC22676k.m65745e(this.hintText, c24587j0.hintText) && AbstractC22676k.m65745e(this.text, c24587j0.text) && AbstractC22676k.m65745e(this.validRegex, c24587j0.validRegex) && AbstractC22676k.m65745e(this.errorMessage, c24587j0.errorMessage) && this.disabled == c24587j0.disabled && AbstractC22676k.m65745e(this.selectionSheet, c24587j0.selectionSheet) && this.isRequired == c24587j0.isRequired && this.isError == c24587j0.isError;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(this.id.hashCode() * 31, this.label, 31);
        FormTextFieldKeyboardType formTextFieldKeyboardType = this.keyboardType;
        int iHashCode = (iM95625a + (formTextFieldKeyboardType == null ? 0 : formTextFieldKeyboardType.hashCode())) * 31;
        String str = this.hintText;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.text;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.validRegex;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.errorMessage;
        int iM8289b = AbstractC2875y.m8289b((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.disabled);
        C24585i0 c24585i0 = this.selectionSheet;
        return Boolean.hashCode(this.isError) + AbstractC2875y.m8289b((iM8289b + (c24585i0 != null ? c24585i0.hashCode() : 0)) * 31, 31, this.isRequired);
    }

    public String toString() {
        String str = this.id;
        TextResource textResource = this.label;
        FormTextFieldKeyboardType formTextFieldKeyboardType = this.keyboardType;
        String str2 = this.hintText;
        String str3 = this.text;
        String str4 = this.validRegex;
        String str5 = this.errorMessage;
        boolean z4 = this.disabled;
        C24585i0 c24585i0 = this.selectionSheet;
        boolean z13 = this.isRequired;
        boolean z14 = this.isError;
        StringBuilder sbM91847q = AbstractC30007c.m91847q("FormTextFieldViewState(id=", str, ", label=", textResource, ", keyboardType=");
        sbM91847q.append(formTextFieldKeyboardType);
        sbM91847q.append(", hintText=");
        sbM91847q.append(str2);
        sbM91847q.append(", text=");
        AbstractC11266d.m30444B(sbM91847q, str3, ", validRegex=", str4, ", errorMessage=");
        AbstractC38963t7.m124390t(sbM91847q, str5, ", disabled=", z4, ", selectionSheet=");
        sbM91847q.append(c24585i0);
        sbM91847q.append(", isRequired=");
        sbM91847q.append(z13);
        sbM91847q.append(", isError=");
        return AbstractC18489d0.m53372m(sbM91847q, z14, ")");
    }
}
