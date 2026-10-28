package hn;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;
import com.google.android.exoplayer2.ExoPlaybackException;
import mo.C25727h;
import mo.C25728i;
import p309lo.AbstractC24567y;

/* JADX INFO: renamed from: hn.a */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C17493a implements MediaCodec.OnFrameRenderedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67610a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C25727h f67611b;

    public /* synthetic */ C17493a(InterfaceC17503k interfaceC17503k, C25727h c25727h, int i13) {
        this.f67610a = i13;
        this.f67611b = c25727h;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j7, long j13) {
        switch (this.f67610a) {
            case 0:
                C25727h c25727h = this.f67611b;
                Handler handler = c25727h.f101360x;
                if (AbstractC24567y.f95875a < 30) {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j7 >> 32), (int) j7));
                    break;
                } else {
                    C25728i c25728i = (C25728i) c25727h.f101361y;
                    if (c25727h == c25728i.f101376L1) {
                        if (j7 == Long.MAX_VALUE) {
                            c25728i.f67701X0 = true;
                        } else {
                            try {
                                c25728i.m49742n0(j7);
                                c25728i.m75863v0();
                                c25728i.f67705Z0.f11170f++;
                                c25728i.m75862u0();
                                c25728i.mo49723X(j7);
                            } catch (ExoPlaybackException e5) {
                                c25728i.f67703Y0 = e5;
                                return;
                            }
                        }
                        break;
                    }
                }
                break;
            default:
                C25727h c25727h2 = this.f67611b;
                Handler handler2 = c25727h2.f101360x;
                if (AbstractC24567y.f95875a < 30) {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j7 >> 32), (int) j7));
                    break;
                } else {
                    C25728i c25728i2 = (C25728i) c25727h2.f101361y;
                    if (c25727h2 == c25728i2.f101376L1) {
                        if (j7 == Long.MAX_VALUE) {
                            c25728i2.f67701X0 = true;
                        } else {
                            try {
                                c25728i2.m49742n0(j7);
                                c25728i2.m75863v0();
                                c25728i2.f67705Z0.f11170f++;
                                c25728i2.m75862u0();
                                c25728i2.mo49723X(j7);
                            } catch (ExoPlaybackException e13) {
                                c25728i2.f67703Y0 = e13;
                            }
                        }
                        break;
                    }
                }
                break;
        }
    }
}
