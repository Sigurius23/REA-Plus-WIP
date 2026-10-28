package p629xx;

import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;

/* JADX INFO: renamed from: xx.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C38686c implements InterfaceC38688e {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f166492w;

    /* JADX INFO: renamed from: x */
    public final Map f166493x;

    public C38686c(int i13, Float f13) {
        this.f166492w = i13;
        switch (i13) {
            case 1:
                this.f166493x = AbstractC25247g0.m73989X(new C23465k(AttachmentExtensionsKt.EXTRA_DURATION, f13));
                break;
            default:
                this.f166493x = AbstractC25247g0.m73989X(new C23465k(AttachmentExtensionsKt.EXTRA_DURATION, f13));
                break;
        }
    }

    @Override // p664yy.InterfaceC39847a
    /* JADX INFO: renamed from: b */
    public final String mo7174b() {
        switch (this.f166492w) {
            case 0:
                return "elements.attestation.confirmation.prepare.succeeded";
            default:
                return "elements.attestation.confirmation.request_token.succeeded";
        }
    }

    @Override // p629xx.InterfaceC38688e
    public final Map getParams() {
        switch (this.f166492w) {
            case 0:
                break;
        }
        return this.f166493x;
    }
}
