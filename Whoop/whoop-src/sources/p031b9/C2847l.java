package p031b9;

import android.os.Handler;
import androidx.media3.exoplayer.ExoPlaybackException;
import p085d9.C11780a0;
import p309lo.C24562t;
import p309lo.InterfaceC24554l;
import p465rm.C31576w0;
import p465rm.C31581z;
import p516u8.C34589e0;
import p607x8.C38061p;

/* JADX INFO: renamed from: b9.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C2847l implements InterfaceC2858p0, InterfaceC24554l {

    /* JADX INFO: renamed from: E */
    public final Handler.Callback f11250E;

    /* JADX INFO: renamed from: F */
    public Object f11251F;

    /* JADX INFO: renamed from: G */
    public Object f11252G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f11253w = 0;

    /* JADX INFO: renamed from: x */
    public boolean f11254x = true;

    /* JADX INFO: renamed from: y */
    public boolean f11255y;

    /* JADX INFO: renamed from: z */
    public final Object f11256z;

    public C2847l(C31581z c31581z, C24562t c24562t) {
        this.f11250E = c31581z;
        this.f11256z = new C2849l1(c24562t);
    }

    /* JADX INFO: renamed from: a */
    public void m8162a(AbstractC2829f abstractC2829f) {
        InterfaceC2858p0 interfaceC2858p0;
        InterfaceC2858p0 interfaceC2858p0Mo8061i = abstractC2829f.mo8061i();
        if (interfaceC2858p0Mo8061i == null || interfaceC2858p0Mo8061i == (interfaceC2858p0 = (InterfaceC2858p0) this.f11252G)) {
            return;
        }
        if (interfaceC2858p0 != null) {
            throw new ExoPlaybackException(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f11252G = interfaceC2858p0Mo8061i;
        this.f11251F = abstractC2829f;
        ((C11780a0) interfaceC2858p0Mo8061i).mo8166d((C34589e0) ((C2849l1) this.f11256z).f11311F);
    }

    @Override // p309lo.InterfaceC24554l
    /* JADX INFO: renamed from: b */
    public C31576w0 mo8163b() {
        InterfaceC24554l interfaceC24554l = (InterfaceC24554l) this.f11252G;
        return interfaceC24554l != null ? interfaceC24554l.mo8163b() : (C31576w0) ((C2849l1) this.f11256z).f11311F;
    }

    @Override // p031b9.InterfaceC2858p0, p309lo.InterfaceC24554l
    /* JADX INFO: renamed from: c */
    public final long mo8165c() {
        switch (this.f11253w) {
            case 0:
                if (this.f11254x) {
                    return ((C2849l1) this.f11256z).mo8165c();
                }
                InterfaceC2858p0 interfaceC2858p0 = (InterfaceC2858p0) this.f11252G;
                interfaceC2858p0.getClass();
                return interfaceC2858p0.mo8165c();
            default:
                if (this.f11254x) {
                    return ((C2849l1) this.f11256z).mo8165c();
                }
                InterfaceC24554l interfaceC24554l = (InterfaceC24554l) this.f11252G;
                interfaceC24554l.getClass();
                return interfaceC24554l.mo8165c();
        }
    }

    @Override // p031b9.InterfaceC2858p0
    /* JADX INFO: renamed from: d */
    public void mo8166d(C34589e0 c34589e0) {
        InterfaceC2858p0 interfaceC2858p0 = (InterfaceC2858p0) this.f11252G;
        if (interfaceC2858p0 != null) {
            interfaceC2858p0.mo8166d(c34589e0);
            c34589e0 = ((InterfaceC2858p0) this.f11252G).mo8164b();
        }
        ((C2849l1) this.f11256z).mo8166d(c34589e0);
    }

    @Override // p031b9.InterfaceC2858p0
    /* JADX INFO: renamed from: e */
    public boolean mo8167e() {
        if (this.f11254x) {
            ((C2849l1) this.f11256z).getClass();
            return false;
        }
        InterfaceC2858p0 interfaceC2858p0 = (InterfaceC2858p0) this.f11252G;
        interfaceC2858p0.getClass();
        return interfaceC2858p0.mo8167e();
    }

    @Override // p309lo.InterfaceC24554l
    /* JADX INFO: renamed from: f */
    public void mo8168f(C31576w0 c31576w0) {
        InterfaceC24554l interfaceC24554l = (InterfaceC24554l) this.f11252G;
        if (interfaceC24554l != null) {
            interfaceC24554l.mo8168f(c31576w0);
            c31576w0 = ((InterfaceC24554l) this.f11252G).mo8163b();
        }
        ((C2849l1) this.f11256z).mo8168f(c31576w0);
    }

    public C2847l(C2848l0 c2848l0, C38061p c38061p) {
        this.f11250E = c2848l0;
        this.f11256z = new C2849l1(c38061p);
    }

    @Override // p031b9.InterfaceC2858p0
    /* JADX INFO: renamed from: b */
    public C34589e0 mo8164b() {
        InterfaceC2858p0 interfaceC2858p0 = (InterfaceC2858p0) this.f11252G;
        if (interfaceC2858p0 != null) {
            return interfaceC2858p0.mo8164b();
        }
        return (C34589e0) ((C2849l1) this.f11256z).f11311F;
    }
}
