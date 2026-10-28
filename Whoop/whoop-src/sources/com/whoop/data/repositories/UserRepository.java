package com.whoop.data.repositories;

import android.content.Context;
import android.text.format.DateFormat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.AbstractC3006f0;
import bc3.AbstractC3028k2;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.local.prefs.PreferenceHelper;
import com.whoop.data.onboarding.C6529c;
import com.whoop.service.network.ActivityServiceApi;
import com.whoop.service.network.UsersPreferenceApi;
import com.whoop.service.timezone.C10023a;
import kh3.C22488a;
import l83.C23454a0;
import od1.C27858u;
import org.joda.time.Hours;
import org.joda.time.Instant;
import p007a6.C0428i;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import w02.AbstractC36685b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 <2\u00020\u0001:\u0001<BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u001a\u0010!\u001a\u00020 2\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0086@¢\u0006\u0004\b!\u0010\"J!\u0010&\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\u001e2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b&\u0010'J\u0018\u0010*\u001a\n )*\u0004\u0018\u00010(0(H\u0082@¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020 H\u0082@¢\u0006\u0004\b,\u0010+J\u0012\u0010-\u001a\u0004\u0018\u00010 H\u0082@¢\u0006\u0004\b-\u0010+J\u0010\u0010.\u001a\u00020 H\u0082@¢\u0006\u0004\b.\u0010+J\u0018\u00100\u001a\u00020\u001a2\u0006\u0010/\u001a\u00020 H\u0082@¢\u0006\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00103R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00104R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00105R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00106R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00107R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00108R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00109R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010:R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010;¨\u0006="}, m65681d2 = {"Lcom/whoop/data/repositories/UserRepository;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroid/content/Context;", "context", "Lcom/whoop/service/network/UsersPreferenceApi;", "usersPreferenceApi", "Lcom/whoop/service/network/ActivityServiceApi;", "activityServiceApi", "Lcom/whoop/data/local/prefs/PreferenceHelper;", "prefs", "Lod1/u;", "userContext", "Lbc3/c0;", "applicationScope", "Lq83/j;", "ioContext", "Lcom/whoop/service/timezone/a;", "timezoneUpdateUploader", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Ltr2/n;", "logger", "<init>", "(Landroid/content/Context;Lcom/whoop/service/network/UsersPreferenceApi;Lcom/whoop/service/network/ActivityServiceApi;Lcom/whoop/data/local/prefs/PreferenceHelper;Lod1/u;Lbc3/c0;Lq83/j;Lcom/whoop/service/timezone/a;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;)V", "Landroidx/lifecycle/g0;", "owner", "Ll83/a0;", "onCreate", "(Landroidx/lifecycle/g0;)V", "onStart", "", "forceRefresh", "Lcom/whoop/data/repositories/RestingHeartRate;", "getRestingHeartRate", "(ZLq83/d;)Ljava/lang/Object;", "using24HourTime", "", "timestamp", "updateUserTimezonePreferences", "(ZLjava/lang/Long;)V", "Lorg/joda/time/Instant;", "kotlin.jvm.PlatformType", "lastRhrFetchTime", "(Lq83/d;)Ljava/lang/Object;", "fetchAndUpdateRhr", "fetchRhr", "getCachedRhr", "rhr", "updateCachedRhr", "(Lcom/whoop/data/repositories/RestingHeartRate;Lq83/d;)Ljava/lang/Object;", "Landroid/content/Context;", "Lcom/whoop/service/network/UsersPreferenceApi;", "Lcom/whoop/service/network/ActivityServiceApi;", "Lcom/whoop/data/local/prefs/PreferenceHelper;", "Lod1/u;", "Lbc3/c0;", "Lq83/j;", "Lcom/whoop/service/timezone/a;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Ltr2/n;", "Companion", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class UserRepository implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final float DEFAULT_RHR = 55.0f;
    public static final String KEY_LAST_FETCH_TIME = "last-fetch-time-rhr";
    public static final String KEY_USER_RHR = "user-rhr-value-";
    private static final long TIMEOUT = 2500;
    private final ActivityServiceApi activityServiceApi;
    private final InterfaceC2994c0 applicationScope;
    private final Context context;
    private final FeatureFlagChecker featureFlagChecker;
    private final InterfaceC30063j ioContext;
    private final InterfaceC34116n logger;
    private final PreferenceHelper prefs;
    private final C10023a timezoneUpdateUploader;
    private final C27858u userContext;
    private final UsersPreferenceApi usersPreferenceApi;

    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m65681d2 = {"Lcom/whoop/data/repositories/UserRepository$Companion;", "", "<init>", "()V", "KEY_LAST_FETCH_TIME", "", "getKEY_LAST_FETCH_TIME$annotations", "KEY_USER_RHR", "getKEY_USER_RHR$annotations", "DEFAULT_RHR", "", "TIMEOUT", "", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getKEY_LAST_FETCH_TIME$annotations() {
        }

        public static /* synthetic */ void getKEY_USER_RHR$annotations() {
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.UserRepository$fetchAndUpdateRhr$1 */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.UserRepository", m100430f = "UserRepository.kt", m100431l = {118, 118, 119}, m100432m = "fetchAndUpdateRhr", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C66411 extends AbstractC32269c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C66411(InterfaceC30057d<? super C66411> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserRepository.this.fetchAndUpdateRhr(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.UserRepository$fetchRhr$1 */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.UserRepository", m100430f = "UserRepository.kt", m100431l = {124}, m100432m = "fetchRhr", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C66421 extends AbstractC32269c {
        int label;
        /* synthetic */ Object result;

        public C66421(InterfaceC30057d<? super C66421> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserRepository.this.fetchRhr(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.UserRepository$fetchRhr$2 */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.UserRepository$fetchRhr$2", m100430f = "UserRepository.kt", m100431l = {125}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lcom/whoop/data/repositories/RestingHeartRate;", "<anonymous>", "(Lbc3/c0;)Lcom/whoop/data/repositories/RestingHeartRate;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C66432 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        public C66432(InterfaceC30057d<? super C66432> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return UserRepository.this.new C66432(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super RestingHeartRate> interfaceC30057d) {
            return ((C66432) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                ActivityServiceApi activityServiceApi = UserRepository.this.activityServiceApi;
                this.label = 1;
                obj = activityServiceApi.getRestingHeartRate(this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return new RestingHeartRate(((Number) obj).floatValue());
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.UserRepository$getCachedRhr$2 */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.UserRepository$getCachedRhr$2", m100430f = "UserRepository.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lcom/whoop/data/repositories/RestingHeartRate;", "<anonymous>", "(Lbc3/c0;)Lcom/whoop/data/repositories/RestingHeartRate;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C66442 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        public C66442(InterfaceC30057d<? super C66442> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return UserRepository.this.new C66442(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super RestingHeartRate> interfaceC30057d) {
            return ((C66442) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return new RestingHeartRate(UserRepository.this.prefs.getFloatValueFromMainPrefs(UserRepository.KEY_USER_RHR, UserRepository.DEFAULT_RHR));
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.UserRepository$getRestingHeartRate$1 */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.UserRepository", m100430f = "UserRepository.kt", m100431l = {74, 77, 79, 81}, m100432m = "getRestingHeartRate", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C66451 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C66451(InterfaceC30057d<? super C66451> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserRepository.this.getRestingHeartRate(false, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.UserRepository$lastRhrFetchTime$1 */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.UserRepository", m100430f = "UserRepository.kt", m100431l = {112}, m100432m = "lastRhrFetchTime", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C66461 extends AbstractC32269c {
        int label;
        /* synthetic */ Object result;

        public C66461(InterfaceC30057d<? super C66461> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserRepository.this.lastRhrFetchTime(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.UserRepository$lastRhrFetchTime$2 */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.UserRepository$lastRhrFetchTime$2", m100430f = "UserRepository.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)J"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C66472 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        public C66472(InterfaceC30057d<? super C66472> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return UserRepository.this.new C66472(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Long> interfaceC30057d) {
            return ((C66472) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return new Long(UserRepository.this.prefs.getLongValueFromMainPrefs(UserRepository.KEY_LAST_FETCH_TIME, Instant.EPOCH.getMillis()));
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.UserRepository$onStart$1 */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.UserRepository$onStart$1", m100430f = "UserRepository.kt", m100431l = {68}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C66481 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        public C66481(InterfaceC30057d<? super C66481> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return UserRepository.this.new C66481(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C66481) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                UserRepository userRepository = UserRepository.this;
                this.label = 1;
                if (UserRepository.getRestingHeartRate$default(userRepository, false, this, 1, null) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.data.repositories.UserRepository$updateCachedRhr$2 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.UserRepository$updateCachedRhr$2", m100430f = "UserRepository.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C66492 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ RestingHeartRate $rhr;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C66492(RestingHeartRate restingHeartRate, InterfaceC30057d<? super C66492> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$rhr = restingHeartRate;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return UserRepository.this.new C66492(this.$rhr, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C66492) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            UserRepository.this.prefs.putLongValueIntoMainPrefs(UserRepository.KEY_LAST_FETCH_TIME, Instant.now().getMillis());
            UserRepository.this.prefs.putFloatValueIntoMainPrefs(UserRepository.KEY_USER_RHR, this.$rhr.getValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.UserRepository$updateUserTimezonePreferences$1 */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.UserRepository$updateUserTimezonePreferences$1", m100430f = "UserRepository.kt", m100431l = {87, 97}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C66501 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ Long $timestamp;
        final /* synthetic */ boolean $using24HourTime;
        Object L$0;
        int label;
        final /* synthetic */ UserRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C66501(boolean z4, UserRepository userRepository, Long l7, InterfaceC30057d<? super C66501> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$using24HourTime = z4;
            this.this$0 = userRepository;
            this.$timestamp = l7;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C66501(this.$using24HourTime, this.this$0, this.$timestamp, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C66501) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0065, code lost:
        
            if (r11.m31777a(r10) == r0) goto L17;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r10.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L23
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r10.L$0
                u02.a r0 = (u02.InterfaceC34385a) r0
                p505ts.AbstractC34132o.m107864I(r11)
                r9 = r10
                goto L92
            L16:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1e:
                p505ts.AbstractC34132o.m107864I(r11)
                r9 = r10
                goto L4c
            L23:
                p505ts.AbstractC34132o.m107864I(r11)
                r11 = r3
                i92.o$a r3 = i92.C18270o.INSTANCE
                boolean r4 = r10.$using24HourTime
                org.joda.time.DateTimeZone r5 = org.joda.time.DateTimeZone.getDefault()
                java.lang.String r1 = "getDefault(...)"
                p715kotlin.jvm.internal.AbstractC22676k.m65749i(r5, r1)
                com.whoop.data.repositories.UserRepository r1 = r10.this$0
                com.whoop.service.network.UsersPreferenceApi r6 = com.whoop.data.repositories.UserRepository.access$getUsersPreferenceApi$p(r1)
                com.whoop.data.repositories.UserRepository r1 = r10.this$0
                tr2.n r7 = com.whoop.data.repositories.UserRepository.access$getLogger$p(r1)
                java.lang.Long r8 = r10.$timestamp
                r10.label = r11
                r9 = r10
                java.lang.Object r11 = r3.m52634a(r4, r5, r6, r7, r8, r9)
                if (r11 != r0) goto L4c
                goto L67
            L4c:
                u02.a r11 = (u02.InterfaceC34385a) r11
                boolean r1 = r11 instanceof u02.InterfaceC34385a.c
                if (r1 == 0) goto L68
                com.whoop.data.repositories.UserRepository r11 = r9.this$0
                com.whoop.service.timezone.a r11 = com.whoop.data.repositories.UserRepository.access$getTimezoneUpdateUploader$p(r11)
                da2.a r11 = r11.getDataStoreHelper()
                r1 = 0
                r9.L$0 = r1
                r9.label = r2
                java.lang.Object r11 = r11.m31777a(r10)
                if (r11 != r0) goto L92
            L67:
                return r0
            L68:
                boolean r0 = r11 instanceof u02.InterfaceC34385a.b.C42432b
                if (r0 == 0) goto L8e
                java.lang.Long r11 = r9.$timestamp
                if (r11 == 0) goto L92
                com.whoop.data.repositories.UserRepository r11 = r9.this$0
                com.whoop.data.repositories.FeatureFlagChecker r11 = com.whoop.data.repositories.UserRepository.access$getFeatureFlagChecker$p(r11)
                java.lang.String r0 = "android-foreground-gps-collection"
                boolean r11 = r11.isFeatureEnabled(r0)
                if (r11 == 0) goto L92
                com.whoop.data.repositories.UserRepository r11 = r9.this$0
                com.whoop.service.timezone.a r11 = com.whoop.data.repositories.UserRepository.access$getTimezoneUpdateUploader$p(r11)
                java.lang.Long r0 = r9.$timestamp
                long r0 = r0.longValue()
                r11.m24802e(r0)
                goto L92
            L8e:
                boolean r11 = r11 instanceof u02.InterfaceC34385a.b.a
                if (r11 == 0) goto L95
            L92:
                l83.a0 r11 = l83.C23454a0.f92919a
                return r11
            L95:
                kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
                r11.<init>()
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.data.repositories.UserRepository.C66501.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public UserRepository(Context context, UsersPreferenceApi usersPreferenceApi, ActivityServiceApi activityServiceApi, PreferenceHelper prefs, C27858u userContext, InterfaceC2994c0 applicationScope, InterfaceC30063j ioContext, C10023a timezoneUpdateUploader, FeatureFlagChecker featureFlagChecker, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(usersPreferenceApi, "usersPreferenceApi");
        AbstractC22676k.m65750j(activityServiceApi, "activityServiceApi");
        AbstractC22676k.m65750j(prefs, "prefs");
        AbstractC22676k.m65750j(userContext, "userContext");
        AbstractC22676k.m65750j(applicationScope, "applicationScope");
        AbstractC22676k.m65750j(ioContext, "ioContext");
        AbstractC22676k.m65750j(timezoneUpdateUploader, "timezoneUpdateUploader");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(logger, "logger");
        this.context = context;
        this.usersPreferenceApi = usersPreferenceApi;
        this.activityServiceApi = activityServiceApi;
        this.prefs = prefs;
        this.userContext = userContext;
        this.applicationScope = applicationScope;
        this.ioContext = ioContext;
        this.timezoneUpdateUploader = timezoneUpdateUploader;
        this.featureFlagChecker = featureFlagChecker;
        this.logger = logger;
        userContext.m84061n().m122665P(C22488a.m64989a().f88182b).m122661K(new C6529c(new C0428i(this, 7), 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 _init_$lambda$0(UserRepository userRepository, C27858u.a aVar) {
        updateUserTimezonePreferences$default(userRepository, DateFormat.is24HourFormat(userRepository.context), null, 2, null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object fetchAndUpdateRhr(InterfaceC30057d<? super RestingHeartRate> interfaceC30057d) {
        C66411 c66411;
        if (interfaceC30057d instanceof C66411) {
            c66411 = (C66411) interfaceC30057d;
            int i13 = c66411.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c66411.label = i13 - Integer.MIN_VALUE;
            } else {
                c66411 = new C66411(interfaceC30057d);
            }
        } else {
            c66411 = new C66411(interfaceC30057d);
        }
        Object objFetchRhr = c66411.result;
        Object obj = EnumC31071a.f128113w;
        int i14 = c66411.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objFetchRhr);
            c66411.label = 1;
            objFetchRhr = fetchRhr(c66411);
            if (objFetchRhr != obj) {
            }
            return obj;
        }
        if (i14 != 1) {
            if (i14 == 2) {
                AbstractC34132o.m107864I(objFetchRhr);
                return objFetchRhr;
            }
            if (i14 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RestingHeartRate restingHeartRate = (RestingHeartRate) c66411.L$0;
            AbstractC34132o.m107864I(objFetchRhr);
            return restingHeartRate;
        }
        AbstractC34132o.m107864I(objFetchRhr);
        RestingHeartRate restingHeartRate2 = (RestingHeartRate) objFetchRhr;
        if (restingHeartRate2 == null) {
            c66411.label = 2;
            Object cachedRhr = getCachedRhr(c66411);
            if (cachedRhr != obj) {
                return cachedRhr;
            }
        } else {
            c66411.L$0 = restingHeartRate2;
            c66411.label = 3;
            if (updateCachedRhr(restingHeartRate2, c66411) != obj) {
                return restingHeartRate2;
            }
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object fetchRhr(InterfaceC30057d<? super RestingHeartRate> interfaceC30057d) {
        C66421 c66421;
        if (interfaceC30057d instanceof C66421) {
            c66421 = (C66421) interfaceC30057d;
            int i13 = c66421.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c66421.label = i13 - Integer.MIN_VALUE;
            } else {
                c66421 = new C66421(interfaceC30057d);
            }
        } else {
            c66421 = new C66421(interfaceC30057d);
        }
        Object objM8750d = c66421.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c66421.label;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM8750d);
                C66432 c66432 = new C66432(null);
                c66421.label = 1;
                objM8750d = AbstractC3028k2.m8750d(TIMEOUT, c66432, c66421);
                if (objM8750d == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objM8750d);
            }
            return (RestingHeartRate) objM8750d;
        } catch (Exception e5) {
            AbstractC36685b.m117760b(e5, "Failed to fetch user rhr", this.logger, null, 8, null);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getCachedRhr(InterfaceC30057d<? super RestingHeartRate> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.ioContext, new C66442(null), interfaceC30057d);
    }

    public static /* synthetic */ Object getRestingHeartRate$default(UserRepository userRepository, boolean z4, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = false;
        }
        return userRepository.getRestingHeartRate(z4, interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object lastRhrFetchTime(InterfaceC30057d<? super Instant> interfaceC30057d) throws Throwable {
        C66461 c66461;
        if (interfaceC30057d instanceof C66461) {
            c66461 = (C66461) interfaceC30057d;
            int i13 = c66461.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c66461.label = i13 - Integer.MIN_VALUE;
            } else {
                c66461 = new C66461(interfaceC30057d);
            }
        } else {
            c66461 = new C66461(interfaceC30057d);
        }
        Object objM8705K = c66461.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c66461.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM8705K);
            InterfaceC30063j interfaceC30063j = this.ioContext;
            C66472 c66472 = new C66472(null);
            c66461.label = 1;
            objM8705K = AbstractC3006f0.m8705K(interfaceC30063j, c66472, c66461);
            if (objM8705K == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM8705K);
        }
        return Instant.ofEpochMilli(((Number) objM8705K).longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateCachedRhr(RestingHeartRate restingHeartRate, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM8705K = AbstractC3006f0.m8705K(this.ioContext, new C66492(restingHeartRate, null), interfaceC30057d);
        return objM8705K == EnumC31071a.f128113w ? objM8705K : C23454a0.f92919a;
    }

    public static /* synthetic */ void updateUserTimezonePreferences$default(UserRepository userRepository, boolean z4, Long l7, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            l7 = null;
        }
        userRepository.updateUserTimezonePreferences(z4, l7);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getRestingHeartRate(boolean z4, InterfaceC30057d<? super RestingHeartRate> interfaceC30057d) {
        C66451 c66451;
        Instant instantNow;
        if (interfaceC30057d instanceof C66451) {
            c66451 = (C66451) interfaceC30057d;
            int i13 = c66451.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c66451.label = i13 - Integer.MIN_VALUE;
            } else {
                c66451 = new C66451(interfaceC30057d);
            }
        } else {
            c66451 = new C66451(interfaceC30057d);
        }
        Object objLastRhrFetchTime = c66451.result;
        Object obj = EnumC31071a.f128113w;
        int i14 = c66451.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objLastRhrFetchTime);
            if (z4) {
                c66451.Z$0 = z4;
                c66451.label = 1;
                Object objFetchAndUpdateRhr = fetchAndUpdateRhr(c66451);
                if (objFetchAndUpdateRhr != obj) {
                    return objFetchAndUpdateRhr;
                }
            } else {
                instantNow = Instant.now();
                c66451.L$0 = instantNow;
                c66451.Z$0 = z4;
                c66451.label = 2;
                objLastRhrFetchTime = lastRhrFetchTime(c66451);
                if (objLastRhrFetchTime != obj) {
                }
            }
            return obj;
        }
        if (i14 == 1) {
            AbstractC34132o.m107864I(objLastRhrFetchTime);
            return objLastRhrFetchTime;
        }
        if (i14 != 2) {
            if (i14 != 3 && i14 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objLastRhrFetchTime);
            return objLastRhrFetchTime;
        }
        z4 = c66451.Z$0;
        instantNow = (Instant) c66451.L$0;
        AbstractC34132o.m107864I(objLastRhrFetchTime);
        if (Hours.hoursBetween((Instant) objLastRhrFetchTime, instantNow).isGreaterThan(Hours.hours(24))) {
            c66451.L$0 = null;
            c66451.L$1 = null;
            c66451.Z$0 = z4;
            c66451.label = 3;
            Object objFetchAndUpdateRhr2 = fetchAndUpdateRhr(c66451);
            if (objFetchAndUpdateRhr2 != obj) {
                return objFetchAndUpdateRhr2;
            }
        } else {
            c66451.L$0 = null;
            c66451.L$1 = null;
            c66451.Z$0 = z4;
            c66451.label = 4;
            Object cachedRhr = getCachedRhr(c66451);
            if (cachedRhr != obj) {
                return cachedRhr;
            }
        }
        return obj;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        if (this.userContext.m84058i()) {
            updateUserTimezonePreferences$default(this, DateFormat.is24HourFormat(this.context), null, 2, null);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onDestroy(InterfaceC1585g0 interfaceC1585g0) {
        super.onDestroy(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onPause(InterfaceC1585g0 interfaceC1585g0) {
        super.onPause(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onResume(InterfaceC1585g0 interfaceC1585g0) {
        super.onResume(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        AbstractC3006f0.m8732z(this.applicationScope, null, null, new C66481(null), 3);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onStop(InterfaceC1585g0 interfaceC1585g0) {
        super.onStop(interfaceC1585g0);
    }

    public final void updateUserTimezonePreferences(boolean using24HourTime, Long timestamp) {
        AbstractC3006f0.m8732z(this.applicationScope, null, null, new C66501(using24HourTime, this, timestamp, null), 3);
    }

    public /* synthetic */ UserRepository(Context context, UsersPreferenceApi usersPreferenceApi, ActivityServiceApi activityServiceApi, PreferenceHelper preferenceHelper, C27858u c27858u, InterfaceC2994c0 interfaceC2994c0, InterfaceC30063j interfaceC30063j, C10023a c10023a, FeatureFlagChecker featureFlagChecker, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, usersPreferenceApi, activityServiceApi, preferenceHelper, c27858u, interfaceC2994c0, interfaceC30063j, c10023a, featureFlagChecker, (i13 & 512) != 0 ? InterfaceC34116n.INSTANCE.m107848a("UserRepository") : interfaceC34116n);
    }
}
