package io.getstream.chat.android.client.internal.state.plugin.factory;

import io.getstream.chat.android.client.internal.state.sync.internal.SyncManager;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.C22672i;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* synthetic */ class StreamStatePluginFactory$createStatePlugin$eventHandler$1 extends C22672i implements Function1 {
    public StreamStatePluginFactory$createStatePlugin$eventHandler$1(Object obj) {
        super(1, 0, SyncManager.class, obj, "awaitSyncing", "awaitSyncing(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ((SyncManager) this.receiver).awaitSyncing(interfaceC30057d);
    }
}
