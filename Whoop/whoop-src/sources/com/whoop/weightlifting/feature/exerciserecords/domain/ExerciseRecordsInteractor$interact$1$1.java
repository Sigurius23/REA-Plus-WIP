package com.whoop.weightlifting.feature.exerciserecords.domain;

import c93.InterfaceC4351m;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.exerciserecords.domain.ExerciseRecordsInteractor$interact$1$1", m100430f = "ExerciseRecordsInteractor.kt", m100431l = {25, 26, 26}, m100432m = "invokeSuspend", m100433v = 2)
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
public final class ExerciseRecordsInteractor$interact$1$1 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ ExerciseRecordsDomainAction $action;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ExerciseRecordsInteractor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExerciseRecordsInteractor$interact$1$1(ExerciseRecordsDomainAction exerciseRecordsDomainAction, ExerciseRecordsInteractor exerciseRecordsInteractor, InterfaceC30057d<? super ExerciseRecordsInteractor$interact$1$1> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.$action = exerciseRecordsDomainAction;
        this.this$0 = exerciseRecordsInteractor;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        ExerciseRecordsInteractor$interact$1$1 exerciseRecordsInteractor$interact$1$1 = new ExerciseRecordsInteractor$interact$1$1(this.$action, this.this$0, interfaceC30057d);
        exerciseRecordsInteractor$interact$1$1.L$0 = obj;
        return exerciseRecordsInteractor$interact$1$1;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ((ExerciseRecordsInteractor$interact$1$1) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
    
        if (r0.emit(r15, r14) == r1) goto L20;
     */
    @Override // s83.AbstractC32267a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.L$0
            ec3.m r0 = (ec3.InterfaceC13062m) r0
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r14.label
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L2e
            if (r2 == r5) goto L2a
            if (r2 == r4) goto L21
            if (r2 != r3) goto L19
            p505ts.AbstractC34132o.m107864I(r15)
            r11 = r14
            goto L73
        L19:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L21:
            java.lang.Object r0 = r14.L$1
            ec3.m r0 = (ec3.InterfaceC13062m) r0
            p505ts.AbstractC34132o.m107864I(r15)
            r11 = r14
            goto L66
        L2a:
            p505ts.AbstractC34132o.m107864I(r15)
            goto L4a
        L2e:
            p505ts.AbstractC34132o.m107864I(r15)
            com.whoop.weightlifting.feature.exerciserecords.domain.ExerciseRecordsInternalAction$Loading r15 = new com.whoop.weightlifting.feature.exerciserecords.domain.ExerciseRecordsInternalAction$Loading
            com.whoop.weightlifting.feature.exerciserecords.domain.ExerciseRecordsDomainAction r2 = r14.$action
            com.whoop.weightlifting.feature.exerciserecords.domain.ExerciseRecordsDomainAction$LoadInitial r2 = (com.whoop.weightlifting.feature.exerciserecords.domain.ExerciseRecordsDomainAction.LoadInitial) r2
            java.lang.String r2 = r2.getPath()
            r15.<init>(r2)
            r14.L$0 = r0
            r14.label = r5
            java.lang.Object r15 = r0.emit(r15, r14)
            if (r15 != r1) goto L4a
            r11 = r14
            goto L72
        L4a:
            com.whoop.weightlifting.feature.exerciserecords.domain.ExerciseRecordsInteractor r7 = r14.this$0
            com.whoop.weightlifting.feature.exerciserecords.domain.ExerciseRecordsDomainAction r15 = r14.$action
            com.whoop.weightlifting.feature.exerciserecords.domain.ExerciseRecordsDomainAction$LoadInitial r15 = (com.whoop.weightlifting.feature.exerciserecords.domain.ExerciseRecordsDomainAction.LoadInitial) r15
            java.lang.String r8 = r15.getPath()
            r14.L$0 = r6
            r14.L$1 = r0
            r14.label = r4
            r9 = 0
            r10 = 0
            r12 = 4
            r13 = 0
            r11 = r14
            java.lang.Object r15 = com.whoop.weightlifting.feature.exerciserecords.domain.ExerciseRecordsInteractor.fetchPage$default(r7, r8, r9, r10, r11, r12, r13)
            if (r15 != r1) goto L66
            goto L72
        L66:
            r11.L$0 = r6
            r11.L$1 = r6
            r11.label = r3
            java.lang.Object r15 = r0.emit(r15, r14)
            if (r15 != r1) goto L73
        L72:
            return r1
        L73:
            l83.a0 r15 = l83.C23454a0.f92919a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.weightlifting.feature.exerciserecords.domain.ExerciseRecordsInteractor$interact$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
