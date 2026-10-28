package ty1;

import c31.C3927k;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.time.Instant;
import jh3.AbstractC21702c;
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
import y00.AbstractC38963t7;
import zy1.C41222d;

/* JADX INFO: renamed from: ty1.k */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010&\u001a\u0004\b\"\u0010\u0017R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b%\u0010-\u001a\u0004\b\u001e\u0010.R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b$\u00101R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b)\u00102\u001a\u0004\b'\u00103R\u0017\u0010\u0011\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010(\u001a\u0004\b/\u0010*R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b+\u00106¨\u00067"}, m65681d2 = {"Lty1/k;", "", "Lcom/whoop/design/util/TextResource;", "title", "header", "subHeader", "", "code", "", "textFieldEnabled", "resendButtonEnabled", "Lty1/a;", "buttonState", "Lty1/l;", "errorMessageState", "Ljava/time/Instant;", "lastCodeSentAt", "success", "Lc31/k;", "progressButtonState", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZZLty1/a;Lty1/l;Ljava/time/Instant;ZLc31/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "j", "()Lcom/whoop/design/util/TextResource;", "b", "d", "c", "g", "Ljava/lang/String;", "e", "Z", "i", "()Z", "f", "getResendButtonEnabled", "Lty1/a;", "()Lty1/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lty1/l;", "()Lty1/l;", "Ljava/time/Instant;", "()Ljava/time/Instant;", "k", "Lc31/k;", "()Lc31/k;", "mfa_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C34266k {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource header;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource subHeader;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String code;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean textFieldEnabled;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean resendButtonEnabled;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC34256a buttonState;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final InterfaceC34267l errorMessageState;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final Instant lastCodeSentAt;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final boolean success;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C3927k progressButtonState;

    public C34266k(TextResource title, TextResource header, TextResource subHeader, String code, boolean z4, boolean z13, InterfaceC34256a buttonState, InterfaceC34267l errorMessageState, Instant lastCodeSentAt, boolean z14, C3927k progressButtonState) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(subHeader, "subHeader");
        AbstractC22676k.m65750j(code, "code");
        AbstractC22676k.m65750j(buttonState, "buttonState");
        AbstractC22676k.m65750j(errorMessageState, "errorMessageState");
        AbstractC22676k.m65750j(lastCodeSentAt, "lastCodeSentAt");
        AbstractC22676k.m65750j(progressButtonState, "progressButtonState");
        this.title = title;
        this.header = header;
        this.subHeader = subHeader;
        this.code = code;
        this.textFieldEnabled = z4;
        this.resendButtonEnabled = z13;
        this.buttonState = buttonState;
        this.errorMessageState = errorMessageState;
        this.lastCodeSentAt = lastCodeSentAt;
        this.success = z14;
        this.progressButtonState = progressButtonState;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC34256a getButtonState() {
        return this.buttonState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC34267l getErrorMessageState() {
        return this.errorMessageState;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Instant getLastCodeSentAt() {
        return this.lastCodeSentAt;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C34266k)) {
            return false;
        }
        C34266k c34266k = (C34266k) other;
        return AbstractC22676k.m65745e(this.title, c34266k.title) && AbstractC22676k.m65745e(this.header, c34266k.header) && AbstractC22676k.m65745e(this.subHeader, c34266k.subHeader) && AbstractC22676k.m65745e(this.code, c34266k.code) && this.textFieldEnabled == c34266k.textFieldEnabled && this.resendButtonEnabled == c34266k.resendButtonEnabled && AbstractC22676k.m65745e(this.buttonState, c34266k.buttonState) && AbstractC22676k.m65745e(this.errorMessageState, c34266k.errorMessageState) && AbstractC22676k.m65745e(this.lastCodeSentAt, c34266k.lastCodeSentAt) && this.success == c34266k.success && AbstractC22676k.m65745e(this.progressButtonState, c34266k.progressButtonState);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C3927k getProgressButtonState() {
        return this.progressButtonState;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getSubHeader() {
        return this.subHeader;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        return this.progressButtonState.hashCode() + AbstractC2875y.m8289b(AbstractC21702c.m61131b(this.lastCodeSentAt, (this.errorMessageState.hashCode() + ((this.buttonState.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.title.hashCode() * 31, this.header, 31), this.subHeader, 31), 31, this.code), 31, this.textFieldEnabled), 31, this.resendButtonEnabled)) * 31)) * 31, 31), 31, this.success);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getTextFieldEnabled() {
        return this.textFieldEnabled;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.header;
        TextResource textResource3 = this.subHeader;
        String str = this.code;
        boolean z4 = this.textFieldEnabled;
        boolean z13 = this.resendButtonEnabled;
        InterfaceC34256a interfaceC34256a = this.buttonState;
        InterfaceC34267l interfaceC34267l = this.errorMessageState;
        Instant instant = this.lastCodeSentAt;
        boolean z14 = this.success;
        C3927k c3927k = this.progressButtonState;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("MfaChallengeViewState(title=", textResource, ", header=", textResource2, ", subHeader=");
        AbstractC30007c.m91856z(sbM106658q, textResource3, ", code=", str, ", textFieldEnabled=");
        AbstractC38963t7.m124392v(sbM106658q, z4, ", resendButtonEnabled=", z13, ", buttonState=");
        sbM106658q.append(interfaceC34256a);
        sbM106658q.append(", errorMessageState=");
        sbM106658q.append(interfaceC34267l);
        sbM106658q.append(", lastCodeSentAt=");
        sbM106658q.append(instant);
        sbM106658q.append(", success=");
        sbM106658q.append(z14);
        sbM106658q.append(", progressButtonState=");
        sbM106658q.append(c3927k);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C34266k(TextResource textResource, TextResource textResource2, TextResource textResource3, String str, boolean z4, boolean z13, InterfaceC34256a interfaceC34256a, InterfaceC34267l interfaceC34267l, Instant instant, boolean z14, C3927k c3927k, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        InterfaceC34256a bVar;
        Instant EPOCH;
        textResource = (i13 & 1) != 0 ? AbstractC8693b.m21277k(AbstractC29625d.f120995i) : textResource;
        textResource2 = (i13 & 2) != 0 ? AbstractC8693b.m21277k(AbstractC29625d.f120989c) : textResource2;
        boolean z15 = false;
        textResource3 = (i13 & 4) != 0 ? new TextResource.C8688b(AbstractC29625d.f120994h, new TextResource.AbstractC8690d.a("******@******.***")) : textResource3;
        String str2 = (i13 & 8) != 0 ? "" : str;
        boolean z16 = (i13 & 16) != 0 ? true : z4;
        boolean z17 = (i13 & 32) == 0 ? z13 : true;
        if ((i13 & 64) != 0) {
            bVar = new InterfaceC34256a.b(null, z15, 3, 0 == true ? 1 : 0);
        } else {
            bVar = interfaceC34256a;
        }
        InterfaceC34267l interfaceC34267l2 = (i13 & 128) != 0 ? InterfaceC34267l.b.f143746a : interfaceC34267l;
        if ((i13 & 256) != 0) {
            EPOCH = Instant.EPOCH;
            AbstractC22676k.m65749i(EPOCH, "EPOCH");
        } else {
            EPOCH = instant;
        }
        this(textResource, textResource2, textResource3, str2, z16, z17, bVar, interfaceC34267l2, EPOCH, (i13 & 512) == 0 ? z14 : false, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? C41222d.f177881a.m133910a() : c3927k);
    }
}
