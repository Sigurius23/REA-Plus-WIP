package p171g9;

import android.os.Looper;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import e10.C12554k0;
import live.hms.video.error.ErrorCodes;
import p047c9.C4323n;
import p516u8.C34610p;

/* JADX INFO: renamed from: g9.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C15589f implements InterfaceC15591h {
    @Override // p171g9.InterfaceC15591h
    /* JADX INFO: renamed from: a */
    public final int mo43889a(C34610p c34610p) {
        return c34610p.f145787r != null ? 1 : 0;
    }

    @Override // p171g9.InterfaceC15591h
    /* JADX INFO: renamed from: b */
    public final void mo43890b(Looper looper, C4323n c4323n) {
    }

    @Override // p171g9.InterfaceC15591h
    /* JADX INFO: renamed from: c */
    public final C12554k0 mo43891c(C15587d c15587d, C34610p c34610p) {
        if (c34610p.f145787r == null) {
            return null;
        }
        return new C12554k0(new DrmSession$DrmSessionException(ErrorCodes.GenericErrors.cSignalling, new UnsupportedDrmException()), 21);
    }
}
