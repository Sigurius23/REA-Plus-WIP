package io.getstream.chat.android.p226ui.feature.messages.header;

import android.view.View;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.header.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC19722a implements View.OnClickListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74588w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ ChannelHeaderView.OnClickListener f74589x;

    public /* synthetic */ ViewOnClickListenerC19722a(ChannelHeaderView.OnClickListener onClickListener, int i13) {
        this.f74588w = i13;
        this.f74589x = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f74588w;
        ChannelHeaderView.OnClickListener onClickListener = this.f74589x;
        switch (i13) {
            case 0:
                int i14 = ChannelHeaderView.f74587w;
                onClickListener.onClick();
                break;
            case 1:
                int i15 = ChannelHeaderView.f74587w;
                onClickListener.onClick();
                break;
            case 2:
                int i16 = ChannelHeaderView.f74587w;
                onClickListener.onClick();
                break;
            case 3:
                int i17 = ChannelHeaderView.f74587w;
                onClickListener.onClick();
                break;
            default:
                int i18 = ChannelHeaderView.f74587w;
                onClickListener.onClick();
                break;
        }
    }
}
