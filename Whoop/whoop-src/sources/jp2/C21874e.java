package jp2;

import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jh3.AbstractC21702c;
import np2.C27036c;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: jp2.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010Jn\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b\"\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010!R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b%\u0010!R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b'\u0010)\u001a\u0004\b\r\u0010*R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u001c\u001a\u0004\b+\u0010\u0014¨\u0006,"}, m65681d2 = {"Ljp2/e;", "Lm91/u;", "", "fieldId", "Lcom/whoop/design/util/TextResource;", "displayLabel", "selectedDisplayText", "placeholder", "", "Lnp2/c$e;", "options", "errorMessage", "", "isRequired", "pattern", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;)V", "a", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;)Ljp2/e;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "f", "b", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "j", "d", "i", "e", "Ljava/util/List;", "g", "()Ljava/util/List;", "Z", "()Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21874e implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String fieldId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource displayLabel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource selectedDisplayText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource placeholder;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<C27036c.e> options;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextResource errorMessage;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean isRequired;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String pattern;

    public C21874e(String fieldId, TextResource displayLabel, TextResource textResource, TextResource textResource2, List<C27036c.e> options, TextResource textResource3, boolean z4, String str) {
        AbstractC22676k.m65750j(fieldId, "fieldId");
        AbstractC22676k.m65750j(displayLabel, "displayLabel");
        AbstractC22676k.m65750j(options, "options");
        this.fieldId = fieldId;
        this.displayLabel = displayLabel;
        this.selectedDisplayText = textResource;
        this.placeholder = textResource2;
        this.options = options;
        this.errorMessage = textResource3;
        this.isRequired = z4;
        this.pattern = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C21874e m62026b(C21874e c21874e, String str, TextResource textResource, TextResource textResource2, TextResource textResource3, List list, TextResource textResource4, boolean z4, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c21874e.fieldId;
        }
        if ((i13 & 2) != 0) {
            textResource = c21874e.displayLabel;
        }
        if ((i13 & 4) != 0) {
            textResource2 = c21874e.selectedDisplayText;
        }
        if ((i13 & 8) != 0) {
            textResource3 = c21874e.placeholder;
        }
        if ((i13 & 16) != 0) {
            list = c21874e.options;
        }
        if ((i13 & 32) != 0) {
            textResource4 = c21874e.errorMessage;
        }
        if ((i13 & 64) != 0) {
            z4 = c21874e.isRequired;
        }
        if ((i13 & 128) != 0) {
            str2 = c21874e.pattern;
        }
        boolean z13 = z4;
        String str3 = str2;
        List list2 = list;
        TextResource textResource5 = textResource4;
        return c21874e.m62027a(str, textResource, textResource2, textResource3, list2, textResource5, z13, str3);
    }

    /* JADX INFO: renamed from: a */
    public final C21874e m62027a(String fieldId, TextResource displayLabel, TextResource selectedDisplayText, TextResource placeholder, List<C27036c.e> options, TextResource errorMessage, boolean isRequired, String pattern) {
        AbstractC22676k.m65750j(fieldId, "fieldId");
        AbstractC22676k.m65750j(displayLabel, "displayLabel");
        AbstractC22676k.m65750j(options, "options");
        return new C21874e(fieldId, displayLabel, selectedDisplayText, placeholder, options, errorMessage, isRequired, pattern);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getDisplayLabel() {
        return this.displayLabel;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getErrorMessage() {
        return this.errorMessage;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21874e)) {
            return false;
        }
        C21874e c21874e = (C21874e) other;
        return AbstractC22676k.m65745e(this.fieldId, c21874e.fieldId) && AbstractC22676k.m65745e(this.displayLabel, c21874e.displayLabel) && AbstractC22676k.m65745e(this.selectedDisplayText, c21874e.selectedDisplayText) && AbstractC22676k.m65745e(this.placeholder, c21874e.placeholder) && AbstractC22676k.m65745e(this.options, c21874e.options) && AbstractC22676k.m65745e(this.errorMessage, c21874e.errorMessage) && this.isRequired == c21874e.isRequired && AbstractC22676k.m65745e(this.pattern, c21874e.pattern);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getFieldId() {
        return this.fieldId;
    }

    /* JADX INFO: renamed from: g */
    public final List<C27036c.e> m62031g() {
        return this.options;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getPattern() {
        return this.pattern;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(this.fieldId.hashCode() * 31, this.displayLabel, 31);
        TextResource textResource = this.selectedDisplayText;
        int iHashCode = (iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31;
        TextResource textResource2 = this.placeholder;
        int iM31983b = AbstractC11895b.m31983b((iHashCode + (textResource2 == null ? 0 : textResource2.hashCode())) * 31, 31, this.options);
        TextResource textResource3 = this.errorMessage;
        int iM8289b = AbstractC2875y.m8289b((iM31983b + (textResource3 == null ? 0 : textResource3.hashCode())) * 31, 31, this.isRequired);
        String str = this.pattern;
        return iM8289b + (str != null ? str.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextResource getPlaceholder() {
        return this.placeholder;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final TextResource getSelectedDisplayText() {
        return this.selectedDisplayText;
    }

    public String toString() {
        String str = this.fieldId;
        TextResource textResource = this.displayLabel;
        TextResource textResource2 = this.selectedDisplayText;
        TextResource textResource3 = this.placeholder;
        List<C27036c.e> list = this.options;
        TextResource textResource4 = this.errorMessage;
        boolean z4 = this.isRequired;
        String str2 = this.pattern;
        StringBuilder sbM91847q = AbstractC30007c.m91847q("ShippingAddressDropdownViewState(fieldId=", str, ", displayLabel=", textResource, ", selectedDisplayText=");
        AbstractC30007c.m91855y(sbM91847q, textResource2, ", placeholder=", textResource3, ", options=");
        AbstractC30007c.m91852v(textResource4, ", errorMessage=", ", isRequired=", sbM91847q, list);
        return AbstractC21702c.m61139j(sbM91847q, z4, ", pattern=", str2, ")");
    }
}
