package io.getstream.chat.android.client.internal.offline.repository.domain.message.internal;

import java.util.List;
import l83.C23454a0;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.i */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C19220i implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73859w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ ReplyMessageDao_Impl f73860x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ List f73861y;

    public /* synthetic */ C19220i(ReplyMessageDao_Impl replyMessageDao_Impl, List list, int i13) {
        this.f73859w = i13;
        this.f73860x = replyMessageDao_Impl;
        this.f73861y = list;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f73859w) {
            case 0:
                ReplyMessageDao_Impl.insertAttachments$lambda$1(this.f73860x, this.f73861y, (InterfaceC33687a) obj);
                break;
            default:
                ReplyMessageDao_Impl.insertInnerEntity$lambda$0(this.f73860x, this.f73861y, (InterfaceC33687a) obj);
                break;
        }
        return C23454a0.f92919a;
    }
}
