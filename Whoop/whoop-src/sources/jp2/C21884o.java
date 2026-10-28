package jp2;

import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p042c2.EnumC3869n;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p412q3.C29880n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: jp2.o */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B©\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\n\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0017\u0010\u0018J¶\u0001\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\r\u001a\u00020\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0012\u001a\u00020\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010#\u001a\u0004\b$\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b.\u0010+R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b*\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b2\u0010)\u001a\u0004\b2\u0010+R\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b$\u0010/\u001a\u0004\b\r\u00101R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b'\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b6\u00103\u001a\u0004\b6\u00105R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b4\u0010#\u001a\u0004\b7\u0010\u001cR\u0017\u0010\u0012\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b7\u0010/\u001a\u0004\b8\u00101R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b.\u00109\u001a\u0004\b(\u0010:R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u0010#\u001a\u0004\b;\u0010\u001cR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b0\u0010#\u001a\u0004\b<\u0010\u001c¨\u0006="}, m65681d2 = {"Ljp2/o;", "Lm91/u;", "", "fieldId", "Lq3/n;", "keyboardType", "Lcom/whoop/design/util/TextResource;", "displayLabel", "currentText", "placeholder", "", "isLastTextField", "errorMessage", "isRequired", "", "minLength", "maxLength", "pattern", "isReadOnly", "Lc2/n;", "autoFillType", "source", "otherDropdownKey", "<init>", "(Ljava/lang/String;ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZLc2/n;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "(Ljava/lang/String;ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZLc2/n;Ljava/lang/String;Ljava/lang/String;)Ljp2/o;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "b", "I", "i", "c", "Lcom/whoop/design/util/TextResource;", "f", "()Lcom/whoop/design/util/TextResource;", "d", "e", "m", "Z", "o", "()Z", "g", "Ljava/lang/Integer;", "k", "()Ljava/lang/Integer;", "j", "l", "p", "Lc2/n;", "()Lc2/n;", "n", "getOtherDropdownKey", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21884o implements InterfaceC25312u {

    /* JADX INFO: renamed from: p */
    public static final int f84508p = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String fieldId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int keyboardType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource displayLabel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource currentText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource placeholder;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean isLastTextField;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final TextResource errorMessage;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean isRequired;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final Integer minLength;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final Integer maxLength;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final String pattern;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final boolean isReadOnly;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final EnumC3869n autoFillType;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final String source;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final String otherDropdownKey;

    public /* synthetic */ C21884o(String str, int i13, TextResource textResource, TextResource textResource2, TextResource textResource3, boolean z4, TextResource textResource4, boolean z13, Integer num, Integer num2, String str2, boolean z14, EnumC3869n enumC3869n, String str3, String str4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, textResource, textResource2, textResource3, z4, textResource4, z13, num, num2, str2, z14, enumC3869n, str3, str4);
    }

    /* JADX INFO: renamed from: a */
    public final C21884o m62090a(String fieldId, int keyboardType, TextResource displayLabel, TextResource currentText, TextResource placeholder, boolean isLastTextField, TextResource errorMessage, boolean isRequired, Integer minLength, Integer maxLength, String pattern, boolean isReadOnly, EnumC3869n autoFillType, String source, String otherDropdownKey) {
        AbstractC22676k.m65750j(fieldId, "fieldId");
        AbstractC22676k.m65750j(displayLabel, "displayLabel");
        AbstractC22676k.m65750j(source, "source");
        return new C21884o(fieldId, keyboardType, displayLabel, currentText, placeholder, isLastTextField, errorMessage, isRequired, minLength, maxLength, pattern, isReadOnly, autoFillType, source, otherDropdownKey, null);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC3869n getAutoFillType() {
        return this.autoFillType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getCurrentText() {
        return this.currentText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21884o)) {
            return false;
        }
        C21884o c21884o = (C21884o) other;
        return AbstractC22676k.m65745e(this.fieldId, c21884o.fieldId) && this.keyboardType == c21884o.keyboardType && AbstractC22676k.m65745e(this.displayLabel, c21884o.displayLabel) && AbstractC22676k.m65745e(this.currentText, c21884o.currentText) && AbstractC22676k.m65745e(this.placeholder, c21884o.placeholder) && this.isLastTextField == c21884o.isLastTextField && AbstractC22676k.m65745e(this.errorMessage, c21884o.errorMessage) && this.isRequired == c21884o.isRequired && AbstractC22676k.m65745e(this.minLength, c21884o.minLength) && AbstractC22676k.m65745e(this.maxLength, c21884o.maxLength) && AbstractC22676k.m65745e(this.pattern, c21884o.pattern) && this.isReadOnly == c21884o.isReadOnly && this.autoFillType == c21884o.autoFillType && AbstractC22676k.m65745e(this.source, c21884o.source) && AbstractC22676k.m65745e(this.otherDropdownKey, c21884o.otherDropdownKey);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getDisplayLabel() {
        return this.displayLabel;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getFieldId() {
        return this.fieldId;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(AbstractC11266d.m30448b(this.keyboardType, this.fieldId.hashCode() * 31, 31), this.displayLabel, 31);
        TextResource textResource = this.currentText;
        int iHashCode = (iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31;
        TextResource textResource2 = this.placeholder;
        int iM8289b = AbstractC2875y.m8289b((iHashCode + (textResource2 == null ? 0 : textResource2.hashCode())) * 31, 31, this.isLastTextField);
        TextResource textResource3 = this.errorMessage;
        int iM8289b2 = AbstractC2875y.m8289b((iM8289b + (textResource3 == null ? 0 : textResource3.hashCode())) * 31, 31, this.isRequired);
        Integer num = this.minLength;
        int iHashCode2 = (iM8289b2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.maxLength;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.pattern;
        int iM8289b3 = AbstractC2875y.m8289b((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31, this.isReadOnly);
        EnumC3869n enumC3869n = this.autoFillType;
        int iM30450d = AbstractC11266d.m30450d((iM8289b3 + (enumC3869n == null ? 0 : enumC3869n.hashCode())) * 31, 31, this.source);
        String str2 = this.otherDropdownKey;
        return iM30450d + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getKeyboardType() {
        return this.keyboardType;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Integer getMaxLength() {
        return this.maxLength;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Integer getMinLength() {
        return this.minLength;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getPattern() {
        return this.pattern;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final TextResource getPlaceholder() {
        return this.placeholder;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getIsLastTextField() {
        return this.isLastTextField;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final boolean getIsReadOnly() {
        return this.isReadOnly;
    }

    public String toString() {
        String str = this.fieldId;
        String strM91503a = C29880n.m91503a(this.keyboardType);
        TextResource textResource = this.displayLabel;
        TextResource textResource2 = this.currentText;
        TextResource textResource3 = this.placeholder;
        boolean z4 = this.isLastTextField;
        TextResource textResource4 = this.errorMessage;
        boolean z13 = this.isRequired;
        Integer num = this.minLength;
        Integer num2 = this.maxLength;
        String str2 = this.pattern;
        boolean z14 = this.isReadOnly;
        EnumC3869n enumC3869n = this.autoFillType;
        String str3 = this.source;
        String str4 = this.otherDropdownKey;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ShippingAddressTextFieldViewState(fieldId=", str, ", keyboardType=", strM91503a, ", displayLabel=");
        AbstractC30007c.m91855y(sbM32001t, textResource, ", currentText=", textResource2, ", placeholder=");
        AbstractC33745d.m106664w(textResource3, ", isLastTextField=", ", errorMessage=", sbM32001t, z4);
        AbstractC33745d.m106664w(textResource4, ", isRequired=", ", minLength=", sbM32001t, z13);
        AbstractC31061c.m95621A(sbM32001t, num, ", maxLength=", num2, ", pattern=");
        AbstractC38963t7.m124390t(sbM32001t, str2, ", isReadOnly=", z14, ", autoFillType=");
        sbM32001t.append(enumC3869n);
        sbM32001t.append(", source=");
        sbM32001t.append(str3);
        sbM32001t.append(", otherDropdownKey=");
        return AbstractC25012a.m73376i(str4, ")", sbM32001t);
    }

    private C21884o(String fieldId, int i13, TextResource displayLabel, TextResource textResource, TextResource textResource2, boolean z4, TextResource textResource3, boolean z13, Integer num, Integer num2, String str, boolean z14, EnumC3869n enumC3869n, String source, String str2) {
        AbstractC22676k.m65750j(fieldId, "fieldId");
        AbstractC22676k.m65750j(displayLabel, "displayLabel");
        AbstractC22676k.m65750j(source, "source");
        this.fieldId = fieldId;
        this.keyboardType = i13;
        this.displayLabel = displayLabel;
        this.currentText = textResource;
        this.placeholder = textResource2;
        this.isLastTextField = z4;
        this.errorMessage = textResource3;
        this.isRequired = z13;
        this.minLength = num;
        this.maxLength = num2;
        this.pattern = str;
        this.isReadOnly = z14;
        this.autoFillType = enumC3869n;
        this.source = source;
        this.otherDropdownKey = str2;
    }

    public /* synthetic */ C21884o(String str, int i13, TextResource textResource, TextResource textResource2, TextResource textResource3, boolean z4, TextResource textResource4, boolean z13, Integer num, Integer num2, String str2, boolean z14, EnumC3869n enumC3869n, String str3, String str4, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i14 & 2) != 0 ? 1 : i13, textResource, (i14 & 8) != 0 ? null : textResource2, (i14 & 16) != 0 ? null : textResource3, (i14 & 32) != 0 ? false : z4, (i14 & 64) != 0 ? null : textResource4, (i14 & 128) != 0 ? false : z13, (i14 & 256) != 0 ? null : num, (i14 & 512) != 0 ? null : num2, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : str2, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? false : z14, (i14 & 4096) != 0 ? null : enumC3869n, (i14 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? "" : str3, (i14 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : str4, null);
    }
}
