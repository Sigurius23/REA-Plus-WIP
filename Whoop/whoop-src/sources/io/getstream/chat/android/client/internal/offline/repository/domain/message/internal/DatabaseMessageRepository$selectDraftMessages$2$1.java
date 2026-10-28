package io.getstream.chat.android.client.internal.offline.repository.domain.message.internal;

import c93.InterfaceC4351m;
import io.getstream.chat.android.models.Message;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.C22672i;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* synthetic */ class DatabaseMessageRepository$selectDraftMessages$2$1 extends C22672i implements InterfaceC4351m {
    public DatabaseMessageRepository$selectDraftMessages$2$1(Object obj) {
        super(2, 0, DatabaseMessageRepository.class, obj, "selectMessage", "selectMessage(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(String str, InterfaceC30057d<? super Message> interfaceC30057d) {
        return ((DatabaseMessageRepository) this.receiver).selectMessage(str, interfaceC30057d);
    }
}
