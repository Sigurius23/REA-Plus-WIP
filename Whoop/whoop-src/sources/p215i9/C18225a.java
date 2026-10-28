package p215i9;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;
import mo.C25727h;
import p607x8.AbstractC38065t;

/* JADX INFO: renamed from: i9.a */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18225a implements MediaCodec.OnFrameRenderedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f70903a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C25727h f70904b;

    public /* synthetic */ C18225a(InterfaceC18235k interfaceC18235k, C25727h c25727h, int i13) {
        this.f70903a = i13;
        this.f70904b = c25727h;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j7, long j13) {
        switch (this.f70903a) {
            case 0:
                C25727h c25727h = this.f70904b;
                Handler handler = c25727h.f101360x;
                if (AbstractC38065t.f163031a >= 30) {
                    c25727h.m75848a(j7);
                } else {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j7 >> 32), (int) j7));
                }
                break;
            default:
                C25727h c25727h2 = this.f70904b;
                Handler handler2 = c25727h2.f101360x;
                if (AbstractC38065t.f163031a >= 30) {
                    c25727h2.m75848a(j7);
                } else {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j7 >> 32), (int) j7));
                }
                break;
        }
    }
}
