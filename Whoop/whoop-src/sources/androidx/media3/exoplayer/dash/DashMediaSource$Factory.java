package androidx.media3.exoplayer.dash;

import com.iterable.iterableapi.C5327g1;
import g73.C15553a;
import io.sentry.internal.debugmeta.C20378c;
import java.util.List;
import p012ab.C0682h0;
import p112e9.C12869h;
import p141f9.C14263e;
import p171g9.C15585b;
import p249jc.C21567b;
import p299l9.AbstractC23481a;
import p299l9.InterfaceC23485b0;
import p516u8.C34626x;
import p674z8.InterfaceC40169e;

/* JADX INFO: loaded from: classes5.dex */
public final class DashMediaSource$Factory implements InterfaceC23485b0 {

    /* JADX INFO: renamed from: a */
    public final C0682h0 f6384a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC40169e f6385b;

    /* JADX INFO: renamed from: c */
    public final C15585b f6386c;

    /* JADX INFO: renamed from: d */
    public final C15553a f6387d;

    /* JADX INFO: renamed from: e */
    public final C21567b f6388e;

    /* JADX INFO: renamed from: f */
    public final long f6389f;

    /* JADX INFO: renamed from: g */
    public final long f6390g;

    public DashMediaSource$Factory(InterfaceC40169e interfaceC40169e) {
        C0682h0 c0682h0 = new C0682h0(interfaceC40169e);
        this.f6384a = c0682h0;
        this.f6385b = interfaceC40169e;
        this.f6386c = new C15585b();
        this.f6388e = new C21567b(17);
        this.f6389f = 30000L;
        this.f6390g = 5000000L;
        this.f6387d = new C15553a(19);
        ((C5327g1) c0682h0.f2434z).f21694w = true;
    }

    @Override // p299l9.InterfaceC23485b0
    /* JADX INFO: renamed from: a */
    public final void mo5055a(C21567b c21567b) {
        C5327g1 c5327g1 = (C5327g1) this.f6384a.f2434z;
        c5327g1.getClass();
        c5327g1.f21695x = c21567b;
    }

    @Override // p299l9.InterfaceC23485b0
    /* JADX INFO: renamed from: b */
    public final AbstractC23481a mo5056b(C34626x c34626x) {
        c34626x.f145867b.getClass();
        C14263e c14263e = new C14263e();
        List list = c34626x.f145867b.f145854c;
        return new C12869h(c34626x, this.f6385b, !list.isEmpty() ? new C20378c(22, c14263e, list) : c14263e, this.f6384a, this.f6387d, this.f6386c.m43882b(c34626x), this.f6388e, this.f6389f, this.f6390g);
    }

    @Override // p299l9.InterfaceC23485b0
    /* JADX INFO: renamed from: c */
    public final void mo5057c() {
        ((C5327g1) this.f6384a.f2434z).getClass();
    }

    @Override // p299l9.InterfaceC23485b0
    /* JADX INFO: renamed from: d */
    public final void mo5058d(boolean z4) {
        ((C5327g1) this.f6384a.f2434z).f21694w = z4;
    }
}
