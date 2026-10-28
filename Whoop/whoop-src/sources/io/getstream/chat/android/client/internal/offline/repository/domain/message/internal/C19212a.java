package io.getstream.chat.android.client.internal.offline.repository.domain.message.internal;

import io.getstream.chat.android.client.persistence.p225db.dao.MessageReceiptDao_Impl;
import java.util.List;
import ju0.C21960b;
import l83.C23454a0;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;
import uh1.C34967b;

/* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.a */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C19212a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73831w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f73832x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ List f73833y;

    public /* synthetic */ C19212a(int i13, String str, List list) {
        this.f73831w = i13;
        this.f73832x = str;
        this.f73833y = list;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        switch (this.f73831w) {
            case 0:
                MessageDao_Impl.deleteMessages$lambda$29(this.f73832x, this.f73833y, (InterfaceC33687a) obj);
                return C23454a0.f92919a;
            case 1:
                MessageDao_Impl.deleteAttachmentsChunked$lambda$24(this.f73832x, this.f73833y, (InterfaceC33687a) obj);
                return C23454a0.f92919a;
            case 2:
                MessageReceiptDao_Impl.deleteByMessageIds$lambda$2(this.f73832x, this.f73833y, (InterfaceC33687a) obj);
                return C23454a0.f92919a;
            case 3:
                return C21960b.m62694h(this.f73832x, this.f73833y, (InterfaceC33687a) obj);
            default:
                return C34967b.m110442m(this.f73832x, this.f73833y, (InterfaceC33687a) obj);
        }
    }
}
