package hn;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import p215i9.InterfaceC18241q;

/* JADX INFO: renamed from: hn.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C17511s implements InterfaceC17510r, InterfaceC18241q {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f67742w = 0;

    /* JADX INFO: renamed from: x */
    public final int f67743x;

    /* JADX INFO: renamed from: y */
    public MediaCodecInfo[] f67744y;

    public C17511s(boolean z4, boolean z13, boolean z14) {
        this.f67743x = (z4 || z13 || z14) ? 1 : 0;
    }

    @Override // hn.InterfaceC17510r, p215i9.InterfaceC18241q
    /* JADX INFO: renamed from: a */
    public final MediaCodecInfo mo43794a(int i13) {
        switch (this.f67742w) {
            case 0:
                if (this.f67744y == null) {
                    this.f67744y = new MediaCodecList(this.f67743x).getCodecInfos();
                }
                break;
            default:
                if (this.f67744y == null) {
                    this.f67744y = new MediaCodecList(this.f67743x).getCodecInfos();
                }
                break;
        }
        return this.f67744y[i13];
    }

    @Override // hn.InterfaceC17510r, p215i9.InterfaceC18241q
    /* JADX INFO: renamed from: c */
    public final boolean mo43795c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        switch (this.f67742w) {
            case 0:
                break;
        }
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // hn.InterfaceC17510r, p215i9.InterfaceC18241q
    /* JADX INFO: renamed from: d */
    public final boolean mo43796d(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        switch (this.f67742w) {
            case 0:
                break;
        }
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // hn.InterfaceC17510r, p215i9.InterfaceC18241q
    /* JADX INFO: renamed from: f */
    public final int mo43797f() {
        switch (this.f67742w) {
            case 0:
                if (this.f67744y == null) {
                    this.f67744y = new MediaCodecList(this.f67743x).getCodecInfos();
                }
                break;
            default:
                if (this.f67744y == null) {
                    this.f67744y = new MediaCodecList(this.f67743x).getCodecInfos();
                }
                break;
        }
        return this.f67744y.length;
    }

    @Override // hn.InterfaceC17510r, p215i9.InterfaceC18241q
    /* JADX INFO: renamed from: g */
    public final boolean mo43798g() {
        switch (this.f67742w) {
        }
        return true;
    }

    public C17511s(boolean z4, boolean z13) {
        this.f67743x = (z4 || z13) ? 1 : 0;
    }
}
