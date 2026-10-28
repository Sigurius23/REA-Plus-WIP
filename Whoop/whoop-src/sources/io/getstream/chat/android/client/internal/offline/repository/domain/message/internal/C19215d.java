package io.getstream.chat.android.client.internal.offline.repository.domain.message.internal;

import io.getstream.chat.android.models.SyncStatus;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.d */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C19215d implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73841w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ MessageDao_Impl f73842x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ SyncStatus f73843y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f73844z;

    public /* synthetic */ C19215d(MessageDao_Impl messageDao_Impl, SyncStatus syncStatus, int i13, int i14) {
        this.f73841w = i14;
        this.f73842x = messageDao_Impl;
        this.f73843y = syncStatus;
        this.f73844z = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f73841w) {
            case 0:
                return MessageDao_Impl.m54727r(this.f73842x, this.f73843y, this.f73844z, (InterfaceC33687a) obj);
            default:
                return MessageDao_Impl.m54734y(this.f73842x, this.f73843y, this.f73844z, (InterfaceC33687a) obj);
        }
    }
}
