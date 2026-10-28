package to;

import android.app.Activity;
import com.google.android.gms.common.C4969a;
import com.google.android.gms.common.GoogleApiAvailability;
import jp.HandlerC21846d;
import p002a0.C0025h;

/* JADX INFO: renamed from: to.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C33997s extends AbstractDialogInterfaceOnCancelListenerC33996r0 {

    /* JADX INFO: renamed from: F */
    public final C0025h f142482F;

    /* JADX INFO: renamed from: G */
    public final C33971f f142483G;

    public C33997s(InterfaceC33977i interfaceC33977i, C33971f c33971f, GoogleApiAvailability googleApiAvailability) {
        super(interfaceC33977i, googleApiAvailability);
        this.f142482F = new C0025h(0);
        this.f142483G = c33971f;
        interfaceC33977i.mo107446o("ConnectionlessLifecycleHelper", this);
    }

    /* JADX INFO: renamed from: m */
    public static void m107470m(Activity activity, C33971f c33971f, C33961a c33961a) {
        InterfaceC33977i interfaceC33977iM107437b = AbstractC33975h.m107437b(activity);
        C33997s c33997s = (C33997s) interfaceC33977iM107437b.mo107444d(C33997s.class, "ConnectionlessLifecycleHelper");
        if (c33997s == null) {
            c33997s = new C33997s(interfaceC33977iM107437b, c33971f, GoogleApiAvailability.getInstance());
        }
        c33997s.f142482F.add(c33961a);
        c33971f.m107432f(c33997s);
    }

    @Override // to.AbstractC33975h
    /* JADX INFO: renamed from: f */
    public final void mo107441f() {
        if (this.f142482F.isEmpty()) {
            return;
        }
        this.f142483G.m107432f(this);
    }

    @Override // to.AbstractDialogInterfaceOnCancelListenerC33996r0, to.AbstractC33975h
    /* JADX INFO: renamed from: h */
    public final void mo107443h() {
        this.f142479x = true;
        if (this.f142482F.isEmpty()) {
            return;
        }
        this.f142483G.m107432f(this);
    }

    @Override // to.AbstractDialogInterfaceOnCancelListenerC33996r0, to.AbstractC33975h
    /* JADX INFO: renamed from: i */
    public final void mo29700i() {
        this.f142479x = false;
        C33971f c33971f = this.f142483G;
        c33971f.getClass();
        synchronized (C33971f.f142416R) {
            try {
                if (c33971f.f142424K == this) {
                    c33971f.f142424K = null;
                    c33971f.f142425L.clear();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // to.AbstractDialogInterfaceOnCancelListenerC33996r0
    /* JADX INFO: renamed from: j */
    public final void mo107417j(C4969a c4969a, int i13) {
        this.f142483G.m107435i(c4969a, i13);
    }

    @Override // to.AbstractDialogInterfaceOnCancelListenerC33996r0
    /* JADX INFO: renamed from: k */
    public final void mo107418k() {
        HandlerC21846d handlerC21846d = this.f142483G.f142427N;
        handlerC21846d.sendMessage(handlerC21846d.obtainMessage(3));
    }

    /* JADX INFO: renamed from: n */
    public final C0025h m107471n() {
        return this.f142482F;
    }
}
