package hn;

import android.os.HandlerThread;
import p215i9.C18226b;
import p658yr.InterfaceC39722i;

/* JADX INFO: renamed from: hn.b */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C17494b implements InterfaceC39722i {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f67612w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f67613x;

    public /* synthetic */ C17494b(int i13, int i14) {
        this.f67612w = i14;
        this.f67613x = i13;
    }

    @Override // p658yr.InterfaceC39722i
    public final Object get() {
        switch (this.f67612w) {
            case 0:
                return new HandlerThread(C17495c.m49685h(this.f67613x, "ExoPlayer:MediaCodecAsyncAdapter:"));
            case 1:
                return new HandlerThread(C17495c.m49685h(this.f67613x, "ExoPlayer:MediaCodecQueueingThread:"));
            case 2:
                return new HandlerThread(C18226b.m52482m(this.f67613x, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(C18226b.m52482m(this.f67613x, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
