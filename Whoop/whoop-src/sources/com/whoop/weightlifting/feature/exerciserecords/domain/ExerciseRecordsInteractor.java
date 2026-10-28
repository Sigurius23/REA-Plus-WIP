package com.whoop.weightlifting.feature.exerciserecords.domain;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.weightlifting.feature.exerciserecords.domain.models.ExerciseRecordsResponse;
import com.whoop.weightlifting.feature.exerciserecords.domain.models.ShowMoreContent;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.C25271y;
import od1.InterfaceC27844g;
import p000.AbstractC11266d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ,\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor;", "Lod1/g;", "Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainAction;", "Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainState;", "Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsApi;", "api", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsApi;Ltr2/n;)V", "", "path", "startDate", "", "isLoadMore", "Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction;", "fetchPage", "(Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsApi;", "Ltr2/n;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ExerciseRecordsInteractor implements InterfaceC27844g<ExerciseRecordsDomainAction, ExerciseRecordsDomainState> {
    public static final int $stable = 8;
    private final ExerciseRecordsApi api;
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: com.whoop.weightlifting.feature.exerciserecords.domain.ExerciseRecordsInteractor$fetchPage$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.exerciserecords.domain.ExerciseRecordsInteractor", m100430f = "ExerciseRecordsInteractor.kt", m100431l = {78}, m100432m = "fetchPage", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C107721 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C107721(InterfaceC30057d<? super C107721> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ExerciseRecordsInteractor.this.fetchPage(null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.weightlifting.feature.exerciserecords.domain.ExerciseRecordsInteractor$interact$2 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.exerciserecords.domain.ExerciseRecordsInteractor$interact$2", m100430f = "ExerciseRecordsInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainState;", "state", "internalAction", "Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C107732 extends AbstractC32275i implements Function3 {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public C107732(InterfaceC30057d<? super C107732> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        public final Object invoke(ExerciseRecordsDomainState exerciseRecordsDomainState, ExerciseRecordsInternalAction exerciseRecordsInternalAction, InterfaceC30057d<? super ExerciseRecordsDomainState> interfaceC30057d) {
            C107732 c107732 = new C107732(interfaceC30057d);
            c107732.L$0 = exerciseRecordsDomainState;
            c107732.L$1 = exerciseRecordsInternalAction;
            return c107732.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            ExerciseRecordsDomainState exerciseRecordsDomainState = (ExerciseRecordsDomainState) this.L$0;
            ExerciseRecordsInternalAction exerciseRecordsInternalAction = (ExerciseRecordsInternalAction) this.L$1;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (exerciseRecordsInternalAction instanceof ExerciseRecordsInternalAction.Loading) {
                return new ExerciseRecordsDomainState(ExerciseRecordsDomainDialogType.Loading.INSTANCE, null, ((ExerciseRecordsInternalAction.Loading) exerciseRecordsInternalAction).getPath(), false, null, null, 58, null);
            }
            if (AbstractC22676k.m65745e(exerciseRecordsInternalAction, ExerciseRecordsInternalAction.LoadingMore.INSTANCE)) {
                return ExerciseRecordsDomainState.copy$default(exerciseRecordsDomainState, null, null, null, true, null, null, 55, null);
            }
            if (AbstractC22676k.m65745e(exerciseRecordsInternalAction, ExerciseRecordsInternalAction.SkipPagination.INSTANCE)) {
                return exerciseRecordsDomainState;
            }
            if (exerciseRecordsInternalAction instanceof ExerciseRecordsInternalAction.PageLoaded) {
                ExerciseRecordsInternalAction.PageLoaded pageLoaded = (ExerciseRecordsInternalAction.PageLoaded) exerciseRecordsInternalAction;
                return exerciseRecordsDomainState.copy(null, pageLoaded.getItems(), pageLoaded.getPath(), false, pageLoaded.getNextStartDate(), pageLoaded.getAnalyticsActionFromApi());
            }
            if (exerciseRecordsInternalAction instanceof ExerciseRecordsInternalAction.PageAppended) {
                List<DesignSystemModel> response = exerciseRecordsDomainState.getResponse();
                if (response == null) {
                    response = C25271y.f99162w;
                }
                ExerciseRecordsInternalAction.PageAppended pageAppended = (ExerciseRecordsInternalAction.PageAppended) exerciseRecordsInternalAction;
                return ExerciseRecordsDomainState.copy$default(exerciseRecordsDomainState, null, AbstractC25265s.m74129g1(response, pageAppended.getItems()), null, false, pageAppended.getNextStartDate(), null, 36, null);
            }
            if (exerciseRecordsInternalAction instanceof ExerciseRecordsInternalAction.OfflineError) {
                return ExerciseRecordsDomainState.copy$default(exerciseRecordsDomainState, ExerciseRecordsDomainDialogType.NetworkError.INSTANCE, null, ((ExerciseRecordsInternalAction.OfflineError) exerciseRecordsInternalAction).getPath(), false, null, null, 50, null);
            }
            if (exerciseRecordsInternalAction instanceof ExerciseRecordsInternalAction.RequestFailedError) {
                ExerciseRecordsInternalAction.RequestFailedError requestFailedError = (ExerciseRecordsInternalAction.RequestFailedError) exerciseRecordsInternalAction;
                return ExerciseRecordsDomainState.copy$default(exerciseRecordsDomainState, new ExerciseRecordsDomainDialogType.RequestFailed(requestFailedError.getPath()), null, requestFailedError.getPath(), false, null, null, 50, null);
            }
            if (AbstractC22676k.m65745e(exerciseRecordsInternalAction, ExerciseRecordsInternalAction.PageAppendError.INSTANCE)) {
                return ExerciseRecordsDomainState.copy$default(exerciseRecordsDomainState, null, null, null, false, null, null, 55, null);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public ExerciseRecordsInteractor(ExerciseRecordsApi api, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object fetchPage(String str, String str2, boolean z4, InterfaceC30057d<? super ExerciseRecordsInternalAction> interfaceC30057d) throws Exception {
        C107721 c107721;
        if (interfaceC30057d instanceof C107721) {
            c107721 = (C107721) interfaceC30057d;
            int i13 = c107721.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c107721.label = i13 - Integer.MIN_VALUE;
            } else {
                c107721 = new C107721(interfaceC30057d);
            }
        } else {
            c107721 = new C107721(interfaceC30057d);
        }
        C107721 c107722 = c107721;
        Object objM108730a = c107722.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c107722.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108730a);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            String strM30461o = AbstractC11266d.m30461o("Failed to fetch exercise records for path ", str);
            ExerciseRecordsInteractor$fetchPage$apiResult$1 exerciseRecordsInteractor$fetchPage$apiResult$1 = new ExerciseRecordsInteractor$fetchPage$apiResult$1(this, str, str2, null);
            c107722.L$0 = str;
            c107722.L$1 = null;
            c107722.Z$0 = z4;
            c107722.label = 1;
            objM108730a = companion.m108730a(interfaceC34116n, null, strM30461o, exerciseRecordsInteractor$fetchPage$apiResult$1, c107722);
            if (objM108730a == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z4 = c107722.Z$0;
            str = (String) c107722.L$0;
            AbstractC34132o.m107864I(objM108730a);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108730a;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            ExerciseRecordsResponse exerciseRecordsResponse = (ExerciseRecordsResponse) ((C29218v0) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).f118270b;
            if (exerciseRecordsResponse == null) {
                return z4 ? ExerciseRecordsInternalAction.PageAppendError.INSTANCE : new ExerciseRecordsInternalAction.RequestFailedError(str);
            }
            if (z4) {
                List<DesignSystemModel> items = exerciseRecordsResponse.getItems();
                ShowMoreContent showMore = exerciseRecordsResponse.getShowMore();
                return new ExerciseRecordsInternalAction.PageAppended(items, showMore != null ? showMore.getNextStartDate() : null);
            }
            List<DesignSystemModel> items2 = exerciseRecordsResponse.getItems();
            ShowMoreContent showMore2 = exerciseRecordsResponse.getShowMore();
            return new ExerciseRecordsInternalAction.PageLoaded(str, items2, showMore2 != null ? showMore2.getNextStartDate() : null, exerciseRecordsResponse.getAnalyticsAction());
        }
        if (!(interfaceC34385a instanceof InterfaceC34385a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        if (z4) {
            return ExerciseRecordsInternalAction.PageAppendError.INSTANCE;
        }
        InterfaceC34385a.b bVar = (InterfaceC34385a.b) interfaceC34385a;
        if (bVar instanceof InterfaceC34385a.b.C42432b) {
            return new ExerciseRecordsInternalAction.OfflineError(str);
        }
        if (bVar instanceof InterfaceC34385a.b.a) {
            return new ExerciseRecordsInternalAction.RequestFailedError(str);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ Object fetchPage$default(ExerciseRecordsInteractor exerciseRecordsInteractor, String str, String str2, boolean z4, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            z4 = false;
        }
        return exerciseRecordsInteractor.fetchPage(str, str2, z4, interfaceC30057d);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36612v(new C13060l1(new ExerciseRecordsDomainState(null, null, null, false, null, null, 62, null), AbstractC13091v.m36590P(upstream, new ExerciseRecordsInteractor$interact$$inlined$flatMapLatest$1(null, this)), new C107732(null)), 1);
    }

    public /* synthetic */ ExerciseRecordsInteractor(ExerciseRecordsApi exerciseRecordsApi, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(exerciseRecordsApi, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("ExerciseRecordsInteractor") : interfaceC34116n);
    }
}
