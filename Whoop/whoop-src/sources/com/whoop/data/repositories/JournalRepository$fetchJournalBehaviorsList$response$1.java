package com.whoop.data.repositories;

import com.whoop.data.remote.domain.dto.JournalsBehaviorsListResponseDto;
import com.whoop.service.network.JournalApi;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes8.dex */
@InterfaceC32271e(m100429c = "com.whoop.data.repositories.JournalRepository$fetchJournalBehaviorsList$response$1", m100430f = "JournalRepository.kt", m100431l = {96}, m100432m = "invokeSuspend", m100433v = 2)
@Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/data/remote/domain/dto/JournalsBehaviorsListResponseDto;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class JournalRepository$fetchJournalBehaviorsList$response$1 extends AbstractC32275i implements Function1 {
    int label;
    final /* synthetic */ JournalRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JournalRepository$fetchJournalBehaviorsList$response$1(JournalRepository journalRepository, InterfaceC30057d<? super JournalRepository$fetchJournalBehaviorsList$response$1> interfaceC30057d) {
        super(1, interfaceC30057d);
        this.this$0 = journalRepository;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
        return new JournalRepository$fetchJournalBehaviorsList$response$1(this.this$0, interfaceC30057d);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.label;
        if (i13 != 0) {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        AbstractC34132o.m107864I(obj);
        JournalApi journalApi = this.this$0.journalApi;
        this.label = 1;
        Object journalBehaviorsList = journalApi.getJournalBehaviorsList(this);
        return journalBehaviorsList == enumC31071a ? enumC31071a : journalBehaviorsList;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC30057d<? super JournalsBehaviorsListResponseDto> interfaceC30057d) {
        return ((JournalRepository$fetchJournalBehaviorsList$response$1) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }
}
