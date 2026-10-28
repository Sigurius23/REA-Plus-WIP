package wy1;

import c31.C3927k;
import c41.C4092p2;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import py1.AbstractC29625d;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import xy1.EnumC38702c;
import zy1.C41222d;

/* JADX INFO: renamed from: wy1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001f\u001a\u0004\b$\u0010!R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010!R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b(\u0010-R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b#\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b*\u00101\u001a\u0004\b\u001e\u00102R\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b \u0010.\u001a\u0004\b)\u00100R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b/\u0010.\u001a\u0004\b+\u00100R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b\"\u00105¨\u00066"}, m65681d2 = {"Lwy1/b;", "", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "helperText", "", "inputValue", "inputPrefix", "switchButtonText", "Lc31/k;", "progressButtonState", "", "isInputEnabled", "Lc41/p2;", "errorCallout", "shouldNavigate", "showChangeEmailButton", "Lxy1/c;", "inputMode", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc31/k;ZLc41/p2;ZZLxy1/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "j", "()Lcom/whoop/design/util/TextResource;", "b", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "c", "getHelperText", "d", "Ljava/lang/String;", "e", "f", "i", "g", "Lc31/k;", "()Lc31/k;", "Z", "k", "()Z", "Lc41/p2;", "()Lc41/p2;", "l", "Lxy1/c;", "()Lxy1/c;", "mfa_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C37695b {

    /* JADX INFO: renamed from: m */
    public static final int f161522m;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource helperText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String inputValue;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource inputPrefix;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextResource switchButtonText;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C3927k progressButtonState;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean isInputEnabled;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C4092p2 errorCallout;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final boolean shouldNavigate;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final boolean showChangeEmailButton;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final EnumC38702c inputMode;

    static {
        int i13 = C4092p2.f16593v | C3927k.f16020r;
        int i14 = TextResource.$stable;
        f161522m = i13 | i14 | i14 | i14 | i14 | i14;
    }

    public C37695b(TextResource title, TextResource subtitle, TextResource helperText, String inputValue, TextResource inputPrefix, TextResource switchButtonText, C3927k progressButtonState, boolean z4, C4092p2 c4092p2, boolean z13, boolean z14, EnumC38702c inputMode) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(helperText, "helperText");
        AbstractC22676k.m65750j(inputValue, "inputValue");
        AbstractC22676k.m65750j(inputPrefix, "inputPrefix");
        AbstractC22676k.m65750j(switchButtonText, "switchButtonText");
        AbstractC22676k.m65750j(progressButtonState, "progressButtonState");
        AbstractC22676k.m65750j(inputMode, "inputMode");
        this.title = title;
        this.subtitle = subtitle;
        this.helperText = helperText;
        this.inputValue = inputValue;
        this.inputPrefix = inputPrefix;
        this.switchButtonText = switchButtonText;
        this.progressButtonState = progressButtonState;
        this.isInputEnabled = z4;
        this.errorCallout = c4092p2;
        this.shouldNavigate = z13;
        this.showChangeEmailButton = z14;
        this.inputMode = inputMode;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C4092p2 getErrorCallout() {
        return this.errorCallout;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC38702c getInputMode() {
        return this.inputMode;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getInputPrefix() {
        return this.inputPrefix;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getInputValue() {
        return this.inputValue;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C3927k getProgressButtonState() {
        return this.progressButtonState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C37695b)) {
            return false;
        }
        C37695b c37695b = (C37695b) other;
        return AbstractC22676k.m65745e(this.title, c37695b.title) && AbstractC22676k.m65745e(this.subtitle, c37695b.subtitle) && AbstractC22676k.m65745e(this.helperText, c37695b.helperText) && AbstractC22676k.m65745e(this.inputValue, c37695b.inputValue) && AbstractC22676k.m65745e(this.inputPrefix, c37695b.inputPrefix) && AbstractC22676k.m65745e(this.switchButtonText, c37695b.switchButtonText) && AbstractC22676k.m65745e(this.progressButtonState, c37695b.progressButtonState) && this.isInputEnabled == c37695b.isInputEnabled && AbstractC22676k.m65745e(this.errorCallout, c37695b.errorCallout) && this.shouldNavigate == c37695b.shouldNavigate && this.showChangeEmailButton == c37695b.showChangeEmailButton && this.inputMode == c37695b.inputMode;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getShouldNavigate() {
        return this.shouldNavigate;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getShowChangeEmailButton() {
        return this.showChangeEmailButton;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b((this.progressButtonState.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC11266d.m30450d(AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.title.hashCode() * 31, this.subtitle, 31), this.helperText, 31), 31, this.inputValue), this.inputPrefix, 31), this.switchButtonText, 31)) * 31, 31, this.isInputEnabled);
        C4092p2 c4092p2 = this.errorCallout;
        return this.inputMode.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM8289b + (c4092p2 == null ? 0 : c4092p2.hashCode())) * 31, 31, this.shouldNavigate), 31, this.showChangeEmailButton);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextResource getSwitchButtonText() {
        return this.switchButtonText;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getIsInputEnabled() {
        return this.isInputEnabled;
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        TextResource textResource3 = this.helperText;
        String str = this.inputValue;
        TextResource textResource4 = this.inputPrefix;
        TextResource textResource5 = this.switchButtonText;
        C3927k c3927k = this.progressButtonState;
        boolean z4 = this.isInputEnabled;
        C4092p2 c4092p2 = this.errorCallout;
        boolean z13 = this.shouldNavigate;
        boolean z14 = this.showChangeEmailButton;
        EnumC38702c enumC38702c = this.inputMode;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("MfaInputViewState(title=", textResource, ", subtitle=", textResource2, ", helperText=");
        AbstractC30007c.m91856z(sbM106658q, textResource3, ", inputValue=", str, ", inputPrefix=");
        AbstractC30007c.m91855y(sbM106658q, textResource4, ", switchButtonText=", textResource5, ", progressButtonState=");
        sbM106658q.append(c3927k);
        sbM106658q.append(", isInputEnabled=");
        sbM106658q.append(z4);
        sbM106658q.append(", errorCallout=");
        sbM106658q.append(c4092p2);
        sbM106658q.append(", shouldNavigate=");
        sbM106658q.append(z13);
        sbM106658q.append(", showChangeEmailButton=");
        sbM106658q.append(z14);
        sbM106658q.append(", inputMode=");
        sbM106658q.append(enumC38702c);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }

    public /* synthetic */ C37695b(TextResource textResource, TextResource textResource2, TextResource textResource3, String str, TextResource textResource4, TextResource textResource5, C3927k c3927k, boolean z4, C4092p2 c4092p2, boolean z13, boolean z14, EnumC38702c enumC38702c, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC8693b.m21277k(AbstractC29625d.f121006t) : textResource, (i13 & 2) != 0 ? AbstractC8693b.m21277k(AbstractC29625d.f121004r) : textResource2, (i13 & 4) != 0 ? AbstractC8693b.m21277k(AbstractC29625d.f121002p) : textResource3, (i13 & 8) != 0 ? "" : str, (i13 & 16) != 0 ? AbstractC8693b.m21277k(AbstractC29625d.f121003q) : textResource4, (i13 & 32) != 0 ? AbstractC8693b.m21277k(AbstractC29625d.f121005s) : textResource5, (i13 & 64) != 0 ? C41222d.f177881a.m133910a() : c3927k, (i13 & 128) != 0 ? true : z4, (i13 & 256) != 0 ? null : c4092p2, (i13 & 512) != 0 ? false : z13, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? false : z14, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? EnumC38702c.PHONE : enumC38702c);
    }
}
