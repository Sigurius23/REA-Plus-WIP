package io.getstream.chat.android.p226ui.viewmodel.messages;

import c93.InterfaceC4339a;
import l83.C23454a0;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.viewmodel.messages.d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19940d implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74869w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f74870x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC4339a f74871y;

    public /* synthetic */ C19940d(int i13, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
        this.f74869w = i13;
        this.f74870x = interfaceC4339a;
        this.f74871y = interfaceC4339a2;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f74869w) {
            case 0:
                MessageComposerViewModelBinding.and$lambda$4(this.f74870x, this.f74871y);
                break;
            default:
                this.f74870x.invoke();
                this.f74871y.invoke();
                break;
        }
        return C23454a0.f92919a;
    }
}
