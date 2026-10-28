package io.getstream.chat.android.client.internal.offline.repository.domain.message.internal;

import java.util.List;
import l83.C23454a0;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.c */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C19214c implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73838w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ MessageDao_Impl f73839x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ List f73840y;

    public /* synthetic */ C19214c(MessageDao_Impl messageDao_Impl, List list, int i13) {
        this.f73838w = i13;
        this.f73839x = messageDao_Impl;
        this.f73840y = list;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f73838w) {
            case 0:
                MessageDao_Impl.insertAttachments$lambda$2(this.f73839x, this.f73840y, (InterfaceC33687a) obj);
                return C23454a0.f92919a;
            case 1:
                return MessageDao_Impl.insertMessageInnerEntities$lambda$1(this.f73839x, this.f73840y, (InterfaceC33687a) obj);
            case 2:
                MessageDao_Impl.insertReactions$lambda$3(this.f73839x, this.f73840y, (InterfaceC33687a) obj);
                return C23454a0.f92919a;
            default:
                MessageDao_Impl.deleteAttachments$lambda$6(this.f73839x, this.f73840y, (InterfaceC33687a) obj);
                return C23454a0.f92919a;
        }
    }
}
