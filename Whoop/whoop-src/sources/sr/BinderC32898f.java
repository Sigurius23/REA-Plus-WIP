package sr;

import android.os.Bundle;
import android.os.Process;
import com.google.android.play.core.integrity.StandardIntegrityException;
import p073cq.C11040i;
import p229ip.AbstractBinderC20797h;
import p319m4.AbstractC25012a;
import p623xr.C38624t;
import p623xr.InterfaceC38623s;

/* JADX INFO: renamed from: sr.f */
/* JADX INFO: loaded from: classes6.dex */
public final class BinderC32898f extends AbstractBinderC20797h implements InterfaceC38623s {

    /* JADX INFO: renamed from: g */
    public final C11040i f137108g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C32900h f137109h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f137110i;

    /* JADX INFO: renamed from: j */
    public final C38624t f137111j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C32900h f137112k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC32898f(C32900h c32900h, C11040i c11040i, byte b) {
        super(5);
        this.f137109h = c32900h;
        attachInterface(this, "com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
        this.f137108g = c11040i;
    }

    @Override // p623xr.InterfaceC38623s
    /* JADX INFO: renamed from: U */
    public void mo103290U(Bundle bundle) {
        switch (this.f137110i) {
            case 1:
                m103293o0(bundle);
                this.f137111j.m123818b("onWarmUpExpressIntegrityToken", new Object[0]);
                this.f137112k.f137117d.getClass();
                int i13 = bundle.getInt("error");
                StandardIntegrityException standardIntegrityException = i13 != 0 ? new StandardIntegrityException(i13, null) : null;
                C11040i c11040i = this.f137108g;
                if (standardIntegrityException == null) {
                    c11040i.m29689d(Long.valueOf(bundle.getLong("warm.up.sid")));
                } else {
                    c11040i.m29688c(standardIntegrityException);
                }
                break;
            default:
                m103293o0(bundle);
                break;
        }
    }

    @Override // p623xr.InterfaceC38623s
    /* JADX INFO: renamed from: b */
    public void mo103291b(Bundle bundle) {
        switch (this.f137110i) {
            case 0:
                m103292n0(bundle);
                this.f137111j.m123818b("onRequestExpressIntegrityToken", new Object[0]);
                this.f137112k.f137117d.getClass();
                int i13 = bundle.getInt("error");
                StandardIntegrityException standardIntegrityException = i13 != 0 ? new StandardIntegrityException(i13, null) : null;
                C11040i c11040i = this.f137108g;
                if (standardIntegrityException != null) {
                    c11040i.m29688c(standardIntegrityException);
                    return;
                }
                bundle.getLong("request.token.sid");
                AbstractC25012a.m73372e(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat("IntegrityDialogWrapper");
                String string = bundle.getString("token");
                if (string == null) {
                    throw new NullPointerException("Null token");
                }
                c11040i.m29689d(new C32902j(string));
                return;
            default:
                m103292n0(bundle);
                return;
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m103292n0(Bundle bundle) {
        this.f137109h.f137118e.m123804c(this.f137108g);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m103293o0(Bundle bundle) {
        this.f137109h.f137118e.m123804c(this.f137108g);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BinderC32898f(C32900h c32900h, C11040i c11040i, int i13) {
        this(c32900h, c11040i, (byte) 0);
        this.f137110i = i13;
        switch (i13) {
            case 1:
                this.f137112k = c32900h;
                this(c32900h, c11040i, (byte) 0);
                this.f137111j = new C38624t("OnWarmUpIntegrityTokenCallback");
                break;
            default:
                this.f137112k = c32900h;
                this.f137111j = new C38624t("OnRequestIntegrityTokenCallback");
                break;
        }
    }
}
