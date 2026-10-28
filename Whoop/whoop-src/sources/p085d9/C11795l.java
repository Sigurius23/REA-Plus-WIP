package p085d9;

import android.media.AudioTrack;
import io.getstream.chat.android.client.ChatClient;
import p309lo.AbstractC24567y;
import tm.C33932j;

/* JADX INFO: renamed from: d9.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C11795l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38255a;

    /* JADX INFO: renamed from: b */
    public int f38256b;

    /* JADX INFO: renamed from: c */
    public long f38257c;

    /* JADX INFO: renamed from: d */
    public long f38258d;

    /* JADX INFO: renamed from: e */
    public long f38259e;

    /* JADX INFO: renamed from: f */
    public long f38260f;

    /* JADX INFO: renamed from: g */
    public final Object f38261g;

    public C11795l(AudioTrack audioTrack, int i13) {
        this.f38255a = i13;
        switch (i13) {
            case 1:
                if (AbstractC24567y.f95875a < 19) {
                    this.f38261g = null;
                    m31611b(3);
                } else {
                    this.f38261g = new C33932j(audioTrack);
                    m31610a();
                }
                break;
            default:
                this.f38261g = new C11794k(audioTrack);
                m31610a();
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m31610a() {
        switch (this.f38255a) {
            case 0:
                if (((C11794k) this.f38261g) != null) {
                    m31611b(0);
                }
                break;
            default:
                if (((C33932j) this.f38261g) != null) {
                    m31611b(0);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m31611b(int i13) {
        switch (this.f38255a) {
            case 0:
                this.f38256b = i13;
                if (i13 == 0) {
                    this.f38259e = 0L;
                    this.f38260f = -1L;
                    this.f38257c = System.nanoTime() / 1000;
                    this.f38258d = ChatClient.RESOLVE_DEPENDENCY_TIMEOUT;
                    return;
                }
                if (i13 == 1) {
                    this.f38258d = ChatClient.RESOLVE_DEPENDENCY_TIMEOUT;
                    return;
                }
                if (i13 == 2 || i13 == 3) {
                    this.f38258d = 10000000L;
                    return;
                } else {
                    if (i13 != 4) {
                        throw new IllegalStateException();
                    }
                    this.f38258d = 500000L;
                    return;
                }
            default:
                this.f38256b = i13;
                if (i13 == 0) {
                    this.f38259e = 0L;
                    this.f38260f = -1L;
                    this.f38257c = System.nanoTime() / 1000;
                    this.f38258d = ChatClient.RESOLVE_DEPENDENCY_TIMEOUT;
                    return;
                }
                if (i13 == 1) {
                    this.f38258d = ChatClient.RESOLVE_DEPENDENCY_TIMEOUT;
                    return;
                }
                if (i13 == 2 || i13 == 3) {
                    this.f38258d = 10000000L;
                    return;
                } else {
                    if (i13 != 4) {
                        throw new IllegalStateException();
                    }
                    this.f38258d = 500000L;
                    return;
                }
        }
    }
}
