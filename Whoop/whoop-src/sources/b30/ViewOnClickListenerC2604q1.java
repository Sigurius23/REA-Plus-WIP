package b30;

import android.view.View;
import c93.InterfaceC4339a;
import io.getstream.chat.android.p226ui.feature.channels.header.ChannelListHeaderView;

/* JADX INFO: renamed from: b30.q1 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ViewOnClickListenerC2604q1 implements View.OnClickListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f10145w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f10146x;

    public /* synthetic */ ViewOnClickListenerC2604q1(InterfaceC4339a interfaceC4339a, int i13) {
        this.f10145w = i13;
        this.f10146x = interfaceC4339a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f10145w;
        InterfaceC4339a interfaceC4339a = this.f10146x;
        switch (i13) {
            case 0:
                interfaceC4339a.invoke();
                break;
            case 1:
                int i14 = ChannelListHeaderView.f74479w;
                interfaceC4339a.invoke();
                break;
            case 2:
                int i15 = ChannelListHeaderView.f74479w;
                interfaceC4339a.invoke();
                break;
            default:
                interfaceC4339a.invoke();
                break;
        }
    }
}
