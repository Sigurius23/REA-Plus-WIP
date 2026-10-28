package as1;

import android.widget.NumberPicker;
import b72.AbstractC2784b;
import bl2.C3375d;
import com.whoop.journal.view.fragment.JournalSurveyAnswerFragment;
import cp0.AbstractC10979m1;
import io.getstream.chat.android.client.channel.state.ChannelState;
import io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.ChannelDao_Impl;
import io.getstream.chat.android.client.internal.state.sync.internal.SyncManager;
import io.getstream.chat.android.p226ui.common.feature.messages.list.MessageListController;
import java.util.Set;
import l83.C23454a0;
import l83.C23465k;
import n23.AbstractC26202e;
import n42.C26278b;
import o42.AbstractC27531k;
import p270k2.InterfaceC22129c;
import p329n0.InterfaceC26064q;
import p500tb.InterfaceC33687a;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39104j1;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.functions.Function1;
import pg3.C29218v0;
import w71.AbstractC36877d;
import x21.AbstractC37861d;
import x21.C37858a;
import y11.AbstractC39050c;

/* JADX INFO: renamed from: as1.f */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C1945f implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f7734w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f7735x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f7736y;

    public /* synthetic */ C1945f(Object obj, boolean z4, int i13) {
        this.f7734w = i13;
        this.f7736y = obj;
        this.f7735x = z4;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        switch (this.f7734w) {
            case 0:
                return JournalSurveyAnswerFragment.m22346h0((JournalSurveyAnswerFragment) this.f7736y, this.f7735x, (AbstractC36877d) obj);
            case 1:
                return AbstractC2784b.m7912u(this.f7735x, (InterfaceC39171c) this.f7736y, (InterfaceC22129c) obj);
            case 2:
                return C3375d.m9747L((C3375d) this.f7736y, this.f7735x, (C29218v0) obj);
            case 3:
                return AbstractC10979m1.m29261m(this.f7735x, (AbstractC39104j1) this.f7736y, (AbstractC39101i1) obj);
            case 4:
                ChannelDao_Impl.setHidden$lambda$13("UPDATE stream_chat_channel_state SET hidden = ? WHERE cid = ?", this.f7735x, (String) this.f7736y, (InterfaceC33687a) obj);
                return C23454a0.f92919a;
            case 5:
                return Boolean.valueOf(SyncManager.updateActiveChannels$lambda$68(this.f7735x, (Set) this.f7736y, (ChannelState) obj));
            case 6:
                MessageListController.deleteMessage$lambda$79((MessageListController) this.f7736y, this.f7735x, (AbstractC26202e) obj);
                return C23454a0.f92919a;
            case 7:
                return AbstractC27531k.m82981O(this.f7735x, (C26278b) this.f7736y, (InterfaceC26064q) obj);
            case 8:
                return AbstractC37861d.m121405r(this.f7735x, (C37858a) this.f7736y, (NumberPicker) obj);
            default:
                return AbstractC39050c.m124480i(this.f7735x, (C23465k[]) this.f7736y, (InterfaceC22129c) obj);
        }
    }

    public /* synthetic */ C1945f(boolean z4, Object obj, int i13) {
        this.f7734w = i13;
        this.f7735x = z4;
        this.f7736y = obj;
    }
}
