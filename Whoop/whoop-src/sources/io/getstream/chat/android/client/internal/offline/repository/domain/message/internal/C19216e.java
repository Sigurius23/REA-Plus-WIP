package io.getstream.chat.android.client.internal.offline.repository.domain.message.internal;

import l83.C23454a0;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.e */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C19216e implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73845w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ MessageDao_Impl f73846x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ MessageInnerEntity f73847y;

    public /* synthetic */ C19216e(MessageDao_Impl messageDao_Impl, MessageInnerEntity messageInnerEntity, int i13) {
        this.f73845w = i13;
        this.f73846x = messageDao_Impl;
        this.f73847y = messageInnerEntity;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f73845w) {
            case 0:
                MessageDao_Impl.updateMessageInnerEntity$lambda$5(this.f73846x, this.f73847y, (InterfaceC33687a) obj);
                return C23454a0.f92919a;
            default:
                return Long.valueOf(MessageDao_Impl.insertMessageInnerEntity$lambda$0(this.f73846x, this.f73847y, (InterfaceC33687a) obj));
        }
    }
}
