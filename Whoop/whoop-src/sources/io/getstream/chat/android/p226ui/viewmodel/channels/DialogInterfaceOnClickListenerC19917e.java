package io.getstream.chat.android.p226ui.viewmodel.channels;

import android.content.DialogInterface;
import com.whoop.realtime.presentation.RealTimeFinishPromptActivity;
import io.getstream.chat.android.models.Channel;
import p92.C29016e;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.viewmodel.channels.e */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC19917e implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74851w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f74852x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f74853y;

    public /* synthetic */ DialogInterfaceOnClickListenerC19917e(int i13, Object obj, Object obj2) {
        this.f74851w = i13;
        this.f74852x = obj;
        this.f74853y = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i13) {
        switch (this.f74851w) {
            case 0:
                ChannelListViewModelBinding.bindView$lambda$11$lambda$9((ChannelListViewModel) this.f74852x, (Channel) this.f74853y, dialogInterface, i13);
                break;
            default:
                RealTimeFinishPromptActivity.m23741k0((RealTimeFinishPromptActivity) this.f74852x, (C29016e) this.f74853y, dialogInterface, i13);
                break;
        }
    }
}
