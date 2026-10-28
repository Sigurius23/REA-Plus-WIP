package hy0;

import b91.AbstractC2890e;
import b91.C2886a;
import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jh3.AbstractC21702c;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: hy0.n1 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b\u001d\u0010\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010&\u001a\u0004\b'\u0010\u0018R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b'\u0010&\u001a\u0004\b(\u0010\u0018R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b,\u0010+R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b \u00101R\u0017\u0010\u0011\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b!\u0010)\u001a\u0004\b.\u0010+R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\u001e\u001a\u0004\b/\u0010\u0016¨\u00062"}, m65681d2 = {"Lhy0/n1;", "Lm91/u;", "", "label", "text", "Lcom/whoop/design/util/TextResource;", "hintText", "errorMessage", "", "maxCharacterCount", "maxLines", "", "isError", "isEnabled", "readOnly", "Lb91/a;", "errorTextStyle", "refreshText", "stateUpdateTextKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;IIZZZLb91/a;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "k", "c", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "d", "I", "f", "g", "Z", "m", "()Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "l", "i", "j", "Lb91/a;", "()Lb91/a;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17772n1 implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String label;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String text;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource hintText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String errorMessage;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int maxCharacterCount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int maxLines;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean isError;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean isEnabled;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean readOnly;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C2886a errorTextStyle;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final boolean refreshText;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final String stateUpdateTextKey;

    public C17772n1(String label, String text, TextResource hintText, String errorMessage, int i13, int i14, boolean z4, boolean z13, boolean z14, C2886a errorTextStyle, boolean z15, String str) {
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(hintText, "hintText");
        AbstractC22676k.m65750j(errorMessage, "errorMessage");
        AbstractC22676k.m65750j(errorTextStyle, "errorTextStyle");
        this.label = label;
        this.text = text;
        this.hintText = hintText;
        this.errorMessage = errorMessage;
        this.maxCharacterCount = i13;
        this.maxLines = i14;
        this.isError = z4;
        this.isEnabled = z13;
        this.readOnly = z14;
        this.errorTextStyle = errorTextStyle;
        this.refreshText = z15;
        this.stateUpdateTextKey = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C2886a getErrorTextStyle() {
        return this.errorTextStyle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getHintText() {
        return this.hintText;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17772n1)) {
            return false;
        }
        C17772n1 c17772n1 = (C17772n1) other;
        return AbstractC22676k.m65745e(this.label, c17772n1.label) && AbstractC22676k.m65745e(this.text, c17772n1.text) && AbstractC22676k.m65745e(this.hintText, c17772n1.hintText) && AbstractC22676k.m65745e(this.errorMessage, c17772n1.errorMessage) && this.maxCharacterCount == c17772n1.maxCharacterCount && this.maxLines == c17772n1.maxLines && this.isError == c17772n1.isError && this.isEnabled == c17772n1.isEnabled && this.readOnly == c17772n1.readOnly && AbstractC22676k.m65745e(this.errorTextStyle, c17772n1.errorTextStyle) && this.refreshText == c17772n1.refreshText && AbstractC22676k.m65745e(this.stateUpdateTextKey, c17772n1.stateUpdateTextKey);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getMaxCharacterCount() {
        return this.maxCharacterCount;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getMaxLines() {
        return this.maxLines;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getReadOnly() {
        return this.readOnly;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC11895b.m31984c(this.errorTextStyle, AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.maxLines, AbstractC11266d.m30448b(this.maxCharacterCount, AbstractC11266d.m30450d(AbstractC31061c.m95625a(AbstractC11266d.m30450d(this.label.hashCode() * 31, 31, this.text), this.hintText, 31), 31, this.errorMessage), 31), 31), 31, this.isError), 31, this.isEnabled), 31, this.readOnly), 31), 31, this.refreshText);
        String str = this.stateUpdateTextKey;
        return iM8289b + (str == null ? 0 : str.hashCode());
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getRefreshText() {
        return this.refreshText;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getStateUpdateTextKey() {
        return this.stateUpdateTextKey;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    public String toString() {
        String str = this.label;
        String str2 = this.text;
        TextResource textResource = this.hintText;
        String str3 = this.errorMessage;
        int i13 = this.maxCharacterCount;
        int i14 = this.maxLines;
        boolean z4 = this.isError;
        boolean z13 = this.isEnabled;
        boolean z14 = this.readOnly;
        C2886a c2886a = this.errorTextStyle;
        boolean z15 = this.refreshText;
        String str4 = this.stateUpdateTextKey;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("TextAreaViewState(label=", str, ", text=", str2, ", hintText=");
        AbstractC30007c.m91856z(sbM32001t, textResource, ", errorMessage=", str3, ", maxCharacterCount=");
        AbstractC30802r.m94773v(sbM32001t, i13, ", maxLines=", i14, ", isError=");
        AbstractC38963t7.m124392v(sbM32001t, z4, ", isEnabled=", z13, ", readOnly=");
        sbM32001t.append(z14);
        sbM32001t.append(", errorTextStyle=");
        sbM32001t.append(c2886a);
        sbM32001t.append(", refreshText=");
        return AbstractC21702c.m61139j(sbM32001t, z15, ", stateUpdateTextKey=", str4, ")");
    }

    public /* synthetic */ C17772n1(String str, String str2, TextResource textResource, String str3, int i13, int i14, boolean z4, boolean z13, boolean z14, C2886a c2886a, boolean z15, String str4, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, textResource, str3, (i15 & 16) != 0 ? 100 : i13, (i15 & 32) != 0 ? 2 : i14, (i15 & 64) != 0 ? false : z4, (i15 & 128) != 0 ? true : z13, (i15 & 256) != 0 ? false : z14, (i15 & 512) != 0 ? AbstractC2890e.m8450e().getFormLabel() : c2886a, (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? false : z15, (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : str4);
    }
}
