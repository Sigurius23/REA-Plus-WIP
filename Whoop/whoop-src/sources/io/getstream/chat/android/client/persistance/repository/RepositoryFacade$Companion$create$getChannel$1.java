package io.getstream.chat.android.client.persistance.repository;

import c93.InterfaceC4351m;
import io.getstream.chat.android.models.Channel;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.C22672i;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* synthetic */ class RepositoryFacade$Companion$create$getChannel$1 extends C22672i implements InterfaceC4351m {
    public RepositoryFacade$Companion$create$getChannel$1(Object obj) {
        super(2, 0, ChannelRepository.class, obj, "selectChannel", "selectChannel(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(String str, InterfaceC30057d<? super Channel> interfaceC30057d) {
        return ((ChannelRepository) this.receiver).selectChannel(str, interfaceC30057d);
    }
}
