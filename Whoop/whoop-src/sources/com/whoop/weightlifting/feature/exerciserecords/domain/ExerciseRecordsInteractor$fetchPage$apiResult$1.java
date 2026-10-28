package com.whoop.weightlifting.feature.exerciserecords.domain;

import com.whoop.weightlifting.feature.exerciserecords.domain.models.ExerciseRecordsResponse;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.exerciserecords.domain.ExerciseRecordsInteractor$fetchPage$apiResult$1", m100430f = "ExerciseRecordsInteractor.kt", m100431l = {83}, m100432m = "invokeSuspend", m100433v = 2)
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Lcom/whoop/weightlifting/feature/exerciserecords/domain/models/ExerciseRecordsResponse;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
public final class ExerciseRecordsInteractor$fetchPage$apiResult$1 extends AbstractC32275i implements Function1 {
    final /* synthetic */ String $path;
    final /* synthetic */ String $startDate;
    int label;
    final /* synthetic */ ExerciseRecordsInteractor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExerciseRecordsInteractor$fetchPage$apiResult$1(ExerciseRecordsInteractor exerciseRecordsInteractor, String str, String str2, InterfaceC30057d<? super ExerciseRecordsInteractor$fetchPage$apiResult$1> interfaceC30057d) {
        super(1, interfaceC30057d);
        this.this$0 = exerciseRecordsInteractor;
        this.$path = str;
        this.$startDate = str2;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
        return new ExerciseRecordsInteractor$fetchPage$apiResult$1(this.this$0, this.$path, this.$startDate, interfaceC30057d);
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
        ExerciseRecordsApi exerciseRecordsApi = this.this$0.api;
        String str = this.$path;
        String str2 = this.$startDate;
        this.label = 1;
        Object exerciseRecords = exerciseRecordsApi.getExerciseRecords(str, str2, this);
        return exerciseRecords == enumC31071a ? enumC31071a : exerciseRecords;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC30057d<? super C29218v0<ExerciseRecordsResponse>> interfaceC30057d) {
        return ((ExerciseRecordsInteractor$fetchPage$apiResult$1) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }
}
