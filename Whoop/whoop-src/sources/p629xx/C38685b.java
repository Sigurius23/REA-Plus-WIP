package p629xx;

import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;

/* JADX INFO: renamed from: xx.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C38685b implements InterfaceC38688e {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f166490w;

    /* JADX INFO: renamed from: x */
    public final Object f166491x;

    public C38685b(Throwable th3, Float f13, int i13) {
        this.f166490w = i13;
        switch (i13) {
            case 1:
                this.f166491x = AbstractC25247g0.m73990Y(new C23465k("error_message", th3.getMessage()), new C23465k(AttachmentExtensionsKt.EXTRA_DURATION, f13));
                break;
            default:
                this.f166491x = AbstractC25247g0.m73990Y(new C23465k("error_message", th3.getMessage()), new C23465k(AttachmentExtensionsKt.EXTRA_DURATION, f13));
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: d */
    private final Map m124086d() {
        return this.f166491x;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: e */
    private final Map m124087e() {
        return this.f166491x;
    }

    @Override // p664yy.InterfaceC39847a
    /* JADX INFO: renamed from: b */
    public final String mo7174b() {
        switch (this.f166490w) {
            case 0:
                return "elements.attestation.confirmation.prepare.failed";
            default:
                return "elements.attestation.confirmation.request_token.failed";
        }
    }

    @Override // p629xx.InterfaceC38688e
    public final Map getParams() {
        switch (this.f166490w) {
            case 0:
                return m124086d();
            default:
                return m124087e();
        }
    }
}
