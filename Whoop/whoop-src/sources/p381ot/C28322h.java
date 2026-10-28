package p381ot;

import com.google.firebase.encoders.EncodingException;
import lt.C24719b;
import lt.InterfaceC24723f;

/* JADX INFO: renamed from: ot.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C28322h implements InterfaceC24723f {

    /* JADX INFO: renamed from: a */
    public boolean f114212a = false;

    /* JADX INFO: renamed from: b */
    public boolean f114213b = false;

    /* JADX INFO: renamed from: c */
    public C24719b f114214c;

    /* JADX INFO: renamed from: d */
    public final C28320f f114215d;

    public C28322h(C28320f c28320f) {
        this.f114215d = c28320f;
    }

    @Override // lt.InterfaceC24723f
    /* JADX INFO: renamed from: c */
    public final InterfaceC24723f mo72383c(String str) {
        if (this.f114212a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f114212a = true;
        this.f114215d.m85780e(this.f114214c, str, this.f114213b);
        return this;
    }

    @Override // lt.InterfaceC24723f
    /* JADX INFO: renamed from: e */
    public final InterfaceC24723f mo72384e(boolean z4) {
        if (this.f114212a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f114212a = true;
        this.f114215d.m85779c(this.f114214c, z4 ? 1 : 0, this.f114213b);
        return this;
    }
}
