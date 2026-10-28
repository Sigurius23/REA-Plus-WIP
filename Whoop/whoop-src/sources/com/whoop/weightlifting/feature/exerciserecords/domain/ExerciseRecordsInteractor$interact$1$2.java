package com.whoop.weightlifting.feature.exerciserecords.domain;

import c93.InterfaceC4351m;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.exerciserecords.domain.ExerciseRecordsInteractor$interact$1$2", m100430f = "ExerciseRecordsInteractor.kt", m100431l = {30, 33, 34, 34}, m100432m = "invokeSuspend", m100433v = 2)
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
public final class ExerciseRecordsInteractor$interact$1$2 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ ExerciseRecordsDomainAction $action;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ExerciseRecordsInteractor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExerciseRecordsInteractor$interact$1$2(ExerciseRecordsDomainAction exerciseRecordsDomainAction, ExerciseRecordsInteractor exerciseRecordsInteractor, InterfaceC30057d<? super ExerciseRecordsInteractor$interact$1$2> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.$action = exerciseRecordsDomainAction;
        this.this$0 = exerciseRecordsInteractor;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        ExerciseRecordsInteractor$interact$1$2 exerciseRecordsInteractor$interact$1$2 = new ExerciseRecordsInteractor$interact$1$2(this.$action, this.this$0, interfaceC30057d);
        exerciseRecordsInteractor$interact$1$2.L$0 = obj;
        return exerciseRecordsInteractor$interact$1$2;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ((ExerciseRecordsInteractor$interact$1$2) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0075 A[PHI: r0 r10
      0x0075: PHI (r0v2 ec3.m) = (r0v1 ec3.m), (r0v4 ec3.m) binds: [B:23:0x0072, B:11:0x0025] A[DONT_GENERATE, DONT_INLINE]
      0x0075: PHI (r10v11 java.lang.Object) = (r10v10 java.lang.Object), (r10v0 java.lang.Object) binds: [B:23:0x0072, B:11:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Exception {
        InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.L$0;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.label;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            String nextStartDate = ((ExerciseRecordsDomainAction.LoadMore) this.$action).getNextStartDate();
            if (nextStartDate == null || nextStartDate.length() == 0) {
                ExerciseRecordsInternalAction.SkipPagination skipPagination = ExerciseRecordsInternalAction.SkipPagination.INSTANCE;
                this.L$0 = null;
                this.label = 1;
                if (interfaceC13062m.emit(skipPagination, this) != enumC31071a) {
                    return c23454a0;
                }
            } else {
                ExerciseRecordsInternalAction.LoadingMore loadingMore = ExerciseRecordsInternalAction.LoadingMore.INSTANCE;
                this.L$0 = interfaceC13062m;
                this.label = 2;
                if (interfaceC13062m.emit(loadingMore, this) != enumC31071a) {
                    ExerciseRecordsInteractor exerciseRecordsInteractor = this.this$0;
                    String path = ((ExerciseRecordsDomainAction.LoadMore) this.$action).getPath();
                    String nextStartDate2 = ((ExerciseRecordsDomainAction.LoadMore) this.$action).getNextStartDate();
                    this.L$0 = null;
                    this.L$1 = interfaceC13062m;
                    this.label = 3;
                    obj = exerciseRecordsInteractor.fetchPage(path, nextStartDate2, true, this);
                    if (obj != enumC31071a) {
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 4;
                        if (interfaceC13062m.emit(obj, this) != enumC31071a) {
                            return c23454a0;
                        }
                    }
                }
            }
            return enumC31071a;
        }
        if (i13 == 1) {
            AbstractC34132o.m107864I(obj);
            return c23454a0;
        }
        if (i13 == 2) {
            AbstractC34132o.m107864I(obj);
            ExerciseRecordsInteractor exerciseRecordsInteractor2 = this.this$0;
            String path2 = ((ExerciseRecordsDomainAction.LoadMore) this.$action).getPath();
            String nextStartDate3 = ((ExerciseRecordsDomainAction.LoadMore) this.$action).getNextStartDate();
            this.L$0 = null;
            this.L$1 = interfaceC13062m;
            this.label = 3;
            obj = exerciseRecordsInteractor2.fetchPage(path2, nextStartDate3, true, this);
            if (obj != enumC31071a) {
                this.L$0 = null;
                this.L$1 = null;
                this.label = 4;
                if (interfaceC13062m.emit(obj, this) != enumC31071a) {
                }
            }
            return enumC31071a;
        }
        if (i13 == 3) {
            interfaceC13062m = (InterfaceC13062m) this.L$1;
            AbstractC34132o.m107864I(obj);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 4;
            if (interfaceC13062m.emit(obj, this) != enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i13 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        return c23454a0;
    }
}
