package com.whoop.data.repositories;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.mapbox.common.HttpHeaders;
import com.whoop.data.local.prefs.SharedPreferenceConstants;
import com.whoop.data.local.room.dao.wipeable.JournalDao;
import com.whoop.data.local.room.entity.JournalAnsweredDto;
import com.whoop.data.remote.commons.Resource;
import com.whoop.data.remote.domain.dto.BehaviourTrackerHistoryResponseDto;
import com.whoop.data.remote.domain.dto.JournalEntryWrapperDto;
import com.whoop.data.remote.domain.dto.JournalsBehaviorsListResponseDto;
import com.whoop.data.remote.domain.dto.UserSelectedJournalBehaviorResponseDto;
import com.whoop.data.remote.domain.request.JournalTrackerRequest;
import com.whoop.data.remote.domain.request.PartialJournalEntryRequest;
import com.whoop.data.remote.domain.response.journal.JournalBehaviorTracker;
import com.whoop.data.remote.domain.response.journal.JournalBehaviourTrackerHistory;
import com.whoop.data.remote.domain.response.journal.JournalEntryWrapper;
import com.whoop.data.remote.domain.response.journal.JournalsBehaviorsListResponse;
import com.whoop.network.exception.DomainException;
import com.whoop.service.network.JournalApi;
import in2.InterfaceC18732d;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import m83.C25271y;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import rr2.InterfaceC31766c;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import u92.C34660d;
import w02.AbstractC36685b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 Y2\u00020\u0001:\u0001YBG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0086@¢\u0006\u0004\b\u001e\u0010\u001fJ\u001e\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0086@¢\u0006\u0004\b!\u0010\"J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001cH\u0086@¢\u0006\u0004\b$\u0010%J(\u0010+\u001a\u00020*2\u0016\u0010)\u001a\u0012\u0012\u0004\u0012\u00020'0&j\b\u0012\u0004\u0012\u00020'`(H\u0086@¢\u0006\u0004\b+\u0010,J \u0010/\u001a\u00020*2\u0006\u0010.\u001a\u00020-2\u0006\u0010\u001b\u001a\u00020\u001aH\u0086@¢\u0006\u0004\b/\u00100J\u0018\u00103\u001a\u00020*2\u0006\u00102\u001a\u000201H\u0086@¢\u0006\u0004\b3\u00104J\u0015\u00108\u001a\u0002072\u0006\u00106\u001a\u000205¢\u0006\u0004\b8\u00109J\u001a\u0010:\u001a\u0004\u0018\u0001052\u0006\u0010\u0015\u001a\u00020\u0014H\u0086@¢\u0006\u0004\b:\u0010\u0019J\u0015\u0010<\u001a\u0002072\u0006\u0010;\u001a\u00020*¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020*¢\u0006\u0004\b>\u0010?J\u0018\u0010A\u001a\u0002072\u0006\u0010@\u001a\u00020*H\u0086@¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020*H\u0086@¢\u0006\u0004\bC\u0010%J\u0018\u0010E\u001a\u0002072\u0006\u0010D\u001a\u00020*H\u0086@¢\u0006\u0004\bE\u0010BJ\u0010\u0010F\u001a\u00020*H\u0086@¢\u0006\u0004\bF\u0010%J\u0016\u0010H\u001a\b\u0012\u0004\u0012\u00020G0\u0016H\u0086@¢\u0006\u0004\bH\u0010%J\u0018\u0010I\u001a\u0002072\u0006\u0010\u0015\u001a\u00020\u0014H\u0086@¢\u0006\u0004\bI\u0010\u0019J\u0015\u0010J\u001a\u0002072\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\bJ\u0010KR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010LR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010MR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010NR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010OR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010PR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010QR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010RR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010SR\u0014\u0010U\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0011\u0010X\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\bW\u0010?¨\u0006Z"}, m65681d2 = {"Lcom/whoop/data/repositories/JournalRepository;", "", "Lin2/d;", "dispatcherFactory", "Lcom/whoop/data/local/room/dao/wipeable/JournalDao;", "journalDao", "Lu92/d;", "sharedPreferences", "Lcom/whoop/service/network/JournalApi;", "journalApi", "Lcom/whoop/data/repositories/FeatureFlagRepository;", "featureFlagRepository", "Lbc3/c0;", "applicationScope", "Lrr2/c;", "crashReporter", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lin2/d;Lcom/whoop/data/local/room/dao/wipeable/JournalDao;Lu92/d;Lcom/whoop/service/network/JournalApi;Lcom/whoop/data/repositories/FeatureFlagRepository;Lbc3/c0;Lrr2/c;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "", "cycleId", "", "Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;", "getUserJournalHistory", "(JLq83/d;)Ljava/lang/Object;", "", HttpHeaders.DATE, "Lcom/whoop/data/remote/commons/Resource;", "Lcom/whoop/data/remote/domain/response/journal/UserSelectedJournalWithHistory;", "fetchUserSelectedJournalQuestions", "(JLjava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/data/remote/domain/response/journal/JournalEntryWrapper;", "fetchUserJournalEntryForDate", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/data/remote/domain/response/journal/JournalsBehaviorsListResponse;", "fetchJournalBehaviorsList", "(Lq83/d;)Ljava/lang/Object;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "listOfSelectedJournals", "", "updateUserSelectedJournalList", "(Ljava/util/ArrayList;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/data/remote/domain/request/JournalTrackerRequest;", "trackerRequest", "saveJournalTrackerInputs", "(Lcom/whoop/data/remote/domain/request/JournalTrackerRequest;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/data/remote/domain/request/PartialJournalEntryRequest;", "request", "savePartialJournalEntry", "(Lcom/whoop/data/remote/domain/request/PartialJournalEntryRequest;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/data/local/room/entity/JournalAnsweredDto;", "journalAnsweredDto", "Ll83/a0;", "saveJournalAnsweredInfo", "(Lcom/whoop/data/local/room/entity/JournalAnsweredDto;)V", "getJournalAnsweredInfo", "showJournal", "saveUserJournalSettings", "(Z)V", "getUserSavedJournalSettings", "()Z", "enabledDefaultAnswer", "setStateOfUsersLastDefaultToggle", "(ZLq83/d;)Ljava/lang/Object;", "getLastStateOfUsersLastDefaultToggle", "showAgain", "setShouldShowDismissConfirmationDialog", "getShouldShowDismissConfirmationDialog", "Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;", "getPreviouslySelectedBehaviors", "sendAutoPopEvent", "saveLocallyJournalHasBeenAutoPop", "(J)V", "Lin2/d;", "Lcom/whoop/data/local/room/dao/wipeable/JournalDao;", "Lu92/d;", "Lcom/whoop/service/network/JournalApi;", "Lcom/whoop/data/repositories/FeatureFlagRepository;", "Lbc3/c0;", "Lrr2/c;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Ltr2/n;", "log", "Ltr2/n;", "getShouldShowJournal", "shouldShowJournal", "Companion", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class JournalRepository {
    public static final String KEY_ENABLED_DEFAULT_ANSWERS = "EnabledDefaultAnswers";
    public static final String KEY_SHOULD_SHOW_JOURNAL_EXIT_PROMPT_AGAIN = "DoNotShowJournalExitPromptAgain";
    private final InterfaceC2994c0 applicationScope;
    private final InterfaceC31766c crashReporter;
    private final InterfaceC18732d dispatcherFactory;
    private final FeatureFlagChecker featureFlagChecker;
    private final FeatureFlagRepository featureFlagRepository;
    private final JournalApi journalApi;
    private final JournalDao journalDao;
    private final InterfaceC34116n log;
    private final C34660d sharedPreferences;

    /* JADX INFO: renamed from: com.whoop.data.repositories.JournalRepository$fetchJournalBehaviorsList$1 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.JournalRepository", m100430f = "JournalRepository.kt", m100431l = {95}, m100432m = "fetchJournalBehaviorsList", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C65701 extends AbstractC32269c {
        int label;
        /* synthetic */ Object result;

        public C65701(InterfaceC30057d<? super C65701> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return JournalRepository.this.fetchJournalBehaviorsList(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.JournalRepository$fetchUserJournalEntryForDate$1 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.JournalRepository", m100430f = "JournalRepository.kt", m100431l = {86}, m100432m = "fetchUserJournalEntryForDate", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C65711 extends AbstractC32269c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C65711(InterfaceC30057d<? super C65711> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return JournalRepository.this.fetchUserJournalEntryForDate(null, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.JournalRepository$fetchUserSelectedJournalQuestions$1 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.JournalRepository", m100430f = "JournalRepository.kt", m100431l = {56, 58, 61}, m100432m = "fetchUserSelectedJournalQuestions", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C65721 extends AbstractC32269c {
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C65721(InterfaceC30057d<? super C65721> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return JournalRepository.this.fetchUserSelectedJournalQuestions(0L, null, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.JournalRepository$getJournalAnsweredInfo$2 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.JournalRepository$getJournalAnsweredInfo$2", m100430f = "JournalRepository.kt", m100431l = {153}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lcom/whoop/data/local/room/entity/JournalAnsweredDto;", "<anonymous>", "(Lbc3/c0;)Lcom/whoop/data/local/room/entity/JournalAnsweredDto;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C65732 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ long $cycleId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C65732(long j7, InterfaceC30057d<? super C65732> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$cycleId = j7;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return JournalRepository.this.new C65732(this.$cycleId, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super JournalAnsweredDto> interfaceC30057d) {
            return ((C65732) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    JournalDao journalDao = JournalRepository.this.journalDao;
                    long j7 = this.$cycleId;
                    this.label = 1;
                    obj = journalDao.getJournalAnswer(j7, this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return (JournalAnsweredDto) obj;
            } catch (Exception e5) {
                JournalRepository.this.log.mo85230v("failed to get journal answer from db", e5, new AbstractC30556a.a[0]);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.JournalRepository$getLastStateOfUsersLastDefaultToggle$2 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.JournalRepository$getLastStateOfUsersLastDefaultToggle$2", m100430f = "JournalRepository.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)Z"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C65742 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        public C65742(InterfaceC30057d<? super C65742> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return JournalRepository.this.new C65742(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Boolean> interfaceC30057d) {
            return ((C65742) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return Boolean.valueOf(JournalRepository.this.sharedPreferences.m109528e(JournalRepository.KEY_ENABLED_DEFAULT_ANSWERS, false));
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.JournalRepository$getPreviouslySelectedBehaviors$1 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.JournalRepository", m100430f = "JournalRepository.kt", m100431l = {196}, m100432m = "getPreviouslySelectedBehaviors", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C65751 extends AbstractC32269c {
        int label;
        /* synthetic */ Object result;

        public C65751(InterfaceC30057d<? super C65751> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return JournalRepository.this.getPreviouslySelectedBehaviors(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.JournalRepository$getShouldShowDismissConfirmationDialog$2 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.JournalRepository$getShouldShowDismissConfirmationDialog$2", m100430f = "JournalRepository.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)Z"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C65762 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        public C65762(InterfaceC30057d<? super C65762> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return JournalRepository.this.new C65762(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Boolean> interfaceC30057d) {
            return ((C65762) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return Boolean.valueOf(JournalRepository.this.sharedPreferences.m109528e(JournalRepository.KEY_SHOULD_SHOW_JOURNAL_EXIT_PROMPT_AGAIN, true));
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.JournalRepository$getUserJournalHistory$1 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.JournalRepository", m100430f = "JournalRepository.kt", m100431l = {77}, m100432m = "getUserJournalHistory", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C65771 extends AbstractC32269c {
        long J$0;
        int label;
        /* synthetic */ Object result;

        public C65771(InterfaceC30057d<? super C65771> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return JournalRepository.this.getUserJournalHistory(0L, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.JournalRepository$saveJournalAnsweredInfo$1 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.JournalRepository$saveJournalAnsweredInfo$1", m100430f = "JournalRepository.kt", m100431l = {139}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C65781 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ JournalAnsweredDto $journalAnsweredDto;
        int label;

        /* JADX INFO: renamed from: com.whoop.data.repositories.JournalRepository$saveJournalAnsweredInfo$1$1, reason: invalid class name */
        @InterfaceC32271e(m100429c = "com.whoop.data.repositories.JournalRepository$saveJournalAnsweredInfo$1$1", m100430f = "JournalRepository.kt", m100431l = {141}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class AnonymousClass1 extends AbstractC32275i implements InterfaceC4351m {
            final /* synthetic */ JournalAnsweredDto $journalAnsweredDto;
            int label;
            final /* synthetic */ JournalRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(JournalRepository journalRepository, JournalAnsweredDto journalAnsweredDto, InterfaceC30057d<? super AnonymousClass1> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.this$0 = journalRepository;
                this.$journalAnsweredDto = journalAnsweredDto;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new AnonymousClass1(this.this$0, this.$journalAnsweredDto, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((AnonymousClass1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.label;
                try {
                    if (i13 == 0) {
                        AbstractC34132o.m107864I(obj);
                        JournalDao journalDao = this.this$0.journalDao;
                        JournalAnsweredDto journalAnsweredDto = this.$journalAnsweredDto;
                        this.label = 1;
                        if (journalDao.saveJournalAnsweredDto(journalAnsweredDto, this) == enumC31071a) {
                            return enumC31071a;
                        }
                    } else {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                    }
                } catch (Throwable th3) {
                    this.this$0.crashReporter.mo98626g(th3, "failed to save journal answered dto");
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C65781(JournalAnsweredDto journalAnsweredDto, InterfaceC30057d<? super C65781> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$journalAnsweredDto = journalAnsweredDto;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return JournalRepository.this.new C65781(this.$journalAnsweredDto, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C65781) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC30063j interfaceC30063jMo54465b = JournalRepository.this.dispatcherFactory.mo54465b();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(JournalRepository.this, this.$journalAnsweredDto, null);
                this.label = 1;
                if (AbstractC3006f0.m8705K(interfaceC30063jMo54465b, anonymousClass1, this) == enumC31071a) {
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
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.JournalRepository$saveJournalTrackerInputs$1 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.JournalRepository", m100430f = "JournalRepository.kt", m100431l = {119}, m100432m = "saveJournalTrackerInputs", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C65791 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C65791(InterfaceC30057d<? super C65791> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return JournalRepository.this.saveJournalTrackerInputs(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.JournalRepository$saveJournalTrackerInputs$2 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.JournalRepository$saveJournalTrackerInputs$2", m100430f = "JournalRepository.kt", m100431l = {119}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C65802 extends AbstractC32275i implements Function1 {
        final /* synthetic */ String $date;
        final /* synthetic */ JournalTrackerRequest $trackerRequest;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C65802(String str, JournalTrackerRequest journalTrackerRequest, InterfaceC30057d<? super C65802> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$date = str;
            this.$trackerRequest = journalTrackerRequest;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return JournalRepository.this.new C65802(this.$date, this.$trackerRequest, interfaceC30057d);
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
            JournalApi journalApi = JournalRepository.this.journalApi;
            String str = this.$date;
            JournalTrackerRequest journalTrackerRequest = this.$trackerRequest;
            this.label = 1;
            Object objSaveUserJournalBehaviorAnswersIntraday = journalApi.saveUserJournalBehaviorAnswersIntraday(str, journalTrackerRequest, this);
            return objSaveUserJournalBehaviorAnswersIntraday == enumC31071a ? enumC31071a : objSaveUserJournalBehaviorAnswersIntraday;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((C65802) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.JournalRepository$savePartialJournalEntry$1 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.JournalRepository", m100430f = "JournalRepository.kt", m100431l = {128}, m100432m = "savePartialJournalEntry", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C65811 extends AbstractC32269c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C65811(InterfaceC30057d<? super C65811> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return JournalRepository.this.savePartialJournalEntry(null, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.JournalRepository$savePartialJournalEntry$2 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.JournalRepository$savePartialJournalEntry$2", m100430f = "JournalRepository.kt", m100431l = {128}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C65822 extends AbstractC32275i implements Function1 {
        final /* synthetic */ PartialJournalEntryRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C65822(PartialJournalEntryRequest partialJournalEntryRequest, InterfaceC30057d<? super C65822> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$request = partialJournalEntryRequest;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return JournalRepository.this.new C65822(this.$request, interfaceC30057d);
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
            JournalApi journalApi = JournalRepository.this.journalApi;
            PartialJournalEntryRequest partialJournalEntryRequest = this.$request;
            this.label = 1;
            Object objSavePartialJournalEntry = journalApi.savePartialJournalEntry(partialJournalEntryRequest, this);
            return objSavePartialJournalEntry == enumC31071a ? enumC31071a : objSavePartialJournalEntry;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((C65822) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.JournalRepository$sendAutoPopEvent$1 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.JournalRepository", m100430f = "JournalRepository.kt", m100431l = {205}, m100432m = "sendAutoPopEvent", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C65831 extends AbstractC32269c {
        long J$0;
        int label;
        /* synthetic */ Object result;

        public C65831(InterfaceC30057d<? super C65831> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return JournalRepository.this.sendAutoPopEvent(0L, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.JournalRepository$setShouldShowDismissConfirmationDialog$2 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.JournalRepository$setShouldShowDismissConfirmationDialog$2", m100430f = "JournalRepository.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C65842 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ boolean $showAgain;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C65842(boolean z4, InterfaceC30057d<? super C65842> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$showAgain = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return JournalRepository.this.new C65842(this.$showAgain, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C65842) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            JournalRepository.this.sharedPreferences.m109538q(JournalRepository.KEY_SHOULD_SHOW_JOURNAL_EXIT_PROMPT_AGAIN, this.$showAgain);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.JournalRepository$setStateOfUsersLastDefaultToggle$2 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.JournalRepository$setStateOfUsersLastDefaultToggle$2", m100430f = "JournalRepository.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C65852 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ boolean $enabledDefaultAnswer;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C65852(boolean z4, InterfaceC30057d<? super C65852> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$enabledDefaultAnswer = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return JournalRepository.this.new C65852(this.$enabledDefaultAnswer, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C65852) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            JournalRepository.this.sharedPreferences.m109538q(JournalRepository.KEY_ENABLED_DEFAULT_ANSWERS, this.$enabledDefaultAnswer);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.JournalRepository$updateUserSelectedJournalList$1 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.JournalRepository", m100430f = "JournalRepository.kt", m100431l = {106}, m100432m = "updateUserSelectedJournalList", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C65861 extends AbstractC32269c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C65861(InterfaceC30057d<? super C65861> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return JournalRepository.this.updateUserSelectedJournalList(null, this);
        }
    }

    public JournalRepository(InterfaceC18732d dispatcherFactory, JournalDao journalDao, C34660d sharedPreferences, JournalApi journalApi, FeatureFlagRepository featureFlagRepository, InterfaceC2994c0 applicationScope, InterfaceC31766c crashReporter, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(dispatcherFactory, "dispatcherFactory");
        AbstractC22676k.m65750j(journalDao, "journalDao");
        AbstractC22676k.m65750j(sharedPreferences, "sharedPreferences");
        AbstractC22676k.m65750j(journalApi, "journalApi");
        AbstractC22676k.m65750j(featureFlagRepository, "featureFlagRepository");
        AbstractC22676k.m65750j(applicationScope, "applicationScope");
        AbstractC22676k.m65750j(crashReporter, "crashReporter");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.dispatcherFactory = dispatcherFactory;
        this.journalDao = journalDao;
        this.sharedPreferences = sharedPreferences;
        this.journalApi = journalApi;
        this.featureFlagRepository = featureFlagRepository;
        this.applicationScope = applicationScope;
        this.crashReporter = crashReporter;
        this.featureFlagChecker = featureFlagChecker;
        this.log = InterfaceC34116n.INSTANCE.m107848a("JournalRepository");
    }

    public static /* synthetic */ Object fetchUserSelectedJournalQuestions$default(JournalRepository journalRepository, long j7, String str, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str = "";
        }
        return journalRepository.fetchUserSelectedJournalQuestions(j7, str, interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getUserJournalHistory(long j7, InterfaceC30057d<? super List<JournalBehaviourTrackerHistory>> interfaceC30057d) {
        C65771 c65771;
        if (interfaceC30057d instanceof C65771) {
            c65771 = (C65771) interfaceC30057d;
            int i13 = c65771.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c65771.label = i13 - Integer.MIN_VALUE;
            } else {
                c65771 = new C65771(interfaceC30057d);
            }
        } else {
            c65771 = new C65771(interfaceC30057d);
        }
        Object userJournalHistory = c65771.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c65771.label;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(userJournalHistory);
                JournalApi journalApi = this.journalApi;
                c65771.J$0 = j7;
                c65771.label = 1;
                userJournalHistory = journalApi.getUserJournalHistory(j7, c65771);
                if (userJournalHistory == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(userJournalHistory);
            }
            return ((BehaviourTrackerHistoryResponseDto) userJournalHistory).toBehaviourTrackerHistoryResponse().getRecords();
        } catch (Exception e5) {
            AbstractC36685b.m117759a(e5, "Failed to get previous answers", InterfaceC34116n.INSTANCE.m107850c(), this.crashReporter);
            return C25271y.f99162w;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object fetchJournalBehaviorsList(InterfaceC30057d<? super Resource<JournalsBehaviorsListResponse>> interfaceC30057d) throws Exception {
        C65701 c65701;
        if (interfaceC30057d instanceof C65701) {
            c65701 = (C65701) interfaceC30057d;
            int i13 = c65701.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c65701.label = i13 - Integer.MIN_VALUE;
            } else {
                c65701 = new C65701(interfaceC30057d);
            }
        } else {
            c65701 = new C65701(interfaceC30057d);
        }
        C65701 c65702 = c65701;
        Object objM108730a = c65702.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c65702.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108730a);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116nM107850c = InterfaceC34116n.INSTANCE.m107850c();
            InterfaceC31766c interfaceC31766c = this.crashReporter;
            JournalRepository$fetchJournalBehaviorsList$response$1 journalRepository$fetchJournalBehaviorsList$response$1 = new JournalRepository$fetchJournalBehaviorsList$response$1(this, null);
            c65702.label = 1;
            objM108730a = companion.m108730a(interfaceC34116nM107850c, interfaceC31766c, "failed to fetch journal behaviors list", journalRepository$fetchJournalBehaviorsList$response$1, c65702);
            if (objM108730a == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108730a);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108730a;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return Resource.INSTANCE.success(((JournalsBehaviorsListResponseDto) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).toJournalsBehaviorsListResponse());
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return Resource.Companion.error$default(Resource.INSTANCE, "", null, null, null, 14, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object fetchUserJournalEntryForDate(String str, InterfaceC30057d<? super Resource<JournalEntryWrapper>> interfaceC30057d) {
        C65711 c65711;
        if (interfaceC30057d instanceof C65711) {
            c65711 = (C65711) interfaceC30057d;
            int i13 = c65711.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c65711.label = i13 - Integer.MIN_VALUE;
            } else {
                c65711 = new C65711(interfaceC30057d);
            }
        } else {
            c65711 = new C65711(interfaceC30057d);
        }
        Object journalEntryForDate = c65711.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c65711.label;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(journalEntryForDate);
                JournalApi journalApi = this.journalApi;
                c65711.L$0 = str;
                c65711.label = 1;
                journalEntryForDate = journalApi.getJournalEntryForDate(str, c65711);
                if (journalEntryForDate == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(journalEntryForDate);
            }
            return Resource.INSTANCE.success(((JournalEntryWrapperDto) journalEntryForDate).toJournalEntryWrapper());
        } catch (Exception e5) {
            return Resource.Companion.error$default(Resource.INSTANCE, AbstractC36685b.m117759a(e5, AbstractC11266d.m30461o("Fetching journal entry for date ", str), this.log, this.crashReporter), null, null, DomainException.INSTANCE.m23148a(e5), 6, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0090 A[Catch: Exception -> 0x0037, LOOP:0: B:35:0x008a->B:37:0x0090, LOOP_END, TryCatch #0 {Exception -> 0x0037, blocks: (B:14:0x0032, B:46:0x00cb, B:21:0x0049, B:42:0x00b1, B:43:0x00bc, B:24:0x0053, B:34:0x0079, B:35:0x008a, B:37:0x0090, B:27:0x005a, B:29:0x0064, B:31:0x006a, B:39:0x00a2), top: B:50:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c8, code lost:
    
        if (r13 == r1) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchUserSelectedJournalQuestions(long r10, java.lang.String r12, q83.InterfaceC30057d<? super com.whoop.data.remote.commons.Resource<com.whoop.data.remote.domain.response.journal.UserSelectedJournalWithHistory>> r13) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.data.repositories.JournalRepository.fetchUserSelectedJournalQuestions(long, java.lang.String, q83.d):java.lang.Object");
    }

    public final Object getJournalAnsweredInfo(long j7, InterfaceC30057d<? super JournalAnsweredDto> interfaceC30057d) {
        this.log.mo85228t(AbstractC11895b.m31994m(j7, "New Journal getJournalAnswerInfo "), new AbstractC30556a.a[0]);
        return AbstractC3006f0.m8705K(this.dispatcherFactory.mo54465b(), new C65732(j7, null), interfaceC30057d);
    }

    public final Object getLastStateOfUsersLastDefaultToggle(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.dispatcherFactory.mo54465b(), new C65742(null), interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getPreviouslySelectedBehaviors(InterfaceC30057d<? super List<JournalBehaviorTracker>> interfaceC30057d) {
        C65751 c65751;
        if (interfaceC30057d instanceof C65751) {
            c65751 = (C65751) interfaceC30057d;
            int i13 = c65751.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c65751.label = i13 - Integer.MIN_VALUE;
            } else {
                c65751 = new C65751(interfaceC30057d);
            }
        } else {
            c65751 = new C65751(interfaceC30057d);
        }
        Object userSelectedJournalBehaviors = c65751.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c65751.label;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(userSelectedJournalBehaviors);
                JournalApi journalApi = this.journalApi;
                c65751.label = 1;
                userSelectedJournalBehaviors = journalApi.getUserSelectedJournalBehaviors(c65751);
                if (userSelectedJournalBehaviors == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(userSelectedJournalBehaviors);
            }
            return ((UserSelectedJournalBehaviorResponseDto) userSelectedJournalBehaviors).toUserSelectedJournalBehaviorResponse().getRecords();
        } catch (Exception e5) {
            AbstractC36685b.m117759a(e5, "Failed to fetch user tracked behaviors", this.log, this.crashReporter);
            return C25271y.f99162w;
        }
    }

    public final Object getShouldShowDismissConfirmationDialog(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.dispatcherFactory.mo54465b(), new C65762(null), interfaceC30057d);
    }

    public final boolean getShouldShowJournal() {
        return getUserSavedJournalSettings();
    }

    public final boolean getUserSavedJournalSettings() {
        return this.sharedPreferences.m109528e(SharedPreferenceConstants.KEY_JOURNAL_SETTING_ON_OFF, true) && !this.featureFlagRepository.isFeatureEnabled(FeatureFlagRepositoryKt.NEVER_POP_JOURNAL);
    }

    public final void saveJournalAnsweredInfo(JournalAnsweredDto journalAnsweredDto) {
        AbstractC22676k.m65750j(journalAnsweredDto, "journalAnsweredDto");
        this.log.mo85228t("New Journal saveJournalAnswerInfo " + journalAnsweredDto, new AbstractC30556a.a[0]);
        AbstractC3006f0.m8732z(this.applicationScope, null, null, new C65781(journalAnsweredDto, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object saveJournalTrackerInputs(JournalTrackerRequest journalTrackerRequest, String str, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        C65791 c65791;
        if (interfaceC30057d instanceof C65791) {
            c65791 = (C65791) interfaceC30057d;
            int i13 = c65791.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c65791.label = i13 - Integer.MIN_VALUE;
            } else {
                c65791 = new C65791(interfaceC30057d);
            }
        } else {
            c65791 = new C65791(interfaceC30057d);
        }
        C65791 c65792 = c65791;
        Object objM108729b = c65792.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c65792.label;
        boolean z4 = true;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.log;
            C65802 c65802 = new C65802(str, journalTrackerRequest, null);
            c65792.L$0 = null;
            c65792.L$1 = null;
            c65792.label = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, c65802, c65792, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            z4 = false;
        } else if (!(interfaceC34385a instanceof InterfaceC34385a.c)) {
            throw new NoWhenBranchMatchedException();
        }
        return Boolean.valueOf(z4);
    }

    public final void saveLocallyJournalHasBeenAutoPop(long cycleId) {
        this.sharedPreferences.m109542u(SharedPreferenceConstants.KEY_HAS_JOURNAL_BEEN_SEEN_FOR_TODAY, cycleId);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object savePartialJournalEntry(PartialJournalEntryRequest partialJournalEntryRequest, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        C65811 c65811;
        if (interfaceC30057d instanceof C65811) {
            c65811 = (C65811) interfaceC30057d;
            int i13 = c65811.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c65811.label = i13 - Integer.MIN_VALUE;
            } else {
                c65811 = new C65811(interfaceC30057d);
            }
        } else {
            c65811 = new C65811(interfaceC30057d);
        }
        C65811 c65812 = c65811;
        Object objM108729b = c65812.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c65812.label;
        boolean z4 = true;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.log;
            C65822 c65822 = new C65822(partialJournalEntryRequest, null);
            c65812.L$0 = null;
            c65812.label = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, c65822, c65812, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            z4 = false;
        } else if (!(interfaceC34385a instanceof InterfaceC34385a.c)) {
            throw new NoWhenBranchMatchedException();
        }
        return Boolean.valueOf(z4);
    }

    public final void saveUserJournalSettings(boolean showJournal) {
        this.sharedPreferences.m109538q(SharedPreferenceConstants.KEY_JOURNAL_SETTING_ON_OFF, showJournal);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object sendAutoPopEvent(long j7, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C65831 c65831;
        if (interfaceC30057d instanceof C65831) {
            c65831 = (C65831) interfaceC30057d;
            int i13 = c65831.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c65831.label = i13 - Integer.MIN_VALUE;
            } else {
                c65831 = new C65831(interfaceC30057d);
            }
        } else {
            c65831 = new C65831(interfaceC30057d);
        }
        Object obj = c65831.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c65831.label;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                JournalApi journalApi = this.journalApi;
                c65831.J$0 = j7;
                c65831.label = 1;
                if (journalApi.setAutoPop(j7, true, c65831) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
        } catch (Exception e5) {
            AbstractC36685b.m117759a(e5, "Failed to fetch user tracked behaviors", this.log, this.crashReporter);
        }
        return C23454a0.f92919a;
    }

    public final Object setShouldShowDismissConfirmationDialog(boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM8705K = AbstractC3006f0.m8705K(this.dispatcherFactory.mo54465b(), new C65842(z4, null), interfaceC30057d);
        return objM8705K == EnumC31071a.f128113w ? objM8705K : C23454a0.f92919a;
    }

    public final Object setStateOfUsersLastDefaultToggle(boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM8705K = AbstractC3006f0.m8705K(this.dispatcherFactory.mo54465b(), new C65852(z4, null), interfaceC30057d);
        return objM8705K == EnumC31071a.f128113w ? objM8705K : C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object updateUserSelectedJournalList(ArrayList<Integer> arrayList, InterfaceC30057d<? super Boolean> interfaceC30057d) throws Exception {
        C65861 c65861;
        if (interfaceC30057d instanceof C65861) {
            c65861 = (C65861) interfaceC30057d;
            int i13 = c65861.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c65861.label = i13 - Integer.MIN_VALUE;
            } else {
                c65861 = new C65861(interfaceC30057d);
            }
        } else {
            c65861 = new C65861(interfaceC30057d);
        }
        C65861 c65862 = c65861;
        Object objM108730a = c65862.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c65862.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108730a);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.log;
            InterfaceC31766c interfaceC31766c = this.crashReporter;
            JournalRepository$updateUserSelectedJournalList$response$1 journalRepository$updateUserSelectedJournalList$response$1 = new JournalRepository$updateUserSelectedJournalList$response$1(this, arrayList, null);
            c65862.L$0 = null;
            c65862.label = 1;
            objM108730a = companion.m108730a(interfaceC34116n, interfaceC31766c, "Error updating selected journal behaviors", journalRepository$updateUserSelectedJournalList$response$1, c65862);
            if (objM108730a == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108730a);
        }
        return Boolean.valueOf(((InterfaceC34385a) objM108730a) instanceof InterfaceC34385a.c);
    }
}
