package t11;

import b91.AbstractC2890e;
import b91.C2886a;
import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jh3.AbstractC21702c;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: t11.h */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017J¢\u0001\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u000e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\"\u001a\u0004\b#\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010'R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b,\u0010'R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u001dR\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b0\u0010.\u001a\u0004\b1\u0010\u001dR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b+\u00102\u001a\u0004\b0\u00103R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b&\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b/\u00104\u001a\u0004\b7\u00106R\u0017\u0010\u0011\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b1\u00104\u001a\u0004\b8\u00106R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b-\u0010:R\u0017\u0010\u0014\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b;\u00104\u001a\u0004\b;\u00106R\u0017\u0010\u0015\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b)\u00102\u001a\u0004\b(\u00103¨\u0006<"}, m65681d2 = {"Lt11/h;", "Lm91/u;", "", "id", "Lcom/whoop/design/util/TextResource;", "label", "text", "hintText", "errorMessage", "", "maxCharacterCount", "maxLines", "Ly3/f;", "height", "", "isError", "isEnabled", "readOnly", "Lb91/a;", "errorTextStyle", "refreshText", "cornerRadius", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIFZZZLb91/a;ZFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIFZZZLb91/a;ZF)Lt11/h;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "b", "Lcom/whoop/design/util/TextResource;", "i", "()Lcom/whoop/design/util/TextResource;", "c", "n", "d", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "e", "f", "I", "j", "g", "k", "F", "()F", "Z", "p", "()Z", "o", "l", "Lb91/a;", "()Lb91/a;", "m", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33308h implements InterfaceC25312u {

    /* JADX INFO: renamed from: o */
    public static final int f138901o = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource label;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource text;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource hintText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource errorMessage;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int maxCharacterCount;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int maxLines;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final float height;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean isError;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final boolean isEnabled;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final boolean readOnly;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final C2886a errorTextStyle;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final boolean refreshText;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final float cornerRadius;

    public /* synthetic */ C33308h(String str, TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, int i13, int i14, float f13, boolean z4, boolean z13, boolean z14, C2886a c2886a, boolean z15, float f14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textResource, textResource2, textResource3, textResource4, i13, i14, f13, z4, z13, z14, c2886a, z15, f14);
    }

    /* JADX INFO: renamed from: a */
    public final C33308h m105666a(String id4, TextResource label, TextResource text, TextResource hintText, TextResource errorMessage, int maxCharacterCount, int maxLines, float height, boolean isError, boolean isEnabled, boolean readOnly, C2886a errorTextStyle, boolean refreshText, float cornerRadius) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(hintText, "hintText");
        AbstractC22676k.m65750j(errorTextStyle, "errorTextStyle");
        return new C33308h(id4, label, text, hintText, errorMessage, maxCharacterCount, maxLines, height, isError, isEnabled, readOnly, errorTextStyle, refreshText, cornerRadius, null);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getErrorMessage() {
        return this.errorMessage;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33308h)) {
            return false;
        }
        C33308h c33308h = (C33308h) other;
        return AbstractC22676k.m65745e(this.id, c33308h.id) && AbstractC22676k.m65745e(this.label, c33308h.label) && AbstractC22676k.m65745e(this.text, c33308h.text) && AbstractC22676k.m65745e(this.hintText, c33308h.hintText) && AbstractC22676k.m65745e(this.errorMessage, c33308h.errorMessage) && this.maxCharacterCount == c33308h.maxCharacterCount && this.maxLines == c33308h.maxLines && C39174f.m124782b(this.height, c33308h.height) && this.isError == c33308h.isError && this.isEnabled == c33308h.isEnabled && this.readOnly == c33308h.readOnly && AbstractC22676k.m65745e(this.errorTextStyle, c33308h.errorTextStyle) && this.refreshText == c33308h.refreshText && C39174f.m124782b(this.cornerRadius, c33308h.cornerRadius);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C2886a getErrorTextStyle() {
        return this.errorTextStyle;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final float getHeight() {
        return this.height;
    }

    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextResource getHintText() {
        return this.hintText;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        TextResource textResource = this.label;
        int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a((iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31, this.text, 31), this.hintText, 31);
        TextResource textResource2 = this.errorMessage;
        return Float.hashCode(this.cornerRadius) + AbstractC2875y.m8289b(AbstractC11895b.m31984c(this.errorTextStyle, AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30447a(this.height, AbstractC11266d.m30448b(this.maxLines, AbstractC11266d.m30448b(this.maxCharacterCount, (iM95625a + (textResource2 != null ? textResource2.hashCode() : 0)) * 31, 31), 31), 31), 31, this.isError), 31, this.isEnabled), 31, this.readOnly), 31), 31, this.refreshText);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextResource getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getMaxCharacterCount() {
        return this.maxCharacterCount;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getMaxLines() {
        return this.maxLines;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getReadOnly() {
        return this.readOnly;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getRefreshText() {
        return this.refreshText;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final TextResource getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    public String toString() {
        String str = this.id;
        TextResource textResource = this.label;
        TextResource textResource2 = this.text;
        TextResource textResource3 = this.hintText;
        TextResource textResource4 = this.errorMessage;
        int i13 = this.maxCharacterCount;
        int i14 = this.maxLines;
        String strM124783c = C39174f.m124783c(this.height);
        boolean z4 = this.isError;
        boolean z13 = this.isEnabled;
        boolean z14 = this.readOnly;
        C2886a c2886a = this.errorTextStyle;
        boolean z15 = this.refreshText;
        String strM124783c2 = C39174f.m124783c(this.cornerRadius);
        StringBuilder sbM91847q = AbstractC30007c.m91847q("TextAreaState(id=", str, ", label=", textResource, ", text=");
        AbstractC30007c.m91855y(sbM91847q, textResource2, ", hintText=", textResource3, ", errorMessage=");
        sbM91847q.append(textResource4);
        sbM91847q.append(", maxCharacterCount=");
        sbM91847q.append(i13);
        sbM91847q.append(", maxLines=");
        AbstractC11895b.m31979B(i14, ", height=", strM124783c, ", isError=", sbM91847q);
        AbstractC38963t7.m124392v(sbM91847q, z4, ", isEnabled=", z13, ", readOnly=");
        sbM91847q.append(z14);
        sbM91847q.append(", errorTextStyle=");
        sbM91847q.append(c2886a);
        sbM91847q.append(", refreshText=");
        return AbstractC21702c.m61139j(sbM91847q, z15, ", cornerRadius=", strM124783c2, ")");
    }

    private C33308h(String str, TextResource textResource, TextResource text, TextResource hintText, TextResource textResource2, int i13, int i14, float f13, boolean z4, boolean z13, boolean z14, C2886a errorTextStyle, boolean z15, float f14) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(hintText, "hintText");
        AbstractC22676k.m65750j(errorTextStyle, "errorTextStyle");
        this.id = str;
        this.label = textResource;
        this.text = text;
        this.hintText = hintText;
        this.errorMessage = textResource2;
        this.maxCharacterCount = i13;
        this.maxLines = i14;
        this.height = f13;
        this.isError = z4;
        this.isEnabled = z13;
        this.readOnly = z14;
        this.errorTextStyle = errorTextStyle;
        this.refreshText = z15;
        this.cornerRadius = f14;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C33308h(String str, TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, int i13, int i14, float f13, boolean z4, boolean z13, boolean z14, C2886a c2886a, boolean z15, float f14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        float f15;
        int i16 = (i15 & 32) != 0 ? 500 : i13;
        int i17 = (i15 & 64) != 0 ? 5 : i14;
        float f16 = (i15 & 128) != 0 ? 65 : f13;
        boolean z16 = (i15 & 256) != 0 ? false : z4;
        boolean z17 = (i15 & 512) != 0 ? true : z13;
        boolean z18 = (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? false : z14;
        C2886a formLabel = (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? AbstractC2890e.m8450e().getFormLabel() : c2886a;
        boolean z19 = (i15 & 4096) != 0 ? false : z15;
        if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
            float f17 = 4;
            f15 = f17 * f17;
        } else {
            f15 = f14;
        }
        this(str, textResource, textResource2, textResource3, textResource4, i16, i17, f16, z16, z17, z18, formLabel, z19, f15, null);
    }
}
