package q13;

import android.view.View;
import c93.InterfaceC4339a;
import io.getstream.chat.android.p226ui.feature.channels.header.ChannelListHeaderView;

/* JADX INFO: renamed from: q13.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnLongClickListenerC29804a implements View.OnLongClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f121851a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC4339a f121852b;

    public /* synthetic */ ViewOnLongClickListenerC29804a(InterfaceC4339a interfaceC4339a, int i13) {
        this.f121851a = i13;
        this.f121852b = interfaceC4339a;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i13 = this.f121851a;
        InterfaceC4339a interfaceC4339a = this.f121852b;
        switch (i13) {
            case 0:
                int i14 = ChannelListHeaderView.f74479w;
                interfaceC4339a.invoke();
                break;
            case 1:
                int i15 = ChannelListHeaderView.f74479w;
                interfaceC4339a.invoke();
                break;
            default:
                int i16 = ChannelListHeaderView.f74479w;
                interfaceC4339a.invoke();
                break;
        }
        return true;
    }
}
