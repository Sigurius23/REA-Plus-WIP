package com.whoop.personalrecords.miniarch.domain;

import a12.AbstractC0142b;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32271e(m100429c = "com.whoop.personalrecords.miniarch.domain.PersonalRecordsInteractor$interact$$inlined$flatMapLatest$1", m100430f = "PersonalRecordsInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
public final class PersonalRecordsInteractor$interact$$inlined$flatMapLatest$1 extends AbstractC32275i implements Function3 {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ PersonalRecordsInteractor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonalRecordsInteractor$interact$$inlined$flatMapLatest$1(InterfaceC30057d interfaceC30057d, PersonalRecordsInteractor personalRecordsInteractor) {
        super(3, interfaceC30057d);
        this.this$0 = personalRecordsInteractor;
    }

    public final Object invoke(InterfaceC13062m interfaceC13062m, PersonalRecordsDomainAction personalRecordsDomainAction, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        PersonalRecordsInteractor$interact$$inlined$flatMapLatest$1 personalRecordsInteractor$interact$$inlined$flatMapLatest$1 = new PersonalRecordsInteractor$interact$$inlined$flatMapLatest$1(interfaceC30057d, this.this$0);
        personalRecordsInteractor$interact$$inlined$flatMapLatest$1.L$0 = interfaceC13062m;
        personalRecordsInteractor$interact$$inlined$flatMapLatest$1.L$1 = personalRecordsDomainAction;
        return personalRecordsInteractor$interact$$inlined$flatMapLatest$1.invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        InterfaceC13058l interfaceC13058lLoadMoreData;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.label;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.L$0;
            PersonalRecordsDomainAction personalRecordsDomainAction = (PersonalRecordsDomainAction) this.L$1;
            if (personalRecordsDomainAction instanceof PersonalRecordsDomainAction.Refresh) {
                interfaceC13058lLoadMoreData = this.this$0.fetchData(AbstractC0142b.m360e(((PersonalRecordsDomainAction.Refresh) personalRecordsDomainAction).getPath()));
            } else {
                if (!(personalRecordsDomainAction instanceof PersonalRecordsDomainAction.LoadMore)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.this$0.analytics.m77899a();
                PersonalRecordsDomainAction.LoadMore loadMore = (PersonalRecordsDomainAction.LoadMore) personalRecordsDomainAction;
                interfaceC13058lLoadMoreData = this.this$0.loadMoreData(loadMore.getStartDate(), loadMore.getEndDate(), loadMore.getNextExerciseOffset());
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lLoadMoreData, this) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        return C23454a0.f92919a;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((InterfaceC13062m) obj, (PersonalRecordsDomainAction) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
    }
}
