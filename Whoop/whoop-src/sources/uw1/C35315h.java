package uw1;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import ny0.C27256h;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: uw1.h */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJL\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010%\u001a\u0004\b\u001f\u0010&R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u0019\u001a\u0004\b'\u0010\u001b¨\u0006("}, m65681d2 = {"Luw1/h;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "textFieldLabel", "", "currentEmailText", "validationError", "", "submitEnabled", "Lny0/h;", "cardButton", "disclaimer", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZLny0/h;Lcom/whoop/design/util/TextResource;)V", "a", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZLny0/h;Lcom/whoop/design/util/TextResource;)Luw1/h;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/design/util/TextResource;", "b", "Ljava/lang/String;", "e", "c", "i", "d", "Z", "g", "()Z", "Lny0/h;", "()Lny0/h;", "f", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35315h implements InterfaceC25312u {

    /* JADX INFO: renamed from: g */
    public static final int f150494g;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource textFieldLabel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String currentEmailText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource validationError;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean submitEnabled;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C27256h cardButton;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextResource disclaimer;

    static {
        int i13 = TextResource.$stable;
        f150494g = i13 | C27256h.f109055z | i13 | i13;
    }

    public C35315h(TextResource textFieldLabel, String currentEmailText, TextResource validationError, boolean z4, C27256h cardButton, TextResource disclaimer) {
        AbstractC22676k.m65750j(textFieldLabel, "textFieldLabel");
        AbstractC22676k.m65750j(currentEmailText, "currentEmailText");
        AbstractC22676k.m65750j(validationError, "validationError");
        AbstractC22676k.m65750j(cardButton, "cardButton");
        AbstractC22676k.m65750j(disclaimer, "disclaimer");
        this.textFieldLabel = textFieldLabel;
        this.currentEmailText = currentEmailText;
        this.validationError = validationError;
        this.submitEnabled = z4;
        this.cardButton = cardButton;
        this.disclaimer = disclaimer;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C35315h m112157b(C35315h c35315h, TextResource textResource, String str, TextResource textResource2, boolean z4, C27256h c27256h, TextResource textResource3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = c35315h.textFieldLabel;
        }
        if ((i13 & 2) != 0) {
            str = c35315h.currentEmailText;
        }
        if ((i13 & 4) != 0) {
            textResource2 = c35315h.validationError;
        }
        if ((i13 & 8) != 0) {
            z4 = c35315h.submitEnabled;
        }
        if ((i13 & 16) != 0) {
            c27256h = c35315h.cardButton;
        }
        if ((i13 & 32) != 0) {
            textResource3 = c35315h.disclaimer;
        }
        C27256h c27256h2 = c27256h;
        TextResource textResource4 = textResource3;
        return c35315h.m112158a(textResource, str, textResource2, z4, c27256h2, textResource4);
    }

    /* JADX INFO: renamed from: a */
    public final C35315h m112158a(TextResource textFieldLabel, String currentEmailText, TextResource validationError, boolean submitEnabled, C27256h cardButton, TextResource disclaimer) {
        AbstractC22676k.m65750j(textFieldLabel, "textFieldLabel");
        AbstractC22676k.m65750j(currentEmailText, "currentEmailText");
        AbstractC22676k.m65750j(validationError, "validationError");
        AbstractC22676k.m65750j(cardButton, "cardButton");
        AbstractC22676k.m65750j(disclaimer, "disclaimer");
        return new C35315h(textFieldLabel, currentEmailText, validationError, submitEnabled, cardButton, disclaimer);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C27256h getCardButton() {
        return this.cardButton;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCurrentEmailText() {
        return this.currentEmailText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35315h)) {
            return false;
        }
        C35315h c35315h = (C35315h) other;
        return AbstractC22676k.m65745e(this.textFieldLabel, c35315h.textFieldLabel) && AbstractC22676k.m65745e(this.currentEmailText, c35315h.currentEmailText) && AbstractC22676k.m65745e(this.validationError, c35315h.validationError) && this.submitEnabled == c35315h.submitEnabled && AbstractC22676k.m65745e(this.cardButton, c35315h.cardButton) && AbstractC22676k.m65745e(this.disclaimer, c35315h.disclaimer);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getDisclaimer() {
        return this.disclaimer;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getSubmitEnabled() {
        return this.submitEnabled;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextResource getTextFieldLabel() {
        return this.textFieldLabel;
    }

    public int hashCode() {
        return this.disclaimer.hashCode() + ((this.cardButton.hashCode() + AbstractC2875y.m8289b(AbstractC31061c.m95625a(AbstractC11266d.m30450d(this.textFieldLabel.hashCode() * 31, 31, this.currentEmailText), this.validationError, 31), 31, this.submitEnabled)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextResource getValidationError() {
        return this.validationError;
    }

    public String toString() {
        TextResource textResource = this.textFieldLabel;
        String str = this.currentEmailText;
        TextResource textResource2 = this.validationError;
        boolean z4 = this.submitEnabled;
        C27256h c27256h = this.cardButton;
        TextResource textResource3 = this.disclaimer;
        StringBuilder sbM91845o = AbstractC30007c.m91845o("SendEmailInviteState(textFieldLabel=", textResource, ", currentEmailText=", str, ", validationError=");
        AbstractC33745d.m106664w(textResource2, ", submitEnabled=", ", cardButton=", sbM91845o, z4);
        sbM91845o.append(c27256h);
        sbM91845o.append(", disclaimer=");
        sbM91845o.append(textResource3);
        sbM91845o.append(")");
        return sbM91845o.toString();
    }

    public /* synthetic */ C35315h(TextResource textResource, String str, TextResource textResource2, boolean z4, C27256h c27256h, TextResource textResource3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, (i13 & 2) != 0 ? "" : str, (i13 & 4) != 0 ? AbstractC8693b.m21267a() : textResource2, (i13 & 8) != 0 ? true : z4, c27256h, textResource3);
    }
}
