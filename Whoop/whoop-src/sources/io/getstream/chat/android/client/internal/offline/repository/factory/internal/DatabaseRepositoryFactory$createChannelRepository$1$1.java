package io.getstream.chat.android.client.internal.offline.repository.factory.internal;

import c93.InterfaceC4351m;
import io.getstream.chat.android.client.persistance.repository.MessageRepository;
import io.getstream.chat.android.models.DraftMessage;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.C22672i;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* synthetic */ class DatabaseRepositoryFactory$createChannelRepository$1$1 extends C22672i implements InterfaceC4351m {
    public DatabaseRepositoryFactory$createChannelRepository$1$1(Object obj) {
        super(2, 0, MessageRepository.class, obj, "selectDraftMessagesByCid", "selectDraftMessagesByCid(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(String str, InterfaceC30057d<? super DraftMessage> interfaceC30057d) {
        return ((MessageRepository) this.receiver).selectDraftMessagesByCid(str, interfaceC30057d);
    }
}
