package p085d9;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import p031b9.C2836h0;
import p309lo.AbstractC24543a;
import p465rm.C31573v;
import q30.C29934u0;
import ro.C31624i;
import tm.C33941s;
import tm.C33944v;

/* JADX INFO: renamed from: d9.v */
/* JADX INFO: loaded from: classes5.dex */
public final class C11805v extends AudioTrack$StreamEventCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38328a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f38329b;

    public /* synthetic */ C11805v(Object obj, int i13) {
        this.f38328a = i13;
        this.f38329b = obj;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i13) {
        C11807x c11807x;
        C31624i c31624i;
        C2836h0 c2836h0;
        C31573v c31573v;
        switch (this.f38328a) {
            case 0:
                if (audioTrack.equals(((C11807x) ((C11806w) this.f38329b).f38333d).f38393v) && (c31624i = (c11807x = (C11807x) ((C11806w) this.f38329b).f38333d).f38389r) != null && c11807x.f38358V && (c2836h0 = ((C11780a0) c31624i.f130665x).f71004f0) != null) {
                    c2836h0.m8130a();
                }
                break;
            default:
                AbstractC24543a.m71573i(audioTrack == ((C33941s) ((C11806w) this.f38329b).f38333d).f142291u);
                C33941s c33941s = (C33941s) ((C11806w) this.f38329b).f38333d;
                C29934u0 c29934u0 = c33941s.f142288r;
                if (c29934u0 != null && c33941s.f142263U && (c31573v = ((C33944v) c29934u0.f122249x).f142309o1) != null) {
                    c31573v.f130439a.f130483H.m71650c(2);
                    break;
                }
                break;
        }
    }

    public void onPresentationEnded(AudioTrack audioTrack) {
        switch (this.f38328a) {
            case 0:
                if (audioTrack.equals(((C11807x) ((C11806w) this.f38329b).f38333d).f38393v)) {
                    ((C11807x) ((C11806w) this.f38329b).f38333d).f38357U = true;
                    break;
                }
                break;
            default:
                super.onPresentationEnded(audioTrack);
                break;
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        C11807x c11807x;
        C31624i c31624i;
        C2836h0 c2836h0;
        C31573v c31573v;
        switch (this.f38328a) {
            case 0:
                if (audioTrack.equals(((C11807x) ((C11806w) this.f38329b).f38333d).f38393v) && (c31624i = (c11807x = (C11807x) ((C11806w) this.f38329b).f38333d).f38389r) != null && c11807x.f38358V && (c2836h0 = ((C11780a0) c31624i.f130665x).f71004f0) != null) {
                    c2836h0.m8130a();
                }
                break;
            default:
                AbstractC24543a.m71573i(audioTrack == ((C33941s) ((C11806w) this.f38329b).f38333d).f142291u);
                C33941s c33941s = (C33941s) ((C11806w) this.f38329b).f38333d;
                C29934u0 c29934u0 = c33941s.f142288r;
                if (c29934u0 != null && c33941s.f142263U && (c31573v = ((C33944v) c29934u0.f122249x).f142309o1) != null) {
                    c31573v.f130439a.f130483H.m71650c(2);
                    break;
                }
                break;
        }
    }
}
