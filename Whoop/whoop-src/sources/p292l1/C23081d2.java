package p292l1;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.file.internal.C19683b;
import p077d0.C11344e;
import p161g.AbstractC14917t;
import p161g.C14894a;
import p279kd.C22379f;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: l1.d2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23081d2 extends AbstractC14917t {

    /* JADX INFO: renamed from: d */
    public final InterfaceC2994c0 f91065d;

    /* JADX INFO: renamed from: e */
    public final C11344e f91066e;

    /* JADX INFO: renamed from: f */
    public final C19683b f91067f;

    public C23081d2(boolean z4, InterfaceC2994c0 interfaceC2994c0, C11344e c11344e, C19683b c19683b) {
        super(z4);
        this.f91065d = interfaceC2994c0;
        this.f91066e = c11344e;
        this.f91067f = c19683b;
    }

    @Override // p161g.AbstractC14917t
    /* JADX INFO: renamed from: c */
    public final void mo4072c() {
        AbstractC3006f0.m8732z(this.f91065d, null, null, new C22379f(this, (InterfaceC30057d) null, 2), 3);
    }

    @Override // p161g.AbstractC14917t
    /* JADX INFO: renamed from: d */
    public final void mo4073d() {
        this.f91067f.invoke();
    }

    @Override // p161g.AbstractC14917t
    /* JADX INFO: renamed from: e */
    public final void mo4074e(C14894a c14894a) {
        AbstractC3006f0.m8732z(this.f91065d, null, null, new C23075c2(this, c14894a, null, 0), 3);
    }

    @Override // p161g.AbstractC14917t
    /* JADX INFO: renamed from: f */
    public final void mo4075f(C14894a c14894a) {
        AbstractC3006f0.m8732z(this.f91065d, null, null, new C23075c2(this, c14894a, null, 1), 3);
    }
}
