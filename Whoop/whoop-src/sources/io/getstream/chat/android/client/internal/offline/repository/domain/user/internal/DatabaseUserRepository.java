package io.getstream.chat.android.client.internal.offline.repository.domain.user.internal;

import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.service.network.model.UserState;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13075p1;
import io.getstream.chat.android.PrivacySettings;
import io.getstream.chat.android.client.internal.offline.extensions.CoroutineScopeExtensionsKt;
import io.getstream.chat.android.client.internal.offline.repository.domain.push.internal.PushPreferenceEntity;
import io.getstream.chat.android.client.internal.offline.repository.domain.push.internal.PushPreferenceMapperKt;
import io.getstream.chat.android.client.persistance.repository.UserRepository;
import io.getstream.chat.android.models.Mute;
import io.getstream.chat.android.models.PushPreference;
import io.getstream.chat.android.models.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import l83.InterfaceC23462h;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25272z;
import mc3.AbstractC25438d;
import mc3.InterfaceC25435a;
import p002a0.C0005a0;
import p319m4.AbstractC25012a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 ;2\u00020\u0001:\u0001;B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000b0\u00170\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\u001d\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010 \u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\"\u0010!J\u001a\u0010$\u001a\u0004\u0018\u00010\u000b2\u0006\u0010#\u001a\u00020\u0018H\u0096@¢\u0006\u0004\b$\u0010%J$\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000b0&2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00180&H\u0096@¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u001b\u00101\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R \u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000b028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R&\u00106\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000b0\u0017058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006<"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;", "Lio/getstream/chat/android/client/persistance/repository/UserRepository;", "Lbc3/c0;", "scope", "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao;", "userDao", "", "cacheSize", "<init>", "(Lbc3/c0;Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao;I)V", "", "Lio/getstream/chat/android/models/User;", "users", "Ll83/a0;", "cacheUsers", "(Ljava/util/Collection;)V", "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;", "toEntity", "(Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;", "userEntity", "toModel", "(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;)Lio/getstream/chat/android/models/User;", "Lec3/f2;", "", "", "observeLatestUsers", "()Lec3/f2;", "clear", "(Lq83/d;)Ljava/lang/Object;", "insertUsers", "(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;", UserState.Sources.USER, "insertUser", "(Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;", "insertCurrentUser", "userId", "selectUser", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "", "ids", "selectUsers", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "Lbc3/c0;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "La0/a0;", "userCache", "La0/a0;", "Lec3/p1;", "latestUsersFlow", "Lec3/p1;", "Lmc3/a;", "dbMutex", "Lmc3/a;", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DatabaseUserRepository implements UserRepository {
    private static final String ME_ID = "me";
    private final InterfaceC25435a dbMutex;
    private final InterfaceC13075p1 latestUsersFlow;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final InterfaceC2994c0 scope;
    private final C0005a0 userCache;
    private final UserDao userDao;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.user.internal.DatabaseUserRepository$cacheUsers$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.user.internal.DatabaseUserRepository$cacheUsers$1", m100430f = "DatabaseUserRepository.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C192461 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        public C192461(InterfaceC30057d<? super C192461> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return DatabaseUserRepository.this.new C192461(interfaceC30057d);
        }

        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C192461 c192461 = (C192461) create(interfaceC2994c0, interfaceC30057d);
            C23454a0 c23454a0 = C23454a0.f92919a;
            c192461.invokeSuspend(c23454a0);
            return c23454a0;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC13075p1 interfaceC13075p1 = DatabaseUserRepository.this.latestUsersFlow;
            LinkedHashMap linkedHashMapM7h = DatabaseUserRepository.this.userCache.m7h();
            C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
            c13045h2.getClass();
            c13045h2.m36571k(null, linkedHashMapM7h);
            return C23454a0.f92919a;
        }

        @Override // c93.InterfaceC4351m
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2994c0) obj, (InterfaceC30057d<? super C23454a0>) obj2);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.user.internal.DatabaseUserRepository$clear$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.user.internal.DatabaseUserRepository", m100430f = "DatabaseUserRepository.kt", m100431l = {173, 50}, m100432m = "clear")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C192471 extends AbstractC32269c {
        int I$0;
        int I$1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C192471(InterfaceC30057d<? super C192471> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DatabaseUserRepository.this.clear(this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.user.internal.DatabaseUserRepository$insertCurrentUser$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.user.internal.DatabaseUserRepository", m100430f = "DatabaseUserRepository.kt", m100431l = {88, 89}, m100432m = "insertCurrentUser")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C192481 extends AbstractC32269c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C192481(InterfaceC30057d<? super C192481> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DatabaseUserRepository.this.insertCurrentUser(null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.user.internal.DatabaseUserRepository$insertCurrentUser$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.user.internal.DatabaseUserRepository$insertCurrentUser$2", m100430f = "DatabaseUserRepository.kt", m100431l = {91}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C192492 extends AbstractC32275i implements Function1 {
        final /* synthetic */ User $user;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C192492(User user, InterfaceC30057d<? super C192492> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$user = user;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return DatabaseUserRepository.this.new C192492(this.$user, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                UserEntity userEntityCopy$default = UserEntity.copy$default(DatabaseUserRepository.this.toEntity(this.$user), DatabaseUserRepository.ME_ID, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, 131070, null);
                UserDao userDao = DatabaseUserRepository.this.userDao;
                this.L$0 = null;
                this.label = 1;
                if (userDao.insert(userEntityCopy$default, this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C192492) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.user.internal.DatabaseUserRepository$insertUsers$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.user.internal.DatabaseUserRepository$insertUsers$2", m100430f = "DatabaseUserRepository.kt", m100431l = {69}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C192502 extends AbstractC32275i implements Function1 {
        final /* synthetic */ Collection<User> $users;
        final /* synthetic */ List<UserEntity> $usersToInsert;
        int I$0;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C192502(List<UserEntity> list, Collection<User> collection, InterfaceC30057d<? super C192502> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$usersToInsert = list;
            this.$users = collection;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return DatabaseUserRepository.this.new C192502(this.$usersToInsert, this.$users, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C2345k logger = DatabaseUserRepository.this.getLogger();
                List<UserEntity> list = this.$usersToInsert;
                Collection<User> collection = this.$users;
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    logger.f9274b.log(enumC2341g, str, AbstractC25012a.m73372e(list.size(), collection.size(), "[insertUsers] inserting ", " entities on DB, updated ", " on cache"), null);
                }
                List<UserEntity> list2 = this.$usersToInsert;
                if (list2.isEmpty()) {
                    list2 = null;
                }
                if (list2 != null) {
                    UserDao userDao = DatabaseUserRepository.this.userDao;
                    this.L$0 = null;
                    this.I$0 = 0;
                    this.label = 1;
                    if (userDao.insertMany(list2, this) == enumC31071a) {
                        return enumC31071a;
                    }
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C192502) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.user.internal.DatabaseUserRepository$selectUser$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.user.internal.DatabaseUserRepository", m100430f = "DatabaseUserRepository.kt", m100431l = {101}, m100432m = "selectUser")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C192511 extends AbstractC32269c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C192511(InterfaceC30057d<? super C192511> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DatabaseUserRepository.this.selectUser(null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.user.internal.DatabaseUserRepository$selectUsers$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.user.internal.DatabaseUserRepository", m100430f = "DatabaseUserRepository.kt", m100431l = {111}, m100432m = "selectUsers")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C192521 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C192521(InterfaceC30057d<? super C192521> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DatabaseUserRepository.this.selectUsers(null, this);
        }
    }

    public DatabaseUserRepository(InterfaceC2994c0 scope, UserDao userDao, int i13) {
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(userDao, "userDao");
        this.scope = scope;
        this.userDao = userDao;
        this.logger = AbstractC1772c1.m5382S(this, "Chat:UserRepository");
        this.userCache = new C0005a0(i13);
        this.latestUsersFlow = AbstractC13091v.m36593c(C25272z.f99163w);
        this.dbMutex = AbstractC25438d.m74669a();
    }

    private final void cacheUsers(Collection<User> users) {
        for (User user : users) {
            this.userCache.m3d(user.getId(), user);
        }
        AbstractC3006f0.m8732z(this.scope, null, null, new C192461(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UserEntity toEntity(User user) {
        String id4 = user.getId();
        String name = user.getName();
        String image = user.getImage();
        String id5 = user.getId();
        String role = user.getRole();
        Date createdAt = user.getCreatedAt();
        Date updatedAt = user.getUpdatedAt();
        Date lastActive = user.getLastActive();
        boolean zIsInvisible = user.isInvisible();
        PrivacySettings privacySettings = user.getPrivacySettings();
        PrivacySettingsEntity entity = privacySettings != null ? PrivacySettingsMapperKt.toEntity(privacySettings) : null;
        boolean zIsBanned = user.isBanned();
        List<Mute> mutes = user.getMutes();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(mutes, 10));
        Iterator<T> it = mutes.iterator();
        while (it.hasNext()) {
            arrayList.add(UserMuteMapperKt.toEntity((Mute) it.next()));
        }
        List<String> teams = user.getTeams();
        Map<String, String> teamsRole = user.getTeamsRole();
        Long avgResponseTime = user.getAvgResponseTime();
        PushPreference pushPreference = user.getPushPreference();
        return new UserEntity(id4, id5, name, image, role, createdAt, updatedAt, lastActive, zIsInvisible, entity, zIsBanned, arrayList, teams, teamsRole, user.getExtraData(), avgResponseTime, pushPreference != null ? PushPreferenceMapperKt.toEntity(pushPreference) : null);
    }

    private final User toModel(UserEntity userEntity) {
        String originalId = userEntity.getOriginalId();
        String name = userEntity.getName();
        String image = userEntity.getImage();
        String role = userEntity.getRole();
        Date createdAt = userEntity.getCreatedAt();
        Date updatedAt = userEntity.getUpdatedAt();
        Date lastActive = userEntity.getLastActive();
        boolean invisible = userEntity.getInvisible();
        PrivacySettingsEntity privacySettings = userEntity.getPrivacySettings();
        PrivacySettings model = privacySettings != null ? PrivacySettingsMapperKt.toModel(privacySettings) : null;
        boolean banned = userEntity.getBanned();
        List<UserMuteEntity> mutes = userEntity.getMutes();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(mutes, 10));
        Iterator<T> it = mutes.iterator();
        while (it.hasNext()) {
            arrayList.add(UserMuteMapperKt.toModel((UserMuteEntity) it.next()));
        }
        List<String> teams = userEntity.getTeams();
        Map<String, String> teamsRole = userEntity.getTeamsRole();
        Long avgResponseTime = userEntity.getAvgResponseTime();
        PushPreferenceEntity pushPreference = userEntity.getPushPreference();
        return new User(originalId, role, name, image, Boolean.valueOf(invisible), model, null, Boolean.valueOf(banned), null, false, createdAt, updatedAt, lastActive, 0, 0, 0, arrayList, teams, teamsRole, null, null, avgResponseTime, pushPreference != null ? PushPreferenceMapperKt.toModel(pushPreference) : null, AbstractC25247g0.m74003l0(userEntity.getExtraData()), null, 18408256, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.getstream.chat.android.client.persistance.repository.UserRepository
    public final Object clear(InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        C192471 c192471;
        InterfaceC25435a interfaceC25435a;
        int i13;
        InterfaceC25435a interfaceC25435a2;
        Throwable th3;
        if (interfaceC30057d instanceof C192471) {
            c192471 = (C192471) interfaceC30057d;
            int i14 = c192471.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c192471.label = i14 - Integer.MIN_VALUE;
            } else {
                c192471 = new C192471(interfaceC30057d);
            }
        } else {
            c192471 = new C192471(interfaceC30057d);
        }
        Object obj = c192471.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = c192471.label;
        try {
            if (i15 == 0) {
                AbstractC34132o.m107864I(obj);
                interfaceC25435a = this.dbMutex;
                c192471.L$0 = interfaceC25435a;
                c192471.I$0 = 0;
                c192471.label = 1;
                if (interfaceC25435a.mo68211b(c192471) != enumC31071a) {
                    i13 = 0;
                }
                return enumC31071a;
            }
            if (i15 != 1) {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC25435a2 = (InterfaceC25435a) c192471.L$0;
                try {
                    AbstractC34132o.m107864I(obj);
                    interfaceC25435a2.mo68214i(null);
                    return C23454a0.f92919a;
                } catch (Throwable th4) {
                    th3 = th4;
                    interfaceC25435a2.mo68214i(null);
                    throw th3;
                }
            }
            i13 = c192471.I$0;
            InterfaceC25435a interfaceC25435a3 = (InterfaceC25435a) c192471.L$0;
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = interfaceC25435a3;
            UserDao userDao = this.userDao;
            c192471.L$0 = interfaceC25435a;
            c192471.I$0 = i13;
            c192471.I$1 = 0;
            c192471.label = 2;
            if (userDao.deleteAll(c192471) != enumC31071a) {
                interfaceC25435a2 = interfaceC25435a;
                interfaceC25435a2.mo68214i(null);
                return C23454a0.f92919a;
            }
            return enumC31071a;
        } catch (Throwable th5) {
            interfaceC25435a2 = interfaceC25435a;
            th3 = th5;
            interfaceC25435a2.mo68214i(null);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (io.getstream.chat.android.client.internal.offline.extensions.CoroutineScopeExtensionsKt.launchWithMutex(r8, r2, r4, r0) == r1) goto L21;
     */
    @Override // io.getstream.chat.android.client.persistance.repository.UserRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object insertCurrentUser(io.getstream.chat.android.models.User r7, q83.InterfaceC30057d<? super l83.C23454a0> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof io.getstream.chat.android.client.internal.offline.repository.domain.user.internal.DatabaseUserRepository.C192481
            if (r0 == 0) goto L13
            r0 = r8
            io.getstream.chat.android.client.internal.offline.repository.domain.user.internal.DatabaseUserRepository$insertCurrentUser$1 r0 = (io.getstream.chat.android.client.internal.offline.repository.domain.user.internal.DatabaseUserRepository.C192481) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.getstream.chat.android.client.internal.offline.repository.domain.user.internal.DatabaseUserRepository$insertCurrentUser$1 r0 = new io.getstream.chat.android.client.internal.offline.repository.domain.user.internal.DatabaseUserRepository$insertCurrentUser$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r7 = r0.L$0
            io.getstream.chat.android.models.User r7 = (io.getstream.chat.android.models.User) r7
            p505ts.AbstractC34132o.m107864I(r8)
            goto L61
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            java.lang.Object r7 = r0.L$0
            io.getstream.chat.android.models.User r7 = (io.getstream.chat.android.models.User) r7
            p505ts.AbstractC34132o.m107864I(r8)
            goto L4c
        L3e:
            p505ts.AbstractC34132o.m107864I(r8)
            r0.L$0 = r7
            r0.label = r4
            java.lang.Object r8 = r6.insertUser(r7, r0)
            if (r8 != r1) goto L4c
            goto L60
        L4c:
            bc3.c0 r8 = r6.scope
            mc3.a r2 = r6.dbMutex
            io.getstream.chat.android.client.internal.offline.repository.domain.user.internal.DatabaseUserRepository$insertCurrentUser$2 r4 = new io.getstream.chat.android.client.internal.offline.repository.domain.user.internal.DatabaseUserRepository$insertCurrentUser$2
            r5 = 0
            r4.<init>(r7, r5)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r7 = io.getstream.chat.android.client.internal.offline.extensions.CoroutineScopeExtensionsKt.launchWithMutex(r8, r2, r4, r0)
            if (r7 != r1) goto L61
        L60:
            return r1
        L61:
            l83.a0 r7 = l83.C23454a0.f92919a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.offline.repository.domain.user.internal.DatabaseUserRepository.insertCurrentUser(io.getstream.chat.android.models.User, q83.d):java.lang.Object");
    }

    @Override // io.getstream.chat.android.client.persistance.repository.UserRepository
    public final Object insertUser(User user, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objInsertUsers = insertUsers(AbstractC37056f.m118958J(user), interfaceC30057d);
        return objInsertUsers == EnumC31071a.f128113w ? objInsertUsers : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.UserRepository
    public final Object insertUsers(Collection<User> collection, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        boolean zIsEmpty = collection.isEmpty();
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (zIsEmpty) {
            return c23454a0;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            User user = (User) obj;
            if (!user.equals(this.userCache.m2c(user.getId()))) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(toEntity((User) it.next()));
        }
        cacheUsers(collection);
        Object objLaunchWithMutex = CoroutineScopeExtensionsKt.launchWithMutex(this.scope, this.dbMutex, new C192502(arrayList2, collection, null), interfaceC30057d);
        return objLaunchWithMutex == EnumC31071a.f128113w ? objLaunchWithMutex : c23454a0;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.UserRepository
    public final InterfaceC13037f2 observeLatestUsers() {
        return this.latestUsersFlow;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.getstream.chat.android.client.persistance.repository.UserRepository
    public final Object selectUser(String str, InterfaceC30057d<? super User> interfaceC30057d) {
        C192511 c192511;
        if (interfaceC30057d instanceof C192511) {
            c192511 = (C192511) interfaceC30057d;
            int i13 = c192511.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c192511.label = i13 - Integer.MIN_VALUE;
            } else {
                c192511 = new C192511(interfaceC30057d);
            }
        } else {
            c192511 = new C192511(interfaceC30057d);
        }
        Object objSelect = c192511.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c192511.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objSelect);
            User user = (User) this.userCache.m2c(str);
            if (user != null) {
                return user;
            }
            UserDao userDao = this.userDao;
            c192511.L$0 = null;
            c192511.label = 1;
            objSelect = userDao.select(str, c192511);
            if (objSelect == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objSelect);
        }
        UserEntity userEntity = (UserEntity) objSelect;
        if (userEntity == null) {
            return null;
        }
        User model = toModel(userEntity);
        cacheUsers(AbstractC37056f.m118958J(model));
        return model;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.getstream.chat.android.client.persistance.repository.UserRepository
    public final Object selectUsers(List<String> list, InterfaceC30057d<? super List<User>> interfaceC30057d) {
        C192521 c192521;
        Collection collection;
        if (interfaceC30057d instanceof C192521) {
            c192521 = (C192521) interfaceC30057d;
            int i13 = c192521.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c192521.label = i13 - Integer.MIN_VALUE;
            } else {
                c192521 = new C192521(interfaceC30057d);
            }
        } else {
            c192521 = new C192521(interfaceC30057d);
        }
        Object obj = c192521.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c192521.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            List<String> list2 = list;
            ArrayList arrayList = new ArrayList();
            C0005a0 c0005a0 = this.userCache;
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                User user = (User) c0005a0.m2c((String) it.next());
                if (user != null) {
                    arrayList.add(user);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((User) it3.next()).getId());
            }
            List<String> listM74125c1 = AbstractC25265s.m74125c1(list2, AbstractC25265s.m74103I1(arrayList2));
            UserDao userDao = this.userDao;
            c192521.L$0 = null;
            c192521.L$1 = null;
            c192521.L$2 = null;
            c192521.L$3 = arrayList;
            c192521.label = 1;
            Object objSelect = userDao.select(listM74125c1, c192521);
            if (objSelect == enumC31071a) {
                return enumC31071a;
            }
            obj = objSelect;
            collection = arrayList;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            collection = (Collection) c192521.L$3;
            AbstractC34132o.m107864I(obj);
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
        Iterator it4 = iterable.iterator();
        while (it4.hasNext()) {
            arrayList3.add(toModel((UserEntity) it4.next()));
        }
        cacheUsers(arrayList3);
        return AbstractC25265s.m74129g1(collection, arrayList3);
    }

    public /* synthetic */ DatabaseUserRepository(InterfaceC2994c0 interfaceC2994c0, UserDao userDao, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC2994c0, userDao, (i14 & 4) != 0 ? 1000 : i13);
    }
}
