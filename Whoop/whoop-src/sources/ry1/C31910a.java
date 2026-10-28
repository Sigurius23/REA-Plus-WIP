package ry1;

import androidx.core.app.NotificationCompat;
import dj0.InterfaceC12085u;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.time.Instant;
import jh3.AbstractC21702c;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import ty1.InterfaceC34256a;
import ty1.InterfaceC34267l;
import xy1.EnumC38705f;

/* JADX INFO: renamed from: ry1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0094\u0001\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010#\u001a\u0004\b$\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010&\u001a\u0004\b-\u0010(R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u0010&\u001a\u0004\b2\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b/\u00103\u001a\u0004\b,\u00104R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010#\u001a\u0004\b1\u0010\u001cR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b5\u00108R\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010&\u001a\u0004\b9\u0010(R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b6\u0010<R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b=\u0010?R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b9\u0010#\u001a\u0004\b:\u0010\u001c¨\u0006@"}, m65681d2 = {"Lry1/a;", "", "", "code", "", "textFieldEnabled", "Lty1/a;", "buttonState", "resendButtonEnabled", "Lty1/l;", "errorMessageState", "usingEmail", "Ldj0/u;", "challengeData", "codeDestination", "Ljava/time/Instant;", "lastCodeSent", "success", "", NotificationCompat.CATEGORY_PROGRESS, "Lxy1/f;", "submissionState", "source", "<init>", "(Ljava/lang/String;ZLty1/a;ZLty1/l;ZLdj0/u;Ljava/lang/String;Ljava/time/Instant;ZFLxy1/f;Ljava/lang/String;)V", "a", "(Ljava/lang/String;ZLty1/a;ZLty1/l;ZLdj0/u;Ljava/lang/String;Ljava/time/Instant;ZFLxy1/f;Ljava/lang/String;)Lry1/a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "e", "b", "Z", "n", "()Z", "c", "Lty1/a;", "()Lty1/a;", "d", "j", "Lty1/l;", "g", "()Lty1/l;", "f", "o", "Ldj0/u;", "()Ldj0/u;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "Ljava/time/Instant;", "()Ljava/time/Instant;", "m", "k", "F", "()F", "l", "Lxy1/f;", "()Lxy1/f;", "mfa_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C31910a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String code;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean textFieldEnabled;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34256a buttonState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean resendButtonEnabled;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC34267l errorMessageState;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean usingEmail;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC12085u challengeData;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String codeDestination;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final Instant lastCodeSent;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final boolean success;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final float progress;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final EnumC38705f submissionState;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final String source;

    public C31910a(String code, boolean z4, InterfaceC34256a buttonState, boolean z13, InterfaceC34267l errorMessageState, boolean z14, InterfaceC12085u interfaceC12085u, String codeDestination, Instant lastCodeSent, boolean z15, float f13, EnumC38705f submissionState, String source) {
        AbstractC22676k.m65750j(code, "code");
        AbstractC22676k.m65750j(buttonState, "buttonState");
        AbstractC22676k.m65750j(errorMessageState, "errorMessageState");
        AbstractC22676k.m65750j(codeDestination, "codeDestination");
        AbstractC22676k.m65750j(lastCodeSent, "lastCodeSent");
        AbstractC22676k.m65750j(submissionState, "submissionState");
        AbstractC22676k.m65750j(source, "source");
        this.code = code;
        this.textFieldEnabled = z4;
        this.buttonState = buttonState;
        this.resendButtonEnabled = z13;
        this.errorMessageState = errorMessageState;
        this.usingEmail = z14;
        this.challengeData = interfaceC12085u;
        this.codeDestination = codeDestination;
        this.lastCodeSent = lastCodeSent;
        this.success = z15;
        this.progress = f13;
        this.submissionState = submissionState;
        this.source = source;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C31910a m99220b(C31910a c31910a, String str, boolean z4, InterfaceC34256a interfaceC34256a, boolean z13, InterfaceC34267l interfaceC34267l, boolean z14, InterfaceC12085u interfaceC12085u, String str2, Instant instant, boolean z15, float f13, EnumC38705f enumC38705f, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c31910a.code;
        }
        return c31910a.m99221a(str, (i13 & 2) != 0 ? c31910a.textFieldEnabled : z4, (i13 & 4) != 0 ? c31910a.buttonState : interfaceC34256a, (i13 & 8) != 0 ? c31910a.resendButtonEnabled : z13, (i13 & 16) != 0 ? c31910a.errorMessageState : interfaceC34267l, (i13 & 32) != 0 ? c31910a.usingEmail : z14, (i13 & 64) != 0 ? c31910a.challengeData : interfaceC12085u, (i13 & 128) != 0 ? c31910a.codeDestination : str2, (i13 & 256) != 0 ? c31910a.lastCodeSent : instant, (i13 & 512) != 0 ? c31910a.success : z15, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c31910a.progress : f13, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c31910a.submissionState : enumC38705f, (i13 & 4096) != 0 ? c31910a.source : str3);
    }

    /* JADX INFO: renamed from: a */
    public final C31910a m99221a(String code, boolean textFieldEnabled, InterfaceC34256a buttonState, boolean resendButtonEnabled, InterfaceC34267l errorMessageState, boolean usingEmail, InterfaceC12085u challengeData, String codeDestination, Instant lastCodeSent, boolean success, float progress, EnumC38705f submissionState, String source) {
        AbstractC22676k.m65750j(code, "code");
        AbstractC22676k.m65750j(buttonState, "buttonState");
        AbstractC22676k.m65750j(errorMessageState, "errorMessageState");
        AbstractC22676k.m65750j(codeDestination, "codeDestination");
        AbstractC22676k.m65750j(lastCodeSent, "lastCodeSent");
        AbstractC22676k.m65750j(submissionState, "submissionState");
        AbstractC22676k.m65750j(source, "source");
        return new C31910a(code, textFieldEnabled, buttonState, resendButtonEnabled, errorMessageState, usingEmail, challengeData, codeDestination, lastCodeSent, success, progress, submissionState, source);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC34256a getButtonState() {
        return this.buttonState;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC12085u getChallengeData() {
        return this.challengeData;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C31910a)) {
            return false;
        }
        C31910a c31910a = (C31910a) other;
        return AbstractC22676k.m65745e(this.code, c31910a.code) && this.textFieldEnabled == c31910a.textFieldEnabled && AbstractC22676k.m65745e(this.buttonState, c31910a.buttonState) && this.resendButtonEnabled == c31910a.resendButtonEnabled && AbstractC22676k.m65745e(this.errorMessageState, c31910a.errorMessageState) && this.usingEmail == c31910a.usingEmail && AbstractC22676k.m65745e(this.challengeData, c31910a.challengeData) && AbstractC22676k.m65745e(this.codeDestination, c31910a.codeDestination) && AbstractC22676k.m65745e(this.lastCodeSent, c31910a.lastCodeSent) && this.success == c31910a.success && Float.compare(this.progress, c31910a.progress) == 0 && this.submissionState == c31910a.submissionState && AbstractC22676k.m65745e(this.source, c31910a.source);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getCodeDestination() {
        return this.codeDestination;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final InterfaceC34267l getErrorMessageState() {
        return this.errorMessageState;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Instant getLastCodeSent() {
        return this.lastCodeSent;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b((this.errorMessageState.hashCode() + AbstractC2875y.m8289b((this.buttonState.hashCode() + AbstractC2875y.m8289b(this.code.hashCode() * 31, 31, this.textFieldEnabled)) * 31, 31, this.resendButtonEnabled)) * 31, 31, this.usingEmail);
        InterfaceC12085u interfaceC12085u = this.challengeData;
        return this.source.hashCode() + ((this.submissionState.hashCode() + AbstractC11266d.m30447a(this.progress, AbstractC2875y.m8289b(AbstractC21702c.m61131b(this.lastCodeSent, AbstractC11266d.m30450d((iM8289b + (interfaceC12085u == null ? 0 : interfaceC12085u.hashCode())) * 31, 31, this.codeDestination), 31), 31, this.success), 31)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final float getProgress() {
        return this.progress;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getResendButtonEnabled() {
        return this.resendButtonEnabled;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final EnumC38705f getSubmissionState() {
        return this.submissionState;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getTextFieldEnabled() {
        return this.textFieldEnabled;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getUsingEmail() {
        return this.usingEmail;
    }

    public String toString() {
        String str = this.code;
        boolean z4 = this.textFieldEnabled;
        InterfaceC34256a interfaceC34256a = this.buttonState;
        boolean z13 = this.resendButtonEnabled;
        InterfaceC34267l interfaceC34267l = this.errorMessageState;
        boolean z14 = this.usingEmail;
        InterfaceC12085u interfaceC12085u = this.challengeData;
        String str2 = this.codeDestination;
        Instant instant = this.lastCodeSent;
        boolean z15 = this.success;
        float f13 = this.progress;
        EnumC38705f enumC38705f = this.submissionState;
        String str3 = this.source;
        StringBuilder sbM73379l = AbstractC25012a.m73379l("MfaChallengeDomainState(code=", str, ", textFieldEnabled=", ", buttonState=", z4);
        sbM73379l.append(interfaceC34256a);
        sbM73379l.append(", resendButtonEnabled=");
        sbM73379l.append(z13);
        sbM73379l.append(", errorMessageState=");
        sbM73379l.append(interfaceC34267l);
        sbM73379l.append(", usingEmail=");
        sbM73379l.append(z14);
        sbM73379l.append(", challengeData=");
        sbM73379l.append(interfaceC12085u);
        sbM73379l.append(", codeDestination=");
        sbM73379l.append(str2);
        sbM73379l.append(", lastCodeSent=");
        sbM73379l.append(instant);
        sbM73379l.append(", success=");
        sbM73379l.append(z15);
        sbM73379l.append(", progress=");
        sbM73379l.append(f13);
        sbM73379l.append(", submissionState=");
        sbM73379l.append(enumC38705f);
        sbM73379l.append(", source=");
        return AbstractC25012a.m73376i(str3, ")", sbM73379l);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C31910a(String str, boolean z4, InterfaceC34256a interfaceC34256a, boolean z13, InterfaceC34267l interfaceC34267l, boolean z14, InterfaceC12085u interfaceC12085u, String str2, Instant instant, boolean z15, float f13, EnumC38705f enumC38705f, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        Instant EPOCH;
        str = (i13 & 1) != 0 ? "" : str;
        boolean z16 = (i13 & 2) != 0 ? true : z4;
        InterfaceC34256a bVar = (i13 & 4) != 0 ? new InterfaceC34256a.b(null, false, 3, null) : interfaceC34256a;
        boolean z17 = (i13 & 8) != 0 ? true : z13;
        InterfaceC34267l interfaceC34267l2 = (i13 & 16) != 0 ? InterfaceC34267l.b.f143746a : interfaceC34267l;
        boolean z18 = (i13 & 32) == 0 ? z14 : true;
        InterfaceC12085u interfaceC12085u2 = (i13 & 64) == 0 ? interfaceC12085u : null;
        String str4 = (i13 & 128) != 0 ? "" : str2;
        if ((i13 & 256) != 0) {
            EPOCH = Instant.EPOCH;
            AbstractC22676k.m65749i(EPOCH, "EPOCH");
        } else {
            EPOCH = instant;
        }
        this(str, z16, bVar, z17, interfaceC34267l2, z18, interfaceC12085u2, str4, EPOCH, (i13 & 512) == 0 ? z15 : false, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? 0.0f : f13, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? EnumC38705f.IDLE : enumC38705f, (i13 & 4096) != 0 ? "" : str3);
    }
}
