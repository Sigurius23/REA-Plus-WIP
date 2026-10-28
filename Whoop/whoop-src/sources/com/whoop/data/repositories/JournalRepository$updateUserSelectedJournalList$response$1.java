package com.whoop.data.repositories;

import com.whoop.service.network.JournalApi;
import java.util.ArrayList;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes8.dex */
@InterfaceC32271e(m100429c = "com.whoop.data.repositories.JournalRepository$updateUserSelectedJournalList$response$1", m100430f = "JournalRepository.kt", m100431l = {107}, m100432m = "invokeSuspend", m100433v = 2)
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
public final class JournalRepository$updateUserSelectedJournalList$response$1 extends AbstractC32275i implements Function1 {
    final /* synthetic */ ArrayList<Integer> $listOfSelectedJournals;
    int label;
    final /* synthetic */ JournalRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JournalRepository$updateUserSelectedJournalList$response$1(JournalRepository journalRepository, ArrayList<Integer> arrayList, InterfaceC30057d<? super JournalRepository$updateUserSelectedJournalList$response$1> interfaceC30057d) {
        super(1, interfaceC30057d);
        this.this$0 = journalRepository;
        this.$listOfSelectedJournals = arrayList;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
        return new JournalRepository$updateUserSelectedJournalList$response$1(this.this$0, this.$listOfSelectedJournals, interfaceC30057d);
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
        ArrayList<Integer> arrayList = this.$listOfSelectedJournals;
        this.label = 1;
        Object objUpdateUserSelectedJournalBehaviors = journalApi.updateUserSelectedJournalBehaviors(arrayList, this);
        return objUpdateUserSelectedJournalBehaviors == enumC31071a ? enumC31071a : objUpdateUserSelectedJournalBehaviors;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
        return ((JournalRepository$updateUserSelectedJournalList$response$1) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }
}
