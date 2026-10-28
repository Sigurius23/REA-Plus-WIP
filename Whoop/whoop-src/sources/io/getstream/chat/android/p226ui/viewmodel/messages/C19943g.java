package io.getstream.chat.android.p226ui.viewmodel.messages;

import l83.C23454a0;
import n23.AbstractC26202e;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.viewmodel.messages.g */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19943g implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74876w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ MessageListViewModel f74877x;

    public /* synthetic */ C19943g(MessageListViewModel messageListViewModel, int i13) {
        this.f74876w = i13;
        this.f74877x = messageListViewModel;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f74876w) {
            case 0:
                MessageListViewModel.C199271.invokeSuspend$lambda$1(this.f74877x, (MessageListViewModel.State) obj);
                break;
            case 1:
                MessageListViewModel.onEvent$lambda$9(this.f74877x, (AbstractC26202e) obj);
                break;
            default:
                MessageListViewModel.onEvent$lambda$11(this.f74877x, (AbstractC26202e) obj);
                break;
        }
        return C23454a0.f92919a;
    }
}
