package b41;

import com.whoop.navigation.models.GenericInteraction;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p412q3.C29880n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: b41.f */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b%\u0010)R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010!\u001a\u0004\b+\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b \u0010\u0019R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b*\u0010\u001bR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b,\u00100R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b&\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b+\u00101\u001a\u0004\b4\u00103R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b#\u0010\u0019R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b.\u00107R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b4\u00108\u001a\u0004\b5\u00109¨\u0006:"}, m65681d2 = {"Lb41/f;", "Lm91/u;", "", "label", "text", "placeholder", "Lgz0/m0;", "icon", "suffix", "caption", "Lq3/n;", "keyboardType", "", "maxLength", "", "isSecure", "isEnabled", "errorMessage", "Lcom/whoop/navigation/models/GenericInteraction;", "overrideTapInteraction", "Lb41/g;", "updateTextInput", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ZZLjava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lb41/g;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "k", "c", "i", "d", "Lgz0/m0;", "()Lgz0/m0;", "e", "j", "g", "I", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "Z", "n", "()Z", "m", "l", "Lcom/whoop/navigation/models/GenericInteraction;", "()Lcom/whoop/navigation/models/GenericInteraction;", "Lb41/g;", "()Lb41/g;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C2717f implements InterfaceC25312u {

    /* JADX INFO: renamed from: n */
    public static final int f10707n = GenericInteraction.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String label;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String text;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String placeholder;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String suffix;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String caption;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int keyboardType;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final Integer maxLength;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean isSecure;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final boolean isEnabled;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final String errorMessage;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final GenericInteraction overrideTapInteraction;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final C2718g updateTextInput;

    public /* synthetic */ C2717f(String str, String str2, String str3, EnumC16313m0 enumC16313m0, String str4, String str5, int i13, Integer num, boolean z4, boolean z13, String str6, GenericInteraction genericInteraction, C2718g c2718g, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, enumC16313m0, str4, str5, i13, num, z4, z13, str6, genericInteraction, c2718g);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCaption() {
        return this.caption;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getKeyboardType() {
        return this.keyboardType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C2717f)) {
            return false;
        }
        C2717f c2717f = (C2717f) other;
        return AbstractC22676k.m65745e(this.label, c2717f.label) && AbstractC22676k.m65745e(this.text, c2717f.text) && AbstractC22676k.m65745e(this.placeholder, c2717f.placeholder) && this.icon == c2717f.icon && AbstractC22676k.m65745e(this.suffix, c2717f.suffix) && AbstractC22676k.m65745e(this.caption, c2717f.caption) && this.keyboardType == c2717f.keyboardType && AbstractC22676k.m65745e(this.maxLength, c2717f.maxLength) && this.isSecure == c2717f.isSecure && this.isEnabled == c2717f.isEnabled && AbstractC22676k.m65745e(this.errorMessage, c2717f.errorMessage) && AbstractC22676k.m65745e(this.overrideTapInteraction, c2717f.overrideTapInteraction) && AbstractC22676k.m65745e(this.updateTextInput, c2717f.updateTextInput);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Integer getMaxLength() {
        return this.maxLength;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final GenericInteraction getOverrideTapInteraction() {
        return this.overrideTapInteraction;
    }

    public int hashCode() {
        String str = this.label;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.text;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.placeholder;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        EnumC16313m0 enumC16313m0 = this.icon;
        int iHashCode4 = (iHashCode3 + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31;
        String str4 = this.suffix;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.caption;
        int iM30448b = AbstractC11266d.m30448b(this.keyboardType, (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31, 31);
        Integer num = this.maxLength;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM30448b + (num == null ? 0 : num.hashCode())) * 31, 31, this.isSecure), 31, this.isEnabled);
        String str6 = this.errorMessage;
        int iHashCode6 = (iM8289b + (str6 == null ? 0 : str6.hashCode())) * 31;
        GenericInteraction genericInteraction = this.overrideTapInteraction;
        int iHashCode7 = (iHashCode6 + (genericInteraction == null ? 0 : genericInteraction.hashCode())) * 31;
        C2718g c2718g = this.updateTextInput;
        return iHashCode7 + (c2718g != null ? c2718g.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getSuffix() {
        return this.suffix;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final C2718g getUpdateTextInput() {
        return this.updateTextInput;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getIsSecure() {
        return this.isSecure;
    }

    public String toString() {
        String str = this.label;
        String str2 = this.text;
        String str3 = this.placeholder;
        EnumC16313m0 enumC16313m0 = this.icon;
        String str4 = this.suffix;
        String str5 = this.caption;
        String strM91503a = C29880n.m91503a(this.keyboardType);
        Integer num = this.maxLength;
        boolean z4 = this.isSecure;
        boolean z13 = this.isEnabled;
        String str6 = this.errorMessage;
        GenericInteraction genericInteraction = this.overrideTapInteraction;
        C2718g c2718g = this.updateTextInput;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("TextInputViewState(label=", str, ", text=", str2, ", placeholder=");
        sbM32001t.append(str3);
        sbM32001t.append(", icon=");
        sbM32001t.append(enumC16313m0);
        sbM32001t.append(", suffix=");
        AbstractC11266d.m30444B(sbM32001t, str4, ", caption=", str5, ", keyboardType=");
        AbstractC30007c.m91853w(num, strM91503a, ", maxLength=", ", isSecure=", sbM32001t);
        AbstractC38963t7.m124392v(sbM32001t, z4, ", isEnabled=", z13, ", errorMessage=");
        sbM32001t.append(str6);
        sbM32001t.append(", overrideTapInteraction=");
        sbM32001t.append(genericInteraction);
        sbM32001t.append(", updateTextInput=");
        sbM32001t.append(c2718g);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    private C2717f(String str, String str2, String str3, EnumC16313m0 enumC16313m0, String str4, String str5, int i13, Integer num, boolean z4, boolean z13, String str6, GenericInteraction genericInteraction, C2718g c2718g) {
        this.label = str;
        this.text = str2;
        this.placeholder = str3;
        this.icon = enumC16313m0;
        this.suffix = str4;
        this.caption = str5;
        this.keyboardType = i13;
        this.maxLength = num;
        this.isSecure = z4;
        this.isEnabled = z13;
        this.errorMessage = str6;
        this.overrideTapInteraction = genericInteraction;
        this.updateTextInput = c2718g;
    }

    public /* synthetic */ C2717f(String str, String str2, String str3, EnumC16313m0 enumC16313m0, String str4, String str5, int i13, Integer num, boolean z4, boolean z13, String str6, GenericInteraction genericInteraction, C2718g c2718g, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, enumC16313m0, str4, str5, i13, (i14 & 128) != 0 ? null : num, (i14 & 256) != 0 ? true : z4, (i14 & 512) != 0 ? true : z13, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : str6, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : genericInteraction, (i14 & 4096) != 0 ? null : c2718g, null);
    }
}
