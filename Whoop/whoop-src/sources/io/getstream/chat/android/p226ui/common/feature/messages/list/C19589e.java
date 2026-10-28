package io.getstream.chat.android.p226ui.common.feature.messages.list;

import l83.C23454a0;
import n23.AbstractC26202e;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.list.e */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19589e implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74457w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ MessageListController f74458x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f74459y;

    public /* synthetic */ C19589e(MessageListController messageListController, String str, int i13) {
        this.f74457w = i13;
        this.f74458x = messageListController;
        this.f74459y = str;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f74457w) {
            case 0:
                MessageListController.markThreadAsRead$lambda$91(this.f74458x, this.f74459y, (AbstractC26202e) obj);
                break;
            default:
                MessageListController.markChannelAsRead$lambda$89(this.f74458x, this.f74459y, (AbstractC26202e) obj);
                break;
        }
        return C23454a0.f92919a;
    }
}
