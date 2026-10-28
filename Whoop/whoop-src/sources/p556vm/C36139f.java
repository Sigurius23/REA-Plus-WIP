package p556vm;

import android.os.Looper;
import com.google.android.exoplayer2.drm.DrmSession$DrmSessionException;
import com.google.android.exoplayer2.drm.UnsupportedDrmException;
import live.hms.video.error.ErrorCodes;
import p465rm.C31521c0;
import p508ty.C34249c;
import sm.C32713f;
import sn.C32770z;

/* JADX INFO: renamed from: vm.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C36139f implements InterfaceC36141h {
    @Override // p556vm.InterfaceC36141h
    /* JADX INFO: renamed from: a */
    public final C34249c mo114964a(C32770z c32770z, C31521c0 c31521c0) {
        if (c31521c0.f130080O == null) {
            return null;
        }
        return new C34249c(new DrmSession$DrmSessionException(ErrorCodes.GenericErrors.cSignalling, new UnsupportedDrmException()), 12);
    }

    @Override // p556vm.InterfaceC36141h
    /* JADX INFO: renamed from: b */
    public final int mo114965b(C31521c0 c31521c0) {
        return c31521c0.f130080O != null ? 1 : 0;
    }

    @Override // p556vm.InterfaceC36141h
    /* JADX INFO: renamed from: c */
    public final void mo114966c(Looper looper, C32713f c32713f) {
    }
}
