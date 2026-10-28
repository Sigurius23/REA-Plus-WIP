package p133f1;

import c93.InterfaceC4339a;
import io.getstream.chat.android.client.api.internal.DistinctChatApi;
import io.getstream.chat.android.client.audio.StreamAudioPlayer;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal.MediaAttachmentView;
import java.util.Map;
import l83.C23454a0;
import o23.C27488r;
import p078d1.C11457j;
import p219ig.C18459d;
import p647yf.C39496i;
import p647yf.C39498k;
import rq0.C31672i;

/* JADX INFO: renamed from: f1.x */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C13990x implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f49927w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f49928x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f49929y;

    public /* synthetic */ C13990x(int i13, MediaAttachmentView mediaAttachmentView) {
        this.f49927w = 4;
        this.f49928x = i13;
        this.f49929y = mediaAttachmentView;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f49927w) {
            case 0:
                return Integer.valueOf(((C13972r) this.f49929y).f49820f.f92228b.m67374d(this.f49928x));
            case 1:
                C11457j c11457j = (C11457j) this.f49929y;
                int i13 = this.f49928x;
                C39498k c39498k = ((C18459d) c11457j.f36753x).f71883w;
                String string = Integer.valueOf(i13).toString();
                c39498k.mo126148z(string.length(), string);
                return C23454a0.f92919a;
            case 2:
                DistinctChatApi.getOrCreate$lambda$22((DistinctChatApi) this.f49929y, this.f49928x);
                return C23454a0.f92919a;
            case 3:
                StreamAudioPlayer.m54636c((StreamAudioPlayer) this.f49929y, this.f49928x);
                return C23454a0.f92919a;
            case 4:
                MediaAttachmentView.showAttachment$lambda$5(this.f49928x, (MediaAttachmentView) this.f49929y);
                return C23454a0.f92919a;
            case 5:
                ((Map) ((C27488r) this.f49929y).f110726w.m1814a()).remove(Integer.valueOf(this.f49928x));
                return C23454a0.f92919a;
            case 6:
                return C31672i.m98052g((C31672i) this.f49929y, this.f49928x);
            default:
                C39496i c39496i = (C39496i) this.f49929y;
                return Boolean.valueOf(c39496i.f169911y.f174964b < this.f49928x && !c39496i.mo106286h());
        }
    }

    public /* synthetic */ C13990x(Object obj, int i13, int i14) {
        this.f49927w = i14;
        this.f49929y = obj;
        this.f49928x = i13;
    }
}
