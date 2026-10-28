package io.getstream.chat.android.p226ui.common.feature.messages.list;

import n23.AbstractC26205h;
import o23.InterfaceC27471a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.list.f */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19590f implements InterfaceC27471a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74460w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f74461x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ MessageListController f74462y;

    public /* synthetic */ C19590f(Function1 function1, MessageListController messageListController, int i13) {
        this.f74460w = i13;
        this.f74461x = function1;
        this.f74462y = messageListController;
    }

    @Override // o23.InterfaceC27471a
    public final void onResult(AbstractC26205h abstractC26205h) {
        switch (this.f74460w) {
            case 0:
                MessageListController.flagMessage$lambda$94(this.f74461x, this.f74462y, abstractC26205h);
                break;
            default:
                MessageListController.markUnread$lambda$98$lambda$97(this.f74461x, this.f74462y, abstractC26205h);
                break;
        }
    }
}
